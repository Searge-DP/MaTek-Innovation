package com.Dude_808.item;

import com.Dude_808.main.Refs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;


public class ModItems {
	
	public static Item coalDust;

	public static void initItems()
     {

		 GameRegistry.registerItem(ModItems.coalDust = new coalDust(), "coaldust");

     }
		
	}
