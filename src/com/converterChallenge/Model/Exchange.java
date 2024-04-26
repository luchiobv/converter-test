package com.converterChallenge.Model;

import com.google.gson.annotations.SerializedName;

public class Exchange {
   @SerializedName("base_code")
    private String baseCurrency;
   @SerializedName("target_code")
    private String targetCurrency;
   @SerializedName("conversion_rate")
    private double rate;
   @SerializedName("conversion_result")
    private double moneyExchange;

   private String base_code;
   private String target_code;
   private String conversion_rate;
   private String conversion_result;






    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public String getTargetCurrency() {
        return targetCurrency;
    }

    public void setTargetCurrency(String targetCurrency) {
        this.targetCurrency = targetCurrency;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getMoneyExchange() {
        return moneyExchange;
    }

    public void setMoneyExchange(double moneyExchange) {
        this.moneyExchange = moneyExchange;
    }

    @Override
    public String toString() {
        return "Exchange{" +
                "Moneda Base='" + baseCurrency + '\'' +
                ", Moneda de Cambio='" + targetCurrency + '\'' +
                ", Rate=" + rate +
                ", Valor final=" + moneyExchange +
                '}';
    }
}
