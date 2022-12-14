package org.example;

import java.net.InetAddress;

public class NetworkTools {
    public void checkInternetStatus(){
        try {
            // Get the InetAddress for the specified domain
            InetAddress address = InetAddress.getByName("www.discord.com");

            // Check if the address is reachable
            if (address.isReachable(5000)) {
                System.out.println("The domain is reachable.") ;
            } else {
                System.out.println("The domain is not reachable.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
