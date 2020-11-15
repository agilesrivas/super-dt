package modulo;

public class Jugador 
{
   private String nombre;
   private String Nacionalidad;
   private int puntos;
   private double costo;
   private int edad;
   private int idEquipo;
   private Gol goles;
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getNacionalidad() {
	return Nacionalidad;
}
public void setNacionalidad(String nacionalidad) {
	Nacionalidad = nacionalidad;
}
public int getPuntos() {
	return puntos;
}
public void setPuntos(int puntos) {
	this.puntos = puntos;
}
public double getCosto() {
	return costo;
}
public void setCosto(double costo) {
	this.costo = costo;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public int getIdEquipo() {
	return idEquipo;
}
public void setIdEquipo(int idEquipo) {
	this.idEquipo = idEquipo;
}
public Gol getGoles() {
	return goles;
}
public void setGoles(Gol goles) {
	this.goles = goles;
}
   
   
}
