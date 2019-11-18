package cn.xdl.pojo;

import java.io.Serializable;

public class Subject implements Serializable {
     private int id;
     private String name;
     private int directionId;
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Subject(int id, String name, int directionId) {
		super();
		this.id = id;
		this.name = name;
		this.directionId = directionId;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDirectionId() {
		return directionId;
	}
	public void setDirectionId(int directionId) {
		this.directionId = directionId;
	}
	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + ", directionId=" + directionId + "]";
	}
}
