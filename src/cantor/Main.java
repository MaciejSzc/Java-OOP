package cantor;

public class Main {
    public static void main(String[] args) {
        Currency currency = new Currency(1000);
       // CurrencyExchange currencyExchange = new CurrencyExchange();
        ExchangeOffice exchangeOffice = new ExchangeOffice(currency);
        CurrencyExchange.currencyEx();


    }
}
