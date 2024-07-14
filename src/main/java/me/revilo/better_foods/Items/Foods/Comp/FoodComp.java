package me.revilo.better_foods.Items.Foods.Comp;

import net.minecraft.component.type.FoodComponent;

public class FoodComp {
    public static final FoodComponent RAW_DOUGH = new FoodComponent.Builder()
            .alwaysEdible()
            .nutrition(1)
            .build();

    public static final FoodComponent TOPPING = new FoodComponent.Builder()
            .alwaysEdible()
            .nutrition(1)
            .build();
}
