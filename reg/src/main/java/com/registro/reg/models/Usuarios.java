package com.registro.reg.models;

import org.springframework.data.annotation.Id;

public class Usuarios {
    @Id
    private String eqid;
    private String user1;
    private String passw1;
    private String userName1;
    private String asingdata1;
    private String usertype1;
    private String user2;
    private String passw2;
    private String userName2;
    private String asingdata2;
    private String usertype2;
    private String user3;
    private String passw3;
    private String userName3;
    private String asingdata3;
    private String usertype3;

    public Usuarios(String eqid, String user1, String passw1, String userName1, String asingdata1, String usertype1, String user2, String passw2, String userName2, String asingdata2, String usertype2, String user3, String passw3, String userName3, String asingdata3, String usertype3) {
        this.eqid = eqid;
        this.user1 = user1;
        this.passw1 = passw1;
        this.userName1 = userName1;
        this.asingdata1 = asingdata1;
        this.usertype1 = usertype1;
        this.user2 = user2;
        this.passw2 = passw2;
        this.userName2 = userName2;
        this.asingdata2 = asingdata2;
        this.usertype2 = usertype2;
        this.user3 = user3;
        this.passw3 = passw3;
        this.userName3 = userName3;
        this.asingdata3 = asingdata3;
        this.usertype3 = usertype3;
    }

    public String getEqid() {
        return eqid;
    }

    public void setEqid(String eqid) {
        this.eqid = eqid;
    }

    public String getUser1() {
        return user1;
    }

    public void setUser1(String user1) {
        this.user1 = user1;
    }

    public String getPassw1() {
        return passw1;
    }

    public void setPassw1(String passw1) {
        this.passw1 = passw1;
    }

    public String getUserName1() {
        return userName1;
    }

    public void setUserName1(String userName1) {
        this.userName1 = userName1;
    }

    public String getAsingdata1() {
        return asingdata1;
    }

    public void setAsingdata1(String asingdata1) {
        this.asingdata1 = asingdata1;
    }

    public String getUsertype1() {
        return usertype1;
    }

    public void setUsertype1(String usertype1) {
        this.usertype1 = usertype1;
    }

    public String getUser2() {
        return user2;
    }

    public void setUser2(String user2) {
        this.user2 = user2;
    }

    public String getPassw2() {
        return passw2;
    }

    public void setPassw2(String passw2) {
        this.passw2 = passw2;
    }

    public String getUserName2() {
        return userName2;
    }

    public void setUserName2(String userName2) {
        this.userName2 = userName2;
    }

    public String getAsingdata2() {
        return asingdata2;
    }

    public void setAsingdata2(String asingdata2) {
        this.asingdata2 = asingdata2;
    }

    public String getUsertype2() {
        return usertype2;
    }

    public void setUsertype2(String usertype2) {
        this.usertype2 = usertype2;
    }

    public String getUser3() {
        return user3;
    }

    public void setUser3(String user3) {
        this.user3 = user3;
    }

    public String getPassw3() {
        return passw3;
    }

    public void setPassw3(String passw3) {
        this.passw3 = passw3;
    }

    public String getUserName3() {
        return userName3;
    }

    public void setUserName3(String userName3) {
        this.userName3 = userName3;
    }

    public String getAsingdata3() {
        return asingdata3;
    }

    public void setAsingdata3(String asingdata3) {
        this.asingdata3 = asingdata3;
    }

    public String getUsertype3() {
        return usertype3;
    }

    public void setUsertype3(String usertype3) {
        this.usertype3 = usertype3;
    }
}
