package ferixx.test.mod.sound;

import ferixx.test.mod.TestMod;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds {
    public static SoundEvent NEVER_GONNA_GIVE_YOU_UP = registerSoundEvent("never_gonna_give_you_up");
    public static SoundEvent CRABULONS_THEME = registerSoundEvent("crabulons_theme");
    public static SoundEvent MEGALOVANIA = registerSoundEvent("megalovania");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(TestMod.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
