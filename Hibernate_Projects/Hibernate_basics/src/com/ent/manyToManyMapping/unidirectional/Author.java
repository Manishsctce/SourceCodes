package com.ent.manyToManyMapping.unidirectional;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.GeneratedValue;  
import javax.persistence.GenerationType;  
import javax.persistence.Id;
import javax.persistence.ManyToMany;  

@Entity  
public class Author  
{  
	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private Long authorId;
	
	@Column(name="author_name")
	private String authorName;  

	@ManyToMany(targetEntity = Book.class, cascade = CascadeType.ALL)
	private Collection<Book> books = new ArrayList<>();
	
	public Long getAuthorId(){  
		return authorId;  
	}  
	
	public void setAuthorId(Long authorId){  
		this.authorId = authorId;  
	}  
  
	public String getAuthorName(){  
		return authorName;  
	}  
	public void setAuthorName(String authorName){  
		this.authorName = authorName;  
	}  
	
	public Collection<Book> getBooks() {
		return books;
	}
	
	public void setBooks(Collection<Book> books) {
		this.books = books;
	}
	
	public Author() {}
	public Author(String authorName){
		this.authorName = authorName;
	}
} 
