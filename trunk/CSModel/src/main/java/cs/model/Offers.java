package cs.model;

import java.util.Date;

public class Offers
{
	private Integer id;
	private Integer idOfferType;
	private Integer idDriver;
	private String title;
	private String description;
	private Integer numberOfPlaceInitial;
	private Integer numberOfPlaceRemaining;
	private Float pricePerPassenger;
	private Date started;
	private Date ended;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIdOfferType() {
		return idOfferType;
	}
	public void setIdOfferType(Integer idOfferType) {
		this.idOfferType = idOfferType;
	}
	public Integer getIdDriver() {
		return idDriver;
	}
	public void setIdDriver(Integer idDriver) {
		this.idDriver = idDriver;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getNumberOfPlaceInitial() {
		return numberOfPlaceInitial;
	}
	public void setNumberOfPlaceInitial(Integer numberOfPlaceInitial) {
		this.numberOfPlaceInitial = numberOfPlaceInitial;
	}
	public Integer getNumberOfPlaceRemaining() {
		return numberOfPlaceRemaining;
	}
	public void setNumberOfPlaceRemaining(Integer numberOfPlaceRemaining) {
		this.numberOfPlaceRemaining = numberOfPlaceRemaining;
	}
	public Float getPricePerPassenger() {
		return pricePerPassenger;
	}
	public void setPricePerPassenger(Float pricePerPassenger) {
		this.pricePerPassenger = pricePerPassenger;
	}
	public Date getStarted() {
		return started;
	}
	public void setStarted(Date started) {
		this.started = started;
	}
	public Date getEnded() {
		return ended;
	}
	public void setEnded(Date ended) {
		this.ended = ended;
	}
}