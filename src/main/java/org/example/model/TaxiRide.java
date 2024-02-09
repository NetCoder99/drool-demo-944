package org.example.model;

public class TaxiRide {
    private Boolean isNightSurcharge;
    private Long distanceInMile;
    
	public TaxiRide() {
		super();
	}
    
	public TaxiRide(Boolean isNightSurcharge, Long distanceInMile) {
		super();
		this.isNightSurcharge = isNightSurcharge;
		this.distanceInMile = distanceInMile;
	}
	
	public Boolean getIsNightSurcharge() {
		return isNightSurcharge;
	}
	public void setIsNightSurcharge(Boolean isNightSurcharge) {
		this.isNightSurcharge = isNightSurcharge;
	}
	public Long getDistanceInMile() {
		return distanceInMile;
	}
	public void setDistanceInMile(Long distanceInMile) {
		this.distanceInMile = distanceInMile;
	}
    
    
}
