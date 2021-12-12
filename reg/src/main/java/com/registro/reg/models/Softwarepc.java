package com.registro.reg.models;

import org.springframework.data.annotation.Id;

public class Softwarepc{
    @Id
    private String eqid;
    private String edition;
    private Boolean typesystem;
    private String manufantivirus;
    private Boolean licenantivirus;
    private String licofic;
    private String libofic;
    private String other1;
    private String licother1;
    private String other2;
    private String licother2;
    private String other3;
    private String licother3;
    private String notes;


    public Softwarepc (String eqid,String edition,Boolean typesystem,String manufantivirus,Boolean licenantivirus,String licofic,String libofic,String other1, String licother1,String other2, String licother2,String other3, String licother3, String notes ){
        this.eqid = eqid;
        this.edition =edition;
        this.typesystem =typesystem;
        this.manufantivirus=manufantivirus;
        this.licenantivirus=licenantivirus;
        this.licofic=licofic;
        this.libofic=libofic;
        this.other1=other1;
        this.licother1=licother1;
        this.other2=other2;
        this.licother2=licother2;
        this.other3=other3;
        this.licother3=licother3;
        this.notes=notes;
    }
        public String getEqid() {return eqid;}

        public void setEqid(String eqid) {
            this.eqid = eqid;
        }



    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public Boolean getTypesystem() {
        return typesystem;
    }

    public void setTypesystem(Boolean typesystem) {this.typesystem =typesystem;}

    public String getManufantivirus() {
        return manufantivirus;
    }

    public void setManufantivirus(String manufantivirus) {
        this.manufantivirus = manufantivirus;
    }

    public Boolean getLicenantivirus() {
        return licenantivirus;
    }

    public void setLicenantivirus(Boolean licenantivirus )  {this.licenantivirus=licenantivirus;}

    public String getLicofic() {
        return licofic;
    }

    public void setLicofic(String licOfic) {
        this.licofic = licOfic;
    }

    public String getLibofic() {
        return libofic;
    }

    public void setLibofic(String libOfic) {
        this.libofic = libOfic;
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

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

}




