import java.util.Scanner;

public class EligeTuPropiaAventura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Bienvenido a 'Las última aventura de una araña en 1ºDAM'. Antes de empezar, dime el nombre de la araña valiente:");
        System.out.print("Nombre de la araña: ");
        String nombre = sc.nextLine().trim();
        if (nombre.isEmpty()) nombre = "Luma";


        int distanciaSubida = 0;
        int distanciaBajada = 0;
        int presasCazadas = 0;
        boolean sobrevivio = true;
        int tiempoMin = 0;
        double velocidadMedia = 0.0;

        System.out.println("\n" +
                "En el aula de 1ºDAM, " + nombre + " despierta entre cables y portátiles brillando. " +
                "Hoy, " + nombre + " saldrá en busca de gloria, comida y quizá un lugar seguro para tejer su destino.\n");

        // DECISIÓN 1
        System.out.println("Decisión 1:");
        System.out.println("1) Escalar por el cable del proyector hacia el techo del aula.");
        System.out.println("2) Avanzar por el suelo, bordeando mochilas y zapatillas curiosas.");
        int d1 = leer(sc, 1, 2);

        if (d1 == 1) {
            distanciaSubida += 2; // sube 2 m por el cable
            tiempoMin += 3;
            System.out.println("\n" +
                    "Con paciencia, " + nombre + " asciende el cable negro del proyector. " +
                    "La altura impresiona, pero desde allí se ve todo el reino de mesas, " +
                    "pantallas azules y cuadernos con garabatos. El techo ofrece rutas silenciosas.\n");
        } else {
            distanciaBajada += 1; // caminar a ras de suelo implica pequeñas bajadas entre cables
            tiempoMin += 4;
            System.out.println("\n" +
                    "A ras del suelo, " + nombre + " avanza como una sombra diminuta." +
                    " Entre botellas de agua, mochilas gigantes y suelas inquietas, cada paso parece una oportunidad para morir.\n");
        }

        // DECISIÓN 2
        System.out.println("Decisión 2:");
        System.out.println("1) Buscar alimento: tejer una pequeña red junto a la ventana abierta.");
        System.out.println("2) Priorizar seguridad: esconderse bajo la repisa del radiador.");
        int d2 = leer(sc, 1, 2);

        if (d2 == 1) {
            presasCazadas += 1;
            tiempoMin += 5;
            distanciaSubida += 1;
            System.out.println("\n" +
                    "La ventana filtra una luz amable. " + nombre + " ancla hilos finos " +
                    "entre una esquina y una pegatina. La brisa trae pequeños mosquitos, " +
                    "y pronto, una vibración alegre anuncia la primera presa del día.\n");
        } else {
            tiempoMin += 2;
            distanciaBajada += 1;
            System.out.println("\n" +
                    "Bajo la repisa del radiador, la penumbra es densa, casi doméstica. " +
                    "No hay muchas corrientes, pero la calma es un alivio. " +
                    "Se oyen pasos, voces, y el rumor de un ventilador cansado.\n");
        }

        // DECISIÓN 3
        System.out.println("Decisión 3:");
        System.out.println("1) Cruzar el pasillo para alcanzar la pared opuesta, donde hay un póster.");
        System.out.println("2) Permanecer en la zona actual y asegurar una base resistente.");
        int d3 = leer(sc, 1, 2);


        System.out.println();
        if (d1 == 1 && d2 == 1 && d3 == 1) {
            distanciaSubida += 1;
            tiempoMin += 4;
            presasCazadas += 1;
            System.out.println(
                    "Desde lo alto, " + nombre + " calcula la ruta hacia el póster brillante. " +
                            "Cruza un vacío intimidante, hilando una pasarela temporal. Al llegar, " +
                            "encuentra motas dulces y captura otra presa diminuta. Es un triunfo limpio.\n"
            );
            sobrevivio = true;
        } else if (d1 == 1 && d2 == 1 && d3 == 2) {
            tiempoMin += 3;
            System.out.println(
                    nombre + " decide consolidar la red en la ventana. Reforzando la espiral " +
                            "y ajustando radios, convierte un rincón modesto en una trampa elegante. " +
                            "El día transcurre con buen ritmo y la serenidad de un taller silencioso.\n"
            );
            sobrevivio = true;
        } else if (d1 == 1 && d2 == 2 && d3 == 1) {
            distanciaBajada += 1;
            tiempoMin += 5;
            System.out.println(
                    "Desde el techo hacia el póster hay una corriente traicionera. " +
                            nombre + " pierde un hilo y cae un pequeño tramo, pero se recupera con templanza. " +
                            "Aprende a leer el aire del aula, como quien entiende un idioma nuevo.\n"
            );
            sobrevivio = true;
        } else if (d1 == 1 && d2 == 2 && d3 == 2) {
            tiempoMin += 2;
            System.out.println(
                    nombre + " permanece en altura, pegado a conductos tibios. " +
                            "La seguridad es aceptable, aunque el hambre araña la paciencia. " +
                            "El murmullo de los estudiantes se vuelve una nana sorprendentemente útil.\n"
            );
            sobrevivio = true;
        } else if (d1 == 2 && d2 == 1 && d3 == 1) {
            distanciaSubida += 2;
            tiempoMin += 6;
            presasCazadas += 2;
            System.out.println(
                    "El ascenso desde el suelo hacia el póster exige audacia. " +
                            nombre + " traza un zigzag robusto y, en mitad del camino, " +
                            "un par de mosquitos despistados quedan atrapados en un hilo auxiliar. " +
                            "La pared opuesta ofrece una cumbre bien merecida\n."
            );
            sobrevivio = true;
        } else if (d1 == 2 && d2 == 1 && d3 == 2) {
            tiempoMin += 3;
            System.out.println(
                    "La red junto a la ventana prospera sin alardes. " +
                            nombre + " ajusta tensiones con precisión delicada. " +
                            "No es un festín, pero la constancia alimenta y la calma enseña.\n"
            );
            sobrevivio = true;
        } else if (d1 == 2 && d2 == 2 && d3 == 1) {
            distanciaBajada += 1;
            tiempoMin += 5;
            System.out.println(
                    "Cruzando el pasillo a ras de suelo, " + nombre + " esquiva " +
                            "patadas involuntarias y el monstruo aspirador de un conserje distraído. " +
                            "Un salto medido lo salva a última hora. La experiencia deja respeto y orgullo.\n"
            );
            sobrevivio = true;
        } else {
            tiempoMin += 2;
            System.out.println(
                    "Decidir quedarse parece aburrido, pero es sabio. " +
                            nombre + " halla un recoveco tibio, sin gloria inmediata, " +
                            "aunque con la promesa humilde de llegar vivo al próximo descanso.\n"
            );
            sobrevivio = true;
        }

        int distanciaTotal = distanciaSubida + distanciaBajada;
        if (tiempoMin > 0) {
            velocidadMedia = (double) distanciaTotal / (double) tiempoMin; // m/min
        } else {
            velocidadMedia = 0.0;
        }

        System.out.println("\n===== Resumen de la aventura =====");
        System.out.println("Araña: " + nombre);
        System.out.println("Sobrevivió: " + (sobrevivio ? "sí" : "no"));
        System.out.println("Distancia subida (m): " + distanciaSubida);
        System.out.println("Distancia bajada (m): " + distanciaBajada);
        System.out.println("Distancia total (m): " + distanciaTotal);
        System.out.println("Presas cazadas: " + presasCazadas);
        System.out.println("Tiempo estimado (min): " + tiempoMin);
        System.out.printf("Velocidad media aproximada (m/min): %.2f%n", velocidadMedia);
        System.out.println("Gracias por honrar la memoria de nuestra valiente araña en 1ºDAM.");
        sc.close();
    }

    private static int leer(Scanner sc, int min, int max) {
        while (true) {
            System.out.print("Elige (" + min + "-" + max + "): ");
            String s = sc.nextLine().trim();
            try {
                int v = Integer.parseInt(s);
                if (v >= min && v <= max) return v;
            } catch (NumberFormatException ignored) {}
            System.out.println("Entrada inválida. Intenta de nuevo.");
        }
    }
}