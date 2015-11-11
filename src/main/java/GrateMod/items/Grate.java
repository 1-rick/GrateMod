package GrateMod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Grate extends Item {

    public Grate()
    {
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMisc);
        setUnlocalizedName("Grate");
    }
}
