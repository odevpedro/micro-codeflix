package com.odevpedro.admin.catalogo.domain.category;

import com.odevpedro.admin.catalogo.domain.exceptions.DomainException;
import com.odevpedro.admin.catalogo.domain.validation.handler.ThrowsValidationHandler;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CategoryTest {

    @Test
    public void givenAnInvalidNullName_whenCallNewCategoryAndValidate_thenshouldReceiveError(){
    final String expectedName = null;
    final var expectedErrorMessage = "'name' should not be null";
    final var expectedErrorCount = 1;
    final var expectedDescription = "A categoria mais assistida";
    final var expectedIsActive = true;

   final var  actualCategory = Category.newCategory(expectedName, expectedDescription, expectedIsActive);
   final var actualExpection = Assertions.assertThrows(DomainException.class, () -> actualCategory.validate(new ThrowsValidationHandler()));
   Assertions.assertEquals(expectedErrorCount,actualExpection.getErrors().size()); Assertions.assertEquals(expectedErrorMessage,actualExpection.getErrors().get(0));




    }
}
