package pl.sda;



public class App
{
    public static void main( String[] args )
    {
        Reader reader = new Reader("https://api.exchangeratesapi.io/latest", "PLN");

        reader.getJSONData();
        System.out.println(reader.getJSONData());
        reader.getData();
        System.out.println(reader.getData());


    }
}
