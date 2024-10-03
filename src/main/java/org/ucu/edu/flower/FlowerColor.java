package org.ucu.edu.flower;

public enum FlowerColor {

    RED("#FF0000"), WHITE("#FFFFFF"), YELLOW("#FFFF00");

    private final String rgb;

    private FlowerColor(String rgb) {
        this.rgb = rgb;
    }

    public String getRgb() {
        return this.rgb;
    }

}
