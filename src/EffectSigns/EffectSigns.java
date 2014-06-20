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
		plugin.getDataFolder().mkdir();
		final FileConfiguration config = this.getConfig();
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() +  " Has Been Enabled!");
		
		//not sure if that will work check it for me vvv
		getServer().getPluginManager().registerEvent(SignsHandler(), this);
		
		getCommand("es").setExecutor(new CommandHandler());
	}




}
