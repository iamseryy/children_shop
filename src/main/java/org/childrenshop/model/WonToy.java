package org.childrenshop.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public record WonToy(int toyId, Calendar wonDate) {
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return toyId + ";" + dateFormat.format(this.wonDate.getTime());
    }
}
