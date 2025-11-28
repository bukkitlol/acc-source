/*  1 */ package aacinternal;public abstract class ao { private static final double a = 1.0E-8D; public double a(long paramLong, double paramDouble, int paramInt) { paramLong = d ^ paramLong; long l = paramLong ^ 0x4EE695C4ED21L; return a(l, paramDouble, 1.0E-8D, paramInt); }
/*    */   
/*    */   private static final long d = nc.a(4723558908252395946L, -4020824980699002884L, MethodHandles.lookup().lookupClass()).a(94662683594382L);
/*    */   
/*    */   public double a(long paramLong, double paramDouble1, double paramDouble2, int paramInt) {
/*    */     // Byte code:
/*    */     //   0: getstatic aacinternal/ao.d : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: lload_1
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 79096823524454
/*    */     //   11: lxor
/*    */     //   12: lstore #8
/*    */     //   14: dup2
/*    */     //   15: ldc2_w 17779648460539
/*    */     //   18: lxor
/*    */     //   19: lstore #10
/*    */     //   21: dup2
/*    */     //   22: ldc2_w 5088636717057
/*    */     //   25: lxor
/*    */     //   26: lstore #12
/*    */     //   28: pop2
/*    */     //   29: ldc2_w 2320930301403031977
/*    */     //   32: lload_1
/*    */     //   33: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*    */     //   38: ldc2_w 1.0E-50
/*    */     //   41: dstore #15
/*    */     //   43: astore #14
/*    */     //   45: aload_0
/*    */     //   46: iconst_0
/*    */     //   47: dload_3
/*    */     //   48: invokevirtual b : (ID)D
/*    */     //   51: dstore #17
/*    */     //   53: dload #17
/*    */     //   55: dconst_0
/*    */     //   56: ldc2_w 1.0E-50
/*    */     //   59: lload #8
/*    */     //   61: invokestatic c : (DDDJ)Z
/*    */     //   64: aload #14
/*    */     //   66: ifnonnull -> 91
/*    */     //   69: ifeq -> 90
/*    */     //   72: goto -> 85
/*    */     //   75: ldc2_w 2333115007415853323
/*    */     //   78: lload_1
/*    */     //   79: <illegal opcode> w : (Laacinternal/w;JJ)Laacinternal/w;
/*    */     //   84: athrow
/*    */     //   85: ldc2_w 1.0E-50
/*    */     //   88: dstore #17
/*    */     //   90: iconst_1
/*    */     //   91: istore #19
/*    */     //   93: dconst_0
/*    */     //   94: dstore #20
/*    */     //   96: dload #17
/*    */     //   98: dstore #22
/*    */     //   100: dload #17
/*    */     //   102: dstore #24
/*    */     //   104: iload #19
/*    */     //   106: iload #7
/*    */     //   108: if_icmpge -> 488
/*    */     //   111: aload_0
/*    */     //   112: iload #19
/*    */     //   114: dload_3
/*    */     //   115: invokevirtual b : (ID)D
/*    */     //   118: dstore #26
/*    */     //   120: aload_0
/*    */     //   121: iload #19
/*    */     //   123: lload #10
/*    */     //   125: dload_3
/*    */     //   126: invokevirtual a : (IJD)D
/*    */     //   129: dstore #28
/*    */     //   131: dload #26
/*    */     //   133: dload #28
/*    */     //   135: dload #20
/*    */     //   137: dmul
/*    */     //   138: dadd
/*    */     //   139: dstore #30
/*    */     //   141: dload #30
/*    */     //   143: dconst_0
/*    */     //   144: lload_1
/*    */     //   145: lconst_0
/*    */     //   146: lcmp
/*    */     //   147: iflt -> 215
/*    */     //   150: ldc2_w 1.0E-50
/*    */     //   153: aload #14
/*    */     //   155: ifnonnull -> 214
/*    */     //   158: lload #8
/*    */     //   160: invokestatic c : (DDDJ)Z
/*    */     //   163: lload_1
/*    */     //   164: lconst_0
/*    */     //   165: lcmp
/*    */     //   166: iflt -> 496
/*    */     //   169: aload #14
/*    */     //   171: ifnonnull -> 496
/*    */     //   174: goto -> 187
/*    */     //   177: ldc2_w 2333115007415853323
/*    */     //   180: lload_1
/*    */     //   181: <illegal opcode> w : (Laacinternal/w;JJ)Laacinternal/w;
/*    */     //   186: athrow
/*    */     //   187: ifeq -> 208
/*    */     //   190: goto -> 203
/*    */     //   193: ldc2_w 2333115007415853323
/*    */     //   196: lload_1
/*    */     //   197: <illegal opcode> w : (Laacinternal/w;JJ)Laacinternal/w;
/*    */     //   202: athrow
/*    */     //   203: ldc2_w 1.0E-50
/*    */     //   206: dstore #30
/*    */     //   208: dload #26
/*    */     //   210: dload #28
/*    */     //   212: dload #22
/*    */     //   214: ddiv
/*    */     //   215: dadd
/*    */     //   216: dstore #32
/*    */     //   218: dload #32
/*    */     //   220: lload_1
/*    */     //   221: lconst_0
/*    */     //   222: lcmp
/*    */     //   223: iflt -> 272
/*    */     //   226: dconst_0
/*    */     //   227: aload #14
/*    */     //   229: ifnonnull -> 271
/*    */     //   232: ldc2_w 1.0E-50
/*    */     //   235: lload #8
/*    */     //   237: invokestatic c : (DDDJ)Z
/*    */     //   240: ifeq -> 261
/*    */     //   243: goto -> 256
/*    */     //   246: ldc2_w 2333115007415853323
/*    */     //   249: lload_1
/*    */     //   250: <illegal opcode> w : (Laacinternal/w;JJ)Laacinternal/w;
/*    */     //   255: athrow
/*    */     //   256: ldc2_w 1.0E-50
/*    */     //   259: dstore #32
/*    */     //   261: dconst_1
/*    */     //   262: dload #30
/*    */     //   264: ddiv
/*    */     //   265: dstore #30
/*    */     //   267: dload #32
/*    */     //   269: dload #30
/*    */     //   271: dmul
/*    */     //   272: dstore #34
/*    */     //   274: dload #17
/*    */     //   276: dload #34
/*    */     //   278: dmul
/*    */     //   279: dstore #24
/*    */     //   281: dload #24
/*    */     //   283: invokestatic isInfinite : (D)Z
/*    */     //   286: aload #14
/*    */     //   288: lload_1
/*    */     //   289: lconst_0
/*    */     //   290: lcmp
/*    */     //   291: iflt -> 360
/*    */     //   294: ifnonnull -> 352
/*    */     //   297: ifeq -> 347
/*    */     //   300: goto -> 313
/*    */     //   303: ldc2_w 2333115007415853323
/*    */     //   306: lload_1
/*    */     //   307: <illegal opcode> w : (Laacinternal/w;JJ)Laacinternal/w;
/*    */     //   312: athrow
/*    */     //   313: new aacinternal/w
/*    */     //   316: dup
/*    */     //   317: getstatic aacinternal/P.CONTINUED_FRACTION_INFINITY_DIVERGENCE : Laacinternal/P;
/*    */     //   320: iconst_1
/*    */     //   321: anewarray java/lang/Object
/*    */     //   324: dup
/*    */     //   325: iconst_0
/*    */     //   326: dload_3
/*    */     //   327: invokestatic valueOf : (D)Ljava/lang/Double;
/*    */     //   330: aastore
/*    */     //   331: lload #12
/*    */     //   333: invokespecial <init> : (Laacinternal/H;[Ljava/lang/Object;J)V
/*    */     //   336: athrow
/*    */     //   337: ldc2_w 2333115007415853323
/*    */     //   340: lload_1
/*    */     //   341: <illegal opcode> w : (Laacinternal/w;JJ)Laacinternal/w;
/*    */     //   346: athrow
/*    */     //   347: dload #24
/*    */     //   349: invokestatic isNaN : (D)Z
/*    */     //   352: lload_1
/*    */     //   353: lconst_0
/*    */     //   354: lcmp
/*    */     //   355: iflt -> 447
/*    */     //   358: aload #14
/*    */     //   360: ifnonnull -> 447
/*    */     //   363: ifeq -> 413
/*    */     //   366: goto -> 379
/*    */     //   369: ldc2_w 2333115007415853323
/*    */     //   372: lload_1
/*    */     //   373: <illegal opcode> w : (Laacinternal/w;JJ)Laacinternal/w;
/*    */     //   378: athrow
/*    */     //   379: new aacinternal/w
/*    */     //   382: dup
/*    */     //   383: getstatic aacinternal/P.CONTINUED_FRACTION_NAN_DIVERGENCE : Laacinternal/P;
/*    */     //   386: iconst_1
/*    */     //   387: anewarray java/lang/Object
/*    */     //   390: dup
/*    */     //   391: iconst_0
/*    */     //   392: dload_3
/*    */     //   393: invokestatic valueOf : (D)Ljava/lang/Double;
/*    */     //   396: aastore
/*    */     //   397: lload #12
/*    */     //   399: invokespecial <init> : (Laacinternal/H;[Ljava/lang/Object;J)V
/*    */     //   402: athrow
/*    */     //   403: ldc2_w 2333115007415853323
/*    */     //   406: lload_1
/*    */     //   407: <illegal opcode> w : (Laacinternal/w;JJ)Laacinternal/w;
/*    */     //   412: athrow
/*    */     //   413: lload_1
/*    */     //   414: lconst_0
/*    */     //   415: lcmp
/*    */     //   416: iflt -> 483
/*    */     //   419: dload #34
/*    */     //   421: dconst_1
/*    */     //   422: dsub
/*    */     //   423: invokestatic z : (D)D
/*    */     //   426: aload #14
/*    */     //   428: ifnonnull -> 478
/*    */     //   431: dload #5
/*    */     //   433: dcmpg
/*    */     //   434: goto -> 447
/*    */     //   437: ldc2_w 2333115007415853323
/*    */     //   440: lload_1
/*    */     //   441: <illegal opcode> w : (Laacinternal/w;JJ)Laacinternal/w;
/*    */     //   446: athrow
/*    */     //   447: ifge -> 468
/*    */     //   450: aload #14
/*    */     //   452: ifnull -> 488
/*    */     //   455: goto -> 468
/*    */     //   458: ldc2_w 2333115007415853323
/*    */     //   461: lload_1
/*    */     //   462: <illegal opcode> w : (Laacinternal/w;JJ)Laacinternal/w;
/*    */     //   467: athrow
/*    */     //   468: dload #30
/*    */     //   470: dstore #20
/*    */     //   472: dload #32
/*    */     //   474: dstore #22
/*    */     //   476: dload #24
/*    */     //   478: dstore #17
/*    */     //   480: iinc #19, 1
/*    */     //   483: aload #14
/*    */     //   485: ifnull -> 104
/*    */     //   488: lload_1
/*    */     //   489: lconst_0
/*    */     //   490: lcmp
/*    */     //   491: ifle -> 543
/*    */     //   494: iload #19
/*    */     //   496: iload #7
/*    */     //   498: if_icmplt -> 543
/*    */     //   501: new aacinternal/w
/*    */     //   504: dup
/*    */     //   505: getstatic aacinternal/P.NON_CONVERGENT_CONTINUED_FRACTION : Laacinternal/P;
/*    */     //   508: iconst_2
/*    */     //   509: anewarray java/lang/Object
/*    */     //   512: dup
/*    */     //   513: iconst_0
/*    */     //   514: iload #7
/*    */     //   516: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   519: aastore
/*    */     //   520: dup
/*    */     //   521: iconst_1
/*    */     //   522: dload_3
/*    */     //   523: invokestatic valueOf : (D)Ljava/lang/Double;
/*    */     //   526: aastore
/*    */     //   527: lload #12
/*    */     //   529: invokespecial <init> : (Laacinternal/H;[Ljava/lang/Object;J)V
/*    */     //   532: athrow
/*    */     //   533: ldc2_w 2333115007415853323
/*    */     //   536: lload_1
/*    */     //   537: <illegal opcode> w : (Laacinternal/w;JJ)Laacinternal/w;
/*    */     //   542: athrow
/*    */     //   543: dload #24
/*    */     //   545: dreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #6	-> 38
/*    */     //   #25	-> 45
/*    */     //   #14	-> 53
/*    */     //   #11	-> 85
/*    */     //   #27	-> 90
/*    */     //   #17	-> 93
/*    */     //   #3	-> 96
/*    */     //   #22	-> 100
/*    */     //   #16	-> 104
/*    */     //   #37	-> 111
/*    */     //   #15	-> 120
/*    */     //   #7	-> 131
/*    */     //   #40	-> 141
/*    */     //   #36	-> 203
/*    */     //   #32	-> 208
/*    */     //   #13	-> 218
/*    */     //   #28	-> 256
/*    */     //   #24	-> 261
/*    */     //   #31	-> 267
/*    */     //   #18	-> 274
/*    */     //   #4	-> 281
/*    */     //   #26	-> 313
/*    */     //   #19	-> 347
/*    */     //   #2	-> 379
/*    */     //   #34	-> 413
/*    */     //   #35	-> 450
/*    */     //   #8	-> 468
/*    */     //   #33	-> 472
/*    */     //   #39	-> 476
/*    */     //   #30	-> 480
/*    */     //   #5	-> 483
/*    */     //   #23	-> 488
/*    */     //   #38	-> 501
/*    */     //   #12	-> 516
/*    */     //   #9	-> 543
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   53	72	75	aacinternal/w
/*    */     //   141	174	177	aacinternal/w
/*    */     //   158	190	193	aacinternal/w
/*    */     //   218	243	246	aacinternal/w
/*    */     //   281	300	303	aacinternal/w
/*    */     //   297	337	337	aacinternal/w
/*    */     //   352	366	369	aacinternal/w
/*    */     //   363	403	403	aacinternal/w
/*    */     //   413	434	437	aacinternal/w
/*    */     //   447	455	458	aacinternal/w
/*    */     //   496	533	533	aacinternal/w
/*    */   }
/*    */   
/*    */   public double a(long paramLong, double paramDouble) {
/* 10 */     paramLong = d ^ paramLong; long l = paramLong ^ 0x3D12AB2D81AFL; return a(l, paramDouble, 1.0E-8D, 2147483647);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public double a(double paramDouble1, long paramLong, double paramDouble2) {
/* 20 */     paramLong = d ^ paramLong; long l = paramLong ^ 0x3DC80B8909A8L; return a(l, paramDouble1, paramDouble2, 2147483647);
/*    */   }
/*    */   
/*    */   protected abstract double b(int paramInt, double paramDouble);
/*    */   
/*    */   protected abstract double a(int paramInt, long paramLong, double paramDouble);
/*    */   
/*    */   private static w a(w paramw) {
/*    */     return paramw;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\ao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */