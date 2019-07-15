package pl.sda;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;
import pl.sda.model.Rates;
import pl.sda.model.Currency;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Scanner;

public class CurrencyExchange {

    private String url;
    private String finalUrl;
    private String data;
    private Currency currency;
    private String base;


    public CurrencyExchange(String url) {
        this.url = url;
    }

    public String getJSONData(String base) {
        this.finalUrl = this.url + "?base=" + base;

        data = "";

        try {
            data = IOUtils.toString(new URL(finalUrl), Charset.forName("UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }







}
