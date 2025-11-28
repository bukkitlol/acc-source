/*     */ package me.konsolas.aac;
/*     */ public class k7 {
/*     */   public Boolean d() {
/*   4 */     return Boolean.valueOf(this.b);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  13 */   private final AtomicBoolean o = new AtomicBoolean();
/*     */   
/*     */   public eo a() {
/*  16 */     return this.B;
/*     */   }
/*     */   
/*  19 */   private final AtomicInteger D = new AtomicInteger(); public Boolean c(long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/k7.O : J
/*     */     //   3: lload_1
/*     */     //   4: lxor
/*     */     //   5: lstore_1
/*     */     //   6: ldc2_w -5618679804903061966
/*     */     //   9: lload_1
/*     */     //   10: <illegal opcode> w : (JJ)I
/*     */     //   15: istore_3
/*     */     //   16: aload_0
/*     */     //   17: getfield l : Ljava/util/concurrent/atomic/AtomicInteger;
/*     */     //   20: invokevirtual get : ()I
/*     */     //   23: iload_3
/*     */     //   24: ifeq -> 59
/*     */     //   27: ifle -> 55
/*     */     //   30: goto -> 43
/*     */     //   33: ldc2_w -5506827196767493465
/*     */     //   36: lload_1
/*     */     //   37: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   42: athrow
/*     */     //   43: aconst_null
/*     */     //   44: areturn
/*     */     //   45: ldc2_w -5506827196767493465
/*     */     //   48: lload_1
/*     */     //   49: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   54: athrow
/*     */     //   55: aload_0
/*     */     //   56: getfield c : Z
/*     */     //   59: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   62: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #21	-> 16
/*     */     //   #140	-> 55
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   16	30	33	aacinternal/v
/*     */     //   27	45	45	aacinternal/v
/*     */   } public boolean f() {
/*  22 */     return this.j;
/*     */   }
/*     */   public void c(long paramLong, Player paramPlayer) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/k7.O : J
/*     */     //   3: lload_1
/*     */     //   4: lxor
/*     */     //   5: lstore_1
/*     */     //   6: lload_1
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 3983579762827
/*     */     //   11: lxor
/*     */     //   12: lstore #4
/*     */     //   14: dup2
/*     */     //   15: ldc2_w 104875717396963
/*     */     //   18: lxor
/*     */     //   19: lstore #6
/*     */     //   21: pop2
/*     */     //   22: ldc2_w -2962425445323990810
/*     */     //   25: lload_1
/*     */     //   26: <illegal opcode> w : (JJ)I
/*     */     //   31: aload_3
/*     */     //   32: astore #9
/*     */     //   34: istore #8
/*     */     //   36: aload #9
/*     */     //   38: invokeinterface getVehicle : ()Lorg/bukkit/entity/Entity;
/*     */     //   43: instanceof org/bukkit/entity/LivingEntity
/*     */     //   46: ifeq -> 96
/*     */     //   49: aload #9
/*     */     //   51: invokeinterface getVehicle : ()Lorg/bukkit/entity/Entity;
/*     */     //   56: checkcast org/bukkit/entity/LivingEntity
/*     */     //   59: lload_1
/*     */     //   60: lconst_0
/*     */     //   61: lcmp
/*     */     //   62: ifle -> 176
/*     */     //   65: astore #9
/*     */     //   67: iload #8
/*     */     //   69: ifne -> 174
/*     */     //   72: iload #8
/*     */     //   74: ifeq -> 36
/*     */     //   77: lload_1
/*     */     //   78: lconst_0
/*     */     //   79: lcmp
/*     */     //   80: ifle -> 67
/*     */     //   83: goto -> 96
/*     */     //   86: ldc2_w -2937823851134204402
/*     */     //   89: lload_1
/*     */     //   90: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   95: athrow
/*     */     //   96: aload #9
/*     */     //   98: iload #8
/*     */     //   100: ifne -> 181
/*     */     //   103: aload_3
/*     */     //   104: if_acmpeq -> 144
/*     */     //   107: goto -> 120
/*     */     //   110: ldc2_w -2937823851134204402
/*     */     //   113: lload_1
/*     */     //   114: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   119: athrow
/*     */     //   120: aload_0
/*     */     //   121: aload #9
/*     */     //   123: invokeinterface getType : ()Lorg/bukkit/entity/EntityType;
/*     */     //   128: putfield y : Lorg/bukkit/entity/EntityType;
/*     */     //   131: goto -> 144
/*     */     //   134: ldc2_w -2937823851134204402
/*     */     //   137: lload_1
/*     */     //   138: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   143: athrow
/*     */     //   144: lload_1
/*     */     //   145: lconst_0
/*     */     //   146: lcmp
/*     */     //   147: iflt -> 161
/*     */     //   150: aload_0
/*     */     //   151: iload #8
/*     */     //   153: ifne -> 283
/*     */     //   156: aload #9
/*     */     //   158: putfield r : Lorg/bukkit/entity/LivingEntity;
/*     */     //   161: goto -> 174
/*     */     //   164: ldc2_w -2937823851134204402
/*     */     //   167: lload_1
/*     */     //   168: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   173: athrow
/*     */     //   174: aload #9
/*     */     //   176: invokeinterface getVehicle : ()Lorg/bukkit/entity/Entity;
/*     */     //   181: ifnull -> 269
/*     */     //   184: aload #9
/*     */     //   186: invokeinterface getVehicle : ()Lorg/bukkit/entity/Entity;
/*     */     //   191: astore #10
/*     */     //   193: aload #10
/*     */     //   195: invokeinterface getVehicle : ()Lorg/bukkit/entity/Entity;
/*     */     //   200: ifnull -> 247
/*     */     //   203: aload #10
/*     */     //   205: invokeinterface getVehicle : ()Lorg/bukkit/entity/Entity;
/*     */     //   210: astore #10
/*     */     //   212: iload #8
/*     */     //   214: lload_1
/*     */     //   215: lconst_0
/*     */     //   216: lcmp
/*     */     //   217: iflt -> 260
/*     */     //   220: ifne -> 258
/*     */     //   223: iload #8
/*     */     //   225: ifeq -> 193
/*     */     //   228: lload_1
/*     */     //   229: lconst_0
/*     */     //   230: lcmp
/*     */     //   231: ifle -> 212
/*     */     //   234: goto -> 247
/*     */     //   237: ldc2_w -2937823851134204402
/*     */     //   240: lload_1
/*     */     //   241: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   246: athrow
/*     */     //   247: aload_0
/*     */     //   248: aload #10
/*     */     //   250: invokeinterface getType : ()Lorg/bukkit/entity/EntityType;
/*     */     //   255: putfield A : Lorg/bukkit/entity/EntityType;
/*     */     //   258: iload #8
/*     */     //   260: lload_1
/*     */     //   261: lconst_0
/*     */     //   262: lcmp
/*     */     //   263: ifle -> 310
/*     */     //   266: ifeq -> 287
/*     */     //   269: aload_0
/*     */     //   270: goto -> 283
/*     */     //   273: ldc2_w -2937823851134204402
/*     */     //   276: lload_1
/*     */     //   277: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   282: athrow
/*     */     //   283: aconst_null
/*     */     //   284: putfield A : Lorg/bukkit/entity/EntityType;
/*     */     //   287: aload_0
/*     */     //   288: aload #9
/*     */     //   290: invokeinterface getType : ()Lorg/bukkit/entity/EntityType;
/*     */     //   295: putfield I : Lorg/bukkit/entity/EntityType;
/*     */     //   298: aload_0
/*     */     //   299: lload #6
/*     */     //   301: aload #9
/*     */     //   303: invokestatic a : (JLorg/bukkit/entity/Entity;)Lme/konsolas/aac/eo;
/*     */     //   306: putfield B : Lme/konsolas/aac/eo;
/*     */     //   309: iconst_m1
/*     */     //   310: istore #10
/*     */     //   312: iconst_m1
/*     */     //   313: istore #11
/*     */     //   315: iconst_m1
/*     */     //   316: istore #12
/*     */     //   318: iconst_m1
/*     */     //   319: istore #13
/*     */     //   321: iconst_0
/*     */     //   322: istore #14
/*     */     //   324: iconst_0
/*     */     //   325: istore #15
/*     */     //   327: aload #9
/*     */     //   329: invokeinterface getActivePotionEffects : ()Ljava/util/Collection;
/*     */     //   334: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   339: astore #16
/*     */     //   341: aload #16
/*     */     //   343: invokeinterface hasNext : ()Z
/*     */     //   348: ifeq -> 909
/*     */     //   351: aload #16
/*     */     //   353: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   358: checkcast org/bukkit/potion/PotionEffect
/*     */     //   361: astore #17
/*     */     //   363: aload #17
/*     */     //   365: invokevirtual getType : ()Lorg/bukkit/potion/PotionEffectType;
/*     */     //   368: getstatic org/bukkit/potion/PotionEffectType.SPEED : Lorg/bukkit/potion/PotionEffectType;
/*     */     //   371: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   374: iload #8
/*     */     //   376: lload_1
/*     */     //   377: lconst_0
/*     */     //   378: lcmp
/*     */     //   379: iflt -> 952
/*     */     //   382: ifne -> 950
/*     */     //   385: iload #8
/*     */     //   387: lload_1
/*     */     //   388: lconst_0
/*     */     //   389: lcmp
/*     */     //   390: iflt -> 469
/*     */     //   393: ifne -> 467
/*     */     //   396: goto -> 409
/*     */     //   399: ldc2_w -2937823851134204402
/*     */     //   402: lload_1
/*     */     //   403: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   408: athrow
/*     */     //   409: ifeq -> 443
/*     */     //   412: goto -> 425
/*     */     //   415: ldc2_w -2937823851134204402
/*     */     //   418: lload_1
/*     */     //   419: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   424: athrow
/*     */     //   425: aload #17
/*     */     //   427: invokevirtual getAmplifier : ()I
/*     */     //   430: istore #10
/*     */     //   432: iload #8
/*     */     //   434: lload_1
/*     */     //   435: lconst_0
/*     */     //   436: lcmp
/*     */     //   437: iflt -> 906
/*     */     //   440: ifeq -> 904
/*     */     //   443: aload #17
/*     */     //   445: invokevirtual getType : ()Lorg/bukkit/potion/PotionEffectType;
/*     */     //   448: getstatic org/bukkit/potion/PotionEffectType.SLOW : Lorg/bukkit/potion/PotionEffectType;
/*     */     //   451: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   454: goto -> 467
/*     */     //   457: ldc2_w -2937823851134204402
/*     */     //   460: lload_1
/*     */     //   461: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   466: athrow
/*     */     //   467: iload #8
/*     */     //   469: lload_1
/*     */     //   470: lconst_0
/*     */     //   471: lcmp
/*     */     //   472: iflt -> 538
/*     */     //   475: ifne -> 536
/*     */     //   478: ifeq -> 512
/*     */     //   481: goto -> 494
/*     */     //   484: ldc2_w -2937823851134204402
/*     */     //   487: lload_1
/*     */     //   488: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   493: athrow
/*     */     //   494: aload #17
/*     */     //   496: invokevirtual getAmplifier : ()I
/*     */     //   499: istore #11
/*     */     //   501: iload #8
/*     */     //   503: lload_1
/*     */     //   504: lconst_0
/*     */     //   505: lcmp
/*     */     //   506: iflt -> 906
/*     */     //   509: ifeq -> 904
/*     */     //   512: aload #17
/*     */     //   514: invokevirtual getType : ()Lorg/bukkit/potion/PotionEffectType;
/*     */     //   517: getstatic org/bukkit/potion/PotionEffectType.JUMP : Lorg/bukkit/potion/PotionEffectType;
/*     */     //   520: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   523: goto -> 536
/*     */     //   526: ldc2_w -2937823851134204402
/*     */     //   529: lload_1
/*     */     //   530: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   535: athrow
/*     */     //   536: iload #8
/*     */     //   538: lload_1
/*     */     //   539: lconst_0
/*     */     //   540: lcmp
/*     */     //   541: ifle -> 607
/*     */     //   544: ifne -> 605
/*     */     //   547: ifeq -> 581
/*     */     //   550: goto -> 563
/*     */     //   553: ldc2_w -2937823851134204402
/*     */     //   556: lload_1
/*     */     //   557: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   562: athrow
/*     */     //   563: aload #17
/*     */     //   565: invokevirtual getAmplifier : ()I
/*     */     //   568: istore #12
/*     */     //   570: iload #8
/*     */     //   572: lload_1
/*     */     //   573: lconst_0
/*     */     //   574: lcmp
/*     */     //   575: iflt -> 906
/*     */     //   578: ifeq -> 904
/*     */     //   581: invokestatic a : ()Lme/konsolas/aac/kP;
/*     */     //   584: lload #4
/*     */     //   586: getstatic me/konsolas/aac/kP.V1_9 : Lme/konsolas/aac/kP;
/*     */     //   589: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*     */     //   592: goto -> 605
/*     */     //   595: ldc2_w -2937823851134204402
/*     */     //   598: lload_1
/*     */     //   599: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   604: athrow
/*     */     //   605: iload #8
/*     */     //   607: ifne -> 719
/*     */     //   610: ifeq -> 695
/*     */     //   613: goto -> 626
/*     */     //   616: ldc2_w -2937823851134204402
/*     */     //   619: lload_1
/*     */     //   620: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   625: athrow
/*     */     //   626: aload #17
/*     */     //   628: invokevirtual getType : ()Lorg/bukkit/potion/PotionEffectType;
/*     */     //   631: getstatic org/bukkit/potion/PotionEffectType.LEVITATION : Lorg/bukkit/potion/PotionEffectType;
/*     */     //   634: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   637: iload #8
/*     */     //   639: lload_1
/*     */     //   640: lconst_0
/*     */     //   641: lcmp
/*     */     //   642: ifle -> 721
/*     */     //   645: ifne -> 719
/*     */     //   648: goto -> 661
/*     */     //   651: ldc2_w -2937823851134204402
/*     */     //   654: lload_1
/*     */     //   655: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   660: athrow
/*     */     //   661: ifeq -> 695
/*     */     //   664: goto -> 677
/*     */     //   667: ldc2_w -2937823851134204402
/*     */     //   670: lload_1
/*     */     //   671: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   676: athrow
/*     */     //   677: aload #17
/*     */     //   679: invokevirtual getAmplifier : ()I
/*     */     //   682: istore #13
/*     */     //   684: iload #8
/*     */     //   686: lload_1
/*     */     //   687: lconst_0
/*     */     //   688: lcmp
/*     */     //   689: ifle -> 906
/*     */     //   692: ifeq -> 904
/*     */     //   695: invokestatic a : ()Lme/konsolas/aac/kP;
/*     */     //   698: lload #4
/*     */     //   700: getstatic me/konsolas/aac/kP.V1_13 : Lme/konsolas/aac/kP;
/*     */     //   703: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*     */     //   706: goto -> 719
/*     */     //   709: ldc2_w -2937823851134204402
/*     */     //   712: lload_1
/*     */     //   713: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   718: athrow
/*     */     //   719: iload #8
/*     */     //   721: ifne -> 829
/*     */     //   724: ifeq -> 805
/*     */     //   727: goto -> 740
/*     */     //   730: ldc2_w -2937823851134204402
/*     */     //   733: lload_1
/*     */     //   734: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   739: athrow
/*     */     //   740: aload #17
/*     */     //   742: invokevirtual getType : ()Lorg/bukkit/potion/PotionEffectType;
/*     */     //   745: getstatic org/bukkit/potion/PotionEffectType.SLOW_FALLING : Lorg/bukkit/potion/PotionEffectType;
/*     */     //   748: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   751: iload #8
/*     */     //   753: lload_1
/*     */     //   754: lconst_0
/*     */     //   755: lcmp
/*     */     //   756: ifle -> 831
/*     */     //   759: ifne -> 829
/*     */     //   762: goto -> 775
/*     */     //   765: ldc2_w -2937823851134204402
/*     */     //   768: lload_1
/*     */     //   769: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   774: athrow
/*     */     //   775: ifeq -> 805
/*     */     //   778: goto -> 791
/*     */     //   781: ldc2_w -2937823851134204402
/*     */     //   784: lload_1
/*     */     //   785: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   790: athrow
/*     */     //   791: iconst_1
/*     */     //   792: istore #14
/*     */     //   794: iload #8
/*     */     //   796: lload_1
/*     */     //   797: lconst_0
/*     */     //   798: lcmp
/*     */     //   799: ifle -> 906
/*     */     //   802: ifeq -> 904
/*     */     //   805: invokestatic a : ()Lme/konsolas/aac/kP;
/*     */     //   808: lload #4
/*     */     //   810: getstatic me/konsolas/aac/kP.V1_13 : Lme/konsolas/aac/kP;
/*     */     //   813: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*     */     //   816: goto -> 829
/*     */     //   819: ldc2_w -2937823851134204402
/*     */     //   822: lload_1
/*     */     //   823: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   828: athrow
/*     */     //   829: iload #8
/*     */     //   831: lload_1
/*     */     //   832: lconst_0
/*     */     //   833: lcmp
/*     */     //   834: iflt -> 882
/*     */     //   837: ifne -> 880
/*     */     //   840: ifeq -> 904
/*     */     //   843: goto -> 856
/*     */     //   846: ldc2_w -2937823851134204402
/*     */     //   849: lload_1
/*     */     //   850: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   855: athrow
/*     */     //   856: aload #17
/*     */     //   858: invokevirtual getType : ()Lorg/bukkit/potion/PotionEffectType;
/*     */     //   861: getstatic org/bukkit/potion/PotionEffectType.DOLPHINS_GRACE : Lorg/bukkit/potion/PotionEffectType;
/*     */     //   864: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   867: goto -> 880
/*     */     //   870: ldc2_w -2937823851134204402
/*     */     //   873: lload_1
/*     */     //   874: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   879: athrow
/*     */     //   880: iload #8
/*     */     //   882: ifne -> 902
/*     */     //   885: ifeq -> 904
/*     */     //   888: goto -> 901
/*     */     //   891: ldc2_w -2937823851134204402
/*     */     //   894: lload_1
/*     */     //   895: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   900: athrow
/*     */     //   901: iconst_1
/*     */     //   902: istore #15
/*     */     //   904: iload #8
/*     */     //   906: ifeq -> 341
/*     */     //   909: aload_0
/*     */     //   910: iload #13
/*     */     //   912: putfield z : I
/*     */     //   915: aload_0
/*     */     //   916: iload #12
/*     */     //   918: putfield L : I
/*     */     //   921: aload_0
/*     */     //   922: iload #14
/*     */     //   924: putfield F : Z
/*     */     //   927: aload_0
/*     */     //   928: iload #15
/*     */     //   930: putfield w : Z
/*     */     //   933: invokestatic a : ()Lme/konsolas/aac/kP;
/*     */     //   936: lload_1
/*     */     //   937: lconst_0
/*     */     //   938: lcmp
/*     */     //   939: ifle -> 358
/*     */     //   942: lload #4
/*     */     //   944: getstatic me/konsolas/aac/kP.V1_9 : Lme/konsolas/aac/kP;
/*     */     //   947: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*     */     //   950: iload #8
/*     */     //   952: ifne -> 1220
/*     */     //   955: ifeq -> 1209
/*     */     //   958: goto -> 971
/*     */     //   961: ldc2_w -2937823851134204402
/*     */     //   964: lload_1
/*     */     //   965: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   970: athrow
/*     */     //   971: aload #9
/*     */     //   973: getstatic org/bukkit/attribute/Attribute.GENERIC_MOVEMENT_SPEED : Lorg/bukkit/attribute/Attribute;
/*     */     //   976: invokeinterface getAttribute : (Lorg/bukkit/attribute/Attribute;)Lorg/bukkit/attribute/AttributeInstance;
/*     */     //   981: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   984: checkcast org/bukkit/attribute/AttributeInstance
/*     */     //   987: invokeinterface getValue : ()D
/*     */     //   992: d2f
/*     */     //   993: fstore #16
/*     */     //   995: aload #9
/*     */     //   997: instanceof org/bukkit/entity/Player
/*     */     //   1000: iload #8
/*     */     //   1002: ifne -> 1096
/*     */     //   1005: ifeq -> 1081
/*     */     //   1008: goto -> 1021
/*     */     //   1011: ldc2_w -2937823851134204402
/*     */     //   1014: lload_1
/*     */     //   1015: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1020: athrow
/*     */     //   1021: aload #9
/*     */     //   1023: checkcast org/bukkit/entity/Player
/*     */     //   1026: invokeinterface isSprinting : ()Z
/*     */     //   1031: iload #8
/*     */     //   1033: lload_1
/*     */     //   1034: lconst_0
/*     */     //   1035: lcmp
/*     */     //   1036: ifle -> 1098
/*     */     //   1039: ifne -> 1096
/*     */     //   1042: goto -> 1055
/*     */     //   1045: ldc2_w -2937823851134204402
/*     */     //   1048: lload_1
/*     */     //   1049: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1054: athrow
/*     */     //   1055: ifeq -> 1081
/*     */     //   1058: goto -> 1071
/*     */     //   1061: ldc2_w -2937823851134204402
/*     */     //   1064: lload_1
/*     */     //   1065: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1070: athrow
/*     */     //   1071: fload #16
/*     */     //   1073: f2d
/*     */     //   1074: ldc2_w 1.300000011920929
/*     */     //   1077: ddiv
/*     */     //   1078: d2f
/*     */     //   1079: fstore #16
/*     */     //   1081: aload_0
/*     */     //   1082: getfield h : F
/*     */     //   1085: fload #16
/*     */     //   1087: fsub
/*     */     //   1088: invokestatic abs : (F)F
/*     */     //   1091: f2d
/*     */     //   1092: ldc2_w 0.001
/*     */     //   1095: dcmpl
/*     */     //   1096: iload #8
/*     */     //   1098: ifne -> 1187
/*     */     //   1101: ifle -> 1162
/*     */     //   1104: goto -> 1117
/*     */     //   1107: ldc2_w -2937823851134204402
/*     */     //   1110: lload_1
/*     */     //   1111: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1116: athrow
/*     */     //   1117: aload_0
/*     */     //   1118: getfield n : Ljava/util/concurrent/atomic/AtomicInteger;
/*     */     //   1121: iconst_5
/*     */     //   1122: invokevirtual set : (I)V
/*     */     //   1125: aload_0
/*     */     //   1126: aload_0
/*     */     //   1127: getfield h : F
/*     */     //   1130: fload #16
/*     */     //   1132: invokestatic max : (FF)F
/*     */     //   1135: putfield E : F
/*     */     //   1138: lload_1
/*     */     //   1139: lconst_0
/*     */     //   1140: lcmp
/*     */     //   1141: ifle -> 1206
/*     */     //   1144: iload #8
/*     */     //   1146: ifeq -> 1188
/*     */     //   1149: goto -> 1162
/*     */     //   1152: ldc2_w -2937823851134204402
/*     */     //   1155: lload_1
/*     */     //   1156: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1161: athrow
/*     */     //   1162: aload_0
/*     */     //   1163: getfield n : Ljava/util/concurrent/atomic/AtomicInteger;
/*     */     //   1166: <illegal opcode> applyAsInt : ()Ljava/util/function/IntUnaryOperator;
/*     */     //   1171: invokevirtual updateAndGet : (Ljava/util/function/IntUnaryOperator;)I
/*     */     //   1174: goto -> 1187
/*     */     //   1177: ldc2_w -2937823851134204402
/*     */     //   1180: lload_1
/*     */     //   1181: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1186: athrow
/*     */     //   1187: pop
/*     */     //   1188: aload_0
/*     */     //   1189: fload #16
/*     */     //   1191: putfield h : F
/*     */     //   1194: aload_0
/*     */     //   1195: aload_3
/*     */     //   1196: invokeinterface getFlySpeed : ()F
/*     */     //   1201: fconst_2
/*     */     //   1202: fdiv
/*     */     //   1203: putfield M : F
/*     */     //   1206: goto -> 1382
/*     */     //   1209: getstatic me/konsolas/aac/cG.a : [I
/*     */     //   1212: aload_0
/*     */     //   1213: getfield I : Lorg/bukkit/entity/EntityType;
/*     */     //   1216: invokevirtual ordinal : ()I
/*     */     //   1219: iaload
/*     */     //   1220: tableswitch default -> 1297, 1 -> 1264, 2 -> 1281, 3 -> 1289, 4 -> 1289, 5 -> 1289, 6 -> 1289, 7 -> 1289
/*     */     //   1264: aload #9
/*     */     //   1266: checkcast org/bukkit/entity/Player
/*     */     //   1269: invokeinterface getWalkSpeed : ()F
/*     */     //   1274: fconst_2
/*     */     //   1275: fdiv
/*     */     //   1276: fstore #16
/*     */     //   1278: goto -> 1300
/*     */     //   1281: ldc_w 0.25
/*     */     //   1284: fstore #16
/*     */     //   1286: goto -> 1300
/*     */     //   1289: ldc_w 0.3375
/*     */     //   1292: fstore #16
/*     */     //   1294: goto -> 1300
/*     */     //   1297: fconst_0
/*     */     //   1298: fstore #16
/*     */     //   1300: iload #10
/*     */     //   1302: iload #8
/*     */     //   1304: ifne -> 1343
/*     */     //   1307: iflt -> 1341
/*     */     //   1310: goto -> 1323
/*     */     //   1313: ldc2_w -2937823851134204402
/*     */     //   1316: lload_1
/*     */     //   1317: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1322: athrow
/*     */     //   1323: fload #16
/*     */     //   1325: f2d
/*     */     //   1326: dconst_1
/*     */     //   1327: ldc2_w 0.2
/*     */     //   1330: iload #10
/*     */     //   1332: iconst_1
/*     */     //   1333: iadd
/*     */     //   1334: i2d
/*     */     //   1335: dmul
/*     */     //   1336: dadd
/*     */     //   1337: dmul
/*     */     //   1338: d2f
/*     */     //   1339: fstore #16
/*     */     //   1341: iload #11
/*     */     //   1343: iflt -> 1364
/*     */     //   1346: fload #16
/*     */     //   1348: f2d
/*     */     //   1349: dconst_1
/*     */     //   1350: ldc2_w 0.15
/*     */     //   1353: iload #11
/*     */     //   1355: iconst_1
/*     */     //   1356: iadd
/*     */     //   1357: i2d
/*     */     //   1358: dmul
/*     */     //   1359: dsub
/*     */     //   1360: dmul
/*     */     //   1361: d2f
/*     */     //   1362: fstore #16
/*     */     //   1364: aload_0
/*     */     //   1365: fload #16
/*     */     //   1367: putfield h : F
/*     */     //   1370: aload_0
/*     */     //   1371: aload_3
/*     */     //   1372: invokeinterface getFlySpeed : ()F
/*     */     //   1377: fconst_2
/*     */     //   1378: fdiv
/*     */     //   1379: putfield M : F
/*     */     //   1382: lload_1
/*     */     //   1383: lconst_0
/*     */     //   1384: lcmp
/*     */     //   1385: iflt -> 1478
/*     */     //   1388: getstatic me/konsolas/aac/cG.a : [I
/*     */     //   1391: aload_0
/*     */     //   1392: getfield I : Lorg/bukkit/entity/EntityType;
/*     */     //   1395: invokevirtual ordinal : ()I
/*     */     //   1398: iaload
/*     */     //   1399: tableswitch default -> 1473, 1 -> 1444, 2 -> 1444, 3 -> 1444, 4 -> 1444, 5 -> 1444, 6 -> 1444, 7 -> 1444, 8 -> 1444
/*     */     //   1444: aload_0
/*     */     //   1445: iconst_0
/*     */     //   1446: putfield a : Z
/*     */     //   1449: iload #8
/*     */     //   1451: lload_1
/*     */     //   1452: lconst_0
/*     */     //   1453: lcmp
/*     */     //   1454: ifle -> 1508
/*     */     //   1457: ifeq -> 1491
/*     */     //   1460: goto -> 1473
/*     */     //   1463: ldc2_w -2937823851134204402
/*     */     //   1466: lload_1
/*     */     //   1467: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1472: athrow
/*     */     //   1473: aload_0
/*     */     //   1474: iconst_1
/*     */     //   1475: putfield a : Z
/*     */     //   1478: goto -> 1491
/*     */     //   1481: ldc2_w -2937823851134204402
/*     */     //   1484: lload_1
/*     */     //   1485: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1490: athrow
/*     */     //   1491: lload_1
/*     */     //   1492: lconst_0
/*     */     //   1493: lcmp
/*     */     //   1494: ifle -> 1846
/*     */     //   1497: getstatic me/konsolas/aac/cG.a : [I
/*     */     //   1500: aload_0
/*     */     //   1501: getfield I : Lorg/bukkit/entity/EntityType;
/*     */     //   1504: invokevirtual ordinal : ()I
/*     */     //   1507: iaload
/*     */     //   1508: tableswitch default -> 1841, 1 -> 1560, 2 -> 1560, 3 -> 1591, 4 -> 1629, 5 -> 1667, 6 -> 1705, 7 -> 1743, 8 -> 1810, 9 -> 1781
/*     */     //   1560: aload_0
/*     */     //   1561: ldc2_w 0.41999998688697815
/*     */     //   1564: putfield J : D
/*     */     //   1567: iload #8
/*     */     //   1569: lload_1
/*     */     //   1570: lconst_0
/*     */     //   1571: lcmp
/*     */     //   1572: ifle -> 1870
/*     */     //   1575: ifeq -> 1859
/*     */     //   1578: goto -> 1591
/*     */     //   1581: ldc2_w -2937823851134204402
/*     */     //   1584: lload_1
/*     */     //   1585: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1590: athrow
/*     */     //   1591: aload_0
/*     */     //   1592: aload #9
/*     */     //   1594: checkcast org/bukkit/entity/Horse
/*     */     //   1597: invokeinterface getJumpStrength : ()D
/*     */     //   1602: putfield J : D
/*     */     //   1605: iload #8
/*     */     //   1607: lload_1
/*     */     //   1608: lconst_0
/*     */     //   1609: lcmp
/*     */     //   1610: ifle -> 1870
/*     */     //   1613: ifeq -> 1859
/*     */     //   1616: goto -> 1629
/*     */     //   1619: ldc2_w -2937823851134204402
/*     */     //   1622: lload_1
/*     */     //   1623: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1628: athrow
/*     */     //   1629: aload_0
/*     */     //   1630: aload #9
/*     */     //   1632: checkcast org/bukkit/entity/SkeletonHorse
/*     */     //   1635: invokeinterface getJumpStrength : ()D
/*     */     //   1640: putfield J : D
/*     */     //   1643: iload #8
/*     */     //   1645: lload_1
/*     */     //   1646: lconst_0
/*     */     //   1647: lcmp
/*     */     //   1648: ifle -> 1870
/*     */     //   1651: ifeq -> 1859
/*     */     //   1654: goto -> 1667
/*     */     //   1657: ldc2_w -2937823851134204402
/*     */     //   1660: lload_1
/*     */     //   1661: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1666: athrow
/*     */     //   1667: aload_0
/*     */     //   1668: aload #9
/*     */     //   1670: checkcast org/bukkit/entity/Donkey
/*     */     //   1673: invokeinterface getJumpStrength : ()D
/*     */     //   1678: putfield J : D
/*     */     //   1681: iload #8
/*     */     //   1683: lload_1
/*     */     //   1684: lconst_0
/*     */     //   1685: lcmp
/*     */     //   1686: iflt -> 1870
/*     */     //   1689: ifeq -> 1859
/*     */     //   1692: goto -> 1705
/*     */     //   1695: ldc2_w -2937823851134204402
/*     */     //   1698: lload_1
/*     */     //   1699: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1704: athrow
/*     */     //   1705: aload_0
/*     */     //   1706: aload #9
/*     */     //   1708: checkcast org/bukkit/entity/Mule
/*     */     //   1711: invokeinterface getJumpStrength : ()D
/*     */     //   1716: putfield J : D
/*     */     //   1719: iload #8
/*     */     //   1721: lload_1
/*     */     //   1722: lconst_0
/*     */     //   1723: lcmp
/*     */     //   1724: ifle -> 1870
/*     */     //   1727: ifeq -> 1859
/*     */     //   1730: goto -> 1743
/*     */     //   1733: ldc2_w -2937823851134204402
/*     */     //   1736: lload_1
/*     */     //   1737: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1742: athrow
/*     */     //   1743: aload_0
/*     */     //   1744: aload #9
/*     */     //   1746: checkcast org/bukkit/entity/Llama
/*     */     //   1749: invokeinterface getJumpStrength : ()D
/*     */     //   1754: putfield J : D
/*     */     //   1757: iload #8
/*     */     //   1759: lload_1
/*     */     //   1760: lconst_0
/*     */     //   1761: lcmp
/*     */     //   1762: ifle -> 1870
/*     */     //   1765: ifeq -> 1859
/*     */     //   1768: goto -> 1781
/*     */     //   1771: ldc2_w -2937823851134204402
/*     */     //   1774: lload_1
/*     */     //   1775: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1780: athrow
/*     */     //   1781: aload_0
/*     */     //   1782: dconst_0
/*     */     //   1783: putfield J : D
/*     */     //   1786: iload #8
/*     */     //   1788: lload_1
/*     */     //   1789: lconst_0
/*     */     //   1790: lcmp
/*     */     //   1791: ifle -> 1870
/*     */     //   1794: ifeq -> 1859
/*     */     //   1797: goto -> 1810
/*     */     //   1800: ldc2_w -2937823851134204402
/*     */     //   1803: lload_1
/*     */     //   1804: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1809: athrow
/*     */     //   1810: aload_0
/*     */     //   1811: ldc2_w 0.41999998688697815
/*     */     //   1814: putfield J : D
/*     */     //   1817: iload #8
/*     */     //   1819: lload_1
/*     */     //   1820: lconst_0
/*     */     //   1821: lcmp
/*     */     //   1822: iflt -> 1870
/*     */     //   1825: ifeq -> 1859
/*     */     //   1828: goto -> 1841
/*     */     //   1831: ldc2_w -2937823851134204402
/*     */     //   1834: lload_1
/*     */     //   1835: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1840: athrow
/*     */     //   1841: aload_0
/*     */     //   1842: dconst_0
/*     */     //   1843: putfield J : D
/*     */     //   1846: goto -> 1859
/*     */     //   1849: ldc2_w -2937823851134204402
/*     */     //   1852: lload_1
/*     */     //   1853: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1858: athrow
/*     */     //   1859: getstatic me/konsolas/aac/cG.a : [I
/*     */     //   1862: aload_0
/*     */     //   1863: getfield I : Lorg/bukkit/entity/EntityType;
/*     */     //   1866: invokevirtual ordinal : ()I
/*     */     //   1869: iaload
/*     */     //   1870: lload_1
/*     */     //   1871: lconst_0
/*     */     //   1872: lcmp
/*     */     //   1873: iflt -> 1943
/*     */     //   1876: tableswitch default -> 2035, 1 -> 1928, 2 -> 1959, 3 -> 1959, 4 -> 1959, 5 -> 1959, 6 -> 1959, 7 -> 1959, 8 -> 2017, 9 -> 1988
/*     */     //   1928: aload_0
/*     */     //   1929: ldc2_w 0.6
/*     */     //   1932: putfield u : D
/*     */     //   1935: lload_1
/*     */     //   1936: lconst_0
/*     */     //   1937: lcmp
/*     */     //   1938: iflt -> 2040
/*     */     //   1941: iload #8
/*     */     //   1943: ifeq -> 2040
/*     */     //   1946: goto -> 1959
/*     */     //   1949: ldc2_w -2937823851134204402
/*     */     //   1952: lload_1
/*     */     //   1953: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1958: athrow
/*     */     //   1959: aload_0
/*     */     //   1960: dconst_1
/*     */     //   1961: putfield u : D
/*     */     //   1964: lload_1
/*     */     //   1965: lconst_0
/*     */     //   1966: lcmp
/*     */     //   1967: iflt -> 2040
/*     */     //   1970: iload #8
/*     */     //   1972: ifeq -> 2040
/*     */     //   1975: goto -> 1988
/*     */     //   1978: ldc2_w -2937823851134204402
/*     */     //   1981: lload_1
/*     */     //   1982: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1987: athrow
/*     */     //   1988: aload_0
/*     */     //   1989: dconst_0
/*     */     //   1990: putfield u : D
/*     */     //   1993: lload_1
/*     */     //   1994: lconst_0
/*     */     //   1995: lcmp
/*     */     //   1996: ifle -> 2040
/*     */     //   1999: iload #8
/*     */     //   2001: ifeq -> 2040
/*     */     //   2004: goto -> 2017
/*     */     //   2007: ldc2_w -2937823851134204402
/*     */     //   2010: lload_1
/*     */     //   2011: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2016: athrow
/*     */     //   2017: aload_0
/*     */     //   2018: dconst_1
/*     */     //   2019: putfield u : D
/*     */     //   2022: goto -> 2035
/*     */     //   2025: ldc2_w -2937823851134204402
/*     */     //   2028: lload_1
/*     */     //   2029: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2034: athrow
/*     */     //   2035: aload_0
/*     */     //   2036: dconst_0
/*     */     //   2037: putfield u : D
/*     */     //   2040: aload #9
/*     */     //   2042: iload #8
/*     */     //   2044: ifne -> 2081
/*     */     //   2047: instanceof org/bukkit/entity/Player
/*     */     //   2050: ifeq -> 2304
/*     */     //   2053: goto -> 2066
/*     */     //   2056: ldc2_w -2937823851134204402
/*     */     //   2059: lload_1
/*     */     //   2060: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2065: athrow
/*     */     //   2066: aload #9
/*     */     //   2068: goto -> 2081
/*     */     //   2071: ldc2_w -2937823851134204402
/*     */     //   2074: lload_1
/*     */     //   2075: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2080: athrow
/*     */     //   2081: checkcast org/bukkit/entity/Player
/*     */     //   2084: invokeinterface getInventory : ()Lorg/bukkit/inventory/PlayerInventory;
/*     */     //   2089: invokeinterface getBoots : ()Lorg/bukkit/inventory/ItemStack;
/*     */     //   2094: astore #16
/*     */     //   2096: aload #9
/*     */     //   2098: checkcast org/bukkit/entity/Player
/*     */     //   2101: invokeinterface getInventory : ()Lorg/bukkit/inventory/PlayerInventory;
/*     */     //   2106: invokeinterface getChestplate : ()Lorg/bukkit/inventory/ItemStack;
/*     */     //   2111: astore #17
/*     */     //   2113: aload_0
/*     */     //   2114: aload #16
/*     */     //   2116: iload #8
/*     */     //   2118: ifne -> 2139
/*     */     //   2121: ifnull -> 2148
/*     */     //   2124: goto -> 2137
/*     */     //   2127: ldc2_w -2937823851134204402
/*     */     //   2130: lload_1
/*     */     //   2131: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2136: athrow
/*     */     //   2137: aload #16
/*     */     //   2139: getstatic org/bukkit/enchantments/Enchantment.DEPTH_STRIDER : Lorg/bukkit/enchantments/Enchantment;
/*     */     //   2142: invokevirtual getEnchantmentLevel : (Lorg/bukkit/enchantments/Enchantment;)I
/*     */     //   2145: goto -> 2149
/*     */     //   2148: iconst_0
/*     */     //   2149: putfield v : I
/*     */     //   2152: aload_0
/*     */     //   2153: invokestatic a : ()Lme/konsolas/aac/kP;
/*     */     //   2156: lload #4
/*     */     //   2158: getstatic me/konsolas/aac/kP.V1_16 : Lme/konsolas/aac/kP;
/*     */     //   2161: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*     */     //   2164: ifeq -> 2214
/*     */     //   2167: aload #16
/*     */     //   2169: iload #8
/*     */     //   2171: ifne -> 2205
/*     */     //   2174: goto -> 2187
/*     */     //   2177: ldc2_w -2937823851134204402
/*     */     //   2180: lload_1
/*     */     //   2181: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2186: athrow
/*     */     //   2187: ifnull -> 2214
/*     */     //   2190: goto -> 2203
/*     */     //   2193: ldc2_w -2937823851134204402
/*     */     //   2196: lload_1
/*     */     //   2197: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2202: athrow
/*     */     //   2203: aload #16
/*     */     //   2205: getstatic org/bukkit/enchantments/Enchantment.SOUL_SPEED : Lorg/bukkit/enchantments/Enchantment;
/*     */     //   2208: invokevirtual getEnchantmentLevel : (Lorg/bukkit/enchantments/Enchantment;)I
/*     */     //   2211: goto -> 2215
/*     */     //   2214: iconst_0
/*     */     //   2215: putfield f : I
/*     */     //   2218: aload_0
/*     */     //   2219: invokestatic a : ()Lme/konsolas/aac/kP;
/*     */     //   2222: lload #4
/*     */     //   2224: getstatic me/konsolas/aac/kP.V1_9 : Lme/konsolas/aac/kP;
/*     */     //   2227: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*     */     //   2230: ifeq -> 2300
/*     */     //   2233: aload #17
/*     */     //   2235: lload_1
/*     */     //   2236: lconst_0
/*     */     //   2237: lcmp
/*     */     //   2238: iflt -> 2277
/*     */     //   2241: iload #8
/*     */     //   2243: ifne -> 2277
/*     */     //   2246: goto -> 2259
/*     */     //   2249: ldc2_w -2937823851134204402
/*     */     //   2252: lload_1
/*     */     //   2253: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2258: athrow
/*     */     //   2259: ifnull -> 2300
/*     */     //   2262: goto -> 2275
/*     */     //   2265: ldc2_w -2937823851134204402
/*     */     //   2268: lload_1
/*     */     //   2269: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2274: athrow
/*     */     //   2275: aload #17
/*     */     //   2277: invokevirtual getType : ()Lorg/bukkit/Material;
/*     */     //   2280: getstatic org/bukkit/Material.ELYTRA : Lorg/bukkit/Material;
/*     */     //   2283: if_acmpne -> 2300
/*     */     //   2286: iconst_1
/*     */     //   2287: goto -> 2301
/*     */     //   2290: ldc2_w -2937823851134204402
/*     */     //   2293: lload_1
/*     */     //   2294: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2299: athrow
/*     */     //   2300: iconst_0
/*     */     //   2301: putfield m : Z
/*     */     //   2304: aload_0
/*     */     //   2305: aload_3
/*     */     //   2306: invokeinterface getEyeHeight : ()D
/*     */     //   2311: putfield G : D
/*     */     //   2314: lload_1
/*     */     //   2315: lconst_0
/*     */     //   2316: lcmp
/*     */     //   2317: ifle -> 2346
/*     */     //   2320: ldc2_w -2959912837499612593
/*     */     //   2323: lload_1
/*     */     //   2324: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*     */     //   2329: ifnull -> 2359
/*     */     //   2332: iinc #8, 1
/*     */     //   2335: iload #8
/*     */     //   2337: ldc2_w -2940159349257035078
/*     */     //   2340: lload_1
/*     */     //   2341: <illegal opcode> w : (IJJ)V
/*     */     //   2346: goto -> 2359
/*     */     //   2349: ldc2_w -2937823851134204402
/*     */     //   2352: lload_1
/*     */     //   2353: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2358: athrow
/*     */     //   2359: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #26	-> 31
/*     */     //   #144	-> 36
/*     */     //   #78	-> 96
/*     */     //   #27	-> 120
/*     */     //   #160	-> 144
/*     */     //   #54	-> 174
/*     */     //   #179	-> 184
/*     */     //   #57	-> 193
/*     */     //   #207	-> 247
/*     */     //   #123	-> 258
/*     */     //   #74	-> 269
/*     */     //   #125	-> 287
/*     */     //   #71	-> 298
/*     */     //   #86	-> 309
/*     */     //   #70	-> 312
/*     */     //   #169	-> 315
/*     */     //   #6	-> 318
/*     */     //   #134	-> 321
/*     */     //   #213	-> 324
/*     */     //   #194	-> 327
/*     */     //   #218	-> 363
/*     */     //   #206	-> 425
/*     */     //   #92	-> 443
/*     */     //   #45	-> 494
/*     */     //   #65	-> 512
/*     */     //   #164	-> 563
/*     */     //   #36	-> 581
/*     */     //   #199	-> 628
/*     */     //   #175	-> 677
/*     */     //   #136	-> 695
/*     */     //   #81	-> 742
/*     */     //   #10	-> 791
/*     */     //   #2	-> 805
/*     */     //   #107	-> 858
/*     */     //   #205	-> 901
/*     */     //   #152	-> 904
/*     */     //   #208	-> 909
/*     */     //   #132	-> 915
/*     */     //   #28	-> 921
/*     */     //   #221	-> 927
/*     */     //   #94	-> 933
/*     */     //   #159	-> 971
/*     */     //   #85	-> 976
/*     */     //   #11	-> 995
/*     */     //   #40	-> 1081
/*     */     //   #59	-> 1117
/*     */     //   #200	-> 1125
/*     */     //   #201	-> 1162
/*     */     //   #77	-> 1188
/*     */     //   #41	-> 1194
/*     */     //   #3	-> 1206
/*     */     //   #142	-> 1209
/*     */     //   #214	-> 1264
/*     */     //   #82	-> 1278
/*     */     //   #18	-> 1281
/*     */     //   #24	-> 1286
/*     */     //   #181	-> 1289
/*     */     //   #215	-> 1294
/*     */     //   #157	-> 1297
/*     */     //   #67	-> 1300
/*     */     //   #68	-> 1323
/*     */     //   #50	-> 1341
/*     */     //   #211	-> 1346
/*     */     //   #180	-> 1364
/*     */     //   #162	-> 1370
/*     */     //   #95	-> 1382
/*     */     //   #104	-> 1444
/*     */     //   #148	-> 1449
/*     */     //   #12	-> 1473
/*     */     //   #99	-> 1491
/*     */     //   #25	-> 1560
/*     */     //   #187	-> 1567
/*     */     //   #195	-> 1591
/*     */     //   #56	-> 1605
/*     */     //   #51	-> 1629
/*     */     //   #191	-> 1643
/*     */     //   #1	-> 1667
/*     */     //   #184	-> 1681
/*     */     //   #118	-> 1705
/*     */     //   #173	-> 1719
/*     */     //   #151	-> 1743
/*     */     //   #183	-> 1757
/*     */     //   #204	-> 1781
/*     */     //   #189	-> 1786
/*     */     //   #93	-> 1810
/*     */     //   #172	-> 1817
/*     */     //   #63	-> 1841
/*     */     //   #66	-> 1859
/*     */     //   #130	-> 1928
/*     */     //   #113	-> 1935
/*     */     //   #212	-> 1959
/*     */     //   #102	-> 1964
/*     */     //   #61	-> 1988
/*     */     //   #35	-> 1993
/*     */     //   #128	-> 2017
/*     */     //   #47	-> 2035
/*     */     //   #210	-> 2040
/*     */     //   #196	-> 2066
/*     */     //   #137	-> 2096
/*     */     //   #158	-> 2113
/*     */     //   #203	-> 2152
/*     */     //   #49	-> 2203
/*     */     //   #168	-> 2218
/*     */     //   #129	-> 2277
/*     */     //   #87	-> 2304
/*     */     //   #17	-> 2314
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   67	77	86	aacinternal/v
/*     */     //   96	107	110	aacinternal/v
/*     */     //   103	131	134	aacinternal/v
/*     */     //   144	161	164	aacinternal/v
/*     */     //   212	228	237	aacinternal/v
/*     */     //   258	270	273	aacinternal/v
/*     */     //   363	396	399	aacinternal/v
/*     */     //   385	412	415	aacinternal/v
/*     */     //   432	454	457	aacinternal/v
/*     */     //   467	481	484	aacinternal/v
/*     */     //   501	523	526	aacinternal/v
/*     */     //   536	550	553	aacinternal/v
/*     */     //   570	592	595	aacinternal/v
/*     */     //   605	613	616	aacinternal/v
/*     */     //   610	648	651	aacinternal/v
/*     */     //   626	664	667	aacinternal/v
/*     */     //   684	706	709	aacinternal/v
/*     */     //   719	727	730	aacinternal/v
/*     */     //   724	762	765	aacinternal/v
/*     */     //   740	778	781	aacinternal/v
/*     */     //   794	816	819	aacinternal/v
/*     */     //   829	843	846	aacinternal/v
/*     */     //   840	867	870	aacinternal/v
/*     */     //   880	888	891	aacinternal/v
/*     */     //   950	958	961	aacinternal/v
/*     */     //   995	1008	1011	aacinternal/v
/*     */     //   1005	1042	1045	aacinternal/v
/*     */     //   1021	1058	1061	aacinternal/v
/*     */     //   1096	1104	1107	aacinternal/v
/*     */     //   1101	1149	1152	aacinternal/v
/*     */     //   1117	1174	1177	aacinternal/v
/*     */     //   1300	1310	1313	aacinternal/v
/*     */     //   1382	1460	1463	aacinternal/v
/*     */     //   1444	1478	1481	aacinternal/v
/*     */     //   1491	1578	1581	aacinternal/v
/*     */     //   1560	1616	1619	aacinternal/v
/*     */     //   1591	1654	1657	aacinternal/v
/*     */     //   1629	1692	1695	aacinternal/v
/*     */     //   1667	1730	1733	aacinternal/v
/*     */     //   1705	1768	1771	aacinternal/v
/*     */     //   1743	1797	1800	aacinternal/v
/*     */     //   1781	1828	1831	aacinternal/v
/*     */     //   1810	1846	1849	aacinternal/v
/*     */     //   1859	1946	1949	aacinternal/v
/*     */     //   1928	1975	1978	aacinternal/v
/*     */     //   1959	2004	2007	aacinternal/v
/*     */     //   1988	2022	2025	aacinternal/v
/*     */     //   2040	2053	2056	aacinternal/v
/*     */     //   2047	2068	2071	aacinternal/v
/*     */     //   2113	2124	2127	aacinternal/v
/*     */     //   2149	2174	2177	aacinternal/v
/*     */     //   2167	2190	2193	aacinternal/v
/*     */     //   2215	2246	2249	aacinternal/v
/*     */     //   2233	2262	2265	aacinternal/v
/*     */     //   2277	2290	2290	aacinternal/v
/*     */     //   2304	2346	2349	aacinternal/v
/*     */   }
/*     */   
/*     */   public boolean i() {
/*  29 */     return this.m;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(int paramInt) {
/*  34 */     this.d.updateAndGet(paramInt2 -> Math.max(paramInt2, paramInt1));
/*     */   }
/*     */   public double b() {
/*  37 */     return this.s;
/*     */   } public boolean d() {
/*  39 */     return this.k;
/*     */   }
/*     */   
/*     */   public EntityType b() {
/*  43 */     return this.y; } public double d() {
/*  44 */     return this.G;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LivingEntity a() {
/*  58 */     return this.r;
/*     */   }
/*     */   
/*     */   public int a() {
/*  62 */     return this.v;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {
/*  76 */     this.n.set(0);
/*     */   } public boolean a(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/k7.O : J
/*     */     //   3: lload_1
/*     */     //   4: lxor
/*     */     //   5: lstore_1
/*     */     //   6: ldc2_w -3824049973309438741
/*     */     //   9: lload_1
/*     */     //   10: <illegal opcode> w : (JJ)I
/*     */     //   15: istore #9
/*     */     //   17: dload_3
/*     */     //   18: dload #7
/*     */     //   20: dadd
/*     */     //   21: aload_0
/*     */     //   22: getfield e : D
/*     */     //   25: dcmpl
/*     */     //   26: iload #9
/*     */     //   28: ifne -> 179
/*     */     //   31: ifgt -> 178
/*     */     //   34: goto -> 47
/*     */     //   37: ldc2_w -3803386872720795133
/*     */     //   40: lload_1
/*     */     //   41: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   46: athrow
/*     */     //   47: dload_3
/*     */     //   48: dload #7
/*     */     //   50: dsub
/*     */     //   51: aload_0
/*     */     //   52: getfield C : D
/*     */     //   55: dcmpg
/*     */     //   56: iload #9
/*     */     //   58: ifne -> 179
/*     */     //   61: goto -> 74
/*     */     //   64: ldc2_w -3803386872720795133
/*     */     //   67: lload_1
/*     */     //   68: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   73: athrow
/*     */     //   74: iflt -> 178
/*     */     //   77: goto -> 90
/*     */     //   80: ldc2_w -3803386872720795133
/*     */     //   83: lload_1
/*     */     //   84: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   89: athrow
/*     */     //   90: dload #5
/*     */     //   92: dload #7
/*     */     //   94: dadd
/*     */     //   95: aload_0
/*     */     //   96: getfield K : D
/*     */     //   99: dcmpl
/*     */     //   100: iload #9
/*     */     //   102: ifne -> 179
/*     */     //   105: goto -> 118
/*     */     //   108: ldc2_w -3803386872720795133
/*     */     //   111: lload_1
/*     */     //   112: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   117: athrow
/*     */     //   118: ifgt -> 178
/*     */     //   121: goto -> 134
/*     */     //   124: ldc2_w -3803386872720795133
/*     */     //   127: lload_1
/*     */     //   128: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   133: athrow
/*     */     //   134: dload #5
/*     */     //   136: dload #7
/*     */     //   138: dsub
/*     */     //   139: aload_0
/*     */     //   140: getfield H : D
/*     */     //   143: dcmpg
/*     */     //   144: iload #9
/*     */     //   146: ifne -> 179
/*     */     //   149: goto -> 162
/*     */     //   152: ldc2_w -3803386872720795133
/*     */     //   155: lload_1
/*     */     //   156: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   161: athrow
/*     */     //   162: ifge -> 182
/*     */     //   165: goto -> 178
/*     */     //   168: ldc2_w -3803386872720795133
/*     */     //   171: lload_1
/*     */     //   172: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   177: athrow
/*     */     //   178: iconst_1
/*     */     //   179: goto -> 183
/*     */     //   182: iconst_0
/*     */     //   183: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #79	-> 17
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   17	34	37	aacinternal/v
/*     */     //   31	61	64	aacinternal/v
/*     */     //   47	77	80	aacinternal/v
/*     */     //   74	105	108	aacinternal/v
/*     */     //   90	121	124	aacinternal/v
/*     */     //   118	149	152	aacinternal/v
/*     */     //   134	165	168	aacinternal/v
/*     */   } public EntityType c() {
/*  80 */     return this.I;
/*     */   }
/*     */   
/*  83 */   public boolean h() { return this.i; } public int b() {
/*  84 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*  88 */   private eo B = eo.c;
/*  89 */   private final AtomicInteger l = new AtomicInteger();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float b() {
/* 101 */     return this.E;
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 105 */     return this.F; } public boolean e(long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/k7.O : J
/*     */     //   3: lload_1
/*     */     //   4: lxor
/*     */     //   5: lstore_1
/*     */     //   6: ldc2_w 8137753553792419035
/*     */     //   9: lload_1
/*     */     //   10: <illegal opcode> w : (JJ)I
/*     */     //   15: istore_3
/*     */     //   16: aload_0
/*     */     //   17: getfield n : Ljava/util/concurrent/atomic/AtomicInteger;
/*     */     //   20: invokevirtual get : ()I
/*     */     //   23: iload_3
/*     */     //   24: ifeq -> 44
/*     */     //   27: ifle -> 47
/*     */     //   30: goto -> 43
/*     */     //   33: ldc2_w 8177052677370896462
/*     */     //   36: lload_1
/*     */     //   37: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   42: athrow
/*     */     //   43: iconst_1
/*     */     //   44: goto -> 48
/*     */     //   47: iconst_0
/*     */     //   48: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #106	-> 16
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   16	30	33	aacinternal/v
/*     */   } public Boolean a(long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/k7.O : J
/*     */     //   3: lload_1
/*     */     //   4: lxor
/*     */     //   5: lstore_1
/*     */     //   6: ldc2_w 111017270179149246
/*     */     //   9: lload_1
/*     */     //   10: <illegal opcode> w : (JJ)I
/*     */     //   15: istore_3
/*     */     //   16: aload_0
/*     */     //   17: getfield D : Ljava/util/concurrent/atomic/AtomicInteger;
/*     */     //   20: invokevirtual get : ()I
/*     */     //   23: iload_3
/*     */     //   24: ifeq -> 59
/*     */     //   27: ifle -> 55
/*     */     //   30: goto -> 43
/*     */     //   33: ldc2_w 8945857388286251
/*     */     //   36: lload_1
/*     */     //   37: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   42: athrow
/*     */     //   43: aconst_null
/*     */     //   44: areturn
/*     */     //   45: ldc2_w 8945857388286251
/*     */     //   48: lload_1
/*     */     //   49: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   54: athrow
/*     */     //   55: aload_0
/*     */     //   56: getfield g : Z
/*     */     //   59: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   62: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #109	-> 16
/*     */     //   #75	-> 55
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   16	30	33	aacinternal/v
/*     */     //   27	45	45	aacinternal/v
/*     */   } public boolean j() {
/* 110 */     return this.w;
/* 111 */   } private final AtomicInteger n = new AtomicInteger();
/*     */   
/*     */   public void a(int paramInt, boolean paramBoolean) {
/* 114 */     this.q.updateAndGet(paramInt2 -> Math.max(paramInt2, paramInt1));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 131 */     this.b = paramBoolean;
/*     */   } public void a(int paramInt) {
/*     */     this.l.updateAndGet(paramInt2 -> Math.max(paramInt2, paramInt1));
/*     */   }
/*     */   public int d() {
/*     */     return this.z;
/*     */   }
/*     */   public void d() {
/* 139 */     this.o.get();
/*     */   } private final AtomicInteger d = new AtomicInteger(); public boolean g() {
/*     */     return this.t;
/*     */   }
/*     */   public Boolean b(long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/k7.O : J
/*     */     //   3: lload_1
/*     */     //   4: lxor
/*     */     //   5: lstore_1
/*     */     //   6: ldc2_w 980145381709595551
/*     */     //   9: lload_1
/*     */     //   10: <illegal opcode> w : (JJ)I
/*     */     //   15: istore_3
/*     */     //   16: aload_0
/*     */     //   17: getfield d : Ljava/util/concurrent/atomic/AtomicInteger;
/*     */     //   20: invokevirtual get : ()I
/*     */     //   23: iload_3
/*     */     //   24: ifne -> 59
/*     */     //   27: ifle -> 55
/*     */     //   30: goto -> 43
/*     */     //   33: ldc2_w 883747920301596023
/*     */     //   36: lload_1
/*     */     //   37: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   42: athrow
/*     */     //   43: aconst_null
/*     */     //   44: areturn
/*     */     //   45: ldc2_w 883747920301596023
/*     */     //   48: lload_1
/*     */     //   49: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   54: athrow
/*     */     //   55: aload_0
/*     */     //   56: getfield N : Z
/*     */     //   59: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   62: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #138	-> 16
/*     */     //   #30	-> 55
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   16	30	33	aacinternal/v
/*     */     //   27	45	45	aacinternal/v
/*     */   }
/*     */   public void a() {
/* 147 */     this.D.set(0);
/*     */   }
/*     */   public float a() {
/* 150 */     return this.M;
/*     */   }
/*     */   
/*     */   public void b(int paramInt) {
/* 154 */     this.D.updateAndGet(paramInt2 -> Math.max(paramInt2, paramInt1));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(Player paramPlayer, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/k7.O : J
/*     */     //   3: lload_2
/*     */     //   4: lxor
/*     */     //   5: lstore_2
/*     */     //   6: lload_2
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 23550334652180
/*     */     //   11: lxor
/*     */     //   12: dup2
/*     */     //   13: bipush #16
/*     */     //   15: lushr
/*     */     //   16: lstore #4
/*     */     //   18: dup2
/*     */     //   19: bipush #48
/*     */     //   21: lshl
/*     */     //   22: bipush #48
/*     */     //   24: lushr
/*     */     //   25: l2i
/*     */     //   26: istore #6
/*     */     //   28: pop2
/*     */     //   29: dup2
/*     */     //   30: ldc2_w 97987176007034
/*     */     //   33: lxor
/*     */     //   34: lstore #7
/*     */     //   36: pop2
/*     */     //   37: ldc2_w 221242913108544791
/*     */     //   40: lload_2
/*     */     //   41: <illegal opcode> w : (JJ)I
/*     */     //   46: iconst_0
/*     */     //   47: istore #10
/*     */     //   49: iconst_0
/*     */     //   50: istore #11
/*     */     //   52: istore #9
/*     */     //   54: iconst_0
/*     */     //   55: istore #12
/*     */     //   57: aload_1
/*     */     //   58: ldc2_w 3.0
/*     */     //   61: ldc2_w 3.0
/*     */     //   64: ldc2_w 3.0
/*     */     //   67: invokeinterface getNearbyEntities : (DDD)Ljava/util/List;
/*     */     //   72: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   77: astore #13
/*     */     //   79: aload #13
/*     */     //   81: invokeinterface hasNext : ()Z
/*     */     //   86: ifeq -> 223
/*     */     //   89: aload #13
/*     */     //   91: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   96: checkcast org/bukkit/entity/Entity
/*     */     //   99: astore #14
/*     */     //   101: iload #9
/*     */     //   103: ifne -> 263
/*     */     //   106: aload #14
/*     */     //   108: invokeinterface getType : ()Lorg/bukkit/entity/EntityType;
/*     */     //   113: getstatic org/bukkit/entity/EntityType.FIREWORK : Lorg/bukkit/entity/EntityType;
/*     */     //   116: iload #9
/*     */     //   118: ifne -> 163
/*     */     //   121: goto -> 134
/*     */     //   124: ldc2_w 201424228844770303
/*     */     //   127: lload_2
/*     */     //   128: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   133: athrow
/*     */     //   134: if_acmpne -> 153
/*     */     //   137: goto -> 150
/*     */     //   140: ldc2_w 201424228844770303
/*     */     //   143: lload_2
/*     */     //   144: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   149: athrow
/*     */     //   150: iconst_1
/*     */     //   151: istore #10
/*     */     //   153: aload #14
/*     */     //   155: invokeinterface getType : ()Lorg/bukkit/entity/EntityType;
/*     */     //   160: getstatic org/bukkit/entity/EntityType.BOAT : Lorg/bukkit/entity/EntityType;
/*     */     //   163: if_acmpne -> 169
/*     */     //   166: iconst_1
/*     */     //   167: istore #11
/*     */     //   169: invokestatic a : ()Lme/konsolas/aac/kP;
/*     */     //   172: lload #7
/*     */     //   174: getstatic me/konsolas/aac/kP.V1_9 : Lme/konsolas/aac/kP;
/*     */     //   177: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*     */     //   180: lload_2
/*     */     //   181: lconst_0
/*     */     //   182: lcmp
/*     */     //   183: iflt -> 220
/*     */     //   186: ifeq -> 218
/*     */     //   189: aload #14
/*     */     //   191: invokeinterface getType : ()Lorg/bukkit/entity/EntityType;
/*     */     //   196: getstatic org/bukkit/entity/EntityType.SHULKER : Lorg/bukkit/entity/EntityType;
/*     */     //   199: if_acmpne -> 218
/*     */     //   202: goto -> 215
/*     */     //   205: ldc2_w 201424228844770303
/*     */     //   208: lload_2
/*     */     //   209: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   214: athrow
/*     */     //   215: iconst_1
/*     */     //   216: istore #12
/*     */     //   218: iload #9
/*     */     //   220: ifeq -> 79
/*     */     //   223: aload_0
/*     */     //   224: lload #4
/*     */     //   226: iload #6
/*     */     //   228: i2s
/*     */     //   229: aload_1
/*     */     //   230: invokestatic a : (JSLorg/bukkit/entity/Player;)Lorg/bukkit/util/Vector;
/*     */     //   233: invokevirtual length : ()D
/*     */     //   236: putfield s : D
/*     */     //   239: aload_0
/*     */     //   240: iload #10
/*     */     //   242: putfield j : Z
/*     */     //   245: aload_0
/*     */     //   246: iload #11
/*     */     //   248: putfield t : Z
/*     */     //   251: aload_0
/*     */     //   252: iload #12
/*     */     //   254: putfield k : Z
/*     */     //   257: lload_2
/*     */     //   258: lconst_0
/*     */     //   259: lcmp
/*     */     //   260: iflt -> 263
/*     */     //   263: aload_1
/*     */     //   264: invokeinterface getWorld : ()Lorg/bukkit/World;
/*     */     //   269: invokeinterface getWorldBorder : ()Lorg/bukkit/WorldBorder;
/*     */     //   274: astore #13
/*     */     //   276: aload #13
/*     */     //   278: invokeinterface getCenter : ()Lorg/bukkit/Location;
/*     */     //   283: astore #14
/*     */     //   285: aload #13
/*     */     //   287: invokeinterface getSize : ()D
/*     */     //   292: ldc2_w 2.0
/*     */     //   295: ddiv
/*     */     //   296: dstore #15
/*     */     //   298: aload_0
/*     */     //   299: aload #14
/*     */     //   301: invokevirtual getX : ()D
/*     */     //   304: dload #15
/*     */     //   306: dsub
/*     */     //   307: putfield C : D
/*     */     //   310: aload_0
/*     */     //   311: aload #14
/*     */     //   313: invokevirtual getZ : ()D
/*     */     //   316: dload #15
/*     */     //   318: dsub
/*     */     //   319: putfield H : D
/*     */     //   322: aload_0
/*     */     //   323: aload #14
/*     */     //   325: invokevirtual getX : ()D
/*     */     //   328: dload #15
/*     */     //   330: dadd
/*     */     //   331: putfield e : D
/*     */     //   334: aload_0
/*     */     //   335: aload #14
/*     */     //   337: invokevirtual getZ : ()D
/*     */     //   340: dload #15
/*     */     //   342: dadd
/*     */     //   343: putfield K : D
/*     */     //   346: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #155	-> 46
/*     */     //   #120	-> 57
/*     */     //   #52	-> 101
/*     */     //   #156	-> 153
/*     */     //   #64	-> 169
/*     */     //   #72	-> 218
/*     */     //   #15	-> 223
/*     */     //   #145	-> 239
/*     */     //   #190	-> 245
/*     */     //   #9	-> 251
/*     */     //   #165	-> 263
/*     */     //   #163	-> 276
/*     */     //   #178	-> 285
/*     */     //   #97	-> 298
/*     */     //   #33	-> 310
/*     */     //   #174	-> 322
/*     */     //   #141	-> 334
/*     */     //   #42	-> 346
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   101	121	124	aacinternal/v
/*     */     //   106	137	140	aacinternal/v
/*     */     //   169	202	205	aacinternal/v
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c() {
/* 166 */     return this.a;
/*     */   }
/*     */   
/*     */   public float c() {
/* 170 */     return this.h;
/*     */   }
/*     */   public void a(Player paramPlayer, int paramInt1, int paramInt2, char paramChar) {
/*     */     // Byte code:
/*     */     //   0: iload_2
/*     */     //   1: i2l
/*     */     //   2: bipush #32
/*     */     //   4: lshl
/*     */     //   5: iload_3
/*     */     //   6: i2l
/*     */     //   7: bipush #48
/*     */     //   9: lshl
/*     */     //   10: bipush #32
/*     */     //   12: lushr
/*     */     //   13: lor
/*     */     //   14: iload #4
/*     */     //   16: i2l
/*     */     //   17: bipush #48
/*     */     //   19: lshl
/*     */     //   20: bipush #48
/*     */     //   22: lushr
/*     */     //   23: lor
/*     */     //   24: getstatic me/konsolas/aac/k7.O : J
/*     */     //   27: lxor
/*     */     //   28: lstore #5
/*     */     //   30: lload #5
/*     */     //   32: dup2
/*     */     //   33: ldc2_w 51819040189602
/*     */     //   36: lxor
/*     */     //   37: lstore #7
/*     */     //   39: dup2
/*     */     //   40: ldc2_w 30244269869259
/*     */     //   43: lxor
/*     */     //   44: lstore #9
/*     */     //   46: pop2
/*     */     //   47: ldc2_w 3064222154367704754
/*     */     //   50: lload #5
/*     */     //   52: <illegal opcode> w : (JJ)I
/*     */     //   57: invokestatic a : ()Lme/konsolas/aac/mJ;
/*     */     //   60: aload_1
/*     */     //   61: lload #9
/*     */     //   63: invokeinterface a : (Lorg/bukkit/entity/Player;J)Lorg/bukkit/inventory/ItemStack;
/*     */     //   68: astore #12
/*     */     //   70: istore #11
/*     */     //   72: aload_1
/*     */     //   73: invokeinterface isSneaking : ()Z
/*     */     //   78: istore #13
/*     */     //   80: aload #12
/*     */     //   82: ifnull -> 100
/*     */     //   85: iconst_1
/*     */     //   86: goto -> 101
/*     */     //   89: ldc2_w 3104084584381889063
/*     */     //   92: lload #5
/*     */     //   94: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   99: athrow
/*     */     //   100: iconst_0
/*     */     //   101: istore #14
/*     */     //   103: invokestatic a : ()Lme/konsolas/aac/mJ;
/*     */     //   106: aload_1
/*     */     //   107: invokeinterface a : (Lorg/bukkit/entity/Player;)Z
/*     */     //   112: istore #15
/*     */     //   114: aload_1
/*     */     //   115: invokeinterface isFlying : ()Z
/*     */     //   120: istore #16
/*     */     //   122: aload_1
/*     */     //   123: invokeinterface getAllowFlight : ()Z
/*     */     //   128: istore #17
/*     */     //   130: iload #13
/*     */     //   132: iload #11
/*     */     //   134: iload #4
/*     */     //   136: ifle -> 146
/*     */     //   139: ifeq -> 232
/*     */     //   142: aload_0
/*     */     //   143: getfield c : Z
/*     */     //   146: if_icmpeq -> 206
/*     */     //   149: goto -> 163
/*     */     //   152: ldc2_w 3104084584381889063
/*     */     //   155: lload #5
/*     */     //   157: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   162: athrow
/*     */     //   163: aload_0
/*     */     //   164: iload #13
/*     */     //   166: putfield c : Z
/*     */     //   169: aload_0
/*     */     //   170: getfield l : Ljava/util/concurrent/atomic/AtomicInteger;
/*     */     //   173: <illegal opcode> applyAsInt : ()Ljava/util/function/IntUnaryOperator;
/*     */     //   178: invokevirtual updateAndGet : (Ljava/util/function/IntUnaryOperator;)I
/*     */     //   181: pop
/*     */     //   182: iload #11
/*     */     //   184: iload #4
/*     */     //   186: iflt -> 235
/*     */     //   189: ifne -> 233
/*     */     //   192: goto -> 206
/*     */     //   195: ldc2_w 3104084584381889063
/*     */     //   198: lload #5
/*     */     //   200: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   205: athrow
/*     */     //   206: aload_0
/*     */     //   207: getfield l : Ljava/util/concurrent/atomic/AtomicInteger;
/*     */     //   210: <illegal opcode> applyAsInt : ()Ljava/util/function/IntUnaryOperator;
/*     */     //   215: invokevirtual updateAndGet : (Ljava/util/function/IntUnaryOperator;)I
/*     */     //   218: goto -> 232
/*     */     //   221: ldc2_w 3104084584381889063
/*     */     //   224: lload #5
/*     */     //   226: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   231: athrow
/*     */     //   232: pop
/*     */     //   233: iload #14
/*     */     //   235: iload #11
/*     */     //   237: iload #4
/*     */     //   239: iflt -> 249
/*     */     //   242: ifeq -> 334
/*     */     //   245: aload_0
/*     */     //   246: getfield N : Z
/*     */     //   249: if_icmpeq -> 308
/*     */     //   252: goto -> 266
/*     */     //   255: ldc2_w 3104084584381889063
/*     */     //   258: lload #5
/*     */     //   260: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   265: athrow
/*     */     //   266: aload_0
/*     */     //   267: iload #14
/*     */     //   269: putfield N : Z
/*     */     //   272: aload_0
/*     */     //   273: getfield d : Ljava/util/concurrent/atomic/AtomicInteger;
/*     */     //   276: <illegal opcode> applyAsInt : ()Ljava/util/function/IntUnaryOperator;
/*     */     //   281: invokevirtual updateAndGet : (Ljava/util/function/IntUnaryOperator;)I
/*     */     //   284: pop
/*     */     //   285: iload #11
/*     */     //   287: iload_2
/*     */     //   288: iflt -> 339
/*     */     //   291: ifne -> 335
/*     */     //   294: goto -> 308
/*     */     //   297: ldc2_w 3104084584381889063
/*     */     //   300: lload #5
/*     */     //   302: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   307: athrow
/*     */     //   308: aload_0
/*     */     //   309: getfield d : Ljava/util/concurrent/atomic/AtomicInteger;
/*     */     //   312: <illegal opcode> applyAsInt : ()Ljava/util/function/IntUnaryOperator;
/*     */     //   317: invokevirtual updateAndGet : (Ljava/util/function/IntUnaryOperator;)I
/*     */     //   320: goto -> 334
/*     */     //   323: ldc2_w 3104084584381889063
/*     */     //   326: lload #5
/*     */     //   328: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   333: athrow
/*     */     //   334: pop
/*     */     //   335: aload_0
/*     */     //   336: getfield g : Z
/*     */     //   339: iload #11
/*     */     //   341: iload #4
/*     */     //   343: iflt -> 351
/*     */     //   346: ifeq -> 437
/*     */     //   349: iload #15
/*     */     //   351: if_icmpeq -> 411
/*     */     //   354: goto -> 368
/*     */     //   357: ldc2_w 3104084584381889063
/*     */     //   360: lload #5
/*     */     //   362: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   367: athrow
/*     */     //   368: aload_0
/*     */     //   369: iload #15
/*     */     //   371: putfield g : Z
/*     */     //   374: aload_0
/*     */     //   375: getfield D : Ljava/util/concurrent/atomic/AtomicInteger;
/*     */     //   378: <illegal opcode> applyAsInt : ()Ljava/util/function/IntUnaryOperator;
/*     */     //   383: invokevirtual updateAndGet : (Ljava/util/function/IntUnaryOperator;)I
/*     */     //   386: pop
/*     */     //   387: iload #11
/*     */     //   389: iload #4
/*     */     //   391: iflt -> 442
/*     */     //   394: ifne -> 438
/*     */     //   397: goto -> 411
/*     */     //   400: ldc2_w 3104084584381889063
/*     */     //   403: lload #5
/*     */     //   405: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   410: athrow
/*     */     //   411: aload_0
/*     */     //   412: getfield D : Ljava/util/concurrent/atomic/AtomicInteger;
/*     */     //   415: <illegal opcode> applyAsInt : ()Ljava/util/function/IntUnaryOperator;
/*     */     //   420: invokevirtual updateAndGet : (Ljava/util/function/IntUnaryOperator;)I
/*     */     //   423: goto -> 437
/*     */     //   426: ldc2_w 3104084584381889063
/*     */     //   429: lload #5
/*     */     //   431: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   436: athrow
/*     */     //   437: pop
/*     */     //   438: aload_0
/*     */     //   439: getfield b : Z
/*     */     //   442: iload #11
/*     */     //   444: iload #4
/*     */     //   446: ifle -> 454
/*     */     //   449: ifeq -> 587
/*     */     //   452: iload #16
/*     */     //   454: if_icmpeq -> 561
/*     */     //   457: goto -> 471
/*     */     //   460: ldc2_w 3104084584381889063
/*     */     //   463: lload #5
/*     */     //   465: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   470: athrow
/*     */     //   471: aload_0
/*     */     //   472: getfield q : Ljava/util/concurrent/atomic/AtomicInteger;
/*     */     //   475: invokevirtual get : ()I
/*     */     //   478: iload #11
/*     */     //   480: ifeq -> 587
/*     */     //   483: goto -> 497
/*     */     //   486: ldc2_w 3104084584381889063
/*     */     //   489: lload #5
/*     */     //   491: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   496: athrow
/*     */     //   497: iload #4
/*     */     //   499: iflt -> 573
/*     */     //   502: ifgt -> 561
/*     */     //   505: goto -> 519
/*     */     //   508: ldc2_w 3104084584381889063
/*     */     //   511: lload #5
/*     */     //   513: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   518: athrow
/*     */     //   519: aload_0
/*     */     //   520: iload #16
/*     */     //   522: putfield b : Z
/*     */     //   525: aload_0
/*     */     //   526: getfield q : Ljava/util/concurrent/atomic/AtomicInteger;
/*     */     //   529: <illegal opcode> applyAsInt : ()Ljava/util/function/IntUnaryOperator;
/*     */     //   534: invokevirtual updateAndGet : (Ljava/util/function/IntUnaryOperator;)I
/*     */     //   537: pop
/*     */     //   538: iload_3
/*     */     //   539: ifle -> 598
/*     */     //   542: iload #11
/*     */     //   544: ifne -> 588
/*     */     //   547: goto -> 561
/*     */     //   550: ldc2_w 3104084584381889063
/*     */     //   553: lload #5
/*     */     //   555: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   560: athrow
/*     */     //   561: aload_0
/*     */     //   562: getfield q : Ljava/util/concurrent/atomic/AtomicInteger;
/*     */     //   565: <illegal opcode> applyAsInt : ()Ljava/util/function/IntUnaryOperator;
/*     */     //   570: invokevirtual updateAndGet : (Ljava/util/function/IntUnaryOperator;)I
/*     */     //   573: goto -> 587
/*     */     //   576: ldc2_w 3104084584381889063
/*     */     //   579: lload #5
/*     */     //   581: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   586: athrow
/*     */     //   587: pop
/*     */     //   588: aload_0
/*     */     //   589: aload_1
/*     */     //   590: invokeinterface isSprinting : ()Z
/*     */     //   595: putfield p : Z
/*     */     //   598: aload_0
/*     */     //   599: aload_1
/*     */     //   600: invokeinterface getFoodLevel : ()I
/*     */     //   605: iload #11
/*     */     //   607: iload_2
/*     */     //   608: iflt -> 658
/*     */     //   611: ifeq -> 656
/*     */     //   614: bipush #6
/*     */     //   616: if_icmple -> 682
/*     */     //   619: goto -> 633
/*     */     //   622: ldc2_w 3104084584381889063
/*     */     //   625: lload #5
/*     */     //   627: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   632: athrow
/*     */     //   633: aload_1
/*     */     //   634: getstatic org/bukkit/potion/PotionEffectType.BLINDNESS : Lorg/bukkit/potion/PotionEffectType;
/*     */     //   637: invokeinterface hasPotionEffect : (Lorg/bukkit/potion/PotionEffectType;)Z
/*     */     //   642: goto -> 656
/*     */     //   645: ldc2_w 3104084584381889063
/*     */     //   648: lload #5
/*     */     //   650: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   655: athrow
/*     */     //   656: iload #11
/*     */     //   658: ifeq -> 679
/*     */     //   661: ifne -> 682
/*     */     //   664: goto -> 678
/*     */     //   667: ldc2_w 3104084584381889063
/*     */     //   670: lload #5
/*     */     //   672: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   677: athrow
/*     */     //   678: iconst_1
/*     */     //   679: goto -> 683
/*     */     //   682: iconst_0
/*     */     //   683: putfield x : Z
/*     */     //   686: invokestatic a : ()Lme/konsolas/aac/kP;
/*     */     //   689: lload #7
/*     */     //   691: getstatic me/konsolas/aac/kP.V1_13 : Lme/konsolas/aac/kP;
/*     */     //   694: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*     */     //   697: iload_2
/*     */     //   698: iflt -> 725
/*     */     //   701: iload #11
/*     */     //   703: ifeq -> 725
/*     */     //   706: ifeq -> 830
/*     */     //   709: goto -> 723
/*     */     //   712: ldc2_w 3104084584381889063
/*     */     //   715: lload #5
/*     */     //   717: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   722: athrow
/*     */     //   723: iload #14
/*     */     //   725: ifeq -> 830
/*     */     //   728: aload_0
/*     */     //   729: aload #12
/*     */     //   731: iload #4
/*     */     //   733: ifle -> 794
/*     */     //   736: iload #11
/*     */     //   738: ifeq -> 794
/*     */     //   741: goto -> 755
/*     */     //   744: ldc2_w 3104084584381889063
/*     */     //   747: lload #5
/*     */     //   749: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   754: athrow
/*     */     //   755: invokevirtual getType : ()Lorg/bukkit/Material;
/*     */     //   758: getstatic org/bukkit/Material.TRIDENT : Lorg/bukkit/Material;
/*     */     //   761: if_acmpne -> 826
/*     */     //   764: goto -> 778
/*     */     //   767: ldc2_w 3104084584381889063
/*     */     //   770: lload #5
/*     */     //   772: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   777: athrow
/*     */     //   778: aload #12
/*     */     //   780: goto -> 794
/*     */     //   783: ldc2_w 3104084584381889063
/*     */     //   786: lload #5
/*     */     //   788: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   793: athrow
/*     */     //   794: getstatic org/bukkit/enchantments/Enchantment.RIPTIDE : Lorg/bukkit/enchantments/Enchantment;
/*     */     //   797: invokevirtual getEnchantmentLevel : (Lorg/bukkit/enchantments/Enchantment;)I
/*     */     //   800: iload #11
/*     */     //   802: ifeq -> 823
/*     */     //   805: ifle -> 826
/*     */     //   808: goto -> 822
/*     */     //   811: ldc2_w 3104084584381889063
/*     */     //   814: lload #5
/*     */     //   816: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   821: athrow
/*     */     //   822: iconst_1
/*     */     //   823: goto -> 827
/*     */     //   826: iconst_0
/*     */     //   827: putfield i : Z
/*     */     //   830: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #176	-> 57
/*     */     //   #91	-> 72
/*     */     //   #8	-> 80
/*     */     //   #108	-> 103
/*     */     //   #216	-> 114
/*     */     //   #153	-> 122
/*     */     //   #7	-> 130
/*     */     //   #225	-> 163
/*     */     //   #90	-> 169
/*     */     //   #73	-> 206
/*     */     //   #182	-> 233
/*     */     //   #55	-> 266
/*     */     //   #53	-> 272
/*     */     //   #133	-> 308
/*     */     //   #135	-> 335
/*     */     //   #14	-> 368
/*     */     //   #143	-> 374
/*     */     //   #198	-> 411
/*     */     //   #146	-> 438
/*     */     //   #124	-> 519
/*     */     //   #127	-> 525
/*     */     //   #222	-> 561
/*     */     //   #96	-> 588
/*     */     //   #98	-> 598
/*     */     //   #149	-> 686
/*     */     //   #121	-> 728
/*     */     //   #31	-> 797
/*     */     //   #20	-> 830
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   80	89	89	aacinternal/v
/*     */     //   130	149	152	aacinternal/v
/*     */     //   142	192	195	aacinternal/v
/*     */     //   163	218	221	aacinternal/v
/*     */     //   233	252	255	aacinternal/v
/*     */     //   245	294	297	aacinternal/v
/*     */     //   266	320	323	aacinternal/v
/*     */     //   335	354	357	aacinternal/v
/*     */     //   349	397	400	aacinternal/v
/*     */     //   368	423	426	aacinternal/v
/*     */     //   438	457	460	aacinternal/v
/*     */     //   452	483	486	aacinternal/v
/*     */     //   471	505	508	aacinternal/v
/*     */     //   497	547	550	aacinternal/v
/*     */     //   519	573	576	aacinternal/v
/*     */     //   588	619	622	aacinternal/v
/*     */     //   614	642	645	aacinternal/v
/*     */     //   656	664	667	aacinternal/v
/*     */     //   683	709	712	aacinternal/v
/*     */     //   725	741	744	aacinternal/v
/*     */     //   728	764	767	aacinternal/v
/*     */     //   755	780	783	aacinternal/v
/*     */     //   794	808	811	aacinternal/v
/*     */   }
/*     */   
/*     */   public boolean k() {
/* 177 */     return this.x;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a()
/*     */   {
/* 185 */     return this.p; } public double a() {
/* 186 */     return this.u;
/*     */   } public double c() {
/* 188 */     return this.J;
/*     */   }
/*     */   
/*     */   public void b() {
/* 192 */     this.o.set(true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public EntityType a() {
/* 202 */     return this.A;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int c() {
/* 209 */     return this.L;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 220 */   private final AtomicInteger q = new AtomicInteger();
/*     */   private EntityType I;
/*     */   private EntityType A;
/*     */   private EntityType y;
/*     */   private boolean a;
/*     */   private LivingEntity r;
/*     */   private float h;
/*     */   private float M;
/*     */   private double J;
/*     */   private double u;
/*     */   private int z;
/*     */   private int L;
/*     */   private boolean F;
/*     */   private boolean w;
/*     */   private boolean m;
/*     */   private int v;
/*     */   private int f;
/*     */   private double G;
/*     */   private double s;
/*     */   private boolean j;
/*     */   private boolean t;
/*     */   private boolean k;
/*     */   private double C;
/*     */   private double H;
/*     */   private double e;
/*     */   private double K;
/*     */   private boolean c;
/*     */   private boolean N;
/*     */   private boolean g;
/*     */   private boolean b;
/*     */   private boolean x;
/*     */   private boolean p;
/*     */   private float E;
/*     */   private volatile boolean i;
/*     */   private static final long O = nc.a(6779776632942120294L, -8844905091997725322L, MethodHandles.lookup().lookupClass()).a(65495321823541L);
/*     */   
/*     */   private static v a(v paramv) {
/*     */     return paramv;
/*     */   }
/*     */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\k7.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */