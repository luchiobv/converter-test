import com.converterChallenge.Menu.Menu;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Menu conv = new Menu();
        conv.getMoney();
        String address= "https://v6.exchangerate-api.com/v6/8142735e21e6df86291da7b5/pair/"+ conv.getMoney;


        try{
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(address))
                .build();
        HttpResponse <String> response= client
        .send(request, HttpResponse.BodyHandlers.ofString());
        
        Gson gson = new Gson();
        



    }catch(Exception e){}



}
}