import java.util.ArrayList;

public class ListaAlumnos {
    public ArrayList<Alumno> alumnos = new ArrayList<>();

    public void agregarAlumno(String nombre, double n1, double n2, double n3) {
        Alumno a = new Alumno(nombre, n1, n2, n3);
        alumnos.add(a);
    }

    public void mostrarAlumnos() {
        System.out.println("Nombre\tNota1\tNota2\tNota3\tMedia");
        System.out.println("--------------------------------------");
        for (int i = 0; i < alumnos.size(); i++) {
            Alumno a = alumnos.get(i);
            System.out.println(a.getNombre() + "\t" +
                String.format("%.1f", a.getNota1()) + "\t" +
                String.format("%.1f", a.getNota2()) + "\t" +
                String.format("%.1f", a.getNota3()) + "\t" +
                String.format("%.1f", a.promedio()));
        }
    }

    public double promedioGeneral() {
        double suma = 0;
        for (int i = 0; i < alumnos.size(); i++) {
            suma += alumnos.get(i).promedio();
        }
        return suma / alumnos.size();
    }

    public static void main(String[] args) {
        Asignatura asignatura = new Asignatura();
        asignatura.altaAlumno("Ana", 8.5, 7.0, 9.0);
        asignatura.altaAlumno("Luis", 6.0, 7.5, 8.0);
        asignatura.altaAlumno("Carlos", 9.0, 8.5, 7.5);
        asignatura.altaAlumno("Maria", 7.0, 8.0, 8.5);
        asignatura.altaAlumno("Sofia", 8.0, 9.0, 7.0);

        System.out.print(Mensajes.LIMPIAR_PANTALLA);
        System.out.flush();
        System.out.println(Mensajes.TITULO_LISTA);
        System.out.println(Mensajes.SEPARADOR);
        asignatura.mostrarAlumnos();
        System.out.println(Mensajes.SEPARADOR);
        System.out.println(Mensajes.NOTA_MEDIA + asignatura.promedioGeneral());
    }
}