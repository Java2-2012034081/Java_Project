package sample_0512;

public class AnimalTest {

	public static void main(String[] args) {
		Lion l1 = new Lion();
		l1.eat(); l1.sleep(); l1.roar();
		l1.infor();
		//여기서는 w, pic을 못씀 왜냐하면 상속받은게 없어서 l1객체도 못씀 lion 클래스 안에서만 사용 가능
		
		Eagle e1 = new Eagle();
		e1.eat();
	}

}
