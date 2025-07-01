package level1.exercise1;

import level1.exercise1.exceptions.EmptySaleException;
import level1.exercise1.model.Product;
import level1.exercise1.model.Sale;

public class Main {
    public static void main(String[] args) {

        Product product_1 = new Product("Producte_1", 10.0);
        Product product_2 = new Product("Producte_2", 20.0);
        Product product_3 = new Product("Producte_3", 30.0);

        System.out.println("Venda on SI s'afegeixen productes a la llista.");
        Sale sale_1 = new Sale();
        sale_1.addProducts(product_1);
        sale_1.addProducts(product_2);
        sale_1.addProducts(product_3);

        try {
            sale_1.calculateTotal();
        }catch (EmptySaleException e){
            System.out.println(e.getMessage());
        }

        if(sale_1.getTotalSalePrice() > 0){
            System.out.println("Preu total de la venda_1: "+ sale_1.getTotalSalePrice());
        }

        System.out.println("\nVenda on NO s'afegeixen productes a la llista y es demana calcular el preu total.");

        Sale sale_2 = new Sale();

        try {
            sale_2.calculateTotal();
        }catch (EmptySaleException e){
            System.out.println(e.getMessage());
        }

        if(sale_2.getTotalSalePrice() > 0){
            System.out.println("Preu total de la venda_1: "+ sale_2.getTotalSalePrice());
        }

        System.out.println("\nMostrar llista de productes i el seu preu. El valor d'ítems a mostrar(3) es troba dins de rang.");
        sale_1.showProductsList(3);
        System.out.println("\nMostrar llista de productes i el seu preu. El valor d'ítems a mostrar(4) es troba fora de rang.");
        sale_1.showProductsList(4);

        System.out.println("\nFinal del programa.");
    }
}