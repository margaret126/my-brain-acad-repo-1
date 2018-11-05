package ua.zp.bracad.bratchvv.lab6;


import ua.zp.bracad.bratchvv.lab6.api.CurrencyBoard;
import ua.zp.bracad.bratchvv.lab6.api.CurrencyConvertor;

import static ua.zp.bracad.bratchvv.lab6.NBU.UAH_TO_USD_OFFICIAL;
import static ua.zp.bracad.bratchvv.lab6.NBU.USD_TO_UAH_OFFICIAL;

public class Demos implements CurrencyConvertor, CurrencyBoard {

    public static double USD_CURRENCY_RATIO = 1.1;
    // TODO for EUR (RATIO = 1.2)

    @Override
    public double convertUAHToUSD(double value) {
        return value / UAH_TO_USD_OFFICIAL * USD_CURRENCY_RATIO;
    }

    @Override
    public double convertUSDtoUAH(double value) {
        return value * USD_TO_UAH_OFFICIAL / USD_CURRENCY_RATIO;
    }

    @Override
    public double convertUAHToEUR(double value) {
        return 0; // TODO
    }

    @Override
    public double convertEURtoUAH(double value) {
        return 0;  // TODO
    }

    @Override
    public void displayUSD() {
    }

    @Override
    public void displayEUR() {
    }
}