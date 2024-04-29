
public class RadioTest {

	public static void main(String[] args) {
		Radio myRadio = new Radio();
		System.out.println(myRadio.getBand());
		
		Radio carRadio = new Radio();
		carRadio.selectFM();
		System.out.println(carRadio.getBand()); 
	}
	

}
