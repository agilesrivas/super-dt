package modulo;
import java.util.*;
public class Equipo {
	
  ArrayList<Jugador>listJugadores;
  private String nombreEquipo;
  private final int maxJugadores=15;
  private boolean estadoDeIngresoTorneo;
  private int puntosTotales;
  private int id;
public ArrayList<Jugador> getListJugadores() {
	return listJugadores;
}
public void setListJugadores(ArrayList<Jugador> listJugadores) {
	this.listJugadores = listJugadores;
}
public String getNombreEquipo() {
	return nombreEquipo;
}
public void setNombreEquipo(String nombreEquipo) {
	this.nombreEquipo = nombreEquipo;
}
public boolean isEstadoDeIngresoTorneo() {
	return estadoDeIngresoTorneo;
}
public void setEstadoDeIngresoTorneo(boolean estadoDeIngresoTorneo) {
	this.estadoDeIngresoTorneo = estadoDeIngresoTorneo;
}
public int getPuntosTotales() {
	return puntosTotales;
}
public void setPuntosTotales(int puntosTotales) {
	this.puntosTotales = puntosTotales;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getMaxJugadores() {
	return maxJugadores;
}
	
  
}
