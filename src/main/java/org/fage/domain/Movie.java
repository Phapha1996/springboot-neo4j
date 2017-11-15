package org.fage.domain;

import java.util.ArrayList;
import java.util.List;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.voodoodyne.jackson.jsog.JSOGGenerator;

/**
 * 
 * @author Caizhfy
 * @email caizhfy@163.com
 * @createTime 2017年11月7日
 * @description 电影节点实体对象
 *
 */
@JsonIdentityInfo(generator=JSOGGenerator.class)
@NodeEntity
public class Movie {
	@GraphId
	private Long id;
	private String title;
	private String year;
	private String tagline;
	@Relationship(type="ACTS_IN", direction = Relationship.INCOMING)
	private List<Role> roles = new ArrayList<Role>();
	
	public Role addRole(Actor actor, String name){
		Role role = new Role(name,actor,this);
		roles.add(role);
		return role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getTagline() {
		return tagline;
	}

	public void setTagline(String tagline) {
		this.tagline = tagline;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", year=" + year + ", tagline=" + tagline + ", roles=" + roles
				+ "]";
	}
	
	
}
