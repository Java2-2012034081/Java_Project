package Sample_0519;

public class Class_Test {

	public static void main(String[] args) {
		P_object[] pob = new P_object[3];//배열 원소에 값은 없음
		pob[0] = new P_object();
		pob[1] = new C1_object();
		pob[2] = new C2_object();
		
		pr_all(pob[0]); pr_all(pob[1]); pr_all(pob[2]);
		pob[0].pr(); pob[1].pr(); pob[2].pr();
		
		
		/*P_object po1 = new P_object();
		P_object co1 = new C1_object();
		P_object co2 = new C2_object();
		pr_all(po1); pr_all(co1); pr_all(co2);*/
		
		
		
		/*for(P_object temp : pob){                    //pob의 원소 값을 temp에 넣어줌, for each 구문임
			//temp = new P_object();
			pr_all(temp);
			change_all(temp, 7, 77);
			pr_all(temp);
		}*/

	}
	//P_object temp = co1; 이게 밑에걸 말함. 원래 temp는 po1박에 못보는데 오버라이딩 해서 다형성 쓰게 됨.
	public static void pr_all(P_object temp){ temp.pr(); } //pr_all은 일반 메소드 main은 static이라 일반 메소드 못부름, 그래서 static으로 만들어줘야됨
	public static void change_all(P_object temp, int x, int y){
		temp.change(x, y);
	}
}
