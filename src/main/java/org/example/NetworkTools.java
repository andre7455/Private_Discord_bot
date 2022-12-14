package org.example;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;

public class NetworkTools {
    public void checkInternetStatus() {
        GeneralTools generalTools = new GeneralTools();
        try {
            // Get the InetAddress for the specified domain
            InetAddress address = InetAddress.getByName("www.discord.com");
            // Check if the address is reachable
            if (address.isReachable(5000)) {
                System.out.println("The domain is reachable.");
                generalTools.waitTillInput();
            } else {
                System.out.println("The domain is not reachable.");
                generalTools.waitTillInput();
            }
        } catch (Exception e) {
            e.printStackTrace();
            generalTools.waitTillInput();
        }
    }

    //todo listner example code
    public class MyHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException {
            String response = "Hello World!";
            t.sendResponseHeaders(200, response.length());
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
        //related code:
        //HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        //server.createContext("/", new MyHandler());
        //server.setExecutor(null); // creates a default executor
        //server.start();
    }
}
