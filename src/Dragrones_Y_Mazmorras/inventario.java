
import java.util.ArrayList;
public class inventario {
private ArrayList<equipamento> equipamiento;
public inventario() {
equipamiento = new ArrayList<equipamento>();
}
public void agregarEquipamiento(equipamento equipo) {
equipamiento.add(equipo);
System.out.println("Se ha añadido: " + equipo.getNombre());
}
public void mostrarInventario() {
System.out.println("=== INVENTARIO ===");
if (equipamiento.isEmpty()) {
System.out.println("El inventario está vacío");
    } else {
        for (equipamento equipo : equipamiento) {
            System.out.println("- " + equipo.getNombre() + " (" + equipo.getTipo() + ")");
        }
    }
    System.out.println("==================");
}
