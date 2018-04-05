package com.example.saran.recyclerview_customlist;

public class ListModel {

    int logo;
    String company;
    String ceo;

    public ListModel(int logo, String company, String ceo) {
        this.logo = logo;
        this.company = company;
        this.ceo = ceo;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }


}
