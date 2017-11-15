package org.fage.domain;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.voodoodyne.jackson.jsog.JSOGGenerator;

/**
 * 
 * @author Caizhfy
 * @email caizhfy@163.com
 * @createTime 2017年11月7日
 * @description 角色关系实体（有向边实体），该实体不需要数据库访问对象
 *
 */
@JsonIdentityInfo(generator = JSOGGenerator.class)
@RelationshipEntity(type = "ACTS_IN")
public class Role {
	@GraphId
	private Long id;
	private String role;
	@StartNode
	private Actor actor;
	@EndNode
	private Movie movie;
	
	public Role(){
		super();
	}
	
	public Role(String role, Actor actor, Movie movie) {
		super();
		this.role = role;
		this.actor = actor;
		this.movie = movie;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", role=" + role + ", actor=" + actor + ", movie=" + movie + "]";
	}

	
}
