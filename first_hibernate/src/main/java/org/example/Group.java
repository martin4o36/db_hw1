package org.example;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.Set;

public class Group {
    @Id
    private int groupId;

    @ManyToMany
    private Set<User> users;
    @ManyToMany
    private Set<Permission> permissions;
}
