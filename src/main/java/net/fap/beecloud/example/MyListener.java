package net.fap.beecloud.example;

import net.fap.beecloud.SynapsePlayer;
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
            SynapsePlayer player = SynapsePlayer.getPlayer(((PlayerJoinEvent) event).getPlayer());
            player.sendMessage("§c欢迎来到我们服务器!!!");
            player.sendTitle("§c生存服务器","§b大区1",2,200,2);
        }
    }

}
