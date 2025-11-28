/*     */ package aacinternal;public class q { public static final double n; public static final double m; private static final long k = 1023L; private static final long g = -9223372036854775808L; private static final int o = -2147483648; private static final double h = 0.0D;
/*     */   private static final long c;
/*     */   private static final long d;
/*     */   private static final int e;
/*     */   private static final int a;
/*     */   private static final long p = 9218868437227405312L;
/*     */   
/*     */   public static double a(double paramDouble1, double paramDouble2) {
/*   9 */     return paramDouble1 + paramDouble2 - paramDouble1;
/*     */   } private static final long l = 4503599627370495L; private static final long f = 4503599627370496L; private static final int i = 2139095040; private static final int j = 8388607; private static final int b = 8388608; private static final long q; private static final String[] r; private static final String[] s; private static final Map t; public static boolean b(float paramFloat1, float paramFloat2, long paramLong, float paramFloat3) {
/*     */     // Byte code:
/*     */     //   0: getstatic aacinternal/q.q : J
/*     */     //   3: lload_2
/*     */     //   4: lxor
/*     */     //   5: lstore_2
/*     */     //   6: lload_2
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 42543222269832
/*     */     //   11: lxor
/*     */     //   12: dup2
/*     */     //   13: bipush #48
/*     */     //   15: lushr
/*     */     //   16: l2i
/*     */     //   17: istore #5
/*     */     //   19: dup2
/*     */     //   20: bipush #16
/*     */     //   22: lshl
/*     */     //   23: bipush #32
/*     */     //   25: lushr
/*     */     //   26: l2i
/*     */     //   27: istore #6
/*     */     //   29: dup2
/*     */     //   30: bipush #48
/*     */     //   32: lshl
/*     */     //   33: bipush #48
/*     */     //   35: lushr
/*     */     //   36: l2i
/*     */     //   37: istore #7
/*     */     //   39: pop2
/*     */     //   40: pop2
/*     */     //   41: ldc2_w -8131887676845406535
/*     */     //   44: lload_2
/*     */     //   45: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*     */     //   50: astore #8
/*     */     //   52: fload_0
/*     */     //   53: iload #5
/*     */     //   55: i2c
/*     */     //   56: iload #6
/*     */     //   58: fload_1
/*     */     //   59: iload #7
/*     */     //   61: i2c
/*     */     //   62: invokestatic a : (FCIFC)Z
/*     */     //   65: aload #8
/*     */     //   67: ifnonnull -> 130
/*     */     //   70: ifne -> 129
/*     */     //   73: goto -> 86
/*     */     //   76: ldc2_w -8118713127081223520
/*     */     //   79: lload_2
/*     */     //   80: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   85: athrow
/*     */     //   86: fload_1
/*     */     //   87: fload_0
/*     */     //   88: fsub
/*     */     //   89: invokestatic a : (F)F
/*     */     //   92: fload #4
/*     */     //   94: fcmpg
/*     */     //   95: aload #8
/*     */     //   97: ifnonnull -> 130
/*     */     //   100: goto -> 113
/*     */     //   103: ldc2_w -8118713127081223520
/*     */     //   106: lload_2
/*     */     //   107: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   112: athrow
/*     */     //   113: ifgt -> 133
/*     */     //   116: goto -> 129
/*     */     //   119: ldc2_w -8118713127081223520
/*     */     //   122: lload_2
/*     */     //   123: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   128: athrow
/*     */     //   129: iconst_1
/*     */     //   130: goto -> 134
/*     */     //   133: iconst_0
/*     */     //   134: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #2	-> 52
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   52	73	76	java/lang/NumberFormatException
/*     */     //   70	100	103	java/lang/NumberFormatException
/*     */     //   86	116	119	java/lang/NumberFormatException
/*     */   } private static double a(double paramDouble1, double paramDouble2, int paramInt, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic aacinternal/q.q : J
/*     */     //   3: lload #5
/*     */     //   5: lxor
/*     */     //   6: lstore #5
/*     */     //   8: lload #5
/*     */     //   10: dup2
/*     */     //   11: ldc2_w 109287039397579
/*     */     //   14: lxor
/*     */     //   15: dup2
/*     */     //   16: bipush #32
/*     */     //   18: lushr
/*     */     //   19: l2i
/*     */     //   20: istore #7
/*     */     //   22: dup2
/*     */     //   23: bipush #32
/*     */     //   25: lshl
/*     */     //   26: bipush #40
/*     */     //   28: lushr
/*     */     //   29: l2i
/*     */     //   30: istore #8
/*     */     //   32: dup2
/*     */     //   33: bipush #56
/*     */     //   35: lshl
/*     */     //   36: bipush #56
/*     */     //   38: lushr
/*     */     //   39: l2i
/*     */     //   40: istore #9
/*     */     //   42: pop2
/*     */     //   43: dup2
/*     */     //   44: ldc2_w 41449730425753
/*     */     //   47: lxor
/*     */     //   48: lstore #10
/*     */     //   50: dup2
/*     */     //   51: ldc2_w 548041737697
/*     */     //   54: lxor
/*     */     //   55: lstore #12
/*     */     //   57: dup2
/*     */     //   58: ldc2_w 56043045619864
/*     */     //   61: lxor
/*     */     //   62: dup2
/*     */     //   63: bipush #48
/*     */     //   65: lushr
/*     */     //   66: l2i
/*     */     //   67: istore #14
/*     */     //   69: dup2
/*     */     //   70: bipush #16
/*     */     //   72: lshl
/*     */     //   73: bipush #32
/*     */     //   75: lushr
/*     */     //   76: l2i
/*     */     //   77: istore #15
/*     */     //   79: dup2
/*     */     //   80: bipush #48
/*     */     //   82: lshl
/*     */     //   83: bipush #48
/*     */     //   85: lushr
/*     */     //   86: l2i
/*     */     //   87: istore #16
/*     */     //   89: pop2
/*     */     //   90: dup2
/*     */     //   91: ldc2_w 71066459186980
/*     */     //   94: lxor
/*     */     //   95: lstore #17
/*     */     //   97: pop2
/*     */     //   98: ldc2_w -9016259423680083133
/*     */     //   101: lload #5
/*     */     //   103: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*     */     //   108: astore #19
/*     */     //   110: iload #4
/*     */     //   112: aload #19
/*     */     //   114: ifnonnull -> 220
/*     */     //   117: tableswitch default -> 1071, 0 -> 1012, 1 -> 302, 2 -> 175, 3 -> 331, 4 -> 828, 5 -> 458, 6 -> 570, 7 -> 940
/*     */     //   164: ldc2_w -9030001468454545574
/*     */     //   167: lload #5
/*     */     //   169: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   174: athrow
/*     */     //   175: dload_2
/*     */     //   176: lload #5
/*     */     //   178: lconst_0
/*     */     //   179: lcmp
/*     */     //   180: iflt -> 289
/*     */     //   183: ldc2_w -1.0
/*     */     //   186: aload #19
/*     */     //   188: ifnonnull -> 270
/*     */     //   191: goto -> 205
/*     */     //   194: ldc2_w -9030001468454545574
/*     */     //   197: lload #5
/*     */     //   199: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   204: athrow
/*     */     //   205: dcmpl
/*     */     //   206: goto -> 220
/*     */     //   209: ldc2_w -9030001468454545574
/*     */     //   212: lload #5
/*     */     //   214: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   219: athrow
/*     */     //   220: ifne -> 252
/*     */     //   223: dload_0
/*     */     //   224: ldc2_w -Infinity
/*     */     //   227: lload #17
/*     */     //   229: invokestatic h : (DDJ)D
/*     */     //   232: lload #10
/*     */     //   234: dup2_x2
/*     */     //   235: pop2
/*     */     //   236: invokestatic t : (JD)D
/*     */     //   239: lload #5
/*     */     //   241: lconst_0
/*     */     //   242: lcmp
/*     */     //   243: iflt -> 253
/*     */     //   246: dstore_0
/*     */     //   247: aload #19
/*     */     //   249: ifnull -> 1319
/*     */     //   252: dload_0
/*     */     //   253: ldc2_w Infinity
/*     */     //   256: goto -> 270
/*     */     //   259: ldc2_w -9030001468454545574
/*     */     //   262: lload #5
/*     */     //   264: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   269: athrow
/*     */     //   270: lload #17
/*     */     //   272: invokestatic h : (DDJ)D
/*     */     //   275: iload #7
/*     */     //   277: dup_x2
/*     */     //   278: pop
/*     */     //   279: iload #8
/*     */     //   281: dup_x2
/*     */     //   282: pop
/*     */     //   283: iload #9
/*     */     //   285: i2b
/*     */     //   286: invokestatic D : (IIDB)D
/*     */     //   289: dstore_0
/*     */     //   290: aload #19
/*     */     //   292: lload #5
/*     */     //   294: lconst_0
/*     */     //   295: lcmp
/*     */     //   296: iflt -> 328
/*     */     //   299: ifnull -> 1319
/*     */     //   302: dload_0
/*     */     //   303: ldc2_w -Infinity
/*     */     //   306: lload #17
/*     */     //   308: invokestatic h : (DDJ)D
/*     */     //   311: lload #10
/*     */     //   313: dup2_x2
/*     */     //   314: pop2
/*     */     //   315: invokestatic t : (JD)D
/*     */     //   318: dstore_0
/*     */     //   319: lload #5
/*     */     //   321: lconst_0
/*     */     //   322: lcmp
/*     */     //   323: iflt -> 331
/*     */     //   326: aload #19
/*     */     //   328: ifnull -> 1319
/*     */     //   331: dload_2
/*     */     //   332: lload #5
/*     */     //   334: lconst_0
/*     */     //   335: lcmp
/*     */     //   336: iflt -> 445
/*     */     //   339: ldc2_w -1.0
/*     */     //   342: aload #19
/*     */     //   344: ifnonnull -> 433
/*     */     //   347: goto -> 361
/*     */     //   350: ldc2_w -9030001468454545574
/*     */     //   353: lload #5
/*     */     //   355: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   360: athrow
/*     */     //   361: dcmpl
/*     */     //   362: ifne -> 415
/*     */     //   365: goto -> 379
/*     */     //   368: ldc2_w -9030001468454545574
/*     */     //   371: lload #5
/*     */     //   373: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   378: athrow
/*     */     //   379: dload_0
/*     */     //   380: ldc2_w Infinity
/*     */     //   383: lload #17
/*     */     //   385: invokestatic h : (DDJ)D
/*     */     //   388: iload #7
/*     */     //   390: dup_x2
/*     */     //   391: pop
/*     */     //   392: iload #8
/*     */     //   394: dup_x2
/*     */     //   395: pop
/*     */     //   396: iload #9
/*     */     //   398: i2b
/*     */     //   399: invokestatic D : (IIDB)D
/*     */     //   402: lload #5
/*     */     //   404: lconst_0
/*     */     //   405: lcmp
/*     */     //   406: iflt -> 416
/*     */     //   409: dstore_0
/*     */     //   410: aload #19
/*     */     //   412: ifnull -> 1319
/*     */     //   415: dload_0
/*     */     //   416: ldc2_w -Infinity
/*     */     //   419: goto -> 433
/*     */     //   422: ldc2_w -9030001468454545574
/*     */     //   425: lload #5
/*     */     //   427: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   432: athrow
/*     */     //   433: lload #17
/*     */     //   435: invokestatic h : (DDJ)D
/*     */     //   438: lload #10
/*     */     //   440: dup2_x2
/*     */     //   441: pop2
/*     */     //   442: invokestatic t : (JD)D
/*     */     //   445: dstore_0
/*     */     //   446: lload #5
/*     */     //   448: lconst_0
/*     */     //   449: lcmp
/*     */     //   450: iflt -> 468
/*     */     //   453: aload #19
/*     */     //   455: ifnull -> 1319
/*     */     //   458: dload_0
/*     */     //   459: ldc2_w -Infinity
/*     */     //   462: lload #17
/*     */     //   464: invokestatic h : (DDJ)D
/*     */     //   467: dstore_0
/*     */     //   468: dload_0
/*     */     //   469: lload #10
/*     */     //   471: dload_0
/*     */     //   472: invokestatic t : (JD)D
/*     */     //   475: dsub
/*     */     //   476: dstore #20
/*     */     //   478: lload #5
/*     */     //   480: lconst_0
/*     */     //   481: lcmp
/*     */     //   482: ifle -> 558
/*     */     //   485: dload #20
/*     */     //   487: aload #19
/*     */     //   489: ifnonnull -> 557
/*     */     //   492: ldc2_w 0.5
/*     */     //   495: dcmpl
/*     */     //   496: ifle -> 537
/*     */     //   499: goto -> 513
/*     */     //   502: ldc2_w -9030001468454545574
/*     */     //   505: lload #5
/*     */     //   507: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   512: athrow
/*     */     //   513: iload #7
/*     */     //   515: iload #8
/*     */     //   517: dload_0
/*     */     //   518: iload #9
/*     */     //   520: i2b
/*     */     //   521: invokestatic D : (IIDB)D
/*     */     //   524: lload #5
/*     */     //   526: lconst_0
/*     */     //   527: lcmp
/*     */     //   528: iflt -> 543
/*     */     //   531: dstore_0
/*     */     //   532: aload #19
/*     */     //   534: ifnull -> 1319
/*     */     //   537: lload #10
/*     */     //   539: dload_0
/*     */     //   540: invokestatic t : (JD)D
/*     */     //   543: goto -> 557
/*     */     //   546: ldc2_w -9030001468454545574
/*     */     //   549: lload #5
/*     */     //   551: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   556: athrow
/*     */     //   557: dstore_0
/*     */     //   558: lload #5
/*     */     //   560: lconst_0
/*     */     //   561: lcmp
/*     */     //   562: ifle -> 580
/*     */     //   565: aload #19
/*     */     //   567: ifnull -> 1319
/*     */     //   570: dload_0
/*     */     //   571: lload #10
/*     */     //   573: dload_0
/*     */     //   574: invokestatic t : (JD)D
/*     */     //   577: dsub
/*     */     //   578: dstore #20
/*     */     //   580: dload #20
/*     */     //   582: ldc2_w 0.5
/*     */     //   585: dcmpl
/*     */     //   586: aload #19
/*     */     //   588: lload #5
/*     */     //   590: lconst_0
/*     */     //   591: lcmp
/*     */     //   592: ifle -> 661
/*     */     //   595: ifnonnull -> 659
/*     */     //   598: ifle -> 639
/*     */     //   601: goto -> 615
/*     */     //   604: ldc2_w -9030001468454545574
/*     */     //   607: lload #5
/*     */     //   609: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   614: athrow
/*     */     //   615: iload #7
/*     */     //   617: iload #8
/*     */     //   619: dload_0
/*     */     //   620: iload #9
/*     */     //   622: i2b
/*     */     //   623: invokestatic D : (IIDB)D
/*     */     //   626: lload #5
/*     */     //   628: lconst_0
/*     */     //   629: lcmp
/*     */     //   630: ifle -> 641
/*     */     //   633: dstore_0
/*     */     //   634: aload #19
/*     */     //   636: ifnull -> 1319
/*     */     //   639: dload #20
/*     */     //   641: ldc2_w 0.5
/*     */     //   644: dcmpg
/*     */     //   645: goto -> 659
/*     */     //   648: ldc2_w -9030001468454545574
/*     */     //   651: lload #5
/*     */     //   653: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   658: athrow
/*     */     //   659: aload #19
/*     */     //   661: ifnonnull -> 768
/*     */     //   664: ifge -> 700
/*     */     //   667: goto -> 681
/*     */     //   670: ldc2_w -9030001468454545574
/*     */     //   673: lload #5
/*     */     //   675: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   680: athrow
/*     */     //   681: lload #10
/*     */     //   683: dload_0
/*     */     //   684: invokestatic t : (JD)D
/*     */     //   687: dstore_0
/*     */     //   688: lload #5
/*     */     //   690: lconst_0
/*     */     //   691: lcmp
/*     */     //   692: ifle -> 700
/*     */     //   695: aload #19
/*     */     //   697: ifnull -> 1319
/*     */     //   700: lload #5
/*     */     //   702: lconst_0
/*     */     //   703: lcmp
/*     */     //   704: ifle -> 816
/*     */     //   707: lload #10
/*     */     //   709: dload_0
/*     */     //   710: invokestatic t : (JD)D
/*     */     //   713: ldc2_w 2.0
/*     */     //   716: ddiv
/*     */     //   717: aload #19
/*     */     //   719: ifnonnull -> 815
/*     */     //   722: goto -> 736
/*     */     //   725: ldc2_w -9030001468454545574
/*     */     //   728: lload #5
/*     */     //   730: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   735: athrow
/*     */     //   736: lload #10
/*     */     //   738: dload_0
/*     */     //   739: invokestatic t : (JD)D
/*     */     //   742: ldc2_w 2.0
/*     */     //   745: ddiv
/*     */     //   746: lload #10
/*     */     //   748: dup2_x2
/*     */     //   749: pop2
/*     */     //   750: invokestatic t : (JD)D
/*     */     //   753: dcmpl
/*     */     //   754: goto -> 768
/*     */     //   757: ldc2_w -9030001468454545574
/*     */     //   760: lload #5
/*     */     //   762: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   767: athrow
/*     */     //   768: ifne -> 790
/*     */     //   771: lload #10
/*     */     //   773: dload_0
/*     */     //   774: invokestatic t : (JD)D
/*     */     //   777: lload #5
/*     */     //   779: lconst_0
/*     */     //   780: lcmp
/*     */     //   781: ifle -> 801
/*     */     //   784: dstore_0
/*     */     //   785: aload #19
/*     */     //   787: ifnull -> 1319
/*     */     //   790: iload #7
/*     */     //   792: iload #8
/*     */     //   794: dload_0
/*     */     //   795: iload #9
/*     */     //   797: i2b
/*     */     //   798: invokestatic D : (IIDB)D
/*     */     //   801: goto -> 815
/*     */     //   804: ldc2_w -9030001468454545574
/*     */     //   807: lload #5
/*     */     //   809: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   814: athrow
/*     */     //   815: dstore_0
/*     */     //   816: lload #5
/*     */     //   818: lconst_0
/*     */     //   819: lcmp
/*     */     //   820: ifle -> 848
/*     */     //   823: aload #19
/*     */     //   825: ifnull -> 1319
/*     */     //   828: dload_0
/*     */     //   829: ldc2_w Infinity
/*     */     //   832: lload #17
/*     */     //   834: invokestatic h : (DDJ)D
/*     */     //   837: dstore_0
/*     */     //   838: dload_0
/*     */     //   839: lload #10
/*     */     //   841: dload_0
/*     */     //   842: invokestatic t : (JD)D
/*     */     //   845: dsub
/*     */     //   846: dstore #20
/*     */     //   848: lload #5
/*     */     //   850: lconst_0
/*     */     //   851: lcmp
/*     */     //   852: ifle -> 928
/*     */     //   855: dload #20
/*     */     //   857: aload #19
/*     */     //   859: ifnonnull -> 927
/*     */     //   862: ldc2_w 0.5
/*     */     //   865: dcmpl
/*     */     //   866: iflt -> 907
/*     */     //   869: goto -> 883
/*     */     //   872: ldc2_w -9030001468454545574
/*     */     //   875: lload #5
/*     */     //   877: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   882: athrow
/*     */     //   883: iload #7
/*     */     //   885: iload #8
/*     */     //   887: dload_0
/*     */     //   888: iload #9
/*     */     //   890: i2b
/*     */     //   891: invokestatic D : (IIDB)D
/*     */     //   894: lload #5
/*     */     //   896: lconst_0
/*     */     //   897: lcmp
/*     */     //   898: iflt -> 913
/*     */     //   901: dstore_0
/*     */     //   902: aload #19
/*     */     //   904: ifnull -> 1319
/*     */     //   907: lload #10
/*     */     //   909: dload_0
/*     */     //   910: invokestatic t : (JD)D
/*     */     //   913: goto -> 927
/*     */     //   916: ldc2_w -9030001468454545574
/*     */     //   919: lload #5
/*     */     //   921: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   926: athrow
/*     */     //   927: dstore_0
/*     */     //   928: lload #5
/*     */     //   930: lconst_0
/*     */     //   931: lcmp
/*     */     //   932: iflt -> 940
/*     */     //   935: aload #19
/*     */     //   937: ifnull -> 1319
/*     */     //   940: dload_0
/*     */     //   941: aload #19
/*     */     //   943: ifnonnull -> 1320
/*     */     //   946: goto -> 960
/*     */     //   949: ldc2_w -9030001468454545574
/*     */     //   952: lload #5
/*     */     //   954: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   959: athrow
/*     */     //   960: lload #10
/*     */     //   962: dload_0
/*     */     //   963: invokestatic t : (JD)D
/*     */     //   966: dcmpl
/*     */     //   967: ifeq -> 1319
/*     */     //   970: goto -> 984
/*     */     //   973: ldc2_w -9030001468454545574
/*     */     //   976: lload #5
/*     */     //   978: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   983: athrow
/*     */     //   984: new aacinternal/u
/*     */     //   987: dup
/*     */     //   988: getstatic aacinternal/P.ARITHMETIC_EXCEPTION : Laacinternal/P;
/*     */     //   991: iconst_0
/*     */     //   992: anewarray java/lang/Object
/*     */     //   995: lload #12
/*     */     //   997: invokespecial <init> : (Laacinternal/H;[Ljava/lang/Object;J)V
/*     */     //   1000: athrow
/*     */     //   1001: ldc2_w -9030001468454545574
/*     */     //   1004: lload #5
/*     */     //   1006: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   1011: athrow
/*     */     //   1012: dload_0
/*     */     //   1013: aload #19
/*     */     //   1015: ifnonnull -> 1320
/*     */     //   1018: lload #10
/*     */     //   1020: dload_0
/*     */     //   1021: invokestatic t : (JD)D
/*     */     //   1024: dcmpl
/*     */     //   1025: ifeq -> 1319
/*     */     //   1028: goto -> 1042
/*     */     //   1031: ldc2_w -9030001468454545574
/*     */     //   1034: lload #5
/*     */     //   1036: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   1041: athrow
/*     */     //   1042: dload_0
/*     */     //   1043: ldc2_w Infinity
/*     */     //   1046: lload #17
/*     */     //   1048: invokestatic h : (DDJ)D
/*     */     //   1051: iload #7
/*     */     //   1053: dup_x2
/*     */     //   1054: pop
/*     */     //   1055: iload #8
/*     */     //   1057: dup_x2
/*     */     //   1058: pop
/*     */     //   1059: iload #9
/*     */     //   1061: i2b
/*     */     //   1062: invokestatic D : (IIDB)D
/*     */     //   1065: dstore_0
/*     */     //   1066: aload #19
/*     */     //   1068: ifnull -> 1319
/*     */     //   1071: new aacinternal/v
/*     */     //   1074: dup
/*     */     //   1075: getstatic aacinternal/P.INVALID_ROUNDING_METHOD : Laacinternal/P;
/*     */     //   1078: bipush #17
/*     */     //   1080: anewarray java/lang/Object
/*     */     //   1083: dup
/*     */     //   1084: iconst_0
/*     */     //   1085: iload #4
/*     */     //   1087: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1090: aastore
/*     */     //   1091: dup
/*     */     //   1092: iconst_1
/*     */     //   1093: sipush #23422
/*     */     //   1096: ldc2_w 8641021101688808744
/*     */     //   1099: lload #5
/*     */     //   1101: lxor
/*     */     //   1102: <illegal opcode> r : (IJ)Ljava/lang/String;
/*     */     //   1107: aastore
/*     */     //   1108: dup
/*     */     //   1109: iconst_2
/*     */     //   1110: iconst_2
/*     */     //   1111: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1114: aastore
/*     */     //   1115: dup
/*     */     //   1116: iconst_3
/*     */     //   1117: sipush #32703
/*     */     //   1120: ldc2_w 1005658916208951791
/*     */     //   1123: lload #5
/*     */     //   1125: lxor
/*     */     //   1126: <illegal opcode> r : (IJ)Ljava/lang/String;
/*     */     //   1131: aastore
/*     */     //   1132: dup
/*     */     //   1133: iconst_4
/*     */     //   1134: iconst_1
/*     */     //   1135: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1138: aastore
/*     */     //   1139: dup
/*     */     //   1140: iconst_5
/*     */     //   1141: sipush #19259
/*     */     //   1144: ldc2_w 4717180771149608300
/*     */     //   1147: lload #5
/*     */     //   1149: lxor
/*     */     //   1150: <illegal opcode> r : (IJ)Ljava/lang/String;
/*     */     //   1155: aastore
/*     */     //   1156: dup
/*     */     //   1157: bipush #6
/*     */     //   1159: iconst_3
/*     */     //   1160: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1163: aastore
/*     */     //   1164: dup
/*     */     //   1165: bipush #7
/*     */     //   1167: sipush #4036
/*     */     //   1170: ldc2_w 6194631925590536598
/*     */     //   1173: lload #5
/*     */     //   1175: lxor
/*     */     //   1176: <illegal opcode> r : (IJ)Ljava/lang/String;
/*     */     //   1181: aastore
/*     */     //   1182: dup
/*     */     //   1183: bipush #8
/*     */     //   1185: iconst_5
/*     */     //   1186: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1189: aastore
/*     */     //   1190: dup
/*     */     //   1191: bipush #9
/*     */     //   1193: sipush #17540
/*     */     //   1196: ldc2_w 4845950222815361744
/*     */     //   1199: lload #5
/*     */     //   1201: lxor
/*     */     //   1202: <illegal opcode> r : (IJ)Ljava/lang/String;
/*     */     //   1207: aastore
/*     */     //   1208: dup
/*     */     //   1209: bipush #10
/*     */     //   1211: bipush #6
/*     */     //   1213: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1216: aastore
/*     */     //   1217: dup
/*     */     //   1218: bipush #11
/*     */     //   1220: sipush #749
/*     */     //   1223: ldc2_w 1874182695352483004
/*     */     //   1226: lload #5
/*     */     //   1228: lxor
/*     */     //   1229: <illegal opcode> r : (IJ)Ljava/lang/String;
/*     */     //   1234: aastore
/*     */     //   1235: dup
/*     */     //   1236: bipush #12
/*     */     //   1238: iconst_4
/*     */     //   1239: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1242: aastore
/*     */     //   1243: dup
/*     */     //   1244: bipush #13
/*     */     //   1246: sipush #1149
/*     */     //   1249: ldc2_w 9203710871927241262
/*     */     //   1252: lload #5
/*     */     //   1254: lxor
/*     */     //   1255: <illegal opcode> r : (IJ)Ljava/lang/String;
/*     */     //   1260: aastore
/*     */     //   1261: dup
/*     */     //   1262: bipush #14
/*     */     //   1264: bipush #7
/*     */     //   1266: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1269: aastore
/*     */     //   1270: dup
/*     */     //   1271: bipush #15
/*     */     //   1273: sipush #12921
/*     */     //   1276: ldc2_w 6278008103391136812
/*     */     //   1279: lload #5
/*     */     //   1281: lxor
/*     */     //   1282: <illegal opcode> r : (IJ)Ljava/lang/String;
/*     */     //   1287: aastore
/*     */     //   1288: dup
/*     */     //   1289: bipush #16
/*     */     //   1291: iconst_0
/*     */     //   1292: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1295: aastore
/*     */     //   1296: iload #14
/*     */     //   1298: i2s
/*     */     //   1299: iload #15
/*     */     //   1301: iload #16
/*     */     //   1303: i2s
/*     */     //   1304: invokespecial <init> : (Laacinternal/H;[Ljava/lang/Object;SIS)V
/*     */     //   1307: athrow
/*     */     //   1308: ldc2_w -9030001468454545574
/*     */     //   1311: lload #5
/*     */     //   1313: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   1318: athrow
/*     */     //   1319: dload_0
/*     */     //   1320: dreturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #4	-> 110
/*     */     //   #66	-> 175
/*     */     //   #52	-> 223
/*     */     //   #45	-> 252
/*     */     //   #94	-> 290
/*     */     //   #103	-> 302
/*     */     //   #29	-> 319
/*     */     //   #53	-> 331
/*     */     //   #109	-> 379
/*     */     //   #13	-> 415
/*     */     //   #89	-> 446
/*     */     //   #37	-> 458
/*     */     //   #90	-> 468
/*     */     //   #26	-> 478
/*     */     //   #124	-> 513
/*     */     //   #115	-> 537
/*     */     //   #41	-> 558
/*     */     //   #88	-> 570
/*     */     //   #95	-> 580
/*     */     //   #36	-> 615
/*     */     //   #49	-> 639
/*     */     //   #34	-> 681
/*     */     //   #59	-> 700
/*     */     //   #69	-> 771
/*     */     //   #33	-> 790
/*     */     //   #107	-> 816
/*     */     //   #10	-> 828
/*     */     //   #113	-> 838
/*     */     //   #91	-> 848
/*     */     //   #80	-> 883
/*     */     //   #129	-> 907
/*     */     //   #48	-> 928
/*     */     //   #92	-> 940
/*     */     //   #101	-> 984
/*     */     //   #44	-> 1012
/*     */     //   #61	-> 1042
/*     */     //   #18	-> 1071
/*     */     //   #6	-> 1087
/*     */     //   #84	-> 1111
/*     */     //   #83	-> 1135
/*     */     //   #16	-> 1160
/*     */     //   #68	-> 1186
/*     */     //   #51	-> 1213
/*     */     //   #125	-> 1239
/*     */     //   #57	-> 1266
/*     */     //   #38	-> 1292
/*     */     //   #47	-> 1319
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   110	164	164	aacinternal/u
/*     */     //   117	191	194	aacinternal/u
/*     */     //   175	206	209	aacinternal/u
/*     */     //   247	256	259	aacinternal/u
/*     */     //   319	347	350	aacinternal/u
/*     */     //   331	365	368	aacinternal/u
/*     */     //   410	419	422	aacinternal/u
/*     */     //   478	499	502	aacinternal/u
/*     */     //   532	543	546	aacinternal/u
/*     */     //   580	601	604	aacinternal/u
/*     */     //   634	645	648	aacinternal/u
/*     */     //   659	667	670	aacinternal/u
/*     */     //   688	722	725	aacinternal/u
/*     */     //   700	754	757	aacinternal/u
/*     */     //   785	801	804	aacinternal/u
/*     */     //   848	869	872	aacinternal/u
/*     */     //   902	913	916	aacinternal/u
/*     */     //   928	946	949	aacinternal/u
/*     */     //   940	970	973	aacinternal/u
/*     */     //   960	1001	1001	aacinternal/u
/*     */     //   1012	1028	1031	aacinternal/u
/*     */     //   1066	1308	1308	aacinternal/u
/*     */   } public static boolean b(double paramDouble1, double paramDouble2, long paramLong, double paramDouble3) {
/*     */     // Byte code:
/*     */     //   0: getstatic aacinternal/q.q : J
/*     */     //   3: lload #4
/*     */     //   5: lxor
/*     */     //   6: lstore #4
/*     */     //   8: lload #4
/*     */     //   10: dup2
/*     */     //   11: ldc2_w 106850342801812
/*     */     //   14: lxor
/*     */     //   15: lstore #8
/*     */     //   17: pop2
/*     */     //   18: ldc2_w -5995770058384677546
/*     */     //   21: lload #4
/*     */     //   23: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*     */     //   28: astore #10
/*     */     //   30: lload #8
/*     */     //   32: dload_0
/*     */     //   33: dload_2
/*     */     //   34: invokestatic b : (JDD)Z
/*     */     //   37: aload #10
/*     */     //   39: ifnonnull -> 105
/*     */     //   42: ifne -> 104
/*     */     //   45: goto -> 59
/*     */     //   48: ldc2_w -6000047369720432305
/*     */     //   51: lload #4
/*     */     //   53: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   58: athrow
/*     */     //   59: dload_2
/*     */     //   60: dload_0
/*     */     //   61: dsub
/*     */     //   62: invokestatic z : (D)D
/*     */     //   65: dload #6
/*     */     //   67: dcmpg
/*     */     //   68: aload #10
/*     */     //   70: ifnonnull -> 105
/*     */     //   73: goto -> 87
/*     */     //   76: ldc2_w -6000047369720432305
/*     */     //   79: lload #4
/*     */     //   81: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   86: athrow
/*     */     //   87: ifgt -> 108
/*     */     //   90: goto -> 104
/*     */     //   93: ldc2_w -6000047369720432305
/*     */     //   96: lload #4
/*     */     //   98: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   103: athrow
/*     */     //   104: iconst_1
/*     */     //   105: goto -> 109
/*     */     //   108: iconst_0
/*     */     //   109: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #7	-> 30
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   30	45	48	java/lang/NumberFormatException
/*     */     //   42	73	76	java/lang/NumberFormatException
/*     */     //   59	90	93	java/lang/NumberFormatException
/*     */   } public static int a(double paramDouble1, double paramDouble2, long paramLong, int paramInt) {
/*     */     // Byte code:
/*     */     //   0: getstatic aacinternal/q.q : J
/*     */     //   3: lload #4
/*     */     //   5: lxor
/*     */     //   6: lstore #4
/*     */     //   8: lload #4
/*     */     //   10: dup2
/*     */     //   11: ldc2_w 59601633354379
/*     */     //   14: lxor
/*     */     //   15: dup2
/*     */     //   16: bipush #32
/*     */     //   18: lushr
/*     */     //   19: l2i
/*     */     //   20: istore #7
/*     */     //   22: dup2
/*     */     //   23: bipush #32
/*     */     //   25: lshl
/*     */     //   26: bipush #48
/*     */     //   28: lushr
/*     */     //   29: l2i
/*     */     //   30: istore #8
/*     */     //   32: dup2
/*     */     //   33: bipush #48
/*     */     //   35: lshl
/*     */     //   36: bipush #48
/*     */     //   38: lushr
/*     */     //   39: l2i
/*     */     //   40: istore #9
/*     */     //   42: pop2
/*     */     //   43: pop2
/*     */     //   44: ldc2_w 1380594253838768820
/*     */     //   47: lload #4
/*     */     //   49: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*     */     //   54: astore #10
/*     */     //   56: iload #7
/*     */     //   58: iload #8
/*     */     //   60: i2c
/*     */     //   61: dload_0
/*     */     //   62: dload_2
/*     */     //   63: iload #9
/*     */     //   65: i2s
/*     */     //   66: iload #6
/*     */     //   68: invokestatic a : (ICDDSI)Z
/*     */     //   71: aload #10
/*     */     //   73: ifnonnull -> 109
/*     */     //   76: ifeq -> 106
/*     */     //   79: goto -> 93
/*     */     //   82: ldc2_w 1394402271189812909
/*     */     //   85: lload #4
/*     */     //   87: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   92: athrow
/*     */     //   93: iconst_0
/*     */     //   94: ireturn
/*     */     //   95: ldc2_w 1394402271189812909
/*     */     //   98: lload #4
/*     */     //   100: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   105: athrow
/*     */     //   106: dload_0
/*     */     //   107: dload_2
/*     */     //   108: dcmpg
/*     */     //   109: aload #10
/*     */     //   111: ifnonnull -> 145
/*     */     //   114: ifge -> 144
/*     */     //   117: goto -> 131
/*     */     //   120: ldc2_w 1394402271189812909
/*     */     //   123: lload #4
/*     */     //   125: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   130: athrow
/*     */     //   131: iconst_m1
/*     */     //   132: ireturn
/*     */     //   133: ldc2_w 1394402271189812909
/*     */     //   136: lload #4
/*     */     //   138: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   143: athrow
/*     */     //   144: iconst_1
/*     */     //   145: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #19	-> 56
/*     */     //   #8	-> 93
/*     */     //   #120	-> 106
/*     */     //   #81	-> 131
/*     */     //   #63	-> 144
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   56	79	82	java/lang/NumberFormatException
/*     */     //   76	95	95	java/lang/NumberFormatException
/*     */     //   109	117	120	java/lang/NumberFormatException
/*     */     //   114	133	133	java/lang/NumberFormatException
/*     */   } public static boolean a(int paramInt1, char paramChar, double paramDouble1, double paramDouble2, short paramShort, int paramInt2) {
/*     */     // Byte code:
/*     */     //   0: iload_0
/*     */     //   1: i2l
/*     */     //   2: bipush #32
/*     */     //   4: lshl
/*     */     //   5: iload_1
/*     */     //   6: i2l
/*     */     //   7: bipush #48
/*     */     //   9: lshl
/*     */     //   10: bipush #32
/*     */     //   12: lushr
/*     */     //   13: lor
/*     */     //   14: iload #6
/*     */     //   16: i2l
/*     */     //   17: bipush #48
/*     */     //   19: lshl
/*     */     //   20: bipush #48
/*     */     //   22: lushr
/*     */     //   23: lor
/*     */     //   24: getstatic aacinternal/q.q : J
/*     */     //   27: lxor
/*     */     //   28: lstore #8
/*     */     //   30: ldc2_w -6163781707358346263
/*     */     //   33: lload #8
/*     */     //   35: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*     */     //   40: dload_2
/*     */     //   41: invokestatic doubleToRawLongBits : (D)J
/*     */     //   44: lstore #11
/*     */     //   46: astore #10
/*     */     //   48: dload #4
/*     */     //   50: invokestatic doubleToRawLongBits : (D)J
/*     */     //   53: lstore #13
/*     */     //   55: lload #11
/*     */     //   57: lload #13
/*     */     //   59: lxor
/*     */     //   60: ldc2_w -9223372036854775808
/*     */     //   63: land
/*     */     //   64: lconst_0
/*     */     //   65: lcmp
/*     */     //   66: aload #10
/*     */     //   68: ifnonnull -> 195
/*     */     //   71: ifne -> 153
/*     */     //   74: goto -> 88
/*     */     //   77: ldc2_w -6195568375500898320
/*     */     //   80: lload #8
/*     */     //   82: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   87: athrow
/*     */     //   88: lload #11
/*     */     //   90: lload #13
/*     */     //   92: lsub
/*     */     //   93: invokestatic a : (J)J
/*     */     //   96: iload #7
/*     */     //   98: i2l
/*     */     //   99: lcmp
/*     */     //   100: aload #10
/*     */     //   102: ifnonnull -> 137
/*     */     //   105: goto -> 119
/*     */     //   108: ldc2_w -6195568375500898320
/*     */     //   111: lload #8
/*     */     //   113: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   118: athrow
/*     */     //   119: ifgt -> 140
/*     */     //   122: goto -> 136
/*     */     //   125: ldc2_w -6195568375500898320
/*     */     //   128: lload #8
/*     */     //   130: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   135: athrow
/*     */     //   136: iconst_1
/*     */     //   137: goto -> 141
/*     */     //   140: iconst_0
/*     */     //   141: istore #15
/*     */     //   143: iload #6
/*     */     //   145: iflt -> 349
/*     */     //   148: aload #10
/*     */     //   150: ifnull -> 349
/*     */     //   153: lload #11
/*     */     //   155: iload_0
/*     */     //   156: iflt -> 243
/*     */     //   159: lload #13
/*     */     //   161: aload #10
/*     */     //   163: ifnonnull -> 242
/*     */     //   166: goto -> 180
/*     */     //   169: ldc2_w -6195568375500898320
/*     */     //   172: lload #8
/*     */     //   174: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   179: athrow
/*     */     //   180: lcmp
/*     */     //   181: goto -> 195
/*     */     //   184: ldc2_w -6195568375500898320
/*     */     //   187: lload #8
/*     */     //   189: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   194: athrow
/*     */     //   195: ifge -> 223
/*     */     //   198: lload #13
/*     */     //   200: getstatic aacinternal/q.c : J
/*     */     //   203: lsub
/*     */     //   204: lstore #16
/*     */     //   206: lload #11
/*     */     //   208: getstatic aacinternal/q.d : J
/*     */     //   211: lsub
/*     */     //   212: lstore #18
/*     */     //   214: iload_0
/*     */     //   215: ifle -> 253
/*     */     //   218: aload #10
/*     */     //   220: ifnull -> 253
/*     */     //   223: lload #11
/*     */     //   225: getstatic aacinternal/q.c : J
/*     */     //   228: goto -> 242
/*     */     //   231: ldc2_w -6195568375500898320
/*     */     //   234: lload #8
/*     */     //   236: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   241: athrow
/*     */     //   242: lsub
/*     */     //   243: lstore #16
/*     */     //   245: lload #13
/*     */     //   247: getstatic aacinternal/q.d : J
/*     */     //   250: lsub
/*     */     //   251: lstore #18
/*     */     //   253: lload #16
/*     */     //   255: iload #7
/*     */     //   257: i2l
/*     */     //   258: lcmp
/*     */     //   259: aload #10
/*     */     //   261: iload_0
/*     */     //   262: iflt -> 322
/*     */     //   265: ifnonnull -> 320
/*     */     //   268: ifle -> 297
/*     */     //   271: goto -> 285
/*     */     //   274: ldc2_w -6195568375500898320
/*     */     //   277: lload #8
/*     */     //   279: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   284: athrow
/*     */     //   285: iconst_0
/*     */     //   286: istore #15
/*     */     //   288: iload_1
/*     */     //   289: ifle -> 349
/*     */     //   292: aload #10
/*     */     //   294: ifnull -> 349
/*     */     //   297: lload #18
/*     */     //   299: iload #7
/*     */     //   301: i2l
/*     */     //   302: lload #16
/*     */     //   304: lsub
/*     */     //   305: lcmp
/*     */     //   306: goto -> 320
/*     */     //   309: ldc2_w -6195568375500898320
/*     */     //   312: lload #8
/*     */     //   314: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   319: athrow
/*     */     //   320: aload #10
/*     */     //   322: ifnonnull -> 343
/*     */     //   325: ifgt -> 346
/*     */     //   328: goto -> 342
/*     */     //   331: ldc2_w -6195568375500898320
/*     */     //   334: lload #8
/*     */     //   336: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   341: athrow
/*     */     //   342: iconst_1
/*     */     //   343: goto -> 347
/*     */     //   346: iconst_0
/*     */     //   347: istore #15
/*     */     //   349: iload #15
/*     */     //   351: aload #10
/*     */     //   353: iload #6
/*     */     //   355: ifle -> 398
/*     */     //   358: ifnonnull -> 396
/*     */     //   361: ifeq -> 467
/*     */     //   364: goto -> 378
/*     */     //   367: ldc2_w -6195568375500898320
/*     */     //   370: lload #8
/*     */     //   372: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   377: athrow
/*     */     //   378: dload_2
/*     */     //   379: invokestatic isNaN : (D)Z
/*     */     //   382: goto -> 396
/*     */     //   385: ldc2_w -6195568375500898320
/*     */     //   388: lload #8
/*     */     //   390: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   395: athrow
/*     */     //   396: aload #10
/*     */     //   398: iload_0
/*     */     //   399: ifle -> 443
/*     */     //   402: ifnonnull -> 441
/*     */     //   405: ifne -> 467
/*     */     //   408: goto -> 422
/*     */     //   411: ldc2_w -6195568375500898320
/*     */     //   414: lload #8
/*     */     //   416: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   421: athrow
/*     */     //   422: dload #4
/*     */     //   424: invokestatic isNaN : (D)Z
/*     */     //   427: goto -> 441
/*     */     //   430: ldc2_w -6195568375500898320
/*     */     //   433: lload #8
/*     */     //   435: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   440: athrow
/*     */     //   441: aload #10
/*     */     //   443: ifnonnull -> 464
/*     */     //   446: ifne -> 467
/*     */     //   449: goto -> 463
/*     */     //   452: ldc2_w -6195568375500898320
/*     */     //   455: lload #8
/*     */     //   457: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   462: athrow
/*     */     //   463: iconst_1
/*     */     //   464: goto -> 468
/*     */     //   467: iconst_0
/*     */     //   468: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #20	-> 40
/*     */     //   #1	-> 48
/*     */     //   #111	-> 55
/*     */     //   #76	-> 88
/*     */     //   #132	-> 153
/*     */     //   #135	-> 198
/*     */     //   #65	-> 206
/*     */     //   #98	-> 223
/*     */     //   #127	-> 245
/*     */     //   #116	-> 253
/*     */     //   #82	-> 285
/*     */     //   #87	-> 297
/*     */     //   #130	-> 349
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   55	74	77	java/lang/NumberFormatException
/*     */     //   71	105	108	java/lang/NumberFormatException
/*     */     //   88	122	125	java/lang/NumberFormatException
/*     */     //   143	166	169	java/lang/NumberFormatException
/*     */     //   153	181	184	java/lang/NumberFormatException
/*     */     //   214	228	231	java/lang/NumberFormatException
/*     */     //   253	271	274	java/lang/NumberFormatException
/*     */     //   288	306	309	java/lang/NumberFormatException
/*     */     //   320	328	331	java/lang/NumberFormatException
/*     */     //   349	364	367	java/lang/NumberFormatException
/*     */     //   361	382	385	java/lang/NumberFormatException
/*     */     //   396	408	411	java/lang/NumberFormatException
/*     */     //   405	427	430	java/lang/NumberFormatException
/*     */     //   441	449	452	java/lang/NumberFormatException
/*     */   }
/*     */   public static float a(float paramFloat, int paramInt, long paramLong) {
/*  22 */     paramLong = q ^ paramLong; int i = (int)((paramLong ^ 0x397A1D76251FL) >>> 48L), j = (int)((paramLong ^ 0x397A1D76251FL) << 16L >>> 32L), k = (int)((paramLong ^ 0x397A1D76251FL) << 48L >>> 48L); paramLong ^ 0x397A1D76251FL; return a(paramFloat, (short)i, j, (short)k, paramInt, 4);
/*     */   } public static boolean a(long paramLong, float paramFloat) {
/*     */     // Byte code:
/*     */     //   0: getstatic aacinternal/q.q : J
/*     */     //   3: lload_0
/*     */     //   4: lxor
/*     */     //   5: lstore_0
/*     */     //   6: lload_0
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 119375080387200
/*     */     //   11: lxor
/*     */     //   12: lstore_3
/*     */     //   13: dup2
/*     */     //   14: ldc2_w 102219537244382
/*     */     //   17: lxor
/*     */     //   18: lstore #5
/*     */     //   20: pop2
/*     */     //   21: ldc2_w 6005789559436548804
/*     */     //   24: lload_0
/*     */     //   25: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*     */     //   30: fload_2
/*     */     //   31: invokestatic floatToRawIntBits : (F)I
/*     */     //   34: istore #8
/*     */     //   36: astore #7
/*     */     //   38: iload #8
/*     */     //   40: ldc 2139095040
/*     */     //   42: iand
/*     */     //   43: bipush #23
/*     */     //   45: ishr
/*     */     //   46: istore #9
/*     */     //   48: iload #9
/*     */     //   50: sipush #255
/*     */     //   53: aload #7
/*     */     //   55: ifnonnull -> 90
/*     */     //   58: if_icmpne -> 86
/*     */     //   61: goto -> 74
/*     */     //   64: ldc2_w 5992579826566956765
/*     */     //   67: lload_0
/*     */     //   68: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   73: athrow
/*     */     //   74: iconst_0
/*     */     //   75: ireturn
/*     */     //   76: ldc2_w 5992579826566956765
/*     */     //   79: lload_0
/*     */     //   80: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   85: athrow
/*     */     //   86: iload #8
/*     */     //   88: ldc 8388607
/*     */     //   90: iand
/*     */     //   91: istore #10
/*     */     //   93: iload #9
/*     */     //   95: aload #7
/*     */     //   97: ifnonnull -> 134
/*     */     //   100: ifle -> 137
/*     */     //   103: goto -> 116
/*     */     //   106: ldc2_w 5992579826566956765
/*     */     //   109: lload_0
/*     */     //   110: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   115: athrow
/*     */     //   116: ldc 8388608
/*     */     //   118: iload #10
/*     */     //   120: ior
/*     */     //   121: goto -> 134
/*     */     //   124: ldc2_w 5992579826566956765
/*     */     //   127: lload_0
/*     */     //   128: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   133: athrow
/*     */     //   134: goto -> 139
/*     */     //   137: iload #10
/*     */     //   139: istore #11
/*     */     //   141: ldc_w 16777215
/*     */     //   144: lload #5
/*     */     //   146: bipush #24
/*     */     //   148: iconst_0
/*     */     //   149: iload #9
/*     */     //   151: bipush #126
/*     */     //   153: isub
/*     */     //   154: lload_3
/*     */     //   155: invokestatic b : (IIJ)I
/*     */     //   158: invokestatic f : (JII)I
/*     */     //   161: ishr
/*     */     //   162: istore #12
/*     */     //   164: iload #11
/*     */     //   166: iload #12
/*     */     //   168: iand
/*     */     //   169: aload #7
/*     */     //   171: ifnonnull -> 191
/*     */     //   174: ifne -> 194
/*     */     //   177: goto -> 190
/*     */     //   180: ldc2_w 5992579826566956765
/*     */     //   183: lload_0
/*     */     //   184: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   189: athrow
/*     */     //   190: iconst_1
/*     */     //   191: goto -> 195
/*     */     //   194: iconst_0
/*     */     //   195: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #23	-> 30
/*     */     //   #114	-> 38
/*     */     //   #30	-> 48
/*     */     //   #108	-> 74
/*     */     //   #121	-> 86
/*     */     //   #85	-> 93
/*     */     //   #60	-> 141
/*     */     //   #126	-> 164
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   48	61	64	java/lang/NumberFormatException
/*     */     //   58	76	76	java/lang/NumberFormatException
/*     */     //   93	103	106	java/lang/NumberFormatException
/*     */     //   100	121	124	java/lang/NumberFormatException
/*     */     //   164	177	180	java/lang/NumberFormatException
/*     */   } public static boolean b(float paramFloat1, long paramLong, float paramFloat2, int paramInt) {
/*     */     // Byte code:
/*     */     //   0: getstatic aacinternal/q.q : J
/*     */     //   3: lload_1
/*     */     //   4: lxor
/*     */     //   5: lstore_1
/*     */     //   6: fload_0
/*     */     //   7: invokestatic floatToRawIntBits : (F)I
/*     */     //   10: istore #6
/*     */     //   12: ldc2_w 9221294366479234660
/*     */     //   15: lload_1
/*     */     //   16: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*     */     //   21: fload_3
/*     */     //   22: invokestatic floatToRawIntBits : (F)I
/*     */     //   25: istore #7
/*     */     //   27: astore #5
/*     */     //   29: iload #6
/*     */     //   31: iload #7
/*     */     //   33: ixor
/*     */     //   34: ldc -2147483648
/*     */     //   36: iand
/*     */     //   37: aload #5
/*     */     //   39: ifnonnull -> 148
/*     */     //   42: ifne -> 133
/*     */     //   45: goto -> 58
/*     */     //   48: ldc2_w 9190065683307375229
/*     */     //   51: lload_1
/*     */     //   52: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   57: athrow
/*     */     //   58: iload #6
/*     */     //   60: iload #7
/*     */     //   62: isub
/*     */     //   63: invokestatic b : (I)I
/*     */     //   66: aload #5
/*     */     //   68: ifnonnull -> 116
/*     */     //   71: goto -> 84
/*     */     //   74: ldc2_w 9190065683307375229
/*     */     //   77: lload_1
/*     */     //   78: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   83: athrow
/*     */     //   84: iload #4
/*     */     //   86: if_icmpgt -> 119
/*     */     //   89: goto -> 102
/*     */     //   92: ldc2_w 9190065683307375229
/*     */     //   95: lload_1
/*     */     //   96: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   101: athrow
/*     */     //   102: iconst_1
/*     */     //   103: goto -> 116
/*     */     //   106: ldc2_w 9190065683307375229
/*     */     //   109: lload_1
/*     */     //   110: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   115: athrow
/*     */     //   116: goto -> 120
/*     */     //   119: iconst_0
/*     */     //   120: istore #8
/*     */     //   122: lload_1
/*     */     //   123: lconst_0
/*     */     //   124: lcmp
/*     */     //   125: ifle -> 320
/*     */     //   128: aload #5
/*     */     //   130: ifnull -> 320
/*     */     //   133: iload #6
/*     */     //   135: goto -> 148
/*     */     //   138: ldc2_w 9190065683307375229
/*     */     //   141: lload_1
/*     */     //   142: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   147: athrow
/*     */     //   148: lload_1
/*     */     //   149: lconst_0
/*     */     //   150: lcmp
/*     */     //   151: ifle -> 223
/*     */     //   154: iload #7
/*     */     //   156: aload #5
/*     */     //   158: ifnonnull -> 222
/*     */     //   161: if_icmpge -> 204
/*     */     //   164: goto -> 177
/*     */     //   167: ldc2_w 9190065683307375229
/*     */     //   170: lload_1
/*     */     //   171: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   176: athrow
/*     */     //   177: iload #7
/*     */     //   179: getstatic aacinternal/q.e : I
/*     */     //   182: isub
/*     */     //   183: istore #9
/*     */     //   185: iload #6
/*     */     //   187: getstatic aacinternal/q.a : I
/*     */     //   190: isub
/*     */     //   191: istore #10
/*     */     //   193: lload_1
/*     */     //   194: lconst_0
/*     */     //   195: lcmp
/*     */     //   196: ifle -> 233
/*     */     //   199: aload #5
/*     */     //   201: ifnull -> 233
/*     */     //   204: iload #6
/*     */     //   206: getstatic aacinternal/q.e : I
/*     */     //   209: goto -> 222
/*     */     //   212: ldc2_w 9190065683307375229
/*     */     //   215: lload_1
/*     */     //   216: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   221: athrow
/*     */     //   222: isub
/*     */     //   223: istore #9
/*     */     //   225: iload #7
/*     */     //   227: getstatic aacinternal/q.a : I
/*     */     //   230: isub
/*     */     //   231: istore #10
/*     */     //   233: iload #9
/*     */     //   235: iload #4
/*     */     //   237: aload #5
/*     */     //   239: ifnonnull -> 310
/*     */     //   242: if_icmple -> 272
/*     */     //   245: goto -> 258
/*     */     //   248: ldc2_w 9190065683307375229
/*     */     //   251: lload_1
/*     */     //   252: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   257: athrow
/*     */     //   258: iconst_0
/*     */     //   259: istore #8
/*     */     //   261: lload_1
/*     */     //   262: lconst_0
/*     */     //   263: lcmp
/*     */     //   264: iflt -> 320
/*     */     //   267: aload #5
/*     */     //   269: ifnull -> 320
/*     */     //   272: iload #10
/*     */     //   274: aload #5
/*     */     //   276: ifnonnull -> 314
/*     */     //   279: goto -> 292
/*     */     //   282: ldc2_w 9190065683307375229
/*     */     //   285: lload_1
/*     */     //   286: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   291: athrow
/*     */     //   292: iload #4
/*     */     //   294: iload #9
/*     */     //   296: isub
/*     */     //   297: goto -> 310
/*     */     //   300: ldc2_w 9190065683307375229
/*     */     //   303: lload_1
/*     */     //   304: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   309: athrow
/*     */     //   310: if_icmpgt -> 317
/*     */     //   313: iconst_1
/*     */     //   314: goto -> 318
/*     */     //   317: iconst_0
/*     */     //   318: istore #8
/*     */     //   320: iload #8
/*     */     //   322: aload #5
/*     */     //   324: lload_1
/*     */     //   325: lconst_0
/*     */     //   326: lcmp
/*     */     //   327: ifle -> 368
/*     */     //   330: ifnonnull -> 366
/*     */     //   333: ifeq -> 435
/*     */     //   336: goto -> 349
/*     */     //   339: ldc2_w 9190065683307375229
/*     */     //   342: lload_1
/*     */     //   343: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   348: athrow
/*     */     //   349: fload_0
/*     */     //   350: invokestatic isNaN : (F)Z
/*     */     //   353: goto -> 366
/*     */     //   356: ldc2_w 9190065683307375229
/*     */     //   359: lload_1
/*     */     //   360: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   365: athrow
/*     */     //   366: aload #5
/*     */     //   368: lload_1
/*     */     //   369: lconst_0
/*     */     //   370: lcmp
/*     */     //   371: iflt -> 412
/*     */     //   374: ifnonnull -> 410
/*     */     //   377: ifne -> 435
/*     */     //   380: goto -> 393
/*     */     //   383: ldc2_w 9190065683307375229
/*     */     //   386: lload_1
/*     */     //   387: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   392: athrow
/*     */     //   393: fload_3
/*     */     //   394: invokestatic isNaN : (F)Z
/*     */     //   397: goto -> 410
/*     */     //   400: ldc2_w 9190065683307375229
/*     */     //   403: lload_1
/*     */     //   404: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   409: athrow
/*     */     //   410: aload #5
/*     */     //   412: ifnonnull -> 432
/*     */     //   415: ifne -> 435
/*     */     //   418: goto -> 431
/*     */     //   421: ldc2_w 9190065683307375229
/*     */     //   424: lload_1
/*     */     //   425: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   430: athrow
/*     */     //   431: iconst_1
/*     */     //   432: goto -> 436
/*     */     //   435: iconst_0
/*     */     //   436: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #25	-> 6
/*     */     //   #42	-> 21
/*     */     //   #55	-> 29
/*     */     //   #122	-> 58
/*     */     //   #58	-> 133
/*     */     //   #21	-> 177
/*     */     //   #102	-> 185
/*     */     //   #75	-> 204
/*     */     //   #62	-> 225
/*     */     //   #93	-> 233
/*     */     //   #3	-> 258
/*     */     //   #134	-> 272
/*     */     //   #100	-> 320
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   29	45	48	java/lang/NumberFormatException
/*     */     //   42	71	74	java/lang/NumberFormatException
/*     */     //   58	89	92	java/lang/NumberFormatException
/*     */     //   84	103	106	java/lang/NumberFormatException
/*     */     //   122	135	138	java/lang/NumberFormatException
/*     */     //   148	164	167	java/lang/NumberFormatException
/*     */     //   193	209	212	java/lang/NumberFormatException
/*     */     //   233	245	248	java/lang/NumberFormatException
/*     */     //   261	279	282	java/lang/NumberFormatException
/*     */     //   272	297	300	java/lang/NumberFormatException
/*     */     //   320	336	339	java/lang/NumberFormatException
/*     */     //   333	353	356	java/lang/NumberFormatException
/*     */     //   366	380	383	java/lang/NumberFormatException
/*     */     //   377	397	400	java/lang/NumberFormatException
/*     */     //   410	418	421	java/lang/NumberFormatException
/*     */   }
/*     */   public static double a(long paramLong, double paramDouble, int paramInt1, int paramInt2) {
/*     */     // Byte code:
/*     */     //   0: getstatic aacinternal/q.q : J
/*     */     //   3: lload_0
/*     */     //   4: lxor
/*     */     //   5: lstore_0
/*     */     //   6: ldc2_w -4271777677565653717
/*     */     //   9: lload_0
/*     */     //   10: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*     */     //   15: astore #6
/*     */     //   17: new java/math/BigDecimal
/*     */     //   20: dup
/*     */     //   21: dload_2
/*     */     //   22: invokestatic toString : (D)Ljava/lang/String;
/*     */     //   25: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   28: iload #4
/*     */     //   30: iload #5
/*     */     //   32: invokevirtual setScale : (II)Ljava/math/BigDecimal;
/*     */     //   35: invokevirtual doubleValue : ()D
/*     */     //   38: dstore #7
/*     */     //   40: dload #7
/*     */     //   42: dconst_0
/*     */     //   43: aload #6
/*     */     //   45: ifnonnull -> 80
/*     */     //   48: dcmpl
/*     */     //   49: ifne -> 84
/*     */     //   52: goto -> 65
/*     */     //   55: ldc2_w -4267536099451825870
/*     */     //   58: lload_0
/*     */     //   59: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   64: athrow
/*     */     //   65: dconst_0
/*     */     //   66: dload_2
/*     */     //   67: goto -> 80
/*     */     //   70: ldc2_w -4267536099451825870
/*     */     //   73: lload_0
/*     */     //   74: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   79: athrow
/*     */     //   80: dmul
/*     */     //   81: goto -> 86
/*     */     //   84: dload #7
/*     */     //   86: dreturn
/*     */     //   87: astore #7
/*     */     //   89: dload_2
/*     */     //   90: aload #6
/*     */     //   92: ifnonnull -> 129
/*     */     //   95: invokestatic isInfinite : (D)Z
/*     */     //   98: ifeq -> 126
/*     */     //   101: goto -> 114
/*     */     //   104: ldc2_w -4267536099451825870
/*     */     //   107: lload_0
/*     */     //   108: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   113: athrow
/*     */     //   114: dload_2
/*     */     //   115: dreturn
/*     */     //   116: ldc2_w -4267536099451825870
/*     */     //   119: lload_0
/*     */     //   120: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   125: athrow
/*     */     //   126: ldc2_w NaN
/*     */     //   129: dreturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #27	-> 17
/*     */     //   #28	-> 32
/*     */     //   #67	-> 35
/*     */     //   #43	-> 40
/*     */     //   #24	-> 87
/*     */     //   #11	-> 89
/*     */     //   #40	-> 114
/*     */     //   #70	-> 126
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   17	86	87	java/lang/NumberFormatException
/*     */     //   40	52	55	java/lang/NumberFormatException
/*     */     //   48	67	70	java/lang/NumberFormatException
/*     */     //   89	101	104	java/lang/NumberFormatException
/*     */     //   95	116	116	java/lang/NumberFormatException
/*     */   }
/*     */   public static float a(float paramFloat, short paramShort1, int paramInt1, short paramShort2, int paramInt2, int paramInt3) {
/*  32 */     long l1 = (paramShort1 << 48L | paramInt1 << 32L >>> 16L | paramShort2 << 48L >>> 48L) ^ q, l2 = l1 ^ 0x5A200A2EEE8EL; int i = (int)((l1 ^ 0x68F360CD54E4L) >>> 32L), j = (int)((l1 ^ 0x68F360CD54E4L) << 32L >>> 48L), k = (int)((l1 ^ 0x68F360CD54E4L) << 48L >>> 48L); l1 ^ 0x68F360CD54E4L; int m = (int)((l1 ^ 0x43E3EB36246AL) >>> 48L), n = (int)((l1 ^ 0x43E3EB36246AL) << 16L >>> 48L), i1 = (int)((l1 ^ 0x43E3EB36246AL) << 32L >>> 32L); l1 ^ 0x43E3EB36246AL; float f1 = aL.b(i, 1.0F, paramFloat, (short)j, (short)k);
/*     */ 
/*     */     
/*  35 */     float f2 = (float)aL.a((short)m, 10.0D, paramInt2, (short)n, i1) * f1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 118 */     return (float)a((paramFloat * f2), f1, paramInt3, l2) / f2;
/*     */   }
/*     */   
/*     */   public static boolean b(double paramDouble1, double paramDouble2, long paramLong, int paramInt) {
/*     */     // Byte code:
/*     */     //   0: getstatic aacinternal/q.q : J
/*     */     //   3: lload #4
/*     */     //   5: lxor
/*     */     //   6: lstore #4
/*     */     //   8: lload #4
/*     */     //   10: dup2
/*     */     //   11: ldc2_w 113754137489788
/*     */     //   14: lxor
/*     */     //   15: dup2
/*     */     //   16: bipush #32
/*     */     //   18: lushr
/*     */     //   19: l2i
/*     */     //   20: istore #7
/*     */     //   22: dup2
/*     */     //   23: bipush #32
/*     */     //   25: lshl
/*     */     //   26: bipush #48
/*     */     //   28: lushr
/*     */     //   29: l2i
/*     */     //   30: istore #8
/*     */     //   32: dup2
/*     */     //   33: bipush #48
/*     */     //   35: lshl
/*     */     //   36: bipush #48
/*     */     //   38: lushr
/*     */     //   39: l2i
/*     */     //   40: istore #9
/*     */     //   42: pop2
/*     */     //   43: pop2
/*     */     //   44: ldc2_w -4548764915651147453
/*     */     //   47: lload #4
/*     */     //   49: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*     */     //   54: astore #15
/*     */     //   56: dload_0
/*     */     //   57: dload_0
/*     */     //   58: dcmpl
/*     */     //   59: aload #15
/*     */     //   61: ifnonnull -> 137
/*     */     //   64: ifne -> 120
/*     */     //   67: goto -> 81
/*     */     //   70: ldc2_w -4562506812349246118
/*     */     //   73: lload #4
/*     */     //   75: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   80: athrow
/*     */     //   81: dload_2
/*     */     //   82: dload_2
/*     */     //   83: aload #15
/*     */     //   85: ifnonnull -> 238
/*     */     //   88: goto -> 102
/*     */     //   91: ldc2_w -4562506812349246118
/*     */     //   94: lload #4
/*     */     //   96: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   101: athrow
/*     */     //   102: dcmpl
/*     */     //   103: ifeq -> 236
/*     */     //   106: goto -> 120
/*     */     //   109: ldc2_w -4562506812349246118
/*     */     //   112: lload #4
/*     */     //   114: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   119: athrow
/*     */     //   120: dload_0
/*     */     //   121: dload_0
/*     */     //   122: dcmpl
/*     */     //   123: goto -> 137
/*     */     //   126: ldc2_w -4562506812349246118
/*     */     //   129: lload #4
/*     */     //   131: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   136: athrow
/*     */     //   137: aload #15
/*     */     //   139: ifnonnull -> 160
/*     */     //   142: ifeq -> 163
/*     */     //   145: goto -> 159
/*     */     //   148: ldc2_w -4562506812349246118
/*     */     //   151: lload #4
/*     */     //   153: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   158: athrow
/*     */     //   159: iconst_1
/*     */     //   160: goto -> 164
/*     */     //   163: iconst_0
/*     */     //   164: dload_2
/*     */     //   165: dload_2
/*     */     //   166: dcmpl
/*     */     //   167: aload #15
/*     */     //   169: ifnonnull -> 190
/*     */     //   172: ifeq -> 193
/*     */     //   175: goto -> 189
/*     */     //   178: ldc2_w -4562506812349246118
/*     */     //   181: lload #4
/*     */     //   183: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   188: athrow
/*     */     //   189: iconst_1
/*     */     //   190: goto -> 194
/*     */     //   193: iconst_0
/*     */     //   194: ixor
/*     */     //   195: aload #15
/*     */     //   197: ifnonnull -> 233
/*     */     //   200: ifne -> 232
/*     */     //   203: goto -> 217
/*     */     //   206: ldc2_w -4562506812349246118
/*     */     //   209: lload #4
/*     */     //   211: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   216: athrow
/*     */     //   217: iconst_1
/*     */     //   218: goto -> 263
/*     */     //   221: ldc2_w -4562506812349246118
/*     */     //   224: lload #4
/*     */     //   226: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   231: athrow
/*     */     //   232: iconst_0
/*     */     //   233: goto -> 263
/*     */     //   236: dload_0
/*     */     //   237: dload_2
/*     */     //   238: iload #6
/*     */     //   240: istore #10
/*     */     //   242: dstore #11
/*     */     //   244: dstore #13
/*     */     //   246: iload #7
/*     */     //   248: iload #8
/*     */     //   250: i2c
/*     */     //   251: dload #13
/*     */     //   253: dload #11
/*     */     //   255: iload #9
/*     */     //   257: i2s
/*     */     //   258: iload #10
/*     */     //   260: invokestatic a : (ICDDSI)Z
/*     */     //   263: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #39	-> 56
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   56	67	70	java/lang/NumberFormatException
/*     */     //   64	88	91	java/lang/NumberFormatException
/*     */     //   81	106	109	java/lang/NumberFormatException
/*     */     //   102	123	126	java/lang/NumberFormatException
/*     */     //   137	145	148	java/lang/NumberFormatException
/*     */     //   164	175	178	java/lang/NumberFormatException
/*     */     //   194	203	206	java/lang/NumberFormatException
/*     */     //   200	221	221	java/lang/NumberFormatException
/*     */   }
/*     */   
/*     */   public static boolean a(float paramFloat1, char paramChar1, int paramInt, float paramFloat2, char paramChar2) {
/*     */     // Byte code:
/*     */     //   0: iload_1
/*     */     //   1: i2l
/*     */     //   2: bipush #48
/*     */     //   4: lshl
/*     */     //   5: iload_2
/*     */     //   6: i2l
/*     */     //   7: bipush #32
/*     */     //   9: lshl
/*     */     //   10: bipush #16
/*     */     //   12: lushr
/*     */     //   13: lor
/*     */     //   14: iload #4
/*     */     //   16: i2l
/*     */     //   17: bipush #48
/*     */     //   19: lshl
/*     */     //   20: bipush #48
/*     */     //   22: lushr
/*     */     //   23: lor
/*     */     //   24: getstatic aacinternal/q.q : J
/*     */     //   27: lxor
/*     */     //   28: lstore #5
/*     */     //   30: lload #5
/*     */     //   32: dup2
/*     */     //   33: ldc2_w 4199985731413
/*     */     //   36: lxor
/*     */     //   37: lstore #7
/*     */     //   39: pop2
/*     */     //   40: ldc2_w -5513626799712306457
/*     */     //   43: lload #5
/*     */     //   45: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*     */     //   50: astore #9
/*     */     //   52: fload_0
/*     */     //   53: fload_0
/*     */     //   54: fcmpl
/*     */     //   55: aload #9
/*     */     //   57: ifnonnull -> 133
/*     */     //   60: ifne -> 116
/*     */     //   63: goto -> 77
/*     */     //   66: ldc2_w -5545448528738261250
/*     */     //   69: lload #5
/*     */     //   71: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   76: athrow
/*     */     //   77: fload_3
/*     */     //   78: fload_3
/*     */     //   79: aload #9
/*     */     //   81: ifnonnull -> 234
/*     */     //   84: goto -> 98
/*     */     //   87: ldc2_w -5545448528738261250
/*     */     //   90: lload #5
/*     */     //   92: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   97: athrow
/*     */     //   98: fcmpl
/*     */     //   99: ifeq -> 232
/*     */     //   102: goto -> 116
/*     */     //   105: ldc2_w -5545448528738261250
/*     */     //   108: lload #5
/*     */     //   110: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   115: athrow
/*     */     //   116: fload_0
/*     */     //   117: fload_0
/*     */     //   118: fcmpl
/*     */     //   119: goto -> 133
/*     */     //   122: ldc2_w -5545448528738261250
/*     */     //   125: lload #5
/*     */     //   127: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   132: athrow
/*     */     //   133: aload #9
/*     */     //   135: ifnonnull -> 156
/*     */     //   138: ifeq -> 159
/*     */     //   141: goto -> 155
/*     */     //   144: ldc2_w -5545448528738261250
/*     */     //   147: lload #5
/*     */     //   149: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   154: athrow
/*     */     //   155: iconst_1
/*     */     //   156: goto -> 160
/*     */     //   159: iconst_0
/*     */     //   160: fload_3
/*     */     //   161: fload_3
/*     */     //   162: fcmpl
/*     */     //   163: aload #9
/*     */     //   165: ifnonnull -> 186
/*     */     //   168: ifeq -> 189
/*     */     //   171: goto -> 185
/*     */     //   174: ldc2_w -5545448528738261250
/*     */     //   177: lload #5
/*     */     //   179: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   184: athrow
/*     */     //   185: iconst_1
/*     */     //   186: goto -> 190
/*     */     //   189: iconst_0
/*     */     //   190: ixor
/*     */     //   191: aload #9
/*     */     //   193: ifnonnull -> 229
/*     */     //   196: ifne -> 228
/*     */     //   199: goto -> 213
/*     */     //   202: ldc2_w -5545448528738261250
/*     */     //   205: lload #5
/*     */     //   207: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   212: athrow
/*     */     //   213: iconst_1
/*     */     //   214: goto -> 242
/*     */     //   217: ldc2_w -5545448528738261250
/*     */     //   220: lload #5
/*     */     //   222: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   227: athrow
/*     */     //   228: iconst_0
/*     */     //   229: goto -> 242
/*     */     //   232: fload_0
/*     */     //   233: fload_3
/*     */     //   234: iconst_1
/*     */     //   235: lload #7
/*     */     //   237: dup2_x2
/*     */     //   238: pop2
/*     */     //   239: invokestatic b : (FJFI)Z
/*     */     //   242: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #46	-> 52
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   52	63	66	java/lang/NumberFormatException
/*     */     //   60	84	87	java/lang/NumberFormatException
/*     */     //   77	102	105	java/lang/NumberFormatException
/*     */     //   98	119	122	java/lang/NumberFormatException
/*     */     //   133	141	144	java/lang/NumberFormatException
/*     */     //   160	171	174	java/lang/NumberFormatException
/*     */     //   190	199	202	java/lang/NumberFormatException
/*     */     //   196	217	217	java/lang/NumberFormatException
/*     */   }
/*     */   
/*     */   public static boolean b(int paramInt, short paramShort, float paramFloat1, char paramChar, float paramFloat2) {
/*     */     long l1 = (paramInt << 32L | paramShort << 48L >>> 32L | paramChar << 48L >>> 48L) ^ q, l2 = l1 ^ 0x58459ECD834DL;
/*     */     return b(paramFloat1, l2, paramFloat2, 1);
/*     */   }
/*     */   
/*     */   public static double a(long paramLong, double paramDouble, int paramInt) {
/*     */     paramLong = q ^ paramLong;
/*     */     long l = paramLong ^ 0x1F3F3786FC4EL;
/*     */     return a(l, paramDouble, paramInt, 4);
/*     */   }
/*     */   
/*     */   public static boolean a(long paramLong, double paramDouble1, double paramDouble2) {
/*     */     paramLong = q ^ paramLong;
/*     */     int i = (int)((paramLong ^ 0xED646B24892L) >>> 32L), j = (int)((paramLong ^ 0xED646B24892L) << 32L >>> 48L), k = (int)((paramLong ^ 0xED646B24892L) << 48L >>> 48L);
/*     */     paramLong ^ 0xED646B24892L;
/*     */     return a(i, (char)j, paramDouble1, paramDouble2, (short)k, 1);
/*     */   }
/*     */   
/*     */   public static boolean a(double paramDouble1, double paramDouble2, double paramDouble3, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic aacinternal/q.q : J
/*     */     //   3: lload #6
/*     */     //   5: lxor
/*     */     //   6: lstore #6
/*     */     //   8: lload #6
/*     */     //   10: dup2
/*     */     //   11: ldc2_w 121169434238499
/*     */     //   14: lxor
/*     */     //   15: dup2
/*     */     //   16: bipush #32
/*     */     //   18: lushr
/*     */     //   19: l2i
/*     */     //   20: istore #8
/*     */     //   22: dup2
/*     */     //   23: bipush #32
/*     */     //   25: lshl
/*     */     //   26: bipush #48
/*     */     //   28: lushr
/*     */     //   29: l2i
/*     */     //   30: istore #9
/*     */     //   32: dup2
/*     */     //   33: bipush #48
/*     */     //   35: lshl
/*     */     //   36: bipush #48
/*     */     //   38: lushr
/*     */     //   39: l2i
/*     */     //   40: istore #10
/*     */     //   42: pop2
/*     */     //   43: dup2
/*     */     //   44: ldc2_w 76847798411987
/*     */     //   47: lxor
/*     */     //   48: dup2
/*     */     //   49: bipush #16
/*     */     //   51: lushr
/*     */     //   52: lstore #11
/*     */     //   54: dup2
/*     */     //   55: bipush #48
/*     */     //   57: lshl
/*     */     //   58: bipush #48
/*     */     //   60: lushr
/*     */     //   61: l2i
/*     */     //   62: istore #13
/*     */     //   64: pop2
/*     */     //   65: pop2
/*     */     //   66: ldc2_w -1188806066486663652
/*     */     //   69: lload #6
/*     */     //   71: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*     */     //   76: astore #19
/*     */     //   78: dload_0
/*     */     //   79: dload_2
/*     */     //   80: aload #19
/*     */     //   82: ifnonnull -> 140
/*     */     //   85: iconst_1
/*     */     //   86: istore #14
/*     */     //   88: dstore #15
/*     */     //   90: dstore #17
/*     */     //   92: iload #8
/*     */     //   94: iload #9
/*     */     //   96: i2c
/*     */     //   97: dload #17
/*     */     //   99: dload #15
/*     */     //   101: iload #10
/*     */     //   103: i2s
/*     */     //   104: iload #14
/*     */     //   106: invokestatic a : (ICDDSI)Z
/*     */     //   109: lload #6
/*     */     //   111: lconst_0
/*     */     //   112: lcmp
/*     */     //   113: ifle -> 120
/*     */     //   116: ifeq -> 132
/*     */     //   119: iconst_1
/*     */     //   120: ireturn
/*     */     //   121: ldc2_w -1156948480112018939
/*     */     //   124: lload #6
/*     */     //   126: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   131: athrow
/*     */     //   132: dload_0
/*     */     //   133: invokestatic z : (D)D
/*     */     //   136: dload_2
/*     */     //   137: invokestatic z : (D)D
/*     */     //   140: dstore #14
/*     */     //   142: dstore #16
/*     */     //   144: lload #11
/*     */     //   146: dload #16
/*     */     //   148: iload #13
/*     */     //   150: i2c
/*     */     //   151: dload #14
/*     */     //   153: invokestatic i : (JDCD)D
/*     */     //   156: dstore #20
/*     */     //   158: dload_0
/*     */     //   159: dload_2
/*     */     //   160: dsub
/*     */     //   161: dload #20
/*     */     //   163: ddiv
/*     */     //   164: invokestatic z : (D)D
/*     */     //   167: dstore #22
/*     */     //   169: dload #22
/*     */     //   171: dload #4
/*     */     //   173: dcmpg
/*     */     //   174: aload #19
/*     */     //   176: ifnonnull -> 197
/*     */     //   179: ifgt -> 200
/*     */     //   182: goto -> 196
/*     */     //   185: ldc2_w -1156948480112018939
/*     */     //   188: lload #6
/*     */     //   190: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   195: athrow
/*     */     //   196: iconst_1
/*     */     //   197: goto -> 201
/*     */     //   200: iconst_0
/*     */     //   201: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #96	-> 78
/*     */     //   #133	-> 119
/*     */     //   #64	-> 132
/*     */     //   #72	-> 158
/*     */     //   #54	-> 169
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   92	121	121	java/lang/NumberFormatException
/*     */     //   169	182	185	java/lang/NumberFormatException
/*     */   }
/*     */   
/*     */   public static boolean a(float paramFloat1, short paramShort, float paramFloat2, int paramInt1, int paramInt2, char paramChar) {
/*     */     // Byte code:
/*     */     //   0: iload_1
/*     */     //   1: i2l
/*     */     //   2: bipush #48
/*     */     //   4: lshl
/*     */     //   5: iload #4
/*     */     //   7: i2l
/*     */     //   8: bipush #32
/*     */     //   10: lshl
/*     */     //   11: bipush #16
/*     */     //   13: lushr
/*     */     //   14: lor
/*     */     //   15: iload #5
/*     */     //   17: i2l
/*     */     //   18: bipush #48
/*     */     //   20: lshl
/*     */     //   21: bipush #48
/*     */     //   23: lushr
/*     */     //   24: lor
/*     */     //   25: getstatic aacinternal/q.q : J
/*     */     //   28: lxor
/*     */     //   29: lstore #6
/*     */     //   31: lload #6
/*     */     //   33: dup2
/*     */     //   34: ldc2_w 21841494851551
/*     */     //   37: lxor
/*     */     //   38: lstore #8
/*     */     //   40: pop2
/*     */     //   41: ldc2_w 6625280691987812973
/*     */     //   44: lload #6
/*     */     //   46: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*     */     //   51: astore #10
/*     */     //   53: fload_0
/*     */     //   54: fload_0
/*     */     //   55: fcmpl
/*     */     //   56: aload #10
/*     */     //   58: ifnonnull -> 134
/*     */     //   61: ifne -> 117
/*     */     //   64: goto -> 78
/*     */     //   67: ldc2_w 6593423773355282036
/*     */     //   70: lload #6
/*     */     //   72: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   77: athrow
/*     */     //   78: fload_2
/*     */     //   79: fload_2
/*     */     //   80: aload #10
/*     */     //   82: ifnonnull -> 235
/*     */     //   85: goto -> 99
/*     */     //   88: ldc2_w 6593423773355282036
/*     */     //   91: lload #6
/*     */     //   93: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   98: athrow
/*     */     //   99: fcmpl
/*     */     //   100: ifeq -> 233
/*     */     //   103: goto -> 117
/*     */     //   106: ldc2_w 6593423773355282036
/*     */     //   109: lload #6
/*     */     //   111: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   116: athrow
/*     */     //   117: fload_0
/*     */     //   118: fload_0
/*     */     //   119: fcmpl
/*     */     //   120: goto -> 134
/*     */     //   123: ldc2_w 6593423773355282036
/*     */     //   126: lload #6
/*     */     //   128: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   133: athrow
/*     */     //   134: aload #10
/*     */     //   136: ifnonnull -> 157
/*     */     //   139: ifeq -> 160
/*     */     //   142: goto -> 156
/*     */     //   145: ldc2_w 6593423773355282036
/*     */     //   148: lload #6
/*     */     //   150: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   155: athrow
/*     */     //   156: iconst_1
/*     */     //   157: goto -> 161
/*     */     //   160: iconst_0
/*     */     //   161: fload_2
/*     */     //   162: fload_2
/*     */     //   163: fcmpl
/*     */     //   164: aload #10
/*     */     //   166: ifnonnull -> 187
/*     */     //   169: ifeq -> 190
/*     */     //   172: goto -> 186
/*     */     //   175: ldc2_w 6593423773355282036
/*     */     //   178: lload #6
/*     */     //   180: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   185: athrow
/*     */     //   186: iconst_1
/*     */     //   187: goto -> 191
/*     */     //   190: iconst_0
/*     */     //   191: ixor
/*     */     //   192: aload #10
/*     */     //   194: ifnonnull -> 230
/*     */     //   197: ifne -> 229
/*     */     //   200: goto -> 214
/*     */     //   203: ldc2_w 6593423773355282036
/*     */     //   206: lload #6
/*     */     //   208: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   213: athrow
/*     */     //   214: iconst_1
/*     */     //   215: goto -> 243
/*     */     //   218: ldc2_w 6593423773355282036
/*     */     //   221: lload #6
/*     */     //   223: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   228: athrow
/*     */     //   229: iconst_0
/*     */     //   230: goto -> 243
/*     */     //   233: fload_0
/*     */     //   234: fload_2
/*     */     //   235: iload_3
/*     */     //   236: lload #8
/*     */     //   238: dup2_x2
/*     */     //   239: pop2
/*     */     //   240: invokestatic b : (FJFI)Z
/*     */     //   243: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #97	-> 53
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   53	64	67	java/lang/NumberFormatException
/*     */     //   61	85	88	java/lang/NumberFormatException
/*     */     //   78	103	106	java/lang/NumberFormatException
/*     */     //   99	120	123	java/lang/NumberFormatException
/*     */     //   134	142	145	java/lang/NumberFormatException
/*     */     //   161	172	175	java/lang/NumberFormatException
/*     */     //   191	200	203	java/lang/NumberFormatException
/*     */     //   197	218	218	java/lang/NumberFormatException
/*     */   }
/*     */   
/*     */   public static boolean a(long paramLong, float paramFloat1, float paramFloat2, float paramFloat3) {
/*     */     // Byte code:
/*     */     //   0: getstatic aacinternal/q.q : J
/*     */     //   3: lload_0
/*     */     //   4: lxor
/*     */     //   5: lstore_0
/*     */     //   6: lload_0
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 13592660239038
/*     */     //   11: lxor
/*     */     //   12: lstore #5
/*     */     //   14: pop2
/*     */     //   15: ldc2_w -8750311357601689844
/*     */     //   18: lload_0
/*     */     //   19: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*     */     //   24: astore #7
/*     */     //   26: fload_2
/*     */     //   27: lload #5
/*     */     //   29: fload_3
/*     */     //   30: iconst_1
/*     */     //   31: invokestatic b : (FJFI)Z
/*     */     //   34: aload #7
/*     */     //   36: ifnonnull -> 99
/*     */     //   39: ifne -> 98
/*     */     //   42: goto -> 55
/*     */     //   45: ldc2_w -8727531339897580779
/*     */     //   48: lload_0
/*     */     //   49: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   54: athrow
/*     */     //   55: fload_3
/*     */     //   56: fload_2
/*     */     //   57: fsub
/*     */     //   58: invokestatic a : (F)F
/*     */     //   61: fload #4
/*     */     //   63: fcmpg
/*     */     //   64: aload #7
/*     */     //   66: ifnonnull -> 99
/*     */     //   69: goto -> 82
/*     */     //   72: ldc2_w -8727531339897580779
/*     */     //   75: lload_0
/*     */     //   76: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   81: athrow
/*     */     //   82: ifgt -> 102
/*     */     //   85: goto -> 98
/*     */     //   88: ldc2_w -8727531339897580779
/*     */     //   91: lload_0
/*     */     //   92: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   97: athrow
/*     */     //   98: iconst_1
/*     */     //   99: goto -> 103
/*     */     //   102: iconst_0
/*     */     //   103: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #105	-> 26
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   26	42	45	java/lang/NumberFormatException
/*     */     //   39	69	72	java/lang/NumberFormatException
/*     */     //   55	85	88	java/lang/NumberFormatException
/*     */   }
/*     */   
/*     */   static {
/*     */     long l;
/*     */     byte b1;
/*     */     for (q = nc.a(1425460495464899814L, -4039594971929357376L, MethodHandles.lookup().lookupClass()).a(59426256667312L), t = new HashMap<>(13), l = q ^ 0x7F9B1355011BL, "ꬖ낥翲糾뭈醓᜴畂群谿䓴낣꣹玐悚㺔⦓".toCharArray()[9] = (char)("ꬖ낥翲糾뭈醓᜴畂群谿䓴낣꣹玐悚㺔⦓".toCharArray()[9] ^ 0x5BF6), "䓬힫읢⢔".toCharArray()[2] = (char)("䓬힫읢⢔".toCharArray()[2] ^ 0x6039), (new byte[8])[0] = (byte)(int)(l >>> 56L), b1 = 1; b1 < 8; ) {
/*     */       (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L);
/*     */       b1++;
/*     */     } 
/*     */     Cipher cipher;
/*     */     (cipher = Cipher.getInstance(aB$aG.q("ꬖ낥翲糾뭈醓᜴畂群谿䓴낣꣹玐悚㺔⦓".toCharArray(), (short)10454, (byte)5, (byte)1))).init(2, SecretKeyFactory.getInstance(aB$aG.q("䓬힫읢⢔".toCharArray(), (short)19769, (byte)4, (byte)2)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*     */     String[] arrayOfString = new String[8];
/*     */     boolean bool = false;
/*     */     "乍霣Φ㉍뗭鎭砱䮽餪욤툤?ɶ痔툭蓔➖ꎀ첻엧ꊘ鑴뜏䓰⶟엚쑏尶쒞፵⣑㼬뻦ꌍ珂铺㾿꬇䉛뷄꘱殸僄ꃢ☴䚬?嚯?몛ꪸ팊屮픽䏯뾿ྟ霳㗷썎ᜍ髫尾릦긹읮ꦢ徒蟶쮗ᔣ?刨鼄Ỡ勩㬷뺽ꐴ헲㊮천瑢紜鴸䧢쑢痩?曡΅攘녷闫怨鯉ޜﴣ심긳ꗢ栏腕ꪚ䧝Ꞣ꺔࡛甭琉銚ﻒ祯屙（疚㓽濐⟕Ι?㗋宂⟜幟龥̹揂Ӏ煍庺ꛏ透?໮ᅶ鍀왜ﮈ瘼ꇿ薝螟ꖑ㥸Ⓨᒍ琱빱➏懮蚦腼믠쩏킩梠﯎櫾矖퇧赯筹榊ཀྵ標悖曕裃嚥劳䄲쑉壔欸蕼諌ҾܪZ⦶㥿헲䤊".toCharArray()[8] = (char)("乍霣Φ㉍뗭鎭砱䮽餪욤툤?ɶ痔툭蓔➖ꎀ첻엧ꊘ鑴뜏䓰⶟엚쑏尶쒞፵⣑㼬뻦ꌍ珂铺㾿꬇䉛뷄꘱殸僄ꃢ☴䚬?嚯?몛ꪸ팊屮픽䏯뾿ྟ霳㗷썎ᜍ髫尾릦긹읮ꦢ徒蟶쮗ᔣ?刨鼄Ỡ勩㬷뺽ꐴ헲㊮천瑢紜鴸䧢쑢痩?曡΅攘녷闫怨鯉ޜﴣ심긳ꗢ栏腕ꪚ䧝Ꞣ꺔࡛甭琉銚ﻒ祯屙（疚㓽濐⟕Ι?㗋宂⟜幟龥̹揂Ӏ煍庺ꛏ透?໮ᅶ鍀왜ﮈ瘼ꇿ薝螟ꖑ㥸Ⓨᒍ琱빱➏懮蚦腼믠쩏킩梠﯎櫾矖퇧赯筹榊ཀྵ標悖曕裃嚥劳䄲쑉壔欸蕼諌ҾܪZ⦶㥿헲䤊".toCharArray()[8] ^ 0x5D46);
/*     */     String str;
/*     */     int i = (str = aB$aG.q("乍霣Φ㉍뗭鎭砱䮽餪욤툤?ɶ痔툭蓔➖ꎀ첻엧ꊘ鑴뜏䓰⶟엚쑏尶쒞፵⣑㼬뻦ꌍ珂铺㾿꬇䉛뷄꘱殸僄ꃢ☴䚬?嚯?몛ꪸ팊屮픽䏯뾿ྟ霳㗷썎ᜍ髫尾릦긹읮ꦢ徒蟶쮗ᔣ?刨鼄Ỡ勩㬷뺽ꐴ헲㊮천瑢紜鴸䧢쑢痩?曡΅攘녷闫怨鯉ޜﴣ심긳ꗢ栏腕ꪚ䧝Ꞣ꺔࡛甭琉銚ﻒ祯屙（疚㓽濐⟕Ι?㗋宂⟜幟龥̹揂Ӏ煍庺ꛏ透?໮ᅶ鍀왜ﮈ瘼ꇿ薝螟ꖑ㥸Ⓨᒍ琱빱➏懮蚦腼믠쩏킩梠﯎櫾矖퇧赯筹榊ཀྵ標悖曕裃嚥劳䄲쑉壔欸蕼諌ҾܪZ⦶㥿헲䤊".toCharArray(), (short)479, (byte)4, (byte)4)).length();
/*     */     byte b2 = 32;
/*     */     byte b = -1;
/*     */     while (true);
/*     */   }
/*     */   
/*     */   public static boolean c(double paramDouble1, double paramDouble2, double paramDouble3, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic aacinternal/q.q : J
/*     */     //   3: lload #6
/*     */     //   5: lxor
/*     */     //   6: lstore #6
/*     */     //   8: lload #6
/*     */     //   10: dup2
/*     */     //   11: ldc2_w 7758361011750
/*     */     //   14: lxor
/*     */     //   15: dup2
/*     */     //   16: bipush #32
/*     */     //   18: lushr
/*     */     //   19: l2i
/*     */     //   20: istore #8
/*     */     //   22: dup2
/*     */     //   23: bipush #32
/*     */     //   25: lshl
/*     */     //   26: bipush #48
/*     */     //   28: lushr
/*     */     //   29: l2i
/*     */     //   30: istore #9
/*     */     //   32: dup2
/*     */     //   33: bipush #48
/*     */     //   35: lshl
/*     */     //   36: bipush #48
/*     */     //   38: lushr
/*     */     //   39: l2i
/*     */     //   40: istore #10
/*     */     //   42: pop2
/*     */     //   43: pop2
/*     */     //   44: ldc2_w 1695018205513539097
/*     */     //   47: lload #6
/*     */     //   49: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*     */     //   54: astore #11
/*     */     //   56: iload #8
/*     */     //   58: iload #9
/*     */     //   60: i2c
/*     */     //   61: dload_0
/*     */     //   62: dload_2
/*     */     //   63: iload #10
/*     */     //   65: i2s
/*     */     //   66: iconst_1
/*     */     //   67: invokestatic a : (ICDDSI)Z
/*     */     //   70: aload #11
/*     */     //   72: ifnonnull -> 138
/*     */     //   75: ifne -> 137
/*     */     //   78: goto -> 92
/*     */     //   81: ldc2_w 1726242331481424384
/*     */     //   84: lload #6
/*     */     //   86: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   91: athrow
/*     */     //   92: dload_2
/*     */     //   93: dload_0
/*     */     //   94: dsub
/*     */     //   95: invokestatic z : (D)D
/*     */     //   98: dload #4
/*     */     //   100: dcmpg
/*     */     //   101: aload #11
/*     */     //   103: ifnonnull -> 138
/*     */     //   106: goto -> 120
/*     */     //   109: ldc2_w 1726242331481424384
/*     */     //   112: lload #6
/*     */     //   114: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   119: athrow
/*     */     //   120: ifgt -> 141
/*     */     //   123: goto -> 137
/*     */     //   126: ldc2_w 1726242331481424384
/*     */     //   129: lload #6
/*     */     //   131: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   136: athrow
/*     */     //   137: iconst_1
/*     */     //   138: goto -> 142
/*     */     //   141: iconst_0
/*     */     //   142: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #110	-> 56
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   56	78	81	java/lang/NumberFormatException
/*     */     //   75	106	109	java/lang/NumberFormatException
/*     */     //   92	123	126	java/lang/NumberFormatException
/*     */   }
/*     */   
/*     */   public static int a(double paramDouble1, double paramDouble2, short paramShort, double paramDouble3, char paramChar, int paramInt) {
/*     */     // Byte code:
/*     */     //   0: iload #4
/*     */     //   2: i2l
/*     */     //   3: bipush #48
/*     */     //   5: lshl
/*     */     //   6: iload #7
/*     */     //   8: i2l
/*     */     //   9: bipush #48
/*     */     //   11: lshl
/*     */     //   12: bipush #16
/*     */     //   14: lushr
/*     */     //   15: lor
/*     */     //   16: iload #8
/*     */     //   18: i2l
/*     */     //   19: bipush #32
/*     */     //   21: lshl
/*     */     //   22: bipush #32
/*     */     //   24: lushr
/*     */     //   25: lor
/*     */     //   26: getstatic aacinternal/q.q : J
/*     */     //   29: lxor
/*     */     //   30: lstore #9
/*     */     //   32: lload #9
/*     */     //   34: dup2
/*     */     //   35: ldc2_w 114966433903632
/*     */     //   38: lxor
/*     */     //   39: lstore #11
/*     */     //   41: pop2
/*     */     //   42: ldc2_w -5169087078432706081
/*     */     //   45: lload #9
/*     */     //   47: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*     */     //   52: astore #13
/*     */     //   54: dload_0
/*     */     //   55: dload_2
/*     */     //   56: dload #5
/*     */     //   58: lload #11
/*     */     //   60: invokestatic c : (DDDJ)Z
/*     */     //   63: aload #13
/*     */     //   65: ifnonnull -> 101
/*     */     //   68: ifeq -> 98
/*     */     //   71: goto -> 85
/*     */     //   74: ldc2_w -5173926913488327226
/*     */     //   77: lload #9
/*     */     //   79: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   84: athrow
/*     */     //   85: iconst_0
/*     */     //   86: ireturn
/*     */     //   87: ldc2_w -5173926913488327226
/*     */     //   90: lload #9
/*     */     //   92: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   97: athrow
/*     */     //   98: dload_0
/*     */     //   99: dload_2
/*     */     //   100: dcmpg
/*     */     //   101: aload #13
/*     */     //   103: ifnonnull -> 137
/*     */     //   106: ifge -> 136
/*     */     //   109: goto -> 123
/*     */     //   112: ldc2_w -5173926913488327226
/*     */     //   115: lload #9
/*     */     //   117: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   122: athrow
/*     */     //   123: iconst_m1
/*     */     //   124: ireturn
/*     */     //   125: ldc2_w -5173926913488327226
/*     */     //   128: lload #9
/*     */     //   130: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   135: athrow
/*     */     //   136: iconst_1
/*     */     //   137: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #117	-> 54
/*     */     //   #74	-> 85
/*     */     //   #112	-> 98
/*     */     //   #79	-> 123
/*     */     //   #12	-> 136
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   54	71	74	java/lang/NumberFormatException
/*     */     //   68	87	87	java/lang/NumberFormatException
/*     */     //   101	109	112	java/lang/NumberFormatException
/*     */     //   106	125	125	java/lang/NumberFormatException
/*     */   }
/*     */   
/*     */   public static boolean a(double paramDouble, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic aacinternal/q.q : J
/*     */     //   3: lload_2
/*     */     //   4: lxor
/*     */     //   5: lstore_2
/*     */     //   6: lload_2
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 85429478343448
/*     */     //   11: lxor
/*     */     //   12: lstore #4
/*     */     //   14: dup2
/*     */     //   15: ldc2_w 138364045218118
/*     */     //   18: lxor
/*     */     //   19: lstore #6
/*     */     //   21: pop2
/*     */     //   22: ldc2_w 7115961088457321308
/*     */     //   25: lload_2
/*     */     //   26: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*     */     //   31: dload_0
/*     */     //   32: invokestatic doubleToRawLongBits : (D)J
/*     */     //   35: lstore #9
/*     */     //   37: lload #9
/*     */     //   39: ldc2_w 9218868437227405312
/*     */     //   42: land
/*     */     //   43: bipush #52
/*     */     //   45: lshr
/*     */     //   46: l2i
/*     */     //   47: istore #11
/*     */     //   49: astore #8
/*     */     //   51: iload #11
/*     */     //   53: aload #8
/*     */     //   55: ifnonnull -> 91
/*     */     //   58: sipush #2047
/*     */     //   61: if_icmpne -> 92
/*     */     //   64: goto -> 77
/*     */     //   67: ldc2_w 7111688189462787909
/*     */     //   70: lload_2
/*     */     //   71: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   76: athrow
/*     */     //   77: iconst_0
/*     */     //   78: goto -> 91
/*     */     //   81: ldc2_w 7111688189462787909
/*     */     //   84: lload_2
/*     */     //   85: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   90: athrow
/*     */     //   91: ireturn
/*     */     //   92: lload #9
/*     */     //   94: ldc2_w 4503599627370495
/*     */     //   97: land
/*     */     //   98: lstore #12
/*     */     //   100: iload #11
/*     */     //   102: ifle -> 124
/*     */     //   105: ldc2_w 4503599627370496
/*     */     //   108: lload #12
/*     */     //   110: lor
/*     */     //   111: goto -> 126
/*     */     //   114: ldc2_w 7111688189462787909
/*     */     //   117: lload_2
/*     */     //   118: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   123: athrow
/*     */     //   124: lload #12
/*     */     //   126: lstore #14
/*     */     //   128: ldc2_w 9007199254740991
/*     */     //   131: lload #6
/*     */     //   133: bipush #53
/*     */     //   135: iconst_0
/*     */     //   136: iload #11
/*     */     //   138: sipush #1022
/*     */     //   141: isub
/*     */     //   142: lload #4
/*     */     //   144: invokestatic b : (IIJ)I
/*     */     //   147: invokestatic f : (JII)I
/*     */     //   150: lshr
/*     */     //   151: lstore #16
/*     */     //   153: lload #14
/*     */     //   155: lload #16
/*     */     //   157: land
/*     */     //   158: lconst_0
/*     */     //   159: lcmp
/*     */     //   160: aload #8
/*     */     //   162: ifnonnull -> 182
/*     */     //   165: ifne -> 185
/*     */     //   168: goto -> 181
/*     */     //   171: ldc2_w 7111688189462787909
/*     */     //   174: lload_2
/*     */     //   175: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   180: athrow
/*     */     //   181: iconst_1
/*     */     //   182: goto -> 186
/*     */     //   185: iconst_0
/*     */     //   186: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #131	-> 31
/*     */     //   #5	-> 37
/*     */     //   #17	-> 51
/*     */     //   #73	-> 77
/*     */     //   #123	-> 92
/*     */     //   #119	-> 100
/*     */     //   #15	-> 128
/*     */     //   #56	-> 153
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   51	64	67	java/lang/NumberFormatException
/*     */     //   58	78	81	java/lang/NumberFormatException
/*     */     //   100	114	114	java/lang/NumberFormatException
/*     */     //   153	168	171	java/lang/NumberFormatException
/*     */   }
/*     */   
/*     */   public static boolean b(long paramLong, double paramDouble1, double paramDouble2) {
/*     */     // Byte code:
/*     */     //   0: getstatic aacinternal/q.q : J
/*     */     //   3: lload_0
/*     */     //   4: lxor
/*     */     //   5: lstore_0
/*     */     //   6: lload_0
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 7669342410539
/*     */     //   11: lxor
/*     */     //   12: dup2
/*     */     //   13: bipush #32
/*     */     //   15: lushr
/*     */     //   16: l2i
/*     */     //   17: istore #6
/*     */     //   19: dup2
/*     */     //   20: bipush #32
/*     */     //   22: lshl
/*     */     //   23: bipush #48
/*     */     //   25: lushr
/*     */     //   26: l2i
/*     */     //   27: istore #7
/*     */     //   29: dup2
/*     */     //   30: bipush #48
/*     */     //   32: lshl
/*     */     //   33: bipush #48
/*     */     //   35: lushr
/*     */     //   36: l2i
/*     */     //   37: istore #8
/*     */     //   39: pop2
/*     */     //   40: pop2
/*     */     //   41: ldc2_w 2776728534779981588
/*     */     //   44: lload_0
/*     */     //   45: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*     */     //   50: astore #14
/*     */     //   52: dload_2
/*     */     //   53: dload_2
/*     */     //   54: dcmpl
/*     */     //   55: aload #14
/*     */     //   57: ifnonnull -> 131
/*     */     //   60: ifne -> 115
/*     */     //   63: goto -> 76
/*     */     //   66: ldc2_w 2808515222342824717
/*     */     //   69: lload_0
/*     */     //   70: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   75: athrow
/*     */     //   76: dload #4
/*     */     //   78: dload #4
/*     */     //   80: aload #14
/*     */     //   82: ifnonnull -> 231
/*     */     //   85: goto -> 98
/*     */     //   88: ldc2_w 2808515222342824717
/*     */     //   91: lload_0
/*     */     //   92: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   97: athrow
/*     */     //   98: dcmpl
/*     */     //   99: ifeq -> 228
/*     */     //   102: goto -> 115
/*     */     //   105: ldc2_w 2808515222342824717
/*     */     //   108: lload_0
/*     */     //   109: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   114: athrow
/*     */     //   115: dload_2
/*     */     //   116: dload_2
/*     */     //   117: dcmpl
/*     */     //   118: goto -> 131
/*     */     //   121: ldc2_w 2808515222342824717
/*     */     //   124: lload_0
/*     */     //   125: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   130: athrow
/*     */     //   131: aload #14
/*     */     //   133: ifnonnull -> 153
/*     */     //   136: ifeq -> 156
/*     */     //   139: goto -> 152
/*     */     //   142: ldc2_w 2808515222342824717
/*     */     //   145: lload_0
/*     */     //   146: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   151: athrow
/*     */     //   152: iconst_1
/*     */     //   153: goto -> 157
/*     */     //   156: iconst_0
/*     */     //   157: dload #4
/*     */     //   159: dload #4
/*     */     //   161: dcmpl
/*     */     //   162: aload #14
/*     */     //   164: ifnonnull -> 184
/*     */     //   167: ifeq -> 187
/*     */     //   170: goto -> 183
/*     */     //   173: ldc2_w 2808515222342824717
/*     */     //   176: lload_0
/*     */     //   177: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   182: athrow
/*     */     //   183: iconst_1
/*     */     //   184: goto -> 188
/*     */     //   187: iconst_0
/*     */     //   188: ixor
/*     */     //   189: aload #14
/*     */     //   191: ifnonnull -> 225
/*     */     //   194: ifne -> 224
/*     */     //   197: goto -> 210
/*     */     //   200: ldc2_w 2808515222342824717
/*     */     //   203: lload_0
/*     */     //   204: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   209: athrow
/*     */     //   210: iconst_1
/*     */     //   211: goto -> 255
/*     */     //   214: ldc2_w 2808515222342824717
/*     */     //   217: lload_0
/*     */     //   218: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*     */     //   223: athrow
/*     */     //   224: iconst_0
/*     */     //   225: goto -> 255
/*     */     //   228: dload_2
/*     */     //   229: dload #4
/*     */     //   231: iconst_1
/*     */     //   232: istore #9
/*     */     //   234: dstore #10
/*     */     //   236: dstore #12
/*     */     //   238: iload #6
/*     */     //   240: iload #7
/*     */     //   242: i2c
/*     */     //   243: dload #12
/*     */     //   245: dload #10
/*     */     //   247: iload #8
/*     */     //   249: i2s
/*     */     //   250: iload #9
/*     */     //   252: invokestatic a : (ICDDSI)Z
/*     */     //   255: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #136	-> 52
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   52	63	66	java/lang/NumberFormatException
/*     */     //   60	85	88	java/lang/NumberFormatException
/*     */     //   76	102	105	java/lang/NumberFormatException
/*     */     //   98	118	121	java/lang/NumberFormatException
/*     */     //   131	139	142	java/lang/NumberFormatException
/*     */     //   157	170	173	java/lang/NumberFormatException
/*     */     //   188	197	200	java/lang/NumberFormatException
/*     */     //   194	214	214	java/lang/NumberFormatException
/*     */   }
/*     */   
/*     */   private static RuntimeException a(RuntimeException paramRuntimeException) {
/*     */     return paramRuntimeException;
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
/*     */     int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x3C36;
/*     */     if (s[i] == null) {
/*     */       Object[] arrayOfObject;
/*     */       try {
/*     */         Long long_ = Long.valueOf(Thread.currentThread().getId());
/*     */         arrayOfObject = (Object[])t.get(long_);
/*     */         if (arrayOfObject == null) {
/*     */           arrayOfObject = new Object[3];
/*     */           "狔ꬍ蜮턬ࡩ娿뇏툔蚌먥턻羺緢傲껫?쬴ᜄ࿐".toCharArray()[10] = (char)("狔ꬍ蜮턬ࡩ娿뇏툔蚌먥턻羺緢傲껫?쬴ᜄ࿐".toCharArray()[10] ^ 0xDD2);
/*     */           arrayOfObject[0] = Cipher.getInstance(D$X.L("狔ꬍ蜮턬ࡩ娿뇏툔蚌먥턻羺緢傲껫?쬴ᜄ࿐".toCharArray(), (short)24288, (byte)4, true));
/*     */           "屝쉊՜亍".toCharArray()[0] = (char)("屝쉊՜亍".toCharArray()[0] ^ 0x624E);
/*     */           arrayOfObject[1] = SecretKeyFactory.getInstance(D$X.L("屝쉊՜亍".toCharArray(), (short)32343, (byte)1, false));
/*     */           arrayOfObject[2] = new IvParameterSpec(new byte[8]);
/*     */           t.put(long_, arrayOfObject);
/*     */         } 
/*     */       } catch (Exception exception) {
/*     */         "ፚ佶츾輜甊籃ᜎԏ왋ᴚ善翀䕹".toCharArray()[3] = (char)("ፚ佶츾輜甊籃ᜎԏ왋ᴚ善翀䕹".toCharArray()[3] ^ 0x2844);
/*     */         throw new RuntimeException(D$X.L("ፚ佶츾輜甊籃ᜎԏ왋ᴚ善翀䕹".toCharArray(), (short)3186, (byte)4, true), exception);
/*     */       } 
/*     */       byte[] arrayOfByte1 = new byte[8];
/*     */       arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
/*     */       for (byte b = 1; b < 8; b++)
/*     */         arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
/*     */       DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
/*     */       SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
/*     */       ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
/*     */       "?놗ㅃ뱂帼窗贈谘ᣔ㪒續".toCharArray()[9] = (char)("?놗ㅃ뱂帼窗贈谘ᣔ㪒續".toCharArray()[9] ^ 0x6B36);
/*     */       byte[] arrayOfByte2 = r[i].getBytes(D$X.L("?놗ㅃ뱂帼窗贈谘ᣔ㪒續".toCharArray(), (short)13559, (byte)3, false));
/*     */       s[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
/*     */     } 
/*     */     return s[i];
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
/*     */     //   66: ldc_w '뼑贚솗䇛䩱疄⽯ぴ惉櫘㩣'
/*     */     //   69: invokevirtual toCharArray : ()[C
/*     */     //   72: dup
/*     */     //   73: dup
/*     */     //   74: bipush #12
/*     */     //   76: dup_x1
/*     */     //   77: caload
/*     */     //   78: sipush #4046
/*     */     //   81: ixor
/*     */     //   82: i2c
/*     */     //   83: castore
/*     */     //   84: sipush #14945
/*     */     //   87: iconst_4
/*     */     //   88: iconst_0
/*     */     //   89: invokestatic L : (Ljava/lang/Object;SBZ)Ljava/lang/String;
/*     */     //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   95: ldc_w '䳷ⱞ鮰刬'
/*     */     //   98: invokevirtual toCharArray : ()[C
/*     */     //   101: dup
/*     */     //   102: dup
/*     */     //   103: iconst_1
/*     */     //   104: dup_x1
/*     */     //   105: caload
/*     */     //   106: sipush #24167
/*     */     //   109: ixor
/*     */     //   110: i2c
/*     */     //   111: castore
/*     */     //   112: sipush #19925
/*     */     //   115: iconst_0
/*     */     //   116: iconst_1
/*     */     //   117: invokestatic L : (Ljava/lang/Object;SBZ)Ljava/lang/String;
/*     */     //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   123: aload_1
/*     */     //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   127: ldc_w '粩螨錌矄'
/*     */     //   130: invokevirtual toCharArray : ()[C
/*     */     //   133: dup
/*     */     //   134: dup
/*     */     //   135: iconst_1
/*     */     //   136: dup_x1
/*     */     //   137: caload
/*     */     //   138: sipush #21983
/*     */     //   141: ixor
/*     */     //   142: i2c
/*     */     //   143: castore
/*     */     //   144: sipush #2240
/*     */     //   147: iconst_2
/*     */     //   148: iconst_1
/*     */     //   149: invokestatic L : (Ljava/lang/Object;SBZ)Ljava/lang/String;
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
/*     */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */