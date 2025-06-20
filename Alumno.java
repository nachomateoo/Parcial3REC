public class Alumno {
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;

    public Alumno(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        setNota1(nota1);
        setNota2(nota2);
        setNota3(nota3);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        if (nota1 >= 0 && nota1 <= 10) {
            this.nota1 = nota1;
        } else {
            throw new IllegalArgumentException("Nota1 debe estar entre 0 y 10");
        }
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        if (nota2 >= 0 && nota2 <= 10) {
            this.nota2 = nota2;
        } else {
            throw new IllegalArgumentException("Nota2 debe estar entre 0 y 10");
        }
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        if (nota3 >= 0 && nota3 <= 10) {
            this.nota3 = nota3;
        } else {
            throw new IllegalArgumentException("Nota3 debe estar entre 0 y 10");
        }
    }

    public double promedio() {
        return (nota1 + nota2 + nota3) / 3.0;
    }
}