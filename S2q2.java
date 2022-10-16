package midTest;

import java.util.Scanner;
public class S2q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean choice = true;
		
		while(choice)
		{
			System.out.println("Please select \n1.2D Array \n2.String \n3.Array \n4.Square \n5.Exit");
			int num = sc.nextInt();
			
			switch(num)
			{
			case 1 :
				{
					int a[][] = new int[4][3];
					System.out.println("Please enter elements in array");
					for(int i = 0;i<4;i++)
					{
						for(int j = 0;j<3;j++)
						{
							a[i][j]=sc.nextInt();
						}
					}
					for(int i = 0;i<4;i++)
					{
						for(int j = 0;j<3;j++)
						{
							if(a[i][j]%2!=0)
							{
								a[i][j]=0;
							}
						}
					}
					for(int i = 0;i<4;i++)
					{
						for(int j = 0;j<3;j++)
						{
							System.out.print(a[i][j]);
						}
						System.out.println();
					}
				}
				break;
			case 2 :
				{
					Scanner sc1 = new Scanner(System.in);
					String s;
					int count = 0;
					System.out.println("Please enter string: ");
					s = sc1.nextLine();
					for(int i=0;i<s.length();i++)
					{
						if(s.charAt(i)=='0' || s.charAt(i)=='1' || s.charAt(i)=='2' || s.charAt(i)=='3' || s.charAt(i)=='4' || s.charAt(i)=='5' || s.charAt(i)=='6' || s.charAt(i)=='7' || s.charAt(i)=='8' || s.charAt(i)=='9')
						{
							count++;
						}
					}
					System.out.println(" Total Count of digit: " +count);
				}
				break;
			case 3 :
				{
					int ar[] = new int[5];
					
					System.out.println("Please enter elements in array: ");
					
					for(int i = 0;i<5;i++)
					{
						ar[i] = sc.nextInt();
					}
					for(int i = 0;i<5;i++)
					{
						ar[i] = ar[i]/2;
					}
					
					for(int i = 0;i<5;i++)
					{
						System.out.print(+ar[i]+"\n");
					}
				}
				break;
				case 4 :
				{
					int sq =1,sn=11;
					for(int i=sn;i<16;i++)
					{
						sq = i*i;
						System.out.println("Square of "+i+" is "+sq);
					}
					
				}
				break;
				case 5 :
				{
					choice = false;
				}
			}
		}
	}
}
