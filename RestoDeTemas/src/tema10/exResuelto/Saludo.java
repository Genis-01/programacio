package tema10.exResuelto;

import java.util.ArrayList;
import java.util.List;

public interface Saludo<T>  {
    String saludar(T e);

    static List<String> saludoGrupo(Cliente[] aSaludar){
        List<String> list = new ArrayList<String>();
        Saludo<Cliente> saludoCliente = c -> "buenos dias " + c.nombre;
        for (Cliente cliente : aSaludar) {
            
            list.add(saludoCliente.saludar(cliente));

        }
        return list;
    }
}
