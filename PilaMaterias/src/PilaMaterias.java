import java.util.PriorityQueue;
public class PilaMaterias {
    public static void main(String[] args) {
        
        PriorityQueue <Materias> ColaPrioridad = new PriorityQueue<>(new MateriasComparator());
        
        ColaPrioridad.add(new Materias ("Español", 9));
        ColaPrioridad.add(new Materias ("Estructura de datos", (float) 4.2));
        ColaPrioridad.add(new Materias("Sistemas Electronicos", (float) 8.3));
        ColaPrioridad.add(new Materias("Administracion de base de datos", (float) 7.6));
        ColaPrioridad.add(new Materias ("UML", (float) 8.9));
        ColaPrioridad.add(new Materias ("Matematicas Discretas", (float) 7.5));
        
        while(!ColaPrioridad.isEmpty())
            System.out.println(ColaPrioridad.poll());
    }
}
