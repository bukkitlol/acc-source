/*    */ package me.konsolas.aac;
/*    */ 
/*    */ import aacinternal.v;
/*    */ import java.util.concurrent.RecursiveAction;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cu
/*    */   extends RecursiveAction
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   private final int a;
/*    */   private final int c;
/*    */   private final byte[] b;
/*    */   
/*    */   public cu(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
/* 17 */     this.a = paramInt1;
/*    */     this.c = paramInt2;
/*    */     this.b = paramArrayOfbyte;
/*    */   }
/*    */   
/*    */   protected void compute() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield b : [B
/*    */     //   4: astore_1
/*    */     //   5: aload_0
/*    */     //   6: getfield c : I
/*    */     //   9: aload_0
/*    */     //   10: getfield a : I
/*    */     //   13: isub
/*    */     //   14: istore_2
/*    */     //   15: iload_2
/*    */     //   16: sipush #8192
/*    */     //   19: if_icmpge -> 39
/*    */     //   22: aload_1
/*    */     //   23: aload_0
/*    */     //   24: getfield a : I
/*    */     //   27: aload_0
/*    */     //   28: getfield c : I
/*    */     //   31: invokestatic l : ([BII)V
/*    */     //   34: return
/*    */     //   35: invokestatic a : (Laacinternal/v;)Laacinternal/v;
/*    */     //   38: athrow
/*    */     //   39: aload_0
/*    */     //   40: getfield a : I
/*    */     //   43: iload_2
/*    */     //   44: iconst_2
/*    */     //   45: idiv
/*    */     //   46: iadd
/*    */     //   47: istore_3
/*    */     //   48: aload_0
/*    */     //   49: getfield a : I
/*    */     //   52: istore #4
/*    */     //   54: aload_0
/*    */     //   55: getfield c : I
/*    */     //   58: iconst_1
/*    */     //   59: isub
/*    */     //   60: istore #5
/*    */     //   62: iload_2
/*    */     //   63: bipush #8
/*    */     //   65: idiv
/*    */     //   66: istore #6
/*    */     //   68: aload_1
/*    */     //   69: iload #4
/*    */     //   71: iload #4
/*    */     //   73: iload #6
/*    */     //   75: iadd
/*    */     //   76: iload #4
/*    */     //   78: iconst_2
/*    */     //   79: iload #6
/*    */     //   81: imul
/*    */     //   82: iadd
/*    */     //   83: invokestatic b : ([BIII)I
/*    */     //   86: istore #4
/*    */     //   88: aload_1
/*    */     //   89: iload_3
/*    */     //   90: iload #6
/*    */     //   92: isub
/*    */     //   93: iload_3
/*    */     //   94: iload_3
/*    */     //   95: iload #6
/*    */     //   97: iadd
/*    */     //   98: invokestatic b : ([BIII)I
/*    */     //   101: istore_3
/*    */     //   102: aload_1
/*    */     //   103: iload #5
/*    */     //   105: iconst_2
/*    */     //   106: iload #6
/*    */     //   108: imul
/*    */     //   109: isub
/*    */     //   110: iload #5
/*    */     //   112: iload #6
/*    */     //   114: isub
/*    */     //   115: iload #5
/*    */     //   117: invokestatic b : ([BIII)I
/*    */     //   120: istore #5
/*    */     //   122: aload_1
/*    */     //   123: iload #4
/*    */     //   125: iload_3
/*    */     //   126: iload #5
/*    */     //   128: invokestatic b : ([BIII)I
/*    */     //   131: istore_3
/*    */     //   132: aload_1
/*    */     //   133: iload_3
/*    */     //   134: baload
/*    */     //   135: istore #7
/*    */     //   137: aload_0
/*    */     //   138: getfield a : I
/*    */     //   141: istore #8
/*    */     //   143: iload #8
/*    */     //   145: istore #9
/*    */     //   147: aload_0
/*    */     //   148: getfield c : I
/*    */     //   151: iconst_1
/*    */     //   152: isub
/*    */     //   153: istore #10
/*    */     //   155: iload #10
/*    */     //   157: istore #11
/*    */     //   159: iload #9
/*    */     //   161: iload #10
/*    */     //   163: if_icmpgt -> 217
/*    */     //   166: aload_1
/*    */     //   167: iload #9
/*    */     //   169: baload
/*    */     //   170: iload #7
/*    */     //   172: invokestatic compare : (BB)I
/*    */     //   175: dup
/*    */     //   176: istore #12
/*    */     //   178: ifgt -> 217
/*    */     //   181: iload #12
/*    */     //   183: ifne -> 211
/*    */     //   186: goto -> 193
/*    */     //   189: invokestatic a : (Laacinternal/v;)Laacinternal/v;
/*    */     //   192: athrow
/*    */     //   193: aload_1
/*    */     //   194: iload #8
/*    */     //   196: iinc #8, 1
/*    */     //   199: iload #9
/*    */     //   201: invokestatic i : ([BII)V
/*    */     //   204: goto -> 211
/*    */     //   207: invokestatic a : (Laacinternal/v;)Laacinternal/v;
/*    */     //   210: athrow
/*    */     //   211: iinc #9, 1
/*    */     //   214: goto -> 159
/*    */     //   217: iload #10
/*    */     //   219: iload #9
/*    */     //   221: if_icmplt -> 275
/*    */     //   224: aload_1
/*    */     //   225: iload #10
/*    */     //   227: baload
/*    */     //   228: iload #7
/*    */     //   230: invokestatic compare : (BB)I
/*    */     //   233: dup
/*    */     //   234: istore #12
/*    */     //   236: iflt -> 275
/*    */     //   239: iload #12
/*    */     //   241: ifne -> 269
/*    */     //   244: goto -> 251
/*    */     //   247: invokestatic a : (Laacinternal/v;)Laacinternal/v;
/*    */     //   250: athrow
/*    */     //   251: aload_1
/*    */     //   252: iload #10
/*    */     //   254: iload #11
/*    */     //   256: iinc #11, -1
/*    */     //   259: invokestatic i : ([BII)V
/*    */     //   262: goto -> 269
/*    */     //   265: invokestatic a : (Laacinternal/v;)Laacinternal/v;
/*    */     //   268: athrow
/*    */     //   269: iinc #10, -1
/*    */     //   272: goto -> 217
/*    */     //   275: iload #9
/*    */     //   277: iload #10
/*    */     //   279: if_icmple -> 289
/*    */     //   282: goto -> 306
/*    */     //   285: invokestatic a : (Laacinternal/v;)Laacinternal/v;
/*    */     //   288: athrow
/*    */     //   289: aload_1
/*    */     //   290: iload #9
/*    */     //   292: iinc #9, 1
/*    */     //   295: iload #10
/*    */     //   297: iinc #10, -1
/*    */     //   300: invokestatic i : ([BII)V
/*    */     //   303: goto -> 159
/*    */     //   306: iload #8
/*    */     //   308: aload_0
/*    */     //   309: getfield a : I
/*    */     //   312: isub
/*    */     //   313: iload #9
/*    */     //   315: iload #8
/*    */     //   317: isub
/*    */     //   318: invokestatic min : (II)I
/*    */     //   321: istore #6
/*    */     //   323: aload_1
/*    */     //   324: aload_0
/*    */     //   325: getfield a : I
/*    */     //   328: iload #9
/*    */     //   330: iload #6
/*    */     //   332: isub
/*    */     //   333: iload #6
/*    */     //   335: invokestatic a : ([BIII)V
/*    */     //   338: iload #11
/*    */     //   340: iload #10
/*    */     //   342: isub
/*    */     //   343: aload_0
/*    */     //   344: getfield c : I
/*    */     //   347: iload #11
/*    */     //   349: isub
/*    */     //   350: iconst_1
/*    */     //   351: isub
/*    */     //   352: invokestatic min : (II)I
/*    */     //   355: istore #6
/*    */     //   357: aload_1
/*    */     //   358: iload #9
/*    */     //   360: aload_0
/*    */     //   361: getfield c : I
/*    */     //   364: iload #6
/*    */     //   366: isub
/*    */     //   367: iload #6
/*    */     //   369: invokestatic a : ([BIII)V
/*    */     //   372: iload #9
/*    */     //   374: iload #8
/*    */     //   376: isub
/*    */     //   377: istore #6
/*    */     //   379: iload #11
/*    */     //   381: iload #10
/*    */     //   383: isub
/*    */     //   384: istore #12
/*    */     //   386: iload #6
/*    */     //   388: iconst_1
/*    */     //   389: if_icmple -> 453
/*    */     //   392: iload #12
/*    */     //   394: iconst_1
/*    */     //   395: if_icmple -> 453
/*    */     //   398: goto -> 405
/*    */     //   401: invokestatic a : (Laacinternal/v;)Laacinternal/v;
/*    */     //   404: athrow
/*    */     //   405: new me/konsolas/aac/cu
/*    */     //   408: dup
/*    */     //   409: aload_1
/*    */     //   410: aload_0
/*    */     //   411: getfield a : I
/*    */     //   414: aload_0
/*    */     //   415: getfield a : I
/*    */     //   418: iload #6
/*    */     //   420: iadd
/*    */     //   421: invokespecial <init> : ([BII)V
/*    */     //   424: new me/konsolas/aac/cu
/*    */     //   427: dup
/*    */     //   428: aload_1
/*    */     //   429: aload_0
/*    */     //   430: getfield c : I
/*    */     //   433: iload #12
/*    */     //   435: isub
/*    */     //   436: aload_0
/*    */     //   437: getfield c : I
/*    */     //   440: invokespecial <init> : ([BII)V
/*    */     //   443: invokestatic invokeAll : (Ljava/util/concurrent/ForkJoinTask;Ljava/util/concurrent/ForkJoinTask;)V
/*    */     //   446: goto -> 524
/*    */     //   449: invokestatic a : (Laacinternal/v;)Laacinternal/v;
/*    */     //   452: athrow
/*    */     //   453: iload #6
/*    */     //   455: iconst_1
/*    */     //   456: if_icmple -> 495
/*    */     //   459: iconst_1
/*    */     //   460: anewarray java/util/concurrent/ForkJoinTask
/*    */     //   463: dup
/*    */     //   464: iconst_0
/*    */     //   465: new me/konsolas/aac/cu
/*    */     //   468: dup
/*    */     //   469: aload_1
/*    */     //   470: aload_0
/*    */     //   471: getfield a : I
/*    */     //   474: aload_0
/*    */     //   475: getfield a : I
/*    */     //   478: iload #6
/*    */     //   480: iadd
/*    */     //   481: invokespecial <init> : ([BII)V
/*    */     //   484: aastore
/*    */     //   485: invokestatic invokeAll : ([Ljava/util/concurrent/ForkJoinTask;)V
/*    */     //   488: goto -> 524
/*    */     //   491: invokestatic a : (Laacinternal/v;)Laacinternal/v;
/*    */     //   494: athrow
/*    */     //   495: iconst_1
/*    */     //   496: anewarray java/util/concurrent/ForkJoinTask
/*    */     //   499: dup
/*    */     //   500: iconst_0
/*    */     //   501: new me/konsolas/aac/cu
/*    */     //   504: dup
/*    */     //   505: aload_1
/*    */     //   506: aload_0
/*    */     //   507: getfield c : I
/*    */     //   510: iload #12
/*    */     //   512: isub
/*    */     //   513: aload_0
/*    */     //   514: getfield c : I
/*    */     //   517: invokespecial <init> : ([BII)V
/*    */     //   520: aastore
/*    */     //   521: invokestatic invokeAll : ([Ljava/util/concurrent/ForkJoinTask;)V
/*    */     //   524: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #34	-> 0
/*    */     //   #5	-> 5
/*    */     //   #6	-> 15
/*    */     //   #19	-> 22
/*    */     //   #9	-> 34
/*    */     //   #12	-> 39
/*    */     //   #8	-> 48
/*    */     //   #31	-> 54
/*    */     //   #36	-> 62
/*    */     //   #18	-> 68
/*    */     //   #38	-> 88
/*    */     //   #21	-> 102
/*    */     //   #27	-> 122
/*    */     //   #30	-> 132
/*    */     //   #3	-> 137
/*    */     //   #28	-> 159
/*    */     //   #15	-> 181
/*    */     //   #26	-> 211
/*    */     //   #32	-> 217
/*    */     //   #11	-> 239
/*    */     //   #25	-> 269
/*    */     //   #2	-> 275
/*    */     //   #29	-> 289
/*    */     //   #1	-> 306
/*    */     //   #22	-> 323
/*    */     //   #24	-> 338
/*    */     //   #23	-> 357
/*    */     //   #37	-> 372
/*    */     //   #16	-> 379
/*    */     //   #35	-> 386
/*    */     //   #20	-> 453
/*    */     //   #33	-> 495
/*    */     //   #13	-> 524
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   15	35	35	aacinternal/v
/*    */     //   178	186	189	aacinternal/v
/*    */     //   181	204	207	aacinternal/v
/*    */     //   236	244	247	aacinternal/v
/*    */     //   239	262	265	aacinternal/v
/*    */     //   275	285	285	aacinternal/v
/*    */     //   386	398	401	aacinternal/v
/*    */     //   392	449	449	aacinternal/v
/*    */     //   453	491	491	aacinternal/v
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\cu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */