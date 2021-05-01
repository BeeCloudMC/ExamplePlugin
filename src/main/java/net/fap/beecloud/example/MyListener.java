package net.fap.beecloud.example;

import net.fap.beecloud.console.ServerLogger;
import net.fap.beecloud.event.Event;
import net.fap.beecloud.event.Listener;
import net.fap.beecloud.event.player.PlayerJoinEvent;

/**
 * 自定义监听器类
 * 用于监听服务器事件
 */

public class MyListener implements Listener {

    public void call(Event event)
    {
        if (event instanceof PlayerJoinEvent)
        {
            String player = ((PlayerJoinEvent) event).getPlayer();
            ServerLogger.info("[ExamplePlugin] 欢迎"+player+"来到服务器");
        }
    }

}
