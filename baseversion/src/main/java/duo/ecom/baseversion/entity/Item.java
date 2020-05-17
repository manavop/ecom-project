package duo.ecom.baseversion.entity;

//Can remove this from this microservice, thinking of keeping this 
//in No-sql based app
public class Item {

	private long id;
	//this can be replaced with barcode/uniqueid.
	//need something unique per piece
	private String uniqueId;
	private String batchcode;
	private Quantity quantity;
	private Price price;
}
