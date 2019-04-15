package Lab_5;

public class Main {
    public static void main(String[] args) {
        RON ron = new RON(5);
        ExchangeDesk exchangeDesk = new ExchangeDesk();
        USD usd = new USD(1);
        exchangeDesk.addRate(usd, ron, 4.1f);
        System.out.println("Exchange result : " + exchangeDesk.convert(ron, USD.class).getAmount());
        System.out.println("Exchange result : " + exchangeDesk.convert(usd, RON.class).getAmount());
    }
}
