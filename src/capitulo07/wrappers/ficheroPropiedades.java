package capitulo07.wrappers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ficheroPropiedades {
	
	private static Properties propiedades = null;

	public ficheroPropiedades () {
		super();
	}
	
	/**
	 * 
	 * @return
	 */
	private static Properties getPropiedades() {
		if (propiedades == null) {
			propiedades = new Properties();
		    
			try {
				File file = new File("./src/capitulo07/wrappers/carloslopez.properties");
				System.out.println("Fichero encontrado: " + file.exists());
				propiedades.load(new FileReader(file));
			
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			 
		}
		return propiedades;
	}

	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */
	public static String getProperty(String nombrePropiedad) {
		return getPropiedades().getProperty(nombrePropiedad);
	}

	
	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */
	public static int getIntProperty (String nombrePropiedad) {
		return Integer.parseInt(getPropiedades().getProperty(nombrePropiedad));
	}
	
	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */
	
	public static Float getFloatProperty (String nombrePropiedad) {
		return Float.parseFloat(getPropiedades().getProperty(nombrePropiedad));
	}
	
	
	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String usuario = ficheroPropiedades.getProperty("USUARIO");
		String password = ficheroPropiedades.getProperty("PASSWORD");
		int id = ficheroPropiedades.getIntProperty("ID_USUARIO");
		float estatura = ficheroPropiedades.getFloatProperty("ESTATURA");
		Boolean aprobado = Boolean.parseBoolean(ficheroPropiedades.getProperty("APROBADO"));
		
		System.out.println("Usuario leído: " + usuario);
		System.out.println("Contraseña leída: " + password);
		System.out.println("Id leído: " + id);
		System.out.println("Estatura leída: " + estatura);
		System.out.println("Aprobado = " + aprobado);
	}

}
