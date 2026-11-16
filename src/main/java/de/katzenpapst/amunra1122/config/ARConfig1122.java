package de.katzenpapst.amunra1122.config;

import java.io.File;
import net.minecraftforge.common.config.Configuration;

/** Forge 1.12.2 configuration entry point. */
public final class ARConfig1122 {
    private static Configuration configuration;

    private ARConfig1122() {}

    public static void load(File file) {
        configuration = new Configuration(file);
        readConfig();
    }

    private static void readConfig() {
        // Keep category keys stable as settings are moved from the legacy config.
        configuration.get("dimensions", "enableAmunRaDimensions", true,
                "Whether Amun-Ra dimensions are enabled.");
        if (configuration.hasChanged()) {
            configuration.save();
        }
    }
}
