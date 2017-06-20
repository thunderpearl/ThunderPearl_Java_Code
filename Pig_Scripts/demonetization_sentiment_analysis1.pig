/*Loading the csv file using pig*/
load_tweets = LOAD '/input_files/demonetization-tweets.csv' USING PigStorage(',');
extract_details = FOREACH load_tweets GENERATE $0 as id,$1 as text;

/* FLATTEN(TOKENIZE(text)) will remove the "{}" which were created by TOKENIZE.
 We will have tokens of the "text(above command text)" words and every token
 will get attached with the line of which it is part of, hence there will be 
 repeatition of same line and tokens will keep attaching with the line until
 tokens get finished.
 Check that by "dump tokens" */
tokens = foreach extract_details generate id,text, FLATTEN(TOKENIZE(text)) As word;

/* Loading the dictionary which have rating for words */
dictionary = LOAD '/input_files/AFINN.txt' using PigStorage('\t') As(word:chararray,rating:int);
word_rating = join tokens by word left outer, dictionary by word using 'replicated';

/* This will give sample data i.e. first 3 rows of word_rating */
word_rating_limit = limit word_rating 3;

rating = foreach word_rating generate tokens::id as id,tokens::text as text, dictionary::rating as rate;

/* This will give sample data i.e. first 3 rows of rating */
rating_limit = limit rating 3;

word_group = group rating by (id,text);

/* First 2 rows of word_group */
word_group_limit = limit word_group 2;

avg_rate = foreach word_group generate group, AVG(rating.rate) as tweet_rating;

/* First 100 rows of avg_rate */
avg_rate_limit = limit avg_rate 100; 

dump avg_rate;

/* Filter the positive tweets*/
positive_tweets = filter avg_rate by tweet_rating >= 0;

/* Filter the negative tweets*/
negative_tweets = filter avg_rate by tweet_rating < 0;

/* Storing the positive and negative tweets output in output_files folder*/
store positive_tweets into '/output_files/positive_tweets_output1';
store negative_tweets into '/output_files/negative_tweets_output1';
