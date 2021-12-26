package Algorithm;

import java.util.Scanner;

public class Palindrome{
	
	int m,n,rev,c;
	
	void accept()
	{
Scanner sc = new Scanner(System.in);

System.out.println("enter the lower limit:");
m =sc.nextInt();
System.out.println("enter the upper limit:");
n =sc.nextInt();
	}
void palindrome()
{
	int num,tmp,i;
	System.out.println("the prime Palinddrome numbers are");
	for (num=m;num<=n;num++)
	{
		c=0;
		rev =0;
		tmp =num;
		//checking for prime num
		for (i=1;i<=tmp;i++)
		{
		//counting the number of factors of the number
			if(tmp%i==0)
				c++;
			
		}
		//if the num is prime check for palindrome
		if(c==2)
		{
			while(tmp>0) {
				rev=rev * 10+ (tmp%10);
				tmp/=10;
			}
			//check for prime palindrome num
			if(rev==num)
				System.out.println(num+"");
		}
	}
}

public static void main(String[] args)
{
	Palindrome p=new Palindrome();
	p.accept();
	p.palindrome();
	
}


}









