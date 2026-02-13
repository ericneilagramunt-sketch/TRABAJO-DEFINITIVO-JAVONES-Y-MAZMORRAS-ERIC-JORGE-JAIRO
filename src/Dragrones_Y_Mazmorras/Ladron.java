package Dragrones_Y_Mazmorras;

public class Ladron extends Personaje{
private boolean invisible;
  
public Ladron(String nombre, int nivel, int puntosVida) {
super(nombre, nivel, puntosVida);
this.invisible = false; // Al inicio no está invisible
}
  // Método para robar
public void robar() {
if (invisible) {
System.out.println(nombre + " roba sin ser visto gracias a su invisibilidad!");
} else {
System.out.println(nombre + " intenta robar pero puede ser detectado!");
}
}
  // Cambia el estado de invisibilidad
public void hacerseInvisible() {
invisible = !invisible; // Cambia de true a false o de false a true
if (invisible) {
System.out.println(nombre + " se vuelve invisible!");
} else {
System.out.println(nombre + " vuelve a ser visible");
}
}
// Devuelve si está invisible
public boolean estaInvisible() {
return invisible;
}
 public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Invisible: " + (invisible ? "Sí" : "No"));
        System.out.println("======================");
 }
}
