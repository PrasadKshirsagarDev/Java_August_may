package This_Super;

public class Alternate_Prime {

	public static void main(String[] args) {
			
		int count =0;
		
		for(int i=2; i<100; i++)
		{
			boolean flag = false;
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					flag = true;
				}
				
				break;
			}
			if(flag==false)
			{
				count++;
				if(count %2 != 0) {
				System.out.println(i);
			}
			}
			
		}

	}

}
