package chupakabra.itmpp3task311;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class ItmPp3Task311Application {

    public static void main(String[] args) {
        SpringApplication.run(ItmPp3Task311Application.class, args);
        try {
            Runtime.getRuntime().exec("cmd /c start http://localhost:8080/users");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
