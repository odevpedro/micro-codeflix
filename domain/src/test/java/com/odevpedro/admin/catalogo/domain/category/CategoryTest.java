package com.odevpedro.admin.catalogo.domain.category;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CategoryTest {

    @Test
    public void givenAnInvalidNullName_whenCallNewCategoryAndValidate_thenshouldReceiveError(){
    final String expectedName = null;
    final var expectedErrorMessage = "'name' should not be null",
    final var expectedErrorCount = 1;
    final var expectedDescription = "A categoria mais assistida";
    final var expectedIsActive = true;

   final var  actualCategory =
           Category.newCategory(expectedName, expectedDescription, expectedIsActive);


        actualCategory.validate();
        final var actualExpection =
                Assertions.assertThrows(DomainException.class, () -> actualCategory.validate());
        Assertions.assertEquals(expectedErrorCount,actualExpection.getErros().size());
        Assertions.assertEquals(expectedErrorMessage,actualExpection.getErros().get(0));




/*        Assertions.assertNotNull(actualCategory);
        Assertions.assertNotNull(actualCategory.getId());
        Assertions.assertNotNull(expectedName, actualCategory.getName());
        Assertions.assertNotNull(expectedName, actualCategory.getDescription());
        Assertions.assertNotEquals(expectedName, actualCategory.isActive());
        Assertions.assertNotNull(actualCategory.getCreatedAt());
        Assertions.assertNotNull(actualCategory.getUpdatedAt());
        Assertions.assertNull(actualCategory.getDeletedAt());*/

    }
}
