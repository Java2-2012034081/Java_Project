package sample_0512;

public class Lion extends Animal {
	private int legs;
	
	
	
	public Lion() {
		super(100, "KING"); //�θ� ������ ȣ��, ������� ȣ��, �θ� �����ڰ� �ټ��� ������ ��������� ���� ���ؼ� super()�� ����
		this.legs = 4;
	}
	void roar(){System.out.println("roar()�� ȣ��Ǿ���");}
	void infor() {System.out.println(w+ " "+pic);}
}
