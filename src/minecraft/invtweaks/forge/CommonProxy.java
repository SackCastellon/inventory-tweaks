package invtweaks.forge;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.entity.player.EntityPlayer;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
    }

    public void init(FMLInitializationEvent e) {
    }

    public void postInit(FMLPostInitializationEvent e) {
    }

    public void setServerHasInvTweaks(boolean hasInvTweaks) {
    }

    public void slotClick(PlayerControllerMP playerController,
                          int windowId, int slot, int buttonPressed,
                          boolean shiftHold, EntityPlayer player) {
    }
}
