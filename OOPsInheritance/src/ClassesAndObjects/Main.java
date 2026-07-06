package ClassesAndObjects;

class Box {
	int width, height,depth;
	Box(int w,int h,int d){
		width=w;
		height=h;
		depth=d;
	}
	int volume() {
		return width*height*depth;
	}
}
public class Main{
	public static void main(String[] args) {
		Box b=new Box(5,4,3);
		System.out.println("Volume of Box = "+b.volume());
	}
}
