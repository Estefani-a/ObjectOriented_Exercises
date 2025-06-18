package Exercise1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Plataforma {
    private List<Cancion> canciones = new ArrayList<>();

    public void agregarCancion(Cancion c) {
        canciones.add(c);
    }

    public Cancion buscarPorId(String idCancion) {
        for (Cancion c : canciones) {
            if (c.getIdCancion().equals(idCancion)) {
                return c;
            }
        }
        throw new RuntimeException("Canción no encontrada: " + idCancion);
    }

    public List<Cancion> buscarPorArtista(String nombreArtista) {
        List<Cancion> resultado = new ArrayList<>();
        for (Cancion c : canciones) {
            if (c.getArtista().equals(nombreArtista)) {
                resultado.add(c);
            }
        }
        return resultado;
    }

    public void reproducirCancion(String idCancion, Usuario usuario) {
        Cancion cancion = buscarPorId(idCancion);
        cancion.reproducir(usuario);
    }

    public void darLikeCancion(String idCancion, Usuario usuario) {
        Cancion cancion = buscarPorId(idCancion);
        cancion.darLike(usuario);
    }

    public Cancion obtenerMasReproducida() {
        if (canciones.isEmpty()) {
            return null;
        }

        Cancion max = canciones.get(0);
        for (Cancion c : canciones) {
            if (c.getReproducciones() > max.getReproducciones()) {
                max = c;
            }
        }
        return max;
    }

    public Set<String> obtenerArtistas() {
        Set<String> artistas = new HashSet<>();
        for (Cancion c : canciones) {
            artistas.add(c.getArtista());
        }
        return artistas;
    }

    public boolean esExito() {
        for (Cancion c : canciones) {
            if (c.getReproducciones() == 0) {
                return false;
            }
        }
        return true;
    }

    public List<Cancion> obtenerHits() {
        List<Cancion> hits = new ArrayList<>();
        for (Cancion c : canciones) {
            if (c.esHit()) {
                hits.add(c);
            }
        }
        return hits;
    }
}
