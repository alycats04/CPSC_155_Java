/* Name: Alyssa Ayala
 * Class: CPSC 155-01
 * Instructor: Professor Caughey
 * Purpose: The purpose of this program is to create a multi-class program: 
 * an Object class and its driver program. This program will create a functioning radio
 * that will display the band, frequency, volume, and power. */
 
public class Radio {
	private boolean power;
	private int volume;
	private double frequency;
	private String band;

	public Radio() {
		band = "AM";
		frequency = 540;
		volume = 1;
		power = false;

	}
	
	
	public String getBand() {
		return band;
	}
	
	public double getFreq() {
		return frequency;
	}
	
	public void selectAM() {
		band = "AM";
	}
	
	public void selectFM() {
		band = "FM";
	}
	
	
	public void setFreq(double newFreq) {
		frequency = newFreq;
	}
	
	public int getVol() {
		return 0;
	}
	
	public void setVolume(int newVol) {
		
	}
	
	 

}



