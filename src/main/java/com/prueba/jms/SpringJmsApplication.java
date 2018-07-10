package com.prueba.jms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJmsApplication {

	public static void main(String[] args) throws Exception {
		long timestampIni = System.currentTimeMillis() / 1000;
		try {
			SpringApplication.run(SpringJmsApplication.class, args);
		}finally {
			long timestampFin = System.currentTimeMillis() / 1000;
			long tiempoTotal = timestampFin - timestampIni;
			
			System.out.println("Tiempo total de descarga: "+tiempoTotal+" segundos");
		}
		

	}

}
