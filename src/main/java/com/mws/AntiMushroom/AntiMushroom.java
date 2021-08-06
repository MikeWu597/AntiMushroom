package com.mws.AntiMushroom;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiMushroom
  extends JavaPlugin implements Listener
{  
  public void onEnable()
  {
    getLogger().info("已加载AntiMushroom插件_Build1");
    getServer().getPluginManager().registerEvents(new ListenerAPI(), this);
  }
  
  public void onDisable() {}
}