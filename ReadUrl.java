import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class ReadUrl {

	
	  public static void main(String [] args)
	   {
		  
		  //Calendar fechaInicio = Calendar.getInstance();  // 31/10/2015 dd/MM/yyyy
		  Calendar fechaInicio = new GregorianCalendar();
		  
		  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		  
		  fechaInicio.set(2017,11,01);
		  
		  System.out.println("ANYO: "+fechaInicio.get(Calendar.YEAR));
		  System.out.println("MES: "+fechaInicio.get(Calendar.MONTH));
		  System.out.println("DIA: "+fechaInicio.get(Calendar.DAY_OF_MONTH));
		  
		  fechaInicio.add(Calendar.DAY_OF_YEAR, 1);
		  
		  System.out.println("Fecha: "+fechaInicio.get(Calendar.YEAR)+"/"+fechaInicio.get(Calendar.MONTH)+"/"+fechaInicio.get(Calendar.DAY_OF_MONTH));
		
		  System.out.println("Formateado: "+sdf.format(fechaInicio.getTime()));
		  
		  //calendar.add(Calendar.DAY_OF_YEAR, dias);  // numero de días a añadir, o restar en caso de días<0
		  
//	      try
//	      {
//	         URL url = new URL("http://10.99.64.231:9080/ProsaPortal7/");
//	         URLConnection urlConnection = url.openConnection();
//	         HttpURLConnection connection = null;
//	         if(urlConnection instanceof HttpURLConnection)
//	         {
//	            connection = (HttpURLConnection) urlConnection;
//	         }
//	         else
//	         {
//	            System.out.println("Please enter an HTTP URL.");
//	            return;
//	         }
//	         BufferedReader in = new BufferedReader(
//	         new InputStreamReader(connection.getInputStream()));
//	         String urlString = "";
//	         String current;
//	         while((current = in.readLine()) != null)
//	         {
//	            urlString += current;
//	         }
//	         System.out.println(urlString);
//	      }catch(IOException e)
//	      {
//	         e.printStackTrace();
//	      }
	   }
	  
	  
	  public static Date sumarDiasAFecha(Date fecha, int dias){
	      if (dias==0) return fecha;
	      Calendar calendar = Calendar.getInstance();
	      calendar.setTime(fecha); 
	      calendar.add(Calendar.DAY_OF_YEAR, dias);  
	      return calendar.getTime(); 
	}
	  
	 /*
	 public static void main(String [] args)
	   {
	      try
	      {
	         URL url = new URL("http://www.amrood.com/index.htm-language=en#j2se.html");
	         
	         System.out.println("URL is " + url.toString());
	         System.out.println("protocol is " + url.getProtocol());
	         System.out.println("authority is " + url.getAuthority());
	         System.out.println("file name is " + url.getFile());
	         System.out.println("host is " + url.getHost());
	         System.out.println("path is " + url.getPath());
	         System.out.println("port is " + url.getPort());
	         System.out.println("default port is " + url.getDefaultPort());
	         System.out.println("query is " + url.getQuery());
	         System.out.println("ref is " + url.getRef());
	      }catch(IOException e)
	      {
	         e.printStackTrace();
	      }
	   }
	 */
	/**
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
	         // Se abre la conexión
	         URL url = new URL("http://billyprogramador.blogspot.com.es/2011/11/como-alterar-el-resultado-de-una.html");
	         
	         //URLConnection conexion = url.openConnection();
	         //conexion.connect();
	         
	         // Lectura
	        // InputStream is = conexion.getInputStream();
	        // BufferedReader br = new BufferedReader(new InputStreamReader(is));
	         BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
	         char[] buffer = new char[1000];
	         int leido;
	         while ((leido = br.read(buffer)) > 0) {
	            System.out.println(new String(buffer, 0, leido));
	         }
	      } catch (MalformedURLException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      } catch (IOException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }
	}	
*/
}
 /*
package com.chuidiang.ejemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class PruebaHTTP {
   public static void main(String[] args) {
      try {
         // Se abre la conexión
         URL url = new URL("http://www.chuidiang.com");
         URLConnection conexion = url.openConnection();
         conexion.connect();
         
         // Lectura
         InputStream is = conexion.getInputStream();
         BufferedReader br = new BufferedReader(new InputStreamReader(is));
         char[] buffer = new char[1000];
         int leido;
         while ((leido = br.read(buffer)) > 0) {
            System.out.println(new String(buffer, 0, leido));
         }
      } catch (MalformedURLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }
}
*/