package com.Acrobot.ChestShop.Events;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.math.BigDecimal;
import java.util.UUID;

public class PreCurrencyAddEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();

    private UUID target;
    private BigDecimal amountSent;
    private boolean b = false;

    public PreCurrencyAddEvent(UUID target, BigDecimal amountSent) {
        this.target = target;
        this.amountSent = amountSent;
    }

    public UUID getTarget() {
        return target;
    }

    public BigDecimal getAmountSent() {
        return amountSent;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public boolean isCancelled() {
        return b;
    }

    @Override
    public void setCancelled(boolean b) {
        this.b = b;
    }
}
