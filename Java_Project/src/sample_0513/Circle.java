package sample_0513;

public class Circle extends Shape {

	private int r;
	
	public Circle() { r = 3; }
	
	public void move(int _x, int _y){ x = _x +r; y = _y+r;}
	
	public void info(){System.out.println("C x : " + x + " y : " + y);}
	
	public void iii() {System.out.println(r);} //이렇게 하면 못보는 r값까지 오버라이딩 기법을 이용해서 볼 수 있다.
}
