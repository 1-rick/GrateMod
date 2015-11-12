package GrateMod.client;

import GrateMod.GrateMod;
import GrateMod.GrateModRenderer;
import GrateMod.common.CommonProxy;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

    public ClientProxy() {
        GrateMod.logger.info("ClientProxy()");
    }

    @Override
    public void init() {
        GrateMod.logger.info("ClientProxy::init");
        registerRenderers();
    }

    // Client Only
    @Override
    public void registerRenderers() {
        GrateMod.logger.info("ClientProxy.registerRenderers()");
        GrateModRenderer.renderID = RenderingRegistry.getNextAvailableRenderId();
        GrateMod.logger.info("    render ID: " + GrateModRenderer.renderID);
        RenderingRegistry.registerBlockHandler(new GrateModRenderer());
    }

}
