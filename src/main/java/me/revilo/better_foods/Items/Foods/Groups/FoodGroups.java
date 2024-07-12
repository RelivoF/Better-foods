package me.revilo.better_foods.Items.Foods.Groups;


import me.revilo.better_foods.BetterFoods;
import me.revilo.better_foods.Items.Foods.Foods;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class FoodGroups {
    public static final ItemGroup BREAD = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(BetterFoods.MODID, "bread"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.bread"))
                    .icon(() -> new ItemStack(Foods.RAW_DOUGH)).entries(((displayContext, entries) -> {
                        entries.add(Items.BREAD);
                        entries.add(Foods.RAW_DOUGH);

                    })).build());
}
