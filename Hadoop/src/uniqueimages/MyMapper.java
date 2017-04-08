package uniqueimages;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

// we have input key-value as Text and BytesWritable which are actually the output
 // of binary to sequence file result type.
// We are processing a sequence file to find the duplicate images.
public class MyMapper extends Mapper<Text, BytesWritable, Text, Text> {

	public void map(Text key, BytesWritable value, Context context) throws IOException, InterruptedException {

		String md5Str;
		try {
			
			// md5 of same strings or say data will be always same.....
			md5Str = calculateMd5(value.getBytes());
			
		} catch (NoSuchAlgorithmException e) {

			e.printStackTrace();
			return;

		}
		Text md5Text = new Text(md5Str);
		
		// we have set md5 of value as key and key as value. That key is a meta data
		 // actually.
		// so now there will be same keys for different values after below code.
		context.write(md5Text, key);
	}

	// This is the calculateMd5() method. It is static type so can be called directly
	static String calculateMd5(byte[] imageData) throws NoSuchAlgorithmException {

		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(imageData);
		byte[] hash = md.digest();
		String hexString = new String();
		for (int i = 0; i < hash.length; i++){
			
			hexString += Integer.toString((hash[i] & 0xff) + 0x100, 16).substring(1);
			
		}
		return hexString;
	}

}