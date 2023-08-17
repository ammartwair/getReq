package getRequestTest;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
public class newTest {

	public static void main(String[] args) throws IOException {
		 String token = "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";

	        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
	            HttpGet request = new HttpGet("https://api.github.com/user");
	            request.setHeader("Authorization", "Bearer " + token);

	            HttpResponse response = httpClient.execute(request);

	            // Print the response status
	            System.out.println("Response Status: " + response.getStatusLine());

	            // Print the response body
	            String responseBody = EntityUtils.toString(response.getEntity());
	            System.out.println("Response Body: " + responseBody);
	        }
	}
}
