package Dragrones_Y_Mazmorras;
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

	// ===== MOSTRAR INFORMACIÓN =====
    System.out.println("--- Información de los personajes ---\n");
    mago.mostrarInfo();
    guerrero.mostrarInfo();
    ladron.mostrarInfo();
    
    
    // ===== AÑADIR EQUIPAMIENTO =====
    System.out.println("\n--- Añadiendo equipamiento ---\n");
    
    // Crear objetos de equipamiento
    equipamento baston = new equipamento("Bastón Mágico", "arma");
    equipamento tunica = new equipamento("Túnica Azul", "armadura");
    equipamento espada = new equipamento("Espada de Acero", "arma");
    equipamento daga = new equipamento("Daga Sigilosa", "arma");
    
    // Añadir equipamiento a los personajes
    mago.agregarEquipamiento(baston);
    mago.agregarEquipamiento(tunica);
    guerrero.agregarEquipamiento(espada);
    ladron.agregarEquipamiento(daga);
    
    System.out.println();

	 // ===== MOSTRAR INVENTARIOS =====
    System.out.println("--- Inventarios ---\n");
    System.out.println("Inventario de " + mago.getNombre() + ":");
    mago.getInventario().mostrarInventario();
    System.out.println();
    
    System.out.println("Inventario de " + guerrero.getNombre() + ":");
    guerrero.getInventario().mostrarInventario();
    System.out.println();
    
    
    // ===== HABILIDADES DEL MAGO =====
    System.out.println("--- Habilidades del Mago ---\n");
    mago.lanzarHechizo(20);  // Lanza un hechizo que cuesta 20 de maná
    mago.lanzarHechizo(40);  // Intenta lanzar otro hechizo
    mago.recargarMana(30);   // Recarga maná
    System.out.println();
    
    
    // ===== HABILIDADES DEL GUERRERO =====
    System.out.println("--- Habilidades del Guerrero ---\n");
    guerrero.proteger(mago);  // El guerrero protege al mago
    System.out.println();
    
    
    // ===== HABILIDADES DEL LADRÓN =====
    System.out.println("--- Habilidades del Ladrón ---\n");
    ladron.robar();           // Intenta robar visible
    ladron.hacerseInvisible(); // Se vuelve invisible
    ladron.robar();           // Roba invisible
    System.out.println();
     // ===== MOSTRAR INVENTARIOS =====
    System.out.println("--- Inventarios ---\n");
    System.out.println("Inventario de " + mago.getNombre() + ":");
    mago.getInventario().mostrarInventario();
    System.out.println();
    
    System.out.println("Inventario de " + guerrero.getNombre() + ":");
    guerrero.getInventario().mostrarInventario();
    System.out.println();
    
    
    // ===== HABILIDADES DEL MAGO =====
    System.out.println("--- Habilidades del Mago ---\n");
    mago.lanzarHechizo(20);  // Lanza un hechizo que cuesta 20 de maná
    mago.lanzarHechizo(40);  // Intenta lanzar otro hechizo
    mago.recargarMana(30);   // Recarga maná
    System.out.println();
    
    
    // ===== HABILIDADES DEL GUERRERO =====
    System.out.println("--- Habilidades del Guerrero ---\n");
    guerrero.proteger(mago);  // El guerrero protege al mago
    System.out.println();
    
    
    // ===== HABILIDADES DEL LADRÓN =====
    System.out.println("--- Habilidades del Ladrón ---\n");
    ladron.robar();           // Intenta robar visible
    ladron.hacerseInvisible(); // Se vuelve invisible
    ladron.robar();           // Roba invisible
    System.out.println();
    
    

}
