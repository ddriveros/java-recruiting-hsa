package cl.accenture.desafio;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import cl.accenture.desafio.controller.CategoriesController;
import cl.accenture.desafio.controller.CouponController;
import cl.accenture.desafio.models.Categories;
import cl.accenture.desafio.models.Coupon;

@SpringBootTest
class DesafioApplicationTests {

	@Autowired
	CouponController couponController;

	@Autowired
	CategoriesController categoriesController;

	@Test
	public void testConsumirAPICoupon() {
		List<Coupon> coupon = couponController.cuponesNoExpirados();
		assertTrue(coupon.size() > 1);
	}

	@Test
	public void testConsumirAPICategories() {
		Categories categories = categoriesController.topCategorias();
		assertTrue(categories != null);
	}
}
