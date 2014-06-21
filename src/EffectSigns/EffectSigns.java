package EffectSigns;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class EffectSigns extends JavaPlugin implements Listener{

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
		Bukkit.getPluginManager().registerEvents(this, this);	
		new SignHandler(this);
		

		getCommand("es").setExecutor(new CommandHandler());
	}




}
