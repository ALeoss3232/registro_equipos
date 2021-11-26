package com.registro.reg.models;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Register {
    @Id
    private String eqid;
    private String eqtype;
    private String model;
    private String numSeries;
    private String numProd;
    private String procMarc;
    private String procModel;
    private String procVel;
    private String ram;
    private String discoType;
    private String discoCapacity;
    private Boolean tGraphicalInd;
    private String tGraphicMarc;
    private int screenSize;
    private Boolean USB;
    private Boolean HDMI;
    private Boolean sAudio;
    private Boolean eAudio;
    private Boolean bluetooth;
    private Boolean wifi;
    private Boolean ethernet;
    private Boolean webcam;
    private Boolean mouse;
    private Boolean keyboard;
    private Boolean unityCD;
    private String other;
    private Date lastChange;



    public Register(String eqid, Date lastChange, String eqtype, String model, String numSeries, String numProd, String procMarc, String procModel, String procVel, String ram, String discoType, String discoCapacity, Boolean tGraphicalInd, String tGraphicMarc, int screenSize, Boolean USB, Boolean HDMI, Boolean sAudio, Boolean eAudio, Boolean bluetooth, Boolean wifi, Boolean ethernet, Boolean webcam, Boolean mouse, Boolean keyboard, Boolean unityCD, String other) {
        this.eqid = eqid;
        this.eqtype = eqtype;
        this.model = model;
        this.numSeries = numSeries;
        this.numProd = numProd;
        this.procMarc = procMarc;
        this.procModel = procModel;
        this.procVel = procVel;
        this.ram = ram;
        this.discoType = discoType;
        this.discoCapacity = discoCapacity;
        this.tGraphicalInd = tGraphicalInd;
        this.tGraphicMarc = tGraphicMarc;
        this.screenSize = screenSize;
        this.USB = USB;
        this.HDMI = HDMI;
        this.sAudio = sAudio;
        this.eAudio = eAudio;
        this.bluetooth = bluetooth;
        this.wifi = wifi;
        this.ethernet = ethernet;
        this.webcam = webcam;
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.unityCD = unityCD;
        this.other = other;
        this.lastChange = lastChange;
    }

    public String getEqid() {
        return eqid;
    }

    public void setEqid(String eqid) {
        this.eqid = eqid;
    }

    public Date getLastChange() {
        return lastChange;
    }

    public void setLastChange(Date lastChange) {
        this.lastChange = lastChange;
    }

    public String getEqtype() {
        return eqtype;
    }

    public void setEqtype(String eqtype) {
        this.eqtype = eqtype;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumSeries() {
        return numSeries;
    }

    public void setNumSeries(String numSeries) {
        this.numSeries = numSeries;
    }

    public String getNumProd() {
        return numProd;
    }

    public void setNumProd(String numProd) {
        this.numProd = numProd;
    }

    public String getProcMarc() {
        return procMarc;
    }

    public void setProcMarc(String procMarc) {
        this.procMarc = procMarc;
    }

    public String getProcModel() {
        return procModel;
    }

    public void setProcModel(String procModel) {
        this.procModel = procModel;
    }

    public String getProcVel() {
        return procVel;
    }

    public void setProcVel(String procVel) {
        this.procVel = procVel;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getDiscoType() {
        return discoType;
    }

    public void setDiscoType(String discoType) {
        this.discoType = discoType;
    }

    public String getDiscoCapacity() {
        return discoCapacity;
    }

    public void setDiscoCapacity(String discoCapacity) {
        this.discoCapacity = discoCapacity;
    }

    public Boolean gettGraphicalInd() {
        return tGraphicalInd;
    }

    public void settGraphicalInd(Boolean tGraphicalInd) {
        this.tGraphicalInd = tGraphicalInd;
    }

    public String gettGraphicMarc() {
        return tGraphicMarc;
    }

    public void settGraphicMarc(String tGraphicMarc) {
        this.tGraphicMarc = tGraphicMarc;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public Boolean getUSB() {
        return USB;
    }

    public void setUSB(Boolean USB) {
        this.USB = USB;
    }

    public Boolean getHDMI() {
        return HDMI;
    }

    public void setHDMI(Boolean HDMI) {
        this.HDMI = HDMI;
    }

    public Boolean getsAudio() {
        return sAudio;
    }

    public void setsAudio(Boolean sAudio) {
        this.sAudio = sAudio;
    }

    public Boolean geteAudio() {
        return eAudio;
    }

    public void seteAudio(Boolean eAudio) {
        this.eAudio = eAudio;
    }

    public Boolean getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(Boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public Boolean getWifi() {
        return wifi;
    }

    public void setWifi(Boolean wifi) {
        this.wifi = wifi;
    }

    public Boolean getEthernet() {
        return ethernet;
    }

    public void setEthernet(Boolean ethernet) {
        this.ethernet = ethernet;
    }

    public Boolean getWebcam() {
        return webcam;
    }

    public void setWebcam(Boolean webcam) {
        this.webcam = webcam;
    }

    public Boolean getMouse() {
        return mouse;
    }

    public void setMouse(Boolean mouse) {
        this.mouse = mouse;
    }

    public Boolean getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Boolean keyboard) {
        this.keyboard = keyboard;
    }

    public Boolean getUnityCD() {
        return unityCD;
    }

    public void setUnityCD(Boolean unityCD) {
        this.unityCD = unityCD;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}
