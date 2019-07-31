package pl.sda.controller;


import lombok.Data;
import pl.sda.Reader;
import pl.sda.model.Rates;
import java.util.*;

@Data
public class Controller {

    private Scanner scanner = new Scanner(System.in);
    private float amountOfCurrency;
    private float result;
    private String base;
    private String finalCurrency;

    public String chooseBase() {
        setBase(scanner.nextLine().toUpperCase());
        //todo error
        return getBase();
    }

    public String chooseFinalCurrency() {
        setFinalCurrency(scanner.nextLine().toUpperCase());
        return getFinalCurrency();
    }

    public float giveAmountOfCurrency() {
        setAmountOfCurrency(scanner.nextFloat());
        //todo error
        return getAmountOfCurrency();
    }

    public float getResult() {

        Reader reader = new Reader("https://api.exchangeratesapi.io/latest", getBase());

        switch (getFinalCurrency()) {
            case "CAD":
                result = getAmountOfCurrency() * reader.getData().getRates().getCAD();
                return result;
            case "HKD":
                result = getAmountOfCurrency() * reader.getData().getRates().getHKD();
                return result;
            case "ISK":
                result = getAmountOfCurrency() * reader.getData().getRates().getISK();
                return result;
            case "PHP":
                result = getAmountOfCurrency() * reader.getData().getRates().getPHP();
                return result;
            case "DKK":
                result = getAmountOfCurrency() * reader.getData().getRates().getDKK();
                return result;
            case "HUF":
                result = getAmountOfCurrency() * reader.getData().getRates().getHUF();
                return result;
            case "CZK":
                result = getAmountOfCurrency() * reader.getData().getRates().getCZK();
                return result;
            case "GBP":
                result = getAmountOfCurrency() * reader.getData().getRates().getGBP();
                return result;
            case "RON":
                result = getAmountOfCurrency() * reader.getData().getRates().getRON();
                return result;
            case "SEK":
                result = getAmountOfCurrency() * reader.getData().getRates().getSEK();
                return result;
            case "IDR":
                result = getAmountOfCurrency() * reader.getData().getRates().getIDR();
                return result;
            case "INR":
                result = getAmountOfCurrency() * reader.getData().getRates().getINR();
                return result;
            case "BRL":
                result = getAmountOfCurrency() * reader.getData().getRates().getBRL();
                return result;
            case "RUB":
                result = getAmountOfCurrency() * reader.getData().getRates().getRUB();
                return result;
            case "HRK":
                result = getAmountOfCurrency() * reader.getData().getRates().getHRK();
                return result;
            case "JPY":
                result = getAmountOfCurrency() * reader.getData().getRates().getJPY();
                return result;
            case "THB":
                result = getAmountOfCurrency() * reader.getData().getRates().getTHB();
                return result;
            case "CHF":
                result = getAmountOfCurrency() * reader.getData().getRates().getCHF();
                return result;
            case "EUR":
                result = getAmountOfCurrency() * reader.getData().getRates().getEUR();
                return result;
            case "MYR":
                result = getAmountOfCurrency() * reader.getData().getRates().getMYR();
                return result;
            case "BGN":
                result = getAmountOfCurrency() * reader.getData().getRates().getBGN();
                return result;
            case "TRY":
                result = getAmountOfCurrency() * reader.getData().getRates().getTRY();
                return result;
            case "CNY":
                result = getAmountOfCurrency() * reader.getData().getRates().getCNY();
                return result;
            case "NOK":
                result = getAmountOfCurrency() * reader.getData().getRates().getNOK();
                return result;
            case "NZD":
                result = getAmountOfCurrency() * reader.getData().getRates().getNZD();
                return result;
            case "ZAR":
                result = getAmountOfCurrency() * reader.getData().getRates().getZAR();
                return result;
            case "USD":
                result = getAmountOfCurrency() * reader.getData().getRates().getUSD();
                return result;
            case "MXN":
                result = getAmountOfCurrency() * reader.getData().getRates().getMXN();
                return result;
            case "SGD":
                result = getAmountOfCurrency() * reader.getData().getRates().getSGD();
                return result;
            case "AUD":
                result = getAmountOfCurrency() * reader.getData().getRates().getAUD();
                return result;
            case "ILS":
                result = getAmountOfCurrency() * reader.getData().getRates().getILS();
                return result;
            case "KRW":
                result = getAmountOfCurrency() * reader.getData().getRates().getKRW();
                return result;
            case "PLN":
                result = getAmountOfCurrency() * reader.getData().getRates().getPLN();
                return result;
            default:
                break;

        }

        return 0;
    }


}
