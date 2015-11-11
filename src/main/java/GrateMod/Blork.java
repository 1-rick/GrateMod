package GrateMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Blork extends Block {

    protected Blork(Material mat) {
        super(mat);
        setBlockName("Blork");
        setBlockTextureName("GrateMod:grate-top");
    }

}
