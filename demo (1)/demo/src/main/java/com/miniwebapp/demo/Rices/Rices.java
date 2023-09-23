package com.miniwebapp.demo.Rices;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity


public class Rices {
	



	
	@Override
	public String toString() {
		return "Rices [id=" + id + ", name=" + name + "]";
	}
	@Id

		private int id;
	private String name;
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		

	}






