/*    */ package me.konsolas.aac;
/*    */ 
/*    */ import aacinternal.v;
/*    */ import java.util.concurrent.RecursiveAction;
/*    */ 
/*    */ public class im extends RecursiveAction {
/*    */   private static final long serialVersionUID = 1L;
/*    */   private final int c;
/*    */   private final int a;
/*    */   
/*    */   public im(long[] paramArrayOflong, int paramInt1, int paramInt2, hq paramhq) {
/* 12 */     this.c = paramInt1;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 19 */     this.a = paramInt2;
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
/*    */ 
/*    */ 
/*    */     
/* 33 */     this.d = paramArrayOflong;
/*    */     this.b = paramhq;
/*    */   }
/*    */   
/*    */   private final long[] d;
/*    */   private final hq b;
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   }
/*    */   
/*    */   protected void compute() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield d : [J
/*    */     //   4: astore_1
/*    */     //   5: aload_0
/*    */     //   6: getfield a : I
/*    */     //   9: aload_0
/*    */     //   10: getfield c : I
/*    */     //   13: isub
/*    */     //   14: istore_2
/*    */     //   15: iload_2
/*    */     //   16: sipush #8192
/*    */     //   19: if_icmpge -> 43
/*    */     //   22: aload_1
/*    */     //   23: aload_0
/*    */     //   24: getfield c : I
/*    */     //   27: aload_0
/*    */     //   28: getfield a : I
/*    */     //   31: aload_0
/*    */     //   32: getfield b : Lme/konsolas/aac/hq;
/*    */     //   35: invokestatic f : ([JIILme/konsolas/aac/hq;)V
/*    */     //   38: return
/*    */     //   39: invokestatic a : (Laacinternal/v;)Laacinternal/v;
/*    */     //   42: athrow
/*    */     //   43: aload_0
/*    */     //   44: getfield c : I
/*    */     //   47: iload_2
/*    */     //   48: iconst_2
/*    */     //   49: idiv
/*    */     //   50: iadd
/*    */     //   51: istore_3
/*    */     //   52: aload_0
/*    */     //   53: getfield c : I
/*    */     //   56: istore #4
/*    */     //   58: aload_0
/*    */     //   59: getfield a : I
/*    */     //   62: iconst_1
/*    */     //   63: isub
/*    */     //   64: istore #5
/*    */     //   66: iload_2
/*    */     //   67: bipush #8
/*    */     //   69: idiv
/*    */     //   70: istore #6
/*    */     //   72: aload_1
/*    */     //   73: iload #4
/*    */     //   75: iload #4
/*    */     //   77: iload #6
/*    */     //   79: iadd
/*    */     //   80: iload #4
/*    */     //   82: iconst_2
/*    */     //   83: iload #6
/*    */     //   85: imul
/*    */     //   86: iadd
/*    */     //   87: aload_0
/*    */     //   88: getfield b : Lme/konsolas/aac/hq;
/*    */     //   91: invokestatic a : ([JIIILme/konsolas/aac/hq;)I
/*    */     //   94: istore #4
/*    */     //   96: aload_1
/*    */     //   97: iload_3
/*    */     //   98: iload #6
/*    */     //   100: isub
/*    */     //   101: iload_3
/*    */     //   102: iload_3
/*    */     //   103: iload #6
/*    */     //   105: iadd
/*    */     //   106: aload_0
/*    */     //   107: getfield b : Lme/konsolas/aac/hq;
/*    */     //   110: invokestatic a : ([JIIILme/konsolas/aac/hq;)I
/*    */     //   113: istore_3
/*    */     //   114: aload_1
/*    */     //   115: iload #5
/*    */     //   117: iconst_2
/*    */     //   118: iload #6
/*    */     //   120: imul
/*    */     //   121: isub
/*    */     //   122: iload #5
/*    */     //   124: iload #6
/*    */     //   126: isub
/*    */     //   127: iload #5
/*    */     //   129: aload_0
/*    */     //   130: getfield b : Lme/konsolas/aac/hq;
/*    */     //   133: invokestatic a : ([JIIILme/konsolas/aac/hq;)I
/*    */     //   136: istore #5
/*    */     //   138: aload_1
/*    */     //   139: iload #4
/*    */     //   141: iload_3
/*    */     //   142: iload #5
/*    */     //   144: aload_0
/*    */     //   145: getfield b : Lme/konsolas/aac/hq;
/*    */     //   148: invokestatic a : ([JIIILme/konsolas/aac/hq;)I
/*    */     //   151: istore_3
/*    */     //   152: aload_1
/*    */     //   153: iload_3
/*    */     //   154: laload
/*    */     //   155: lstore #7
/*    */     //   157: aload_0
/*    */     //   158: getfield c : I
/*    */     //   161: istore #9
/*    */     //   163: iload #9
/*    */     //   165: istore #10
/*    */     //   167: aload_0
/*    */     //   168: getfield a : I
/*    */     //   171: iconst_1
/*    */     //   172: isub
/*    */     //   173: istore #11
/*    */     //   175: iload #11
/*    */     //   177: istore #12
/*    */     //   179: iload #10
/*    */     //   181: iload #11
/*    */     //   183: if_icmpgt -> 243
/*    */     //   186: aload_0
/*    */     //   187: getfield b : Lme/konsolas/aac/hq;
/*    */     //   190: aload_1
/*    */     //   191: iload #10
/*    */     //   193: laload
/*    */     //   194: lload #7
/*    */     //   196: invokeinterface a : (JJ)I
/*    */     //   201: dup
/*    */     //   202: istore #13
/*    */     //   204: ifgt -> 243
/*    */     //   207: iload #13
/*    */     //   209: ifne -> 237
/*    */     //   212: goto -> 219
/*    */     //   215: invokestatic a : (Laacinternal/v;)Laacinternal/v;
/*    */     //   218: athrow
/*    */     //   219: aload_1
/*    */     //   220: iload #9
/*    */     //   222: iinc #9, 1
/*    */     //   225: iload #10
/*    */     //   227: invokestatic d : ([JII)V
/*    */     //   230: goto -> 237
/*    */     //   233: invokestatic a : (Laacinternal/v;)Laacinternal/v;
/*    */     //   236: athrow
/*    */     //   237: iinc #10, 1
/*    */     //   240: goto -> 179
/*    */     //   243: iload #11
/*    */     //   245: iload #10
/*    */     //   247: if_icmplt -> 307
/*    */     //   250: aload_0
/*    */     //   251: getfield b : Lme/konsolas/aac/hq;
/*    */     //   254: aload_1
/*    */     //   255: iload #11
/*    */     //   257: laload
/*    */     //   258: lload #7
/*    */     //   260: invokeinterface a : (JJ)I
/*    */     //   265: dup
/*    */     //   266: istore #13
/*    */     //   268: iflt -> 307
/*    */     //   271: iload #13
/*    */     //   273: ifne -> 301
/*    */     //   276: goto -> 283
/*    */     //   279: invokestatic a : (Laacinternal/v;)Laacinternal/v;
/*    */     //   282: athrow
/*    */     //   283: aload_1
/*    */     //   284: iload #11
/*    */     //   286: iload #12
/*    */     //   288: iinc #12, -1
/*    */     //   291: invokestatic d : ([JII)V
/*    */     //   294: goto -> 301
/*    */     //   297: invokestatic a : (Laacinternal/v;)Laacinternal/v;
/*    */     //   300: athrow
/*    */     //   301: iinc #11, -1
/*    */     //   304: goto -> 243
/*    */     //   307: iload #10
/*    */     //   309: iload #11
/*    */     //   311: if_icmple -> 321
/*    */     //   314: goto -> 338
/*    */     //   317: invokestatic a : (Laacinternal/v;)Laacinternal/v;
/*    */     //   320: athrow
/*    */     //   321: aload_1
/*    */     //   322: iload #10
/*    */     //   324: iinc #10, 1
/*    */     //   327: iload #11
/*    */     //   329: iinc #11, -1
/*    */     //   332: invokestatic d : ([JII)V
/*    */     //   335: goto -> 179
/*    */     //   338: iload #9
/*    */     //   340: aload_0
/*    */     //   341: getfield c : I
/*    */     //   344: isub
/*    */     //   345: iload #10
/*    */     //   347: iload #9
/*    */     //   349: isub
/*    */     //   350: invokestatic min : (II)I
/*    */     //   353: istore #6
/*    */     //   355: aload_1
/*    */     //   356: aload_0
/*    */     //   357: getfield c : I
/*    */     //   360: iload #10
/*    */     //   362: iload #6
/*    */     //   364: isub
/*    */     //   365: iload #6
/*    */     //   367: invokestatic a : ([JIII)V
/*    */     //   370: iload #12
/*    */     //   372: iload #11
/*    */     //   374: isub
/*    */     //   375: aload_0
/*    */     //   376: getfield a : I
/*    */     //   379: iload #12
/*    */     //   381: isub
/*    */     //   382: iconst_1
/*    */     //   383: isub
/*    */     //   384: invokestatic min : (II)I
/*    */     //   387: istore #6
/*    */     //   389: aload_1
/*    */     //   390: iload #10
/*    */     //   392: aload_0
/*    */     //   393: getfield a : I
/*    */     //   396: iload #6
/*    */     //   398: isub
/*    */     //   399: iload #6
/*    */     //   401: invokestatic a : ([JIII)V
/*    */     //   404: iload #10
/*    */     //   406: iload #9
/*    */     //   408: isub
/*    */     //   409: istore #6
/*    */     //   411: iload #12
/*    */     //   413: iload #11
/*    */     //   415: isub
/*    */     //   416: istore #13
/*    */     //   418: iload #6
/*    */     //   420: iconst_1
/*    */     //   421: if_icmple -> 493
/*    */     //   424: iload #13
/*    */     //   426: iconst_1
/*    */     //   427: if_icmple -> 493
/*    */     //   430: goto -> 437
/*    */     //   433: invokestatic a : (Laacinternal/v;)Laacinternal/v;
/*    */     //   436: athrow
/*    */     //   437: new me/konsolas/aac/im
/*    */     //   440: dup
/*    */     //   441: aload_1
/*    */     //   442: aload_0
/*    */     //   443: getfield c : I
/*    */     //   446: aload_0
/*    */     //   447: getfield c : I
/*    */     //   450: iload #6
/*    */     //   452: iadd
/*    */     //   453: aload_0
/*    */     //   454: getfield b : Lme/konsolas/aac/hq;
/*    */     //   457: invokespecial <init> : ([JIILme/konsolas/aac/hq;)V
/*    */     //   460: new me/konsolas/aac/im
/*    */     //   463: dup
/*    */     //   464: aload_1
/*    */     //   465: aload_0
/*    */     //   466: getfield a : I
/*    */     //   469: iload #13
/*    */     //   471: isub
/*    */     //   472: aload_0
/*    */     //   473: getfield a : I
/*    */     //   476: aload_0
/*    */     //   477: getfield b : Lme/konsolas/aac/hq;
/*    */     //   480: invokespecial <init> : ([JIILme/konsolas/aac/hq;)V
/*    */     //   483: invokestatic invokeAll : (Ljava/util/concurrent/ForkJoinTask;Ljava/util/concurrent/ForkJoinTask;)V
/*    */     //   486: goto -> 572
/*    */     //   489: invokestatic a : (Laacinternal/v;)Laacinternal/v;
/*    */     //   492: athrow
/*    */     //   493: iload #6
/*    */     //   495: iconst_1
/*    */     //   496: if_icmple -> 539
/*    */     //   499: iconst_1
/*    */     //   500: anewarray java/util/concurrent/ForkJoinTask
/*    */     //   503: dup
/*    */     //   504: iconst_0
/*    */     //   505: new me/konsolas/aac/im
/*    */     //   508: dup
/*    */     //   509: aload_1
/*    */     //   510: aload_0
/*    */     //   511: getfield c : I
/*    */     //   514: aload_0
/*    */     //   515: getfield c : I
/*    */     //   518: iload #6
/*    */     //   520: iadd
/*    */     //   521: aload_0
/*    */     //   522: getfield b : Lme/konsolas/aac/hq;
/*    */     //   525: invokespecial <init> : ([JIILme/konsolas/aac/hq;)V
/*    */     //   528: aastore
/*    */     //   529: invokestatic invokeAll : ([Ljava/util/concurrent/ForkJoinTask;)V
/*    */     //   532: goto -> 572
/*    */     //   535: invokestatic a : (Laacinternal/v;)Laacinternal/v;
/*    */     //   538: athrow
/*    */     //   539: iconst_1
/*    */     //   540: anewarray java/util/concurrent/ForkJoinTask
/*    */     //   543: dup
/*    */     //   544: iconst_0
/*    */     //   545: new me/konsolas/aac/im
/*    */     //   548: dup
/*    */     //   549: aload_1
/*    */     //   550: aload_0
/*    */     //   551: getfield a : I
/*    */     //   554: iload #13
/*    */     //   556: isub
/*    */     //   557: aload_0
/*    */     //   558: getfield a : I
/*    */     //   561: aload_0
/*    */     //   562: getfield b : Lme/konsolas/aac/hq;
/*    */     //   565: invokespecial <init> : ([JIILme/konsolas/aac/hq;)V
/*    */     //   568: aastore
/*    */     //   569: invokestatic invokeAll : ([Ljava/util/concurrent/ForkJoinTask;)V
/*    */     //   572: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #10	-> 0
/*    */     //   #37	-> 5
/*    */     //   #25	-> 15
/*    */     //   #7	-> 22
/*    */     //   #5	-> 38
/*    */     //   #24	-> 43
/*    */     //   #14	-> 52
/*    */     //   #18	-> 58
/*    */     //   #6	-> 66
/*    */     //   #8	-> 72
/*    */     //   #13	-> 96
/*    */     //   #34	-> 114
/*    */     //   #30	-> 138
/*    */     //   #9	-> 152
/*    */     //   #31	-> 157
/*    */     //   #35	-> 179
/*    */     //   #29	-> 207
/*    */     //   #16	-> 237
/*    */     //   #17	-> 243
/*    */     //   #4	-> 271
/*    */     //   #1	-> 301
/*    */     //   #38	-> 307
/*    */     //   #28	-> 321
/*    */     //   #26	-> 338
/*    */     //   #21	-> 355
/*    */     //   #39	-> 370
/*    */     //   #27	-> 389
/*    */     //   #36	-> 404
/*    */     //   #3	-> 411
/*    */     //   #22	-> 418
/*    */     //   #32	-> 493
/*    */     //   #2	-> 539
/*    */     //   #11	-> 572
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   15	39	39	aacinternal/v
/*    */     //   204	212	215	aacinternal/v
/*    */     //   207	230	233	aacinternal/v
/*    */     //   268	276	279	aacinternal/v
/*    */     //   271	294	297	aacinternal/v
/*    */     //   307	317	317	aacinternal/v
/*    */     //   418	430	433	aacinternal/v
/*    */     //   424	489	489	aacinternal/v
/*    */     //   493	535	535	aacinternal/v
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\im.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */