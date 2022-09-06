package mms.utility;

import java.io.Serializable;

public enum Size implements Serializable, Comparable<Size> {

    SMALL("小型"),
    MEDIUM("中型"),
    LARGE("大型");
    public final String name;

    Size(String name) {
        this.name = name;
    }
}