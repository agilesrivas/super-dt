package modulo;
import java.util.*;

public class Usuario {
 ArrayList<Equipo>listEquipos;
 private String nombre;
 private String contraseña;
 private int edad;
 private double costo;
 private String email;
 private String nombreUser;
 private String ciudad;
 private String provincia;
public ArrayList<Equipo> getListEquipos() {
	return listEquipos;
}
public void setListEquipos(ArrayList<Equipo> listEquipos) {
	this.listEquipos = listEquipos;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getContraseña() {
	return contraseña;
}
public void setContraseña(String contraseña) {
	this.contraseña = contraseña;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public double getCosto() {
	return costo;
}
public void setCosto(double costo) {
	this.costo = costo;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getNombreUser() {
	return nombreUser;
}
public void setNombreUser(String nombreUser) {
	this.nombreUser = nombreUser;
}
public String getCiudad() {
	return ciudad;
}
public void setCiudad(String ciudad) {
	this.ciudad = ciudad;
}
public String getProvincia() {
	return provincia;
}
public void setProvincia(String provincia) {
	this.provincia = provincia;
}
 
 
 
}
