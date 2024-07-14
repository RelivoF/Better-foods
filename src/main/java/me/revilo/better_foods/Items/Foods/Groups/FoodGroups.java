package me.revilo.better_foods.Items.Foods.Groups;


import me.revilo.better_foods.BetterFoods;
import me.revilo.better_foods.Items.Foods.Foods;
import me.revilo.better_foods.Items.Foods.Toppings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class FoodGroups {
    public static final RegistryKey<ItemGroup> FOODS_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(BetterFoods.MODID, "item_group"));
    public static final ItemGroup FOODS = FabricItemGroup.builder()
            .displayName(Text.translatable("itemGroup.bread"))
            .icon(() -> new ItemStack(Foods.RAW_DOUGH)).entries(((displayContext, entries) -> {
                entries.add(Items.BREAD);
                entries.add(Foods.RAW_DOUGH);
                entries.add(Toppings.SPTINKLES);
            }))

            .build();


    public static void load() {
        Registry.register(Registries.ITEM_GROUP, FOODS_KEY, FOODS);

    }
}
