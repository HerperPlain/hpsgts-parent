package com.hpsgts.crm.role.entity;

import java.util.Date;

public class RoleEntity {
    private String id;
    private String roleName;
    private String roleDesc;
    private int showOrder;
    private String createUser;
    private Date createTime;
    private String updateUser;
    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public int getShowOrder() {
        return showOrder;
    }

    public void setShowOrder(int showOrder) {
        this.showOrder = showOrder;
    }

    @Override
    public String toString() {
        return "RoleEntity{" +
                "id='" + id + '\'' +
                ", roleName='" + roleName + '\'' +
                ", roleDesc='" + roleDesc + '\'' +
                ", showOrder=" + showOrder +
                '}';
    }
}
