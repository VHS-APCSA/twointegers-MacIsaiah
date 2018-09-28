
public class TwoIntegers 
{
	private int one;
	private int two;
	
	public TwoIntegers()
	{
		one = 0;
		two = 0;
	}
	public TwoIntegers(int one, int two)
	{
		this.one = one;
		this.two = two;
	}
	public int getOne()
	{
		return one;
	}
	public void setOne(int one)
	{
		this.one = one;
	}
	public int getTwo()
	{
		return two;
	}
	public void setTwo(int two)
	{
		this.two = two;
	}
	public String artimetic()
	{
		int sum = one + two;
		int dif = one - two;
		int mult = one * two;
		double div = one / two;
		return "*sum is:" +  sum + "Difference:" + dif + "Multiplication: " + mult + "Division: " + div;
	}
	public String larger()
	{
		if(one > two)
		{
			return one + " > " + two;
		}
		else if (one < two)
		{
			return one + " < " + two;
		}
		else 
		{
			return one + " = " + two;
		}
		
	}
	public boolean isEven()
	{
		if((one + two) % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isMultiple()
	{
		if (one % two == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}