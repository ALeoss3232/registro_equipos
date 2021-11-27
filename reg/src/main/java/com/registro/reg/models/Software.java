package com.registro.reg.models;

import org.springframework.data.annotation.Id;

public class Software{
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



    public Software (String Edition,Boolean Typesystem,String Manufantivirus,Boolean Licenantivirus,String LicOfic,String LibOfic,String other1, String licother1,String other2, String licother2,String other3, String licother3 ){
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

    public String getLicother1() {
        return licother1;
    }

    public void setLicother1(String licother1) {
        this.licother1 = licother1;
    }

    public String getother2() {
        return other2;
    }

    public void setother2(String other2) {
        this.other2 = other2;
    }

    public String getLicother2() {
        return licother2;
    }

    public void setLicother2(String licother2) {
        this.licother2 = licother2;
    }

    public String getother3() {
        return other3;
    }

    public void setother3(String other3) {
        this.other3 = other3;
    }

    public String getLicother3() {
        return licother3;
    }

    public void setLicother3(String licother3) {
        this.licother3 = licother3;
    }



}



