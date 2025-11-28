/*    */ package me.konsolas.aac;
/*    */ import javax.crypto.Cipher;
/*    */ 
/*    */ public class cm extends ck {
/*    */   private static final ItemStack p;
/*    */   
/*    */   private static float a(float paramFloat) {
/*  8 */     return 0.1F + 0.95F * paramFloat;
/*    */   }
/*    */   private final O g; private final boolean k;
/*    */   private final boolean j;
/*    */   private final boolean t;
/*    */   private final boolean l;
/*    */   private final boolean i;
/*    */   private final boolean o;
/*    */   private final boolean s;
/*    */   private final boolean a;
/*    */   private long r;
/*    */   private long q;
/*    */   private long m;
/*    */   private long n;
/*    */   private long h;
/*    */   private long u;
/*    */   private long f;
/*    */   private static final long v;
/*    */   private static final String[] w;
/*    */   private static final String[] x;
/*    */   private static final Map y;
/*    */   
/*    */   public boolean a(float paramFloat, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/cm.v : J
/*    */     //   3: lload_2
/*    */     //   4: lxor
/*    */     //   5: lstore_2
/*    */     //   6: lload_2
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 117390128218318
/*    */     //   11: lxor
/*    */     //   12: lstore #4
/*    */     //   14: dup2
/*    */     //   15: ldc2_w 52230233875880
/*    */     //   18: lxor
/*    */     //   19: lstore #6
/*    */     //   21: dup2
/*    */     //   22: ldc2_w 68917777174436
/*    */     //   25: lxor
/*    */     //   26: lstore #8
/*    */     //   28: pop2
/*    */     //   29: ldc2_w -7759973643382565123
/*    */     //   32: lload_2
/*    */     //   33: <illegal opcode> w : (JJ)Ljava/lang/String;
/*    */     //   38: astore #10
/*    */     //   40: aload_0
/*    */     //   41: getfield l : Z
/*    */     //   44: aload #10
/*    */     //   46: ifnonnull -> 279
/*    */     //   49: ifeq -> 278
/*    */     //   52: goto -> 65
/*    */     //   55: ldc2_w -7656293036849583693
/*    */     //   58: lload_2
/*    */     //   59: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   64: athrow
/*    */     //   65: invokestatic currentTimeMillis : ()J
/*    */     //   68: aload_0
/*    */     //   69: getfield n : J
/*    */     //   72: lsub
/*    */     //   73: lstore #11
/*    */     //   75: fload_1
/*    */     //   76: invokestatic a : (F)F
/*    */     //   79: fstore #13
/*    */     //   81: fload #13
/*    */     //   83: lload #11
/*    */     //   85: l2f
/*    */     //   86: ldc 1000.0
/*    */     //   88: fdiv
/*    */     //   89: fsub
/*    */     //   90: fstore #14
/*    */     //   92: aload_0
/*    */     //   93: getfield g : Lme/konsolas/aac/O;
/*    */     //   96: invokevirtual a : ()F
/*    */     //   99: ldc 0.5
/*    */     //   101: fcmpl
/*    */     //   102: aload #10
/*    */     //   104: lload_2
/*    */     //   105: lconst_0
/*    */     //   106: lcmp
/*    */     //   107: iflt -> 182
/*    */     //   110: ifnonnull -> 180
/*    */     //   113: ifle -> 162
/*    */     //   116: goto -> 129
/*    */     //   119: ldc2_w -7656293036849583693
/*    */     //   122: lload_2
/*    */     //   123: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   128: athrow
/*    */     //   129: aload_0
/*    */     //   130: ldc2_w -7652674814142249743
/*    */     //   133: lload_2
/*    */     //   134: <illegal opcode> Ñ : (JJ)Lme/konsolas/aac/eA;
/*    */     //   139: fload #14
/*    */     //   141: fload #13
/*    */     //   143: fdiv
/*    */     //   144: lload #4
/*    */     //   146: invokevirtual a : (Lme/konsolas/aac/eA;FJ)V
/*    */     //   149: goto -> 162
/*    */     //   152: ldc2_w -7656293036849583693
/*    */     //   155: lload_2
/*    */     //   156: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   161: athrow
/*    */     //   162: aload_0
/*    */     //   163: invokevirtual a : ()Lme/konsolas/aac/AAC;
/*    */     //   166: invokevirtual a : ()Lme/konsolas/aac/w;
/*    */     //   169: aload_0
/*    */     //   170: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*    */     //   173: lload #8
/*    */     //   175: dup2_x1
/*    */     //   176: pop2
/*    */     //   177: invokevirtual a : (JLorg/bukkit/entity/Player;)Z
/*    */     //   180: aload #10
/*    */     //   182: ifnonnull -> 277
/*    */     //   185: ifeq -> 266
/*    */     //   188: goto -> 201
/*    */     //   191: ldc2_w -7656293036849583693
/*    */     //   194: lload_2
/*    */     //   195: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   200: athrow
/*    */     //   201: aload_0
/*    */     //   202: invokevirtual a : ()Lme/konsolas/aac/AAC;
/*    */     //   205: invokevirtual a : ()Lme/konsolas/aac/w;
/*    */     //   208: aload_0
/*    */     //   209: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*    */     //   212: sipush #2466
/*    */     //   215: ldc2_w 6076113635613778772
/*    */     //   218: lload_2
/*    */     //   219: lxor
/*    */     //   220: <illegal opcode> k : (IJ)Ljava/lang/String;
/*    */     //   225: iconst_2
/*    */     //   226: anewarray java/lang/Object
/*    */     //   229: dup
/*    */     //   230: iconst_0
/*    */     //   231: aload_0
/*    */     //   232: getfield g : Lme/konsolas/aac/O;
/*    */     //   235: invokevirtual a : ()F
/*    */     //   238: invokestatic valueOf : (F)Ljava/lang/Float;
/*    */     //   241: aastore
/*    */     //   242: dup
/*    */     //   243: iconst_1
/*    */     //   244: fload #14
/*    */     //   246: invokestatic valueOf : (F)Ljava/lang/Float;
/*    */     //   249: aastore
/*    */     //   250: invokevirtual a : (Lorg/bukkit/entity/Player;Ljava/lang/String;[Ljava/lang/Object;)V
/*    */     //   253: goto -> 266
/*    */     //   256: ldc2_w -7656293036849583693
/*    */     //   259: lload_2
/*    */     //   260: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   265: athrow
/*    */     //   266: aload_0
/*    */     //   267: getfield g : Lme/konsolas/aac/O;
/*    */     //   270: fload #14
/*    */     //   272: lload #6
/*    */     //   274: invokevirtual a : (FJ)Z
/*    */     //   277: ireturn
/*    */     //   278: iconst_0
/*    */     //   279: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #9	-> 40
/*    */     //   #72	-> 65
/*    */     //   #93	-> 75
/*    */     //   #22	-> 81
/*    */     //   #47	-> 92
/*    */     //   #44	-> 162
/*    */     //   #70	-> 201
/*    */     //   #27	-> 266
/*    */     //   #2	-> 278
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   40	52	55	aacinternal/v
/*    */     //   92	116	119	aacinternal/v
/*    */     //   113	149	152	aacinternal/v
/*    */     //   180	188	191	aacinternal/v
/*    */     //   185	253	256	aacinternal/v
/*    */   }
/*    */   
/*    */   public boolean a(byte paramByte, int paramInt1, int paramInt2) {
/*    */     // Byte code:
/*    */     //   0: iload_1
/*    */     //   1: i2l
/*    */     //   2: bipush #56
/*    */     //   4: lshl
/*    */     //   5: iload_2
/*    */     //   6: i2l
/*    */     //   7: bipush #32
/*    */     //   9: lshl
/*    */     //   10: bipush #8
/*    */     //   12: lushr
/*    */     //   13: lor
/*    */     //   14: iload_3
/*    */     //   15: i2l
/*    */     //   16: bipush #40
/*    */     //   18: lshl
/*    */     //   19: bipush #40
/*    */     //   21: lushr
/*    */     //   22: lor
/*    */     //   23: getstatic me/konsolas/aac/cm.v : J
/*    */     //   26: lxor
/*    */     //   27: lstore #4
/*    */     //   29: lload #4
/*    */     //   31: dup2
/*    */     //   32: ldc2_w 38003402843654
/*    */     //   35: lxor
/*    */     //   36: lstore #6
/*    */     //   38: dup2
/*    */     //   39: ldc2_w 114162701058912
/*    */     //   42: lxor
/*    */     //   43: lstore #8
/*    */     //   45: dup2
/*    */     //   46: ldc2_w 130818061609324
/*    */     //   49: lxor
/*    */     //   50: lstore #10
/*    */     //   52: pop2
/*    */     //   53: ldc2_w -5582421463517958091
/*    */     //   56: lload #4
/*    */     //   58: <illegal opcode> w : (JJ)Ljava/lang/String;
/*    */     //   63: astore #12
/*    */     //   65: aload_0
/*    */     //   66: getfield j : Z
/*    */     //   69: aload #12
/*    */     //   71: ifnonnull -> 503
/*    */     //   74: ifeq -> 502
/*    */     //   77: goto -> 91
/*    */     //   80: ldc2_w -5514892659535147141
/*    */     //   83: lload #4
/*    */     //   85: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   90: athrow
/*    */     //   91: invokestatic a : ()Lme/konsolas/aac/mJ;
/*    */     //   94: aload_0
/*    */     //   95: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*    */     //   98: invokeinterface a : (Lorg/bukkit/entity/Player;)Ljava/util/Collection;
/*    */     //   103: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   108: astore #13
/*    */     //   110: aload #13
/*    */     //   112: invokeinterface hasNext : ()Z
/*    */     //   117: ifeq -> 245
/*    */     //   120: aload #13
/*    */     //   122: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   127: checkcast org/bukkit/inventory/ItemStack
/*    */     //   130: astore #14
/*    */     //   132: aload #14
/*    */     //   134: aload #12
/*    */     //   136: iload_1
/*    */     //   137: iflt -> 168
/*    */     //   140: ifnonnull -> 162
/*    */     //   143: ifnull -> 240
/*    */     //   146: goto -> 160
/*    */     //   149: ldc2_w -5514892659535147141
/*    */     //   152: lload #4
/*    */     //   154: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   159: athrow
/*    */     //   160: aload #14
/*    */     //   162: iload_3
/*    */     //   163: iflt -> 210
/*    */     //   166: aload #12
/*    */     //   168: ifnonnull -> 210
/*    */     //   171: invokevirtual getType : ()Lorg/bukkit/Material;
/*    */     //   174: getstatic org/bukkit/Material.FLINT_AND_STEEL : Lorg/bukkit/Material;
/*    */     //   177: if_acmpeq -> 238
/*    */     //   180: goto -> 194
/*    */     //   183: ldc2_w -5514892659535147141
/*    */     //   186: lload #4
/*    */     //   188: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   193: athrow
/*    */     //   194: aload #14
/*    */     //   196: goto -> 210
/*    */     //   199: ldc2_w -5514892659535147141
/*    */     //   202: lload #4
/*    */     //   204: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   209: athrow
/*    */     //   210: getstatic me/konsolas/aac/cm.p : Lorg/bukkit/inventory/ItemStack;
/*    */     //   213: invokevirtual isSimilar : (Lorg/bukkit/inventory/ItemStack;)Z
/*    */     //   216: aload #12
/*    */     //   218: ifnonnull -> 239
/*    */     //   221: ifeq -> 240
/*    */     //   224: goto -> 238
/*    */     //   227: ldc2_w -5514892659535147141
/*    */     //   230: lload #4
/*    */     //   232: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   237: athrow
/*    */     //   238: iconst_0
/*    */     //   239: ireturn
/*    */     //   240: aload #12
/*    */     //   242: ifnull -> 110
/*    */     //   245: invokestatic currentTimeMillis : ()J
/*    */     //   248: lstore #13
/*    */     //   250: aload_0
/*    */     //   251: getfield m : J
/*    */     //   254: lstore #15
/*    */     //   256: lload #13
/*    */     //   258: lload #15
/*    */     //   260: lsub
/*    */     //   261: lstore #17
/*    */     //   263: aload_0
/*    */     //   264: lload #13
/*    */     //   266: putfield m : J
/*    */     //   269: lload #15
/*    */     //   271: lconst_0
/*    */     //   272: lcmp
/*    */     //   273: aload #12
/*    */     //   275: ifnonnull -> 296
/*    */     //   278: ifne -> 297
/*    */     //   281: goto -> 295
/*    */     //   284: ldc2_w -5514892659535147141
/*    */     //   287: lload #4
/*    */     //   289: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   294: athrow
/*    */     //   295: iconst_0
/*    */     //   296: ireturn
/*    */     //   297: ldc 0.05
/*    */     //   299: fstore #19
/*    */     //   301: fload #19
/*    */     //   303: lload #17
/*    */     //   305: l2f
/*    */     //   306: ldc 1000.0
/*    */     //   308: fdiv
/*    */     //   309: fsub
/*    */     //   310: fstore #20
/*    */     //   312: aload_0
/*    */     //   313: getfield g : Lme/konsolas/aac/O;
/*    */     //   316: invokevirtual a : ()F
/*    */     //   319: ldc 0.5
/*    */     //   321: fcmpl
/*    */     //   322: aload #12
/*    */     //   324: iload_2
/*    */     //   325: ifle -> 403
/*    */     //   328: ifnonnull -> 401
/*    */     //   331: ifle -> 383
/*    */     //   334: goto -> 348
/*    */     //   337: ldc2_w -5514892659535147141
/*    */     //   340: lload #4
/*    */     //   342: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   347: athrow
/*    */     //   348: aload_0
/*    */     //   349: ldc2_w -5613830016101080670
/*    */     //   352: lload #4
/*    */     //   354: <illegal opcode> Ñ : (JJ)Lme/konsolas/aac/eA;
/*    */     //   359: fload #20
/*    */     //   361: fload #19
/*    */     //   363: fdiv
/*    */     //   364: lload #6
/*    */     //   366: invokevirtual a : (Lme/konsolas/aac/eA;FJ)V
/*    */     //   369: goto -> 383
/*    */     //   372: ldc2_w -5514892659535147141
/*    */     //   375: lload #4
/*    */     //   377: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   382: athrow
/*    */     //   383: aload_0
/*    */     //   384: invokevirtual a : ()Lme/konsolas/aac/AAC;
/*    */     //   387: invokevirtual a : ()Lme/konsolas/aac/w;
/*    */     //   390: aload_0
/*    */     //   391: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*    */     //   394: lload #10
/*    */     //   396: dup2_x1
/*    */     //   397: pop2
/*    */     //   398: invokevirtual a : (JLorg/bukkit/entity/Player;)Z
/*    */     //   401: aload #12
/*    */     //   403: ifnonnull -> 501
/*    */     //   406: ifeq -> 490
/*    */     //   409: goto -> 423
/*    */     //   412: ldc2_w -5514892659535147141
/*    */     //   415: lload #4
/*    */     //   417: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   422: athrow
/*    */     //   423: aload_0
/*    */     //   424: invokevirtual a : ()Lme/konsolas/aac/AAC;
/*    */     //   427: invokevirtual a : ()Lme/konsolas/aac/w;
/*    */     //   430: aload_0
/*    */     //   431: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*    */     //   434: sipush #32436
/*    */     //   437: ldc2_w 4807845865740628631
/*    */     //   440: lload #4
/*    */     //   442: lxor
/*    */     //   443: <illegal opcode> k : (IJ)Ljava/lang/String;
/*    */     //   448: iconst_2
/*    */     //   449: anewarray java/lang/Object
/*    */     //   452: dup
/*    */     //   453: iconst_0
/*    */     //   454: aload_0
/*    */     //   455: getfield g : Lme/konsolas/aac/O;
/*    */     //   458: invokevirtual a : ()F
/*    */     //   461: invokestatic valueOf : (F)Ljava/lang/Float;
/*    */     //   464: aastore
/*    */     //   465: dup
/*    */     //   466: iconst_1
/*    */     //   467: fload #20
/*    */     //   469: invokestatic valueOf : (F)Ljava/lang/Float;
/*    */     //   472: aastore
/*    */     //   473: invokevirtual a : (Lorg/bukkit/entity/Player;Ljava/lang/String;[Ljava/lang/Object;)V
/*    */     //   476: goto -> 490
/*    */     //   479: ldc2_w -5514892659535147141
/*    */     //   482: lload #4
/*    */     //   484: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   489: athrow
/*    */     //   490: aload_0
/*    */     //   491: getfield g : Lme/konsolas/aac/O;
/*    */     //   494: fload #20
/*    */     //   496: lload #8
/*    */     //   498: invokevirtual a : (FJ)Z
/*    */     //   501: ireturn
/*    */     //   502: iconst_0
/*    */     //   503: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #10	-> 65
/*    */     //   #102	-> 91
/*    */     //   #40	-> 132
/*    */     //   #114	-> 238
/*    */     //   #30	-> 240
/*    */     //   #31	-> 245
/*    */     //   #61	-> 250
/*    */     //   #95	-> 256
/*    */     //   #112	-> 263
/*    */     //   #16	-> 269
/*    */     //   #36	-> 297
/*    */     //   #37	-> 301
/*    */     //   #78	-> 312
/*    */     //   #46	-> 383
/*    */     //   #115	-> 423
/*    */     //   #3	-> 490
/*    */     //   #64	-> 502
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   65	77	80	aacinternal/v
/*    */     //   132	146	149	aacinternal/v
/*    */     //   162	180	183	aacinternal/v
/*    */     //   171	196	199	aacinternal/v
/*    */     //   210	224	227	aacinternal/v
/*    */     //   263	281	284	aacinternal/v
/*    */     //   312	334	337	aacinternal/v
/*    */     //   331	369	372	aacinternal/v
/*    */     //   401	409	412	aacinternal/v
/*    */     //   406	476	479	aacinternal/v
/*    */   }
/*    */   
/*    */   public void b(char paramChar, short paramShort, int paramInt) {
/*    */     // Byte code:
/*    */     //   0: iload_1
/*    */     //   1: i2l
/*    */     //   2: bipush #48
/*    */     //   4: lshl
/*    */     //   5: iload_2
/*    */     //   6: i2l
/*    */     //   7: bipush #48
/*    */     //   9: lshl
/*    */     //   10: bipush #16
/*    */     //   12: lushr
/*    */     //   13: lor
/*    */     //   14: iload_3
/*    */     //   15: i2l
/*    */     //   16: bipush #32
/*    */     //   18: lshl
/*    */     //   19: bipush #32
/*    */     //   21: lushr
/*    */     //   22: lor
/*    */     //   23: getstatic me/konsolas/aac/cm.v : J
/*    */     //   26: lxor
/*    */     //   27: lstore #4
/*    */     //   29: lload #4
/*    */     //   31: dup2
/*    */     //   32: ldc2_w 116084869443157
/*    */     //   35: lxor
/*    */     //   36: lstore #6
/*    */     //   38: dup2
/*    */     //   39: ldc2_w 49275438746419
/*    */     //   42: lxor
/*    */     //   43: lstore #8
/*    */     //   45: dup2
/*    */     //   46: ldc2_w 68161972740415
/*    */     //   49: lxor
/*    */     //   50: lstore #10
/*    */     //   52: pop2
/*    */     //   53: ldc2_w 4239024444057942118
/*    */     //   56: lload #4
/*    */     //   58: <illegal opcode> w : (JJ)Ljava/lang/String;
/*    */     //   63: astore #12
/*    */     //   65: aload_0
/*    */     //   66: getfield o : Z
/*    */     //   69: ifeq -> 320
/*    */     //   72: invokestatic currentTimeMillis : ()J
/*    */     //   75: lstore #13
/*    */     //   77: aload_0
/*    */     //   78: getfield u : J
/*    */     //   81: lstore #15
/*    */     //   83: lload #13
/*    */     //   85: lload #15
/*    */     //   87: lsub
/*    */     //   88: lstore #17
/*    */     //   90: aload_0
/*    */     //   91: lload #13
/*    */     //   93: putfield u : J
/*    */     //   96: lload #15
/*    */     //   98: lconst_0
/*    */     //   99: lcmp
/*    */     //   100: ifne -> 115
/*    */     //   103: return
/*    */     //   104: ldc2_w 4261638195764266792
/*    */     //   107: lload #4
/*    */     //   109: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   114: athrow
/*    */     //   115: ldc 0.1
/*    */     //   117: fstore #19
/*    */     //   119: fload #19
/*    */     //   121: lload #17
/*    */     //   123: l2f
/*    */     //   124: ldc 1000.0
/*    */     //   126: fdiv
/*    */     //   127: fsub
/*    */     //   128: fstore #20
/*    */     //   130: aload_0
/*    */     //   131: getfield g : Lme/konsolas/aac/O;
/*    */     //   134: invokevirtual a : ()F
/*    */     //   137: ldc 0.5
/*    */     //   139: fcmpl
/*    */     //   140: aload #12
/*    */     //   142: iload_1
/*    */     //   143: iflt -> 221
/*    */     //   146: ifnonnull -> 219
/*    */     //   149: ifle -> 201
/*    */     //   152: goto -> 166
/*    */     //   155: ldc2_w 4261638195764266792
/*    */     //   158: lload #4
/*    */     //   160: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   165: athrow
/*    */     //   166: aload_0
/*    */     //   167: ldc2_w 4239848591350964741
/*    */     //   170: lload #4
/*    */     //   172: <illegal opcode> Ñ : (JJ)Lme/konsolas/aac/eA;
/*    */     //   177: fload #20
/*    */     //   179: fload #19
/*    */     //   181: fdiv
/*    */     //   182: lload #6
/*    */     //   184: invokevirtual a : (Lme/konsolas/aac/eA;FJ)V
/*    */     //   187: goto -> 201
/*    */     //   190: ldc2_w 4261638195764266792
/*    */     //   193: lload #4
/*    */     //   195: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   200: athrow
/*    */     //   201: aload_0
/*    */     //   202: invokevirtual a : ()Lme/konsolas/aac/AAC;
/*    */     //   205: invokevirtual a : ()Lme/konsolas/aac/w;
/*    */     //   208: aload_0
/*    */     //   209: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*    */     //   212: lload #10
/*    */     //   214: dup2_x1
/*    */     //   215: pop2
/*    */     //   216: invokevirtual a : (JLorg/bukkit/entity/Player;)Z
/*    */     //   219: aload #12
/*    */     //   221: ifnonnull -> 319
/*    */     //   224: ifeq -> 308
/*    */     //   227: goto -> 241
/*    */     //   230: ldc2_w 4261638195764266792
/*    */     //   233: lload #4
/*    */     //   235: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   240: athrow
/*    */     //   241: aload_0
/*    */     //   242: invokevirtual a : ()Lme/konsolas/aac/AAC;
/*    */     //   245: invokevirtual a : ()Lme/konsolas/aac/w;
/*    */     //   248: aload_0
/*    */     //   249: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*    */     //   252: sipush #10017
/*    */     //   255: ldc2_w 3403882352139772747
/*    */     //   258: lload #4
/*    */     //   260: lxor
/*    */     //   261: <illegal opcode> k : (IJ)Ljava/lang/String;
/*    */     //   266: iconst_2
/*    */     //   267: anewarray java/lang/Object
/*    */     //   270: dup
/*    */     //   271: iconst_0
/*    */     //   272: aload_0
/*    */     //   273: getfield g : Lme/konsolas/aac/O;
/*    */     //   276: invokevirtual a : ()F
/*    */     //   279: invokestatic valueOf : (F)Ljava/lang/Float;
/*    */     //   282: aastore
/*    */     //   283: dup
/*    */     //   284: iconst_1
/*    */     //   285: fload #20
/*    */     //   287: invokestatic valueOf : (F)Ljava/lang/Float;
/*    */     //   290: aastore
/*    */     //   291: invokevirtual a : (Lorg/bukkit/entity/Player;Ljava/lang/String;[Ljava/lang/Object;)V
/*    */     //   294: goto -> 308
/*    */     //   297: ldc2_w 4261638195764266792
/*    */     //   300: lload #4
/*    */     //   302: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   307: athrow
/*    */     //   308: aload_0
/*    */     //   309: getfield g : Lme/konsolas/aac/O;
/*    */     //   312: fload #20
/*    */     //   314: lload #8
/*    */     //   316: invokevirtual a : (FJ)Z
/*    */     //   319: pop
/*    */     //   320: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #23	-> 65
/*    */     //   #90	-> 72
/*    */     //   #73	-> 77
/*    */     //   #97	-> 83
/*    */     //   #88	-> 90
/*    */     //   #13	-> 96
/*    */     //   #21	-> 115
/*    */     //   #50	-> 119
/*    */     //   #32	-> 130
/*    */     //   #66	-> 201
/*    */     //   #76	-> 241
/*    */     //   #17	-> 308
/*    */     //   #19	-> 320
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   90	104	104	aacinternal/v
/*    */     //   130	152	155	aacinternal/v
/*    */     //   149	187	190	aacinternal/v
/*    */     //   219	227	230	aacinternal/v
/*    */     //   224	294	297	aacinternal/v
/*    */   }
/*    */   
/*    */   public void a(long paramLong, Action paramAction) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/cm.v : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: ldc2_w 1983012428505372983
/*    */     //   9: lload_1
/*    */     //   10: <illegal opcode> w : (JJ)Ljava/lang/String;
/*    */     //   15: astore #4
/*    */     //   17: aload_3
/*    */     //   18: getstatic org/bukkit/event/block/Action.RIGHT_CLICK_AIR : Lorg/bukkit/event/block/Action;
/*    */     //   21: aload #4
/*    */     //   23: ifnonnull -> 59
/*    */     //   26: if_acmpeq -> 62
/*    */     //   29: goto -> 42
/*    */     //   32: ldc2_w 1906562328019478137
/*    */     //   35: lload_1
/*    */     //   36: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   41: athrow
/*    */     //   42: aload_3
/*    */     //   43: getstatic org/bukkit/event/block/Action.RIGHT_CLICK_BLOCK : Lorg/bukkit/event/block/Action;
/*    */     //   46: goto -> 59
/*    */     //   49: ldc2_w 1906562328019478137
/*    */     //   52: lload_1
/*    */     //   53: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   58: athrow
/*    */     //   59: if_acmpne -> 82
/*    */     //   62: aload_0
/*    */     //   63: invokestatic currentTimeMillis : ()J
/*    */     //   66: putfield n : J
/*    */     //   69: goto -> 82
/*    */     //   72: ldc2_w 1906562328019478137
/*    */     //   75: lload_1
/*    */     //   76: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   81: athrow
/*    */     //   82: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #24	-> 17
/*    */     //   #79	-> 62
/*    */     //   #69	-> 82
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   17	29	32	aacinternal/v
/*    */     //   26	46	49	aacinternal/v
/*    */     //   59	69	72	aacinternal/v
/*    */   }
/*    */   
/*    */   public boolean a(char paramChar, int paramInt1, int paramInt2, Material paramMaterial) {
/*    */     // Byte code:
/*    */     //   0: iload_1
/*    */     //   1: i2l
/*    */     //   2: bipush #48
/*    */     //   4: lshl
/*    */     //   5: iload_2
/*    */     //   6: i2l
/*    */     //   7: bipush #32
/*    */     //   9: lshl
/*    */     //   10: bipush #16
/*    */     //   12: lushr
/*    */     //   13: lor
/*    */     //   14: iload_3
/*    */     //   15: i2l
/*    */     //   16: bipush #48
/*    */     //   18: lshl
/*    */     //   19: bipush #48
/*    */     //   21: lushr
/*    */     //   22: lor
/*    */     //   23: getstatic me/konsolas/aac/cm.v : J
/*    */     //   26: lxor
/*    */     //   27: lstore #5
/*    */     //   29: lload #5
/*    */     //   31: dup2
/*    */     //   32: ldc2_w 58756825997472
/*    */     //   35: lxor
/*    */     //   36: lstore #7
/*    */     //   38: dup2
/*    */     //   39: ldc2_w 47210553373208
/*    */     //   42: lxor
/*    */     //   43: lstore #9
/*    */     //   45: dup2
/*    */     //   46: ldc2_w 122822511728510
/*    */     //   49: lxor
/*    */     //   50: lstore #11
/*    */     //   52: dup2
/*    */     //   53: ldc2_w 139200947518834
/*    */     //   56: lxor
/*    */     //   57: lstore #13
/*    */     //   59: pop2
/*    */     //   60: ldc2_w 7393020672801121323
/*    */     //   63: lload #5
/*    */     //   65: <illegal opcode> w : (JJ)Ljava/lang/String;
/*    */     //   70: astore #15
/*    */     //   72: aload_0
/*    */     //   73: getfield t : Z
/*    */     //   76: aload #15
/*    */     //   78: ifnonnull -> 368
/*    */     //   81: ifeq -> 367
/*    */     //   84: goto -> 98
/*    */     //   87: ldc2_w 7451524683162147685
/*    */     //   90: lload #5
/*    */     //   92: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   97: athrow
/*    */     //   98: invokestatic currentTimeMillis : ()J
/*    */     //   101: aload_0
/*    */     //   102: getfield n : J
/*    */     //   105: lsub
/*    */     //   106: lstore #16
/*    */     //   108: invokestatic a : ()Lme/konsolas/aac/kP;
/*    */     //   111: lload #7
/*    */     //   113: getstatic me/konsolas/aac/kP.V1_13 : Lme/konsolas/aac/kP;
/*    */     //   116: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*    */     //   119: ifeq -> 161
/*    */     //   122: aload #4
/*    */     //   124: getstatic org/bukkit/Material.DRIED_KELP : Lorg/bukkit/Material;
/*    */     //   127: if_acmpne -> 161
/*    */     //   130: goto -> 144
/*    */     //   133: ldc2_w 7451524683162147685
/*    */     //   136: lload #5
/*    */     //   138: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   143: athrow
/*    */     //   144: ldc_w 0.75
/*    */     //   147: goto -> 164
/*    */     //   150: ldc2_w 7451524683162147685
/*    */     //   153: lload #5
/*    */     //   155: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   160: athrow
/*    */     //   161: ldc_w 1.5
/*    */     //   164: fstore #18
/*    */     //   166: fload #18
/*    */     //   168: lload #16
/*    */     //   170: l2f
/*    */     //   171: ldc 1000.0
/*    */     //   173: fdiv
/*    */     //   174: fsub
/*    */     //   175: fstore #19
/*    */     //   177: aload_0
/*    */     //   178: getfield g : Lme/konsolas/aac/O;
/*    */     //   181: invokevirtual a : ()F
/*    */     //   184: ldc 0.5
/*    */     //   186: fcmpl
/*    */     //   187: aload #15
/*    */     //   189: iload_2
/*    */     //   190: iflt -> 268
/*    */     //   193: ifnonnull -> 266
/*    */     //   196: ifle -> 248
/*    */     //   199: goto -> 213
/*    */     //   202: ldc2_w 7451524683162147685
/*    */     //   205: lload #5
/*    */     //   207: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   212: athrow
/*    */     //   213: aload_0
/*    */     //   214: ldc2_w 7364526871584306034
/*    */     //   217: lload #5
/*    */     //   219: <illegal opcode> Ñ : (JJ)Lme/konsolas/aac/eA;
/*    */     //   224: fload #19
/*    */     //   226: fload #18
/*    */     //   228: fdiv
/*    */     //   229: lload #9
/*    */     //   231: invokevirtual a : (Lme/konsolas/aac/eA;FJ)V
/*    */     //   234: goto -> 248
/*    */     //   237: ldc2_w 7451524683162147685
/*    */     //   240: lload #5
/*    */     //   242: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   247: athrow
/*    */     //   248: aload_0
/*    */     //   249: invokevirtual a : ()Lme/konsolas/aac/AAC;
/*    */     //   252: invokevirtual a : ()Lme/konsolas/aac/w;
/*    */     //   255: aload_0
/*    */     //   256: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*    */     //   259: lload #13
/*    */     //   261: dup2_x1
/*    */     //   262: pop2
/*    */     //   263: invokevirtual a : (JLorg/bukkit/entity/Player;)Z
/*    */     //   266: aload #15
/*    */     //   268: ifnonnull -> 366
/*    */     //   271: ifeq -> 355
/*    */     //   274: goto -> 288
/*    */     //   277: ldc2_w 7451524683162147685
/*    */     //   280: lload #5
/*    */     //   282: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   287: athrow
/*    */     //   288: aload_0
/*    */     //   289: invokevirtual a : ()Lme/konsolas/aac/AAC;
/*    */     //   292: invokevirtual a : ()Lme/konsolas/aac/w;
/*    */     //   295: aload_0
/*    */     //   296: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*    */     //   299: sipush #6489
/*    */     //   302: ldc2_w 3229768028600680818
/*    */     //   305: lload #5
/*    */     //   307: lxor
/*    */     //   308: <illegal opcode> k : (IJ)Ljava/lang/String;
/*    */     //   313: iconst_2
/*    */     //   314: anewarray java/lang/Object
/*    */     //   317: dup
/*    */     //   318: iconst_0
/*    */     //   319: aload_0
/*    */     //   320: getfield g : Lme/konsolas/aac/O;
/*    */     //   323: invokevirtual a : ()F
/*    */     //   326: invokestatic valueOf : (F)Ljava/lang/Float;
/*    */     //   329: aastore
/*    */     //   330: dup
/*    */     //   331: iconst_1
/*    */     //   332: fload #19
/*    */     //   334: invokestatic valueOf : (F)Ljava/lang/Float;
/*    */     //   337: aastore
/*    */     //   338: invokevirtual a : (Lorg/bukkit/entity/Player;Ljava/lang/String;[Ljava/lang/Object;)V
/*    */     //   341: goto -> 355
/*    */     //   344: ldc2_w 7451524683162147685
/*    */     //   347: lload #5
/*    */     //   349: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   354: athrow
/*    */     //   355: aload_0
/*    */     //   356: getfield g : Lme/konsolas/aac/O;
/*    */     //   359: fload #19
/*    */     //   361: lload #11
/*    */     //   363: invokevirtual a : (FJ)Z
/*    */     //   366: ireturn
/*    */     //   367: iconst_0
/*    */     //   368: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #43	-> 72
/*    */     //   #67	-> 98
/*    */     //   #12	-> 108
/*    */     //   #45	-> 166
/*    */     //   #65	-> 177
/*    */     //   #14	-> 248
/*    */     //   #94	-> 288
/*    */     //   #6	-> 355
/*    */     //   #84	-> 367
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   72	84	87	aacinternal/v
/*    */     //   108	130	133	aacinternal/v
/*    */     //   122	150	150	aacinternal/v
/*    */     //   177	199	202	aacinternal/v
/*    */     //   196	234	237	aacinternal/v
/*    */     //   266	274	277	aacinternal/v
/*    */     //   271	341	344	aacinternal/v
/*    */   }
/*    */   
/*    */   static {
/*    */     long l;
/*    */     byte b1;
/* 53 */     for (v = nc.a(3615205592392241253L, 2973045052406391616L, MethodHandles.lookup().lookupClass()).a(212228681903674L), y = new HashMap<>(13), l = v ^ 0x6EBC105ADC1BL, "?帯?臃꒣萎꿰臘?ꪜᒹ놆颴枡쾔蓸ᘃ욬핳䧐".toCharArray()[2] = (char)("?帯?臃꒣萎꿰臘?ꪜᒹ놆颴枡쾔蓸ᘃ욬핳䧐".toCharArray()[2] ^ 0x7FA4), "襦슃ꡄ嚮".toCharArray()[1] = (char)("襦슃ꡄ嚮".toCharArray()[1] ^ 0x144C), (new byte[8])[0] = (byte)(int)(l >>> 56L), b1 = 1; b1 < 8; ) { (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); b1++; }  Cipher cipher; (cipher = Cipher.getInstance(hY$g6.H("?帯?臃꒣萎꿰臘?ꪜᒹ놆颴枡쾔蓸ᘃ욬핳䧐".toCharArray(), (short)26316, (byte)3, (byte)1))).init(2, SecretKeyFactory.getInstance(hY$g6.H("襦슃ꡄ嚮".toCharArray(), (short)359, (byte)5, (byte)4)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8])); String[] arrayOfString = new String[20]; boolean bool = false; "샲䁏伸ꌇ䫣跄蓼䉳业ホ装‏᠇촨즏璉罊䝼괭᳋됎圪憟셹峌䒞곩炌촽䎴ၤ姁饿ᅄ࿞⢽䭫澴鹥ꇝ稸齇䅭觑ﳇ팙怲唑罧縯䡼켂쉹퇬ྐྵᮍƤ홺ꨈ毨寯쇒뚯安雈⬮ꞥ聇䛘또?譚ꎘ鱙᨟㝘潊ܛ젲ᚔ卼⣯䈢闦笁熞몓﹜?䂂ᢹể툓迾헽ሷ覲鈗‶鞷?᣹캧묂⍝異உ?쑝㙖聕붵癗튃ᴹ皀䷨쁜꽕ꁻ렕ሾ锻칫櫱뫴柪讶鑝薳赥㐮堆越멅?⽂⢡䯚묱徉ደ祪쩧륯䂨텲筹嗼⏚欹䪔儅莗㗏鞞ུ쫏ୟ鐲箤坸䑮툤널礉؝뗙ﱁ᛭な䚯䣇밣?ऒ椯に⊢禠췹蜲蚾턋怸뫳崎?틜᎝㎇鼋浘穛拇㤳櫖炢襹쥤捳㆜尛軥砭휡宂觘࢏蘄꧟৴錧曃Ꭼീ탞?紉ᬹ摐ᨱ；売ӕ㙖?罍戍≭리㵄츗폌㬽઱뭳븵ٲ₰캈␎霓쾣햯蓄ꀅ仦⼃鱒⒧䂰ᕠ䮗䪖羗ᬕ釞ↁ띏䶞靭띴拈혰晹豗갥遏飵ퟐ랝腞讇轏䊻䆋﨔潽ⱇ䡈펳㯂繙새Ȫ윘ﭚ⇥潺않협?䚰㝟쮳?땕㉮嚱㝮骛倫Ⲏ?喾ჾ쵆ࢊ戃ῦ蟩洛綾纕䰜従㊣댉뎿퍿࿶ᨃ拉ણ렱盹眏愸䯞냭袻홿∴댌짚⫌퓳ڒ?됶ᾎៜ掍⑲䎟緕茐귿髱鶽گ雗⾓絆༓圏䌥➭賥㹛蛶䵡䬶鍯၁厇䷴燐嘰荀ṫ阱﬑쓀ᑔ菧?ᴁ?禨쿲뽏涪뙸忒⤶ꌣ䛔횗ᮎ訝큣宬鄎刬莜뫐衅๡撩悫숈幂ᔜ◺们噓懵ϕᙀ졲벑䋟쇙㊬召鱘椚茪꛰兄ꈝ⹌㼫灟鎶ᔈ戈칗등泻ަ楋쁌䆗⩯᡻鉛?彜㕥䴛›慸ꎅ৆줻࿀Б숧词ꠊ뷫뒯㷻⦵숱횣治愻㎜椺츪诡蛮ꑃ馼䙵렠灉踯쵄Ꚗꈄ쳚篏픇霥왎䜇뾺輙㨺꡻㪟ⴻ竽회?隬靻⹃鱂潝唫♞險ӧ魖䚢⊿ڛ?征鄕筶㍜긌ꢪ库ဠ⼭?凒ᨢꜺゅ瞦䮍〬♅꥞藲䛩틬积ˡ㗬流唩य़鐆蜏妎ﮌ鱯⑮엋䀓炸푯〲䊎ﾃ犀囗䝒胾쐺㲵╃꺼Ɲ【쾲뱬룯뵥㈽ؕԲ荮?힭涑垈崝륭邟呭绳齿偨໎ꎢ鳞⛲亓ۍ뛟鼋ｨ匳ᮒ餙돀츘樏䮿騉晠㩹ꉠ李⼛ʥ帙蟋粳铌ꋶ篃?鯹埰꼤わ༫幷폰⩉恿㭔⭆⡨祟洢㋆僢넖ꩻ채ᚾ帻䛤别词ڦ?ಮബ矘ퟳ뮬령軳痩櫇龞췓萕㿡ᨦ䰇蒂嘄嶽ᶥ䁕캮?ꕊ᰼㊍?麚Ҭัꡇয仞㿣೹襹枫醕䜄".toCharArray()[539] = (char)("샲䁏伸ꌇ䫣跄蓼䉳业ホ装‏᠇촨즏璉罊䝼괭᳋됎圪憟셹峌䒞곩炌촽䎴ၤ姁饿ᅄ࿞⢽䭫澴鹥ꇝ稸齇䅭觑ﳇ팙怲唑罧縯䡼켂쉹퇬ྐྵᮍƤ홺ꨈ毨寯쇒뚯安雈⬮ꞥ聇䛘또?譚ꎘ鱙᨟㝘潊ܛ젲ᚔ卼⣯䈢闦笁熞몓﹜?䂂ᢹể툓迾헽ሷ覲鈗‶鞷?᣹캧묂⍝異உ?쑝㙖聕붵癗튃ᴹ皀䷨쁜꽕ꁻ렕ሾ锻칫櫱뫴柪讶鑝薳赥㐮堆越멅?⽂⢡䯚묱徉ደ祪쩧륯䂨텲筹嗼⏚欹䪔儅莗㗏鞞ུ쫏ୟ鐲箤坸䑮툤널礉؝뗙ﱁ᛭な䚯䣇밣?ऒ椯に⊢禠췹蜲蚾턋怸뫳崎?틜᎝㎇鼋浘穛拇㤳櫖炢襹쥤捳㆜尛軥砭휡宂觘࢏蘄꧟৴錧曃Ꭼീ탞?紉ᬹ摐ᨱ；売ӕ㙖?罍戍≭리㵄츗폌㬽઱뭳븵ٲ₰캈␎霓쾣햯蓄ꀅ仦⼃鱒⒧䂰ᕠ䮗䪖羗ᬕ釞ↁ띏䶞靭띴拈혰晹豗갥遏飵ퟐ랝腞讇轏䊻䆋﨔潽ⱇ䡈펳㯂繙새Ȫ윘ﭚ⇥潺않협?䚰㝟쮳?땕㉮嚱㝮骛倫Ⲏ?喾ჾ쵆ࢊ戃ῦ蟩洛綾纕䰜従㊣댉뎿퍿࿶ᨃ拉ણ렱盹眏愸䯞냭袻홿∴댌짚⫌퓳ڒ?됶ᾎៜ掍⑲䎟緕茐귿髱鶽گ雗⾓絆༓圏䌥➭賥㹛蛶䵡䬶鍯၁厇䷴燐嘰荀ṫ阱﬑쓀ᑔ菧?ᴁ?禨쿲뽏涪뙸忒⤶ꌣ䛔횗ᮎ訝큣宬鄎刬莜뫐衅๡撩悫숈幂ᔜ◺们噓懵ϕᙀ졲벑䋟쇙㊬召鱘椚茪꛰兄ꈝ⹌㼫灟鎶ᔈ戈칗등泻ަ楋쁌䆗⩯᡻鉛?彜㕥䴛›慸ꎅ৆줻࿀Б숧词ꠊ뷫뒯㷻⦵숱횣治愻㎜椺츪诡蛮ꑃ馼䙵렠灉踯쵄Ꚗꈄ쳚篏픇霥왎䜇뾺輙㨺꡻㪟ⴻ竽회?隬靻⹃鱂潝唫♞險ӧ魖䚢⊿ڛ?征鄕筶㍜긌ꢪ库ဠ⼭?凒ᨢꜺゅ瞦䮍〬♅꥞藲䛩틬积ˡ㗬流唩य़鐆蜏妎ﮌ鱯⑮엋䀓炸푯〲䊎ﾃ犀囗䝒胾쐺㲵╃꺼Ɲ【쾲뱬룯뵥㈽ؕԲ荮?힭涑垈崝륭邟呭绳齿偨໎ꎢ鳞⛲亓ۍ뛟鼋ｨ匳ᮒ餙돀츘樏䮿騉晠㩹ꉠ李⼛ʥ帙蟋粳铌ꋶ篃?鯹埰꼤わ༫幷폰⩉恿㭔⭆⡨祟洢㋆僢넖ꩻ채ᚾ帻䛤别词ڦ?ಮബ矘ퟳ뮬령軳痩櫇龞췓萕㿡ᨦ䰇蒂嘄嶽ᶥ䁕캮?ꕊ᰼㊍?麚Ҭัꡇয仞㿣೹襹枫醕䜄".toCharArray()[539] ^ 0x6CED); String str; int i = (str = hY$g6.H("샲䁏伸ꌇ䫣跄蓼䉳业ホ装‏᠇촨즏璉罊䝼괭᳋됎圪憟셹峌䒞곩炌촽䎴ၤ姁饿ᅄ࿞⢽䭫澴鹥ꇝ稸齇䅭觑ﳇ팙怲唑罧縯䡼켂쉹퇬ྐྵᮍƤ홺ꨈ毨寯쇒뚯安雈⬮ꞥ聇䛘또?譚ꎘ鱙᨟㝘潊ܛ젲ᚔ卼⣯䈢闦笁熞몓﹜?䂂ᢹể툓迾헽ሷ覲鈗‶鞷?᣹캧묂⍝異உ?쑝㙖聕붵癗튃ᴹ皀䷨쁜꽕ꁻ렕ሾ锻칫櫱뫴柪讶鑝薳赥㐮堆越멅?⽂⢡䯚묱徉ደ祪쩧륯䂨텲筹嗼⏚欹䪔儅莗㗏鞞ུ쫏ୟ鐲箤坸䑮툤널礉؝뗙ﱁ᛭な䚯䣇밣?ऒ椯に⊢禠췹蜲蚾턋怸뫳崎?틜᎝㎇鼋浘穛拇㤳櫖炢襹쥤捳㆜尛軥砭휡宂觘࢏蘄꧟৴錧曃Ꭼീ탞?紉ᬹ摐ᨱ；売ӕ㙖?罍戍≭리㵄츗폌㬽઱뭳븵ٲ₰캈␎霓쾣햯蓄ꀅ仦⼃鱒⒧䂰ᕠ䮗䪖羗ᬕ釞ↁ띏䶞靭띴拈혰晹豗갥遏飵ퟐ랝腞讇轏䊻䆋﨔潽ⱇ䡈펳㯂繙새Ȫ윘ﭚ⇥潺않협?䚰㝟쮳?땕㉮嚱㝮骛倫Ⲏ?喾ჾ쵆ࢊ戃ῦ蟩洛綾纕䰜従㊣댉뎿퍿࿶ᨃ拉ણ렱盹眏愸䯞냭袻홿∴댌짚⫌퓳ڒ?됶ᾎៜ掍⑲䎟緕茐귿髱鶽گ雗⾓絆༓圏䌥➭賥㹛蛶䵡䬶鍯၁厇䷴燐嘰荀ṫ阱﬑쓀ᑔ菧?ᴁ?禨쿲뽏涪뙸忒⤶ꌣ䛔횗ᮎ訝큣宬鄎刬莜뫐衅๡撩悫숈幂ᔜ◺们噓懵ϕᙀ졲벑䋟쇙㊬召鱘椚茪꛰兄ꈝ⹌㼫灟鎶ᔈ戈칗등泻ަ楋쁌䆗⩯᡻鉛?彜㕥䴛›慸ꎅ৆줻࿀Б숧词ꠊ뷫뒯㷻⦵숱횣治愻㎜椺츪诡蛮ꑃ馼䙵렠灉踯쵄Ꚗꈄ쳚篏픇霥왎䜇뾺輙㨺꡻㪟ⴻ竽회?隬靻⹃鱂潝唫♞險ӧ魖䚢⊿ڛ?征鄕筶㍜긌ꢪ库ဠ⼭?凒ᨢꜺゅ瞦䮍〬♅꥞藲䛩틬积ˡ㗬流唩य़鐆蜏妎ﮌ鱯⑮엋䀓炸푯〲䊎ﾃ犀囗䝒胾쐺㲵╃꺼Ɲ【쾲뱬룯뵥㈽ؕԲ荮?힭涑垈崝륭邟呭绳齿偨໎ꎢ鳞⛲亓ۍ뛟鼋ｨ匳ᮒ餙돀츘樏䮿騉晠㩹ꉠ李⼛ʥ帙蟋粳铌ꋶ篃?鯹埰꼤わ༫幷폰⩉恿㭔⭆⡨祟洢㋆僢넖ꩻ채ᚾ帻䛤别词ڦ?ಮബ矘ퟳ뮬령軳痩櫇龞췓萕㿡ᨦ䰇蒂嘄嶽ᶥ䁕캮?ꕊ᰼㊍?麚Ҭัꡇয仞㿣೹襹枫醕䜄".toCharArray(), (short)30069, (byte)1, (byte)3)).length(); byte b2 = 16; byte b = -1;
/*    */     while (true);
/*    */   }
/*    */   
/*    */   public boolean a(EntityRegainHealthEvent.RegainReason paramRegainReason, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/cm.v : J
/*    */     //   3: lload_2
/*    */     //   4: lxor
/*    */     //   5: lstore_2
/*    */     //   6: lload_2
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 44416553603317
/*    */     //   11: lxor
/*    */     //   12: lstore #4
/*    */     //   14: dup2
/*    */     //   15: ldc2_w 61460899742285
/*    */     //   18: lxor
/*    */     //   19: lstore #6
/*    */     //   21: dup2
/*    */     //   22: ldc2_w 126036678616875
/*    */     //   25: lxor
/*    */     //   26: lstore #8
/*    */     //   28: dup2
/*    */     //   29: ldc2_w 109469394324775
/*    */     //   32: lxor
/*    */     //   33: lstore #10
/*    */     //   35: pop2
/*    */     //   36: ldc2_w -2968905471488584578
/*    */     //   39: lload_2
/*    */     //   40: <illegal opcode> w : (JJ)Ljava/lang/String;
/*    */     //   45: astore #12
/*    */     //   47: aload_0
/*    */     //   48: getfield i : Z
/*    */     //   51: aload #12
/*    */     //   53: ifnonnull -> 442
/*    */     //   56: ifeq -> 441
/*    */     //   59: goto -> 72
/*    */     //   62: ldc2_w -2937403391129359568
/*    */     //   65: lload_2
/*    */     //   66: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   71: athrow
/*    */     //   72: aload_1
/*    */     //   73: getstatic org/bukkit/event/entity/EntityRegainHealthEvent$RegainReason.SATIATED : Lorg/bukkit/event/entity/EntityRegainHealthEvent$RegainReason;
/*    */     //   76: if_acmpne -> 441
/*    */     //   79: goto -> 92
/*    */     //   82: ldc2_w -2937403391129359568
/*    */     //   85: lload_2
/*    */     //   86: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   91: athrow
/*    */     //   92: invokestatic currentTimeMillis : ()J
/*    */     //   95: lstore #13
/*    */     //   97: aload_0
/*    */     //   98: getfield h : J
/*    */     //   101: lstore #15
/*    */     //   103: lload #13
/*    */     //   105: lload #15
/*    */     //   107: lsub
/*    */     //   108: lstore #17
/*    */     //   110: aload_0
/*    */     //   111: lload #13
/*    */     //   113: putfield h : J
/*    */     //   116: lload #15
/*    */     //   118: lconst_0
/*    */     //   119: lcmp
/*    */     //   120: aload #12
/*    */     //   122: lload_2
/*    */     //   123: lconst_0
/*    */     //   124: lcmp
/*    */     //   125: iflt -> 178
/*    */     //   128: ifnonnull -> 170
/*    */     //   131: ifne -> 159
/*    */     //   134: goto -> 147
/*    */     //   137: ldc2_w -2937403391129359568
/*    */     //   140: lload_2
/*    */     //   141: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   146: athrow
/*    */     //   147: iconst_0
/*    */     //   148: ireturn
/*    */     //   149: ldc2_w -2937403391129359568
/*    */     //   152: lload_2
/*    */     //   153: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   158: athrow
/*    */     //   159: invokestatic a : ()Lme/konsolas/aac/kP;
/*    */     //   162: lload #4
/*    */     //   164: getstatic me/konsolas/aac/kP.V1_9 : Lme/konsolas/aac/kP;
/*    */     //   167: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*    */     //   170: lload_2
/*    */     //   171: lconst_0
/*    */     //   172: lcmp
/*    */     //   173: iflt -> 219
/*    */     //   176: aload #12
/*    */     //   178: ifnonnull -> 219
/*    */     //   181: ifeq -> 239
/*    */     //   184: goto -> 197
/*    */     //   187: ldc2_w -2937403391129359568
/*    */     //   190: lload_2
/*    */     //   191: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   196: athrow
/*    */     //   197: aload_0
/*    */     //   198: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*    */     //   201: invokeinterface getFoodLevel : ()I
/*    */     //   206: goto -> 219
/*    */     //   209: ldc2_w -2937403391129359568
/*    */     //   212: lload_2
/*    */     //   213: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   218: athrow
/*    */     //   219: bipush #20
/*    */     //   221: if_icmpne -> 239
/*    */     //   224: ldc 0.5
/*    */     //   226: goto -> 242
/*    */     //   229: ldc2_w -2937403391129359568
/*    */     //   232: lload_2
/*    */     //   233: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   238: athrow
/*    */     //   239: ldc_w 4.0
/*    */     //   242: fstore #19
/*    */     //   244: fload #19
/*    */     //   246: lload #17
/*    */     //   248: l2f
/*    */     //   249: ldc 1000.0
/*    */     //   251: fdiv
/*    */     //   252: fsub
/*    */     //   253: fstore #20
/*    */     //   255: aload_0
/*    */     //   256: getfield g : Lme/konsolas/aac/O;
/*    */     //   259: invokevirtual a : ()F
/*    */     //   262: ldc 0.5
/*    */     //   264: fcmpl
/*    */     //   265: aload #12
/*    */     //   267: lload_2
/*    */     //   268: lconst_0
/*    */     //   269: lcmp
/*    */     //   270: iflt -> 345
/*    */     //   273: ifnonnull -> 343
/*    */     //   276: ifle -> 325
/*    */     //   279: goto -> 292
/*    */     //   282: ldc2_w -2937403391129359568
/*    */     //   285: lload_2
/*    */     //   286: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   291: athrow
/*    */     //   292: aload_0
/*    */     //   293: ldc2_w -2978708329792836299
/*    */     //   296: lload_2
/*    */     //   297: <illegal opcode> Ñ : (JJ)Lme/konsolas/aac/eA;
/*    */     //   302: fload #20
/*    */     //   304: fload #19
/*    */     //   306: fdiv
/*    */     //   307: lload #6
/*    */     //   309: invokevirtual a : (Lme/konsolas/aac/eA;FJ)V
/*    */     //   312: goto -> 325
/*    */     //   315: ldc2_w -2937403391129359568
/*    */     //   318: lload_2
/*    */     //   319: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   324: athrow
/*    */     //   325: aload_0
/*    */     //   326: invokevirtual a : ()Lme/konsolas/aac/AAC;
/*    */     //   329: invokevirtual a : ()Lme/konsolas/aac/w;
/*    */     //   332: aload_0
/*    */     //   333: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*    */     //   336: lload #10
/*    */     //   338: dup2_x1
/*    */     //   339: pop2
/*    */     //   340: invokevirtual a : (JLorg/bukkit/entity/Player;)Z
/*    */     //   343: aload #12
/*    */     //   345: ifnonnull -> 440
/*    */     //   348: ifeq -> 429
/*    */     //   351: goto -> 364
/*    */     //   354: ldc2_w -2937403391129359568
/*    */     //   357: lload_2
/*    */     //   358: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   363: athrow
/*    */     //   364: aload_0
/*    */     //   365: invokevirtual a : ()Lme/konsolas/aac/AAC;
/*    */     //   368: invokevirtual a : ()Lme/konsolas/aac/w;
/*    */     //   371: aload_0
/*    */     //   372: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*    */     //   375: sipush #12053
/*    */     //   378: ldc2_w 4159924052805044069
/*    */     //   381: lload_2
/*    */     //   382: lxor
/*    */     //   383: <illegal opcode> k : (IJ)Ljava/lang/String;
/*    */     //   388: iconst_2
/*    */     //   389: anewarray java/lang/Object
/*    */     //   392: dup
/*    */     //   393: iconst_0
/*    */     //   394: aload_0
/*    */     //   395: getfield g : Lme/konsolas/aac/O;
/*    */     //   398: invokevirtual a : ()F
/*    */     //   401: invokestatic valueOf : (F)Ljava/lang/Float;
/*    */     //   404: aastore
/*    */     //   405: dup
/*    */     //   406: iconst_1
/*    */     //   407: fload #20
/*    */     //   409: invokestatic valueOf : (F)Ljava/lang/Float;
/*    */     //   412: aastore
/*    */     //   413: invokevirtual a : (Lorg/bukkit/entity/Player;Ljava/lang/String;[Ljava/lang/Object;)V
/*    */     //   416: goto -> 429
/*    */     //   419: ldc2_w -2937403391129359568
/*    */     //   422: lload_2
/*    */     //   423: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   428: athrow
/*    */     //   429: aload_0
/*    */     //   430: getfield g : Lme/konsolas/aac/O;
/*    */     //   433: fload #20
/*    */     //   435: lload #8
/*    */     //   437: invokevirtual a : (FJ)Z
/*    */     //   440: ireturn
/*    */     //   441: iconst_0
/*    */     //   442: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #60	-> 47
/*    */     //   #77	-> 92
/*    */     //   #83	-> 97
/*    */     //   #55	-> 103
/*    */     //   #15	-> 110
/*    */     //   #121	-> 116
/*    */     //   #58	-> 159
/*    */     //   #38	-> 198
/*    */     //   #87	-> 244
/*    */     //   #100	-> 255
/*    */     //   #25	-> 325
/*    */     //   #105	-> 364
/*    */     //   #34	-> 429
/*    */     //   #110	-> 441
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   47	59	62	aacinternal/v
/*    */     //   56	79	82	aacinternal/v
/*    */     //   110	134	137	aacinternal/v
/*    */     //   131	149	149	aacinternal/v
/*    */     //   170	184	187	aacinternal/v
/*    */     //   181	206	209	aacinternal/v
/*    */     //   219	229	229	aacinternal/v
/*    */     //   255	279	282	aacinternal/v
/*    */     //   276	312	315	aacinternal/v
/*    */     //   343	351	354	aacinternal/v
/*    */     //   348	416	419	aacinternal/v
/*    */   }
/*    */   
/*    */   public cm(long paramLong, AAC paramAAC, Player paramPlayer) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/cm.v : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: lload_1
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 95174667704467
/*    */     //   11: lxor
/*    */     //   12: dup2
/*    */     //   13: bipush #48
/*    */     //   15: lushr
/*    */     //   16: l2i
/*    */     //   17: istore #5
/*    */     //   19: dup2
/*    */     //   20: bipush #16
/*    */     //   22: lshl
/*    */     //   23: bipush #48
/*    */     //   25: lushr
/*    */     //   26: l2i
/*    */     //   27: istore #6
/*    */     //   29: dup2
/*    */     //   30: bipush #32
/*    */     //   32: lshl
/*    */     //   33: bipush #32
/*    */     //   35: lushr
/*    */     //   36: l2i
/*    */     //   37: istore #7
/*    */     //   39: pop2
/*    */     //   40: dup2
/*    */     //   41: ldc2_w 98168921429975
/*    */     //   44: lxor
/*    */     //   45: lstore #8
/*    */     //   47: pop2
/*    */     //   48: ldc2_w 6585231899177130449
/*    */     //   51: lload_1
/*    */     //   52: <illegal opcode> w : (JJ)Ljava/lang/String;
/*    */     //   57: aload_0
/*    */     //   58: iload #5
/*    */     //   60: i2s
/*    */     //   61: iload #6
/*    */     //   63: i2s
/*    */     //   64: aload_3
/*    */     //   65: aload #4
/*    */     //   67: iload #7
/*    */     //   69: sipush #10366
/*    */     //   72: ldc2_w 700529581320883624
/*    */     //   75: lload_1
/*    */     //   76: lxor
/*    */     //   77: <illegal opcode> k : (IJ)Ljava/lang/String;
/*    */     //   82: invokespecial <init> : (SSLme/konsolas/aac/AAC;Lorg/bukkit/entity/Player;ILjava/lang/String;)V
/*    */     //   85: aload_0
/*    */     //   86: aload_0
/*    */     //   87: invokevirtual a : ()Lorg/bukkit/configuration/ConfigurationSection;
/*    */     //   90: lload #8
/*    */     //   92: dup2_x1
/*    */     //   93: pop2
/*    */     //   94: sipush #26268
/*    */     //   97: ldc2_w 8488574770663162700
/*    */     //   100: lload_1
/*    */     //   101: lxor
/*    */     //   102: <illegal opcode> k : (IJ)Ljava/lang/String;
/*    */     //   107: invokestatic a : (JLorg/bukkit/configuration/ConfigurationSection;Ljava/lang/String;)Lme/konsolas/aac/O;
/*    */     //   110: putfield g : Lme/konsolas/aac/O;
/*    */     //   113: aload_0
/*    */     //   114: aload_0
/*    */     //   115: invokevirtual a : ()Lorg/bukkit/configuration/ConfigurationSection;
/*    */     //   118: sipush #19244
/*    */     //   121: ldc2_w 2720716081159909113
/*    */     //   124: lload_1
/*    */     //   125: lxor
/*    */     //   126: <illegal opcode> k : (IJ)Ljava/lang/String;
/*    */     //   131: invokeinterface getBoolean : (Ljava/lang/String;)Z
/*    */     //   136: putfield k : Z
/*    */     //   139: aload_0
/*    */     //   140: aload_0
/*    */     //   141: invokevirtual a : ()Lorg/bukkit/configuration/ConfigurationSection;
/*    */     //   144: sipush #16487
/*    */     //   147: ldc2_w 1190518754761614771
/*    */     //   150: lload_1
/*    */     //   151: lxor
/*    */     //   152: <illegal opcode> k : (IJ)Ljava/lang/String;
/*    */     //   157: invokeinterface getBoolean : (Ljava/lang/String;)Z
/*    */     //   162: putfield j : Z
/*    */     //   165: aload_0
/*    */     //   166: aload_0
/*    */     //   167: invokevirtual a : ()Lorg/bukkit/configuration/ConfigurationSection;
/*    */     //   170: sipush #1522
/*    */     //   173: ldc2_w 3289453891008716844
/*    */     //   176: lload_1
/*    */     //   177: lxor
/*    */     //   178: <illegal opcode> k : (IJ)Ljava/lang/String;
/*    */     //   183: invokeinterface getBoolean : (Ljava/lang/String;)Z
/*    */     //   188: putfield t : Z
/*    */     //   191: aload_0
/*    */     //   192: aload_0
/*    */     //   193: invokevirtual a : ()Lorg/bukkit/configuration/ConfigurationSection;
/*    */     //   196: sipush #13152
/*    */     //   199: ldc2_w 8084554575904822948
/*    */     //   202: lload_1
/*    */     //   203: lxor
/*    */     //   204: <illegal opcode> k : (IJ)Ljava/lang/String;
/*    */     //   209: invokeinterface getBoolean : (Ljava/lang/String;)Z
/*    */     //   214: putfield l : Z
/*    */     //   217: aload_0
/*    */     //   218: aload_0
/*    */     //   219: invokevirtual a : ()Lorg/bukkit/configuration/ConfigurationSection;
/*    */     //   222: sipush #18506
/*    */     //   225: ldc2_w 8195389237621173647
/*    */     //   228: lload_1
/*    */     //   229: lxor
/*    */     //   230: <illegal opcode> k : (IJ)Ljava/lang/String;
/*    */     //   235: invokeinterface getBoolean : (Ljava/lang/String;)Z
/*    */     //   240: putfield i : Z
/*    */     //   243: astore #10
/*    */     //   245: aload_0
/*    */     //   246: aload_0
/*    */     //   247: invokevirtual a : ()Lorg/bukkit/configuration/ConfigurationSection;
/*    */     //   250: sipush #21217
/*    */     //   253: ldc2_w 6150985896179545907
/*    */     //   256: lload_1
/*    */     //   257: lxor
/*    */     //   258: <illegal opcode> k : (IJ)Ljava/lang/String;
/*    */     //   263: invokeinterface getBoolean : (Ljava/lang/String;)Z
/*    */     //   268: putfield o : Z
/*    */     //   271: aload_0
/*    */     //   272: aload_0
/*    */     //   273: invokevirtual a : ()Lorg/bukkit/configuration/ConfigurationSection;
/*    */     //   276: sipush #22745
/*    */     //   279: ldc2_w 3234019634147736842
/*    */     //   282: lload_1
/*    */     //   283: lxor
/*    */     //   284: <illegal opcode> k : (IJ)Ljava/lang/String;
/*    */     //   289: invokeinterface getBoolean : (Ljava/lang/String;)Z
/*    */     //   294: putfield s : Z
/*    */     //   297: aload_0
/*    */     //   298: aload_0
/*    */     //   299: invokevirtual a : ()Lorg/bukkit/configuration/ConfigurationSection;
/*    */     //   302: sipush #2132
/*    */     //   305: ldc2_w 1012175033379319183
/*    */     //   308: lload_1
/*    */     //   309: lxor
/*    */     //   310: <illegal opcode> k : (IJ)Ljava/lang/String;
/*    */     //   315: invokeinterface getBoolean : (Ljava/lang/String;)Z
/*    */     //   320: putfield a : Z
/*    */     //   323: aload #10
/*    */     //   325: ifnull -> 354
/*    */     //   328: iconst_4
/*    */     //   329: anewarray me/konsolas/aac/aN
/*    */     //   332: ldc2_w 6557413951379899093
/*    */     //   335: lload_1
/*    */     //   336: <illegal opcode> w : ([Lme/konsolas/aac/aN;JJ)V
/*    */     //   341: goto -> 354
/*    */     //   344: ldc2_w 6526589543775692447
/*    */     //   347: lload_1
/*    */     //   348: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   353: athrow
/*    */     //   354: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #68	-> 57
/*    */     //   #29	-> 85
/*    */     //   #104	-> 113
/*    */     //   #49	-> 139
/*    */     //   #119	-> 165
/*    */     //   #71	-> 191
/*    */     //   #20	-> 217
/*    */     //   #74	-> 245
/*    */     //   #59	-> 271
/*    */     //   #109	-> 297
/*    */     //   #39	-> 323
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   245	341	344	aacinternal/v
/*    */   }
/*    */   
/*    */   public boolean a(Block paramBlock, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/cm.v : J
/*    */     //   3: lload_2
/*    */     //   4: lxor
/*    */     //   5: lstore_2
/*    */     //   6: lload_2
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 120359680876970
/*    */     //   11: lxor
/*    */     //   12: lstore #4
/*    */     //   14: dup2
/*    */     //   15: ldc2_w 44202266969292
/*    */     //   18: lxor
/*    */     //   19: lstore #6
/*    */     //   21: dup2
/*    */     //   22: ldc2_w 20349172593447
/*    */     //   25: lxor
/*    */     //   26: dup2
/*    */     //   27: bipush #48
/*    */     //   29: lushr
/*    */     //   30: l2i
/*    */     //   31: istore #8
/*    */     //   33: dup2
/*    */     //   34: bipush #16
/*    */     //   36: lshl
/*    */     //   37: bipush #48
/*    */     //   39: lushr
/*    */     //   40: l2i
/*    */     //   41: istore #9
/*    */     //   43: dup2
/*    */     //   44: bipush #32
/*    */     //   46: lshl
/*    */     //   47: bipush #32
/*    */     //   49: lushr
/*    */     //   50: l2i
/*    */     //   51: istore #10
/*    */     //   53: pop2
/*    */     //   54: dup2
/*    */     //   55: ldc2_w 62797845245632
/*    */     //   58: lxor
/*    */     //   59: lstore #11
/*    */     //   61: pop2
/*    */     //   62: ldc2_w 3831172017209178009
/*    */     //   65: lload_2
/*    */     //   66: <illegal opcode> w : (JJ)Ljava/lang/String;
/*    */     //   71: astore #13
/*    */     //   73: aload_0
/*    */     //   74: getfield k : Z
/*    */     //   77: aload #13
/*    */     //   79: ifnonnull -> 433
/*    */     //   82: ifeq -> 432
/*    */     //   85: goto -> 98
/*    */     //   88: ldc2_w 3808749782271920343
/*    */     //   91: lload_2
/*    */     //   92: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   97: athrow
/*    */     //   98: aload_0
/*    */     //   99: getfield r : J
/*    */     //   102: lconst_0
/*    */     //   103: lcmp
/*    */     //   104: aload #13
/*    */     //   106: ifnonnull -> 433
/*    */     //   109: goto -> 122
/*    */     //   112: ldc2_w 3808749782271920343
/*    */     //   115: lload_2
/*    */     //   116: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   121: athrow
/*    */     //   122: ifeq -> 432
/*    */     //   125: goto -> 138
/*    */     //   128: ldc2_w 3808749782271920343
/*    */     //   131: lload_2
/*    */     //   132: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   137: athrow
/*    */     //   138: aload_0
/*    */     //   139: invokestatic currentTimeMillis : ()J
/*    */     //   142: putfield q : J
/*    */     //   145: aload_0
/*    */     //   146: getfield q : J
/*    */     //   149: aload_0
/*    */     //   150: getfield r : J
/*    */     //   153: lsub
/*    */     //   154: lstore #14
/*    */     //   156: invokestatic a : ()Lme/konsolas/aac/mJ;
/*    */     //   159: aload_0
/*    */     //   160: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*    */     //   163: iload #8
/*    */     //   165: i2s
/*    */     //   166: swap
/*    */     //   167: aload_1
/*    */     //   168: iload #9
/*    */     //   170: i2s
/*    */     //   171: iload #10
/*    */     //   173: invokeinterface a : (SLorg/bukkit/entity/Player;Lorg/bukkit/block/Block;SI)F
/*    */     //   178: f2d
/*    */     //   179: dstore #16
/*    */     //   181: dload #16
/*    */     //   183: lload_2
/*    */     //   184: lconst_0
/*    */     //   185: lcmp
/*    */     //   186: iflt -> 232
/*    */     //   189: dconst_1
/*    */     //   190: aload #13
/*    */     //   192: ifnonnull -> 231
/*    */     //   195: dcmpl
/*    */     //   196: iflt -> 224
/*    */     //   199: goto -> 212
/*    */     //   202: ldc2_w 3808749782271920343
/*    */     //   205: lload_2
/*    */     //   206: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   211: athrow
/*    */     //   212: iconst_0
/*    */     //   213: ireturn
/*    */     //   214: ldc2_w 3808749782271920343
/*    */     //   217: lload_2
/*    */     //   218: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   223: athrow
/*    */     //   224: dconst_1
/*    */     //   225: dload #16
/*    */     //   227: ddiv
/*    */     //   228: ldc2_w 0.05000000074505806
/*    */     //   231: dmul
/*    */     //   232: d2f
/*    */     //   233: fstore #18
/*    */     //   235: fload #18
/*    */     //   237: lload #14
/*    */     //   239: l2f
/*    */     //   240: ldc 1000.0
/*    */     //   242: fdiv
/*    */     //   243: fsub
/*    */     //   244: fstore #19
/*    */     //   246: aload_0
/*    */     //   247: getfield g : Lme/konsolas/aac/O;
/*    */     //   250: invokevirtual a : ()F
/*    */     //   253: ldc 0.5
/*    */     //   255: fcmpl
/*    */     //   256: aload #13
/*    */     //   258: lload_2
/*    */     //   259: lconst_0
/*    */     //   260: lcmp
/*    */     //   261: ifle -> 336
/*    */     //   264: ifnonnull -> 334
/*    */     //   267: ifle -> 316
/*    */     //   270: goto -> 283
/*    */     //   273: ldc2_w 3808749782271920343
/*    */     //   276: lload_2
/*    */     //   277: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   282: athrow
/*    */     //   283: aload_0
/*    */     //   284: ldc2_w 3851983609326856971
/*    */     //   287: lload_2
/*    */     //   288: <illegal opcode> Ñ : (JJ)Lme/konsolas/aac/eA;
/*    */     //   293: fload #19
/*    */     //   295: fload #18
/*    */     //   297: fdiv
/*    */     //   298: lload #4
/*    */     //   300: invokevirtual a : (Lme/konsolas/aac/eA;FJ)V
/*    */     //   303: goto -> 316
/*    */     //   306: ldc2_w 3808749782271920343
/*    */     //   309: lload_2
/*    */     //   310: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   315: athrow
/*    */     //   316: aload_0
/*    */     //   317: invokevirtual a : ()Lme/konsolas/aac/AAC;
/*    */     //   320: invokevirtual a : ()Lme/konsolas/aac/w;
/*    */     //   323: aload_0
/*    */     //   324: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*    */     //   327: lload #11
/*    */     //   329: dup2_x1
/*    */     //   330: pop2
/*    */     //   331: invokevirtual a : (JLorg/bukkit/entity/Player;)Z
/*    */     //   334: aload #13
/*    */     //   336: ifnonnull -> 431
/*    */     //   339: ifeq -> 420
/*    */     //   342: goto -> 355
/*    */     //   345: ldc2_w 3808749782271920343
/*    */     //   348: lload_2
/*    */     //   349: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   354: athrow
/*    */     //   355: aload_0
/*    */     //   356: invokevirtual a : ()Lme/konsolas/aac/AAC;
/*    */     //   359: invokevirtual a : ()Lme/konsolas/aac/w;
/*    */     //   362: aload_0
/*    */     //   363: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*    */     //   366: sipush #29638
/*    */     //   369: ldc2_w 3470700392244770902
/*    */     //   372: lload_2
/*    */     //   373: lxor
/*    */     //   374: <illegal opcode> k : (IJ)Ljava/lang/String;
/*    */     //   379: iconst_2
/*    */     //   380: anewarray java/lang/Object
/*    */     //   383: dup
/*    */     //   384: iconst_0
/*    */     //   385: aload_0
/*    */     //   386: getfield g : Lme/konsolas/aac/O;
/*    */     //   389: invokevirtual a : ()F
/*    */     //   392: invokestatic valueOf : (F)Ljava/lang/Float;
/*    */     //   395: aastore
/*    */     //   396: dup
/*    */     //   397: iconst_1
/*    */     //   398: fload #19
/*    */     //   400: invokestatic valueOf : (F)Ljava/lang/Float;
/*    */     //   403: aastore
/*    */     //   404: invokevirtual a : (Lorg/bukkit/entity/Player;Ljava/lang/String;[Ljava/lang/Object;)V
/*    */     //   407: goto -> 420
/*    */     //   410: ldc2_w 3808749782271920343
/*    */     //   413: lload_2
/*    */     //   414: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   419: athrow
/*    */     //   420: aload_0
/*    */     //   421: getfield g : Lme/konsolas/aac/O;
/*    */     //   424: fload #19
/*    */     //   426: lload #6
/*    */     //   428: invokevirtual a : (FJ)Z
/*    */     //   431: ireturn
/*    */     //   432: iconst_0
/*    */     //   433: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #98	-> 73
/*    */     //   #33	-> 138
/*    */     //   #75	-> 145
/*    */     //   #106	-> 156
/*    */     //   #5	-> 181
/*    */     //   #108	-> 212
/*    */     //   #62	-> 224
/*    */     //   #99	-> 235
/*    */     //   #82	-> 246
/*    */     //   #118	-> 316
/*    */     //   #96	-> 355
/*    */     //   #85	-> 420
/*    */     //   #51	-> 432
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   73	85	88	aacinternal/v
/*    */     //   82	109	112	aacinternal/v
/*    */     //   98	125	128	aacinternal/v
/*    */     //   181	199	202	aacinternal/v
/*    */     //   195	214	214	aacinternal/v
/*    */     //   246	270	273	aacinternal/v
/*    */     //   267	303	306	aacinternal/v
/*    */     //   334	342	345	aacinternal/v
/*    */     //   339	407	410	aacinternal/v
/*    */   }
/*    */   
/*    */   public boolean a(char paramChar1, int paramInt, char paramChar2, boolean paramBoolean) {
/*    */     // Byte code:
/*    */     //   0: iload_1
/*    */     //   1: i2l
/*    */     //   2: bipush #48
/*    */     //   4: lshl
/*    */     //   5: iload_2
/*    */     //   6: i2l
/*    */     //   7: bipush #32
/*    */     //   9: lshl
/*    */     //   10: bipush #16
/*    */     //   12: lushr
/*    */     //   13: lor
/*    */     //   14: iload_3
/*    */     //   15: i2l
/*    */     //   16: bipush #48
/*    */     //   18: lshl
/*    */     //   19: bipush #48
/*    */     //   21: lushr
/*    */     //   22: lor
/*    */     //   23: getstatic me/konsolas/aac/cm.v : J
/*    */     //   26: lxor
/*    */     //   27: lstore #5
/*    */     //   29: lload #5
/*    */     //   31: dup2
/*    */     //   32: ldc2_w 2655197339851
/*    */     //   35: lxor
/*    */     //   36: lstore #7
/*    */     //   38: dup2
/*    */     //   39: ldc2_w 78267163198893
/*    */     //   42: lxor
/*    */     //   43: lstore #9
/*    */     //   45: dup2
/*    */     //   46: ldc2_w 94558425460641
/*    */     //   49: lxor
/*    */     //   50: lstore #11
/*    */     //   52: pop2
/*    */     //   53: ldc2_w 3767931498015323896
/*    */     //   56: lload #5
/*    */     //   58: <illegal opcode> w : (JJ)Ljava/lang/String;
/*    */     //   63: astore #13
/*    */     //   65: iload #4
/*    */     //   67: aload #13
/*    */     //   69: ifnonnull -> 238
/*    */     //   72: ifne -> 201
/*    */     //   75: goto -> 89
/*    */     //   78: ldc2_w 3871418520725359030
/*    */     //   81: lload #5
/*    */     //   83: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   88: athrow
/*    */     //   89: aload_0
/*    */     //   90: invokestatic currentTimeMillis : ()J
/*    */     //   93: putfield r : J
/*    */     //   96: aload_0
/*    */     //   97: invokevirtual a : ()Lme/konsolas/aac/AAC;
/*    */     //   100: invokevirtual a : ()Lme/konsolas/aac/w;
/*    */     //   103: aload_0
/*    */     //   104: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*    */     //   107: lload #11
/*    */     //   109: dup2_x1
/*    */     //   110: pop2
/*    */     //   111: invokevirtual a : (JLorg/bukkit/entity/Player;)Z
/*    */     //   114: aload #13
/*    */     //   116: ifnonnull -> 310
/*    */     //   119: goto -> 133
/*    */     //   122: ldc2_w 3871418520725359030
/*    */     //   125: lload #5
/*    */     //   127: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   132: athrow
/*    */     //   133: ifeq -> 306
/*    */     //   136: goto -> 150
/*    */     //   139: ldc2_w 3871418520725359030
/*    */     //   142: lload #5
/*    */     //   144: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   149: athrow
/*    */     //   150: aload_0
/*    */     //   151: iload_2
/*    */     //   152: iflt -> 307
/*    */     //   155: invokevirtual a : ()Lme/konsolas/aac/AAC;
/*    */     //   158: invokevirtual a : ()Lme/konsolas/aac/w;
/*    */     //   161: aload_0
/*    */     //   162: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*    */     //   165: sipush #5927
/*    */     //   168: ldc2_w 6885118595186367961
/*    */     //   171: lload #5
/*    */     //   173: lxor
/*    */     //   174: <illegal opcode> k : (IJ)Ljava/lang/String;
/*    */     //   179: invokevirtual a : (Lorg/bukkit/entity/Player;Ljava/lang/String;)V
/*    */     //   182: aload #13
/*    */     //   184: ifnull -> 306
/*    */     //   187: goto -> 201
/*    */     //   190: ldc2_w 3871418520725359030
/*    */     //   193: lload #5
/*    */     //   195: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   200: athrow
/*    */     //   201: aload_0
/*    */     //   202: lconst_0
/*    */     //   203: putfield r : J
/*    */     //   206: aload_0
/*    */     //   207: invokevirtual a : ()Lme/konsolas/aac/AAC;
/*    */     //   210: invokevirtual a : ()Lme/konsolas/aac/w;
/*    */     //   213: aload_0
/*    */     //   214: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*    */     //   217: lload #11
/*    */     //   219: dup2_x1
/*    */     //   220: pop2
/*    */     //   221: invokevirtual a : (JLorg/bukkit/entity/Player;)Z
/*    */     //   224: goto -> 238
/*    */     //   227: ldc2_w 3871418520725359030
/*    */     //   230: lload #5
/*    */     //   232: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   237: athrow
/*    */     //   238: aload #13
/*    */     //   240: iload_2
/*    */     //   241: ifle -> 312
/*    */     //   244: ifnonnull -> 310
/*    */     //   247: ifeq -> 306
/*    */     //   250: goto -> 264
/*    */     //   253: ldc2_w 3871418520725359030
/*    */     //   256: lload #5
/*    */     //   258: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   263: athrow
/*    */     //   264: aload_0
/*    */     //   265: invokevirtual a : ()Lme/konsolas/aac/AAC;
/*    */     //   268: invokevirtual a : ()Lme/konsolas/aac/w;
/*    */     //   271: aload_0
/*    */     //   272: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*    */     //   275: sipush #6294
/*    */     //   278: ldc2_w 4461059708303708774
/*    */     //   281: lload #5
/*    */     //   283: lxor
/*    */     //   284: <illegal opcode> k : (IJ)Ljava/lang/String;
/*    */     //   289: invokevirtual a : (Lorg/bukkit/entity/Player;Ljava/lang/String;)V
/*    */     //   292: goto -> 306
/*    */     //   295: ldc2_w 3871418520725359030
/*    */     //   298: lload #5
/*    */     //   300: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   305: athrow
/*    */     //   306: aload_0
/*    */     //   307: getfield a : Z
/*    */     //   310: aload #13
/*    */     //   312: ifnonnull -> 611
/*    */     //   315: ifeq -> 610
/*    */     //   318: goto -> 332
/*    */     //   321: ldc2_w 3871418520725359030
/*    */     //   324: lload #5
/*    */     //   326: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   331: athrow
/*    */     //   332: invokestatic currentTimeMillis : ()J
/*    */     //   335: aload_0
/*    */     //   336: getfield q : J
/*    */     //   339: lsub
/*    */     //   340: lstore #14
/*    */     //   342: lload #14
/*    */     //   344: ldc2_w 500
/*    */     //   347: lcmp
/*    */     //   348: aload #13
/*    */     //   350: ifnonnull -> 611
/*    */     //   353: ifge -> 610
/*    */     //   356: goto -> 370
/*    */     //   359: ldc2_w 3871418520725359030
/*    */     //   362: lload #5
/*    */     //   364: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   369: athrow
/*    */     //   370: iload #4
/*    */     //   372: ifeq -> 405
/*    */     //   375: goto -> 389
/*    */     //   378: ldc2_w 3871418520725359030
/*    */     //   381: lload #5
/*    */     //   383: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   388: athrow
/*    */     //   389: ldc 0.05
/*    */     //   391: goto -> 407
/*    */     //   394: ldc2_w 3871418520725359030
/*    */     //   397: lload #5
/*    */     //   399: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   404: athrow
/*    */     //   405: ldc 0.1
/*    */     //   407: fstore #16
/*    */     //   409: fload #16
/*    */     //   411: lload #14
/*    */     //   413: l2f
/*    */     //   414: ldc 1000.0
/*    */     //   416: fdiv
/*    */     //   417: fsub
/*    */     //   418: fstore #17
/*    */     //   420: aload_0
/*    */     //   421: getfield g : Lme/konsolas/aac/O;
/*    */     //   424: invokevirtual a : ()F
/*    */     //   427: ldc 0.5
/*    */     //   429: fcmpl
/*    */     //   430: aload #13
/*    */     //   432: iload_2
/*    */     //   433: iflt -> 511
/*    */     //   436: ifnonnull -> 509
/*    */     //   439: ifle -> 491
/*    */     //   442: goto -> 456
/*    */     //   445: ldc2_w 3871418520725359030
/*    */     //   448: lload #5
/*    */     //   450: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   455: athrow
/*    */     //   456: aload_0
/*    */     //   457: ldc2_w 3861925891899386312
/*    */     //   460: lload #5
/*    */     //   462: <illegal opcode> Ñ : (JJ)Lme/konsolas/aac/eA;
/*    */     //   467: fload #17
/*    */     //   469: fload #16
/*    */     //   471: fdiv
/*    */     //   472: lload #7
/*    */     //   474: invokevirtual a : (Lme/konsolas/aac/eA;FJ)V
/*    */     //   477: goto -> 491
/*    */     //   480: ldc2_w 3871418520725359030
/*    */     //   483: lload #5
/*    */     //   485: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   490: athrow
/*    */     //   491: aload_0
/*    */     //   492: invokevirtual a : ()Lme/konsolas/aac/AAC;
/*    */     //   495: invokevirtual a : ()Lme/konsolas/aac/w;
/*    */     //   498: aload_0
/*    */     //   499: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*    */     //   502: lload #11
/*    */     //   504: dup2_x1
/*    */     //   505: pop2
/*    */     //   506: invokevirtual a : (JLorg/bukkit/entity/Player;)Z
/*    */     //   509: aload #13
/*    */     //   511: ifnonnull -> 609
/*    */     //   514: ifeq -> 598
/*    */     //   517: goto -> 531
/*    */     //   520: ldc2_w 3871418520725359030
/*    */     //   523: lload #5
/*    */     //   525: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   530: athrow
/*    */     //   531: aload_0
/*    */     //   532: invokevirtual a : ()Lme/konsolas/aac/AAC;
/*    */     //   535: invokevirtual a : ()Lme/konsolas/aac/w;
/*    */     //   538: aload_0
/*    */     //   539: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*    */     //   542: sipush #6101
/*    */     //   545: ldc2_w 4670132988256525600
/*    */     //   548: lload #5
/*    */     //   550: lxor
/*    */     //   551: <illegal opcode> k : (IJ)Ljava/lang/String;
/*    */     //   556: iconst_2
/*    */     //   557: anewarray java/lang/Object
/*    */     //   560: dup
/*    */     //   561: iconst_0
/*    */     //   562: aload_0
/*    */     //   563: getfield g : Lme/konsolas/aac/O;
/*    */     //   566: invokevirtual a : ()F
/*    */     //   569: invokestatic valueOf : (F)Ljava/lang/Float;
/*    */     //   572: aastore
/*    */     //   573: dup
/*    */     //   574: iconst_1
/*    */     //   575: fload #17
/*    */     //   577: invokestatic valueOf : (F)Ljava/lang/Float;
/*    */     //   580: aastore
/*    */     //   581: invokevirtual a : (Lorg/bukkit/entity/Player;Ljava/lang/String;[Ljava/lang/Object;)V
/*    */     //   584: goto -> 598
/*    */     //   587: ldc2_w 3871418520725359030
/*    */     //   590: lload #5
/*    */     //   592: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   597: athrow
/*    */     //   598: aload_0
/*    */     //   599: getfield g : Lme/konsolas/aac/O;
/*    */     //   602: fload #17
/*    */     //   604: lload #9
/*    */     //   606: invokevirtual a : (FJ)Z
/*    */     //   609: ireturn
/*    */     //   610: iconst_0
/*    */     //   611: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #103	-> 65
/*    */     //   #113	-> 89
/*    */     //   #63	-> 96
/*    */     //   #42	-> 150
/*    */     //   #7	-> 201
/*    */     //   #80	-> 206
/*    */     //   #52	-> 264
/*    */     //   #89	-> 306
/*    */     //   #48	-> 332
/*    */     //   #4	-> 342
/*    */     //   #28	-> 370
/*    */     //   #54	-> 409
/*    */     //   #101	-> 420
/*    */     //   #107	-> 491
/*    */     //   #117	-> 531
/*    */     //   #57	-> 598
/*    */     //   #116	-> 610
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   65	75	78	aacinternal/v
/*    */     //   72	119	122	aacinternal/v
/*    */     //   89	136	139	aacinternal/v
/*    */     //   133	187	190	aacinternal/v
/*    */     //   150	224	227	aacinternal/v
/*    */     //   238	250	253	aacinternal/v
/*    */     //   247	292	295	aacinternal/v
/*    */     //   310	318	321	aacinternal/v
/*    */     //   342	356	359	aacinternal/v
/*    */     //   353	375	378	aacinternal/v
/*    */     //   370	394	394	aacinternal/v
/*    */     //   420	442	445	aacinternal/v
/*    */     //   439	477	480	aacinternal/v
/*    */     //   509	517	520	aacinternal/v
/*    */     //   514	584	587	aacinternal/v
/*    */   }
/*    */   
/*    */   public void a(long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/cm.v : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: lload_1
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 24122322425725
/*    */     //   11: lxor
/*    */     //   12: lstore_3
/*    */     //   13: dup2
/*    */     //   14: ldc2_w 88736743846427
/*    */     //   17: lxor
/*    */     //   18: lstore #5
/*    */     //   20: dup2
/*    */     //   21: ldc2_w 72130841647127
/*    */     //   24: lxor
/*    */     //   25: lstore #7
/*    */     //   27: pop2
/*    */     //   28: ldc2_w -8936137673528524466
/*    */     //   31: lload_1
/*    */     //   32: <illegal opcode> w : (JJ)Ljava/lang/String;
/*    */     //   37: astore #9
/*    */     //   39: aload_0
/*    */     //   40: getfield s : Z
/*    */     //   43: ifeq -> 288
/*    */     //   46: invokestatic currentTimeMillis : ()J
/*    */     //   49: lstore #10
/*    */     //   51: aload_0
/*    */     //   52: getfield f : J
/*    */     //   55: lstore #12
/*    */     //   57: lload #10
/*    */     //   59: lload #12
/*    */     //   61: lsub
/*    */     //   62: lstore #14
/*    */     //   64: aload_0
/*    */     //   65: lload #10
/*    */     //   67: putfield f : J
/*    */     //   70: lload #12
/*    */     //   72: lconst_0
/*    */     //   73: lcmp
/*    */     //   74: ifne -> 88
/*    */     //   77: return
/*    */     //   78: ldc2_w -9075847021279461888
/*    */     //   81: lload_1
/*    */     //   82: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   87: athrow
/*    */     //   88: ldc 0.1
/*    */     //   90: fstore #16
/*    */     //   92: fload #16
/*    */     //   94: lload #14
/*    */     //   96: l2f
/*    */     //   97: ldc 1000.0
/*    */     //   99: fdiv
/*    */     //   100: fsub
/*    */     //   101: fstore #17
/*    */     //   103: aload_0
/*    */     //   104: getfield g : Lme/konsolas/aac/O;
/*    */     //   107: invokevirtual a : ()F
/*    */     //   110: ldc 0.5
/*    */     //   112: fcmpl
/*    */     //   113: aload #9
/*    */     //   115: lload_1
/*    */     //   116: lconst_0
/*    */     //   117: lcmp
/*    */     //   118: iflt -> 192
/*    */     //   121: ifnonnull -> 190
/*    */     //   124: ifle -> 172
/*    */     //   127: goto -> 140
/*    */     //   130: ldc2_w -9075847021279461888
/*    */     //   133: lload_1
/*    */     //   134: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   139: athrow
/*    */     //   140: aload_0
/*    */     //   141: ldc2_w -8977842153186715600
/*    */     //   144: lload_1
/*    */     //   145: <illegal opcode> Ñ : (JJ)Lme/konsolas/aac/eA;
/*    */     //   150: fload #17
/*    */     //   152: fload #16
/*    */     //   154: fdiv
/*    */     //   155: lload_3
/*    */     //   156: invokevirtual a : (Lme/konsolas/aac/eA;FJ)V
/*    */     //   159: goto -> 172
/*    */     //   162: ldc2_w -9075847021279461888
/*    */     //   165: lload_1
/*    */     //   166: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   171: athrow
/*    */     //   172: aload_0
/*    */     //   173: invokevirtual a : ()Lme/konsolas/aac/AAC;
/*    */     //   176: invokevirtual a : ()Lme/konsolas/aac/w;
/*    */     //   179: aload_0
/*    */     //   180: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*    */     //   183: lload #7
/*    */     //   185: dup2_x1
/*    */     //   186: pop2
/*    */     //   187: invokevirtual a : (JLorg/bukkit/entity/Player;)Z
/*    */     //   190: aload #9
/*    */     //   192: ifnonnull -> 287
/*    */     //   195: ifeq -> 276
/*    */     //   198: goto -> 211
/*    */     //   201: ldc2_w -9075847021279461888
/*    */     //   204: lload_1
/*    */     //   205: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   210: athrow
/*    */     //   211: aload_0
/*    */     //   212: invokevirtual a : ()Lme/konsolas/aac/AAC;
/*    */     //   215: invokevirtual a : ()Lme/konsolas/aac/w;
/*    */     //   218: aload_0
/*    */     //   219: invokevirtual a : ()Lorg/bukkit/entity/Player;
/*    */     //   222: sipush #20133
/*    */     //   225: ldc2_w 6807888356886672380
/*    */     //   228: lload_1
/*    */     //   229: lxor
/*    */     //   230: <illegal opcode> k : (IJ)Ljava/lang/String;
/*    */     //   235: iconst_2
/*    */     //   236: anewarray java/lang/Object
/*    */     //   239: dup
/*    */     //   240: iconst_0
/*    */     //   241: aload_0
/*    */     //   242: getfield g : Lme/konsolas/aac/O;
/*    */     //   245: invokevirtual a : ()F
/*    */     //   248: invokestatic valueOf : (F)Ljava/lang/Float;
/*    */     //   251: aastore
/*    */     //   252: dup
/*    */     //   253: iconst_1
/*    */     //   254: fload #17
/*    */     //   256: invokestatic valueOf : (F)Ljava/lang/Float;
/*    */     //   259: aastore
/*    */     //   260: invokevirtual a : (Lorg/bukkit/entity/Player;Ljava/lang/String;[Ljava/lang/Object;)V
/*    */     //   263: goto -> 276
/*    */     //   266: ldc2_w -9075847021279461888
/*    */     //   269: lload_1
/*    */     //   270: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   275: athrow
/*    */     //   276: aload_0
/*    */     //   277: getfield g : Lme/konsolas/aac/O;
/*    */     //   280: fload #17
/*    */     //   282: lload #5
/*    */     //   284: invokevirtual a : (FJ)Z
/*    */     //   287: pop
/*    */     //   288: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #111	-> 39
/*    */     //   #11	-> 46
/*    */     //   #86	-> 51
/*    */     //   #92	-> 57
/*    */     //   #35	-> 64
/*    */     //   #120	-> 70
/*    */     //   #18	-> 88
/*    */     //   #1	-> 92
/*    */     //   #26	-> 103
/*    */     //   #91	-> 172
/*    */     //   #81	-> 211
/*    */     //   #56	-> 276
/*    */     //   #41	-> 288
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   64	78	78	aacinternal/v
/*    */     //   103	127	130	aacinternal/v
/*    */     //   124	159	162	aacinternal/v
/*    */     //   190	198	201	aacinternal/v
/*    */     //   195	263	266	aacinternal/v
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   }
/*    */   
/*    */   private static String b(byte[] paramArrayOfbyte) {
/*    */     byte b1 = 0;
/*    */     int i;
/*    */     char[] arrayOfChar = new char[i = paramArrayOfbyte.length];
/*    */     for (byte b2 = 0; b2 < i; b2++) {
/*    */       int j;
/*    */       if ((j = 0xFF & paramArrayOfbyte[b2]) < 192) {
/*    */         arrayOfChar[b1++] = (char)j;
/*    */       } else if (j < 224) {
/*    */         char c = (char)((char)(j & 0x1F) << 6);
/*    */         j = paramArrayOfbyte[++b2];
/*    */         c = (char)(c | (char)(j & 0x3F));
/*    */         arrayOfChar[b1++] = c;
/*    */       } else if (b2 < i - 2) {
/*    */         char c = (char)((char)(j & 0xF) << 12);
/*    */         j = paramArrayOfbyte[++b2];
/*    */         c = (char)(c | (char)(j & 0x3F) << 6);
/*    */         j = paramArrayOfbyte[++b2];
/*    */         c = (char)(c | (char)(j & 0x3F));
/*    */         arrayOfChar[b1++] = c;
/*    */       } 
/*    */     } 
/*    */     return new String(arrayOfChar, 0, b1);
/*    */   }
/*    */   
/*    */   private static String b(int paramInt, long paramLong) {
/*    */     int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x3F80;
/*    */     if (x[i] == null) {
/*    */       Object[] arrayOfObject;
/*    */       try {
/*    */         Long long_ = Long.valueOf(Thread.currentThread().getId());
/*    */         arrayOfObject = (Object[])y.get(long_);
/*    */         if (arrayOfObject == null) {
/*    */           arrayOfObject = new Object[3];
/*    */           "篞ᑒ鴾뚂뼌졃⃡ỻḣ䮿ⵢ䵓콹㚋ɽ疅뉍Ṽ갰䉮".toCharArray()[1] = (char)("篞ᑒ鴾뚂뼌졃⃡ỻḣ䮿ⵢ䵓콹㚋ɽ疅뉍Ṽ갰䉮".toCharArray()[1] ^ 0x53EB);
/*    */           arrayOfObject[0] = Cipher.getInstance(a0$cc.G("篞ᑒ鴾뚂뼌졃⃡ỻḣ䮿ⵢ䵓콹㚋ɽ疅뉍Ṽ갰䉮".toCharArray(), (short)24879, true, (byte)5));
/*    */           "듋⧬백墵".toCharArray()[2] = (char)("듋⧬백墵".toCharArray()[2] ^ 0x2EAE);
/*    */           arrayOfObject[1] = SecretKeyFactory.getInstance(a0$cc.G("듋⧬백墵".toCharArray(), (short)6299, true, (byte)4));
/*    */           arrayOfObject[2] = new IvParameterSpec(new byte[8]);
/*    */           y.put(long_, arrayOfObject);
/*    */         } 
/*    */       } catch (Exception exception) {
/*    */         "?⛧菵㥭톎⮖䣑襐ᘕ콵싇䷄ҟ᥷ᴽ侕爣".toCharArray()[1] = (char)("?⛧菵㥭톎⮖䣑襐ᘕ콵싇䷄ҟ᥷ᴽ侕爣".toCharArray()[1] ^ 0x5F79);
/*    */         throw new RuntimeException(a0$cc.G("?⛧菵㥭톎⮖䣑襐ᘕ콵싇䷄ҟ᥷ᴽ侕爣".toCharArray(), (short)29873, false, (byte)0), exception);
/*    */       } 
/*    */       byte[] arrayOfByte1 = new byte[8];
/*    */       arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
/*    */       for (byte b = 1; b < 8; b++)
/*    */         arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
/*    */       DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
/*    */       SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
/*    */       ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
/*    */       "䵔潪᪯ẖ㍻㭜Ф䉝㘒".toCharArray()[4] = (char)("䵔潪᪯ẖ㍻㭜Ф䉝㘒".toCharArray()[4] ^ 0x269C);
/*    */       byte[] arrayOfByte2 = w[i].getBytes(a0$cc.G("䵔潪᪯ẖ㍻㭜Ф䉝㘒".toCharArray(), (short)22427, false, (byte)1));
/*    */       x[i] = b(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
/*    */     } 
/*    */     return x[i];
/*    */   }
/*    */   
/*    */   private static Object b(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
/*    */     int i = ((Integer)paramArrayOfObject[0]).intValue();
/*    */     long l = ((Long)paramArrayOfObject[1]).longValue();
/*    */     String str = b(i, l);
/*    */     MethodHandle methodHandle = MethodHandles.constant(String.class, str);
/*    */     paramMutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[] { int.class, long.class }));
/*    */     return str;
/*    */   }
/*    */   
/*    */   private static CallSite b(MethodHandles.Lookup paramLookup, String paramString, MethodType paramMethodType) {
/*    */     // Byte code:
/*    */     //   0: new java/lang/invoke/MutableCallSite
/*    */     //   3: dup
/*    */     //   4: aload_2
/*    */     //   5: invokespecial <init> : (Ljava/lang/invoke/MethodType;)V
/*    */     //   8: astore_3
/*    */     //   9: aload_3
/*    */     //   10: ldc_w
/*    */     //   13: ldc_w [Ljava/lang/Object;
/*    */     //   16: aload_2
/*    */     //   17: invokevirtual parameterCount : ()I
/*    */     //   20: invokevirtual asCollector : (Ljava/lang/Class;I)Ljava/lang/invoke/MethodHandle;
/*    */     //   23: iconst_0
/*    */     //   24: iconst_3
/*    */     //   25: anewarray java/lang/Object
/*    */     //   28: dup
/*    */     //   29: iconst_0
/*    */     //   30: aload_0
/*    */     //   31: aastore
/*    */     //   32: dup
/*    */     //   33: iconst_1
/*    */     //   34: aload_3
/*    */     //   35: aastore
/*    */     //   36: dup
/*    */     //   37: iconst_2
/*    */     //   38: aload_1
/*    */     //   39: aastore
/*    */     //   40: invokestatic insertArguments : (Ljava/lang/invoke/MethodHandle;I[Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;
/*    */     //   43: aload_2
/*    */     //   44: invokestatic explicitCastArguments : (Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;
/*    */     //   47: invokevirtual setTarget : (Ljava/lang/invoke/MethodHandle;)V
/*    */     //   50: goto -> 171
/*    */     //   53: astore #4
/*    */     //   55: new java/lang/RuntimeException
/*    */     //   58: dup
/*    */     //   59: new java/lang/StringBuilder
/*    */     //   62: dup
/*    */     //   63: invokespecial <init> : ()V
/*    */     //   66: ldc_w '꒭Ἧ果㸕ᴢ婱昼⣻荫ꤘ鮽崌娹峭⾏㈋岟'
/*    */     //   69: invokevirtual toCharArray : ()[C
/*    */     //   72: dup
/*    */     //   73: dup
/*    */     //   74: bipush #10
/*    */     //   76: dup_x1
/*    */     //   77: caload
/*    */     //   78: sipush #6190
/*    */     //   81: ixor
/*    */     //   82: i2c
/*    */     //   83: castore
/*    */     //   84: sipush #29428
/*    */     //   87: iconst_0
/*    */     //   88: iconst_0
/*    */     //   89: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   95: ldc_w '鏟ᨅꓣ炡'
/*    */     //   98: invokevirtual toCharArray : ()[C
/*    */     //   101: dup
/*    */     //   102: dup
/*    */     //   103: iconst_2
/*    */     //   104: dup_x1
/*    */     //   105: caload
/*    */     //   106: sipush #14001
/*    */     //   109: ixor
/*    */     //   110: i2c
/*    */     //   111: castore
/*    */     //   112: sipush #10657
/*    */     //   115: iconst_0
/*    */     //   116: iconst_1
/*    */     //   117: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   123: aload_1
/*    */     //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   127: ldc_w '依뛨灴瑀'
/*    */     //   130: invokevirtual toCharArray : ()[C
/*    */     //   133: dup
/*    */     //   134: dup
/*    */     //   135: iconst_1
/*    */     //   136: dup_x1
/*    */     //   137: caload
/*    */     //   138: sipush #29025
/*    */     //   141: ixor
/*    */     //   142: i2c
/*    */     //   143: castore
/*    */     //   144: sipush #32456
/*    */     //   147: iconst_1
/*    */     //   148: iconst_0
/*    */     //   149: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   152: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   155: aload_2
/*    */     //   156: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   159: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   162: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   165: aload #4
/*    */     //   167: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   170: athrow
/*    */     //   171: aload_3
/*    */     //   172: areturn
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   9	50	53	java/lang/Exception
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\cm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */