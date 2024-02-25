package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Permission {
    @Id
    private int permissionId;
    private String name;
}
