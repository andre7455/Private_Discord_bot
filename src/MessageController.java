import java.util.Scanner;
public class MessageController {
    public void messageController(){
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            if (scanner.hasNext()) {
                char c = scanner.next().charAt(0);
                if (c == 27) {  // 27 is the ASCII value for the escape key
                    break;
                }
            }
            i++;
            System.out.println("print somthing and if you press escape i will stop, i ran " + i + " times");
            // code to be executed repeatedly goes here
        } while (true);
    }

    public void sendMessage(){
        HttpOutTools outTools = new HttpOutTools();

        String url = "https://eoc114hzhb26z8d.m.pipedream.net";

        // Set the request method (GET, POST, etc.)
        String method = "POST";

        // Set the request body (if any)
        String body = "request_body=Vidaliveo is a teleprompter";

        // Set the request headers (if any)
        String headers = "Content-Type: application/x-www-form-urlencoded\r\n";
        //default responce message
        String response = "Somthing went wrong when sending the request";
        // Send the request and get the response
        try {
            response = outTools.sendRequest(url, method, headers, body);
        } catch (Exception e) {
            System.out.println(response);
        }
        // Print the response
        System.out.println(response);
    }
}
