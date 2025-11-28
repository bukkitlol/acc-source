/*   */ package me.konsolas.aac;
/*   */ import org.bukkit.entity.Player;
/*   */ 
/*   */ public class dj implements AACAPI {
/*   */   dj(AAC paramAAC) {
/* 6 */     this.a = paramAAC;
/*   */   }
/*   */   
/*   */   private final AAC a;
/*   */   private static final long b = nc.a(-1637916482627734552L, 2265505456875763640L, MethodHandles.lookup().lookupClass()).a(87779149287956L);
/*   */   
/*   */   public void registerCustomFeatureProvider(AACCustomFeatureProvider paramAACCustomFeatureProvider) {
/*   */     // Byte code:
/*   */     //   0: getstatic me/konsolas/aac/dj.b : J
/*   */     //   3: ldc2_w 72322467721614
/*   */     //   6: lxor
/*   */     //   7: lstore_2
/*   */     //   8: aload_0
/*   */     //   9: getfield a : Lme/konsolas/aac/AAC;
/*   */     //   12: ldc2_w -486901948341450215
/*   */     //   15: lload_2
/*   */     //   16: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Lme/konsolas/aac/fv;
/*   */     //   21: aload_1
/*   */     //   22: ldc2_w -435455864250735898
/*   */     //   25: lload_2
/*   */     //   26: <illegal opcode> b : (Lme/konsolas/aac/fv;Lme/konsolas/aac/api/AACCustomFeatureProvider;JJ)V
/*   */     //   31: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 8
/*   */     //   #4	-> 31
/*   */   }
/*   */   
/*   */   public void removeExemption(Player paramPlayer, AACExemption paramAACExemption) {
/*   */     // Byte code:
/*   */     //   0: getstatic me/konsolas/aac/dj.b : J
/*   */     //   3: ldc2_w 12912162737226
/*   */     //   6: lxor
/*   */     //   7: lstore_3
/*   */     //   8: aload_0
/*   */     //   9: getfield a : Lme/konsolas/aac/AAC;
/*   */     //   12: ldc2_w 415978659294837933
/*   */     //   15: lload_3
/*   */     //   16: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Lme/konsolas/aac/iS;
/*   */     //   21: aload_1
/*   */     //   22: aload_2
/*   */     //   23: invokevirtual a : (Lorg/bukkit/entity/Player;Lme/konsolas/aac/api/AACExemption;)V
/*   */     //   26: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #3	-> 8
/*   */     //   #5	-> 26
/*   */   }
/*   */   
/*   */   public void addExemption(Player paramPlayer, AACExemption paramAACExemption) {
/*   */     // Byte code:
/*   */     //   0: getstatic me/konsolas/aac/dj.b : J
/*   */     //   3: ldc2_w 83942309759709
/*   */     //   6: lxor
/*   */     //   7: lstore_3
/*   */     //   8: aload_0
/*   */     //   9: getfield a : Lme/konsolas/aac/AAC;
/*   */     //   12: ldc2_w -8983945112325653958
/*   */     //   15: lload_3
/*   */     //   16: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Lme/konsolas/aac/iS;
/*   */     //   21: aload_1
/*   */     //   22: aload_2
/*   */     //   23: invokevirtual b : (Lorg/bukkit/entity/Player;Lme/konsolas/aac/api/AACExemption;)V
/*   */     //   26: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #8	-> 8
/*   */     //   #10	-> 26
/*   */   }
/*   */   
/*   */   public Set getExemptions(Player paramPlayer) {
/*   */     // Byte code:
/*   */     //   0: getstatic me/konsolas/aac/dj.b : J
/*   */     //   3: ldc2_w 36104112731464
/*   */     //   6: lxor
/*   */     //   7: lstore_2
/*   */     //   8: aload_0
/*   */     //   9: getfield a : Lme/konsolas/aac/AAC;
/*   */     //   12: ldc2_w -231951828363344465
/*   */     //   15: lload_2
/*   */     //   16: <illegal opcode> b : (Lme/konsolas/aac/AAC;JJ)Lme/konsolas/aac/iS;
/*   */     //   21: aload_1
/*   */     //   22: ldc2_w -195533914193057000
/*   */     //   25: lload_2
/*   */     //   26: <illegal opcode> b : (Lme/konsolas/aac/iS;Lorg/bukkit/entity/Player;JJ)Ljava/util/Set;
/*   */     //   31: areturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #9	-> 8
/*   */   }
/*   */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\dj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */