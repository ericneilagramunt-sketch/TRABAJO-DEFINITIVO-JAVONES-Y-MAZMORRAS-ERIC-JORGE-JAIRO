package Dragrones_Y_Mazmorras;

public class Guerrero { extends Personaje {
// Atributo adicional: personaje que está protegiendo
private Personaje companeroProtegido;
}
public Guerrero(String nombre, int nivel, int puntosVida) {
super(nombre, nivel, puntosVida);
this.companeroProtegido = null; // Al inicio no protege a nadie
}
public void proteger(Personaje companero) {
// Si ya está protegiendo a alguien, primero deja de protegerlo
if (companeroProtegido != null) {
dejarDeProteger();
}
}
