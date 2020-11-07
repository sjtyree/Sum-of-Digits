package SumofDigits;

public class SumofDigitsMain {

	public static void main(String[] args) 
	{
		System.out.println(solution(51));

	}
	
	public static int solution(int N) 
	{
        int solution = N, 
        	sumOfNTimes2 = sumOfDigits(N) * 2;
        do
        {
        	solution++;
        }while(sumOfDigits(solution) < sumOfNTimes2);
        return solution;
    }

	//function that takes in an integer and returns the sum of its digits
	public static int sumOfDigits(int number) 
	{
		//ints representing the digits of the number
		int one, two, three, four, five;
		//one digit
		if (number < 10)
			return number;
		//two digits
		else if (number >= 10 && number < 100)
		{
			one = number/10;
			two = number % 10;
			return one + two;
		}
		//three digits
		else if (number >= 100 && number < 1000 )
		{
			one = number/100;
			two = (number % 100)/10;
			three = (number % 100)%10;
			return one + two + three;
		}
		//four digits
		else if (number >= 1000 && number < 10000 )
		{
			one = number/1000;
			two = (number % 1000) / 100;
			three = ((number % 1000)%100) / 10;
			four = (((number%1000)%100)%10);
			return one + two + three + four;
		}
		//five digits
		else if (number >= 10000 && number < 100000 )
		{
			one = number/10000;
			two = (number % 10000) / 1000;
			three = ((number % 10000)%1000) / 100;
			four = (((number%10000)%1000)%100)/10;
			five = (((number%10000)%1000)%100)%10;
			return one + two + three + four;
		}
		else return 0;
	}
}
