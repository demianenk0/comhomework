package com.itea.roman.lection8;

public class BlueRayDisc {
    private BlueRay blueRay;

    private class BlueRay {

        private String catalog;
        private String subcatalog;

        public void setCatalog(String catalog) {
            this.catalog = catalog;
        }

        public void setAccumCapacity(String subcatalog) {
            this.subcatalog = subcatalog;
        }
    }
}
