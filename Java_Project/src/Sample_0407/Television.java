package Sample_0407;

public class Television {
	int channel;
	int volume;
	boolean onOff;
	
	void pr(){
		System.out.println(channel+" "+volume+" "+onOff);
		//텔레비젼 자체에 pr이라는 기능을 넣음
	
	}
	int changeChannel(int ch){
		channel= ch;
		return channel;
	}
	
}
