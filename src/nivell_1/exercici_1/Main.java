package nivell_1.exercici_1;

import nivell_1.exercici_1.exceptions.EmptySaleException;
import nivell_1.exercici_1.model.Producte;
import nivell_1.exercici_1.model.Venda;

public class Main {
    public static void main(String[] args) {

        Producte producte_1 = new Producte("Producte_1", 10.0);
        Producte producte_2 = new Producte("Producte_2", 20.0);
        Producte producte_3 = new Producte("Producte_3", 30.0);

        System.out.println("Venda on SI s'afegeixen productes a la llista.");
        Venda venda_1 = new Venda();
        venda_1.afegirProductes(producte_1);
        venda_1.afegirProductes(producte_2);
        venda_1.afegirProductes(producte_3);

        try {
            venda_1.calcularTotal();
        }catch (EmptySaleException e){
            System.out.println(e.getMessage());
        }

        if(venda_1.getPreuTotalVenda() > 0){
            System.out.println("Preu total de la venda_1: "+ venda_1.getPreuTotalVenda());
        }

        System.out.println("\nVenda on NO s'afegeixen productes a la llista y es demana calcular el preu total.");

        Venda venda_2 = new Venda();

        try {
            venda_2.calcularTotal();
        }catch (EmptySaleException e){
            System.out.println(e.getMessage());
        }

        if(venda_2.getPreuTotalVenda() > 0){
            System.out.println("Preu total de la venda_1: "+ venda_2.getPreuTotalVenda());
        }

        System.out.println("\nMostrar llista de productes i el seu preu. El valor d'ítems a mostrar(3) es troba dins de rang.");
        venda_1.mostrarLlista(3);
        System.out.println("\nMostrar llista de productes i el seu preu. El valor d'ítems a mostrar(4) es troba fora de rang.");
        venda_1.mostrarLlista(4);

        System.out.println("Final del programa.");
    }
}