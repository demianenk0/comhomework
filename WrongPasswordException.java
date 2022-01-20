package com.itea.roman.lection10;

    public class WrongPasswordException extends Exception {
        private String detail;

        public WrongPasswordException() {
            detail = "Incorrect password";
        }

        public WrongPasswordException(String message) {
            super(message);
            detail = message;
        }


        public String toString() {
            return "WrongPasswordException: " + detail;
        }
    }

