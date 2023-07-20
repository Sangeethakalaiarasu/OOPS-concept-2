package tv;

public interface TVInterface {
	
	String getBrand();
	String getModel();
	int getVolume();
	boolean getOn_Off();
	
	void setBrand(String brand);
	void setModel(String model);
	void setVolume(int volume);
	void setOn_Off(boolean on_off);
	
	void On_Off();
	void volumePlus();
	void volumeMinus();
	
}
