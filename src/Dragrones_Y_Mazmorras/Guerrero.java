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
    if (companeroProtegido != null) {
        dejarDeProteger();
    }
    companeroProtegido = companero;
    companero.setProtegido(true);
    System.out.println(nombre + " ahora protege a " + companero.getNombre());
}

public void dejarDeProteger() {
    if (companeroProtegido != null) {
        System.out.println(nombre + " deja de proteger a " + companeroProtegido.getNombre());
        companeroProtegido.setProtegido(false);
        companeroProtegido = null;
    } else {
        System.out.println(nombre + " no está protegiendo a nadie");
    }
}
                       // Devuelve el personaje que está protegiendo
public Personaje estaProtegiendo() {
return companeroProtegido;
}
