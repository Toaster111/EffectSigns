package EffectSigns;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Sign;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class CommandHandler implements CommandExecutor {

	private Plugin plugin;
	public Main(Plugin instance){
	plugin = instance;
	}
	
	

	public boolean onCommand(CommandSender sender, Command cmd, String commandlabel, String[] args){
		if(sender instanceof Player)
		{			
			Player player = (Player) sender;
			if(args.length == 0)
			{

			}
			if(args.length == 2)
			{
				if(args[0].equalsIgnoreCase("particle")) // --- /es particle (particle)
				{
					if(player.getEyeLocation().getBlock().getType() == Material.SIGN || player.getEyeLocation().getBlock().getType() == Material.WALL_SIGN)
					{
						Sign sign = player.getEyeLocation().getBlock().getState();
						if(sign.getLine(0).equalsIgnoreCase(ChatColor.RED + "[EffectSign]"))
						{
							plugin.getConfig().set("Signs." + sign.getLine(1) + ".effect", args[1]);
						}
					}
					else
					{
						return;
					}

				}

			}else if(args.length == 4) // --- /es offset (x) (y) (z)
			{
				if(args[0].equalsIgnoreCase("offset")){

				}
			} else if(args.length == 2) // --- /es ammount (ammount)
			{
				if(args[0].equalsIgnoreCase("ammount")){

				}
			}
		}
		return false;
	}
}    
