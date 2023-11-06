package com.odevpedro.admin.catalogo.domain.category;

import com.odevpedro.admin.catalogo.domain.AggregateRoot;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;


public class Category extends AggregateRoot<CategoryID> {
    private String name;
    private String description;
    private boolean active;
    private Instant createdAt;
    private Instant updatedAt;
    private Instant deletedAt;


    private Category(CategoryID andId,
                    String aName,
                    String aDescription,
                    boolean isActive,
                    Instant aCreationDate,
                    Instant aUpdateDate,
                    Instant aDeleteDate)
    {
        super(andId);
        this.name = aName;
        this.description = aDescription;
        this.active = isActive;
        this.createdAt = aCreationDate;
        this.updatedAt = aUpdateDate;
        this.deletedAt = aDeleteDate;
    }

    public static Category newCategory(final String aName, final String aDescription, final boolean isActive){
        final var id = CategoryID.unique();
        final var now = Instant.now();
        return new Category(id, aName, aDescription, isActive, now, now, null);
    }

    public CategoryID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isActive() {
        return active;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public Instant getDeletedAt() {
        return deletedAt;
    }
}
