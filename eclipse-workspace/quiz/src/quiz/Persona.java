package quiz;

public class Persona {
	
private String nombre;
private int edad;

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}

public Persona(String nombre, int edad) {
	super();
	this.nombre = nombre;
	this.edad = edad;
}

public  void mostrarInformacion(String nombre,int edad)
{
	System.out.println(nombre);
	System.out.println(edad);
}
}
