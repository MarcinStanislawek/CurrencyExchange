package pl.sda;


import pl.sda.controller.Controller;

public class App
{
    public static void main( String[] args )
    {
        Controller controller = new Controller();

        System.out.println("\nWrite a code of currency which you want to exchange: ");
        controller.chooseBase();

        System.out.println("\nWrite a code of currency you want to get: ");
        controller.chooseFinalCurrency();

        System.out.println(controller.getBase());
        System.out.println(controller.getFinalCurrency());

        System.out.println("\nWrite an amount of currency you want to exchange: ");
        controller.giveAmountOfCurrency();



        System.out.println(controller.getResult());
    }
}
