package co.finecode.persist.inventory;

import co.finecode.dto.inventory.FoodItem;
import co.finecode.dto.recipe.constant.MeasureType;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class FoodItemDao {

    /**
     *
     * @param id
     * @return
     */

    public FoodItem getFoodItem(int id, Connection conn) {
        FoodItem foodItem = new FoodItem();
        Statement stmt = null;

        String sqlString = "SELECT id, category_id, sub_category_id, vendor_id, upc, name, amount, measure_type, " +
                "amount_secondary, measure_type_secondary, description, creation_date, modified_date FROM " +
                "food_item WHERE id = " + id;

        System.out.println(sqlString);

        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sqlString);

             while(rs.next()) {
                foodItem.setId(rs.getInt("id"));
                foodItem.setCategoryId(rs.getInt("category_id"));
                foodItem.setSubCategoryId(rs.getInt("sub_category_id"));
                foodItem.setVendorId(rs.getInt("vendor_id"));
                foodItem.setUpc(rs.getString("upc"));
                foodItem.setName(rs.getString("name"));
                foodItem.setAmount(rs.getFloat("amount"));
                foodItem.setMeasureType(rs.getString("measure_type"));
                foodItem.setAmountSecondary(rs.getFloat("amount_secondary"));
                foodItem.setMeasureTypeSecondary(rs.getString("measure_type_secondary"));
                foodItem.setDescription(rs.getString("description"));
                foodItem.setCreateDate(rs.getDate("creation_date"));
                foodItem.setModifiedDate(rs.getDate("modified_date"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(stmt != null) {
                  stmt.close();
                }
                if(conn != null) {
                    conn.close();
                }
            }
            catch(SQLException ex) {
                System.out.println("Exception closing db Connection getFoodItem: " + ex.getMessage());
                System.out.println("SQL State: " + ex.getSQLState());
            }
        }
        return foodItem;
    }

    /**
     *
     * @return
     */

    public FoodItem getFoodItem() {
        FoodItem foodItem = new FoodItem();

        foodItem.setId(13);
        foodItem.setCategoryId(1);
        foodItem.setSubCategoryId(2);
        foodItem.setUpc("41573 61025");
        foodItem.setAmount(8);
        foodItem.setMeasureType(MeasureType.Name.oz.name());
        foodItem.setCreateDate(new java.util.Date());
        foodItem.setModifiedDate(new java.util.Date());
        foodItem.setName("Some Food");
        foodItem.setDescription("Test Can of Something");
        foodItem.setVendorId(23);
        return foodItem;
    }

    public void SaveFoodItem(FoodItem foodItem) {

    }
}
