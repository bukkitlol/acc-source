/*     */ package me.konsolas.aac;public final class gu { public static final double[] j; public static final double[] f; private static final int a = 16; private static final int n = 8192; private static final int i = 128; private static final int g = 16; private static final int c = 8; private static final int k = 255; private static final int o = 8; private static final int l = 1024; private static final int h = 1024; static final int e = 4000; protected static final aa m; public static final m9 d;
/*     */   private static String[] b;
/*     */   private static final long p;
/*     */   
/*     */   public static void c(double[] paramArrayOfdouble1, double[] paramArrayOfdouble2) {
/*   6 */     b(paramArrayOfdouble1, paramArrayOfdouble2);
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
/*  20 */     e(paramArrayOfdouble1, paramArrayOfdouble2, 0, paramArrayOfdouble1.length);
/*     */   }
/*     */   public static void c(int[] paramArrayOfint, double[] paramArrayOfdouble) {
/*     */     b(paramArrayOfint, paramArrayOfdouble, 0, paramArrayOfint.length);
/*     */   }
/*     */   public static void c(double[] paramArrayOfdouble1, double[] paramArrayOfdouble2, int paramInt1, int paramInt2) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/gu.p : J
/*     */     //   3: ldc2_w 108355812630548
/*     */     //   6: lxor
/*     */     //   7: lstore #4
/*     */     //   9: invokestatic a : ()Ljava/util/concurrent/ForkJoinPool;
/*     */     //   12: astore #6
/*     */     //   14: iload_3
/*     */     //   15: iload_2
/*     */     //   16: isub
/*     */     //   17: sipush #1024
/*     */     //   20: if_icmplt -> 46
/*     */     //   23: aload #6
/*     */     //   25: invokevirtual getParallelism : ()I
/*     */     //   28: iconst_1
/*     */     //   29: if_icmpne -> 65
/*     */     //   32: goto -> 46
/*     */     //   35: ldc2_w 554688492468004162
/*     */     //   38: lload #4
/*     */     //   40: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   45: athrow
/*     */     //   46: aload_0
/*     */     //   47: aload_1
/*     */     //   48: iload_2
/*     */     //   49: iload_3
/*     */     //   50: invokestatic e : ([D[DII)V
/*     */     //   53: return
/*     */     //   54: ldc2_w 554688492468004162
/*     */     //   57: lload #4
/*     */     //   59: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   64: athrow
/*     */     //   65: iconst_2
/*     */     //   66: istore #7
/*     */     //   68: aload_0
/*     */     //   69: arraylength
/*     */     //   70: aload_1
/*     */     //   71: arraylength
/*     */     //   72: if_icmpeq -> 120
/*     */     //   75: new java/lang/IllegalArgumentException
/*     */     //   78: dup
/*     */     //   79: ldc_w '?쌂?㳉ᰅ㩕㎰掹턙愳檇ㅦ⇤︍쿺귀ླྀڎ⬱'
/*     */     //   82: invokevirtual toCharArray : ()[C
/*     */     //   85: dup
/*     */     //   86: dup
/*     */     //   87: bipush #15
/*     */     //   89: dup_x1
/*     */     //   90: caload
/*     */     //   91: sipush #17690
/*     */     //   94: ixor
/*     */     //   95: i2c
/*     */     //   96: castore
/*     */     //   97: sipush #22971
/*     */     //   100: iconst_1
/*     */     //   101: iconst_4
/*     */     //   102: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*     */     //   105: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   108: athrow
/*     */     //   109: ldc2_w 554688492468004162
/*     */     //   112: lload #4
/*     */     //   114: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   119: athrow
/*     */     //   120: bipush #15
/*     */     //   122: istore #8
/*     */     //   124: new java/util/concurrent/LinkedBlockingQueue
/*     */     //   127: dup
/*     */     //   128: invokespecial <init> : ()V
/*     */     //   131: astore #9
/*     */     //   133: aload #9
/*     */     //   135: new me/konsolas/aac/aa
/*     */     //   138: dup
/*     */     //   139: iload_2
/*     */     //   140: iload_3
/*     */     //   141: iload_2
/*     */     //   142: isub
/*     */     //   143: iconst_0
/*     */     //   144: invokespecial <init> : (III)V
/*     */     //   147: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   150: pop
/*     */     //   151: new java/util/concurrent/atomic/AtomicInteger
/*     */     //   154: dup
/*     */     //   155: iconst_1
/*     */     //   156: invokespecial <init> : (I)V
/*     */     //   159: astore #10
/*     */     //   161: aload #6
/*     */     //   163: invokevirtual getParallelism : ()I
/*     */     //   166: istore #11
/*     */     //   168: new java/util/concurrent/ExecutorCompletionService
/*     */     //   171: dup
/*     */     //   172: aload #6
/*     */     //   174: invokespecial <init> : (Ljava/util/concurrent/Executor;)V
/*     */     //   177: astore #12
/*     */     //   179: iload #11
/*     */     //   181: istore #13
/*     */     //   183: iload #13
/*     */     //   185: iinc #13, -1
/*     */     //   188: ifeq -> 224
/*     */     //   191: aload #12
/*     */     //   193: aload #10
/*     */     //   195: iload #11
/*     */     //   197: aload #9
/*     */     //   199: aload_0
/*     */     //   200: aload_1
/*     */     //   201: <illegal opcode> call : (Ljava/util/concurrent/atomic/AtomicInteger;ILjava/util/concurrent/LinkedBlockingQueue;[D[D)Ljava/util/concurrent/Callable;
/*     */     //   206: invokevirtual submit : (Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
/*     */     //   209: pop
/*     */     //   210: goto -> 183
/*     */     //   213: ldc2_w 554688492468004162
/*     */     //   216: lload #4
/*     */     //   218: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   223: athrow
/*     */     //   224: aconst_null
/*     */     //   225: astore #13
/*     */     //   227: iload #11
/*     */     //   229: istore #14
/*     */     //   231: iload #14
/*     */     //   233: iinc #14, -1
/*     */     //   236: ifeq -> 265
/*     */     //   239: aload #12
/*     */     //   241: invokevirtual take : ()Ljava/util/concurrent/Future;
/*     */     //   244: invokeinterface get : ()Ljava/lang/Object;
/*     */     //   249: pop
/*     */     //   250: goto -> 231
/*     */     //   253: astore #15
/*     */     //   255: aload #15
/*     */     //   257: invokevirtual getCause : ()Ljava/lang/Throwable;
/*     */     //   260: astore #13
/*     */     //   262: goto -> 231
/*     */     //   265: aload #13
/*     */     //   267: ifnull -> 321
/*     */     //   270: aload #13
/*     */     //   272: instanceof java/lang/RuntimeException
/*     */     //   275: ifeq -> 311
/*     */     //   278: goto -> 292
/*     */     //   281: ldc2_w 554688492468004162
/*     */     //   284: lload #4
/*     */     //   286: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   291: athrow
/*     */     //   292: aload #13
/*     */     //   294: checkcast java/lang/RuntimeException
/*     */     //   297: goto -> 320
/*     */     //   300: ldc2_w 554688492468004162
/*     */     //   303: lload #4
/*     */     //   305: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   310: athrow
/*     */     //   311: new java/lang/RuntimeException
/*     */     //   314: dup
/*     */     //   315: aload #13
/*     */     //   317: invokespecial <init> : (Ljava/lang/Throwable;)V
/*     */     //   320: athrow
/*     */     //   321: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #18	-> 9
/*     */     //   #573	-> 14
/*     */     //   #544	-> 46
/*     */     //   #348	-> 53
/*     */     //   #612	-> 65
/*     */     //   #285	-> 68
/*     */     //   #25	-> 120
/*     */     //   #427	-> 124
/*     */     //   #598	-> 133
/*     */     //   #315	-> 151
/*     */     //   #518	-> 161
/*     */     //   #430	-> 168
/*     */     //   #171	-> 179
/*     */     //   #857	-> 224
/*     */     //   #905	-> 227
/*     */     //   #759	-> 239
/*     */     //   #567	-> 250
/*     */     //   #940	-> 253
/*     */     //   #436	-> 255
/*     */     //   #563	-> 262
/*     */     //   #894	-> 265
/*     */     //   #154	-> 321
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   14	32	35	java/lang/Exception
/*     */     //   23	54	54	java/lang/Exception
/*     */     //   68	109	109	java/lang/Exception
/*     */     //   183	213	213	java/lang/Exception
/*     */     //   239	250	253	java/lang/Exception
/*     */     //   265	278	281	java/lang/Exception
/*     */     //   270	300	300	java/lang/Exception
/*     */   }
/*     */   public static int a(double[] paramArrayOfdouble, double paramDouble, m7 paramm7) {
/*  29 */     return a(paramArrayOfdouble, 0, paramArrayOfdouble.length, paramDouble, paramm7);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void c(double[] paramArrayOfdouble, int paramInt1, int paramInt2, m7 paramm7) {
/*  37 */     int i = paramInt2 - paramInt1;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 175 */     try { if (i < 16) {
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
/*     */ 
/*     */ 
/*     */         
/* 339 */         b(paramArrayOfdouble, paramInt1, paramInt2, paramm7);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         return;
/*     */       }  }
/*     */     catch (IllegalArgumentException illegalArgumentException)
/* 912 */     { throw a(null); }  int j = paramInt1 + i / 2; int k = paramInt1; int m = paramInt2 - 1; if (i > 128) { int i5 = i / 8; k = a(paramArrayOfdouble, k, k + i5, k + 2 * i5, paramm7); j = a(paramArrayOfdouble, j - i5, j, j + i5, paramm7); m = a(paramArrayOfdouble, m - 2 * i5, m - i5, m, paramm7); }  j = a(paramArrayOfdouble, k, j, m, paramm7); double d = paramArrayOfdouble[j]; int n = paramInt1, i1 = n, i2 = paramInt2 - 1, i3 = i2; while (true) { if (i1 <= i2) { int i5; try { if ((i5 = paramm7.a(paramArrayOfdouble[i1], d)) <= 0) { try { if (i5 == 0)
/*     */                 l(paramArrayOfdouble, n++, i1);  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  i1++; continue; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  }  while (i2 >= i1) { int i5; try { if ((i5 = paramm7.a(paramArrayOfdouble[i2], d)) >= 0) { try { if (i5 == 0)
/*     */                 l(paramArrayOfdouble, i2, i3--);  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  i2--; }  }
/*     */         catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/*     */          }
/*     */        try { if (i1 > i2)
/*     */           break;  }
/*     */       catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/*     */        l(paramArrayOfdouble, i1++, i2--); }
/*     */      int i4 = Math.min(n - paramInt1, i1 - n); a(paramArrayOfdouble, paramInt1, i1 - i4, i4); i4 = Math.min(i3 - i2, paramInt2 - i3 - 1); a(paramArrayOfdouble, i1, paramInt2 - i4, i4); try { if ((i4 = i1 - n) > 1)
/*     */         c(paramArrayOfdouble, paramInt1, paramInt1 + i4, paramm7);  }
/*     */     catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/* 924 */      try { if ((i4 = i3 - i2) > 1) c(paramArrayOfdouble, paramInt2 - i4, paramInt2, paramm7);  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/*     */   
/*     */   } public static void a(double[] paramArrayOfdouble) { i(paramArrayOfdouble, 0, paramArrayOfdouble.length); } public static void g(double[] paramArrayOfdouble, int paramInt1, int paramInt2) { a(paramArrayOfdouble, paramInt1, paramInt2); }
/*     */   public static void a(double[][] paramArrayOfdouble, int paramInt1, int paramInt2) { // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/gu.p : J
/*     */     //   3: ldc2_w 26398682948013
/*     */     //   6: lxor
/*     */     //   7: lstore_3
/*     */     //   8: iload_2
/*     */     //   9: iload_1
/*     */     //   10: isub
/*     */     //   11: sipush #1024
/*     */     //   14: if_icmpge -> 35
/*     */     //   17: aload_0
/*     */     //   18: iload_1
/*     */     //   19: iload_2
/*     */     //   20: iconst_0
/*     */     //   21: invokestatic a : ([[DIII)V
/*     */     //   24: return
/*     */     //   25: ldc2_w 435684438973310203
/*     */     //   28: lload_3
/*     */     //   29: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   34: athrow
/*     */     //   35: aload_0
/*     */     //   36: arraylength
/*     */     //   37: istore #5
/*     */     //   39: bipush #8
/*     */     //   41: iload #5
/*     */     //   43: imul
/*     */     //   44: iconst_1
/*     */     //   45: isub
/*     */     //   46: istore #6
/*     */     //   48: iload #5
/*     */     //   50: istore #7
/*     */     //   52: aload_0
/*     */     //   53: iconst_0
/*     */     //   54: aaload
/*     */     //   55: arraylength
/*     */     //   56: istore #8
/*     */     //   58: iload #7
/*     */     //   60: iinc #7, -1
/*     */     //   63: ifeq -> 156
/*     */     //   66: aload_0
/*     */     //   67: iload #7
/*     */     //   69: aaload
/*     */     //   70: arraylength
/*     */     //   71: iload #8
/*     */     //   73: if_icmpeq -> 58
/*     */     //   76: new java/lang/IllegalArgumentException
/*     */     //   79: dup
/*     */     //   80: new java/lang/StringBuilder
/*     */     //   83: dup
/*     */     //   84: invokespecial <init> : ()V
/*     */     //   87: ldc_w '址੔鮎粱ᣆ鶠鳄睘螊㯔훍䃋墩ᓝꉲ셏滇ు됨繖'
/*     */     //   90: invokevirtual toCharArray : ()[C
/*     */     //   93: dup
/*     */     //   94: dup
/*     */     //   95: iconst_3
/*     */     //   96: dup_x1
/*     */     //   97: caload
/*     */     //   98: sipush #27145
/*     */     //   101: ixor
/*     */     //   102: i2c
/*     */     //   103: castore
/*     */     //   104: sipush #24862
/*     */     //   107: iconst_1
/*     */     //   108: iconst_1
/*     */     //   109: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*     */     //   112: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   115: iload #7
/*     */     //   117: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   120: ldc_w '晇췣⣡༶㬼팇羜?ꒇせ芦ắ虖缮╮⼊➹弜ꘜ洛萕⽏⯻蟻鑂㾀ﯸ鲺飡ꯨ茿戦﬊蕩櫃勼〻︇빳寄玾⇵긵藃϶'
/*     */     //   123: invokevirtual toCharArray : ()[C
/*     */     //   126: dup
/*     */     //   127: dup
/*     */     //   128: bipush #12
/*     */     //   130: dup_x1
/*     */     //   131: caload
/*     */     //   132: sipush #5291
/*     */     //   135: ixor
/*     */     //   136: i2c
/*     */     //   137: castore
/*     */     //   138: sipush #22823
/*     */     //   141: iconst_1
/*     */     //   142: iconst_0
/*     */     //   143: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*     */     //   146: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   149: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   152: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   155: athrow
/*     */     //   156: sipush #255
/*     */     //   159: iload #5
/*     */     //   161: bipush #8
/*     */     //   163: imul
/*     */     //   164: iconst_1
/*     */     //   165: isub
/*     */     //   166: imul
/*     */     //   167: iconst_1
/*     */     //   168: iadd
/*     */     //   169: istore #7
/*     */     //   171: iconst_0
/*     */     //   172: istore #8
/*     */     //   174: iload #7
/*     */     //   176: newarray int
/*     */     //   178: astore #9
/*     */     //   180: iload #7
/*     */     //   182: newarray int
/*     */     //   184: astore #10
/*     */     //   186: iload #7
/*     */     //   188: newarray int
/*     */     //   190: astore #11
/*     */     //   192: aload #9
/*     */     //   194: iload #8
/*     */     //   196: iload_1
/*     */     //   197: iastore
/*     */     //   198: aload #10
/*     */     //   200: iload #8
/*     */     //   202: iload_2
/*     */     //   203: iload_1
/*     */     //   204: isub
/*     */     //   205: iastore
/*     */     //   206: aload #11
/*     */     //   208: iload #8
/*     */     //   210: iinc #8, 1
/*     */     //   213: iconst_0
/*     */     //   214: iastore
/*     */     //   215: sipush #256
/*     */     //   218: newarray int
/*     */     //   220: astore #12
/*     */     //   222: sipush #256
/*     */     //   225: newarray int
/*     */     //   227: astore #13
/*     */     //   229: iload #5
/*     */     //   231: newarray double
/*     */     //   233: astore #14
/*     */     //   235: iload #8
/*     */     //   237: ifle -> 786
/*     */     //   240: aload #9
/*     */     //   242: iinc #8, -1
/*     */     //   245: iload #8
/*     */     //   247: iaload
/*     */     //   248: istore #15
/*     */     //   250: aload #10
/*     */     //   252: iload #8
/*     */     //   254: iaload
/*     */     //   255: istore #16
/*     */     //   257: aload #11
/*     */     //   259: iload #8
/*     */     //   261: iaload
/*     */     //   262: istore #17
/*     */     //   264: iload #17
/*     */     //   266: bipush #8
/*     */     //   268: irem
/*     */     //   269: ifne -> 288
/*     */     //   272: sipush #128
/*     */     //   275: goto -> 289
/*     */     //   278: ldc2_w 435684438973310203
/*     */     //   281: lload_3
/*     */     //   282: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   287: athrow
/*     */     //   288: iconst_0
/*     */     //   289: istore #18
/*     */     //   291: aload_0
/*     */     //   292: iload #17
/*     */     //   294: bipush #8
/*     */     //   296: idiv
/*     */     //   297: aaload
/*     */     //   298: astore #19
/*     */     //   300: bipush #7
/*     */     //   302: iload #17
/*     */     //   304: bipush #8
/*     */     //   306: irem
/*     */     //   307: isub
/*     */     //   308: bipush #8
/*     */     //   310: imul
/*     */     //   311: istore #20
/*     */     //   313: iload #15
/*     */     //   315: iload #16
/*     */     //   317: iadd
/*     */     //   318: istore #21
/*     */     //   320: iload #21
/*     */     //   322: iinc #21, -1
/*     */     //   325: iload #15
/*     */     //   327: if_icmpeq -> 370
/*     */     //   330: aload #12
/*     */     //   332: aload #19
/*     */     //   334: iload #21
/*     */     //   336: daload
/*     */     //   337: invokestatic a : (D)J
/*     */     //   340: iload #20
/*     */     //   342: lushr
/*     */     //   343: ldc2_w 255
/*     */     //   346: land
/*     */     //   347: iload #18
/*     */     //   349: i2l
/*     */     //   350: lxor
/*     */     //   351: l2i
/*     */     //   352: dup2
/*     */     //   353: iaload
/*     */     //   354: iconst_1
/*     */     //   355: iadd
/*     */     //   356: iastore
/*     */     //   357: goto -> 320
/*     */     //   360: ldc2_w 435684438973310203
/*     */     //   363: lload_3
/*     */     //   364: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   369: athrow
/*     */     //   370: iconst_m1
/*     */     //   371: istore #21
/*     */     //   373: iconst_0
/*     */     //   374: istore #22
/*     */     //   376: iload #15
/*     */     //   378: istore #23
/*     */     //   380: iload #22
/*     */     //   382: sipush #256
/*     */     //   385: if_icmpge -> 435
/*     */     //   388: aload #12
/*     */     //   390: iload #22
/*     */     //   392: iaload
/*     */     //   393: ifeq -> 413
/*     */     //   396: goto -> 409
/*     */     //   399: ldc2_w 435684438973310203
/*     */     //   402: lload_3
/*     */     //   403: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   408: athrow
/*     */     //   409: iload #22
/*     */     //   411: istore #21
/*     */     //   413: aload #13
/*     */     //   415: iload #22
/*     */     //   417: iload #23
/*     */     //   419: aload #12
/*     */     //   421: iload #22
/*     */     //   423: iaload
/*     */     //   424: iadd
/*     */     //   425: dup
/*     */     //   426: istore #23
/*     */     //   428: iastore
/*     */     //   429: iinc #22, 1
/*     */     //   432: goto -> 380
/*     */     //   435: iload #15
/*     */     //   437: iload #16
/*     */     //   439: iadd
/*     */     //   440: aload #12
/*     */     //   442: iload #21
/*     */     //   444: iaload
/*     */     //   445: isub
/*     */     //   446: istore #22
/*     */     //   448: iload #15
/*     */     //   450: istore #23
/*     */     //   452: iconst_m1
/*     */     //   453: istore #24
/*     */     //   455: iload #23
/*     */     //   457: iload #22
/*     */     //   459: if_icmpgt -> 783
/*     */     //   462: iload #5
/*     */     //   464: istore #26
/*     */     //   466: iload #26
/*     */     //   468: iinc #26, -1
/*     */     //   471: ifeq -> 499
/*     */     //   474: aload #14
/*     */     //   476: iload #26
/*     */     //   478: aload_0
/*     */     //   479: iload #26
/*     */     //   481: aaload
/*     */     //   482: iload #23
/*     */     //   484: daload
/*     */     //   485: dastore
/*     */     //   486: goto -> 466
/*     */     //   489: ldc2_w 435684438973310203
/*     */     //   492: lload_3
/*     */     //   493: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   498: athrow
/*     */     //   499: aload #19
/*     */     //   501: iload #23
/*     */     //   503: daload
/*     */     //   504: invokestatic a : (D)J
/*     */     //   507: iload #20
/*     */     //   509: lushr
/*     */     //   510: ldc2_w 255
/*     */     //   513: land
/*     */     //   514: iload #18
/*     */     //   516: i2l
/*     */     //   517: lxor
/*     */     //   518: l2i
/*     */     //   519: istore #24
/*     */     //   521: iload #23
/*     */     //   523: iload #22
/*     */     //   525: if_icmpge -> 651
/*     */     //   528: aload #13
/*     */     //   530: iload #24
/*     */     //   532: dup2
/*     */     //   533: iaload
/*     */     //   534: iconst_1
/*     */     //   535: isub
/*     */     //   536: dup_x2
/*     */     //   537: iastore
/*     */     //   538: dup
/*     */     //   539: istore #25
/*     */     //   541: iload #23
/*     */     //   543: if_icmple -> 614
/*     */     //   546: aload #19
/*     */     //   548: iload #25
/*     */     //   550: daload
/*     */     //   551: invokestatic a : (D)J
/*     */     //   554: iload #20
/*     */     //   556: lushr
/*     */     //   557: ldc2_w 255
/*     */     //   560: land
/*     */     //   561: iload #18
/*     */     //   563: i2l
/*     */     //   564: lxor
/*     */     //   565: l2i
/*     */     //   566: istore #24
/*     */     //   568: iload #5
/*     */     //   570: istore #26
/*     */     //   572: iload #26
/*     */     //   574: iinc #26, -1
/*     */     //   577: ifeq -> 611
/*     */     //   580: aload #14
/*     */     //   582: iload #26
/*     */     //   584: daload
/*     */     //   585: dstore #27
/*     */     //   587: aload #14
/*     */     //   589: iload #26
/*     */     //   591: aload_0
/*     */     //   592: iload #26
/*     */     //   594: aaload
/*     */     //   595: iload #25
/*     */     //   597: daload
/*     */     //   598: dastore
/*     */     //   599: aload_0
/*     */     //   600: iload #26
/*     */     //   602: aaload
/*     */     //   603: iload #25
/*     */     //   605: dload #27
/*     */     //   607: dastore
/*     */     //   608: goto -> 572
/*     */     //   611: goto -> 528
/*     */     //   614: iload #5
/*     */     //   616: istore #26
/*     */     //   618: iload #26
/*     */     //   620: iinc #26, -1
/*     */     //   623: ifeq -> 651
/*     */     //   626: aload_0
/*     */     //   627: iload #26
/*     */     //   629: aaload
/*     */     //   630: iload #23
/*     */     //   632: aload #14
/*     */     //   634: iload #26
/*     */     //   636: daload
/*     */     //   637: dastore
/*     */     //   638: goto -> 618
/*     */     //   641: ldc2_w 435684438973310203
/*     */     //   644: lload_3
/*     */     //   645: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   650: athrow
/*     */     //   651: iload #17
/*     */     //   653: iload #6
/*     */     //   655: if_icmpge -> 764
/*     */     //   658: aload #12
/*     */     //   660: iload #24
/*     */     //   662: iaload
/*     */     //   663: iconst_1
/*     */     //   664: if_icmple -> 764
/*     */     //   667: goto -> 680
/*     */     //   670: ldc2_w 435684438973310203
/*     */     //   673: lload_3
/*     */     //   674: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   679: athrow
/*     */     //   680: aload #12
/*     */     //   682: iload #24
/*     */     //   684: iaload
/*     */     //   685: sipush #1024
/*     */     //   688: if_icmpge -> 735
/*     */     //   691: goto -> 704
/*     */     //   694: ldc2_w 435684438973310203
/*     */     //   697: lload_3
/*     */     //   698: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   703: athrow
/*     */     //   704: aload_0
/*     */     //   705: iload #23
/*     */     //   707: iload #23
/*     */     //   709: aload #12
/*     */     //   711: iload #24
/*     */     //   713: iaload
/*     */     //   714: iadd
/*     */     //   715: iload #17
/*     */     //   717: iconst_1
/*     */     //   718: iadd
/*     */     //   719: invokestatic a : ([[DIII)V
/*     */     //   722: goto -> 764
/*     */     //   725: ldc2_w 435684438973310203
/*     */     //   728: lload_3
/*     */     //   729: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   734: athrow
/*     */     //   735: aload #9
/*     */     //   737: iload #8
/*     */     //   739: iload #23
/*     */     //   741: iastore
/*     */     //   742: aload #10
/*     */     //   744: iload #8
/*     */     //   746: aload #12
/*     */     //   748: iload #24
/*     */     //   750: iaload
/*     */     //   751: iastore
/*     */     //   752: aload #11
/*     */     //   754: iload #8
/*     */     //   756: iinc #8, 1
/*     */     //   759: iload #17
/*     */     //   761: iconst_1
/*     */     //   762: iadd
/*     */     //   763: iastore
/*     */     //   764: iload #23
/*     */     //   766: aload #12
/*     */     //   768: iload #24
/*     */     //   770: iaload
/*     */     //   771: iadd
/*     */     //   772: istore #23
/*     */     //   774: aload #12
/*     */     //   776: iload #24
/*     */     //   778: iconst_0
/*     */     //   779: iastore
/*     */     //   780: goto -> 455
/*     */     //   783: goto -> 235
/*     */     //   786: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #115	-> 8
/*     */     //   #223	-> 17
/*     */     //   #809	-> 24
/*     */     //   #509	-> 35
/*     */     //   #88	-> 39
/*     */     //   #267	-> 48
/*     */     //   #453	-> 156
/*     */     //   #83	-> 171
/*     */     //   #727	-> 174
/*     */     //   #451	-> 180
/*     */     //   #304	-> 186
/*     */     //   #231	-> 192
/*     */     //   #720	-> 198
/*     */     //   #139	-> 206
/*     */     //   #500	-> 215
/*     */     //   #718	-> 222
/*     */     //   #816	-> 229
/*     */     //   #109	-> 235
/*     */     //   #194	-> 240
/*     */     //   #700	-> 250
/*     */     //   #91	-> 257
/*     */     //   #75	-> 264
/*     */     //   #84	-> 291
/*     */     //   #468	-> 300
/*     */     //   #677	-> 313
/*     */     //   #186	-> 370
/*     */     //   #732	-> 373
/*     */     //   #310	-> 388
/*     */     //   #859	-> 413
/*     */     //   #396	-> 429
/*     */     //   #248	-> 435
/*     */     //   #71	-> 448
/*     */     //   #538	-> 462
/*     */     //   #639	-> 499
/*     */     //   #229	-> 521
/*     */     //   #41	-> 528
/*     */     //   #729	-> 546
/*     */     //   #938	-> 568
/*     */     //   #170	-> 580
/*     */     //   #442	-> 587
/*     */     //   #737	-> 599
/*     */     //   #892	-> 608
/*     */     //   #667	-> 614
/*     */     //   #7	-> 651
/*     */     //   #773	-> 680
/*     */     //   #690	-> 735
/*     */     //   #379	-> 742
/*     */     //   #539	-> 752
/*     */     //   #130	-> 764
/*     */     //   #257	-> 783
/*     */     //   #163	-> 786
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   8	25	25	java/lang/IllegalArgumentException
/*     */     //   264	278	278	java/lang/IllegalArgumentException
/*     */     //   320	360	360	java/lang/IllegalArgumentException
/*     */     //   380	396	399	java/lang/IllegalArgumentException
/*     */     //   466	489	489	java/lang/IllegalArgumentException
/*     */     //   618	641	641	java/lang/IllegalArgumentException
/*     */     //   651	667	670	java/lang/IllegalArgumentException
/*     */     //   658	691	694	java/lang/IllegalArgumentException
/*     */     //   680	725	725	java/lang/IllegalArgumentException }
/*     */   public static void a(int[] paramArrayOfint, double[] paramArrayOfdouble) { a(paramArrayOfint, paramArrayOfdouble, 0, paramArrayOfdouble.length); }
/*     */   public static double[] b(double[] paramArrayOfdouble) { return (double[])paramArrayOfdouble.clone(); }
/*     */   public static void a(double[] paramArrayOfdouble1, int paramInt1, int paramInt2, m7 paramm7, double[] paramArrayOfdouble2) { // Byte code:
/*     */     //   0: iload_2
/*     */     //   1: iload_1
/*     */     //   2: isub
/*     */     //   3: istore #5
/*     */     //   5: iload #5
/*     */     //   7: bipush #16
/*     */     //   9: if_icmpge -> 24
/*     */     //   12: aload_0
/*     */     //   13: iload_1
/*     */     //   14: iload_2
/*     */     //   15: aload_3
/*     */     //   16: invokestatic e : ([DIILme/konsolas/aac/m7;)V
/*     */     //   19: return
/*     */     //   20: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   23: athrow
/*     */     //   24: aload #4
/*     */     //   26: ifnonnull -> 36
/*     */     //   29: aload_0
/*     */     //   30: iload_2
/*     */     //   31: invokestatic copyOf : ([DI)[D
/*     */     //   34: astore #4
/*     */     //   36: iload_1
/*     */     //   37: iload_2
/*     */     //   38: iadd
/*     */     //   39: iconst_1
/*     */     //   40: iushr
/*     */     //   41: istore #6
/*     */     //   43: aload #4
/*     */     //   45: iload_1
/*     */     //   46: iload #6
/*     */     //   48: aload_3
/*     */     //   49: aload_0
/*     */     //   50: invokestatic a : ([DIILme/konsolas/aac/m7;[D)V
/*     */     //   53: aload #4
/*     */     //   55: iload #6
/*     */     //   57: iload_2
/*     */     //   58: aload_3
/*     */     //   59: aload_0
/*     */     //   60: invokestatic a : ([DIILme/konsolas/aac/m7;[D)V
/*     */     //   63: aload_3
/*     */     //   64: aload #4
/*     */     //   66: iload #6
/*     */     //   68: iconst_1
/*     */     //   69: isub
/*     */     //   70: daload
/*     */     //   71: aload #4
/*     */     //   73: iload #6
/*     */     //   75: daload
/*     */     //   76: invokeinterface a : (DD)I
/*     */     //   81: ifgt -> 99
/*     */     //   84: aload #4
/*     */     //   86: iload_1
/*     */     //   87: aload_0
/*     */     //   88: iload_1
/*     */     //   89: iload #5
/*     */     //   91: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
/*     */     //   94: return
/*     */     //   95: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   98: athrow
/*     */     //   99: iload_1
/*     */     //   100: istore #7
/*     */     //   102: iload_1
/*     */     //   103: istore #8
/*     */     //   105: iload #6
/*     */     //   107: istore #9
/*     */     //   109: iload #7
/*     */     //   111: iload_2
/*     */     //   112: if_icmpge -> 205
/*     */     //   115: iload #9
/*     */     //   117: iload_2
/*     */     //   118: if_icmpge -> 168
/*     */     //   121: goto -> 128
/*     */     //   124: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   127: athrow
/*     */     //   128: iload #8
/*     */     //   130: iload #6
/*     */     //   132: if_icmpge -> 187
/*     */     //   135: goto -> 142
/*     */     //   138: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   141: athrow
/*     */     //   142: aload_3
/*     */     //   143: aload #4
/*     */     //   145: iload #8
/*     */     //   147: daload
/*     */     //   148: aload #4
/*     */     //   150: iload #9
/*     */     //   152: daload
/*     */     //   153: invokeinterface a : (DD)I
/*     */     //   158: ifgt -> 187
/*     */     //   161: goto -> 168
/*     */     //   164: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   167: athrow
/*     */     //   168: aload_0
/*     */     //   169: iload #7
/*     */     //   171: aload #4
/*     */     //   173: iload #8
/*     */     //   175: iinc #8, 1
/*     */     //   178: daload
/*     */     //   179: dastore
/*     */     //   180: goto -> 199
/*     */     //   183: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   186: athrow
/*     */     //   187: aload_0
/*     */     //   188: iload #7
/*     */     //   190: aload #4
/*     */     //   192: iload #9
/*     */     //   194: iinc #9, 1
/*     */     //   197: daload
/*     */     //   198: dastore
/*     */     //   199: iinc #7, 1
/*     */     //   202: goto -> 109
/*     */     //   205: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #121	-> 0
/*     */     //   #347	-> 5
/*     */     //   #117	-> 12
/*     */     //   #722	-> 19
/*     */     //   #550	-> 24
/*     */     //   #657	-> 36
/*     */     //   #616	-> 43
/*     */     //   #811	-> 53
/*     */     //   #747	-> 63
/*     */     //   #765	-> 84
/*     */     //   #512	-> 94
/*     */     //   #373	-> 99
/*     */     //   #149	-> 115
/*     */     //   #406	-> 187
/*     */     //   #365	-> 199
/*     */     //   #388	-> 205
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   5	20	20	java/lang/IllegalArgumentException
/*     */     //   43	95	95	java/lang/IllegalArgumentException
/*     */     //   109	121	124	java/lang/IllegalArgumentException
/*     */     //   115	135	138	java/lang/IllegalArgumentException
/*     */     //   128	161	164	java/lang/IllegalArgumentException
/*     */     //   142	183	183	java/lang/IllegalArgumentException }
/*     */   public static void a(double[] paramArrayOfdouble1, double[] paramArrayOfdouble2) { b(paramArrayOfdouble1, paramArrayOfdouble2); c(paramArrayOfdouble1, paramArrayOfdouble2, 0, paramArrayOfdouble1.length); }
/*     */   private static void a(int[] paramArrayOfint, double[] paramArrayOfdouble1, double[] paramArrayOfdouble2, int paramInt1, int paramInt2) { for (int i = paramInt1; ++i < paramInt2; )
/*     */     { int j = paramArrayOfint[i]; continue; j = i;
/*     */       k = paramArrayOfint[j - 1];
/*     */       while (true) {
/*     */         if (paramInt1 == j - 1) {
/*     */           j--;
/*     */           break;
/*     */         } 
/*     */       } 
/* 941 */       paramArrayOfint[j] = SYNTHETIC_LOCAL_VARIABLE_6; }  } private static int a(double[] paramArrayOfdouble, int paramInt1, int paramInt2, int paramInt3, m7 paramm7) { int i = paramm7.a(paramArrayOfdouble[paramInt1], paramArrayOfdouble[paramInt2]); int j = paramm7.a(paramArrayOfdouble[paramInt1], paramArrayOfdouble[paramInt3]); int k = paramm7.a(paramArrayOfdouble[paramInt2], paramArrayOfdouble[paramInt3]); try { if (i < 0) { try { try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  } else { try { try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return (k > 0) ? paramInt2 : ((j > 0) ? paramInt3 : paramInt1); } public static void g(double[] paramArrayOfdouble) { g(paramArrayOfdouble, 0, paramArrayOfdouble.length); } public static void e(double[] paramArrayOfdouble) { h(paramArrayOfdouble, 0, paramArrayOfdouble.length); } public static void d(int[] paramArrayOfint, double[] paramArrayOfdouble, int paramInt1, int paramInt2) { // Byte code:
/*     */     //   0: iload_3
/*     */     //   1: iload_2
/*     */     //   2: isub
/*     */     //   3: istore #4
/*     */     //   5: iload #4
/*     */     //   7: bipush #16
/*     */     //   9: if_icmpge -> 24
/*     */     //   12: aload_0
/*     */     //   13: aload_1
/*     */     //   14: iload_2
/*     */     //   15: iload_3
/*     */     //   16: invokestatic c : ([I[DII)V
/*     */     //   19: return
/*     */     //   20: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   23: athrow
/*     */     //   24: iload_2
/*     */     //   25: iload #4
/*     */     //   27: iconst_2
/*     */     //   28: idiv
/*     */     //   29: iadd
/*     */     //   30: istore #5
/*     */     //   32: iload_2
/*     */     //   33: istore #6
/*     */     //   35: iload_3
/*     */     //   36: iconst_1
/*     */     //   37: isub
/*     */     //   38: istore #7
/*     */     //   40: iload #4
/*     */     //   42: sipush #128
/*     */     //   45: if_icmple -> 116
/*     */     //   48: iload #4
/*     */     //   50: bipush #8
/*     */     //   52: idiv
/*     */     //   53: istore #8
/*     */     //   55: aload_0
/*     */     //   56: aload_1
/*     */     //   57: iload #6
/*     */     //   59: iload #6
/*     */     //   61: iload #8
/*     */     //   63: iadd
/*     */     //   64: iload #6
/*     */     //   66: iconst_2
/*     */     //   67: iload #8
/*     */     //   69: imul
/*     */     //   70: iadd
/*     */     //   71: invokestatic a : ([I[DIII)I
/*     */     //   74: istore #6
/*     */     //   76: aload_0
/*     */     //   77: aload_1
/*     */     //   78: iload #5
/*     */     //   80: iload #8
/*     */     //   82: isub
/*     */     //   83: iload #5
/*     */     //   85: iload #5
/*     */     //   87: iload #8
/*     */     //   89: iadd
/*     */     //   90: invokestatic a : ([I[DIII)I
/*     */     //   93: istore #5
/*     */     //   95: aload_0
/*     */     //   96: aload_1
/*     */     //   97: iload #7
/*     */     //   99: iconst_2
/*     */     //   100: iload #8
/*     */     //   102: imul
/*     */     //   103: isub
/*     */     //   104: iload #7
/*     */     //   106: iload #8
/*     */     //   108: isub
/*     */     //   109: iload #7
/*     */     //   111: invokestatic a : ([I[DIII)I
/*     */     //   114: istore #7
/*     */     //   116: aload_0
/*     */     //   117: aload_1
/*     */     //   118: iload #6
/*     */     //   120: iload #5
/*     */     //   122: iload #7
/*     */     //   124: invokestatic a : ([I[DIII)I
/*     */     //   127: istore #5
/*     */     //   129: aload_1
/*     */     //   130: aload_0
/*     */     //   131: iload #5
/*     */     //   133: iaload
/*     */     //   134: daload
/*     */     //   135: dstore #8
/*     */     //   137: iload_2
/*     */     //   138: istore #10
/*     */     //   140: iload #10
/*     */     //   142: istore #11
/*     */     //   144: iload_3
/*     */     //   145: iconst_1
/*     */     //   146: isub
/*     */     //   147: istore #12
/*     */     //   149: iload #12
/*     */     //   151: istore #13
/*     */     //   153: iload #11
/*     */     //   155: iload #12
/*     */     //   157: if_icmpgt -> 213
/*     */     //   160: aload_1
/*     */     //   161: aload_0
/*     */     //   162: iload #11
/*     */     //   164: iaload
/*     */     //   165: daload
/*     */     //   166: dload #8
/*     */     //   168: invokestatic compare : (DD)I
/*     */     //   171: dup
/*     */     //   172: istore #14
/*     */     //   174: ifgt -> 213
/*     */     //   177: iload #14
/*     */     //   179: ifne -> 207
/*     */     //   182: goto -> 189
/*     */     //   185: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   188: athrow
/*     */     //   189: aload_0
/*     */     //   190: iload #10
/*     */     //   192: iinc #10, 1
/*     */     //   195: iload #11
/*     */     //   197: invokestatic g : ([III)V
/*     */     //   200: goto -> 207
/*     */     //   203: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   206: athrow
/*     */     //   207: iinc #11, 1
/*     */     //   210: goto -> 153
/*     */     //   213: iload #12
/*     */     //   215: iload #11
/*     */     //   217: if_icmplt -> 273
/*     */     //   220: aload_1
/*     */     //   221: aload_0
/*     */     //   222: iload #12
/*     */     //   224: iaload
/*     */     //   225: daload
/*     */     //   226: dload #8
/*     */     //   228: invokestatic compare : (DD)I
/*     */     //   231: dup
/*     */     //   232: istore #14
/*     */     //   234: iflt -> 273
/*     */     //   237: iload #14
/*     */     //   239: ifne -> 267
/*     */     //   242: goto -> 249
/*     */     //   245: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   248: athrow
/*     */     //   249: aload_0
/*     */     //   250: iload #12
/*     */     //   252: iload #13
/*     */     //   254: iinc #13, -1
/*     */     //   257: invokestatic g : ([III)V
/*     */     //   260: goto -> 267
/*     */     //   263: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   266: athrow
/*     */     //   267: iinc #12, -1
/*     */     //   270: goto -> 213
/*     */     //   273: iload #11
/*     */     //   275: iload #12
/*     */     //   277: if_icmple -> 287
/*     */     //   280: goto -> 304
/*     */     //   283: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   286: athrow
/*     */     //   287: aload_0
/*     */     //   288: iload #11
/*     */     //   290: iinc #11, 1
/*     */     //   293: iload #12
/*     */     //   295: iinc #12, -1
/*     */     //   298: invokestatic g : ([III)V
/*     */     //   301: goto -> 153
/*     */     //   304: iload #10
/*     */     //   306: iload_2
/*     */     //   307: isub
/*     */     //   308: iload #11
/*     */     //   310: iload #10
/*     */     //   312: isub
/*     */     //   313: invokestatic min : (II)I
/*     */     //   316: istore #14
/*     */     //   318: aload_0
/*     */     //   319: iload_2
/*     */     //   320: iload #11
/*     */     //   322: iload #14
/*     */     //   324: isub
/*     */     //   325: iload #14
/*     */     //   327: invokestatic b : ([IIII)V
/*     */     //   330: iload #13
/*     */     //   332: iload #12
/*     */     //   334: isub
/*     */     //   335: iload_3
/*     */     //   336: iload #13
/*     */     //   338: isub
/*     */     //   339: iconst_1
/*     */     //   340: isub
/*     */     //   341: invokestatic min : (II)I
/*     */     //   344: istore #14
/*     */     //   346: aload_0
/*     */     //   347: iload #11
/*     */     //   349: iload_3
/*     */     //   350: iload #14
/*     */     //   352: isub
/*     */     //   353: iload #14
/*     */     //   355: invokestatic b : ([IIII)V
/*     */     //   358: iload #11
/*     */     //   360: iload #10
/*     */     //   362: isub
/*     */     //   363: dup
/*     */     //   364: istore #14
/*     */     //   366: iconst_1
/*     */     //   367: if_icmple -> 387
/*     */     //   370: aload_0
/*     */     //   371: aload_1
/*     */     //   372: iload_2
/*     */     //   373: iload_2
/*     */     //   374: iload #14
/*     */     //   376: iadd
/*     */     //   377: invokestatic d : ([I[DII)V
/*     */     //   380: goto -> 387
/*     */     //   383: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   386: athrow
/*     */     //   387: iload #13
/*     */     //   389: iload #12
/*     */     //   391: isub
/*     */     //   392: dup
/*     */     //   393: istore #14
/*     */     //   395: iconst_1
/*     */     //   396: if_icmple -> 416
/*     */     //   399: aload_0
/*     */     //   400: aload_1
/*     */     //   401: iload_3
/*     */     //   402: iload #14
/*     */     //   404: isub
/*     */     //   405: iload_3
/*     */     //   406: invokestatic d : ([I[DII)V
/*     */     //   409: goto -> 416
/*     */     //   412: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   415: athrow
/*     */     //   416: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #182	-> 0
/*     */     //   #807	-> 5
/*     */     //   #445	-> 12
/*     */     //   #471	-> 19
/*     */     //   #948	-> 24
/*     */     //   #588	-> 32
/*     */     //   #292	-> 35
/*     */     //   #306	-> 40
/*     */     //   #830	-> 48
/*     */     //   #422	-> 55
/*     */     //   #21	-> 76
/*     */     //   #242	-> 95
/*     */     //   #314	-> 116
/*     */     //   #31	-> 129
/*     */     //   #291	-> 137
/*     */     //   #526	-> 153
/*     */     //   #581	-> 177
/*     */     //   #668	-> 207
/*     */     //   #144	-> 213
/*     */     //   #399	-> 237
/*     */     //   #205	-> 267
/*     */     //   #655	-> 273
/*     */     //   #177	-> 287
/*     */     //   #888	-> 304
/*     */     //   #251	-> 318
/*     */     //   #783	-> 330
/*     */     //   #705	-> 346
/*     */     //   #69	-> 358
/*     */     //   #692	-> 387
/*     */     //   #926	-> 416
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   5	20	20	java/lang/IllegalArgumentException
/*     */     //   174	182	185	java/lang/IllegalArgumentException
/*     */     //   177	200	203	java/lang/IllegalArgumentException
/*     */     //   234	242	245	java/lang/IllegalArgumentException
/*     */     //   237	260	263	java/lang/IllegalArgumentException
/*     */     //   273	283	283	java/lang/IllegalArgumentException
/*     */     //   366	380	383	java/lang/IllegalArgumentException
/*     */     //   395	409	412	java/lang/IllegalArgumentException }
/*     */   public static void a(int[] paramArrayOfint, double[] paramArrayOfdouble, int paramInt1, int paramInt2) { ForkJoinPool forkJoinPool = a(); try { if (paramInt2 - paramInt1 >= 8192) { try { if (forkJoinPool.getParallelism() == 1) { d(paramArrayOfint, paramArrayOfdouble, paramInt1, paramInt2); return; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  forkJoinPool.invoke(new bn(paramArrayOfint, paramArrayOfdouble, paramInt1, paramInt2)); return; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  d(paramArrayOfint, paramArrayOfdouble, paramInt1, paramInt2); }
/*     */   public static int a(double[] paramArrayOfdouble, int paramInt1, int paramInt2, double paramDouble, m7 paramm7) { paramInt2--; while (paramInt1 <= paramInt2) { int i = paramInt1 + paramInt2 >>> 1; double d = paramArrayOfdouble[i]; int j = paramm7.a(d, paramDouble); if (j < 0) { paramInt1 = i + 1; continue; }  if (j > 0) { paramInt2 = i - 1; continue; }  return i; }  return -(paramInt1 + 1); }
/* 944 */   public static void e(double[] paramArrayOfdouble1, double[] paramArrayOfdouble2, int paramInt1, int paramInt2) { int i = paramInt2 - paramInt1; try { if (i < 16) { f(paramArrayOfdouble1, paramArrayOfdouble2, paramInt1, paramInt2); return; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  int j = paramInt1 + i / 2; int k = paramInt1; int m = paramInt2 - 1; if (i > 128) { int i5 = i / 8; k = a(paramArrayOfdouble1, paramArrayOfdouble2, k, k + i5, k + 2 * i5); j = a(paramArrayOfdouble1, paramArrayOfdouble2, j - i5, j, j + i5); m = a(paramArrayOfdouble1, paramArrayOfdouble2, m - 2 * i5, m - i5, m); }  j = a(paramArrayOfdouble1, paramArrayOfdouble2, k, j, m); double d1 = paramArrayOfdouble1[j], d2 = paramArrayOfdouble2[j]; int n = paramInt1, i1 = n, i2 = paramInt2 - 1, i3 = i2; while (true) { if (i1 <= i2) { int i5; int i6; try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  try { if ((i5 = ((i6 = Double.compare(paramArrayOfdouble1[i1], d1)) == 0) ? Double.compare(paramArrayOfdouble2[i1], d2) : i6) <= 0) { try { if (i5 == 0) a(paramArrayOfdouble1, paramArrayOfdouble2, n++, i1);  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  i1++; continue; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  }  while (i2 >= i1) { int i5; int i6; try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  try { if ((i5 = ((i6 = Double.compare(paramArrayOfdouble1[i2], d1)) == 0) ? Double.compare(paramArrayOfdouble2[i2], d2) : i6) >= 0) { try { if (i5 == 0) a(paramArrayOfdouble1, paramArrayOfdouble2, i2, i3--);  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  i2--; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  }  try { if (i1 > i2) break;  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  a(paramArrayOfdouble1, paramArrayOfdouble2, i1++, i2--); }  int i4 = Math.min(n - paramInt1, i1 - n); b(paramArrayOfdouble1, paramArrayOfdouble2, paramInt1, i1 - i4, i4); i4 = Math.min(i3 - i2, paramInt2 - i3 - 1); b(paramArrayOfdouble1, paramArrayOfdouble2, i1, paramInt2 - i4, i4); try { if ((i4 = i1 - n) > 1) e(paramArrayOfdouble1, paramArrayOfdouble2, paramInt1, paramInt1 + i4);  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  try { if ((i4 = i3 - i2) > 1) e(paramArrayOfdouble1, paramArrayOfdouble2, paramInt2 - i4, paramInt2);  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  }
/*     */   public static void a(double[] paramArrayOfdouble, int paramInt1, int paramInt2) { a(paramArrayOfdouble, paramInt1, paramInt2, (double[])null); } public static void b(double[] paramArrayOfdouble1, double[] paramArrayOfdouble2) { // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/gu.p : J
/*     */     //   3: ldc2_w 47278080714735
/*     */     //   6: lxor
/*     */     //   7: lstore_2
/*     */     //   8: aload_0
/*     */     //   9: arraylength
/*     */     //   10: aload_1
/*     */     //   11: arraylength
/*     */     //   12: if_icmpeq -> 107
/*     */     //   15: new java/lang/IllegalArgumentException
/*     */     //   18: dup
/*     */     //   19: new java/lang/StringBuilder
/*     */     //   22: dup
/*     */     //   23: invokespecial <init> : ()V
/*     */     //   26: ldc '쵏촳럗筝ꤻ摼藪ᑐᠹ萩盈ᬟ뗬쏠憼?௑ഇ夕'
/*     */     //   28: invokevirtual toCharArray : ()[C
/*     */     //   31: dup
/*     */     //   32: dup
/*     */     //   33: iconst_3
/*     */     //   34: dup_x1
/*     */     //   35: caload
/*     */     //   36: sipush #10860
/*     */     //   39: ixor
/*     */     //   40: i2c
/*     */     //   41: castore
/*     */     //   42: sipush #20418
/*     */     //   45: iconst_0
/*     */     //   46: iconst_1
/*     */     //   47: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   50: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   53: aload_0
/*     */     //   54: arraylength
/*     */     //   55: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   58: ldc 'ⵎ⁝箱륶垯'
/*     */     //   60: invokevirtual toCharArray : ()[C
/*     */     //   63: dup
/*     */     //   64: dup
/*     */     //   65: iconst_1
/*     */     //   66: dup_x1
/*     */     //   67: caload
/*     */     //   68: sipush #17835
/*     */     //   71: ixor
/*     */     //   72: i2c
/*     */     //   73: castore
/*     */     //   74: sipush #4461
/*     */     //   77: iconst_0
/*     */     //   78: iconst_0
/*     */     //   79: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   82: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   85: aload_1
/*     */     //   86: arraylength
/*     */     //   87: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   90: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   93: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   96: athrow
/*     */     //   97: ldc2_w 4632495710468645561
/*     */     //   100: lload_2
/*     */     //   101: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   106: athrow
/*     */     //   107: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #276	-> 8
/*     */     //   #260	-> 107
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   8	97	97	java/lang/IllegalArgumentException } public static void c(double[] paramArrayOfdouble, m7 paramm7) { g(paramArrayOfdouble, 0, paramArrayOfdouble.length, paramm7); } private static void a(double[] paramArrayOfdouble1, double[] paramArrayOfdouble2, int paramInt1, int paramInt2) { double d1 = paramArrayOfdouble1[paramInt1]; double d2 = paramArrayOfdouble2[paramInt1]; paramArrayOfdouble1[paramInt1] = paramArrayOfdouble1[paramInt2]; paramArrayOfdouble2[paramInt1] = paramArrayOfdouble2[paramInt2]; paramArrayOfdouble1[paramInt2] = d1; paramArrayOfdouble2[paramInt2] = d2; } public static void b(int[] paramArrayOfint, double[] paramArrayOfdouble, int paramInt1, int paramInt2, boolean paramBoolean) { try { if (paramInt2 - paramInt1 < 1024) { c(paramArrayOfint, paramArrayOfdouble, paramInt1, paramInt2); return; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  byte b1 = 7; char c = 'ۺ'; byte b2 = 0; int[] arrayOfInt1 = new int[1786]; int[] arrayOfInt2 = new int[1786]; int[] arrayOfInt3 = new int[1786]; arrayOfInt1[b2] = paramInt1; arrayOfInt2[b2] = paramInt2 - paramInt1; arrayOfInt3[b2++] = 0; int[] arrayOfInt4 = new int[256]; int[] arrayOfInt5 = new int[256]; try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  int[] arrayOfInt6 = paramBoolean ? new int[paramArrayOfint.length] : null; for (; b2 > 0; n = i + j) { int n, i = arrayOfInt1[--b2]; int j = arrayOfInt2[b2]; int k = arrayOfInt3[b2]; try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  boolean bool = (k % 8 == 0) ? true : false; int m = (7 - k % 8) * 8; }  } public static void h(double[] paramArrayOfdouble, int paramInt1, int paramInt2) { try { if (paramInt2 - paramInt1 < 1024) { e(paramArrayOfdouble, paramInt1, paramInt2); return; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  byte b1 = 7; char c = 'ۺ'; byte b2 = 0; int[] arrayOfInt1 = new int[1786]; int[] arrayOfInt2 = new int[1786]; int[] arrayOfInt3 = new int[1786]; arrayOfInt1[b2] = paramInt1; arrayOfInt2[b2] = paramInt2 - paramInt1; arrayOfInt3[b2++] = 0; int[] arrayOfInt4 = new int[256]; int[] arrayOfInt5 = new int[256]; while (b2 > 0) { int i3, i = arrayOfInt1[--b2]; int j = arrayOfInt2[b2]; int k = arrayOfInt3[b2]; try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  boolean bool = (k % 8 == 0) ? true : false; int m = (7 - k % 8) * 8; int n = i + j; try { for (; n-- != i; arrayOfInt4[(int)(a(paramArrayOfdouble[n]) >>> m & 0xFFL ^ bool)] = arrayOfInt4[(int)(a(paramArrayOfdouble[n]) >>> m & 0xFFL ^ bool)] + 1); } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  n = -1; int i1 = 0, i2 = i; while (true) { try { if (i1 < 256) { if (arrayOfInt4[i1] != 0) n = i1;  arrayOfInt5[i1] = i2 += arrayOfInt4[i1]; i1++; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  i1 = i + j - arrayOfInt4[n]; i2 = i; i3 = -1; break; }  for (; i2 <= i1; i2 += arrayOfInt4[i3], arrayOfInt4[i3] = 0) { double d = paramArrayOfdouble[i2]; i3 = (int)(a(d) >>> m & 0xFFL ^ bool); if (i2 < i1) { int i4; for (arrayOfInt5[i3] = arrayOfInt5[i3] - 1; (i4 = arrayOfInt5[i3] - 1) > i2; d = paramArrayOfdouble[i4], paramArrayOfdouble[i4] = d1, i3 = (int)(a(d) >>> m & 0xFFL ^ bool)) double d1 = d;  paramArrayOfdouble[i2] = d; }  continue; try { if (k < 7) try { if (arrayOfInt4[i3] > 1) try { if (arrayOfInt4[i3] < 1024) { e(paramArrayOfdouble, i2, i2 + arrayOfInt4[i3]); } else { arrayOfInt1[b2] = i2; arrayOfInt2[b2] = arrayOfInt4[i3]; arrayOfInt3[b2++] = k + 1; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }   } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }   } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  }  }  } public static void a(double[] paramArrayOfdouble, int paramInt1, int paramInt2, m7 paramm7) { a(paramArrayOfdouble, paramInt1, paramInt2, paramm7, (double[])null); } public static void a(double[] paramArrayOfdouble1, int paramInt1, int paramInt2, double[] paramArrayOfdouble2) { // Byte code:
/*     */     //   0: iload_2
/*     */     //   1: iload_1
/*     */     //   2: isub
/*     */     //   3: istore #4
/*     */     //   5: iload #4
/*     */     //   7: bipush #16
/*     */     //   9: if_icmpge -> 23
/*     */     //   12: aload_0
/*     */     //   13: iload_1
/*     */     //   14: iload_2
/*     */     //   15: invokestatic b : ([DII)V
/*     */     //   18: return
/*     */     //   19: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   22: athrow
/*     */     //   23: aload_3
/*     */     //   24: ifnonnull -> 33
/*     */     //   27: aload_0
/*     */     //   28: iload_2
/*     */     //   29: invokestatic copyOf : ([DI)[D
/*     */     //   32: astore_3
/*     */     //   33: iload_1
/*     */     //   34: iload_2
/*     */     //   35: iadd
/*     */     //   36: iconst_1
/*     */     //   37: iushr
/*     */     //   38: istore #5
/*     */     //   40: aload_3
/*     */     //   41: iload_1
/*     */     //   42: iload #5
/*     */     //   44: aload_0
/*     */     //   45: invokestatic a : ([DII[D)V
/*     */     //   48: aload_3
/*     */     //   49: iload #5
/*     */     //   51: iload_2
/*     */     //   52: aload_0
/*     */     //   53: invokestatic a : ([DII[D)V
/*     */     //   56: aload_3
/*     */     //   57: iload #5
/*     */     //   59: iconst_1
/*     */     //   60: isub
/*     */     //   61: daload
/*     */     //   62: aload_3
/*     */     //   63: iload #5
/*     */     //   65: daload
/*     */     //   66: invokestatic compare : (DD)I
/*     */     //   69: ifgt -> 86
/*     */     //   72: aload_3
/*     */     //   73: iload_1
/*     */     //   74: aload_0
/*     */     //   75: iload_1
/*     */     //   76: iload #4
/*     */     //   78: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
/*     */     //   81: return
/*     */     //   82: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   85: athrow
/*     */     //   86: iload_1
/*     */     //   87: istore #6
/*     */     //   89: iload_1
/*     */     //   90: istore #7
/*     */     //   92: iload #5
/*     */     //   94: istore #8
/*     */     //   96: iload #6
/*     */     //   98: iload_2
/*     */     //   99: if_icmpge -> 185
/*     */     //   102: iload #8
/*     */     //   104: iload_2
/*     */     //   105: if_icmpge -> 150
/*     */     //   108: goto -> 115
/*     */     //   111: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   114: athrow
/*     */     //   115: iload #7
/*     */     //   117: iload #5
/*     */     //   119: if_icmpge -> 168
/*     */     //   122: goto -> 129
/*     */     //   125: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   128: athrow
/*     */     //   129: aload_3
/*     */     //   130: iload #7
/*     */     //   132: daload
/*     */     //   133: aload_3
/*     */     //   134: iload #8
/*     */     //   136: daload
/*     */     //   137: invokestatic compare : (DD)I
/*     */     //   140: ifgt -> 168
/*     */     //   143: goto -> 150
/*     */     //   146: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   149: athrow
/*     */     //   150: aload_0
/*     */     //   151: iload #6
/*     */     //   153: aload_3
/*     */     //   154: iload #7
/*     */     //   156: iinc #7, 1
/*     */     //   159: daload
/*     */     //   160: dastore
/*     */     //   161: goto -> 179
/*     */     //   164: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   167: athrow
/*     */     //   168: aload_0
/*     */     //   169: iload #6
/*     */     //   171: aload_3
/*     */     //   172: iload #8
/*     */     //   174: iinc #8, 1
/*     */     //   177: daload
/*     */     //   178: dastore
/*     */     //   179: iinc #6, 1
/*     */     //   182: goto -> 96
/*     */     //   185: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #344	-> 0
/*     */     //   #776	-> 5
/*     */     //   #219	-> 12
/*     */     //   #682	-> 18
/*     */     //   #244	-> 23
/*     */     //   #2	-> 33
/*     */     //   #247	-> 40
/*     */     //   #318	-> 48
/*     */     //   #140	-> 56
/*     */     //   #220	-> 72
/*     */     //   #635	-> 81
/*     */     //   #106	-> 86
/*     */     //   #897	-> 102
/*     */     //   #646	-> 168
/*     */     //   #323	-> 179
/*     */     //   #354	-> 185
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   5	19	19	java/lang/IllegalArgumentException
/*     */     //   40	82	82	java/lang/IllegalArgumentException
/*     */     //   96	108	111	java/lang/IllegalArgumentException
/*     */     //   102	122	125	java/lang/IllegalArgumentException
/*     */     //   115	143	146	java/lang/IllegalArgumentException
/* 945 */     //   129	164	164	java/lang/IllegalArgumentException } public static void b(int[] paramArrayOfint, double[] paramArrayOfdouble) { d(paramArrayOfint, paramArrayOfdouble, 0, paramArrayOfdouble.length); } public static double[] b(double[] paramArrayOfdouble, int paramInt1, int paramInt2) { try { k(paramArrayOfdouble, paramInt1, paramInt2); } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  double[] arrayOfDouble = (paramInt2 == 0) ? j : new double[paramInt2]; System.arraycopy(paramArrayOfdouble, paramInt1, arrayOfDouble, 0, paramInt2); return arrayOfDouble; }
/* 946 */   public static void b(double[] paramArrayOfdouble, m7 paramm7) { d(paramArrayOfdouble, 0, paramArrayOfdouble.length, paramm7); } public static void j(double[] paramArrayOfdouble, int paramInt1, int paramInt2) { ForkJoinPool forkJoinPool = a(); try { if (paramInt2 - paramInt1 >= 1024) try { if (forkJoinPool.getParallelism() != 1) { byte b = 7; LinkedBlockingQueue<aa> linkedBlockingQueue = new LinkedBlockingQueue(); linkedBlockingQueue.add(new aa(paramInt1, paramInt2 - paramInt1, 0)); AtomicInteger atomicInteger = new AtomicInteger(1); int i = forkJoinPool.getParallelism(); ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(forkJoinPool); int j = i; try { for (; j-- != 0; executorCompletionService.submit(() -> { int[] arrayOfInt1 = new int[256]; int[] arrayOfInt2 = new int[256]; while (true) { if (paramAtomicInteger.get() == 0) { int i3 = paramInt; try { while (i3-- != 0) paramLinkedBlockingQueue.add(m);  } catch (Exception exception) { throw a(null); }  }  aa aa1 = paramLinkedBlockingQueue.take(); try { if (aa1 == m) return null;  } catch (Exception exception) { throw a(null); }  int i = aa1.a; int j = aa1.b; int k = aa1.c; try {  } catch (Exception exception) { throw a(null); }  boolean bool = (k % 8 == 0) ? true : false; int m = (7 - k % 8) * 8; int n = i + j; try { while (n-- != i) arrayOfInt1[(int)(a(paramArrayOfdouble[n]) >>> m & 0xFFL ^ bool)] = arrayOfInt1[(int)(a(paramArrayOfdouble[n]) >>> m & 0xFFL ^ bool)] + 1;  } catch (Exception exception) { throw a(null); }  n = -1; int i1 = 0; int i2 = i; while (true) { try { if (i1 < 256) { if (arrayOfInt1[i1] != 0) n = i1;  arrayOfInt2[i1] = i2 += arrayOfInt1[i1]; i1++; }  } catch (Exception exception) { throw a(null); }  i1 = i + j - arrayOfInt1[n]; i2 = i; int i3 = -1; while (i2 <= i1) { double d = paramArrayOfdouble[i2]; i3 = (int)(a(d) >>> m & 0xFFL ^ bool); if (i2 < i1) { arrayOfInt2[i3] = arrayOfInt2[i3] - 1; int i4; while ((i4 = arrayOfInt2[i3] - 1) > i2) { double d1 = d; d = paramArrayOfdouble[i4]; paramArrayOfdouble[i4] = d1; i3 = (int)(a(d) >>> m & 0xFFL ^ bool); }  paramArrayOfdouble[i2] = d; }  }  break; }  paramAtomicInteger.decrementAndGet(); }  })); } catch (Exception exception) { throw a(null); }  Throwable throwable = null; for (int k = i; k-- != 0;) { try { executorCompletionService.take().get(); } catch (Exception exception) { throwable = exception.getCause(); }  }  try { if (throwable != null) { try {  } catch (Exception exception) { throw a(null); }  throw (throwable instanceof RuntimeException) ? (RuntimeException)throwable : new RuntimeException(throwable); }  } catch (Exception exception) { throw a(null); }  return; }  e(paramArrayOfdouble, paramInt1, paramInt2); return; } catch (Exception exception) { throw a(null); }   } catch (Exception exception) { throw a(null); }  e(paramArrayOfdouble, paramInt1, paramInt2); } public static void d(double[] paramArrayOfdouble) { j(paramArrayOfdouble, 0, paramArrayOfdouble.length); } public static double[] a(double[] paramArrayOfdouble, int paramInt1, int paramInt2, Random paramRandom) { for (int i = paramInt2 - paramInt1; i-- != 0; d = paramArrayOfdouble[paramInt1 + i], paramArrayOfdouble[paramInt1 + i] = paramArrayOfdouble[paramInt1 + j]) { double d; int j = paramRandom.nextInt(i + 1); }  return paramArrayOfdouble; } @Deprecated public static void a(double[] paramArrayOfdouble, double paramDouble) { int i = paramArrayOfdouble.length; try { for (; i-- != 0; paramArrayOfdouble[i] = paramDouble); } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  } public static void d(double[] paramArrayOfdouble1, double[] paramArrayOfdouble2) { b(paramArrayOfdouble1, paramArrayOfdouble2); d(paramArrayOfdouble1, paramArrayOfdouble2, 0, paramArrayOfdouble1.length); } @Deprecated public static void a(double[] paramArrayOfdouble, int paramInt1, int paramInt2, double paramDouble) { try { f(paramArrayOfdouble, paramInt1, paramInt2); if (paramInt1 == 0) { try { for (; paramInt2-- != 0; paramArrayOfdouble[paramInt2] = paramDouble); } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  } else { int i = paramInt1; try { while (i < paramInt2) { paramArrayOfdouble[i] = paramDouble; i++; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  } private static void b(double[] paramArrayOfdouble, int paramInt1, int paramInt2, m7 paramm7) { for (int i = paramInt1; i < paramInt2 - 1; ) { int j = i; int k = i + 1; while (true) { try { if (k < paramInt2) { if (paramm7.a(paramArrayOfdouble[k], paramArrayOfdouble[j]) < 0) j = k;  k++; continue; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  if (j != i) { double d = paramArrayOfdouble[i]; paramArrayOfdouble[i] = paramArrayOfdouble[j]; paramArrayOfdouble[j] = d; }  break; }  i++; }  } public static void d(double[] paramArrayOfdouble, int paramInt1, int paramInt2, m7 paramm7) { c(paramArrayOfdouble, paramInt1, paramInt2, paramm7); } public static void k(double[] paramArrayOfdouble, int paramInt1, int paramInt2) { aL.a(paramArrayOfdouble.length, paramInt1, paramInt2); } public static double[] c(double[] paramArrayOfdouble, int paramInt) { return e(paramArrayOfdouble, paramInt, paramArrayOfdouble.length); } public static void a(int[] paramArrayOfint, double[] paramArrayOfdouble1, double[] paramArrayOfdouble2, boolean paramBoolean) { b(paramArrayOfdouble1, paramArrayOfdouble2); a(paramArrayOfint, paramArrayOfdouble1, paramArrayOfdouble2, 0, paramArrayOfdouble1.length, paramBoolean); } public static void g(double[] paramArrayOfdouble, int paramInt1, int paramInt2, m7 paramm7) { a(paramArrayOfdouble, paramInt1, paramInt2, paramm7); } public static double[] b(double[] paramArrayOfdouble, int paramInt) { return c(paramArrayOfdouble, paramInt, paramArrayOfdouble.length); } public static void a(int[] paramArrayOfint, double[] paramArrayOfdouble, boolean paramBoolean) { a(paramArrayOfint, paramArrayOfdouble, 0, paramArrayOfdouble.length, paramBoolean); } public static void f(double[] paramArrayOfdouble) { e(paramArrayOfdouble, 0, paramArrayOfdouble.length); } public static void a(int[] paramArrayOfint, double[] paramArrayOfdouble, int paramInt1, int paramInt2, boolean paramBoolean) { ForkJoinPool forkJoinPool = a(); try { if (paramInt2 - paramInt1 >= 1024) try { if (forkJoinPool.getParallelism() != 1) { byte b = 7; LinkedBlockingQueue<aa> linkedBlockingQueue = new LinkedBlockingQueue(); linkedBlockingQueue.add(new aa(paramInt1, paramInt2 - paramInt1, 0)); AtomicInteger atomicInteger = new AtomicInteger(1); int i = forkJoinPool.getParallelism(); ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(forkJoinPool); try {  } catch (Exception exception) { throw a(null); }  int[] arrayOfInt = paramBoolean ? new int[paramArrayOfint.length] : null; int j = i; try { for (; j-- != 0; executorCompletionService.submit(() -> { int[] arrayOfInt1 = new int[256]; int[] arrayOfInt2 = new int[256]; while (true) { if (paramAtomicInteger.get() == 0) { int i3 = paramInt; try { while (i3-- != 0) paramLinkedBlockingQueue.add(m);  } catch (Exception exception) { throw a(null); }  }  aa aa1 = paramLinkedBlockingQueue.take(); try { if (aa1 == m)
/*     */                           return null;  } catch (Exception exception) { throw a(null); }  int i = aa1.a; int j = aa1.b; int k = aa1.c; try {  } catch (Exception exception) { throw a(null); }  boolean bool = (k % 8 == 0) ? true : false; int m = (7 - k % 8) * 8; int n = i + j; try { while (n-- != i)
/*     */                           arrayOfInt1[(int)(a(paramArrayOfdouble[paramArrayOfint1[n]]) >>> m & 0xFFL ^ bool)] = arrayOfInt1[(int)(a(paramArrayOfdouble[paramArrayOfint1[n]]) >>> m & 0xFFL ^ bool)] + 1;  } catch (Exception exception) { throw a(null); }  n = -1; int i1 = 0; int i2 = i; while (true) { try { if (i1 < 256) { if (arrayOfInt1[i1] != 0)
/* 949 */                               n = i1;  arrayOfInt2[i1] = i2 += arrayOfInt1[i1]; }  } catch (Exception exception) { throw a(null); }  if (paramBoolean) { i1 = i + j; try { while (i1-- != i) { arrayOfInt2[(int)(a(paramArrayOfdouble[paramArrayOfint1[i1]]) >>> m & 0xFFL ^ bool)] = arrayOfInt2[(int)(a(paramArrayOfdouble[paramArrayOfint1[i1]]) >>> m & 0xFFL ^ bool)] - 1; paramArrayOfint2[arrayOfInt2[(int)(a(paramArrayOfdouble[paramArrayOfint1[i1]]) >>> m & 0xFFL ^ bool)] - 1] = paramArrayOfint1[i1]; }  } catch (Exception exception) { throw a(null); }  }  i1 = i + j - arrayOfInt1[n]; i2 = i; for (int i3 = -1; i2 <= i1; i3 = (int)(a(paramArrayOfdouble[i4]) >>> m & 0xFFL ^ bool)) { continue; i4 = paramArrayOfint1[i2]; }  paramAtomicInteger.decrementAndGet(); }  paramAtomicInteger.decrementAndGet(); }  })); } catch (Exception exception) { throw a(null); }  Throwable throwable = null; for (int k = i; k-- != 0;) { try { executorCompletionService.take().get(); } catch (Exception exception) { throwable = exception.getCause(); }  }  try { if (throwable != null) { try {  } catch (Exception exception) { throw a(null); }  throw (throwable instanceof RuntimeException) ? (RuntimeException)throwable : new RuntimeException(throwable); }  } catch (Exception exception) { throw a(null); }  return; }  b(paramArrayOfint, paramArrayOfdouble, paramInt1, paramInt2, paramBoolean); return; } catch (Exception exception) { throw a(null); }   } catch (Exception exception) { throw a(null); }  b(paramArrayOfint, paramArrayOfdouble, paramInt1, paramInt2, paramBoolean); } public static void d(double[] paramArrayOfdouble1, double[] paramArrayOfdouble2, int paramInt1, int paramInt2) { try { if (paramInt2 - paramInt1 < 1024) { f(paramArrayOfdouble1, paramArrayOfdouble2, paramInt1, paramInt2); return; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  byte b1 = 2; byte b2 = 15; char c = '໲'; byte b3 = 0; int[] arrayOfInt1 = new int[3826]; int[] arrayOfInt2 = new int[3826]; int[] arrayOfInt3 = new int[3826]; arrayOfInt1[b3] = paramInt1; arrayOfInt2[b3] = paramInt2 - paramInt1;
/*     */     arrayOfInt3[b3++] = 0;
/*     */     int[] arrayOfInt4 = new int[256];
/*     */     int[] arrayOfInt5 = new int[256];
/*     */     while (b3 > 0) {
/*     */       int i = arrayOfInt1[--b3];
/*     */       int j = arrayOfInt2[b3];
/*     */       int k = arrayOfInt3[b3];
/*     */       try {
/*     */       
/*     */       } catch (IllegalArgumentException illegalArgumentException) {
/*     */         throw a(null);
/*     */       } 
/*     */       boolean bool = (k % 8 == 0) ? true : false;
/*     */       try {
/*     */       
/*     */       } catch (IllegalArgumentException illegalArgumentException) {
/*     */         throw a(null);
/*     */       } 
/*     */     }  }
/*     */ 
/*     */   
/*     */   public static int a(double[] paramArrayOfdouble, double paramDouble) {
/*     */     return a(paramArrayOfdouble, 0, paramArrayOfdouble.length, paramDouble);
/*     */   }
/*     */   
/*     */   private static void e(double[] paramArrayOfdouble, int paramInt1, int paramInt2, m7 paramm7) {
/*     */     for (int i = paramInt1; ++i < paramInt2; d2 = paramArrayOfdouble[j - 1]) {
/*     */       double d2, d1 = paramArrayOfdouble[i];
/*     */       int j = i;
/*     */     } 
/*     */   }
/*     */   
/*     */   private static int a(double[] paramArrayOfdouble, int paramInt1, int paramInt2, int paramInt3) {
/*     */     int i = Double.compare(paramArrayOfdouble[paramInt1], paramArrayOfdouble[paramInt2]);
/*     */     int j = Double.compare(paramArrayOfdouble[paramInt1], paramArrayOfdouble[paramInt3]);
/*     */     int k = Double.compare(paramArrayOfdouble[paramInt2], paramArrayOfdouble[paramInt3]);
/*     */     try {
/*     */       if (i < 0) {
/*     */         try {
/*     */           try {
/*     */           
/*     */           } catch (IllegalArgumentException illegalArgumentException) {
/*     */             throw a(null);
/*     */           } 
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw a(null);
/*     */         } 
/*     */       } else {
/*     */         try {
/*     */           try {
/*     */           
/*     */           } catch (IllegalArgumentException illegalArgumentException) {
/*     */             throw a(null);
/*     */           } 
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw a(null);
/*     */         } 
/*     */       } 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     return (k > 0) ? paramInt2 : ((j > 0) ? paramInt3 : paramInt1);
/*     */   }
/*     */   
/*     */   public static void a(int[] paramArrayOfint, double[] paramArrayOfdouble1, double[] paramArrayOfdouble2, int paramInt1, int paramInt2, boolean paramBoolean) {
/*     */     try {
/*     */       if (paramInt2 - paramInt1 < 1024) {
/*     */         a(paramArrayOfint, paramArrayOfdouble1, paramArrayOfdouble2, paramInt1, paramInt2);
/*     */         return;
/*     */       } 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     byte b1 = 2;
/*     */     byte b2 = 15;
/*     */     char c = '໲';
/*     */     byte b3 = 0;
/*     */     int[] arrayOfInt1 = new int[3826];
/*     */     int[] arrayOfInt2 = new int[3826];
/*     */     int[] arrayOfInt3 = new int[3826];
/*     */     arrayOfInt1[b3] = paramInt1;
/*     */     arrayOfInt2[b3] = paramInt2 - paramInt1;
/*     */     arrayOfInt3[b3++] = 0;
/*     */     int[] arrayOfInt4 = new int[256];
/*     */     int[] arrayOfInt5 = new int[256];
/*     */     try {
/*     */     
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     int[] arrayOfInt6 = paramBoolean ? new int[paramArrayOfint.length] : null;
/*     */     while (b3 > 0) {
/*     */       int i = arrayOfInt1[--b3];
/*     */       int j = arrayOfInt2[b3];
/*     */       int k = arrayOfInt3[b3];
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void d(double[] paramArrayOfdouble, int paramInt1, int paramInt2) {
/*     */     for (int i = paramInt1; i < paramInt2 - 1; i++) {
/*     */       int j = i;
/*     */       int k = i + 1;
/*     */       while (true) {
/*     */         try {
/*     */           if (k < paramInt2) {
/*     */             if (Double.compare(paramArrayOfdouble[k], paramArrayOfdouble[j]) < 0)
/*     */               j = k; 
/*     */             k++;
/*     */             continue;
/*     */           } 
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw a(null);
/*     */         } 
/*     */         if (j != i) {
/*     */           double d = paramArrayOfdouble[i];
/*     */           paramArrayOfdouble[i] = paramArrayOfdouble[j];
/*     */         } 
/*     */         break;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void b(int[] paramArrayOfint, double[] paramArrayOfdouble, boolean paramBoolean) {
/*     */     b(paramArrayOfint, paramArrayOfdouble, 0, paramArrayOfint.length, paramBoolean);
/*     */   }
/*     */   
/*     */   public static void d(double[] paramArrayOfdouble, m7 paramm7) {
/*     */     a(paramArrayOfdouble, 0, paramArrayOfdouble.length, paramm7);
/*     */   }
/*     */   
/*     */   public static void g(double[] paramArrayOfdouble1, double[] paramArrayOfdouble2, int paramInt1, int paramInt2) {
/*     */     ForkJoinPool forkJoinPool = a();
/*     */     try {
/*     */       if (paramInt2 - paramInt1 >= 8192) {
/*     */         try {
/*     */           if (forkJoinPool.getParallelism() == 1) {
/*     */             e(paramArrayOfdouble1, paramArrayOfdouble2, paramInt1, paramInt2);
/*     */             return;
/*     */           } 
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw a(null);
/*     */         } 
/*     */         forkJoinPool.invoke(new gF(paramArrayOfdouble1, paramArrayOfdouble2, paramInt1, paramInt2));
/*     */         return;
/*     */       } 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     e(paramArrayOfdouble1, paramArrayOfdouble2, paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public static void a(double[] paramArrayOfdouble, m7 paramm7) {
/*     */     f(paramArrayOfdouble, 0, paramArrayOfdouble.length, paramm7);
/*     */   }
/*     */   
/*     */   public static void a(double[] paramArrayOfdouble, int paramInt1, int paramInt2, int paramInt3) {
/*     */     byte b = 0;
/*     */     try {
/*     */       while (b < paramInt3) {
/*     */         l(paramArrayOfdouble, paramInt1, paramInt2);
/*     */         b++;
/*     */         paramInt1++;
/*     */         paramInt2++;
/*     */       } 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void c(double[] paramArrayOfdouble) {
/*     */     c(paramArrayOfdouble, 0, paramArrayOfdouble.length);
/*     */   }
/*     */   
/*     */   public static void b(int[] paramArrayOfint, double[] paramArrayOfdouble, int paramInt1, int paramInt2) {
/*     */     // Byte code:
/*     */     //   0: iload_2
/*     */     //   1: istore #4
/*     */     //   3: iload_2
/*     */     //   4: iconst_1
/*     */     //   5: iadd
/*     */     //   6: istore #5
/*     */     //   8: iload #5
/*     */     //   10: iload_3
/*     */     //   11: if_icmpge -> 78
/*     */     //   14: aload_1
/*     */     //   15: aload_0
/*     */     //   16: iload #5
/*     */     //   18: iaload
/*     */     //   19: daload
/*     */     //   20: aload_1
/*     */     //   21: aload_0
/*     */     //   22: iload #4
/*     */     //   24: iaload
/*     */     //   25: daload
/*     */     //   26: dcmpl
/*     */     //   27: ifeq -> 72
/*     */     //   30: goto -> 37
/*     */     //   33: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   36: athrow
/*     */     //   37: iload #5
/*     */     //   39: iload #4
/*     */     //   41: isub
/*     */     //   42: iconst_1
/*     */     //   43: if_icmple -> 68
/*     */     //   46: goto -> 53
/*     */     //   49: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   52: athrow
/*     */     //   53: aload_0
/*     */     //   54: iload #4
/*     */     //   56: iload #5
/*     */     //   58: invokestatic k : ([III)V
/*     */     //   61: goto -> 68
/*     */     //   64: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   67: athrow
/*     */     //   68: iload #5
/*     */     //   70: istore #4
/*     */     //   72: iinc #5, 1
/*     */     //   75: goto -> 8
/*     */     //   78: iload_3
/*     */     //   79: iload #4
/*     */     //   81: isub
/*     */     //   82: iconst_1
/*     */     //   83: if_icmple -> 100
/*     */     //   86: aload_0
/*     */     //   87: iload #4
/*     */     //   89: iload_3
/*     */     //   90: invokestatic k : ([III)V
/*     */     //   93: goto -> 100
/*     */     //   96: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   99: athrow
/*     */     //   100: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #602	-> 0
/*     */     //   #587	-> 3
/*     */     //   #62	-> 14
/*     */     //   #545	-> 37
/*     */     //   #843	-> 68
/*     */     //   #572	-> 72
/*     */     //   #39	-> 78
/*     */     //   #606	-> 100
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   8	30	33	java/lang/IllegalArgumentException
/*     */     //   14	46	49	java/lang/IllegalArgumentException
/*     */     //   37	61	64	java/lang/IllegalArgumentException
/*     */     //   78	93	96	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public static boolean a(double[] paramArrayOfdouble1, double[] paramArrayOfdouble2) {
/*     */     int i = paramArrayOfdouble1.length;
/*     */     try {
/*     */       if (i != paramArrayOfdouble2.length)
/*     */         return false; 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     while (i-- != 0) {
/*     */       if (Double.doubleToLongBits(paramArrayOfdouble1[i]) != Double.doubleToLongBits(paramArrayOfdouble2[i]))
/*     */         return false; 
/*     */     } 
/*     */     return true;
/*     */   }
/*     */   
/*     */   public static void f(double[] paramArrayOfdouble, int paramInt1, int paramInt2) {
/*     */     aL.b(paramArrayOfdouble.length, paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   private static final long a(double paramDouble) {
/*     */     long l = Double.doubleToLongBits(paramDouble);
/*     */     try {
/*     */     
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     return (l >= 0L) ? l : (l ^ Long.MAX_VALUE);
/*     */   }
/*     */   
/*     */   public static void e(double[] paramArrayOfdouble, int paramInt1, int paramInt2) {
/*     */     // Byte code:
/*     */     //   0: iload_2
/*     */     //   1: iload_1
/*     */     //   2: isub
/*     */     //   3: istore_3
/*     */     //   4: iload_3
/*     */     //   5: bipush #16
/*     */     //   7: if_icmpge -> 21
/*     */     //   10: aload_0
/*     */     //   11: iload_1
/*     */     //   12: iload_2
/*     */     //   13: invokestatic d : ([DII)V
/*     */     //   16: return
/*     */     //   17: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   20: athrow
/*     */     //   21: iload_1
/*     */     //   22: iload_3
/*     */     //   23: iconst_2
/*     */     //   24: idiv
/*     */     //   25: iadd
/*     */     //   26: istore #4
/*     */     //   28: iload_1
/*     */     //   29: istore #5
/*     */     //   31: iload_2
/*     */     //   32: iconst_1
/*     */     //   33: isub
/*     */     //   34: istore #6
/*     */     //   36: iload_3
/*     */     //   37: sipush #128
/*     */     //   40: if_icmple -> 107
/*     */     //   43: iload_3
/*     */     //   44: bipush #8
/*     */     //   46: idiv
/*     */     //   47: istore #7
/*     */     //   49: aload_0
/*     */     //   50: iload #5
/*     */     //   52: iload #5
/*     */     //   54: iload #7
/*     */     //   56: iadd
/*     */     //   57: iload #5
/*     */     //   59: iconst_2
/*     */     //   60: iload #7
/*     */     //   62: imul
/*     */     //   63: iadd
/*     */     //   64: invokestatic a : ([DIII)I
/*     */     //   67: istore #5
/*     */     //   69: aload_0
/*     */     //   70: iload #4
/*     */     //   72: iload #7
/*     */     //   74: isub
/*     */     //   75: iload #4
/*     */     //   77: iload #4
/*     */     //   79: iload #7
/*     */     //   81: iadd
/*     */     //   82: invokestatic a : ([DIII)I
/*     */     //   85: istore #4
/*     */     //   87: aload_0
/*     */     //   88: iload #6
/*     */     //   90: iconst_2
/*     */     //   91: iload #7
/*     */     //   93: imul
/*     */     //   94: isub
/*     */     //   95: iload #6
/*     */     //   97: iload #7
/*     */     //   99: isub
/*     */     //   100: iload #6
/*     */     //   102: invokestatic a : ([DIII)I
/*     */     //   105: istore #6
/*     */     //   107: aload_0
/*     */     //   108: iload #5
/*     */     //   110: iload #4
/*     */     //   112: iload #6
/*     */     //   114: invokestatic a : ([DIII)I
/*     */     //   117: istore #4
/*     */     //   119: aload_0
/*     */     //   120: iload #4
/*     */     //   122: daload
/*     */     //   123: dstore #7
/*     */     //   125: iload_1
/*     */     //   126: istore #9
/*     */     //   128: iload #9
/*     */     //   130: istore #10
/*     */     //   132: iload_2
/*     */     //   133: iconst_1
/*     */     //   134: isub
/*     */     //   135: istore #11
/*     */     //   137: iload #11
/*     */     //   139: istore #12
/*     */     //   141: iload #10
/*     */     //   143: iload #11
/*     */     //   145: if_icmpgt -> 199
/*     */     //   148: aload_0
/*     */     //   149: iload #10
/*     */     //   151: daload
/*     */     //   152: dload #7
/*     */     //   154: invokestatic compare : (DD)I
/*     */     //   157: dup
/*     */     //   158: istore #13
/*     */     //   160: ifgt -> 199
/*     */     //   163: iload #13
/*     */     //   165: ifne -> 193
/*     */     //   168: goto -> 175
/*     */     //   171: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   174: athrow
/*     */     //   175: aload_0
/*     */     //   176: iload #9
/*     */     //   178: iinc #9, 1
/*     */     //   181: iload #10
/*     */     //   183: invokestatic l : ([DII)V
/*     */     //   186: goto -> 193
/*     */     //   189: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   192: athrow
/*     */     //   193: iinc #10, 1
/*     */     //   196: goto -> 141
/*     */     //   199: iload #11
/*     */     //   201: iload #10
/*     */     //   203: if_icmplt -> 257
/*     */     //   206: aload_0
/*     */     //   207: iload #11
/*     */     //   209: daload
/*     */     //   210: dload #7
/*     */     //   212: invokestatic compare : (DD)I
/*     */     //   215: dup
/*     */     //   216: istore #13
/*     */     //   218: iflt -> 257
/*     */     //   221: iload #13
/*     */     //   223: ifne -> 251
/*     */     //   226: goto -> 233
/*     */     //   229: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   232: athrow
/*     */     //   233: aload_0
/*     */     //   234: iload #11
/*     */     //   236: iload #12
/*     */     //   238: iinc #12, -1
/*     */     //   241: invokestatic l : ([DII)V
/*     */     //   244: goto -> 251
/*     */     //   247: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   250: athrow
/*     */     //   251: iinc #11, -1
/*     */     //   254: goto -> 199
/*     */     //   257: iload #10
/*     */     //   259: iload #11
/*     */     //   261: if_icmple -> 271
/*     */     //   264: goto -> 288
/*     */     //   267: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   270: athrow
/*     */     //   271: aload_0
/*     */     //   272: iload #10
/*     */     //   274: iinc #10, 1
/*     */     //   277: iload #11
/*     */     //   279: iinc #11, -1
/*     */     //   282: invokestatic l : ([DII)V
/*     */     //   285: goto -> 141
/*     */     //   288: iload #9
/*     */     //   290: iload_1
/*     */     //   291: isub
/*     */     //   292: iload #10
/*     */     //   294: iload #9
/*     */     //   296: isub
/*     */     //   297: invokestatic min : (II)I
/*     */     //   300: istore #13
/*     */     //   302: aload_0
/*     */     //   303: iload_1
/*     */     //   304: iload #10
/*     */     //   306: iload #13
/*     */     //   308: isub
/*     */     //   309: iload #13
/*     */     //   311: invokestatic a : ([DIII)V
/*     */     //   314: iload #12
/*     */     //   316: iload #11
/*     */     //   318: isub
/*     */     //   319: iload_2
/*     */     //   320: iload #12
/*     */     //   322: isub
/*     */     //   323: iconst_1
/*     */     //   324: isub
/*     */     //   325: invokestatic min : (II)I
/*     */     //   328: istore #13
/*     */     //   330: aload_0
/*     */     //   331: iload #10
/*     */     //   333: iload_2
/*     */     //   334: iload #13
/*     */     //   336: isub
/*     */     //   337: iload #13
/*     */     //   339: invokestatic a : ([DIII)V
/*     */     //   342: iload #10
/*     */     //   344: iload #9
/*     */     //   346: isub
/*     */     //   347: dup
/*     */     //   348: istore #13
/*     */     //   350: iconst_1
/*     */     //   351: if_icmple -> 370
/*     */     //   354: aload_0
/*     */     //   355: iload_1
/*     */     //   356: iload_1
/*     */     //   357: iload #13
/*     */     //   359: iadd
/*     */     //   360: invokestatic e : ([DII)V
/*     */     //   363: goto -> 370
/*     */     //   366: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   369: athrow
/*     */     //   370: iload #12
/*     */     //   372: iload #11
/*     */     //   374: isub
/*     */     //   375: dup
/*     */     //   376: istore #13
/*     */     //   378: iconst_1
/*     */     //   379: if_icmple -> 398
/*     */     //   382: aload_0
/*     */     //   383: iload_2
/*     */     //   384: iload #13
/*     */     //   386: isub
/*     */     //   387: iload_2
/*     */     //   388: invokestatic e : ([DII)V
/*     */     //   391: goto -> 398
/*     */     //   394: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   397: athrow
/*     */     //   398: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #619	-> 0
/*     */     //   #528	-> 4
/*     */     //   #826	-> 10
/*     */     //   #169	-> 16
/*     */     //   #541	-> 21
/*     */     //   #751	-> 28
/*     */     //   #547	-> 31
/*     */     //   #307	-> 36
/*     */     //   #923	-> 43
/*     */     //   #278	-> 49
/*     */     //   #13	-> 69
/*     */     //   #728	-> 87
/*     */     //   #81	-> 107
/*     */     //   #721	-> 119
/*     */     //   #395	-> 125
/*     */     //   #804	-> 141
/*     */     //   #253	-> 163
/*     */     //   #760	-> 193
/*     */     //   #100	-> 199
/*     */     //   #404	-> 221
/*     */     //   #565	-> 251
/*     */     //   #555	-> 257
/*     */     //   #301	-> 271
/*     */     //   #791	-> 288
/*     */     //   #164	-> 302
/*     */     //   #421	-> 314
/*     */     //   #332	-> 330
/*     */     //   #593	-> 342
/*     */     //   #711	-> 370
/*     */     //   #482	-> 398
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   4	17	17	java/lang/IllegalArgumentException
/*     */     //   160	168	171	java/lang/IllegalArgumentException
/*     */     //   163	186	189	java/lang/IllegalArgumentException
/*     */     //   218	226	229	java/lang/IllegalArgumentException
/*     */     //   221	244	247	java/lang/IllegalArgumentException
/*     */     //   257	267	267	java/lang/IllegalArgumentException
/*     */     //   350	363	366	java/lang/IllegalArgumentException
/*     */     //   378	391	394	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public static double[] a(double[] paramArrayOfdouble) {
/*     */     int i = paramArrayOfdouble.length;
/*     */     for (int j = i / 2; j-- != 0; paramArrayOfdouble[i - j - 1] = paramArrayOfdouble[j], paramArrayOfdouble[j] = d)
/*     */       double d = paramArrayOfdouble[i - j - 1]; 
/*     */     return paramArrayOfdouble;
/*     */   }
/*     */   
/*     */   public static void e(double[] paramArrayOfdouble1, double[] paramArrayOfdouble2) {
/*     */     b(paramArrayOfdouble1, paramArrayOfdouble2);
/*     */     g(paramArrayOfdouble1, paramArrayOfdouble2, 0, paramArrayOfdouble1.length);
/*     */   }
/*     */   
/*     */   public static void l(double[] paramArrayOfdouble, int paramInt1, int paramInt2) {
/*     */     double d = paramArrayOfdouble[paramInt1];
/*     */     paramArrayOfdouble[paramInt1] = paramArrayOfdouble[paramInt2];
/*     */     paramArrayOfdouble[paramInt2] = d;
/*     */   }
/*     */   
/*     */   private static int a(double[] paramArrayOfdouble1, double[] paramArrayOfdouble2, int paramInt1, int paramInt2, int paramInt3) {
/*     */     try {
/*     */     
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     int i, j = ((i = Double.compare(paramArrayOfdouble1[paramInt1], paramArrayOfdouble1[paramInt2])) == 0) ? Double.compare(paramArrayOfdouble2[paramInt1], paramArrayOfdouble2[paramInt2]) : i;
/*     */     try {
/*     */     
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     int k = ((i = Double.compare(paramArrayOfdouble1[paramInt1], paramArrayOfdouble1[paramInt3])) == 0) ? Double.compare(paramArrayOfdouble2[paramInt1], paramArrayOfdouble2[paramInt3]) : i;
/*     */     try {
/*     */     
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     int m = ((i = Double.compare(paramArrayOfdouble1[paramInt2], paramArrayOfdouble1[paramInt3])) == 0) ? Double.compare(paramArrayOfdouble2[paramInt2], paramArrayOfdouble2[paramInt3]) : i;
/*     */     try {
/*     */       if (j < 0) {
/*     */         try {
/*     */           try {
/*     */           
/*     */           } catch (IllegalArgumentException illegalArgumentException) {
/*     */             throw a(null);
/*     */           } 
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw a(null);
/*     */         } 
/*     */       } else {
/*     */         try {
/*     */           try {
/*     */           
/*     */           } catch (IllegalArgumentException illegalArgumentException) {
/*     */             throw a(null);
/*     */           } 
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw a(null);
/*     */         } 
/*     */       } 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     return (m > 0) ? paramInt2 : ((k > 0) ? paramInt3 : paramInt1);
/*     */   }
/*     */   
/*     */   public static double[] d(double[] paramArrayOfdouble, int paramInt) {
/*     */     try {
/*     */       if (paramInt >= paramArrayOfdouble.length)
/*     */         return paramArrayOfdouble; 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     try {
/*     */     
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     double[] arrayOfDouble = (paramInt == 0) ? j : new double[paramInt];
/*     */     System.arraycopy(paramArrayOfdouble, 0, arrayOfDouble, 0, paramInt);
/*     */     return arrayOfDouble;
/*     */   }
/*     */   
/*     */   public static void a(double[][] paramArrayOfdouble) {
/*     */     a(paramArrayOfdouble, 0, (paramArrayOfdouble[0]).length);
/*     */   }
/*     */   
/*     */   private static void f(double[] paramArrayOfdouble1, double[] paramArrayOfdouble2, int paramInt1, int paramInt2) {
/*     */     for (int i = paramInt1; i < paramInt2 - 1; ) {
/*     */       continue;
/*     */       j = i;
/*     */       k = i + 1;
/*     */       while (true)
/*     */         k++; 
/*     */       if (j != i) {
/*     */         double d = paramArrayOfdouble1[i];
/*     */         paramArrayOfdouble1[i] = paramArrayOfdouble1[j];
/*     */         paramArrayOfdouble1[j] = d;
/*     */         d = paramArrayOfdouble2[i];
/*     */         paramArrayOfdouble2[i] = paramArrayOfdouble2[j];
/*     */         paramArrayOfdouble2[j] = d;
/*     */       } 
/*     */       i++;
/*     */     } 
/*     */   }
/*     */   
/*     */   public static double[] e(double[] paramArrayOfdouble, int paramInt1, int paramInt2) {
/*     */     if (paramInt1 > paramArrayOfdouble.length) {
/*     */       int i = (int)Math.max(Math.min(paramArrayOfdouble.length + (paramArrayOfdouble.length >> 1), 2147483639L), paramInt1);
/*     */       double[] arrayOfDouble = new double[i];
/*     */       System.arraycopy(paramArrayOfdouble, 0, arrayOfDouble, 0, paramInt2);
/*     */     } 
/*     */     return paramArrayOfdouble;
/*     */   }
/*     */   
/*     */   public static void c(double[] paramArrayOfdouble, int paramInt1, int paramInt2) {
/*     */     ForkJoinPool forkJoinPool = a();
/*     */     try {
/*     */       if (paramInt2 - paramInt1 >= 8192) {
/*     */         try {
/*     */           if (forkJoinPool.getParallelism() == 1) {
/*     */             e(paramArrayOfdouble, paramInt1, paramInt2);
/*     */             return;
/*     */           } 
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw a(null);
/*     */         } 
/*     */         forkJoinPool.invoke(new b6(paramArrayOfdouble, paramInt1, paramInt2));
/*     */         return;
/*     */       } 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     e(paramArrayOfdouble, paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public static void b(double[] paramArrayOfdouble) {
/*     */     a(paramArrayOfdouble, 0, paramArrayOfdouble.length);
/*     */   }
/*     */   
/*     */   public static void f(double[] paramArrayOfdouble, int paramInt1, int paramInt2, m7 paramm7) {
/*     */     ForkJoinPool forkJoinPool = a();
/*     */     try {
/*     */       if (paramInt2 - paramInt1 >= 8192) {
/*     */         try {
/*     */           if (forkJoinPool.getParallelism() == 1) {
/*     */             c(paramArrayOfdouble, paramInt1, paramInt2, paramm7);
/*     */             return;
/*     */           } 
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw a(null);
/*     */         } 
/*     */         forkJoinPool.invoke(new lm(paramArrayOfdouble, paramInt1, paramInt2, paramm7));
/*     */         return;
/*     */       } 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     c(paramArrayOfdouble, paramInt1, paramInt2, paramm7);
/*     */   }
/*     */   
/*     */   public static double[] a(double[] paramArrayOfdouble, int paramInt1, int paramInt2) {
/*     */     int i = paramInt2 - paramInt1;
/*     */     for (int j = i / 2; j-- != 0; ) {
/*     */       double d = paramArrayOfdouble[paramInt1 + i - j - 1];
/*     */       paramArrayOfdouble[paramInt1 + i - j - 1] = paramArrayOfdouble[paramInt1 + j];
/*     */       paramArrayOfdouble[paramInt1 + j] = d;
/*     */     } 
/*     */     return paramArrayOfdouble;
/*     */   }
/*     */   
/*     */   private static void b(double[] paramArrayOfdouble, int paramInt1, int paramInt2) {
/*     */     for (int i = paramInt1; ++i < paramInt2; ) {
/*     */       double d1 = paramArrayOfdouble[i];
/*     */       int j = i;
/*     */       double d2 = paramArrayOfdouble[j - 1];
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void c(int[] paramArrayOfint, double[] paramArrayOfdouble, int paramInt1, int paramInt2) {
/*     */     for (int i = paramInt1; ++i < paramInt2; k = i, m = paramArrayOfint[k - 1])
/*     */       int k, m, j = paramArrayOfint[i]; 
/*     */   }
/*     */   
/*     */   public static double[] d(double[] paramArrayOfdouble, int paramInt1, int paramInt2) {
/*     */     double[] arrayOfDouble = new double[paramInt1];
/*     */     System.arraycopy(paramArrayOfdouble, 0, arrayOfDouble, 0, paramInt2);
/*     */     return arrayOfDouble;
/*     */   }
/*     */   
/*     */   private static void b(double[] paramArrayOfdouble1, double[] paramArrayOfdouble2, int paramInt1, int paramInt2, int paramInt3) {
/*     */     byte b = 0;
/*     */     try {
/*     */       while (b < paramInt3) {
/*     */         a(paramArrayOfdouble1, paramArrayOfdouble2, paramInt1, paramInt2);
/*     */         b++;
/*     */         paramInt1++;
/*     */         paramInt2++;
/*     */       } 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static double[] a(double[] paramArrayOfdouble, int paramInt) {
/*     */     try {
/*     */       if (paramInt == paramArrayOfdouble.length)
/*     */         return paramArrayOfdouble; 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     try {
/*     */       if (paramInt < paramArrayOfdouble.length)
/*     */         return d(paramArrayOfdouble, paramInt); 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     return b(paramArrayOfdouble, paramInt);
/*     */   }
/*     */   
/*     */   private static int a(int[] paramArrayOfint, double[] paramArrayOfdouble, int paramInt1, int paramInt2, int paramInt3) {
/*     */     double d1 = paramArrayOfdouble[paramArrayOfint[paramInt1]];
/*     */     double d2 = paramArrayOfdouble[paramArrayOfint[paramInt2]];
/*     */     double d3 = paramArrayOfdouble[paramArrayOfint[paramInt3]];
/*     */     int i = Double.compare(d1, d2);
/*     */     int j = Double.compare(d1, d3);
/*     */     int k = Double.compare(d2, d3);
/*     */     try {
/*     */       if (i < 0) {
/*     */         try {
/*     */           try {
/*     */           
/*     */           } catch (IllegalArgumentException illegalArgumentException) {
/*     */             throw a(null);
/*     */           } 
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw a(null);
/*     */         } 
/*     */       } else {
/*     */         try {
/*     */           try {
/*     */           
/*     */           } catch (IllegalArgumentException illegalArgumentException) {
/*     */             throw a(null);
/*     */           } 
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw a(null);
/*     */         } 
/*     */       } 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     return (k > 0) ? paramInt2 : ((j > 0) ? paramInt3 : paramInt1);
/*     */   }
/*     */   
/*     */   public static void i(double[] paramArrayOfdouble, int paramInt1, int paramInt2) {
/*     */     try {
/*     */       if (paramInt2 - paramInt1 >= 4000) {
/*     */         h(paramArrayOfdouble, paramInt1, paramInt2);
/*     */       } else {
/*     */         e(paramArrayOfdouble, paramInt1, paramInt2);
/*     */       } 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static double[] a(double[] paramArrayOfdouble, Random paramRandom) {
/*     */     for (int i = paramArrayOfdouble.length; i-- != 0; paramArrayOfdouble[i] = paramArrayOfdouble[j]) {
/*     */       int j = paramRandom.nextInt(i + 1);
/*     */       double d = paramArrayOfdouble[i];
/*     */     } 
/*     */     return paramArrayOfdouble;
/*     */   }
/*     */   
/*     */   public static void e(double[] paramArrayOfdouble, m7 paramm7) {
/*     */     c(paramArrayOfdouble, 0, paramArrayOfdouble.length, paramm7);
/*     */   }
/*     */   
/*     */   public static int a(double[] paramArrayOfdouble, int paramInt1, int paramInt2, double paramDouble) {
/*     */     paramInt2--;
/*     */     for (; paramInt1 <= paramInt2; d = paramArrayOfdouble[i]) {
/*     */       double d;
/*     */       int i = paramInt1 + paramInt2 >>> 1;
/*     */     } 
/*     */     return -(paramInt1 + 1);
/*     */   }
/*     */   
/*     */   public static double[] c(double[] paramArrayOfdouble, int paramInt1, int paramInt2) {
/*     */     try {
/*     */     
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     return (paramInt1 > paramArrayOfdouble.length) ? d(paramArrayOfdouble, paramInt1, paramInt2) : paramArrayOfdouble;
/*     */   }
/*     */   
/*     */   private static ForkJoinPool a() {
/*     */     ForkJoinPool forkJoinPool = ForkJoinTask.getPool();
/*     */     try {
/*     */     
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     return (forkJoinPool == null) ? ForkJoinPool.commonPool() : forkJoinPool;
/*     */   }
/*     */   
/*     */   private static void a(double[][] paramArrayOfdouble, int paramInt1, int paramInt2, int paramInt3) {
/*     */     int i = paramArrayOfdouble.length;
/*     */     int j = paramInt3 / 8;
/*     */     for (int k = paramInt1; k < paramInt2 - 1; ) {
/*     */       continue;
/*     */       m = k;
/*     */       for (int n = k + 1; n < paramInt2; n++) {
/*     */         int i1 = j;
/*     */         while (true) {
/*     */           try {
/*     */             if (i1 < i) {
/*     */               if (paramArrayOfdouble[i1][n] < paramArrayOfdouble[i1][m]) {
/*     */                 m = n;
/*     */                 break;
/*     */               } 
/*     */               try {
/*     */                 if (paramArrayOfdouble[i1][n] > paramArrayOfdouble[i1][m])
/*     */                   break; 
/*     */               } catch (IllegalArgumentException illegalArgumentException) {
/*     */                 throw a(null);
/*     */               } 
/*     */             } 
/*     */           } catch (IllegalArgumentException illegalArgumentException) {
/*     */             throw a(null);
/*     */           } 
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   static {
/*     */     // Byte code:
/*     */     //   0: ldc2_w 2202066633738878198
/*     */     //   3: ldc2_w 2888132114918195814
/*     */     //   6: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
/*     */     //   9: invokevirtual lookupClass : ()Ljava/lang/Class;
/*     */     //   12: invokestatic a : (JJLjava/lang/Object;)Lme/konsolas/aac/na;
/*     */     //   15: ldc2_w 102958889151235
/*     */     //   18: invokeinterface a : (J)J
/*     */     //   23: putstatic me/konsolas/aac/gu.p : J
/*     */     //   26: getstatic me/konsolas/aac/gu.p : J
/*     */     //   29: ldc2_w 31579983141369
/*     */     //   32: lxor
/*     */     //   33: lstore_0
/*     */     //   34: aconst_null
/*     */     //   35: iconst_0
/*     */     //   36: newarray double
/*     */     //   38: putstatic me/konsolas/aac/gu.j : [D
/*     */     //   41: ldc2_w -32922188142060556
/*     */     //   44: lload_0
/*     */     //   45: <illegal opcode> w : ([Ljava/lang/String;JJ)V
/*     */     //   50: iconst_0
/*     */     //   51: newarray double
/*     */     //   53: putstatic me/konsolas/aac/gu.f : [D
/*     */     //   56: new me/konsolas/aac/aa
/*     */     //   59: dup
/*     */     //   60: iconst_m1
/*     */     //   61: iconst_m1
/*     */     //   62: iconst_m1
/*     */     //   63: invokespecial <init> : (III)V
/*     */     //   66: putstatic me/konsolas/aac/gu.m : Lme/konsolas/aac/aa;
/*     */     //   69: new me/konsolas/aac/gT
/*     */     //   72: dup
/*     */     //   73: aconst_null
/*     */     //   74: invokespecial <init> : (Lme/konsolas/aac/j_;)V
/*     */     //   77: putstatic me/konsolas/aac/gu.d : Lme/konsolas/aac/m9;
/*     */     //   80: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #294	-> 35
/*     */     //   #864	-> 50
/*     */     //   #467	-> 56
/*     */     //   #131	-> 69
/*     */   }
/*     */   
/*     */   public static void b(String[] paramArrayOfString) {
/*     */     b = paramArrayOfString;
/*     */   }
/*     */   
/*     */   public static String[] b() {
/*     */     return b;
/*     */   }
/*     */   
/*     */   private static Exception a(Exception paramException) {
/*     */     return paramException;
/*     */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\gu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */