# Amun-Ra: Forge 1.12.2 migration

This branch is the start of the Minecraft Forge 1.12.2 migration. It targets Forge `1.12.2-14.23.5.2860`, ForgeGradle 2.3, Java 8, and Galacticraft Legacy 4.0.5.

## Galacticraft dependency

Obtain the Galacticraft Legacy jar separately and put it at exactly:

```text
libs/Galacticraft-1.12.2-4.0.5.jar
```

The jar is deliberately not checked in. The build references it using ForgeGradle's `deobfCompile` configuration so the dependency is available to the development environment without being shaded into Amun-Ra.

## Build

Use a JDK 8 installation, then run:

```sh
./gradlew setupDecompWorkspace
./gradlew build
```

On Windows use `gradlew.bat`.

## Migration status

The build system and mod metadata have been moved to the 1.12.2 toolchain. This is not yet a complete source/API port: the existing Java sources are from the 1.7.10 version and still use FML-era packages and old Minecraft/Galacticraft APIs. They must be migrated and compiled against the provided Galacticraft Legacy jar before this branch can produce a working 1.12.2 mod. In particular, rendering, world generation, entities, registries, configuration, networking, and Galacticraft's celestial-body/teleport APIs require source-level updates. Do not treat a successful Gradle setup as proof that the mod is ported.
