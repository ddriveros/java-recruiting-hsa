package cl.accenture.desafio.service;

import java.util.List;

import cl.accenture.desafio.models.Coupon;

public interface CouponService {

	public List<Coupon> cuponesNoExpirados();
}
