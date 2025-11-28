/*    */ package me.konsolas.aac;
/*    */ 
/*    */ 
/*    */ public class l1 implements mJ {
/*  5 */   public ItemStack a(Player paramPlayer, long paramLong) { return paramPlayer.getItemInUse(); }
/*    */   public List a(Block paramBlock, char paramChar, long paramLong, Entity paramEntity) { // Byte code:
/*    */     //   0: iload_2
/*    */     //   1: i2l
/*    */     //   2: bipush #48
/*    */     //   4: lshl
/*    */     //   5: lload_3
/*    */     //   6: bipush #16
/*    */     //   8: lshl
/*    */     //   9: bipush #16
/*    */     //   11: lushr
/*    */     //   12: lor
/*    */     //   13: lstore #6
/*    */     //   15: ldc2_w -4127385674211381296
/*    */     //   18: lload #6
/*    */     //   20: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   25: aload_1
/*    */     //   26: invokeinterface getCollisionShape : ()Lorg/bukkit/util/VoxelShape;
/*    */     //   31: invokeinterface getBoundingBoxes : ()Ljava/util/Collection;
/*    */     //   36: astore #9
/*    */     //   38: astore #8
/*    */     //   40: new java/util/ArrayList
/*    */     //   43: dup
/*    */     //   44: aload #9
/*    */     //   46: invokeinterface size : ()I
/*    */     //   51: invokespecial <init> : (I)V
/*    */     //   54: astore #10
/*    */     //   56: aload #9
/*    */     //   58: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   63: astore #11
/*    */     //   65: aload #11
/*    */     //   67: invokeinterface hasNext : ()Z
/*    */     //   72: ifeq -> 136
/*    */     //   75: aload #11
/*    */     //   77: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   82: checkcast org/bukkit/util/BoundingBox
/*    */     //   85: astore #12
/*    */     //   87: lload_3
/*    */     //   88: lconst_0
/*    */     //   89: lcmp
/*    */     //   90: iflt -> 111
/*    */     //   93: aload #10
/*    */     //   95: aload #8
/*    */     //   97: ifnull -> 138
/*    */     //   100: aload #12
/*    */     //   102: invokestatic a : (Lorg/bukkit/util/BoundingBox;)Lme/konsolas/aac/lq;
/*    */     //   105: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   110: pop
/*    */     //   111: aload #8
/*    */     //   113: ifnonnull -> 65
/*    */     //   116: lload_3
/*    */     //   117: lconst_0
/*    */     //   118: lcmp
/*    */     //   119: iflt -> 87
/*    */     //   122: goto -> 136
/*    */     //   125: ldc2_w -4135506183065367717
/*    */     //   128: lload #6
/*    */     //   130: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   135: athrow
/*    */     //   136: aload #10
/*    */     //   138: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #3	-> 25
/*    */     //   #4	-> 40
/*    */     //   #7	-> 56
/*    */     //   #2	-> 87
/*    */     //   #1	-> 111
/*    */     //   #9	-> 136
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*  6 */     //   87	116	125	aacinternal/v } public lq a(Entity paramEntity, long paramLong) { return lq.a(paramEntity.getBoundingBox()); }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public d7 a(Entity paramEntity, Vector paramVector1, long paramLong, Vector paramVector2, double paramDouble) {
/* 12 */     long l = paramLong ^ 0x7041759F5296L; return d7.a(paramEntity.getWorld().rayTraceBlocks(paramVector1.toLocation(paramEntity.getWorld()), paramVector2.clone().normalize(), paramDouble), l);
/* 13 */   } public float a(long paramLong, Block paramBlock) { return paramBlock.getType().getSlipperiness(); }
/* 14 */   public Collection a(Player paramPlayer) { return Arrays.asList(new ItemStack[] { paramPlayer.getInventory().getItemInMainHand(), paramPlayer.getInventory().getItemInOffHand() }); }
/* 15 */   public float a(short paramShort1, Player paramPlayer, Block paramBlock, short paramShort2, int paramInt) { return paramBlock.getBreakSpeed(paramPlayer); } public boolean a(Player paramPlayer) {
/* 16 */     return paramPlayer.isGliding();
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\l1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */