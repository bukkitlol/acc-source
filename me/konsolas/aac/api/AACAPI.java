package me.konsolas.aac.api;

import java.util.Set;
import org.bukkit.entity.Player;

public interface AACAPI {
  void addExemption(Player paramPlayer, AACExemption paramAACExemption);
  
  void removeExemption(Player paramPlayer, AACExemption paramAACExemption);
  
  Set<AACExemption> getExemptions(Player paramPlayer);
  
  void registerCustomFeatureProvider(AACCustomFeatureProvider paramAACCustomFeatureProvider);
}


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\api\AACAPI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */