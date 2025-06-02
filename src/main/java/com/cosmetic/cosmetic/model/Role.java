package com.cosmetic.cosmetic.model;

public class Role {

    private Long idRole;
    private String roleName;

    public Role(Long idRole, String role) {
        this.idRole = idRole;
        this.roleName = role;
    }

    public Long getIdRole() {
        return idRole;
    }

    public void setIdRole(Long idRole) {
        this.idRole = idRole;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
