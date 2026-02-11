
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
