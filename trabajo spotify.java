package trabajo.spotify;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        Cancion[] top10 = new Cancion[10];
        for (int i = 0; i < 10; i++) {
            int id = Integer.parseInt(JOptionPane.showInputDialog("id " + (i + 1)));
            String titulo = JOptionPane.showInputDialog("título " + (i + 1));
            String creador = JOptionPane.showInputDialog("autor" + (i + 1));
            double tiempo = Double.parseDouble(JOptionPane.showInputDialog("duración " + (i + 1)));
            int año = Integer.parseInt(JOptionPane.showInputDialog("año de creación " + (i + 1)));
            top10[i] = new Cancion(id, titulo, creador, tiempo, año);
        }
        JOptionPane.showMessageDialog(null, "Top 10");
        for (Cancion cancion : top10) {
            if (cancion != null) {
                cancion.mostrarDetalles();
            }
        }
        int añoActual = 2023;
        int pasadas = 0, esteaño = 0, posteriores = 0;
        for (Cancion cancion : top10) {
            if (cancion != null) {
                int añoCancion = cancion.getAñoCreacion();
                if (añoCancion < añoActual) {
                    pasadas++;
                } else if (añoCancion == añoActual) {
                    esteaño++;
                } else {
                    posteriores++;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "canciones de años pasados " + pasadas +
                "\nCanciones de este año" + esteaño +
                "\ncaonciones de años posteriores" + posteriores);
        Cancion cancionquemasdura = top10[0];
        for (Cancion cancion : top10) {
            if (cancion != null && cancion.getDuracion() > cancionquemasdura.getDuracion()) {
                cancionquemasdura = cancion;
            }
        }
        JOptionPane.showMessageDialog(null, "Canción que mas dura");
        cancionquemasdura.mostrarDetalles();
        Cancion primeraCancion = top10[0];
        JOptionPane.showMessageDialog(null, "creador de la primera cancion" + primeraCancion.getAutor());
    }
}