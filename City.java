package com.itea.roman.lection8;

public class City {
    private String country;
    private String city;
    private CityDetail cityDetail;

    private class CityDetail {

        private String street;
        private String avenue;
        private String square;

        public void setStreet(String street) {
            this.street = street;
        }
        public void setAvenue(String avenue) {
            this.avenue = avenue;
        }
        public void setSquare(String square) {
            this.square = square;
        }
    }
}

