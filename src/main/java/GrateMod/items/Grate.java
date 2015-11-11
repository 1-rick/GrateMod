package GrateMod.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import GrateMod.GrateMod;

public class Grate extends Item {

    public Grate()
    {
        GrateMod.logger.info("Grate()");
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMisc);
        setUnlocalizedName("Grate");
    }

    @SideOnly(Side.CLIENT)
    private IIcon icons;

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IIconRegister registrar)
    {
        icons = registrar.registerIcon("GrateMod:Grate");
    }

    @SideOnly(Side.CLIENT)
    @Override
    
    public IIcon getIconFromDamage(int damage)
    {
        return icons;
    }

}
