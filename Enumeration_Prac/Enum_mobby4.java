package Enumeration_Prac;

public enum Enum_mobby4 {
	PLUS,MINUS,DIVIDE,MULTIPLY;
	
	// This is it, these were 4 ways by which enum can be used.
	double calculate(double a, double b)
	{
		switch(this)
		{
		case PLUS:
			return a + b;
			
		case MINUS:
			return a - b;
			
		case DIVIDE:
			return a / b;
			
		case MULTIPLY:
			return a * b;
		
		default:
			throw new AssertionError("Unknown Operation " + this);
		}
	}
	
}
