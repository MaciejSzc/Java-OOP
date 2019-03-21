package cantor;

public class ExchangeOffice{

private Currency currency;

    public ExchangeOffice(Currency currency) {
        this.currency = currency;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    void showFunds(){
        System.out.println(currency.getSum());
    }

    void exchange(double amount, Currency from, Currency to){

    }


}
