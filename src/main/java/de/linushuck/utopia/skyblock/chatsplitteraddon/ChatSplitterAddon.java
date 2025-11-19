package de.linushuck.utopia.skyblock.chatsplitteraddon;

import de.linushuck.utopia.skyblock.libs.api.UtopiaSkyBlockAddon;
import de.linushuck.utopia.skyblock.libs.essentials.Logger;
import lombok.Getter;
import org.bukkit.event.Listener;

public class ChatSplitterAddon extends UtopiaSkyBlockAddon implements Listener
{
    @Getter
    private static ChatSplitterAddon instance;

    @Override
    public void onEnable()
    {
        instance = this;
        Logger.info("ChatSplitterAddon enabled");
    }

    @Override
    public void onDisable()
    {
        Logger.info("ChatSplitterAddon disabled");
        instance = null;
    }


}