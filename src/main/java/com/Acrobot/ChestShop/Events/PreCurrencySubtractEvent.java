package com.Acrobot.ChestShop.Events;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.math.BigDecimal;
import java.util.UUID;

public class PreCurrencySubtractEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();

    private UUID sender;
    private BigDecimal amountSent;
    private boolean b = false;
    private boolean balanceSufficient = true;

    public PreCurrencySubtractEvent(UUID sender, BigDecimal amountSent) {
        this.sender = sender;
        this.amountSent = amountSent;
    }

    public UUID getSender() {
        return sender;
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

    public boolean isBalanceSufficient() {
        return balanceSufficient;
    }

    public void setBalanceSufficient(boolean balanceSufficient) {
        this.balanceSufficient = balanceSufficient;
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
