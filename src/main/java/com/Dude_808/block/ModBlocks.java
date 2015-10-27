package com.Dude_808.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {

	public static Block cobaltore;
	
	public static void initBlocks(){
	
		GameRegistry.registerBlock(ModBlocks.cobaltore = new CobaltOre(Material.ground), "cobaltore");
	}
}
