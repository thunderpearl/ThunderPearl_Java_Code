package uniqueimages;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class MyReducer extends Reducer<Text, Text, Text, Text> {

	public void reduce(Text key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
		
		// Here, value is actually the meta data of the images or may be audio file 
		 // if we use the code for audio files.
		String imageFilePath = "";

		// In case of duplicate data 2 or more md5 will be same and those will be 
		 // under same category or say, same area.
		for (Text filePath : values) {

			imageFilePath = imageFilePath + "||" + filePath.toString();
		}
		// here value which is "key" is computer readable data of the images...
		context.write(new Text(imageFilePath), key);
	}
}