import java.util.ArrayList;

public class Asignatura {
    private ArrayList<Alumno> lista = new ArrayList<>();

    public void altaAlumno(String nombre, double n1, double n2, double n3) {
        Alumno a = new Alumno(nombre, n1, n2, n3);
        lista.add(a);
    }

    public void mostrarAlumnos() {
        System.out.println(Mensajes.ENCABEZADO_LISTA);
        System.out.println(Mensajes.SEPARADOR);
        for (Alumno a : lista) {
            System.out.println(a.getNombre() + "\t" +
                String.format("%.1f", a.getNota1()) + "\t" +
                String.format("%.1f", a.getNota2()) + "\t" +
                String.format("%.1f", a.getNota3()) + "\t" +
                String.format("%.1f", a.promedio()));
        }
    }

    public double promedioGeneral() {
        double suma = 0;
        for (Alumno a : lista) {
            suma += a.promedio();
        }
        return lista.size() > 0 ? suma / lista.size() : 0;
    }
}