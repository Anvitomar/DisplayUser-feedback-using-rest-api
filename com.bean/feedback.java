package com.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class feedback {
@Id

private int id;
private String comment;
private String uname;
private int rating;
/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}
/**
 * @return the comment
 */
public String getComment() {
	return comment;
}
/**
 * @param comment the comment to set
 */
public void setComment(String comment) {
	this.comment = comment;
}
/**
 * @return the uname
 */
public String getUname() {
	return uname;
}
/**
 * @param uname the uname to set
 */
public void setUname(String uname) {
	this.uname = uname;
}
/**
 * @return the rating
 */
public int getRating() {
	return rating;
}
/**
 * @param rating the rating to set
 */
public void setRating(int rating) {
	this.rating = rating;
}
@Override
public String toString() {
	return "feedback [id=" + id + ", comment=" + comment + ", uname=" + uname + ", rating=" + rating + "]";
}
public feedback() {
	super();
	// TODO Auto-generated constructor stub
}
public feedback(int id, String comment, String uname, int rating) {
	super();
	this.id = id;
	this.comment = comment;
	this.uname = uname;
	this.rating = rating;
}


}
