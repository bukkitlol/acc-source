/*     */ package aacinternal;
/*     */ 
/*     */ import java.lang.invoke.MethodHandles;
/*     */ import me.konsolas.aac.nc;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ak
/*     */ {
/*     */   private static final long a = nc.a(-4691882830231036712L, 7505587121822354594L, MethodHandles.lookup().lookupClass()).a(210367682842719L);
/*     */   
/*     */   public static void a(long paramLong, Y paramY, double paramDouble1, double paramDouble2) {
/*     */     // Byte code:
/*     */     //   0: getstatic aacinternal/ak.a : J
/*     */     //   3: lload_0
/*     */     //   4: lxor
/*     */     //   5: lstore_0
/*     */     //   6: lload_0
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 29058202078955
/*     */     //   11: lxor
/*     */     //   12: lstore #7
/*     */     //   14: dup2
/*     */     //   15: ldc2_w 73860764187874
/*     */     //   18: lxor
/*     */     //   19: lstore #9
/*     */     //   21: dup2
/*     */     //   22: ldc2_w 72399031579040
/*     */     //   25: lxor
/*     */     //   26: lstore #11
/*     */     //   28: dup2
/*     */     //   29: ldc2_w 81027612081608
/*     */     //   32: lxor
/*     */     //   33: lstore #13
/*     */     //   35: dup2
/*     */     //   36: ldc2_w 97062729506426
/*     */     //   39: lxor
/*     */     //   40: dup2
/*     */     //   41: bipush #48
/*     */     //   43: lushr
/*     */     //   44: l2i
/*     */     //   45: istore #15
/*     */     //   47: dup2
/*     */     //   48: bipush #16
/*     */     //   50: lshl
/*     */     //   51: bipush #32
/*     */     //   53: lushr
/*     */     //   54: l2i
/*     */     //   55: istore #16
/*     */     //   57: dup2
/*     */     //   58: bipush #48
/*     */     //   60: lshl
/*     */     //   61: bipush #48
/*     */     //   63: lushr
/*     */     //   64: l2i
/*     */     //   65: istore #17
/*     */     //   67: pop2
/*     */     //   68: pop2
/*     */     //   69: aload_2
/*     */     //   70: getstatic aacinternal/P.FUNCTION : Laacinternal/P;
/*     */     //   73: iconst_0
/*     */     //   74: anewarray java/lang/Object
/*     */     //   77: lload #9
/*     */     //   79: invokestatic a : (Ljava/lang/Object;Laacinternal/H;[Ljava/lang/Object;J)V
/*     */     //   82: dload_3
/*     */     //   83: dload #5
/*     */     //   85: lload #11
/*     */     //   87: invokestatic a : (DDJ)V
/*     */     //   90: aload_2
/*     */     //   91: lload #7
/*     */     //   93: dload_3
/*     */     //   94: dload #5
/*     */     //   96: invokestatic a : (Laacinternal/Y;JDD)Z
/*     */     //   99: ifne -> 181
/*     */     //   102: new aacinternal/v
/*     */     //   105: dup
/*     */     //   106: getstatic aacinternal/P.NOT_BRACKETING_INTERVAL : Laacinternal/P;
/*     */     //   109: iconst_4
/*     */     //   110: anewarray java/lang/Object
/*     */     //   113: dup
/*     */     //   114: iconst_0
/*     */     //   115: dload_3
/*     */     //   116: invokestatic valueOf : (D)Ljava/lang/Double;
/*     */     //   119: aastore
/*     */     //   120: dup
/*     */     //   121: iconst_1
/*     */     //   122: dload #5
/*     */     //   124: invokestatic valueOf : (D)Ljava/lang/Double;
/*     */     //   127: aastore
/*     */     //   128: dup
/*     */     //   129: iconst_2
/*     */     //   130: aload_2
/*     */     //   131: lload #13
/*     */     //   133: dload_3
/*     */     //   134: invokeinterface a : (JD)D
/*     */     //   139: invokestatic valueOf : (D)Ljava/lang/Double;
/*     */     //   142: aastore
/*     */     //   143: dup
/*     */     //   144: iconst_3
/*     */     //   145: aload_2
/*     */     //   146: lload #13
/*     */     //   148: dload #5
/*     */     //   150: invokeinterface a : (JD)D
/*     */     //   155: invokestatic valueOf : (D)Ljava/lang/Double;
/*     */     //   158: aastore
/*     */     //   159: iload #15
/*     */     //   161: i2s
/*     */     //   162: iload #16
/*     */     //   164: iload #17
/*     */     //   166: i2s
/*     */     //   167: invokespecial <init> : (Laacinternal/H;[Ljava/lang/Object;SIS)V
/*     */     //   170: athrow
/*     */     //   171: ldc2_w 6131726116329118544
/*     */     //   174: lload_0
/*     */     //   175: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   180: athrow
/*     */     //   181: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #18	-> 69
/*     */     //   #97	-> 82
/*     */     //   #57	-> 90
/*     */     //   #49	-> 102
/*     */     //   #62	-> 116
/*     */     //   #35	-> 134
/*     */     //   #71	-> 181
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   69	171	171	aacinternal/v
/*     */   }
/*     */   
/*     */   public static void a(double paramDouble1, double paramDouble2, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic aacinternal/ak.a : J
/*     */     //   3: lload #4
/*     */     //   5: lxor
/*     */     //   6: lstore #4
/*     */     //   8: lload #4
/*     */     //   10: dup2
/*     */     //   11: ldc2_w 12705680197448
/*     */     //   14: lxor
/*     */     //   15: dup2
/*     */     //   16: bipush #48
/*     */     //   18: lushr
/*     */     //   19: l2i
/*     */     //   20: istore #6
/*     */     //   22: dup2
/*     */     //   23: bipush #16
/*     */     //   25: lshl
/*     */     //   26: bipush #32
/*     */     //   28: lushr
/*     */     //   29: l2i
/*     */     //   30: istore #7
/*     */     //   32: dup2
/*     */     //   33: bipush #48
/*     */     //   35: lshl
/*     */     //   36: bipush #48
/*     */     //   38: lushr
/*     */     //   39: l2i
/*     */     //   40: istore #8
/*     */     //   42: pop2
/*     */     //   43: pop2
/*     */     //   44: dload_0
/*     */     //   45: dload_2
/*     */     //   46: dcmpl
/*     */     //   47: iflt -> 105
/*     */     //   50: new aacinternal/v
/*     */     //   53: dup
/*     */     //   54: getstatic aacinternal/P.ENDPOINTS_NOT_AN_INTERVAL : Laacinternal/P;
/*     */     //   57: iconst_3
/*     */     //   58: anewarray java/lang/Object
/*     */     //   61: dup
/*     */     //   62: iconst_0
/*     */     //   63: dload_0
/*     */     //   64: invokestatic valueOf : (D)Ljava/lang/Double;
/*     */     //   67: aastore
/*     */     //   68: dup
/*     */     //   69: iconst_1
/*     */     //   70: dload_2
/*     */     //   71: invokestatic valueOf : (D)Ljava/lang/Double;
/*     */     //   74: aastore
/*     */     //   75: dup
/*     */     //   76: iconst_2
/*     */     //   77: iconst_0
/*     */     //   78: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   81: aastore
/*     */     //   82: iload #6
/*     */     //   84: i2s
/*     */     //   85: iload #7
/*     */     //   87: iload #8
/*     */     //   89: i2s
/*     */     //   90: invokespecial <init> : (Laacinternal/H;[Ljava/lang/Object;SIS)V
/*     */     //   93: athrow
/*     */     //   94: ldc2_w 876539067259748962
/*     */     //   97: lload #4
/*     */     //   99: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   104: athrow
/*     */     //   105: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #23	-> 44
/*     */     //   #30	-> 50
/*     */     //   #16	-> 64
/*     */     //   #67	-> 105
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   44	94	94	aacinternal/v
/*     */   }
/*     */   
/*     */   public static double[] a(Y paramY, long paramLong, double paramDouble1, double paramDouble2, double paramDouble3) {
/*  40 */     paramLong = a ^ paramLong; int i = (int)((paramLong ^ 0x3F190E5FB08CL) >>> 32L), j = (int)((paramLong ^ 0x3F190E5FB08CL) << 32L >>> 48L), k = (int)((paramLong ^ 0x3F190E5FB08CL) << 48L >>> 48L); paramLong ^ 0x3F190E5FB08CL; return a(paramY, paramDouble1, i, (char)j, paramDouble2, k, paramDouble3, 1.0D, 1.0D, 2147483647);
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
/*     */   public static void a(double paramDouble1, long paramLong, double paramDouble2, double paramDouble3) {
/*  52 */     paramLong = a ^ paramLong; long l = paramLong ^ 0x7119518D2DFEL; a(paramDouble1, paramDouble2, l);
/*     */     a(paramDouble2, paramDouble3, l);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static double a(double paramDouble1, double paramDouble2) {
/*  74 */     return (paramDouble1 + paramDouble2) * 0.5D;
/*     */   }
/*     */ 
/*     */   
/*     */   public static double[] a(Y paramY, double paramDouble1, int paramInt1, char paramChar, double paramDouble2, int paramInt2, double paramDouble3, double paramDouble4, double paramDouble5, int paramInt3) {
/*     */     // Byte code:
/*     */     //   0: iload_3
/*     */     //   1: i2l
/*     */     //   2: bipush #32
/*     */     //   4: lshl
/*     */     //   5: iload #4
/*     */     //   7: i2l
/*     */     //   8: bipush #48
/*     */     //   10: lshl
/*     */     //   11: bipush #32
/*     */     //   13: lushr
/*     */     //   14: lor
/*     */     //   15: iload #7
/*     */     //   17: i2l
/*     */     //   18: bipush #48
/*     */     //   20: lshl
/*     */     //   21: bipush #48
/*     */     //   23: lushr
/*     */     //   24: lor
/*     */     //   25: getstatic aacinternal/ak.a : J
/*     */     //   28: lxor
/*     */     //   29: lstore #15
/*     */     //   31: lload #15
/*     */     //   33: dup2
/*     */     //   34: ldc2_w 122748429009324
/*     */     //   37: lxor
/*     */     //   38: lstore #17
/*     */     //   40: dup2
/*     */     //   41: ldc2_w 139635229071748
/*     */     //   44: lxor
/*     */     //   45: lstore #19
/*     */     //   47: dup2
/*     */     //   48: ldc2_w 15799802579330
/*     */     //   51: lxor
/*     */     //   52: lstore #21
/*     */     //   54: dup2
/*     */     //   55: ldc2_w 5231656732840
/*     */     //   58: lxor
/*     */     //   59: lstore #23
/*     */     //   61: dup2
/*     */     //   62: ldc2_w 23315439758106
/*     */     //   65: lxor
/*     */     //   66: dup2
/*     */     //   67: bipush #48
/*     */     //   69: lushr
/*     */     //   70: l2i
/*     */     //   71: istore #25
/*     */     //   73: dup2
/*     */     //   74: bipush #16
/*     */     //   76: lshl
/*     */     //   77: bipush #32
/*     */     //   79: lushr
/*     */     //   80: l2i
/*     */     //   81: istore #26
/*     */     //   83: dup2
/*     */     //   84: bipush #48
/*     */     //   86: lshl
/*     */     //   87: bipush #48
/*     */     //   89: lushr
/*     */     //   90: l2i
/*     */     //   91: istore #27
/*     */     //   93: pop2
/*     */     //   94: dup2
/*     */     //   95: ldc2_w 51495921200142
/*     */     //   98: lxor
/*     */     //   99: dup2
/*     */     //   100: bipush #16
/*     */     //   102: lushr
/*     */     //   103: lstore #28
/*     */     //   105: dup2
/*     */     //   106: bipush #48
/*     */     //   108: lshl
/*     */     //   109: bipush #48
/*     */     //   111: lushr
/*     */     //   112: l2i
/*     */     //   113: istore #30
/*     */     //   115: pop2
/*     */     //   116: pop2
/*     */     //   117: ldc2_w 2359306601538884696
/*     */     //   120: lload #15
/*     */     //   122: <illegal opcode> w : (JJ)I
/*     */     //   127: aload_0
/*     */     //   128: getstatic aacinternal/P.FUNCTION : Laacinternal/P;
/*     */     //   131: iconst_0
/*     */     //   132: anewarray java/lang/Object
/*     */     //   135: lload #21
/*     */     //   137: invokestatic a : (Ljava/lang/Object;Laacinternal/H;[Ljava/lang/Object;J)V
/*     */     //   140: istore #31
/*     */     //   142: dload #10
/*     */     //   144: dconst_0
/*     */     //   145: dcmpg
/*     */     //   146: iload #31
/*     */     //   148: ifne -> 219
/*     */     //   151: ifgt -> 217
/*     */     //   154: goto -> 168
/*     */     //   157: ldc2_w 2339630013672468016
/*     */     //   160: lload #15
/*     */     //   162: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   167: athrow
/*     */     //   168: new aacinternal/v
/*     */     //   171: dup
/*     */     //   172: getstatic aacinternal/P.NUMBER_TOO_SMALL_BOUND_EXCLUDED : Laacinternal/P;
/*     */     //   175: iconst_2
/*     */     //   176: anewarray java/lang/Object
/*     */     //   179: dup
/*     */     //   180: iconst_0
/*     */     //   181: dload #10
/*     */     //   183: invokestatic valueOf : (D)Ljava/lang/Double;
/*     */     //   186: aastore
/*     */     //   187: dup
/*     */     //   188: iconst_1
/*     */     //   189: iconst_0
/*     */     //   190: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   193: aastore
/*     */     //   194: iload #25
/*     */     //   196: i2s
/*     */     //   197: iload #26
/*     */     //   199: iload #27
/*     */     //   201: i2s
/*     */     //   202: invokespecial <init> : (Laacinternal/H;[Ljava/lang/Object;SIS)V
/*     */     //   205: athrow
/*     */     //   206: ldc2_w 2339630013672468016
/*     */     //   209: lload #15
/*     */     //   211: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   216: athrow
/*     */     //   217: iload #14
/*     */     //   219: ifgt -> 264
/*     */     //   222: new aacinternal/v
/*     */     //   225: dup
/*     */     //   226: getstatic aacinternal/P.INVALID_MAX_ITERATIONS : Laacinternal/P;
/*     */     //   229: iconst_1
/*     */     //   230: anewarray java/lang/Object
/*     */     //   233: dup
/*     */     //   234: iconst_0
/*     */     //   235: iload #14
/*     */     //   237: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   240: aastore
/*     */     //   241: iload #25
/*     */     //   243: i2s
/*     */     //   244: iload #26
/*     */     //   246: iload #27
/*     */     //   248: i2s
/*     */     //   249: invokespecial <init> : (Laacinternal/H;[Ljava/lang/Object;SIS)V
/*     */     //   252: athrow
/*     */     //   253: ldc2_w 2339630013672468016
/*     */     //   256: lload #15
/*     */     //   258: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   263: athrow
/*     */     //   264: dload #5
/*     */     //   266: lload #17
/*     */     //   268: dload_1
/*     */     //   269: dload #8
/*     */     //   271: invokestatic a : (DJDD)V
/*     */     //   274: dload_1
/*     */     //   275: dstore #32
/*     */     //   277: dload_1
/*     */     //   278: dstore #34
/*     */     //   280: ldc2_w NaN
/*     */     //   283: dstore #36
/*     */     //   285: ldc2_w NaN
/*     */     //   288: dstore #38
/*     */     //   290: dconst_0
/*     */     //   291: dstore #40
/*     */     //   293: iconst_0
/*     */     //   294: istore #42
/*     */     //   296: iload #42
/*     */     //   298: iload #14
/*     */     //   300: if_icmpge -> 714
/*     */     //   303: dload #32
/*     */     //   305: iload #31
/*     */     //   307: ifne -> 387
/*     */     //   310: dload #5
/*     */     //   312: dcmpl
/*     */     //   313: ifgt -> 371
/*     */     //   316: goto -> 330
/*     */     //   319: ldc2_w 2339630013672468016
/*     */     //   322: lload #15
/*     */     //   324: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   329: athrow
/*     */     //   330: dload #34
/*     */     //   332: iload #31
/*     */     //   334: ifne -> 387
/*     */     //   337: goto -> 351
/*     */     //   340: ldc2_w 2339630013672468016
/*     */     //   343: lload #15
/*     */     //   345: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   350: athrow
/*     */     //   351: dload #8
/*     */     //   353: dcmpg
/*     */     //   354: ifge -> 714
/*     */     //   357: goto -> 371
/*     */     //   360: ldc2_w 2339630013672468016
/*     */     //   363: lload #15
/*     */     //   365: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   370: athrow
/*     */     //   371: dload #32
/*     */     //   373: goto -> 387
/*     */     //   376: ldc2_w 2339630013672468016
/*     */     //   379: lload #15
/*     */     //   381: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   386: athrow
/*     */     //   387: dstore #43
/*     */     //   389: dload #36
/*     */     //   391: dstore #45
/*     */     //   393: dload #34
/*     */     //   395: dstore #47
/*     */     //   397: dload #38
/*     */     //   399: dstore #49
/*     */     //   401: dload #12
/*     */     //   403: dload #40
/*     */     //   405: dmul
/*     */     //   406: dload #10
/*     */     //   408: dadd
/*     */     //   409: dstore #40
/*     */     //   411: dload_1
/*     */     //   412: dload #40
/*     */     //   414: dsub
/*     */     //   415: lload #28
/*     */     //   417: dup2_x2
/*     */     //   418: pop2
/*     */     //   419: iload #30
/*     */     //   421: i2c
/*     */     //   422: dload #5
/*     */     //   424: invokestatic i : (JDCD)D
/*     */     //   427: dstore #32
/*     */     //   429: dload_1
/*     */     //   430: dload #40
/*     */     //   432: dadd
/*     */     //   433: lload #19
/*     */     //   435: dup2_x2
/*     */     //   436: pop2
/*     */     //   437: dload #8
/*     */     //   439: invokestatic j : (JDD)D
/*     */     //   442: dstore #34
/*     */     //   444: aload_0
/*     */     //   445: lload #23
/*     */     //   447: dload #32
/*     */     //   449: invokeinterface a : (JD)D
/*     */     //   454: dstore #36
/*     */     //   456: aload_0
/*     */     //   457: lload #23
/*     */     //   459: dload #34
/*     */     //   461: invokeinterface a : (JD)D
/*     */     //   466: dstore #38
/*     */     //   468: iload #42
/*     */     //   470: iload #31
/*     */     //   472: iload #7
/*     */     //   474: iflt -> 563
/*     */     //   477: ifne -> 561
/*     */     //   480: ifne -> 554
/*     */     //   483: goto -> 497
/*     */     //   486: ldc2_w 2339630013672468016
/*     */     //   489: lload #15
/*     */     //   491: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   496: athrow
/*     */     //   497: dload #36
/*     */     //   499: dload #38
/*     */     //   501: dmul
/*     */     //   502: dconst_0
/*     */     //   503: dcmpg
/*     */     //   504: iload #31
/*     */     //   506: ifne -> 541
/*     */     //   509: goto -> 523
/*     */     //   512: ldc2_w 2339630013672468016
/*     */     //   515: lload #15
/*     */     //   517: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   522: athrow
/*     */     //   523: ifgt -> 706
/*     */     //   526: goto -> 540
/*     */     //   529: ldc2_w 2339630013672468016
/*     */     //   532: lload #15
/*     */     //   534: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   539: athrow
/*     */     //   540: iconst_2
/*     */     //   541: newarray double
/*     */     //   543: dup
/*     */     //   544: iconst_0
/*     */     //   545: dload #32
/*     */     //   547: dastore
/*     */     //   548: dup
/*     */     //   549: iconst_1
/*     */     //   550: dload #34
/*     */     //   552: dastore
/*     */     //   553: areturn
/*     */     //   554: dload #36
/*     */     //   556: dload #45
/*     */     //   558: dmul
/*     */     //   559: dconst_0
/*     */     //   560: dcmpg
/*     */     //   561: iload #31
/*     */     //   563: iload_3
/*     */     //   564: ifle -> 626
/*     */     //   567: ifne -> 619
/*     */     //   570: ifgt -> 612
/*     */     //   573: goto -> 587
/*     */     //   576: ldc2_w 2339630013672468016
/*     */     //   579: lload #15
/*     */     //   581: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   586: athrow
/*     */     //   587: iconst_2
/*     */     //   588: newarray double
/*     */     //   590: dup
/*     */     //   591: iconst_0
/*     */     //   592: dload #32
/*     */     //   594: dastore
/*     */     //   595: dup
/*     */     //   596: iconst_1
/*     */     //   597: dload #43
/*     */     //   599: dastore
/*     */     //   600: areturn
/*     */     //   601: ldc2_w 2339630013672468016
/*     */     //   604: lload #15
/*     */     //   606: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   611: athrow
/*     */     //   612: dload #38
/*     */     //   614: dload #49
/*     */     //   616: dmul
/*     */     //   617: dconst_0
/*     */     //   618: dcmpg
/*     */     //   619: iload #7
/*     */     //   621: iflt -> 647
/*     */     //   624: iload #31
/*     */     //   626: ifne -> 647
/*     */     //   629: ifgt -> 706
/*     */     //   632: goto -> 646
/*     */     //   635: ldc2_w 2339630013672468016
/*     */     //   638: lload #15
/*     */     //   640: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   645: athrow
/*     */     //   646: iconst_2
/*     */     //   647: newarray double
/*     */     //   649: dup
/*     */     //   650: iconst_0
/*     */     //   651: dload #47
/*     */     //   653: dastore
/*     */     //   654: dup
/*     */     //   655: iconst_1
/*     */     //   656: dload #34
/*     */     //   658: dastore
/*     */     //   659: iload_3
/*     */     //   660: ifle -> 691
/*     */     //   663: ldc2_w 2345640643182027822
/*     */     //   666: lload #15
/*     */     //   668: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*     */     //   673: ifnull -> 705
/*     */     //   676: iinc #31, 1
/*     */     //   679: iload #31
/*     */     //   681: ldc2_w 2345988177158842700
/*     */     //   684: lload #15
/*     */     //   686: <illegal opcode> w : (IJJ)V
/*     */     //   691: goto -> 705
/*     */     //   694: ldc2_w 2339630013672468016
/*     */     //   697: lload #15
/*     */     //   699: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   704: athrow
/*     */     //   705: areturn
/*     */     //   706: iinc #42, 1
/*     */     //   709: iload #31
/*     */     //   711: ifeq -> 296
/*     */     //   714: iload #4
/*     */     //   716: ifle -> 371
/*     */     //   719: new aacinternal/v
/*     */     //   722: dup
/*     */     //   723: getstatic aacinternal/P.NOT_BRACKETING_INTERVAL : Laacinternal/P;
/*     */     //   726: iconst_4
/*     */     //   727: anewarray java/lang/Object
/*     */     //   730: dup
/*     */     //   731: iconst_0
/*     */     //   732: dload #32
/*     */     //   734: invokestatic valueOf : (D)Ljava/lang/Double;
/*     */     //   737: aastore
/*     */     //   738: dup
/*     */     //   739: iconst_1
/*     */     //   740: dload #34
/*     */     //   742: invokestatic valueOf : (D)Ljava/lang/Double;
/*     */     //   745: aastore
/*     */     //   746: dup
/*     */     //   747: iconst_2
/*     */     //   748: dload #36
/*     */     //   750: invokestatic valueOf : (D)Ljava/lang/Double;
/*     */     //   753: aastore
/*     */     //   754: dup
/*     */     //   755: iconst_3
/*     */     //   756: dload #38
/*     */     //   758: invokestatic valueOf : (D)Ljava/lang/Double;
/*     */     //   761: aastore
/*     */     //   762: iload #25
/*     */     //   764: i2s
/*     */     //   765: iload #26
/*     */     //   767: iload #27
/*     */     //   769: i2s
/*     */     //   770: invokespecial <init> : (Laacinternal/H;[Ljava/lang/Object;SIS)V
/*     */     //   773: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #78	-> 127
/*     */     //   #115	-> 142
/*     */     //   #100	-> 168
/*     */     //   #136	-> 183
/*     */     //   #47	-> 217
/*     */     //   #68	-> 222
/*     */     //   #10	-> 264
/*     */     //   #82	-> 274
/*     */     //   #95	-> 277
/*     */     //   #15	-> 280
/*     */     //   #73	-> 285
/*     */     //   #13	-> 290
/*     */     //   #83	-> 293
/*     */     //   #72	-> 296
/*     */     //   #114	-> 371
/*     */     //   #58	-> 389
/*     */     //   #7	-> 393
/*     */     //   #137	-> 397
/*     */     //   #77	-> 401
/*     */     //   #127	-> 411
/*     */     //   #101	-> 429
/*     */     //   #88	-> 444
/*     */     //   #124	-> 456
/*     */     //   #94	-> 468
/*     */     //   #111	-> 497
/*     */     //   #85	-> 540
/*     */     //   #46	-> 554
/*     */     //   #31	-> 587
/*     */     //   #142	-> 612
/*     */     //   #117	-> 646
/*     */     //   #27	-> 706
/*     */     //   #20	-> 714
/*     */     //   #34	-> 734
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   142	154	157	aacinternal/v
/*     */     //   151	206	206	aacinternal/v
/*     */     //   219	253	253	aacinternal/v
/*     */     //   303	316	319	aacinternal/v
/*     */     //   310	337	340	aacinternal/v
/*     */     //   330	357	360	aacinternal/v
/*     */     //   351	373	376	aacinternal/v
/*     */     //   468	483	486	aacinternal/v
/*     */     //   480	509	512	aacinternal/v
/*     */     //   497	526	529	aacinternal/v
/*     */     //   561	573	576	aacinternal/v
/*     */     //   570	601	601	aacinternal/v
/*     */     //   619	632	635	aacinternal/v
/*     */     //   647	691	694	aacinternal/v
/*     */   }
/*     */ 
/*     */   
/*     */   public static double a(Y paramY, long paramLong, double paramDouble1, double paramDouble2, double paramDouble3) {
/*  84 */     paramLong = a ^ paramLong; long l1 = paramLong ^ 0x522610472393L, l2 = paramLong ^ 0x3D90C72CCA30L, l3 = paramLong ^ 0x4956AD675FC1L; az.a(paramY, P.FUNCTION, new Object[0], l1);
/*     */     S s = new S(paramDouble3, l2);
/*     */     return s.a(2147483647, paramY, l3, paramDouble1, paramDouble2);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static double a(int paramInt1, Y paramY, E paramE, double paramDouble1, int paramInt2, double paramDouble2, double paramDouble3, short paramShort1, ac paramac, short paramShort2) {
/*     */     // Byte code:
/*     */     //   0: iload #5
/*     */     //   2: i2l
/*     */     //   3: bipush #32
/*     */     //   5: lshl
/*     */     //   6: iload #10
/*     */     //   8: i2l
/*     */     //   9: bipush #48
/*     */     //   11: lshl
/*     */     //   12: bipush #32
/*     */     //   14: lushr
/*     */     //   15: lor
/*     */     //   16: iload #12
/*     */     //   18: i2l
/*     */     //   19: bipush #48
/*     */     //   21: lshl
/*     */     //   22: bipush #48
/*     */     //   24: lushr
/*     */     //   25: lor
/*     */     //   26: getstatic aacinternal/ak.a : J
/*     */     //   29: lxor
/*     */     //   30: lstore #13
/*     */     //   32: lload #13
/*     */     //   34: dup2
/*     */     //   35: ldc2_w 76224875750616
/*     */     //   38: lxor
/*     */     //   39: lstore #15
/*     */     //   41: dup2
/*     */     //   42: ldc2_w 69742611461620
/*     */     //   45: lxor
/*     */     //   46: lstore #17
/*     */     //   48: dup2
/*     */     //   49: ldc2_w 51233257641542
/*     */     //   52: lxor
/*     */     //   53: dup2
/*     */     //   54: bipush #48
/*     */     //   56: lushr
/*     */     //   57: l2i
/*     */     //   58: istore #19
/*     */     //   60: dup2
/*     */     //   61: bipush #16
/*     */     //   63: lshl
/*     */     //   64: bipush #32
/*     */     //   66: lushr
/*     */     //   67: l2i
/*     */     //   68: istore #20
/*     */     //   70: dup2
/*     */     //   71: bipush #48
/*     */     //   73: lshl
/*     */     //   74: bipush #48
/*     */     //   76: lushr
/*     */     //   77: l2i
/*     */     //   78: istore #21
/*     */     //   80: pop2
/*     */     //   81: dup2
/*     */     //   82: ldc2_w 23613537866066
/*     */     //   85: lxor
/*     */     //   86: dup2
/*     */     //   87: bipush #16
/*     */     //   89: lushr
/*     */     //   90: lstore #22
/*     */     //   92: dup2
/*     */     //   93: bipush #48
/*     */     //   95: lshl
/*     */     //   96: bipush #48
/*     */     //   98: lushr
/*     */     //   99: l2i
/*     */     //   100: istore #24
/*     */     //   102: pop2
/*     */     //   103: pop2
/*     */     //   104: ldc2_w 6717750193207385787
/*     */     //   107: lload #13
/*     */     //   109: <illegal opcode> w : (JJ)I
/*     */     //   114: istore #25
/*     */     //   116: aload #11
/*     */     //   118: getstatic aacinternal/ac.ANY_SIDE : Laacinternal/ac;
/*     */     //   121: if_acmpne -> 137
/*     */     //   124: dload_3
/*     */     //   125: dreturn
/*     */     //   126: ldc2_w 6711545101389419372
/*     */     //   129: lload #13
/*     */     //   131: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   136: athrow
/*     */     //   137: aload_2
/*     */     //   138: invokeinterface c : ()D
/*     */     //   143: lload #22
/*     */     //   145: dup2_x2
/*     */     //   146: pop2
/*     */     //   147: dload_3
/*     */     //   148: aload_2
/*     */     //   149: invokeinterface b : ()D
/*     */     //   154: dmul
/*     */     //   155: invokestatic z : (D)D
/*     */     //   158: iload #24
/*     */     //   160: i2c
/*     */     //   161: dup_x2
/*     */     //   162: pop
/*     */     //   163: invokestatic i : (JDCD)D
/*     */     //   166: dstore #26
/*     */     //   168: lload #22
/*     */     //   170: dload #6
/*     */     //   172: dload_3
/*     */     //   173: dload #26
/*     */     //   175: dsub
/*     */     //   176: iload #24
/*     */     //   178: i2c
/*     */     //   179: dup_x2
/*     */     //   180: pop
/*     */     //   181: invokestatic i : (JDCD)D
/*     */     //   184: dstore #28
/*     */     //   186: aload_1
/*     */     //   187: lload #17
/*     */     //   189: dload #28
/*     */     //   191: invokeinterface a : (JD)D
/*     */     //   196: dstore #30
/*     */     //   198: lload #15
/*     */     //   200: dload #8
/*     */     //   202: dload_3
/*     */     //   203: dload #26
/*     */     //   205: dadd
/*     */     //   206: invokestatic j : (JDD)D
/*     */     //   209: dstore #32
/*     */     //   211: aload_1
/*     */     //   212: lload #17
/*     */     //   214: dload #32
/*     */     //   216: invokeinterface a : (JD)D
/*     */     //   221: dstore #34
/*     */     //   223: iload_0
/*     */     //   224: iconst_2
/*     */     //   225: isub
/*     */     //   226: istore #36
/*     */     //   228: iload #36
/*     */     //   230: ifle -> 772
/*     */     //   233: dload #30
/*     */     //   235: dconst_0
/*     */     //   236: dcmpl
/*     */     //   237: iload #25
/*     */     //   239: iload #5
/*     */     //   241: iflt -> 329
/*     */     //   244: ifeq -> 327
/*     */     //   247: iflt -> 309
/*     */     //   250: goto -> 264
/*     */     //   253: ldc2_w 6711545101389419372
/*     */     //   256: lload #13
/*     */     //   258: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   263: athrow
/*     */     //   264: dload #34
/*     */     //   266: iload #25
/*     */     //   268: ifeq -> 419
/*     */     //   271: goto -> 285
/*     */     //   274: ldc2_w 6711545101389419372
/*     */     //   277: lload #13
/*     */     //   279: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   284: athrow
/*     */     //   285: iload #10
/*     */     //   287: ifge -> 405
/*     */     //   290: dconst_0
/*     */     //   291: dcmpg
/*     */     //   292: ifle -> 389
/*     */     //   295: goto -> 309
/*     */     //   298: ldc2_w 6711545101389419372
/*     */     //   301: lload #13
/*     */     //   303: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   308: athrow
/*     */     //   309: dload #30
/*     */     //   311: dconst_0
/*     */     //   312: dcmpg
/*     */     //   313: goto -> 327
/*     */     //   316: ldc2_w 6711545101389419372
/*     */     //   319: lload #13
/*     */     //   321: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   326: athrow
/*     */     //   327: iload #25
/*     */     //   329: ifeq -> 421
/*     */     //   332: ifgt -> 420
/*     */     //   335: goto -> 349
/*     */     //   338: ldc2_w 6711545101389419372
/*     */     //   341: lload #13
/*     */     //   343: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   348: athrow
/*     */     //   349: dload #34
/*     */     //   351: dconst_0
/*     */     //   352: dcmpl
/*     */     //   353: iload #25
/*     */     //   355: ifeq -> 421
/*     */     //   358: goto -> 372
/*     */     //   361: ldc2_w 6711545101389419372
/*     */     //   364: lload #13
/*     */     //   366: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   371: athrow
/*     */     //   372: iflt -> 420
/*     */     //   375: goto -> 389
/*     */     //   378: ldc2_w 6711545101389419372
/*     */     //   381: lload #13
/*     */     //   383: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   388: athrow
/*     */     //   389: aload_2
/*     */     //   390: iload #36
/*     */     //   392: aload_1
/*     */     //   393: dload #28
/*     */     //   395: dload #32
/*     */     //   397: dload_3
/*     */     //   398: aload #11
/*     */     //   400: invokeinterface a : (ILaacinternal/Y;DDDLaacinternal/ac;)D
/*     */     //   405: goto -> 419
/*     */     //   408: ldc2_w 6711545101389419372
/*     */     //   411: lload #13
/*     */     //   413: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   418: athrow
/*     */     //   419: dreturn
/*     */     //   420: iconst_0
/*     */     //   421: istore #37
/*     */     //   423: iconst_0
/*     */     //   424: istore #38
/*     */     //   426: dload #30
/*     */     //   428: dload #34
/*     */     //   430: dcmpg
/*     */     //   431: iload #25
/*     */     //   433: iload #5
/*     */     //   435: ifle -> 564
/*     */     //   438: ifeq -> 562
/*     */     //   441: ifge -> 543
/*     */     //   444: goto -> 458
/*     */     //   447: ldc2_w 6711545101389419372
/*     */     //   450: lload #13
/*     */     //   452: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   457: athrow
/*     */     //   458: dload #30
/*     */     //   460: dconst_0
/*     */     //   461: dcmpl
/*     */     //   462: iload #5
/*     */     //   464: iflt -> 535
/*     */     //   467: iload #25
/*     */     //   469: ifeq -> 531
/*     */     //   472: goto -> 486
/*     */     //   475: ldc2_w 6711545101389419372
/*     */     //   478: lload #13
/*     */     //   480: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   485: athrow
/*     */     //   486: iflt -> 516
/*     */     //   489: goto -> 503
/*     */     //   492: ldc2_w 6711545101389419372
/*     */     //   495: lload #13
/*     */     //   497: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   502: athrow
/*     */     //   503: iconst_1
/*     */     //   504: istore #37
/*     */     //   506: iload #25
/*     */     //   508: iload #12
/*     */     //   510: iflt -> 677
/*     */     //   513: ifne -> 675
/*     */     //   516: iconst_1
/*     */     //   517: goto -> 531
/*     */     //   520: ldc2_w 6711545101389419372
/*     */     //   523: lload #13
/*     */     //   525: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   530: athrow
/*     */     //   531: istore #38
/*     */     //   533: iload #25
/*     */     //   535: iload #10
/*     */     //   537: ifge -> 677
/*     */     //   540: ifne -> 675
/*     */     //   543: dload #30
/*     */     //   545: dload #34
/*     */     //   547: dcmpl
/*     */     //   548: goto -> 562
/*     */     //   551: ldc2_w 6711545101389419372
/*     */     //   554: lload #13
/*     */     //   556: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   561: athrow
/*     */     //   562: iload #25
/*     */     //   564: ifeq -> 673
/*     */     //   567: ifle -> 669
/*     */     //   570: goto -> 584
/*     */     //   573: ldc2_w 6711545101389419372
/*     */     //   576: lload #13
/*     */     //   578: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   583: athrow
/*     */     //   584: dload #30
/*     */     //   586: dconst_0
/*     */     //   587: dcmpg
/*     */     //   588: iload #5
/*     */     //   590: iflt -> 661
/*     */     //   593: iload #25
/*     */     //   595: ifeq -> 657
/*     */     //   598: goto -> 612
/*     */     //   601: ldc2_w 6711545101389419372
/*     */     //   604: lload #13
/*     */     //   606: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   611: athrow
/*     */     //   612: ifgt -> 642
/*     */     //   615: goto -> 629
/*     */     //   618: ldc2_w 6711545101389419372
/*     */     //   621: lload #13
/*     */     //   623: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   628: athrow
/*     */     //   629: iconst_1
/*     */     //   630: istore #37
/*     */     //   632: iload #25
/*     */     //   634: iload #5
/*     */     //   636: ifle -> 677
/*     */     //   639: ifne -> 675
/*     */     //   642: iconst_1
/*     */     //   643: goto -> 657
/*     */     //   646: ldc2_w 6711545101389419372
/*     */     //   649: lload #13
/*     */     //   651: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   656: athrow
/*     */     //   657: istore #38
/*     */     //   659: iload #25
/*     */     //   661: iload #10
/*     */     //   663: ifgt -> 677
/*     */     //   666: ifne -> 675
/*     */     //   669: iconst_1
/*     */     //   670: istore #37
/*     */     //   672: iconst_1
/*     */     //   673: istore #38
/*     */     //   675: iload #37
/*     */     //   677: iload #25
/*     */     //   679: ifeq -> 735
/*     */     //   682: ifeq -> 733
/*     */     //   685: goto -> 699
/*     */     //   688: ldc2_w 6711545101389419372
/*     */     //   691: lload #13
/*     */     //   693: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   698: athrow
/*     */     //   699: lload #22
/*     */     //   701: dload #6
/*     */     //   703: dload #28
/*     */     //   705: dload #26
/*     */     //   707: dsub
/*     */     //   708: iload #24
/*     */     //   710: i2c
/*     */     //   711: dup_x2
/*     */     //   712: pop
/*     */     //   713: invokestatic i : (JDCD)D
/*     */     //   716: dstore #28
/*     */     //   718: aload_1
/*     */     //   719: lload #17
/*     */     //   721: dload #28
/*     */     //   723: invokeinterface a : (JD)D
/*     */     //   728: dstore #30
/*     */     //   730: iinc #36, -1
/*     */     //   733: iload #38
/*     */     //   735: ifeq -> 767
/*     */     //   738: lload #15
/*     */     //   740: dload #8
/*     */     //   742: dload #32
/*     */     //   744: dload #26
/*     */     //   746: dadd
/*     */     //   747: invokestatic j : (JDD)D
/*     */     //   750: dstore #32
/*     */     //   752: aload_1
/*     */     //   753: lload #17
/*     */     //   755: dload #32
/*     */     //   757: invokeinterface a : (JD)D
/*     */     //   762: dstore #34
/*     */     //   764: iinc #36, -1
/*     */     //   767: iload #25
/*     */     //   769: ifne -> 228
/*     */     //   772: iload #5
/*     */     //   774: iflt -> 233
/*     */     //   777: new aacinternal/v
/*     */     //   780: dup
/*     */     //   781: getstatic aacinternal/P.FAILED_BRACKETING : Laacinternal/P;
/*     */     //   784: bipush #9
/*     */     //   786: anewarray java/lang/Object
/*     */     //   789: dup
/*     */     //   790: iconst_0
/*     */     //   791: dload #28
/*     */     //   793: invokestatic valueOf : (D)Ljava/lang/Double;
/*     */     //   796: aastore
/*     */     //   797: dup
/*     */     //   798: iconst_1
/*     */     //   799: dload #32
/*     */     //   801: invokestatic valueOf : (D)Ljava/lang/Double;
/*     */     //   804: aastore
/*     */     //   805: dup
/*     */     //   806: iconst_2
/*     */     //   807: dload #30
/*     */     //   809: invokestatic valueOf : (D)Ljava/lang/Double;
/*     */     //   812: aastore
/*     */     //   813: dup
/*     */     //   814: iconst_3
/*     */     //   815: dload #34
/*     */     //   817: invokestatic valueOf : (D)Ljava/lang/Double;
/*     */     //   820: aastore
/*     */     //   821: dup
/*     */     //   822: iconst_4
/*     */     //   823: iload_0
/*     */     //   824: iload #36
/*     */     //   826: isub
/*     */     //   827: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   830: aastore
/*     */     //   831: dup
/*     */     //   832: iconst_5
/*     */     //   833: iload_0
/*     */     //   834: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   837: aastore
/*     */     //   838: dup
/*     */     //   839: bipush #6
/*     */     //   841: dload_3
/*     */     //   842: invokestatic valueOf : (D)Ljava/lang/Double;
/*     */     //   845: aastore
/*     */     //   846: dup
/*     */     //   847: bipush #7
/*     */     //   849: dload #6
/*     */     //   851: invokestatic valueOf : (D)Ljava/lang/Double;
/*     */     //   854: aastore
/*     */     //   855: dup
/*     */     //   856: bipush #8
/*     */     //   858: dload #8
/*     */     //   860: invokestatic valueOf : (D)Ljava/lang/Double;
/*     */     //   863: aastore
/*     */     //   864: iload #19
/*     */     //   866: i2s
/*     */     //   867: iload #20
/*     */     //   869: iload #21
/*     */     //   871: i2s
/*     */     //   872: invokespecial <init> : (Laacinternal/H;[Ljava/lang/Object;SIS)V
/*     */     //   875: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #89	-> 116
/*     */     //   #32	-> 124
/*     */     //   #112	-> 137
/*     */     //   #143	-> 149
/*     */     //   #120	-> 163
/*     */     //   #75	-> 168
/*     */     //   #19	-> 186
/*     */     //   #108	-> 198
/*     */     //   #42	-> 211
/*     */     //   #150	-> 223
/*     */     //   #60	-> 228
/*     */     //   #93	-> 233
/*     */     //   #145	-> 389
/*     */     //   #135	-> 420
/*     */     //   #146	-> 423
/*     */     //   #113	-> 426
/*     */     //   #99	-> 458
/*     */     //   #43	-> 503
/*     */     //   #126	-> 516
/*     */     //   #44	-> 543
/*     */     //   #125	-> 584
/*     */     //   #141	-> 629
/*     */     //   #25	-> 642
/*     */     //   #3	-> 669
/*     */     //   #28	-> 672
/*     */     //   #8	-> 675
/*     */     //   #2	-> 699
/*     */     //   #37	-> 718
/*     */     //   #51	-> 730
/*     */     //   #91	-> 733
/*     */     //   #5	-> 738
/*     */     //   #66	-> 752
/*     */     //   #14	-> 764
/*     */     //   #148	-> 767
/*     */     //   #130	-> 772
/*     */     //   #69	-> 793
/*     */     //   #64	-> 827
/*     */     //   #131	-> 851
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   116	126	126	aacinternal/v
/*     */     //   233	250	253	aacinternal/v
/*     */     //   247	271	274	aacinternal/v
/*     */     //   264	295	298	aacinternal/v
/*     */     //   285	313	316	aacinternal/v
/*     */     //   327	335	338	aacinternal/v
/*     */     //   332	358	361	aacinternal/v
/*     */     //   349	375	378	aacinternal/v
/*     */     //   372	405	408	aacinternal/v
/*     */     //   426	444	447	aacinternal/v
/*     */     //   441	472	475	aacinternal/v
/*     */     //   458	489	492	aacinternal/v
/*     */     //   506	517	520	aacinternal/v
/*     */     //   533	548	551	aacinternal/v
/*     */     //   562	570	573	aacinternal/v
/*     */     //   567	598	601	aacinternal/v
/*     */     //   584	615	618	aacinternal/v
/*     */     //   632	643	646	aacinternal/v
/*     */     //   675	685	688	aacinternal/v
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean a(Y paramY, long paramLong, double paramDouble1, double paramDouble2) {
/*     */     // Byte code:
/*     */     //   0: getstatic aacinternal/ak.a : J
/*     */     //   3: lload_1
/*     */     //   4: lxor
/*     */     //   5: lstore_1
/*     */     //   6: lload_1
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 82813173815963
/*     */     //   11: lxor
/*     */     //   12: lstore #7
/*     */     //   14: dup2
/*     */     //   15: ldc2_w 72352135814065
/*     */     //   18: lxor
/*     */     //   19: lstore #9
/*     */     //   21: pop2
/*     */     //   22: ldc2_w 3710755633637519614
/*     */     //   25: lload_1
/*     */     //   26: <illegal opcode> w : (JJ)I
/*     */     //   31: aload_0
/*     */     //   32: getstatic aacinternal/P.FUNCTION : Laacinternal/P;
/*     */     //   35: iconst_0
/*     */     //   36: anewarray java/lang/Object
/*     */     //   39: lload #7
/*     */     //   41: invokestatic a : (Ljava/lang/Object;Laacinternal/H;[Ljava/lang/Object;J)V
/*     */     //   44: istore #11
/*     */     //   46: aload_0
/*     */     //   47: lload #9
/*     */     //   49: dload_3
/*     */     //   50: invokeinterface a : (JD)D
/*     */     //   55: dstore #12
/*     */     //   57: aload_0
/*     */     //   58: lload #9
/*     */     //   60: dload #5
/*     */     //   62: invokeinterface a : (JD)D
/*     */     //   67: dstore #14
/*     */     //   69: dload #12
/*     */     //   71: dconst_0
/*     */     //   72: dcmpl
/*     */     //   73: iload #11
/*     */     //   75: ifeq -> 149
/*     */     //   78: iflt -> 132
/*     */     //   81: goto -> 94
/*     */     //   84: ldc2_w 3702324026628783401
/*     */     //   87: lload_1
/*     */     //   88: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   93: athrow
/*     */     //   94: dload #14
/*     */     //   96: dconst_0
/*     */     //   97: dcmpg
/*     */     //   98: iload #11
/*     */     //   100: ifeq -> 215
/*     */     //   103: goto -> 116
/*     */     //   106: ldc2_w 3702324026628783401
/*     */     //   109: lload_1
/*     */     //   110: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   115: athrow
/*     */     //   116: ifle -> 214
/*     */     //   119: goto -> 132
/*     */     //   122: ldc2_w 3702324026628783401
/*     */     //   125: lload_1
/*     */     //   126: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   131: athrow
/*     */     //   132: dload #12
/*     */     //   134: dconst_0
/*     */     //   135: dcmpg
/*     */     //   136: goto -> 149
/*     */     //   139: ldc2_w 3702324026628783401
/*     */     //   142: lload_1
/*     */     //   143: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   148: athrow
/*     */     //   149: iload #11
/*     */     //   151: lload_1
/*     */     //   152: lconst_0
/*     */     //   153: lcmp
/*     */     //   154: ifle -> 195
/*     */     //   157: ifeq -> 193
/*     */     //   160: ifgt -> 218
/*     */     //   163: goto -> 176
/*     */     //   166: ldc2_w 3702324026628783401
/*     */     //   169: lload_1
/*     */     //   170: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   175: athrow
/*     */     //   176: dload #14
/*     */     //   178: dconst_0
/*     */     //   179: dcmpl
/*     */     //   180: goto -> 193
/*     */     //   183: ldc2_w 3702324026628783401
/*     */     //   186: lload_1
/*     */     //   187: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   192: athrow
/*     */     //   193: iload #11
/*     */     //   195: ifeq -> 215
/*     */     //   198: iflt -> 218
/*     */     //   201: goto -> 214
/*     */     //   204: ldc2_w 3702324026628783401
/*     */     //   207: lload_1
/*     */     //   208: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   213: athrow
/*     */     //   214: iconst_1
/*     */     //   215: goto -> 219
/*     */     //   218: iconst_0
/*     */     //   219: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #102	-> 31
/*     */     //   #147	-> 46
/*     */     //   #24	-> 57
/*     */     //   #55	-> 69
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   69	81	84	aacinternal/g
/*     */     //   78	103	106	aacinternal/g
/*     */     //   94	119	122	aacinternal/g
/*     */     //   116	136	139	aacinternal/g
/*     */     //   149	163	166	aacinternal/g
/*     */     //   160	180	183	aacinternal/g
/*     */     //   193	201	204	aacinternal/g
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static C[] a(ai paramai, C paramC1, C paramC2, C paramC3, C paramC4, C paramC5, int paramInt, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic aacinternal/ak.a : J
/*     */     //   3: lload #7
/*     */     //   5: lxor
/*     */     //   6: lstore #7
/*     */     //   8: lload #7
/*     */     //   10: dup2
/*     */     //   11: ldc2_w 104710722816389
/*     */     //   14: lxor
/*     */     //   15: lstore #9
/*     */     //   17: dup2
/*     */     //   18: ldc2_w 71882583877352
/*     */     //   21: lxor
/*     */     //   22: dup2
/*     */     //   23: bipush #32
/*     */     //   25: lushr
/*     */     //   26: l2i
/*     */     //   27: istore #11
/*     */     //   29: dup2
/*     */     //   30: bipush #32
/*     */     //   32: lshl
/*     */     //   33: bipush #48
/*     */     //   35: lushr
/*     */     //   36: l2i
/*     */     //   37: istore #12
/*     */     //   39: dup2
/*     */     //   40: bipush #48
/*     */     //   42: lshl
/*     */     //   43: bipush #48
/*     */     //   45: lushr
/*     */     //   46: l2i
/*     */     //   47: istore #13
/*     */     //   49: pop2
/*     */     //   50: dup2
/*     */     //   51: ldc2_w 69024023888299
/*     */     //   54: lxor
/*     */     //   55: lstore #14
/*     */     //   57: dup2
/*     */     //   58: ldc2_w 46814222810813
/*     */     //   61: lxor
/*     */     //   62: lstore #16
/*     */     //   64: dup2
/*     */     //   65: ldc2_w 41424044368691
/*     */     //   68: lxor
/*     */     //   69: dup2
/*     */     //   70: bipush #48
/*     */     //   72: lushr
/*     */     //   73: l2i
/*     */     //   74: istore #18
/*     */     //   76: dup2
/*     */     //   77: bipush #16
/*     */     //   79: lshl
/*     */     //   80: bipush #32
/*     */     //   82: lushr
/*     */     //   83: l2i
/*     */     //   84: istore #19
/*     */     //   86: dup2
/*     */     //   87: bipush #48
/*     */     //   89: lshl
/*     */     //   90: bipush #48
/*     */     //   92: lushr
/*     */     //   93: l2i
/*     */     //   94: istore #20
/*     */     //   96: pop2
/*     */     //   97: pop2
/*     */     //   98: ldc2_w 2924173451411823729
/*     */     //   101: lload #7
/*     */     //   103: <illegal opcode> w : (JJ)I
/*     */     //   108: aload_0
/*     */     //   109: getstatic aacinternal/P.FUNCTION : Laacinternal/P;
/*     */     //   112: iconst_0
/*     */     //   113: anewarray java/lang/Object
/*     */     //   116: lload #14
/*     */     //   118: invokestatic a : (Ljava/lang/Object;Laacinternal/H;[Ljava/lang/Object;J)V
/*     */     //   121: istore #21
/*     */     //   123: aload #4
/*     */     //   125: invokeinterface a : ()D
/*     */     //   130: dconst_0
/*     */     //   131: dcmpg
/*     */     //   132: iload #21
/*     */     //   134: ifne -> 202
/*     */     //   137: ifgt -> 200
/*     */     //   140: goto -> 154
/*     */     //   143: ldc2_w 2905166463985264153
/*     */     //   146: lload #7
/*     */     //   148: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   153: athrow
/*     */     //   154: new aacinternal/v
/*     */     //   157: dup
/*     */     //   158: getstatic aacinternal/P.NUMBER_TOO_SMALL_BOUND_EXCLUDED : Laacinternal/P;
/*     */     //   161: iconst_2
/*     */     //   162: anewarray java/lang/Object
/*     */     //   165: dup
/*     */     //   166: iconst_0
/*     */     //   167: aload #4
/*     */     //   169: aastore
/*     */     //   170: dup
/*     */     //   171: iconst_1
/*     */     //   172: iconst_0
/*     */     //   173: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   176: aastore
/*     */     //   177: iload #18
/*     */     //   179: i2s
/*     */     //   180: iload #19
/*     */     //   182: iload #20
/*     */     //   184: i2s
/*     */     //   185: invokespecial <init> : (Laacinternal/H;[Ljava/lang/Object;SIS)V
/*     */     //   188: athrow
/*     */     //   189: ldc2_w 2905166463985264153
/*     */     //   192: lload #7
/*     */     //   194: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   199: athrow
/*     */     //   200: iload #6
/*     */     //   202: ifgt -> 247
/*     */     //   205: new aacinternal/v
/*     */     //   208: dup
/*     */     //   209: getstatic aacinternal/P.INVALID_MAX_ITERATIONS : Laacinternal/P;
/*     */     //   212: iconst_1
/*     */     //   213: anewarray java/lang/Object
/*     */     //   216: dup
/*     */     //   217: iconst_0
/*     */     //   218: iload #6
/*     */     //   220: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   223: aastore
/*     */     //   224: iload #18
/*     */     //   226: i2s
/*     */     //   227: iload #19
/*     */     //   229: iload #20
/*     */     //   231: i2s
/*     */     //   232: invokespecial <init> : (Laacinternal/H;[Ljava/lang/Object;SIS)V
/*     */     //   235: athrow
/*     */     //   236: ldc2_w 2905166463985264153
/*     */     //   239: lload #7
/*     */     //   241: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   246: athrow
/*     */     //   247: aload_2
/*     */     //   248: invokeinterface a : ()D
/*     */     //   253: aload_1
/*     */     //   254: invokeinterface a : ()D
/*     */     //   259: lload #9
/*     */     //   261: dup2_x2
/*     */     //   262: pop2
/*     */     //   263: aload_3
/*     */     //   264: invokeinterface a : ()D
/*     */     //   269: invokestatic a : (DJDD)V
/*     */     //   272: aload_1
/*     */     //   273: astore #22
/*     */     //   275: aload_1
/*     */     //   276: astore #23
/*     */     //   278: aconst_null
/*     */     //   279: astore #24
/*     */     //   281: aconst_null
/*     */     //   282: astore #25
/*     */     //   284: aload_1
/*     */     //   285: invokeinterface a : ()Laacinternal/t;
/*     */     //   290: invokeinterface a : ()Ljava/lang/Object;
/*     */     //   295: checkcast aacinternal/C
/*     */     //   298: astore #26
/*     */     //   300: iconst_0
/*     */     //   301: istore #27
/*     */     //   303: iload #27
/*     */     //   305: iload #6
/*     */     //   307: if_icmpge -> 824
/*     */     //   310: aload #22
/*     */     //   312: iload #21
/*     */     //   314: ifne -> 412
/*     */     //   317: invokeinterface a : ()D
/*     */     //   322: aload_2
/*     */     //   323: invokeinterface a : ()D
/*     */     //   328: dcmpl
/*     */     //   329: ifgt -> 396
/*     */     //   332: goto -> 346
/*     */     //   335: ldc2_w 2905166463985264153
/*     */     //   338: lload #7
/*     */     //   340: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   345: athrow
/*     */     //   346: aload #23
/*     */     //   348: iload #21
/*     */     //   350: ifne -> 412
/*     */     //   353: goto -> 367
/*     */     //   356: ldc2_w 2905166463985264153
/*     */     //   359: lload #7
/*     */     //   361: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   366: athrow
/*     */     //   367: invokeinterface a : ()D
/*     */     //   372: aload_3
/*     */     //   373: invokeinterface a : ()D
/*     */     //   378: dcmpg
/*     */     //   379: ifge -> 824
/*     */     //   382: goto -> 396
/*     */     //   385: ldc2_w 2905166463985264153
/*     */     //   388: lload #7
/*     */     //   390: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   395: athrow
/*     */     //   396: aload #22
/*     */     //   398: goto -> 412
/*     */     //   401: ldc2_w 2905166463985264153
/*     */     //   404: lload #7
/*     */     //   406: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   411: athrow
/*     */     //   412: astore #28
/*     */     //   414: aload #24
/*     */     //   416: astore #29
/*     */     //   418: aload #23
/*     */     //   420: astore #30
/*     */     //   422: aload #25
/*     */     //   424: astore #31
/*     */     //   426: aload #5
/*     */     //   428: aload #26
/*     */     //   430: invokeinterface i : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   435: checkcast aacinternal/C
/*     */     //   438: aload #4
/*     */     //   440: invokeinterface f : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   445: checkcast aacinternal/C
/*     */     //   448: astore #26
/*     */     //   450: aload_1
/*     */     //   451: aload #26
/*     */     //   453: invokeinterface g : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   458: checkcast aacinternal/C
/*     */     //   461: aload_2
/*     */     //   462: lload #16
/*     */     //   464: invokestatic a : (Laacinternal/C;Laacinternal/C;J)Laacinternal/C;
/*     */     //   467: astore #22
/*     */     //   469: aload_1
/*     */     //   470: aload #26
/*     */     //   472: invokeinterface f : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   477: iload #11
/*     */     //   479: swap
/*     */     //   480: iload #12
/*     */     //   482: swap
/*     */     //   483: iload #13
/*     */     //   485: i2s
/*     */     //   486: swap
/*     */     //   487: checkcast aacinternal/C
/*     */     //   490: aload_3
/*     */     //   491: invokestatic b : (IISLaacinternal/C;Laacinternal/C;)Laacinternal/C;
/*     */     //   494: astore #23
/*     */     //   496: aload_0
/*     */     //   497: aload #22
/*     */     //   499: invokeinterface a : (Laacinternal/C;)Laacinternal/C;
/*     */     //   504: astore #24
/*     */     //   506: aload_0
/*     */     //   507: aload #23
/*     */     //   509: invokeinterface a : (Laacinternal/C;)Laacinternal/C;
/*     */     //   514: astore #25
/*     */     //   516: iload #27
/*     */     //   518: iload #21
/*     */     //   520: lload #7
/*     */     //   522: lconst_0
/*     */     //   523: lcmp
/*     */     //   524: iflt -> 674
/*     */     //   527: ifne -> 672
/*     */     //   530: ifne -> 653
/*     */     //   533: goto -> 547
/*     */     //   536: ldc2_w 2905166463985264153
/*     */     //   539: lload #7
/*     */     //   541: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   546: athrow
/*     */     //   547: aload #24
/*     */     //   549: aload #25
/*     */     //   551: invokeinterface i : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   556: checkcast aacinternal/C
/*     */     //   559: iload #21
/*     */     //   561: ifne -> 624
/*     */     //   564: goto -> 578
/*     */     //   567: ldc2_w 2905166463985264153
/*     */     //   570: lload #7
/*     */     //   572: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   577: athrow
/*     */     //   578: invokeinterface a : ()D
/*     */     //   583: dconst_0
/*     */     //   584: dcmpg
/*     */     //   585: lload #7
/*     */     //   587: lconst_0
/*     */     //   588: lcmp
/*     */     //   589: ifle -> 800
/*     */     //   592: ifgt -> 795
/*     */     //   595: goto -> 609
/*     */     //   598: ldc2_w 2905166463985264153
/*     */     //   601: lload #7
/*     */     //   603: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   608: athrow
/*     */     //   609: aload_1
/*     */     //   610: goto -> 624
/*     */     //   613: ldc2_w 2905166463985264153
/*     */     //   616: lload #7
/*     */     //   618: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   623: athrow
/*     */     //   624: invokeinterface a : ()Laacinternal/t;
/*     */     //   629: iconst_2
/*     */     //   630: invokestatic a : (Laacinternal/t;I)[Ljava/lang/Object;
/*     */     //   633: checkcast [Laacinternal/C;
/*     */     //   636: astore #32
/*     */     //   638: aload #32
/*     */     //   640: iconst_0
/*     */     //   641: aload #22
/*     */     //   643: aastore
/*     */     //   644: aload #32
/*     */     //   646: iconst_1
/*     */     //   647: aload #23
/*     */     //   649: aastore
/*     */     //   650: aload #32
/*     */     //   652: areturn
/*     */     //   653: aload #24
/*     */     //   655: aload #29
/*     */     //   657: invokeinterface i : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   662: checkcast aacinternal/C
/*     */     //   665: invokeinterface a : ()D
/*     */     //   670: dconst_0
/*     */     //   671: dcmpg
/*     */     //   672: iload #21
/*     */     //   674: ifne -> 762
/*     */     //   677: ifgt -> 724
/*     */     //   680: goto -> 694
/*     */     //   683: ldc2_w 2905166463985264153
/*     */     //   686: lload #7
/*     */     //   688: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   693: athrow
/*     */     //   694: aload_1
/*     */     //   695: invokeinterface a : ()Laacinternal/t;
/*     */     //   700: iconst_2
/*     */     //   701: invokestatic a : (Laacinternal/t;I)[Ljava/lang/Object;
/*     */     //   704: checkcast [Laacinternal/C;
/*     */     //   707: astore #32
/*     */     //   709: aload #32
/*     */     //   711: iconst_0
/*     */     //   712: aload #22
/*     */     //   714: aastore
/*     */     //   715: aload #32
/*     */     //   717: iconst_1
/*     */     //   718: aload #28
/*     */     //   720: aastore
/*     */     //   721: aload #32
/*     */     //   723: areturn
/*     */     //   724: aload #25
/*     */     //   726: aload #31
/*     */     //   728: invokeinterface i : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   733: checkcast aacinternal/C
/*     */     //   736: iload #21
/*     */     //   738: ifne -> 766
/*     */     //   741: invokeinterface a : ()D
/*     */     //   746: dconst_0
/*     */     //   747: dcmpg
/*     */     //   748: goto -> 762
/*     */     //   751: ldc2_w 2905166463985264153
/*     */     //   754: lload #7
/*     */     //   756: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   761: athrow
/*     */     //   762: ifgt -> 795
/*     */     //   765: aload_1
/*     */     //   766: invokeinterface a : ()Laacinternal/t;
/*     */     //   771: iconst_2
/*     */     //   772: invokestatic a : (Laacinternal/t;I)[Ljava/lang/Object;
/*     */     //   775: checkcast [Laacinternal/C;
/*     */     //   778: astore #32
/*     */     //   780: aload #32
/*     */     //   782: iconst_0
/*     */     //   783: aload #30
/*     */     //   785: aastore
/*     */     //   786: aload #32
/*     */     //   788: iconst_1
/*     */     //   789: aload #23
/*     */     //   791: aastore
/*     */     //   792: aload #32
/*     */     //   794: areturn
/*     */     //   795: iinc #27, 1
/*     */     //   798: iload #21
/*     */     //   800: ifeq -> 303
/*     */     //   803: iconst_3
/*     */     //   804: anewarray me/konsolas/aac/aN
/*     */     //   807: lload #7
/*     */     //   809: lconst_0
/*     */     //   810: lcmp
/*     */     //   811: ifle -> 477
/*     */     //   814: ldc2_w 2925517473915531596
/*     */     //   817: lload #7
/*     */     //   819: <illegal opcode> w : ([Lme/konsolas/aac/aN;JJ)V
/*     */     //   824: new aacinternal/v
/*     */     //   827: dup
/*     */     //   828: getstatic aacinternal/P.NOT_BRACKETING_INTERVAL : Laacinternal/P;
/*     */     //   831: iconst_4
/*     */     //   832: anewarray java/lang/Object
/*     */     //   835: dup
/*     */     //   836: iconst_0
/*     */     //   837: aload #22
/*     */     //   839: invokeinterface a : ()D
/*     */     //   844: invokestatic valueOf : (D)Ljava/lang/Double;
/*     */     //   847: aastore
/*     */     //   848: dup
/*     */     //   849: iconst_1
/*     */     //   850: aload #23
/*     */     //   852: invokeinterface a : ()D
/*     */     //   857: invokestatic valueOf : (D)Ljava/lang/Double;
/*     */     //   860: aastore
/*     */     //   861: dup
/*     */     //   862: iconst_2
/*     */     //   863: aload #24
/*     */     //   865: invokeinterface a : ()D
/*     */     //   870: invokestatic valueOf : (D)Ljava/lang/Double;
/*     */     //   873: aastore
/*     */     //   874: dup
/*     */     //   875: iconst_3
/*     */     //   876: aload #25
/*     */     //   878: invokeinterface a : ()D
/*     */     //   883: invokestatic valueOf : (D)Ljava/lang/Double;
/*     */     //   886: aastore
/*     */     //   887: iload #18
/*     */     //   889: i2s
/*     */     //   890: iload #19
/*     */     //   892: iload #20
/*     */     //   894: i2s
/*     */     //   895: invokespecial <init> : (Laacinternal/H;[Ljava/lang/Object;SIS)V
/*     */     //   898: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #106	-> 108
/*     */     //   #116	-> 123
/*     */     //   #87	-> 154
/*     */     //   #54	-> 173
/*     */     //   #65	-> 200
/*     */     //   #38	-> 205
/*     */     //   #1	-> 247
/*     */     //   #90	-> 272
/*     */     //   #41	-> 275
/*     */     //   #76	-> 278
/*     */     //   #4	-> 281
/*     */     //   #56	-> 284
/*     */     //   #104	-> 300
/*     */     //   #86	-> 303
/*     */     //   #17	-> 312
/*     */     //   #132	-> 396
/*     */     //   #107	-> 414
/*     */     //   #11	-> 418
/*     */     //   #92	-> 422
/*     */     //   #63	-> 426
/*     */     //   #81	-> 450
/*     */     //   #144	-> 469
/*     */     //   #96	-> 496
/*     */     //   #140	-> 506
/*     */     //   #6	-> 516
/*     */     //   #134	-> 547
/*     */     //   #21	-> 609
/*     */     //   #70	-> 638
/*     */     //   #48	-> 644
/*     */     //   #123	-> 650
/*     */     //   #9	-> 653
/*     */     //   #133	-> 694
/*     */     //   #61	-> 709
/*     */     //   #98	-> 715
/*     */     //   #118	-> 721
/*     */     //   #103	-> 724
/*     */     //   #53	-> 765
/*     */     //   #36	-> 780
/*     */     //   #45	-> 786
/*     */     //   #151	-> 792
/*     */     //   #26	-> 795
/*     */     //   #122	-> 824
/*     */     //   #138	-> 839
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   123	140	143	aacinternal/v
/*     */     //   137	189	189	aacinternal/v
/*     */     //   202	236	236	aacinternal/v
/*     */     //   310	332	335	aacinternal/v
/*     */     //   317	353	356	aacinternal/v
/*     */     //   346	382	385	aacinternal/v
/*     */     //   367	398	401	aacinternal/v
/*     */     //   516	533	536	aacinternal/v
/*     */     //   530	564	567	aacinternal/v
/*     */     //   547	595	598	aacinternal/v
/*     */     //   578	610	613	aacinternal/v
/*     */     //   672	680	683	aacinternal/v
/*     */     //   724	748	751	aacinternal/v
/*     */   }
/*     */ 
/*     */   
/*     */   public static double a(Y paramY, char paramChar, int paramInt1, double paramDouble1, double paramDouble2, int paramInt2) {
/* 109 */     long l1 = (paramChar << 48L | paramInt1 << 32L >>> 16L | paramInt2 << 48L >>> 48L) ^ a, l2 = l1 ^ 0xFB10F557E78L, l3 = l1 ^ 0x916F4FF9AC9L, l4 = l1 ^ 0x126649DFE69BL; az.a(paramY, P.FUNCTION, new Object[0], l3); S s = new S(l2);
/* 110 */     return s.a(2147483647, paramY, l4, paramDouble1, paramDouble2); } public static C[] a(long paramLong, ai paramai, C paramC1, C paramC2, C paramC3) { paramLong = a ^ paramLong; long l = paramLong ^ 0x560648F9F03BL; return a(paramai, paramC1, paramC2, paramC3, (C)paramC1.a().b(), (C)paramC1.a().b(), 2147483647, l); }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean a(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3) {
/*     */     // Byte code:
/*     */     //   0: getstatic aacinternal/ak.a : J
/*     */     //   3: lload_0
/*     */     //   4: lxor
/*     */     //   5: lstore_0
/*     */     //   6: ldc2_w -7766455573305698375
/*     */     //   9: lload_0
/*     */     //   10: <illegal opcode> w : (JJ)I
/*     */     //   15: istore #8
/*     */     //   17: dload_2
/*     */     //   18: dload #4
/*     */     //   20: dcmpg
/*     */     //   21: iload #8
/*     */     //   23: ifeq -> 60
/*     */     //   26: ifge -> 85
/*     */     //   29: goto -> 42
/*     */     //   32: ldc2_w -7771509481394496914
/*     */     //   35: lload_0
/*     */     //   36: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   41: athrow
/*     */     //   42: dload #4
/*     */     //   44: dload #6
/*     */     //   46: dcmpg
/*     */     //   47: goto -> 60
/*     */     //   50: ldc2_w -7771509481394496914
/*     */     //   53: lload_0
/*     */     //   54: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   59: athrow
/*     */     //   60: iload #8
/*     */     //   62: ifeq -> 82
/*     */     //   65: ifge -> 85
/*     */     //   68: goto -> 81
/*     */     //   71: ldc2_w -7771509481394496914
/*     */     //   74: lload_0
/*     */     //   75: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   80: athrow
/*     */     //   81: iconst_1
/*     */     //   82: goto -> 86
/*     */     //   85: iconst_0
/*     */     //   86: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #119	-> 17
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   17	29	32	aacinternal/v
/*     */     //   26	47	50	aacinternal/v
/*     */     //   60	68	71	aacinternal/v
/*     */   }
/*     */ 
/*     */   
/*     */   public static double[] a(Y paramY, double paramDouble1, double paramDouble2, long paramLong, double paramDouble3, int paramInt) {
/* 121 */     paramLong = a ^ paramLong; int i = (int)((paramLong ^ 0x308B33E42698L) >>> 32L), j = (int)((paramLong ^ 0x308B33E42698L) << 32L >>> 48L), k = (int)((paramLong ^ 0x308B33E42698L) << 48L >>> 48L); paramLong ^ 0x308B33E42698L; return a(paramY, paramDouble1, i, (char)j, paramDouble2, k, paramDouble3, 1.0D, 1.0D, paramInt);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static C[] a(ai paramai, C paramC1, C paramC2, C paramC3, int paramInt, long paramLong) {
/* 128 */     paramLong = a ^ paramLong; long l = paramLong ^ 0x237B10ADA048L;
/* 129 */     return a(paramai, paramC1, paramC2, paramC3, (C)paramC1.a().b(), (C)paramC1.a().b(), paramInt, l);
/*     */   }
/*     */   
/*     */   private static C b(int paramInt1, int paramInt2, short paramShort, C paramC1, C paramC2) {
/*     */     // Byte code:
/*     */     //   0: iload_0
/*     */     //   1: i2l
/*     */     //   2: bipush #32
/*     */     //   4: lshl
/*     */     //   5: iload_1
/*     */     //   6: i2l
/*     */     //   7: bipush #48
/*     */     //   9: lshl
/*     */     //   10: bipush #32
/*     */     //   12: lushr
/*     */     //   13: lor
/*     */     //   14: iload_2
/*     */     //   15: i2l
/*     */     //   16: bipush #48
/*     */     //   18: lshl
/*     */     //   19: bipush #48
/*     */     //   21: lushr
/*     */     //   22: lor
/*     */     //   23: getstatic aacinternal/ak.a : J
/*     */     //   26: lxor
/*     */     //   27: lstore #5
/*     */     //   29: ldc2_w -1806344551390686709
/*     */     //   32: lload #5
/*     */     //   34: <illegal opcode> w : (JJ)I
/*     */     //   39: istore #7
/*     */     //   41: aload_3
/*     */     //   42: aload #4
/*     */     //   44: invokeinterface g : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   49: checkcast aacinternal/C
/*     */     //   52: iload #7
/*     */     //   54: ifne -> 96
/*     */     //   57: invokeinterface a : ()D
/*     */     //   62: dconst_0
/*     */     //   63: dcmpg
/*     */     //   64: ifgt -> 99
/*     */     //   67: goto -> 81
/*     */     //   70: ldc2_w -1861276441654925213
/*     */     //   73: lload #5
/*     */     //   75: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   80: athrow
/*     */     //   81: aload_3
/*     */     //   82: goto -> 96
/*     */     //   85: ldc2_w -1861276441654925213
/*     */     //   88: lload #5
/*     */     //   90: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   95: athrow
/*     */     //   96: goto -> 101
/*     */     //   99: aload #4
/*     */     //   101: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #139	-> 41
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   41	67	70	aacinternal/v
/*     */     //   57	82	85	aacinternal/v
/*     */   }
/*     */   
/*     */   private static C a(C paramC1, C paramC2, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic aacinternal/ak.a : J
/*     */     //   3: lload_2
/*     */     //   4: lxor
/*     */     //   5: lstore_2
/*     */     //   6: ldc2_w -4702891878874674594
/*     */     //   9: lload_2
/*     */     //   10: <illegal opcode> w : (JJ)I
/*     */     //   15: istore #4
/*     */     //   17: aload_0
/*     */     //   18: aload_1
/*     */     //   19: invokeinterface g : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   24: checkcast aacinternal/C
/*     */     //   27: iload #4
/*     */     //   29: ifne -> 69
/*     */     //   32: invokeinterface a : ()D
/*     */     //   37: dconst_0
/*     */     //   38: dcmpg
/*     */     //   39: ifgt -> 72
/*     */     //   42: goto -> 55
/*     */     //   45: ldc2_w -4720334244144697290
/*     */     //   48: lload_2
/*     */     //   49: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   54: athrow
/*     */     //   55: aload_1
/*     */     //   56: goto -> 69
/*     */     //   59: ldc2_w -4720334244144697290
/*     */     //   62: lload_2
/*     */     //   63: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   68: athrow
/*     */     //   69: goto -> 73
/*     */     //   72: aload_0
/*     */     //   73: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #149	-> 17
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   17	42	45	aacinternal/v
/*     */     //   32	56	59	aacinternal/v
/*     */   }
/*     */   
/*     */   private static RuntimeException a(RuntimeException paramRuntimeException) {
/*     */     return paramRuntimeException;
/*     */   }
/*     */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\ak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */