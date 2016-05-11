package com.roberterrera.retrofit2_dagger2_practice;

/**
 * Created by Rob on 5/11/16.
 */
public class Contributor {
    String login;
    String html_url;

    int contributions;

    @Override
    public String toString() {
        return login + " (" + contributions + ")";
    }
}
