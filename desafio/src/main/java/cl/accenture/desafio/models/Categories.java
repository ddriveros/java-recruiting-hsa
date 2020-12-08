package cl.accenture.desafio.models;

import java.util.List;

public class Categories {

	// Obtiene o asigna id
	private String id;

	// Obtiene o asigna el nombre
	private String name;

	// Obtiene o asigna relevancia
	private Integer relevance;

	// Obtiene o asigna sub categorias de clase
	private List<SubCategoriesLevel2> subcategories;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRelevance() {
		return relevance;
	}

	public void setRelevance(Integer relevance) {
		this.relevance = relevance;
	}

	public List<SubCategoriesLevel2> getSubcategories() {
		return subcategories;
	}

	public void setSubcategories(List<SubCategoriesLevel2> subcategories) {
		this.subcategories = subcategories;
	}
}
