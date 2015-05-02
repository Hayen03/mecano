package hayen.mecano.handler;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import hayen.mecano.reference.ModReference;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler {

	public static Configuration configuration;

	public static void init(File config){
		if (configuration == null)
			configuration = new Configuration(config);
	}

	@SubscribeEvent
	public void onConfigurationChangeEvent(ConfigChangedEvent.OnConfigChangedEvent event){
		if (event.modID.equalsIgnoreCase(ModReference.MOD_ID)){
			loadConfig();
		}
	}

	public static void loadConfig(){

		// value to load

		if (configuration.hasChanged())
			configuration.save();
	}

}
