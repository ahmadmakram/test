package com.tameen.controller;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;


@Component()
public class SearchController implements Serializable {
	private static final long serialVersionUID = 1L;
    private String searchType;
    private String searchVal;
    private Map<String,String> searchList;
     
    public SearchController() {
        searchList  = new HashMap<String, String>();
        searchList.put("Iqama", "Iqama");
        searchList.put("Project", "project");
        searchList.put("acc", "acc");
  
    }

    public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public Map<String, String> getSearchList() {
		return searchList;
	}

	public void setSearchList(Map<String, String> searchList) {
		this.searchList = searchList;
	}

	public String getSearchVal() {
		return searchVal;
	}

	public void setSearchVal(String searchVal) {
		this.searchVal = searchVal;
	}

	public void onCountryChange() {
        if(searchType !=null && !searchType.equals(""))
           System.out.println(searchType);
        
    }
     
   
}

