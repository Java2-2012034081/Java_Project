package Sample_0407;

public class Television {
	private int channel;
	private int volume;
	private boolean onOff;
	
	Television(){
		this(10,20,false);
		//channel = 10;
		//volume = 10;
		//onOff = true;
	}
	
	public Television(int channel, int volume){
		this(channel, volume, true);
	}
	
	Television(int c, int v, boolean o){
		channel = c;
		volume = v;
		onOff = o;
	}
	void print(){
		System.out.println("ä���� " + channel + "�̰� ������" + volume +"�Դϴ� ");
		//�ڷ����� ��ü�� pr�̶�� ����� ����
	
	}
	
}
