package com.example.recyclerviewpermisos2;

public class PermissionItem {
    private String name;
    private boolean isEnabled;

    public PermissionItem(String name, boolean isEnabled) {
        this.name = name;
        this.isEnabled = isEnabled;
    }

    public String getName() {
        return name;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }
}

