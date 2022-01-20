package com.itea.roman.lection8;

public class Europe {
    private NewCountries newCountries;

    private class NewCountries {

        private String newCountryName;
        private double newCountrySquare;

        public void setNewCountryName(String newCountryName) {
            this.newCountryName = newCountryName;
        }

        public void setNewCountrySquare(double newCountrySquare) {
            this.newCountrySquare = newCountrySquare;
        }
    }
}

