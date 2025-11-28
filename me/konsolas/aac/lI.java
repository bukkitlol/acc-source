/*    */ package me.konsolas.aac;
/*    */ public class li { public static final li a; private boolean d;
/*    */   private long b;
/*    */   private long c;
/*    */   
/*  6 */   public li a(long paramLong) { this.d = true;
/*    */ 
/*    */     
/*  9 */     this.b = paramLong;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 19 */     return this; }
/*    */   private static final long o;
/*    */   private static final String[] p;
/*    */   private static final String[] q;
/*    */   private static final Map r; public boolean a() { return this.d; } public li a(long paramLong1, long paramLong2, TimeUnit paramTimeUnit) { // Byte code:
/*    */     //   0: lload_3
/*    */     //   1: lconst_0
/*    */     //   2: lcmp
/*    */     //   3: iflt -> 60
/*    */     //   6: lload_1
/*    */     //   7: lconst_0
/*    */     //   8: lcmp
/*    */     //   9: ifge -> 60
/*    */     //   12: new java/lang/IllegalArgumentException
/*    */     //   15: dup
/*    */     //   16: new java/lang/StringBuilder
/*    */     //   19: dup
/*    */     //   20: invokespecial <init> : ()V
/*    */     //   23: sipush #20440
/*    */     //   26: ldc2_w 1935063673620166605
/*    */     //   29: lload_3
/*    */     //   30: lxor
/*    */     //   31: <illegal opcode> s : (IJ)Ljava/lang/String;
/*    */     //   36: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   39: lload_1
/*    */     //   40: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*    */     //   43: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   46: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   49: athrow
/*    */     //   50: ldc2_w -8042402204853583800
/*    */     //   53: lload_3
/*    */     //   54: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   59: athrow
/*    */     //   60: lload_3
/*    */     //   61: lconst_0
/*    */     //   62: lcmp
/*    */     //   63: iflt -> 112
/*    */     //   66: aload #5
/*    */     //   68: ifnonnull -> 102
/*    */     //   71: new java/lang/IllegalArgumentException
/*    */     //   74: dup
/*    */     //   75: sipush #29493
/*    */     //   78: ldc2_w 1793957399073835810
/*    */     //   81: lload_3
/*    */     //   82: lxor
/*    */     //   83: <illegal opcode> s : (IJ)Ljava/lang/String;
/*    */     //   88: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   91: athrow
/*    */     //   92: ldc2_w -8042402204853583800
/*    */     //   95: lload_3
/*    */     //   96: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   101: athrow
/*    */     //   102: aload_0
/*    */     //   103: aload #5
/*    */     //   105: lload_1
/*    */     //   106: invokevirtual toNanos : (J)J
/*    */     //   109: putfield c : J
/*    */     //   112: aload_0
/*    */     //   113: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #8	-> 0
/*    */     //   #25	-> 60
/*    */     //   #30	-> 102
/*    */     //   #17	-> 112
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   0	50	50	java/lang/IllegalArgumentException
/*    */     //   60	92	92	java/lang/IllegalArgumentException } public void a(long paramLong) { // Byte code:
/*    */     //   0: ldc2_w -5880963041449019302
/*    */     //   3: lload_1
/*    */     //   4: <illegal opcode> w : (JJ)I
/*    */     //   9: istore_3
/*    */     //   10: invokestatic interrupted : ()Z
/*    */     //   13: iload_3
/*    */     //   14: lload_1
/*    */     //   15: lconst_0
/*    */     //   16: lcmp
/*    */     //   17: ifle -> 87
/*    */     //   20: ifne -> 80
/*    */     //   23: ifeq -> 76
/*    */     //   26: goto -> 39
/*    */     //   29: ldc2_w -5855278160187588970
/*    */     //   32: lload_1
/*    */     //   33: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   38: athrow
/*    */     //   39: invokestatic currentThread : ()Ljava/lang/Thread;
/*    */     //   42: invokevirtual interrupt : ()V
/*    */     //   45: new java/io/InterruptedIOException
/*    */     //   48: dup
/*    */     //   49: sipush #3816
/*    */     //   52: ldc2_w 530214052250388514
/*    */     //   55: lload_1
/*    */     //   56: lxor
/*    */     //   57: <illegal opcode> s : (IJ)Ljava/lang/String;
/*    */     //   62: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   65: athrow
/*    */     //   66: ldc2_w -5855278160187588970
/*    */     //   69: lload_1
/*    */     //   70: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   75: athrow
/*    */     //   76: aload_0
/*    */     //   77: getfield d : Z
/*    */     //   80: lload_1
/*    */     //   81: lconst_0
/*    */     //   82: lcmp
/*    */     //   83: ifle -> 129
/*    */     //   86: iload_3
/*    */     //   87: ifne -> 129
/*    */     //   90: ifeq -> 163
/*    */     //   93: goto -> 106
/*    */     //   96: ldc2_w -5855278160187588970
/*    */     //   99: lload_1
/*    */     //   100: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   105: athrow
/*    */     //   106: aload_0
/*    */     //   107: getfield b : J
/*    */     //   110: invokestatic nanoTime : ()J
/*    */     //   113: lsub
/*    */     //   114: lconst_0
/*    */     //   115: lcmp
/*    */     //   116: goto -> 129
/*    */     //   119: ldc2_w -5855278160187588970
/*    */     //   122: lload_1
/*    */     //   123: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   128: athrow
/*    */     //   129: ifgt -> 163
/*    */     //   132: new java/io/InterruptedIOException
/*    */     //   135: dup
/*    */     //   136: sipush #22000
/*    */     //   139: ldc2_w 402692559845249853
/*    */     //   142: lload_1
/*    */     //   143: lxor
/*    */     //   144: <illegal opcode> s : (IJ)Ljava/lang/String;
/*    */     //   149: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   152: athrow
/*    */     //   153: ldc2_w -5855278160187588970
/*    */     //   156: lload_1
/*    */     //   157: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   162: athrow
/*    */     //   163: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #11	-> 10
/*    */     //   #29	-> 39
/*    */     //   #39	-> 45
/*    */     //   #1	-> 76
/*    */     //   #14	-> 132
/*    */     //   #53	-> 163
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   10	26	29	java/io/IOException
/*    */     //   23	66	66	java/io/IOException
/*    */     //   80	93	96	java/io/IOException
/*    */     //   90	116	119	java/io/IOException
/*    */     //   129	153	153	java/io/IOException } public long a(int paramInt1, int paramInt2) { // Byte code:
/*    */     //   0: iload_1
/*    */     //   1: i2l
/*    */     //   2: bipush #32
/*    */     //   4: lshl
/*    */     //   5: iload_2
/*    */     //   6: i2l
/*    */     //   7: bipush #32
/*    */     //   9: lshl
/*    */     //   10: bipush #32
/*    */     //   12: lushr
/*    */     //   13: lor
/*    */     //   14: lstore_3
/*    */     //   15: ldc2_w 4525684075853776518
/*    */     //   18: lload_3
/*    */     //   19: <illegal opcode> w : (JJ)I
/*    */     //   24: istore #5
/*    */     //   26: aload_0
/*    */     //   27: iload #5
/*    */     //   29: ifeq -> 83
/*    */     //   32: getfield d : Z
/*    */     //   35: ifne -> 82
/*    */     //   38: goto -> 51
/*    */     //   41: ldc2_w 4508313815029116603
/*    */     //   44: lload_3
/*    */     //   45: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   50: athrow
/*    */     //   51: new java/lang/IllegalStateException
/*    */     //   54: dup
/*    */     //   55: sipush #4616
/*    */     //   58: ldc2_w 5644401073336419563
/*    */     //   61: lload_3
/*    */     //   62: lxor
/*    */     //   63: <illegal opcode> s : (IJ)Ljava/lang/String;
/*    */     //   68: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   71: athrow
/*    */     //   72: ldc2_w 4508313815029116603
/*    */     //   75: lload_3
/*    */     //   76: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   81: athrow
/*    */     //   82: aload_0
/*    */     //   83: getfield b : J
/*    */     //   86: lreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #20	-> 26
/*    */     //   #47	-> 82
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   26	38	41	java/lang/IllegalArgumentException
/* 23 */     //   32	72	72	java/lang/IllegalArgumentException } public li b() { this.d = false;
/*    */     return this; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final void a(Object paramObject, char paramChar, long paramLong) {
/*    */     // Byte code:
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
/*    */     //   13: getstatic me/konsolas/aac/li.o : J
/*    */     //   16: lxor
/*    */     //   17: lstore #5
/*    */     //   19: lload #5
/*    */     //   21: dup2
/*    */     //   22: ldc2_w 98015109008951
/*    */     //   25: lxor
/*    */     //   26: dup2
/*    */     //   27: bipush #32
/*    */     //   29: lushr
/*    */     //   30: l2i
/*    */     //   31: istore #7
/*    */     //   33: dup2
/*    */     //   34: bipush #32
/*    */     //   36: lshl
/*    */     //   37: bipush #32
/*    */     //   39: lushr
/*    */     //   40: l2i
/*    */     //   41: istore #8
/*    */     //   43: pop2
/*    */     //   44: pop2
/*    */     //   45: ldc2_w 8140586818587936945
/*    */     //   48: lload #5
/*    */     //   50: <illegal opcode> w : (JJ)I
/*    */     //   55: istore #9
/*    */     //   57: aload_0
/*    */     //   58: invokevirtual a : ()Z
/*    */     //   61: istore #10
/*    */     //   63: aload_0
/*    */     //   64: invokevirtual b : ()J
/*    */     //   67: lstore #11
/*    */     //   69: iload #10
/*    */     //   71: iload #9
/*    */     //   73: ifeq -> 130
/*    */     //   76: ifne -> 138
/*    */     //   79: goto -> 93
/*    */     //   82: ldc2_w 8117710444116484236
/*    */     //   85: lload #5
/*    */     //   87: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   92: athrow
/*    */     //   93: lload #11
/*    */     //   95: iload #9
/*    */     //   97: ifeq -> 141
/*    */     //   100: goto -> 114
/*    */     //   103: ldc2_w 8117710444116484236
/*    */     //   106: lload #5
/*    */     //   108: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   113: athrow
/*    */     //   114: lconst_0
/*    */     //   115: lcmp
/*    */     //   116: goto -> 130
/*    */     //   119: ldc2_w 8117710444116484236
/*    */     //   122: lload #5
/*    */     //   124: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   129: athrow
/*    */     //   130: ifne -> 138
/*    */     //   133: aload_1
/*    */     //   134: invokevirtual wait : ()V
/*    */     //   137: return
/*    */     //   138: invokestatic nanoTime : ()J
/*    */     //   141: lstore #15
/*    */     //   143: iload #10
/*    */     //   145: iload #9
/*    */     //   147: ifeq -> 254
/*    */     //   150: ifeq -> 238
/*    */     //   153: goto -> 167
/*    */     //   156: ldc2_w 8117710444116484236
/*    */     //   159: lload #5
/*    */     //   161: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   166: athrow
/*    */     //   167: lload #11
/*    */     //   169: lconst_0
/*    */     //   170: lcmp
/*    */     //   171: iload #9
/*    */     //   173: ifeq -> 254
/*    */     //   176: goto -> 190
/*    */     //   179: ldc2_w 8117710444116484236
/*    */     //   182: lload #5
/*    */     //   184: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   189: athrow
/*    */     //   190: ifeq -> 238
/*    */     //   193: goto -> 207
/*    */     //   196: ldc2_w 8117710444116484236
/*    */     //   199: lload #5
/*    */     //   201: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   206: athrow
/*    */     //   207: aload_0
/*    */     //   208: iload #7
/*    */     //   210: iload #8
/*    */     //   212: invokevirtual a : (II)J
/*    */     //   215: lload #15
/*    */     //   217: lsub
/*    */     //   218: lstore #17
/*    */     //   220: lload #11
/*    */     //   222: lload #17
/*    */     //   224: invokestatic min : (JJ)J
/*    */     //   227: lstore #13
/*    */     //   229: iload #9
/*    */     //   231: iload_2
/*    */     //   232: iflt -> 290
/*    */     //   235: ifne -> 283
/*    */     //   238: iload #10
/*    */     //   240: goto -> 254
/*    */     //   243: ldc2_w 8117710444116484236
/*    */     //   246: lload #5
/*    */     //   248: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   253: athrow
/*    */     //   254: ifeq -> 279
/*    */     //   257: aload_0
/*    */     //   258: iload #7
/*    */     //   260: iload #8
/*    */     //   262: invokevirtual a : (II)J
/*    */     //   265: lload #15
/*    */     //   267: lsub
/*    */     //   268: iload_2
/*    */     //   269: iflt -> 281
/*    */     //   272: lstore #13
/*    */     //   274: iload #9
/*    */     //   276: ifne -> 283
/*    */     //   279: lload #11
/*    */     //   281: lstore #13
/*    */     //   283: lconst_0
/*    */     //   284: lstore #17
/*    */     //   286: lload #13
/*    */     //   288: lconst_0
/*    */     //   289: lcmp
/*    */     //   290: iload_2
/*    */     //   291: iflt -> 353
/*    */     //   294: iload #9
/*    */     //   296: ifeq -> 353
/*    */     //   299: ifle -> 348
/*    */     //   302: goto -> 316
/*    */     //   305: ldc2_w 8117710444116484236
/*    */     //   308: lload #5
/*    */     //   310: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   315: athrow
/*    */     //   316: lload #13
/*    */     //   318: ldc2_w 1000000
/*    */     //   321: ldiv
/*    */     //   322: lstore #19
/*    */     //   324: aload_1
/*    */     //   325: lload #19
/*    */     //   327: lload #13
/*    */     //   329: lload #19
/*    */     //   331: ldc2_w 1000000
/*    */     //   334: lmul
/*    */     //   335: lsub
/*    */     //   336: l2i
/*    */     //   337: invokevirtual wait : (JI)V
/*    */     //   340: invokestatic nanoTime : ()J
/*    */     //   343: lload #15
/*    */     //   345: lsub
/*    */     //   346: lstore #17
/*    */     //   348: lload #17
/*    */     //   350: lload #13
/*    */     //   352: lcmp
/*    */     //   353: iflt -> 389
/*    */     //   356: new java/io/InterruptedIOException
/*    */     //   359: dup
/*    */     //   360: sipush #4699
/*    */     //   363: ldc2_w 4193228957994961545
/*    */     //   366: lload #5
/*    */     //   368: lxor
/*    */     //   369: <illegal opcode> s : (IJ)Ljava/lang/String;
/*    */     //   374: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   377: athrow
/*    */     //   378: ldc2_w 8117710444116484236
/*    */     //   381: lload #5
/*    */     //   383: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   388: athrow
/*    */     //   389: goto -> 422
/*    */     //   392: astore #10
/*    */     //   394: invokestatic currentThread : ()Ljava/lang/Thread;
/*    */     //   397: invokevirtual interrupt : ()V
/*    */     //   400: new java/io/InterruptedIOException
/*    */     //   403: dup
/*    */     //   404: sipush #20707
/*    */     //   407: ldc2_w 247452707729901627
/*    */     //   410: lload #5
/*    */     //   412: lxor
/*    */     //   413: <illegal opcode> s : (IJ)Ljava/lang/String;
/*    */     //   418: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   421: athrow
/*    */     //   422: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #27	-> 57
/*    */     //   #33	-> 63
/*    */     //   #10	-> 69
/*    */     //   #35	-> 133
/*    */     //   #15	-> 137
/*    */     //   #50	-> 138
/*    */     //   #24	-> 143
/*    */     //   #4	-> 207
/*    */     //   #32	-> 220
/*    */     //   #37	-> 229
/*    */     //   #5	-> 257
/*    */     //   #28	-> 279
/*    */     //   #3	-> 283
/*    */     //   #38	-> 286
/*    */     //   #41	-> 316
/*    */     //   #40	-> 324
/*    */     //   #42	-> 340
/*    */     //   #55	-> 348
/*    */     //   #18	-> 356
/*    */     //   #26	-> 389
/*    */     //   #51	-> 392
/*    */     //   #21	-> 394
/*    */     //   #44	-> 400
/*    */     //   #49	-> 422
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   57	137	392	java/lang/InterruptedException
/*    */     //   69	79	82	java/lang/InterruptedException
/*    */     //   76	100	103	java/lang/InterruptedException
/*    */     //   93	116	119	java/lang/InterruptedException
/*    */     //   138	389	392	java/lang/InterruptedException
/*    */     //   143	153	156	java/lang/InterruptedException
/*    */     //   150	176	179	java/lang/InterruptedException
/*    */     //   167	193	196	java/lang/InterruptedException
/*    */     //   229	240	243	java/lang/InterruptedException
/*    */     //   286	302	305	java/lang/InterruptedException
/*    */     //   353	378	378	java/lang/InterruptedException
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   static long a(long paramLong1, int paramInt, char paramChar1, char paramChar2, long paramLong2) {
/*    */     // Byte code:
/*    */     //   0: iload_2
/*    */     //   1: i2l
/*    */     //   2: bipush #32
/*    */     //   4: lshl
/*    */     //   5: iload_3
/*    */     //   6: i2l
/*    */     //   7: bipush #48
/*    */     //   9: lshl
/*    */     //   10: bipush #32
/*    */     //   12: lushr
/*    */     //   13: lor
/*    */     //   14: iload #4
/*    */     //   16: i2l
/*    */     //   17: bipush #48
/*    */     //   19: lshl
/*    */     //   20: bipush #48
/*    */     //   22: lushr
/*    */     //   23: lor
/*    */     //   24: getstatic me/konsolas/aac/li.o : J
/*    */     //   27: lxor
/*    */     //   28: lstore #7
/*    */     //   30: ldc2_w -3810846479491665067
/*    */     //   33: lload #7
/*    */     //   35: <illegal opcode> w : (JJ)I
/*    */     //   40: istore #9
/*    */     //   42: lload_0
/*    */     //   43: lconst_0
/*    */     //   44: lcmp
/*    */     //   45: iload #9
/*    */     //   47: ifeq -> 85
/*    */     //   50: ifne -> 81
/*    */     //   53: goto -> 67
/*    */     //   56: ldc2_w -3799932636844385432
/*    */     //   59: lload #7
/*    */     //   61: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   66: athrow
/*    */     //   67: lload #5
/*    */     //   69: lreturn
/*    */     //   70: ldc2_w -3799932636844385432
/*    */     //   73: lload #7
/*    */     //   75: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   80: athrow
/*    */     //   81: lload #5
/*    */     //   83: lconst_0
/*    */     //   84: lcmp
/*    */     //   85: iload_2
/*    */     //   86: ifle -> 147
/*    */     //   89: iload #9
/*    */     //   91: ifeq -> 147
/*    */     //   94: ifne -> 124
/*    */     //   97: goto -> 111
/*    */     //   100: ldc2_w -3799932636844385432
/*    */     //   103: lload #7
/*    */     //   105: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   110: athrow
/*    */     //   111: lload_0
/*    */     //   112: lreturn
/*    */     //   113: ldc2_w -3799932636844385432
/*    */     //   116: lload #7
/*    */     //   118: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   123: athrow
/*    */     //   124: lload_0
/*    */     //   125: iload #9
/*    */     //   127: ifeq -> 165
/*    */     //   130: lload #5
/*    */     //   132: lcmp
/*    */     //   133: goto -> 147
/*    */     //   136: ldc2_w -3799932636844385432
/*    */     //   139: lload #7
/*    */     //   141: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   146: athrow
/*    */     //   147: ifge -> 163
/*    */     //   150: lload_0
/*    */     //   151: lreturn
/*    */     //   152: ldc2_w -3799932636844385432
/*    */     //   155: lload #7
/*    */     //   157: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   162: athrow
/*    */     //   163: lload #5
/*    */     //   165: lreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #36	-> 42
/*    */     //   #34	-> 81
/*    */     //   #22	-> 124
/*    */     //   #31	-> 163
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   42	53	56	java/lang/IllegalArgumentException
/*    */     //   50	70	70	java/lang/IllegalArgumentException
/*    */     //   85	97	100	java/lang/IllegalArgumentException
/*    */     //   94	113	113	java/lang/IllegalArgumentException
/*    */     //   124	133	136	java/lang/IllegalArgumentException
/*    */     //   147	152	152	java/lang/IllegalArgumentException
/*    */   }
/*    */ 
/*    */   
/*    */   static {
/*    */     long l;
/*    */     byte b1;
/* 43 */     for (o = nc.a(1460588079100067900L, -3999773895176578298L, MethodHandles.lookup().lookupClass()).a(154168434484432L), r = new HashMap<>(13), l = o ^ 0x762EEC540D50L, "૸鬳镴比텇?ᑒ槐砃툧٣뱮䚵᝕錄쏥糥≻".toCharArray()[19] = (char)("૸鬳镴比텇?ᑒ槐砃툧٣뱮䚵᝕錄쏥糥≻".toCharArray()[19] ^ 0x3618), "伏톌䯕ᅤ".toCharArray()[0] = (char)("伏톌䯕ᅤ".toCharArray()[0] ^ 0x4EC2), (new byte[8])[0] = (byte)(int)(l >>> 56L), b1 = 1; b1 < 8; ) { (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); b1++; }  Cipher cipher; (cipher = Cipher.getInstance(hY$g6.H("૸鬳镴比텇?ᑒ槐砃툧٣뱮䚵᝕錄쏥糥≻".toCharArray(), (short)26422, (byte)2, (byte)5))).init(2, SecretKeyFactory.getInstance(hY$g6.H("伏톌䯕ᅤ".toCharArray(), (short)21653, (byte)0, (byte)3)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8])); String[] arrayOfString = new String[9]; boolean bool = false; "극齠醖㦪㉱ࣚ⵶甔 ⸽媏硜ᳱ晐끥雾섛ই뺷졔⺄麦䧹팎﨧ሧ篤䇯⮴⧒T纷༊컅ಸ鸻짃鯅밒婺㢺隧䇍㜣춚뮸ຼ릩翙ᒮ繎䑵賋ྂ⎝ऌዉ䟊䔜騮??늼ߨ￯덜慖졦킑䚣ﱑ︄?舼酲윸鋣鄕뛘糁鹳㫢ꢳᰦᄯ葜᯻뒱⼘퀝佑জＨ?ᬹ镫䀪官걘酣꿇쨗?悧岭蒉係髊㠐Ꚃ룤野忍友࣢ꗴ覔扜蔮?挹↙柆த㎾ቷ亿熬ꝩ瑗䁎Ƒ죵以캫묡䰕쿋紿闳䤦ᥤ燰⁇?晔뫒洸∂솈巇波勲ᙥ蟣ᝲ諫ﰻ뒺암촎甯䞘髓斳".toCharArray()[180] = (char)("극齠醖㦪㉱ࣚ⵶甔 ⸽媏硜ᳱ晐끥雾섛ই뺷졔⺄麦䧹팎﨧ሧ篤䇯⮴⧒T纷༊컅ಸ鸻짃鯅밒婺㢺隧䇍㜣춚뮸ຼ릩翙ᒮ繎䑵賋ྂ⎝ऌዉ䟊䔜騮??늼ߨ￯덜慖졦킑䚣ﱑ︄?舼酲윸鋣鄕뛘糁鹳㫢ꢳᰦᄯ葜᯻뒱⼘퀝佑জＨ?ᬹ镫䀪官걘酣꿇쨗?悧岭蒉係髊㠐Ꚃ룤野忍友࣢ꗴ覔扜蔮?挹↙柆த㎾ቷ亿熬ꝩ瑗䁎Ƒ죵以캫묡䰕쿋紿闳䤦ᥤ燰⁇?晔뫒洸∂솈巇波勲ᙥ蟣ᝲ諫ﰻ뒺암촎甯䞘髓斳".toCharArray()[180] ^ 0x47AA); String str; int i = (str = hY$g6.H("극齠醖㦪㉱ࣚ⵶甔 ⸽媏硜ᳱ晐끥雾섛ই뺷졔⺄麦䧹팎﨧ሧ篤䇯⮴⧒T纷༊컅ಸ鸻짃鯅밒婺㢺隧䇍㜣춚뮸ຼ릩翙ᒮ繎䑵賋ྂ⎝ऌዉ䟊䔜騮??늼ߨ￯덜慖졦킑䚣ﱑ︄?舼酲윸鋣鄕뛘糁鹳㫢ꢳᰦᄯ葜᯻뒱⼘퀝佑জＨ?ᬹ镫䀪官걘酣꿇쨗?悧岭蒉係髊㠐Ꚃ룤野忍友࣢ꗴ覔扜蔮?挹↙柆த㎾ቷ亿熬ꝩ瑗䁎Ƒ죵以캫묡䰕쿋紿闳䤦ᥤ燰⁇?晔뫒洸∂솈巇波勲ᙥ蟣ᝲ諫ﰻ뒺암촎甯䞘髓斳".toCharArray(), (short)3797, (byte)2, (byte)2)).length(); byte b2 = 32; byte b = -1;
/*    */     while (true);
/*    */   } public long b() {
/* 46 */     return this.c;
/*    */   } public li a() {
/* 48 */     this.c = 0L;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 54 */     return this;
/*    */   }
/*    */   
/*    */   public final li b(long paramLong1, byte paramByte, long paramLong2, TimeUnit paramTimeUnit) {
/*    */     // Byte code:
/*    */     //   0: lload_1
/*    */     //   1: bipush #8
/*    */     //   3: lshl
/*    */     //   4: iload_3
/*    */     //   5: i2l
/*    */     //   6: bipush #56
/*    */     //   8: lshl
/*    */     //   9: bipush #56
/*    */     //   11: lushr
/*    */     //   12: lor
/*    */     //   13: getstatic me/konsolas/aac/li.o : J
/*    */     //   16: lxor
/*    */     //   17: lstore #7
/*    */     //   19: lload #4
/*    */     //   21: lconst_0
/*    */     //   22: lcmp
/*    */     //   23: ifgt -> 77
/*    */     //   26: new java/lang/IllegalArgumentException
/*    */     //   29: dup
/*    */     //   30: new java/lang/StringBuilder
/*    */     //   33: dup
/*    */     //   34: invokespecial <init> : ()V
/*    */     //   37: sipush #16353
/*    */     //   40: ldc2_w 4894105889605924278
/*    */     //   43: lload #7
/*    */     //   45: lxor
/*    */     //   46: <illegal opcode> s : (IJ)Ljava/lang/String;
/*    */     //   51: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   54: lload #4
/*    */     //   56: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*    */     //   59: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   62: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   65: athrow
/*    */     //   66: ldc2_w -6762734666389425650
/*    */     //   69: lload #7
/*    */     //   71: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   76: athrow
/*    */     //   77: aload #6
/*    */     //   79: ifnonnull -> 115
/*    */     //   82: new java/lang/IllegalArgumentException
/*    */     //   85: dup
/*    */     //   86: sipush #6568
/*    */     //   89: ldc2_w 8460871276354900988
/*    */     //   92: lload #7
/*    */     //   94: lxor
/*    */     //   95: <illegal opcode> s : (IJ)Ljava/lang/String;
/*    */     //   100: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   103: athrow
/*    */     //   104: ldc2_w -6762734666389425650
/*    */     //   107: lload #7
/*    */     //   109: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   114: athrow
/*    */     //   115: aload_0
/*    */     //   116: invokestatic nanoTime : ()J
/*    */     //   119: aload #6
/*    */     //   121: lload #4
/*    */     //   123: invokevirtual toNanos : (J)J
/*    */     //   126: ladd
/*    */     //   127: invokevirtual a : (J)Lme/konsolas/aac/li;
/*    */     //   130: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #52	-> 19
/*    */     //   #2	-> 77
/*    */     //   #45	-> 115
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   19	66	66	java/lang/IllegalArgumentException
/*    */     //   77	104	104	java/lang/IllegalArgumentException
/*    */   }
/*    */   
/*    */   private static Exception b(Exception paramException) {
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
/*    */     int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x292B;
/*    */     if (q[i] == null) {
/*    */       Object[] arrayOfObject;
/*    */       try {
/*    */         Long long_ = Long.valueOf(Thread.currentThread().getId());
/*    */         arrayOfObject = (Object[])r.get(long_);
/*    */         if (arrayOfObject == null) {
/*    */           arrayOfObject = new Object[3];
/*    */           "焉巟შ㪂ｨᯇ쾈閆ꎆ愷듕ᢃ㌺൶魇࡯䯵?壣".toCharArray()[19] = (char)("焉巟შ㪂ｨᯇ쾈閆ꎆ愷듕ᢃ㌺൶魇࡯䯵?壣".toCharArray()[19] ^ 0xE18);
/*    */           arrayOfObject[0] = Cipher.getInstance(dP$dt.X("焉巟შ㪂ｨᯇ쾈閆ꎆ愷듕ᢃ㌺൶魇࡯䯵?壣".toCharArray(), (short)3774, true, false));
/*    */           "⥜␯齁✣".toCharArray()[2] = (char)("⥜␯齁✣".toCharArray()[2] ^ 0x2B0E);
/*    */           arrayOfObject[1] = SecretKeyFactory.getInstance(dP$dt.X("⥜␯齁✣".toCharArray(), (short)25296, false, false));
/*    */           arrayOfObject[2] = new IvParameterSpec(new byte[8]);
/*    */           r.put(long_, arrayOfObject);
/*    */         } 
/*    */       } catch (Exception exception) {
/*    */         "ʌ堥䐠东ᛸ쀈匑⤿肓뻈設⌽䩮ۛ".toCharArray()[15] = (char)("ʌ堥䐠东ᛸ쀈匑⤿肓뻈設⌽䩮ۛ".toCharArray()[15] ^ 0x523D);
/*    */         throw new RuntimeException(dP$dt.X("ʌ堥䐠东ᛸ쀈匑⤿肓뻈設⌽䩮ۛ".toCharArray(), (short)13052, false, false), exception);
/*    */       } 
/*    */       byte[] arrayOfByte1 = new byte[8];
/*    */       arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
/*    */       for (byte b = 1; b < 8; b++)
/*    */         arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
/*    */       DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
/*    */       SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
/*    */       ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
/*    */       "Ὧ荩૘䇑⏟ᨕ靱㯶判㴺".toCharArray()[1] = (char)("Ὧ荩૘䇑⏟ᨕ靱㯶判㴺".toCharArray()[1] ^ 0x1B85);
/*    */       byte[] arrayOfByte2 = p[i].getBytes(dP$dt.X("Ὧ荩૘䇑⏟ᨕ靱㯶判㴺".toCharArray(), (short)18622, false, false));
/*    */       q[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
/*    */     } 
/*    */     return q[i];
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
/*    */     //   66: ldc_w 'ꂲ拋円ပ躣평柽裄㱯汜樏㧆际さ묭⊋⏱'
/*    */     //   69: invokevirtual toCharArray : ()[C
/*    */     //   72: dup
/*    */     //   73: dup
/*    */     //   74: bipush #12
/*    */     //   76: dup_x1
/*    */     //   77: caload
/*    */     //   78: sipush #32132
/*    */     //   81: ixor
/*    */     //   82: i2c
/*    */     //   83: castore
/*    */     //   84: sipush #10771
/*    */     //   87: iconst_1
/*    */     //   88: iconst_5
/*    */     //   89: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*    */     //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   95: ldc_w 'ʖ֓໌摗'
/*    */     //   98: invokevirtual toCharArray : ()[C
/*    */     //   101: dup
/*    */     //   102: dup
/*    */     //   103: iconst_0
/*    */     //   104: dup_x1
/*    */     //   105: caload
/*    */     //   106: sipush #12733
/*    */     //   109: ixor
/*    */     //   110: i2c
/*    */     //   111: castore
/*    */     //   112: sipush #15768
/*    */     //   115: iconst_0
/*    */     //   116: iconst_1
/*    */     //   117: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*    */     //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   123: aload_1
/*    */     //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   127: ldc_w 'ⲋꥨ앇坌'
/*    */     //   130: invokevirtual toCharArray : ()[C
/*    */     //   133: dup
/*    */     //   134: dup
/*    */     //   135: iconst_0
/*    */     //   136: dup_x1
/*    */     //   137: caload
/*    */     //   138: sipush #17391
/*    */     //   141: ixor
/*    */     //   142: i2c
/*    */     //   143: castore
/*    */     //   144: sipush #12863
/*    */     //   147: iconst_0
/*    */     //   148: iconst_5
/*    */     //   149: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
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
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\li.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */