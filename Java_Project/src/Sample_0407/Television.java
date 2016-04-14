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
		System.out.println("채널은 " + channel + "이고 볼륨은" + volume +"입니다 ");
		//텔레비젼 자체에 pr이라는 기능을 넣음
	
	}
	
}
