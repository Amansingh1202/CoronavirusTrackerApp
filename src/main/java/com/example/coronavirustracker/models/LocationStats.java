package com.example.coronavirustracker.models;

public class LocationStats {
	
	private String State;
	private String Country;
	@Override
	public String toString() {
		return "LocationStats [State=" + State + ", Country=" + Country + ", latestTotalCases=" + latestTotalCases
				+ "]";
	}
	private int latestTotalCases;
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public int getLatestTotalCases() {
		return latestTotalCases;
	}
	public void setLatestTotalCases(int latestTotalCases) {
		this.latestTotalCases = latestTotalCases;
	}
}