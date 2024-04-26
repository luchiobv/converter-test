import com.converterChallenge.Menu.Menu;
import com.converterChallenge.Model.Exchange;
import com.converterChallenge.jsonData.Connection;
import com.converterChallenge.jsonData.ExchangeApi;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        String money = "";
        String dataExchange="";
        String dataOut ="";

        

        Menu conv = new Menu();
        Exchange conn = new Exchange();

        //System.out.println(conv);
        while (option != 7) {
            System.out.println(conv);
            var selection = sc.nextLine();
            option = Integer.parseInt(selection);



            switch (option) {
                case 1:
                    System.out.println("Please enter the amount you want to convert: ");
                    var amount = sc.nextLine();
                    money = "/USD/ARS/" + amount;
                     System.out.println(conn.getBaseCurrency()+conn.getMoneyExchange()+conn.getRate()+conn.getTargetCurrency());
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




    }
}