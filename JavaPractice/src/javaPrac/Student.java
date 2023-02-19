package javaPrac;

public class Student {
	String name,result;
	double eng, math, science, tmarks,per;
	Student()
	{
	}
	Student(String n,double e,double m,double s)
	{
		name=n;
		eng=e;
		math=m;
		science=s;
	}
	void setData(String name,double eng,double math, double science)
	{
		System.out.println("Student name :"+name);
		System.out.println("Marks of English :"+eng);
		System.out.println("Marks of Math :"+math);
		System.out.println("MArks of Science :"+science);
	}
	void calcResult()
	{
		tmarks=eng+math+science;
		per=(tmarks*100)/300;
	}
	void showResult()
	{
		
		System.out.println("Total Marks :"+tmarks);
		System.out.println("Percentage :"+per);
		if(per>=85)
		{
			System.out.println("First Division");
		}else if(per>=60)
		{
			System.out.println("Second Division");
		}else if(per>=40)
		{
			System.out.println("Third Division");
		}else
		{
			System.out.println("Fail");
		}
		
		
	}
	public static void main(String[] args) {
		Student s1=new Student("Anmol",90,90,90);
		//s1.setData(null, 0, 0, 0);
		s1.calcResult();
		s1.showResult();
	
		Student s2=new Student();
		s2.setData("Yash",60,70,80);
		s2.showResult();
	}

}
