package com.itea.roman.lection8;

public class Mobile {
    private String brand;
    private String model;
    private ModelProperties modelProperties;

    private class ModelProperties {

        private String model;
        private long accumCapacity;
        private double screenSize;

        public void setModel(String model) {
            this.model = model;
        }

        public void setAccumCapacity(long accumCapacity) {
            this.accumCapacity = accumCapacity;
        }

        public void setScreenSize(double screenSize) {
            this.screenSize = screenSize;
        }
    }
}

