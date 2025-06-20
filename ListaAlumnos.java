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
        ListaAlumnos lista = new ListaAlumnos();
        lista.agregarAlumno("Ana", 8.5, 7.0, 9.0);
        lista.agregarAlumno("Luis", 6.0, 7.5, 8.0);
        lista.agregarAlumno("Carlos", 9.0, 8.5, 7.5);
        lista.agregarAlumno("Maria", 7.0, 8.0, 8.5);
        lista.agregarAlumno("Sofia", 8.0, 9.0, 7.0);
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\tLISTADO DE ALUMNOS");
        System.out.println("--------------------------------------");
        lista.mostrarAlumnos();
        System.out.println("--------------------------------------");
        System.out.println("Nota media del grupo: " + lista.promedioGeneral());
    }
}