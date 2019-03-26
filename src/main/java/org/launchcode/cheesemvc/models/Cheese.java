package org.launchcode.cheesemvc.models;

public class Cheese {

    public String name;
    public String description;

    public void setName(String tempName) {
        this.name= tempName;
    }

    public String getName() {
        return name;
    }

    public void setDesc(String tempDescription) {
        this.description = tempDescription;
    }

    public String getDesc() {
        return description;
    }
}
