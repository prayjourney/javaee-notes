/**
 * The Apache License 2.0 Copyright (c) 2017 Victor Zhang
 */
package me.chongfeng.javaee.cookie.bean;

/**
 * @author victor zhang
 * @date 2017/3/26.
 */
public class Topic {

    private int id;

    private String title;

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
