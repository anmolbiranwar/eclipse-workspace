package javaPrac;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num[]= {5.5,10.1,11,12.8,56.9,2.5};
		double result=0;
		for(int i=0;i<num.length;++i)
		{
			result=result+num[i];
			System.out.println(result/6);
		}
	}

}
