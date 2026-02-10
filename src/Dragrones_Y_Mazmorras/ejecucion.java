public class ejecucion {
	public static void main(String[] args) {
	
	
	System.out.println("====================================");
    System.out.println("BIENVENIDO A JAVONES Y MAZMORRAS");
    System.out.println("====================================\n");
    
    // ===== CREANDO PERSONAJES =====
    System.out.println("--- Creando personajes ---\n");
    
    // Crear un Mago
    Mago mago = new Mago("Gandalf", 5, 100, 50);
    
    // Crear un Guerrero
    Guerrero guerrero = new Guerrero("Conan", 6, 150);
    
    // Crear un Ladrón
    Ladron ladron = new Ladron("Robin", 4, 80);
    
    System.out.println("¡Personajes creados!\n");
    
    

}
