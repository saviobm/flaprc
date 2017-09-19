package br.com.flaprc.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Classe respons�vel por utilit�rios referente aos arquivos de propriedades.
 * 
 * @author S�vio
 */
public class PropriedadesUtil {
	
	/**
	 * Propriedade props.
	 */
	private static Properties  props;
	
	/**
	 * Retorna uma inst�ncia da classe Properties.
	 * 
	 * @return Properties inst�ncia da classe.
	 */
	public static Properties getInstance() {
		
		if (props == null) {
		
			try {
				props = new Properties();
				
				FileInputStream file = new FileInputStream("./properties/flaprc-service.properties");
				props.load(file);
			} catch (IOException e) {
				throw new RuntimeException("(IOException) Erro ao ler o arquivo flaprc-service.properties"); // Ajustar o lan�amento de exe��es.
			}
			
		}
		
		return props;
		
	}
	
	/**
	 * Retorna o squema do BD.
	 * 
	 * @return String com o squema do BD.
	 */
	public static String getSchema() {
		
		return getInstance().getProperty("prop.schema.bd");
		
	}
	
}