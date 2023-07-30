package package2;

public class Primenumber {

	

	

		public Primenumber() 
		{
			
		}

		public static void main(String[] args) 
		{
			int num=101;
			int v;
			for(v=2;v<num;v++)
			{
				if(num%v==0)
				{
				
					break;
				}
			}
			
			if(v==num)
			{
				System.out.println("it is prime");  
			}
			else
			{
				System.out.println("it is not prime number");
			}

		}

	}



