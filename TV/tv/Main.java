package tv;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TVFeatures mytv=new TVFeatures("OnePlus", "32Y", 10, true);
		
		mytv.printTVDetails();
		
		System.out.println();
		System.out.println("---Features---");
		System.out.println(mytv.toString());
		
		System.out.println();
		mytv.On_Off();
		mytv.volumePlus();
		mytv.volumeMinus();
		mytv.volumePlus();
		mytv.volumePlus();
		mytv.volumePlus();
		System.out.println(mytv.getBrand());
	}

}
