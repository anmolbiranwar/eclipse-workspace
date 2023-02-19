package javaPrac;

public class Array {

	public static void main(String[] args) {
//--------One Dimensional Array-----------
		int a[]=new int[5];//declaration and instantiation
		a[0]=1;//initialization
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	//------------------------------------
		int b[]= {10,20,30,40,50};//declaration,instantiation and initialization
		for(int i=0;i<b.length;i++)
		{
		System.out.println(b[i]);
		}
//------Two Dimensional Array--------
		int c[][]=new int[3][2]; //declaration
		//Storing elements/values into array
		c[0][0]=10;
		c[0][1]=20;
		
		c[1][0]=30;
		c[1][1]=40;
		
		c[2][0]=50;
		c[2][1]=60;
		//Classic for loop
		for(int i=0;i<=2;i++) //for incrementing the rows
		{
			for(int j=0;j<=1;j++)
			{
				System.out.print(c[i][j]+" "); //for incrementing the columns
			}
			System.out.println();
		}
		
		//for...each loop
		
		for(int i[]:c)
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
//----------------------
		//int d[][]=new int[4][3];
		int d[][]= {{10,15,20},{25,30,35},{40,45,50},{55,60,65}};
		for(int i[]:d)
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
	}

}
