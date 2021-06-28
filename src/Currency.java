import java.util.ArrayList;
import java.util.List;

public class Currency {
    private String name;
    private double value;
    public Currency[] DefaultCurrencyList = CreateCurrencyListWithDefaultCources();

    public Currency(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String GetName(){
        return this.name;
    }

    private Currency[] CreateCurrencyListWithDefaultCources(){
        Currency USD = new Currency("USD", 1);
        Currency EUR = new Currency("EUR", 0.8384);
        Currency GBP = new Currency("GBP", 0.7195);
        Currency[] CurrencyList = {USD, EUR, GBP};
        return CurrencyList;
    }


}
