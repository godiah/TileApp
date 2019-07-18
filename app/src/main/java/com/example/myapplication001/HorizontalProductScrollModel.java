package com.example.myapplication001;

public class HorizontalProductScrollModel {

    private int productImageTxt;
    private String productTitleTxt;
    private String productDescriptionTxt;
    private String productPriceTxt;

    public HorizontalProductScrollModel(int productImageTxt, String productTitleTxt, String productDescriptionTxt, String productPriceTxt) {
        this.productImageTxt = productImageTxt;
        this.productTitleTxt = productTitleTxt;
        this.productDescriptionTxt = productDescriptionTxt;
        this.productPriceTxt = productPriceTxt;
    }

    public int getProductImageTxt() {
        return productImageTxt;
    }

    public void setProductImageTxt(int productImageTxt) {
        this.productImageTxt = productImageTxt;
    }

    public String getProductTitleTxt() {
        return productTitleTxt;
    }

    public void setProductTitleTxt(String productTitleTxt) {
        this.productTitleTxt = productTitleTxt;
    }

    public String getProductDescriptionTxt() {
        return productDescriptionTxt;
    }

    public void setProductDescriptionTxt(String productDescriptionTxt) {
        this.productDescriptionTxt = productDescriptionTxt;
    }

    public String getProductPriceTxt() {
        return productPriceTxt;
    }

    public void setProductPriceTxt(String productPriceTxt) {
        this.productPriceTxt = productPriceTxt;
    }
}
