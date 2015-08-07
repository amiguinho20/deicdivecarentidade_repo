package br.com.fences.deicdivecarentidade.enderecoavulso.geojson;

public class Point implements Geometry{
	
	private String type = "Point";

	private Double[] coordinates = new Double[2];
	
	public Point(){}
	
	public Point(Double longitude, Double latitude){
		setLongitude(longitude);
		setLatitude(latitude);
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double[] getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(Double[] coordinates) {
		this.coordinates = coordinates;
	}
	public void setLongitude(Double longitude){
		this.coordinates[0] = longitude;
	}
	public Double getLongitude(){
		return this.coordinates[0];
	}
	public void setLatitude(Double latitude){
		this.coordinates[1] = latitude;
	}
	public Double getLatitude(){
		return this.coordinates[1];
	}
	public void setLngLat(Double longitude, Double latitude)
	{
		setLongitude(longitude);
		setLatitude(latitude);
	}

}
