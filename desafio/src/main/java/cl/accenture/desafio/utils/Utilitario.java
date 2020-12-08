package cl.accenture.desafio.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Utilitario {
	public static class Converter {

		public static String dateToString(Date fecha) {
			String fechaConvertida = null;
			try {
				DateFormat fechaFormateada = new SimpleDateFormat("yyyy-MM-dd");
				fechaConvertida = fechaFormateada.format(fecha);

			} catch (Exception e) {
				e.printStackTrace();
			}

			return fechaConvertida;
		}

		public static Date stringToDate(String fecha) {
			Date fechaConvertida = null;
			try {
				DateFormat fechaFormateada = new SimpleDateFormat("yyyy-MM-dd");
				fechaConvertida = fechaFormateada.parse(fecha);

			} catch (Exception e) {
				e.printStackTrace();
			}

			return fechaConvertida;
		}
	}
}
