package dev.thinkverse.bbreak.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

/**
 * Author:  Kim (Thinkverse) Hallberg <work@hallberg.kim>
 * Created: 2020-11-07 14:06
 */
public final class BlockBreakListener implements Listener {

    @EventHandler
    public void onBlockBreakEvent(final BlockBreakEvent event)
    {
        event.setCancelled(true);
        System.out.println("BROKEN");
        System.out.println(event.isCancelled());
    }
}
