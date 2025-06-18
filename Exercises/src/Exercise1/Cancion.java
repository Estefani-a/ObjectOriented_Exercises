package Exercise1;

import java.util.HashSet;
import java.util.Set;

public class Cancion {
    private final String idCancion;
    private final String titulo;
    private final String artista;

    private int reproducciones;
    private int likes;

    private Set<Usuario> usuariosQueEscucharon = new HashSet<>();
    private Set<Usuario> usuariosQueDieronLike = new HashSet<>();

    public Cancion(String id, String titulo, String artista) {
        this.idCancion = id;
        this.titulo = titulo;
        this.artista = artista;
    }

    //Metodos
    public void reproducir(Usuario usuario) {
        if (usuariosQueEscucharon.add(usuario)) {
            // Primera vez que escucha
        }
        reproducciones++;
    }

    public void darLike(Usuario usuario) {
        if (!usuariosQueEscucharon.contains(usuario)) {
            throw new RuntimeException("El usuario no ha escuchado la canción.");
        }
        if (!usuariosQueDieronLike.add(usuario)) {
            throw new RuntimeException("El usuario ya dio like a esta canción.");
        }
        likes++;
    }

    public boolean esHit() {
        return reproducciones >= 1000 && likes >= (int)(reproducciones * 0.8);
    }

    @Override
    public String toString() {
        return titulo + " de " + artista + " (" + idCancion + ")";
    }

    public String getIdCancion() {
        return idCancion;
    }

    public String getArtista() {
        return artista;
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public int getLikes() {
        return likes;
    }
}
