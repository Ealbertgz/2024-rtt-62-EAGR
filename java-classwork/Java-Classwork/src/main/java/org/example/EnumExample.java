package org.example;

public class EnumExample {
            enum Cars {
            BMW,
            JEEP,
            AUDI,
            VOLKSWAGEN,
            NANO,
            FIAT;
        }
    public static void main(String[] args) {
        // Declaring Enum variable
        Cars c;
        c = Cars.AUDI;
        //Switch keyword
        switch (c) {
            // Case statements
            case BMW:
                System.out.println("You choose BMW!");
            break;
            case JEEP:
                System.out.println("You choose JEEP!");
            break;
            case AUDI:
                System.out.println("You choose AUDI!");
            break;
            case VOLKSWAGEN:
                System.out.println("You choose VOLKSWAGEN!");
            break;
            case FIAT:
                System.out.println("You choose FIAT!");
            break;
            default:
                System.out.println("NEW BRAND'S CAR");
                break;
        }

    }
}
