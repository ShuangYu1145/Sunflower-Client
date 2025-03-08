package top.zklmc.utils;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import top.zklmc.Sunflower;

public class DebugUtil {
    private static final Minecraft mc = Minecraft.getMinecraft();

    public static void log(Object message) {
        String text = EnumChatFormatting.BOLD + "[" + Sunflower.NAME + "] " + EnumChatFormatting.RESET + " " + message;
        mc.ingameGUI.getChatGUI().printChatMessage(new ChatComponentText(text));
    }
}

