package myLearnings;

public class PrimeNumCalculator {
	public boolean CheckPrime( int number )
	{
		
		for (int i = 2; i <= number; i++ )
		{
			if ( i == number )
			{
				return true;
			}
			if( number % i == 0 )
			{
				break;
			}
		}
		return false;
	}
}
