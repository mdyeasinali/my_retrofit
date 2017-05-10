/*
 * Created by Shaon on 8/14/16 10:38 PM
 * Copyright (c) 2016. This is free to use in any software.
 * You must provide developer name on your project.
 */

package org.mytriangle.com.myretrofit2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Shaon on 8/14/2016.
 */
public class People {
    @SerializedName("id")
    private String id;

    @SerializedName("name")
    private String name;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }
}




