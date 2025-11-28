/*    */ package me.konsolas.aac;
/*    */ public class p extends RecursiveAction {
/*    */   public p(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2) {
/*  4 */     this.c = paramInt1;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     this.a = paramInt2;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 20 */     this.d = paramArrayOfbyte1;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 29 */     this.b = paramArrayOfbyte2;
/*    */   }
/*    */   
/*    */   private static final long serialVersionUID = 1L;
/*    */   private final int c;
/*    */   private final int a;
/*    */   private final byte[] d;
/*    */   private final byte[] b;
/*    */   
/*    */   protected void compute() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield d : [B
/*    */     //   4: astore_1
/*    */     //   5: aload_0
/*    */     //   6: getfield b : [B
/*    */     //   9: astore_2
/*    */     //   10: aload_0
/*    */     //   11: getfield a : I
/*    */     //   14: aload_0
/*    */     //   15: getfield c : I
/*    */     //   18: isub
/*    */     //   19: istore_3
/*    */     //   20: iload_3
/*    */     //   21: sipush #8192
/*    */     //   24: if_icmpge -> 45
/*    */     //   27: aload_1
/*    */     //   28: aload_2
/*    */     //   29: aload_0
/*    */     //   30: getfield c : I
/*    */     //   33: aload_0
/*    */     //   34: getfield a : I
/*    */     //   37: invokestatic f : ([B[BII)V
/*    */     //   40: return
/*    */     //   41: invokestatic a : (Laacinternal/v;)Laacinternal/v;
/*    */     //   44: athrow
/*    */     //   45: aload_0
/*    */     //   46: getfield c : I
/*    */     //   49: iload_3
/*    */     //   50: iconst_2
/*    */     //   51: idiv
/*    */     //   52: iadd
/*    */     //   53: istore #4
/*    */     //   55: aload_0
/*    */     //   56: getfield c : I
/*    */     //   59: istore #5
/*    */     //   61: aload_0
/*    */     //   62: getfield a : I
/*    */     //   65: iconst_1
/*    */     //   66: isub
/*    */     //   67: istore #6
/*    */     //   69: iload_3
/*    */     //   70: bipush #8
/*    */     //   72: idiv
/*    */     //   73: istore #7
/*    */     //   75: aload_1
/*    */     //   76: aload_2
/*    */     //   77: iload #5
/*    */     //   79: iload #5
/*    */     //   81: iload #7
/*    */     //   83: iadd
/*    */     //   84: iload #5
/*    */     //   86: iconst_2
/*    */     //   87: iload #7
/*    */     //   89: imul
/*    */     //   90: iadd
/*    */     //   91: invokestatic b : ([B[BIII)I
/*    */     //   94: istore #5
/*    */     //   96: aload_1
/*    */     //   97: aload_2
/*    */     //   98: iload #4
/*    */     //   100: iload #7
/*    */     //   102: isub
/*    */     //   103: iload #4
/*    */     //   105: iload #4
/*    */     //   107: iload #7
/*    */     //   109: iadd
/*    */     //   110: invokestatic b : ([B[BIII)I
/*    */     //   113: istore #4
/*    */     //   115: aload_1
/*    */     //   116: aload_2
/*    */     //   117: iload #6
/*    */     //   119: iconst_2
/*    */     //   120: iload #7
/*    */     //   122: imul
/*    */     //   123: isub
/*    */     //   124: iload #6
/*    */     //   126: iload #7
/*    */     //   128: isub
/*    */     //   129: iload #6
/*    */     //   131: invokestatic b : ([B[BIII)I
/*    */     //   134: istore #6
/*    */     //   136: aload_1
/*    */     //   137: aload_2
/*    */     //   138: iload #5
/*    */     //   140: iload #4
/*    */     //   142: iload #6
/*    */     //   144: invokestatic b : ([B[BIII)I
/*    */     //   147: istore #4
/*    */     //   149: aload_1
/*    */     //   150: iload #4
/*    */     //   152: baload
/*    */     //   153: istore #8
/*    */     //   155: aload_2
/*    */     //   156: iload #4
/*    */     //   158: baload
/*    */     //   159: istore #9
/*    */     //   161: aload_0
/*    */     //   162: getfield c : I
/*    */     //   165: istore #10
/*    */     //   167: iload #10
/*    */     //   169: istore #11
/*    */     //   171: aload_0
/*    */     //   172: getfield a : I
/*    */     //   175: iconst_1
/*    */     //   176: isub
/*    */     //   177: istore #12
/*    */     //   179: iload #12
/*    */     //   181: istore #13
/*    */     //   183: iload #11
/*    */     //   185: iload #12
/*    */     //   187: if_icmpgt -> 266
/*    */     //   190: aload_1
/*    */     //   191: iload #11
/*    */     //   193: baload
/*    */     //   194: iload #8
/*    */     //   196: invokestatic compare : (BB)I
/*    */     //   199: dup
/*    */     //   200: istore #15
/*    */     //   202: ifne -> 221
/*    */     //   205: aload_2
/*    */     //   206: iload #11
/*    */     //   208: baload
/*    */     //   209: iload #9
/*    */     //   211: invokestatic compare : (BB)I
/*    */     //   214: goto -> 223
/*    */     //   217: invokestatic a : (Laacinternal/v;)Laacinternal/v;
/*    */     //   220: athrow
/*    */     //   221: iload #15
/*    */     //   223: dup
/*    */     //   224: istore #14
/*    */     //   226: ifgt -> 266
/*    */     //   229: iload #14
/*    */     //   231: ifne -> 260
/*    */     //   234: goto -> 241
/*    */     //   237: invokestatic a : (Laacinternal/v;)Laacinternal/v;
/*    */     //   240: athrow
/*    */     //   241: aload_1
/*    */     //   242: aload_2
/*    */     //   243: iload #10
/*    */     //   245: iinc #10, 1
/*    */     //   248: iload #11
/*    */     //   250: invokestatic e : ([B[BII)V
/*    */     //   253: goto -> 260
/*    */     //   256: invokestatic a : (Laacinternal/v;)Laacinternal/v;
/*    */     //   259: athrow
/*    */     //   260: iinc #11, 1
/*    */     //   263: goto -> 183
/*    */     //   266: iload #12
/*    */     //   268: iload #11
/*    */     //   270: if_icmplt -> 349
/*    */     //   273: aload_1
/*    */     //   274: iload #12
/*    */     //   276: baload
/*    */     //   277: iload #8
/*    */     //   279: invokestatic compare : (BB)I
/*    */     //   282: dup
/*    */     //   283: istore #15
/*    */     //   285: ifne -> 304
/*    */     //   288: aload_2
/*    */     //   289: iload #12
/*    */     //   291: baload
/*    */     //   292: iload #9
/*    */     //   294: invokestatic compare : (BB)I
/*    */     //   297: goto -> 306
/*    */     //   300: invokestatic a : (Laacinternal/v;)Laacinternal/v;
/*    */     //   303: athrow
/*    */     //   304: iload #15
/*    */     //   306: dup
/*    */     //   307: istore #14
/*    */     //   309: iflt -> 349
/*    */     //   312: iload #14
/*    */     //   314: ifne -> 343
/*    */     //   317: goto -> 324
/*    */     //   320: invokestatic a : (Laacinternal/v;)Laacinternal/v;
/*    */     //   323: athrow
/*    */     //   324: aload_1
/*    */     //   325: aload_2
/*    */     //   326: iload #12
/*    */     //   328: iload #13
/*    */     //   330: iinc #13, -1
/*    */     //   333: invokestatic e : ([B[BII)V
/*    */     //   336: goto -> 343
/*    */     //   339: invokestatic a : (Laacinternal/v;)Laacinternal/v;
/*    */     //   342: athrow
/*    */     //   343: iinc #12, -1
/*    */     //   346: goto -> 266
/*    */     //   349: iload #11
/*    */     //   351: iload #12
/*    */     //   353: if_icmple -> 363
/*    */     //   356: goto -> 381
/*    */     //   359: invokestatic a : (Laacinternal/v;)Laacinternal/v;
/*    */     //   362: athrow
/*    */     //   363: aload_1
/*    */     //   364: aload_2
/*    */     //   365: iload #11
/*    */     //   367: iinc #11, 1
/*    */     //   370: iload #12
/*    */     //   372: iinc #12, -1
/*    */     //   375: invokestatic e : ([B[BII)V
/*    */     //   378: goto -> 183
/*    */     //   381: iload #10
/*    */     //   383: aload_0
/*    */     //   384: getfield c : I
/*    */     //   387: isub
/*    */     //   388: iload #11
/*    */     //   390: iload #10
/*    */     //   392: isub
/*    */     //   393: invokestatic min : (II)I
/*    */     //   396: istore #7
/*    */     //   398: aload_1
/*    */     //   399: aload_2
/*    */     //   400: aload_0
/*    */     //   401: getfield c : I
/*    */     //   404: iload #11
/*    */     //   406: iload #7
/*    */     //   408: isub
/*    */     //   409: iload #7
/*    */     //   411: invokestatic b : ([B[BIII)V
/*    */     //   414: iload #13
/*    */     //   416: iload #12
/*    */     //   418: isub
/*    */     //   419: aload_0
/*    */     //   420: getfield a : I
/*    */     //   423: iload #13
/*    */     //   425: isub
/*    */     //   426: iconst_1
/*    */     //   427: isub
/*    */     //   428: invokestatic min : (II)I
/*    */     //   431: istore #7
/*    */     //   433: aload_1
/*    */     //   434: aload_2
/*    */     //   435: iload #11
/*    */     //   437: aload_0
/*    */     //   438: getfield a : I
/*    */     //   441: iload #7
/*    */     //   443: isub
/*    */     //   444: iload #7
/*    */     //   446: invokestatic b : ([B[BIII)V
/*    */     //   449: iload #11
/*    */     //   451: iload #10
/*    */     //   453: isub
/*    */     //   454: istore #7
/*    */     //   456: iload #13
/*    */     //   458: iload #12
/*    */     //   460: isub
/*    */     //   461: istore #14
/*    */     //   463: iload #7
/*    */     //   465: iconst_1
/*    */     //   466: if_icmple -> 532
/*    */     //   469: iload #14
/*    */     //   471: iconst_1
/*    */     //   472: if_icmple -> 532
/*    */     //   475: goto -> 482
/*    */     //   478: invokestatic a : (Laacinternal/v;)Laacinternal/v;
/*    */     //   481: athrow
/*    */     //   482: new me/konsolas/aac/p
/*    */     //   485: dup
/*    */     //   486: aload_1
/*    */     //   487: aload_2
/*    */     //   488: aload_0
/*    */     //   489: getfield c : I
/*    */     //   492: aload_0
/*    */     //   493: getfield c : I
/*    */     //   496: iload #7
/*    */     //   498: iadd
/*    */     //   499: invokespecial <init> : ([B[BII)V
/*    */     //   502: new me/konsolas/aac/p
/*    */     //   505: dup
/*    */     //   506: aload_1
/*    */     //   507: aload_2
/*    */     //   508: aload_0
/*    */     //   509: getfield a : I
/*    */     //   512: iload #14
/*    */     //   514: isub
/*    */     //   515: aload_0
/*    */     //   516: getfield a : I
/*    */     //   519: invokespecial <init> : ([B[BII)V
/*    */     //   522: invokestatic invokeAll : (Ljava/util/concurrent/ForkJoinTask;Ljava/util/concurrent/ForkJoinTask;)V
/*    */     //   525: goto -> 605
/*    */     //   528: invokestatic a : (Laacinternal/v;)Laacinternal/v;
/*    */     //   531: athrow
/*    */     //   532: iload #7
/*    */     //   534: iconst_1
/*    */     //   535: if_icmple -> 575
/*    */     //   538: iconst_1
/*    */     //   539: anewarray java/util/concurrent/ForkJoinTask
/*    */     //   542: dup
/*    */     //   543: iconst_0
/*    */     //   544: new me/konsolas/aac/p
/*    */     //   547: dup
/*    */     //   548: aload_1
/*    */     //   549: aload_2
/*    */     //   550: aload_0
/*    */     //   551: getfield c : I
/*    */     //   554: aload_0
/*    */     //   555: getfield c : I
/*    */     //   558: iload #7
/*    */     //   560: iadd
/*    */     //   561: invokespecial <init> : ([B[BII)V
/*    */     //   564: aastore
/*    */     //   565: invokestatic invokeAll : ([Ljava/util/concurrent/ForkJoinTask;)V
/*    */     //   568: goto -> 605
/*    */     //   571: invokestatic a : (Laacinternal/v;)Laacinternal/v;
/*    */     //   574: athrow
/*    */     //   575: iconst_1
/*    */     //   576: anewarray java/util/concurrent/ForkJoinTask
/*    */     //   579: dup
/*    */     //   580: iconst_0
/*    */     //   581: new me/konsolas/aac/p
/*    */     //   584: dup
/*    */     //   585: aload_1
/*    */     //   586: aload_2
/*    */     //   587: aload_0
/*    */     //   588: getfield a : I
/*    */     //   591: iload #14
/*    */     //   593: isub
/*    */     //   594: aload_0
/*    */     //   595: getfield a : I
/*    */     //   598: invokespecial <init> : ([B[BII)V
/*    */     //   601: aastore
/*    */     //   602: invokestatic invokeAll : ([Ljava/util/concurrent/ForkJoinTask;)V
/*    */     //   605: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #36	-> 0
/*    */     //   #17	-> 5
/*    */     //   #2	-> 10
/*    */     //   #37	-> 20
/*    */     //   #40	-> 27
/*    */     //   #6	-> 40
/*    */     //   #31	-> 45
/*    */     //   #7	-> 55
/*    */     //   #33	-> 61
/*    */     //   #21	-> 69
/*    */     //   #10	-> 75
/*    */     //   #18	-> 96
/*    */     //   #28	-> 115
/*    */     //   #32	-> 136
/*    */     //   #19	-> 149
/*    */     //   #16	-> 161
/*    */     //   #13	-> 183
/*    */     //   #39	-> 229
/*    */     //   #5	-> 260
/*    */     //   #26	-> 266
/*    */     //   #1	-> 312
/*    */     //   #12	-> 343
/*    */     //   #35	-> 349
/*    */     //   #25	-> 363
/*    */     //   #24	-> 381
/*    */     //   #8	-> 398
/*    */     //   #38	-> 414
/*    */     //   #9	-> 433
/*    */     //   #34	-> 449
/*    */     //   #22	-> 456
/*    */     //   #11	-> 463
/*    */     //   #15	-> 532
/*    */     //   #27	-> 575
/*    */     //   #30	-> 605
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   20	41	41	aacinternal/v
/*    */     //   202	217	217	aacinternal/v
/*    */     //   226	234	237	aacinternal/v
/*    */     //   229	253	256	aacinternal/v
/*    */     //   285	300	300	aacinternal/v
/*    */     //   309	317	320	aacinternal/v
/*    */     //   312	336	339	aacinternal/v
/*    */     //   349	359	359	aacinternal/v
/*    */     //   463	475	478	aacinternal/v
/*    */     //   469	528	528	aacinternal/v
/*    */     //   532	571	571	aacinternal/v
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\p.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */