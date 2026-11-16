package de.katzenpapst.amunra1122.registry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import de.katzenpapst.amunra1122.AmunRa1122;
import micdoodle8.mods.galacticraft.api.galaxies.CelestialBody;
import micdoodle8.mods.galacticraft.api.galaxies.GalaxyRegistry;
import micdoodle8.mods.galacticraft.api.galaxies.Moon;
import micdoodle8.mods.galacticraft.api.galaxies.Planet;
import micdoodle8.mods.galacticraft.api.galaxies.SolarSystem;
import micdoodle8.mods.galacticraft.api.galaxies.Star;
import micdoodle8.mods.galacticraft.api.vector.Vector3;
import micdoodle8.mods.galacticraft.api.world.EnumAtmosphericGas;
import net.minecraft.util.ResourceLocation;

/**
 * Galacticraft Legacy celestial objects that do not yet need a custom dimension
 * provider. Dimension-backed bodies will be enabled as their 1.12.2 providers
 * and world generators are ported.
 */
public final class ARCelestialBodies1122 {
    private static final String GALAXY = "milkyWay";
    private static final List<CelestialBody> REGISTERED = new ArrayList<CelestialBody>();

    public static SolarSystem systemAmunRa;
    public static Star starRa;
    public static Planet starAmun;
    public static Planet planetOsiris;
    public static Planet planetHorus;
    public static Planet planetBaal;
    public static Planet planetAnubis;
    public static Planet asteroidBeltMehen;
    public static Planet planetSekhmet;
    public static Moon moonBaalRings;
    public static Moon moonKhonsu;
    public static Moon moonNeper;
    public static Moon moonIah;
    public static Moon moonBastet;
    public static Moon moonMaahes;
    public static Moon moonThoth;
    public static Moon moonSeth;
    public static Moon moonKebe;

    private ARCelestialBodies1122() {}

    public static void register() {
        if (systemAmunRa != null) {
            return;
        }

        systemAmunRa = new SolarSystem("systemAmunRa", GALAXY);
        starRa = new Star("starRa");
        systemAmunRa.setMainStar(starRa).setMapPosition(new Vector3(1.5F, -1.15F, 0.0F));
        starRa.setBodyIcon(icon("sun-red2.png"));
        starRa.setParentSolarSystem(systemAmunRa);
        GalaxyRegistry.register(systemAmunRa);

        starAmun = planet("starAmun", "sun-blue.png", Math.PI * 0.1, 0.7, 0.9);
        starAmun.setRelativeSize(3.0F).setParentSolarSystem(systemAmunRa);
        registerPlanet(starAmun);

        planetOsiris = planet("osiris", "planet-mercury.png", Math.PI * 0.8, 0.34, 0.4);
        planetOsiris.setParentSolarSystem(systemAmunRa).setRelativeSize(0.8F);
        registerPlanet(planetOsiris);

        // Horus's terrain provider is still awaiting the world-generation port.
        planetHorus = planet("horus", "planet-horus.png", Math.PI * 1.3, 0.55, 0.458);
        planetHorus.setParentSolarSystem(systemAmunRa).setRelativeSize(1.05F);
        registerPlanet(planetHorus);

        planetBaal = planet("baal", "planet-gas03.png", Math.PI * 1.9, 1.2, 1.4);
        planetBaal.setParentSolarSystem(systemAmunRa).setRelativeSize(2.2F);
        registerPlanet(planetBaal);

        moonBaalRings = moon("baalRings", "micromoon.png", 1.58, 9.0, 100.0);
        moonBaalRings.setParentPlanet(planetBaal);
        registerMoon(moonBaalRings);

        moonKhonsu = moon("khonsu", "moon.png", 1.9 * Math.PI, 12.45, 110.0);
        moonKhonsu.setParentPlanet(planetBaal).setRelativeSize(0.45F);
        registerMoon(moonKhonsu);

        moonNeper = moon("neper", "planet-life-o2.png", 1.58, 14.9, 140.0);
        moonNeper.setParentPlanet(planetBaal).setRelativeSize(0.89F)
                .atmosphereComponents(EnumAtmosphericGas.NITROGEN, EnumAtmosphericGas.OXYGEN,
                        EnumAtmosphericGas.ARGON, EnumAtmosphericGas.HELIUM);
        registerMoon(moonNeper);

        moonIah = moon("iah", "moon.png", 3.1, 18.5, 162.0);
        moonIah.setParentPlanet(planetBaal).setRelativeSize(0.21F);
        registerMoon(moonIah);

        asteroidBeltMehen = planet("asteroidBeltMehen", "micromoon.png", Math.PI * 0.19, 1.4, 1.6);
        asteroidBeltMehen.setParentSolarSystem(systemAmunRa);
        registerPlanet(asteroidBeltMehen);

        planetSekhmet = planet("sekhmet", "planet-gas02.png", Math.PI * 0.6, 1.6, 1.8);
        planetSekhmet.setParentSolarSystem(systemAmunRa).setRelativeSize(2.42F);
        registerPlanet(planetSekhmet);

        moonBastet = moon("bast", "moon.png", 3.1, 9.8, 122.0);
        moonBastet.setParentPlanet(planetSekhmet).setRelativeSize(0.758F);
        registerMoon(moonBastet);

        moonMaahes = moon("maahes", "planet-life-ch4.png", 4.514, 11.4, 136.0);
        moonMaahes.setParentPlanet(planetSekhmet).setRelativeSize(0.912F)
                .atmosphereComponents(EnumAtmosphericGas.CO2, EnumAtmosphericGas.METHANE,
                        EnumAtmosphericGas.HYDROGEN, EnumAtmosphericGas.ARGON);
        registerMoon(moonMaahes);

        moonThoth = moon("thoth", "moon.png", 1.9, 15.5, 145.0);
        moonThoth.setParentPlanet(planetSekhmet).setRelativeSize(0.68F);
        registerMoon(moonThoth);

        moonSeth = moon("seth", "planet-ice2.png", 6.0, 17.98, 198.0);
        moonSeth.setParentPlanet(planetSekhmet).setRelativeSize(0.457F);
        registerMoon(moonSeth);

        planetAnubis = planet("anubis", "moon.png", Math.PI * 0.36, 1.9, 2.2);
        planetAnubis.setParentSolarSystem(systemAmunRa).setRelativeSize(0.65F);
        registerPlanet(planetAnubis);

        moonKebe = moon("kebe", "moon.png", 5.1, 19.0, 253.0);
        moonKebe.setParentPlanet(planetAnubis).setRelativeSize(0.32F);
        registerMoon(moonKebe);

        AmunRa1122.INSTANCE.getClass(); // Fail fast if lifecycle wiring is broken.
    }

    public static List<CelestialBody> getRegisteredBodies() {
        return Collections.unmodifiableList(REGISTERED);
    }

    private static Planet planet(String name, String texture, double phase, double distance, double orbit) {
        Planet body = new Planet(name);
        setCommon(body, texture, phase, distance, orbit);
        return body;
    }

    private static Moon moon(String name, String texture, double phase, double distance, double orbit) {
        Moon body = new Moon(name);
        setCommon(body, texture, phase, distance, orbit);
        return body;
    }

    private static void setCommon(CelestialBody body, String texture, double phase, double distance, double orbit) {
        body.setBodyIcon(icon(texture))
                .setPhaseShift((float) phase)
                .setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance((float) distance, (float) distance))
                .setRelativeOrbitTime((float) orbit);
    }

    private static ResourceLocation icon(String filename) {
        return new ResourceLocation("amunra", "textures/gui/celestialbodies/" + filename);
    }

    private static void registerPlanet(Planet body) {
        GalaxyRegistry.register(body);
        REGISTERED.add(body);
    }

    private static void registerMoon(Moon body) {
        GalaxyRegistry.register(body);
        REGISTERED.add(body);
    }
}
