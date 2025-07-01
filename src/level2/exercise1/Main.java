package level2.exercise1;

import level2.exercise1.exceptions.CustomizedException;
import level2.exercise1.utils.Input;

public class Main {
    public static void main(String[] args){

        System.out.println("Valor introduït: " + Input.readByte("Introdueix la teva edad: "));
        System.out.println("Valor introduït: " + Input.readInt("Entra un valor enter entre -2147483648 i 2147483647: "));
        System.out.println("Valor introduït: " + Input.readFloat("Entra un valor de tipus Float: "));
        System.out.println("Valor introduït: " + Input.readDouble("Entra un valor de tipus Double: "));
        System.out.println("Valor introduït: " + Input.readChar("Entra un caràcter: "));
        System.out.println("Valor introduït: " + Input.readString("Entra un text: "));
        System.out.println("Valor introduït: " + Input.readYesNo("Introdueix \"s\" per True o \"n\" per False:"));
    }
}
