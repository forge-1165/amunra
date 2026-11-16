# Incremental Forge 1.12.2 port

The active migration branch now has a Forge 1.12.2 entry point, registry-event block/item registration, config loading, client model registration, and Galacticraft Legacy celestial-body registration. The legacy 1.7.10 sources remain in `de.katzenpapst.amunra` as a reference and are excluded from compilation; active migrated code lives in `de.katzenpapst.amunra1122`.

## Build prerequisites

- JDK 8 and the Gradle wrapper (Gradle 4.10.3)
- `libs/Galacticraft-1.12.2-4.0.5.jar` (download separately; not committed)

Run `./gradlew setupDecompWorkspace build` (Windows: `gradlew.bat setupDecompWorkspace build`).

## Migrated functionality

The Amun-Ra solar system and the celestial objects without custom dimensions are registered using the Galacticraft Legacy 1.12 API. Dimension-backed planets and moons are not marked reachable yet: their 1.7.10 world providers, chunk providers, biome implementations, teleport types, and dimension configuration require 1.12.2 ports before those destinations can safely be enabled. One sample block/item and model are registered to exercise the Forge registration path.

This remains an incremental port, not feature parity. The original source includes hundreds of classes for blocks, items, machines, entities, GUIs, world generation, and mothership travel. Those require feature-by-feature rewrites; the project intentionally excludes the legacy package until no 1.7.10-only APIs remain. Building successfully only validates the active 1.12.2 scaffold and the local Galacticraft dependency, not the features still listed in the old source tree.

## API notes

Galacticraft Legacy retains the `micdoodle8.mods.galacticraft.api` namespace. Celestial objects are registered with `GalaxyRegistry.register(Object)`. Atmospheric gases use `EnumAtmosphericGas` and `CelestialBody.atmosphereComponents(...)`. Forge block/item registration uses `RegistryEvent.Register`, and item models use `ModelRegistryEvent`.
