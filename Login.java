package com.itea.roman.lection7;
import java.util.Scanner;

public class Login {
    private static Object Login;

    public static void main(String[] args) {
        User Login1 = new User("login1", "password1");
        User Login2 = new User("login2", "password2");
        User Login3 = new User("login3", "password3");
        Scanner input = new Scanner(System.in);
        String Username;
        String Pass;
        String Login = Login1.getLogin();
        String Password = Login1.getPassword();
        System.out.println("Введите имя пользователя: ");
        Username = input.nextLine();
        System.out.println("Введите пароль: ");
        Pass = input.nextLine();
        if(Username.equals(Login) && Pass.equals(Password)){
            System.out.println("Имя пользователя и пароль совпадают");
        } else {
            System.out.println("Имя пользователя или пароль не совпадают");
        }
    }
}

class User{
    private String Login;
    private String Password;

    public User(String Login, String Password) {
        this.Login = Login;
        this.Password = Password;
    }

    public void Login(String Login, String Password) {
        this.Login = Login;
        this.Password = Password;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
}


