import java.security.KeyStore.LoadStoreParameter;
import java.util.ArrayList;

import processing.core.PApplet;

public class Logica {
	
	private PApplet app;
	ArrayList alumnos = new ArrayList<Alumno>();
	
	public Logica(PApplet app) {
		alumnos = new ArrayList<>();
		String[] nombres, datos, colores;
		this.app = app;
	
		nombres = app.loadStrings("../data/nombres.txt");
		datos = app.loadStrings("../data/datos.txt");
		colores = app.loadStrings("../data/colores.txt");
		
		for (int i = 0; i < nombres.length; i++) {
			String[] nombre = nombres[i].split(":");
			String[] dato = datos[i].split("/");
			String[] color = colores[i].split("/");
			alumnos.add(new Alumno(nombre[0], nombre[1],(int)Long.parseLong(dato[0]),Integer.parseInt(dato[1]),Integer.parseInt(dato[2]), Integer.parseInt(color[0]), Integer.parseInt(color[1]),Integer.parseInt(color[2])));
			
			
		}
		
		for (int i = 0; i < alumnos.size(); i++) {
			for (int j = 0; j < alumnos.size(); j++) {
				Alumno uno = (Alumno) alumnos.get(j-1);
				Alumno dos = (Alumno) alumnos.get(j);
				if(uno.getEdad()>dos.getEdad()){
					
					alumnos.set(j-1, dos);
					alumnos.set(j, uno);
				}
			}
			
		}
		
		for (int i = 0; i < alumnos.size(); i++) {
			app.println(((Alumno)alumnos.get(i)).getEdad());
		}
	
	}
	
	

}
