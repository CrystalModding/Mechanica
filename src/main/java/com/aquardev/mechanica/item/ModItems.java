package com.aquardev.mechanica.item;

import com.aquardev.mechanica.Mechanica;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final CreativeModeTab CREATIVE_MODE_TAB = new CreativeModeTab("mechanica.creativeTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.WRENCH.get());
        }
    };

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mechanica.MOD_ID);

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


    public static final RegistryObject<Item> WRENCH = ITEMS.register("wrench", () -> new Item(new Item.Properties().tab(CREATIVE_MODE_TAB).stacksTo(1)));
}
