package co.finecode.dto.inventory;

import java.util.Date;

public class FoodItem {

    private int id;
    private String upc;
    private int categoryId;
    private int subCategoryId;
    private int vendorId;
    private String name;
    private float amount;
    private String measureType;
    private float amountSecondary;
    private String measureTypeSecondary;
    private String description;
    private Date createDate;
    private Date modifiedDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(int subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public int getVendorId() {
        return vendorId;
    }

    public void setVendorId(int vendorId) {
        this.vendorId = vendorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getMeasureType() {
        return measureType;
    }

    public void setMeasureType(String measureType) {
        this.measureType = measureType;
    }

    public float getAmountSecondary() {
        return amountSecondary;
    }

    public void setAmountSecondary(float amountSecondary) {
        this.amountSecondary = amountSecondary;
    }

    public String getMeasureTypeSecondary() {
        return measureTypeSecondary;
    }

    public void setMeasureTypeSecondary(String measureTypeSecondary) {
        this.measureTypeSecondary = measureTypeSecondary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}
