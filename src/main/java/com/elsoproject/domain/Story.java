package com.elsoproject.domain;

import javax.persistence.*;
import java.net.URL;
import java.util.Date;

@Entity
public class Story {

	@GeneratedValue
	@Id
	private Long id;
	private String title;
    private String city;
    private String housevalue;

    @Column(columnDefinition = "TEXT")
    private String pictureUrl;
    @Column(columnDefinition = "TEXT")
    private String linkToHouse;

    private String sellerName;
    private String phoneNumber;
    private boolean called = false;

    @Column(columnDefinition = "TEXT")
	private String content;
	private Date posted;
	
	@ManyToOne
	private Blogger blogger;

	public Story() {

    }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getPosted() {
		return posted;
	}

	public void setPosted(Date posted) {
		this.posted = posted;
	}

	public Blogger getBlogger() {
		return blogger;
	}

	public void setBlogger(Blogger blogger) {
		this.blogger = blogger;
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

    public String getHouseValue() {
        return housevalue;
    }

    public void setHouseValue(String value) {
        this.housevalue = value;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHousevalue() {
        return housevalue;
    }

    public void setHousevalue(String housevalue) {
        this.housevalue = housevalue;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isCalled() {
        return called;
    }

    public void setCalled(boolean called) {
        this.called = called;
    }

    public String getLinkToHouse() {
        return linkToHouse;
    }

    public void setLinkToHouse(String linkToHouse) {
        this.linkToHouse = linkToHouse;
    }

    public Story(String title, String city, String housevalue, String pictureUrl, String linkToHouse, String sellerName, String phoneNumber, boolean called, String content, Date posted, Blogger blogger) {
        this.title = title;
        this.city = city;
        this.housevalue = housevalue;
        this.pictureUrl = pictureUrl;
        this.linkToHouse = linkToHouse;
        this.sellerName = sellerName;
        this.phoneNumber = phoneNumber;
        this.called = called;
        this.content = content;
        this.posted = posted;
        this.blogger = blogger;
    }

    @Override
    public String toString() {
        return "Story{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", city='" + city + '\'' +
                ", housevalue='" + housevalue + '\'' +
                ", pictureUrl='" + pictureUrl + '\'' +
                ", linkToHouse='" + linkToHouse + '\'' +
                ", sellerName='" + sellerName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", called=" + called +
                ", content='" + content + '\'' +
                ", posted=" + posted +
                ", blogger=" + blogger +
                '}';
    }

}
