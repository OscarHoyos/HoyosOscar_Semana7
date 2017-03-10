import processing.core.PApplet;

public class MainApp  extends PApplet{

	Logica log;
	
	public static void main(String[] args) {
		main("MainApp");
	}
	
	public void settings() {

		size(1200, 700);

	}
	
	public void setup() {

		log = new Logica(this);
	
	}
	
	
	public void draw() {

	
	}
	
	
	
}
