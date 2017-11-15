package org.fage.domain;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.voodoodyne.jackson.jsog.JSOGGenerator;

/**
 * 
 * @author Caizhfy
 * @email caizhfy@163.com
 * @createTime 2017年11月7日
 * @description 演员节点实体
 *
 */
@JsonIdentityInfo(generator = JSOGGenerator.class)
@NodeEntity // 节点实体
public class Actor {
	@GraphId // 节点唯一标识
	private Long id;
	private String name;
	private int born;

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

	public int getBorn() {
		return born;
	}

	public void setBorn(int born) {
		this.born = born;
	}

	@Override
	public String toString() {
		return "Actor [id=" + id + ", name=" + name + ", born=" + born + "]";
	}
	

}
