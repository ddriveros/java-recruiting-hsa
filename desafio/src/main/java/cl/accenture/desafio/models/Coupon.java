package cl.accenture.desafio.models;

public class Coupon {

	// Obtiene o asigna id
	private String id;

	// Obtiene o asigna descripción
	private String description;

	// Obtiene o asigna seller
	private String seller;

	// Obtiene o asigna imagen
	private String image;

	// Obtiene o asigna expiración
	private String expiresAt;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getExpiresAt() {
		return expiresAt;
	}

	public void setExpiresAt(String expiresAt) {
		this.expiresAt = expiresAt;
	}
}
