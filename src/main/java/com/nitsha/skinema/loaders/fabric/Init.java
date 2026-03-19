//? if fabric {
package com.nitsha.skinema.loaders.fabric;

import com.nitsha.skinema.Main;
import net.fabricmc.api.ModInitializer;

public class Init implements ModInitializer {
    @Override
    public void onInitialize() {
        Main.init();
    }
}
//?}