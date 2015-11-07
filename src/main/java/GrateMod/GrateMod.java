package GrateMod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.init.Blocks;

@Mod(modid = GrateMod.MODID, version = GrateMod.VERSION)
public class GrateMod {
    public static final String MODID = "examplemod";
    public static final String VERSION = "0.0.1";

    @EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        // some example code
        System.out.println("GrateMod PreInit");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        // some example code
        System.out.println("GrateMod Init");
    }

    @EventHandler
    public void postinit(FMLPostInitializationEvent event) {
        // some example code
        System.out.println("GrateMod PostInit");
    }
}