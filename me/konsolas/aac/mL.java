/*    */ package me.konsolas.aac;
/*    */ import aacinternal.v;
/*    */ import org.bukkit.block.BlockFace;
/*    */ 
/*    */ public class ml {
/*    */   private static final Set b;
/*  7 */   private static final long c = nc.a(-378171447093290676L, -6572267565364956042L, MethodHandles.lookup().lookupClass()).a(281052226580787L);
/*  8 */   private static final List a; private static v a(v paramv) { return paramv; } static { b = Collections.unmodifiableSet(
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 17 */         EnumSet.of(BlockFace.NORTH, BlockFace.EAST, BlockFace.SOUTH, BlockFace.WEST));
/*    */     a = Collections.unmodifiableList(Arrays.asList((Object[])new BlockFace[] { BlockFace.NORTH, BlockFace.EAST, BlockFace.SOUTH, BlockFace.WEST, BlockFace.UP, BlockFace.DOWN })); }
/*    */ 
/*    */   
/*    */   public static boolean a(Player paramPlayer, Block paramBlock1, long paramLong, Block paramBlock2) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/ml.c : J
/*    */     //   3: lload_2
/*    */     //   4: lxor
/*    */     //   5: lstore_2
/*    */     //   6: ldc2_w 6919633592008206247
/*    */     //   9: lload_2
/*    */     //   10: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*    */     //   15: aload_0
/*    */     //   16: invokeinterface getLocation : ()Lorg/bukkit/Location;
/*    */     //   21: astore #6
/*    */     //   23: astore #5
/*    */     //   25: aload #6
/*    */     //   27: invokevirtual getY : ()D
/*    */     //   30: aload_1
/*    */     //   31: invokeinterface getY : ()I
/*    */     //   36: i2d
/*    */     //   37: dcmpg
/*    */     //   38: aload #5
/*    */     //   40: ifnull -> 270
/*    */     //   43: ifle -> 269
/*    */     //   46: goto -> 59
/*    */     //   49: ldc2_w 6945611222369769362
/*    */     //   52: lload_2
/*    */     //   53: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   58: athrow
/*    */     //   59: aload_1
/*    */     //   60: invokeinterface getType : ()Lorg/bukkit/Material;
/*    */     //   65: invokevirtual isSolid : ()Z
/*    */     //   68: aload #5
/*    */     //   70: ifnull -> 270
/*    */     //   73: goto -> 86
/*    */     //   76: ldc2_w 6945611222369769362
/*    */     //   79: lload_2
/*    */     //   80: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   85: athrow
/*    */     //   86: ifeq -> 269
/*    */     //   89: goto -> 102
/*    */     //   92: ldc2_w 6945611222369769362
/*    */     //   95: lload_2
/*    */     //   96: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   101: athrow
/*    */     //   102: aload #6
/*    */     //   104: aload_1
/*    */     //   105: invokeinterface getLocation : ()Lorg/bukkit/Location;
/*    */     //   110: invokevirtual distanceSquared : (Lorg/bukkit/Location;)D
/*    */     //   113: ldc2_w 4.0
/*    */     //   116: dcmpl
/*    */     //   117: aload #5
/*    */     //   119: ifnull -> 270
/*    */     //   122: goto -> 135
/*    */     //   125: ldc2_w 6945611222369769362
/*    */     //   128: lload_2
/*    */     //   129: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   134: athrow
/*    */     //   135: ifge -> 269
/*    */     //   138: goto -> 151
/*    */     //   141: ldc2_w 6945611222369769362
/*    */     //   144: lload_2
/*    */     //   145: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   150: athrow
/*    */     //   151: getstatic me/konsolas/aac/ml.b : Ljava/util/Set;
/*    */     //   154: aload_1
/*    */     //   155: aload #4
/*    */     //   157: invokeinterface getFace : (Lorg/bukkit/block/Block;)Lorg/bukkit/block/BlockFace;
/*    */     //   162: invokeinterface contains : (Ljava/lang/Object;)Z
/*    */     //   167: aload #5
/*    */     //   169: ifnull -> 270
/*    */     //   172: goto -> 185
/*    */     //   175: ldc2_w 6945611222369769362
/*    */     //   178: lload_2
/*    */     //   179: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   184: athrow
/*    */     //   185: ifeq -> 269
/*    */     //   188: goto -> 201
/*    */     //   191: ldc2_w 6945611222369769362
/*    */     //   194: lload_2
/*    */     //   195: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   200: athrow
/*    */     //   201: aload_1
/*    */     //   202: invokeinterface getType : ()Lorg/bukkit/Material;
/*    */     //   207: getstatic org/bukkit/Material.LADDER : Lorg/bukkit/Material;
/*    */     //   210: aload #5
/*    */     //   212: ifnull -> 266
/*    */     //   215: goto -> 228
/*    */     //   218: ldc2_w 6945611222369769362
/*    */     //   221: lload_2
/*    */     //   222: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   227: athrow
/*    */     //   228: if_acmpeq -> 269
/*    */     //   231: goto -> 244
/*    */     //   234: ldc2_w 6945611222369769362
/*    */     //   237: lload_2
/*    */     //   238: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   243: athrow
/*    */     //   244: aload_1
/*    */     //   245: invokeinterface getType : ()Lorg/bukkit/Material;
/*    */     //   250: getstatic org/bukkit/Material.VINE : Lorg/bukkit/Material;
/*    */     //   253: goto -> 266
/*    */     //   256: ldc2_w 6945611222369769362
/*    */     //   259: lload_2
/*    */     //   260: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   265: athrow
/*    */     //   266: if_acmpne -> 271
/*    */     //   269: iconst_0
/*    */     //   270: ireturn
/*    */     //   271: iconst_0
/*    */     //   272: istore #7
/*    */     //   274: getstatic me/konsolas/aac/ml.a : Ljava/util/List;
/*    */     //   277: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   282: astore #8
/*    */     //   284: aload #8
/*    */     //   286: invokeinterface hasNext : ()Z
/*    */     //   291: ifeq -> 416
/*    */     //   294: aload #8
/*    */     //   296: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   301: checkcast org/bukkit/block/BlockFace
/*    */     //   304: astore #9
/*    */     //   306: aload_1
/*    */     //   307: aload #9
/*    */     //   309: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
/*    */     //   314: invokeinterface getType : ()Lorg/bukkit/Material;
/*    */     //   319: invokevirtual isBlock : ()Z
/*    */     //   322: aload #5
/*    */     //   324: lload_2
/*    */     //   325: lconst_0
/*    */     //   326: lcmp
/*    */     //   327: ifle -> 335
/*    */     //   330: ifnull -> 417
/*    */     //   333: aload #5
/*    */     //   335: lload_2
/*    */     //   336: lconst_0
/*    */     //   337: lcmp
/*    */     //   338: iflt -> 377
/*    */     //   341: ifnull -> 375
/*    */     //   344: goto -> 357
/*    */     //   347: ldc2_w 6945611222369769362
/*    */     //   350: lload_2
/*    */     //   351: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   356: athrow
/*    */     //   357: ifeq -> 411
/*    */     //   360: goto -> 373
/*    */     //   363: ldc2_w 6945611222369769362
/*    */     //   366: lload_2
/*    */     //   367: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   372: athrow
/*    */     //   373: iload #7
/*    */     //   375: aload #5
/*    */     //   377: ifnull -> 409
/*    */     //   380: ifeq -> 408
/*    */     //   383: goto -> 396
/*    */     //   386: ldc2_w 6945611222369769362
/*    */     //   389: lload_2
/*    */     //   390: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   395: athrow
/*    */     //   396: iconst_0
/*    */     //   397: ireturn
/*    */     //   398: ldc2_w 6945611222369769362
/*    */     //   401: lload_2
/*    */     //   402: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   407: athrow
/*    */     //   408: iconst_1
/*    */     //   409: istore #7
/*    */     //   411: aload #5
/*    */     //   413: ifnonnull -> 284
/*    */     //   416: iconst_1
/*    */     //   417: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #9	-> 15
/*    */     //   #2	-> 25
/*    */     //   #19	-> 105
/*    */     //   #14	-> 157
/*    */     //   #18	-> 202
/*    */     //   #12	-> 269
/*    */     //   #11	-> 271
/*    */     //   #16	-> 274
/*    */     //   #4	-> 306
/*    */     //   #5	-> 373
/*    */     //   #20	-> 408
/*    */     //   #6	-> 411
/*    */     //   #13	-> 416
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   25	46	49	aacinternal/v
/*    */     //   43	73	76	aacinternal/v
/*    */     //   59	89	92	aacinternal/v
/*    */     //   86	122	125	aacinternal/v
/*    */     //   102	138	141	aacinternal/v
/*    */     //   135	172	175	aacinternal/v
/*    */     //   151	188	191	aacinternal/v
/*    */     //   185	215	218	aacinternal/v
/*    */     //   201	231	234	aacinternal/v
/*    */     //   228	253	256	aacinternal/v
/*    */     //   306	344	347	aacinternal/v
/*    */     //   333	360	363	aacinternal/v
/*    */     //   375	383	386	aacinternal/v
/*    */     //   380	398	398	aacinternal/v
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ml.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */