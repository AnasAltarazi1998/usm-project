package app.api;

import java.io.IOException;
import java.io.InputStream;
import java.net.http.HttpResponse;
import java.util.Scanner;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class ApiClass {
        
        CloseableHttpClient httpclient;
        HttpGet httpGet;  
        HttpPost httpPost;
        private static ApiClass apiClass;
        private ApiClass(){
            httpclient = HttpClients.createDefault();
        } 
        public static ApiClass getInstance(){
            if(apiClass == null)
            {
                apiClass = new ApiClass();
                return apiClass;
            }else{
                return apiClass;
            }
        }
        public InputStream get(String url) throws UnsupportedOperationException, IOException
        {
            CloseableHttpResponse httpresponse = null;
            httpGet = new HttpGet(url);
            try {
                    httpresponse = httpclient.execute(httpGet);
              } catch (IOException e) {
                  // TODO Auto-generated catch block
                  e.printStackTrace();
              }
              return httpresponse.getEntity().getContent();
        }
        
  
  
    
}
