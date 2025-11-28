/*     */ package me.konsolas.aac;public final class er { public static final boolean[][] c; public static final boolean[][] b; public static final m9 f; private static final int a = 7; private static final int d = 8192; private static final int e = 40; @Deprecated
/*   2 */   public static void a(boolean[][] paramArrayOfboolean, long paramLong, boolean[] paramArrayOfboolean1, int paramInt1, int paramInt2) { k.a(paramArrayOfboolean, paramLong, paramArrayOfboolean1, paramInt1, paramInt2); }
/*     */   
/*     */   @Deprecated
/*   5 */   public static boolean[][] a(boolean[][] paramArrayOfboolean) { return k.b(paramArrayOfboolean); }
/*   6 */   private static long b(boolean[][] paramArrayOfboolean, long paramLong1, long paramLong2, long paramLong3, bI parambI) { int i = parambI.a(k.a(paramArrayOfboolean, paramLong1), k.a(paramArrayOfboolean, paramLong2));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 134 */     int j = parambI.a(k.a(paramArrayOfboolean, paramLong1), k.a(paramArrayOfboolean, paramLong3)); int k = parambI.a(k.a(paramArrayOfboolean, paramLong2), k.a(paramArrayOfboolean, paramLong3)); try { if (i < 0) { try { try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  }
/*     */       else { try { try {  }
/*     */           catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/*     */            }
/*     */         catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/*     */          }
/*     */        }
/*     */     catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/*     */      return (k > 0) ? paramLong2 : ((j > 0) ? paramLong3 : paramLong1); } @Deprecated public static void a(boolean[][] paramArrayOfboolean, boolean paramBoolean) { int i = paramArrayOfboolean.length; try { for (; i-- != 0; Arrays.fill(paramArrayOfboolean[i], paramBoolean)); }
/*     */     catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/*     */      }
/*     */   public static boolean[][] a(long paramLong) { try { if (paramLong == 0L)
/*     */         return c;  }
/*     */     catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/* 148 */      k.a(paramLong); int i = (int)(paramLong + 134217727L >>> 27L); boolean[][] arrayOfBoolean = new boolean[i][]; int j = (int)(paramLong & 0x7FFFFFFL); if (j != 0) { byte b = 0; try { while (b < i - 1) { arrayOfBoolean[b] = new boolean[134217728]; b++; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  arrayOfBoolean[i - 1] = new boolean[j]; } else { byte b = 0; try { while (b < i) { arrayOfBoolean[b] = new boolean[134217728]; b++; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  }  return arrayOfBoolean; } @Deprecated public static void b(boolean[][] paramArrayOfboolean, long paramLong1, long paramLong2) { k.a(a(paramArrayOfboolean), paramLong1, paramLong2); } @Deprecated public static boolean[][] c(boolean[][] paramArrayOfboolean, long paramLong1, long paramLong2) { return k.b(paramArrayOfboolean, paramLong1, paramLong2); }
/*     */   public static void f(boolean[][] paramArrayOfboolean, long paramLong1, long paramLong2) { // Byte code:
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
/*     */     //   17: invokestatic e : ([[ZJJ)V
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
/*     */     //   86: invokestatic b : ([[ZJJJ)J
/*     */     //   89: lstore #9
/*     */     //   91: aload_0
/*     */     //   92: lload #7
/*     */     //   94: lload #13
/*     */     //   96: lsub
/*     */     //   97: lload #7
/*     */     //   99: lload #7
/*     */     //   101: lload #13
/*     */     //   103: ladd
/*     */     //   104: invokestatic b : ([[ZJJJ)J
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
/*     */     //   126: invokestatic b : ([[ZJJJ)J
/*     */     //   129: lstore #11
/*     */     //   131: aload_0
/*     */     //   132: lload #9
/*     */     //   134: lload #7
/*     */     //   136: lload #11
/*     */     //   138: invokestatic b : ([[ZJJJ)J
/*     */     //   141: lstore #7
/*     */     //   143: aload_0
/*     */     //   144: lload #7
/*     */     //   146: invokestatic a : ([[ZJ)Z
/*     */     //   149: istore #9
/*     */     //   151: lload_1
/*     */     //   152: lstore #10
/*     */     //   154: lload #10
/*     */     //   156: lstore #12
/*     */     //   158: lload_3
/*     */     //   159: lconst_1
/*     */     //   160: lsub
/*     */     //   161: lstore #14
/*     */     //   163: lload #14
/*     */     //   165: lstore #16
/*     */     //   167: lload #12
/*     */     //   169: lload #14
/*     */     //   171: lcmp
/*     */     //   172: ifgt -> 226
/*     */     //   175: aload_0
/*     */     //   176: lload #12
/*     */     //   178: invokestatic a : ([[ZJ)Z
/*     */     //   181: iload #9
/*     */     //   183: invokestatic compare : (ZZ)I
/*     */     //   186: dup
/*     */     //   187: istore #18
/*     */     //   189: ifgt -> 226
/*     */     //   192: iload #18
/*     */     //   194: ifne -> 217
/*     */     //   197: goto -> 204
/*     */     //   200: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   203: athrow
/*     */     //   204: aload_0
/*     */     //   205: lload #10
/*     */     //   207: dup2
/*     */     //   208: lconst_1
/*     */     //   209: ladd
/*     */     //   210: lstore #10
/*     */     //   212: lload #12
/*     */     //   214: invokestatic c : ([[ZJJ)V
/*     */     //   217: lload #12
/*     */     //   219: lconst_1
/*     */     //   220: ladd
/*     */     //   221: lstore #12
/*     */     //   223: goto -> 167
/*     */     //   226: lload #14
/*     */     //   228: lload #12
/*     */     //   230: lcmp
/*     */     //   231: iflt -> 285
/*     */     //   234: aload_0
/*     */     //   235: lload #14
/*     */     //   237: invokestatic a : ([[ZJ)Z
/*     */     //   240: iload #9
/*     */     //   242: invokestatic compare : (ZZ)I
/*     */     //   245: dup
/*     */     //   246: istore #18
/*     */     //   248: iflt -> 285
/*     */     //   251: iload #18
/*     */     //   253: ifne -> 276
/*     */     //   256: goto -> 263
/*     */     //   259: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   262: athrow
/*     */     //   263: aload_0
/*     */     //   264: lload #14
/*     */     //   266: lload #16
/*     */     //   268: dup2
/*     */     //   269: lconst_1
/*     */     //   270: lsub
/*     */     //   271: lstore #16
/*     */     //   273: invokestatic c : ([[ZJJ)V
/*     */     //   276: lload #14
/*     */     //   278: lconst_1
/*     */     //   279: lsub
/*     */     //   280: lstore #14
/*     */     //   282: goto -> 226
/*     */     //   285: lload #12
/*     */     //   287: lload #14
/*     */     //   289: lcmp
/*     */     //   290: ifle -> 300
/*     */     //   293: goto -> 321
/*     */     //   296: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   299: athrow
/*     */     //   300: aload_0
/*     */     //   301: lload #12
/*     */     //   303: dup2
/*     */     //   304: lconst_1
/*     */     //   305: ladd
/*     */     //   306: lstore #12
/*     */     //   308: lload #14
/*     */     //   310: dup2
/*     */     //   311: lconst_1
/*     */     //   312: lsub
/*     */     //   313: lstore #14
/*     */     //   315: invokestatic c : ([[ZJJ)V
/*     */     //   318: goto -> 167
/*     */     //   321: lload_3
/*     */     //   322: lstore #20
/*     */     //   324: lload #10
/*     */     //   326: lload_1
/*     */     //   327: lsub
/*     */     //   328: lload #12
/*     */     //   330: lload #10
/*     */     //   332: lsub
/*     */     //   333: invokestatic min : (JJ)J
/*     */     //   336: lstore #18
/*     */     //   338: aload_0
/*     */     //   339: lload_1
/*     */     //   340: lload #12
/*     */     //   342: lload #18
/*     */     //   344: lsub
/*     */     //   345: lload #18
/*     */     //   347: invokestatic b : ([[ZJJJ)V
/*     */     //   350: lload #16
/*     */     //   352: lload #14
/*     */     //   354: lsub
/*     */     //   355: lload #20
/*     */     //   357: lload #16
/*     */     //   359: lsub
/*     */     //   360: lconst_1
/*     */     //   361: lsub
/*     */     //   362: invokestatic min : (JJ)J
/*     */     //   365: lstore #18
/*     */     //   367: aload_0
/*     */     //   368: lload #12
/*     */     //   370: lload #20
/*     */     //   372: lload #18
/*     */     //   374: lsub
/*     */     //   375: lload #18
/*     */     //   377: invokestatic b : ([[ZJJJ)V
/*     */     //   380: lload #12
/*     */     //   382: lload #10
/*     */     //   384: lsub
/*     */     //   385: dup2
/*     */     //   386: lstore #18
/*     */     //   388: lconst_1
/*     */     //   389: lcmp
/*     */     //   390: ifle -> 409
/*     */     //   393: aload_0
/*     */     //   394: lload_1
/*     */     //   395: lload_1
/*     */     //   396: lload #18
/*     */     //   398: ladd
/*     */     //   399: invokestatic f : ([[ZJJ)V
/*     */     //   402: goto -> 409
/*     */     //   405: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   408: athrow
/*     */     //   409: lload #16
/*     */     //   411: lload #14
/*     */     //   413: lsub
/*     */     //   414: dup2
/*     */     //   415: lstore #18
/*     */     //   417: lconst_1
/*     */     //   418: lcmp
/*     */     //   419: ifle -> 440
/*     */     //   422: aload_0
/*     */     //   423: lload #20
/*     */     //   425: lload #18
/*     */     //   427: lsub
/*     */     //   428: lload #20
/*     */     //   430: invokestatic f : ([[ZJJ)V
/*     */     //   433: goto -> 440
/*     */     //   436: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   439: athrow
/*     */     //   440: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #38	-> 0
/*     */     //   #169	-> 5
/*     */     //   #110	-> 14
/*     */     //   #66	-> 20
/*     */     //   #126	-> 25
/*     */     //   #97	-> 35
/*     */     //   #58	-> 44
/*     */     //   #16	-> 47
/*     */     //   #147	-> 52
/*     */     //   #91	-> 61
/*     */     //   #79	-> 69
/*     */     //   #149	-> 91
/*     */     //   #123	-> 109
/*     */     //   #116	-> 131
/*     */     //   #127	-> 143
/*     */     //   #108	-> 151
/*     */     //   #9	-> 167
/*     */     //   #78	-> 192
/*     */     //   #132	-> 217
/*     */     //   #121	-> 226
/*     */     //   #128	-> 251
/*     */     //   #26	-> 276
/*     */     //   #11	-> 285
/*     */     //   #46	-> 300
/*     */     //   #85	-> 321
/*     */     //   #65	-> 324
/*     */     //   #45	-> 338
/*     */     //   #1	-> 350
/*     */     //   #105	-> 367
/*     */     //   #15	-> 380
/*     */     //   #165	-> 409
/*     */     //   #44	-> 440
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   5	21	21	java/lang/IllegalArgumentException
/*     */     //   189	197	200	java/lang/IllegalArgumentException
/*     */     //   248	256	259	java/lang/IllegalArgumentException
/*     */     //   285	296	296	java/lang/IllegalArgumentException
/*     */     //   388	402	405	java/lang/IllegalArgumentException
/*     */     //   417	433	436	java/lang/IllegalArgumentException }
/*     */   private static void b(boolean[][] paramArrayOfboolean, long paramLong1, long paramLong2, long paramLong3) { for (byte b = 0; b < paramLong3; ) { k.c(paramArrayOfboolean, paramLong1, paramLong2); b++; paramLong1++; paramLong2++; }  }
/*     */   @Deprecated public static void a(boolean[][] paramArrayOfboolean1, boolean[][] paramArrayOfboolean2) { // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/er.g : J
/*     */     //   3: ldc2_w 92298994507412
/*     */     //   6: lxor
/*     */     //   7: lstore_2
/*     */     //   8: aload_0
/*     */     //   9: invokestatic a : ([[Z)J
/*     */     //   12: aload_1
/*     */     //   13: invokestatic a : ([[Z)J
/*     */     //   16: lcmp
/*     */     //   17: ifeq -> 117
/*     */     //   20: new java/lang/IllegalArgumentException
/*     */     //   23: dup
/*     */     //   24: new java/lang/StringBuilder
/*     */     //   27: dup
/*     */     //   28: invokespecial <init> : ()V
/*     */     //   31: ldc 'ᒡ鯲仰騽傣斴译뇰㛹饔학威?큓틤Ꮅ複룈⸌'
/*     */     //   33: invokevirtual toCharArray : ()[C
/*     */     //   36: dup
/*     */     //   37: dup
/*     */     //   38: bipush #7
/*     */     //   40: dup_x1
/*     */     //   41: caload
/*     */     //   42: sipush #3815
/*     */     //   45: ixor
/*     */     //   46: i2c
/*     */     //   47: castore
/*     */     //   48: sipush #30999
/*     */     //   51: iconst_0
/*     */     //   52: iconst_0
/*     */     //   53: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*     */     //   56: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   59: aload_0
/*     */     //   60: invokestatic a : ([[Z)J
/*     */     //   63: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*     */     //   66: ldc '愺鑀╡瘝㌏'
/*     */     //   68: invokevirtual toCharArray : ()[C
/*     */     //   71: dup
/*     */     //   72: dup
/*     */     //   73: iconst_0
/*     */     //   74: dup_x1
/*     */     //   75: caload
/*     */     //   76: sipush #31223
/*     */     //   79: ixor
/*     */     //   80: i2c
/*     */     //   81: castore
/*     */     //   82: sipush #10896
/*     */     //   85: iconst_1
/*     */     //   86: iconst_1
/*     */     //   87: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*     */     //   90: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   93: aload_1
/*     */     //   94: invokestatic a : ([[Z)J
/*     */     //   97: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*     */     //   100: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   103: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   106: athrow
/*     */     //   107: ldc2_w -2469766641079268459
/*     */     //   110: lload_2
/*     */     //   111: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   116: athrow
/*     */     //   117: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #41	-> 8
/*     */     //   #95	-> 117
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   8	107	107	java/lang/IllegalArgumentException }
/*     */   @Deprecated public static void a(boolean[][] paramArrayOfboolean, long paramLong1, long paramLong2, boolean paramBoolean) { k.a(paramArrayOfboolean, paramLong1, paramLong2, paramBoolean); }
/*     */   private static void c(boolean[][] paramArrayOfboolean, long paramLong1, long paramLong2, bI parambI) { for (long l = paramLong1; l < paramLong2 - 1L; l2 = l + 1L) long l2, l1 = l;  }
/* 154 */   public static void a(boolean[][] paramArrayOfboolean, long paramLong1, long paramLong2) { ForkJoinPool forkJoinPool = a(); try { if (paramLong2 - paramLong1 >= 8192L) { try { if (forkJoinPool.getParallelism() == 1) { f(paramArrayOfboolean, paramLong1, paramLong2); return; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  forkJoinPool.invoke(new gY(paramArrayOfboolean, paramLong1, paramLong2)); return; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  f(paramArrayOfboolean, paramLong1, paramLong2); } @Deprecated public static boolean[][] a(boolean[][] paramArrayOfboolean, long paramLong) { return d(paramArrayOfboolean, paramLong, a(paramArrayOfboolean)); } @Deprecated public static void a(boolean[] paramArrayOfboolean, int paramInt, boolean[][] paramArrayOfboolean1, long paramLong1, long paramLong2) { k.a(paramArrayOfboolean, paramInt, paramArrayOfboolean1, paramLong1, paramLong2); } @Deprecated public static boolean[][] a(boolean[][] paramArrayOfboolean, long paramLong1, long paramLong2) { return k.d(paramArrayOfboolean, paramLong1, paramLong2); } public static void b(boolean[][] paramArrayOfboolean) { f(paramArrayOfboolean, 0L, k.a(paramArrayOfboolean)); } private static void e(boolean[][] paramArrayOfboolean, long paramLong1, long paramLong2) { for (long l = paramLong1; l < paramLong2 - 1L; ) { long l1 = l; long l2 = l + 1L; while (true) { try { if (l2 < paramLong2) { try { if (!k.a(paramArrayOfboolean, l2) && k.a(paramArrayOfboolean, l1)) l1 = l2;  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  l2++; continue; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  break; }  }  } public static void a(boolean[][] paramArrayOfboolean, long paramLong1, long paramLong2, bI parambI) { // Byte code:
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
/*     */     //   19: invokestatic c : ([[ZJJLme/konsolas/aac/bI;)V
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
/*     */     //   90: invokestatic b : ([[ZJJJLme/konsolas/aac/bI;)J
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
/*     */     //   110: invokestatic b : ([[ZJJJLme/konsolas/aac/bI;)J
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
/*     */     //   134: invokestatic b : ([[ZJJJLme/konsolas/aac/bI;)J
/*     */     //   137: lstore #12
/*     */     //   139: aload_0
/*     */     //   140: lload #10
/*     */     //   142: lload #8
/*     */     //   144: lload #12
/*     */     //   146: aload #5
/*     */     //   148: invokestatic b : ([[ZJJJLme/konsolas/aac/bI;)J
/*     */     //   151: lstore #8
/*     */     //   153: aload_0
/*     */     //   154: lload #8
/*     */     //   156: invokestatic a : ([[ZJ)Z
/*     */     //   159: istore #10
/*     */     //   161: lload_1
/*     */     //   162: lstore #11
/*     */     //   164: lload #11
/*     */     //   166: lstore #13
/*     */     //   168: lload_3
/*     */     //   169: lconst_1
/*     */     //   170: lsub
/*     */     //   171: lstore #15
/*     */     //   173: lload #15
/*     */     //   175: lstore #17
/*     */     //   177: lload #13
/*     */     //   179: lload #15
/*     */     //   181: lcmp
/*     */     //   182: ifgt -> 240
/*     */     //   185: aload #5
/*     */     //   187: aload_0
/*     */     //   188: lload #13
/*     */     //   190: invokestatic a : ([[ZJ)Z
/*     */     //   193: iload #10
/*     */     //   195: invokeinterface a : (ZZ)I
/*     */     //   200: dup
/*     */     //   201: istore #19
/*     */     //   203: ifgt -> 240
/*     */     //   206: iload #19
/*     */     //   208: ifne -> 231
/*     */     //   211: goto -> 218
/*     */     //   214: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   217: athrow
/*     */     //   218: aload_0
/*     */     //   219: lload #11
/*     */     //   221: dup2
/*     */     //   222: lconst_1
/*     */     //   223: ladd
/*     */     //   224: lstore #11
/*     */     //   226: lload #13
/*     */     //   228: invokestatic c : ([[ZJJ)V
/*     */     //   231: lload #13
/*     */     //   233: lconst_1
/*     */     //   234: ladd
/*     */     //   235: lstore #13
/*     */     //   237: goto -> 177
/*     */     //   240: lload #15
/*     */     //   242: lload #13
/*     */     //   244: lcmp
/*     */     //   245: iflt -> 303
/*     */     //   248: aload #5
/*     */     //   250: aload_0
/*     */     //   251: lload #15
/*     */     //   253: invokestatic a : ([[ZJ)Z
/*     */     //   256: iload #10
/*     */     //   258: invokeinterface a : (ZZ)I
/*     */     //   263: dup
/*     */     //   264: istore #19
/*     */     //   266: iflt -> 303
/*     */     //   269: iload #19
/*     */     //   271: ifne -> 294
/*     */     //   274: goto -> 281
/*     */     //   277: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   280: athrow
/*     */     //   281: aload_0
/*     */     //   282: lload #15
/*     */     //   284: lload #17
/*     */     //   286: dup2
/*     */     //   287: lconst_1
/*     */     //   288: lsub
/*     */     //   289: lstore #17
/*     */     //   291: invokestatic c : ([[ZJJ)V
/*     */     //   294: lload #15
/*     */     //   296: lconst_1
/*     */     //   297: lsub
/*     */     //   298: lstore #15
/*     */     //   300: goto -> 240
/*     */     //   303: lload #13
/*     */     //   305: lload #15
/*     */     //   307: lcmp
/*     */     //   308: ifle -> 318
/*     */     //   311: goto -> 339
/*     */     //   314: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   317: athrow
/*     */     //   318: aload_0
/*     */     //   319: lload #13
/*     */     //   321: dup2
/*     */     //   322: lconst_1
/*     */     //   323: ladd
/*     */     //   324: lstore #13
/*     */     //   326: lload #15
/*     */     //   328: dup2
/*     */     //   329: lconst_1
/*     */     //   330: lsub
/*     */     //   331: lstore #15
/*     */     //   333: invokestatic c : ([[ZJJ)V
/*     */     //   336: goto -> 177
/*     */     //   339: lload_3
/*     */     //   340: lstore #21
/*     */     //   342: lload #11
/*     */     //   344: lload_1
/*     */     //   345: lsub
/*     */     //   346: lload #13
/*     */     //   348: lload #11
/*     */     //   350: lsub
/*     */     //   351: invokestatic min : (JJ)J
/*     */     //   354: lstore #19
/*     */     //   356: aload_0
/*     */     //   357: lload_1
/*     */     //   358: lload #13
/*     */     //   360: lload #19
/*     */     //   362: lsub
/*     */     //   363: lload #19
/*     */     //   365: invokestatic b : ([[ZJJJ)V
/*     */     //   368: lload #17
/*     */     //   370: lload #15
/*     */     //   372: lsub
/*     */     //   373: lload #21
/*     */     //   375: lload #17
/*     */     //   377: lsub
/*     */     //   378: lconst_1
/*     */     //   379: lsub
/*     */     //   380: invokestatic min : (JJ)J
/*     */     //   383: lstore #19
/*     */     //   385: aload_0
/*     */     //   386: lload #13
/*     */     //   388: lload #21
/*     */     //   390: lload #19
/*     */     //   392: lsub
/*     */     //   393: lload #19
/*     */     //   395: invokestatic b : ([[ZJJJ)V
/*     */     //   398: lload #13
/*     */     //   400: lload #11
/*     */     //   402: lsub
/*     */     //   403: dup2
/*     */     //   404: lstore #19
/*     */     //   406: lconst_1
/*     */     //   407: lcmp
/*     */     //   408: ifle -> 429
/*     */     //   411: aload_0
/*     */     //   412: lload_1
/*     */     //   413: lload_1
/*     */     //   414: lload #19
/*     */     //   416: ladd
/*     */     //   417: aload #5
/*     */     //   419: invokestatic a : ([[ZJJLme/konsolas/aac/bI;)V
/*     */     //   422: goto -> 429
/*     */     //   425: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   428: athrow
/*     */     //   429: lload #17
/*     */     //   431: lload #15
/*     */     //   433: lsub
/*     */     //   434: dup2
/*     */     //   435: lstore #19
/*     */     //   437: lconst_1
/*     */     //   438: lcmp
/*     */     //   439: ifle -> 462
/*     */     //   442: aload_0
/*     */     //   443: lload #21
/*     */     //   445: lload #19
/*     */     //   447: lsub
/*     */     //   448: lload #21
/*     */     //   450: aload #5
/*     */     //   452: invokestatic a : ([[ZJJLme/konsolas/aac/bI;)V
/*     */     //   455: goto -> 462
/*     */     //   458: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   461: athrow
/*     */     //   462: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #83	-> 0
/*     */     //   #141	-> 5
/*     */     //   #87	-> 14
/*     */     //   #29	-> 22
/*     */     //   #130	-> 27
/*     */     //   #62	-> 37
/*     */     //   #145	-> 46
/*     */     //   #7	-> 49
/*     */     //   #77	-> 54
/*     */     //   #60	-> 63
/*     */     //   #17	-> 71
/*     */     //   #13	-> 95
/*     */     //   #19	-> 115
/*     */     //   #24	-> 139
/*     */     //   #4	-> 153
/*     */     //   #135	-> 161
/*     */     //   #93	-> 177
/*     */     //   #81	-> 206
/*     */     //   #94	-> 231
/*     */     //   #54	-> 240
/*     */     //   #151	-> 269
/*     */     //   #103	-> 294
/*     */     //   #70	-> 303
/*     */     //   #99	-> 318
/*     */     //   #55	-> 339
/*     */     //   #30	-> 342
/*     */     //   #75	-> 356
/*     */     //   #42	-> 368
/*     */     //   #117	-> 385
/*     */     //   #100	-> 398
/*     */     //   #150	-> 429
/*     */     //   #33	-> 462
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   5	23	23	java/lang/IllegalArgumentException
/*     */     //   203	211	214	java/lang/IllegalArgumentException
/*     */     //   266	274	277	java/lang/IllegalArgumentException
/*     */     //   303	314	314	java/lang/IllegalArgumentException
/*     */     //   406	422	425	java/lang/IllegalArgumentException
/*     */     //   437	455	458	java/lang/IllegalArgumentException } @Deprecated public static void c(boolean[][] paramArrayOfboolean, long paramLong1, long paramLong2) { boolean bool = paramArrayOfboolean[k.b(paramLong1)][k.a(paramLong1)]; paramArrayOfboolean[k.b(paramLong1)][k.a(paramLong1)] = paramArrayOfboolean[k.b(paramLong2)][k.a(paramLong2)]; paramArrayOfboolean[k.b(paramLong2)][k.a(paramLong2)] = bool; } @Deprecated public static void d(boolean[][] paramArrayOfboolean, long paramLong1, long paramLong2) { k.b(a(paramArrayOfboolean), paramLong1, paramLong2); } @Deprecated public static boolean[][] a(boolean[] paramArrayOfboolean) { return k.a(paramArrayOfboolean); } public static void a(boolean[][] paramArrayOfboolean, bI parambI) { b(paramArrayOfboolean, 0L, k.a(paramArrayOfboolean), parambI); }
/*     */   private static final long g = nc.a(8050084167035516126L, 3551242370623918332L, MethodHandles.lookup().lookupClass()).a(84502219758247L);
/* 156 */   static { c = new boolean[0][]; b = new boolean[0][]; f = new lt(null); } @Deprecated public static boolean[][] b(boolean[][] paramArrayOfboolean, long paramLong) { long l = a(paramArrayOfboolean); try {  }
/*     */     catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/*     */      return (paramLong > l) ? b(paramArrayOfboolean, paramLong, l) : paramArrayOfboolean; }
/*     */   private static ForkJoinPool a() { ForkJoinPool forkJoinPool = ForkJoinTask.getPool(); try {  }
/*     */     catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/*     */      return (forkJoinPool == null) ? ForkJoinPool.commonPool() : forkJoinPool; }
/*     */   public static void b(boolean[][] paramArrayOfboolean, bI parambI) { a(paramArrayOfboolean, 0L, k.a(paramArrayOfboolean), parambI); }
/*     */   @Deprecated public static void a(boolean[][] paramArrayOfboolean, long paramLong, boolean paramBoolean) { paramArrayOfboolean[k.b(paramLong)][k.a(paramLong)] = paramBoolean; }
/*     */   @Deprecated public static boolean[][] d(boolean[][] paramArrayOfboolean, long paramLong1, long paramLong2) { try {  }
/*     */     catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/*     */      return (paramLong1 > a(paramArrayOfboolean)) ? c(paramArrayOfboolean, paramLong1, paramLong2) : paramArrayOfboolean; }
/* 167 */   private static long b(boolean[][] paramArrayOfboolean, long paramLong1, long paramLong2, long paramLong3) { int i = Boolean.compare(k.a(paramArrayOfboolean, paramLong1), k.a(paramArrayOfboolean, paramLong2)); int j = Boolean.compare(k.a(paramArrayOfboolean, paramLong1), k.a(paramArrayOfboolean, paramLong3)); int k = Boolean.compare(k.a(paramArrayOfboolean, paramLong2), k.a(paramArrayOfboolean, paramLong3)); try { if (i < 0) { try { try {  }
/* 168 */           catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  } else { try { try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return (k > 0) ? paramLong2 : ((j > 0) ? paramLong3 : paramLong1); }
/*     */   @Deprecated public static boolean[][] d(boolean[][] paramArrayOfboolean, long paramLong) { return k.a(paramArrayOfboolean, paramLong); }
/* 170 */   public static void b(boolean[][] paramArrayOfboolean, long paramLong1, long paramLong2, bI parambI) { ForkJoinPool forkJoinPool = a(); try { if (paramLong2 - paramLong1 >= 8192L) { try { if (forkJoinPool.getParallelism() == 1) { a(paramArrayOfboolean, paramLong1, paramLong2, parambI); return; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  forkJoinPool.invoke(new eJ(paramArrayOfboolean, paramLong1, paramLong2, parambI)); return; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  a(paramArrayOfboolean, paramLong1, paramLong2, parambI); } @Deprecated public static void a(boolean[][] paramArrayOfboolean1, long paramLong1, boolean[][] paramArrayOfboolean2, long paramLong2, long paramLong3) { k.a(paramArrayOfboolean1, paramLong1, paramArrayOfboolean2, paramLong2, paramLong3); } public static void a(boolean[][] paramArrayOfboolean) { a(paramArrayOfboolean, 0L, k.a(paramArrayOfboolean)); }
/* 171 */   @Deprecated public static boolean a(boolean[][] paramArrayOfboolean, long paramLong) { return paramArrayOfboolean[k.b(paramLong)][k.a(paramLong)]; } @Deprecated public static String a(boolean[][] paramArrayOfboolean) { return k.a(paramArrayOfboolean); } @Deprecated public static boolean[][] c(boolean[][] paramArrayOfboolean, long paramLong) { k.a(paramLong); long l = a(paramArrayOfboolean); try { if (paramLong >= l) return paramArrayOfboolean;  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  int i = (int)(paramLong + 134217727L >>> 27L); boolean[][] arrayOfBoolean = Arrays.<boolean[]>copyOf(paramArrayOfboolean, i); int j = (int)(paramLong & 0x7FFFFFFL); try { if (j != 0) arrayOfBoolean[i - 1] = iE.d(arrayOfBoolean[i - 1], j);  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return arrayOfBoolean; } @Deprecated public static boolean[][] b(boolean[][] paramArrayOfboolean, long paramLong1, long paramLong2) { long l = a(paramArrayOfboolean); try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return (paramLong1 > l) ? d(paramArrayOfboolean, Math.max(l + (l >> 1L), paramLong1), paramLong2) : paramArrayOfboolean; } public static boolean[][] a(boolean[][] paramArrayOfboolean, Random paramRandom) { return k.a(paramArrayOfboolean, paramRandom); }
/* 172 */   public static boolean[][] a(boolean[][] paramArrayOfboolean, long paramLong1, long paramLong2, Random paramRandom) { return k.a(paramArrayOfboolean, paramLong1, paramLong2, paramRandom); } @Deprecated
/* 173 */   public static long a(boolean[][] paramArrayOfboolean) { int i = paramArrayOfboolean.length; try {  }
/*     */     catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/* 175 */      return (i == 0) ? 0L : (k.a(i - 1) + (paramArrayOfboolean[i - 1]).length); } @Deprecated public static boolean a(boolean[][] paramArrayOfboolean1, boolean[][] paramArrayOfboolean2) { return k.a(paramArrayOfboolean1, paramArrayOfboolean2); }
/*     */ 
/*     */   
/*     */   private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
/*     */     return paramIllegalArgumentException;
/*     */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\er.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */