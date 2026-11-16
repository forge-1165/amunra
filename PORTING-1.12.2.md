# Incremental Forge 1.12.2 port

The active migration branch now has a Forge 1.12.2 entry point and modern registration/configuration scaffolding. The original implementation remains in `de.katzenpapst.amunra` as a reference and is excluded from compilation until migrated; the active code is under `de.katzenpapst.amunra1122`.

## Build prerequisites

- JDK 8 and Gradle wrapper (Gradle 4.10.3)
- `libs/Galacticraft-1.12.2-4.0.5.jar` (download separately; not committed)

Run `./gradlew setupDecompWorkspace build` (Windows: `gradlew.bat setupDecompWorkspace build`). Galacticraft Legacy's 1.12 branch keeps public API packages under `micdoodle8.mods.galacticraft.api`, including `api.galaxies`, `api.vector`, and `api.world`; the old `IAtmosphericGas` is now `EnumAtmosphericGas`. Forge registration uses `RegistryEvent.Register`, model registration uses `ModelRegistryEvent`, and old `cpw.mods.fml` classes moved under `net.minecraftforge.fml`.

## Current limitations

This is an incremental port scaffold, not feature parity. It registers one example block/item and model to establish 1.12.2 lifecycle conventions. The 1.7.10 source tree is deliberately not compiled because changing only imports would leave a large number of removed block/item, entity, world generation, rendering, networking, Galacticraft teleport, and mothership API usages. Port each feature group into the active package, validate against the exact 4.0.5 jar, and remove the source exclusion only after the remaining legacy code has been migrated. The Galacticraft release jar is a local development dependency only and is not embedded in the resulting Amun-Ra jar.
