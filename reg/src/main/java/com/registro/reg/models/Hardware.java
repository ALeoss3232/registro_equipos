package com.registro.reg.models;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Hardware {
    @Id
    private String Edition;
    private Boolean Typesystem;
    private String Manufantivirus;
    private Boolean Licenantivirus;
    private String LicOfic;
    private String LibOfic;
    private String other1;
    private String licother1;
    private String other2;
    private String licother2;
    private String other3;
    private String licother3;
    private String notes;


    public Hardware (String Edition,Boolean Typesystem,String Manufantivirus,Boolean Licenantivirus,String LicOfic,String LibOfic,String other1, String licother1,String other2, String licother2,String other3, String licother3 ){
        this.Edition =Edition;
        this.Typesystem =Typesystem;
        this.Manufantivirus=Manufantivirus;
        this.Licenantivirus=Licenantivirus;
        this.LicOfic=LicOfic;
        this.LibOfic=LibOfic;
        this.other1=other1;
        this.licother1=licother1;
        this.other2=other2;
        this.licother2=licother2;
        this.other3=other3;
        this.licother3=licother3;


    }

    public String getEdition() {
        return Edition;
    }

    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    public boolean getTypesystem() {
        return Typesystem;
    }

    public void setTypesystem(boolean Typesystem) {this.Typesystem =Typesystem;}

    public String getManufantivirus() {
        return Manufantivirus;
    }

    public void setManufantivirus(String Manufantivirus) {
        this.Manufantivirus = Manufantivirus;
    }

    public boolean getLicenantivirus() {
        return Licenantivirus;
    }

    public void setLicenantivirus(boolean Licenantivirus ) {this.Licenantivirus=Licenantivirus;}

    public String getLicOfic() {
        return LicOfic;
    }

    public void setLicOfic(String LicOfic) {
        this.LicOfic = LicOfic;
    }

    public String getLibOfic() {
        return LibOfic;
    }

    public void setLibOfic(String LibOfic) {
        this.LibOfic = LibOfic;
    }

    public String getother1() {
        return other1;
    }

    public void setother1(String other1) {
        this.other1 = other1;
    }





}



