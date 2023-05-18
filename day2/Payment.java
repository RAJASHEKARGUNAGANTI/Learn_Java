package com.company.Learn_Java.day2;

interface PaymentUI1 {
    void netBanking ();
    void cashOnDelivary();
    void debitCard();
    void creditCard();
}
interface PaymentUI2 extends PaymentUI1 {
    void amazonPay();
    void upi();
}

class PayUI implements PaymentUI1{
    @Override
    public void netBanking() {

    }

    @Override
    public void cashOnDelivary() {

    }

    @Override
    public void debitCard() {

    }

    @Override
    public void creditCard() {

    }

}
class PayUI2 extends PayUI implements PaymentUI2{

    @Override
    public void amazonPay() {

    }

    @Override
    public void upi() {

    }
}
