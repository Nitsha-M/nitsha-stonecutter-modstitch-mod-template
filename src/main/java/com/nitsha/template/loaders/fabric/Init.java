//? if fabric {
package com.nitsha.template.loaders.fabric;

import com.nitsha.template.Main;
import net.fabricmc.api.ModInitializer;

public class Init implements ModInitializer {
    @Override
    public void onInitialize() {
        Main.init();
    }
}
//?}