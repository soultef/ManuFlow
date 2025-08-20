package com.soultech.user_service.entities;

import jakarta.persistence.*;
import java.util.Set;

/**
 * Represents a user role within the system, such as {@code ROLE_ADMIN}, {@code ROLE_USER}, etc.
 * <p>
 * This entity is part of the Role-Based Access Control (RBAC) model.
 * Roles can be assigned to one or more users, and each user can hold multiple roles.
 * </p>
 *
 * <p>
 * The relationship between {@link UserEntity} and {@link RoleEntity} is Many-to-Many,
 * managed via a join table in {@link UserEntity}.
 * </p>
 *
 * <h2>Example Roles:</h2>
 * <ul>
 *   <li>ROLE_ADMIN</li>
 *   <li>ROLE_MANAGER</li>
 *   <li>ROLE_USER</li>
 * </ul>
 */
@Entity
@Table(name = "roles")
public class RoleEntity {

    /**
     * Unique identifier for the role.
     * Auto-generated primary key.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long roleId;

    /**
     * The name of the role.
     * <p>
     * Must be unique and not null.
     * Common format: {@code ROLE_ADMIN}, {@code ROLE_USER}, etc.
     * </p>
     */
    @Column(nullable = false, unique = true)
    private String name;

    /**
     * Users assigned to this role.
     * <p>
     * This is the inverse side of the Many-to-Many relationship with {@link UserEntity}.
     * Managed by the {@code roles} field in {@link UserEntity}.
     * </p>
     */
    @ManyToMany(mappedBy = "roles")
    private Set<UserEntity> users;

    // ─────────────────────────────────────────────
    // Getters and Setters
    // ─────────────────────────────────────────────

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<UserEntity> getUsers() {
        return users;
    }

    public void setUsers(Set<UserEntity> users) {
        this.users = users;
    }
}
