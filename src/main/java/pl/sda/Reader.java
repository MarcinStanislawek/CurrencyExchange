package pl.sda;


import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.NoArgsConstructor;
import org.apache.commons.io.IOUtils;
import pl.sda.model.Currency;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;

@NoArgsConstructor
public class Reader {

    private String url;
    private String finalUrl;
    private String data;
    private String base;

    public Reader(String url, String base) {
        this.url = url;
        this.base = base;
        this.finalUrl = url + "?base=" + base;
    }

    public String getJSONData() {
        data = "";

        try {
            data = IOUtils.toString(new URL(finalUrl), Charset.forName("UTF-8")).toLowerCase();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public Currency getData() {
        ObjectMapper objectMapper = new ObjectMapper();
        Currency currency = null;

        try {
            currency = objectMapper.readValue(getJSONData(), Currency.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return currency;
    }









}
