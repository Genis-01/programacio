package tema8.agenda;

import java.util.Arrays;

import herramientas.Ficheros;

public class Agenda {

    Contacto agenda[] = new Contacto[20];

    public Agenda() {
        for (int i = 0; i <= 20; i++) {
            
            try {
                String nombreYNumero = Ficheros.leerLinea("RestoDeTemas\\src\\tema8\\agenda\\agenda.txt", i + 1);

                if (nombreYNumero != null) {
                    
                    try {
                        String x[] = nombreYNumero.split("-");
                        agenda[i] = new Contacto(x[0], x[1]);
                    } catch (Exception e) {
                    }
                }
            } catch (Exception e) {
                System.out.println( e.getMessage());
            }
            
        }
        
    }

    public void nuevoContacto(String nombre, String numero) {

        
        int i = 0;
        boolean lleno = false;
        boolean encontrado = false;
        Contacto contacto = new Contacto(nombre, numero);

        for (Contacto c : agenda) {
            
            if (c != null) {
                if (c.nombre.equals(nombre)) {
                    System.out.println("el contacto ya existe");
                    encontrado = true;
                }
            }
        }
        if (!encontrado) {
            for (Contacto c : agenda) {
    
                if (c == null) {
                    agenda[i] = contacto;
                    lleno = true;
                    break;
                }
                i++;
            }
            if (!lleno) {
                System.out.println("agenda llena");
            }
        }
    }

    public void salir(){
        String contenido = "";

        for (Contacto c : agenda) {

            if (c != null) {
                contenido += c.nombre + "-" + c.numero + "\n";
            }
        }

        Ficheros.escribir("RestoDeTemas\\src\\tema8\\agenda\\agenda.txt", contenido);
        System.exit(0);
    }

    @Override
    public String toString() {
        String contenido = "";
        String contactos[] = new String[20];
        int i = 0;

        for (Contacto c : agenda) {
            if (c != null) {
                contactos[i] = c.toString();
            }
            i++;
        }

        try {
            Arrays.sort(contactos);
        } catch (Exception e) {
        }

        for (String c : contactos) {

            if (c != null) {
                contenido += c;
            }
            i++;
        }

        return contenido;
    }

    
}
