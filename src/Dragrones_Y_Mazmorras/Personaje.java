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
    
  
