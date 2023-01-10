package com.example.pract1;

class Contributor {

    private String login;
    private int contributions;

    @Override
    public String toString() {
        return login + " (" + contributions + ")";
    }
}