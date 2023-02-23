import java.util.Comparator;
public class Materias {
    private String Materia;
    private float Calificacion;
    private int prioridad;
    
    //Constructor
    public Materias(String Materia, float Calificacion) {
        this.Materia = Materia;
        this.Calificacion = Calificacion;
        //condicion
        if (this.Calificacion < 8)
            prioridad = 1;
            else 
            prioridad = 2;
    }

    public String getMateria() {
        return Materia;
    }

    public float getCalificacion() {
        return Calificacion;
    }

    public int getPrioridad() {
        return prioridad;
    }
    @Override 
    public String toString(){
        return String.format("%s %.1f", getMateria(),getCalificacion());
    } 
}
    class MateriasComparator implements Comparator<Materias>{
    @Override
    public int compare (Materias m1, Materias m2){
        if (m1.getPrioridad() > m2.getPrioridad())
            return 1;
        else if (m1.getPrioridad()<m2.getPrioridad()    )
            return -1;
        return 0;
    }
}

