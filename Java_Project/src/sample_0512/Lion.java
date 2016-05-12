package sample_0512;

public class Lion extends Animal {
	private int legs;
	
	
	
	public Lion() {
		super(100, "KING"); //부모 생성자 호출, 명시적인 호출, 부모 생성자가 다수가 있을때 명시적으로 쓰기 위해서 super()를 쓴다
		this.legs = 4;
	}
	void roar(){System.out.println("roar()가 호출되었음");}
	void infor() {System.out.println(w+ " "+pic);}
}
