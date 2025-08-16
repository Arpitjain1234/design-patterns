package model;

import enums.Nature;

public class NumberPlate {
    String numberPlate;
    Nature nature;

    public NumberPlate(String numberPlatestr,Nature nature){
        this.nature = nature;
        this.numberPlate = numberPlatestr;
    }
}
