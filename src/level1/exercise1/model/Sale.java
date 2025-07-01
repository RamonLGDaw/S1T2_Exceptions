package level1.exercise1.model;

import level1.exercise1.exceptions.EmptySaleException;

import java.util.ArrayList;

public class Sale {

    private double totalSalePrice;
    private ArrayList<Product> productsList = new ArrayList<>();

    public Sale() {

    }

    public void calculateTotal() throws EmptySaleException {
        double sumProductsPrice = 0;

        if (!productsList.isEmpty()) {
            for(Product product: productsList){

                sumProductsPrice += product.getPrice();
            }
            this.setTotalSalePrice(sumProductsPrice);
        } else {
            throw new EmptySaleException("Per fer una venda primer has d’afegir productes.");
        }
    }


    public double getTotalSalePrice() {
        return totalSalePrice;
    }

    public void setTotalSalePrice(double totalSalePrice) {
        this.totalSalePrice = totalSalePrice;
    }

    public void showProductsList(int numItemsToShow){
        try{
            for (int i = 0; i < numItemsToShow; i++){
                System.out.println((i+1)+".- nom del producte: " + productsList.get(i).getName()+ ", Preu del producte: "
                        + productsList.get(i).getName());
            }
        } catch (IndexOutOfBoundsException e){
            System.out.println("Error: "+e.getMessage());
        }
    }

    public void addProducts(Product newProduct){
        this.productsList.add(newProduct);
    }

}
