package level2.exercise1.utils;

import level2.exercise1.exceptions.CustomizedException;

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
                int result = sc.nextInt();
                sc.nextLine();
                return result;

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
                float result = sc.nextFloat();
                sc.nextLine();
                return result;

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
                double inputValue = sc.nextDouble();
                sc.nextLine();
                return inputValue;

            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Error de format.");

            }
        }
    }


    public static char readChar(String message) {

        while (true) {
            try {
                System.out.println(message);
                String inputValue = sc.nextLine();
                inputValue = inputValue.trim();

                if (inputValue.length() == 1) {
                    return inputValue.charAt(0);

                } else {
                    throw new CustomizedException("Error de format. Entra només un caràcter.");
                }
            } catch (CustomizedException e) {
                System.out.println(e.getMessage());
            }
        }
    }


    public static String readString(String message) {

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


    public static boolean readYesNo(String message) {
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