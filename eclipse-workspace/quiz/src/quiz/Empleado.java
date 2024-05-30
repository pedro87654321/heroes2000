package quiz;

public class Empleado extends Persona {

	private double salario;
	private String Cargo;
	
	
	public Empleado(String nombre, int edad, double salario, String cargo) {
		super(nombre, edad);
		this.salario = salario;
		Cargo = cargo;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public String getCargo() {
		return Cargo;
	}


	public void setCargo(String cargo) {
		Cargo = cargo;
	}
	public  void mostrarInformacion(String nombre,int edad, double salario, String cargo)
	{
		System.out.println(nombre);
		System.out.println(edad);
		System.out.println(salario);
		System.out.println(cargo);
	}
}
