package sample_0513;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Shape r1 = new Rectangle(); //���� �ִ°� shape���� ��������°� Rectangle ��ü
		Shape c1 = new Circle();
		Shape r2 = new Rectangle();
		
		
		r1.move(111, 111);
		c1.move(999, 999);
		infor(r1);
		infor(c1);
		
	}
//�Ʒ��� Shape ro�� Circle�� r�� ������. �׷��� �Լ� �ϳ��� ���� ���Ѽ� iii�� ���� r�� ���� ����� �� ��.
	static void infor(Shape ro) { ro.info(); ro.iii();} //static �޼ҵ�� static�⸮ �θ� �� �ִ�. main��  static, �������̵� �ȳ� �Ѿư��� �����ִ� ��ü�� ���� info()��³��� ���� �˾Ƽ� ������. �̷��� iii�� �̿��� circle�� private r�� ���� ����.
	static void inforr(Rectangle r) { r.info();} //�̷��� �ϸ� �ڽ��� 30���� ���ڿ� ���� �޼ҵ� 30�� ¥�ߵȴ�. �׷��� �Լ� �������̵� �Ἥ �޴� ���ڿ� ���� ���ư��� ���������. �׷� ����ó�� �ϸ��
	//static void infor(Circle c){c.info();}
}
