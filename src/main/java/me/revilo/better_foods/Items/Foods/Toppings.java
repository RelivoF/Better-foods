package me.revilo.better_foods.Items.Foods;

import me.revilo.better_foods.Items.Foods.Comp.FoodComp;
import net.minecraft.item.Item;

public class Toppings {
    public static final Item SPTINKLES = Foods.register(
            new Item(new Item.Settings().food(FoodComp.TOPPING)),
            "sprinkles"
    );

    public static void load() {}
}
