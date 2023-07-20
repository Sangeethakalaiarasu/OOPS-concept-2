package tv;

public abstract class TV implements TVInterface{
	
	private String brand;
	private String model;
	private int volume;
	private boolean on_off;
	
	public TV(String brand,String model,int volume,boolean on_off){
		this.brand=brand;
		this.model =model;
		this.volume=volume;
		this.on_off=on_off;
		}
//getter method
	
	public String getBrand() {
		return brand;
	}
	
	public String getModel() {
		return model;
	}
	public int getVolume() {
		return volume;
	}
	public boolean getOn_Off() {
		return on_off;
	}
	
	
//setter method	
	public  void setBrand(String brand) {
		 this.brand=brand;
	 }
	 
	 public void setModel(String model) {
		 this.model=model;
	 }
	 public void setVolume(int volume) {
		 this.volume=volume;
	 }
	 public void setOn_Off(boolean on_off) {
		 this.on_off=on_off;
	 }
	 
	public  void On_Off() {
		 if(on_off==true) {
			 System.out.println("TV is Turning ON...");
		 }
		 else {
			 System.out.println("TV is Turning OFF...");
		 }
	 }
	 
	 public void volumePlus() {
		 System.out.println("Volume is Increasing : "+ ++volume);
	 }
	 
	 public void volumeMinus() {
		 System.out.println("Volume is Decreasing : "+ --volume);
	 }
	
}
