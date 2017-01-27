package JavaPractice;

public enum Enum_mobby2 {
	Java("best",400),
	C("P_best",350),
	Python("F_best",350),
	Php("W_best",300),
	Ruby("A_best",375);
	
	
	// In case of enum try making these instance variable as final as well along with private.
	// final bcoz, we will be saving the information about the books or people or things which 
	 // we think that are gonna be fixed.
	private final String desc;
	private final int price;
	
	
	// Though we have not given identifier here but only private identifier is allowed in case of 
	// enum constructor.
	Enum_mobby2(String desc, int price)
	{
		this.desc = desc;
		this.price = price;
	}
	
	public String getDesc()
	{
		return desc;
	}
	
	public int price()
	{
		return price;
	}
	
	

}
