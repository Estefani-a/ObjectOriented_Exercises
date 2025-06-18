package Exercise1;

public class Main {
    public static void main(String[] args) {
        Plataforma spootify = new Plataforma();

        // Crear canciones
        Cancion c1 = new Cancion("RT133", "Tren del cielo", "Soledad");
        Cancion c2 = new Cancion("RT200", "Universo", "Abel Pintos");
        Cancion c3 = new Cancion("RT300", "Viaje", "Lali");

        // Agregar canciones a la plataforma
        spootify.agregarCancion(c1);
        spootify.agregarCancion(c2);
        spootify.agregarCancion(c3);

        // Crear usuarios
        Usuario melina = new Usuario("U01", "Melina");
        Usuario juan = new Usuario("U02", "Juan");
        Usuario lucia = new Usuario("U03", "Lucia");

        // Simular reproducciones
        for (int i = 0; i < 500; i++) {
            c1.reproducir(melina);  // 500 reproducciones
        }

        for (int i = 0; i < 800; i++) {
            c1.reproducir(juan);  // 800 más
        }

        for (int i = 0; i < 1000; i++) {
            c2.reproducir(lucia); // 1000 reproducciones
        }

        c3.reproducir(melina); // Solo una reproducción

        //Simular likes
        try {
            c1.darLike(melina);
            c1.darLike(juan);
            c2.darLike(lucia);
        } catch (Exception e) {
            System.out.println("Error al dar like: " + e.getMessage());
        }

        //Obtener la colección de todos los artistas
        System.out.println("Artistas en la plataforma:");
        for (String artista : spootify.obtenerArtistas()) {
            System.out.println("- " + artista);
        }

        //Obtener la canción mas reproducida
        Cancion masReproducida = spootify.obtenerMasReproducida();
        System.out.println("\nCanción más reproducida:");
        System.out.println(masReproducida + " con " + masReproducida.getReproducciones() + " reproducciones");

        //Verificar si la plataforma es un exito
        System.out.println("\n¿La plataforma es un exito?");
        System.out.println(spootify.esExito() ? "Si" : "No");

        // d. Obtener la lista de hits
        System.out.println("\nCanciones HIT:");
        for (Cancion hit : spootify.obtenerHits()) {
            System.out.println("- " + hit + " (Likes: " + hit.getLikes() + ", Reproducciones: " + hit.getReproducciones() + ")");
        }
    }
}

