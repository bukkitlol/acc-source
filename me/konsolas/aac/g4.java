/*   */ package me.konsolas.aac;
/*   */ 
/*   */ public class g4 {
/*   */   public static long a(Block paramBlock, long paramLong, Player paramPlayer) {
/* 5 */     paramLong = a ^ paramLong; int i = (int)((paramLong ^ 0x636F241754B8L) >>> 32L), j = (int)((paramLong ^ 0x636F241754B8L) << 32L >>> 48L), k = (int)((paramLong ^ 0x636F241754B8L) << 48L >>> 48L); paramLong ^ 0x636F241754B8L; return (long)(1.0F / a(i, paramBlock, (char)j, paramPlayer, (short)k));
/*   */   }
/*   */   
/*   */   private static final Method i;
/*   */   private static final Method c;
/*   */   private static final Constructor j;
/*   */   private static final Method f;
/*   */   private static Method e;
/*   */   private static Method g;
/*   */   private static Method h;
/*   */   private static Method d;
/*   */   private static aN[] b;
/*   */   private static final long a;
/*   */   
/*   */   public static float a(int paramInt, Block paramBlock, char paramChar, Player paramPlayer, short paramShort) {
/*   */     // Byte code:
/*   */     //   0: iload_0
/*   */     //   1: i2l
/*   */     //   2: bipush #32
/*   */     //   4: lshl
/*   */     //   5: iload_2
/*   */     //   6: i2l
/*   */     //   7: bipush #48
/*   */     //   9: lshl
/*   */     //   10: bipush #32
/*   */     //   12: lushr
/*   */     //   13: lor
/*   */     //   14: iload #4
/*   */     //   16: i2l
/*   */     //   17: bipush #48
/*   */     //   19: lshl
/*   */     //   20: bipush #48
/*   */     //   22: lushr
/*   */     //   23: lor
/*   */     //   24: getstatic me/konsolas/aac/g4.a : J
/*   */     //   27: lxor
/*   */     //   28: lstore #5
/*   */     //   30: lload #5
/*   */     //   32: dup2
/*   */     //   33: ldc2_w 121689902294537
/*   */     //   36: lxor
/*   */     //   37: lstore #7
/*   */     //   39: pop2
/*   */     //   40: ldc2_w -6900193555362461355
/*   */     //   43: lload #5
/*   */     //   45: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*   */     //   50: astore #9
/*   */     //   52: invokestatic a : ()Lme/konsolas/aac/kP;
/*   */     //   55: getstatic me/konsolas/aac/kP.V1_8 : Lme/konsolas/aac/kP;
/*   */     //   58: aload #9
/*   */     //   60: ifnull -> 259
/*   */     //   63: if_acmpne -> 234
/*   */     //   66: goto -> 80
/*   */     //   69: ldc2_w -6916973562593998799
/*   */     //   72: lload #5
/*   */     //   74: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*   */     //   79: athrow
/*   */     //   80: getstatic me/konsolas/aac/g4.j : Ljava/lang/reflect/Constructor;
/*   */     //   83: iconst_3
/*   */     //   84: anewarray java/lang/Object
/*   */     //   87: dup
/*   */     //   88: iconst_0
/*   */     //   89: aload_1
/*   */     //   90: invokeinterface getX : ()I
/*   */     //   95: invokestatic valueOf : (I)Ljava/lang/Integer;
/*   */     //   98: aastore
/*   */     //   99: dup
/*   */     //   100: iconst_1
/*   */     //   101: aload_1
/*   */     //   102: invokeinterface getY : ()I
/*   */     //   107: invokestatic valueOf : (I)Ljava/lang/Integer;
/*   */     //   110: aastore
/*   */     //   111: dup
/*   */     //   112: iconst_2
/*   */     //   113: aload_1
/*   */     //   114: invokeinterface getZ : ()I
/*   */     //   119: invokestatic valueOf : (I)Ljava/lang/Integer;
/*   */     //   122: aastore
/*   */     //   123: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   126: astore #10
/*   */     //   128: getstatic me/konsolas/aac/g4.c : Ljava/lang/reflect/Method;
/*   */     //   131: aload_1
/*   */     //   132: invokeinterface getWorld : ()Lorg/bukkit/World;
/*   */     //   137: iconst_0
/*   */     //   138: anewarray java/lang/Object
/*   */     //   141: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   144: astore #11
/*   */     //   146: getstatic me/konsolas/aac/g4.f : Ljava/lang/reflect/Method;
/*   */     //   149: aload #11
/*   */     //   151: iconst_1
/*   */     //   152: anewarray java/lang/Object
/*   */     //   155: dup
/*   */     //   156: iconst_0
/*   */     //   157: aload #10
/*   */     //   159: aastore
/*   */     //   160: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   163: astore #12
/*   */     //   165: getstatic me/konsolas/aac/g4.e : Ljava/lang/reflect/Method;
/*   */     //   168: aload #12
/*   */     //   170: iconst_0
/*   */     //   171: anewarray java/lang/Object
/*   */     //   174: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   177: astore #13
/*   */     //   179: getstatic me/konsolas/aac/g4.g : Ljava/lang/reflect/Method;
/*   */     //   182: aload #13
/*   */     //   184: iconst_3
/*   */     //   185: anewarray java/lang/Object
/*   */     //   188: dup
/*   */     //   189: iconst_0
/*   */     //   190: getstatic me/konsolas/aac/g4.i : Ljava/lang/reflect/Method;
/*   */     //   193: aload_3
/*   */     //   194: iconst_0
/*   */     //   195: anewarray java/lang/Object
/*   */     //   198: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   201: aastore
/*   */     //   202: dup
/*   */     //   203: iconst_1
/*   */     //   204: aload #11
/*   */     //   206: aastore
/*   */     //   207: dup
/*   */     //   208: iconst_2
/*   */     //   209: aload #10
/*   */     //   211: aastore
/*   */     //   212: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   215: checkcast java/lang/Float
/*   */     //   218: invokevirtual floatValue : ()F
/*   */     //   221: freturn
/*   */     //   222: astore #10
/*   */     //   224: new java/lang/RuntimeException
/*   */     //   227: dup
/*   */     //   228: aload #10
/*   */     //   230: invokespecial <init> : (Ljava/lang/Throwable;)V
/*   */     //   233: athrow
/*   */     //   234: invokestatic a : ()Lme/konsolas/aac/kP;
/*   */     //   237: aload #9
/*   */     //   239: ifnull -> 455
/*   */     //   242: getstatic me/konsolas/aac/kP.V1_13 : Lme/konsolas/aac/kP;
/*   */     //   245: goto -> 259
/*   */     //   248: ldc2_w -6916973562593998799
/*   */     //   251: lload #5
/*   */     //   253: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*   */     //   258: athrow
/*   */     //   259: lload #7
/*   */     //   261: dup2_x1
/*   */     //   262: pop2
/*   */     //   263: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*   */     //   266: ifeq -> 409
/*   */     //   269: getstatic me/konsolas/aac/g4.j : Ljava/lang/reflect/Constructor;
/*   */     //   272: iconst_3
/*   */     //   273: anewarray java/lang/Object
/*   */     //   276: dup
/*   */     //   277: iconst_0
/*   */     //   278: aload_1
/*   */     //   279: invokeinterface getX : ()I
/*   */     //   284: invokestatic valueOf : (I)Ljava/lang/Integer;
/*   */     //   287: aastore
/*   */     //   288: dup
/*   */     //   289: iconst_1
/*   */     //   290: aload_1
/*   */     //   291: invokeinterface getY : ()I
/*   */     //   296: invokestatic valueOf : (I)Ljava/lang/Integer;
/*   */     //   299: aastore
/*   */     //   300: dup
/*   */     //   301: iconst_2
/*   */     //   302: aload_1
/*   */     //   303: invokeinterface getZ : ()I
/*   */     //   308: invokestatic valueOf : (I)Ljava/lang/Integer;
/*   */     //   311: aastore
/*   */     //   312: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   315: astore #10
/*   */     //   317: getstatic me/konsolas/aac/g4.c : Ljava/lang/reflect/Method;
/*   */     //   320: aload_1
/*   */     //   321: invokeinterface getWorld : ()Lorg/bukkit/World;
/*   */     //   326: iconst_0
/*   */     //   327: anewarray java/lang/Object
/*   */     //   330: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   333: astore #11
/*   */     //   335: getstatic me/konsolas/aac/g4.f : Ljava/lang/reflect/Method;
/*   */     //   338: aload #11
/*   */     //   340: iconst_1
/*   */     //   341: anewarray java/lang/Object
/*   */     //   344: dup
/*   */     //   345: iconst_0
/*   */     //   346: aload #10
/*   */     //   348: aastore
/*   */     //   349: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   352: astore #12
/*   */     //   354: getstatic me/konsolas/aac/g4.d : Ljava/lang/reflect/Method;
/*   */     //   357: aload #12
/*   */     //   359: iconst_3
/*   */     //   360: anewarray java/lang/Object
/*   */     //   363: dup
/*   */     //   364: iconst_0
/*   */     //   365: getstatic me/konsolas/aac/g4.i : Ljava/lang/reflect/Method;
/*   */     //   368: aload_3
/*   */     //   369: iconst_0
/*   */     //   370: anewarray java/lang/Object
/*   */     //   373: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   376: aastore
/*   */     //   377: dup
/*   */     //   378: iconst_1
/*   */     //   379: aload #11
/*   */     //   381: aastore
/*   */     //   382: dup
/*   */     //   383: iconst_2
/*   */     //   384: aload #10
/*   */     //   386: aastore
/*   */     //   387: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   390: checkcast java/lang/Float
/*   */     //   393: invokevirtual floatValue : ()F
/*   */     //   396: freturn
/*   */     //   397: astore #10
/*   */     //   399: new java/lang/RuntimeException
/*   */     //   402: dup
/*   */     //   403: aload #10
/*   */     //   405: invokespecial <init> : (Ljava/lang/Throwable;)V
/*   */     //   408: athrow
/*   */     //   409: getstatic me/konsolas/aac/g4.j : Ljava/lang/reflect/Constructor;
/*   */     //   412: iconst_3
/*   */     //   413: anewarray java/lang/Object
/*   */     //   416: dup
/*   */     //   417: iconst_0
/*   */     //   418: aload_1
/*   */     //   419: invokeinterface getX : ()I
/*   */     //   424: invokestatic valueOf : (I)Ljava/lang/Integer;
/*   */     //   427: aastore
/*   */     //   428: dup
/*   */     //   429: iconst_1
/*   */     //   430: aload_1
/*   */     //   431: invokeinterface getY : ()I
/*   */     //   436: invokestatic valueOf : (I)Ljava/lang/Integer;
/*   */     //   439: aastore
/*   */     //   440: dup
/*   */     //   441: iconst_2
/*   */     //   442: aload_1
/*   */     //   443: invokeinterface getZ : ()I
/*   */     //   448: invokestatic valueOf : (I)Ljava/lang/Integer;
/*   */     //   451: aastore
/*   */     //   452: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   455: astore #10
/*   */     //   457: getstatic me/konsolas/aac/g4.c : Ljava/lang/reflect/Method;
/*   */     //   460: aload_1
/*   */     //   461: invokeinterface getWorld : ()Lorg/bukkit/World;
/*   */     //   466: iconst_0
/*   */     //   467: anewarray java/lang/Object
/*   */     //   470: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   473: astore #11
/*   */     //   475: getstatic me/konsolas/aac/g4.f : Ljava/lang/reflect/Method;
/*   */     //   478: aload #11
/*   */     //   480: iconst_1
/*   */     //   481: anewarray java/lang/Object
/*   */     //   484: dup
/*   */     //   485: iconst_0
/*   */     //   486: aload #10
/*   */     //   488: aastore
/*   */     //   489: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   492: astore #12
/*   */     //   494: getstatic me/konsolas/aac/g4.h : Ljava/lang/reflect/Method;
/*   */     //   497: aload #12
/*   */     //   499: iconst_3
/*   */     //   500: anewarray java/lang/Object
/*   */     //   503: dup
/*   */     //   504: iconst_0
/*   */     //   505: getstatic me/konsolas/aac/g4.i : Ljava/lang/reflect/Method;
/*   */     //   508: aload_3
/*   */     //   509: iconst_0
/*   */     //   510: anewarray java/lang/Object
/*   */     //   513: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   516: aastore
/*   */     //   517: dup
/*   */     //   518: iconst_1
/*   */     //   519: aload #11
/*   */     //   521: aastore
/*   */     //   522: dup
/*   */     //   523: iconst_2
/*   */     //   524: aload #10
/*   */     //   526: aastore
/*   */     //   527: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   530: checkcast java/lang/Float
/*   */     //   533: invokevirtual floatValue : ()F
/*   */     //   536: freturn
/*   */     //   537: astore #10
/*   */     //   539: new java/lang/RuntimeException
/*   */     //   542: dup
/*   */     //   543: aload #10
/*   */     //   545: invokespecial <init> : (Ljava/lang/Throwable;)V
/*   */     //   548: athrow
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #8	-> 52
/*   */     //   #35	-> 80
/*   */     //   #27	-> 128
/*   */     //   #29	-> 146
/*   */     //   #49	-> 165
/*   */     //   #45	-> 179
/*   */     //   #11	-> 222
/*   */     //   #46	-> 224
/*   */     //   #30	-> 234
/*   */     //   #57	-> 269
/*   */     //   #41	-> 317
/*   */     //   #25	-> 335
/*   */     //   #51	-> 354
/*   */     //   #50	-> 397
/*   */     //   #20	-> 399
/*   */     //   #9	-> 409
/*   */     //   #52	-> 457
/*   */     //   #15	-> 475
/*   */     //   #1	-> 494
/*   */     //   #53	-> 537
/*   */     //   #4	-> 539
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   52	66	69	java/lang/IllegalAccessException
/*   */     //   80	221	222	java/lang/IllegalAccessException
/*   */     //   80	221	222	java/lang/InstantiationException
/*   */     //   80	221	222	java/lang/reflect/InvocationTargetException
/*   */     //   234	245	248	java/lang/IllegalAccessException
/*   */     //   269	396	397	java/lang/IllegalAccessException
/*   */     //   269	396	397	java/lang/InstantiationException
/*   */     //   269	396	397	java/lang/reflect/InvocationTargetException
/*   */     //   409	536	537	java/lang/IllegalAccessException
/*   */     //   409	536	537	java/lang/InstantiationException
/*   */     //   409	536	537	java/lang/reflect/InvocationTargetException
/*   */   }
/*   */   
/*   */   public static int a(long paramLong, Player paramPlayer) {
/*   */     // Byte code:
/*   */     //   0: getstatic me/konsolas/aac/g4.a : J
/*   */     //   3: lload_0
/*   */     //   4: lxor
/*   */     //   5: lstore_0
/*   */     //   6: ldc2_w -4353956552689636613
/*   */     //   9: lload_0
/*   */     //   10: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*   */     //   15: aload_2
/*   */     //   16: invokeinterface getActivePotionEffects : ()Ljava/util/Collection;
/*   */     //   21: invokeinterface iterator : ()Ljava/util/Iterator;
/*   */     //   26: astore #4
/*   */     //   28: astore_3
/*   */     //   29: aload #4
/*   */     //   31: invokeinterface hasNext : ()Z
/*   */     //   36: ifeq -> 130
/*   */     //   39: aload #4
/*   */     //   41: invokeinterface next : ()Ljava/lang/Object;
/*   */     //   46: checkcast org/bukkit/potion/PotionEffect
/*   */     //   49: astore #5
/*   */     //   51: aload #5
/*   */     //   53: invokevirtual getType : ()Lorg/bukkit/potion/PotionEffectType;
/*   */     //   56: getstatic org/bukkit/potion/PotionEffectType.FAST_DIGGING : Lorg/bukkit/potion/PotionEffectType;
/*   */     //   59: invokevirtual equals : (Ljava/lang/Object;)Z
/*   */     //   62: aload_3
/*   */     //   63: lload_0
/*   */     //   64: lconst_0
/*   */     //   65: lcmp
/*   */     //   66: ifle -> 73
/*   */     //   69: ifnull -> 131
/*   */     //   72: aload_3
/*   */     //   73: ifnull -> 125
/*   */     //   76: goto -> 89
/*   */     //   79: ldc2_w -4346030673173386337
/*   */     //   82: lload_0
/*   */     //   83: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*   */     //   88: athrow
/*   */     //   89: ifeq -> 126
/*   */     //   92: goto -> 105
/*   */     //   95: ldc2_w -4346030673173386337
/*   */     //   98: lload_0
/*   */     //   99: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*   */     //   104: athrow
/*   */     //   105: aload #5
/*   */     //   107: invokevirtual getAmplifier : ()I
/*   */     //   110: iconst_1
/*   */     //   111: iadd
/*   */     //   112: goto -> 125
/*   */     //   115: ldc2_w -4346030673173386337
/*   */     //   118: lload_0
/*   */     //   119: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*   */     //   124: athrow
/*   */     //   125: ireturn
/*   */     //   126: aload_3
/*   */     //   127: ifnonnull -> 29
/*   */     //   130: iconst_0
/*   */     //   131: ireturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #36	-> 15
/*   */     //   #16	-> 51
/*   */     //   #59	-> 105
/*   */     //   #42	-> 126
/*   */     //   #56	-> 130
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   51	76	79	java/lang/RuntimeException
/*   */     //   72	92	95	java/lang/RuntimeException
/*   */     //   89	112	115	java/lang/RuntimeException
/*   */   }
/*   */   
/*   */   static {
/*   */     // Byte code:
/*   */     //   0: ldc2_w -7882307429326739684
/*   */     //   3: ldc2_w 5549318415864453912
/*   */     //   6: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
/*   */     //   9: invokevirtual lookupClass : ()Ljava/lang/Class;
/*   */     //   12: invokestatic a : (JJLjava/lang/Object;)Lme/konsolas/aac/na;
/*   */     //   15: ldc2_w 48404356562340
/*   */     //   18: invokeinterface a : (J)J
/*   */     //   23: putstatic me/konsolas/aac/g4.a : J
/*   */     //   26: getstatic me/konsolas/aac/g4.a : J
/*   */     //   29: ldc2_w 76712574053298
/*   */     //   32: lxor
/*   */     //   33: lstore #10
/*   */     //   35: lload #10
/*   */     //   37: dup2
/*   */     //   38: ldc2_w 140670318624733
/*   */     //   41: lxor
/*   */     //   42: lstore #12
/*   */     //   44: dup2
/*   */     //   45: ldc2_w 71067898508596
/*   */     //   48: lxor
/*   */     //   49: lstore #14
/*   */     //   51: dup2
/*   */     //   52: ldc2_w 1272232167077
/*   */     //   55: lxor
/*   */     //   56: lstore #16
/*   */     //   58: dup2
/*   */     //   59: ldc2_w 102516264147869
/*   */     //   62: lxor
/*   */     //   63: lstore #18
/*   */     //   65: dup2
/*   */     //   66: ldc2_w 72333334565591
/*   */     //   69: lxor
/*   */     //   70: lstore #20
/*   */     //   72: dup2
/*   */     //   73: ldc2_w 28289961131569
/*   */     //   76: lxor
/*   */     //   77: lstore #22
/*   */     //   79: dup2
/*   */     //   80: ldc2_w 49208642776202
/*   */     //   83: lxor
/*   */     //   84: lstore #24
/*   */     //   86: dup2
/*   */     //   87: ldc2_w 93888858742579
/*   */     //   90: lxor
/*   */     //   91: lstore #26
/*   */     //   93: dup2
/*   */     //   94: ldc2_w 26718424534419
/*   */     //   97: lxor
/*   */     //   98: dup2
/*   */     //   99: bipush #32
/*   */     //   101: lushr
/*   */     //   102: l2i
/*   */     //   103: istore #28
/*   */     //   105: dup2
/*   */     //   106: bipush #32
/*   */     //   108: lshl
/*   */     //   109: bipush #56
/*   */     //   111: lushr
/*   */     //   112: l2i
/*   */     //   113: istore #29
/*   */     //   115: dup2
/*   */     //   116: bipush #40
/*   */     //   118: lshl
/*   */     //   119: bipush #40
/*   */     //   121: lushr
/*   */     //   122: l2i
/*   */     //   123: istore #30
/*   */     //   125: pop2
/*   */     //   126: pop2
/*   */     //   127: ldc2_w -936545816417396120
/*   */     //   130: lload #10
/*   */     //   132: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*   */     //   137: ifnonnull -> 154
/*   */     //   140: iconst_3
/*   */     //   141: anewarray me/konsolas/aac/aN
/*   */     //   144: ldc2_w -954536749472247113
/*   */     //   147: lload #10
/*   */     //   149: <illegal opcode> w : ([Lme/konsolas/aac/aN;JJ)V
/*   */     //   154: ldc '芈鷲麽בֿ㎷옏஁㤩൅।ဴ喙褎삢❥ዜ?䦏ꏶ⋶㣛'
/*   */     //   156: invokevirtual toCharArray : ()[C
/*   */     //   159: dup
/*   */     //   160: dup
/*   */     //   161: bipush #19
/*   */     //   163: dup_x1
/*   */     //   164: caload
/*   */     //   165: sipush #11628
/*   */     //   168: ixor
/*   */     //   169: i2c
/*   */     //   170: castore
/*   */     //   171: sipush #10101
/*   */     //   174: iconst_0
/*   */     //   175: iconst_4
/*   */     //   176: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*   */     //   179: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/Cipher;
/*   */     //   182: dup
/*   */     //   183: astore_1
/*   */     //   184: iconst_2
/*   */     //   185: ldc_w '앍ﴪ瞷了'
/*   */     //   188: invokevirtual toCharArray : ()[C
/*   */     //   191: dup
/*   */     //   192: dup
/*   */     //   193: iconst_1
/*   */     //   194: dup_x1
/*   */     //   195: caload
/*   */     //   196: sipush #20986
/*   */     //   199: ixor
/*   */     //   200: i2c
/*   */     //   201: castore
/*   */     //   202: sipush #4499
/*   */     //   205: iconst_1
/*   */     //   206: iconst_1
/*   */     //   207: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*   */     //   210: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
/*   */     //   213: bipush #8
/*   */     //   215: newarray byte
/*   */     //   217: dup
/*   */     //   218: iconst_0
/*   */     //   219: lload #10
/*   */     //   221: bipush #56
/*   */     //   223: lushr
/*   */     //   224: l2i
/*   */     //   225: i2b
/*   */     //   226: bastore
/*   */     //   227: iconst_1
/*   */     //   228: istore_2
/*   */     //   229: iload_2
/*   */     //   230: bipush #8
/*   */     //   232: if_icmpge -> 256
/*   */     //   235: dup
/*   */     //   236: iload_2
/*   */     //   237: lload #10
/*   */     //   239: iload_2
/*   */     //   240: bipush #8
/*   */     //   242: imul
/*   */     //   243: lshl
/*   */     //   244: bipush #56
/*   */     //   246: lushr
/*   */     //   247: l2i
/*   */     //   248: i2b
/*   */     //   249: bastore
/*   */     //   250: iinc #2, 1
/*   */     //   253: goto -> 229
/*   */     //   256: new javax/crypto/spec/DESKeySpec
/*   */     //   259: dup_x1
/*   */     //   260: swap
/*   */     //   261: invokespecial <init> : ([B)V
/*   */     //   264: invokevirtual generateSecret : (Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
/*   */     //   267: new javax/crypto/spec/IvParameterSpec
/*   */     //   270: dup
/*   */     //   271: bipush #8
/*   */     //   273: newarray byte
/*   */     //   275: invokespecial <init> : ([B)V
/*   */     //   278: invokevirtual init : (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
/*   */     //   281: bipush #6
/*   */     //   283: anewarray java/lang/String
/*   */     //   286: astore #8
/*   */     //   288: iconst_0
/*   */     //   289: istore #6
/*   */     //   291: ldc_w '䫲雒푯捩牽뙘մᙼก팊쏇诳?鈽葃➆腳쇟硹可臨遐⩹ምᣄ㚿栜拜곊忲⚣蓸坭瑛⍝達芢ል烆⿘섁晥ֺዶ⢵뼍₋纛여摴ඝ蜺ფ蔖勆ꤢ趜⤵?ᑖ䃰᱘伵ꩥﳇ䓭'
/*   */     //   294: invokevirtual toCharArray : ()[C
/*   */     //   297: dup
/*   */     //   298: dup
/*   */     //   299: bipush #37
/*   */     //   301: dup_x1
/*   */     //   302: caload
/*   */     //   303: sipush #8723
/*   */     //   306: ixor
/*   */     //   307: i2c
/*   */     //   308: castore
/*   */     //   309: sipush #7445
/*   */     //   312: iconst_0
/*   */     //   313: iconst_0
/*   */     //   314: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*   */     //   317: dup
/*   */     //   318: astore #5
/*   */     //   320: invokevirtual length : ()I
/*   */     //   323: istore #7
/*   */     //   325: bipush #16
/*   */     //   327: istore #4
/*   */     //   329: iconst_m1
/*   */     //   330: istore_3
/*   */     //   331: iinc #3, 1
/*   */     //   334: aload #5
/*   */     //   336: iload_3
/*   */     //   337: dup
/*   */     //   338: iload #4
/*   */     //   340: iadd
/*   */     //   341: invokevirtual substring : (II)Ljava/lang/String;
/*   */     //   344: iconst_m1
/*   */     //   345: goto -> 475
/*   */     //   348: aload #8
/*   */     //   350: swap
/*   */     //   351: iload #6
/*   */     //   353: iinc #6, 1
/*   */     //   356: swap
/*   */     //   357: aastore
/*   */     //   358: iload_3
/*   */     //   359: iload #4
/*   */     //   361: iadd
/*   */     //   362: dup
/*   */     //   363: istore_3
/*   */     //   364: iload #7
/*   */     //   366: if_icmpge -> 380
/*   */     //   369: aload #5
/*   */     //   371: iload_3
/*   */     //   372: invokevirtual charAt : (I)C
/*   */     //   375: istore #4
/*   */     //   377: goto -> 331
/*   */     //   380: ldc_w '槐ꡢ䵙锑힄嫞뻥ꍀ叟⷏긌ℴ친﷿ဦ嵴堵?䈓㍢鶔䭿癈'
/*   */     //   383: invokevirtual toCharArray : ()[C
/*   */     //   386: dup
/*   */     //   387: dup
/*   */     //   388: bipush #23
/*   */     //   390: dup_x1
/*   */     //   391: caload
/*   */     //   392: sipush #15078
/*   */     //   395: ixor
/*   */     //   396: i2c
/*   */     //   397: castore
/*   */     //   398: sipush #11202
/*   */     //   401: iconst_0
/*   */     //   402: iconst_0
/*   */     //   403: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*   */     //   406: dup
/*   */     //   407: astore #5
/*   */     //   409: invokevirtual length : ()I
/*   */     //   412: istore #7
/*   */     //   414: bipush #16
/*   */     //   416: istore #4
/*   */     //   418: iconst_m1
/*   */     //   419: istore_3
/*   */     //   420: iinc #3, 1
/*   */     //   423: aload #5
/*   */     //   425: iload_3
/*   */     //   426: dup
/*   */     //   427: iload #4
/*   */     //   429: iadd
/*   */     //   430: invokevirtual substring : (II)Ljava/lang/String;
/*   */     //   433: iconst_0
/*   */     //   434: goto -> 475
/*   */     //   437: aload #8
/*   */     //   439: swap
/*   */     //   440: iload #6
/*   */     //   442: iinc #6, 1
/*   */     //   445: swap
/*   */     //   446: aastore
/*   */     //   447: iload_3
/*   */     //   448: iload #4
/*   */     //   450: iadd
/*   */     //   451: dup
/*   */     //   452: istore_3
/*   */     //   453: iload #7
/*   */     //   455: if_icmpge -> 469
/*   */     //   458: aload #5
/*   */     //   460: iload_3
/*   */     //   461: invokevirtual charAt : (I)C
/*   */     //   464: istore #4
/*   */     //   466: goto -> 420
/*   */     //   469: aload #8
/*   */     //   471: astore_0
/*   */     //   472: goto -> 540
/*   */     //   475: swap
/*   */     //   476: ldc_w '쟼쏍瑓ꈤ藶᪕Ⰻ란臆焕煛'
/*   */     //   479: invokevirtual toCharArray : ()[C
/*   */     //   482: dup
/*   */     //   483: dup
/*   */     //   484: iconst_1
/*   */     //   485: dup_x1
/*   */     //   486: caload
/*   */     //   487: sipush #18610
/*   */     //   490: ixor
/*   */     //   491: i2c
/*   */     //   492: castore
/*   */     //   493: sipush #296
/*   */     //   496: iconst_0
/*   */     //   497: iconst_2
/*   */     //   498: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*   */     //   501: invokevirtual getBytes : (Ljava/lang/String;)[B
/*   */     //   504: aload_1
/*   */     //   505: swap
/*   */     //   506: invokevirtual doFinal : ([B)[B
/*   */     //   509: astore #9
/*   */     //   511: aload #9
/*   */     //   513: invokestatic a : ([B)Ljava/lang/String;
/*   */     //   516: invokevirtual intern : ()Ljava/lang/String;
/*   */     //   519: swap
/*   */     //   520: tableswitch default -> 348, 0 -> 437
/*   */     //   540: invokestatic a : ()Lme/konsolas/aac/kP;
/*   */     //   543: lload #14
/*   */     //   545: getstatic me/konsolas/aac/kP.V1_17 : Lme/konsolas/aac/kP;
/*   */     //   548: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*   */     //   551: ifeq -> 584
/*   */     //   554: aconst_null
/*   */     //   555: putstatic me/konsolas/aac/g4.i : Ljava/lang/reflect/Method;
/*   */     //   558: aconst_null
/*   */     //   559: putstatic me/konsolas/aac/g4.c : Ljava/lang/reflect/Method;
/*   */     //   562: aconst_null
/*   */     //   563: putstatic me/konsolas/aac/g4.j : Ljava/lang/reflect/Constructor;
/*   */     //   566: aconst_null
/*   */     //   567: putstatic me/konsolas/aac/g4.f : Ljava/lang/reflect/Method;
/*   */     //   570: goto -> 916
/*   */     //   573: ldc2_w -919623559860495604
/*   */     //   576: lload #10
/*   */     //   578: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*   */     //   583: athrow
/*   */     //   584: lload #26
/*   */     //   586: invokestatic h : (J)Ljava/lang/Class;
/*   */     //   589: aload_0
/*   */     //   590: iconst_3
/*   */     //   591: aaload
/*   */     //   592: iconst_0
/*   */     //   593: anewarray java/lang/Class
/*   */     //   596: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/*   */     //   599: putstatic me/konsolas/aac/g4.c : Ljava/lang/reflect/Method;
/*   */     //   602: lload #20
/*   */     //   604: invokestatic i : (J)Ljava/lang/Class;
/*   */     //   607: aload_0
/*   */     //   608: iconst_1
/*   */     //   609: aaload
/*   */     //   610: iconst_0
/*   */     //   611: anewarray java/lang/Class
/*   */     //   614: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/*   */     //   617: putstatic me/konsolas/aac/g4.i : Ljava/lang/reflect/Method;
/*   */     //   620: lload #12
/*   */     //   622: invokestatic f : (J)Ljava/lang/Class;
/*   */     //   625: iconst_3
/*   */     //   626: anewarray java/lang/Class
/*   */     //   629: dup
/*   */     //   630: iconst_0
/*   */     //   631: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
/*   */     //   634: aastore
/*   */     //   635: dup
/*   */     //   636: iconst_1
/*   */     //   637: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
/*   */     //   640: aastore
/*   */     //   641: dup
/*   */     //   642: iconst_2
/*   */     //   643: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
/*   */     //   646: aastore
/*   */     //   647: invokevirtual getConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
/*   */     //   650: putstatic me/konsolas/aac/g4.j : Ljava/lang/reflect/Constructor;
/*   */     //   653: lload #16
/*   */     //   655: invokestatic q : (J)Ljava/lang/Class;
/*   */     //   658: aload_0
/*   */     //   659: iconst_5
/*   */     //   660: aaload
/*   */     //   661: iconst_1
/*   */     //   662: anewarray java/lang/Class
/*   */     //   665: dup
/*   */     //   666: iconst_0
/*   */     //   667: lload #12
/*   */     //   669: invokestatic f : (J)Ljava/lang/Class;
/*   */     //   672: aastore
/*   */     //   673: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/*   */     //   676: putstatic me/konsolas/aac/g4.f : Ljava/lang/reflect/Method;
/*   */     //   679: invokestatic a : ()Lme/konsolas/aac/kP;
/*   */     //   682: getstatic me/konsolas/aac/kP.V1_8 : Lme/konsolas/aac/kP;
/*   */     //   685: if_acmpne -> 767
/*   */     //   688: lload #24
/*   */     //   690: invokestatic a : (J)Ljava/lang/Class;
/*   */     //   693: aload_0
/*   */     //   694: iconst_2
/*   */     //   695: aaload
/*   */     //   696: iconst_0
/*   */     //   697: anewarray java/lang/Class
/*   */     //   700: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/*   */     //   703: putstatic me/konsolas/aac/g4.e : Ljava/lang/reflect/Method;
/*   */     //   706: iload #28
/*   */     //   708: iload #29
/*   */     //   710: i2b
/*   */     //   711: iload #30
/*   */     //   713: invokestatic p : (IBI)Ljava/lang/Class;
/*   */     //   716: aload_0
/*   */     //   717: iconst_0
/*   */     //   718: aaload
/*   */     //   719: iconst_3
/*   */     //   720: anewarray java/lang/Class
/*   */     //   723: dup
/*   */     //   724: iconst_0
/*   */     //   725: lload #18
/*   */     //   727: invokestatic j : (J)Ljava/lang/Class;
/*   */     //   730: aastore
/*   */     //   731: dup
/*   */     //   732: iconst_1
/*   */     //   733: lload #16
/*   */     //   735: invokestatic q : (J)Ljava/lang/Class;
/*   */     //   738: aastore
/*   */     //   739: dup
/*   */     //   740: iconst_2
/*   */     //   741: lload #12
/*   */     //   743: invokestatic f : (J)Ljava/lang/Class;
/*   */     //   746: aastore
/*   */     //   747: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/*   */     //   750: putstatic me/konsolas/aac/g4.g : Ljava/lang/reflect/Method;
/*   */     //   753: goto -> 901
/*   */     //   756: ldc2_w -919623559860495604
/*   */     //   759: lload #10
/*   */     //   761: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*   */     //   766: athrow
/*   */     //   767: invokestatic a : ()Lme/konsolas/aac/kP;
/*   */     //   770: lload #14
/*   */     //   772: getstatic me/konsolas/aac/kP.V1_13 : Lme/konsolas/aac/kP;
/*   */     //   775: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*   */     //   778: ifeq -> 837
/*   */     //   781: lload #24
/*   */     //   783: invokestatic a : (J)Ljava/lang/Class;
/*   */     //   786: aload_0
/*   */     //   787: iconst_4
/*   */     //   788: aaload
/*   */     //   789: iconst_3
/*   */     //   790: anewarray java/lang/Class
/*   */     //   793: dup
/*   */     //   794: iconst_0
/*   */     //   795: lload #18
/*   */     //   797: invokestatic j : (J)Ljava/lang/Class;
/*   */     //   800: aastore
/*   */     //   801: dup
/*   */     //   802: iconst_1
/*   */     //   803: lload #22
/*   */     //   805: invokestatic r : (J)Ljava/lang/Class;
/*   */     //   808: aastore
/*   */     //   809: dup
/*   */     //   810: iconst_2
/*   */     //   811: lload #12
/*   */     //   813: invokestatic f : (J)Ljava/lang/Class;
/*   */     //   816: aastore
/*   */     //   817: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/*   */     //   820: putstatic me/konsolas/aac/g4.d : Ljava/lang/reflect/Method;
/*   */     //   823: goto -> 901
/*   */     //   826: ldc2_w -919623559860495604
/*   */     //   829: lload #10
/*   */     //   831: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*   */     //   836: athrow
/*   */     //   837: lload #24
/*   */     //   839: invokestatic a : (J)Ljava/lang/Class;
/*   */     //   842: ldc_w 'ᴐ㛓'
/*   */     //   845: invokevirtual toCharArray : ()[C
/*   */     //   848: dup
/*   */     //   849: dup
/*   */     //   850: iconst_0
/*   */     //   851: dup_x1
/*   */     //   852: caload
/*   */     //   853: sipush #21245
/*   */     //   856: ixor
/*   */     //   857: i2c
/*   */     //   858: castore
/*   */     //   859: sipush #13341
/*   */     //   862: iconst_1
/*   */     //   863: iconst_1
/*   */     //   864: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*   */     //   867: iconst_3
/*   */     //   868: anewarray java/lang/Class
/*   */     //   871: dup
/*   */     //   872: iconst_0
/*   */     //   873: lload #18
/*   */     //   875: invokestatic j : (J)Ljava/lang/Class;
/*   */     //   878: aastore
/*   */     //   879: dup
/*   */     //   880: iconst_1
/*   */     //   881: lload #16
/*   */     //   883: invokestatic q : (J)Ljava/lang/Class;
/*   */     //   886: aastore
/*   */     //   887: dup
/*   */     //   888: iconst_2
/*   */     //   889: lload #12
/*   */     //   891: invokestatic f : (J)Ljava/lang/Class;
/*   */     //   894: aastore
/*   */     //   895: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/*   */     //   898: putstatic me/konsolas/aac/g4.h : Ljava/lang/reflect/Method;
/*   */     //   901: goto -> 916
/*   */     //   904: astore #31
/*   */     //   906: new java/lang/RuntimeException
/*   */     //   909: dup
/*   */     //   910: aload #31
/*   */     //   912: invokespecial <init> : (Ljava/lang/Throwable;)V
/*   */     //   915: athrow
/*   */     //   916: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #14	-> 540
/*   */     //   #44	-> 554
/*   */     //   #40	-> 558
/*   */     //   #23	-> 562
/*   */     //   #38	-> 566
/*   */     //   #19	-> 584
/*   */     //   #31	-> 602
/*   */     //   #47	-> 620
/*   */     //   #28	-> 653
/*   */     //   #58	-> 679
/*   */     //   #33	-> 688
/*   */     //   #10	-> 706
/*   */     //   #22	-> 725
/*   */     //   #37	-> 733
/*   */     //   #34	-> 741
/*   */     //   #32	-> 747
/*   */     //   #6	-> 767
/*   */     //   #13	-> 781
/*   */     //   #7	-> 795
/*   */     //   #12	-> 803
/*   */     //   #26	-> 811
/*   */     //   #17	-> 817
/*   */     //   #48	-> 837
/*   */     //   #3	-> 873
/*   */     //   #54	-> 881
/*   */     //   #21	-> 889
/*   */     //   #2	-> 895
/*   */     //   #24	-> 901
/*   */     //   #43	-> 904
/*   */     //   #18	-> 906
/*   */     //   #39	-> 916
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   540	573	573	java/lang/Exception
/*   */     //   584	756	756	java/lang/Exception
/*   */     //   584	901	904	java/lang/Exception
/*   */     //   767	826	826	java/lang/Exception
/*   */   }
/*   */   
/*   */   public static void b(aN[] paramArrayOfaN) {
/*   */     b = paramArrayOfaN;
/*   */   }
/*   */   
/*   */   public static aN[] b() {
/*   */     return b;
/*   */   }
/*   */   
/*   */   private static Exception a(Exception paramException) {
/*   */     return paramException;
/*   */   }
/*   */   
/*   */   private static String a(byte[] paramArrayOfbyte) {
/*   */     byte b1 = 0;
/*   */     int i;
/*   */     char[] arrayOfChar = new char[i = paramArrayOfbyte.length];
/*   */     for (byte b2 = 0; b2 < i; b2++) {
/*   */       int j;
/*   */       if ((j = 0xFF & paramArrayOfbyte[b2]) < 192) {
/*   */         arrayOfChar[b1++] = (char)j;
/*   */       } else if (j < 224) {
/*   */         char c = (char)((char)(j & 0x1F) << 6);
/*   */         j = paramArrayOfbyte[++b2];
/*   */         c = (char)(c | (char)(j & 0x3F));
/*   */         arrayOfChar[b1++] = c;
/*   */       } else if (b2 < i - 2) {
/*   */         char c = (char)((char)(j & 0xF) << 12);
/*   */         j = paramArrayOfbyte[++b2];
/*   */         c = (char)(c | (char)(j & 0x3F) << 6);
/*   */         j = paramArrayOfbyte[++b2];
/*   */         c = (char)(c | (char)(j & 0x3F));
/*   */         arrayOfChar[b1++] = c;
/*   */       } 
/*   */     } 
/*   */     return new String(arrayOfChar, 0, b1);
/*   */   }
/*   */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\g4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */