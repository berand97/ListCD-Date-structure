import unac.edu.co.poo2.Lista;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random r;
        int d;
        int k;
        final int Mx = 999;
        Lista list;

        r = new Random(1);
        list = new Lista
                ();
        k = 29;
        for (; k > 0; k--) {
            d = r.nextInt(Mx) + 1;

            list.ordenamiento(d);
        }

        // recorre la lista para escribir sus elementos
        System.out.println("Elementos de la lista generados al azar");
        list.visualizar();
        System.out.println("");

        System.out.println("Elementos de la lista eliminados");
        list.Eliminar(106);
        list.visualizar();

    }

}
