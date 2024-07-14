package me.revilo.better_foods;

import me.revilo.better_foods.Items.Foods.Foods;
import me.revilo.better_foods.Items.Foods.Groups.FoodGroups;
import me.revilo.better_foods.Items.Foods.Toppings;
import net.fabricmc.api.ModInitializer;

public class BetterFoods implements ModInitializer {

    public static final String MODID = "betterfoods";


    @Override
    public void onInitialize() {
        Toppings.load();
        Foods.load();
        FoodGroups.load();
    }
}
