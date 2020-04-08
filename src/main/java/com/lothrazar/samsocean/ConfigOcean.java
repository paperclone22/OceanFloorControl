package com.lothrazar.samsocean;
import net.minecraftforge.common.config.Configuration;

public class ConfigOcean {
  private Configuration instance;
  private String category = ModOcean.MODID;
  public Configuration instance() {
    return instance;
  }
  public ConfigOcean(Configuration c) {
    instance = c;
    instance.load();
    clayNumBlocks = instance.get(category, "clay_size", 32).getInt();
    clayChance = instance.get(category, "clay_chance", 65).getInt();
    gravelNumBlocks = instance.get(category, "gravel_size", 22).getInt();
    gravelChance = instance.get(category, "gravel_chance", 45).getInt();
    dirtNumBlocks = instance.get(category, "dirt_size", 18).getInt();
    dirtChance = instance.get(category, "dirt_chance", 30).getInt();
    if (instance.hasChanged()) {
      instance.save();
    }
  }
  public int clayChance;
  public int clayNumBlocks;
  public int dirtChance;
  public int dirtNumBlocks;
  public int gravelChance;
  public int gravelNumBlocks;
}
