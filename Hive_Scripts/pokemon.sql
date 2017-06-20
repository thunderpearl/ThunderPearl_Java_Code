CREATE TABLE POKEMON(ID INT,NAME STRING,TYPE1 STRING,TYPE2 STRING, TOTAL INT,HP INT,ATTACK INT,DEFENCE INT,SP_ATK INT,SP_DEF INT,SPEED INT) ROW FORMAT DELIMITED FIELDS TERMINATED BY ',' LINES TERMINATED BY '\n' tblproperties("skip.header.line.count"="1");

LOAD DATA INPATH '/input_files/Pokemon.csv' INTO TABLE POKEMON;

select * from POKEMON;

select avg(HP) from POKEMON;

-- Now, we will be creating another table named pokemon1 and inserting
 -- the data of pokemon table into pokemon1. pokemon1 table will have one 
  -- extra column name 'power_rate' based on HP. 69.25875 is the average HP of
    -- pokemons.
create table pokemon1 as select *, if(HP>69.25875,'Powerful',if(HP<69.25875,'Moderate','Powerless')) as power_rate from pokemon;

-- check created column in pokemon1 as well.
select power_rate from pokemon1;

-- Now, we have to find the number of Powerful and Modertate pokemons.

-- These below code will tell the number of Powerful and Moderate pokemons
 -- from table pokemon1
--select count(*) from pokemon1 where power_rate='Moderate';
--select count(*) from pokemon1 where power_rate='Powerful';

-- But, a combined query can also be given.....
select count(NAME),power_rate from pokemon1 group by power_rate;

-- Now, Find out the top 10 pokemons according to their HP's.
select NAME,HP from pokemon1 order by HP DESC LIMIT 10;

-- Find top 10 pokemmons according to their attack stats.
select NAME,ATTACK from pokemon1 order by ATTACK DESC LIMIT 10;

-- Find top 10 pokemons based on their defence.
select NAME,DEFENCE from pokemon1 order by DEFENCE DESC LIMIT 10;

-- Top 10 pokemons based on their total power.
select NAME,TOTAL from pokemon1 order by TOTAL DESC LIMIT 10;

-- Top 10 pokemons with drastic change between their attack and special 
 -- attack
select NAME,(SP_ATK-ATTACK) as ATK_DIFF from pokemon1 order by ATK_DIFF DESC LIMIT 10;

-- Top 10 pokemons with drastic change between their defence and special 
 -- defence
select NAME,(SP_DEF-DEFENCE) as DEF_DIFF from pokemon1 order by DEF_DIFF DESC LIMIT 10;

-- Top 10 fastest pokemons
select NAME,SPEED from pokemon1 order by SPEED DESC LIMIT 10;
