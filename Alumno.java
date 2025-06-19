public class Alumno {
    public String nombre;
    public double nota1;
    public double nota2;
    public double nota3;

    public Alumno(String n, double n1, double n2, double n3) {
        nombre = n;
        nota1 = n1;
        nota2 = n2;
        nota3 = n3;
    }

    public double promedio() {
        return (nota1 + nota2 + nota3) / 3;
    }
}