package com.Dude_808.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CobaltOre extends Block {

	protected CobaltOre(final Material al){
		super(al);
		this.setBlockTextureName("Mtk:cobaltore");
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(1.5F);
		this.setResistance(3.0F);
		this.setBlockName("cobaltore");
	}
	

}
