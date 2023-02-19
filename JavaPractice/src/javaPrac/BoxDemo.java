package javaPrac;
class Box{
	double width, height,depth;
}
public class BoxDemo {

	public static void main(String[] args) {
		Box b1=new Box();
		b1.width=2;
		b1.height=3;
		b1.depth=4;
		double vol;
		vol=b1.depth*b1.height*b1.width;
		System.out.println("Volume of b1: "+vol);
		Box b2=b1;
		vol=b2.width*b2.depth*b2.height;
		System.out.println("Volume if b2: "+vol);
		
	
	}

}
