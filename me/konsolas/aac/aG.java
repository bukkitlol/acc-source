/*     */ package me.konsolas.aac;
/*     */ 
/*     */ import java.lang.invoke.CallSite;
/*     */ import java.lang.invoke.MethodHandle;
/*     */ import java.lang.invoke.MethodHandles;
/*     */ import java.lang.invoke.MethodType;
/*     */ import java.lang.invoke.MutableCallSite;
/*     */ import java.util.AbstractList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.RandomAccess;
/*     */ import javax.crypto.Cipher;
/*     */ import javax.crypto.SecretKey;
/*     */ import javax.crypto.SecretKeyFactory;
/*     */ import javax.crypto.spec.DESKeySpec;
/*     */ import javax.crypto.spec.IvParameterSpec;
/*     */ 
/*     */ public final class ag
/*     */   extends AbstractList implements RandomAccess {
/*     */   final gZ[] a;
/*     */   final int[] b;
/*     */   private static final long c = nc.a(-7599018321488007340L, 6830814726780644742L, MethodHandles.lookup().lookupClass()).a(257724190372953L);
/*     */   
/*     */   public gZ a(int paramInt) {
/*  26 */     return this.a[paramInt];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final String[] d;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final String[] e;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final Map f = new HashMap<>(13);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object get(int paramInt) {
/*  58 */     return a(paramInt);
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
/*     */   private static int a(fw paramfw) {
/*  70 */     return (int)(paramfw.f() / 4L);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private ag(gZ[] paramArrayOfgZ, int[] paramArrayOfint) {
/*     */     this.a = paramArrayOfgZ;
/* 106 */     this.b = paramArrayOfint;
/*     */   }
/*     */   
/*     */   private static void a(long paramLong1, fw paramfw, long paramLong2, int paramInt1, List paramList1, int paramInt2, int paramInt3, List paramList2) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/ag.c : J
/*     */     //   3: lload_3
/*     */     //   4: lxor
/*     */     //   5: lstore_3
/*     */     //   6: lload_3
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 24040575087509
/*     */     //   11: lxor
/*     */     //   12: lstore #10
/*     */     //   14: dup2
/*     */     //   15: ldc2_w 111945219156041
/*     */     //   18: lxor
/*     */     //   19: lstore #12
/*     */     //   21: dup2
/*     */     //   22: ldc2_w 107639640094242
/*     */     //   25: lxor
/*     */     //   26: lstore #14
/*     */     //   28: dup2
/*     */     //   29: ldc2_w 120682781705845
/*     */     //   32: lxor
/*     */     //   33: lstore #16
/*     */     //   35: pop2
/*     */     //   36: iload #7
/*     */     //   38: iload #8
/*     */     //   40: if_icmplt -> 61
/*     */     //   43: new java/lang/AssertionError
/*     */     //   46: dup
/*     */     //   47: invokespecial <init> : ()V
/*     */     //   50: athrow
/*     */     //   51: ldc2_w 3966390746903370955
/*     */     //   54: lload_3
/*     */     //   55: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   60: athrow
/*     */     //   61: iload #7
/*     */     //   63: istore #18
/*     */     //   65: iload #18
/*     */     //   67: iload #8
/*     */     //   69: if_icmpge -> 144
/*     */     //   72: lload_3
/*     */     //   73: lconst_0
/*     */     //   74: lcmp
/*     */     //   75: iflt -> 138
/*     */     //   78: aload #6
/*     */     //   80: iload #18
/*     */     //   82: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   87: checkcast me/konsolas/aac/gZ
/*     */     //   90: lload_3
/*     */     //   91: lconst_0
/*     */     //   92: lcmp
/*     */     //   93: iflt -> 156
/*     */     //   96: invokevirtual a : ()I
/*     */     //   99: iload #5
/*     */     //   101: if_icmpge -> 135
/*     */     //   104: goto -> 117
/*     */     //   107: ldc2_w 3966390746903370955
/*     */     //   110: lload_3
/*     */     //   111: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   116: athrow
/*     */     //   117: new java/lang/AssertionError
/*     */     //   120: dup
/*     */     //   121: invokespecial <init> : ()V
/*     */     //   124: athrow
/*     */     //   125: ldc2_w 3966390746903370955
/*     */     //   128: lload_3
/*     */     //   129: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   134: athrow
/*     */     //   135: iinc #18, 1
/*     */     //   138: lload_3
/*     */     //   139: lconst_0
/*     */     //   140: lcmp
/*     */     //   141: ifgt -> 65
/*     */     //   144: aload #6
/*     */     //   146: iload #7
/*     */     //   148: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   153: checkcast me/konsolas/aac/gZ
/*     */     //   156: astore #18
/*     */     //   158: aload #6
/*     */     //   160: iload #8
/*     */     //   162: iconst_1
/*     */     //   163: isub
/*     */     //   164: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   169: checkcast me/konsolas/aac/gZ
/*     */     //   172: astore #19
/*     */     //   174: iconst_m1
/*     */     //   175: istore #20
/*     */     //   177: iload #5
/*     */     //   179: aload #18
/*     */     //   181: invokevirtual a : ()I
/*     */     //   184: lload_3
/*     */     //   185: lconst_0
/*     */     //   186: lcmp
/*     */     //   187: iflt -> 251
/*     */     //   190: if_icmpne -> 227
/*     */     //   193: aload #9
/*     */     //   195: iload #7
/*     */     //   197: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   202: checkcast java/lang/Integer
/*     */     //   205: invokevirtual intValue : ()I
/*     */     //   208: istore #20
/*     */     //   210: iinc #7, 1
/*     */     //   213: aload #6
/*     */     //   215: iload #7
/*     */     //   217: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   222: checkcast me/konsolas/aac/gZ
/*     */     //   225: astore #18
/*     */     //   227: aload #18
/*     */     //   229: iload #5
/*     */     //   231: lload #14
/*     */     //   233: invokevirtual a : (IJ)B
/*     */     //   236: lload_3
/*     */     //   237: lconst_0
/*     */     //   238: lcmp
/*     */     //   239: iflt -> 810
/*     */     //   242: aload #19
/*     */     //   244: iload #5
/*     */     //   246: lload #14
/*     */     //   248: invokevirtual a : (IJ)B
/*     */     //   251: if_icmpeq -> 809
/*     */     //   254: iconst_1
/*     */     //   255: istore #21
/*     */     //   257: iload #7
/*     */     //   259: iconst_1
/*     */     //   260: iadd
/*     */     //   261: istore #22
/*     */     //   263: iload #22
/*     */     //   265: iload #8
/*     */     //   267: if_icmpge -> 357
/*     */     //   270: lload_3
/*     */     //   271: lconst_0
/*     */     //   272: lcmp
/*     */     //   273: ifle -> 351
/*     */     //   276: aload #6
/*     */     //   278: iload #22
/*     */     //   280: iconst_1
/*     */     //   281: isub
/*     */     //   282: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   287: checkcast me/konsolas/aac/gZ
/*     */     //   290: iload #5
/*     */     //   292: lload #14
/*     */     //   294: invokevirtual a : (IJ)B
/*     */     //   297: aload #6
/*     */     //   299: iload #22
/*     */     //   301: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   306: checkcast me/konsolas/aac/gZ
/*     */     //   309: iload #5
/*     */     //   311: lload #14
/*     */     //   313: invokevirtual a : (IJ)B
/*     */     //   316: if_icmpeq -> 348
/*     */     //   319: goto -> 332
/*     */     //   322: ldc2_w 3966390746903370955
/*     */     //   325: lload_3
/*     */     //   326: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   331: athrow
/*     */     //   332: iinc #21, 1
/*     */     //   335: goto -> 348
/*     */     //   338: ldc2_w 3966390746903370955
/*     */     //   341: lload_3
/*     */     //   342: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   347: athrow
/*     */     //   348: iinc #22, 1
/*     */     //   351: lload_3
/*     */     //   352: lconst_0
/*     */     //   353: lcmp
/*     */     //   354: ifgt -> 263
/*     */     //   357: lload_0
/*     */     //   358: aload_2
/*     */     //   359: invokestatic a : (Lme/konsolas/aac/fw;)I
/*     */     //   362: i2l
/*     */     //   363: ladd
/*     */     //   364: ldc2_w 2
/*     */     //   367: ladd
/*     */     //   368: iload #21
/*     */     //   370: iconst_2
/*     */     //   371: imul
/*     */     //   372: i2l
/*     */     //   373: ladd
/*     */     //   374: lstore #22
/*     */     //   376: aload_2
/*     */     //   377: lload #16
/*     */     //   379: iload #21
/*     */     //   381: invokevirtual b : (JI)Lme/konsolas/aac/fw;
/*     */     //   384: pop
/*     */     //   385: aload_2
/*     */     //   386: lload #16
/*     */     //   388: iload #20
/*     */     //   390: invokevirtual b : (JI)Lme/konsolas/aac/fw;
/*     */     //   393: pop
/*     */     //   394: iload #7
/*     */     //   396: istore #24
/*     */     //   398: iload #24
/*     */     //   400: iload #8
/*     */     //   402: if_icmpge -> 521
/*     */     //   405: aload #6
/*     */     //   407: iload #24
/*     */     //   409: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   414: checkcast me/konsolas/aac/gZ
/*     */     //   417: iload #5
/*     */     //   419: lload #14
/*     */     //   421: invokevirtual a : (IJ)B
/*     */     //   424: istore #25
/*     */     //   426: lload_3
/*     */     //   427: lconst_0
/*     */     //   428: lcmp
/*     */     //   429: iflt -> 1163
/*     */     //   432: lload_3
/*     */     //   433: lconst_0
/*     */     //   434: lcmp
/*     */     //   435: ifle -> 499
/*     */     //   438: iload #24
/*     */     //   440: iload #7
/*     */     //   442: if_icmpeq -> 484
/*     */     //   445: iload #25
/*     */     //   447: aload #6
/*     */     //   449: iload #24
/*     */     //   451: iconst_1
/*     */     //   452: isub
/*     */     //   453: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   458: checkcast me/konsolas/aac/gZ
/*     */     //   461: iload #5
/*     */     //   463: lload #14
/*     */     //   465: invokevirtual a : (IJ)B
/*     */     //   468: if_icmpeq -> 512
/*     */     //   471: goto -> 484
/*     */     //   474: ldc2_w 3966390746903370955
/*     */     //   477: lload_3
/*     */     //   478: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   483: athrow
/*     */     //   484: aload_2
/*     */     //   485: iload #25
/*     */     //   487: sipush #255
/*     */     //   490: iand
/*     */     //   491: lload #16
/*     */     //   493: dup2_x1
/*     */     //   494: pop2
/*     */     //   495: invokevirtual b : (JI)Lme/konsolas/aac/fw;
/*     */     //   498: pop
/*     */     //   499: goto -> 512
/*     */     //   502: ldc2_w 3966390746903370955
/*     */     //   505: lload_3
/*     */     //   506: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   511: athrow
/*     */     //   512: iinc #24, 1
/*     */     //   515: lload_3
/*     */     //   516: lconst_0
/*     */     //   517: lcmp
/*     */     //   518: ifgt -> 398
/*     */     //   521: new me/konsolas/aac/fw
/*     */     //   524: dup
/*     */     //   525: invokespecial <init> : ()V
/*     */     //   528: astore #24
/*     */     //   530: iload #7
/*     */     //   532: istore #25
/*     */     //   534: iload #25
/*     */     //   536: iload #8
/*     */     //   538: if_icmpge -> 790
/*     */     //   541: aload #6
/*     */     //   543: iload #25
/*     */     //   545: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   550: checkcast me/konsolas/aac/gZ
/*     */     //   553: iload #5
/*     */     //   555: lload #14
/*     */     //   557: invokevirtual a : (IJ)B
/*     */     //   560: istore #26
/*     */     //   562: iload #8
/*     */     //   564: istore #27
/*     */     //   566: lload_3
/*     */     //   567: lconst_0
/*     */     //   568: lcmp
/*     */     //   569: iflt -> 803
/*     */     //   572: iload #25
/*     */     //   574: iconst_1
/*     */     //   575: iadd
/*     */     //   576: istore #28
/*     */     //   578: iload #28
/*     */     //   580: iload #8
/*     */     //   582: if_icmpge -> 647
/*     */     //   585: iload #26
/*     */     //   587: aload #6
/*     */     //   589: iload #28
/*     */     //   591: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   596: checkcast me/konsolas/aac/gZ
/*     */     //   599: iload #5
/*     */     //   601: lload #14
/*     */     //   603: invokevirtual a : (IJ)B
/*     */     //   606: lload_3
/*     */     //   607: lconst_0
/*     */     //   608: lcmp
/*     */     //   609: ifle -> 659
/*     */     //   612: if_icmpeq -> 638
/*     */     //   615: goto -> 628
/*     */     //   618: ldc2_w 3966390746903370955
/*     */     //   621: lload_3
/*     */     //   622: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   627: athrow
/*     */     //   628: iload #28
/*     */     //   630: istore #27
/*     */     //   632: lload_3
/*     */     //   633: lconst_0
/*     */     //   634: lcmp
/*     */     //   635: ifge -> 647
/*     */     //   638: iinc #28, 1
/*     */     //   641: lload_3
/*     */     //   642: lconst_0
/*     */     //   643: lcmp
/*     */     //   644: ifgt -> 578
/*     */     //   647: lload_3
/*     */     //   648: lconst_0
/*     */     //   649: lcmp
/*     */     //   650: ifle -> 757
/*     */     //   653: iload #25
/*     */     //   655: iconst_1
/*     */     //   656: iadd
/*     */     //   657: iload #27
/*     */     //   659: if_icmpne -> 734
/*     */     //   662: iload #5
/*     */     //   664: iconst_1
/*     */     //   665: iadd
/*     */     //   666: aload #6
/*     */     //   668: iload #25
/*     */     //   670: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   675: checkcast me/konsolas/aac/gZ
/*     */     //   678: invokevirtual a : ()I
/*     */     //   681: if_icmpne -> 734
/*     */     //   684: goto -> 697
/*     */     //   687: ldc2_w 3966390746903370955
/*     */     //   690: lload_3
/*     */     //   691: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   696: athrow
/*     */     //   697: aload_2
/*     */     //   698: aload #9
/*     */     //   700: iload #25
/*     */     //   702: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   707: checkcast java/lang/Integer
/*     */     //   710: invokevirtual intValue : ()I
/*     */     //   713: lload #16
/*     */     //   715: dup2_x1
/*     */     //   716: pop2
/*     */     //   717: invokevirtual b : (JI)Lme/konsolas/aac/fw;
/*     */     //   720: pop
/*     */     //   721: goto -> 780
/*     */     //   724: ldc2_w 3966390746903370955
/*     */     //   727: lload_3
/*     */     //   728: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   733: athrow
/*     */     //   734: aload_2
/*     */     //   735: ldc2_w -1
/*     */     //   738: lload #22
/*     */     //   740: aload #24
/*     */     //   742: invokestatic a : (Lme/konsolas/aac/fw;)I
/*     */     //   745: i2l
/*     */     //   746: ladd
/*     */     //   747: lmul
/*     */     //   748: l2i
/*     */     //   749: lload #16
/*     */     //   751: dup2_x1
/*     */     //   752: pop2
/*     */     //   753: invokevirtual b : (JI)Lme/konsolas/aac/fw;
/*     */     //   756: pop
/*     */     //   757: lload #22
/*     */     //   759: aload #24
/*     */     //   761: iload #5
/*     */     //   763: iconst_1
/*     */     //   764: iadd
/*     */     //   765: lload #12
/*     */     //   767: dup2_x1
/*     */     //   768: pop2
/*     */     //   769: aload #6
/*     */     //   771: iload #25
/*     */     //   773: iload #27
/*     */     //   775: aload #9
/*     */     //   777: invokestatic a : (JLme/konsolas/aac/fw;JILjava/util/List;IILjava/util/List;)V
/*     */     //   780: iload #27
/*     */     //   782: istore #25
/*     */     //   784: lload_3
/*     */     //   785: lconst_0
/*     */     //   786: lcmp
/*     */     //   787: ifgt -> 534
/*     */     //   790: aload_2
/*     */     //   791: lload #10
/*     */     //   793: aload #24
/*     */     //   795: aload #24
/*     */     //   797: invokevirtual f : ()J
/*     */     //   800: invokevirtual b : (JLme/konsolas/aac/fw;J)V
/*     */     //   803: lload_3
/*     */     //   804: lconst_0
/*     */     //   805: lcmp
/*     */     //   806: ifgt -> 1163
/*     */     //   809: iconst_0
/*     */     //   810: istore #21
/*     */     //   812: iload #5
/*     */     //   814: istore #22
/*     */     //   816: aload #18
/*     */     //   818: invokevirtual a : ()I
/*     */     //   821: aload #19
/*     */     //   823: invokevirtual a : ()I
/*     */     //   826: invokestatic min : (II)I
/*     */     //   829: istore #23
/*     */     //   831: iload #22
/*     */     //   833: iload #23
/*     */     //   835: if_icmpge -> 891
/*     */     //   838: aload #18
/*     */     //   840: iload #22
/*     */     //   842: lload #14
/*     */     //   844: invokevirtual a : (IJ)B
/*     */     //   847: aload #19
/*     */     //   849: iload #22
/*     */     //   851: lload #14
/*     */     //   853: invokevirtual a : (IJ)B
/*     */     //   856: if_icmpne -> 891
/*     */     //   859: goto -> 872
/*     */     //   862: ldc2_w 3966390746903370955
/*     */     //   865: lload_3
/*     */     //   866: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   871: athrow
/*     */     //   872: iinc #21, 1
/*     */     //   875: iinc #22, 1
/*     */     //   878: goto -> 831
/*     */     //   881: ldc2_w 3966390746903370955
/*     */     //   884: lload_3
/*     */     //   885: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   890: athrow
/*     */     //   891: lload_0
/*     */     //   892: aload_2
/*     */     //   893: invokestatic a : (Lme/konsolas/aac/fw;)I
/*     */     //   896: i2l
/*     */     //   897: ladd
/*     */     //   898: ldc2_w 2
/*     */     //   901: ladd
/*     */     //   902: iload #21
/*     */     //   904: i2l
/*     */     //   905: ladd
/*     */     //   906: lconst_1
/*     */     //   907: ladd
/*     */     //   908: lstore #22
/*     */     //   910: aload_2
/*     */     //   911: iload #21
/*     */     //   913: ineg
/*     */     //   914: lload #16
/*     */     //   916: dup2_x1
/*     */     //   917: pop2
/*     */     //   918: invokevirtual b : (JI)Lme/konsolas/aac/fw;
/*     */     //   921: pop
/*     */     //   922: aload_2
/*     */     //   923: lload #16
/*     */     //   925: iload #20
/*     */     //   927: invokevirtual b : (JI)Lme/konsolas/aac/fw;
/*     */     //   930: pop
/*     */     //   931: iload #5
/*     */     //   933: istore #24
/*     */     //   935: iload #24
/*     */     //   937: iload #5
/*     */     //   939: iload #21
/*     */     //   941: iadd
/*     */     //   942: if_icmpge -> 989
/*     */     //   945: aload_2
/*     */     //   946: aload #18
/*     */     //   948: iload #24
/*     */     //   950: lload #14
/*     */     //   952: invokevirtual a : (IJ)B
/*     */     //   955: sipush #255
/*     */     //   958: iand
/*     */     //   959: lload #16
/*     */     //   961: dup2_x1
/*     */     //   962: pop2
/*     */     //   963: invokevirtual b : (JI)Lme/konsolas/aac/fw;
/*     */     //   966: pop
/*     */     //   967: iinc #24, 1
/*     */     //   970: lload_3
/*     */     //   971: lconst_0
/*     */     //   972: lcmp
/*     */     //   973: ifle -> 989
/*     */     //   976: goto -> 935
/*     */     //   979: ldc2_w 3966390746903370955
/*     */     //   982: lload_3
/*     */     //   983: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   988: athrow
/*     */     //   989: iload #7
/*     */     //   991: iconst_1
/*     */     //   992: iadd
/*     */     //   993: iload #8
/*     */     //   995: lload_3
/*     */     //   996: lconst_0
/*     */     //   997: lcmp
/*     */     //   998: iflt -> 1030
/*     */     //   1001: if_icmpne -> 1094
/*     */     //   1004: lload_3
/*     */     //   1005: lconst_0
/*     */     //   1006: lcmp
/*     */     //   1007: iflt -> 1088
/*     */     //   1010: iload #5
/*     */     //   1012: iload #21
/*     */     //   1014: iadd
/*     */     //   1015: aload #6
/*     */     //   1017: iload #7
/*     */     //   1019: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   1024: checkcast me/konsolas/aac/gZ
/*     */     //   1027: invokevirtual a : ()I
/*     */     //   1030: if_icmpeq -> 1064
/*     */     //   1033: goto -> 1046
/*     */     //   1036: ldc2_w 3966390746903370955
/*     */     //   1039: lload_3
/*     */     //   1040: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   1045: athrow
/*     */     //   1046: new java/lang/AssertionError
/*     */     //   1049: dup
/*     */     //   1050: invokespecial <init> : ()V
/*     */     //   1053: athrow
/*     */     //   1054: ldc2_w 3966390746903370955
/*     */     //   1057: lload_3
/*     */     //   1058: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   1063: athrow
/*     */     //   1064: aload_2
/*     */     //   1065: aload #9
/*     */     //   1067: iload #7
/*     */     //   1069: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   1074: checkcast java/lang/Integer
/*     */     //   1077: invokevirtual intValue : ()I
/*     */     //   1080: lload #16
/*     */     //   1082: dup2_x1
/*     */     //   1083: pop2
/*     */     //   1084: invokevirtual b : (JI)Lme/konsolas/aac/fw;
/*     */     //   1087: pop
/*     */     //   1088: lload_3
/*     */     //   1089: lconst_0
/*     */     //   1090: lcmp
/*     */     //   1091: ifgt -> 1163
/*     */     //   1094: new me/konsolas/aac/fw
/*     */     //   1097: dup
/*     */     //   1098: invokespecial <init> : ()V
/*     */     //   1101: astore #24
/*     */     //   1103: aload_2
/*     */     //   1104: ldc2_w -1
/*     */     //   1107: lload #22
/*     */     //   1109: aload #24
/*     */     //   1111: invokestatic a : (Lme/konsolas/aac/fw;)I
/*     */     //   1114: i2l
/*     */     //   1115: ladd
/*     */     //   1116: lmul
/*     */     //   1117: l2i
/*     */     //   1118: lload #16
/*     */     //   1120: dup2_x1
/*     */     //   1121: pop2
/*     */     //   1122: invokevirtual b : (JI)Lme/konsolas/aac/fw;
/*     */     //   1125: pop
/*     */     //   1126: lload #22
/*     */     //   1128: aload #24
/*     */     //   1130: iload #5
/*     */     //   1132: iload #21
/*     */     //   1134: iadd
/*     */     //   1135: lload #12
/*     */     //   1137: dup2_x1
/*     */     //   1138: pop2
/*     */     //   1139: aload #6
/*     */     //   1141: iload #7
/*     */     //   1143: iload #8
/*     */     //   1145: aload #9
/*     */     //   1147: invokestatic a : (JLme/konsolas/aac/fw;JILjava/util/List;IILjava/util/List;)V
/*     */     //   1150: aload_2
/*     */     //   1151: lload #10
/*     */     //   1153: aload #24
/*     */     //   1155: aload #24
/*     */     //   1157: invokevirtual f : ()J
/*     */     //   1160: invokevirtual b : (JLme/konsolas/aac/fw;J)V
/*     */     //   1163: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #73	-> 36
/*     */     //   #68	-> 61
/*     */     //   #50	-> 72
/*     */     //   #66	-> 135
/*     */     //   #47	-> 144
/*     */     //   #21	-> 158
/*     */     //   #52	-> 174
/*     */     //   #37	-> 177
/*     */     //   #79	-> 193
/*     */     //   #54	-> 210
/*     */     //   #6	-> 213
/*     */     //   #42	-> 227
/*     */     //   #69	-> 254
/*     */     //   #33	-> 257
/*     */     //   #11	-> 270
/*     */     //   #44	-> 301
/*     */     //   #23	-> 332
/*     */     //   #22	-> 348
/*     */     //   #18	-> 357
/*     */     //   #48	-> 376
/*     */     //   #100	-> 385
/*     */     //   #32	-> 394
/*     */     //   #77	-> 405
/*     */     //   #43	-> 426
/*     */     //   #40	-> 484
/*     */     //   #61	-> 512
/*     */     //   #96	-> 521
/*     */     //   #84	-> 530
/*     */     //   #45	-> 534
/*     */     //   #39	-> 541
/*     */     //   #97	-> 562
/*     */     //   #8	-> 566
/*     */     //   #92	-> 585
/*     */     //   #87	-> 628
/*     */     //   #94	-> 632
/*     */     //   #35	-> 638
/*     */     //   #12	-> 647
/*     */     //   #46	-> 670
/*     */     //   #2	-> 697
/*     */     //   #75	-> 734
/*     */     //   #88	-> 757
/*     */     //   #29	-> 780
/*     */     //   #89	-> 784
/*     */     //   #7	-> 790
/*     */     //   #72	-> 803
/*     */     //   #25	-> 809
/*     */     //   #19	-> 812
/*     */     //   #34	-> 838
/*     */     //   #108	-> 872
/*     */     //   #76	-> 875
/*     */     //   #105	-> 891
/*     */     //   #41	-> 910
/*     */     //   #36	-> 922
/*     */     //   #13	-> 931
/*     */     //   #82	-> 945
/*     */     //   #3	-> 967
/*     */     //   #99	-> 989
/*     */     //   #80	-> 1004
/*     */     //   #104	-> 1046
/*     */     //   #91	-> 1064
/*     */     //   #1	-> 1094
/*     */     //   #55	-> 1103
/*     */     //   #16	-> 1126
/*     */     //   #60	-> 1150
/*     */     //   #31	-> 1163
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   36	51	51	java/lang/IllegalArgumentException
/*     */     //   65	104	107	java/lang/IllegalArgumentException
/*     */     //   72	125	125	java/lang/IllegalArgumentException
/*     */     //   263	319	322	java/lang/IllegalArgumentException
/*     */     //   270	335	338	java/lang/IllegalArgumentException
/*     */     //   426	471	474	java/lang/IllegalArgumentException
/*     */     //   445	499	502	java/lang/IllegalArgumentException
/*     */     //   578	615	618	java/lang/IllegalArgumentException
/*     */     //   647	684	687	java/lang/IllegalArgumentException
/*     */     //   662	724	724	java/lang/IllegalArgumentException
/*     */     //   831	859	862	java/lang/IllegalArgumentException
/*     */     //   838	881	881	java/lang/IllegalArgumentException
/*     */     //   935	979	979	java/lang/IllegalArgumentException
/*     */     //   989	1033	1036	java/lang/IllegalArgumentException
/*     */     //   1004	1054	1054	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public static ag a(int paramInt1, byte paramByte, int paramInt2, gZ[] paramArrayOfgZ) {
/*     */     // Byte code:
/*     */     //   0: iload_0
/*     */     //   1: i2l
/*     */     //   2: bipush #32
/*     */     //   4: lshl
/*     */     //   5: iload_1
/*     */     //   6: i2l
/*     */     //   7: bipush #56
/*     */     //   9: lshl
/*     */     //   10: bipush #32
/*     */     //   12: lushr
/*     */     //   13: lor
/*     */     //   14: iload_2
/*     */     //   15: i2l
/*     */     //   16: bipush #40
/*     */     //   18: lshl
/*     */     //   19: bipush #40
/*     */     //   21: lushr
/*     */     //   22: lor
/*     */     //   23: getstatic me/konsolas/aac/ag.c : J
/*     */     //   26: lxor
/*     */     //   27: lstore #4
/*     */     //   29: lload #4
/*     */     //   31: dup2
/*     */     //   32: ldc2_w 66698581472145
/*     */     //   35: lxor
/*     */     //   36: lstore #6
/*     */     //   38: dup2
/*     */     //   39: ldc2_w 34995849127252
/*     */     //   42: lxor
/*     */     //   43: dup2
/*     */     //   44: bipush #32
/*     */     //   46: lushr
/*     */     //   47: l2i
/*     */     //   48: istore #8
/*     */     //   50: dup2
/*     */     //   51: bipush #32
/*     */     //   53: lshl
/*     */     //   54: bipush #48
/*     */     //   56: lushr
/*     */     //   57: l2i
/*     */     //   58: istore #9
/*     */     //   60: dup2
/*     */     //   61: bipush #48
/*     */     //   63: lshl
/*     */     //   64: bipush #48
/*     */     //   66: lushr
/*     */     //   67: l2i
/*     */     //   68: istore #10
/*     */     //   70: pop2
/*     */     //   71: dup2
/*     */     //   72: ldc2_w 82957760294393
/*     */     //   75: lxor
/*     */     //   76: lstore #11
/*     */     //   78: dup2
/*     */     //   79: ldc2_w 96533611651431
/*     */     //   82: lxor
/*     */     //   83: lstore #13
/*     */     //   85: pop2
/*     */     //   86: aload_3
/*     */     //   87: arraylength
/*     */     //   88: ifne -> 125
/*     */     //   91: new me/konsolas/aac/ag
/*     */     //   94: dup
/*     */     //   95: iconst_0
/*     */     //   96: anewarray me/konsolas/aac/gZ
/*     */     //   99: iconst_2
/*     */     //   100: newarray int
/*     */     //   102: dup
/*     */     //   103: iconst_0
/*     */     //   104: iconst_0
/*     */     //   105: iastore
/*     */     //   106: dup
/*     */     //   107: iconst_1
/*     */     //   108: iconst_m1
/*     */     //   109: iastore
/*     */     //   110: invokespecial <init> : ([Lme/konsolas/aac/gZ;[I)V
/*     */     //   113: areturn
/*     */     //   114: ldc2_w -1381714310797555949
/*     */     //   117: lload #4
/*     */     //   119: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   124: athrow
/*     */     //   125: new java/util/ArrayList
/*     */     //   128: dup
/*     */     //   129: aload_3
/*     */     //   130: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
/*     */     //   133: invokespecial <init> : (Ljava/util/Collection;)V
/*     */     //   136: astore #15
/*     */     //   138: aload #15
/*     */     //   140: invokestatic sort : (Ljava/util/List;)V
/*     */     //   143: new java/util/ArrayList
/*     */     //   146: dup
/*     */     //   147: invokespecial <init> : ()V
/*     */     //   150: astore #16
/*     */     //   152: iconst_0
/*     */     //   153: istore #17
/*     */     //   155: iload #17
/*     */     //   157: aload #15
/*     */     //   159: invokeinterface size : ()I
/*     */     //   164: if_icmpge -> 200
/*     */     //   167: aload #16
/*     */     //   169: iconst_m1
/*     */     //   170: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   173: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   178: pop
/*     */     //   179: iinc #17, 1
/*     */     //   182: iload_0
/*     */     //   183: iflt -> 203
/*     */     //   186: goto -> 155
/*     */     //   189: ldc2_w -1381714310797555949
/*     */     //   192: lload #4
/*     */     //   194: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   199: athrow
/*     */     //   200: iconst_0
/*     */     //   201: istore #17
/*     */     //   203: iload #17
/*     */     //   205: aload #15
/*     */     //   207: invokeinterface size : ()I
/*     */     //   212: if_icmpge -> 252
/*     */     //   215: aload #15
/*     */     //   217: aload_3
/*     */     //   218: iload #17
/*     */     //   220: aaload
/*     */     //   221: invokestatic binarySearch : (Ljava/util/List;Ljava/lang/Object;)I
/*     */     //   224: istore #18
/*     */     //   226: aload #16
/*     */     //   228: iload #18
/*     */     //   230: iload #17
/*     */     //   232: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   235: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   240: pop
/*     */     //   241: iinc #17, 1
/*     */     //   244: iload_2
/*     */     //   245: ifle -> 252
/*     */     //   248: iload_2
/*     */     //   249: ifgt -> 203
/*     */     //   252: aload #15
/*     */     //   254: iconst_0
/*     */     //   255: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   260: checkcast me/konsolas/aac/gZ
/*     */     //   263: invokevirtual a : ()I
/*     */     //   266: iload_2
/*     */     //   267: ifle -> 307
/*     */     //   270: ifne -> 306
/*     */     //   273: new java/lang/IllegalArgumentException
/*     */     //   276: dup
/*     */     //   277: sipush #12610
/*     */     //   280: ldc2_w 7219130012270563460
/*     */     //   283: lload #4
/*     */     //   285: lxor
/*     */     //   286: <illegal opcode> k : (IJ)Ljava/lang/String;
/*     */     //   291: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   294: athrow
/*     */     //   295: ldc2_w -1381714310797555949
/*     */     //   298: lload #4
/*     */     //   300: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   305: athrow
/*     */     //   306: iconst_0
/*     */     //   307: istore #17
/*     */     //   309: iload #17
/*     */     //   311: aload #15
/*     */     //   313: invokeinterface size : ()I
/*     */     //   318: if_icmpge -> 554
/*     */     //   321: aload #15
/*     */     //   323: iload #17
/*     */     //   325: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   330: checkcast me/konsolas/aac/gZ
/*     */     //   333: astore #18
/*     */     //   335: iload #17
/*     */     //   337: iconst_1
/*     */     //   338: iadd
/*     */     //   339: istore #19
/*     */     //   341: iload #19
/*     */     //   343: aload #15
/*     */     //   345: invokeinterface size : ()I
/*     */     //   350: if_icmpge -> 547
/*     */     //   353: aload #15
/*     */     //   355: iload #19
/*     */     //   357: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   362: checkcast me/konsolas/aac/gZ
/*     */     //   365: astore #20
/*     */     //   367: aload #20
/*     */     //   369: lload #11
/*     */     //   371: aload #18
/*     */     //   373: invokevirtual a : (JLme/konsolas/aac/gZ;)Z
/*     */     //   376: iload_1
/*     */     //   377: ifle -> 311
/*     */     //   380: iload_2
/*     */     //   381: ifle -> 406
/*     */     //   384: ifne -> 401
/*     */     //   387: goto -> 547
/*     */     //   390: ldc2_w -1381714310797555949
/*     */     //   393: lload #4
/*     */     //   395: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   400: athrow
/*     */     //   401: aload #20
/*     */     //   403: invokevirtual a : ()I
/*     */     //   406: aload #18
/*     */     //   408: invokevirtual a : ()I
/*     */     //   411: iload_2
/*     */     //   412: ifle -> 503
/*     */     //   415: if_icmpne -> 469
/*     */     //   418: new java/lang/IllegalArgumentException
/*     */     //   421: dup
/*     */     //   422: new java/lang/StringBuilder
/*     */     //   425: dup
/*     */     //   426: invokespecial <init> : ()V
/*     */     //   429: sipush #3507
/*     */     //   432: ldc2_w 2124578062009937012
/*     */     //   435: lload #4
/*     */     //   437: lxor
/*     */     //   438: <illegal opcode> k : (IJ)Ljava/lang/String;
/*     */     //   443: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   446: aload #20
/*     */     //   448: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   451: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   454: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   457: athrow
/*     */     //   458: ldc2_w -1381714310797555949
/*     */     //   461: lload #4
/*     */     //   463: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   468: athrow
/*     */     //   469: aload #16
/*     */     //   471: iload #19
/*     */     //   473: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   478: checkcast java/lang/Integer
/*     */     //   481: iload_1
/*     */     //   482: ifle -> 525
/*     */     //   485: invokevirtual intValue : ()I
/*     */     //   488: aload #16
/*     */     //   490: iload #17
/*     */     //   492: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   497: checkcast java/lang/Integer
/*     */     //   500: invokevirtual intValue : ()I
/*     */     //   503: if_icmple -> 540
/*     */     //   506: aload #15
/*     */     //   508: iload #19
/*     */     //   510: invokeinterface remove : (I)Ljava/lang/Object;
/*     */     //   515: pop
/*     */     //   516: aload #16
/*     */     //   518: iload #19
/*     */     //   520: invokeinterface remove : (I)Ljava/lang/Object;
/*     */     //   525: pop
/*     */     //   526: goto -> 543
/*     */     //   529: ldc2_w -1381714310797555949
/*     */     //   532: lload #4
/*     */     //   534: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   539: athrow
/*     */     //   540: iinc #19, 1
/*     */     //   543: iload_2
/*     */     //   544: ifgt -> 341
/*     */     //   547: iinc #17, 1
/*     */     //   550: iload_2
/*     */     //   551: ifge -> 309
/*     */     //   554: new me/konsolas/aac/fw
/*     */     //   557: dup
/*     */     //   558: invokespecial <init> : ()V
/*     */     //   561: astore #17
/*     */     //   563: lconst_0
/*     */     //   564: aload #17
/*     */     //   566: lload #6
/*     */     //   568: iconst_0
/*     */     //   569: aload #15
/*     */     //   571: iconst_0
/*     */     //   572: aload #15
/*     */     //   574: invokeinterface size : ()I
/*     */     //   579: aload #16
/*     */     //   581: invokestatic a : (JLme/konsolas/aac/fw;JILjava/util/List;IILjava/util/List;)V
/*     */     //   584: aload #17
/*     */     //   586: invokestatic a : (Lme/konsolas/aac/fw;)I
/*     */     //   589: newarray int
/*     */     //   591: astore #18
/*     */     //   593: iconst_0
/*     */     //   594: istore #19
/*     */     //   596: iload #19
/*     */     //   598: aload #18
/*     */     //   600: arraylength
/*     */     //   601: if_icmpge -> 637
/*     */     //   604: aload #18
/*     */     //   606: iload #19
/*     */     //   608: aload #17
/*     */     //   610: lload #13
/*     */     //   612: invokevirtual c : (J)I
/*     */     //   615: iastore
/*     */     //   616: iinc #19, 1
/*     */     //   619: iload_1
/*     */     //   620: iflt -> 637
/*     */     //   623: goto -> 596
/*     */     //   626: ldc2_w -1381714310797555949
/*     */     //   629: lload #4
/*     */     //   631: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   636: athrow
/*     */     //   637: aload #17
/*     */     //   639: iload #8
/*     */     //   641: iload #9
/*     */     //   643: i2c
/*     */     //   644: iload #10
/*     */     //   646: invokevirtual a : (ICI)Z
/*     */     //   649: ifne -> 671
/*     */     //   652: new java/lang/AssertionError
/*     */     //   655: dup
/*     */     //   656: invokespecial <init> : ()V
/*     */     //   659: athrow
/*     */     //   660: ldc2_w -1381714310797555949
/*     */     //   663: lload #4
/*     */     //   665: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*     */     //   670: athrow
/*     */     //   671: new me/konsolas/aac/ag
/*     */     //   674: dup
/*     */     //   675: aload_3
/*     */     //   676: invokevirtual clone : ()Ljava/lang/Object;
/*     */     //   679: checkcast [Lme/konsolas/aac/gZ;
/*     */     //   682: aload #18
/*     */     //   684: invokespecial <init> : ([Lme/konsolas/aac/gZ;[I)V
/*     */     //   687: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #86	-> 86
/*     */     //   #90	-> 91
/*     */     //   #14	-> 125
/*     */     //   #59	-> 138
/*     */     //   #98	-> 143
/*     */     //   #78	-> 152
/*     */     //   #109	-> 167
/*     */     //   #17	-> 179
/*     */     //   #85	-> 200
/*     */     //   #57	-> 215
/*     */     //   #101	-> 226
/*     */     //   #27	-> 241
/*     */     //   #107	-> 252
/*     */     //   #4	-> 273
/*     */     //   #30	-> 306
/*     */     //   #10	-> 321
/*     */     //   #65	-> 335
/*     */     //   #24	-> 353
/*     */     //   #38	-> 367
/*     */     //   #15	-> 401
/*     */     //   #67	-> 418
/*     */     //   #53	-> 469
/*     */     //   #9	-> 506
/*     */     //   #93	-> 516
/*     */     //   #74	-> 540
/*     */     //   #56	-> 543
/*     */     //   #5	-> 547
/*     */     //   #83	-> 554
/*     */     //   #49	-> 563
/*     */     //   #102	-> 584
/*     */     //   #28	-> 593
/*     */     //   #20	-> 604
/*     */     //   #62	-> 616
/*     */     //   #63	-> 637
/*     */     //   #81	-> 652
/*     */     //   #51	-> 671
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   86	114	114	java/lang/IllegalArgumentException
/*     */     //   155	189	189	java/lang/IllegalArgumentException
/*     */     //   252	295	295	java/lang/IllegalArgumentException
/*     */     //   367	390	390	java/lang/IllegalArgumentException
/*     */     //   401	458	458	java/lang/IllegalArgumentException
/*     */     //   469	529	529	java/lang/IllegalArgumentException
/*     */     //   596	626	626	java/lang/IllegalArgumentException
/*     */     //   637	660	660	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public final int size() {
/*     */     return this.a.length;
/*     */   }
/*     */   
/*     */   static {
/*     */     long l = c ^ 0x709903E7E21EL;
/*     */     "䆀䟿ꋺ헡ꥡ㚧꥖ᚉ?똙닳眞涭을堢緕涶".toCharArray()[9] = (char)("䆀䟿ꋺ헡ꥡ㚧꥖ᚉ?똙닳眞涭을堢緕涶".toCharArray()[9] ^ 0x4805);
/*     */     "別⩢溵㴸".toCharArray()[0] = (char)("別⩢溵㴸".toCharArray()[0] ^ 0x5D59);
/*     */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*     */     for (byte b1 = 1; b1 < 8; b1++)
/*     */       (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
/*     */     Cipher cipher;
/*     */     (cipher = Cipher.getInstance(a0$cc.G("䆀䟿ꋺ헡ꥡ㚧꥖ᚉ?똙닳眞涭을堢緕涶".toCharArray(), (short)19833, false, (byte)5))).init(2, SecretKeyFactory.getInstance(a0$cc.G("別⩢溵㴸".toCharArray(), (short)25568, true, (byte)3)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*     */     String[] arrayOfString = new String[2];
/*     */     boolean bool = false;
/*     */     "䀮鱮䅚Ὰ芋呝벒?뷆뤿樇ႄㅒ띫晆ࠄ㿝雺汁擜唗ꬉ綰酩狔ⲻ즢賃쭿楩᪴駏\nꊼ섓毮署蛍⊕竂쟲쫙?櫮螕솎᧍伛ꂊ蚯吾哼鱋烥⅜狯複ሬ閶ꠧ컰뭮㺋퉥킑ത꭫僫⤹鎎䜛㤨렄琀ꋇ⍘쐑浥莙㥣줐䐩ꙝݬ숪o佈䠬ࢆ랹턏欤傂Ⱬ썢⨯캟趨譯耳룁읒츋ᑊ汨᥿ᾎ䗍檬溤鮯⟨ᔰ뀯ḭ".toCharArray()[32] = (char)("䀮鱮䅚Ὰ芋呝벒?뷆뤿樇ႄㅒ띫晆ࠄ㿝雺汁擜唗ꬉ綰酩狔ⲻ즢賃쭿楩᪴駏\nꊼ섓毮署蛍⊕竂쟲쫙?櫮螕솎᧍伛ꂊ蚯吾哼鱋烥⅜狯複ሬ閶ꠧ컰뭮㺋퉥킑ത꭫僫⤹鎎䜛㤨렄琀ꋇ⍘쐑浥莙㥣줐䐩ꙝݬ숪o佈䠬ࢆ랹턏欤傂Ⱬ썢⨯캟趨譯耳룁읒츋ᑊ汨᥿ᾎ䗍檬溤鮯⟨ᔰ뀯ḭ".toCharArray()[32] ^ 0x683B);
/*     */     String str;
/*     */     int i = (str = a0$cc.G("䀮鱮䅚Ὰ芋呝벒?뷆뤿樇ႄㅒ띫晆ࠄ㿝雺汁擜唗ꬉ綰酩狔ⲻ즢賃쭿楩᪴駏\nꊼ섓毮署蛍⊕竂쟲쫙?櫮螕솎᧍伛ꂊ蚯吾哼鱋烥⅜狯複ሬ閶ꠧ컰뭮㺋퉥킑ത꭫僫⤹鎎䜛㤨렄琀ꋇ⍘쐑浥莙㥣줐䐩ꙝݬ숪o佈䠬ࢆ랹턏欤傂Ⱬ썢⨯캟趨譯耳룁읒츋ᑊ汨᥿ᾎ䗍檬溤鮯⟨ᔰ뀯ḭ".toCharArray(), (short)17491, false, (byte)3)).length();
/*     */     byte b2 = 80;
/*     */     byte b = -1;
/*     */     while (true);
/*     */   }
/*     */   
/*     */   private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
/*     */     return paramIllegalArgumentException;
/*     */   }
/*     */   
/*     */   private static String a(byte[] paramArrayOfbyte) {
/*     */     byte b1 = 0;
/*     */     int i;
/*     */     char[] arrayOfChar = new char[i = paramArrayOfbyte.length];
/*     */     for (byte b2 = 0; b2 < i; b2++) {
/*     */       int j;
/*     */       if ((j = 0xFF & paramArrayOfbyte[b2]) < 192) {
/*     */         arrayOfChar[b1++] = (char)j;
/*     */       } else if (j < 224) {
/*     */         char c = (char)((char)(j & 0x1F) << 6);
/*     */         j = paramArrayOfbyte[++b2];
/*     */         c = (char)(c | (char)(j & 0x3F));
/*     */         arrayOfChar[b1++] = c;
/*     */       } else if (b2 < i - 2) {
/*     */         char c = (char)((char)(j & 0xF) << 12);
/*     */         j = paramArrayOfbyte[++b2];
/*     */         c = (char)(c | (char)(j & 0x3F) << 6);
/*     */         j = paramArrayOfbyte[++b2];
/*     */         c = (char)(c | (char)(j & 0x3F));
/*     */         arrayOfChar[b1++] = c;
/*     */       } 
/*     */     } 
/*     */     return new String(arrayOfChar, 0, b1);
/*     */   }
/*     */   
/*     */   private static String a(int paramInt, long paramLong) {
/*     */     int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x4DC0;
/*     */     if (e[i] == null) {
/*     */       Object[] arrayOfObject;
/*     */       try {
/*     */         Long long_ = Long.valueOf(Thread.currentThread().getId());
/*     */         arrayOfObject = (Object[])f.get(long_);
/*     */         if (arrayOfObject == null) {
/*     */           arrayOfObject = new Object[3];
/*     */           "䎆Ⴔ᪢粛탇턈喩鶙휸付岐ᾫ⻑ﯣ帉饋쨟턲蒌ꥈ俕".toCharArray()[13] = (char)("䎆Ⴔ᪢粛탇턈喩鶙휸付岐ᾫ⻑ﯣ帉饋쨟턲蒌ꥈ俕".toCharArray()[13] ^ 0xE15);
/*     */           arrayOfObject[0] = Cipher.getInstance(dP$dt.X("䎆Ⴔ᪢粛탇턈喩鶙휸付岐ᾫ⻑ﯣ帉饋쨟턲蒌ꥈ俕".toCharArray(), (short)3182, true, false));
/*     */           "Ǚ᧎뷺䞀".toCharArray()[2] = (char)("Ǚ᧎뷺䞀".toCharArray()[2] ^ 0x51F3);
/*     */           arrayOfObject[1] = SecretKeyFactory.getInstance(dP$dt.X("Ǚ᧎뷺䞀".toCharArray(), (short)16455, true, true));
/*     */           arrayOfObject[2] = new IvParameterSpec(new byte[8]);
/*     */           f.put(long_, arrayOfObject);
/*     */         } 
/*     */       } catch (Exception exception) {
/*     */         "烢㛁᥁㡔楣㢙՞虽㹦⦹쩧氂﷭篡슺기圭".toCharArray()[12] = (char)("烢㛁᥁㡔楣㢙՞虽㹦⦹쩧氂﷭篡슺기圭".toCharArray()[12] ^ 0x9DD);
/*     */         throw new RuntimeException(dP$dt.X("烢㛁᥁㡔楣㢙՞虽㹦⦹쩧氂﷭篡슺기圭".toCharArray(), (short)20475, false, true), exception);
/*     */       } 
/*     */       byte[] arrayOfByte1 = new byte[8];
/*     */       arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
/*     */       for (byte b = 1; b < 8; b++)
/*     */         arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
/*     */       DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
/*     */       SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
/*     */       ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
/*     */       "࡟そ薬蹇ﹹ푑ꊨǅ榽娼".toCharArray()[1] = (char)("࡟そ薬蹇ﹹ푑ꊨǅ榽娼".toCharArray()[1] ^ 0x4026);
/*     */       byte[] arrayOfByte2 = d[i].getBytes(dP$dt.X("࡟そ薬蹇ﹹ푑ꊨǅ榽娼".toCharArray(), (short)23812, true, false));
/*     */       e[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
/*     */     } 
/*     */     return e[i];
/*     */   }
/*     */   
/*     */   private static Object a(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
/*     */     int i = ((Integer)paramArrayOfObject[0]).intValue();
/*     */     long l = ((Long)paramArrayOfObject[1]).longValue();
/*     */     String str = a(i, l);
/*     */     MethodHandle methodHandle = MethodHandles.constant(String.class, str);
/*     */     paramMutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[] { int.class, long.class }));
/*     */     return str;
/*     */   }
/*     */   
/*     */   private static CallSite a(MethodHandles.Lookup paramLookup, String paramString, MethodType paramMethodType) {
/*     */     // Byte code:
/*     */     //   0: new java/lang/invoke/MutableCallSite
/*     */     //   3: dup
/*     */     //   4: aload_2
/*     */     //   5: invokespecial <init> : (Ljava/lang/invoke/MethodType;)V
/*     */     //   8: astore_3
/*     */     //   9: aload_3
/*     */     //   10: ldc_w
/*     */     //   13: ldc_w [Ljava/lang/Object;
/*     */     //   16: aload_2
/*     */     //   17: invokevirtual parameterCount : ()I
/*     */     //   20: invokevirtual asCollector : (Ljava/lang/Class;I)Ljava/lang/invoke/MethodHandle;
/*     */     //   23: iconst_0
/*     */     //   24: iconst_3
/*     */     //   25: anewarray java/lang/Object
/*     */     //   28: dup
/*     */     //   29: iconst_0
/*     */     //   30: aload_0
/*     */     //   31: aastore
/*     */     //   32: dup
/*     */     //   33: iconst_1
/*     */     //   34: aload_3
/*     */     //   35: aastore
/*     */     //   36: dup
/*     */     //   37: iconst_2
/*     */     //   38: aload_1
/*     */     //   39: aastore
/*     */     //   40: invokestatic insertArguments : (Ljava/lang/invoke/MethodHandle;I[Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;
/*     */     //   43: aload_2
/*     */     //   44: invokestatic explicitCastArguments : (Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;
/*     */     //   47: invokevirtual setTarget : (Ljava/lang/invoke/MethodHandle;)V
/*     */     //   50: goto -> 171
/*     */     //   53: astore #4
/*     */     //   55: new java/lang/RuntimeException
/*     */     //   58: dup
/*     */     //   59: new java/lang/StringBuilder
/*     */     //   62: dup
/*     */     //   63: invokespecial <init> : ()V
/*     */     //   66: ldc_w '຿୴凒ꉚꥵ帍檩㸶尾⸷뼳潉碯宜㎿'
/*     */     //   69: invokevirtual toCharArray : ()[C
/*     */     //   72: dup
/*     */     //   73: dup
/*     */     //   74: bipush #9
/*     */     //   76: dup_x1
/*     */     //   77: caload
/*     */     //   78: sipush #15535
/*     */     //   81: ixor
/*     */     //   82: i2c
/*     */     //   83: castore
/*     */     //   84: sipush #28594
/*     */     //   87: iconst_0
/*     */     //   88: iconst_0
/*     */     //   89: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*     */     //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   95: ldc_w '﾿ₙ楯㟮'
/*     */     //   98: invokevirtual toCharArray : ()[C
/*     */     //   101: dup
/*     */     //   102: dup
/*     */     //   103: iconst_2
/*     */     //   104: dup_x1
/*     */     //   105: caload
/*     */     //   106: sipush #11404
/*     */     //   109: ixor
/*     */     //   110: i2c
/*     */     //   111: castore
/*     */     //   112: sipush #2706
/*     */     //   115: iconst_1
/*     */     //   116: iconst_1
/*     */     //   117: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*     */     //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   123: aload_1
/*     */     //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   127: ldc_w '땗뺎乓ㅕ'
/*     */     //   130: invokevirtual toCharArray : ()[C
/*     */     //   133: dup
/*     */     //   134: dup
/*     */     //   135: iconst_0
/*     */     //   136: dup_x1
/*     */     //   137: caload
/*     */     //   138: sipush #12463
/*     */     //   141: ixor
/*     */     //   142: i2c
/*     */     //   143: castore
/*     */     //   144: sipush #30394
/*     */     //   147: iconst_0
/*     */     //   148: iconst_3
/*     */     //   149: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*     */     //   152: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   155: aload_2
/*     */     //   156: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   159: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   162: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   165: aload #4
/*     */     //   167: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   170: athrow
/*     */     //   171: aload_3
/*     */     //   172: areturn
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   9	50	53	java/lang/Exception
/*     */   }
/*     */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ag.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */