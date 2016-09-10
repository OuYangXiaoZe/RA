package cn.ra.pojo;

public class Dish {
    private Integer id;

    private String dishname;

    private Integer dishtype;

    private Integer dishprice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDishname() {
        return dishname;
    }

    public void setDishname(String dishname) {
        this.dishname = dishname == null ? null : dishname.trim();
    }

    public Integer getDishtype() {
        return dishtype;
    }

    public void setDishtype(Integer dishtype) {
        this.dishtype = dishtype;
    }

    public Integer getDishprice() {
        return dishprice;
    }

    public void setDishprice(Integer dishprice) {
        this.dishprice = dishprice;
    }
}