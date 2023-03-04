package com.example.ToastScout;


import android.app.Application;

//created by
public class GlobalVariables extends Application {

    private static String teamNum;
    private static String matchNum;

    private static String eventKey;

    public static String getTeamNum(){
        return teamNum;
    }

    public static void setTeamNum(String tn){
        teamNum = tn;
    }

    public static String getEventKey() {return eventKey;}

    public static void setEventKey(String eK) {eventKey = eK;}

    public static String getMatchNum(){
        return matchNum;
    }

    public static void setMatchNum(String mn){
        matchNum = mn;
    }



}
