package cl.accenture.desafio.models;

import java.util.List;

public class SubCategoriesLevel3 {

	// Obtiene o asigna id
	private String id;

	// Obtiene o asigna nombre
	private String name;

	// Obtiene o asigna relevancia
	private Integer relevance;

	// Obtiene o asigna imagen larga
	private String largeImageUrl;

	// Obtiene o asigna imagen media
	private String mediumImageUrl;

	// Obtiene o asigna imagen corta
	private String smallImageUrl;

	// Obtiene o asigna lista subcategoria de clase
	private List<SubCategoriesLevel4> subcategories;

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

	public String getLargeImageUrl() {
		return largeImageUrl;
	}

	public void setLargeImageUrl(String largeImageUrl) {
		this.largeImageUrl = largeImageUrl;
	}

	public String getMediumImageUrl() {
		return mediumImageUrl;
	}

	public void setMediumImageUrl(String mediumImageUrl) {
		this.mediumImageUrl = mediumImageUrl;
	}

	public String getSmallImageUrl() {
		return smallImageUrl;
	}

	public void setSmallImageUrl(String smallImageUrl) {
		this.smallImageUrl = smallImageUrl;
	}

	public List<SubCategoriesLevel4> getSubcategories() {
		return subcategories;
	}

	public void setSubcategories(List<SubCategoriesLevel4> subcategories) {
		this.subcategories = subcategories;
	}
}
