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
		System.out.println("Animal Cont2");   //�̷��� ������ 2��, �ڵ�ȣ���� ���ڰ� �ƹ��͵� ���°� ȣ��, ����� ȣ���ϸ� �ٸ� ������ �θ������ִ�. ���ڿ� ���� ������
	}


	void eat(){System.out.println("eat()�� ȣ��Ǿ���");}
	void sleep(){System.out.println("sleep()�� ȣ��Ǿ���");}
}
