/*    */ package aacinternal;
/*    */ import me.konsolas.aac.aN;
/*    */ 
/*    */ public abstract class d implements aU, Serializable {
/*    */   protected static final double c = 1.0E-9D;
/*    */   private static final long serialVersionUID = 20160320L;
/*    */   private final double d;
/*    */   private static aN[] b;
/*    */   
/*    */   protected d() {
/* 11 */     this.d = 1.0E-9D;
/*    */   }
/*    */   public double a(double paramDouble1, long paramLong, double paramDouble2) {
/*    */     // Byte code:
/*    */     //   0: lload_3
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 18353307136357
/*    */     //   5: lxor
/*    */     //   6: lstore #7
/*    */     //   8: dup2
/*    */     //   9: ldc2_w 63978835281971
/*    */     //   12: lxor
/*    */     //   13: dup2
/*    */     //   14: bipush #48
/*    */     //   16: lushr
/*    */     //   17: l2i
/*    */     //   18: istore #9
/*    */     //   20: dup2
/*    */     //   21: bipush #16
/*    */     //   23: lshl
/*    */     //   24: bipush #32
/*    */     //   26: lushr
/*    */     //   27: l2i
/*    */     //   28: istore #10
/*    */     //   30: dup2
/*    */     //   31: bipush #48
/*    */     //   33: lshl
/*    */     //   34: bipush #48
/*    */     //   36: lushr
/*    */     //   37: l2i
/*    */     //   38: istore #11
/*    */     //   40: pop2
/*    */     //   41: pop2
/*    */     //   42: ldc2_w 274862303294703199
/*    */     //   45: lload_3
/*    */     //   46: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   51: astore #12
/*    */     //   53: dload_1
/*    */     //   54: dload #5
/*    */     //   56: aload #12
/*    */     //   58: ifnull -> 148
/*    */     //   61: dcmpl
/*    */     //   62: ifle -> 133
/*    */     //   65: goto -> 78
/*    */     //   68: ldc2_w 286554433785797204
/*    */     //   71: lload_3
/*    */     //   72: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   77: athrow
/*    */     //   78: new aacinternal/v
/*    */     //   81: dup
/*    */     //   82: getstatic aacinternal/P.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT : Laacinternal/P;
/*    */     //   85: iconst_3
/*    */     //   86: anewarray java/lang/Object
/*    */     //   89: dup
/*    */     //   90: iconst_0
/*    */     //   91: dload_1
/*    */     //   92: invokestatic valueOf : (D)Ljava/lang/Double;
/*    */     //   95: aastore
/*    */     //   96: dup
/*    */     //   97: iconst_1
/*    */     //   98: dload #5
/*    */     //   100: invokestatic valueOf : (D)Ljava/lang/Double;
/*    */     //   103: aastore
/*    */     //   104: dup
/*    */     //   105: iconst_2
/*    */     //   106: iconst_1
/*    */     //   107: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*    */     //   110: aastore
/*    */     //   111: iload #9
/*    */     //   113: i2s
/*    */     //   114: iload #10
/*    */     //   116: iload #11
/*    */     //   118: i2s
/*    */     //   119: invokespecial <init> : (Laacinternal/H;[Ljava/lang/Object;SIS)V
/*    */     //   122: athrow
/*    */     //   123: ldc2_w 286554433785797204
/*    */     //   126: lload_3
/*    */     //   127: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   132: athrow
/*    */     //   133: aload_0
/*    */     //   134: lload #7
/*    */     //   136: dload #5
/*    */     //   138: invokevirtual b : (JD)D
/*    */     //   141: aload_0
/*    */     //   142: lload #7
/*    */     //   144: dload_1
/*    */     //   145: invokevirtual b : (JD)D
/*    */     //   148: dsub
/*    */     //   149: dreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #19	-> 53
/*    */     //   #12	-> 78
/*    */     //   #33	-> 92
/*    */     //   #49	-> 133
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   53	65	68	aacinternal/v
/*    */     //   61	123	123	aacinternal/v
/*    */   }
/*    */   
/*    */   public double d(double paramDouble, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: lload_3
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 40647978301137
/*    */     //   5: lxor
/*    */     //   6: lstore #5
/*    */     //   8: dup2
/*    */     //   9: ldc2_w 89854325369889
/*    */     //   12: lxor
/*    */     //   13: dup2
/*    */     //   14: bipush #48
/*    */     //   16: lushr
/*    */     //   17: l2i
/*    */     //   18: istore #7
/*    */     //   20: dup2
/*    */     //   21: bipush #16
/*    */     //   23: lshl
/*    */     //   24: bipush #32
/*    */     //   26: lushr
/*    */     //   27: l2i
/*    */     //   28: istore #8
/*    */     //   30: dup2
/*    */     //   31: bipush #48
/*    */     //   33: lshl
/*    */     //   34: bipush #48
/*    */     //   36: lushr
/*    */     //   37: l2i
/*    */     //   38: istore #9
/*    */     //   40: pop2
/*    */     //   41: dup2
/*    */     //   42: ldc2_w 2843828794562
/*    */     //   45: lxor
/*    */     //   46: lstore #10
/*    */     //   48: dup2
/*    */     //   49: ldc2_w 67609179621085
/*    */     //   52: lxor
/*    */     //   53: lstore #12
/*    */     //   55: dup2
/*    */     //   56: ldc2_w 93617302414878
/*    */     //   59: lxor
/*    */     //   60: lstore #14
/*    */     //   62: pop2
/*    */     //   63: dload_1
/*    */     //   64: dconst_0
/*    */     //   65: dconst_1
/*    */     //   66: lload #12
/*    */     //   68: invokestatic a : (DDDJ)V
/*    */     //   71: ldc2_w -8906794568115928597
/*    */     //   74: lload_3
/*    */     //   75: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   80: aload_0
/*    */     //   81: invokevirtual d : ()D
/*    */     //   84: dstore #17
/*    */     //   86: astore #16
/*    */     //   88: dload_1
/*    */     //   89: aload #16
/*    */     //   91: ifnull -> 129
/*    */     //   94: dconst_0
/*    */     //   95: dcmpl
/*    */     //   96: ifne -> 125
/*    */     //   99: goto -> 112
/*    */     //   102: ldc2_w -8913116293494137376
/*    */     //   105: lload_3
/*    */     //   106: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   111: athrow
/*    */     //   112: dload #17
/*    */     //   114: dreturn
/*    */     //   115: ldc2_w -8913116293494137376
/*    */     //   118: lload_3
/*    */     //   119: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   124: athrow
/*    */     //   125: aload_0
/*    */     //   126: invokevirtual c : ()D
/*    */     //   129: dstore #19
/*    */     //   131: dload_1
/*    */     //   132: aload #16
/*    */     //   134: ifnull -> 174
/*    */     //   137: dconst_1
/*    */     //   138: dcmpl
/*    */     //   139: ifne -> 168
/*    */     //   142: goto -> 155
/*    */     //   145: ldc2_w -8913116293494137376
/*    */     //   148: lload_3
/*    */     //   149: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   154: athrow
/*    */     //   155: dload #19
/*    */     //   157: dreturn
/*    */     //   158: ldc2_w -8913116293494137376
/*    */     //   161: lload_3
/*    */     //   162: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   167: athrow
/*    */     //   168: aload_0
/*    */     //   169: lload #10
/*    */     //   171: invokevirtual b : (J)D
/*    */     //   174: dstore #21
/*    */     //   176: aload_0
/*    */     //   177: iload #7
/*    */     //   179: i2s
/*    */     //   180: iload #8
/*    */     //   182: iload #9
/*    */     //   184: i2s
/*    */     //   185: invokevirtual a : (SIS)D
/*    */     //   188: invokestatic a : (D)D
/*    */     //   191: dstore #23
/*    */     //   193: dload #21
/*    */     //   195: invokestatic isInfinite : (D)Z
/*    */     //   198: aload #16
/*    */     //   200: lload_3
/*    */     //   201: lconst_0
/*    */     //   202: lcmp
/*    */     //   203: ifle -> 245
/*    */     //   206: ifnull -> 243
/*    */     //   209: ifne -> 358
/*    */     //   212: goto -> 225
/*    */     //   215: ldc2_w -8913116293494137376
/*    */     //   218: lload_3
/*    */     //   219: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   224: athrow
/*    */     //   225: dload #21
/*    */     //   227: invokestatic isNaN : (D)Z
/*    */     //   230: goto -> 243
/*    */     //   233: ldc2_w -8913116293494137376
/*    */     //   236: lload_3
/*    */     //   237: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   242: athrow
/*    */     //   243: aload #16
/*    */     //   245: lload_3
/*    */     //   246: lconst_0
/*    */     //   247: lcmp
/*    */     //   248: iflt -> 290
/*    */     //   251: ifnull -> 288
/*    */     //   254: ifne -> 358
/*    */     //   257: goto -> 270
/*    */     //   260: ldc2_w -8913116293494137376
/*    */     //   263: lload_3
/*    */     //   264: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   269: athrow
/*    */     //   270: dload #23
/*    */     //   272: invokestatic isInfinite : (D)Z
/*    */     //   275: goto -> 288
/*    */     //   278: ldc2_w -8913116293494137376
/*    */     //   281: lload_3
/*    */     //   282: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   287: athrow
/*    */     //   288: aload #16
/*    */     //   290: lload_3
/*    */     //   291: lconst_0
/*    */     //   292: lcmp
/*    */     //   293: ifle -> 335
/*    */     //   296: ifnull -> 333
/*    */     //   299: ifne -> 358
/*    */     //   302: goto -> 315
/*    */     //   305: ldc2_w -8913116293494137376
/*    */     //   308: lload_3
/*    */     //   309: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   314: athrow
/*    */     //   315: dload #23
/*    */     //   317: invokestatic isNaN : (D)Z
/*    */     //   320: goto -> 333
/*    */     //   323: ldc2_w -8913116293494137376
/*    */     //   326: lload_3
/*    */     //   327: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   332: athrow
/*    */     //   333: aload #16
/*    */     //   335: ifnull -> 355
/*    */     //   338: ifne -> 358
/*    */     //   341: goto -> 354
/*    */     //   344: ldc2_w -8913116293494137376
/*    */     //   347: lload_3
/*    */     //   348: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   353: athrow
/*    */     //   354: iconst_1
/*    */     //   355: goto -> 359
/*    */     //   358: iconst_0
/*    */     //   359: istore #25
/*    */     //   361: dload #17
/*    */     //   363: ldc2_w -Infinity
/*    */     //   366: dcmpl
/*    */     //   367: aload #16
/*    */     //   369: lload_3
/*    */     //   370: lconst_0
/*    */     //   371: lcmp
/*    */     //   372: iflt -> 508
/*    */     //   375: ifnull -> 506
/*    */     //   378: ifne -> 500
/*    */     //   381: goto -> 394
/*    */     //   384: ldc2_w -8913116293494137376
/*    */     //   387: lload_3
/*    */     //   388: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   393: athrow
/*    */     //   394: iload #25
/*    */     //   396: ifeq -> 439
/*    */     //   399: goto -> 412
/*    */     //   402: ldc2_w -8913116293494137376
/*    */     //   405: lload_3
/*    */     //   406: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   411: athrow
/*    */     //   412: dload #21
/*    */     //   414: dload #23
/*    */     //   416: dconst_1
/*    */     //   417: dload_1
/*    */     //   418: dsub
/*    */     //   419: dload_1
/*    */     //   420: ddiv
/*    */     //   421: invokestatic a : (D)D
/*    */     //   424: dmul
/*    */     //   425: dsub
/*    */     //   426: lload_3
/*    */     //   427: lconst_0
/*    */     //   428: lcmp
/*    */     //   429: iflt -> 502
/*    */     //   432: dstore #17
/*    */     //   434: aload #16
/*    */     //   436: ifnonnull -> 500
/*    */     //   439: ldc2_w -1.0
/*    */     //   442: dstore #17
/*    */     //   444: aload_0
/*    */     //   445: lload #5
/*    */     //   447: dload #17
/*    */     //   449: invokevirtual b : (JD)D
/*    */     //   452: dload_1
/*    */     //   453: dcmpl
/*    */     //   454: iflt -> 500
/*    */     //   457: dload #17
/*    */     //   459: ldc2_w 2.0
/*    */     //   462: dmul
/*    */     //   463: dstore #17
/*    */     //   465: aload #16
/*    */     //   467: lload_3
/*    */     //   468: lconst_0
/*    */     //   469: lcmp
/*    */     //   470: ifle -> 478
/*    */     //   473: ifnull -> 588
/*    */     //   476: aload #16
/*    */     //   478: ifnonnull -> 444
/*    */     //   481: lload_3
/*    */     //   482: lconst_0
/*    */     //   483: lcmp
/*    */     //   484: ifle -> 465
/*    */     //   487: goto -> 500
/*    */     //   490: ldc2_w -8913116293494137376
/*    */     //   493: lload_3
/*    */     //   494: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   499: athrow
/*    */     //   500: dload #19
/*    */     //   502: ldc2_w Infinity
/*    */     //   505: dcmpl
/*    */     //   506: aload #16
/*    */     //   508: ifnull -> 529
/*    */     //   511: ifne -> 588
/*    */     //   514: goto -> 527
/*    */     //   517: ldc2_w -8913116293494137376
/*    */     //   520: lload_3
/*    */     //   521: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   526: athrow
/*    */     //   527: iload #25
/*    */     //   529: ifeq -> 559
/*    */     //   532: dload #21
/*    */     //   534: dload #23
/*    */     //   536: dload_1
/*    */     //   537: dconst_1
/*    */     //   538: dload_1
/*    */     //   539: dsub
/*    */     //   540: ddiv
/*    */     //   541: invokestatic a : (D)D
/*    */     //   544: dmul
/*    */     //   545: dadd
/*    */     //   546: lload_3
/*    */     //   547: lconst_0
/*    */     //   548: lcmp
/*    */     //   549: iflt -> 560
/*    */     //   552: dstore #19
/*    */     //   554: aload #16
/*    */     //   556: ifnonnull -> 588
/*    */     //   559: dconst_1
/*    */     //   560: dstore #19
/*    */     //   562: aload_0
/*    */     //   563: lload #5
/*    */     //   565: dload #19
/*    */     //   567: invokevirtual b : (JD)D
/*    */     //   570: dload_1
/*    */     //   571: dcmpg
/*    */     //   572: ifge -> 588
/*    */     //   575: dload #19
/*    */     //   577: ldc2_w 2.0
/*    */     //   580: dmul
/*    */     //   581: dstore #19
/*    */     //   583: aload #16
/*    */     //   585: ifnonnull -> 562
/*    */     //   588: new aacinternal/aG
/*    */     //   591: dup
/*    */     //   592: aload_0
/*    */     //   593: dload_1
/*    */     //   594: invokespecial <init> : (Laacinternal/d;D)V
/*    */     //   597: astore #26
/*    */     //   599: aload #26
/*    */     //   601: lload #14
/*    */     //   603: dload #17
/*    */     //   605: dload #19
/*    */     //   607: aload_0
/*    */     //   608: invokevirtual e : ()D
/*    */     //   611: invokestatic a : (Laacinternal/Y;JDDD)D
/*    */     //   614: dstore #27
/*    */     //   616: aload_0
/*    */     //   617: aload #16
/*    */     //   619: ifnull -> 655
/*    */     //   622: invokevirtual a : ()Z
/*    */     //   625: ifne -> 866
/*    */     //   628: goto -> 641
/*    */     //   631: ldc2_w -8913116293494137376
/*    */     //   634: lload_3
/*    */     //   635: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   640: athrow
/*    */     //   641: aload_0
/*    */     //   642: goto -> 655
/*    */     //   645: ldc2_w -8913116293494137376
/*    */     //   648: lload_3
/*    */     //   649: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   654: athrow
/*    */     //   655: invokevirtual e : ()D
/*    */     //   658: dstore #29
/*    */     //   660: dload #27
/*    */     //   662: dload #29
/*    */     //   664: lload_3
/*    */     //   665: lconst_0
/*    */     //   666: lcmp
/*    */     //   667: iflt -> 680
/*    */     //   670: dsub
/*    */     //   671: aload #16
/*    */     //   673: ifnull -> 868
/*    */     //   676: aload_0
/*    */     //   677: invokevirtual d : ()D
/*    */     //   680: dcmpl
/*    */     //   681: iflt -> 866
/*    */     //   684: goto -> 697
/*    */     //   687: ldc2_w -8913116293494137376
/*    */     //   690: lload_3
/*    */     //   691: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   696: athrow
/*    */     //   697: aload_0
/*    */     //   698: lload #5
/*    */     //   700: dload #27
/*    */     //   702: invokevirtual b : (JD)D
/*    */     //   705: dstore #31
/*    */     //   707: aload_0
/*    */     //   708: dload #27
/*    */     //   710: dload #29
/*    */     //   712: dsub
/*    */     //   713: lload #5
/*    */     //   715: dup2_x2
/*    */     //   716: pop2
/*    */     //   717: invokevirtual b : (JD)D
/*    */     //   720: aload #16
/*    */     //   722: ifnull -> 868
/*    */     //   725: dload #31
/*    */     //   727: dcmpl
/*    */     //   728: ifne -> 866
/*    */     //   731: goto -> 744
/*    */     //   734: ldc2_w -8913116293494137376
/*    */     //   737: lload_3
/*    */     //   738: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   743: athrow
/*    */     //   744: dload #27
/*    */     //   746: dstore #19
/*    */     //   748: dload #19
/*    */     //   750: dload #17
/*    */     //   752: dsub
/*    */     //   753: dload #29
/*    */     //   755: dcmpl
/*    */     //   756: ifle -> 863
/*    */     //   759: ldc2_w 0.5
/*    */     //   762: dload #17
/*    */     //   764: dload #19
/*    */     //   766: dadd
/*    */     //   767: dmul
/*    */     //   768: dstore #33
/*    */     //   770: aload_0
/*    */     //   771: lload #5
/*    */     //   773: dload #33
/*    */     //   775: invokevirtual b : (JD)D
/*    */     //   778: aload #16
/*    */     //   780: lload_3
/*    */     //   781: lconst_0
/*    */     //   782: lcmp
/*    */     //   783: iflt -> 791
/*    */     //   786: ifnull -> 865
/*    */     //   789: aload #16
/*    */     //   791: ifnull -> 856
/*    */     //   794: goto -> 807
/*    */     //   797: ldc2_w -8913116293494137376
/*    */     //   800: lload_3
/*    */     //   801: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   806: athrow
/*    */     //   807: dload #31
/*    */     //   809: dcmpg
/*    */     //   810: ifge -> 841
/*    */     //   813: goto -> 826
/*    */     //   816: ldc2_w -8913116293494137376
/*    */     //   819: lload_3
/*    */     //   820: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   825: athrow
/*    */     //   826: dload #33
/*    */     //   828: dstore #17
/*    */     //   830: aload #16
/*    */     //   832: lload_3
/*    */     //   833: lconst_0
/*    */     //   834: lcmp
/*    */     //   835: iflt -> 860
/*    */     //   838: ifnonnull -> 858
/*    */     //   841: dload #33
/*    */     //   843: goto -> 856
/*    */     //   846: ldc2_w -8913116293494137376
/*    */     //   849: lload_3
/*    */     //   850: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   855: athrow
/*    */     //   856: dstore #19
/*    */     //   858: aload #16
/*    */     //   860: ifnonnull -> 748
/*    */     //   863: dload #19
/*    */     //   865: dreturn
/*    */     //   866: dload #27
/*    */     //   868: dreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #21	-> 63
/*    */     //   #8	-> 80
/*    */     //   #48	-> 88
/*    */     //   #32	-> 112
/*    */     //   #40	-> 125
/*    */     //   #10	-> 131
/*    */     //   #7	-> 155
/*    */     //   #44	-> 168
/*    */     //   #14	-> 176
/*    */     //   #15	-> 193
/*    */     //   #43	-> 272
/*    */     //   #5	-> 361
/*    */     //   #47	-> 394
/*    */     //   #39	-> 412
/*    */     //   #50	-> 439
/*    */     //   #53	-> 444
/*    */     //   #38	-> 457
/*    */     //   #18	-> 500
/*    */     //   #4	-> 527
/*    */     //   #13	-> 532
/*    */     //   #42	-> 559
/*    */     //   #31	-> 562
/*    */     //   #36	-> 575
/*    */     //   #45	-> 588
/*    */     //   #46	-> 599
/*    */     //   #2	-> 608
/*    */     //   #26	-> 611
/*    */     //   #23	-> 616
/*    */     //   #3	-> 641
/*    */     //   #25	-> 660
/*    */     //   #28	-> 697
/*    */     //   #27	-> 707
/*    */     //   #41	-> 744
/*    */     //   #51	-> 748
/*    */     //   #35	-> 759
/*    */     //   #9	-> 770
/*    */     //   #24	-> 826
/*    */     //   #37	-> 841
/*    */     //   #1	-> 858
/*    */     //   #17	-> 863
/*    */     //   #52	-> 866
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   88	99	102	aacinternal/v
/*    */     //   94	115	115	aacinternal/v
/*    */     //   131	142	145	aacinternal/v
/*    */     //   137	158	158	aacinternal/v
/*    */     //   193	212	215	aacinternal/v
/*    */     //   209	230	233	aacinternal/v
/*    */     //   243	257	260	aacinternal/v
/*    */     //   254	275	278	aacinternal/v
/*    */     //   288	302	305	aacinternal/v
/*    */     //   299	320	323	aacinternal/v
/*    */     //   333	341	344	aacinternal/v
/*    */     //   361	381	384	aacinternal/v
/*    */     //   378	399	402	aacinternal/v
/*    */     //   465	481	490	aacinternal/v
/*    */     //   506	514	517	aacinternal/v
/*    */     //   616	628	631	aacinternal/v
/*    */     //   622	642	645	aacinternal/v
/*    */     //   660	684	687	aacinternal/v
/*    */     //   707	731	734	aacinternal/v
/*    */     //   770	794	797	aacinternal/v
/*    */     //   789	813	816	aacinternal/v
/*    */     //   830	843	846	aacinternal/v
/*    */   }
/*    */   
/*    */   protected double e() {
/* 22 */     return this.d;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public double a(long paramLong, double paramDouble) {
/* 29 */     long l = paramLong ^ 0x777D4126CEF5L; int i = (int)((paramLong ^ 0x2E8A87E42944L) >>> 32L), j = (int)((paramLong ^ 0x2E8A87E42944L) << 32L >>> 48L), k = (int)((paramLong ^ 0x2E8A87E42944L) << 48L >>> 48L); paramLong ^ 0x2E8A87E42944L; return aL.h(c(paramDouble, l), i, j, k); } protected d(double paramDouble) {
/* 30 */     this.d = paramDouble;
/*    */   }
/*    */   
/*    */   public static void b(aN[] paramArrayOfaN) {
/*    */     b = paramArrayOfaN;
/*    */   }
/*    */   
/*    */   public static aN[] b() {
/*    */     return b;
/*    */   }
/*    */   
/*    */   static {
/*    */     // Byte code:
/*    */     //   0: ldc2_w -2269113424168789512
/*    */     //   3: ldc2_w -999900111250544244
/*    */     //   6: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
/*    */     //   9: invokevirtual lookupClass : ()Ljava/lang/Class;
/*    */     //   12: invokestatic a : (JJLjava/lang/Object;)Lme/konsolas/aac/na;
/*    */     //   15: ldc2_w 138247855749352
/*    */     //   18: invokeinterface a : (J)J
/*    */     //   23: ldc2_w 13209274149954
/*    */     //   26: lxor
/*    */     //   27: lstore_0
/*    */     //   28: ldc2_w 4360538941228579084
/*    */     //   31: lload_0
/*    */     //   32: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   37: ifnonnull -> 53
/*    */     //   40: iconst_5
/*    */     //   41: anewarray me/konsolas/aac/aN
/*    */     //   44: ldc2_w 4378317447468899283
/*    */     //   47: lload_0
/*    */     //   48: <illegal opcode> w : ([Lme/konsolas/aac/aN;JJ)V
/*    */     //   53: return
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */