package com.Dude_808.main;

import org.apache.logging.log4j.Logger;

import com.Dude_808.block.ModBlocks;
import com.Dude_808.item.ModItems;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(name = Refs.MODNAME , modid = Refs.MODID , version = Refs.VERSION)

public class MainClass {

	@SidedProxy(clientSide="com.Dude_808.main.CommonProxy", serverSide="com.Dude_808.main.ServerProxy")
	public static CommonProxy proxy;
	public static Logger log;


	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e) {
	log.info("Beginning Preinitlization");
	log.info("Initilizing Items");
	ModItems.initItems();
}

	@Mod.EventHandler
	public void init(FMLInitializationEvent e) {
	log.info("Beginning Initlization");
	log.info("Initilizing Blocks");
	ModBlocks.initBlocks();
	log.info("Ending Initilization");
}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e) {

}
	
	static {
        MainClass.log = FMLLog.getLogger();
    }
	
}
