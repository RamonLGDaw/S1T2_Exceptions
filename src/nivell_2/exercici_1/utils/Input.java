package nivell_2.exercici_1.utils;

import nivell_2.exercici_1.exceptions.CustomizedException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Input {

    static Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    public static byte readByte(String message) {

        while (true) {
            try {
                System.out.println(message);
                return sc.nextByte();

            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Error de format.");
            }
        }
    }


    public static int readInt(String message) {
        while (true) {
            try {
                System.out.println(message);
                return sc.nextInt();

            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Error de format.");
            }
        }
    }


    public static float readFloat(String message) {
        while (true) {
            try {
                System.out.println(message);
                return sc.nextFloat();

            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Error de format.");

            }
        }
    }


    public static double readDouble(String message) {
        while (true) {
            try {
                System.out.println(message);
                return sc.nextDouble();

            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Error de format.");

            }
        }
    }


    public static char readChar(String message) throws CustomizedException {
        while (true) {
            try {
                System.out.println(message);
                String input = sc.nextLine();

                if (input.length() == 1) {
                    return input.charAt(0);

                } else {
                    throw new CustomizedException("Error de format. Entra només un caràcter.");
                }
            } catch (CustomizedException e) {
                System.out.println(e.getMessage());
            }
        }
    }


    public static String readString(String message) throws CustomizedException {

        while (true) {
            try {
                System.out.println(message);
                String inputValue = sc.nextLine();
                inputValue = inputValue.trim();

                if (inputValue.length() > 0) {
                    return inputValue;
                } else {
                    throw new CustomizedException("Entra un text.");
                }

            } catch (CustomizedException e) {
                System.out.println(e.getMessage());
            }
        }
    }


    public static boolean readYesNo(String message) throws CustomizedException {
        while (true) {
            try {
                System.out.println(message);
                String inputValue = sc.nextLine();
                inputValue = inputValue.trim();

                if (inputValue.length() == 1) {
                    if (inputValue.equalsIgnoreCase("s")) {
                        return true;
                    } else if (inputValue.equalsIgnoreCase("n")) {
                        return false;
                    } else {
                        throw new CustomizedException("Error de format. Entra \"s\" o \"n\"");
                    }

                } else {
                    throw new CustomizedException("Error de format. Entra \"s\" o \"n\"");
                }

            } catch (CustomizedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}