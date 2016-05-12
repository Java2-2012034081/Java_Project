package sample_0512;

public class Animal {
	protected double w;
	protected String pic;
	
	public Animal(){
		w=99;pic = "animal";
		System.out.println("Animal Cont");
		}
	
	
	public Animal(double w, String pic) {
		this.w = w;
		this.pic = pic;
		System.out.println("Animal Cont2");   //이러면 생성자 2개, 자동호출은 인자가 아무것도 없는걸 호출, 명시적 호출하면 다른 생성자 부를수도있다. 인자에 값을 넣으면
	}


	void eat(){System.out.println("eat()가 호출되었음");}
	void sleep(){System.out.println("sleep()가 호출되었음");}
}
