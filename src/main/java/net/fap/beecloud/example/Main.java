package net.fap.beecloud.example;

import net.fap.beecloud.Server;
import net.fap.beecloud.console.ServerLogger;
import net.fap.beecloud.plugin.PluginBase;
import net.fap.beecloud.plugin.PluginCase;

/**
 * BeeCloud 实例插件
 *
 * @author catrainbow
 */

//插件必须 implements PluginCase 并调用onLoad和onEnable入口方法
//插件可以 extends PluginBase 并使用相关方法
public class Main extends PluginBase implements PluginCase {

    /**
     * 当插件被加载时会触发
     */
    public void onLoad()
    {
        ServerLogger.info("开始加载插件");
        Server server = this.getServer();

        /**
         * 自定义命令
         * @see MyCommand
         */
        server.registerCommand(new MyCommand());

        /**
         * 自定义监听器方法一
         *
         * 覆写核心自带监听器
         * Server.reloadListener(Listener);
         *
         * @see MyListener
         */
        //server.reloadListener(new MyListener());

        /**
         * 自定义监听器方法二
         * 多开监听器方法
         *
         * Server.registerListeners(Listener)
         *
         * @see MyListener
         */
        server.registerListeners(this,new MyListener());



    }

    /**
     * 当插件被开启时会触发
     */
    public void onEnable()
    {
        ServerLogger.info("欢迎使用!!!");
    }

}
