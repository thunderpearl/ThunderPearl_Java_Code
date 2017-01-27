package Message_Digest;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Message_Digest1 {
	public static void main(String[] args) throws NoSuchAlgorithmException
	{
		byte str1 = 34;
		
		// We gets the instance of message digest using below code as MessageDigest is an
		// abstract class.
		System.out.println("Algorithm applied for creating the message digest");
		MessageDigest msg_dg1 = MessageDigest.getInstance("MD5");
		
		// This is we are specifying data to the digest.
		// If we apply this method again then we will accumulate the data.
		msg_dg1.update(str1);
		
		// complete the digest on the accumulated data
		System.out.println(msg_dg1.digest());
		
		// For getting digest length
		System.out.println(msg_dg1.getDigestLength());
		
		// For getting Algorithm
		System.out.println(msg_dg1.getAlgorithm());
		
		System.out.println();
		System.out.println("Now we are applying anther algorithm for digest");
		
		MessageDigest msg_dg2 = MessageDigest.getInstance("SHA");
		msg_dg2.update(str1);
		System.out.println(msg_dg2.digest());
		System.out.println(msg_dg2.getDigestLength());
		System.out.println(msg_dg2.getAlgorithm());
		
		
	}
	
//	static byte msg_digest_method() throws NoSuchAlgorithmException
//	{
//		byte str1 = 34;
//		
//		MessageDigest msg_dg = MessageDigest.getInstance("MD5");
//		return msg_dg.update(str1);
//	}
}
