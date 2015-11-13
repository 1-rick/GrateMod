package GrateMod.client;

import GrateMod.GrateMod;
import GrateMod.BlorkRenderer;
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
        BlorkRenderer.renderID = RenderingRegistry.getNextAvailableRenderId();
        GrateMod.logger.info("    render ID: " + BlorkRenderer.renderID);
        RenderingRegistry.registerBlockHandler(new BlorkRenderer());
    }

}
