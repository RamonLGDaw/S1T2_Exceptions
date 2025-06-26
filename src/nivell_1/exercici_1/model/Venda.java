package nivell_1.exercici_1.model;

import nivell_1.exercici_1.exceptions.EmptySaleException;

import java.util.ArrayList;

public class Venda {

    private double preuTotalVenda;
    private ArrayList<Producte> llistaProductes = new ArrayList<>();

    public Venda() {

    }

    public void calcularTotal() throws EmptySaleException {
        double sumaPreuProductes = 0;

        if (!llistaProductes.isEmpty()) {
            for(Producte producte: llistaProductes){

                sumaPreuProductes += producte.getPreu();
            }
            this.setPreuTotalVenda(sumaPreuProductes);
        } else {
            throw new EmptySaleException("Per fer una venda primer has d’afegir productes.");
        }
    }


    public double getPreuTotalVenda() {
        return preuTotalVenda;
    }

    public void setPreuTotalVenda(double preuTotalVenda) {
        this.preuTotalVenda = preuTotalVenda;
    }

    public void mostrarLlista(int nombreItemsPerMostrar){
        try{
            for (int i = 0; i < nombreItemsPerMostrar; i++){
                System.out.println((i+1)+".- nom del producte: " + llistaProductes.get(i).getNom()+ ", Preu del producte: " + llistaProductes.get(i).getNom());
            }
        } catch (IndexOutOfBoundsException e){
            System.out.println("Error: "+e.getMessage());
        }


    }

    public void afegirProductes(Producte nouProducte){
        this.llistaProductes.add(nouProducte);
    }


}
