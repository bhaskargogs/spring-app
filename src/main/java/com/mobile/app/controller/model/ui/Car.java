package com.mobile.app.controller.model.ui;

public class Car {
	private String cid;
	private String name;
	private String model;
	private String vendor;
	private String engine;
	private String photo;

	public Car() {

	}

	public Car(String cid, String name, String model, String vendor, String engine, String photo) {
		super();
		this.cid = cid;
		this.name = name;
		this.model = model;
		this.vendor = vendor;
		this.engine = engine;
		this.photo = photo;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "Car [cid=" + cid + ", name=" + name + ", model=" + model + ", vendor=" + vendor + ", engine=" + engine
				+ ", photo=" + photo + "]";
	}

}
