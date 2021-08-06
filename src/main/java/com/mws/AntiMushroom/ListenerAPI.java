package com.mws.AntiMushroom;

import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class ListenerAPI implements Listener{
	@EventHandler
	  public void onPlace(BlockPlaceEvent bpe)
	  {
		if(bpe.getBlock().getWorld().getName().equalsIgnoreCase("world_the_end")&& (bpe.getBlock().getType()==Material.RED_MUSHROOM || bpe.getBlock().getType()==Material.BROWN_MUSHROOM || bpe.getBlock().getType()==Material.LEGACY_RED_MUSHROOM || bpe.getBlock().getType()==Material.LEGACY_BROWN_MUSHROOM))
		{
			bpe.getPlayer().sendMessage("[AntiMushroom] 请勿在此放置蘑菇！您的操作已被记录。");
			bpe.setCancelled(true);
		}
	  }
}
