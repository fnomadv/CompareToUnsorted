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
        File archivoUnsorted = null;
        File archivoOriginal = null;
        FileReader fr = null;
        BufferedReader br = null;
 
        try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			archivoUnsorted = new File ("C:/Users/ALVARO/Desktop/listaUnsorted.txt");
			archivoOriginal = new File ("C:/Users/ALVARO/Desktop/listadoCompleto.txt");
			String listadoAlumnosUnsorted = "";
			String listadoAlumnosNombre = "";
			fr = new FileReader (archivoUnsorted);
			br = new BufferedReader(fr);
 
			// Lectura del fichero
			System.out.println("Leyendo el contendio del archivo.txt");
			String linea;
			List<String> nombresUnsorted = new ArrayList<String>();
			//Llenar el list de nombres
			while((linea=br.readLine())!=null){
				nombresUnsorted.add(linea);
				//System.out.println(linea);
			}
			fr = new FileReader(archivoOriginal);
			br = new BufferedReader(fr);
			List<String> listaLineasOriginal = new ArrayList<String>();
			while((linea=br.readLine())!=null){
				listaLineasOriginal.add(linea);
			}
			
			System.out.println("***Listado Unsorted*****");
			for(int i=0;i<nombresUnsorted.size();i++){
				System.out.println("String "+i+": "+nombresUnsorted.get(i).toUpperCase());
			}
			
			System.out.println("***Listado Original*****");
			String nombreAlumno="";
			String nombreProfesor="";
			String nombreClase="";
			for(int i=0;i<listaLineasOriginal.size();i++){
				System.out.println("String "+i+": "+listaLineasOriginal.get(i).toUpperCase());
			}
			
			
			//recorremos listnombres
//			for(int i=0;i<nombresUnsorted.size();i++){
//				System.out.println("String "+i+": "+nombresUnsorted.get(i).toUpperCase());
//				String nombreUnsorted = nombresUnsorted.get(i).toUpperCase();
//				for(int j=0;j<listadoAlumnosUnsorted.length()-1;j++){
//					
//					if(nombreUnsorted.equalsIgnoreCase(nomAlumno)){
//						
//					}
//				}
//				
//			}
        }
        catch(IOException e){
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
