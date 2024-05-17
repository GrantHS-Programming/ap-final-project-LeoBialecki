import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnectionReader {


        public void main(String[] args)
        {
            String output = getUrlContents("https://open.er-api.com/v6/latest/USD");
            System.out.println(output);
            System.out.println("hii");
        }



        private String getUrlContents(String theUrl)
        {
            StringBuilder content = new StringBuilder();
            // Use try and catch to avoid the exceptions
            try
            {
                URL url = new URL(theUrl); // creating a url object
                URLConnection urlConnection = url.openConnection(); // creating a urlconnection object

                // wrapping the urlconnection in a bufferedreader
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                String line;
                // reading from the urlconnection using the bufferedreader
                while ((line = bufferedReader.readLine()) != null)
                {
                    content.append(line + "\n");
                }
                bufferedReader.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            return content.toString();
        }
    }

