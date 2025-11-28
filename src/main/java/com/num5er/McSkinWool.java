package com.num5er;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
	modid = McSkinWool.MODID,
	name = McSkinWool.NAME,
	version = McSkinWool.VERSION
)
public class McSkinWool {
	public static final String MODID = "mcskinwool";
	public static final String NAME = "Sample Mod 1.12";
	public static final String VERSION = "1.0";
	
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	
	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent preinit) {
		LOGGER.info("Hello, world!");
	}
}
