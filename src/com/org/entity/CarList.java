package com.org.entity;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CarList {
	
	
	private String[] strings;
	
	private Car[] cars;
	
	private List<String> cList;
	
	private List<Car> carlist;
	
	private Map<String,String> cMap;
	
	private Map<String,Car> carMap;
	
	private Set<String> cset;
	
	private Set<Car> carlset;
	
	private Properties properties;

	@Override
	public String toString() {
		return "CarList [strings=" + Arrays.toString(strings) + ", \ncars=" + Arrays.toString(cars) + ", \ncList=" + cList
				+ ", \ncarlist=" + carlist + ", \ncMap=" + cMap + ", \ncarMap=" + carMap + ", \ncset=" + cset + ", \ncarlset="
				+ carlset + ", \nproperties=" + properties + "]";
	}

	public CarList() {
		super();
	}

	public String[] getStrings() {
		return strings;
	}

	public void setStrings(String[] strings) {
		this.strings = strings;
	}

	public Car[] getCars() {
		return cars;
	}

	public void setCars(Car[] cars) {
		this.cars = cars;
	}

	public List<String> getcList() {
		return cList;
	}

	public void setcList(List<String> cList) {
		this.cList = cList;
	}

	public List<Car> getCarlist() {
		return carlist;
	}

	public void setCarlist(List<Car> carlist) {
		this.carlist = carlist;
	}

	public Map<String, String> getcMap() {
		return cMap;
	}

	public void setcMap(Map<String, String> cMap) {
		this.cMap = cMap;
	}

	public Map<String, Car> getCarMap() {
		return carMap;
	}

	public void setCarMap(Map<String, Car> carMap) {
		this.carMap = carMap;
	}

	public Set<String> getCset() {
		return cset;
	}

	public void setCset(Set<String> cset) {
		this.cset = cset;
	}

	public Set<Car> getCarlset() {
		return carlset;
	}

	public void setCarlset(Set<Car> carlset) {
		this.carlset = carlset;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
}
