package froztigaming.arrowsplus;

import froztigaming.arrowsplus.init.EntityInit;
import froztigaming.arrowsplus.init.ItemInit;
import net.fabricmc.api.ModInitializer;

public class ArrowsPlus implements ModInitializer {
    public static final String MODID = "arrowsplus";

    @Override
    public void onInitialize() {
        ItemInit.registerItems();
        EntityInit.init();
    }
}
