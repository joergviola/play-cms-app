package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class Module extends Model {
	public String title;
	@ManyToOne
	public User owner;
	public String tags;
	public double rating;
	public int ratingCount;
}
