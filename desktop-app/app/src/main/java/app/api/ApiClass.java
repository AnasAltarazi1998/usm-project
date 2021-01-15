package app.api;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class ApiClass {

    CloseableHttpClient httpclient;
    HttpGet httpGet;
    HttpPost httpPost;
    private static ApiClass apiClass;

    private ApiClass() {
        httpclient = HttpClients.createDefault();
    }

    public static ApiClass getInstance() {
        if (apiClass == null) {
            apiClass = new ApiClass();
            return apiClass;
        } else {
            return apiClass;
        }
    }

    public InputStream post(String url, String... json) throws ClientProtocolException, IOException
        {
            
            
            httpPost = new HttpPost(url);
            
            if(json.length == 1)
            httpPost.setEntity(new StringEntity(json[0]));

            CloseableHttpResponse response = httpclient.execute(httpPost);

            return response.getEntity().getContent();

        }
        public InputStream get(String url) throws UnsupportedOperationException, IOException
        {
    

            httpGet = new HttpGet(url);
            
            CloseableHttpResponse httpresponse = httpclient.execute(httpGet);
            
            return httpresponse.getEntity().getContent();
        }
        
  
  
    
}
