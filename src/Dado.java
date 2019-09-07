
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Dado {

    // Atributos o propiedades de la clase
    private int numero;
    private Random r;

    // Metodo constructor, se llama igual que la clase
    public Dado(Random r) {
        this.r = r;
    }

    public void lanzar() {
        numero = r.nextInt(6) + 1;
    }

    public void mostrar(JLabel lbl) {
        // Nombre de la imagen a mostrar
        String nombreImagen = "imagenes/" + String.valueOf(numero) + ".jpg";

        // Cargar la imagen
        ImageIcon imagen = new ImageIcon(getClass().getResource(nombreImagen));
        // Asignacion de la imagen al objeto JLabel
        lbl.setIcon(imagen);
    }

    public int obtenerNumero() {
        return numero;
    }

}
