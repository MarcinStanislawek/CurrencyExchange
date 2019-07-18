package pl.sda;


import lombok.Data;

import java.util.Scanner;

@Data
public class Controller {

    private Scanner scanner = new Scanner(System.in);
    private float amountOfCurrency;
    private float result;
    private String base;

    public String chooseBase(){
        setBase(scanner.nextLine().toUpperCase());
        //todo error
        return getBase();
    }

    public float giveAmountOfCurrency() {
        setAmountOfCurrency(scanner.nextFloat());
        //todo error
        return getAmountOfCurrency();
    }

    //todo update this class
    public float calculateResult() {
        Reader reader = new Reader("https://api.exchangeratesapi.io/latest", getBase());
        float output =  reader.getData().getRates().getBRL();
        System.out.println(output);
        result = output * amountOfCurrency;
        return result;
    }
}
