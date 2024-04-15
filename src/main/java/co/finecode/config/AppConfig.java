package co.finecode.config;

import co.finecode.persist.inventory.FoodItemDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    FoodItemDao FoodItemDataSource() {
        return new FoodItemDao();
    }
}
