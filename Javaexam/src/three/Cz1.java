package three;

import circle.Circle;
import cylinder.Cylinder;

public class Cz1 {

	public static void main(String[] args) {
		Circle cir1=new Circle(1);
		Circle cir2=new Circle(2);
		Cylinder cy1=new Cylinder(1, 2);
		Cylinder cy2=new Cylinder(2, 2);
		System.out.println("cir1���:"+cir1.area()+"cir1�ܳ�:"+cir1.perimeter());
		System.out.println("cir2���:"+cir2.area()+"cir2�ܳ�:"+cir2.perimeter());
		System.out.println("cy1�����:"+cy1.area()+"cy1���:"+cy1.volume());
		System.out.println("cy2�����:"+cy2.area()+"cy2�ܳ�:"+cy2.volume());
	}

}
