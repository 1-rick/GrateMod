package GrateMod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import GrateMod.blocks.GMBlocks;
import GrateMod.common.CommonProxy;
import GrateMod.items.Grate;

@Mod(modid = GrateMod.MODID, version = GrateMod.VERSION)
public class GrateMod {
    public static final String MODID = "GrateMod";
    public static final String VERSION = "${version}";
    public static final Logger logger = LogManager.getLogger(MODID);

    public static final Item grate_ = new Grate();
    public static final Block blork_ = new Blork(Material.iron);
    public GrateMod() {
        logger.info("Grate!");
    }

    @SidedProxy(clientSide="GrateMod.client.ClientProxy", serverSide="GrateMod.common.CommonProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // item+block init+registering
        // config handling
        logger.info("GrateMod preInit");
        GameRegistry.registerItem(grate_, "grate");
        GameRegistry.registerBlock(blork_, "Blork");
        GameRegistry.addShapelessRecipe(new ItemStack(GMBlocks.blork), new ItemStack(Blocks.dirt));
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        // proxy, tileentity, entity, gui, packet registration
        logger.info("GrateMod init");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        // some example code
        logger.info("GrateMod postInit");
        proxy.init();
    }
}