/*    */ package me.konsolas.aac;
/*    */ 
/*    */ import java.lang.invoke.CallSite;
/*    */ import java.lang.invoke.MethodHandle;
/*    */ import java.lang.invoke.MethodHandles;
/*    */ import java.lang.invoke.MethodType;
/*    */ import java.lang.invoke.MutableCallSite;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import java.util.zip.Inflater;
/*    */ import javax.crypto.Cipher;
/*    */ import javax.crypto.SecretKey;
/*    */ import javax.crypto.SecretKeyFactory;
/*    */ import javax.crypto.spec.DESKeySpec;
/*    */ import javax.crypto.spec.IvParameterSpec;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class h7
/*    */   implements hp
/*    */ {
/*    */   private final bX d;
/*    */   private final Inflater b;
/*    */   private int c;
/*    */   private boolean a;
/*    */   private static final long e = nc.a(-1756435276685757460L, -5307161300174182254L, MethodHandles.lookup().lookupClass()).a(191677747853639L);
/*    */   
/*    */   public h7(long paramLong, hp paramhp, Inflater paramInflater, int paramInt) {
/* 36 */     this(m, n, (char)i1, ds.a((short)i, paramhp, (char)j, k), paramInflater);
/*    */   }
/*    */   private static final String[] f; private static final String[] g; private static final Map h = new HashMap<>(13); h7(int paramInt1, int paramInt2, char paramChar, bX parambX, Inflater paramInflater) { // Byte code:
/*    */     //   0: iload_1
/*    */     //   1: i2l
/*    */     //   2: bipush #32
/*    */     //   4: lshl
/*    */     //   5: iload_2
/*    */     //   6: i2l
/*    */     //   7: bipush #48
/*    */     //   9: lshl
/*    */     //   10: bipush #32
/*    */     //   12: lushr
/*    */     //   13: lor
/*    */     //   14: iload_3
/*    */     //   15: i2l
/*    */     //   16: bipush #48
/*    */     //   18: lshl
/*    */     //   19: bipush #48
/*    */     //   21: lushr
/*    */     //   22: lor
/*    */     //   23: getstatic me/konsolas/aac/h7.e : J
/*    */     //   26: lxor
/*    */     //   27: lstore #6
/*    */     //   29: aload_0
/*    */     //   30: invokespecial <init> : ()V
/*    */     //   33: aload #4
/*    */     //   35: ifnonnull -> 60
/*    */     //   38: new java/lang/IllegalArgumentException
/*    */     //   41: dup
/*    */     //   42: sipush #32106
/*    */     //   45: ldc2_w 3018299595160648647
/*    */     //   48: lload #6
/*    */     //   50: lxor
/*    */     //   51: <illegal opcode> j : (IJ)Ljava/lang/String;
/*    */     //   56: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   59: athrow
/*    */     //   60: iload_1
/*    */     //   61: iflt -> 114
/*    */     //   64: aload #5
/*    */     //   66: ifnonnull -> 102
/*    */     //   69: new java/lang/IllegalArgumentException
/*    */     //   72: dup
/*    */     //   73: sipush #20228
/*    */     //   76: ldc2_w 6209174771083102637
/*    */     //   79: lload #6
/*    */     //   81: lxor
/*    */     //   82: <illegal opcode> j : (IJ)Ljava/lang/String;
/*    */     //   87: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   90: athrow
/*    */     //   91: ldc2_w 6377950256984563756
/*    */     //   94: lload #6
/*    */     //   96: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   101: athrow
/*    */     //   102: aload_0
/*    */     //   103: aload #4
/*    */     //   105: putfield d : Lme/konsolas/aac/bX;
/*    */     //   108: aload_0
/*    */     //   109: aload #5
/*    */     //   111: putfield b : Ljava/util/zip/Inflater;
/*    */     //   114: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #2	-> 29
/*    */     //   #7	-> 33
/*    */     //   #13	-> 60
/*    */     //   #9	-> 102
/*    */     //   #39	-> 108
/*    */     //   #14	-> 114
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   60	91	91	java/lang/IllegalArgumentException } public final boolean a(long paramLong) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/h7.e : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: lload_1
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 124987371804692
/*    */     //   11: lxor
/*    */     //   12: dup2
/*    */     //   13: bipush #32
/*    */     //   15: lushr
/*    */     //   16: l2i
/*    */     //   17: istore_3
/*    */     //   18: dup2
/*    */     //   19: bipush #32
/*    */     //   21: lshl
/*    */     //   22: bipush #48
/*    */     //   24: lushr
/*    */     //   25: l2i
/*    */     //   26: istore #4
/*    */     //   28: dup2
/*    */     //   29: bipush #48
/*    */     //   31: lshl
/*    */     //   32: bipush #48
/*    */     //   34: lushr
/*    */     //   35: l2i
/*    */     //   36: istore #5
/*    */     //   38: pop2
/*    */     //   39: dup2
/*    */     //   40: ldc2_w 9871234808099
/*    */     //   43: lxor
/*    */     //   44: lstore #6
/*    */     //   46: pop2
/*    */     //   47: ldc2_w -3403137637688899843
/*    */     //   50: lload_1
/*    */     //   51: <illegal opcode> w : (JJ)I
/*    */     //   56: istore #8
/*    */     //   58: aload_0
/*    */     //   59: getfield b : Ljava/util/zip/Inflater;
/*    */     //   62: invokevirtual needsInput : ()Z
/*    */     //   65: iload #8
/*    */     //   67: ifne -> 111
/*    */     //   70: ifne -> 98
/*    */     //   73: goto -> 86
/*    */     //   76: ldc2_w -3429957777505015607
/*    */     //   79: lload_1
/*    */     //   80: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   85: athrow
/*    */     //   86: iconst_0
/*    */     //   87: ireturn
/*    */     //   88: ldc2_w -3429957777505015607
/*    */     //   91: lload_1
/*    */     //   92: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   97: athrow
/*    */     //   98: aload_0
/*    */     //   99: lload #6
/*    */     //   101: invokespecial a : (J)V
/*    */     //   104: aload_0
/*    */     //   105: getfield b : Ljava/util/zip/Inflater;
/*    */     //   108: invokevirtual getRemaining : ()I
/*    */     //   111: lload_1
/*    */     //   112: lconst_0
/*    */     //   113: lcmp
/*    */     //   114: ifle -> 219
/*    */     //   117: iload #8
/*    */     //   119: ifne -> 219
/*    */     //   122: ifeq -> 180
/*    */     //   125: goto -> 138
/*    */     //   128: ldc2_w -3429957777505015607
/*    */     //   131: lload_1
/*    */     //   132: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   137: athrow
/*    */     //   138: new java/lang/IllegalStateException
/*    */     //   141: dup
/*    */     //   142: ldc '縌᪳'
/*    */     //   144: invokevirtual toCharArray : ()[C
/*    */     //   147: dup
/*    */     //   148: dup
/*    */     //   149: iconst_0
/*    */     //   150: dup_x1
/*    */     //   151: caload
/*    */     //   152: sipush #29879
/*    */     //   155: ixor
/*    */     //   156: i2c
/*    */     //   157: castore
/*    */     //   158: sipush #22643
/*    */     //   161: iconst_4
/*    */     //   162: iconst_3
/*    */     //   163: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   166: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   169: athrow
/*    */     //   170: ldc2_w -3429957777505015607
/*    */     //   173: lload_1
/*    */     //   174: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   179: athrow
/*    */     //   180: aload_0
/*    */     //   181: getfield d : Lme/konsolas/aac/bX;
/*    */     //   184: iload #8
/*    */     //   186: lload_1
/*    */     //   187: lconst_0
/*    */     //   188: lcmp
/*    */     //   189: ifle -> 196
/*    */     //   192: ifne -> 244
/*    */     //   195: iload_3
/*    */     //   196: iload #4
/*    */     //   198: i2c
/*    */     //   199: iload #5
/*    */     //   201: invokeinterface a : (ICI)Z
/*    */     //   206: goto -> 219
/*    */     //   209: ldc2_w -3429957777505015607
/*    */     //   212: lload_1
/*    */     //   213: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   218: athrow
/*    */     //   219: lload_1
/*    */     //   220: lconst_0
/*    */     //   221: lcmp
/*    */     //   222: ifle -> 229
/*    */     //   225: ifeq -> 240
/*    */     //   228: iconst_1
/*    */     //   229: ireturn
/*    */     //   230: ldc2_w -3429957777505015607
/*    */     //   233: lload_1
/*    */     //   234: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   239: athrow
/*    */     //   240: aload_0
/*    */     //   241: getfield d : Lme/konsolas/aac/bX;
/*    */     //   244: invokeinterface a : ()Lme/konsolas/aac/fw;
/*    */     //   249: getfield b : Lme/konsolas/aac/eV;
/*    */     //   252: astore #9
/*    */     //   254: aload_0
/*    */     //   255: aload #9
/*    */     //   257: getfield c : I
/*    */     //   260: aload #9
/*    */     //   262: getfield d : I
/*    */     //   265: isub
/*    */     //   266: putfield c : I
/*    */     //   269: aload_0
/*    */     //   270: getfield b : Ljava/util/zip/Inflater;
/*    */     //   273: aload #9
/*    */     //   275: getfield h : [B
/*    */     //   278: aload #9
/*    */     //   280: getfield d : I
/*    */     //   283: aload_0
/*    */     //   284: getfield c : I
/*    */     //   287: invokevirtual setInput : ([BII)V
/*    */     //   290: iconst_0
/*    */     //   291: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #22	-> 58
/*    */     //   #16	-> 98
/*    */     //   #35	-> 104
/*    */     //   #33	-> 180
/*    */     //   #40	-> 240
/*    */     //   #25	-> 254
/*    */     //   #28	-> 269
/*    */     //   #3	-> 290
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   58	73	76	java/io/IOException
/*    */     //   70	88	88	java/io/IOException
/*    */     //   111	125	128	java/io/IOException
/*    */     //   122	170	170	java/io/IOException
/*    */     //   180	206	209	java/io/IOException
/*    */     //   219	230	230	java/io/IOException } public long a(long paramLong1, fw paramfw, long paramLong2) {
/*    */     // Byte code:
/*    */     //   0: lload_1
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 7498371338373
/*    */     //   5: lxor
/*    */     //   6: lstore #6
/*    */     //   8: dup2
/*    */     //   9: ldc2_w 134652452436871
/*    */     //   12: lxor
/*    */     //   13: lstore #8
/*    */     //   15: dup2
/*    */     //   16: ldc2_w 44243128849555
/*    */     //   19: lxor
/*    */     //   20: lstore #10
/*    */     //   22: dup2
/*    */     //   23: ldc2_w 120982056523126
/*    */     //   26: lxor
/*    */     //   27: lstore #12
/*    */     //   29: dup2
/*    */     //   30: ldc2_w 940203958445
/*    */     //   33: lxor
/*    */     //   34: lstore #14
/*    */     //   36: pop2
/*    */     //   37: ldc2_w -8553557825786290317
/*    */     //   40: lload_1
/*    */     //   41: <illegal opcode> w : (JJ)I
/*    */     //   46: istore #16
/*    */     //   48: lload #4
/*    */     //   50: lconst_0
/*    */     //   51: lcmp
/*    */     //   52: iload #16
/*    */     //   54: ifne -> 126
/*    */     //   57: ifge -> 122
/*    */     //   60: goto -> 73
/*    */     //   63: ldc2_w -8509446276485615289
/*    */     //   66: lload_1
/*    */     //   67: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   72: athrow
/*    */     //   73: new java/lang/IllegalArgumentException
/*    */     //   76: dup
/*    */     //   77: new java/lang/StringBuilder
/*    */     //   80: dup
/*    */     //   81: invokespecial <init> : ()V
/*    */     //   84: sipush #2430
/*    */     //   87: ldc2_w 1041417948130074298
/*    */     //   90: lload_1
/*    */     //   91: lxor
/*    */     //   92: <illegal opcode> j : (IJ)Ljava/lang/String;
/*    */     //   97: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   100: lload #4
/*    */     //   102: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*    */     //   105: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   108: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   111: athrow
/*    */     //   112: ldc2_w -8509446276485615289
/*    */     //   115: lload_1
/*    */     //   116: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   121: athrow
/*    */     //   122: aload_0
/*    */     //   123: getfield a : Z
/*    */     //   126: iload #16
/*    */     //   128: lload_1
/*    */     //   129: lconst_0
/*    */     //   130: lcmp
/*    */     //   131: iflt -> 190
/*    */     //   134: ifne -> 188
/*    */     //   137: ifeq -> 184
/*    */     //   140: goto -> 153
/*    */     //   143: ldc2_w -8509446276485615289
/*    */     //   146: lload_1
/*    */     //   147: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   152: athrow
/*    */     //   153: new java/lang/IllegalStateException
/*    */     //   156: dup
/*    */     //   157: sipush #13965
/*    */     //   160: ldc2_w 6502280482095751496
/*    */     //   163: lload_1
/*    */     //   164: lxor
/*    */     //   165: <illegal opcode> j : (IJ)Ljava/lang/String;
/*    */     //   170: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   173: athrow
/*    */     //   174: ldc2_w -8509446276485615289
/*    */     //   177: lload_1
/*    */     //   178: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   183: athrow
/*    */     //   184: lload #4
/*    */     //   186: lconst_0
/*    */     //   187: lcmp
/*    */     //   188: iload #16
/*    */     //   190: ifne -> 227
/*    */     //   193: ifne -> 221
/*    */     //   196: goto -> 209
/*    */     //   199: ldc2_w -8509446276485615289
/*    */     //   202: lload_1
/*    */     //   203: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   208: athrow
/*    */     //   209: lconst_0
/*    */     //   210: lreturn
/*    */     //   211: ldc2_w -8509446276485615289
/*    */     //   214: lload_1
/*    */     //   215: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   220: athrow
/*    */     //   221: aload_0
/*    */     //   222: lload #12
/*    */     //   224: invokevirtual a : (J)Z
/*    */     //   227: istore #17
/*    */     //   229: aload_3
/*    */     //   230: lload #6
/*    */     //   232: iconst_1
/*    */     //   233: invokevirtual a : (JI)Lme/konsolas/aac/eV;
/*    */     //   236: astore #18
/*    */     //   238: lload #4
/*    */     //   240: sipush #8192
/*    */     //   243: aload #18
/*    */     //   245: getfield c : I
/*    */     //   248: isub
/*    */     //   249: i2l
/*    */     //   250: invokestatic min : (JJ)J
/*    */     //   253: l2i
/*    */     //   254: istore #19
/*    */     //   256: aload_0
/*    */     //   257: getfield b : Ljava/util/zip/Inflater;
/*    */     //   260: aload #18
/*    */     //   262: getfield h : [B
/*    */     //   265: aload #18
/*    */     //   267: getfield c : I
/*    */     //   270: iload #19
/*    */     //   272: invokevirtual inflate : ([BII)I
/*    */     //   275: istore #20
/*    */     //   277: iload #20
/*    */     //   279: lload_1
/*    */     //   280: lconst_0
/*    */     //   281: lcmp
/*    */     //   282: ifle -> 328
/*    */     //   285: ifle -> 321
/*    */     //   288: aload #18
/*    */     //   290: dup
/*    */     //   291: getfield c : I
/*    */     //   294: iload #20
/*    */     //   296: iadd
/*    */     //   297: putfield c : I
/*    */     //   300: aload_3
/*    */     //   301: dup
/*    */     //   302: getfield a : J
/*    */     //   305: iload #20
/*    */     //   307: i2l
/*    */     //   308: ladd
/*    */     //   309: putfield a : J
/*    */     //   312: iload #20
/*    */     //   314: i2l
/*    */     //   315: iload #16
/*    */     //   317: ifne -> 486
/*    */     //   320: lreturn
/*    */     //   321: aload_0
/*    */     //   322: getfield b : Ljava/util/zip/Inflater;
/*    */     //   325: invokevirtual finished : ()Z
/*    */     //   328: iload #16
/*    */     //   330: lload_1
/*    */     //   331: lconst_0
/*    */     //   332: lcmp
/*    */     //   333: iflt -> 449
/*    */     //   336: ifne -> 444
/*    */     //   339: ifne -> 402
/*    */     //   342: goto -> 355
/*    */     //   345: ldc2_w -8509446276485615289
/*    */     //   348: lload_1
/*    */     //   349: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   354: athrow
/*    */     //   355: aload_0
/*    */     //   356: getfield b : Ljava/util/zip/Inflater;
/*    */     //   359: invokevirtual needsDictionary : ()Z
/*    */     //   362: lload_1
/*    */     //   363: lconst_0
/*    */     //   364: lcmp
/*    */     //   365: ifle -> 489
/*    */     //   368: iload #16
/*    */     //   370: ifne -> 489
/*    */     //   373: goto -> 386
/*    */     //   376: ldc2_w -8509446276485615289
/*    */     //   379: lload_1
/*    */     //   380: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   385: athrow
/*    */     //   386: ifeq -> 487
/*    */     //   389: goto -> 402
/*    */     //   392: ldc2_w -8509446276485615289
/*    */     //   395: lload_1
/*    */     //   396: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   401: athrow
/*    */     //   402: aload_0
/*    */     //   403: lload #14
/*    */     //   405: invokespecial a : (J)V
/*    */     //   408: aload #18
/*    */     //   410: iload #16
/*    */     //   412: ifne -> 478
/*    */     //   415: goto -> 428
/*    */     //   418: ldc2_w -8509446276485615289
/*    */     //   421: lload_1
/*    */     //   422: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   427: athrow
/*    */     //   428: getfield d : I
/*    */     //   431: goto -> 444
/*    */     //   434: ldc2_w -8509446276485615289
/*    */     //   437: lload_1
/*    */     //   438: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   443: athrow
/*    */     //   444: aload #18
/*    */     //   446: getfield c : I
/*    */     //   449: if_icmpne -> 483
/*    */     //   452: aload_3
/*    */     //   453: aload #18
/*    */     //   455: lload #10
/*    */     //   457: invokevirtual b : (J)Lme/konsolas/aac/eV;
/*    */     //   460: putfield b : Lme/konsolas/aac/eV;
/*    */     //   463: aload #18
/*    */     //   465: goto -> 478
/*    */     //   468: ldc2_w -8509446276485615289
/*    */     //   471: lload_1
/*    */     //   472: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   477: athrow
/*    */     //   478: lload #8
/*    */     //   480: invokestatic a : (Lme/konsolas/aac/eV;J)V
/*    */     //   483: ldc2_w -1
/*    */     //   486: lreturn
/*    */     //   487: iload #17
/*    */     //   489: ifeq -> 523
/*    */     //   492: new java/io/EOFException
/*    */     //   495: dup
/*    */     //   496: sipush #1504
/*    */     //   499: ldc2_w 896505050427314727
/*    */     //   502: lload_1
/*    */     //   503: lxor
/*    */     //   504: <illegal opcode> j : (IJ)Ljava/lang/String;
/*    */     //   509: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   512: athrow
/*    */     //   513: ldc2_w -8509446276485615289
/*    */     //   516: lload_1
/*    */     //   517: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   522: athrow
/*    */     //   523: goto -> 538
/*    */     //   526: astore #18
/*    */     //   528: new java/io/IOException
/*    */     //   531: dup
/*    */     //   532: aload #18
/*    */     //   534: invokespecial <init> : (Ljava/lang/Throwable;)V
/*    */     //   537: athrow
/*    */     //   538: goto -> 221
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #29	-> 48
/*    */     //   #21	-> 122
/*    */     //   #19	-> 184
/*    */     //   #31	-> 221
/*    */     //   #23	-> 229
/*    */     //   #12	-> 238
/*    */     //   #27	-> 256
/*    */     //   #20	-> 277
/*    */     //   #5	-> 288
/*    */     //   #26	-> 300
/*    */     //   #24	-> 312
/*    */     //   #18	-> 321
/*    */     //   #42	-> 402
/*    */     //   #46	-> 408
/*    */     //   #48	-> 452
/*    */     //   #32	-> 463
/*    */     //   #34	-> 483
/*    */     //   #17	-> 487
/*    */     //   #10	-> 523
/*    */     //   #6	-> 526
/*    */     //   #41	-> 528
/*    */     //   #11	-> 538
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   48	60	63	java/util/zip/DataFormatException
/*    */     //   57	112	112	java/util/zip/DataFormatException
/*    */     //   126	140	143	java/util/zip/DataFormatException
/*    */     //   137	174	174	java/util/zip/DataFormatException
/*    */     //   188	196	199	java/util/zip/DataFormatException
/*    */     //   193	211	211	java/util/zip/DataFormatException
/*    */     //   229	315	526	java/util/zip/DataFormatException
/*    */     //   321	342	345	java/util/zip/DataFormatException
/*    */     //   321	486	526	java/util/zip/DataFormatException
/*    */     //   339	373	376	java/util/zip/DataFormatException
/*    */     //   355	389	392	java/util/zip/DataFormatException
/*    */     //   386	415	418	java/util/zip/DataFormatException
/*    */     //   402	431	434	java/util/zip/DataFormatException
/*    */     //   444	465	468	java/util/zip/DataFormatException
/*    */     //   487	523	526	java/util/zip/DataFormatException
/*    */     //   489	513	513	java/util/zip/DataFormatException
/*    */   } private void a(long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/h7.e : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: lload_1
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 105179146785554
/*    */     //   11: lxor
/*    */     //   12: lstore_3
/*    */     //   13: pop2
/*    */     //   14: ldc2_w -1900725269627609641
/*    */     //   17: lload_1
/*    */     //   18: <illegal opcode> w : (JJ)I
/*    */     //   23: istore #5
/*    */     //   25: aload_0
/*    */     //   26: getfield c : I
/*    */     //   29: iload #5
/*    */     //   31: ifeq -> 63
/*    */     //   34: ifne -> 51
/*    */     //   37: goto -> 50
/*    */     //   40: ldc2_w -1892293320156340974
/*    */     //   43: lload_1
/*    */     //   44: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   49: athrow
/*    */     //   50: return
/*    */     //   51: aload_0
/*    */     //   52: getfield c : I
/*    */     //   55: aload_0
/*    */     //   56: getfield b : Ljava/util/zip/Inflater;
/*    */     //   59: invokevirtual getRemaining : ()I
/*    */     //   62: isub
/*    */     //   63: istore #6
/*    */     //   65: aload_0
/*    */     //   66: dup
/*    */     //   67: getfield c : I
/*    */     //   70: iload #6
/*    */     //   72: isub
/*    */     //   73: putfield c : I
/*    */     //   76: aload_0
/*    */     //   77: getfield d : Lme/konsolas/aac/bX;
/*    */     //   80: iload #6
/*    */     //   82: i2l
/*    */     //   83: lload_3
/*    */     //   84: invokeinterface a : (JJ)V
/*    */     //   89: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #37	-> 25
/*    */     //   #8	-> 51
/*    */     //   #30	-> 65
/*    */     //   #15	-> 76
/*    */     //   #43	-> 89
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   25	37	40	java/io/IOException
/*    */   } public void close() {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/h7.e : J
/*    */     //   3: ldc2_w 10909696602747
/*    */     //   6: lxor
/*    */     //   7: lstore_1
/*    */     //   8: ldc2_w -4683518154902804168
/*    */     //   11: lload_1
/*    */     //   12: <illegal opcode> w : (JJ)I
/*    */     //   17: istore_3
/*    */     //   18: aload_0
/*    */     //   19: iload_3
/*    */     //   20: ifne -> 66
/*    */     //   23: getfield a : Z
/*    */     //   26: ifeq -> 53
/*    */     //   29: goto -> 42
/*    */     //   32: ldc2_w -4637798565842794740
/*    */     //   35: lload_1
/*    */     //   36: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   41: athrow
/*    */     //   42: return
/*    */     //   43: ldc2_w -4637798565842794740
/*    */     //   46: lload_1
/*    */     //   47: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   52: athrow
/*    */     //   53: aload_0
/*    */     //   54: getfield b : Ljava/util/zip/Inflater;
/*    */     //   57: invokevirtual end : ()V
/*    */     //   60: aload_0
/*    */     //   61: iconst_1
/*    */     //   62: putfield a : Z
/*    */     //   65: aload_0
/*    */     //   66: getfield d : Lme/konsolas/aac/bX;
/*    */     //   69: invokeinterface close : ()V
/*    */     //   74: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #38	-> 18
/*    */     //   #4	-> 53
/*    */     //   #49	-> 60
/*    */     //   #44	-> 65
/*    */     //   #47	-> 74
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   18	29	32	java/io/IOException
/*    */     //   23	43	43	java/io/IOException
/*    */   } public li a() {
/* 45 */     return this.d.a();
/*    */   }
/*    */   
/*    */   static {
/*    */     long l = e ^ 0x55D25F1A865FL;
/*    */     "?单ꦠ叀埴奂΄Ҋᏺ튫胿๋ᔋ辊侢놨྆ⵅ嵩ᣴ".toCharArray()[4] = (char)("?单ꦠ叀埴奂΄Ҋᏺ튫胿๋ᔋ辊侢놨྆ⵅ嵩ᣴ".toCharArray()[4] ^ 0x552A);
/*    */     "盥훨쫲ᕟ".toCharArray()[2] = (char)("盥훨쫲ᕟ".toCharArray()[2] ^ 0x205B);
/*    */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*    */     for (byte b1 = 1; b1 < 8; b1++)
/*    */       (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
/*    */     Cipher cipher;
/*    */     (cipher = Cipher.getInstance(hY$g6.H("?单ꦠ叀埴奂΄Ҋᏺ튫胿๋ᔋ辊侢놨྆ⵅ嵩ᣴ".toCharArray(), (short)25491, (byte)5, (byte)2))).init(2, SecretKeyFactory.getInstance(hY$g6.H("盥훨쫲ᕟ".toCharArray(), (short)3811, (byte)5, (byte)0)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*    */     String[] arrayOfString = new String[5];
/*    */     boolean bool = false;
/*    */     "⧇榼῾㎷鲜廟돯곦拡姭욌ﴗ퉠䇕ࣘ糀ফ菻⹵핣⬘沿ﷳﵛୂ癪넔粐珆벢ꗃ﨡씇札ꬢ⾜鱴竳朄뱋?Ⱖ丗癮䭛듃탴쇮Ʌᑆ황꺊孱奲舉텋特驤ドꇢ㏠岑?偾ׯ盙㝳ె紼뫫⿴䃧腐政层儲ꓽ㺶ᛘ쁚ꉈ妗뒫ﮮ쁸Ⓒ鋐ằ敞?纻攃窼䔎鼠爣㹹ꬅ鵿ợ㝠⸜挄亩⃰䎍ꆻ갗￥燗".toCharArray()[36] = (char)("⧇榼῾㎷鲜廟돯곦拡姭욌ﴗ퉠䇕ࣘ糀ফ菻⹵핣⬘沿ﷳﵛୂ癪넔粐珆벢ꗃ﨡씇札ꬢ⾜鱴竳朄뱋?Ⱖ丗癮䭛듃탴쇮Ʌᑆ황꺊孱奲舉텋特驤ドꇢ㏠岑?偾ׯ盙㝳ె紼뫫⿴䃧腐政层儲ꓽ㺶ᛘ쁚ꉈ妗뒫ﮮ쁸Ⓒ鋐ằ敞?纻攃窼䔎鼠爣㹹ꬅ鵿ợ㝠⸜挄亩⃰䎍ꆻ갗￥燗".toCharArray()[36] ^ 0x285);
/*    */     String str;
/*    */     int i = (str = hY$g6.H("⧇榼῾㎷鲜廟돯곦拡姭욌ﴗ퉠䇕ࣘ糀ফ菻⹵핣⬘沿ﷳﵛୂ癪넔粐珆벢ꗃ﨡씇札ꬢ⾜鱴竳朄뱋?Ⱖ丗癮䭛듃탴쇮Ʌᑆ황꺊孱奲舉텋特驤ドꇢ㏠岑?偾ׯ盙㝳ె紼뫫⿴䃧腐政层儲ꓽ㺶ᛘ쁚ꉈ妗뒫ﮮ쁸Ⓒ鋐ằ敞?纻攃窼䔎鼠爣㹹ꬅ鵿ợ㝠⸜挄亩⃰䎍ꆻ갗￥燗".toCharArray(), (short)2355, (byte)5, (byte)1)).length();
/*    */     byte b2 = 32;
/*    */     byte b = -1;
/*    */     while (true);
/*    */   }
/*    */   
/*    */   private static Exception a(Exception paramException) {
/*    */     return paramException;
/*    */   }
/*    */   
/*    */   private static String a(byte[] paramArrayOfbyte) {
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
/*    */   private static String a(int paramInt, long paramLong) {
/*    */     int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x5F0E;
/*    */     if (g[i] == null) {
/*    */       Object[] arrayOfObject;
/*    */       try {
/*    */         Long long_ = Long.valueOf(Thread.currentThread().getId());
/*    */         arrayOfObject = (Object[])h.get(long_);
/*    */         if (arrayOfObject == null) {
/*    */           arrayOfObject = new Object[3];
/*    */           "⿸꛳郩㐋ૻ⹺땔▒苆웊夗瓮ऀᲝ梹眭駴纂縩秓想".toCharArray()[18] = (char)("⿸꛳郩㐋ૻ⹺땔▒苆웊夗瓮ऀᲝ梹眭駴纂縩秓想".toCharArray()[18] ^ 0x1A67);
/*    */           arrayOfObject[0] = Cipher.getInstance(da$gx.U("⿸꛳郩㐋ૻ⹺땔▒苆웊夗瓮ऀᲝ梹眭駴纂縩秓想".toCharArray(), (short)14624, true, false));
/*    */           "귗ᰜ㒔獛".toCharArray()[2] = (char)("귗ᰜ㒔獛".toCharArray()[2] ^ 0x62C3);
/*    */           arrayOfObject[1] = SecretKeyFactory.getInstance(da$gx.U("귗ᰜ㒔獛".toCharArray(), (short)1631, true, false));
/*    */           arrayOfObject[2] = new IvParameterSpec(new byte[8]);
/*    */           h.put(long_, arrayOfObject);
/*    */         } 
/*    */       } catch (Exception exception) {
/*    */         "瑊喌숏贵ꗊ䏢Ῐ䚵Š䫚攡뿴㪀ἤ迢羍⢖汳".toCharArray()[5] = (char)("瑊喌숏贵ꗊ䏢Ῐ䚵Š䫚攡뿴㪀ἤ迢羍⢖汳".toCharArray()[5] ^ 0x523);
/*    */         throw new RuntimeException(da$gx.U("瑊喌숏贵ꗊ䏢Ῐ䚵Š䫚攡뿴㪀ἤ迢羍⢖汳".toCharArray(), (short)20731, false, false), exception);
/*    */       } 
/*    */       byte[] arrayOfByte1 = new byte[8];
/*    */       arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
/*    */       for (byte b = 1; b < 8; b++)
/*    */         arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
/*    */       DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
/*    */       SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
/*    */       ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
/*    */       "퇹ꞔ恚⇦䚒᛺屝믐ὶ層欓".toCharArray()[5] = (char)("퇹ꞔ恚⇦䚒᛺屝믐ὶ層欓".toCharArray()[5] ^ 0x500F);
/*    */       byte[] arrayOfByte2 = f[i].getBytes(da$gx.U("퇹ꞔ恚⇦䚒᛺屝믐ὶ層欓".toCharArray(), (short)27043, false, false));
/*    */       g[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
/*    */     } 
/*    */     return g[i];
/*    */   }
/*    */   
/*    */   private static Object a(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
/*    */     int i = ((Integer)paramArrayOfObject[0]).intValue();
/*    */     long l = ((Long)paramArrayOfObject[1]).longValue();
/*    */     String str = a(i, l);
/*    */     MethodHandle methodHandle = MethodHandles.constant(String.class, str);
/*    */     paramMutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[] { int.class, long.class }));
/*    */     return str;
/*    */   }
/*    */   
/*    */   private static CallSite a(MethodHandles.Lookup paramLookup, String paramString, MethodType paramMethodType) {
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
/*    */     //   66: ldc_w '앟ߨ溽ጏ螶좵鎲♡戗띫惩ظ뚴ꨝ?Њꏀç'
/*    */     //   69: invokevirtual toCharArray : ()[C
/*    */     //   72: dup
/*    */     //   73: dup
/*    */     //   74: bipush #7
/*    */     //   76: dup_x1
/*    */     //   77: caload
/*    */     //   78: sipush #1164
/*    */     //   81: ixor
/*    */     //   82: i2c
/*    */     //   83: castore
/*    */     //   84: sipush #6529
/*    */     //   87: iconst_0
/*    */     //   88: iconst_0
/*    */     //   89: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   95: ldc_w '㭵ꝫ栳ၒ'
/*    */     //   98: invokevirtual toCharArray : ()[C
/*    */     //   101: dup
/*    */     //   102: dup
/*    */     //   103: iconst_1
/*    */     //   104: dup_x1
/*    */     //   105: caload
/*    */     //   106: sipush #13055
/*    */     //   109: ixor
/*    */     //   110: i2c
/*    */     //   111: castore
/*    */     //   112: sipush #24032
/*    */     //   115: iconst_2
/*    */     //   116: iconst_3
/*    */     //   117: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   123: aload_1
/*    */     //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   127: ldc_w '䗙팷綂Ӳ'
/*    */     //   130: invokevirtual toCharArray : ()[C
/*    */     //   133: dup
/*    */     //   134: dup
/*    */     //   135: iconst_0
/*    */     //   136: dup_x1
/*    */     //   137: caload
/*    */     //   138: sipush #24307
/*    */     //   141: ixor
/*    */     //   142: i2c
/*    */     //   143: castore
/*    */     //   144: sipush #11772
/*    */     //   147: iconst_3
/*    */     //   148: iconst_2
/*    */     //   149: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
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


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\h7.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */