package com.br.ecommerce.dtos;

import com.br.ecommerce.entities.Category;

import java.io.Serializable;

public class CategoryDto implements Serializable {

    public static final long serialVersionUID = 1L;

    private Integer id;
    private String name;

    public CategoryDto() {
    }

    public CategoryDto(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public CategoryDto(Category category) {
        id = category.getId();
        name = category.getName();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
