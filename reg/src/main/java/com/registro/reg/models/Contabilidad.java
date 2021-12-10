package com.registro.reg.models;


import org.springframework.data.annotation.Id;
import java.util.Date;


public class Contabilidad {
    @Id
    private String eqid;
    private String invoice;
    private String dateinvoice;
    private String pricenet;
    private String iva;
    private String shopplace;
    private String warranty;

    public Contabilidad ( String eqid, String invoice, String dateinvoice, String pricenet, String iva, String shopplace, String warranty) {
        this.eqid = eqid;
        this.invoice = invoice;
        this.dateinvoice = dateinvoice;
        this.pricenet = pricenet;
        this.iva = iva;
        this.shopplace = shopplace;
        this.warranty = warranty;

    }

    public String geteqid() {
        return eqid;
    }

    public void seteqid(String eqid) {
        this.eqid = eqid;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public String getDateinvoice() {
        return dateinvoice;
    }

    public void setDateinvoice(String dateinvoice) {
        this.dateinvoice = dateinvoice;
    }

    public String getpricenet() {
        return pricenet;
    }

    public void setPricenet(String pricenet) {
        this.pricenet = pricenet;
    }

    public String getiva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }

    public String getShopplace() {
        return shopplace;
    }

    public void setShopplace(String shopplace) {
        this.shopplace = shopplace;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

}
