/*     */ package me.konsolas.aac;public final class ie { public static final Object[][] e; public static final Object[][] d; public static final m9 c; private static final int f = 7; private static final int b = 8192; private static final int a = 40; @Deprecated
/*   2 */   public static Object[][] c(Object[][] paramArrayOfObject, long paramLong1, long paramLong2) { return k.c(paramArrayOfObject, paramLong1, paramLong2); } @Deprecated
/*     */   public static Object[][] b(Object[][] paramArrayOfObject, long paramLong1, long paramLong2) { 
/*     */     try {  }
/*     */     catch (IllegalArgumentException illegalArgumentException)
/*   6 */     { throw a(null); }  return (paramLong1 > a(paramArrayOfObject)) ? c(paramArrayOfObject, paramLong1, paramLong2) : paramArrayOfObject; } @Deprecated
/*   7 */   public static void a(Object[][] paramArrayOfObject, Object paramObject) { int i = paramArrayOfObject.length; try { for (; i-- != 0; Arrays.fill(paramArrayOfObject[i], paramObject)); } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/*     */      }
/*     */    @Deprecated
/*     */   public static Object[][] a(Object[][] paramArrayOfObject) {
/*  11 */     return k.b(paramArrayOfObject);
/*     */   } public static void a(Object[][] paramArrayOfObject, long paramLong1, long paramLong2, Comparator paramComparator) {
/*  13 */     ForkJoinPool forkJoinPool = a();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 155 */     try { if (paramLong2 - paramLong1 >= 8192L) { try { if (forkJoinPool.getParallelism() == 1) { c(paramArrayOfObject, paramLong1, paramLong2, paramComparator); return; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  forkJoinPool.invoke(new in(paramArrayOfObject, paramLong1, paramLong2, paramComparator)); return; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  c(paramArrayOfObject, paramLong1, paramLong2, paramComparator);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void b(Object[][] paramArrayOfObject, Comparator paramComparator) {
/*     */     a(paramArrayOfObject, 0L, k.a(paramArrayOfObject), paramComparator);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static long a(Object[][] paramArrayOfObject, long paramLong1, long paramLong2, Object paramObject, Comparator<Object> paramComparator) {
/*     */     paramLong2--;
/*     */     while (paramLong1 <= paramLong2) {
/*     */       long l = paramLong1 + paramLong2 >>> 1L;
/*     */       Object object = k.a(paramArrayOfObject, l);
/*     */       int i = paramComparator.compare(object, paramObject);
/*     */       if (i < 0) {
/*     */         paramLong1 = l + 1L;
/*     */         continue;
/*     */       } 
/*     */       if (i > 0) {
/*     */         paramLong2 = l - 1L;
/*     */         continue;
/*     */       } 
/*     */       return l;
/*     */     } 
/*     */     return -(paramLong1 + 1L);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static Object[][] a(long paramLong) {
/*     */     try {
/*     */       if (paramLong == 0L) {
/*     */         return e;
/*     */       }
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     k.a(paramLong);
/* 196 */     int i = (int)(paramLong + 134217727L >>> 27L); Object[][] arrayOfObject = new Object[i][]; int j = (int)(paramLong & 0x7FFFFFFL); if (j != 0) { byte b1 = 0; try { while (b1 < i - 1) { arrayOfObject[b1] = new Object[134217728]; b1++; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  }  byte b = 0; try { while (b < i) { arrayOfObject[b] = new Object[134217728]; b++; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return arrayOfObject;
/*     */   } @Deprecated public static void a(Object[][] paramArrayOfObject1, long paramLong1, Object[][] paramArrayOfObject2, long paramLong2, long paramLong3) { k.a(paramArrayOfObject1, paramLong1, paramArrayOfObject2, paramLong2, paramLong3); } @Deprecated public static void a(Object[][] paramArrayOfObject, long paramLong, Object[] paramArrayOfObject1, int paramInt1, int paramInt2) { k.a(paramArrayOfObject, paramLong, paramArrayOfObject1, paramInt1, paramInt2); }
/*     */   private static long b(Object[][] paramArrayOfObject, long paramLong1, long paramLong2, long paramLong3, Comparator<Object> paramComparator) { int i = paramComparator.compare(k.a(paramArrayOfObject, paramLong1), k.a(paramArrayOfObject, paramLong2)); int j = paramComparator.compare(k.a(paramArrayOfObject, paramLong1), k.a(paramArrayOfObject, paramLong3)); int k = paramComparator.compare(k.a(paramArrayOfObject, paramLong2), k.a(paramArrayOfObject, paramLong3)); try { if (i < 0) { try { try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  } else { try { try {  }
/* 199 */           catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return (k > 0) ? paramLong2 : ((j > 0) ? paramLong3 : paramLong1); }
/*     */   @Deprecated public static Object[][] a(Object[][] paramArrayOfObject, long paramLong1, long paramLong2) { return k.b(paramArrayOfObject, paramLong1, paramLong2); }
/*     */   @Deprecated public static Object[][] d(Object[][] paramArrayOfObject, long paramLong1, long paramLong2) { long l = a(paramArrayOfObject); try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return (paramLong1 > l) ? b(paramArrayOfObject, Math.max(l + (l >> 1L), paramLong1), paramLong2) : paramArrayOfObject; } public static Object[][] a(Class<Object[]> paramClass, long paramLong) { try { if (paramLong == 0L) try { if (paramClass == Object[].class) return e;  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }   } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  k.a(paramLong); int i = (int)(paramLong + 134217727L >>> 27L); Object[][] arrayOfObject = (Object[][])Array.newInstance(paramClass, i); int j = (int)(paramLong & 0x7FFFFFFL); if (j != 0) { byte b1 = 0; try { while (b1 < i - 1) { arrayOfObject[b1] = (Object[])Array.newInstance(paramClass.getComponentType(), 134217728); b1++; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  arrayOfObject[i - 1] = (Object[])Array.newInstance(paramClass.getComponentType(), j); }  byte b = 0; try { while (b < i) { arrayOfObject[b] = (Object[])Array.newInstance(paramClass.getComponentType(), 134217728); b++; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return arrayOfObject; } @Deprecated public static Object[][] d(Object[][] paramArrayOfObject, long paramLong) { return k.d(paramArrayOfObject, paramLong); } @Deprecated public static void a(Object[][] paramArrayOfObject1, Object[][] paramArrayOfObject2) { // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/ie.g : J
/*     */     //   3: ldc2_w 29209256277492
/*     */     //   6: lxor
/*     */     //   7: lstore_2
/*     */     //   8: aload_0
/*     */     //   9: invokestatic a : ([[Ljava/lang/Object;)J
/*     */     //   12: aload_1
/*     */     //   13: invokestatic a : ([[Ljava/lang/Object;)J
/*     */     //   16: lcmp
/*     */     //   17: ifeq -> 117
/*     */     //   20: new java/lang/IllegalArgumentException
/*     */     //   23: dup
/*     */     //   24: new java/lang/StringBuilder
/*     */     //   27: dup
/*     */     //   28: invokespecial <init> : ()V
/*     */     //   31: ldc '䥮䧐?嶎ꈡ佻䲄᎖㭕ヂ廵퍡﹆ǯ堌糥ቸᏳ⫩㏄'
/*     */     //   33: invokevirtual toCharArray : ()[C
/*     */     //   36: dup
/*     */     //   37: dup
/*     */     //   38: bipush #12
/*     */     //   40: dup_x1
/*     */     //   41: caload
/*     */     //   42: sipush #12363
/*     */     //   45: ixor
/*     */     //   46: i2c
/*     */     //   47: castore
/*     */     //   48: sipush #18393
/*     */     //   51: iconst_4
/*     */     //   52: iconst_0
/*     */     //   53: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*     */     //   56: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   59: aload_0
/*     */     //   60: invokestatic a : ([[Ljava/lang/Object;)J
/*     */     //   63: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*     */     //   66: ldc '澸厅팀뷛縗'
/*     */     //   68: invokevirtual toCharArray : ()[C
/*     */     //   71: dup
/*     */     //   72: dup
/*     */     //   73: iconst_1
/*     */     //   74: dup_x1
/*     */     //   75: caload
/*     */     //   76: sipush #30539
/*     */     //   79: ixor
/*     */     //   80: i2c
/*     */     //   81: castore
/*     */     //   82: sipush #20178
/*     */     //   85: iconst_0
/*     */     //   86: iconst_1
/*     */     //   87: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*     */     //   90: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   93: aload_1
/*     */     //   94: invokestatic a : ([[Ljava/lang/Object;)J
/*     */     //   97: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*     */     //   100: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   103: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   106: athrow
/*     */     //   107: ldc2_w 3784624999447773376
/*     */     //   110: lload_2
/*     */     //   111: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   116: athrow
/*     */     //   117: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #68	-> 8
/*     */     //   #197	-> 117
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   8	107	107	java/lang/IllegalArgumentException } public static void a(Object[][] paramArrayOfObject, Comparator paramComparator) { c(paramArrayOfObject, 0L, k.a(paramArrayOfObject), paramComparator); } public static void a(Object[][] paramArrayOfObject, long paramLong1, long paramLong2) { ForkJoinPool forkJoinPool = a(); try { if (paramLong2 - paramLong1 >= 8192L) { try { if (forkJoinPool.getParallelism() == 1) { f(paramArrayOfObject, paramLong1, paramLong2); return; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  forkJoinPool.invoke(new eR(paramArrayOfObject, paramLong1, paramLong2)); return; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  f(paramArrayOfObject, paramLong1, paramLong2); } public static void b(Object[][] paramArrayOfObject) { f(paramArrayOfObject, 0L, k.a(paramArrayOfObject)); } private static void b(Object[][] paramArrayOfObject, long paramLong1, long paramLong2, long paramLong3) { for (byte b = 0; b < paramLong3; ) { k.c(paramArrayOfObject, paramLong1, paramLong2); b++; paramLong1++; paramLong2++; }  } private static long b(Object[][] paramArrayOfObject, long paramLong1, long paramLong2, long paramLong3) { int i = ((Comparable<Object>)k.a(paramArrayOfObject, paramLong1)).compareTo(k.a(paramArrayOfObject, paramLong2)); int j = ((Comparable<Object>)k.a(paramArrayOfObject, paramLong1)).compareTo(k.a(paramArrayOfObject, paramLong3)); int k = ((Comparable<Object>)k.a(paramArrayOfObject, paramLong2)).compareTo(k.a(paramArrayOfObject, paramLong3)); try { if (i < 0) { try { try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  } else { try { try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return (k > 0) ? paramLong2 : ((j > 0) ? paramLong3 : paramLong1); } @Deprecated public static Object[][] e(Object[][] paramArrayOfObject, long paramLong) { return k.b(paramArrayOfObject, paramLong); } public static void c(Object[][] paramArrayOfObject, long paramLong1, long paramLong2, Comparator paramComparator) { // Byte code:
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
/*     */     //   19: invokestatic b : ([[Ljava/lang/Object;JJLjava/util/Comparator;)V
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
/*     */     //   90: invokestatic b : ([[Ljava/lang/Object;JJJLjava/util/Comparator;)J
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
/*     */     //   110: invokestatic b : ([[Ljava/lang/Object;JJJLjava/util/Comparator;)J
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
/*     */     //   134: invokestatic b : ([[Ljava/lang/Object;JJJLjava/util/Comparator;)J
/*     */     //   137: lstore #12
/*     */     //   139: aload_0
/*     */     //   140: lload #10
/*     */     //   142: lload #8
/*     */     //   144: lload #12
/*     */     //   146: aload #5
/*     */     //   148: invokestatic b : ([[Ljava/lang/Object;JJJLjava/util/Comparator;)J
/*     */     //   151: lstore #8
/*     */     //   153: aload_0
/*     */     //   154: lload #8
/*     */     //   156: invokestatic a : ([[Ljava/lang/Object;J)Ljava/lang/Object;
/*     */     //   159: astore #10
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
/*     */     //   190: invokestatic a : ([[Ljava/lang/Object;J)Ljava/lang/Object;
/*     */     //   193: aload #10
/*     */     //   195: invokeinterface compare : (Ljava/lang/Object;Ljava/lang/Object;)I
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
/*     */     //   228: invokestatic c : ([[Ljava/lang/Object;JJ)V
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
/*     */     //   253: invokestatic a : ([[Ljava/lang/Object;J)Ljava/lang/Object;
/*     */     //   256: aload #10
/*     */     //   258: invokeinterface compare : (Ljava/lang/Object;Ljava/lang/Object;)I
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
/*     */     //   291: invokestatic c : ([[Ljava/lang/Object;JJ)V
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
/*     */     //   333: invokestatic c : ([[Ljava/lang/Object;JJ)V
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
/*     */     //   365: invokestatic b : ([[Ljava/lang/Object;JJJ)V
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
/*     */     //   395: invokestatic b : ([[Ljava/lang/Object;JJJ)V
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
/*     */     //   419: invokestatic c : ([[Ljava/lang/Object;JJLjava/util/Comparator;)V
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
/*     */     //   452: invokestatic c : ([[Ljava/lang/Object;JJLjava/util/Comparator;)V
/*     */     //   455: goto -> 462
/*     */     //   458: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   461: athrow
/*     */     //   462: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #88	-> 0
/*     */     //   #114	-> 5
/*     */     //   #4	-> 14
/*     */     //   #23	-> 22
/*     */     //   #128	-> 27
/*     */     //   #25	-> 37
/*     */     //   #32	-> 46
/*     */     //   #103	-> 49
/*     */     //   #111	-> 54
/*     */     //   #89	-> 63
/*     */     //   #64	-> 71
/*     */     //   #132	-> 95
/*     */     //   #179	-> 115
/*     */     //   #180	-> 139
/*     */     //   #26	-> 153
/*     */     //   #54	-> 161
/*     */     //   #93	-> 177
/*     */     //   #58	-> 206
/*     */     //   #90	-> 231
/*     */     //   #84	-> 240
/*     */     //   #186	-> 269
/*     */     //   #99	-> 294
/*     */     //   #92	-> 303
/*     */     //   #135	-> 318
/*     */     //   #95	-> 339
/*     */     //   #162	-> 342
/*     */     //   #166	-> 356
/*     */     //   #131	-> 368
/*     */     //   #153	-> 385
/*     */     //   #34	-> 398
/*     */     //   #161	-> 429
/*     */     //   #189	-> 462
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   5	23	23	java/lang/IllegalArgumentException
/*     */     //   203	211	214	java/lang/IllegalArgumentException
/*     */     //   266	274	277	java/lang/IllegalArgumentException
/*     */     //   303	314	314	java/lang/IllegalArgumentException
/*     */     //   406	422	425	java/lang/IllegalArgumentException
/* 201 */     //   437	455	458	java/lang/IllegalArgumentException } @Deprecated public static boolean a(Object[][] paramArrayOfObject1, Object[][] paramArrayOfObject2) { return k.a(paramArrayOfObject1, paramArrayOfObject2); } public static long a(Object[][] paramArrayOfObject, Object paramObject) { return a(paramArrayOfObject, 0L, k.a(paramArrayOfObject), paramObject); } @Deprecated public static String a(Object[][] paramArrayOfObject) { return k.a(paramArrayOfObject); } @Deprecated public static Object[][] c(Object[][] paramArrayOfObject, long paramLong) { long l = a(paramArrayOfObject); try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return (paramLong > l) ? d(paramArrayOfObject, paramLong, l) : paramArrayOfObject; } public static long a(Object[][] paramArrayOfObject, long paramLong1, long paramLong2, Object paramObject) { paramLong2--; while (paramLong1 <= paramLong2) { long l = paramLong1 + paramLong2 >>> 1L; Object object = k.a(paramArrayOfObject, l); int i = ((Comparable<Object>)object).compareTo(paramObject); if (i < 0) paramLong1 = l + 1L;  }  return -(paramLong1 + 1L); } @Deprecated public static void b(Object[][] paramArrayOfObject, long paramLong1, long paramLong2) { k.a(a(paramArrayOfObject), paramLong1, paramLong2); } private static final long g = nc.a(2358817526719884840L, -1669439314248281080L, MethodHandles.lookup().lookupClass()).a(207107854491444L); @Deprecated public static long a(Object[][] paramArrayOfObject) { int i = paramArrayOfObject.length; try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return (i == 0) ? 0L : (k.a(i - 1) + (paramArrayOfObject[i - 1]).length); } @Deprecated public static void d(Object[][] paramArrayOfObject, long paramLong1, long paramLong2) { Object object = paramArrayOfObject[k.b(paramLong1)][k.a(paramLong1)]; paramArrayOfObject[k.b(paramLong1)][k.a(paramLong1)] = paramArrayOfObject[k.b(paramLong2)][k.a(paramLong2)]; paramArrayOfObject[k.b(paramLong2)][k.a(paramLong2)] = object; } private static void c(Object[][] paramArrayOfObject, long paramLong1, long paramLong2) { long l; for (l = paramLong1; l < paramLong2 - 1L; l++) { long l1 = l; long l2 = l + 1L; while (true) { try { if (l2 < paramLong2) { if (((Comparable<Object>)k.a(paramArrayOfObject, l2)).compareTo(k.a(paramArrayOfObject, l1)) < 0) l1 = l2;  l2++; continue; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  try { if (l1 != l) k.c(paramArrayOfObject, l, l1);  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  break; }  }  } public static Object[][] a(Object[][] paramArrayOfObject, long paramLong1, long paramLong2, Random paramRandom) { return k.a(paramArrayOfObject, paramLong1, paramLong2, paramRandom); } public static Object[][] a(Object[][] paramArrayOfObject, long paramLong) { return a(paramArrayOfObject.getClass().getComponentType(), paramLong); } @Deprecated public static void a(Object[][] paramArrayOfObject, long paramLong1, long paramLong2, Object paramObject) { k.a(paramArrayOfObject, paramLong1, paramLong2, paramObject); } @Deprecated public static void a(Object[][] paramArrayOfObject, long paramLong, Object paramObject) { paramArrayOfObject[k.b(paramLong)][k.a(paramLong)] = paramObject; } public static void f(Object[][] paramArrayOfObject, long paramLong1, long paramLong2) { // Byte code:
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
/*     */     //   17: invokestatic c : ([[Ljava/lang/Object;JJ)V
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
/*     */     //   86: invokestatic b : ([[Ljava/lang/Object;JJJ)J
/*     */     //   89: lstore #9
/*     */     //   91: aload_0
/*     */     //   92: lload #7
/*     */     //   94: lload #13
/*     */     //   96: lsub
/*     */     //   97: lload #7
/*     */     //   99: lload #7
/*     */     //   101: lload #13
/*     */     //   103: ladd
/*     */     //   104: invokestatic b : ([[Ljava/lang/Object;JJJ)J
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
/*     */     //   126: invokestatic b : ([[Ljava/lang/Object;JJJ)J
/*     */     //   129: lstore #11
/*     */     //   131: aload_0
/*     */     //   132: lload #9
/*     */     //   134: lload #7
/*     */     //   136: lload #11
/*     */     //   138: invokestatic b : ([[Ljava/lang/Object;JJJ)J
/*     */     //   141: lstore #7
/*     */     //   143: aload_0
/*     */     //   144: lload #7
/*     */     //   146: invokestatic a : ([[Ljava/lang/Object;J)Ljava/lang/Object;
/*     */     //   149: astore #9
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
/*     */     //   172: ifgt -> 231
/*     */     //   175: aload_0
/*     */     //   176: lload #12
/*     */     //   178: invokestatic a : ([[Ljava/lang/Object;J)Ljava/lang/Object;
/*     */     //   181: checkcast java/lang/Comparable
/*     */     //   184: aload #9
/*     */     //   186: invokeinterface compareTo : (Ljava/lang/Object;)I
/*     */     //   191: dup
/*     */     //   192: istore #18
/*     */     //   194: ifgt -> 231
/*     */     //   197: iload #18
/*     */     //   199: ifne -> 222
/*     */     //   202: goto -> 209
/*     */     //   205: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   208: athrow
/*     */     //   209: aload_0
/*     */     //   210: lload #10
/*     */     //   212: dup2
/*     */     //   213: lconst_1
/*     */     //   214: ladd
/*     */     //   215: lstore #10
/*     */     //   217: lload #12
/*     */     //   219: invokestatic c : ([[Ljava/lang/Object;JJ)V
/*     */     //   222: lload #12
/*     */     //   224: lconst_1
/*     */     //   225: ladd
/*     */     //   226: lstore #12
/*     */     //   228: goto -> 167
/*     */     //   231: lload #14
/*     */     //   233: lload #12
/*     */     //   235: lcmp
/*     */     //   236: iflt -> 295
/*     */     //   239: aload_0
/*     */     //   240: lload #14
/*     */     //   242: invokestatic a : ([[Ljava/lang/Object;J)Ljava/lang/Object;
/*     */     //   245: checkcast java/lang/Comparable
/*     */     //   248: aload #9
/*     */     //   250: invokeinterface compareTo : (Ljava/lang/Object;)I
/*     */     //   255: dup
/*     */     //   256: istore #18
/*     */     //   258: iflt -> 295
/*     */     //   261: iload #18
/*     */     //   263: ifne -> 286
/*     */     //   266: goto -> 273
/*     */     //   269: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   272: athrow
/*     */     //   273: aload_0
/*     */     //   274: lload #14
/*     */     //   276: lload #16
/*     */     //   278: dup2
/*     */     //   279: lconst_1
/*     */     //   280: lsub
/*     */     //   281: lstore #16
/*     */     //   283: invokestatic c : ([[Ljava/lang/Object;JJ)V
/*     */     //   286: lload #14
/*     */     //   288: lconst_1
/*     */     //   289: lsub
/*     */     //   290: lstore #14
/*     */     //   292: goto -> 231
/*     */     //   295: lload #12
/*     */     //   297: lload #14
/*     */     //   299: lcmp
/*     */     //   300: ifle -> 310
/*     */     //   303: goto -> 331
/*     */     //   306: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   309: athrow
/*     */     //   310: aload_0
/*     */     //   311: lload #12
/*     */     //   313: dup2
/*     */     //   314: lconst_1
/*     */     //   315: ladd
/*     */     //   316: lstore #12
/*     */     //   318: lload #14
/*     */     //   320: dup2
/*     */     //   321: lconst_1
/*     */     //   322: lsub
/*     */     //   323: lstore #14
/*     */     //   325: invokestatic c : ([[Ljava/lang/Object;JJ)V
/*     */     //   328: goto -> 167
/*     */     //   331: lload_3
/*     */     //   332: lstore #20
/*     */     //   334: lload #10
/*     */     //   336: lload_1
/*     */     //   337: lsub
/*     */     //   338: lload #12
/*     */     //   340: lload #10
/*     */     //   342: lsub
/*     */     //   343: invokestatic min : (JJ)J
/*     */     //   346: lstore #18
/*     */     //   348: aload_0
/*     */     //   349: lload_1
/*     */     //   350: lload #12
/*     */     //   352: lload #18
/*     */     //   354: lsub
/*     */     //   355: lload #18
/*     */     //   357: invokestatic b : ([[Ljava/lang/Object;JJJ)V
/*     */     //   360: lload #16
/*     */     //   362: lload #14
/*     */     //   364: lsub
/*     */     //   365: lload #20
/*     */     //   367: lload #16
/*     */     //   369: lsub
/*     */     //   370: lconst_1
/*     */     //   371: lsub
/*     */     //   372: invokestatic min : (JJ)J
/*     */     //   375: lstore #18
/*     */     //   377: aload_0
/*     */     //   378: lload #12
/*     */     //   380: lload #20
/*     */     //   382: lload #18
/*     */     //   384: lsub
/*     */     //   385: lload #18
/*     */     //   387: invokestatic b : ([[Ljava/lang/Object;JJJ)V
/*     */     //   390: lload #12
/*     */     //   392: lload #10
/*     */     //   394: lsub
/*     */     //   395: dup2
/*     */     //   396: lstore #18
/*     */     //   398: lconst_1
/*     */     //   399: lcmp
/*     */     //   400: ifle -> 419
/*     */     //   403: aload_0
/*     */     //   404: lload_1
/*     */     //   405: lload_1
/*     */     //   406: lload #18
/*     */     //   408: ladd
/*     */     //   409: invokestatic f : ([[Ljava/lang/Object;JJ)V
/*     */     //   412: goto -> 419
/*     */     //   415: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   418: athrow
/*     */     //   419: lload #16
/*     */     //   421: lload #14
/*     */     //   423: lsub
/*     */     //   424: dup2
/*     */     //   425: lstore #18
/*     */     //   427: lconst_1
/*     */     //   428: lcmp
/*     */     //   429: ifle -> 450
/*     */     //   432: aload_0
/*     */     //   433: lload #20
/*     */     //   435: lload #18
/*     */     //   437: lsub
/*     */     //   438: lload #20
/*     */     //   440: invokestatic f : ([[Ljava/lang/Object;JJ)V
/*     */     //   443: goto -> 450
/*     */     //   446: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   449: athrow
/*     */     //   450: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #148	-> 0
/*     */     //   #119	-> 5
/*     */     //   #113	-> 14
/*     */     //   #145	-> 20
/*     */     //   #10	-> 25
/*     */     //   #77	-> 35
/*     */     //   #169	-> 44
/*     */     //   #17	-> 47
/*     */     //   #59	-> 52
/*     */     //   #61	-> 61
/*     */     //   #15	-> 69
/*     */     //   #56	-> 91
/*     */     //   #57	-> 109
/*     */     //   #40	-> 131
/*     */     //   #126	-> 143
/*     */     //   #70	-> 151
/*     */     //   #164	-> 167
/*     */     //   #104	-> 197
/*     */     //   #24	-> 222
/*     */     //   #149	-> 231
/*     */     //   #187	-> 261
/*     */     //   #97	-> 286
/*     */     //   #44	-> 295
/*     */     //   #156	-> 310
/*     */     //   #108	-> 331
/*     */     //   #130	-> 334
/*     */     //   #1	-> 348
/*     */     //   #129	-> 360
/*     */     //   #12	-> 377
/*     */     //   #96	-> 390
/*     */     //   #174	-> 419
/*     */     //   #53	-> 450
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   5	21	21	java/lang/IllegalArgumentException
/*     */     //   194	202	205	java/lang/IllegalArgumentException
/*     */     //   258	266	269	java/lang/IllegalArgumentException
/*     */     //   295	306	306	java/lang/IllegalArgumentException
/*     */     //   398	412	415	java/lang/IllegalArgumentException
/* 201 */     //   427	443	446	java/lang/IllegalArgumentException } public static long a(Object[][] paramArrayOfObject, Object paramObject, Comparator paramComparator) { return a(paramArrayOfObject, 0L, k.a(paramArrayOfObject), paramObject, paramComparator); } @Deprecated public static void e(Object[][] paramArrayOfObject, long paramLong1, long paramLong2) { k.b(a(paramArrayOfObject), paramLong1, paramLong2); } @Deprecated public static Object[][] b(Object[][] paramArrayOfObject, long paramLong) { return b(paramArrayOfObject, paramLong, a(paramArrayOfObject)); } private static void b(Object[][] paramArrayOfObject, long paramLong1, long paramLong2, Comparator<Object> paramComparator) { for (long l = paramLong1; l < paramLong2 - 1L; ) { long l1 = l; long l2 = l + 1L; while (true) { try { if (l2 < paramLong2) { if (paramComparator.compare(k.a(paramArrayOfObject, l2), k.a(paramArrayOfObject, l1)) < 0) l1 = l2;  l2++; continue; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  try { if (l1 != l) k.c(paramArrayOfObject, l, l1);  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  break; }  }  } private static ForkJoinPool a() { ForkJoinPool forkJoinPool = ForkJoinTask.getPool(); try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return (forkJoinPool == null) ? ForkJoinPool.commonPool() : forkJoinPool; } @Deprecated public static void a(Object[] paramArrayOfObject, int paramInt, Object[][] paramArrayOfObject1, long paramLong1, long paramLong2) { k.a(paramArrayOfObject, paramInt, paramArrayOfObject1, paramLong1, paramLong2); } public static Object[][] a(Object[][] paramArrayOfObject, Random paramRandom) { return k.a(paramArrayOfObject, paramRandom); } @Deprecated public static Object a(Object[][] paramArrayOfObject, long paramLong) { return paramArrayOfObject[k.b(paramLong)][k.a(paramLong)]; } public static void a(Object[][] paramArrayOfObject) { a(paramArrayOfObject, 0L, k.a(paramArrayOfObject)); } @Deprecated public static Object[][] a(Object[] paramArrayOfObject) { return k.a(paramArrayOfObject); } static { e = new Object[0][];
/*     */     d = new Object[0][];
/*     */     c = new j7(null); }
/*     */ 
/*     */   
/*     */   private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
/*     */     return paramIllegalArgumentException;
/*     */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ie.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */