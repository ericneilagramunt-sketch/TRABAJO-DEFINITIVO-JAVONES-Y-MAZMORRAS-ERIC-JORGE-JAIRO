Public class Personaje{
  Protected String nombre;
  Protected int nivel;
  Protected int puntosVida;
  Protected boolean protegido;
  Protected inventario inventario;

  Public Personaje(String nombre,int nivel, int PuntosVida)
  this.nombre = nombre;
  this.nivel = nivel;
  this.puntosVida = puntosVida;
  this.protegido = false;
  this.inventario = new inventario();

  public void mostrarInfo() {
  System.out.printl("======================");
  System.out.println("Nombre:"+ nombre);
  System.out.println("Nivel:"+ nivel);
  System.out.println("Puntos de Vida:"+ puntosVida);
  System.out.println("Protegido:"+(protegido ?"Si":"No"));
  System.out.println("======================");
  }

  Public void bajarVida(int candtidad){
  if(protegido){
  cantidad = cantidad/2;
    System.out.println(nombre+"está protegido! El daño se reduce a"+ cantidad);
  }
  puntosVida = puntosVida - cantidad;

  if (puntosVida < 0) {
puntosVida = 0;
}
System.out.println(nombre + " recibe " + cantidad + " de daño. Vida restante: " + puntosVida);
}

public void curar(int cantidad) {
puntosVida = puntosVida + cantidad;
System.out.println(nombre + " se cura " + cantidad + " puntos. Vida actual: " + puntosVida);
}

public inventario getInventario() {
return inventario;
}

public void agregarEquipamiento(equipamento equipamiento) {
inventario.agregarEquipamiento(equipamiento);
}
  
