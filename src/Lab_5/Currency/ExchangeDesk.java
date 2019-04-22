package Lab_5.Currency;

import java.lang.reflect.InvocationTargetException;

public class ExchangeDesk {
    private float[][] exchangeRate = new float[5][5];

    public <T extends Currency, V extends Currency> V convert(T convertFrom, Class<V> convertTo) {
        V toReturn = null;
        try {
            toReturn = convertTo.getDeclaredConstructor(Float.TYPE).newInstance(0);
            toReturn = convertTo.getDeclaredConstructor(Float.TYPE).newInstance(convertFrom.getAmount() * exchangeRate[convertFrom.getCode()][toReturn.getCode()]);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return toReturn;
    }

    public <T extends Currency, V extends Currency> void addRate(T convertFrom, V convertTo, float rate){
        exchangeRate[convertFrom.getCode()][convertTo.getCode()] = rate;
        exchangeRate[convertTo.getCode()][convertFrom.getCode()] = 1.0f/rate;
    }
}
