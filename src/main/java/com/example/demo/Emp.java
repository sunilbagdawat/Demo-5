package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp {
@Id
private int id;
private String name;
private int sal;
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
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
@Override
public String toString() {
	return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
}



}
