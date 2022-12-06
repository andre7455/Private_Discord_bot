`import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpRequestExample {
    public static void main(String[] args) throws Exception {

        HttpRequestExample http = new HttpRequestExample();

        // Specify the URL to send the request to
        String url = "https://eoc114hzhb26z8d.m.pipedream.net";

        // Set the request method (GET, POST, etc.)
        String method = "GET";

        // Set the request body (if any)
        String body = "request_body=Vidaliveo is a teleprompter";

        // Set the request headers (if any)
        String headers = "Content-Type: application/x-www-form-urlencoded\r\n";

        // Send the request and get the response
        String response = http.sendRequest(url, method, headers, body);

        // Print the response
        System.out.println(response);
    }

    // Method to send the HTTP request and return the response
    private String sendRequest(String url, String method, String headers, String body) throws Exception {
        // Create a new URL object from the specified URL string
        URL obj = new URL(url);

        // Open a new HTTP connection to the URL
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // Set the request method
        con.setRequestMethod(method);

        // Set the request headers, if any
        if (headers != null && !headers.isEmpty()) {
            // Split the headers string on the newline character
            String[] headerLines = headers.split("\r\n");
            // Set each header
            for (String header : headerLines) {
                // Split the header on the first colon to get the key and value
                String[] parts = header.split(":", 2);
                String key = parts[0];
                String value = parts[1];
                con.setRequestProperty(key, value);
            }
        }

        // Set the request body, if any
        if (body != null && !body.isEmpty()) {
            // Set the output to true, indicating that we will be sending data
            con.setDoOutput(true);
            // Create a new data output stream to write the request body to
            DataOutputStream out = new DataOutputStream(con.getOutputStream());
            // Write the request body
            out.writeBytes(body);
            // Close the output stream
            out.close();
        }

        // Read the response
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        // Return the response as a string
        return response.toString();
    }
}
`