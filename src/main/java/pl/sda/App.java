package pl.sda;



public class App
{
    public static void main( String[] args )
    {
        Controller controller = new Controller();

        System.out.println("\n Write a code of currency which you want to exchange: ");
        String base = controller.chooseBase();

        Reader reader = new Reader("https://api.exchangeratesapi.io/latest", base);
        reader.getData();

        System.out.println("Write an amount of currency you want to exchange: ");
        controller.giveAmountOfCurrency();

        System.out.println("PLN = " + controller.calculateResult());






    }
}
