package com.java.soap.business;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService
public class ProductServiceImpl {
	
	List<String> bookList = new ArrayList<String>();
	List<String> musicList = new ArrayList<String>();
	List<String> movieList = new ArrayList<String>();
	
	public ProductServiceImpl() {
		bookList.add("Inferno");
		bookList.add("JoyLand");
		bookList.add("Eragon");
		
		musicList.add("Nusrat Fateh Ali");
		musicList.add("Josh Ritter");
		musicList.add("Ani Difranco");
		
		movieList.add("Memento");
		movieList.add("The Hunger Games");
		movieList.add("Jurassic World");
	}
	
	public List<String> getProductCategories() {
		List<String> categories = new ArrayList<String>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
	}
	
	public List<String> getProducts(String category) {
		switch (category.toLowerCase()) {
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movies":
			return movieList;
		}
		return null;
	}


}
