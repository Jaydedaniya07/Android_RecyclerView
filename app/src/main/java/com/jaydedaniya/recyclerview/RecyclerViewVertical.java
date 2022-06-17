package com.jaydedaniya.recyclerview;

public class RecyclerViewVertical {

    private int path;
    private String heading;
    private String description;
    private String textButton;

    public RecyclerViewVertical(int path, String heading, String description, String textButton) {
        this.path = path;
        this.heading = heading;
        this.description = description;
        this.textButton = textButton;
    }

    public int getPath() {
        return path;
    }

    public void setPath(int path) {
        this.path = path;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTextButton() {
        return textButton;
    }

    public void setTextButton(String textButton) {
        this.textButton = textButton;
    }
}
