package GrateMod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.init.Blocks;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = GrateMod.MODID, version = GrateMod.VERSION)
public class GrateMod {
    public static final String MODID = "GrateMod";
    public static final String VERSION = "${version}";
    public static final Logger logger = LogManager.getLogger(MODID);

    public GrateMod() {
        logger.info("Grate!");
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // item+block init+registering
        // config handling
        logger.info("GrateMod preInit");
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
    }
}