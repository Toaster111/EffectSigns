package EffectSigns;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class EffectSigns extends JavaPlugin{
	
	public final Logger logger = Logger.getLogger("Minecraft");
	public static EffectSigns plugin;
	
	@Override
	public void onDisable()
	{
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() +  " Has Been Disabled!");
	}

	@Override
	public void onEnable()
	{
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() +  " Has Been Enabled!");
		
		getCommand("es").setExecutor(new CommandHandler());
	}
	
	
	
	
}