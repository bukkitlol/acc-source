/*    */ package me.konsolas.aac;
/*    */ 
/*    */ import aacinternal.v;
/*    */ import java.util.concurrent.RecursiveAction;
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
/*    */ public class bn
/*    */   extends RecursiveAction
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   private final int a;
/*    */   private final int b;
/*    */   private final int[] d;
/*    */   private final double[] c;
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   }
/*    */   
/*    */   protected void compute() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield c : [D
/*    */     //   4: astore_1
/*    */     //   5: aload_0
/*    */     //   6: getfield b : I
/*    */     //   9: aload_0
/*    */     //   10: getfield a : I
/*    */     //   13: isub
/*    */     //   14: istore_2
/*    */     //   15: iload_2
/*    */     //   16: sipush #8192
/*    */     //   19: if_icmpge -> 43
/*    */     //   22: aload_0
/*    */     //   23: getfield d : [I
/*    */     //   26: aload_1
/*    */     //   27: aload_0
/*    */     //   28: getfield a : I
/*    */     //   31: aload_0
/*    */     //   32: getfield b : I
/*    */     //   35: invokestatic d : ([I[DII)V
/*    */     //   38: return
/*    */     //   39: invokestatic a : (Laacinternal/v;)Laacinternal/v;
/*    */     //   42: athrow
/*    */     //   43: aload_0
/*    */     //   44: getfield a : I
/*    */     //   47: iload_2
/*    */     //   48: iconst_2
/*    */     //   49: idiv
/*    */     //   50: iadd
/*    */     //   51: istore_3
/*    */     //   52: aload_0
/*    */     //   53: getfield a : I
/*    */     //   56: istore #4
/*    */     //   58: aload_0
/*    */     //   59: getfield b : I
/*    */     //   62: iconst_1
/*    */     //   63: isub
/*    */     //   64: istore #5
/*    */     //   66: iload_2
/*    */     //   67: bipush #8
/*    */     //   69: idiv
/*    */     //   70: istore #6
/*    */     //   72: aload_0
/*    */     //   73: getfield d : [I
/*    */     //   76: aload_1
/*    */     //   77: iload #4
/*    */     //   79: iload #4
/*    */     //   81: iload #6
/*    */     //   83: iadd
/*    */     //   84: iload #4
/*    */     //   86: iconst_2
/*    */     //   87: iload #6
/*    */     //   89: imul
/*    */     //   90: iadd
/*    */     //   91: invokestatic b : ([I[DIII)I
/*    */     //   94: istore #4
/*    */     //   96: aload_0
/*    */     //   97: getfield d : [I
/*    */     //   100: aload_1
/*    */     //   101: iload_3
/*    */     //   102: iload #6
/*    */     //   104: isub
/*    */     //   105: iload_3
/*    */     //   106: iload_3
/*    */     //   107: iload #6
/*    */     //   109: iadd
/*    */     //   110: invokestatic b : ([I[DIII)I
/*    */     //   113: istore_3
/*    */     //   114: aload_0
/*    */     //   115: getfield d : [I
/*    */     //   118: aload_1
/*    */     //   119: iload #5
/*    */     //   121: iconst_2
/*    */     //   122: iload #6
/*    */     //   124: imul
/*    */     //   125: isub
/*    */     //   126: iload #5
/*    */     //   128: iload #6
/*    */     //   130: isub
/*    */     //   131: iload #5
/*    */     //   133: invokestatic b : ([I[DIII)I
/*    */     //   136: istore #5
/*    */     //   138: aload_0
/*    */     //   139: getfield d : [I
/*    */     //   142: aload_1
/*    */     //   143: iload #4
/*    */     //   145: iload_3
/*    */     //   146: iload #5
/*    */     //   148: invokestatic b : ([I[DIII)I
/*    */     //   151: istore_3
/*    */     //   152: aload_1
/*    */     //   153: aload_0
/*    */     //   154: getfield d : [I
/*    */     //   157: iload_3
/*    */     //   158: iaload
/*    */     //   159: daload
/*    */     //   160: dstore #7
/*    */     //   162: aload_0
/*    */     //   163: getfield a : I
/*    */     //   166: istore #9
/*    */     //   168: iload #9
/*    */     //   170: istore #10
/*    */     //   172: aload_0
/*    */     //   173: getfield b : I
/*    */     //   176: iconst_1
/*    */     //   177: isub
/*    */     //   178: istore #11
/*    */     //   180: iload #11
/*    */     //   182: istore #12
/*    */     //   184: iload #10
/*    */     //   186: iload #11
/*    */     //   188: if_icmpgt -> 250
/*    */     //   191: aload_1
/*    */     //   192: aload_0
/*    */     //   193: getfield d : [I
/*    */     //   196: iload #10
/*    */     //   198: iaload
/*    */     //   199: daload
/*    */     //   200: dload #7
/*    */     //   202: invokestatic compare : (DD)I
/*    */     //   205: dup
/*    */     //   206: istore #13
/*    */     //   208: ifgt -> 250
/*    */     //   211: iload #13
/*    */     //   213: ifne -> 244
/*    */     //   216: goto -> 223
/*    */     //   219: invokestatic a : (Laacinternal/v;)Laacinternal/v;
/*    */     //   222: athrow
/*    */     //   223: aload_0
/*    */     //   224: getfield d : [I
/*    */     //   227: iload #9
/*    */     //   229: iinc #9, 1
/*    */     //   232: iload #10
/*    */     //   234: invokestatic g : ([III)V
/*    */     //   237: goto -> 244
/*    */     //   240: invokestatic a : (Laacinternal/v;)Laacinternal/v;
/*    */     //   243: athrow
/*    */     //   244: iinc #10, 1
/*    */     //   247: goto -> 184
/*    */     //   250: iload #11
/*    */     //   252: iload #10
/*    */     //   254: if_icmplt -> 316
/*    */     //   257: aload_1
/*    */     //   258: aload_0
/*    */     //   259: getfield d : [I
/*    */     //   262: iload #11
/*    */     //   264: iaload
/*    */     //   265: daload
/*    */     //   266: dload #7
/*    */     //   268: invokestatic compare : (DD)I
/*    */     //   271: dup
/*    */     //   272: istore #13
/*    */     //   274: iflt -> 316
/*    */     //   277: iload #13
/*    */     //   279: ifne -> 310
/*    */     //   282: goto -> 289
/*    */     //   285: invokestatic a : (Laacinternal/v;)Laacinternal/v;
/*    */     //   288: athrow
/*    */     //   289: aload_0
/*    */     //   290: getfield d : [I
/*    */     //   293: iload #11
/*    */     //   295: iload #12
/*    */     //   297: iinc #12, -1
/*    */     //   300: invokestatic g : ([III)V
/*    */     //   303: goto -> 310
/*    */     //   306: invokestatic a : (Laacinternal/v;)Laacinternal/v;
/*    */     //   309: athrow
/*    */     //   310: iinc #11, -1
/*    */     //   313: goto -> 250
/*    */     //   316: iload #10
/*    */     //   318: iload #11
/*    */     //   320: if_icmple -> 330
/*    */     //   323: goto -> 350
/*    */     //   326: invokestatic a : (Laacinternal/v;)Laacinternal/v;
/*    */     //   329: athrow
/*    */     //   330: aload_0
/*    */     //   331: getfield d : [I
/*    */     //   334: iload #10
/*    */     //   336: iinc #10, 1
/*    */     //   339: iload #11
/*    */     //   341: iinc #11, -1
/*    */     //   344: invokestatic g : ([III)V
/*    */     //   347: goto -> 184
/*    */     //   350: iload #9
/*    */     //   352: aload_0
/*    */     //   353: getfield a : I
/*    */     //   356: isub
/*    */     //   357: iload #10
/*    */     //   359: iload #9
/*    */     //   361: isub
/*    */     //   362: invokestatic min : (II)I
/*    */     //   365: istore #6
/*    */     //   367: aload_0
/*    */     //   368: getfield d : [I
/*    */     //   371: aload_0
/*    */     //   372: getfield a : I
/*    */     //   375: iload #10
/*    */     //   377: iload #6
/*    */     //   379: isub
/*    */     //   380: iload #6
/*    */     //   382: invokestatic b : ([IIII)V
/*    */     //   385: iload #12
/*    */     //   387: iload #11
/*    */     //   389: isub
/*    */     //   390: aload_0
/*    */     //   391: getfield b : I
/*    */     //   394: iload #12
/*    */     //   396: isub
/*    */     //   397: iconst_1
/*    */     //   398: isub
/*    */     //   399: invokestatic min : (II)I
/*    */     //   402: istore #6
/*    */     //   404: aload_0
/*    */     //   405: getfield d : [I
/*    */     //   408: iload #10
/*    */     //   410: aload_0
/*    */     //   411: getfield b : I
/*    */     //   414: iload #6
/*    */     //   416: isub
/*    */     //   417: iload #6
/*    */     //   419: invokestatic b : ([IIII)V
/*    */     //   422: iload #10
/*    */     //   424: iload #9
/*    */     //   426: isub
/*    */     //   427: istore #6
/*    */     //   429: iload #12
/*    */     //   431: iload #11
/*    */     //   433: isub
/*    */     //   434: istore #13
/*    */     //   436: iload #6
/*    */     //   438: iconst_1
/*    */     //   439: if_icmple -> 511
/*    */     //   442: iload #13
/*    */     //   444: iconst_1
/*    */     //   445: if_icmple -> 511
/*    */     //   448: goto -> 455
/*    */     //   451: invokestatic a : (Laacinternal/v;)Laacinternal/v;
/*    */     //   454: athrow
/*    */     //   455: new me/konsolas/aac/bn
/*    */     //   458: dup
/*    */     //   459: aload_0
/*    */     //   460: getfield d : [I
/*    */     //   463: aload_1
/*    */     //   464: aload_0
/*    */     //   465: getfield a : I
/*    */     //   468: aload_0
/*    */     //   469: getfield a : I
/*    */     //   472: iload #6
/*    */     //   474: iadd
/*    */     //   475: invokespecial <init> : ([I[DII)V
/*    */     //   478: new me/konsolas/aac/bn
/*    */     //   481: dup
/*    */     //   482: aload_0
/*    */     //   483: getfield d : [I
/*    */     //   486: aload_1
/*    */     //   487: aload_0
/*    */     //   488: getfield b : I
/*    */     //   491: iload #13
/*    */     //   493: isub
/*    */     //   494: aload_0
/*    */     //   495: getfield b : I
/*    */     //   498: invokespecial <init> : ([I[DII)V
/*    */     //   501: invokestatic invokeAll : (Ljava/util/concurrent/ForkJoinTask;Ljava/util/concurrent/ForkJoinTask;)V
/*    */     //   504: goto -> 590
/*    */     //   507: invokestatic a : (Laacinternal/v;)Laacinternal/v;
/*    */     //   510: athrow
/*    */     //   511: iload #6
/*    */     //   513: iconst_1
/*    */     //   514: if_icmple -> 557
/*    */     //   517: iconst_1
/*    */     //   518: anewarray java/util/concurrent/ForkJoinTask
/*    */     //   521: dup
/*    */     //   522: iconst_0
/*    */     //   523: new me/konsolas/aac/bn
/*    */     //   526: dup
/*    */     //   527: aload_0
/*    */     //   528: getfield d : [I
/*    */     //   531: aload_1
/*    */     //   532: aload_0
/*    */     //   533: getfield a : I
/*    */     //   536: aload_0
/*    */     //   537: getfield a : I
/*    */     //   540: iload #6
/*    */     //   542: iadd
/*    */     //   543: invokespecial <init> : ([I[DII)V
/*    */     //   546: aastore
/*    */     //   547: invokestatic invokeAll : ([Ljava/util/concurrent/ForkJoinTask;)V
/*    */     //   550: goto -> 590
/*    */     //   553: invokestatic a : (Laacinternal/v;)Laacinternal/v;
/*    */     //   556: athrow
/*    */     //   557: iconst_1
/*    */     //   558: anewarray java/util/concurrent/ForkJoinTask
/*    */     //   561: dup
/*    */     //   562: iconst_0
/*    */     //   563: new me/konsolas/aac/bn
/*    */     //   566: dup
/*    */     //   567: aload_0
/*    */     //   568: getfield d : [I
/*    */     //   571: aload_1
/*    */     //   572: aload_0
/*    */     //   573: getfield b : I
/*    */     //   576: iload #13
/*    */     //   578: isub
/*    */     //   579: aload_0
/*    */     //   580: getfield b : I
/*    */     //   583: invokespecial <init> : ([I[DII)V
/*    */     //   586: aastore
/*    */     //   587: invokestatic invokeAll : ([Ljava/util/concurrent/ForkJoinTask;)V
/*    */     //   590: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #6	-> 0
/*    */     //   #19	-> 5
/*    */     //   #25	-> 15
/*    */     //   #18	-> 22
/*    */     //   #1	-> 38
/*    */     //   #37	-> 43
/*    */     //   #27	-> 52
/*    */     //   #38	-> 58
/*    */     //   #9	-> 66
/*    */     //   #3	-> 72
/*    */     //   #15	-> 96
/*    */     //   #22	-> 114
/*    */     //   #7	-> 138
/*    */     //   #20	-> 152
/*    */     //   #5	-> 162
/*    */     //   #13	-> 184
/*    */     //   #28	-> 211
/*    */     //   #14	-> 244
/*    */     //   #24	-> 250
/*    */     //   #30	-> 277
/*    */     //   #16	-> 310
/*    */     //   #31	-> 316
/*    */     //   #4	-> 330
/*    */     //   #12	-> 350
/*    */     //   #32	-> 367
/*    */     //   #21	-> 385
/*    */     //   #11	-> 404
/*    */     //   #8	-> 422
/*    */     //   #35	-> 429
/*    */     //   #23	-> 436
/*    */     //   #34	-> 511
/*    */     //   #2	-> 557
/*    */     //   #26	-> 590
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   15	39	39	aacinternal/v
/*    */     //   208	216	219	aacinternal/v
/*    */     //   211	237	240	aacinternal/v
/*    */     //   274	282	285	aacinternal/v
/*    */     //   277	303	306	aacinternal/v
/*    */     //   316	326	326	aacinternal/v
/*    */     //   436	448	451	aacinternal/v
/*    */     //   442	507	507	aacinternal/v
/*    */     //   511	553	553	aacinternal/v
/*    */   }
/*    */   
/*    */   public bn(int[] paramArrayOfint, double[] paramArrayOfdouble, int paramInt1, int paramInt2) {
/* 36 */     this.a = paramInt1;
/*    */     
/*    */     this.b = paramInt2;
/* 39 */     this.c = paramArrayOfdouble;
/*    */     this.d = paramArrayOfint;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\bn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */