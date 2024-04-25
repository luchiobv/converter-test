package com.converterChallenge.Menu;

import java.util.Scanner;

public class Menu {


    Scanner sc = new Scanner(System.in);
    public int option = 0;
    public String money = "";
    public String menu = (""" 
             ****************
             Seleccione una opcion: 
             1. USD Dolar »» ARS Argentine Peso
             2. ARS Argentine Peso »» USD Dolar
             3. USD Dolar  »»  BRL Brazilian Real
             4. BRL Brazilian Real »» USD Dolar
             5. USD Dolar  »»  COP Colombian peso
             6. COP Colombian peso »» USD Dolar
             7. Exit
            ****************
             """);


    while (option !=7) {
        System.out.println(menu);
        var selection = sc.nextLine();
        option = Integer.parseInt(selection);


        switch (option) {
            case 1:
                System.out.println("Please enter the amount you want to convert: ");
                money = "/USD/ARS/" + sc.nextLine();
                break;
            case 2:
                System.out.println("Please enter the amount you want to convert: ");
                money = "/ARS/USD/" + sc.nextLine();
                break;
            case 3:
                System.out.println("Please enter the amount you want to convert: ");
                money = "/USD/BRL/" + sc.nextLine();
                break;
            case 4:
                System.out.println("Please enter the amount you want to convert: ");
                money = "/BRL/USD/" + sc.nextLine();
                break;
            case 5:
                System.out.println("Please enter the amount you want to convert: ");
                money = "/USD/COP/" + sc.nextLine();
                break;
            case 6:
                System.out.println("Please enter the amount you want to convert: ");
                money = "/COP/USD/" + sc.nextLine();
                break;
            case 7:
                System.out.println("Ending the program. Thank you very much for using our services");
                break;
            default:
                System.out.println("Invalid Option");
                break;

        }
    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }
}
