package cl.accenture.desafio.models;

import java.util.List;

public class SubCategoriesLevel2 {

	// Obtiene o asigna id
	private String id;

	// Obtiene o asigna nombre
	private String name;

	// Obtiene o asigna relevancia
	private Integer relevance;

	// Obtiene o asigna imagen
	private String iconImageUrl;

	// Obtiene o asigna lista de subcategoria de clase
	private List<SubCategoriesLevel3> subcategories;

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

	public String getIconImageUrl() {
		return iconImageUrl;
	}

	public void setIconImageUrl(String iconImageUrl) {
		this.iconImageUrl = iconImageUrl;
	}

	public List<SubCategoriesLevel3> getSubcategories() {
		return subcategories;
	}

	public void setSubcategories(List<SubCategoriesLevel3> subcategories) {
		this.subcategories = subcategories;
	}
}
