import java.util.Scanner;

public class EligeTuPropiaAventura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Eres Luma, una joven araña tejedora en un viejo granero.");
        System.out.println("Decisión 1:");
        System.out.println("1) Explorar un claro tranquilo a la izquierda.");
        System.out.println("2) Seguir luces parpadeantes a la derecha.");
        int d1 = leer(sc, 1, 2);

        if (d1 == 1) {
            // Rama 1: Claro
            System.out.println("\nTe deslizas hacia el claro. El viento es suave.");
            System.out.println("Decisión 2:");
            System.out.println("1) Tejer entre dos juncos, estable.");
            System.out.println("2) Tejer junto a flores, vistoso.");
            int d2 = leer(sc, 1, 2);

            if (d2 == 1) {
                // 1 -> 1 -> juncos
                System.out.println("\nEntre juncos la vibración de la seda es nítida.");
                System.out.println("Decisión 3:");
                System.out.println("1) Reforzar telaraña.");
                System.out.println("2) Ocultarte bajo una hoja.");
                int d3 = leer(sc, 1, 2);

                if (d3 == 1) {
                    // 1-1-1
                    System.out.println("\nRefuerzas con patrón espiral denso.");
                    System.out.println("Decisión 4:");
                    System.out.println("1) Mantener patrón denso.");
                    System.out.println("2) Abrir un hueco central.");
                    int d4 = leer(sc, 1, 2);

                    if (d4 == 1) {
                        // 1-1-1-1
                        System.out.println("\nUna libélula ronda cerca.");
                        System.out.println("Decisión 5:");
                        System.out.println("1) Endurecer seda central.");
                        System.out.println("2) Añadir gotas adhesivas.");
                        int d5 = leer(sc, 1, 2);
                        if (d5 == 1) {
                            System.out.println("\nFinal: La libélula cae en la sección endurecida. Festín logrado.");
                        } else {
                            System.out.println("\nFinal: Las gotas atraen más presas; comes bien pero debes reponer pegamento.");
                        }
                    } else {
                        // 1-1-1-2
                        System.out.println("\nCon hueco central te mueves mejor; aparece una avispa curiosa.");
                        System.out.println("Decisión 5:");
                        System.out.println("1) Quedarte inmóvil.");
                        System.out.println("2) Vibrar para parecer más grande.");
                        int d5 = leer(sc, 1, 2);
                        if (d5 == 1) {
                            System.out.println("\nFinal: La avispa te ignora; luego capturas un mosquito gordo.");
                        } else {
                            System.out.println("\nFinal: Ahuyentas a la avispa pero rompes algunos hilos. Sales ilesa.");
                        }
                    }
                } else {
                    // 1-1-2
                    System.out.println("\nBajo la hoja estás segura, pero hay hormigas cerca.");
                    System.out.println("Decisión 4:");
                    System.out.println("1) Desviar hormigas con hilo pegajoso.");
                    System.out.println("2) Reubicar anclajes más arriba.");
                    int d4 = leer(sc, 1, 2);

                    if (d4 == 1) {
                        // 1-1-2-1
                        System.out.println("\nEl desvío funciona, el camino queda libre.");
                        System.out.println("Decisión 5:");
                        System.out.println("1) Expandir la red.");
                        System.out.println("2) Reforzar anclajes.");
                        int d5 = leer(sc, 1, 2);
                        if (d5 == 1) {
                            System.out.println("\nFinal: Expandes y duplicas capturas. Territorio conquistado.");
                        } else {
                            System.out.println("\nFinal: La tormenta no te afecta gracias a anclajes fuertes. Estabilidad ante todo.");
                        }
                    } else {
                        // 1-1-2-2
                        System.out.println("\nArriba hay más brisa y más presas al vuelo.");
                        System.out.println("Decisión 5:");
                        System.out.println("1) Aumentar diámetro de la orbe.");
                        System.out.println("2) Densificar la espiral.");
                        int d5 = leer(sc, 1, 2);
                        if (d5 == 1) {
                            System.out.println("\nFinal: Capturas mariposas pequeñas. Buen banquete, mantenimiento alto.");
                        } else {
                            System.out.println("\nFinal: Nada minúsculo escapa; rendimiento constante.");
                        }
                    }
                }
            } else {
                // 1 -> 2 -> flores
                System.out.println("\nLas flores atraen insectos y aves curiosas.");
                System.out.println("Decisión 3:");
                System.out.println("1) Camuflar seda con polen.");
                System.out.println("2) Tejer un túnel de escape.");
                int d3 = leer(sc, 1, 2);

                if (d3 == 1) {
                    // 1-2-1
                    System.out.println("\nEl brillo de la seda se apaga con el polen.");
                    System.out.println("Decisión 4:");
                    System.out.println("1) Añadir líneas guía invisibles.");
                    System.out.println("2) Esperar pacientemente.");
                    int d4 = leer(sc, 1, 2);

                    if (d4 == 1) {
                        // 1-2-1-1
                        System.out.println("\nLas líneas guía canalizan insectos pequeños.");
                        System.out.println("Decisión 5:");
                        System.out.println("1) Segundo nivel de captura.");
                        System.out.println("2) Cámara de descanso.");
                        int d5 = leer(sc, 1, 2);
                        if (d5 == 1) {
                            System.out.println("\nFinal: Tu red es un laberinto letal. Leyenda del claro.");
                        } else {
                            System.out.println("\nFinal: Un mirlo te ignora gracias a tu refugio. Seguridad primero.");
                        }
                    } else {
                        // 1-2-1-2
                        System.out.println("\nEl sol calienta la seda.");
                        System.out.println("Decisión 5:");
                        System.out.println("1) Moverte a la sombra.");
                        System.out.println("2) Mantener posición para presa mayor.");
                        int d5 = leer(sc, 1, 2);
                        if (d5 == 1) {
                            System.out.println("\nFinal: La red dura más y comes abundante por la tarde.");
                        } else {
                            System.out.println("\nFinal: Capturas un escarabajo pesado. Triunfo arriesgado.");
                        }
                    }
                } else {
                    // 1-2-2
                    System.out.println("\nEl túnel de seda te da escape rápido.");
                    System.out.println("Decisión 4:");
                    System.out.println("1) Cebar con gotas de rocío.");
                    System.out.println("2) Patrullar el perímetro.");
                    int d4 = leer(sc, 1, 2);

                    if (d4 == 1) {
                        // 1-2-2-1
                        System.out.println("\nLas gotas relucen y atraen mosquitos.");
                        System.out.println("Decisión 5:");
                        System.out.println("1) Cerrar la malla ahora.");
                        System.out.println("2) Seguir cebando.");
                        int d5 = leer(sc, 1, 2);
                        if (d5 == 1) {
                            System.out.println("\nFinal: Atrapaste una nube de mosquitos. Festín.");
                        } else {
                            System.out.println("\nFinal: Una rana se interesa y daña tu red. Lección aprendida.");
                        }
                    } else {
                        // 1-2-2-2
                        System.out.println("\nDetectas un hueco vulnerable.");
                        System.out.println("Decisión 5:");
                        System.out.println("1) Reparar de inmediato.");
                        System.out.println("2) Colocar una alarma de seda.");
                        int d5 = leer(sc, 1, 2);
                        if (d5 == 1) {
                            System.out.println("\nFinal: Evitas una invasión de hormigas. Red impecable.");
                        } else {
                            System.out.println("\nFinal: La alarma te avisa de un depredador a tiempo. Te salvas por segundos.");
                        }
                    }
                }
            }
        } else {
            // Rama 2: Luces
            System.out.println("\nSigues las luces: luciérnagas entre ramas.");
            System.out.println("Decisión 2:");
            System.out.println("1) Instalarte en un tronco hueco.");
            System.out.println("2) Ir hacia un arroyo cercano.");
            int d2 = leer(sc, 1, 2);

            if (d2 == 1) {
                // 2 -> 1 -> tronco
                System.out.println("\nEl tronco es oscuro y seguro, pero hay poca comida.");
                System.out.println("Decisión 3:");
                System.out.println("1) Salir a cazar.");
                System.out.println("2) Red de embudo en la entrada.");
                int d3 = leer(sc, 1, 2);

                if (d3 == 1) {
                    // 2-1-1
                    System.out.println("\nSubes a ramas altas, hay un enjambre a lo lejos.");
                    System.out.println("Decisión 4:");
                    System.out.println("1) Montar red al paso del enjambre.");
                    System.out.println("2) Emboscar desde hojas.");
                    int d4 = leer(sc, 1, 2);

                    if (d4 == 1) {
                        // 2-1-1-1
                        System.out.println("\nEl enjambre se acerca.");
                        System.out.println("Decisión 5:");
                        System.out.println("1) Tensar la red para rapidez.");
                        System.out.println("2) Aflojar para elasticidad.");
                        int d5 = leer(sc, 1, 2);
                        if (d5 == 1) {
                            System.out.println("\nFinal: Capturas varios rezagados. Eficiencia máxima.");
                        } else {
                            System.out.println("\nFinal: La elasticidad absorbe impactos; rara vez fallas.");
                        }
                    } else {
                        // 2-1-1-2
                        System.out.println("\nDesde las hojas observas rutas de vuelo.");
                        System.out.println("Decisión 5:");
                        System.out.println("1) Lanzarte al primero que pase.");
                        System.out.println("2) Esperar por una presa mayor.");
                        int d5 = leer(sc, 1, 2);
                        if (d5 == 1) {
                            System.out.println("\nFinal: Cazas una buena presa, pero pierdes camuflaje.");
                        } else {
                            System.out.println("\nFinal: La espera rinde: capturas un insecto grande. Riesgo controlado.");
                        }
                    }
                } else {
                    // 2-1-2
                    System.out.println("\nEl embudo vibra con cada paso.");
                    System.out.println("Decisión 4:");
                    System.out.println("1) Quedarte al acecho.");
                    System.out.println("2) Tender líneas trampa adicionales.");
                    int d4 = leer(sc, 1, 2);

                    if (d4 == 1) {
                        // 2-1-2-1
                        System.out.println("\nSe acerca algo pesado.");
                        System.out.println("Decisión 5:");
                        System.out.println("1) Atacar directo.");
                        System.out.println("2) Retraer el embudo.");
                        int d5 = leer(sc, 1, 2);
                        if (d5 == 1) {
                            System.out.println("\nFinal: Capturas pero sufres un desgarro. Aprendizaje valioso.");
                        } else {
                            System.out.println("\nFinal: Queda atrapado como por arte de magia. Estrategia perfecta.");
                        }
                    } else {
                        // 2-1-2-2
                        System.out.println("\nAjustas líneas trampa transversales.");
                        System.out.println("Decisión 5:");
                        System.out.println("1) Más tensas para velocidad.");
                        System.out.println("2) Más elásticas para absorción.");
                        int d5 = leer(sc, 1, 2);
                        if (d5 == 1) {
                            System.out.println("\nFinal: Respuestas rápidas. Buen control del territorio.");
                        } else {
                            System.out.println("\nFinal: Estabilidad admirable; fallas muy poco.");
                        }
                    }
                }
            } else {
                // 2 -> 2 -> arroyo
                System.out.println("\nEl arroyo trae niebla e insectos diminutos.");
                System.out.println("Decisión 3:");
                System.out.println("1) Tejer una orbe grande.");
                System.out.println("2) Tejer varias redes pequeñas conectadas.");
                int d3 = leer(sc, 1, 2);

                if (d3 == 1) {
                    // 2-2-1
                    System.out.println("\nLa orbe grande es sensible al viento.");
                    System.out.println("Decisión 4:");
                    System.out.println("1) Añadir más radios.");
                    System.out.println("2) Buscar sombra para reducir viento.");
                    int d4 = leer(sc, 1, 2);

                    if (d4 == 1) {
                        // 2-2-1-1
                        System.out.println("\nLos radios reparten la fuerza del viento.");
                        System.out.println("Decisión 5:");
                        System.out.println("1) Tercer punto de anclaje.");
                        System.out.println("2) Contrapesos de rocío.");
                        int d5 = leer(sc, 1, 2);
                        if (d5 == 1) {
                            System.out.println("\nFinal: Red fortificada. Imbatible contra el viento.");
                        } else {
                            System.out.println("\nFinal: Menos torsión y capturas constantes.");
                        }
                    } else {
                        // 2-2-1-2
                        System.out.println("\nA la sombra hay menos viento pero menos luz.");
                        System.out.println("Decisión 5:");
                        System.out.println("1) Abrir claros cercanos.");
                        System.out.println("2) Estrechar la malla.");
                        int d5 = leer(sc, 1, 2);
                        if (d5 == 1) {
                            System.out.println("\nFinal: Más luz, más tráfico de presas. Vida en auge.");
                        } else {
                            System.out.println("\nFinal: Nada pequeño escapa. Precisión quirúrgica.");
                        }
                    }
                } else {
                    // 2-2-2
                    System.out.println("\nVarias redes pequeñas se complementan entre sí.");
                    System.out.println("Decisión 4:");
                    System.out.println("1) Sincronizar vibraciones.");
                    System.out.println("2) Camuflar con hojas.");
                    int d4 = leer(sc, 1, 2);

                    if (d4 == 1) {
                        // 2-2-2-1
                        System.out.println("\nLa red se vuelve un sensor.");
                        System.out.println("Decisión 5:");
                        System.out.println("1) Colocar un hilo director.");
                        System.out.println("2) Crear un nido central.");
                        int d5 = leer(sc, 1, 2);
                        if (d5 == 1) {
                            System.out.println("\nFinal: Te anticipas a todo. Maestría sensorial.");
                        } else {
                            System.out.println("\nFinal: Refugio instantáneo. Seguridad y descanso.");
                        }
                    } else {
                        // 2-2-2-2
                        System.out.println("\nTe camuflas entre hojas y casi desapareces.");
                        System.out.println("Decisión 5:");
                        System.out.println("1) Ampliar el camuflaje.");
                        System.out.println("2) Reforzar uniones.");
                        int d5 = leer(sc, 1, 2);
                        if (d5 == 1) {
                            System.out.println("\nFinal: Acechas invisible. Las presas no comprenden qué ocurre.");
                        } else {
                            System.out.println("\nFinal: Uniones casi irrompibles. Durabilidad superior.");
                        }
                    }
                }
            }
        }

        System.out.println("\nGracias por jugar.");
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