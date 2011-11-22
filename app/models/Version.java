package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import play.db.jpa.Model;

@Entity
public class Version extends Model {
	public String label;
	public String s3Key;
	@ManyToOne
	public Module module;
}
