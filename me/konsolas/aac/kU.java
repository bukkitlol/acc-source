/*    */ package me.konsolas.aac;
/*    */ 
/*    */ import aacinternal.v;
/*    */ import java.util.concurrent.RecursiveAction;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ku
/*    */   extends RecursiveAction
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   private final int a;
/*    */   private final int c;
/*    */   private final short[] d;
/*    */   private final short[] b;
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   }
/*    */   
/*    */   protected void compute() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield d : [S
/*    */     //   4: astore_1
/*    */     //   5: aload_0
/*    */     //   6: getfield b : [S
/*    */     //   9: astore_2
/*    */     //   10: aload_0
/*    */     //   11: getfield c : I
/*    */     //   14: aload_0
/*    */     //   15: getfield a : I
/*    */     //   18: isub
/*    */     //   19: istore_3
/*    */     //   20: iload_3
/*    */     //   21: sipush #8192
/*    */     //   24: if_icmpge -> 45
/*    */     //   27: aload_1
/*    */     //   28: aload_2
/*    */     //   29: aload_0
/*    */     //   30: getfield a : I
/*    */     //   33: aload_0
/*    */     //   34: getfield c : I
/*    */     //   37: invokestatic a : ([S[SII)V
/*    */     //   40: return
/*    */     //   41: invokestatic a : (Laacinternal/v;)Laacinternal/v;
/*    */     //   44: athrow
/*    */     //   45: aload_0
/*    */     //   46: getfield a : I
/*    */     //   49: iload_3
/*    */     //   50: iconst_2
/*    */     //   51: idiv
/*    */     //   52: iadd
/*    */     //   53: istore #4
/*    */     //   55: aload_0
/*    */     //   56: getfield a : I
/*    */     //   59: istore #5
/*    */     //   61: aload_0
/*    */     //   62: getfield c : I
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
/*    */     //   91: invokestatic a : ([S[SIII)I
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
/*    */     //   110: invokestatic a : ([S[SIII)I
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
/*    */     //   131: invokestatic a : ([S[SIII)I
/*    */     //   134: istore #6
/*    */     //   136: aload_1
/*    */     //   137: aload_2
/*    */     //   138: iload #5
/*    */     //   140: iload #4
/*    */     //   142: iload #6
/*    */     //   144: invokestatic a : ([S[SIII)I
/*    */     //   147: istore #4
/*    */     //   149: aload_1
/*    */     //   150: iload #4
/*    */     //   152: saload
/*    */     //   153: istore #8
/*    */     //   155: aload_2
/*    */     //   156: iload #4
/*    */     //   158: saload
/*    */     //   159: istore #9
/*    */     //   161: aload_0
/*    */     //   162: getfield a : I
/*    */     //   165: istore #10
/*    */     //   167: iload #10
/*    */     //   169: istore #11
/*    */     //   171: aload_0
/*    */     //   172: getfield c : I
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
/*    */     //   193: saload
/*    */     //   194: iload #8
/*    */     //   196: invokestatic compare : (SS)I
/*    */     //   199: dup
/*    */     //   200: istore #15
/*    */     //   202: ifne -> 221
/*    */     //   205: aload_2
/*    */     //   206: iload #11
/*    */     //   208: saload
/*    */     //   209: iload #9
/*    */     //   211: invokestatic compare : (SS)I
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
/*    */     //   250: invokestatic d : ([S[SII)V
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
/*    */     //   276: saload
/*    */     //   277: iload #8
/*    */     //   279: invokestatic compare : (SS)I
/*    */     //   282: dup
/*    */     //   283: istore #15
/*    */     //   285: ifne -> 304
/*    */     //   288: aload_2
/*    */     //   289: iload #12
/*    */     //   291: saload
/*    */     //   292: iload #9
/*    */     //   294: invokestatic compare : (SS)I
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
/*    */     //   333: invokestatic d : ([S[SII)V
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
/*    */     //   375: invokestatic d : ([S[SII)V
/*    */     //   378: goto -> 183
/*    */     //   381: iload #10
/*    */     //   383: aload_0
/*    */     //   384: getfield a : I
/*    */     //   387: isub
/*    */     //   388: iload #11
/*    */     //   390: iload #10
/*    */     //   392: isub
/*    */     //   393: invokestatic min : (II)I
/*    */     //   396: istore #7
/*    */     //   398: aload_1
/*    */     //   399: aload_2
/*    */     //   400: aload_0
/*    */     //   401: getfield a : I
/*    */     //   404: iload #11
/*    */     //   406: iload #7
/*    */     //   408: isub
/*    */     //   409: iload #7
/*    */     //   411: invokestatic b : ([S[SIII)V
/*    */     //   414: iload #13
/*    */     //   416: iload #12
/*    */     //   418: isub
/*    */     //   419: aload_0
/*    */     //   420: getfield c : I
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
/*    */     //   438: getfield c : I
/*    */     //   441: iload #7
/*    */     //   443: isub
/*    */     //   444: iload #7
/*    */     //   446: invokestatic b : ([S[SIII)V
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
/*    */     //   482: new me/konsolas/aac/ku
/*    */     //   485: dup
/*    */     //   486: aload_1
/*    */     //   487: aload_2
/*    */     //   488: aload_0
/*    */     //   489: getfield a : I
/*    */     //   492: aload_0
/*    */     //   493: getfield a : I
/*    */     //   496: iload #7
/*    */     //   498: iadd
/*    */     //   499: invokespecial <init> : ([S[SII)V
/*    */     //   502: new me/konsolas/aac/ku
/*    */     //   505: dup
/*    */     //   506: aload_1
/*    */     //   507: aload_2
/*    */     //   508: aload_0
/*    */     //   509: getfield c : I
/*    */     //   512: iload #14
/*    */     //   514: isub
/*    */     //   515: aload_0
/*    */     //   516: getfield c : I
/*    */     //   519: invokespecial <init> : ([S[SII)V
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
/*    */     //   544: new me/konsolas/aac/ku
/*    */     //   547: dup
/*    */     //   548: aload_1
/*    */     //   549: aload_2
/*    */     //   550: aload_0
/*    */     //   551: getfield a : I
/*    */     //   554: aload_0
/*    */     //   555: getfield a : I
/*    */     //   558: iload #7
/*    */     //   560: iadd
/*    */     //   561: invokespecial <init> : ([S[SII)V
/*    */     //   564: aastore
/*    */     //   565: invokestatic invokeAll : ([Ljava/util/concurrent/ForkJoinTask;)V
/*    */     //   568: goto -> 605
/*    */     //   571: invokestatic a : (Laacinternal/v;)Laacinternal/v;
/*    */     //   574: athrow
/*    */     //   575: iconst_1
/*    */     //   576: anewarray java/util/concurrent/ForkJoinTask
/*    */     //   579: dup
/*    */     //   580: iconst_0
/*    */     //   581: new me/konsolas/aac/ku
/*    */     //   584: dup
/*    */     //   585: aload_1
/*    */     //   586: aload_2
/*    */     //   587: aload_0
/*    */     //   588: getfield c : I
/*    */     //   591: iload #14
/*    */     //   593: isub
/*    */     //   594: aload_0
/*    */     //   595: getfield c : I
/*    */     //   598: invokespecial <init> : ([S[SII)V
/*    */     //   601: aastore
/*    */     //   602: invokestatic invokeAll : ([Ljava/util/concurrent/ForkJoinTask;)V
/*    */     //   605: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #25	-> 0
/*    */     //   #34	-> 5
/*    */     //   #24	-> 10
/*    */     //   #12	-> 20
/*    */     //   #1	-> 27
/*    */     //   #38	-> 40
/*    */     //   #2	-> 45
/*    */     //   #5	-> 55
/*    */     //   #16	-> 61
/*    */     //   #6	-> 69
/*    */     //   #39	-> 75
/*    */     //   #10	-> 96
/*    */     //   #26	-> 115
/*    */     //   #31	-> 136
/*    */     //   #40	-> 149
/*    */     //   #14	-> 161
/*    */     //   #30	-> 183
/*    */     //   #20	-> 229
/*    */     //   #37	-> 260
/*    */     //   #19	-> 266
/*    */     //   #29	-> 312
/*    */     //   #8	-> 343
/*    */     //   #35	-> 349
/*    */     //   #15	-> 363
/*    */     //   #32	-> 381
/*    */     //   #11	-> 398
/*    */     //   #18	-> 414
/*    */     //   #23	-> 433
/*    */     //   #17	-> 449
/*    */     //   #7	-> 456
/*    */     //   #21	-> 463
/*    */     //   #13	-> 532
/*    */     //   #3	-> 575
/*    */     //   #9	-> 605
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
/*    */   public ku(short[] paramArrayOfshort1, short[] paramArrayOfshort2, int paramInt1, int paramInt2) {
/* 28 */     this.a = paramInt1;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 36 */     this.c = paramInt2;
/*    */     this.d = paramArrayOfshort1;
/*    */     this.b = paramArrayOfshort2;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ku.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */