package core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CompararUnsortedxListado {

	
	public static void leer()
    {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
 
        try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			archivo = new File ("C:/Users/ALVARO/Desktop/listaUnsorted.txt");
			String listadoAlumnos = "";
			fr = new FileReader (archivo);
			br = new BufferedReader(fr);
 
			// Lectura del fichero
			System.out.println("Leyendo el contendio del archivo.txt");
			String linea;
			List<String> nombres = new ArrayList<String>();
			//Llenar el list de nombres
			while((linea=br.readLine())!=null){
				nombres.add(linea);
				//System.out.println(linea);
			}
			//recorremos listnombres
			for(int i=0;i<nombres.size();i++){
				System.out.println("String "+i+": "+nombres.get(i).toUpperCase());
				String nombreUnsorted = nombres.get(i).toUpperCase();
				for(int j=0;j<listadoAlumnos.length()-1;j++){
					
//					if(nombreUnsorted.equalsIgnoreCase(nomAlumno)){
//						
//					}
				}
				
			}
        }
        catch(Exception e){
           e.printStackTrace();
        }finally{
           // En el finally cerramos el fichero, para asegurarnos
           // que se cierra tanto si todo va bien como si salta 
           // una excepcion.
           try{
              if( null != fr ){
                 fr.close();
              }
           }catch (Exception e2){
              e2.printStackTrace();
           }
        }
    }

}
