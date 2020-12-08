package cl.accenture.desafio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import cl.accenture.desafio.models.Categories;
import cl.accenture.desafio.service.CategoriesService;

@Service
public class CategoriesServiceImpl implements CategoriesService {

	@Autowired
	private RestTemplate restTemplate;

	public Categories topCategorias() {
		Categories categories = new Categories();
		try {
			String url = "https://cs-hsa-api-categories.herokuapp.com/categories";
			categories = restTemplate.getForObject(url, Categories.class);
		} catch (Exception e) {
			e.getStackTrace();
		}

		return categories;
	}
}
