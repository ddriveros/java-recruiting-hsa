package cl.accenture.desafio.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import cl.accenture.desafio.models.Coupon;
import cl.accenture.desafio.service.CouponService;
import cl.accenture.desafio.utils.Utilitario.Converter;

@Service
public class CouponServiceImpl implements CouponService {

	@Autowired
	private RestTemplate restTemplate;

	public List<Coupon> cuponesNoExpirados() {
		List<Coupon> retorno = new ArrayList<Coupon>();

		try {
			String url = "https://cs-hsa-api-coupons.herokuapp.com/coupons";
			Coupon[] response = restTemplate.getForObject(url, Coupon[].class);
			List<Coupon> coupons = Arrays.asList(response);

			Date hoy = Calendar.getInstance().getTime();

			for (Coupon i : coupons) {
				Date expiracion = Converter.stringToDate(i.getExpiresAt());
				Date fechaHoy = Converter.stringToDate(Converter.dateToString(hoy));
				if (expiracion.before(fechaHoy)) {
					continue;
				}

				retorno.add(i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return retorno;
	}
}
