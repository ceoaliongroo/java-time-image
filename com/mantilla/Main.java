package com.mantilla;

import net.sourceforge.zmanim.*;
import net.sourceforge.zmanim.util.*;

import java.util.TimeZone;


public class Main {

    public static void main(String[] args) {
        String locationName = "Lakewood, NJ";
        double latitude = 40.096; //latitude of Lakewood, NJ
        double longitude = -74.222; //longitude of Lakewood, NJ
        double elevation = 0; //optional elevation
        //use a Valid Olson Database timezone listed in java.util.TimeZone.getAvailableIDs()
        TimeZone timeZone = TimeZone.getTimeZone("Israel/Jerusalem");
        //create the location object
        GeoLocation location = new GeoLocation(locationName, latitude, longitude, elevation, timeZone);
        //create the ZmanimCalendar
        ZmanimCalendar zc = new ZmanimCalendar(location);
        //optionally set the internal calendar
        //zc.getCalendar().set(1969, Calendar.FEBRUARY, 8);
        System.out.println("Today's Zmanim for " + locationName);
        System.out.println("Sunrise: " + zc.getSunrise()); //output sunrise
        System.out.println("Sof Zman Shema GRA: " + zc.getSofZmanShmaGRA()); //output Sof Zman Shema GRA
        System.out.println("Sunset: " + zc.getSunset()); //output sunset
    }
}
