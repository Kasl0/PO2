package pl.edu.agh.dronka.shop.model;

import java.util.Date;

public class Item {

	private String name;

	private Category category;

	private int price;

	private int quantity;

	private boolean secondhand;

	private boolean polish;

	private int noPages;
	private boolean hardcover;

	private boolean mobile;
	private boolean guarantee;

	private Date expiryDate;
	private Genre genre;
	private boolean attachedVideo;


	public Item(String name, Category category, int price, int quantity) {
		this.name = name;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
	}

	public Item() {
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Category getCategory() {
		return category;
	}

	public int getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setSecondhand(boolean secondhand) {
		this.secondhand = secondhand;
	}

	public boolean isSecondhand() {
		return secondhand;
	}

	public void setPolish(boolean polish) {
		this.polish = polish;
	}

	public boolean isPolish() {
		return polish;
	}

	public void setNoPages(int noPages) {
		this.noPages = noPages;
	}

	public int getNoPages() {
		return noPages;
	}

	public void setHardcover(boolean hardcover) {
		this.hardcover = hardcover;
	}

	public boolean isHardcover() {
		return hardcover;
	}

	public void setMobile(boolean mobile) {
		this.mobile = mobile;
	}

	public boolean isMobile() {
		return mobile;
	}

	public void setGuarantee(boolean guarantee) {
		this.guarantee = guarantee;
	}

	public boolean isGuarantee() {
		return guarantee;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setAttachedVideo(boolean attachedVideo) {
		this.attachedVideo = attachedVideo;
	}

	public boolean isAttachedVideo() {
		return attachedVideo;
	}

	@Override
	public String toString() {
		return getName();
	}
}
