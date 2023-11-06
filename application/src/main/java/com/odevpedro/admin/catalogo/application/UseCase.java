package com.odevpedro.admin.catalogo.application;


import com.odevpedro.admin.catalogo.domain.category.Category;

public class UseCase {
    public Category execute(){
        return new Category();
    }
}