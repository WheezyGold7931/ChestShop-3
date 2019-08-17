package com.Acrobot.ChestShop.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class AccountOwnerCheckEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();

    private String name;
    private Player player;
    private boolean b = false;

    public AccountOwnerCheckEvent(Player player, String name) {
        this.player = player;
        this.name = name;
    }

    public Player getPlayer() {
        return player;
    }

    public String getName() {
        return name;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    //Cancelled event means player does not have access.
    @Override
    public boolean isCancelled() {
        return b;
    }

    @Override
    public void setCancelled(boolean b) {
        this.b = b;
    }
}
