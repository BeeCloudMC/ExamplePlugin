package net.fap.beecloud.example;

import net.fap.beecloud.console.ServerLogger;
import net.fap.beecloud.console.simple.CommandHandler;

/**
 * 自定义命令
 */

public class MyCommand extends CommandHandler {

    public MyCommand()
    {
        commandStr = "mycmd";
        commandUsage = "自定义命令";
        this.setCommandStr(commandStr,commandUsage);
    }

    @Override
    public void setCommandStr(String commandStr, String commandUsage) {
        super.setCommandStr(commandStr, commandUsage);
    }

    @Override
    public void runCommand() {

        ServerLogger.info("自定义命令执行成功");

        super.runCommand();
    }
}
