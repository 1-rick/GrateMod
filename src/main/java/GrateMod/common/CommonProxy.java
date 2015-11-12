package GrateMod.common;

import GrateMod.GrateMod;

public class CommonProxy {

    public CommonProxy() {
        GrateMod.logger.info("CommonProxy()");
    }
    public void init() {
        GrateMod.logger.info("CommonProxy.init()");
    }

    public void registerRenderers() {
        GrateMod.logger.info("CommonProxy.registerRenderers()");
    }

}
