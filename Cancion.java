package trabajo.spotify;

import javax.swing.JOptionPane;

public class Cancion {
    private int id;
    private String titulo;
    private String creador;
    private double tiempo;
    private int año;

    public Cancion(int id, String titulo, String autor, double duracion, int añoCreacion) {
        this.id = id;
        this.titulo = titulo;
        this.creador = autor;
        this.tiempo = duracion;
        this.año = añoCreacion;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return creador;
    }
    public void setAutor(String autor) {
        this.creador = autor;
    }
    public double getDuracion() {
        return tiempo;
    }
    public void setDuracion(double duracion) {
        this.tiempo = duracion;
    }
    public int getAñoCreacion() {
        return año;
    }
    public void setAñoCreacion(int añoCreacion) {
        this.año = añoCreacion;
    }

    public void mostrarDetalles() {
        JOptionPane.showMessageDialog(null, "id " + id + "\ntitulo " + titulo + "\nautor " + creador +
                "\nduracion " + tiempo + "\nAño de creacion " + año);
    }
}