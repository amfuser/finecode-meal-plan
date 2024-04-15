package co.finecode.controller;

import co.finecode.dto.inventory.FoodItem;
import co.finecode.persist.DbConnection;
import co.finecode.persist.inventory.FoodItemDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class FoodItemController {

    @Autowired
    FoodItemDao foodItemDao;

//    @Autowired
//    ResponseBody response;

    public FoodItemController() {
        this.foodItemDao = foodItemDao;
        //this.response = response;
    }

    @GetMapping("/fooditem/{id}")
    public FoodItem getId(@PathVariable int id) {
        var conn = DbConnection.getConnection();
        FoodItem foodItem = foodItemDao.getFoodItem(id, conn);
        return foodItem;
    }

    @PostMapping("/fooditem")
    public String SaveFoodItem(FoodItem foodItem) {
        foodItemDao.SaveFoodItem(foodItem);
        return "";
    }
}
