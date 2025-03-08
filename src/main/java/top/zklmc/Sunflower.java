package top.zklmc;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import net.vialoadingbase.ViaLoadingBase;
import net.viamcp.ViaMCP;

public class Sunflower {
    public static String NAME = "Sunflower";
    public static String VERSION = "#250308";

    public static void kaigua() {
        try {
            ViaMCP.create();
            ViaMCP.INSTANCE.initAsyncSlider();
            ViaLoadingBase.getInstance().reload(ProtocolVersion.v1_12_2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
