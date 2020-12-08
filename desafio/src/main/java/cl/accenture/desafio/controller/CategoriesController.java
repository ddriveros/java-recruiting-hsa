package cl.accenture.desafio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.accenture.desafio.models.Categories;
import cl.accenture.desafio.service.CategoriesService;

@RestController
@RequestMapping("/categorias")
public class CategoriesController {

	@Autowired
	CategoriesService categoriesService;

	@GetMapping("/top")
	public Categories topCategorias() {
		return categoriesService.topCategorias();
	}
}
