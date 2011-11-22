package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import play.db.jpa.Model;

@Entity
public class Comment extends Model {
	@ManyToOne
	public Module module;
	@ManyToOne
	public Version version;
	@ManyToOne
	public User user;
	public double rating;
}
