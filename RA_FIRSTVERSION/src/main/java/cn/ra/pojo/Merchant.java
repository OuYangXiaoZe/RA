package cn.ra.pojo;

public class Merchant {
    private Integer id;

    private String merchantname;

    private String merchantaddress;

    private Integer merchanttype;

    private Integer merchantlever;

    private Integer userid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMerchantname() {
        return merchantname;
    }

    public void setMerchantname(String merchantname) {
        this.merchantname = merchantname == null ? null : merchantname.trim();
    }

    public String getMerchantaddress() {
        return merchantaddress;
    }

    public void setMerchantaddress(String merchantaddress) {
        this.merchantaddress = merchantaddress == null ? null : merchantaddress.trim();
    }

    public Integer getMerchanttype() {
        return merchanttype;
    }

    public void setMerchanttype(Integer merchanttype) {
        this.merchanttype = merchanttype;
    }

    public Integer getMerchantlever() {
        return merchantlever;
    }

    public void setMerchantlever(Integer merchantlever) {
        this.merchantlever = merchantlever;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}