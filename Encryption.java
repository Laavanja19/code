import java.util.Scanner;
public class Encryption
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Use only lower case letters for plain text.");
		char A[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p',
					'q','r','s','t','u','v','w','x','y','z',' '};
					
		String B[]={"yqpl","qpo","stuobn","ul","lopedcwvk","kolewpole","jokazeyp","lapk",
					"o","fi,","lam$at","75le~!","((/","kl","iol","pk",",,ert","juye","ax",
					"kclv3","dpc","88aslv","amv6%h","[[mze","ver0l","k&kk","nme"};
					
		System.out.print("Enter Your Plain Text: ");
		String text=input.nextLine();
		String temp="";
		
		for(int i=0;i<text.length();i++)
		{
			for(int j=0;j<A.length;j++)
			{
				if(text.charAt(i)==A[j])
				{
					if(i<text.length()-1 && text.charAt(i)!=text.charAt(i+1))
						temp=temp+B[j];
					else if(i<text.length()-1 && text.charAt(i)==text.charAt(i+1))
						temp=temp+"ml"+B[j+1];
					else
						temp=temp+B[j];
				}
				else
					continue;
			}
		}
		System.out.println("Cipher Text is:"+temp);
		
		
		String tmp="",tmp1="";
		
		for(int i=0;i<temp.length();i++)
		{
			tmp=tmp+temp.charAt(i);
			
			for(int j=0;j<A.length;j++)
			{
				if(tmp.equals("ml"+B[j]))
				{
					tmp1=tmp1+A[j-1];
					tmp="";
				}
					
				if(tmp.equals(B[j]))
				{
					tmp1=tmp1+A[j];
					tmp="";
				}
				else
					continue;
			}
		}
		System.out.println("Plain Text is: "+tmp1);
	}
}
				
