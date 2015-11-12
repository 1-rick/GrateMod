package GrateMod.client;

import GrateMod.GrateModRenderer;
import GrateMod.common.CommonProxy;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
    @Override
    public void init() {
        System.out.println("ClientProxy::init");
        registerRenderers();
    }

    // Client Only
    @Override
    public void registerRenderers() {
        System.out.println("ClientProxy.registerRenderers()");
        GrateModRenderer.renderID = RenderingRegistry.getNextAvailableRenderId();
        System.out.print("    render ID: ");
        System.out.println(GrateModRenderer.renderID);
        RenderingRegistry.registerBlockHandler(new GrateModRenderer());
    }

}
