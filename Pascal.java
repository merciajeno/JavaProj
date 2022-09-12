import java.util.Scanner;

public class Pascal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		long[][] a=new long[number][number*3];
	int i,j;
	int s=a.length+1;
	a[0][s]=1;
	a[1][s]=2;
	a[1][s-2]=1;
	a[1][s+2]=1;
	for(i=2;i<a.length;i++)
	{
		for(j=1;j<a[0].length-1;j++)
		{
			if(a.length%2==1)
			{
				if(i%2==0&&j%2==1)
					a[i][j]=a[i-1][j+1]+a[i-1][j-1];
				if(i%2==1&&j%2==0)
					a[i][j]=a[i-1][j+1]+a[i-1][j-1];
			}
			else
			{
				if(i%2==1&&j%2==1)
					a[i][j]=a[i-1][j-1]+a[i-1][j+1];
				if(i%2==0&&j%2==0)
					a[i][j]=a[i-1][j+1]+a[i-1][j-1];
		}
		}
	}
	for(i=0;i<a.length;i++)
	{
		for(j=0;j<a[0].length;j++)
		{
			if(a[i][j]==0)
				System.out.print(" ");
			else
				System.out.print(a[i][j]);
		}
		System.out.println();
	}
		}

	}


