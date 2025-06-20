/**
 * Representa un alumno con nombre y tres notas.
 * Proporciona métodos para acceder y modificar los datos del alumno,
 * asegurando que las notas estén entre 0 y 10.
 */
public class Alumno {
    /** Nombre del alumno */
    private String nombre;
    /** Primera nota del alumno (0-10) */
    private double nota1;
    /** Segunda nota del alumno (0-10) */
    private double nota2;
    /** Tercera nota del alumno (0-10) */
    private double nota3;

    /**
     * Crea un nuevo alumno con nombre y tres notas.
     * @param nombre Nombre del alumno
     * @param nota1 Primera nota (0-10)
     * @param nota2 Segunda nota (0-10)
     * @param nota3 Tercera nota (0-10)
     */
    public Alumno(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        setNota1(nota1);
        setNota2(nota2);
        setNota3(nota3);
    }

    /**
     * Obtiene el nombre del alumno.
     * @return Nombre del alumno
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del alumno.
     * @param nombre Nombre del alumno
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la primera nota.
     * @return Primera nota
     */
    public double getNota1() {
        return nota1;
    }

    /**
     * Establece la primera nota (0-10).
     * @param nota1 Primera nota
     * @throws IllegalArgumentException si la nota no está entre 0 y 10
     */
    public void setNota1(double nota1) {
        if (nota1 >= 0 && nota1 <= 10) {
            this.nota1 = nota1;
        } else {
            throw new IllegalArgumentException("Nota1 debe estar entre 0 y 10");
        }
    }

    /**
     * Obtiene la segunda nota.
     * @return Segunda nota
     */
    public double getNota2() {
        return nota2;
    }

    /**
     * Establece la segunda nota (0-10).
     * @param nota2 Segunda nota
     * @throws IllegalArgumentException si la nota no está entre 0 y 10
     */
    public void setNota2(double nota2) {
        if (nota2 >= 0 && nota2 <= 10) {
            this.nota2 = nota2;
        } else {
            throw new IllegalArgumentException("Nota2 debe estar entre 0 y 10");
        }
    }

    /**
     * Obtiene la tercera nota.
     * @return Tercera nota
     */
    public double getNota3() {
        return nota3;
    }

    /**
     * Establece la tercera nota (0-10).
     * @param nota3 Tercera nota
     * @throws IllegalArgumentException si la nota no está entre 0 y 10
     */
    public void setNota3(double nota3) {
        if (nota3 >= 0 && nota3 <= 10) {
            this.nota3 = nota3;
        } else {
            throw new IllegalArgumentException("Nota3 debe estar entre 0 y 10");
        }
    }

    /**
     * Calcula el promedio de las tres notas del alumno.
     * @return Promedio de las notas
     */
    public double promedio() {
        return (nota1 + nota2 + nota3) / 3.0;
    }
}