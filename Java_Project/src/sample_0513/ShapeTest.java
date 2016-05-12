package sample_0513;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Shape r1 = new Rectangle(); //볼수 있는건 shape지만 만들어지는건 Rectangle 객체
		Shape c1 = new Circle();
		Shape r2 = new Rectangle();
		
		
		r1.move(111, 111);
		c1.move(999, 999);
		infor(r1);
		infor(c1);
		
	}
//아래의 Shape ro는 Circle의 r을 못본다. 그래서 함수 하나를 연결 시켜서 iii를 통해 r를 보게 만들어 준 것.
	static void infor(Shape ro) { ro.info(); ro.iii();} //static 메소드는 static기리 부를 수 있다. main이  static, 오버라이딩 된놈 쫓아가서 던져주는 객체에 따라서 info()라는놈이 지가 알아서 보여줌. 이렇게 iii를 이용해 circle의 private r에 접근 가능.
	static void inforr(Rectangle r) { r.info();} //이렇게 하면 자식이 30개면 인자에 따라 메소드 30개 짜야된다. 그래서 함수 오버라이딩 써서 받는 인자에 따라 돌아가게 만들어주자. 그럼 위에처럼 하면됨
	//static void infor(Circle c){c.info();}
}
