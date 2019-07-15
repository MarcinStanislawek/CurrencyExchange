package pl.sda;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {

        CurrencyExchange currencyExchange = new CurrencyExchange("https://api.exchangeratesapi.io/latest");

        System.out.println(currencyExchange.getJSONData("PLN"));





    }
}
