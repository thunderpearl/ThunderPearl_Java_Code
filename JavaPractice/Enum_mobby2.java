package JavaPractice;

public enum Enum_mobby2 {
	Java("best",400),
	C("P_best",350),
	Python("F_best",350),
	Php("W_best",300),
	Ruby("A_best",375);
	
	
	// In case fo enum try making these instance variable as final as well along with private. 
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
