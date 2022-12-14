package org.example;

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
}
