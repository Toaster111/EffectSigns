package EffectSigns;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandHandler implements CommandExecutor {
	
	
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

