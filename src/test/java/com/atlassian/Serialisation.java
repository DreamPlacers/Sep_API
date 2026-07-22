package com.atlassian;

import java.util.List;

public class Serialisation {
	
	public Serialisation(int id, Category category, String name, String[] photoUrls, Tags[] tags, String status) {
		this.id = id;
		this.category = category;
		this.name = name;
		this.photoUrls = photoUrls;
		this.tags = tags;
		this.status = status;
	}
	

	private int id;
	private Category category;
	private String name;
	private String[] photoUrls;
	private Tags[] tags;
	private String status;
	public int getId() {
		return id;
	}
	public Category getCategory() {
		return category;
	}
	public String getName() {
		return name;
	}
	public String[] getPhotoUrls() {
		return photoUrls;
	}
	public Tags[] getTags() {
		return tags;
	}
	public String getStatus() {
		return status;
	}
	
	
	
}
