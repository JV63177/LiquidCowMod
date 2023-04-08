package net.JV63177.liquidcowmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab LIQUIDCOW_TAB = new CreativeModeTab("liquid_cow_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.COW_INGOT.get());
        }
    };
}
