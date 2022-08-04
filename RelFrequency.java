import java.util.Scanner;
public class RelFrequency
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Text: ");
		String text=input.nextLine();
		char B[]=new char[text.length()];
		double max=0;
		int maxi=0;
		for(int i=0;i<text.length();i++)
		{
			double count=1;
			for(int j=i+1;j<text.length();j++)
			{
				if(text.charAt(i)==text.charAt(j))
				{
					count++;
					B[j]='0';
				}
				else
					continue;
			}
			
			
			if(B[i]!='0')
			{
				double rf=(count/text.length())*100;
				System.out.println("The RF of "+text.charAt(i)+" :"+rf+"%");
				if(rf>max)
				{
					max=rf;
					maxi=i;
				}
					
			}
			

		}
		
		System.out.println(text.charAt(maxi)+" has the Maximum RF of :"+max+"%");
	}
}
	
		
		
		
		
	