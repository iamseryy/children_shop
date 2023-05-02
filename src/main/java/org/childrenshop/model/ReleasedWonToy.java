package org.childrenshop.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public record ReleasedWonToy(int toyId, Calendar releaseDate) {
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return toyId + ";" + dateFormat.format(this.releaseDate.getTime());
    }
}
