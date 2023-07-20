































package tv;

public class TVFeatures extends TV{
	
	//constructor for TVFeatures
	TVFeatures(String brand,String model,int volume,boolean on_off){
		super(brand,model,volume,on_off);
	}
	
	String support="Netflix, Prime Video, Youtube";
	String display="LED";
	protected int usb=2;
	String otherFeatures="Google Assistance, Chromecast-in, Wifi connection";
	int size=32;
	int price=30000;
	String control="Remote";
	String color="Black";
	
	
	void printTVDetails() {
		System.out.println("TV Details");
		System.out.println("Brand Name: "+getBrand()+"\nModel Name : "+getModel());
	}
	
	public String toString() {
		return "Size: "+size+" Inch\nControl Method: "+control+" Control\nColor: "+color+"\nPrice: "+price+"\nUSB Portal: "+usb
				+"Portals\nDisplay Technology: "+display+"\nSupported OTT Platforms: "+support+"\nOther Features: "+otherFeatures;
	}
	
}
