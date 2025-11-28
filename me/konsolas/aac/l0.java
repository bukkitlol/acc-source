/*     */ package me.konsolas.aac;
/*     */ public final class l0 { public static final long[][] k; public static final long[][] g; public static final AtomicLongArray[] c; public static final m9 b; private static final int a = 7; private static final int d = 8192; private static final int l = 40; private static final int j = 8; private static final int h = 255; private static final int e = 8; private static final int f = 1024; private static String[] i;
/*     */   private static final long m;
/*     */   
/*   5 */   public static void a(long[][] paramArrayOflong, hq paramhq) { c(paramArrayOflong, 0L, k.a(paramArrayOflong), paramhq); }
/*     */   @Deprecated public static long[][] a(long[][] paramArrayOflong, long paramLong) { k.a(paramLong); long l = a(paramArrayOflong); try { if (paramLong >= l)
/*     */         return paramArrayOflong;  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  int i = (int)(paramLong + 134217727L >>> 27L); long[][] arrayOfLong = Arrays.<long[]>copyOf(paramArrayOflong, i); int j = (int)(paramLong & 0x7FFFFFFL); try { if (j != 0)
/*     */         arrayOfLong[i - 1] = a1.b(arrayOfLong[i - 1], j);  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/*     */      return arrayOfLong; }
/*  10 */   @Deprecated public static void a(long[][] paramArrayOflong, long paramLong1, long paramLong2) { k.a(a(paramArrayOflong), paramLong1, paramLong2); } private static void i(long[][] paramArrayOflong, long paramLong1, long paramLong2) { long l; for (l = paramLong1; l < paramLong2 - 1L; 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 207 */       l++) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 330 */       long l1 = l; long l2 = l + 1L; while (true) { try { if (l2 < paramLong2) { if (k.a(paramArrayOflong, l2) < k.a(paramArrayOflong, l1))
/*     */               l1 = l2;  l2++; continue; }
/*     */            }
/*     */         catch (IllegalArgumentException illegalArgumentException)
/*     */         { throw a(null); }
/*     */          try {
/*     */           if (l1 != l)
/*     */             k.e(paramArrayOflong, l, l1); 
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw a(null);
/*     */         }  break; }
/*     */     
/*     */     }  }
/*     */   @Deprecated public static void a(long[][] paramArrayOflong1, long paramLong1, long[][] paramArrayOflong2, long paramLong2, long paramLong3) { k.a(paramArrayOflong1, paramLong1, paramArrayOflong2, paramLong2, paramLong3); } public static long b(long[][] paramArrayOflong, long paramLong1, long paramLong2, long paramLong3) { paramLong2--; while (paramLong1 <= paramLong2) {
/*     */       long l2 = paramLong1 + paramLong2 >>> 1L; long l1 = k.a(paramArrayOflong, l2); if (l1 < paramLong3) {
/*     */         paramLong1 = l2 + 1L; continue;
/*     */       }  if (l1 > paramLong3) {
/*     */         paramLong2 = l2 - 1L; continue;
/*     */       }  return l2;
/* 349 */     }  return -(paramLong1 + 1L); }
/*     */   
/*     */   public static void c(long[][] paramArrayOflong, long paramLong1, long paramLong2, hq paramhq) {
/*     */     ForkJoinPool forkJoinPool = a();
/*     */     try {
/*     */       if (paramLong2 - paramLong1 >= 8192L) {
/*     */         try {
/*     */           if (forkJoinPool.getParallelism() == 1) {
/*     */             a(paramArrayOflong, paramLong1, paramLong2, paramhq);
/*     */             return;
/*     */           } 
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw a(null);
/*     */         } 
/*     */         forkJoinPool.invoke(new gN(paramArrayOflong, paramLong1, paramLong2, paramhq));
/*     */         return;
/*     */       } 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     a(paramArrayOflong, paramLong1, paramLong2, paramhq);
/*     */   }
/*     */   public static void b(long[][] paramArrayOflong1, long[][] paramArrayOflong2) {
/*     */     a(paramArrayOflong1, paramArrayOflong2, 0L, k.a(paramArrayOflong1));
/*     */   }
/*     */   public static void a(long[][] paramArrayOflong) {
/*     */     j(paramArrayOflong, 0L, k.a(paramArrayOflong));
/*     */   }
/*     */   @Deprecated
/*     */   public static long[][] a(long[][] paramArrayOflong) {
/*     */     return k.b(paramArrayOflong);
/*     */   }
/*     */   
/*     */   public static long[][] a(long[][] paramArrayOflong, long paramLong1, long paramLong2, Random paramRandom) {
/*     */     return k.a(paramArrayOflong, paramLong1, paramLong2, paramRandom);
/*     */   }
/*     */   
/*     */   public static void g(long[][] paramArrayOflong, long paramLong1, long paramLong2) {
/*     */     // Byte code:
/*     */     //   0: lload_3
/*     */     //   1: lload_1
/*     */     //   2: lsub
/*     */     //   3: lstore #5
/*     */     //   5: lload #5
/*     */     //   7: ldc2_w 7
/*     */     //   10: lcmp
/*     */     //   11: ifge -> 25
/*     */     //   14: aload_0
/*     */     //   15: lload_1
/*     */     //   16: lload_3
/*     */     //   17: invokestatic i : ([[JJJ)V
/*     */     //   20: return
/*     */     //   21: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   24: athrow
/*     */     //   25: lload_1
/*     */     //   26: lload #5
/*     */     //   28: ldc2_w 2
/*     */     //   31: ldiv
/*     */     //   32: ladd
/*     */     //   33: lstore #7
/*     */     //   35: lload #5
/*     */     //   37: ldc2_w 7
/*     */     //   40: lcmp
/*     */     //   41: ifle -> 143
/*     */     //   44: lload_1
/*     */     //   45: lstore #9
/*     */     //   47: lload_3
/*     */     //   48: lconst_1
/*     */     //   49: lsub
/*     */     //   50: lstore #11
/*     */     //   52: lload #5
/*     */     //   54: ldc2_w 40
/*     */     //   57: lcmp
/*     */     //   58: ifle -> 131
/*     */     //   61: lload #5
/*     */     //   63: ldc2_w 8
/*     */     //   66: ldiv
/*     */     //   67: lstore #13
/*     */     //   69: aload_0
/*     */     //   70: lload #9
/*     */     //   72: lload #9
/*     */     //   74: lload #13
/*     */     //   76: ladd
/*     */     //   77: lload #9
/*     */     //   79: ldc2_w 2
/*     */     //   82: lload #13
/*     */     //   84: lmul
/*     */     //   85: ladd
/*     */     //   86: invokestatic c : ([[JJJJ)J
/*     */     //   89: lstore #9
/*     */     //   91: aload_0
/*     */     //   92: lload #7
/*     */     //   94: lload #13
/*     */     //   96: lsub
/*     */     //   97: lload #7
/*     */     //   99: lload #7
/*     */     //   101: lload #13
/*     */     //   103: ladd
/*     */     //   104: invokestatic c : ([[JJJJ)J
/*     */     //   107: lstore #7
/*     */     //   109: aload_0
/*     */     //   110: lload #11
/*     */     //   112: ldc2_w 2
/*     */     //   115: lload #13
/*     */     //   117: lmul
/*     */     //   118: lsub
/*     */     //   119: lload #11
/*     */     //   121: lload #13
/*     */     //   123: lsub
/*     */     //   124: lload #11
/*     */     //   126: invokestatic c : ([[JJJJ)J
/*     */     //   129: lstore #11
/*     */     //   131: aload_0
/*     */     //   132: lload #9
/*     */     //   134: lload #7
/*     */     //   136: lload #11
/*     */     //   138: invokestatic c : ([[JJJJ)J
/*     */     //   141: lstore #7
/*     */     //   143: aload_0
/*     */     //   144: lload #7
/*     */     //   146: invokestatic a : ([[JJ)J
/*     */     //   149: lstore #9
/*     */     //   151: lload_1
/*     */     //   152: lstore #11
/*     */     //   154: lload #11
/*     */     //   156: lstore #13
/*     */     //   158: lload_3
/*     */     //   159: lconst_1
/*     */     //   160: lsub
/*     */     //   161: lstore #15
/*     */     //   163: lload #15
/*     */     //   165: lstore #17
/*     */     //   167: lload #13
/*     */     //   169: lload #15
/*     */     //   171: lcmp
/*     */     //   172: ifgt -> 226
/*     */     //   175: aload_0
/*     */     //   176: lload #13
/*     */     //   178: invokestatic a : ([[JJ)J
/*     */     //   181: lload #9
/*     */     //   183: invokestatic compare : (JJ)I
/*     */     //   186: dup
/*     */     //   187: istore #19
/*     */     //   189: ifgt -> 226
/*     */     //   192: iload #19
/*     */     //   194: ifne -> 217
/*     */     //   197: goto -> 204
/*     */     //   200: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   203: athrow
/*     */     //   204: aload_0
/*     */     //   205: lload #11
/*     */     //   207: dup2
/*     */     //   208: lconst_1
/*     */     //   209: ladd
/*     */     //   210: lstore #11
/*     */     //   212: lload #13
/*     */     //   214: invokestatic e : ([[JJJ)V
/*     */     //   217: lload #13
/*     */     //   219: lconst_1
/*     */     //   220: ladd
/*     */     //   221: lstore #13
/*     */     //   223: goto -> 167
/*     */     //   226: lload #15
/*     */     //   228: lload #13
/*     */     //   230: lcmp
/*     */     //   231: iflt -> 285
/*     */     //   234: aload_0
/*     */     //   235: lload #15
/*     */     //   237: invokestatic a : ([[JJ)J
/*     */     //   240: lload #9
/*     */     //   242: invokestatic compare : (JJ)I
/*     */     //   245: dup
/*     */     //   246: istore #19
/*     */     //   248: iflt -> 285
/*     */     //   251: iload #19
/*     */     //   253: ifne -> 276
/*     */     //   256: goto -> 263
/*     */     //   259: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   262: athrow
/*     */     //   263: aload_0
/*     */     //   264: lload #15
/*     */     //   266: lload #17
/*     */     //   268: dup2
/*     */     //   269: lconst_1
/*     */     //   270: lsub
/*     */     //   271: lstore #17
/*     */     //   273: invokestatic e : ([[JJJ)V
/*     */     //   276: lload #15
/*     */     //   278: lconst_1
/*     */     //   279: lsub
/*     */     //   280: lstore #15
/*     */     //   282: goto -> 226
/*     */     //   285: lload #13
/*     */     //   287: lload #15
/*     */     //   289: lcmp
/*     */     //   290: ifle -> 300
/*     */     //   293: goto -> 321
/*     */     //   296: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   299: athrow
/*     */     //   300: aload_0
/*     */     //   301: lload #13
/*     */     //   303: dup2
/*     */     //   304: lconst_1
/*     */     //   305: ladd
/*     */     //   306: lstore #13
/*     */     //   308: lload #15
/*     */     //   310: dup2
/*     */     //   311: lconst_1
/*     */     //   312: lsub
/*     */     //   313: lstore #15
/*     */     //   315: invokestatic e : ([[JJJ)V
/*     */     //   318: goto -> 167
/*     */     //   321: lload_3
/*     */     //   322: lstore #21
/*     */     //   324: lload #11
/*     */     //   326: lload_1
/*     */     //   327: lsub
/*     */     //   328: lload #13
/*     */     //   330: lload #11
/*     */     //   332: lsub
/*     */     //   333: invokestatic min : (JJ)J
/*     */     //   336: lstore #19
/*     */     //   338: aload_0
/*     */     //   339: lload_1
/*     */     //   340: lload #13
/*     */     //   342: lload #19
/*     */     //   344: lsub
/*     */     //   345: lload #19
/*     */     //   347: invokestatic c : ([[JJJJ)V
/*     */     //   350: lload #17
/*     */     //   352: lload #15
/*     */     //   354: lsub
/*     */     //   355: lload #21
/*     */     //   357: lload #17
/*     */     //   359: lsub
/*     */     //   360: lconst_1
/*     */     //   361: lsub
/*     */     //   362: invokestatic min : (JJ)J
/*     */     //   365: lstore #19
/*     */     //   367: aload_0
/*     */     //   368: lload #13
/*     */     //   370: lload #21
/*     */     //   372: lload #19
/*     */     //   374: lsub
/*     */     //   375: lload #19
/*     */     //   377: invokestatic c : ([[JJJJ)V
/*     */     //   380: lload #13
/*     */     //   382: lload #11
/*     */     //   384: lsub
/*     */     //   385: dup2
/*     */     //   386: lstore #19
/*     */     //   388: lconst_1
/*     */     //   389: lcmp
/*     */     //   390: ifle -> 409
/*     */     //   393: aload_0
/*     */     //   394: lload_1
/*     */     //   395: lload_1
/*     */     //   396: lload #19
/*     */     //   398: ladd
/*     */     //   399: invokestatic g : ([[JJJ)V
/*     */     //   402: goto -> 409
/*     */     //   405: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   408: athrow
/*     */     //   409: lload #17
/*     */     //   411: lload #15
/*     */     //   413: lsub
/*     */     //   414: dup2
/*     */     //   415: lstore #19
/*     */     //   417: lconst_1
/*     */     //   418: lcmp
/*     */     //   419: ifle -> 440
/*     */     //   422: aload_0
/*     */     //   423: lload #21
/*     */     //   425: lload #19
/*     */     //   427: lsub
/*     */     //   428: lload #21
/*     */     //   430: invokestatic g : ([[JJJ)V
/*     */     //   433: goto -> 440
/*     */     //   436: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   439: athrow
/*     */     //   440: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #88	-> 0
/*     */     //   #341	-> 5
/*     */     //   #412	-> 14
/*     */     //   #22	-> 20
/*     */     //   #99	-> 25
/*     */     //   #276	-> 35
/*     */     //   #146	-> 44
/*     */     //   #233	-> 47
/*     */     //   #428	-> 52
/*     */     //   #339	-> 61
/*     */     //   #354	-> 69
/*     */     //   #373	-> 91
/*     */     //   #209	-> 109
/*     */     //   #47	-> 131
/*     */     //   #107	-> 143
/*     */     //   #269	-> 151
/*     */     //   #97	-> 167
/*     */     //   #39	-> 192
/*     */     //   #251	-> 217
/*     */     //   #204	-> 226
/*     */     //   #333	-> 251
/*     */     //   #313	-> 276
/*     */     //   #1	-> 285
/*     */     //   #116	-> 300
/*     */     //   #60	-> 321
/*     */     //   #338	-> 324
/*     */     //   #402	-> 338
/*     */     //   #310	-> 350
/*     */     //   #278	-> 367
/*     */     //   #309	-> 380
/*     */     //   #158	-> 409
/*     */     //   #117	-> 440
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   5	21	21	java/lang/IllegalArgumentException
/*     */     //   189	197	200	java/lang/IllegalArgumentException
/*     */     //   248	256	259	java/lang/IllegalArgumentException
/*     */     //   285	296	296	java/lang/IllegalArgumentException
/*     */     //   388	402	405	java/lang/IllegalArgumentException
/*     */     //   417	433	436	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public static void a(long[] paramArrayOflong, int paramInt, long[][] paramArrayOflong1, long paramLong1, long paramLong2) {
/*     */     k.a(paramArrayOflong, paramInt, paramArrayOflong1, paramLong1, paramLong2);
/*     */   }
/*     */   
/*     */   public static void b(long[][] paramArrayOflong, long paramLong1, long paramLong2) {
/*     */     byte b1 = 7;
/*     */     char c = 'ۺ';
/*     */     long[] arrayOfLong1 = new long[1786];
/* 399 */     byte b2 = 0;
/*     */ 
/*     */     
/*     */     long[] arrayOfLong2 = new long[1786];
/*     */ 
/*     */     
/*     */     byte b3 = 0;
/*     */ 
/*     */     
/*     */     int[] arrayOfInt = new int[1786];
/*     */ 
/*     */     
/*     */     byte b4 = 0;
/*     */ 
/*     */     
/*     */     arrayOfLong1[b2++] = paramLong1;
/*     */ 
/*     */     
/*     */     arrayOfLong2[b3++] = paramLong2 - paramLong1;
/*     */ 
/*     */     
/* 420 */     arrayOfInt[b4++] = 0;
/*     */     long[] arrayOfLong3 = new long[256];
/*     */     long[] arrayOfLong4 = new long[256];
/*     */     byte[][] arrayOfByte = fd.a(paramLong2 - paramLong1);
/*     */     while (b2 > 0) {
/*     */       long l1 = arrayOfLong1[--b2];
/*     */       long l2 = arrayOfLong2[--b3];
/*     */       int i = arrayOfInt[--b4];
/*     */       try {
/*     */       
/*     */       } catch (IllegalArgumentException illegalArgumentException) {
/*     */         throw a(null);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void a(long[][] paramArrayOflong1, long[][] paramArrayOflong2, long[][] paramArrayOflong3, boolean paramBoolean) {
/*     */     a(paramArrayOflong2, paramArrayOflong3);
/*     */     a(paramArrayOflong1, paramArrayOflong2, paramArrayOflong3, 0L, k.a(paramArrayOflong2), paramBoolean);
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public static long b(long[][] paramArrayOflong, long paramLong) {
/*     */     return paramArrayOflong[k.b(paramLong)][k.a(paramLong)];
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public static void a(long[][] paramArrayOflong1, long[][] paramArrayOflong2) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/l0.m : J
/*     */     //   3: ldc2_w 119023778833720
/*     */     //   6: lxor
/*     */     //   7: lstore_2
/*     */     //   8: aload_0
/*     */     //   9: invokestatic a : ([[J)J
/*     */     //   12: aload_1
/*     */     //   13: invokestatic a : ([[J)J
/*     */     //   16: lcmp
/*     */     //   17: ifeq -> 116
/*     */     //   20: new java/lang/IllegalArgumentException
/*     */     //   23: dup
/*     */     //   24: new java/lang/StringBuilder
/*     */     //   27: dup
/*     */     //   28: invokespecial <init> : ()V
/*     */     //   31: ldc '䮁噄檭懶濺⨌梓牪菗ṱ쥆⹷膴羿↤漅㒎'
/*     */     //   33: invokevirtual toCharArray : ()[C
/*     */     //   36: dup
/*     */     //   37: dup
/*     */     //   38: iconst_2
/*     */     //   39: dup_x1
/*     */     //   40: caload
/*     */     //   41: sipush #3778
/*     */     //   44: ixor
/*     */     //   45: i2c
/*     */     //   46: castore
/*     */     //   47: sipush #17413
/*     */     //   50: iconst_1
/*     */     //   51: iconst_0
/*     */     //   52: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*     */     //   55: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   58: aload_0
/*     */     //   59: invokestatic a : ([[J)J
/*     */     //   62: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*     */     //   65: ldc 'Ӷ㪳䱠ᢍᬜ'
/*     */     //   67: invokevirtual toCharArray : ()[C
/*     */     //   70: dup
/*     */     //   71: dup
/*     */     //   72: iconst_3
/*     */     //   73: dup_x1
/*     */     //   74: caload
/*     */     //   75: sipush #13222
/*     */     //   78: ixor
/*     */     //   79: i2c
/*     */     //   80: castore
/*     */     //   81: sipush #19724
/*     */     //   84: iconst_1
/*     */     //   85: iconst_5
/*     */     //   86: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*     */     //   89: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   92: aload_1
/*     */     //   93: invokestatic a : ([[J)J
/*     */     //   96: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*     */     //   99: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   102: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   105: athrow
/*     */     //   106: ldc2_w -5137884906998648888
/*     */     //   109: lload_2
/*     */     //   110: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   115: athrow
/*     */     //   116: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #129	-> 8
/*     */     //   #392	-> 116
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   8	106	106	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public static long[][] b(long[][] paramArrayOflong, long paramLong1, long paramLong2) {
/*     */     long l = a(paramArrayOflong);
/*     */     try {
/*     */     
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     return (paramLong1 > l) ? d(paramArrayOflong, Math.max(l + (l >> 1L), paramLong1), paramLong2) : paramArrayOflong;
/*     */   }
/*     */   
/*     */   public static AtomicLongArray[] a(long paramLong) {
/*     */     try {
/*     */       if (paramLong == 0L)
/*     */         return c; 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     k.a(paramLong);
/*     */     int i = (int)(paramLong + 134217727L >>> 27L);
/*     */     AtomicLongArray[] arrayOfAtomicLongArray = new AtomicLongArray[i];
/*     */     int j = (int)(paramLong & 0x7FFFFFFL);
/*     */     if (j != 0) {
/*     */       byte b1 = 0;
/*     */       try {
/*     */         while (b1 < i - 1) {
/*     */           arrayOfAtomicLongArray[b1] = new AtomicLongArray(134217728);
/*     */           b1++;
/*     */         } 
/*     */       } catch (IllegalArgumentException illegalArgumentException) {
/*     */         throw a(null);
/*     */       } 
/*     */     } 
/*     */     byte b = 0;
/*     */     try {
/*     */       while (b < i) {
/*     */         arrayOfAtomicLongArray[b] = new AtomicLongArray(134217728);
/*     */         b++;
/*     */       } 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     return arrayOfAtomicLongArray;
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public static void d(long[][] paramArrayOflong, long paramLong1, long paramLong2) {
/*     */     paramArrayOflong[k.b(paramLong1)][k.a(paramLong1)] = paramArrayOflong[k.b(paramLong1)][k.a(paramLong1)] * paramLong2;
/*     */   }
/*     */   
/*     */   private static void c(long[][] paramArrayOflong, long paramLong1, long paramLong2, long paramLong3) {
/*     */     for (byte b = 0; b < paramLong3; ) {
/*     */       k.e(paramArrayOflong, paramLong1, paramLong2);
/*     */       b++;
/*     */       paramLong1++;
/*     */       paramLong2++;
/*     */     } 
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public static long[][] b(long[][] paramArrayOflong, long paramLong) {
/*     */     return d(paramArrayOflong, paramLong, a(paramArrayOflong));
/*     */   }
/*     */   
/*     */   public static void j(long[][] paramArrayOflong, long paramLong1, long paramLong2) {
/*     */     ForkJoinPool forkJoinPool = a();
/*     */     try {
/*     */       if (paramLong2 - paramLong1 >= 8192L) {
/*     */         try {
/*     */           if (forkJoinPool.getParallelism() == 1) {
/*     */             g(paramArrayOflong, paramLong1, paramLong2);
/*     */             return;
/*     */           } 
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw a(null);
/*     */         } 
/*     */         forkJoinPool.invoke(new dr(paramArrayOflong, paramLong1, paramLong2));
/*     */         return;
/*     */       } 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     g(paramArrayOflong, paramLong1, paramLong2);
/*     */   }
/*     */   
/*     */   private static long c(long[][] paramArrayOflong, long paramLong1, long paramLong2, long paramLong3) {
/*     */     int i = Long.compare(k.a(paramArrayOflong, paramLong1), k.a(paramArrayOflong, paramLong2));
/*     */     int j = Long.compare(k.a(paramArrayOflong, paramLong1), k.a(paramArrayOflong, paramLong3));
/*     */     int k = Long.compare(k.a(paramArrayOflong, paramLong2), k.a(paramArrayOflong, paramLong3));
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
/*     */     return (k > 0) ? paramLong2 : ((j > 0) ? paramLong3 : paramLong1);
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public static void f(long[][] paramArrayOflong, long paramLong1, long paramLong2) {
/*     */     paramArrayOflong[k.b(paramLong1)][k.a(paramLong1)] = paramLong2;
/*     */   }
/*     */   
/*     */   public static long[][] a(long[][] paramArrayOflong, Random paramRandom) {
/*     */     return k.a(paramArrayOflong, paramRandom);
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public static void b(long[][] paramArrayOflong, long paramLong1, long paramLong2, long paramLong3) {
/*     */     k.a(paramArrayOflong, paramLong1, paramLong2, paramLong3);
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public static String a(long[][] paramArrayOflong) {
/*     */     return k.a(paramArrayOflong);
/*     */   }
/*     */   
/*     */   public static void b(long[][] paramArrayOflong, hq paramhq) {
/*     */     a(paramArrayOflong, 0L, k.a(paramArrayOflong), paramhq);
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public static void h(long[][] paramArrayOflong, long paramLong1, long paramLong2) {
/*     */     long l = paramArrayOflong[k.b(paramLong1)][k.a(paramLong1)];
/*     */     paramArrayOflong[k.b(paramLong1)][k.a(paramLong1)] = paramArrayOflong[k.b(paramLong2)][k.a(paramLong2)];
/*     */     paramArrayOflong[k.b(paramLong2)][k.a(paramLong2)] = l;
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public static long[][] d(long[][] paramArrayOflong, long paramLong) {
/*     */     long l = a(paramArrayOflong);
/*     */     try {
/*     */     
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     return (paramLong > l) ? b(paramArrayOflong, paramLong, l) : paramArrayOflong;
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public static long[][] d(long[][] paramArrayOflong, long paramLong1, long paramLong2) {
/*     */     try {
/*     */     
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     return (paramLong1 > a(paramArrayOflong)) ? c(paramArrayOflong, paramLong1, paramLong2) : paramArrayOflong;
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public static long[][] c(long[][] paramArrayOflong, long paramLong) {
/*     */     return k.c(paramArrayOflong, paramLong);
/*     */   }
/*     */   
/*     */   public static void a(long[][] paramArrayOflong1, long[][] paramArrayOflong2, long paramLong1, long paramLong2) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/l0.m : J
/*     */     //   3: ldc2_w 20456568077008
/*     */     //   6: lxor
/*     */     //   7: lstore #6
/*     */     //   9: iconst_2
/*     */     //   10: istore #8
/*     */     //   12: aload_0
/*     */     //   13: invokestatic a : ([[J)J
/*     */     //   16: aload_1
/*     */     //   17: invokestatic a : ([[J)J
/*     */     //   20: lcmp
/*     */     //   21: ifeq -> 69
/*     */     //   24: new java/lang/IllegalArgumentException
/*     */     //   27: dup
/*     */     //   28: ldc_w '剬ۗᝫ㹃犩鄗ڃ뮢퀧퓌梎䳗ꕑﴼ퇌粳㻋㮕ᶨ'
/*     */     //   31: invokevirtual toCharArray : ()[C
/*     */     //   34: dup
/*     */     //   35: dup
/*     */     //   36: bipush #7
/*     */     //   38: dup_x1
/*     */     //   39: caload
/*     */     //   40: sipush #18283
/*     */     //   43: ixor
/*     */     //   44: i2c
/*     */     //   45: castore
/*     */     //   46: sipush #28328
/*     */     //   49: iconst_1
/*     */     //   50: iconst_3
/*     */     //   51: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   54: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   57: athrow
/*     */     //   58: ldc2_w 2835840859498786848
/*     */     //   61: lload #6
/*     */     //   63: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   68: athrow
/*     */     //   69: bipush #15
/*     */     //   71: istore #9
/*     */     //   73: sipush #3826
/*     */     //   76: istore #10
/*     */     //   78: sipush #3826
/*     */     //   81: newarray long
/*     */     //   83: astore #11
/*     */     //   85: iconst_0
/*     */     //   86: istore #12
/*     */     //   88: sipush #3826
/*     */     //   91: newarray long
/*     */     //   93: astore #13
/*     */     //   95: iconst_0
/*     */     //   96: istore #14
/*     */     //   98: sipush #3826
/*     */     //   101: newarray int
/*     */     //   103: astore #15
/*     */     //   105: iconst_0
/*     */     //   106: istore #16
/*     */     //   108: aload #11
/*     */     //   110: iload #12
/*     */     //   112: iinc #12, 1
/*     */     //   115: lload_2
/*     */     //   116: lastore
/*     */     //   117: aload #13
/*     */     //   119: iload #14
/*     */     //   121: iinc #14, 1
/*     */     //   124: lload #4
/*     */     //   126: lload_2
/*     */     //   127: lsub
/*     */     //   128: lastore
/*     */     //   129: aload #15
/*     */     //   131: iload #16
/*     */     //   133: iinc #16, 1
/*     */     //   136: iconst_0
/*     */     //   137: iastore
/*     */     //   138: sipush #256
/*     */     //   141: newarray long
/*     */     //   143: astore #17
/*     */     //   145: sipush #256
/*     */     //   148: newarray long
/*     */     //   150: astore #18
/*     */     //   152: lload #4
/*     */     //   154: lload_2
/*     */     //   155: lsub
/*     */     //   156: invokestatic a : (J)[[B
/*     */     //   159: astore #19
/*     */     //   161: iload #12
/*     */     //   163: ifle -> 765
/*     */     //   166: aload #11
/*     */     //   168: iinc #12, -1
/*     */     //   171: iload #12
/*     */     //   173: laload
/*     */     //   174: lstore #20
/*     */     //   176: aload #13
/*     */     //   178: iinc #14, -1
/*     */     //   181: iload #14
/*     */     //   183: laload
/*     */     //   184: lstore #22
/*     */     //   186: aload #15
/*     */     //   188: iinc #16, -1
/*     */     //   191: iload #16
/*     */     //   193: iaload
/*     */     //   194: istore #24
/*     */     //   196: iload #24
/*     */     //   198: bipush #8
/*     */     //   200: irem
/*     */     //   201: ifne -> 221
/*     */     //   204: sipush #128
/*     */     //   207: goto -> 222
/*     */     //   210: ldc2_w 2835840859498786848
/*     */     //   213: lload #6
/*     */     //   215: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   220: athrow
/*     */     //   221: iconst_0
/*     */     //   222: istore #25
/*     */     //   224: lload #22
/*     */     //   226: ldc2_w 40
/*     */     //   229: lcmp
/*     */     //   230: ifge -> 259
/*     */     //   233: aload_0
/*     */     //   234: aload_1
/*     */     //   235: lload #20
/*     */     //   237: lload #20
/*     */     //   239: lload #22
/*     */     //   241: ladd
/*     */     //   242: invokestatic b : ([[J[[JJJ)V
/*     */     //   245: goto -> 161
/*     */     //   248: ldc2_w 2835840859498786848
/*     */     //   251: lload #6
/*     */     //   253: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   258: athrow
/*     */     //   259: iload #24
/*     */     //   261: bipush #8
/*     */     //   263: if_icmpge -> 281
/*     */     //   266: aload_0
/*     */     //   267: goto -> 282
/*     */     //   270: ldc2_w 2835840859498786848
/*     */     //   273: lload #6
/*     */     //   275: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   280: athrow
/*     */     //   281: aload_1
/*     */     //   282: astore #26
/*     */     //   284: bipush #7
/*     */     //   286: iload #24
/*     */     //   288: bipush #8
/*     */     //   290: irem
/*     */     //   291: isub
/*     */     //   292: bipush #8
/*     */     //   294: imul
/*     */     //   295: istore #27
/*     */     //   297: lload #22
/*     */     //   299: lstore #28
/*     */     //   301: lload #28
/*     */     //   303: dup2
/*     */     //   304: lconst_1
/*     */     //   305: lsub
/*     */     //   306: lstore #28
/*     */     //   308: lconst_0
/*     */     //   309: lcmp
/*     */     //   310: ifeq -> 357
/*     */     //   313: aload #19
/*     */     //   315: lload #28
/*     */     //   317: aload #26
/*     */     //   319: lload #20
/*     */     //   321: lload #28
/*     */     //   323: ladd
/*     */     //   324: invokestatic a : ([[JJ)J
/*     */     //   327: iload #27
/*     */     //   329: lushr
/*     */     //   330: ldc2_w 255
/*     */     //   333: land
/*     */     //   334: iload #25
/*     */     //   336: i2l
/*     */     //   337: lxor
/*     */     //   338: l2i
/*     */     //   339: i2b
/*     */     //   340: invokestatic b : ([[BJB)V
/*     */     //   343: goto -> 301
/*     */     //   346: ldc2_w 2835840859498786848
/*     */     //   349: lload #6
/*     */     //   351: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   356: athrow
/*     */     //   357: lload #22
/*     */     //   359: lstore #28
/*     */     //   361: lload #28
/*     */     //   363: dup2
/*     */     //   364: lconst_1
/*     */     //   365: lsub
/*     */     //   366: lstore #28
/*     */     //   368: lconst_0
/*     */     //   369: lcmp
/*     */     //   370: ifeq -> 405
/*     */     //   373: aload #17
/*     */     //   375: aload #19
/*     */     //   377: lload #28
/*     */     //   379: invokestatic a : ([[BJ)B
/*     */     //   382: sipush #255
/*     */     //   385: iand
/*     */     //   386: dup2
/*     */     //   387: laload
/*     */     //   388: lconst_1
/*     */     //   389: ladd
/*     */     //   390: lastore
/*     */     //   391: goto -> 361
/*     */     //   394: ldc2_w 2835840859498786848
/*     */     //   397: lload #6
/*     */     //   399: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   404: athrow
/*     */     //   405: iconst_m1
/*     */     //   406: istore #28
/*     */     //   408: lconst_0
/*     */     //   409: lstore #29
/*     */     //   411: iconst_0
/*     */     //   412: istore #31
/*     */     //   414: iload #31
/*     */     //   416: sipush #256
/*     */     //   419: if_icmpge -> 555
/*     */     //   422: aload #17
/*     */     //   424: iload #31
/*     */     //   426: laload
/*     */     //   427: lconst_0
/*     */     //   428: lcmp
/*     */     //   429: ifeq -> 533
/*     */     //   432: goto -> 446
/*     */     //   435: ldc2_w 2835840859498786848
/*     */     //   438: lload #6
/*     */     //   440: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   445: athrow
/*     */     //   446: iload #31
/*     */     //   448: istore #28
/*     */     //   450: iload #24
/*     */     //   452: bipush #15
/*     */     //   454: if_icmpge -> 533
/*     */     //   457: aload #17
/*     */     //   459: iload #31
/*     */     //   461: laload
/*     */     //   462: lconst_1
/*     */     //   463: lcmp
/*     */     //   464: ifle -> 533
/*     */     //   467: goto -> 481
/*     */     //   470: ldc2_w 2835840859498786848
/*     */     //   473: lload #6
/*     */     //   475: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   480: athrow
/*     */     //   481: aload #11
/*     */     //   483: iload #12
/*     */     //   485: iinc #12, 1
/*     */     //   488: lload #29
/*     */     //   490: lload #20
/*     */     //   492: ladd
/*     */     //   493: lastore
/*     */     //   494: aload #13
/*     */     //   496: iload #14
/*     */     //   498: iinc #14, 1
/*     */     //   501: aload #17
/*     */     //   503: iload #31
/*     */     //   505: laload
/*     */     //   506: lastore
/*     */     //   507: aload #15
/*     */     //   509: iload #16
/*     */     //   511: iinc #16, 1
/*     */     //   514: iload #24
/*     */     //   516: iconst_1
/*     */     //   517: iadd
/*     */     //   518: iastore
/*     */     //   519: goto -> 533
/*     */     //   522: ldc2_w 2835840859498786848
/*     */     //   525: lload #6
/*     */     //   527: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   532: athrow
/*     */     //   533: aload #18
/*     */     //   535: iload #31
/*     */     //   537: lload #29
/*     */     //   539: aload #17
/*     */     //   541: iload #31
/*     */     //   543: laload
/*     */     //   544: ladd
/*     */     //   545: dup2
/*     */     //   546: lstore #29
/*     */     //   548: lastore
/*     */     //   549: iinc #31, 1
/*     */     //   552: goto -> 414
/*     */     //   555: lload #22
/*     */     //   557: aload #17
/*     */     //   559: iload #28
/*     */     //   561: laload
/*     */     //   562: lsub
/*     */     //   563: lstore #31
/*     */     //   565: aload #17
/*     */     //   567: iload #28
/*     */     //   569: lconst_0
/*     */     //   570: lastore
/*     */     //   571: iconst_m1
/*     */     //   572: istore #33
/*     */     //   574: lconst_0
/*     */     //   575: lstore #34
/*     */     //   577: lload #34
/*     */     //   579: lload #31
/*     */     //   581: lcmp
/*     */     //   582: ifge -> 762
/*     */     //   585: aload_0
/*     */     //   586: lload #34
/*     */     //   588: lload #20
/*     */     //   590: ladd
/*     */     //   591: invokestatic a : ([[JJ)J
/*     */     //   594: lstore #38
/*     */     //   596: aload_1
/*     */     //   597: lload #34
/*     */     //   599: lload #20
/*     */     //   601: ladd
/*     */     //   602: invokestatic a : ([[JJ)J
/*     */     //   605: lstore #40
/*     */     //   607: aload #19
/*     */     //   609: lload #34
/*     */     //   611: invokestatic a : ([[BJ)B
/*     */     //   614: sipush #255
/*     */     //   617: iand
/*     */     //   618: istore #33
/*     */     //   620: aload #18
/*     */     //   622: iload #33
/*     */     //   624: dup2
/*     */     //   625: laload
/*     */     //   626: lconst_1
/*     */     //   627: lsub
/*     */     //   628: dup2_x2
/*     */     //   629: lastore
/*     */     //   630: dup2
/*     */     //   631: lstore #36
/*     */     //   633: lload #34
/*     */     //   635: lcmp
/*     */     //   636: ifle -> 721
/*     */     //   639: lload #38
/*     */     //   641: lstore #42
/*     */     //   643: iload #33
/*     */     //   645: istore #44
/*     */     //   647: aload_0
/*     */     //   648: lload #36
/*     */     //   650: lload #20
/*     */     //   652: ladd
/*     */     //   653: invokestatic a : ([[JJ)J
/*     */     //   656: lstore #38
/*     */     //   658: aload_0
/*     */     //   659: lload #36
/*     */     //   661: lload #20
/*     */     //   663: ladd
/*     */     //   664: lload #42
/*     */     //   666: invokestatic d : ([[JJJ)V
/*     */     //   669: lload #40
/*     */     //   671: lstore #42
/*     */     //   673: aload_1
/*     */     //   674: lload #36
/*     */     //   676: lload #20
/*     */     //   678: ladd
/*     */     //   679: invokestatic a : ([[JJ)J
/*     */     //   682: lstore #40
/*     */     //   684: aload_1
/*     */     //   685: lload #36
/*     */     //   687: lload #20
/*     */     //   689: ladd
/*     */     //   690: lload #42
/*     */     //   692: invokestatic d : ([[JJJ)V
/*     */     //   695: aload #19
/*     */     //   697: lload #36
/*     */     //   699: invokestatic a : ([[BJ)B
/*     */     //   702: sipush #255
/*     */     //   705: iand
/*     */     //   706: istore #33
/*     */     //   708: aload #19
/*     */     //   710: lload #36
/*     */     //   712: iload #44
/*     */     //   714: i2b
/*     */     //   715: invokestatic b : ([[BJB)V
/*     */     //   718: goto -> 620
/*     */     //   721: aload_0
/*     */     //   722: lload #34
/*     */     //   724: lload #20
/*     */     //   726: ladd
/*     */     //   727: lload #38
/*     */     //   729: invokestatic d : ([[JJJ)V
/*     */     //   732: aload_1
/*     */     //   733: lload #34
/*     */     //   735: lload #20
/*     */     //   737: ladd
/*     */     //   738: lload #40
/*     */     //   740: invokestatic d : ([[JJJ)V
/*     */     //   743: lload #34
/*     */     //   745: aload #17
/*     */     //   747: iload #33
/*     */     //   749: laload
/*     */     //   750: ladd
/*     */     //   751: lstore #34
/*     */     //   753: aload #17
/*     */     //   755: iload #33
/*     */     //   757: lconst_0
/*     */     //   758: lastore
/*     */     //   759: goto -> 577
/*     */     //   762: goto -> 161
/*     */     //   765: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #275	-> 9
/*     */     //   #132	-> 12
/*     */     //   #19	-> 69
/*     */     //   #197	-> 73
/*     */     //   #379	-> 78
/*     */     //   #89	-> 85
/*     */     //   #139	-> 88
/*     */     //   #284	-> 95
/*     */     //   #188	-> 98
/*     */     //   #229	-> 105
/*     */     //   #343	-> 108
/*     */     //   #113	-> 117
/*     */     //   #84	-> 129
/*     */     //   #3	-> 138
/*     */     //   #133	-> 145
/*     */     //   #271	-> 152
/*     */     //   #215	-> 161
/*     */     //   #244	-> 166
/*     */     //   #53	-> 176
/*     */     //   #91	-> 186
/*     */     //   #190	-> 196
/*     */     //   #292	-> 224
/*     */     //   #212	-> 233
/*     */     //   #135	-> 245
/*     */     //   #337	-> 259
/*     */     //   #321	-> 284
/*     */     //   #143	-> 297
/*     */     //   #28	-> 357
/*     */     //   #205	-> 405
/*     */     //   #57	-> 408
/*     */     //   #252	-> 411
/*     */     //   #314	-> 422
/*     */     //   #427	-> 446
/*     */     //   #11	-> 450
/*     */     //   #255	-> 481
/*     */     //   #195	-> 494
/*     */     //   #174	-> 507
/*     */     //   #56	-> 533
/*     */     //   #324	-> 549
/*     */     //   #65	-> 555
/*     */     //   #136	-> 565
/*     */     //   #355	-> 571
/*     */     //   #81	-> 574
/*     */     //   #224	-> 585
/*     */     //   #236	-> 596
/*     */     //   #108	-> 607
/*     */     //   #404	-> 620
/*     */     //   #265	-> 639
/*     */     //   #176	-> 643
/*     */     //   #67	-> 647
/*     */     //   #231	-> 658
/*     */     //   #175	-> 669
/*     */     //   #223	-> 673
/*     */     //   #110	-> 684
/*     */     //   #384	-> 695
/*     */     //   #235	-> 708
/*     */     //   #335	-> 718
/*     */     //   #303	-> 721
/*     */     //   #359	-> 732
/*     */     //   #246	-> 743
/*     */     //   #369	-> 762
/*     */     //   #351	-> 765
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   12	58	58	java/lang/IllegalArgumentException
/*     */     //   196	210	210	java/lang/IllegalArgumentException
/*     */     //   224	248	248	java/lang/IllegalArgumentException
/*     */     //   259	270	270	java/lang/IllegalArgumentException
/*     */     //   308	346	346	java/lang/IllegalArgumentException
/*     */     //   368	394	394	java/lang/IllegalArgumentException
/*     */     //   414	432	435	java/lang/IllegalArgumentException
/*     */     //   450	467	470	java/lang/IllegalArgumentException
/*     */     //   457	519	522	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public static void a(long[][] paramArrayOflong, long paramLong, long[] paramArrayOflong1, int paramInt1, int paramInt2) {
/*     */     k.a(paramArrayOflong, paramLong, paramArrayOflong1, paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public static long a(long[][] paramArrayOflong, long paramLong, hq paramhq) {
/*     */     return c(paramArrayOflong, 0L, k.a(paramArrayOflong), paramLong, paramhq);
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public static void c(long[][] paramArrayOflong, long paramLong) {
/*     */     paramArrayOflong[k.b(paramLong)][k.a(paramLong)] = paramArrayOflong[k.b(paramLong)][k.a(paramLong)] - 1L;
/*     */   }
/*     */   
/*     */   public static void a(long[][] paramArrayOflong1, long[][] paramArrayOflong2, long[][] paramArrayOflong3, long paramLong1, long paramLong2, boolean paramBoolean) {
/*     */     // Byte code:
/*     */     //   0: lload #5
/*     */     //   2: lload_3
/*     */     //   3: lsub
/*     */     //   4: ldc2_w 1024
/*     */     //   7: lcmp
/*     */     //   8: ifge -> 25
/*     */     //   11: aload_0
/*     */     //   12: aload_1
/*     */     //   13: aload_2
/*     */     //   14: lload_3
/*     */     //   15: lload #5
/*     */     //   17: invokestatic a : ([[J[[J[[JJJ)V
/*     */     //   20: return
/*     */     //   21: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   24: athrow
/*     */     //   25: iconst_2
/*     */     //   26: istore #8
/*     */     //   28: bipush #15
/*     */     //   30: istore #9
/*     */     //   32: sipush #3826
/*     */     //   35: istore #10
/*     */     //   37: iconst_0
/*     */     //   38: istore #11
/*     */     //   40: sipush #3826
/*     */     //   43: newarray long
/*     */     //   45: astore #12
/*     */     //   47: sipush #3826
/*     */     //   50: newarray long
/*     */     //   52: astore #13
/*     */     //   54: sipush #3826
/*     */     //   57: newarray int
/*     */     //   59: astore #14
/*     */     //   61: aload #12
/*     */     //   63: iload #11
/*     */     //   65: lload_3
/*     */     //   66: lastore
/*     */     //   67: aload #13
/*     */     //   69: iload #11
/*     */     //   71: lload #5
/*     */     //   73: lload_3
/*     */     //   74: lsub
/*     */     //   75: lastore
/*     */     //   76: aload #14
/*     */     //   78: iload #11
/*     */     //   80: iinc #11, 1
/*     */     //   83: iconst_0
/*     */     //   84: iastore
/*     */     //   85: sipush #256
/*     */     //   88: newarray long
/*     */     //   90: astore #15
/*     */     //   92: sipush #256
/*     */     //   95: newarray long
/*     */     //   97: astore #16
/*     */     //   99: iload #7
/*     */     //   101: ifeq -> 118
/*     */     //   104: aload_0
/*     */     //   105: invokestatic a : ([[J)J
/*     */     //   108: invokestatic a : (J)[[J
/*     */     //   111: goto -> 119
/*     */     //   114: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   117: athrow
/*     */     //   118: aconst_null
/*     */     //   119: astore #17
/*     */     //   121: iload #11
/*     */     //   123: ifle -> 813
/*     */     //   126: aload #12
/*     */     //   128: iinc #11, -1
/*     */     //   131: iload #11
/*     */     //   133: laload
/*     */     //   134: lstore #18
/*     */     //   136: aload #13
/*     */     //   138: iload #11
/*     */     //   140: laload
/*     */     //   141: lstore #20
/*     */     //   143: aload #14
/*     */     //   145: iload #11
/*     */     //   147: iaload
/*     */     //   148: istore #22
/*     */     //   150: iload #22
/*     */     //   152: bipush #8
/*     */     //   154: irem
/*     */     //   155: ifne -> 168
/*     */     //   158: sipush #128
/*     */     //   161: goto -> 169
/*     */     //   164: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   167: athrow
/*     */     //   168: iconst_0
/*     */     //   169: istore #23
/*     */     //   171: iload #22
/*     */     //   173: bipush #8
/*     */     //   175: if_icmpge -> 186
/*     */     //   178: aload_1
/*     */     //   179: goto -> 187
/*     */     //   182: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   185: athrow
/*     */     //   186: aload_2
/*     */     //   187: astore #24
/*     */     //   189: bipush #7
/*     */     //   191: iload #22
/*     */     //   193: bipush #8
/*     */     //   195: irem
/*     */     //   196: isub
/*     */     //   197: bipush #8
/*     */     //   199: imul
/*     */     //   200: istore #25
/*     */     //   202: lload #18
/*     */     //   204: lload #20
/*     */     //   206: ladd
/*     */     //   207: lstore #26
/*     */     //   209: lload #26
/*     */     //   211: dup2
/*     */     //   212: lconst_1
/*     */     //   213: lsub
/*     */     //   214: lstore #26
/*     */     //   216: lload #18
/*     */     //   218: lcmp
/*     */     //   219: ifeq -> 259
/*     */     //   222: aload #15
/*     */     //   224: aload #24
/*     */     //   226: aload_0
/*     */     //   227: lload #26
/*     */     //   229: invokestatic a : ([[JJ)J
/*     */     //   232: invokestatic a : ([[JJ)J
/*     */     //   235: iload #25
/*     */     //   237: lushr
/*     */     //   238: ldc2_w 255
/*     */     //   241: land
/*     */     //   242: iload #23
/*     */     //   244: i2l
/*     */     //   245: lxor
/*     */     //   246: l2i
/*     */     //   247: dup2
/*     */     //   248: laload
/*     */     //   249: lconst_1
/*     */     //   250: ladd
/*     */     //   251: lastore
/*     */     //   252: goto -> 209
/*     */     //   255: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   258: athrow
/*     */     //   259: iconst_m1
/*     */     //   260: istore #26
/*     */     //   262: iload #7
/*     */     //   264: ifeq -> 275
/*     */     //   267: lconst_0
/*     */     //   268: goto -> 277
/*     */     //   271: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   274: athrow
/*     */     //   275: lload #18
/*     */     //   277: lstore #27
/*     */     //   279: iconst_0
/*     */     //   280: istore #29
/*     */     //   282: iload #29
/*     */     //   284: sipush #256
/*     */     //   287: if_icmpge -> 333
/*     */     //   290: aload #15
/*     */     //   292: iload #29
/*     */     //   294: laload
/*     */     //   295: lconst_0
/*     */     //   296: lcmp
/*     */     //   297: ifeq -> 311
/*     */     //   300: goto -> 307
/*     */     //   303: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   306: athrow
/*     */     //   307: iload #29
/*     */     //   309: istore #26
/*     */     //   311: aload #16
/*     */     //   313: iload #29
/*     */     //   315: lload #27
/*     */     //   317: aload #15
/*     */     //   319: iload #29
/*     */     //   321: laload
/*     */     //   322: ladd
/*     */     //   323: dup2
/*     */     //   324: lstore #27
/*     */     //   326: lastore
/*     */     //   327: iinc #29, 1
/*     */     //   330: goto -> 282
/*     */     //   333: iload #7
/*     */     //   335: ifeq -> 560
/*     */     //   338: lload #18
/*     */     //   340: lload #20
/*     */     //   342: ladd
/*     */     //   343: lstore #29
/*     */     //   345: lload #29
/*     */     //   347: dup2
/*     */     //   348: lconst_1
/*     */     //   349: lsub
/*     */     //   350: lstore #29
/*     */     //   352: lload #18
/*     */     //   354: lcmp
/*     */     //   355: ifeq -> 407
/*     */     //   358: aload #17
/*     */     //   360: aload #16
/*     */     //   362: aload #24
/*     */     //   364: aload_0
/*     */     //   365: lload #29
/*     */     //   367: invokestatic a : ([[JJ)J
/*     */     //   370: invokestatic a : ([[JJ)J
/*     */     //   373: iload #25
/*     */     //   375: lushr
/*     */     //   376: ldc2_w 255
/*     */     //   379: land
/*     */     //   380: iload #23
/*     */     //   382: i2l
/*     */     //   383: lxor
/*     */     //   384: l2i
/*     */     //   385: dup2
/*     */     //   386: laload
/*     */     //   387: lconst_1
/*     */     //   388: lsub
/*     */     //   389: dup2_x2
/*     */     //   390: lastore
/*     */     //   391: aload_0
/*     */     //   392: lload #29
/*     */     //   394: invokestatic a : ([[JJ)J
/*     */     //   397: invokestatic d : ([[JJJ)V
/*     */     //   400: goto -> 345
/*     */     //   403: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   406: athrow
/*     */     //   407: aload #17
/*     */     //   409: lconst_0
/*     */     //   410: aload_0
/*     */     //   411: lload #18
/*     */     //   413: lload #20
/*     */     //   415: invokestatic a : ([[JJ[[JJJ)V
/*     */     //   418: lload #18
/*     */     //   420: lstore #27
/*     */     //   422: iconst_0
/*     */     //   423: istore #29
/*     */     //   425: iload #29
/*     */     //   427: sipush #256
/*     */     //   430: if_icmpge -> 551
/*     */     //   433: iload #22
/*     */     //   435: bipush #15
/*     */     //   437: if_icmpge -> 535
/*     */     //   440: goto -> 447
/*     */     //   443: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   446: athrow
/*     */     //   447: aload #15
/*     */     //   449: iload #29
/*     */     //   451: laload
/*     */     //   452: lconst_1
/*     */     //   453: lcmp
/*     */     //   454: ifle -> 535
/*     */     //   457: goto -> 464
/*     */     //   460: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   463: athrow
/*     */     //   464: aload #15
/*     */     //   466: iload #29
/*     */     //   468: laload
/*     */     //   469: ldc2_w 1024
/*     */     //   472: lcmp
/*     */     //   473: ifge -> 506
/*     */     //   476: goto -> 483
/*     */     //   479: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   482: athrow
/*     */     //   483: aload_0
/*     */     //   484: aload_1
/*     */     //   485: aload_2
/*     */     //   486: lload #27
/*     */     //   488: lload #27
/*     */     //   490: aload #15
/*     */     //   492: iload #29
/*     */     //   494: laload
/*     */     //   495: ladd
/*     */     //   496: invokestatic a : ([[J[[J[[JJJ)V
/*     */     //   499: goto -> 535
/*     */     //   502: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   505: athrow
/*     */     //   506: aload #12
/*     */     //   508: iload #11
/*     */     //   510: lload #27
/*     */     //   512: lastore
/*     */     //   513: aload #13
/*     */     //   515: iload #11
/*     */     //   517: aload #15
/*     */     //   519: iload #29
/*     */     //   521: laload
/*     */     //   522: lastore
/*     */     //   523: aload #14
/*     */     //   525: iload #11
/*     */     //   527: iinc #11, 1
/*     */     //   530: iload #22
/*     */     //   532: iconst_1
/*     */     //   533: iadd
/*     */     //   534: iastore
/*     */     //   535: lload #27
/*     */     //   537: aload #15
/*     */     //   539: iload #29
/*     */     //   541: laload
/*     */     //   542: ladd
/*     */     //   543: lstore #27
/*     */     //   545: iinc #29, 1
/*     */     //   548: goto -> 425
/*     */     //   551: aload #15
/*     */     //   553: lconst_0
/*     */     //   554: invokestatic fill : ([JJ)V
/*     */     //   557: goto -> 810
/*     */     //   560: lload #18
/*     */     //   562: lload #20
/*     */     //   564: ladd
/*     */     //   565: aload #15
/*     */     //   567: iload #26
/*     */     //   569: laload
/*     */     //   570: lsub
/*     */     //   571: lstore #29
/*     */     //   573: iconst_m1
/*     */     //   574: istore #31
/*     */     //   576: lload #18
/*     */     //   578: lstore #32
/*     */     //   580: lload #32
/*     */     //   582: lload #29
/*     */     //   584: lcmp
/*     */     //   585: ifgt -> 810
/*     */     //   588: aload_0
/*     */     //   589: lload #32
/*     */     //   591: invokestatic a : ([[JJ)J
/*     */     //   594: lstore #36
/*     */     //   596: aload #24
/*     */     //   598: lload #36
/*     */     //   600: invokestatic a : ([[JJ)J
/*     */     //   603: iload #25
/*     */     //   605: lushr
/*     */     //   606: ldc2_w 255
/*     */     //   609: land
/*     */     //   610: iload #23
/*     */     //   612: i2l
/*     */     //   613: lxor
/*     */     //   614: l2i
/*     */     //   615: istore #31
/*     */     //   617: lload #32
/*     */     //   619: lload #29
/*     */     //   621: lcmp
/*     */     //   622: ifge -> 696
/*     */     //   625: aload #16
/*     */     //   627: iload #31
/*     */     //   629: dup2
/*     */     //   630: laload
/*     */     //   631: lconst_1
/*     */     //   632: lsub
/*     */     //   633: dup2_x2
/*     */     //   634: lastore
/*     */     //   635: dup2
/*     */     //   636: lstore #34
/*     */     //   638: lload #32
/*     */     //   640: lcmp
/*     */     //   641: ifle -> 688
/*     */     //   644: lload #36
/*     */     //   646: lstore #38
/*     */     //   648: aload_0
/*     */     //   649: lload #34
/*     */     //   651: invokestatic a : ([[JJ)J
/*     */     //   654: lstore #36
/*     */     //   656: aload_0
/*     */     //   657: lload #34
/*     */     //   659: lload #38
/*     */     //   661: invokestatic d : ([[JJJ)V
/*     */     //   664: aload #24
/*     */     //   666: lload #36
/*     */     //   668: invokestatic a : ([[JJ)J
/*     */     //   671: iload #25
/*     */     //   673: lushr
/*     */     //   674: ldc2_w 255
/*     */     //   677: land
/*     */     //   678: iload #23
/*     */     //   680: i2l
/*     */     //   681: lxor
/*     */     //   682: l2i
/*     */     //   683: istore #31
/*     */     //   685: goto -> 625
/*     */     //   688: aload_0
/*     */     //   689: lload #32
/*     */     //   691: lload #36
/*     */     //   693: invokestatic d : ([[JJJ)V
/*     */     //   696: iload #22
/*     */     //   698: bipush #15
/*     */     //   700: if_icmpge -> 791
/*     */     //   703: aload #15
/*     */     //   705: iload #31
/*     */     //   707: laload
/*     */     //   708: lconst_1
/*     */     //   709: lcmp
/*     */     //   710: ifle -> 791
/*     */     //   713: goto -> 720
/*     */     //   716: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   719: athrow
/*     */     //   720: aload #15
/*     */     //   722: iload #31
/*     */     //   724: laload
/*     */     //   725: ldc2_w 1024
/*     */     //   728: lcmp
/*     */     //   729: ifge -> 762
/*     */     //   732: goto -> 739
/*     */     //   735: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   738: athrow
/*     */     //   739: aload_0
/*     */     //   740: aload_1
/*     */     //   741: aload_2
/*     */     //   742: lload #32
/*     */     //   744: lload #32
/*     */     //   746: aload #15
/*     */     //   748: iload #31
/*     */     //   750: laload
/*     */     //   751: ladd
/*     */     //   752: invokestatic a : ([[J[[J[[JJJ)V
/*     */     //   755: goto -> 791
/*     */     //   758: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   761: athrow
/*     */     //   762: aload #12
/*     */     //   764: iload #11
/*     */     //   766: lload #32
/*     */     //   768: lastore
/*     */     //   769: aload #13
/*     */     //   771: iload #11
/*     */     //   773: aload #15
/*     */     //   775: iload #31
/*     */     //   777: laload
/*     */     //   778: lastore
/*     */     //   779: aload #14
/*     */     //   781: iload #11
/*     */     //   783: iinc #11, 1
/*     */     //   786: iload #22
/*     */     //   788: iconst_1
/*     */     //   789: iadd
/*     */     //   790: iastore
/*     */     //   791: lload #32
/*     */     //   793: aload #15
/*     */     //   795: iload #31
/*     */     //   797: laload
/*     */     //   798: ladd
/*     */     //   799: lstore #32
/*     */     //   801: aload #15
/*     */     //   803: iload #31
/*     */     //   805: lconst_0
/*     */     //   806: lastore
/*     */     //   807: goto -> 580
/*     */     //   810: goto -> 121
/*     */     //   813: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #293	-> 0
/*     */     //   #103	-> 11
/*     */     //   #203	-> 20
/*     */     //   #375	-> 25
/*     */     //   #416	-> 28
/*     */     //   #220	-> 32
/*     */     //   #388	-> 37
/*     */     //   #74	-> 40
/*     */     //   #424	-> 47
/*     */     //   #417	-> 54
/*     */     //   #368	-> 61
/*     */     //   #104	-> 67
/*     */     //   #386	-> 76
/*     */     //   #302	-> 85
/*     */     //   #283	-> 92
/*     */     //   #38	-> 99
/*     */     //   #245	-> 121
/*     */     //   #7	-> 126
/*     */     //   #167	-> 136
/*     */     //   #301	-> 143
/*     */     //   #185	-> 150
/*     */     //   #130	-> 171
/*     */     //   #18	-> 189
/*     */     //   #150	-> 202
/*     */     //   #363	-> 259
/*     */     //   #418	-> 262
/*     */     //   #52	-> 279
/*     */     //   #316	-> 290
/*     */     //   #409	-> 311
/*     */     //   #228	-> 327
/*     */     //   #55	-> 333
/*     */     //   #358	-> 338
/*     */     //   #171	-> 407
/*     */     //   #87	-> 418
/*     */     //   #326	-> 422
/*     */     //   #155	-> 433
/*     */     //   #274	-> 464
/*     */     //   #41	-> 506
/*     */     //   #328	-> 513
/*     */     //   #145	-> 523
/*     */     //   #94	-> 535
/*     */     //   #187	-> 545
/*     */     //   #381	-> 551
/*     */     //   #138	-> 560
/*     */     //   #98	-> 573
/*     */     //   #295	-> 576
/*     */     //   #154	-> 588
/*     */     //   #226	-> 596
/*     */     //   #31	-> 617
/*     */     //   #141	-> 625
/*     */     //   #61	-> 644
/*     */     //   #419	-> 648
/*     */     //   #258	-> 656
/*     */     //   #230	-> 664
/*     */     //   #263	-> 685
/*     */     //   #285	-> 688
/*     */     //   #43	-> 696
/*     */     //   #166	-> 720
/*     */     //   #147	-> 762
/*     */     //   #15	-> 769
/*     */     //   #69	-> 779
/*     */     //   #102	-> 791
/*     */     //   #210	-> 810
/*     */     //   #242	-> 813
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	21	21	java/lang/IllegalArgumentException
/*     */     //   99	114	114	java/lang/IllegalArgumentException
/*     */     //   150	164	164	java/lang/IllegalArgumentException
/*     */     //   171	182	182	java/lang/IllegalArgumentException
/*     */     //   216	255	255	java/lang/IllegalArgumentException
/*     */     //   262	271	271	java/lang/IllegalArgumentException
/*     */     //   282	300	303	java/lang/IllegalArgumentException
/*     */     //   352	403	403	java/lang/IllegalArgumentException
/*     */     //   425	440	443	java/lang/IllegalArgumentException
/*     */     //   433	457	460	java/lang/IllegalArgumentException
/*     */     //   447	476	479	java/lang/IllegalArgumentException
/*     */     //   464	502	502	java/lang/IllegalArgumentException
/*     */     //   696	713	716	java/lang/IllegalArgumentException
/*     */     //   703	732	735	java/lang/IllegalArgumentException
/*     */     //   720	758	758	java/lang/IllegalArgumentException
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
/*     */   @Deprecated
/*     */   public static void e(long[][] paramArrayOflong, long paramLong1, long paramLong2) {
/*     */     paramArrayOflong[k.b(paramLong1)][k.a(paramLong1)] = paramArrayOflong[k.b(paramLong1)][k.a(paramLong1)] + paramLong2;
/*     */   }
/*     */   
/*     */   public static long[][] a(long paramLong) {
/*     */     try {
/*     */       if (paramLong == 0L)
/*     */         return k; 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     k.a(paramLong);
/*     */     int i = (int)(paramLong + 134217727L >>> 27L);
/*     */     long[][] arrayOfLong = new long[i][];
/*     */     int j = (int)(paramLong & 0x7FFFFFFL);
/*     */     if (j != 0) {
/*     */       byte b1 = 0;
/*     */       try {
/*     */         while (b1 < i - 1) {
/*     */           arrayOfLong[b1] = new long[134217728];
/*     */           b1++;
/*     */         } 
/*     */       } catch (IllegalArgumentException illegalArgumentException) {
/*     */         throw a(null);
/*     */       } 
/*     */     } 
/*     */     byte b = 0;
/*     */     try {
/*     */       while (b < i) {
/*     */         arrayOfLong[b] = new long[134217728];
/*     */         b++;
/*     */       } 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     return arrayOfLong;
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public static void b(long[][] paramArrayOflong, long paramLong) {
/*     */     int i = paramArrayOflong.length;
/*     */     try {
/*     */       for (; i-- != 0; Arrays.fill(paramArrayOflong[i], paramLong));
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public static long[][] a(long[] paramArrayOflong) {
/*     */     return k.a(paramArrayOflong);
/*     */   }
/*     */   
/*     */   public static void b(long[][] paramArrayOflong) {
/*     */     b(paramArrayOflong, 0L, k.a(paramArrayOflong));
/*     */   }
/*     */   
/*     */   public static long a(long[][] paramArrayOflong, long paramLong) {
/*     */     return b(paramArrayOflong, 0L, k.a(paramArrayOflong), paramLong);
/*     */   }
/*     */   
/*     */   public static void a(long[][] paramArrayOflong, long paramLong1, long paramLong2, hq paramhq) {
/*     */     // Byte code:
/*     */     //   0: lload_3
/*     */     //   1: lload_1
/*     */     //   2: lsub
/*     */     //   3: lstore #6
/*     */     //   5: lload #6
/*     */     //   7: ldc2_w 7
/*     */     //   10: lcmp
/*     */     //   11: ifge -> 27
/*     */     //   14: aload_0
/*     */     //   15: lload_1
/*     */     //   16: lload_3
/*     */     //   17: aload #5
/*     */     //   19: invokestatic b : ([[JJJLme/konsolas/aac/hq;)V
/*     */     //   22: return
/*     */     //   23: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   26: athrow
/*     */     //   27: lload_1
/*     */     //   28: lload #6
/*     */     //   30: ldc2_w 2
/*     */     //   33: ldiv
/*     */     //   34: ladd
/*     */     //   35: lstore #8
/*     */     //   37: lload #6
/*     */     //   39: ldc2_w 7
/*     */     //   42: lcmp
/*     */     //   43: ifle -> 153
/*     */     //   46: lload_1
/*     */     //   47: lstore #10
/*     */     //   49: lload_3
/*     */     //   50: lconst_1
/*     */     //   51: lsub
/*     */     //   52: lstore #12
/*     */     //   54: lload #6
/*     */     //   56: ldc2_w 40
/*     */     //   59: lcmp
/*     */     //   60: ifle -> 139
/*     */     //   63: lload #6
/*     */     //   65: ldc2_w 8
/*     */     //   68: ldiv
/*     */     //   69: lstore #14
/*     */     //   71: aload_0
/*     */     //   72: lload #10
/*     */     //   74: lload #10
/*     */     //   76: lload #14
/*     */     //   78: ladd
/*     */     //   79: lload #10
/*     */     //   81: ldc2_w 2
/*     */     //   84: lload #14
/*     */     //   86: lmul
/*     */     //   87: ladd
/*     */     //   88: aload #5
/*     */     //   90: invokestatic b : ([[JJJJLme/konsolas/aac/hq;)J
/*     */     //   93: lstore #10
/*     */     //   95: aload_0
/*     */     //   96: lload #8
/*     */     //   98: lload #14
/*     */     //   100: lsub
/*     */     //   101: lload #8
/*     */     //   103: lload #8
/*     */     //   105: lload #14
/*     */     //   107: ladd
/*     */     //   108: aload #5
/*     */     //   110: invokestatic b : ([[JJJJLme/konsolas/aac/hq;)J
/*     */     //   113: lstore #8
/*     */     //   115: aload_0
/*     */     //   116: lload #12
/*     */     //   118: ldc2_w 2
/*     */     //   121: lload #14
/*     */     //   123: lmul
/*     */     //   124: lsub
/*     */     //   125: lload #12
/*     */     //   127: lload #14
/*     */     //   129: lsub
/*     */     //   130: lload #12
/*     */     //   132: aload #5
/*     */     //   134: invokestatic b : ([[JJJJLme/konsolas/aac/hq;)J
/*     */     //   137: lstore #12
/*     */     //   139: aload_0
/*     */     //   140: lload #10
/*     */     //   142: lload #8
/*     */     //   144: lload #12
/*     */     //   146: aload #5
/*     */     //   148: invokestatic b : ([[JJJJLme/konsolas/aac/hq;)J
/*     */     //   151: lstore #8
/*     */     //   153: aload_0
/*     */     //   154: lload #8
/*     */     //   156: invokestatic a : ([[JJ)J
/*     */     //   159: lstore #10
/*     */     //   161: lload_1
/*     */     //   162: lstore #12
/*     */     //   164: lload #12
/*     */     //   166: lstore #14
/*     */     //   168: lload_3
/*     */     //   169: lconst_1
/*     */     //   170: lsub
/*     */     //   171: lstore #16
/*     */     //   173: lload #16
/*     */     //   175: lstore #18
/*     */     //   177: lload #14
/*     */     //   179: lload #16
/*     */     //   181: lcmp
/*     */     //   182: ifgt -> 240
/*     */     //   185: aload #5
/*     */     //   187: aload_0
/*     */     //   188: lload #14
/*     */     //   190: invokestatic a : ([[JJ)J
/*     */     //   193: lload #10
/*     */     //   195: invokeinterface a : (JJ)I
/*     */     //   200: dup
/*     */     //   201: istore #20
/*     */     //   203: ifgt -> 240
/*     */     //   206: iload #20
/*     */     //   208: ifne -> 231
/*     */     //   211: goto -> 218
/*     */     //   214: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   217: athrow
/*     */     //   218: aload_0
/*     */     //   219: lload #12
/*     */     //   221: dup2
/*     */     //   222: lconst_1
/*     */     //   223: ladd
/*     */     //   224: lstore #12
/*     */     //   226: lload #14
/*     */     //   228: invokestatic e : ([[JJJ)V
/*     */     //   231: lload #14
/*     */     //   233: lconst_1
/*     */     //   234: ladd
/*     */     //   235: lstore #14
/*     */     //   237: goto -> 177
/*     */     //   240: lload #16
/*     */     //   242: lload #14
/*     */     //   244: lcmp
/*     */     //   245: iflt -> 303
/*     */     //   248: aload #5
/*     */     //   250: aload_0
/*     */     //   251: lload #16
/*     */     //   253: invokestatic a : ([[JJ)J
/*     */     //   256: lload #10
/*     */     //   258: invokeinterface a : (JJ)I
/*     */     //   263: dup
/*     */     //   264: istore #20
/*     */     //   266: iflt -> 303
/*     */     //   269: iload #20
/*     */     //   271: ifne -> 294
/*     */     //   274: goto -> 281
/*     */     //   277: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   280: athrow
/*     */     //   281: aload_0
/*     */     //   282: lload #16
/*     */     //   284: lload #18
/*     */     //   286: dup2
/*     */     //   287: lconst_1
/*     */     //   288: lsub
/*     */     //   289: lstore #18
/*     */     //   291: invokestatic e : ([[JJJ)V
/*     */     //   294: lload #16
/*     */     //   296: lconst_1
/*     */     //   297: lsub
/*     */     //   298: lstore #16
/*     */     //   300: goto -> 240
/*     */     //   303: lload #14
/*     */     //   305: lload #16
/*     */     //   307: lcmp
/*     */     //   308: ifle -> 318
/*     */     //   311: goto -> 339
/*     */     //   314: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   317: athrow
/*     */     //   318: aload_0
/*     */     //   319: lload #14
/*     */     //   321: dup2
/*     */     //   322: lconst_1
/*     */     //   323: ladd
/*     */     //   324: lstore #14
/*     */     //   326: lload #16
/*     */     //   328: dup2
/*     */     //   329: lconst_1
/*     */     //   330: lsub
/*     */     //   331: lstore #16
/*     */     //   333: invokestatic e : ([[JJJ)V
/*     */     //   336: goto -> 177
/*     */     //   339: lload_3
/*     */     //   340: lstore #22
/*     */     //   342: lload #12
/*     */     //   344: lload_1
/*     */     //   345: lsub
/*     */     //   346: lload #14
/*     */     //   348: lload #12
/*     */     //   350: lsub
/*     */     //   351: invokestatic min : (JJ)J
/*     */     //   354: lstore #20
/*     */     //   356: aload_0
/*     */     //   357: lload_1
/*     */     //   358: lload #14
/*     */     //   360: lload #20
/*     */     //   362: lsub
/*     */     //   363: lload #20
/*     */     //   365: invokestatic c : ([[JJJJ)V
/*     */     //   368: lload #18
/*     */     //   370: lload #16
/*     */     //   372: lsub
/*     */     //   373: lload #22
/*     */     //   375: lload #18
/*     */     //   377: lsub
/*     */     //   378: lconst_1
/*     */     //   379: lsub
/*     */     //   380: invokestatic min : (JJ)J
/*     */     //   383: lstore #20
/*     */     //   385: aload_0
/*     */     //   386: lload #14
/*     */     //   388: lload #22
/*     */     //   390: lload #20
/*     */     //   392: lsub
/*     */     //   393: lload #20
/*     */     //   395: invokestatic c : ([[JJJJ)V
/*     */     //   398: lload #14
/*     */     //   400: lload #12
/*     */     //   402: lsub
/*     */     //   403: dup2
/*     */     //   404: lstore #20
/*     */     //   406: lconst_1
/*     */     //   407: lcmp
/*     */     //   408: ifle -> 429
/*     */     //   411: aload_0
/*     */     //   412: lload_1
/*     */     //   413: lload_1
/*     */     //   414: lload #20
/*     */     //   416: ladd
/*     */     //   417: aload #5
/*     */     //   419: invokestatic a : ([[JJJLme/konsolas/aac/hq;)V
/*     */     //   422: goto -> 429
/*     */     //   425: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   428: athrow
/*     */     //   429: lload #18
/*     */     //   431: lload #16
/*     */     //   433: lsub
/*     */     //   434: dup2
/*     */     //   435: lstore #20
/*     */     //   437: lconst_1
/*     */     //   438: lcmp
/*     */     //   439: ifle -> 462
/*     */     //   442: aload_0
/*     */     //   443: lload #22
/*     */     //   445: lload #20
/*     */     //   447: lsub
/*     */     //   448: lload #22
/*     */     //   450: aload #5
/*     */     //   452: invokestatic a : ([[JJJLme/konsolas/aac/hq;)V
/*     */     //   455: goto -> 462
/*     */     //   458: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   461: athrow
/*     */     //   462: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #342	-> 0
/*     */     //   #290	-> 5
/*     */     //   #289	-> 14
/*     */     //   #35	-> 22
/*     */     //   #80	-> 27
/*     */     //   #350	-> 37
/*     */     //   #194	-> 46
/*     */     //   #243	-> 49
/*     */     //   #217	-> 54
/*     */     //   #111	-> 63
/*     */     //   #426	-> 71
/*     */     //   #299	-> 95
/*     */     //   #240	-> 115
/*     */     //   #95	-> 139
/*     */     //   #423	-> 153
/*     */     //   #79	-> 161
/*     */     //   #347	-> 177
/*     */     //   #68	-> 206
/*     */     //   #186	-> 231
/*     */     //   #165	-> 240
/*     */     //   #227	-> 269
/*     */     //   #114	-> 294
/*     */     //   #120	-> 303
/*     */     //   #410	-> 318
/*     */     //   #380	-> 339
/*     */     //   #161	-> 342
/*     */     //   #261	-> 356
/*     */     //   #234	-> 368
/*     */     //   #306	-> 385
/*     */     //   #119	-> 398
/*     */     //   #247	-> 429
/*     */     //   #405	-> 462
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   5	23	23	java/lang/IllegalArgumentException
/*     */     //   203	211	214	java/lang/IllegalArgumentException
/*     */     //   266	274	277	java/lang/IllegalArgumentException
/*     */     //   303	314	314	java/lang/IllegalArgumentException
/*     */     //   406	422	425	java/lang/IllegalArgumentException
/*     */     //   437	455	458	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public static void a(long[][] paramArrayOflong, long paramLong) {
/*     */     paramArrayOflong[k.b(paramLong)][k.a(paramLong)] = paramArrayOflong[k.b(paramLong)][k.a(paramLong)] + 1L;
/*     */   }
/*     */   
/*     */   public static long c(long[][] paramArrayOflong, long paramLong1, long paramLong2, long paramLong3, hq paramhq) {
/*     */     paramLong2--;
/*     */     while (paramLong1 <= paramLong2) {
/*     */       long l2 = paramLong1 + paramLong2 >>> 1L;
/*     */       long l1 = k.a(paramArrayOflong, l2);
/*     */       int i = paramhq.a(l1, paramLong3);
/*     */       if (i < 0) {
/*     */         paramLong1 = l2 + 1L;
/*     */         continue;
/*     */       } 
/*     */       if (i > 0) {
/*     */         paramLong2 = l2 - 1L;
/*     */         continue;
/*     */       } 
/*     */       return l2;
/*     */     } 
/*     */     return -(paramLong1 + 1L);
/*     */   }
/*     */   
/*     */   private static void a(long[][] paramArrayOflong1, long[][] paramArrayOflong2, long[][] paramArrayOflong3, long paramLong1, long paramLong2) {
/*     */     for (long l = paramLong1; ++l < paramLong2; ) {
/*     */       continue;
/*     */       l1 = k.a(paramArrayOflong1, l);
/*     */       l2 = l;
/*     */       l3 = k.a(paramArrayOflong1, l2 - 1L);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static long b(long[][] paramArrayOflong, long paramLong1, long paramLong2, long paramLong3, hq paramhq) {
/*     */     int i = paramhq.a(k.a(paramArrayOflong, paramLong1), k.a(paramArrayOflong, paramLong2));
/*     */     int j = paramhq.a(k.a(paramArrayOflong, paramLong1), k.a(paramArrayOflong, paramLong3));
/*     */     int k = paramhq.a(k.a(paramArrayOflong, paramLong2), k.a(paramArrayOflong, paramLong3));
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
/*     */     return (k > 0) ? paramLong2 : ((j > 0) ? paramLong3 : paramLong1);
/*     */   }
/*     */   
/*     */   public static void c(long[][] paramArrayOflong) {
/*     */     g(paramArrayOflong, 0L, k.a(paramArrayOflong));
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public static long[][] c(long[][] paramArrayOflong, long paramLong1, long paramLong2) {
/*     */     return k.b(paramArrayOflong, paramLong1, paramLong2);
/*     */   }
/*     */   
/*     */   private static void b(long[][] paramArrayOflong, long paramLong1, long paramLong2, hq paramhq) {
/*     */     for (long l = paramLong1; l < paramLong2 - 1L; ) {
/*     */       long l1 = l;
/*     */       long l2 = l + 1L;
/*     */       while (true) {
/*     */         try {
/*     */           if (l2 < paramLong2) {
/*     */             if (paramhq.a(k.a(paramArrayOflong, l2), k.a(paramArrayOflong, l1)) < 0)
/*     */               l1 = l2; 
/*     */             l2++;
/*     */             continue;
/*     */           } 
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw a(null);
/*     */         } 
/*     */         try {
/*     */           if (l1 != l)
/*     */             k.e(paramArrayOflong, l, l1); 
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw a(null);
/*     */         } 
/*     */         break;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public static boolean a(long[][] paramArrayOflong1, long[][] paramArrayOflong2) {
/*     */     return k.a(paramArrayOflong1, paramArrayOflong2);
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public static void c(long[][] paramArrayOflong, long paramLong1, long paramLong2) {
/*     */     k.b(a(paramArrayOflong), paramLong1, paramLong2);
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public static long[][] a(long[][] paramArrayOflong, long paramLong1, long paramLong2) {
/*     */     return k.c(paramArrayOflong, paramLong1, paramLong2);
/*     */   }
/*     */   
/*     */   private static void b(long[][] paramArrayOflong1, long[][] paramArrayOflong2, long paramLong1, long paramLong2) {
/*     */     // Byte code:
/*     */     //   0: lload_2
/*     */     //   1: lstore #6
/*     */     //   3: lload #6
/*     */     //   5: lload #4
/*     */     //   7: lconst_1
/*     */     //   8: lsub
/*     */     //   9: lcmp
/*     */     //   10: ifge -> 186
/*     */     //   13: lload #6
/*     */     //   15: lstore #8
/*     */     //   17: lload #6
/*     */     //   19: lconst_1
/*     */     //   20: ladd
/*     */     //   21: lstore #10
/*     */     //   23: lload #10
/*     */     //   25: lload #4
/*     */     //   27: lcmp
/*     */     //   28: ifge -> 113
/*     */     //   31: aload_0
/*     */     //   32: lload #10
/*     */     //   34: invokestatic a : ([[JJ)J
/*     */     //   37: aload_0
/*     */     //   38: lload #8
/*     */     //   40: invokestatic a : ([[JJ)J
/*     */     //   43: lcmp
/*     */     //   44: iflt -> 100
/*     */     //   47: goto -> 54
/*     */     //   50: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   53: athrow
/*     */     //   54: aload_0
/*     */     //   55: lload #10
/*     */     //   57: invokestatic a : ([[JJ)J
/*     */     //   60: aload_0
/*     */     //   61: lload #8
/*     */     //   63: invokestatic a : ([[JJ)J
/*     */     //   66: lcmp
/*     */     //   67: ifne -> 104
/*     */     //   70: goto -> 77
/*     */     //   73: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   76: athrow
/*     */     //   77: aload_1
/*     */     //   78: lload #10
/*     */     //   80: invokestatic a : ([[JJ)J
/*     */     //   83: aload_1
/*     */     //   84: lload #8
/*     */     //   86: invokestatic a : ([[JJ)J
/*     */     //   89: lcmp
/*     */     //   90: ifge -> 104
/*     */     //   93: goto -> 100
/*     */     //   96: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   99: athrow
/*     */     //   100: lload #10
/*     */     //   102: lstore #8
/*     */     //   104: lload #10
/*     */     //   106: lconst_1
/*     */     //   107: ladd
/*     */     //   108: lstore #10
/*     */     //   110: goto -> 23
/*     */     //   113: lload #8
/*     */     //   115: lload #6
/*     */     //   117: lcmp
/*     */     //   118: ifeq -> 177
/*     */     //   121: aload_0
/*     */     //   122: lload #6
/*     */     //   124: invokestatic a : ([[JJ)J
/*     */     //   127: lstore #10
/*     */     //   129: aload_0
/*     */     //   130: lload #6
/*     */     //   132: aload_0
/*     */     //   133: lload #8
/*     */     //   135: invokestatic a : ([[JJ)J
/*     */     //   138: invokestatic d : ([[JJJ)V
/*     */     //   141: aload_0
/*     */     //   142: lload #8
/*     */     //   144: lload #10
/*     */     //   146: invokestatic d : ([[JJJ)V
/*     */     //   149: aload_1
/*     */     //   150: lload #6
/*     */     //   152: invokestatic a : ([[JJ)J
/*     */     //   155: lstore #10
/*     */     //   157: aload_1
/*     */     //   158: lload #6
/*     */     //   160: aload_1
/*     */     //   161: lload #8
/*     */     //   163: invokestatic a : ([[JJ)J
/*     */     //   166: invokestatic d : ([[JJJ)V
/*     */     //   169: aload_1
/*     */     //   170: lload #8
/*     */     //   172: lload #10
/*     */     //   174: invokestatic d : ([[JJJ)V
/*     */     //   177: lload #6
/*     */     //   179: lconst_1
/*     */     //   180: ladd
/*     */     //   181: lstore #6
/*     */     //   183: goto -> 3
/*     */     //   186: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #414	-> 0
/*     */     //   #183	-> 13
/*     */     //   #408	-> 17
/*     */     //   #307	-> 31
/*     */     //   #90	-> 104
/*     */     //   #320	-> 113
/*     */     //   #125	-> 121
/*     */     //   #21	-> 129
/*     */     //   #331	-> 141
/*     */     //   #422	-> 149
/*     */     //   #144	-> 157
/*     */     //   #387	-> 169
/*     */     //   #16	-> 177
/*     */     //   #86	-> 186
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   23	47	50	java/lang/IllegalArgumentException
/*     */     //   31	70	73	java/lang/IllegalArgumentException
/*     */     //   54	93	96	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public static long a(long[][] paramArrayOflong) {
/*     */     int i = paramArrayOflong.length;
/*     */     try {
/*     */     
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     return (i == 0) ? 0L : (k.a(i - 1) + (paramArrayOflong[i - 1]).length);
/*     */   }
/*     */   
/*     */   static {
/*     */     // Byte code:
/*     */     //   0: ldc2_w 6976081287194778440
/*     */     //   3: ldc2_w -7612941985814006534
/*     */     //   6: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
/*     */     //   9: invokevirtual lookupClass : ()Ljava/lang/Class;
/*     */     //   12: invokestatic a : (JJLjava/lang/Object;)Lme/konsolas/aac/na;
/*     */     //   15: ldc2_w 185960994458755
/*     */     //   18: invokeinterface a : (J)J
/*     */     //   23: putstatic me/konsolas/aac/l0.m : J
/*     */     //   26: getstatic me/konsolas/aac/l0.m : J
/*     */     //   29: ldc2_w 113819322206607
/*     */     //   32: lxor
/*     */     //   33: lstore_0
/*     */     //   34: iconst_5
/*     */     //   35: anewarray java/lang/String
/*     */     //   38: iconst_0
/*     */     //   39: anewarray [J
/*     */     //   42: putstatic me/konsolas/aac/l0.k : [[J
/*     */     //   45: iconst_0
/*     */     //   46: anewarray [J
/*     */     //   49: putstatic me/konsolas/aac/l0.g : [[J
/*     */     //   52: ldc2_w -3035747325872225934
/*     */     //   55: lload_0
/*     */     //   56: <illegal opcode> w : ([Ljava/lang/String;JJ)V
/*     */     //   61: iconst_0
/*     */     //   62: anewarray java/util/concurrent/atomic/AtomicLongArray
/*     */     //   65: putstatic me/konsolas/aac/l0.c : [Ljava/util/concurrent/atomic/AtomicLongArray;
/*     */     //   68: new me/konsolas/aac/lj
/*     */     //   71: dup
/*     */     //   72: aconst_null
/*     */     //   73: invokespecial <init> : (Lme/konsolas/aac/A;)V
/*     */     //   76: putstatic me/konsolas/aac/l0.b : Lme/konsolas/aac/m9;
/*     */     //   79: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #169	-> 38
/*     */     //   #291	-> 45
/*     */     //   #315	-> 61
/*     */     //   #367	-> 68
/*     */   }
/*     */   
/*     */   public static void b(String[] paramArrayOfString) {
/*     */     i = paramArrayOfString;
/*     */   }
/*     */   
/*     */   public static String[] b() {
/*     */     return i;
/*     */   }
/*     */   
/*     */   private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
/*     */     return paramIllegalArgumentException;
/*     */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\l0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */