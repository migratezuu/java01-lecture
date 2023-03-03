package first.game;

public class ChoiceStyleDTO {
	private String hair;
	private String clothes;
	private String shoes;
	private String prop;
	
	public ChoiceStyleDTO() {}

	public ChoiceStyleDTO(String hair, String clothes, String shoes, String prop) {
		super();
		this.hair = hair;
		this.clothes = clothes;
		this.shoes = shoes;
		this.prop = prop;
	}

	public String getHair() {
		return hair;
	}

	public void setHair(String hair) {
		this.hair = hair;
	}

	public String getClothes() {
		return clothes;
	}

	public void setClothes(String clothes) {
		this.clothes = clothes;
	}

	public String getShoes() {
		return shoes;
	}

	public void setShoes(String shoes) {
		this.shoes = shoes;
	}

	public String getProp() {
		return prop;
	}

	public void setProp(String prop) {
		this.prop = prop;
	}
	
	
	
	
}
