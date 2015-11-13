package GrateMod;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.world.IBlockAccess;

public class GrateModRenderer implements ISimpleBlockRenderingHandler {

    public static int renderID = -1;

    @Override
    public void renderInventoryBlock(Block block, int metadata, int modelId, RenderBlocks renderer) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId,
            RenderBlocks renderer) {
        if (modelId == renderID) {
            renderer.setRenderBounds(0, 0.875, 0, 1.0, 1.0, 1.0);
            renderer.renderStandardBlock(block, x, y, z);

            renderer.setRenderBounds(.25, 0.75, 0, .375, 0.875, 1.0);
            renderer.renderStandardBlock(block, x, y, z);

            renderer.setRenderBounds(.75, 0.75, 0, .875, 0.875, 1.0);
            renderer.renderStandardBlock(block, x, y, z);
/*
            renderer.setRenderBounds(0, 0.75, 0, 1.0, 0.875, 1.0);
            renderer.renderStandardBlock(block, x, y, z);

            renderer.setRenderBounds(0, 0.75, 0, 1.0, 0.875, 1.0);
            renderer.renderStandardBlock(block, x, y, z);
*/            
            return true;
        }

        return false;
    }

    @Override
    public boolean shouldRender3DInInventory(int modelId) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int getRenderId() {
        // TODO Auto-generated method stub
        return renderID;
    }

}
