package GrateMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class Blork extends Block {

    private IIcon[] icons;

    protected Blork(Material mat) {
        super(mat);
        setBlockName("Blork");
        setBlockTextureName("GrateMod:grate-top");
        setBlockBounds(0.0F, 0.75F, 0.0F, 1.0F, 1.0F, 1.0F);
        icons = new IIcon[3];
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
        return BlorkRenderer.renderID;
    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegistrar) {

        GrateMod.logger.info("GrateBlork::registerBlockIcons");
        icons[0] = iconRegistrar.registerIcon("GrateMod:grate-bottom");
        icons[1] = iconRegistrar.registerIcon("GrateMod:grate-top");
        icons[2] = iconRegistrar.registerIcon("GrateMod:grate-side");
    }

    @Override
    public IIcon getIcon(int side, int meta) {
        if (side == 0)
            return icons[0];
        else if (side == 1)
            return icons[1];
        else
            return icons[2];
    }

}
