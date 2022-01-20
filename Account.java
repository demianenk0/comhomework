package com.itea.roman.lection8;

public class Account {
    private String FirstName;
    private String LastName;
    private String bank;
    private String bankAccount;
    private Operations operations;
    public Account(String FirstName, String LastName, String bank) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.bank = bank;
    }

    private class Operations {

        private String cashWithdrawal;
        private String payments;
        private String income;

        public void setCashWithdrawal(String cashWithdrawal) {
            this.cashWithdrawal = cashWithdrawal;
        }

        public void setPayments(String payments) {
            this.payments = payments;
        }

        public void setIncome(String income) {
            this.income = income;
        }
    }
}

