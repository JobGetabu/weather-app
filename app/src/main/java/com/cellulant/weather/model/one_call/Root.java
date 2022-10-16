package com.cellulant.weather.model.one_call;
import java.util.ArrayList;
import java.util.List;
public class Root{
    public double lat;
    public double lon;
    public String timezone;
    public int timezone_offset;
    public Current current;
    public ArrayList<Hourly> hourly;
    public ArrayList<Daily> daily;
}
