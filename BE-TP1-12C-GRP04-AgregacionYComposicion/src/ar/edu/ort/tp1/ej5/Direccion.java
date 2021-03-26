package ar.edu.ort.tp1.ej5;

public class Direccion {
	private String calle;
	private String altura;
	private String piso;
	private String departamento;

	public Direccion(String calle, String altura, String piso, String departamento) {
		this.calle = calle;
		this.altura = altura;
		this.piso = piso;
		this.departamento = departamento;
	}
	
	@Override
	public String toString() {
		return calle + " " + altura + " " + piso + "°”" + departamento + "”";
	}

	public boolean coincide(String unPiso, String unDepto) {
		return this.piso.equals(unPiso) && this.departamento.equals(unDepto);
	}
}
