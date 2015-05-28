package com.tuyano.libro.mygaeapp;

import javax.jdo.annotations.*;
 
@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class LinkData {
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Long id;
     
    @Persistent
    private String name;
     
    @Persistent
    private String picture;
     
    @Persistent
    private String price;
    
    public LinkData(String name, String picture, String price) {
    	 super();
         this.name= name;
         this.picture = picture;
         this.price = price;
    }

	public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getPicture() {
        return picture;
    }
 
    public void setPicture(String picture) {
        this.picture = picture;
    }
 
    public String getPrice() {
        return price;
    }
 
    public void setPrice(String price) {
        this.price = price;
    }
 
}