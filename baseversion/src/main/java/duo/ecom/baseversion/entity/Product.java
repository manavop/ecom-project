package duo.ecom.baseversion.entity;

public class Product {

	private Object image;
	private String productId;
	
	private ProductDetails productDetails;
	public Object getImage() {
		return image;
	}
	public void setImage(Object image) {
		this.image = image;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public ProductDetails getProductDetails() {
		return productDetails;
	}
	public void setProductDetails(ProductDetails productDetails) {
		this.productDetails = productDetails;
	}
	
	//thinking reveiews can be added here or a different microservice.
}
