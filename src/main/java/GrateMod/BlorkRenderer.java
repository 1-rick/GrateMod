package GrateMod;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.world.IBlockAccess;

public class BlorkRenderer implements ISimpleBlockRenderingHandler {

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

            renderer.setRenderBounds(0.25, 0.75, 0, 0.3125, 0.875, 1.0);
            renderer.renderStandardBlock(block, x, y, z);

            renderer.setRenderBounds(0.6875, 0.75, 0, 0.75, 0.875, 1.0);
            renderer.renderStandardBlock(block, x, y, z);

            renderer.setRenderBounds(0, 0.75, 0.25, 1.0, 0.875, 0.3125);
            renderer.renderStandardBlock(block, x, y, z);

            renderer.setRenderBounds(0, 0.75, 0.6875, 1.0, 0.875, 0.75);
            renderer.renderStandardBlock(block, x, y, z);
            
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
