package conexion;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.OutputStream;
/**
 * Se encarga de crear la conexión a la base de datos.
 *
 * @author Juan Carlos Estevez Vargas
 */
public class Conexion {

    public  Conexion() { }


    public String  post(String urlAPI, String datos)throws Exception {

    	       URL url = new URL("http://localhost:8080/"); 
    	      
    	      HttpURLConnection conexión = (HttpURLConnection) url.openConnection();
    	      
    	        conexión.setRequestMethod("POST");
    	        conexión.setRequestProperty("Content-Type", "application/json");
    	        conexión.setDoOutput(true);
    	        
    	        OutputStream outputStream = conexión.getOutputStream();
    	        outputStream.write(datos.getBytes("UTF-8"));
    	        outputStream.close();

    	        BufferedReader lector = new BufferedReader(new InputStreamReader(conexión.getInputStream()));
    	        String línea;
    	        StringBuilder respuesta = new StringBuilder();

    	        while ((línea = lector.readLine()) != null) {
    	            respuesta.append(línea);
    	        }
    	        lector.close();

    	        return respuesta.toString();
    }
    
    public String get(String urlAPI) throws Exception {
    	
    	 URL url = new URL(urlAPI);
    	    HttpURLConnection conexión = (HttpURLConnection) url.openConnection();
    	    conexión.setRequestMethod("GET");

    	    BufferedReader lector = new BufferedReader(new InputStreamReader(conexión.getInputStream()));
    	    String línea;
    	    StringBuilder respuesta = new StringBuilder();

    	    while ((línea = lector.readLine()) != null) {
    	        respuesta.append(línea);
    	    }
    	    lector.close();

    	    return respuesta.toString();
    }
     
     

}