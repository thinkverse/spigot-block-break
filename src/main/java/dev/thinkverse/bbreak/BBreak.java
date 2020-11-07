package dev.thinkverse.bbreak;

import dev.thinkverse.bbreak.listeners.BlockBreakListener;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Author:  Kim (Thinkverse) Hallberg <work@hallberg.kim>
 * Created: 2020-11-07 13:58
 */
public final class BBreak extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new BlockBreakListener(), this);
    }

}
