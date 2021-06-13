package com.tippy;

public class FinanceReport implements Report{
    @Override
    public void load() {
        System.out.println("FinanceReport load");
    }

    @Override
    public void print() {
        System.out.println("FinanceReport print");
    }
}
