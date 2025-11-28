/*     */ package me.konsolas.aac;public final class du { public static final char[] n; public static final char[] m; private static final int c = 16; private static final int e = 8192; private static final int j = 128; private static final int d = 16; private static final int a = 8; private static final int i = 255; private static final int g = 2; private static final int l = 1024;
/*     */   private static final int o = 1024;
/*     */   static final int f = 2000;
/*     */   protected static final a7 b;
/*     */   public static final m9 h;
/*     */   private static int k;
/*     */   private static final long p;
/*     */   
/*     */   public static void e(char[] paramArrayOfchar, int paramInt1, int paramInt2, jS paramjS) {
/*  10 */     ForkJoinPool forkJoinPool = a();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 235 */       if (paramInt2 - paramInt1 >= 8192) { try { if (forkJoinPool.getParallelism() == 1) { g(paramArrayOfchar, paramInt1, paramInt2, paramjS); return; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 831 */         forkJoinPool.invoke(new kh(paramArrayOfchar, paramInt1, paramInt2, paramjS));
/*     */         return; }
/*     */     
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     g(paramArrayOfchar, paramInt1, paramInt2, paramjS);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void a(int[] paramArrayOfint, char[] paramArrayOfchar1, char[] paramArrayOfchar2, int paramInt1, int paramInt2) {
/*     */     for (int i = paramInt1; ++i < paramInt2; ) {
/*     */       int j = paramArrayOfint[i];
/*     */       int k = i;
/*     */       continue;
/*     */       j = paramArrayOfint[SYNTHETIC_LOCAL_VARIABLE_7 - 1];
/*     */       while (true) {
/*     */         SYNTHETIC_LOCAL_VARIABLE_7--;
/*     */         break;
/*     */       } 
/*     */       paramArrayOfint[SYNTHETIC_LOCAL_VARIABLE_7] = SYNTHETIC_LOCAL_VARIABLE_6;
/*     */     } 
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void g(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
/*     */     for (int i = paramInt1; i < paramInt2 - 1; i++)
/*     */     { int j = i;
/*     */       int k = i + 1;
/*     */       while (true) {
/*     */         try {
/*     */           if (k < paramInt2) {
/*     */             if (paramArrayOfchar[k] < paramArrayOfchar[j]) {
/*     */               j = k;
/*     */             }
/*     */             k++;
/*     */             continue;
/*     */           } 
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw a(null);
/*     */         } 
/*     */         break;
/*     */       } 
/*     */       if (j != i)
/*     */       { k = paramArrayOfchar[i];
/*     */         paramArrayOfchar[i] = paramArrayOfchar[j];
/* 925 */         paramArrayOfchar[j] = k; }  } 
/*     */   } public static void a(char[][] paramArrayOfchar, int paramInt1, int paramInt2) { // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/du.p : J
/*     */     //   3: ldc2_w 83107576978282
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
/*     */     //   21: invokestatic a : ([[CIII)V
/*     */     //   24: return
/*     */     //   25: ldc2_w -554695718627976501
/*     */     //   28: lload_3
/*     */     //   29: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   34: athrow
/*     */     //   35: aload_0
/*     */     //   36: arraylength
/*     */     //   37: istore #5
/*     */     //   39: iconst_2
/*     */     //   40: iload #5
/*     */     //   42: imul
/*     */     //   43: iconst_1
/*     */     //   44: isub
/*     */     //   45: istore #6
/*     */     //   47: iload #5
/*     */     //   49: istore #7
/*     */     //   51: aload_0
/*     */     //   52: iconst_0
/*     */     //   53: aaload
/*     */     //   54: arraylength
/*     */     //   55: istore #8
/*     */     //   57: iload #7
/*     */     //   59: iinc #7, -1
/*     */     //   62: ifeq -> 156
/*     */     //   65: aload_0
/*     */     //   66: iload #7
/*     */     //   68: aaload
/*     */     //   69: arraylength
/*     */     //   70: iload #8
/*     */     //   72: if_icmpeq -> 57
/*     */     //   75: new java/lang/IllegalArgumentException
/*     */     //   78: dup
/*     */     //   79: new java/lang/StringBuilder
/*     */     //   82: dup
/*     */     //   83: invokespecial <init> : ()V
/*     */     //   86: ldc_w '戩쉺೫∧䈘ꫩ쬯樣川ꦼ쀰⋴褒滇㙮忟'
/*     */     //   89: invokevirtual toCharArray : ()[C
/*     */     //   92: dup
/*     */     //   93: dup
/*     */     //   94: bipush #15
/*     */     //   96: dup_x1
/*     */     //   97: caload
/*     */     //   98: sipush #16213
/*     */     //   101: ixor
/*     */     //   102: i2c
/*     */     //   103: castore
/*     */     //   104: sipush #30300
/*     */     //   107: iconst_0
/*     */     //   108: iconst_4
/*     */     //   109: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   112: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   115: iload #7
/*     */     //   117: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   120: ldc_w '챳苵稇֖䦫⌄ߓ졚২藇㙒㓓꠨䘺䨂৭鸿禤閼锱䠄诂쥋醽❔鍲㰻♢ᑬᘐ澾냦혻䴛콒;ᦸﶁ䙦㷸꽟褂弽'
/*     */     //   123: invokevirtual toCharArray : ()[C
/*     */     //   126: dup
/*     */     //   127: dup
/*     */     //   128: bipush #34
/*     */     //   130: dup_x1
/*     */     //   131: caload
/*     */     //   132: sipush #26219
/*     */     //   135: ixor
/*     */     //   136: i2c
/*     */     //   137: castore
/*     */     //   138: sipush #20579
/*     */     //   141: iconst_0
/*     */     //   142: iconst_0
/*     */     //   143: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*     */     //   146: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   149: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   152: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   155: athrow
/*     */     //   156: sipush #255
/*     */     //   159: iload #5
/*     */     //   161: iconst_2
/*     */     //   162: imul
/*     */     //   163: iconst_1
/*     */     //   164: isub
/*     */     //   165: imul
/*     */     //   166: iconst_1
/*     */     //   167: iadd
/*     */     //   168: istore #7
/*     */     //   170: iconst_0
/*     */     //   171: istore #8
/*     */     //   173: iload #7
/*     */     //   175: newarray int
/*     */     //   177: astore #9
/*     */     //   179: iload #7
/*     */     //   181: newarray int
/*     */     //   183: astore #10
/*     */     //   185: iload #7
/*     */     //   187: newarray int
/*     */     //   189: astore #11
/*     */     //   191: aload #9
/*     */     //   193: iload #8
/*     */     //   195: iload_1
/*     */     //   196: iastore
/*     */     //   197: aload #10
/*     */     //   199: iload #8
/*     */     //   201: iload_2
/*     */     //   202: iload_1
/*     */     //   203: isub
/*     */     //   204: iastore
/*     */     //   205: aload #11
/*     */     //   207: iload #8
/*     */     //   209: iinc #8, 1
/*     */     //   212: iconst_0
/*     */     //   213: iastore
/*     */     //   214: sipush #256
/*     */     //   217: newarray int
/*     */     //   219: astore #12
/*     */     //   221: sipush #256
/*     */     //   224: newarray int
/*     */     //   226: astore #13
/*     */     //   228: iload #5
/*     */     //   230: newarray char
/*     */     //   232: astore #14
/*     */     //   234: iload #8
/*     */     //   236: ifle -> 740
/*     */     //   239: aload #9
/*     */     //   241: iinc #8, -1
/*     */     //   244: iload #8
/*     */     //   246: iaload
/*     */     //   247: istore #15
/*     */     //   249: aload #10
/*     */     //   251: iload #8
/*     */     //   253: iaload
/*     */     //   254: istore #16
/*     */     //   256: aload #11
/*     */     //   258: iload #8
/*     */     //   260: iaload
/*     */     //   261: istore #17
/*     */     //   263: iconst_0
/*     */     //   264: istore #18
/*     */     //   266: aload_0
/*     */     //   267: iload #17
/*     */     //   269: iconst_2
/*     */     //   270: idiv
/*     */     //   271: aaload
/*     */     //   272: astore #19
/*     */     //   274: iconst_1
/*     */     //   275: iload #17
/*     */     //   277: iconst_2
/*     */     //   278: irem
/*     */     //   279: isub
/*     */     //   280: bipush #8
/*     */     //   282: imul
/*     */     //   283: istore #20
/*     */     //   285: iload #15
/*     */     //   287: iload #16
/*     */     //   289: iadd
/*     */     //   290: istore #21
/*     */     //   292: iload #21
/*     */     //   294: iinc #21, -1
/*     */     //   297: iload #15
/*     */     //   299: if_icmpeq -> 336
/*     */     //   302: aload #12
/*     */     //   304: aload #19
/*     */     //   306: iload #21
/*     */     //   308: caload
/*     */     //   309: iload #20
/*     */     //   311: iushr
/*     */     //   312: sipush #255
/*     */     //   315: iand
/*     */     //   316: iconst_0
/*     */     //   317: ixor
/*     */     //   318: dup2
/*     */     //   319: iaload
/*     */     //   320: iconst_1
/*     */     //   321: iadd
/*     */     //   322: iastore
/*     */     //   323: goto -> 292
/*     */     //   326: ldc2_w -554695718627976501
/*     */     //   329: lload_3
/*     */     //   330: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   335: athrow
/*     */     //   336: iconst_m1
/*     */     //   337: istore #21
/*     */     //   339: iconst_0
/*     */     //   340: istore #22
/*     */     //   342: iload #15
/*     */     //   344: istore #23
/*     */     //   346: iload #22
/*     */     //   348: sipush #256
/*     */     //   351: if_icmpge -> 401
/*     */     //   354: aload #12
/*     */     //   356: iload #22
/*     */     //   358: iaload
/*     */     //   359: ifeq -> 379
/*     */     //   362: goto -> 375
/*     */     //   365: ldc2_w -554695718627976501
/*     */     //   368: lload_3
/*     */     //   369: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   374: athrow
/*     */     //   375: iload #22
/*     */     //   377: istore #21
/*     */     //   379: aload #13
/*     */     //   381: iload #22
/*     */     //   383: iload #23
/*     */     //   385: aload #12
/*     */     //   387: iload #22
/*     */     //   389: iaload
/*     */     //   390: iadd
/*     */     //   391: dup
/*     */     //   392: istore #23
/*     */     //   394: iastore
/*     */     //   395: iinc #22, 1
/*     */     //   398: goto -> 346
/*     */     //   401: iload #15
/*     */     //   403: iload #16
/*     */     //   405: iadd
/*     */     //   406: aload #12
/*     */     //   408: iload #21
/*     */     //   410: iaload
/*     */     //   411: isub
/*     */     //   412: istore #22
/*     */     //   414: iload #15
/*     */     //   416: istore #23
/*     */     //   418: iconst_m1
/*     */     //   419: istore #24
/*     */     //   421: iload #23
/*     */     //   423: iload #22
/*     */     //   425: if_icmpgt -> 737
/*     */     //   428: iload #5
/*     */     //   430: istore #26
/*     */     //   432: iload #26
/*     */     //   434: iinc #26, -1
/*     */     //   437: ifeq -> 465
/*     */     //   440: aload #14
/*     */     //   442: iload #26
/*     */     //   444: aload_0
/*     */     //   445: iload #26
/*     */     //   447: aaload
/*     */     //   448: iload #23
/*     */     //   450: caload
/*     */     //   451: castore
/*     */     //   452: goto -> 432
/*     */     //   455: ldc2_w -554695718627976501
/*     */     //   458: lload_3
/*     */     //   459: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   464: athrow
/*     */     //   465: aload #19
/*     */     //   467: iload #23
/*     */     //   469: caload
/*     */     //   470: iload #20
/*     */     //   472: iushr
/*     */     //   473: sipush #255
/*     */     //   476: iand
/*     */     //   477: iconst_0
/*     */     //   478: ixor
/*     */     //   479: istore #24
/*     */     //   481: iload #23
/*     */     //   483: iload #22
/*     */     //   485: if_icmpge -> 605
/*     */     //   488: aload #13
/*     */     //   490: iload #24
/*     */     //   492: dup2
/*     */     //   493: iaload
/*     */     //   494: iconst_1
/*     */     //   495: isub
/*     */     //   496: dup_x2
/*     */     //   497: iastore
/*     */     //   498: dup
/*     */     //   499: istore #25
/*     */     //   501: iload #23
/*     */     //   503: if_icmple -> 568
/*     */     //   506: aload #19
/*     */     //   508: iload #25
/*     */     //   510: caload
/*     */     //   511: iload #20
/*     */     //   513: iushr
/*     */     //   514: sipush #255
/*     */     //   517: iand
/*     */     //   518: iconst_0
/*     */     //   519: ixor
/*     */     //   520: istore #24
/*     */     //   522: iload #5
/*     */     //   524: istore #26
/*     */     //   526: iload #26
/*     */     //   528: iinc #26, -1
/*     */     //   531: ifeq -> 565
/*     */     //   534: aload #14
/*     */     //   536: iload #26
/*     */     //   538: caload
/*     */     //   539: istore #27
/*     */     //   541: aload #14
/*     */     //   543: iload #26
/*     */     //   545: aload_0
/*     */     //   546: iload #26
/*     */     //   548: aaload
/*     */     //   549: iload #25
/*     */     //   551: caload
/*     */     //   552: castore
/*     */     //   553: aload_0
/*     */     //   554: iload #26
/*     */     //   556: aaload
/*     */     //   557: iload #25
/*     */     //   559: iload #27
/*     */     //   561: castore
/*     */     //   562: goto -> 526
/*     */     //   565: goto -> 488
/*     */     //   568: iload #5
/*     */     //   570: istore #26
/*     */     //   572: iload #26
/*     */     //   574: iinc #26, -1
/*     */     //   577: ifeq -> 605
/*     */     //   580: aload_0
/*     */     //   581: iload #26
/*     */     //   583: aaload
/*     */     //   584: iload #23
/*     */     //   586: aload #14
/*     */     //   588: iload #26
/*     */     //   590: caload
/*     */     //   591: castore
/*     */     //   592: goto -> 572
/*     */     //   595: ldc2_w -554695718627976501
/*     */     //   598: lload_3
/*     */     //   599: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   604: athrow
/*     */     //   605: iload #17
/*     */     //   607: iload #6
/*     */     //   609: if_icmpge -> 718
/*     */     //   612: aload #12
/*     */     //   614: iload #24
/*     */     //   616: iaload
/*     */     //   617: iconst_1
/*     */     //   618: if_icmple -> 718
/*     */     //   621: goto -> 634
/*     */     //   624: ldc2_w -554695718627976501
/*     */     //   627: lload_3
/*     */     //   628: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   633: athrow
/*     */     //   634: aload #12
/*     */     //   636: iload #24
/*     */     //   638: iaload
/*     */     //   639: sipush #1024
/*     */     //   642: if_icmpge -> 689
/*     */     //   645: goto -> 658
/*     */     //   648: ldc2_w -554695718627976501
/*     */     //   651: lload_3
/*     */     //   652: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   657: athrow
/*     */     //   658: aload_0
/*     */     //   659: iload #23
/*     */     //   661: iload #23
/*     */     //   663: aload #12
/*     */     //   665: iload #24
/*     */     //   667: iaload
/*     */     //   668: iadd
/*     */     //   669: iload #17
/*     */     //   671: iconst_1
/*     */     //   672: iadd
/*     */     //   673: invokestatic a : ([[CIII)V
/*     */     //   676: goto -> 718
/*     */     //   679: ldc2_w -554695718627976501
/*     */     //   682: lload_3
/*     */     //   683: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   688: athrow
/*     */     //   689: aload #9
/*     */     //   691: iload #8
/*     */     //   693: iload #23
/*     */     //   695: iastore
/*     */     //   696: aload #10
/*     */     //   698: iload #8
/*     */     //   700: aload #12
/*     */     //   702: iload #24
/*     */     //   704: iaload
/*     */     //   705: iastore
/*     */     //   706: aload #11
/*     */     //   708: iload #8
/*     */     //   710: iinc #8, 1
/*     */     //   713: iload #17
/*     */     //   715: iconst_1
/*     */     //   716: iadd
/*     */     //   717: iastore
/*     */     //   718: iload #23
/*     */     //   720: aload #12
/*     */     //   722: iload #24
/*     */     //   724: iaload
/*     */     //   725: iadd
/*     */     //   726: istore #23
/*     */     //   728: aload #12
/*     */     //   730: iload #24
/*     */     //   732: iconst_0
/*     */     //   733: iastore
/*     */     //   734: goto -> 421
/*     */     //   737: goto -> 234
/*     */     //   740: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #30	-> 8
/*     */     //   #624	-> 17
/*     */     //   #490	-> 24
/*     */     //   #427	-> 35
/*     */     //   #308	-> 39
/*     */     //   #369	-> 47
/*     */     //   #947	-> 156
/*     */     //   #21	-> 170
/*     */     //   #153	-> 173
/*     */     //   #201	-> 179
/*     */     //   #22	-> 185
/*     */     //   #45	-> 191
/*     */     //   #635	-> 197
/*     */     //   #511	-> 205
/*     */     //   #559	-> 214
/*     */     //   #306	-> 221
/*     */     //   #926	-> 228
/*     */     //   #340	-> 234
/*     */     //   #785	-> 239
/*     */     //   #868	-> 249
/*     */     //   #368	-> 256
/*     */     //   #733	-> 263
/*     */     //   #848	-> 266
/*     */     //   #447	-> 274
/*     */     //   #660	-> 285
/*     */     //   #913	-> 336
/*     */     //   #181	-> 339
/*     */     //   #383	-> 354
/*     */     //   #12	-> 379
/*     */     //   #276	-> 395
/*     */     //   #418	-> 401
/*     */     //   #180	-> 414
/*     */     //   #938	-> 428
/*     */     //   #638	-> 465
/*     */     //   #120	-> 481
/*     */     //   #609	-> 488
/*     */     //   #792	-> 506
/*     */     //   #271	-> 522
/*     */     //   #687	-> 534
/*     */     //   #623	-> 541
/*     */     //   #601	-> 553
/*     */     //   #595	-> 562
/*     */     //   #819	-> 568
/*     */     //   #297	-> 605
/*     */     //   #829	-> 634
/*     */     //   #220	-> 689
/*     */     //   #580	-> 696
/*     */     //   #654	-> 706
/*     */     //   #40	-> 718
/*     */     //   #350	-> 737
/*     */     //   #668	-> 740
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   8	25	25	java/lang/IllegalArgumentException
/*     */     //   292	326	326	java/lang/IllegalArgumentException
/*     */     //   346	362	365	java/lang/IllegalArgumentException
/*     */     //   432	455	455	java/lang/IllegalArgumentException
/*     */     //   572	595	595	java/lang/IllegalArgumentException
/*     */     //   605	621	624	java/lang/IllegalArgumentException
/*     */     //   612	645	648	java/lang/IllegalArgumentException
/*     */     //   634	679	679	java/lang/IllegalArgumentException } public static void f(char[] paramArrayOfchar) { b(paramArrayOfchar, 0, paramArrayOfchar.length); } public static void a(char[][] paramArrayOfchar) { a(paramArrayOfchar, 0, (paramArrayOfchar[0]).length); } public static void c(char[] paramArrayOfchar, int paramInt1, int paramInt2) { aL.a(paramArrayOfchar.length, paramInt1, paramInt2); } public static int a(char[] paramArrayOfchar, char paramChar, jS paramjS) { return a(paramArrayOfchar, 0, paramArrayOfchar.length, paramChar, paramjS); } public static void k(char[] paramArrayOfchar, int paramInt1, int paramInt2) { ForkJoinPool forkJoinPool = a(); try { if (paramInt2 - paramInt1 >= 8192) { try { if (forkJoinPool.getParallelism() == 1) { d(paramArrayOfchar, paramInt1, paramInt2); return; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  forkJoinPool.invoke(new b3(paramArrayOfchar, paramInt1, paramInt2)); return; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  d(paramArrayOfchar, paramInt1, paramInt2); } private static void a(char[][] paramArrayOfchar, int paramInt1, int paramInt2, int paramInt3) { int i = paramArrayOfchar.length; int j = paramInt3 / 2; for (int k = paramInt1; k < paramInt2 - 1; n = k + 1) int n, m = k;  } private static void d(char[] paramArrayOfchar, int paramInt1, int paramInt2, jS paramjS) { for (int i = paramInt1; i < paramInt2 - 1; i++) { int j = i; int k = i + 1; while (true) { try { if (k < paramInt2) { if (paramjS.a(paramArrayOfchar[k], paramArrayOfchar[j]) < 0) j = k;  k++; continue; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  if (j != i) { k = paramArrayOfchar[i]; paramArrayOfchar[i] = paramArrayOfchar[j]; paramArrayOfchar[j] = k; }  break; }  }  } public static void g(char[] paramArrayOfchar) { d(paramArrayOfchar, 0, paramArrayOfchar.length); } public static char[] e(char[] paramArrayOfchar, int paramInt1, int paramInt2) { char[] arrayOfChar = new char[paramInt1]; System.arraycopy(paramArrayOfchar, 0, arrayOfChar, 0, paramInt2); return arrayOfChar; } private static void a(char[] paramArrayOfchar1, char[] paramArrayOfchar2, int paramInt1, int paramInt2) { for (int i = paramInt1; i < paramInt2 - 1; i++) { int j = i; continue; j = i + 1; while (true) j++;  if (SYNTHETIC_LOCAL_VARIABLE_5 != i) { j = paramArrayOfchar1[i]; paramArrayOfchar1[i] = paramArrayOfchar1[SYNTHETIC_LOCAL_VARIABLE_5]; paramArrayOfchar1[SYNTHETIC_LOCAL_VARIABLE_5] = j; j = paramArrayOfchar2[i]; paramArrayOfchar2[i] = paramArrayOfchar2[SYNTHETIC_LOCAL_VARIABLE_5]; paramArrayOfchar2[SYNTHETIC_LOCAL_VARIABLE_5] = j; }  }  } public static void a(int[] paramArrayOfint, char[] paramArrayOfchar) { a(paramArrayOfint, paramArrayOfchar, 0, paramArrayOfchar.length); }
/*     */   public static void d(char[] paramArrayOfchar, int paramInt1, int paramInt2) { // Byte code:
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
/*     */     //   13: invokestatic g : ([CII)V
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
/*     */     //   64: invokestatic b : ([CIII)I
/*     */     //   67: istore #5
/*     */     //   69: aload_0
/*     */     //   70: iload #4
/*     */     //   72: iload #7
/*     */     //   74: isub
/*     */     //   75: iload #4
/*     */     //   77: iload #4
/*     */     //   79: iload #7
/*     */     //   81: iadd
/*     */     //   82: invokestatic b : ([CIII)I
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
/*     */     //   102: invokestatic b : ([CIII)I
/*     */     //   105: istore #6
/*     */     //   107: aload_0
/*     */     //   108: iload #5
/*     */     //   110: iload #4
/*     */     //   112: iload #6
/*     */     //   114: invokestatic b : ([CIII)I
/*     */     //   117: istore #4
/*     */     //   119: aload_0
/*     */     //   120: iload #4
/*     */     //   122: caload
/*     */     //   123: istore #7
/*     */     //   125: iload_1
/*     */     //   126: istore #8
/*     */     //   128: iload #8
/*     */     //   130: istore #9
/*     */     //   132: iload_2
/*     */     //   133: iconst_1
/*     */     //   134: isub
/*     */     //   135: istore #10
/*     */     //   137: iload #10
/*     */     //   139: istore #11
/*     */     //   141: iload #9
/*     */     //   143: iload #10
/*     */     //   145: if_icmpgt -> 199
/*     */     //   148: aload_0
/*     */     //   149: iload #9
/*     */     //   151: caload
/*     */     //   152: iload #7
/*     */     //   154: invokestatic compare : (CC)I
/*     */     //   157: dup
/*     */     //   158: istore #12
/*     */     //   160: ifgt -> 199
/*     */     //   163: iload #12
/*     */     //   165: ifne -> 193
/*     */     //   168: goto -> 175
/*     */     //   171: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   174: athrow
/*     */     //   175: aload_0
/*     */     //   176: iload #8
/*     */     //   178: iinc #8, 1
/*     */     //   181: iload #9
/*     */     //   183: invokestatic h : ([CII)V
/*     */     //   186: goto -> 193
/*     */     //   189: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   192: athrow
/*     */     //   193: iinc #9, 1
/*     */     //   196: goto -> 141
/*     */     //   199: iload #10
/*     */     //   201: iload #9
/*     */     //   203: if_icmplt -> 257
/*     */     //   206: aload_0
/*     */     //   207: iload #10
/*     */     //   209: caload
/*     */     //   210: iload #7
/*     */     //   212: invokestatic compare : (CC)I
/*     */     //   215: dup
/*     */     //   216: istore #12
/*     */     //   218: iflt -> 257
/*     */     //   221: iload #12
/*     */     //   223: ifne -> 251
/*     */     //   226: goto -> 233
/*     */     //   229: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   232: athrow
/*     */     //   233: aload_0
/*     */     //   234: iload #10
/*     */     //   236: iload #11
/*     */     //   238: iinc #11, -1
/*     */     //   241: invokestatic h : ([CII)V
/*     */     //   244: goto -> 251
/*     */     //   247: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   250: athrow
/*     */     //   251: iinc #10, -1
/*     */     //   254: goto -> 199
/*     */     //   257: iload #9
/*     */     //   259: iload #10
/*     */     //   261: if_icmple -> 271
/*     */     //   264: goto -> 288
/*     */     //   267: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   270: athrow
/*     */     //   271: aload_0
/*     */     //   272: iload #9
/*     */     //   274: iinc #9, 1
/*     */     //   277: iload #10
/*     */     //   279: iinc #10, -1
/*     */     //   282: invokestatic h : ([CII)V
/*     */     //   285: goto -> 141
/*     */     //   288: iload #8
/*     */     //   290: iload_1
/*     */     //   291: isub
/*     */     //   292: iload #9
/*     */     //   294: iload #8
/*     */     //   296: isub
/*     */     //   297: invokestatic min : (II)I
/*     */     //   300: istore #12
/*     */     //   302: aload_0
/*     */     //   303: iload_1
/*     */     //   304: iload #9
/*     */     //   306: iload #12
/*     */     //   308: isub
/*     */     //   309: iload #12
/*     */     //   311: invokestatic a : ([CIII)V
/*     */     //   314: iload #11
/*     */     //   316: iload #10
/*     */     //   318: isub
/*     */     //   319: iload_2
/*     */     //   320: iload #11
/*     */     //   322: isub
/*     */     //   323: iconst_1
/*     */     //   324: isub
/*     */     //   325: invokestatic min : (II)I
/*     */     //   328: istore #12
/*     */     //   330: aload_0
/*     */     //   331: iload #9
/*     */     //   333: iload_2
/*     */     //   334: iload #12
/*     */     //   336: isub
/*     */     //   337: iload #12
/*     */     //   339: invokestatic a : ([CIII)V
/*     */     //   342: iload #9
/*     */     //   344: iload #8
/*     */     //   346: isub
/*     */     //   347: dup
/*     */     //   348: istore #12
/*     */     //   350: iconst_1
/*     */     //   351: if_icmple -> 370
/*     */     //   354: aload_0
/*     */     //   355: iload_1
/*     */     //   356: iload_1
/*     */     //   357: iload #12
/*     */     //   359: iadd
/*     */     //   360: invokestatic d : ([CII)V
/*     */     //   363: goto -> 370
/*     */     //   366: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   369: athrow
/*     */     //   370: iload #11
/*     */     //   372: iload #10
/*     */     //   374: isub
/*     */     //   375: dup
/*     */     //   376: istore #12
/*     */     //   378: iconst_1
/*     */     //   379: if_icmple -> 398
/*     */     //   382: aload_0
/*     */     //   383: iload_2
/*     */     //   384: iload #12
/*     */     //   386: isub
/*     */     //   387: iload_2
/*     */     //   388: invokestatic d : ([CII)V
/*     */     //   391: goto -> 398
/*     */     //   394: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   397: athrow
/*     */     //   398: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #185	-> 0
/*     */     //   #879	-> 4
/*     */     //   #645	-> 10
/*     */     //   #37	-> 16
/*     */     //   #507	-> 21
/*     */     //   #581	-> 28
/*     */     //   #321	-> 31
/*     */     //   #845	-> 36
/*     */     //   #492	-> 43
/*     */     //   #642	-> 49
/*     */     //   #79	-> 69
/*     */     //   #633	-> 87
/*     */     //   #169	-> 107
/*     */     //   #25	-> 119
/*     */     //   #505	-> 125
/*     */     //   #632	-> 141
/*     */     //   #944	-> 163
/*     */     //   #494	-> 193
/*     */     //   #603	-> 199
/*     */     //   #597	-> 221
/*     */     //   #897	-> 251
/*     */     //   #921	-> 257
/*     */     //   #728	-> 271
/*     */     //   #876	-> 288
/*     */     //   #52	-> 302
/*     */     //   #198	-> 314
/*     */     //   #56	-> 330
/*     */     //   #281	-> 342
/*     */     //   #587	-> 370
/*     */     //   #125	-> 398
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   4	17	17	java/lang/IllegalArgumentException
/*     */     //   160	168	171	java/lang/IllegalArgumentException
/*     */     //   163	186	189	java/lang/IllegalArgumentException
/*     */     //   218	226	229	java/lang/IllegalArgumentException
/*     */     //   221	244	247	java/lang/IllegalArgumentException
/*     */     //   257	267	267	java/lang/IllegalArgumentException
/*     */     //   350	363	366	java/lang/IllegalArgumentException
/*     */     //   378	391	394	java/lang/IllegalArgumentException }
/*     */   public static void a(int[] paramArrayOfint, char[] paramArrayOfchar, int paramInt1, int paramInt2, boolean paramBoolean) { try { if (paramInt2 - paramInt1 < 1024) { b(paramArrayOfint, paramArrayOfchar, paramInt1, paramInt2); return; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  boolean bool = true; char c = 'Ā'; byte b = 0; int[] arrayOfInt1 = new int[256]; int[] arrayOfInt2 = new int[256]; int[] arrayOfInt3 = new int[256]; arrayOfInt1[b] = paramInt1; arrayOfInt2[b] = paramInt2 - paramInt1; arrayOfInt3[b++] = 0; int[] arrayOfInt4 = new int[256]; int[] arrayOfInt5 = new int[256]; try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  int[] arrayOfInt6 = paramBoolean ? new int[paramArrayOfint.length] : null; while (b > 0) { int i = arrayOfInt1[--b]; int j = arrayOfInt2[b]; int k = arrayOfInt3[b]; boolean bool1 = false; int m = (1 - k % 2) * 8; int n = i + j; }  }
/*     */   public static void a(int[] paramArrayOfint, char[] paramArrayOfchar, int paramInt1, int paramInt2) { ForkJoinPool forkJoinPool = a(); try { if (paramInt2 - paramInt1 >= 8192) { try { if (forkJoinPool.getParallelism() == 1) { c(paramArrayOfint, paramArrayOfchar, paramInt1, paramInt2); return; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  forkJoinPool.invoke(new bZ(paramArrayOfint, paramArrayOfchar, paramInt1, paramInt2)); return; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  c(paramArrayOfint, paramArrayOfchar, paramInt1, paramInt2); }
/*     */   public static char[] b(char[] paramArrayOfchar, int paramInt) { return c(paramArrayOfchar, paramInt, paramArrayOfchar.length); }
/*     */   public static void a(char[] paramArrayOfchar1, int paramInt1, int paramInt2, jS paramjS, char[] paramArrayOfchar2) { // Byte code:
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
/*     */     //   16: invokestatic c : ([CIILme/konsolas/aac/jS;)V
/*     */     //   19: return
/*     */     //   20: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   23: athrow
/*     */     //   24: aload #4
/*     */     //   26: ifnonnull -> 36
/*     */     //   29: aload_0
/*     */     //   30: iload_2
/*     */     //   31: invokestatic copyOf : ([CI)[C
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
/*     */     //   50: invokestatic a : ([CIILme/konsolas/aac/jS;[C)V
/*     */     //   53: aload #4
/*     */     //   55: iload #6
/*     */     //   57: iload_2
/*     */     //   58: aload_3
/*     */     //   59: aload_0
/*     */     //   60: invokestatic a : ([CIILme/konsolas/aac/jS;[C)V
/*     */     //   63: aload_3
/*     */     //   64: aload #4
/*     */     //   66: iload #6
/*     */     //   68: iconst_1
/*     */     //   69: isub
/*     */     //   70: caload
/*     */     //   71: aload #4
/*     */     //   73: iload #6
/*     */     //   75: caload
/*     */     //   76: invokeinterface a : (CC)I
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
/*     */     //   147: caload
/*     */     //   148: aload #4
/*     */     //   150: iload #9
/*     */     //   152: caload
/*     */     //   153: invokeinterface a : (CC)I
/*     */     //   158: ifgt -> 187
/*     */     //   161: goto -> 168
/*     */     //   164: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   167: athrow
/*     */     //   168: aload_0
/*     */     //   169: iload #7
/*     */     //   171: aload #4
/*     */     //   173: iload #8
/*     */     //   175: iinc #8, 1
/*     */     //   178: caload
/*     */     //   179: castore
/*     */     //   180: goto -> 199
/*     */     //   183: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   186: athrow
/*     */     //   187: aload_0
/*     */     //   188: iload #7
/*     */     //   190: aload #4
/*     */     //   192: iload #9
/*     */     //   194: iinc #9, 1
/*     */     //   197: caload
/*     */     //   198: castore
/*     */     //   199: iinc #7, 1
/*     */     //   202: goto -> 109
/*     */     //   205: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #217	-> 0
/*     */     //   #318	-> 5
/*     */     //   #289	-> 12
/*     */     //   #394	-> 19
/*     */     //   #567	-> 24
/*     */     //   #589	-> 36
/*     */     //   #388	-> 43
/*     */     //   #942	-> 53
/*     */     //   #556	-> 63
/*     */     //   #456	-> 84
/*     */     //   #147	-> 94
/*     */     //   #446	-> 99
/*     */     //   #887	-> 115
/*     */     //   #414	-> 187
/*     */     //   #656	-> 199
/*     */     //   #63	-> 205
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   5	20	20	java/lang/IllegalArgumentException
/*     */     //   43	95	95	java/lang/IllegalArgumentException
/*     */     //   109	121	124	java/lang/IllegalArgumentException
/*     */     //   115	135	138	java/lang/IllegalArgumentException
/*     */     //   128	161	164	java/lang/IllegalArgumentException
/*     */     //   142	183	183	java/lang/IllegalArgumentException }
/* 932 */   public static char[] b(char[] paramArrayOfchar, int paramInt1, int paramInt2) { try { c(paramArrayOfchar, paramInt1, paramInt2); } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  char[] arrayOfChar = (paramInt2 == 0) ? n : new char[paramInt2]; System.arraycopy(paramArrayOfchar, paramInt1, arrayOfChar, 0, paramInt2); return arrayOfChar; }
/*     */   public static void a(char[] paramArrayOfchar, int paramInt1, int paramInt2, jS paramjS) { g(paramArrayOfchar, paramInt1, paramInt2, paramjS); }
/*     */   public static void c(char[] paramArrayOfchar1, char[] paramArrayOfchar2) { d(paramArrayOfchar1, paramArrayOfchar2); d(paramArrayOfchar1, paramArrayOfchar2, 0, paramArrayOfchar1.length); }
/*     */   public static void b(char[] paramArrayOfchar1, char[] paramArrayOfchar2, int paramInt1, int paramInt2) { ForkJoinPool forkJoinPool = a(); try { if (paramInt2 - paramInt1 >= 8192) { try { if (forkJoinPool.getParallelism() == 1) { e(paramArrayOfchar1, paramArrayOfchar2, paramInt1, paramInt2); return; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  forkJoinPool.invoke(new mk(paramArrayOfchar1, paramArrayOfchar2, paramInt1, paramInt2)); return; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  e(paramArrayOfchar1, paramArrayOfchar2, paramInt1, paramInt2); }
/*     */   private static int b(char[] paramArrayOfchar, int paramInt1, int paramInt2, int paramInt3) { int i = Character.compare(paramArrayOfchar[paramInt1], paramArrayOfchar[paramInt2]); int j = Character.compare(paramArrayOfchar[paramInt1], paramArrayOfchar[paramInt3]); int k = Character.compare(paramArrayOfchar[paramInt2], paramArrayOfchar[paramInt3]); try { if (i < 0) { try { try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  } else { try { try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return (k > 0) ? paramInt2 : ((j > 0) ? paramInt3 : paramInt1); }
/*     */   public static void j(char[] paramArrayOfchar, int paramInt1, int paramInt2) { try { if (paramInt2 - paramInt1 >= 2000) { i(paramArrayOfchar, paramInt1, paramInt2); } else { d(paramArrayOfchar, paramInt1, paramInt2); }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  }
/*     */   public static void e(char[] paramArrayOfchar1, char[] paramArrayOfchar2, int paramInt1, int paramInt2) { // Byte code:
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
/*     */     //   16: invokestatic a : ([C[CII)V
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
/*     */     //   71: invokestatic a : ([C[CIII)I
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
/*     */     //   90: invokestatic a : ([C[CIII)I
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
/*     */     //   111: invokestatic a : ([C[CIII)I
/*     */     //   114: istore #7
/*     */     //   116: aload_0
/*     */     //   117: aload_1
/*     */     //   118: iload #6
/*     */     //   120: iload #5
/*     */     //   122: iload #7
/*     */     //   124: invokestatic a : ([C[CIII)I
/*     */     //   127: istore #5
/*     */     //   129: aload_0
/*     */     //   130: iload #5
/*     */     //   132: caload
/*     */     //   133: istore #8
/*     */     //   135: aload_1
/*     */     //   136: iload #5
/*     */     //   138: caload
/*     */     //   139: istore #9
/*     */     //   141: iload_2
/*     */     //   142: istore #10
/*     */     //   144: iload #10
/*     */     //   146: istore #11
/*     */     //   148: iload_3
/*     */     //   149: iconst_1
/*     */     //   150: isub
/*     */     //   151: istore #12
/*     */     //   153: iload #12
/*     */     //   155: istore #13
/*     */     //   157: iload #11
/*     */     //   159: iload #12
/*     */     //   161: if_icmpgt -> 240
/*     */     //   164: aload_0
/*     */     //   165: iload #11
/*     */     //   167: caload
/*     */     //   168: iload #8
/*     */     //   170: invokestatic compare : (CC)I
/*     */     //   173: dup
/*     */     //   174: istore #15
/*     */     //   176: ifne -> 195
/*     */     //   179: aload_1
/*     */     //   180: iload #11
/*     */     //   182: caload
/*     */     //   183: iload #9
/*     */     //   185: invokestatic compare : (CC)I
/*     */     //   188: goto -> 197
/*     */     //   191: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   194: athrow
/*     */     //   195: iload #15
/*     */     //   197: dup
/*     */     //   198: istore #14
/*     */     //   200: ifgt -> 240
/*     */     //   203: iload #14
/*     */     //   205: ifne -> 234
/*     */     //   208: goto -> 215
/*     */     //   211: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   214: athrow
/*     */     //   215: aload_0
/*     */     //   216: aload_1
/*     */     //   217: iload #10
/*     */     //   219: iinc #10, 1
/*     */     //   222: iload #11
/*     */     //   224: invokestatic f : ([C[CII)V
/*     */     //   227: goto -> 234
/*     */     //   230: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   233: athrow
/*     */     //   234: iinc #11, 1
/*     */     //   237: goto -> 157
/*     */     //   240: iload #12
/*     */     //   242: iload #11
/*     */     //   244: if_icmplt -> 323
/*     */     //   247: aload_0
/*     */     //   248: iload #12
/*     */     //   250: caload
/*     */     //   251: iload #8
/*     */     //   253: invokestatic compare : (CC)I
/*     */     //   256: dup
/*     */     //   257: istore #15
/*     */     //   259: ifne -> 278
/*     */     //   262: aload_1
/*     */     //   263: iload #12
/*     */     //   265: caload
/*     */     //   266: iload #9
/*     */     //   268: invokestatic compare : (CC)I
/*     */     //   271: goto -> 280
/*     */     //   274: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   277: athrow
/*     */     //   278: iload #15
/*     */     //   280: dup
/*     */     //   281: istore #14
/*     */     //   283: iflt -> 323
/*     */     //   286: iload #14
/*     */     //   288: ifne -> 317
/*     */     //   291: goto -> 298
/*     */     //   294: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   297: athrow
/*     */     //   298: aload_0
/*     */     //   299: aload_1
/*     */     //   300: iload #12
/*     */     //   302: iload #13
/*     */     //   304: iinc #13, -1
/*     */     //   307: invokestatic f : ([C[CII)V
/*     */     //   310: goto -> 317
/*     */     //   313: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   316: athrow
/*     */     //   317: iinc #12, -1
/*     */     //   320: goto -> 240
/*     */     //   323: iload #11
/*     */     //   325: iload #12
/*     */     //   327: if_icmple -> 337
/*     */     //   330: goto -> 355
/*     */     //   333: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   336: athrow
/*     */     //   337: aload_0
/*     */     //   338: aload_1
/*     */     //   339: iload #11
/*     */     //   341: iinc #11, 1
/*     */     //   344: iload #12
/*     */     //   346: iinc #12, -1
/*     */     //   349: invokestatic f : ([C[CII)V
/*     */     //   352: goto -> 157
/*     */     //   355: iload #10
/*     */     //   357: iload_2
/*     */     //   358: isub
/*     */     //   359: iload #11
/*     */     //   361: iload #10
/*     */     //   363: isub
/*     */     //   364: invokestatic min : (II)I
/*     */     //   367: istore #14
/*     */     //   369: aload_0
/*     */     //   370: aload_1
/*     */     //   371: iload_2
/*     */     //   372: iload #11
/*     */     //   374: iload #14
/*     */     //   376: isub
/*     */     //   377: iload #14
/*     */     //   379: invokestatic b : ([C[CIII)V
/*     */     //   382: iload #13
/*     */     //   384: iload #12
/*     */     //   386: isub
/*     */     //   387: iload_3
/*     */     //   388: iload #13
/*     */     //   390: isub
/*     */     //   391: iconst_1
/*     */     //   392: isub
/*     */     //   393: invokestatic min : (II)I
/*     */     //   396: istore #14
/*     */     //   398: aload_0
/*     */     //   399: aload_1
/*     */     //   400: iload #11
/*     */     //   402: iload_3
/*     */     //   403: iload #14
/*     */     //   405: isub
/*     */     //   406: iload #14
/*     */     //   408: invokestatic b : ([C[CIII)V
/*     */     //   411: iload #11
/*     */     //   413: iload #10
/*     */     //   415: isub
/*     */     //   416: dup
/*     */     //   417: istore #14
/*     */     //   419: iconst_1
/*     */     //   420: if_icmple -> 440
/*     */     //   423: aload_0
/*     */     //   424: aload_1
/*     */     //   425: iload_2
/*     */     //   426: iload_2
/*     */     //   427: iload #14
/*     */     //   429: iadd
/*     */     //   430: invokestatic e : ([C[CII)V
/*     */     //   433: goto -> 440
/*     */     //   436: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   439: athrow
/*     */     //   440: iload #13
/*     */     //   442: iload #12
/*     */     //   444: isub
/*     */     //   445: dup
/*     */     //   446: istore #14
/*     */     //   448: iconst_1
/*     */     //   449: if_icmple -> 469
/*     */     //   452: aload_0
/*     */     //   453: aload_1
/*     */     //   454: iload_3
/*     */     //   455: iload #14
/*     */     //   457: isub
/*     */     //   458: iload_3
/*     */     //   459: invokestatic e : ([C[CII)V
/*     */     //   462: goto -> 469
/*     */     //   465: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   468: athrow
/*     */     //   469: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #269	-> 0
/*     */     //   #385	-> 5
/*     */     //   #622	-> 12
/*     */     //   #55	-> 19
/*     */     //   #328	-> 24
/*     */     //   #691	-> 32
/*     */     //   #908	-> 35
/*     */     //   #405	-> 40
/*     */     //   #628	-> 48
/*     */     //   #630	-> 55
/*     */     //   #310	-> 76
/*     */     //   #18	-> 95
/*     */     //   #503	-> 116
/*     */     //   #53	-> 129
/*     */     //   #529	-> 141
/*     */     //   #796	-> 157
/*     */     //   #489	-> 203
/*     */     //   #874	-> 234
/*     */     //   #725	-> 240
/*     */     //   #353	-> 286
/*     */     //   #265	-> 317
/*     */     //   #855	-> 323
/*     */     //   #29	-> 337
/*     */     //   #738	-> 355
/*     */     //   #339	-> 369
/*     */     //   #551	-> 382
/*     */     //   #89	-> 398
/*     */     //   #455	-> 411
/*     */     //   #822	-> 440
/*     */     //   #838	-> 469
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   5	20	20	java/lang/IllegalArgumentException
/*     */     //   176	191	191	java/lang/IllegalArgumentException
/*     */     //   200	208	211	java/lang/IllegalArgumentException
/*     */     //   203	227	230	java/lang/IllegalArgumentException
/*     */     //   259	274	274	java/lang/IllegalArgumentException
/*     */     //   283	291	294	java/lang/IllegalArgumentException
/*     */     //   286	310	313	java/lang/IllegalArgumentException
/*     */     //   323	333	333	java/lang/IllegalArgumentException
/*     */     //   419	433	436	java/lang/IllegalArgumentException
/*     */     //   448	462	465	java/lang/IllegalArgumentException }
/*     */   private static void b(char[] paramArrayOfchar1, char[] paramArrayOfchar2, int paramInt1, int paramInt2, int paramInt3) { byte b = 0; try { while (b < paramInt3) { f(paramArrayOfchar1, paramArrayOfchar2, paramInt1, paramInt2); b++; paramInt1++; paramInt2++; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  }
/*     */   public static void b(int[] paramArrayOfint, char[] paramArrayOfchar, int paramInt1, int paramInt2, boolean paramBoolean) { ForkJoinPool forkJoinPool = a(); try { if (paramInt2 - paramInt1 >= 1024) try { if (forkJoinPool.getParallelism() != 1) { boolean bool = true; LinkedBlockingQueue<a7> linkedBlockingQueue = new LinkedBlockingQueue(); linkedBlockingQueue.add(new a7(paramInt1, paramInt2 - paramInt1, 0)); AtomicInteger atomicInteger = new AtomicInteger(1); int i = forkJoinPool.getParallelism(); ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(forkJoinPool); try {  } catch (Exception exception) { throw a(null); }  int[] arrayOfInt = paramBoolean ? new int[paramArrayOfint.length] : null; int j = i; try { for (; j-- != 0; executorCompletionService.submit(() -> { int[] arrayOfInt1 = new int[256]; int[] arrayOfInt2 = new int[256]; while (true) { if (paramAtomicInteger.get() == 0) { int i3 = paramInt; try { while (i3-- != 0) paramLinkedBlockingQueue.add(b);  } catch (Exception exception) { throw a(null); }  }  a7 a71 = paramLinkedBlockingQueue.take(); try { if (a71 == b) return null;  } catch (Exception exception) { throw a(null); }  int i = a71.b; int j = a71.c; int k = a71.a; boolean bool = false; int m = (1 - k % 2) * 8; int n = i + j; try { while (n-- != i) arrayOfInt1[paramArrayOfchar[paramArrayOfint1[n]] >>> m & 0xFF ^ 0x0] = arrayOfInt1[paramArrayOfchar[paramArrayOfint1[n]] >>> m & 0xFF ^ 0x0] + 1;  } catch (Exception exception) { throw a(null); }  n = -1; int i1 = 0; int i2 = i; while (true) { try { if (i1 < 256) { if (arrayOfInt1[i1] != 0) n = i1;  arrayOfInt2[i1] = i2 += arrayOfInt1[i1]; i1++; continue; }  } catch (Exception exception) { throw a(null); }  if (paramBoolean) { i1 = i + j; try { while (i1-- != i) { arrayOfInt2[paramArrayOfchar[paramArrayOfint1[i1]] >>> m & 0xFF ^ 0x0] = arrayOfInt2[paramArrayOfchar[paramArrayOfint1[i1]] >>> m & 0xFF ^ 0x0] - 1; paramArrayOfint2[arrayOfInt2[paramArrayOfchar[paramArrayOfint1[i1]] >>> m & 0xFF ^ 0x0] - 1] = paramArrayOfint1[i1]; }  } catch (Exception exception) { throw a(null); }  System.arraycopy(paramArrayOfint2, i, paramArrayOfint1, i, j); i1 = 0; i2 = i; while (true) { try { if (i1 <= n) { try { if (k < 1) try { if (arrayOfInt1[i1] > 1) try { if (arrayOfInt1[i1] < 1024) { a(paramArrayOfint1, paramArrayOfchar, i2, i2 + arrayOfInt1[i1], paramBoolean); } else { paramAtomicInteger.incrementAndGet(); paramLinkedBlockingQueue.add(new a7(i2, arrayOfInt1[i1], k + 1)); }  } catch (Exception exception) { throw a(null); }   } catch (Exception exception) { throw a(null); }   } catch (Exception exception) { throw a(null); }  i2 += arrayOfInt1[i1]; i1++; continue; }  } catch (Exception exception) { throw a(null); }  Arrays.fill(arrayOfInt1, 0); break; }  break; }  i1 = i + j - arrayOfInt1[n]; i2 = i; int i3 = -1; while (i2 <= i1) { int i4 = paramArrayOfint1[i2]; i3 = paramArrayOfchar[i4] >>> m & 0xFF ^ 0x0; if (i2 < i1) { arrayOfInt2[i3] = arrayOfInt2[i3] - 1; int i5; while ((i5 = arrayOfInt2[i3] - 1) > i2) { int i6 = i4; i4 = paramArrayOfint1[i5]; paramArrayOfint1[i5] = i6; i3 = paramArrayOfchar[i4] >>> m & 0xFF ^ 0x0; }  paramArrayOfint1[i2] = i4; }  }  paramAtomicInteger.decrementAndGet(); }  paramAtomicInteger.decrementAndGet(); }  })); } catch (Exception exception) { throw a(null); }  Throwable throwable = null; for (int k = i; k-- != 0;) { try { executorCompletionService.take().get(); } catch (Exception exception) { throwable = exception.getCause(); }  }  try { if (throwable != null) { try {  } catch (Exception exception) { throw a(null); }  throw (throwable instanceof RuntimeException) ? (RuntimeException)throwable : new RuntimeException(throwable); }  } catch (Exception exception) { throw a(null); }  return; }  a(paramArrayOfint, paramArrayOfchar, paramInt1, paramInt2, paramBoolean); return; } catch (Exception exception) { throw a(null); }   } catch (Exception exception) { throw a(null); }  a(paramArrayOfint, paramArrayOfchar, paramInt1, paramInt2, paramBoolean); }
/* 941 */   public static void b(int[] paramArrayOfint, char[] paramArrayOfchar, boolean paramBoolean) { a(paramArrayOfint, paramArrayOfchar, 0, paramArrayOfint.length, paramBoolean); } public static void l(char[] paramArrayOfchar, int paramInt1, int paramInt2) { aL.b(paramArrayOfchar.length, paramInt1, paramInt2); } private static int a(char[] paramArrayOfchar, int paramInt1, int paramInt2, int paramInt3, jS paramjS) { int i = paramjS.a(paramArrayOfchar[paramInt1], paramArrayOfchar[paramInt2]); int j = paramjS.a(paramArrayOfchar[paramInt1], paramArrayOfchar[paramInt3]); int k = paramjS.a(paramArrayOfchar[paramInt2], paramArrayOfchar[paramInt3]); try { if (i < 0) { try { try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  } else { try { try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return (k > 0) ? paramInt2 : ((j > 0) ? paramInt3 : paramInt1); } @Deprecated public static void a(char[] paramArrayOfchar, char paramChar) { int i = paramArrayOfchar.length; try { for (; i-- != 0; paramArrayOfchar[i] = paramChar); } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  } public static void a(int[] paramArrayOfint, char[] paramArrayOfchar1, char[] paramArrayOfchar2, boolean paramBoolean) { d(paramArrayOfchar1, paramArrayOfchar2); a(paramArrayOfint, paramArrayOfchar1, paramArrayOfchar2, 0, paramArrayOfchar1.length, paramBoolean); } private static ForkJoinPool a() { ForkJoinPool forkJoinPool = ForkJoinTask.getPool(); try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return (forkJoinPool == null) ? ForkJoinPool.commonPool() : forkJoinPool; } public static void a(int[] paramArrayOfint, char[] paramArrayOfchar, boolean paramBoolean) { b(paramArrayOfint, paramArrayOfchar, 0, paramArrayOfchar.length, paramBoolean); } public static void c(char[] paramArrayOfchar, jS paramjS) { a(paramArrayOfchar, 0, paramArrayOfchar.length, paramjS); } public static char[] a(char[] paramArrayOfchar) { int i = paramArrayOfchar.length; for (int j = i / 2; j-- != 0; ) { char c = paramArrayOfchar[i - j - 1]; paramArrayOfchar[i - j - 1] = paramArrayOfchar[j]; paramArrayOfchar[j] = c; }  return paramArrayOfchar; } public static void i(char[] paramArrayOfchar, int paramInt1, int paramInt2) { try { if (paramInt2 - paramInt1 < 1024) { d(paramArrayOfchar, paramInt1, paramInt2); return; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  boolean bool = true; char c = 'Ā'; byte b = 0; int[] arrayOfInt1 = new int[256]; int[] arrayOfInt2 = new int[256]; int[] arrayOfInt3 = new int[256]; arrayOfInt1[b] = paramInt1; arrayOfInt2[b] = paramInt2 - paramInt1; arrayOfInt3[b++] = 0; int[] arrayOfInt4 = new int[256]; int[] arrayOfInt5 = new int[256]; while (b > 0) { int i = arrayOfInt1[--b]; int j = arrayOfInt2[b]; int k = arrayOfInt3[b]; boolean bool1 = false; int m = (1 - k % 2) * 8; }  } public static void f(char[] paramArrayOfchar, int paramInt1, int paramInt2, jS paramjS) { b(paramArrayOfchar, paramInt1, paramInt2, paramjS); } public static char[] a(char[] paramArrayOfchar, int paramInt) { return d(paramArrayOfchar, paramInt, paramArrayOfchar.length); } public static void d(int[] paramArrayOfint, char[] paramArrayOfchar, int paramInt1, int paramInt2) { int i = paramInt1; int j = paramInt1 + 1; while (true) { try { if (j < paramInt2) { try { if (paramArrayOfchar[paramArrayOfint[j]] != paramArrayOfchar[paramArrayOfint[i]]) { try { if (j - i > 1) fG.k(paramArrayOfint, i, j);  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  i = j; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  j++; continue; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  break; }  try { if (paramInt2 - i > 1) fG.k(paramArrayOfint, i, paramInt2);  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  }
/*     */   public static void a(char[] paramArrayOfchar) { i(paramArrayOfchar, 0, paramArrayOfchar.length); }
/*     */   public static char[] b(char[] paramArrayOfchar) { return (char[])paramArrayOfchar.clone(); }
/*     */   public static int a(char[] paramArrayOfchar, int paramInt1, int paramInt2, char paramChar) { paramInt2--; for (; paramInt1 <= paramInt2; c = paramArrayOfchar[i]) { char c; int i = paramInt1 + paramInt2 >>> 1; }  return -(paramInt1 + 1); }
/*     */   public static void d(char[] paramArrayOfchar) { e(paramArrayOfchar, 0, paramArrayOfchar.length); } public static void b(char[] paramArrayOfchar1, char[] paramArrayOfchar2) { d(paramArrayOfchar1, paramArrayOfchar2); c(paramArrayOfchar1, paramArrayOfchar2, 0, paramArrayOfchar1.length); } public static void b(int[] paramArrayOfint, char[] paramArrayOfchar) { c(paramArrayOfint, paramArrayOfchar, 0, paramArrayOfchar.length); } public static char[] a(char[] paramArrayOfchar, int paramInt1, int paramInt2) { int i = paramInt2 - paramInt1; for (int j = i / 2; j-- != 0; ) { char c = paramArrayOfchar[paramInt1 + i - j - 1]; paramArrayOfchar[paramInt1 + i - j - 1] = paramArrayOfchar[paramInt1 + j]; paramArrayOfchar[paramInt1 + j] = c; }  return paramArrayOfchar; } public static void e(char[] paramArrayOfchar, jS paramjS) { f(paramArrayOfchar, 0, paramArrayOfchar.length, paramjS); } @Deprecated public static void a(char[] paramArrayOfchar, int paramInt1, int paramInt2, char paramChar) { try { l(paramArrayOfchar, paramInt1, paramInt2); if (paramInt1 == 0) { try { for (; paramInt2-- != 0; paramArrayOfchar[paramInt2] = paramChar); } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  } else { int i = paramInt1; try { while (i < paramInt2) { paramArrayOfchar[i] = paramChar; i++; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  } public static char[] d(char[] paramArrayOfchar, int paramInt) { try { if (paramInt == paramArrayOfchar.length) return paramArrayOfchar;  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  try { if (paramInt < paramArrayOfchar.length) return c(paramArrayOfchar, paramInt);  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return b(paramArrayOfchar, paramInt); } public static void d(char[] paramArrayOfchar1, char[] paramArrayOfchar2) { // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/du.p : J
/*     */     //   3: ldc2_w 49987627636686
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
/*     */     //   26: ldc '킂沣矻谌᫑땏ꦟ幌ᡛꢗ뚒醔嫔퐧⠬К瀪ᶸ螾좇梱'
/*     */     //   28: invokevirtual toCharArray : ()[C
/*     */     //   31: dup
/*     */     //   32: dup
/*     */     //   33: iconst_1
/*     */     //   34: dup_x1
/*     */     //   35: caload
/*     */     //   36: sipush #8654
/*     */     //   39: ixor
/*     */     //   40: i2c
/*     */     //   41: castore
/*     */     //   42: sipush #13810
/*     */     //   45: iconst_1
/*     */     //   46: iconst_2
/*     */     //   47: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*     */     //   50: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   53: aload_0
/*     */     //   54: arraylength
/*     */     //   55: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   58: ldc '灐爀鮻㋒'
/*     */     //   60: invokevirtual toCharArray : ()[C
/*     */     //   63: dup
/*     */     //   64: dup
/*     */     //   65: iconst_3
/*     */     //   66: dup_x1
/*     */     //   67: caload
/*     */     //   68: sipush #27621
/*     */     //   71: ixor
/*     */     //   72: i2c
/*     */     //   73: castore
/*     */     //   74: sipush #4202
/*     */     //   77: iconst_4
/*     */     //   78: iconst_2
/*     */     //   79: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*     */     //   82: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   85: aload_1
/*     */     //   86: arraylength
/*     */     //   87: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   90: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   93: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   96: athrow
/*     */     //   97: ldc2_w -5410734320175507857
/*     */     //   100: lload_2
/*     */     //   101: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   106: athrow
/*     */     //   107: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #564	-> 8
/*     */     //   #60	-> 107
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   8	97	97	java/lang/IllegalArgumentException } public static char[] a(char[] paramArrayOfchar, Random paramRandom) { for (int i = paramArrayOfchar.length; i-- != 0; c = paramArrayOfchar[i], paramArrayOfchar[i] = paramArrayOfchar[j]) { char c; int j = paramRandom.nextInt(i + 1); }  return paramArrayOfchar; } public static void f(char[] paramArrayOfchar, int paramInt1, int paramInt2) { a(paramArrayOfchar, paramInt1, paramInt2, (char[])null); } public static void a(char[] paramArrayOfchar1, int paramInt1, int paramInt2, char[] paramArrayOfchar2) { // Byte code:
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
/*     */     //   15: invokestatic a : ([CII)V
/*     */     //   18: return
/*     */     //   19: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   22: athrow
/*     */     //   23: aload_3
/*     */     //   24: ifnonnull -> 33
/*     */     //   27: aload_0
/*     */     //   28: iload_2
/*     */     //   29: invokestatic copyOf : ([CI)[C
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
/*     */     //   45: invokestatic a : ([CII[C)V
/*     */     //   48: aload_3
/*     */     //   49: iload #5
/*     */     //   51: iload_2
/*     */     //   52: aload_0
/*     */     //   53: invokestatic a : ([CII[C)V
/*     */     //   56: aload_3
/*     */     //   57: iload #5
/*     */     //   59: iconst_1
/*     */     //   60: isub
/*     */     //   61: caload
/*     */     //   62: aload_3
/*     */     //   63: iload #5
/*     */     //   65: caload
/*     */     //   66: if_icmpgt -> 83
/*     */     //   69: aload_3
/*     */     //   70: iload_1
/*     */     //   71: aload_0
/*     */     //   72: iload_1
/*     */     //   73: iload #4
/*     */     //   75: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
/*     */     //   78: return
/*     */     //   79: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   82: athrow
/*     */     //   83: iload_1
/*     */     //   84: istore #6
/*     */     //   86: iload_1
/*     */     //   87: istore #7
/*     */     //   89: iload #5
/*     */     //   91: istore #8
/*     */     //   93: iload #6
/*     */     //   95: iload_2
/*     */     //   96: if_icmpge -> 179
/*     */     //   99: iload #8
/*     */     //   101: iload_2
/*     */     //   102: if_icmpge -> 144
/*     */     //   105: goto -> 112
/*     */     //   108: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   111: athrow
/*     */     //   112: iload #7
/*     */     //   114: iload #5
/*     */     //   116: if_icmpge -> 162
/*     */     //   119: goto -> 126
/*     */     //   122: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   125: athrow
/*     */     //   126: aload_3
/*     */     //   127: iload #7
/*     */     //   129: caload
/*     */     //   130: aload_3
/*     */     //   131: iload #8
/*     */     //   133: caload
/*     */     //   134: if_icmpgt -> 162
/*     */     //   137: goto -> 144
/*     */     //   140: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   143: athrow
/*     */     //   144: aload_0
/*     */     //   145: iload #6
/*     */     //   147: aload_3
/*     */     //   148: iload #7
/*     */     //   150: iinc #7, 1
/*     */     //   153: caload
/*     */     //   154: castore
/*     */     //   155: goto -> 173
/*     */     //   158: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   161: athrow
/*     */     //   162: aload_0
/*     */     //   163: iload #6
/*     */     //   165: aload_3
/*     */     //   166: iload #8
/*     */     //   168: iinc #8, 1
/*     */     //   171: caload
/*     */     //   172: castore
/*     */     //   173: iinc #6, 1
/*     */     //   176: goto -> 93
/*     */     //   179: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #605	-> 0
/*     */     //   #426	-> 5
/*     */     //   #415	-> 12
/*     */     //   #864	-> 18
/*     */     //   #279	-> 23
/*     */     //   #747	-> 33
/*     */     //   #557	-> 40
/*     */     //   #865	-> 48
/*     */     //   #768	-> 56
/*     */     //   #724	-> 69
/*     */     //   #869	-> 78
/*     */     //   #252	-> 83
/*     */     //   #238	-> 99
/*     */     //   #749	-> 162
/*     */     //   #354	-> 173
/*     */     //   #844	-> 179
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   5	19	19	java/lang/IllegalArgumentException
/*     */     //   40	79	79	java/lang/IllegalArgumentException
/*     */     //   93	105	108	java/lang/IllegalArgumentException
/*     */     //   99	119	122	java/lang/IllegalArgumentException
/*     */     //   112	137	140	java/lang/IllegalArgumentException
/* 945 */     //   126	158	158	java/lang/IllegalArgumentException } public static void a(int[] paramArrayOfint, char[] paramArrayOfchar1, char[] paramArrayOfchar2, int paramInt1, int paramInt2, boolean paramBoolean) { try { if (paramInt2 - paramInt1 < 1024) { a(paramArrayOfint, paramArrayOfchar1, paramArrayOfchar2, paramInt1, paramInt2); return; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  byte b1 = 2; byte b2 = 3; char c = '˾'; byte b3 = 0; int[] arrayOfInt1 = new int[766]; int[] arrayOfInt2 = new int[766]; int[] arrayOfInt3 = new int[766]; arrayOfInt1[b3] = paramInt1; arrayOfInt2[b3] = paramInt2 - paramInt1; arrayOfInt3[b3++] = 0; int[] arrayOfInt4 = new int[256]; int[] arrayOfInt5 = new int[256]; try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  int[] arrayOfInt6 = paramBoolean ? new int[paramArrayOfint.length] : null; for (; b3 > 0; i2 = i, b = -1) { byte b; int i = arrayOfInt1[--b3]; int j = arrayOfInt2[b3]; int k = arrayOfInt3[b3]; boolean bool = false; try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  char[] arrayOfChar = (k < 2) ? paramArrayOfchar1 : paramArrayOfchar2; int m = (1 - k % 2) * 8; int n = i + j; try { for (; n-- != i; arrayOfInt4[arrayOfChar[paramArrayOfint[n]] >>> m & 0xFF ^ 0x0] = arrayOfInt4[arrayOfChar[paramArrayOfint[n]] >>> m & 0xFF ^ 0x0] + 1); } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  n = -1; int i1 = 0; try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  int i2 = paramBoolean ? 0 : i; while (true) { try { if (i1 < 256) { if (arrayOfInt4[i1] != 0) n = i1;  arrayOfInt5[i1] = i2 += arrayOfInt4[i1]; i1++; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  break; }  if (paramBoolean) { i1 = i + j; try { while (i1-- != i) { arrayOfInt5[arrayOfChar[paramArrayOfint[i1]] >>> m & 0xFF ^ 0x0] = arrayOfInt5[arrayOfChar[paramArrayOfint[i1]] >>> m & 0xFF ^ 0x0] - 1; arrayOfInt6[arrayOfInt5[arrayOfChar[paramArrayOfint[i1]] >>> m & 0xFF ^ 0x0] - 1] = paramArrayOfint[i1]; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  System.arraycopy(arrayOfInt6, 0, paramArrayOfint, i, j); }  i1 = i + j - arrayOfInt4[n]; }  } public static void b(char[] paramArrayOfchar, int paramInt1, int paramInt2, jS paramjS) { a(paramArrayOfchar, paramInt1, paramInt2, paramjS, (char[])null); } public static void c(int[] paramArrayOfint, char[] paramArrayOfchar) { d(paramArrayOfint, paramArrayOfchar, 0, paramArrayOfint.length); } public static char[] c(char[] paramArrayOfchar, int paramInt1, int paramInt2) { try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return (paramInt1 > paramArrayOfchar.length) ? e(paramArrayOfchar, paramInt1, paramInt2) : paramArrayOfchar; } private static void c(char[] paramArrayOfchar, int paramInt1, int paramInt2, jS paramjS) { for (int i = paramInt1; ++i < paramInt2; ) { char c1 = paramArrayOfchar[i]; int j = i; char c2 = paramArrayOfchar[j - 1]; }  } public static void d(char[] paramArrayOfchar1, char[] paramArrayOfchar2, int paramInt1, int paramInt2) { // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/du.p : J
/*     */     //   3: ldc2_w 48709716089627
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
/*     */     //   35: ldc2_w 8663858015066544826
/*     */     //   38: lload #4
/*     */     //   40: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   45: athrow
/*     */     //   46: aload_0
/*     */     //   47: aload_1
/*     */     //   48: iload_2
/*     */     //   49: iload_3
/*     */     //   50: invokestatic e : ([C[CII)V
/*     */     //   53: return
/*     */     //   54: ldc2_w 8663858015066544826
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
/*     */     //   79: ldc_w '?㢖枉ﭟԬꃦ齜ᡉ搦隕〠튔踟쉤쬴鴙扴'
/*     */     //   82: invokevirtual toCharArray : ()[C
/*     */     //   85: dup
/*     */     //   86: dup
/*     */     //   87: bipush #15
/*     */     //   89: dup_x1
/*     */     //   90: caload
/*     */     //   91: sipush #27989
/*     */     //   94: ixor
/*     */     //   95: i2c
/*     */     //   96: castore
/*     */     //   97: sipush #937
/*     */     //   100: iconst_1
/*     */     //   101: iconst_0
/*     */     //   102: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*     */     //   105: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   108: athrow
/*     */     //   109: ldc2_w 8663858015066544826
/*     */     //   112: lload #4
/*     */     //   114: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   119: athrow
/*     */     //   120: iconst_3
/*     */     //   121: istore #8
/*     */     //   123: new java/util/concurrent/LinkedBlockingQueue
/*     */     //   126: dup
/*     */     //   127: invokespecial <init> : ()V
/*     */     //   130: astore #9
/*     */     //   132: aload #9
/*     */     //   134: new me/konsolas/aac/a7
/*     */     //   137: dup
/*     */     //   138: iload_2
/*     */     //   139: iload_3
/*     */     //   140: iload_2
/*     */     //   141: isub
/*     */     //   142: iconst_0
/*     */     //   143: invokespecial <init> : (III)V
/*     */     //   146: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   149: pop
/*     */     //   150: new java/util/concurrent/atomic/AtomicInteger
/*     */     //   153: dup
/*     */     //   154: iconst_1
/*     */     //   155: invokespecial <init> : (I)V
/*     */     //   158: astore #10
/*     */     //   160: aload #6
/*     */     //   162: invokevirtual getParallelism : ()I
/*     */     //   165: istore #11
/*     */     //   167: new java/util/concurrent/ExecutorCompletionService
/*     */     //   170: dup
/*     */     //   171: aload #6
/*     */     //   173: invokespecial <init> : (Ljava/util/concurrent/Executor;)V
/*     */     //   176: astore #12
/*     */     //   178: iload #11
/*     */     //   180: istore #13
/*     */     //   182: iload #13
/*     */     //   184: iinc #13, -1
/*     */     //   187: ifeq -> 223
/*     */     //   190: aload #12
/*     */     //   192: aload #10
/*     */     //   194: iload #11
/*     */     //   196: aload #9
/*     */     //   198: aload_0
/*     */     //   199: aload_1
/*     */     //   200: <illegal opcode> call : (Ljava/util/concurrent/atomic/AtomicInteger;ILjava/util/concurrent/LinkedBlockingQueue;[C[C)Ljava/util/concurrent/Callable;
/*     */     //   205: invokevirtual submit : (Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
/*     */     //   208: pop
/*     */     //   209: goto -> 182
/*     */     //   212: ldc2_w 8663858015066544826
/*     */     //   215: lload #4
/*     */     //   217: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   222: athrow
/*     */     //   223: aconst_null
/*     */     //   224: astore #13
/*     */     //   226: iload #11
/*     */     //   228: istore #14
/*     */     //   230: iload #14
/*     */     //   232: iinc #14, -1
/*     */     //   235: ifeq -> 264
/*     */     //   238: aload #12
/*     */     //   240: invokevirtual take : ()Ljava/util/concurrent/Future;
/*     */     //   243: invokeinterface get : ()Ljava/lang/Object;
/*     */     //   248: pop
/*     */     //   249: goto -> 230
/*     */     //   252: astore #15
/*     */     //   254: aload #15
/*     */     //   256: invokevirtual getCause : ()Ljava/lang/Throwable;
/*     */     //   259: astore #13
/*     */     //   261: goto -> 230
/*     */     //   264: aload #13
/*     */     //   266: ifnull -> 320
/*     */     //   269: aload #13
/*     */     //   271: instanceof java/lang/RuntimeException
/*     */     //   274: ifeq -> 310
/*     */     //   277: goto -> 291
/*     */     //   280: ldc2_w 8663858015066544826
/*     */     //   283: lload #4
/*     */     //   285: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   290: athrow
/*     */     //   291: aload #13
/*     */     //   293: checkcast java/lang/RuntimeException
/*     */     //   296: goto -> 319
/*     */     //   299: ldc2_w 8663858015066544826
/*     */     //   302: lload #4
/*     */     //   304: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   309: athrow
/*     */     //   310: new java/lang/RuntimeException
/*     */     //   313: dup
/*     */     //   314: aload #13
/*     */     //   316: invokespecial <init> : (Ljava/lang/Throwable;)V
/*     */     //   319: athrow
/*     */     //   320: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #675	-> 9
/*     */     //   #35	-> 14
/*     */     //   #571	-> 46
/*     */     //   #301	-> 53
/*     */     //   #434	-> 65
/*     */     //   #704	-> 68
/*     */     //   #539	-> 120
/*     */     //   #459	-> 123
/*     */     //   #795	-> 132
/*     */     //   #811	-> 150
/*     */     //   #783	-> 160
/*     */     //   #403	-> 167
/*     */     //   #832	-> 178
/*     */     //   #62	-> 223
/*     */     //   #471	-> 226
/*     */     //   #227	-> 238
/*     */     //   #600	-> 249
/*     */     //   #16	-> 252
/*     */     //   #523	-> 254
/*     */     //   #899	-> 261
/*     */     //   #341	-> 264
/*     */     //   #671	-> 320
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   14	32	35	java/lang/Exception
/*     */     //   23	54	54	java/lang/Exception
/*     */     //   68	109	109	java/lang/Exception
/*     */     //   182	212	212	java/lang/Exception
/*     */     //   238	249	252	java/lang/Exception
/*     */     //   264	277	280	java/lang/Exception
/*     */     //   269	299	299	java/lang/Exception } public static void e(char[] paramArrayOfchar1, char[] paramArrayOfchar2) { d(paramArrayOfchar1, paramArrayOfchar2); b(paramArrayOfchar1, paramArrayOfchar2, 0, paramArrayOfchar1.length); } public static void h(char[] paramArrayOfchar, int paramInt1, int paramInt2) { char c = paramArrayOfchar[paramInt1]; paramArrayOfchar[paramInt1] = paramArrayOfchar[paramInt2]; paramArrayOfchar[paramInt2] = c; } public static char[] c(char[] paramArrayOfchar, int paramInt) { try { if (paramInt >= paramArrayOfchar.length) return paramArrayOfchar;  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  char[] arrayOfChar = (paramInt == 0) ? n : new char[paramInt]; System.arraycopy(paramArrayOfchar, 0, arrayOfChar, 0, paramInt); return arrayOfChar; } public static void a(char[] paramArrayOfchar, jS paramjS) { g(paramArrayOfchar, 0, paramArrayOfchar.length, paramjS); } public static void b(char[] paramArrayOfchar, jS paramjS) { b(paramArrayOfchar, 0, paramArrayOfchar.length, paramjS); } public static void a(char[] paramArrayOfchar, int paramInt1, int paramInt2, int paramInt3) { byte b = 0; try { while (b < paramInt3) { h(paramArrayOfchar, paramInt1, paramInt2); b++; paramInt1++; paramInt2++; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  } private static void a(char[] paramArrayOfchar, int paramInt1, int paramInt2) { for (int i = paramInt1; ++i < paramInt2; ) { char c1 = paramArrayOfchar[i]; int j = i; char c2 = paramArrayOfchar[j - 1]; }  } public static void e(char[] paramArrayOfchar, int paramInt1, int paramInt2) { ForkJoinPool forkJoinPool = a(); try { if (paramInt2 - paramInt1 >= 1024) try { if (forkJoinPool.getParallelism() != 1) { boolean bool = true; LinkedBlockingQueue<a7> linkedBlockingQueue = new LinkedBlockingQueue(); linkedBlockingQueue.add(new a7(paramInt1, paramInt2 - paramInt1, 0)); AtomicInteger atomicInteger = new AtomicInteger(1); int i = forkJoinPool.getParallelism(); ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(forkJoinPool); int j = i; try { for (; j-- != 0; executorCompletionService.submit(() -> { int[] arrayOfInt1 = new int[256]; int[] arrayOfInt2 = new int[256]; while (true) { if (paramAtomicInteger.get() == 0) { int i4 = paramInt; try { while (i4-- != 0) paramLinkedBlockingQueue.add(b);  } catch (Exception exception) { throw a(null); }  }  a7 a71 = paramLinkedBlockingQueue.take(); try { if (a71 == b) return null;  } catch (Exception exception) { throw a(null); }  int i = a71.b; int j = a71.c; int k = a71.a; boolean bool = false; int m = (1 - k % 2) * 8; int n = i + j; try { while (n-- != i) arrayOfInt1[paramArrayOfchar[n] >>> m & 0xFF ^ 0x0] = arrayOfInt1[paramArrayOfchar[n] >>> m & 0xFF ^ 0x0] + 1;  } catch (Exception exception) { throw a(null); }  n = -1; int i1 = 0; int i2 = i; while (true) { try { if (i1 < 256) { if (arrayOfInt1[i1] != 0) n = i1;  arrayOfInt2[i1] = i2 += arrayOfInt1[i1]; }  } catch (Exception exception) { throw a(null); }  break; }  i1 = i + j - arrayOfInt1[n]; i2 = i; for (int i3 = -1; i2 <= i1; i3 = SYNTHETIC_LOCAL_VARIABLE_17 >>> m & 0xFF ^ 0x0) { char c = paramArrayOfchar[i2]; continue; }  paramAtomicInteger.decrementAndGet(); }  })); } catch (Exception exception) { throw a(null); }  Throwable throwable = null; for (int k = i; k-- != 0; throwable = exception.getCause()) { try { executorCompletionService.take().get(); continue; } catch (Exception exception) {} }  try { if (throwable != null) { try {  } catch (Exception exception) { throw a(null); }  throw (throwable instanceof RuntimeException) ? (RuntimeException)throwable : new RuntimeException(throwable); }  } catch (Exception exception) { throw a(null); }  return; }  d(paramArrayOfchar, paramInt1, paramInt2); return; } catch (Exception exception) { throw a(null); }   } catch (Exception exception) { throw a(null); }  d(paramArrayOfchar, paramInt1, paramInt2); } public static void a(char[] paramArrayOfchar1, char[] paramArrayOfchar2) { d(paramArrayOfchar1, paramArrayOfchar2); e(paramArrayOfchar1, paramArrayOfchar2, 0, paramArrayOfchar1.length); } public static void c(char[] paramArrayOfchar) { f(paramArrayOfchar, 0, paramArrayOfchar.length); } public static void c(char[] paramArrayOfchar1, char[] paramArrayOfchar2, int paramInt1, int paramInt2) { try { if (paramInt2 - paramInt1 < 1024) { a(paramArrayOfchar1, paramArrayOfchar2, paramInt1, paramInt2); return; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  byte b1 = 2; byte b2 = 3; char c = '˾'; byte b3 = 0; int[] arrayOfInt1 = new int[766]; int[] arrayOfInt2 = new int[766]; int[] arrayOfInt3 = new int[766]; arrayOfInt1[b3] = paramInt1; arrayOfInt2[b3] = paramInt2 - paramInt1; arrayOfInt3[b3++] = 0; int[] arrayOfInt4 = new int[256]; int[] arrayOfInt5 = new int[256]; for (; b3 > 0; j = arrayOfInt2[b3], k = arrayOfInt3[b3], bool = false) { int j, k; boolean bool; int i = arrayOfInt1[--b3]; }  } public static void c(int[] paramArrayOfint, char[] paramArrayOfchar, int paramInt1, int paramInt2) { // Byte code:
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
/*     */     //   16: invokestatic b : ([I[CII)V
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
/*     */     //   71: invokestatic b : ([I[CIII)I
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
/*     */     //   90: invokestatic b : ([I[CIII)I
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
/*     */     //   111: invokestatic b : ([I[CIII)I
/*     */     //   114: istore #7
/*     */     //   116: aload_0
/*     */     //   117: aload_1
/*     */     //   118: iload #6
/*     */     //   120: iload #5
/*     */     //   122: iload #7
/*     */     //   124: invokestatic b : ([I[CIII)I
/*     */     //   127: istore #5
/*     */     //   129: aload_1
/*     */     //   130: aload_0
/*     */     //   131: iload #5
/*     */     //   133: iaload
/*     */     //   134: caload
/*     */     //   135: istore #8
/*     */     //   137: iload_2
/*     */     //   138: istore #9
/*     */     //   140: iload #9
/*     */     //   142: istore #10
/*     */     //   144: iload_3
/*     */     //   145: iconst_1
/*     */     //   146: isub
/*     */     //   147: istore #11
/*     */     //   149: iload #11
/*     */     //   151: istore #12
/*     */     //   153: iload #10
/*     */     //   155: iload #11
/*     */     //   157: if_icmpgt -> 213
/*     */     //   160: aload_1
/*     */     //   161: aload_0
/*     */     //   162: iload #10
/*     */     //   164: iaload
/*     */     //   165: caload
/*     */     //   166: iload #8
/*     */     //   168: invokestatic compare : (CC)I
/*     */     //   171: dup
/*     */     //   172: istore #13
/*     */     //   174: ifgt -> 213
/*     */     //   177: iload #13
/*     */     //   179: ifne -> 207
/*     */     //   182: goto -> 189
/*     */     //   185: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   188: athrow
/*     */     //   189: aload_0
/*     */     //   190: iload #9
/*     */     //   192: iinc #9, 1
/*     */     //   195: iload #10
/*     */     //   197: invokestatic g : ([III)V
/*     */     //   200: goto -> 207
/*     */     //   203: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   206: athrow
/*     */     //   207: iinc #10, 1
/*     */     //   210: goto -> 153
/*     */     //   213: iload #11
/*     */     //   215: iload #10
/*     */     //   217: if_icmplt -> 273
/*     */     //   220: aload_1
/*     */     //   221: aload_0
/*     */     //   222: iload #11
/*     */     //   224: iaload
/*     */     //   225: caload
/*     */     //   226: iload #8
/*     */     //   228: invokestatic compare : (CC)I
/*     */     //   231: dup
/*     */     //   232: istore #13
/*     */     //   234: iflt -> 273
/*     */     //   237: iload #13
/*     */     //   239: ifne -> 267
/*     */     //   242: goto -> 249
/*     */     //   245: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   248: athrow
/*     */     //   249: aload_0
/*     */     //   250: iload #11
/*     */     //   252: iload #12
/*     */     //   254: iinc #12, -1
/*     */     //   257: invokestatic g : ([III)V
/*     */     //   260: goto -> 267
/*     */     //   263: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   266: athrow
/*     */     //   267: iinc #11, -1
/*     */     //   270: goto -> 213
/*     */     //   273: iload #10
/*     */     //   275: iload #11
/*     */     //   277: if_icmple -> 287
/*     */     //   280: goto -> 304
/*     */     //   283: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   286: athrow
/*     */     //   287: aload_0
/*     */     //   288: iload #10
/*     */     //   290: iinc #10, 1
/*     */     //   293: iload #11
/*     */     //   295: iinc #11, -1
/*     */     //   298: invokestatic g : ([III)V
/*     */     //   301: goto -> 153
/*     */     //   304: iload #9
/*     */     //   306: iload_2
/*     */     //   307: isub
/*     */     //   308: iload #10
/*     */     //   310: iload #9
/*     */     //   312: isub
/*     */     //   313: invokestatic min : (II)I
/*     */     //   316: istore #13
/*     */     //   318: aload_0
/*     */     //   319: iload_2
/*     */     //   320: iload #10
/*     */     //   322: iload #13
/*     */     //   324: isub
/*     */     //   325: iload #13
/*     */     //   327: invokestatic b : ([IIII)V
/*     */     //   330: iload #12
/*     */     //   332: iload #11
/*     */     //   334: isub
/*     */     //   335: iload_3
/*     */     //   336: iload #12
/*     */     //   338: isub
/*     */     //   339: iconst_1
/*     */     //   340: isub
/*     */     //   341: invokestatic min : (II)I
/*     */     //   344: istore #13
/*     */     //   346: aload_0
/*     */     //   347: iload #10
/*     */     //   349: iload_3
/*     */     //   350: iload #13
/*     */     //   352: isub
/*     */     //   353: iload #13
/*     */     //   355: invokestatic b : ([IIII)V
/*     */     //   358: iload #10
/*     */     //   360: iload #9
/*     */     //   362: isub
/*     */     //   363: dup
/*     */     //   364: istore #13
/*     */     //   366: iconst_1
/*     */     //   367: if_icmple -> 387
/*     */     //   370: aload_0
/*     */     //   371: aload_1
/*     */     //   372: iload_2
/*     */     //   373: iload_2
/*     */     //   374: iload #13
/*     */     //   376: iadd
/*     */     //   377: invokestatic c : ([I[CII)V
/*     */     //   380: goto -> 387
/*     */     //   383: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   386: athrow
/*     */     //   387: iload #12
/*     */     //   389: iload #11
/*     */     //   391: isub
/*     */     //   392: dup
/*     */     //   393: istore #13
/*     */     //   395: iconst_1
/*     */     //   396: if_icmple -> 416
/*     */     //   399: aload_0
/*     */     //   400: aload_1
/*     */     //   401: iload_3
/*     */     //   402: iload #13
/*     */     //   404: isub
/*     */     //   405: iload_3
/*     */     //   406: invokestatic c : ([I[CII)V
/*     */     //   409: goto -> 416
/*     */     //   412: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   415: athrow
/*     */     //   416: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #790	-> 0
/*     */     //   #895	-> 5
/*     */     //   #881	-> 12
/*     */     //   #108	-> 19
/*     */     //   #672	-> 24
/*     */     //   #423	-> 32
/*     */     //   #132	-> 35
/*     */     //   #152	-> 40
/*     */     //   #140	-> 48
/*     */     //   #43	-> 55
/*     */     //   #743	-> 76
/*     */     //   #592	-> 95
/*     */     //   #686	-> 116
/*     */     //   #313	-> 129
/*     */     //   #935	-> 137
/*     */     //   #498	-> 153
/*     */     //   #562	-> 177
/*     */     //   #536	-> 207
/*     */     //   #646	-> 213
/*     */     //   #315	-> 237
/*     */     //   #86	-> 267
/*     */     //   #610	-> 273
/*     */     //   #549	-> 287
/*     */     //   #922	-> 304
/*     */     //   #389	-> 318
/*     */     //   #342	-> 330
/*     */     //   #824	-> 346
/*     */     //   #144	-> 358
/*     */     //   #766	-> 387
/*     */     //   #740	-> 416
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   5	20	20	java/lang/IllegalArgumentException
/*     */     //   174	182	185	java/lang/IllegalArgumentException
/*     */     //   177	200	203	java/lang/IllegalArgumentException
/*     */     //   234	242	245	java/lang/IllegalArgumentException
/*     */     //   237	260	263	java/lang/IllegalArgumentException
/*     */     //   273	283	283	java/lang/IllegalArgumentException
/*     */     //   366	380	383	java/lang/IllegalArgumentException
/*     */     //   395	409	412	java/lang/IllegalArgumentException } public static char[] a(char[] paramArrayOfchar, int paramInt1, int paramInt2, Random paramRandom) { for (int i = paramInt2 - paramInt1; i-- != 0; c = paramArrayOfchar[paramInt1 + i], paramArrayOfchar[paramInt1 + i] = paramArrayOfchar[paramInt1 + j], paramArrayOfchar[paramInt1 + j] = c) { char c; int j = paramRandom.nextInt(i + 1); }  return paramArrayOfchar; } public static void b(char[] paramArrayOfchar, int paramInt1, int paramInt2) { j(paramArrayOfchar, paramInt1, paramInt2); } public static void g(char[] paramArrayOfchar, int paramInt1, int paramInt2, jS paramjS) { // Byte code:
/*     */     //   0: iload_2
/*     */     //   1: iload_1
/*     */     //   2: isub
/*     */     //   3: istore #4
/*     */     //   5: iload #4
/*     */     //   7: bipush #16
/*     */     //   9: if_icmpge -> 24
/*     */     //   12: aload_0
/*     */     //   13: iload_1
/*     */     //   14: iload_2
/*     */     //   15: aload_3
/*     */     //   16: invokestatic d : ([CIILme/konsolas/aac/jS;)V
/*     */     //   19: return
/*     */     //   20: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   23: athrow
/*     */     //   24: iload_1
/*     */     //   25: iload #4
/*     */     //   27: iconst_2
/*     */     //   28: idiv
/*     */     //   29: iadd
/*     */     //   30: istore #5
/*     */     //   32: iload_1
/*     */     //   33: istore #6
/*     */     //   35: iload_2
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
/*     */     //   56: iload #6
/*     */     //   58: iload #6
/*     */     //   60: iload #8
/*     */     //   62: iadd
/*     */     //   63: iload #6
/*     */     //   65: iconst_2
/*     */     //   66: iload #8
/*     */     //   68: imul
/*     */     //   69: iadd
/*     */     //   70: aload_3
/*     */     //   71: invokestatic a : ([CIIILme/konsolas/aac/jS;)I
/*     */     //   74: istore #6
/*     */     //   76: aload_0
/*     */     //   77: iload #5
/*     */     //   79: iload #8
/*     */     //   81: isub
/*     */     //   82: iload #5
/*     */     //   84: iload #5
/*     */     //   86: iload #8
/*     */     //   88: iadd
/*     */     //   89: aload_3
/*     */     //   90: invokestatic a : ([CIIILme/konsolas/aac/jS;)I
/*     */     //   93: istore #5
/*     */     //   95: aload_0
/*     */     //   96: iload #7
/*     */     //   98: iconst_2
/*     */     //   99: iload #8
/*     */     //   101: imul
/*     */     //   102: isub
/*     */     //   103: iload #7
/*     */     //   105: iload #8
/*     */     //   107: isub
/*     */     //   108: iload #7
/*     */     //   110: aload_3
/*     */     //   111: invokestatic a : ([CIIILme/konsolas/aac/jS;)I
/*     */     //   114: istore #7
/*     */     //   116: aload_0
/*     */     //   117: iload #6
/*     */     //   119: iload #5
/*     */     //   121: iload #7
/*     */     //   123: aload_3
/*     */     //   124: invokestatic a : ([CIIILme/konsolas/aac/jS;)I
/*     */     //   127: istore #5
/*     */     //   129: aload_0
/*     */     //   130: iload #5
/*     */     //   132: caload
/*     */     //   133: istore #8
/*     */     //   135: iload_1
/*     */     //   136: istore #9
/*     */     //   138: iload #9
/*     */     //   140: istore #10
/*     */     //   142: iload_2
/*     */     //   143: iconst_1
/*     */     //   144: isub
/*     */     //   145: istore #11
/*     */     //   147: iload #11
/*     */     //   149: istore #12
/*     */     //   151: iload #10
/*     */     //   153: iload #11
/*     */     //   155: if_icmpgt -> 212
/*     */     //   158: aload_3
/*     */     //   159: aload_0
/*     */     //   160: iload #10
/*     */     //   162: caload
/*     */     //   163: iload #8
/*     */     //   165: invokeinterface a : (CC)I
/*     */     //   170: dup
/*     */     //   171: istore #13
/*     */     //   173: ifgt -> 212
/*     */     //   176: iload #13
/*     */     //   178: ifne -> 206
/*     */     //   181: goto -> 188
/*     */     //   184: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   187: athrow
/*     */     //   188: aload_0
/*     */     //   189: iload #9
/*     */     //   191: iinc #9, 1
/*     */     //   194: iload #10
/*     */     //   196: invokestatic h : ([CII)V
/*     */     //   199: goto -> 206
/*     */     //   202: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   205: athrow
/*     */     //   206: iinc #10, 1
/*     */     //   209: goto -> 151
/*     */     //   212: iload #11
/*     */     //   214: iload #10
/*     */     //   216: if_icmplt -> 273
/*     */     //   219: aload_3
/*     */     //   220: aload_0
/*     */     //   221: iload #11
/*     */     //   223: caload
/*     */     //   224: iload #8
/*     */     //   226: invokeinterface a : (CC)I
/*     */     //   231: dup
/*     */     //   232: istore #13
/*     */     //   234: iflt -> 273
/*     */     //   237: iload #13
/*     */     //   239: ifne -> 267
/*     */     //   242: goto -> 249
/*     */     //   245: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   248: athrow
/*     */     //   249: aload_0
/*     */     //   250: iload #11
/*     */     //   252: iload #12
/*     */     //   254: iinc #12, -1
/*     */     //   257: invokestatic h : ([CII)V
/*     */     //   260: goto -> 267
/*     */     //   263: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   266: athrow
/*     */     //   267: iinc #11, -1
/*     */     //   270: goto -> 212
/*     */     //   273: iload #10
/*     */     //   275: iload #11
/*     */     //   277: if_icmple -> 287
/*     */     //   280: goto -> 304
/*     */     //   283: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   286: athrow
/*     */     //   287: aload_0
/*     */     //   288: iload #10
/*     */     //   290: iinc #10, 1
/*     */     //   293: iload #11
/*     */     //   295: iinc #11, -1
/*     */     //   298: invokestatic h : ([CII)V
/*     */     //   301: goto -> 151
/*     */     //   304: iload #9
/*     */     //   306: iload_1
/*     */     //   307: isub
/*     */     //   308: iload #10
/*     */     //   310: iload #9
/*     */     //   312: isub
/*     */     //   313: invokestatic min : (II)I
/*     */     //   316: istore #13
/*     */     //   318: aload_0
/*     */     //   319: iload_1
/*     */     //   320: iload #10
/*     */     //   322: iload #13
/*     */     //   324: isub
/*     */     //   325: iload #13
/*     */     //   327: invokestatic a : ([CIII)V
/*     */     //   330: iload #12
/*     */     //   332: iload #11
/*     */     //   334: isub
/*     */     //   335: iload_2
/*     */     //   336: iload #12
/*     */     //   338: isub
/*     */     //   339: iconst_1
/*     */     //   340: isub
/*     */     //   341: invokestatic min : (II)I
/*     */     //   344: istore #13
/*     */     //   346: aload_0
/*     */     //   347: iload #10
/*     */     //   349: iload_2
/*     */     //   350: iload #13
/*     */     //   352: isub
/*     */     //   353: iload #13
/*     */     //   355: invokestatic a : ([CIII)V
/*     */     //   358: iload #10
/*     */     //   360: iload #9
/*     */     //   362: isub
/*     */     //   363: dup
/*     */     //   364: istore #13
/*     */     //   366: iconst_1
/*     */     //   367: if_icmple -> 387
/*     */     //   370: aload_0
/*     */     //   371: iload_1
/*     */     //   372: iload_1
/*     */     //   373: iload #13
/*     */     //   375: iadd
/*     */     //   376: aload_3
/*     */     //   377: invokestatic g : ([CIILme/konsolas/aac/jS;)V
/*     */     //   380: goto -> 387
/*     */     //   383: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   386: athrow
/*     */     //   387: iload #12
/*     */     //   389: iload #11
/*     */     //   391: isub
/*     */     //   392: dup
/*     */     //   393: istore #13
/*     */     //   395: iconst_1
/*     */     //   396: if_icmple -> 416
/*     */     //   399: aload_0
/*     */     //   400: iload_2
/*     */     //   401: iload #13
/*     */     //   403: isub
/*     */     //   404: iload_2
/*     */     //   405: aload_3
/*     */     //   406: invokestatic g : ([CIILme/konsolas/aac/jS;)V
/*     */     //   409: goto -> 416
/*     */     //   412: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   415: athrow
/*     */     //   416: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #817	-> 0
/*     */     //   #355	-> 5
/*     */     //   #336	-> 12
/*     */     //   #810	-> 19
/*     */     //   #314	-> 24
/*     */     //   #878	-> 32
/*     */     //   #839	-> 35
/*     */     //   #215	-> 40
/*     */     //   #754	-> 48
/*     */     //   #720	-> 55
/*     */     //   #338	-> 76
/*     */     //   #47	-> 95
/*     */     //   #644	-> 116
/*     */     //   #872	-> 129
/*     */     //   #444	-> 135
/*     */     //   #709	-> 151
/*     */     //   #87	-> 176
/*     */     //   #303	-> 206
/*     */     //   #593	-> 212
/*     */     //   #731	-> 237
/*     */     //   #112	-> 267
/*     */     //   #828	-> 273
/*     */     //   #884	-> 287
/*     */     //   #574	-> 304
/*     */     //   #478	-> 318
/*     */     //   #560	-> 330
/*     */     //   #409	-> 346
/*     */     //   #111	-> 358
/*     */     //   #584	-> 387
/*     */     //   #732	-> 416
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   5	20	20	java/lang/IllegalArgumentException
/*     */     //   173	181	184	java/lang/IllegalArgumentException
/*     */     //   176	199	202	java/lang/IllegalArgumentException
/*     */     //   234	242	245	java/lang/IllegalArgumentException
/*     */     //   237	260	263	java/lang/IllegalArgumentException
/*     */     //   273	283	283	java/lang/IllegalArgumentException
/*     */     //   366	380	383	java/lang/IllegalArgumentException
/*     */     //   395	409	412	java/lang/IllegalArgumentException } @Deprecated public static boolean a(char[] paramArrayOfchar1, char[] paramArrayOfchar2) { int i = paramArrayOfchar1.length; try { if (i != paramArrayOfchar2.length) return false;  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  while (i-- != 0) { if (paramArrayOfchar1[i] != paramArrayOfchar2[i]) return false;  }  return true; } private static void b(int[] paramArrayOfint, char[] paramArrayOfchar, int paramInt1, int paramInt2) { for (int i = paramInt1; ++i < paramInt2; k = i, m = paramArrayOfint[k - 1]) int k, m, j = paramArrayOfint[i];  } public static void d(char[] paramArrayOfchar, jS paramjS) { e(paramArrayOfchar, 0, paramArrayOfchar.length, paramjS); } private static int a(char[] paramArrayOfchar1, char[] paramArrayOfchar2, int paramInt1, int paramInt2, int paramInt3) { try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  int i, j = ((i = Character.compare(paramArrayOfchar1[paramInt1], paramArrayOfchar1[paramInt2])) == 0) ? Character.compare(paramArrayOfchar2[paramInt1], paramArrayOfchar2[paramInt2]) : i; try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  int k = ((i = Character.compare(paramArrayOfchar1[paramInt1], paramArrayOfchar1[paramInt3])) == 0) ? Character.compare(paramArrayOfchar2[paramInt1], paramArrayOfchar2[paramInt3]) : i; try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  int m = ((i = Character.compare(paramArrayOfchar1[paramInt2], paramArrayOfchar1[paramInt3])) == 0) ? Character.compare(paramArrayOfchar2[paramInt2], paramArrayOfchar2[paramInt3]) : i; try { if (j < 0) { try { try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  } else { try { try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return (m > 0) ? paramInt2 : ((k > 0) ? paramInt3 : paramInt1); } public static char[] d(char[] paramArrayOfchar, int paramInt1, int paramInt2) { if (paramInt1 > paramArrayOfchar.length) { int i = (int)Math.max(Math.min(paramArrayOfchar.length + (paramArrayOfchar.length >> 1), 2147483639L), paramInt1); char[] arrayOfChar = new char[i]; System.arraycopy(paramArrayOfchar, 0, arrayOfChar, 0, paramInt2); return arrayOfChar; }  return paramArrayOfchar; } public static int a(char[] paramArrayOfchar, char paramChar) { return a(paramArrayOfchar, 0, paramArrayOfchar.length, paramChar); } public static void b(char[] paramArrayOfchar) { k(paramArrayOfchar, 0, paramArrayOfchar.length); } public static void e(char[] paramArrayOfchar) { j(paramArrayOfchar, 0, paramArrayOfchar.length); } public static int a(char[] paramArrayOfchar, int paramInt1, int paramInt2, char paramChar, jS paramjS) { paramInt2--; for (; paramInt1 <= paramInt2; c = paramArrayOfchar[i], j = paramjS.a(c, paramChar)) { char c; int j, i = paramInt1 + paramInt2 >>> 1; }  return -(paramInt1 + 1); } private static void f(char[] paramArrayOfchar1, char[] paramArrayOfchar2, int paramInt1, int paramInt2) { char c1 = paramArrayOfchar1[paramInt1]; char c2 = paramArrayOfchar2[paramInt1]; paramArrayOfchar1[paramInt1] = paramArrayOfchar1[paramInt2]; paramArrayOfchar2[paramInt1] = paramArrayOfchar2[paramInt2]; paramArrayOfchar1[paramInt2] = c1; paramArrayOfchar2[paramInt2] = c2; }
/* 946 */   private static int b(int[] paramArrayOfint, char[] paramArrayOfchar, int paramInt1, int paramInt2, int paramInt3) { char c1 = paramArrayOfchar[paramArrayOfint[paramInt1]];
/*     */     char c2 = paramArrayOfchar[paramArrayOfint[paramInt2]];
/*     */     char c3 = paramArrayOfchar[paramArrayOfint[paramInt3]];
/*     */     int i = Character.compare(c1, c2);
/*     */     int j = Character.compare(c1, c3);
/*     */     int k = Character.compare(c2, c3);
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
/*     */     return (k > 0) ? paramInt2 : ((j > 0) ? paramInt3 : paramInt1); }
/*     */ 
/*     */   
/*     */   static {
/*     */     // Byte code:
/*     */     //   0: ldc2_w 6918904214236969584
/*     */     //   3: ldc2_w 662353860701450464
/*     */     //   6: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
/*     */     //   9: invokevirtual lookupClass : ()Ljava/lang/Class;
/*     */     //   12: invokestatic a : (JJLjava/lang/Object;)Lme/konsolas/aac/na;
/*     */     //   15: ldc2_w 203261494661180
/*     */     //   18: invokeinterface a : (J)J
/*     */     //   23: putstatic me/konsolas/aac/du.p : J
/*     */     //   26: getstatic me/konsolas/aac/du.p : J
/*     */     //   29: ldc2_w 132282890183254
/*     */     //   32: lxor
/*     */     //   33: lstore_0
/*     */     //   34: iconst_0
/*     */     //   35: iconst_0
/*     */     //   36: newarray char
/*     */     //   38: putstatic me/konsolas/aac/du.n : [C
/*     */     //   41: ldc2_w -9142879636415920301
/*     */     //   44: lload_0
/*     */     //   45: <illegal opcode> w : (IJJ)V
/*     */     //   50: iconst_0
/*     */     //   51: newarray char
/*     */     //   53: putstatic me/konsolas/aac/du.m : [C
/*     */     //   56: new me/konsolas/aac/a7
/*     */     //   59: dup
/*     */     //   60: iconst_m1
/*     */     //   61: iconst_m1
/*     */     //   62: iconst_m1
/*     */     //   63: invokespecial <init> : (III)V
/*     */     //   66: putstatic me/konsolas/aac/du.b : Lme/konsolas/aac/a7;
/*     */     //   69: new me/konsolas/aac/et
/*     */     //   72: dup
/*     */     //   73: aconst_null
/*     */     //   74: invokespecial <init> : (Lme/konsolas/aac/e0;)V
/*     */     //   77: putstatic me/konsolas/aac/du.h : Lme/konsolas/aac/m9;
/*     */     //   80: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #500	-> 35
/*     */     //   #813	-> 50
/*     */     //   #710	-> 56
/*     */     //   #326	-> 69
/*     */   }
/*     */   
/*     */   public static void b(int paramInt) {
/*     */     k = paramInt;
/*     */   }
/*     */   
/*     */   public static int b() {
/*     */     return k;
/*     */   }
/*     */   
/*     */   public static int a() {
/*     */     int i = b();
/*     */     try {
/*     */       if (i == 0)
/*     */         return 104; 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw a(null);
/*     */     } 
/*     */     return 0;
/*     */   }
/*     */   
/*     */   private static Exception a(Exception paramException) {
/*     */     return paramException;
/*     */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\du.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */