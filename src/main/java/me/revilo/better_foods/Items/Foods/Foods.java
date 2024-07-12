package me.revilo.better_foods.Items.Foods;

import me.revilo.better_foods.BetterFoods;
import me.revilo.better_foods.Items.Foods.Comp.FoodComp;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Foods {
    public static Item register(Item item, String id) {
        Identifier itemID = Identifier.of(BetterFoods.MODID, id);
        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);
        return registeredItem;
    }

    public static final Item RAW_DOUGH = register(
            new Item(new Item.Settings().food(FoodComp.DOUGH)),
            "raw_dough"
    );



}
