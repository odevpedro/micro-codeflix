package com.odevpedro.admin.catalogo.domain.category;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CategoryTest {

    @Test
    public void givenAnValidParams_whenCallNewCategory_thenInstantiateACategory(){
    final var expectedName = "Filmes";
    final var expectedDescription = "A categoria mais assistida";
    final var expectedIsActive = true;

   final var actualCategory = Category.newCategory(expectedName, expectedDescription, expectedIsActive);

        Assertions.assertNotNull(actualCategory);
        Assertions.assertNotNull(actualCategory.getId());
        Assertions.assertEquals(expectedName, actualCategory.getName);
        Assertions.assertEquals(expectedName, actualCategory.getDescription);
        Assertions.assertEquals(expectedName, actualCategory.isActive);
        Assertions.assertNotNull(expectedName, actualCategory.getCreatedAt);
        Assertions.assertNotNull(expectedName, actualCategory.getUpdatedAt);
        Assertions.assertNull(expectedName, actualCategory.getDeletedAt);

    }
}
