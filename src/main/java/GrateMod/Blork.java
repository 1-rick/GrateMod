package GrateMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Blork extends Block {

    protected Blork(Material mat) {
        super(mat);
        setBlockName("Blork");
        setBlockTextureName("GrateMod:grate-top");
        setBlockBounds(0.0F, 0.75F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public int getRenderType() {
        return GrateModRenderer.renderID;
    }
    /*
     * @Override public void registerBlockIcons(IIconRegister iconRegister) {
     * textures = new IIcon[6];
     * System.out.println("FrostBlock::registerBlockIcons"); for (int i = 0; i <
     * 6; i++) { textures[i] = iconRegister.registerIcon("frostmod:frostBlock" +
     * Integer.toString(i)); } }
     * 
     * @Override public IIcon getIcon(int side, int meta) { return
     * textures[side]; }
     */
}
