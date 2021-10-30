package com.example.demo.pojo;

public class department {
    private Integer id;
    private String dename;

    public department(Integer id, String dename) {
        this.id = id;
        this.dename = dename;
    }

    public department() {
    }

    @Override
    public String toString() {
        return "department{" +
                "id=" + id +
                ", dename='" + dename + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDename() {
        return dename;
    }

    public void setDename(String dename) {
        this.dename = dename;
    }
}
