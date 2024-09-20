package com.abc.restaurant.repository;

import com.abc.restaurant.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {
    // Additional custom query methods can be added here if necessary
}
