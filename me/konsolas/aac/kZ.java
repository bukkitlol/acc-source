/*     */ package me.konsolas.aac;
/*     */ 
/*     */ import aacinternal.v;
/*     */ import java.lang.invoke.MethodHandles;
/*     */ import java.util.Collection;
/*     */ import org.bukkit.Location;
/*     */ import org.bukkit.util.Vector;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class kz
/*     */ {
/*     */   private static final Vector c;
/*     */   private final kP b;
/*     */   private final lq a;
/*     */   
/*     */   public Vector a(gb paramgb, long paramLong, h8 paramh8, ci paramci, mZ parammZ, N paramN, double paramDouble) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/kz.d : J
/*     */     //   3: lload_2
/*     */     //   4: lxor
/*     */     //   5: lstore_2
/*     */     //   6: lload_2
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 29725220165120
/*     */     //   11: lxor
/*     */     //   12: lstore #10
/*     */     //   14: dup2
/*     */     //   15: ldc2_w 62653010360809
/*     */     //   18: lxor
/*     */     //   19: lstore #12
/*     */     //   21: dup2
/*     */     //   22: ldc2_w 68369448812920
/*     */     //   25: lxor
/*     */     //   26: lstore #14
/*     */     //   28: dup2
/*     */     //   29: ldc2_w 67369463734785
/*     */     //   32: lxor
/*     */     //   33: dup2
/*     */     //   34: bipush #48
/*     */     //   36: lushr
/*     */     //   37: l2i
/*     */     //   38: istore #16
/*     */     //   40: dup2
/*     */     //   41: bipush #16
/*     */     //   43: lshl
/*     */     //   44: bipush #32
/*     */     //   46: lushr
/*     */     //   47: l2i
/*     */     //   48: istore #17
/*     */     //   50: dup2
/*     */     //   51: bipush #48
/*     */     //   53: lshl
/*     */     //   54: bipush #48
/*     */     //   56: lushr
/*     */     //   57: l2i
/*     */     //   58: istore #18
/*     */     //   60: pop2
/*     */     //   61: pop2
/*     */     //   62: ldc2_w -3429419273132859795
/*     */     //   65: lload_2
/*     */     //   66: <illegal opcode> w : (JJ)I
/*     */     //   71: istore #19
/*     */     //   73: aload #7
/*     */     //   75: iload #19
/*     */     //   77: ifne -> 2150
/*     */     //   80: ifnonnull -> 2135
/*     */     //   83: goto -> 96
/*     */     //   86: ldc2_w -3428210965521191065
/*     */     //   89: lload_2
/*     */     //   90: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   95: athrow
/*     */     //   96: aload #5
/*     */     //   98: invokevirtual a : ()Lme/konsolas/aac/cJ;
/*     */     //   101: invokevirtual a : ()Lorg/bukkit/util/Vector;
/*     */     //   104: invokevirtual clone : ()Lorg/bukkit/util/Vector;
/*     */     //   107: astore #20
/*     */     //   109: aload #20
/*     */     //   111: invokevirtual getY : ()D
/*     */     //   114: dstore #21
/*     */     //   116: aload_1
/*     */     //   117: invokeinterface g : ()Z
/*     */     //   122: iload #19
/*     */     //   124: lload_2
/*     */     //   125: lconst_0
/*     */     //   126: lcmp
/*     */     //   127: ifle -> 200
/*     */     //   130: ifne -> 198
/*     */     //   133: ifeq -> 192
/*     */     //   136: goto -> 149
/*     */     //   139: ldc2_w -3428210965521191065
/*     */     //   142: lload_2
/*     */     //   143: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   148: athrow
/*     */     //   149: aload #20
/*     */     //   151: aload #20
/*     */     //   153: invokevirtual getX : ()D
/*     */     //   156: ldc2_w 0.4
/*     */     //   159: dmul
/*     */     //   160: invokevirtual setX : (D)Lorg/bukkit/util/Vector;
/*     */     //   163: pop
/*     */     //   164: aload #20
/*     */     //   166: aload #20
/*     */     //   168: invokevirtual getZ : ()D
/*     */     //   171: ldc2_w 0.4
/*     */     //   174: dmul
/*     */     //   175: invokevirtual setZ : (D)Lorg/bukkit/util/Vector;
/*     */     //   178: pop
/*     */     //   179: goto -> 192
/*     */     //   182: ldc2_w -3428210965521191065
/*     */     //   185: lload_2
/*     */     //   186: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   191: athrow
/*     */     //   192: aload_1
/*     */     //   193: invokeinterface b : ()I
/*     */     //   198: iload #19
/*     */     //   200: lload_2
/*     */     //   201: lconst_0
/*     */     //   202: lcmp
/*     */     //   203: ifle -> 276
/*     */     //   206: ifne -> 274
/*     */     //   209: ifle -> 268
/*     */     //   212: goto -> 225
/*     */     //   215: ldc2_w -3428210965521191065
/*     */     //   218: lload_2
/*     */     //   219: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   224: athrow
/*     */     //   225: ldc2_w 0.4
/*     */     //   228: aload_1
/*     */     //   229: invokeinterface b : ()I
/*     */     //   234: i2d
/*     */     //   235: invokestatic pow : (DD)D
/*     */     //   238: dstore #23
/*     */     //   240: aload #20
/*     */     //   242: aload #20
/*     */     //   244: invokevirtual getX : ()D
/*     */     //   247: dload #23
/*     */     //   249: dmul
/*     */     //   250: invokevirtual setX : (D)Lorg/bukkit/util/Vector;
/*     */     //   253: pop
/*     */     //   254: aload #20
/*     */     //   256: aload #20
/*     */     //   258: invokevirtual getZ : ()D
/*     */     //   261: dload #23
/*     */     //   263: dmul
/*     */     //   264: invokevirtual setZ : (D)Lorg/bukkit/util/Vector;
/*     */     //   267: pop
/*     */     //   268: aload_1
/*     */     //   269: invokeinterface s : ()Z
/*     */     //   274: iload #19
/*     */     //   276: ifne -> 501
/*     */     //   279: ifeq -> 495
/*     */     //   282: goto -> 295
/*     */     //   285: ldc2_w -3428210965521191065
/*     */     //   288: lload_2
/*     */     //   289: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   294: athrow
/*     */     //   295: aload #5
/*     */     //   297: invokevirtual a : ()Lme/konsolas/aac/cJ;
/*     */     //   300: invokevirtual b : ()Z
/*     */     //   303: iload #19
/*     */     //   305: ifne -> 501
/*     */     //   308: goto -> 321
/*     */     //   311: ldc2_w -3428210965521191065
/*     */     //   314: lload_2
/*     */     //   315: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   320: athrow
/*     */     //   321: ifne -> 495
/*     */     //   324: goto -> 337
/*     */     //   327: ldc2_w -3428210965521191065
/*     */     //   330: lload_2
/*     */     //   331: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   336: athrow
/*     */     //   337: aload #5
/*     */     //   339: invokevirtual a : ()Lme/konsolas/aac/cJ;
/*     */     //   342: invokevirtual a : ()Lorg/bukkit/util/Vector;
/*     */     //   345: invokevirtual getY : ()D
/*     */     //   348: ldc2_w -0.08
/*     */     //   351: dcmpg
/*     */     //   352: iload #19
/*     */     //   354: lload_2
/*     */     //   355: lconst_0
/*     */     //   356: lcmp
/*     */     //   357: iflt -> 503
/*     */     //   360: ifne -> 501
/*     */     //   363: goto -> 376
/*     */     //   366: ldc2_w -3428210965521191065
/*     */     //   369: lload_2
/*     */     //   370: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   375: athrow
/*     */     //   376: ifge -> 495
/*     */     //   379: goto -> 392
/*     */     //   382: ldc2_w -3428210965521191065
/*     */     //   385: lload_2
/*     */     //   386: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   391: athrow
/*     */     //   392: aload #5
/*     */     //   394: invokevirtual a : ()Lme/konsolas/aac/cJ;
/*     */     //   397: invokevirtual a : ()Lorg/bukkit/util/Vector;
/*     */     //   400: iload #19
/*     */     //   402: ifne -> 494
/*     */     //   405: goto -> 418
/*     */     //   408: ldc2_w -3428210965521191065
/*     */     //   411: lload_2
/*     */     //   412: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   417: athrow
/*     */     //   418: invokevirtual getY : ()D
/*     */     //   421: ldc2_w -0.13
/*     */     //   424: dcmpg
/*     */     //   425: ifge -> 486
/*     */     //   428: goto -> 441
/*     */     //   431: ldc2_w -3428210965521191065
/*     */     //   434: lload_2
/*     */     //   435: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   440: athrow
/*     */     //   441: ldc2_w -0.05
/*     */     //   444: aload #5
/*     */     //   446: invokevirtual a : ()Lme/konsolas/aac/cJ;
/*     */     //   449: invokevirtual a : ()Lorg/bukkit/util/Vector;
/*     */     //   452: invokevirtual getY : ()D
/*     */     //   455: ddiv
/*     */     //   456: dstore #23
/*     */     //   458: aload #20
/*     */     //   460: aload #20
/*     */     //   462: invokevirtual getX : ()D
/*     */     //   465: dload #23
/*     */     //   467: dmul
/*     */     //   468: invokevirtual setX : (D)Lorg/bukkit/util/Vector;
/*     */     //   471: pop
/*     */     //   472: aload #20
/*     */     //   474: aload #20
/*     */     //   476: invokevirtual getZ : ()D
/*     */     //   479: dload #23
/*     */     //   481: dmul
/*     */     //   482: invokevirtual setZ : (D)Lorg/bukkit/util/Vector;
/*     */     //   485: pop
/*     */     //   486: aload #20
/*     */     //   488: ldc2_w -0.05
/*     */     //   491: invokevirtual setY : (D)Lorg/bukkit/util/Vector;
/*     */     //   494: pop
/*     */     //   495: aload_1
/*     */     //   496: invokeinterface n : ()Z
/*     */     //   501: iload #19
/*     */     //   503: ifne -> 964
/*     */     //   506: ifeq -> 945
/*     */     //   509: goto -> 522
/*     */     //   512: ldc2_w -3428210965521191065
/*     */     //   515: lload_2
/*     */     //   516: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   521: athrow
/*     */     //   522: aload #5
/*     */     //   524: invokevirtual a : ()Lme/konsolas/aac/mZ;
/*     */     //   527: invokevirtual f : ()Z
/*     */     //   530: iload #19
/*     */     //   532: lload_2
/*     */     //   533: lconst_0
/*     */     //   534: lcmp
/*     */     //   535: ifle -> 966
/*     */     //   538: ifne -> 964
/*     */     //   541: goto -> 554
/*     */     //   544: ldc2_w -3428210965521191065
/*     */     //   547: lload_2
/*     */     //   548: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   553: athrow
/*     */     //   554: lload_2
/*     */     //   555: lconst_0
/*     */     //   556: lcmp
/*     */     //   557: ifle -> 951
/*     */     //   560: ifne -> 945
/*     */     //   563: goto -> 576
/*     */     //   566: ldc2_w -3428210965521191065
/*     */     //   569: lload_2
/*     */     //   570: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   575: athrow
/*     */     //   576: aload #20
/*     */     //   578: aload #20
/*     */     //   580: invokevirtual getX : ()D
/*     */     //   583: aload #5
/*     */     //   585: invokevirtual a : ()Lme/konsolas/aac/gg;
/*     */     //   588: invokevirtual b : ()F
/*     */     //   591: f2d
/*     */     //   592: dmul
/*     */     //   593: invokevirtual setX : (D)Lorg/bukkit/util/Vector;
/*     */     //   596: pop
/*     */     //   597: aload #20
/*     */     //   599: aload #20
/*     */     //   601: invokevirtual getY : ()D
/*     */     //   604: ldc2_w 0.8
/*     */     //   607: dmul
/*     */     //   608: invokevirtual setY : (D)Lorg/bukkit/util/Vector;
/*     */     //   611: pop
/*     */     //   612: aload #20
/*     */     //   614: aload #20
/*     */     //   616: invokevirtual getZ : ()D
/*     */     //   619: aload #5
/*     */     //   621: invokevirtual a : ()Lme/konsolas/aac/gg;
/*     */     //   624: invokevirtual b : ()F
/*     */     //   627: f2d
/*     */     //   628: dmul
/*     */     //   629: invokevirtual setZ : (D)Lorg/bukkit/util/Vector;
/*     */     //   632: iload #19
/*     */     //   634: ifne -> 786
/*     */     //   637: goto -> 650
/*     */     //   640: ldc2_w -3428210965521191065
/*     */     //   643: lload_2
/*     */     //   644: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   649: athrow
/*     */     //   650: lload_2
/*     */     //   651: lconst_0
/*     */     //   652: lcmp
/*     */     //   653: ifle -> 773
/*     */     //   656: pop
/*     */     //   657: aload_0
/*     */     //   658: getfield b : Lme/konsolas/aac/kP;
/*     */     //   661: lload #10
/*     */     //   663: getstatic me/konsolas/aac/kP.V1_13 : Lme/konsolas/aac/kP;
/*     */     //   666: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*     */     //   669: ifeq -> 759
/*     */     //   672: goto -> 685
/*     */     //   675: ldc2_w -3428210965521191065
/*     */     //   678: lload_2
/*     */     //   679: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   684: athrow
/*     */     //   685: aload_0
/*     */     //   686: aload #6
/*     */     //   688: dload #8
/*     */     //   690: aload #20
/*     */     //   692: aload #5
/*     */     //   694: invokevirtual a : ()Lorg/bukkit/util/Vector;
/*     */     //   697: invokevirtual getY : ()D
/*     */     //   700: dconst_0
/*     */     //   701: dcmpg
/*     */     //   702: iload #19
/*     */     //   704: ifne -> 737
/*     */     //   707: goto -> 720
/*     */     //   710: ldc2_w -3428210965521191065
/*     */     //   713: lload_2
/*     */     //   714: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   719: athrow
/*     */     //   720: ifgt -> 740
/*     */     //   723: goto -> 736
/*     */     //   726: ldc2_w -3428210965521191065
/*     */     //   729: lload_2
/*     */     //   730: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   735: athrow
/*     */     //   736: iconst_1
/*     */     //   737: goto -> 741
/*     */     //   740: iconst_0
/*     */     //   741: lload #12
/*     */     //   743: dup2_x2
/*     */     //   744: pop2
/*     */     //   745: invokespecial a : (Lme/konsolas/aac/mZ;DJLorg/bukkit/util/Vector;Z)V
/*     */     //   748: iload #19
/*     */     //   750: lload_2
/*     */     //   751: lconst_0
/*     */     //   752: lcmp
/*     */     //   753: iflt -> 795
/*     */     //   756: ifeq -> 787
/*     */     //   759: aload #20
/*     */     //   761: aload #20
/*     */     //   763: invokevirtual getY : ()D
/*     */     //   766: ldc2_w 0.02
/*     */     //   769: dsub
/*     */     //   770: invokevirtual setY : (D)Lorg/bukkit/util/Vector;
/*     */     //   773: goto -> 786
/*     */     //   776: ldc2_w -3428210965521191065
/*     */     //   779: lload_2
/*     */     //   780: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   785: athrow
/*     */     //   786: pop
/*     */     //   787: aload #5
/*     */     //   789: invokevirtual a : ()Lme/konsolas/aac/cJ;
/*     */     //   792: invokevirtual a : ()Z
/*     */     //   795: iload #19
/*     */     //   797: ifne -> 2096
/*     */     //   800: ifeq -> 2088
/*     */     //   803: goto -> 816
/*     */     //   806: ldc2_w -3428210965521191065
/*     */     //   809: lload_2
/*     */     //   810: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   815: athrow
/*     */     //   816: aload #4
/*     */     //   818: aload_1
/*     */     //   819: invokeinterface a : ()Lme/konsolas/aac/lq;
/*     */     //   824: aload #20
/*     */     //   826: invokevirtual getX : ()D
/*     */     //   829: aload #20
/*     */     //   831: invokevirtual getY : ()D
/*     */     //   834: ldc2_w 0.6
/*     */     //   837: dadd
/*     */     //   838: aload #5
/*     */     //   840: invokevirtual a : ()Lme/konsolas/aac/cJ;
/*     */     //   843: invokevirtual a : ()Lorg/bukkit/util/Vector;
/*     */     //   846: invokevirtual getY : ()D
/*     */     //   849: dsub
/*     */     //   850: aload #20
/*     */     //   852: invokevirtual getZ : ()D
/*     */     //   855: invokevirtual a : (DDD)Lme/konsolas/aac/lq;
/*     */     //   858: iload #16
/*     */     //   860: i2c
/*     */     //   861: swap
/*     */     //   862: getstatic me/konsolas/aac/ei.WATER : Ljava/util/Set;
/*     */     //   865: dup
/*     */     //   866: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   869: pop
/*     */     //   870: <illegal opcode> test : (Ljava/util/Set;)Ljava/util/function/Predicate;
/*     */     //   875: iload #17
/*     */     //   877: swap
/*     */     //   878: iload #18
/*     */     //   880: i2s
/*     */     //   881: invokevirtual a : (CLme/konsolas/aac/lq;ILjava/util/function/Predicate;S)Z
/*     */     //   884: iload #19
/*     */     //   886: ifne -> 2096
/*     */     //   889: goto -> 902
/*     */     //   892: ldc2_w -3428210965521191065
/*     */     //   895: lload_2
/*     */     //   896: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   901: athrow
/*     */     //   902: ifne -> 2088
/*     */     //   905: goto -> 918
/*     */     //   908: ldc2_w -3428210965521191065
/*     */     //   911: lload_2
/*     */     //   912: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   917: athrow
/*     */     //   918: aload #20
/*     */     //   920: ldc_w 0.3
/*     */     //   923: invokevirtual setY : (F)Lorg/bukkit/util/Vector;
/*     */     //   926: pop
/*     */     //   927: iload #19
/*     */     //   929: ifeq -> 2088
/*     */     //   932: goto -> 945
/*     */     //   935: ldc2_w -3428210965521191065
/*     */     //   938: lload_2
/*     */     //   939: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   944: athrow
/*     */     //   945: aload_1
/*     */     //   946: invokeinterface m : ()Z
/*     */     //   951: goto -> 964
/*     */     //   954: ldc2_w -3428210965521191065
/*     */     //   957: lload_2
/*     */     //   958: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   963: athrow
/*     */     //   964: iload #19
/*     */     //   966: ifne -> 1534
/*     */     //   969: ifeq -> 1513
/*     */     //   972: goto -> 985
/*     */     //   975: ldc2_w -3428210965521191065
/*     */     //   978: lload_2
/*     */     //   979: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   984: athrow
/*     */     //   985: aload #5
/*     */     //   987: invokevirtual a : ()Lme/konsolas/aac/mZ;
/*     */     //   990: invokevirtual f : ()Z
/*     */     //   993: iload #19
/*     */     //   995: lload_2
/*     */     //   996: lconst_0
/*     */     //   997: lcmp
/*     */     //   998: iflt -> 1536
/*     */     //   1001: ifne -> 1534
/*     */     //   1004: goto -> 1017
/*     */     //   1007: ldc2_w -3428210965521191065
/*     */     //   1010: lload_2
/*     */     //   1011: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1016: athrow
/*     */     //   1017: lload_2
/*     */     //   1018: lconst_0
/*     */     //   1019: lcmp
/*     */     //   1020: iflt -> 1521
/*     */     //   1023: ifne -> 1513
/*     */     //   1026: goto -> 1039
/*     */     //   1029: ldc2_w -3428210965521191065
/*     */     //   1032: lload_2
/*     */     //   1033: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1038: athrow
/*     */     //   1039: aload_0
/*     */     //   1040: getfield b : Lme/konsolas/aac/kP;
/*     */     //   1043: lload #10
/*     */     //   1045: getstatic me/konsolas/aac/kP.V1_16 : Lme/konsolas/aac/kP;
/*     */     //   1048: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*     */     //   1051: lload_2
/*     */     //   1052: lconst_0
/*     */     //   1053: lcmp
/*     */     //   1054: ifle -> 1114
/*     */     //   1057: iload #19
/*     */     //   1059: ifne -> 1114
/*     */     //   1062: goto -> 1075
/*     */     //   1065: ldc2_w -3428210965521191065
/*     */     //   1068: lload_2
/*     */     //   1069: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1074: athrow
/*     */     //   1075: ifeq -> 1236
/*     */     //   1078: goto -> 1091
/*     */     //   1081: ldc2_w -3428210965521191065
/*     */     //   1084: lload_2
/*     */     //   1085: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1090: athrow
/*     */     //   1091: aload_1
/*     */     //   1092: invokeinterface d : ()D
/*     */     //   1097: ldc2_w 0.4
/*     */     //   1100: dcmpg
/*     */     //   1101: goto -> 1114
/*     */     //   1104: ldc2_w -3428210965521191065
/*     */     //   1107: lload_2
/*     */     //   1108: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1113: athrow
/*     */     //   1114: ifgt -> 1236
/*     */     //   1117: aload #20
/*     */     //   1119: aload #20
/*     */     //   1121: invokevirtual getX : ()D
/*     */     //   1124: ldc2_w 0.5
/*     */     //   1127: dmul
/*     */     //   1128: invokevirtual setX : (D)Lorg/bukkit/util/Vector;
/*     */     //   1131: pop
/*     */     //   1132: aload #20
/*     */     //   1134: aload #20
/*     */     //   1136: invokevirtual getY : ()D
/*     */     //   1139: ldc2_w 0.800000011920929
/*     */     //   1142: dmul
/*     */     //   1143: invokevirtual setY : (D)Lorg/bukkit/util/Vector;
/*     */     //   1146: pop
/*     */     //   1147: aload #20
/*     */     //   1149: aload #20
/*     */     //   1151: invokevirtual getZ : ()D
/*     */     //   1154: ldc2_w 0.5
/*     */     //   1157: dmul
/*     */     //   1158: invokevirtual setZ : (D)Lorg/bukkit/util/Vector;
/*     */     //   1161: pop
/*     */     //   1162: aload_0
/*     */     //   1163: aload #6
/*     */     //   1165: dload #8
/*     */     //   1167: aload #20
/*     */     //   1169: aload #5
/*     */     //   1171: invokevirtual a : ()Lorg/bukkit/util/Vector;
/*     */     //   1174: invokevirtual getY : ()D
/*     */     //   1177: dconst_0
/*     */     //   1178: dcmpg
/*     */     //   1179: iload #19
/*     */     //   1181: ifne -> 1214
/*     */     //   1184: goto -> 1197
/*     */     //   1187: ldc2_w -3428210965521191065
/*     */     //   1190: lload_2
/*     */     //   1191: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1196: athrow
/*     */     //   1197: ifgt -> 1217
/*     */     //   1200: goto -> 1213
/*     */     //   1203: ldc2_w -3428210965521191065
/*     */     //   1206: lload_2
/*     */     //   1207: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1212: athrow
/*     */     //   1213: iconst_1
/*     */     //   1214: goto -> 1218
/*     */     //   1217: iconst_0
/*     */     //   1218: lload #12
/*     */     //   1220: dup2_x2
/*     */     //   1221: pop2
/*     */     //   1222: invokespecial a : (Lme/konsolas/aac/mZ;DJLorg/bukkit/util/Vector;Z)V
/*     */     //   1225: iload #19
/*     */     //   1227: lload_2
/*     */     //   1228: lconst_0
/*     */     //   1229: lcmp
/*     */     //   1230: ifle -> 1276
/*     */     //   1233: ifeq -> 1258
/*     */     //   1236: aload #20
/*     */     //   1238: ldc2_w 0.5
/*     */     //   1241: invokevirtual multiply : (D)Lorg/bukkit/util/Vector;
/*     */     //   1244: pop
/*     */     //   1245: goto -> 1258
/*     */     //   1248: ldc2_w -3428210965521191065
/*     */     //   1251: lload_2
/*     */     //   1252: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1257: athrow
/*     */     //   1258: lload_2
/*     */     //   1259: lconst_0
/*     */     //   1260: lcmp
/*     */     //   1261: ifle -> 1336
/*     */     //   1264: aload_0
/*     */     //   1265: getfield b : Lme/konsolas/aac/kP;
/*     */     //   1268: lload #10
/*     */     //   1270: getstatic me/konsolas/aac/kP.V1_13 : Lme/konsolas/aac/kP;
/*     */     //   1273: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*     */     //   1276: ifeq -> 1321
/*     */     //   1279: aload #20
/*     */     //   1281: aload #20
/*     */     //   1283: invokevirtual getY : ()D
/*     */     //   1286: dload #8
/*     */     //   1288: ldc2_w 4.0
/*     */     //   1291: ddiv
/*     */     //   1292: dsub
/*     */     //   1293: invokevirtual setY : (D)Lorg/bukkit/util/Vector;
/*     */     //   1296: pop
/*     */     //   1297: iload #19
/*     */     //   1299: lload_2
/*     */     //   1300: lconst_0
/*     */     //   1301: lcmp
/*     */     //   1302: ifle -> 1357
/*     */     //   1305: ifeq -> 1349
/*     */     //   1308: goto -> 1321
/*     */     //   1311: ldc2_w -3428210965521191065
/*     */     //   1314: lload_2
/*     */     //   1315: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1320: athrow
/*     */     //   1321: aload #20
/*     */     //   1323: aload #20
/*     */     //   1325: invokevirtual getY : ()D
/*     */     //   1328: ldc2_w 0.02
/*     */     //   1331: dsub
/*     */     //   1332: invokevirtual setY : (D)Lorg/bukkit/util/Vector;
/*     */     //   1335: pop
/*     */     //   1336: goto -> 1349
/*     */     //   1339: ldc2_w -3428210965521191065
/*     */     //   1342: lload_2
/*     */     //   1343: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1348: athrow
/*     */     //   1349: aload #5
/*     */     //   1351: invokevirtual a : ()Lme/konsolas/aac/cJ;
/*     */     //   1354: invokevirtual a : ()Z
/*     */     //   1357: iload #19
/*     */     //   1359: ifne -> 2096
/*     */     //   1362: ifeq -> 2088
/*     */     //   1365: goto -> 1378
/*     */     //   1368: ldc2_w -3428210965521191065
/*     */     //   1371: lload_2
/*     */     //   1372: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1377: athrow
/*     */     //   1378: aload #4
/*     */     //   1380: aload_1
/*     */     //   1381: invokeinterface a : ()Lme/konsolas/aac/lq;
/*     */     //   1386: aload #20
/*     */     //   1388: invokevirtual getX : ()D
/*     */     //   1391: aload #20
/*     */     //   1393: invokevirtual getY : ()D
/*     */     //   1396: ldc2_w 0.6
/*     */     //   1399: dadd
/*     */     //   1400: aload #5
/*     */     //   1402: invokevirtual a : ()Lme/konsolas/aac/cJ;
/*     */     //   1405: invokevirtual a : ()Lorg/bukkit/util/Vector;
/*     */     //   1408: invokevirtual getY : ()D
/*     */     //   1411: dsub
/*     */     //   1412: aload #20
/*     */     //   1414: invokevirtual getZ : ()D
/*     */     //   1417: invokevirtual a : (DDD)Lme/konsolas/aac/lq;
/*     */     //   1420: iload #16
/*     */     //   1422: i2c
/*     */     //   1423: swap
/*     */     //   1424: getstatic me/konsolas/aac/ei.LAVA : Ljava/util/Set;
/*     */     //   1427: dup
/*     */     //   1428: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   1431: pop
/*     */     //   1432: <illegal opcode> test : (Ljava/util/Set;)Ljava/util/function/Predicate;
/*     */     //   1437: iload #17
/*     */     //   1439: swap
/*     */     //   1440: iload #18
/*     */     //   1442: i2s
/*     */     //   1443: invokevirtual a : (CLme/konsolas/aac/lq;ILjava/util/function/Predicate;S)Z
/*     */     //   1446: lload_2
/*     */     //   1447: lconst_0
/*     */     //   1448: lcmp
/*     */     //   1449: iflt -> 2096
/*     */     //   1452: iload #19
/*     */     //   1454: ifne -> 2096
/*     */     //   1457: goto -> 1470
/*     */     //   1460: ldc2_w -3428210965521191065
/*     */     //   1463: lload_2
/*     */     //   1464: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1469: athrow
/*     */     //   1470: ifne -> 2088
/*     */     //   1473: goto -> 1486
/*     */     //   1476: ldc2_w -3428210965521191065
/*     */     //   1479: lload_2
/*     */     //   1480: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1485: athrow
/*     */     //   1486: aload #20
/*     */     //   1488: ldc_w 0.3
/*     */     //   1491: invokevirtual setY : (F)Lorg/bukkit/util/Vector;
/*     */     //   1494: pop
/*     */     //   1495: iload #19
/*     */     //   1497: ifeq -> 2088
/*     */     //   1500: goto -> 1513
/*     */     //   1503: ldc2_w -3428210965521191065
/*     */     //   1506: lload_2
/*     */     //   1507: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1512: athrow
/*     */     //   1513: aload #5
/*     */     //   1515: invokevirtual a : ()Lme/konsolas/aac/mZ;
/*     */     //   1518: invokevirtual a : ()Z
/*     */     //   1521: goto -> 1534
/*     */     //   1524: ldc2_w -3428210965521191065
/*     */     //   1527: lload_2
/*     */     //   1528: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1533: athrow
/*     */     //   1534: iload #19
/*     */     //   1536: lload_2
/*     */     //   1537: lconst_0
/*     */     //   1538: lcmp
/*     */     //   1539: ifle -> 1581
/*     */     //   1542: ifne -> 1579
/*     */     //   1545: ifeq -> 1567
/*     */     //   1548: goto -> 1561
/*     */     //   1551: ldc2_w -3428210965521191065
/*     */     //   1554: lload_2
/*     */     //   1555: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1560: athrow
/*     */     //   1561: lload_2
/*     */     //   1562: lconst_0
/*     */     //   1563: lcmp
/*     */     //   1564: ifgt -> 2088
/*     */     //   1567: aload_0
/*     */     //   1568: getfield b : Lme/konsolas/aac/kP;
/*     */     //   1571: lload #10
/*     */     //   1573: getstatic me/konsolas/aac/kP.V1_14 : Lme/konsolas/aac/kP;
/*     */     //   1576: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*     */     //   1579: iload #19
/*     */     //   1581: lload_2
/*     */     //   1582: lconst_0
/*     */     //   1583: lcmp
/*     */     //   1584: ifle -> 1789
/*     */     //   1587: ifne -> 1787
/*     */     //   1590: ifeq -> 1766
/*     */     //   1593: goto -> 1606
/*     */     //   1596: ldc2_w -3428210965521191065
/*     */     //   1599: lload_2
/*     */     //   1600: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1605: athrow
/*     */     //   1606: aload #5
/*     */     //   1608: invokevirtual a : ()Lme/konsolas/aac/cJ;
/*     */     //   1611: invokevirtual a : ()Z
/*     */     //   1614: iload #19
/*     */     //   1616: lload_2
/*     */     //   1617: lconst_0
/*     */     //   1618: lcmp
/*     */     //   1619: ifle -> 1720
/*     */     //   1622: ifne -> 1718
/*     */     //   1625: goto -> 1638
/*     */     //   1628: ldc2_w -3428210965521191065
/*     */     //   1631: lload_2
/*     */     //   1632: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1637: athrow
/*     */     //   1638: lload_2
/*     */     //   1639: lconst_0
/*     */     //   1640: lcmp
/*     */     //   1641: iflt -> 1705
/*     */     //   1644: ifne -> 1699
/*     */     //   1647: goto -> 1660
/*     */     //   1650: ldc2_w -3428210965521191065
/*     */     //   1653: lload_2
/*     */     //   1654: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1659: athrow
/*     */     //   1660: aload #6
/*     */     //   1662: invokevirtual e : ()Z
/*     */     //   1665: iload #19
/*     */     //   1667: ifne -> 1888
/*     */     //   1670: goto -> 1683
/*     */     //   1673: ldc2_w -3428210965521191065
/*     */     //   1676: lload_2
/*     */     //   1677: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1682: athrow
/*     */     //   1683: ifeq -> 1876
/*     */     //   1686: goto -> 1699
/*     */     //   1689: ldc2_w -3428210965521191065
/*     */     //   1692: lload_2
/*     */     //   1693: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1698: athrow
/*     */     //   1699: aload_1
/*     */     //   1700: invokeinterface i : ()Z
/*     */     //   1705: goto -> 1718
/*     */     //   1708: ldc2_w -3428210965521191065
/*     */     //   1711: lload_2
/*     */     //   1712: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1717: athrow
/*     */     //   1718: iload #19
/*     */     //   1720: ifne -> 1888
/*     */     //   1723: ifeq -> 1876
/*     */     //   1726: goto -> 1739
/*     */     //   1729: ldc2_w -3428210965521191065
/*     */     //   1732: lload_2
/*     */     //   1733: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1738: athrow
/*     */     //   1739: aload #20
/*     */     //   1741: ldc2_w 0.2
/*     */     //   1744: invokevirtual setY : (D)Lorg/bukkit/util/Vector;
/*     */     //   1747: pop
/*     */     //   1748: iload #19
/*     */     //   1750: ifeq -> 1876
/*     */     //   1753: goto -> 1766
/*     */     //   1756: ldc2_w -3428210965521191065
/*     */     //   1759: lload_2
/*     */     //   1760: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1765: athrow
/*     */     //   1766: aload #5
/*     */     //   1768: invokevirtual a : ()Lme/konsolas/aac/cJ;
/*     */     //   1771: invokevirtual a : ()Z
/*     */     //   1774: goto -> 1787
/*     */     //   1777: ldc2_w -3428210965521191065
/*     */     //   1780: lload_2
/*     */     //   1781: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1786: athrow
/*     */     //   1787: iload #19
/*     */     //   1789: ifne -> 1888
/*     */     //   1792: ifeq -> 1876
/*     */     //   1795: goto -> 1808
/*     */     //   1798: ldc2_w -3428210965521191065
/*     */     //   1801: lload_2
/*     */     //   1802: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1807: athrow
/*     */     //   1808: aload_1
/*     */     //   1809: invokeinterface i : ()Z
/*     */     //   1814: iload #19
/*     */     //   1816: lload_2
/*     */     //   1817: lconst_0
/*     */     //   1818: lcmp
/*     */     //   1819: iflt -> 1896
/*     */     //   1822: ifne -> 1888
/*     */     //   1825: goto -> 1838
/*     */     //   1828: ldc2_w -3428210965521191065
/*     */     //   1831: lload_2
/*     */     //   1832: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1837: athrow
/*     */     //   1838: ifeq -> 1876
/*     */     //   1841: goto -> 1854
/*     */     //   1844: ldc2_w -3428210965521191065
/*     */     //   1847: lload_2
/*     */     //   1848: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1853: athrow
/*     */     //   1854: aload #20
/*     */     //   1856: ldc2_w 0.2
/*     */     //   1859: invokevirtual setY : (D)Lorg/bukkit/util/Vector;
/*     */     //   1862: pop
/*     */     //   1863: goto -> 1876
/*     */     //   1866: ldc2_w -3428210965521191065
/*     */     //   1869: lload_2
/*     */     //   1870: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1875: athrow
/*     */     //   1876: aload_0
/*     */     //   1877: getfield b : Lme/konsolas/aac/kP;
/*     */     //   1880: lload #10
/*     */     //   1882: getstatic me/konsolas/aac/kP.V1_9 : Lme/konsolas/aac/kP;
/*     */     //   1885: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*     */     //   1888: lload_2
/*     */     //   1889: lconst_0
/*     */     //   1890: lcmp
/*     */     //   1891: ifle -> 1936
/*     */     //   1894: iload #19
/*     */     //   1896: ifne -> 1936
/*     */     //   1899: ifeq -> 2004
/*     */     //   1902: goto -> 1915
/*     */     //   1905: ldc2_w -3428210965521191065
/*     */     //   1908: lload_2
/*     */     //   1909: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1914: athrow
/*     */     //   1915: aload_1
/*     */     //   1916: lload #14
/*     */     //   1918: invokeinterface d : (J)Z
/*     */     //   1923: goto -> 1936
/*     */     //   1926: ldc2_w -3428210965521191065
/*     */     //   1929: lload_2
/*     */     //   1930: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1935: athrow
/*     */     //   1936: lload_2
/*     */     //   1937: lconst_0
/*     */     //   1938: lcmp
/*     */     //   1939: iflt -> 1988
/*     */     //   1942: ifeq -> 2004
/*     */     //   1945: aload #20
/*     */     //   1947: aload #20
/*     */     //   1949: invokevirtual getY : ()D
/*     */     //   1952: ldc2_w 0.05
/*     */     //   1955: aload_1
/*     */     //   1956: invokeinterface c : ()I
/*     */     //   1961: iconst_1
/*     */     //   1962: iadd
/*     */     //   1963: i2d
/*     */     //   1964: dmul
/*     */     //   1965: aload #20
/*     */     //   1967: invokevirtual getY : ()D
/*     */     //   1970: dsub
/*     */     //   1971: ldc2_w 0.2
/*     */     //   1974: dmul
/*     */     //   1975: dadd
/*     */     //   1976: invokevirtual setY : (D)Lorg/bukkit/util/Vector;
/*     */     //   1979: pop
/*     */     //   1980: lload_2
/*     */     //   1981: lconst_0
/*     */     //   1982: lcmp
/*     */     //   1983: iflt -> 2067
/*     */     //   1986: iload #19
/*     */     //   1988: ifeq -> 2031
/*     */     //   1991: goto -> 2004
/*     */     //   1994: ldc2_w -3428210965521191065
/*     */     //   1997: lload_2
/*     */     //   1998: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2003: athrow
/*     */     //   2004: aload #20
/*     */     //   2006: aload #20
/*     */     //   2008: invokevirtual getY : ()D
/*     */     //   2011: dload #8
/*     */     //   2013: dsub
/*     */     //   2014: invokevirtual setY : (D)Lorg/bukkit/util/Vector;
/*     */     //   2017: pop
/*     */     //   2018: goto -> 2031
/*     */     //   2021: ldc2_w -3428210965521191065
/*     */     //   2024: lload_2
/*     */     //   2025: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2030: athrow
/*     */     //   2031: aload #20
/*     */     //   2033: aload #20
/*     */     //   2035: invokevirtual getY : ()D
/*     */     //   2038: ldc2_w 0.9800000190734863
/*     */     //   2041: dmul
/*     */     //   2042: invokevirtual setY : (D)Lorg/bukkit/util/Vector;
/*     */     //   2045: pop
/*     */     //   2046: aload #20
/*     */     //   2048: aload #20
/*     */     //   2050: invokevirtual getX : ()D
/*     */     //   2053: aload #5
/*     */     //   2055: invokevirtual a : ()Lme/konsolas/aac/gg;
/*     */     //   2058: invokevirtual b : ()F
/*     */     //   2061: f2d
/*     */     //   2062: dmul
/*     */     //   2063: invokevirtual setX : (D)Lorg/bukkit/util/Vector;
/*     */     //   2066: pop
/*     */     //   2067: aload #20
/*     */     //   2069: aload #20
/*     */     //   2071: invokevirtual getZ : ()D
/*     */     //   2074: aload #5
/*     */     //   2076: invokevirtual a : ()Lme/konsolas/aac/gg;
/*     */     //   2079: invokevirtual b : ()F
/*     */     //   2082: f2d
/*     */     //   2083: dmul
/*     */     //   2084: invokevirtual setZ : (D)Lorg/bukkit/util/Vector;
/*     */     //   2087: pop
/*     */     //   2088: aload #5
/*     */     //   2090: invokevirtual a : ()Lme/konsolas/aac/mZ;
/*     */     //   2093: invokevirtual f : ()Z
/*     */     //   2096: lload_2
/*     */     //   2097: lconst_0
/*     */     //   2098: lcmp
/*     */     //   2099: iflt -> 2132
/*     */     //   2102: ifeq -> 2130
/*     */     //   2105: aload #20
/*     */     //   2107: dload #21
/*     */     //   2109: ldc2_w 0.6
/*     */     //   2112: dmul
/*     */     //   2113: invokevirtual setY : (D)Lorg/bukkit/util/Vector;
/*     */     //   2116: pop
/*     */     //   2117: goto -> 2130
/*     */     //   2120: ldc2_w -3428210965521191065
/*     */     //   2123: lload_2
/*     */     //   2124: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2129: athrow
/*     */     //   2130: iload #19
/*     */     //   2132: ifeq -> 2155
/*     */     //   2135: aload #7
/*     */     //   2137: goto -> 2150
/*     */     //   2140: ldc2_w -3428210965521191065
/*     */     //   2143: lload_2
/*     */     //   2144: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2149: athrow
/*     */     //   2150: invokevirtual a : ()Lorg/bukkit/util/Vector;
/*     */     //   2153: astore #20
/*     */     //   2155: aload #20
/*     */     //   2157: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #1	-> 73
/*     */     //   #455	-> 96
/*     */     //   #193	-> 109
/*     */     //   #367	-> 116
/*     */     //   #434	-> 149
/*     */     //   #428	-> 164
/*     */     //   #429	-> 192
/*     */     //   #211	-> 225
/*     */     //   #469	-> 240
/*     */     //   #468	-> 254
/*     */     //   #217	-> 268
/*     */     //   #317	-> 339
/*     */     //   #356	-> 392
/*     */     //   #365	-> 441
/*     */     //   #274	-> 458
/*     */     //   #245	-> 472
/*     */     //   #224	-> 486
/*     */     //   #388	-> 495
/*     */     //   #472	-> 576
/*     */     //   #157	-> 597
/*     */     //   #168	-> 612
/*     */     //   #265	-> 657
/*     */     //   #261	-> 685
/*     */     //   #183	-> 759
/*     */     //   #24	-> 787
/*     */     //   #443	-> 819
/*     */     //   #248	-> 826
/*     */     //   #68	-> 855
/*     */     //   #424	-> 866
/*     */     //   #426	-> 878
/*     */     //   #82	-> 918
/*     */     //   #235	-> 945
/*     */     //   #459	-> 1039
/*     */     //   #399	-> 1117
/*     */     //   #456	-> 1132
/*     */     //   #260	-> 1147
/*     */     //   #32	-> 1162
/*     */     //   #219	-> 1236
/*     */     //   #387	-> 1258
/*     */     //   #233	-> 1279
/*     */     //   #241	-> 1321
/*     */     //   #256	-> 1349
/*     */     //   #421	-> 1381
/*     */     //   #135	-> 1388
/*     */     //   #273	-> 1417
/*     */     //   #281	-> 1428
/*     */     //   #355	-> 1440
/*     */     //   #228	-> 1486
/*     */     //   #252	-> 1513
/*     */     //   #213	-> 1567
/*     */     //   #398	-> 1606
/*     */     //   #85	-> 1700
/*     */     //   #481	-> 1739
/*     */     //   #313	-> 1766
/*     */     //   #445	-> 1854
/*     */     //   #78	-> 1876
/*     */     //   #107	-> 1945
/*     */     //   #196	-> 1956
/*     */     //   #287	-> 1976
/*     */     //   #62	-> 2004
/*     */     //   #113	-> 2031
/*     */     //   #75	-> 2046
/*     */     //   #69	-> 2067
/*     */     //   #97	-> 2088
/*     */     //   #79	-> 2105
/*     */     //   #20	-> 2130
/*     */     //   #29	-> 2135
/*     */     //   #404	-> 2155
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   73	83	86	aacinternal/v
/*     */     //   116	136	139	aacinternal/v
/*     */     //   133	179	182	aacinternal/v
/*     */     //   198	212	215	aacinternal/v
/*     */     //   274	282	285	aacinternal/v
/*     */     //   279	308	311	aacinternal/v
/*     */     //   295	324	327	aacinternal/v
/*     */     //   321	363	366	aacinternal/v
/*     */     //   337	379	382	aacinternal/v
/*     */     //   376	405	408	aacinternal/v
/*     */     //   392	428	431	aacinternal/v
/*     */     //   501	509	512	aacinternal/v
/*     */     //   506	541	544	aacinternal/v
/*     */     //   522	563	566	aacinternal/v
/*     */     //   554	637	640	aacinternal/v
/*     */     //   576	672	675	aacinternal/v
/*     */     //   650	707	710	aacinternal/v
/*     */     //   685	723	726	aacinternal/v
/*     */     //   741	773	776	aacinternal/v
/*     */     //   787	803	806	aacinternal/v
/*     */     //   800	889	892	aacinternal/v
/*     */     //   816	905	908	aacinternal/v
/*     */     //   902	932	935	aacinternal/v
/*     */     //   918	951	954	aacinternal/v
/*     */     //   964	972	975	aacinternal/v
/*     */     //   969	1004	1007	aacinternal/v
/*     */     //   985	1026	1029	aacinternal/v
/*     */     //   1017	1062	1065	aacinternal/v
/*     */     //   1039	1078	1081	aacinternal/v
/*     */     //   1075	1101	1104	aacinternal/v
/*     */     //   1114	1184	1187	aacinternal/v
/*     */     //   1117	1200	1203	aacinternal/v
/*     */     //   1218	1245	1248	aacinternal/v
/*     */     //   1258	1308	1311	aacinternal/v
/*     */     //   1279	1336	1339	aacinternal/v
/*     */     //   1349	1365	1368	aacinternal/v
/*     */     //   1362	1457	1460	aacinternal/v
/*     */     //   1378	1473	1476	aacinternal/v
/*     */     //   1470	1500	1503	aacinternal/v
/*     */     //   1486	1521	1524	aacinternal/v
/*     */     //   1534	1548	1551	aacinternal/v
/*     */     //   1579	1593	1596	aacinternal/v
/*     */     //   1590	1625	1628	aacinternal/v
/*     */     //   1606	1647	1650	aacinternal/v
/*     */     //   1638	1670	1673	aacinternal/v
/*     */     //   1660	1686	1689	aacinternal/v
/*     */     //   1683	1705	1708	aacinternal/v
/*     */     //   1718	1726	1729	aacinternal/v
/*     */     //   1723	1753	1756	aacinternal/v
/*     */     //   1739	1774	1777	aacinternal/v
/*     */     //   1787	1795	1798	aacinternal/v
/*     */     //   1792	1825	1828	aacinternal/v
/*     */     //   1808	1841	1844	aacinternal/v
/*     */     //   1838	1863	1866	aacinternal/v
/*     */     //   1888	1902	1905	aacinternal/v
/*     */     //   1899	1923	1926	aacinternal/v
/*     */     //   1936	1991	1994	aacinternal/v
/*     */     //   1945	2018	2021	aacinternal/v
/*     */     //   2096	2117	2120	aacinternal/v
/*     */     //   2130	2137	2140	aacinternal/v
/*     */   }
/*     */   
/*     */   private double a(gb paramgb, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/kz.d : J
/*     */     //   3: lload_2
/*     */     //   4: lxor
/*     */     //   5: lstore_2
/*     */     //   6: lload_2
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 93242274808448
/*     */     //   11: lxor
/*     */     //   12: lstore #4
/*     */     //   14: pop2
/*     */     //   15: ldc2_w -4605755996210138079
/*     */     //   18: lload_2
/*     */     //   19: <illegal opcode> w : (JJ)I
/*     */     //   24: aload_1
/*     */     //   25: invokeinterface a : ()D
/*     */     //   30: dstore #7
/*     */     //   32: istore #6
/*     */     //   34: aload_1
/*     */     //   35: invokeinterface g : ()Z
/*     */     //   40: iload #6
/*     */     //   42: ifeq -> 77
/*     */     //   45: ifeq -> 69
/*     */     //   48: goto -> 61
/*     */     //   51: ldc2_w -4585257189711167658
/*     */     //   54: lload_2
/*     */     //   55: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   60: athrow
/*     */     //   61: dload #7
/*     */     //   63: ldc2_w 0.5
/*     */     //   66: dmul
/*     */     //   67: dstore #7
/*     */     //   69: aload_1
/*     */     //   70: lload #4
/*     */     //   72: invokeinterface k : (J)Z
/*     */     //   77: ifeq -> 98
/*     */     //   80: dload #7
/*     */     //   82: aload_1
/*     */     //   83: invokeinterface a : ()I
/*     */     //   88: iconst_1
/*     */     //   89: iadd
/*     */     //   90: i2d
/*     */     //   91: ldc2_w 0.1
/*     */     //   94: dmul
/*     */     //   95: dadd
/*     */     //   96: dstore #7
/*     */     //   98: dload #7
/*     */     //   100: dreturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #11	-> 24
/*     */     //   #132	-> 34
/*     */     //   #204	-> 69
/*     */     //   #147	-> 80
/*     */     //   #35	-> 98
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   34	48	51	aacinternal/v
/*     */   }
/*     */   
/*     */   public ci a(gb paramgb, long paramLong, Location paramLocation, boolean paramBoolean) {
/*  42 */     paramLong = d ^ paramLong; long l = paramLong ^ 0x42F59CD3D3E9L;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 352 */     gg gg = a(paramgb, true, l, new mZ(0.0F, 0.0F, false, false, false, false, false, false, paramLocation.getPitch(), paramLocation.getYaw(), 0));
/*     */     cJ cJ = new cJ(c, c, paramBoolean, false, true);
/*     */     return new ci(mZ.m, null, c, gg, cJ);
/*     */   }
/*     */   
/*     */   private void a(long paramLong, gb paramgb, mZ parammZ, Vector paramVector) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/kz.d : J
/*     */     //   3: lload_1
/*     */     //   4: lxor
/*     */     //   5: lstore_1
/*     */     //   6: lload_1
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 91457430376735
/*     */     //   11: lxor
/*     */     //   12: lstore #6
/*     */     //   14: pop2
/*     */     //   15: aload_3
/*     */     //   16: invokeinterface a : ()Lorg/bukkit/entity/EntityType;
/*     */     //   21: getstatic org/bukkit/entity/EntityType.PLAYER : Lorg/bukkit/entity/EntityType;
/*     */     //   24: if_acmpne -> 43
/*     */     //   27: ldc_w 0.2
/*     */     //   30: goto -> 46
/*     */     //   33: ldc2_w -2305066242073059575
/*     */     //   36: lload_1
/*     */     //   37: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   42: athrow
/*     */     //   43: ldc_w 0.4
/*     */     //   46: fstore #8
/*     */     //   48: aload #4
/*     */     //   50: invokevirtual a : ()F
/*     */     //   53: ldc 0.017453292
/*     */     //   55: fmul
/*     */     //   56: fstore #9
/*     */     //   58: aload #4
/*     */     //   60: invokevirtual c : ()Z
/*     */     //   63: ifeq -> 104
/*     */     //   66: new org/bukkit/util/Vector
/*     */     //   69: dup
/*     */     //   70: fload #9
/*     */     //   72: invokestatic b : (F)F
/*     */     //   75: fneg
/*     */     //   76: fload #8
/*     */     //   78: fmul
/*     */     //   79: fconst_0
/*     */     //   80: fload #9
/*     */     //   82: invokestatic a : (F)F
/*     */     //   85: fload #8
/*     */     //   87: fmul
/*     */     //   88: invokespecial <init> : (FFF)V
/*     */     //   91: goto -> 114
/*     */     //   94: ldc2_w -2305066242073059575
/*     */     //   97: lload_1
/*     */     //   98: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   103: athrow
/*     */     //   104: new org/bukkit/util/Vector
/*     */     //   107: dup
/*     */     //   108: iconst_0
/*     */     //   109: iconst_0
/*     */     //   110: iconst_0
/*     */     //   111: invokespecial <init> : (III)V
/*     */     //   114: astore #10
/*     */     //   116: aload_0
/*     */     //   117: aload_3
/*     */     //   118: lload #6
/*     */     //   120: invokespecial a : (Lme/konsolas/aac/gb;J)D
/*     */     //   123: dstore #11
/*     */     //   125: aload #5
/*     */     //   127: aload #10
/*     */     //   129: invokevirtual add : (Lorg/bukkit/util/Vector;)Lorg/bukkit/util/Vector;
/*     */     //   132: pop
/*     */     //   133: aload #5
/*     */     //   135: dload #11
/*     */     //   137: invokevirtual setY : (D)Lorg/bukkit/util/Vector;
/*     */     //   140: pop
/*     */     //   141: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #51	-> 15
/*     */     //   #279	-> 48
/*     */     //   #6	-> 58
/*     */     //   #295	-> 66
/*     */     //   #66	-> 116
/*     */     //   #40	-> 125
/*     */     //   #416	-> 133
/*     */     //   #16	-> 141
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   15	33	33	aacinternal/v
/*     */     //   58	94	94	aacinternal/v
/*     */   }
/*     */   
/*     */   public double a(gb paramgb, long paramLong, ci paramci) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/kz.d : J
/*     */     //   3: lload_2
/*     */     //   4: lxor
/*     */     //   5: lstore_2
/*     */     //   6: lload_2
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 129188207077059
/*     */     //   11: lxor
/*     */     //   12: lstore #5
/*     */     //   14: pop2
/*     */     //   15: ldc2_w -6869344986517147986
/*     */     //   18: lload_2
/*     */     //   19: <illegal opcode> w : (JJ)I
/*     */     //   24: istore #7
/*     */     //   26: aload_0
/*     */     //   27: getfield b : Lme/konsolas/aac/kP;
/*     */     //   30: lload #5
/*     */     //   32: getstatic me/konsolas/aac/kP.V1_13 : Lme/konsolas/aac/kP;
/*     */     //   35: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*     */     //   38: iload #7
/*     */     //   40: ifne -> 78
/*     */     //   43: ifeq -> 152
/*     */     //   46: goto -> 59
/*     */     //   49: ldc2_w -6868022157897375836
/*     */     //   52: lload_2
/*     */     //   53: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   58: athrow
/*     */     //   59: aload_1
/*     */     //   60: invokeinterface b : ()Z
/*     */     //   65: goto -> 78
/*     */     //   68: ldc2_w -6868022157897375836
/*     */     //   71: lload_2
/*     */     //   72: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   77: athrow
/*     */     //   78: iload #7
/*     */     //   80: ifne -> 143
/*     */     //   83: ifeq -> 152
/*     */     //   86: goto -> 99
/*     */     //   89: ldc2_w -6868022157897375836
/*     */     //   92: lload_2
/*     */     //   93: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   98: athrow
/*     */     //   99: aload #4
/*     */     //   101: invokevirtual a : ()Lme/konsolas/aac/cJ;
/*     */     //   104: invokevirtual a : ()Lorg/bukkit/util/Vector;
/*     */     //   107: invokevirtual getY : ()D
/*     */     //   110: iload #7
/*     */     //   112: ifne -> 149
/*     */     //   115: goto -> 128
/*     */     //   118: ldc2_w -6868022157897375836
/*     */     //   121: lload_2
/*     */     //   122: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   127: athrow
/*     */     //   128: dconst_0
/*     */     //   129: dcmpg
/*     */     //   130: goto -> 143
/*     */     //   133: ldc2_w -6868022157897375836
/*     */     //   136: lload_2
/*     */     //   137: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   142: athrow
/*     */     //   143: ifgt -> 152
/*     */     //   146: ldc2_w 0.01
/*     */     //   149: goto -> 155
/*     */     //   152: ldc2_w 0.08
/*     */     //   155: dreturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #102	-> 26
/*     */     //   #221	-> 60
/*     */     //   #333	-> 101
/*     */     //   #297	-> 155
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   26	46	49	aacinternal/v
/*     */     //   43	65	68	aacinternal/v
/*     */     //   78	86	89	aacinternal/v
/*     */     //   83	115	118	aacinternal/v
/*     */     //   99	130	133	aacinternal/v
/*     */   }
/*     */   
/*     */   private cJ a(gb paramgb, h8 paramh8, Vector paramVector1, long paramLong, Vector paramVector2, boolean paramBoolean1, boolean paramBoolean2) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/kz.d : J
/*     */     //   3: lload #4
/*     */     //   5: lxor
/*     */     //   6: lstore #4
/*     */     //   8: lload #4
/*     */     //   10: dup2
/*     */     //   11: ldc2_w 65235393340172
/*     */     //   14: lxor
/*     */     //   15: lstore #9
/*     */     //   17: dup2
/*     */     //   18: ldc2_w 79948647772883
/*     */     //   21: lxor
/*     */     //   22: dup2
/*     */     //   23: bipush #48
/*     */     //   25: lushr
/*     */     //   26: l2i
/*     */     //   27: istore #11
/*     */     //   29: dup2
/*     */     //   30: bipush #16
/*     */     //   32: lshl
/*     */     //   33: bipush #16
/*     */     //   35: lushr
/*     */     //   36: lstore #12
/*     */     //   38: pop2
/*     */     //   39: dup2
/*     */     //   40: ldc2_w 77562898351082
/*     */     //   43: lxor
/*     */     //   44: dup2
/*     */     //   45: bipush #48
/*     */     //   47: lushr
/*     */     //   48: l2i
/*     */     //   49: istore #14
/*     */     //   51: dup2
/*     */     //   52: bipush #16
/*     */     //   54: lshl
/*     */     //   55: bipush #16
/*     */     //   57: lushr
/*     */     //   58: lstore #15
/*     */     //   60: pop2
/*     */     //   61: dup2
/*     */     //   62: ldc2_w 72222858083825
/*     */     //   65: lxor
/*     */     //   66: lstore #17
/*     */     //   68: dup2
/*     */     //   69: ldc2_w 127461975190220
/*     */     //   72: lxor
/*     */     //   73: dup2
/*     */     //   74: bipush #32
/*     */     //   76: lushr
/*     */     //   77: l2i
/*     */     //   78: istore #19
/*     */     //   80: dup2
/*     */     //   81: bipush #32
/*     */     //   83: lshl
/*     */     //   84: bipush #56
/*     */     //   86: lushr
/*     */     //   87: l2i
/*     */     //   88: istore #20
/*     */     //   90: dup2
/*     */     //   91: bipush #40
/*     */     //   93: lshl
/*     */     //   94: bipush #40
/*     */     //   96: lushr
/*     */     //   97: l2i
/*     */     //   98: istore #21
/*     */     //   100: pop2
/*     */     //   101: dup2
/*     */     //   102: ldc2_w 56265121337613
/*     */     //   105: lxor
/*     */     //   106: lstore #22
/*     */     //   108: dup2
/*     */     //   109: ldc2_w 65379599953887
/*     */     //   112: lxor
/*     */     //   113: lstore #24
/*     */     //   115: dup2
/*     */     //   116: ldc2_w 107852882583444
/*     */     //   119: lxor
/*     */     //   120: lstore #26
/*     */     //   122: dup2
/*     */     //   123: ldc2_w 76862938348812
/*     */     //   126: lxor
/*     */     //   127: dup2
/*     */     //   128: bipush #48
/*     */     //   130: lushr
/*     */     //   131: l2i
/*     */     //   132: istore #28
/*     */     //   134: dup2
/*     */     //   135: bipush #16
/*     */     //   137: lshl
/*     */     //   138: bipush #32
/*     */     //   140: lushr
/*     */     //   141: l2i
/*     */     //   142: istore #29
/*     */     //   144: dup2
/*     */     //   145: bipush #48
/*     */     //   147: lshl
/*     */     //   148: bipush #48
/*     */     //   150: lushr
/*     */     //   151: l2i
/*     */     //   152: istore #30
/*     */     //   154: pop2
/*     */     //   155: pop2
/*     */     //   156: ldc2_w -1934197471581187812
/*     */     //   159: lload #4
/*     */     //   161: <illegal opcode> w : (JJ)I
/*     */     //   166: aload #6
/*     */     //   168: invokevirtual clone : ()Lorg/bukkit/util/Vector;
/*     */     //   171: astore #33
/*     */     //   173: istore #32
/*     */     //   175: aload_1
/*     */     //   176: invokeinterface r : ()Z
/*     */     //   181: iload #32
/*     */     //   183: ifeq -> 294
/*     */     //   186: ifeq -> 274
/*     */     //   189: goto -> 203
/*     */     //   192: ldc2_w -1918344228954400149
/*     */     //   195: lload #4
/*     */     //   197: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   202: athrow
/*     */     //   203: aload #33
/*     */     //   205: aload #6
/*     */     //   207: invokevirtual getX : ()D
/*     */     //   210: ldc2_w 0.25
/*     */     //   213: dmul
/*     */     //   214: invokevirtual setX : (D)Lorg/bukkit/util/Vector;
/*     */     //   217: pop
/*     */     //   218: aload #33
/*     */     //   220: aload #6
/*     */     //   222: invokevirtual getY : ()D
/*     */     //   225: ldc2_w 0.05000000074505806
/*     */     //   228: dmul
/*     */     //   229: invokevirtual setY : (D)Lorg/bukkit/util/Vector;
/*     */     //   232: pop
/*     */     //   233: aload #33
/*     */     //   235: aload #6
/*     */     //   237: invokevirtual getZ : ()D
/*     */     //   240: ldc2_w 0.25
/*     */     //   243: dmul
/*     */     //   244: invokevirtual setZ : (D)Lorg/bukkit/util/Vector;
/*     */     //   247: lload #4
/*     */     //   249: lconst_0
/*     */     //   250: lcmp
/*     */     //   251: iflt -> 361
/*     */     //   254: pop
/*     */     //   255: iload #32
/*     */     //   257: ifne -> 356
/*     */     //   260: goto -> 274
/*     */     //   263: ldc2_w -1918344228954400149
/*     */     //   266: lload #4
/*     */     //   268: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   273: athrow
/*     */     //   274: aload_1
/*     */     //   275: invokeinterface h : ()Z
/*     */     //   280: goto -> 294
/*     */     //   283: ldc2_w -1918344228954400149
/*     */     //   286: lload #4
/*     */     //   288: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   293: athrow
/*     */     //   294: ifeq -> 356
/*     */     //   297: aload #33
/*     */     //   299: aload #6
/*     */     //   301: invokevirtual getX : ()D
/*     */     //   304: ldc2_w 0.800000011920929
/*     */     //   307: dmul
/*     */     //   308: invokevirtual setX : (D)Lorg/bukkit/util/Vector;
/*     */     //   311: pop
/*     */     //   312: aload #33
/*     */     //   314: aload #6
/*     */     //   316: invokevirtual getY : ()D
/*     */     //   319: ldc2_w 0.75
/*     */     //   322: dmul
/*     */     //   323: invokevirtual setY : (D)Lorg/bukkit/util/Vector;
/*     */     //   326: pop
/*     */     //   327: aload #33
/*     */     //   329: aload #6
/*     */     //   331: invokevirtual getZ : ()D
/*     */     //   334: ldc2_w 0.800000011920929
/*     */     //   337: dmul
/*     */     //   338: invokevirtual setZ : (D)Lorg/bukkit/util/Vector;
/*     */     //   341: pop
/*     */     //   342: goto -> 356
/*     */     //   345: ldc2_w -1918344228954400149
/*     */     //   348: lload #4
/*     */     //   350: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   355: athrow
/*     */     //   356: aload #33
/*     */     //   358: invokevirtual clone : ()Lorg/bukkit/util/Vector;
/*     */     //   361: astore #34
/*     */     //   363: aload_1
/*     */     //   364: invokeinterface a : ()Lme/konsolas/aac/lq;
/*     */     //   369: ldc2_w -1.0E-7
/*     */     //   372: ldc2_w -1.0E-7
/*     */     //   375: ldc2_w -1.0E-7
/*     */     //   378: invokevirtual c : (DDD)Lme/konsolas/aac/lq;
/*     */     //   381: astore #35
/*     */     //   383: aload #35
/*     */     //   385: astore #36
/*     */     //   387: aload_0
/*     */     //   388: aload_2
/*     */     //   389: aload #35
/*     */     //   391: iload #14
/*     */     //   393: i2c
/*     */     //   394: lload #15
/*     */     //   396: aload #6
/*     */     //   398: invokevirtual a : (CJLorg/bukkit/util/Vector;)Lme/konsolas/aac/lq;
/*     */     //   401: iload #11
/*     */     //   403: i2s
/*     */     //   404: lload #12
/*     */     //   406: invokespecial a : (Lme/konsolas/aac/h8;Lme/konsolas/aac/lq;SJ)Ljava/util/Collection;
/*     */     //   409: astore #37
/*     */     //   411: iload #7
/*     */     //   413: iload #32
/*     */     //   415: ifeq -> 1942
/*     */     //   418: ifeq -> 1913
/*     */     //   421: goto -> 435
/*     */     //   424: ldc2_w -1918344228954400149
/*     */     //   427: lload #4
/*     */     //   429: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   434: athrow
/*     */     //   435: iload #8
/*     */     //   437: iload #32
/*     */     //   439: ifeq -> 1942
/*     */     //   442: goto -> 456
/*     */     //   445: ldc2_w -1918344228954400149
/*     */     //   448: lload #4
/*     */     //   450: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   455: athrow
/*     */     //   456: ifeq -> 1913
/*     */     //   459: goto -> 473
/*     */     //   462: ldc2_w -1918344228954400149
/*     */     //   465: lload #4
/*     */     //   467: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   472: athrow
/*     */     //   473: aload_0
/*     */     //   474: getfield b : Lme/konsolas/aac/kP;
/*     */     //   477: lload #9
/*     */     //   479: getstatic me/konsolas/aac/kP.V1_9 : Lme/konsolas/aac/kP;
/*     */     //   482: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*     */     //   485: ifeq -> 523
/*     */     //   488: goto -> 502
/*     */     //   491: ldc2_w -1918344228954400149
/*     */     //   494: lload #4
/*     */     //   496: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   501: athrow
/*     */     //   502: aload_1
/*     */     //   503: invokeinterface c : ()D
/*     */     //   508: dneg
/*     */     //   509: goto -> 526
/*     */     //   512: ldc2_w -1918344228954400149
/*     */     //   515: lload #4
/*     */     //   517: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   522: athrow
/*     */     //   523: ldc2_w -1.0
/*     */     //   526: dstore #38
/*     */     //   528: aload #33
/*     */     //   530: invokevirtual getX : ()D
/*     */     //   533: dconst_0
/*     */     //   534: dcmpl
/*     */     //   535: ifeq -> 873
/*     */     //   538: aload_0
/*     */     //   539: lload #26
/*     */     //   541: aload_2
/*     */     //   542: aload_1
/*     */     //   543: invokeinterface a : ()Lme/konsolas/aac/lq;
/*     */     //   548: aload #33
/*     */     //   550: invokevirtual getX : ()D
/*     */     //   553: dload #38
/*     */     //   555: dconst_0
/*     */     //   556: invokespecial a : (JLme/konsolas/aac/h8;Lme/konsolas/aac/lq;DDD)Z
/*     */     //   559: iload #32
/*     */     //   561: lload #4
/*     */     //   563: lconst_0
/*     */     //   564: lcmp
/*     */     //   565: iflt -> 573
/*     */     //   568: ifeq -> 887
/*     */     //   571: iload #32
/*     */     //   573: ifeq -> 887
/*     */     //   576: goto -> 590
/*     */     //   579: ldc2_w -1918344228954400149
/*     */     //   582: lload #4
/*     */     //   584: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   589: athrow
/*     */     //   590: ifeq -> 873
/*     */     //   593: goto -> 607
/*     */     //   596: ldc2_w -1918344228954400149
/*     */     //   599: lload #4
/*     */     //   601: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   606: athrow
/*     */     //   607: aload #33
/*     */     //   609: invokevirtual getX : ()D
/*     */     //   612: ldc2_w 0.05
/*     */     //   615: dcmpg
/*     */     //   616: iload #32
/*     */     //   618: ifeq -> 777
/*     */     //   621: goto -> 635
/*     */     //   624: ldc2_w -1918344228954400149
/*     */     //   627: lload #4
/*     */     //   629: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   634: athrow
/*     */     //   635: ifge -> 737
/*     */     //   638: goto -> 652
/*     */     //   641: ldc2_w -1918344228954400149
/*     */     //   644: lload #4
/*     */     //   646: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   651: athrow
/*     */     //   652: aload #33
/*     */     //   654: invokevirtual getX : ()D
/*     */     //   657: ldc2_w -0.05
/*     */     //   660: dcmpl
/*     */     //   661: lload #4
/*     */     //   663: lconst_0
/*     */     //   664: lcmp
/*     */     //   665: iflt -> 777
/*     */     //   668: iload #32
/*     */     //   670: ifeq -> 777
/*     */     //   673: goto -> 687
/*     */     //   676: ldc2_w -1918344228954400149
/*     */     //   679: lload #4
/*     */     //   681: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   686: athrow
/*     */     //   687: iflt -> 737
/*     */     //   690: goto -> 704
/*     */     //   693: ldc2_w -1918344228954400149
/*     */     //   696: lload #4
/*     */     //   698: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   703: athrow
/*     */     //   704: aload #33
/*     */     //   706: dconst_0
/*     */     //   707: invokevirtual setX : (D)Lorg/bukkit/util/Vector;
/*     */     //   710: pop
/*     */     //   711: iload #32
/*     */     //   713: lload #4
/*     */     //   715: lconst_0
/*     */     //   716: lcmp
/*     */     //   717: iflt -> 870
/*     */     //   720: ifne -> 857
/*     */     //   723: goto -> 737
/*     */     //   726: ldc2_w -1918344228954400149
/*     */     //   729: lload #4
/*     */     //   731: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   736: athrow
/*     */     //   737: aload #33
/*     */     //   739: iload #32
/*     */     //   741: ifeq -> 856
/*     */     //   744: goto -> 758
/*     */     //   747: ldc2_w -1918344228954400149
/*     */     //   750: lload #4
/*     */     //   752: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   757: athrow
/*     */     //   758: invokevirtual getX : ()D
/*     */     //   761: dconst_0
/*     */     //   762: dcmpl
/*     */     //   763: goto -> 777
/*     */     //   766: ldc2_w -1918344228954400149
/*     */     //   769: lload #4
/*     */     //   771: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   776: athrow
/*     */     //   777: lload #4
/*     */     //   779: lconst_0
/*     */     //   780: lcmp
/*     */     //   781: iflt -> 804
/*     */     //   784: ifle -> 828
/*     */     //   787: aload #33
/*     */     //   789: aload #33
/*     */     //   791: invokevirtual getX : ()D
/*     */     //   794: ldc2_w 0.05
/*     */     //   797: dsub
/*     */     //   798: invokevirtual setX : (D)Lorg/bukkit/util/Vector;
/*     */     //   801: pop
/*     */     //   802: iload #32
/*     */     //   804: lload #4
/*     */     //   806: lconst_0
/*     */     //   807: lcmp
/*     */     //   808: iflt -> 870
/*     */     //   811: ifne -> 857
/*     */     //   814: goto -> 828
/*     */     //   817: ldc2_w -1918344228954400149
/*     */     //   820: lload #4
/*     */     //   822: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   827: athrow
/*     */     //   828: aload #33
/*     */     //   830: aload #33
/*     */     //   832: invokevirtual getX : ()D
/*     */     //   835: ldc2_w 0.05
/*     */     //   838: dadd
/*     */     //   839: invokevirtual setX : (D)Lorg/bukkit/util/Vector;
/*     */     //   842: goto -> 856
/*     */     //   845: ldc2_w -1918344228954400149
/*     */     //   848: lload #4
/*     */     //   850: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   855: athrow
/*     */     //   856: pop
/*     */     //   857: aload #34
/*     */     //   859: aload #33
/*     */     //   861: invokevirtual getX : ()D
/*     */     //   864: invokevirtual setX : (D)Lorg/bukkit/util/Vector;
/*     */     //   867: pop
/*     */     //   868: iload #32
/*     */     //   870: ifne -> 528
/*     */     //   873: aload #33
/*     */     //   875: invokevirtual getZ : ()D
/*     */     //   878: dconst_0
/*     */     //   879: lload #4
/*     */     //   881: lconst_0
/*     */     //   882: lcmp
/*     */     //   883: ifle -> 1252
/*     */     //   886: dcmpl
/*     */     //   887: lload #4
/*     */     //   889: lconst_0
/*     */     //   890: lcmp
/*     */     //   891: iflt -> 918
/*     */     //   894: ifeq -> 1246
/*     */     //   897: aload_0
/*     */     //   898: lload #26
/*     */     //   900: aload_2
/*     */     //   901: aload_1
/*     */     //   902: invokeinterface a : ()Lme/konsolas/aac/lq;
/*     */     //   907: dconst_0
/*     */     //   908: dload #38
/*     */     //   910: aload #33
/*     */     //   912: invokevirtual getZ : ()D
/*     */     //   915: invokespecial a : (JLme/konsolas/aac/h8;Lme/konsolas/aac/lq;DDD)Z
/*     */     //   918: iload #32
/*     */     //   920: ifeq -> 1260
/*     */     //   923: goto -> 937
/*     */     //   926: ldc2_w -1918344228954400149
/*     */     //   929: lload #4
/*     */     //   931: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   936: athrow
/*     */     //   937: lload #4
/*     */     //   939: lconst_0
/*     */     //   940: lcmp
/*     */     //   941: iflt -> 1260
/*     */     //   944: iload #32
/*     */     //   946: ifeq -> 1260
/*     */     //   949: goto -> 963
/*     */     //   952: ldc2_w -1918344228954400149
/*     */     //   955: lload #4
/*     */     //   957: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   962: athrow
/*     */     //   963: ifeq -> 1246
/*     */     //   966: goto -> 980
/*     */     //   969: ldc2_w -1918344228954400149
/*     */     //   972: lload #4
/*     */     //   974: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   979: athrow
/*     */     //   980: aload #33
/*     */     //   982: invokevirtual getZ : ()D
/*     */     //   985: ldc2_w 0.05
/*     */     //   988: dcmpg
/*     */     //   989: iload #32
/*     */     //   991: ifeq -> 1150
/*     */     //   994: goto -> 1008
/*     */     //   997: ldc2_w -1918344228954400149
/*     */     //   1000: lload #4
/*     */     //   1002: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1007: athrow
/*     */     //   1008: ifge -> 1110
/*     */     //   1011: goto -> 1025
/*     */     //   1014: ldc2_w -1918344228954400149
/*     */     //   1017: lload #4
/*     */     //   1019: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1024: athrow
/*     */     //   1025: aload #33
/*     */     //   1027: invokevirtual getZ : ()D
/*     */     //   1030: ldc2_w -0.05
/*     */     //   1033: dcmpl
/*     */     //   1034: lload #4
/*     */     //   1036: lconst_0
/*     */     //   1037: lcmp
/*     */     //   1038: ifle -> 1150
/*     */     //   1041: iload #32
/*     */     //   1043: ifeq -> 1150
/*     */     //   1046: goto -> 1060
/*     */     //   1049: ldc2_w -1918344228954400149
/*     */     //   1052: lload #4
/*     */     //   1054: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1059: athrow
/*     */     //   1060: iflt -> 1110
/*     */     //   1063: goto -> 1077
/*     */     //   1066: ldc2_w -1918344228954400149
/*     */     //   1069: lload #4
/*     */     //   1071: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1076: athrow
/*     */     //   1077: aload #33
/*     */     //   1079: dconst_0
/*     */     //   1080: invokevirtual setZ : (D)Lorg/bukkit/util/Vector;
/*     */     //   1083: pop
/*     */     //   1084: iload #32
/*     */     //   1086: lload #4
/*     */     //   1088: lconst_0
/*     */     //   1089: lcmp
/*     */     //   1090: iflt -> 1243
/*     */     //   1093: ifne -> 1230
/*     */     //   1096: goto -> 1110
/*     */     //   1099: ldc2_w -1918344228954400149
/*     */     //   1102: lload #4
/*     */     //   1104: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1109: athrow
/*     */     //   1110: aload #33
/*     */     //   1112: iload #32
/*     */     //   1114: ifeq -> 1229
/*     */     //   1117: goto -> 1131
/*     */     //   1120: ldc2_w -1918344228954400149
/*     */     //   1123: lload #4
/*     */     //   1125: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1130: athrow
/*     */     //   1131: invokevirtual getZ : ()D
/*     */     //   1134: dconst_0
/*     */     //   1135: dcmpl
/*     */     //   1136: goto -> 1150
/*     */     //   1139: ldc2_w -1918344228954400149
/*     */     //   1142: lload #4
/*     */     //   1144: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1149: athrow
/*     */     //   1150: lload #4
/*     */     //   1152: lconst_0
/*     */     //   1153: lcmp
/*     */     //   1154: iflt -> 1177
/*     */     //   1157: ifle -> 1201
/*     */     //   1160: aload #33
/*     */     //   1162: aload #33
/*     */     //   1164: invokevirtual getZ : ()D
/*     */     //   1167: ldc2_w 0.05
/*     */     //   1170: dsub
/*     */     //   1171: invokevirtual setZ : (D)Lorg/bukkit/util/Vector;
/*     */     //   1174: pop
/*     */     //   1175: iload #32
/*     */     //   1177: lload #4
/*     */     //   1179: lconst_0
/*     */     //   1180: lcmp
/*     */     //   1181: ifle -> 1243
/*     */     //   1184: ifne -> 1230
/*     */     //   1187: goto -> 1201
/*     */     //   1190: ldc2_w -1918344228954400149
/*     */     //   1193: lload #4
/*     */     //   1195: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1200: athrow
/*     */     //   1201: aload #33
/*     */     //   1203: aload #33
/*     */     //   1205: invokevirtual getZ : ()D
/*     */     //   1208: ldc2_w 0.05
/*     */     //   1211: dadd
/*     */     //   1212: invokevirtual setZ : (D)Lorg/bukkit/util/Vector;
/*     */     //   1215: goto -> 1229
/*     */     //   1218: ldc2_w -1918344228954400149
/*     */     //   1221: lload #4
/*     */     //   1223: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1228: athrow
/*     */     //   1229: pop
/*     */     //   1230: aload #34
/*     */     //   1232: aload #33
/*     */     //   1234: invokevirtual getZ : ()D
/*     */     //   1237: invokevirtual setZ : (D)Lorg/bukkit/util/Vector;
/*     */     //   1240: pop
/*     */     //   1241: iload #32
/*     */     //   1243: ifne -> 873
/*     */     //   1246: aload #33
/*     */     //   1248: invokevirtual getX : ()D
/*     */     //   1251: dconst_0
/*     */     //   1252: lload #4
/*     */     //   1254: lconst_0
/*     */     //   1255: lcmp
/*     */     //   1256: iflt -> 1974
/*     */     //   1259: dcmpl
/*     */     //   1260: lload #4
/*     */     //   1262: lconst_0
/*     */     //   1263: lcmp
/*     */     //   1264: ifle -> 1277
/*     */     //   1267: ifeq -> 1913
/*     */     //   1270: aload #33
/*     */     //   1272: invokevirtual getZ : ()D
/*     */     //   1275: dconst_0
/*     */     //   1276: dcmpl
/*     */     //   1277: iload #32
/*     */     //   1279: ifeq -> 1942
/*     */     //   1282: goto -> 1296
/*     */     //   1285: ldc2_w -1918344228954400149
/*     */     //   1288: lload #4
/*     */     //   1290: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1295: athrow
/*     */     //   1296: iload #32
/*     */     //   1298: ifeq -> 1942
/*     */     //   1301: goto -> 1315
/*     */     //   1304: ldc2_w -1918344228954400149
/*     */     //   1307: lload #4
/*     */     //   1309: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1314: athrow
/*     */     //   1315: ifeq -> 1913
/*     */     //   1318: goto -> 1332
/*     */     //   1321: ldc2_w -1918344228954400149
/*     */     //   1324: lload #4
/*     */     //   1326: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1331: athrow
/*     */     //   1332: aload_0
/*     */     //   1333: lload #26
/*     */     //   1335: aload_2
/*     */     //   1336: aload_1
/*     */     //   1337: invokeinterface a : ()Lme/konsolas/aac/lq;
/*     */     //   1342: aload #33
/*     */     //   1344: invokevirtual getX : ()D
/*     */     //   1347: dload #38
/*     */     //   1349: aload #33
/*     */     //   1351: invokevirtual getZ : ()D
/*     */     //   1354: invokespecial a : (JLme/konsolas/aac/h8;Lme/konsolas/aac/lq;DDD)Z
/*     */     //   1357: iload #32
/*     */     //   1359: lload #4
/*     */     //   1361: lconst_0
/*     */     //   1362: lcmp
/*     */     //   1363: iflt -> 1944
/*     */     //   1366: ifeq -> 1942
/*     */     //   1369: goto -> 1383
/*     */     //   1372: ldc2_w -1918344228954400149
/*     */     //   1375: lload #4
/*     */     //   1377: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1382: athrow
/*     */     //   1383: ifeq -> 1913
/*     */     //   1386: goto -> 1400
/*     */     //   1389: ldc2_w -1918344228954400149
/*     */     //   1392: lload #4
/*     */     //   1394: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1399: athrow
/*     */     //   1400: aload #33
/*     */     //   1402: invokevirtual getX : ()D
/*     */     //   1405: ldc2_w 0.05
/*     */     //   1408: dcmpg
/*     */     //   1409: iload #32
/*     */     //   1411: ifeq -> 1570
/*     */     //   1414: goto -> 1428
/*     */     //   1417: ldc2_w -1918344228954400149
/*     */     //   1420: lload #4
/*     */     //   1422: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1427: athrow
/*     */     //   1428: ifge -> 1530
/*     */     //   1431: goto -> 1445
/*     */     //   1434: ldc2_w -1918344228954400149
/*     */     //   1437: lload #4
/*     */     //   1439: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1444: athrow
/*     */     //   1445: aload #33
/*     */     //   1447: invokevirtual getX : ()D
/*     */     //   1450: ldc2_w -0.05
/*     */     //   1453: dcmpl
/*     */     //   1454: lload #4
/*     */     //   1456: lconst_0
/*     */     //   1457: lcmp
/*     */     //   1458: iflt -> 1570
/*     */     //   1461: iload #32
/*     */     //   1463: ifeq -> 1570
/*     */     //   1466: goto -> 1480
/*     */     //   1469: ldc2_w -1918344228954400149
/*     */     //   1472: lload #4
/*     */     //   1474: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1479: athrow
/*     */     //   1480: iflt -> 1530
/*     */     //   1483: goto -> 1497
/*     */     //   1486: ldc2_w -1918344228954400149
/*     */     //   1489: lload #4
/*     */     //   1491: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1496: athrow
/*     */     //   1497: aload #33
/*     */     //   1499: dconst_0
/*     */     //   1500: invokevirtual setX : (D)Lorg/bukkit/util/Vector;
/*     */     //   1503: pop
/*     */     //   1504: iload #32
/*     */     //   1506: lload #4
/*     */     //   1508: lconst_0
/*     */     //   1509: lcmp
/*     */     //   1510: ifle -> 1670
/*     */     //   1513: ifne -> 1650
/*     */     //   1516: goto -> 1530
/*     */     //   1519: ldc2_w -1918344228954400149
/*     */     //   1522: lload #4
/*     */     //   1524: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1529: athrow
/*     */     //   1530: aload #33
/*     */     //   1532: iload #32
/*     */     //   1534: ifeq -> 1649
/*     */     //   1537: goto -> 1551
/*     */     //   1540: ldc2_w -1918344228954400149
/*     */     //   1543: lload #4
/*     */     //   1545: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1550: athrow
/*     */     //   1551: invokevirtual getX : ()D
/*     */     //   1554: dconst_0
/*     */     //   1555: dcmpl
/*     */     //   1556: goto -> 1570
/*     */     //   1559: ldc2_w -1918344228954400149
/*     */     //   1562: lload #4
/*     */     //   1564: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1569: athrow
/*     */     //   1570: lload #4
/*     */     //   1572: lconst_0
/*     */     //   1573: lcmp
/*     */     //   1574: iflt -> 1597
/*     */     //   1577: ifle -> 1621
/*     */     //   1580: aload #33
/*     */     //   1582: aload #33
/*     */     //   1584: invokevirtual getX : ()D
/*     */     //   1587: ldc2_w 0.05
/*     */     //   1590: dsub
/*     */     //   1591: invokevirtual setX : (D)Lorg/bukkit/util/Vector;
/*     */     //   1594: pop
/*     */     //   1595: iload #32
/*     */     //   1597: lload #4
/*     */     //   1599: lconst_0
/*     */     //   1600: lcmp
/*     */     //   1601: iflt -> 1670
/*     */     //   1604: ifne -> 1650
/*     */     //   1607: goto -> 1621
/*     */     //   1610: ldc2_w -1918344228954400149
/*     */     //   1613: lload #4
/*     */     //   1615: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1620: athrow
/*     */     //   1621: aload #33
/*     */     //   1623: aload #33
/*     */     //   1625: invokevirtual getX : ()D
/*     */     //   1628: ldc2_w 0.05
/*     */     //   1631: dadd
/*     */     //   1632: invokevirtual setX : (D)Lorg/bukkit/util/Vector;
/*     */     //   1635: goto -> 1649
/*     */     //   1638: ldc2_w -1918344228954400149
/*     */     //   1641: lload #4
/*     */     //   1643: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1648: athrow
/*     */     //   1649: pop
/*     */     //   1650: aload #34
/*     */     //   1652: aload #33
/*     */     //   1654: invokevirtual getX : ()D
/*     */     //   1657: invokevirtual setX : (D)Lorg/bukkit/util/Vector;
/*     */     //   1660: pop
/*     */     //   1661: aload #33
/*     */     //   1663: invokevirtual getZ : ()D
/*     */     //   1666: ldc2_w 0.05
/*     */     //   1669: dcmpg
/*     */     //   1670: iload #32
/*     */     //   1672: ifeq -> 1817
/*     */     //   1675: ifge -> 1777
/*     */     //   1678: goto -> 1692
/*     */     //   1681: ldc2_w -1918344228954400149
/*     */     //   1684: lload #4
/*     */     //   1686: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1691: athrow
/*     */     //   1692: aload #33
/*     */     //   1694: invokevirtual getZ : ()D
/*     */     //   1697: ldc2_w -0.05
/*     */     //   1700: dcmpl
/*     */     //   1701: lload #4
/*     */     //   1703: lconst_0
/*     */     //   1704: lcmp
/*     */     //   1705: ifle -> 1817
/*     */     //   1708: iload #32
/*     */     //   1710: ifeq -> 1817
/*     */     //   1713: goto -> 1727
/*     */     //   1716: ldc2_w -1918344228954400149
/*     */     //   1719: lload #4
/*     */     //   1721: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1726: athrow
/*     */     //   1727: iflt -> 1777
/*     */     //   1730: goto -> 1744
/*     */     //   1733: ldc2_w -1918344228954400149
/*     */     //   1736: lload #4
/*     */     //   1738: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1743: athrow
/*     */     //   1744: aload #33
/*     */     //   1746: dconst_0
/*     */     //   1747: invokevirtual setZ : (D)Lorg/bukkit/util/Vector;
/*     */     //   1750: pop
/*     */     //   1751: iload #32
/*     */     //   1753: lload #4
/*     */     //   1755: lconst_0
/*     */     //   1756: lcmp
/*     */     //   1757: iflt -> 1910
/*     */     //   1760: ifne -> 1897
/*     */     //   1763: goto -> 1777
/*     */     //   1766: ldc2_w -1918344228954400149
/*     */     //   1769: lload #4
/*     */     //   1771: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1776: athrow
/*     */     //   1777: aload #33
/*     */     //   1779: iload #32
/*     */     //   1781: ifeq -> 1896
/*     */     //   1784: goto -> 1798
/*     */     //   1787: ldc2_w -1918344228954400149
/*     */     //   1790: lload #4
/*     */     //   1792: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1797: athrow
/*     */     //   1798: invokevirtual getZ : ()D
/*     */     //   1801: dconst_0
/*     */     //   1802: dcmpl
/*     */     //   1803: goto -> 1817
/*     */     //   1806: ldc2_w -1918344228954400149
/*     */     //   1809: lload #4
/*     */     //   1811: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1816: athrow
/*     */     //   1817: lload #4
/*     */     //   1819: lconst_0
/*     */     //   1820: lcmp
/*     */     //   1821: iflt -> 1844
/*     */     //   1824: ifle -> 1868
/*     */     //   1827: aload #33
/*     */     //   1829: aload #33
/*     */     //   1831: invokevirtual getZ : ()D
/*     */     //   1834: ldc2_w 0.05
/*     */     //   1837: dsub
/*     */     //   1838: invokevirtual setZ : (D)Lorg/bukkit/util/Vector;
/*     */     //   1841: pop
/*     */     //   1842: iload #32
/*     */     //   1844: lload #4
/*     */     //   1846: lconst_0
/*     */     //   1847: lcmp
/*     */     //   1848: ifle -> 1910
/*     */     //   1851: ifne -> 1897
/*     */     //   1854: goto -> 1868
/*     */     //   1857: ldc2_w -1918344228954400149
/*     */     //   1860: lload #4
/*     */     //   1862: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1867: athrow
/*     */     //   1868: aload #33
/*     */     //   1870: aload #33
/*     */     //   1872: invokevirtual getZ : ()D
/*     */     //   1875: ldc2_w 0.05
/*     */     //   1878: dadd
/*     */     //   1879: invokevirtual setZ : (D)Lorg/bukkit/util/Vector;
/*     */     //   1882: goto -> 1896
/*     */     //   1885: ldc2_w -1918344228954400149
/*     */     //   1888: lload #4
/*     */     //   1890: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1895: athrow
/*     */     //   1896: pop
/*     */     //   1897: aload #34
/*     */     //   1899: aload #33
/*     */     //   1901: invokevirtual getZ : ()D
/*     */     //   1904: invokevirtual setZ : (D)Lorg/bukkit/util/Vector;
/*     */     //   1907: pop
/*     */     //   1908: iload #32
/*     */     //   1910: ifne -> 1246
/*     */     //   1913: aload_0
/*     */     //   1914: aload #33
/*     */     //   1916: aload #35
/*     */     //   1918: iload #28
/*     */     //   1920: i2s
/*     */     //   1921: iload #29
/*     */     //   1923: iload #30
/*     */     //   1925: i2c
/*     */     //   1926: aload #37
/*     */     //   1928: invokespecial a : (Lorg/bukkit/util/Vector;Lme/konsolas/aac/lq;SICLjava/util/Collection;)Lme/konsolas/aac/lq;
/*     */     //   1931: astore #35
/*     */     //   1933: lload #4
/*     */     //   1935: lconst_0
/*     */     //   1936: lcmp
/*     */     //   1937: ifle -> 2061
/*     */     //   1940: iload #7
/*     */     //   1942: iload #32
/*     */     //   1944: ifeq -> 2062
/*     */     //   1947: ifne -> 2061
/*     */     //   1950: goto -> 1964
/*     */     //   1953: ldc2_w -1918344228954400149
/*     */     //   1956: lload #4
/*     */     //   1958: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1963: athrow
/*     */     //   1964: aload #33
/*     */     //   1966: invokevirtual getY : ()D
/*     */     //   1969: aload #34
/*     */     //   1971: invokevirtual getY : ()D
/*     */     //   1974: dcmpl
/*     */     //   1975: iload #32
/*     */     //   1977: lload #4
/*     */     //   1979: lconst_0
/*     */     //   1980: lcmp
/*     */     //   1981: iflt -> 2041
/*     */     //   1984: ifeq -> 2039
/*     */     //   1987: goto -> 2001
/*     */     //   1990: ldc2_w -1918344228954400149
/*     */     //   1993: lload #4
/*     */     //   1995: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2000: athrow
/*     */     //   2001: ifeq -> 2065
/*     */     //   2004: goto -> 2018
/*     */     //   2007: ldc2_w -1918344228954400149
/*     */     //   2010: lload #4
/*     */     //   2012: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2017: athrow
/*     */     //   2018: aload #34
/*     */     //   2020: invokevirtual getY : ()D
/*     */     //   2023: dconst_0
/*     */     //   2024: dcmpg
/*     */     //   2025: goto -> 2039
/*     */     //   2028: ldc2_w -1918344228954400149
/*     */     //   2031: lload #4
/*     */     //   2033: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2038: athrow
/*     */     //   2039: iload #32
/*     */     //   2041: ifeq -> 2062
/*     */     //   2044: ifge -> 2065
/*     */     //   2047: goto -> 2061
/*     */     //   2050: ldc2_w -1918344228954400149
/*     */     //   2053: lload #4
/*     */     //   2055: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2060: athrow
/*     */     //   2061: iconst_1
/*     */     //   2062: goto -> 2066
/*     */     //   2065: iconst_0
/*     */     //   2066: istore #38
/*     */     //   2068: iload #38
/*     */     //   2070: iload #32
/*     */     //   2072: ifeq -> 3726
/*     */     //   2075: ifeq -> 3715
/*     */     //   2078: goto -> 2092
/*     */     //   2081: ldc2_w -1918344228954400149
/*     */     //   2084: lload #4
/*     */     //   2086: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2091: athrow
/*     */     //   2092: aload #33
/*     */     //   2094: invokevirtual getX : ()D
/*     */     //   2097: aload #34
/*     */     //   2099: invokevirtual getX : ()D
/*     */     //   2102: dcmpl
/*     */     //   2103: iload #32
/*     */     //   2105: ifeq -> 2219
/*     */     //   2108: goto -> 2122
/*     */     //   2111: ldc2_w -1918344228954400149
/*     */     //   2114: lload #4
/*     */     //   2116: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2121: athrow
/*     */     //   2122: lload #4
/*     */     //   2124: lconst_0
/*     */     //   2125: lcmp
/*     */     //   2126: iflt -> 2205
/*     */     //   2129: ifne -> 2193
/*     */     //   2132: goto -> 2146
/*     */     //   2135: ldc2_w -1918344228954400149
/*     */     //   2138: lload #4
/*     */     //   2140: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2145: athrow
/*     */     //   2146: aload #33
/*     */     //   2148: invokevirtual getZ : ()D
/*     */     //   2151: aload #34
/*     */     //   2153: invokevirtual getZ : ()D
/*     */     //   2156: dcmpl
/*     */     //   2157: iload #32
/*     */     //   2159: ifeq -> 3726
/*     */     //   2162: goto -> 2176
/*     */     //   2165: ldc2_w -1918344228954400149
/*     */     //   2168: lload #4
/*     */     //   2170: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2175: athrow
/*     */     //   2176: ifeq -> 3715
/*     */     //   2179: goto -> 2193
/*     */     //   2182: ldc2_w -1918344228954400149
/*     */     //   2185: lload #4
/*     */     //   2187: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2192: athrow
/*     */     //   2193: aload_0
/*     */     //   2194: getfield b : Lme/konsolas/aac/kP;
/*     */     //   2197: lload #9
/*     */     //   2199: getstatic me/konsolas/aac/kP.V1_14 : Lme/konsolas/aac/kP;
/*     */     //   2202: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*     */     //   2205: goto -> 2219
/*     */     //   2208: ldc2_w -1918344228954400149
/*     */     //   2211: lload #4
/*     */     //   2213: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2218: athrow
/*     */     //   2219: ifeq -> 2645
/*     */     //   2222: new org/bukkit/util/Vector
/*     */     //   2225: dup
/*     */     //   2226: aload #34
/*     */     //   2228: invokevirtual getX : ()D
/*     */     //   2231: aload_1
/*     */     //   2232: invokeinterface c : ()D
/*     */     //   2237: aload #34
/*     */     //   2239: invokevirtual getZ : ()D
/*     */     //   2242: invokespecial <init> : (DDD)V
/*     */     //   2245: astore #39
/*     */     //   2247: new org/bukkit/util/Vector
/*     */     //   2250: dup
/*     */     //   2251: dconst_0
/*     */     //   2252: aload_1
/*     */     //   2253: invokeinterface c : ()D
/*     */     //   2258: dconst_0
/*     */     //   2259: invokespecial <init> : (DDD)V
/*     */     //   2262: astore #40
/*     */     //   2264: aload_0
/*     */     //   2265: aload #39
/*     */     //   2267: aload #36
/*     */     //   2269: iload #28
/*     */     //   2271: i2s
/*     */     //   2272: iload #29
/*     */     //   2274: iload #30
/*     */     //   2276: i2c
/*     */     //   2277: aload #37
/*     */     //   2279: invokespecial a : (Lorg/bukkit/util/Vector;Lme/konsolas/aac/lq;SICLjava/util/Collection;)Lme/konsolas/aac/lq;
/*     */     //   2282: pop
/*     */     //   2283: aload_0
/*     */     //   2284: aload #40
/*     */     //   2286: aload #36
/*     */     //   2288: new org/bukkit/util/Vector
/*     */     //   2291: dup
/*     */     //   2292: aload #34
/*     */     //   2294: invokevirtual getX : ()D
/*     */     //   2297: dconst_0
/*     */     //   2298: aload #34
/*     */     //   2300: invokevirtual getZ : ()D
/*     */     //   2303: invokespecial <init> : (DDD)V
/*     */     //   2306: astore #31
/*     */     //   2308: iload #14
/*     */     //   2310: i2c
/*     */     //   2311: lload #15
/*     */     //   2313: aload #31
/*     */     //   2315: invokevirtual a : (CJLorg/bukkit/util/Vector;)Lme/konsolas/aac/lq;
/*     */     //   2318: iload #28
/*     */     //   2320: i2s
/*     */     //   2321: iload #29
/*     */     //   2323: iload #30
/*     */     //   2325: i2c
/*     */     //   2326: aload #37
/*     */     //   2328: invokespecial a : (Lorg/bukkit/util/Vector;Lme/konsolas/aac/lq;SICLjava/util/Collection;)Lme/konsolas/aac/lq;
/*     */     //   2331: pop
/*     */     //   2332: aload #40
/*     */     //   2334: invokevirtual getY : ()D
/*     */     //   2337: aload_1
/*     */     //   2338: invokeinterface c : ()D
/*     */     //   2343: dcmpg
/*     */     //   2344: iload #32
/*     */     //   2346: ifeq -> 2556
/*     */     //   2349: ifge -> 2490
/*     */     //   2352: goto -> 2366
/*     */     //   2355: ldc2_w -1918344228954400149
/*     */     //   2358: lload #4
/*     */     //   2360: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2365: athrow
/*     */     //   2366: new org/bukkit/util/Vector
/*     */     //   2369: dup
/*     */     //   2370: aload #34
/*     */     //   2372: invokevirtual getX : ()D
/*     */     //   2375: dconst_0
/*     */     //   2376: aload #34
/*     */     //   2378: invokevirtual getZ : ()D
/*     */     //   2381: invokespecial <init> : (DDD)V
/*     */     //   2384: astore #41
/*     */     //   2386: aload_0
/*     */     //   2387: aload #41
/*     */     //   2389: aload #36
/*     */     //   2391: aload #40
/*     */     //   2393: invokevirtual c : (Lorg/bukkit/util/Vector;)Lme/konsolas/aac/lq;
/*     */     //   2396: iload #28
/*     */     //   2398: i2s
/*     */     //   2399: iload #29
/*     */     //   2401: iload #30
/*     */     //   2403: i2c
/*     */     //   2404: aload #37
/*     */     //   2406: invokespecial a : (Lorg/bukkit/util/Vector;Lme/konsolas/aac/lq;SICLjava/util/Collection;)Lme/konsolas/aac/lq;
/*     */     //   2409: pop
/*     */     //   2410: aload #41
/*     */     //   2412: invokevirtual getX : ()D
/*     */     //   2415: aload #41
/*     */     //   2417: invokevirtual getX : ()D
/*     */     //   2420: dmul
/*     */     //   2421: aload #41
/*     */     //   2423: invokevirtual getZ : ()D
/*     */     //   2426: aload #41
/*     */     //   2428: invokevirtual getZ : ()D
/*     */     //   2431: dmul
/*     */     //   2432: dadd
/*     */     //   2433: aload #39
/*     */     //   2435: invokevirtual getX : ()D
/*     */     //   2438: aload #39
/*     */     //   2440: invokevirtual getX : ()D
/*     */     //   2443: dmul
/*     */     //   2444: aload #39
/*     */     //   2446: invokevirtual getZ : ()D
/*     */     //   2449: aload #39
/*     */     //   2451: invokevirtual getZ : ()D
/*     */     //   2454: dmul
/*     */     //   2455: dadd
/*     */     //   2456: dcmpl
/*     */     //   2457: lload #4
/*     */     //   2459: lconst_0
/*     */     //   2460: lcmp
/*     */     //   2461: iflt -> 2556
/*     */     //   2464: iload #32
/*     */     //   2466: ifeq -> 2556
/*     */     //   2469: ifle -> 2490
/*     */     //   2472: goto -> 2486
/*     */     //   2475: ldc2_w -1918344228954400149
/*     */     //   2478: lload #4
/*     */     //   2480: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2485: athrow
/*     */     //   2486: aload #41
/*     */     //   2488: astore #39
/*     */     //   2490: aload #39
/*     */     //   2492: iload #32
/*     */     //   2494: ifeq -> 2601
/*     */     //   2497: invokevirtual getX : ()D
/*     */     //   2500: aload #39
/*     */     //   2502: invokevirtual getX : ()D
/*     */     //   2505: dmul
/*     */     //   2506: aload #39
/*     */     //   2508: invokevirtual getZ : ()D
/*     */     //   2511: aload #39
/*     */     //   2513: invokevirtual getZ : ()D
/*     */     //   2516: dmul
/*     */     //   2517: dadd
/*     */     //   2518: aload #33
/*     */     //   2520: invokevirtual getX : ()D
/*     */     //   2523: aload #33
/*     */     //   2525: invokevirtual getX : ()D
/*     */     //   2528: dmul
/*     */     //   2529: aload #33
/*     */     //   2531: invokevirtual getZ : ()D
/*     */     //   2534: aload #33
/*     */     //   2536: invokevirtual getZ : ()D
/*     */     //   2539: dmul
/*     */     //   2540: dadd
/*     */     //   2541: dcmpl
/*     */     //   2542: goto -> 2556
/*     */     //   2545: ldc2_w -1918344228954400149
/*     */     //   2548: lload #4
/*     */     //   2550: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2555: athrow
/*     */     //   2556: lload #4
/*     */     //   2558: lconst_0
/*     */     //   2559: lcmp
/*     */     //   2560: ifle -> 2642
/*     */     //   2563: ifle -> 2640
/*     */     //   2566: new org/bukkit/util/Vector
/*     */     //   2569: dup
/*     */     //   2570: dconst_0
/*     */     //   2571: aload #39
/*     */     //   2573: invokevirtual getY : ()D
/*     */     //   2576: dneg
/*     */     //   2577: aload #34
/*     */     //   2579: invokevirtual getY : ()D
/*     */     //   2582: dadd
/*     */     //   2583: dconst_0
/*     */     //   2584: invokespecial <init> : (DDD)V
/*     */     //   2587: goto -> 2601
/*     */     //   2590: ldc2_w -1918344228954400149
/*     */     //   2593: lload #4
/*     */     //   2595: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2600: athrow
/*     */     //   2601: astore #41
/*     */     //   2603: aload_0
/*     */     //   2604: aload #41
/*     */     //   2606: aload #36
/*     */     //   2608: aload #39
/*     */     //   2610: invokevirtual c : (Lorg/bukkit/util/Vector;)Lme/konsolas/aac/lq;
/*     */     //   2613: iload #28
/*     */     //   2615: i2s
/*     */     //   2616: iload #29
/*     */     //   2618: iload #30
/*     */     //   2620: i2c
/*     */     //   2621: aload #37
/*     */     //   2623: invokespecial a : (Lorg/bukkit/util/Vector;Lme/konsolas/aac/lq;SICLjava/util/Collection;)Lme/konsolas/aac/lq;
/*     */     //   2626: astore #35
/*     */     //   2628: aload #39
/*     */     //   2630: aload #41
/*     */     //   2632: invokevirtual add : (Lorg/bukkit/util/Vector;)Lorg/bukkit/util/Vector;
/*     */     //   2635: pop
/*     */     //   2636: aload #39
/*     */     //   2638: astore #33
/*     */     //   2640: iload #32
/*     */     //   2642: ifne -> 3715
/*     */     //   2645: aload #33
/*     */     //   2647: invokevirtual getX : ()D
/*     */     //   2650: dstore #39
/*     */     //   2652: aload #33
/*     */     //   2654: invokevirtual getY : ()D
/*     */     //   2657: dstore #41
/*     */     //   2659: aload #33
/*     */     //   2661: invokevirtual getZ : ()D
/*     */     //   2664: dstore #43
/*     */     //   2666: aload #35
/*     */     //   2668: astore #45
/*     */     //   2670: aload #36
/*     */     //   2672: astore #35
/*     */     //   2674: aload #33
/*     */     //   2676: aload_1
/*     */     //   2677: invokeinterface c : ()D
/*     */     //   2682: invokevirtual setY : (D)Lorg/bukkit/util/Vector;
/*     */     //   2685: pop
/*     */     //   2686: aload_0
/*     */     //   2687: aload_2
/*     */     //   2688: aload #35
/*     */     //   2690: new org/bukkit/util/Vector
/*     */     //   2693: dup
/*     */     //   2694: aload #34
/*     */     //   2696: invokevirtual getX : ()D
/*     */     //   2699: aload #33
/*     */     //   2701: invokevirtual getY : ()D
/*     */     //   2704: aload #34
/*     */     //   2706: invokevirtual getZ : ()D
/*     */     //   2709: invokespecial <init> : (DDD)V
/*     */     //   2712: astore #31
/*     */     //   2714: iload #14
/*     */     //   2716: i2c
/*     */     //   2717: lload #15
/*     */     //   2719: aload #31
/*     */     //   2721: invokevirtual a : (CJLorg/bukkit/util/Vector;)Lme/konsolas/aac/lq;
/*     */     //   2724: iload #11
/*     */     //   2726: i2s
/*     */     //   2727: lload #12
/*     */     //   2729: invokespecial a : (Lme/konsolas/aac/h8;Lme/konsolas/aac/lq;SJ)Ljava/util/Collection;
/*     */     //   2732: astore #46
/*     */     //   2734: aload #35
/*     */     //   2736: astore #47
/*     */     //   2738: aload #47
/*     */     //   2740: new org/bukkit/util/Vector
/*     */     //   2743: dup
/*     */     //   2744: aload #34
/*     */     //   2746: invokevirtual getX : ()D
/*     */     //   2749: dconst_0
/*     */     //   2750: aload #34
/*     */     //   2752: invokevirtual getZ : ()D
/*     */     //   2755: invokespecial <init> : (DDD)V
/*     */     //   2758: astore #31
/*     */     //   2760: iload #14
/*     */     //   2762: i2c
/*     */     //   2763: lload #15
/*     */     //   2765: aload #31
/*     */     //   2767: invokevirtual a : (CJLorg/bukkit/util/Vector;)Lme/konsolas/aac/lq;
/*     */     //   2770: astore #48
/*     */     //   2772: aload #33
/*     */     //   2774: invokevirtual getY : ()D
/*     */     //   2777: dstore #49
/*     */     //   2779: aload #46
/*     */     //   2781: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   2786: astore #51
/*     */     //   2788: aload #51
/*     */     //   2790: invokeinterface hasNext : ()Z
/*     */     //   2795: ifeq -> 2861
/*     */     //   2798: aload #51
/*     */     //   2800: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   2805: checkcast me/konsolas/aac/lq
/*     */     //   2808: astore #52
/*     */     //   2810: aload #52
/*     */     //   2812: lload #22
/*     */     //   2814: aload #48
/*     */     //   2816: dload #49
/*     */     //   2818: invokevirtual b : (JLme/konsolas/aac/lq;D)D
/*     */     //   2821: lload #4
/*     */     //   2823: lconst_0
/*     */     //   2824: lcmp
/*     */     //   2825: ifle -> 2877
/*     */     //   2828: dstore #49
/*     */     //   2830: iload #32
/*     */     //   2832: ifeq -> 2872
/*     */     //   2835: iload #32
/*     */     //   2837: ifne -> 2788
/*     */     //   2840: lload #4
/*     */     //   2842: lconst_0
/*     */     //   2843: lcmp
/*     */     //   2844: iflt -> 2830
/*     */     //   2847: goto -> 2861
/*     */     //   2850: ldc2_w -1918344228954400149
/*     */     //   2853: lload #4
/*     */     //   2855: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2860: athrow
/*     */     //   2861: aload #47
/*     */     //   2863: dconst_0
/*     */     //   2864: dload #49
/*     */     //   2866: dconst_0
/*     */     //   2867: invokevirtual a : (DDD)Lme/konsolas/aac/lq;
/*     */     //   2870: astore #47
/*     */     //   2872: aload #34
/*     */     //   2874: invokevirtual getX : ()D
/*     */     //   2877: dstore #51
/*     */     //   2879: aload #46
/*     */     //   2881: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   2886: astore #53
/*     */     //   2888: aload #53
/*     */     //   2890: invokeinterface hasNext : ()Z
/*     */     //   2895: ifeq -> 2961
/*     */     //   2898: aload #53
/*     */     //   2900: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   2905: checkcast me/konsolas/aac/lq
/*     */     //   2908: astore #54
/*     */     //   2910: aload #54
/*     */     //   2912: lload #17
/*     */     //   2914: aload #47
/*     */     //   2916: dload #51
/*     */     //   2918: invokevirtual c : (JLme/konsolas/aac/lq;D)D
/*     */     //   2921: lload #4
/*     */     //   2923: lconst_0
/*     */     //   2924: lcmp
/*     */     //   2925: ifle -> 2977
/*     */     //   2928: dstore #51
/*     */     //   2930: iload #32
/*     */     //   2932: ifeq -> 2972
/*     */     //   2935: iload #32
/*     */     //   2937: ifne -> 2888
/*     */     //   2940: lload #4
/*     */     //   2942: lconst_0
/*     */     //   2943: lcmp
/*     */     //   2944: ifle -> 2930
/*     */     //   2947: goto -> 2961
/*     */     //   2950: ldc2_w -1918344228954400149
/*     */     //   2953: lload #4
/*     */     //   2955: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2960: athrow
/*     */     //   2961: aload #47
/*     */     //   2963: dload #51
/*     */     //   2965: dconst_0
/*     */     //   2966: dconst_0
/*     */     //   2967: invokevirtual a : (DDD)Lme/konsolas/aac/lq;
/*     */     //   2970: astore #47
/*     */     //   2972: aload #34
/*     */     //   2974: invokevirtual getZ : ()D
/*     */     //   2977: dstore #53
/*     */     //   2979: aload #46
/*     */     //   2981: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   2986: astore #55
/*     */     //   2988: aload #55
/*     */     //   2990: invokeinterface hasNext : ()Z
/*     */     //   2995: ifeq -> 3061
/*     */     //   2998: aload #55
/*     */     //   3000: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   3005: checkcast me/konsolas/aac/lq
/*     */     //   3008: astore #56
/*     */     //   3010: aload #56
/*     */     //   3012: lload #4
/*     */     //   3014: lconst_0
/*     */     //   3015: lcmp
/*     */     //   3016: iflt -> 3074
/*     */     //   3019: lload #24
/*     */     //   3021: aload #47
/*     */     //   3023: dload #53
/*     */     //   3025: invokevirtual a : (JLme/konsolas/aac/lq;D)D
/*     */     //   3028: dstore #53
/*     */     //   3030: iload #32
/*     */     //   3032: ifeq -> 3072
/*     */     //   3035: iload #32
/*     */     //   3037: ifne -> 2988
/*     */     //   3040: lload #4
/*     */     //   3042: lconst_0
/*     */     //   3043: lcmp
/*     */     //   3044: iflt -> 3030
/*     */     //   3047: goto -> 3061
/*     */     //   3050: ldc2_w -1918344228954400149
/*     */     //   3053: lload #4
/*     */     //   3055: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   3060: athrow
/*     */     //   3061: aload #47
/*     */     //   3063: dconst_0
/*     */     //   3064: dconst_0
/*     */     //   3065: dload #53
/*     */     //   3067: invokevirtual a : (DDD)Lme/konsolas/aac/lq;
/*     */     //   3070: astore #47
/*     */     //   3072: aload #35
/*     */     //   3074: astore #55
/*     */     //   3076: aload #33
/*     */     //   3078: invokevirtual getY : ()D
/*     */     //   3081: dstore #56
/*     */     //   3083: aload #46
/*     */     //   3085: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   3090: astore #58
/*     */     //   3092: aload #58
/*     */     //   3094: invokeinterface hasNext : ()Z
/*     */     //   3099: ifeq -> 3165
/*     */     //   3102: aload #58
/*     */     //   3104: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   3109: checkcast me/konsolas/aac/lq
/*     */     //   3112: astore #59
/*     */     //   3114: aload #59
/*     */     //   3116: lload #22
/*     */     //   3118: aload #55
/*     */     //   3120: dload #56
/*     */     //   3122: invokevirtual b : (JLme/konsolas/aac/lq;D)D
/*     */     //   3125: lload #4
/*     */     //   3127: lconst_0
/*     */     //   3128: lcmp
/*     */     //   3129: ifle -> 3181
/*     */     //   3132: dstore #56
/*     */     //   3134: iload #32
/*     */     //   3136: ifeq -> 3176
/*     */     //   3139: iload #32
/*     */     //   3141: ifne -> 3092
/*     */     //   3144: lload #4
/*     */     //   3146: lconst_0
/*     */     //   3147: lcmp
/*     */     //   3148: iflt -> 3134
/*     */     //   3151: goto -> 3165
/*     */     //   3154: ldc2_w -1918344228954400149
/*     */     //   3157: lload #4
/*     */     //   3159: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   3164: athrow
/*     */     //   3165: aload #55
/*     */     //   3167: dconst_0
/*     */     //   3168: dload #56
/*     */     //   3170: dconst_0
/*     */     //   3171: invokevirtual a : (DDD)Lme/konsolas/aac/lq;
/*     */     //   3174: astore #55
/*     */     //   3176: aload #34
/*     */     //   3178: invokevirtual getX : ()D
/*     */     //   3181: dstore #58
/*     */     //   3183: aload #46
/*     */     //   3185: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   3190: astore #60
/*     */     //   3192: aload #60
/*     */     //   3194: invokeinterface hasNext : ()Z
/*     */     //   3199: ifeq -> 3265
/*     */     //   3202: aload #60
/*     */     //   3204: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   3209: checkcast me/konsolas/aac/lq
/*     */     //   3212: astore #61
/*     */     //   3214: aload #61
/*     */     //   3216: lload #17
/*     */     //   3218: aload #55
/*     */     //   3220: dload #58
/*     */     //   3222: invokevirtual c : (JLme/konsolas/aac/lq;D)D
/*     */     //   3225: lload #4
/*     */     //   3227: lconst_0
/*     */     //   3228: lcmp
/*     */     //   3229: ifle -> 3281
/*     */     //   3232: dstore #58
/*     */     //   3234: iload #32
/*     */     //   3236: ifeq -> 3276
/*     */     //   3239: iload #32
/*     */     //   3241: ifne -> 3192
/*     */     //   3244: lload #4
/*     */     //   3246: lconst_0
/*     */     //   3247: lcmp
/*     */     //   3248: ifle -> 3234
/*     */     //   3251: goto -> 3265
/*     */     //   3254: ldc2_w -1918344228954400149
/*     */     //   3257: lload #4
/*     */     //   3259: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   3264: athrow
/*     */     //   3265: aload #55
/*     */     //   3267: dload #58
/*     */     //   3269: dconst_0
/*     */     //   3270: dconst_0
/*     */     //   3271: invokevirtual a : (DDD)Lme/konsolas/aac/lq;
/*     */     //   3274: astore #55
/*     */     //   3276: aload #34
/*     */     //   3278: invokevirtual getZ : ()D
/*     */     //   3281: dstore #60
/*     */     //   3283: aload #46
/*     */     //   3285: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   3290: astore #62
/*     */     //   3292: aload #62
/*     */     //   3294: invokeinterface hasNext : ()Z
/*     */     //   3299: ifeq -> 3365
/*     */     //   3302: aload #62
/*     */     //   3304: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   3309: checkcast me/konsolas/aac/lq
/*     */     //   3312: astore #63
/*     */     //   3314: aload #63
/*     */     //   3316: lload #24
/*     */     //   3318: aload #55
/*     */     //   3320: dload #60
/*     */     //   3322: invokevirtual a : (JLme/konsolas/aac/lq;D)D
/*     */     //   3325: lload #4
/*     */     //   3327: lconst_0
/*     */     //   3328: lcmp
/*     */     //   3329: iflt -> 3387
/*     */     //   3332: dstore #60
/*     */     //   3334: iload #32
/*     */     //   3336: ifeq -> 3376
/*     */     //   3339: iload #32
/*     */     //   3341: ifne -> 3292
/*     */     //   3344: lload #4
/*     */     //   3346: lconst_0
/*     */     //   3347: lcmp
/*     */     //   3348: ifle -> 3334
/*     */     //   3351: goto -> 3365
/*     */     //   3354: ldc2_w -1918344228954400149
/*     */     //   3357: lload #4
/*     */     //   3359: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   3364: athrow
/*     */     //   3365: aload #55
/*     */     //   3367: dconst_0
/*     */     //   3368: dconst_0
/*     */     //   3369: dload #60
/*     */     //   3371: invokevirtual a : (DDD)Lme/konsolas/aac/lq;
/*     */     //   3374: astore #55
/*     */     //   3376: dload #51
/*     */     //   3378: dload #51
/*     */     //   3380: dmul
/*     */     //   3381: dload #53
/*     */     //   3383: dload #53
/*     */     //   3385: dmul
/*     */     //   3386: dadd
/*     */     //   3387: dstore #62
/*     */     //   3389: dload #58
/*     */     //   3391: dload #58
/*     */     //   3393: dmul
/*     */     //   3394: dload #60
/*     */     //   3396: dload #60
/*     */     //   3398: dmul
/*     */     //   3399: dadd
/*     */     //   3400: dstore #64
/*     */     //   3402: iload #32
/*     */     //   3404: lload #4
/*     */     //   3406: lconst_0
/*     */     //   3407: lcmp
/*     */     //   3408: ifle -> 3419
/*     */     //   3411: ifeq -> 3516
/*     */     //   3414: dload #62
/*     */     //   3416: dload #64
/*     */     //   3418: dcmpl
/*     */     //   3419: ifle -> 3477
/*     */     //   3422: goto -> 3436
/*     */     //   3425: ldc2_w -1918344228954400149
/*     */     //   3428: lload #4
/*     */     //   3430: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   3435: athrow
/*     */     //   3436: aload #33
/*     */     //   3438: dload #51
/*     */     //   3440: invokevirtual setX : (D)Lorg/bukkit/util/Vector;
/*     */     //   3443: pop
/*     */     //   3444: aload #33
/*     */     //   3446: dload #53
/*     */     //   3448: invokevirtual setZ : (D)Lorg/bukkit/util/Vector;
/*     */     //   3451: pop
/*     */     //   3452: aload #33
/*     */     //   3454: dload #49
/*     */     //   3456: dneg
/*     */     //   3457: invokevirtual setY : (D)Lorg/bukkit/util/Vector;
/*     */     //   3460: pop
/*     */     //   3461: aload #47
/*     */     //   3463: astore #35
/*     */     //   3465: lload #4
/*     */     //   3467: lconst_0
/*     */     //   3468: lcmp
/*     */     //   3469: ifle -> 3502
/*     */     //   3472: iload #32
/*     */     //   3474: ifne -> 3520
/*     */     //   3477: aload #33
/*     */     //   3479: dload #58
/*     */     //   3481: invokevirtual setX : (D)Lorg/bukkit/util/Vector;
/*     */     //   3484: pop
/*     */     //   3485: aload #33
/*     */     //   3487: dload #60
/*     */     //   3489: invokevirtual setZ : (D)Lorg/bukkit/util/Vector;
/*     */     //   3492: pop
/*     */     //   3493: aload #33
/*     */     //   3495: dload #56
/*     */     //   3497: dneg
/*     */     //   3498: invokevirtual setY : (D)Lorg/bukkit/util/Vector;
/*     */     //   3501: pop
/*     */     //   3502: goto -> 3516
/*     */     //   3505: ldc2_w -1918344228954400149
/*     */     //   3508: lload #4
/*     */     //   3510: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   3515: athrow
/*     */     //   3516: aload #55
/*     */     //   3518: astore #35
/*     */     //   3520: aload #46
/*     */     //   3522: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   3527: astore #66
/*     */     //   3529: aload #66
/*     */     //   3531: invokeinterface hasNext : ()Z
/*     */     //   3536: ifeq -> 3609
/*     */     //   3539: aload #66
/*     */     //   3541: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   3546: checkcast me/konsolas/aac/lq
/*     */     //   3549: astore #67
/*     */     //   3551: aload #33
/*     */     //   3553: aload #67
/*     */     //   3555: lload #22
/*     */     //   3557: aload #35
/*     */     //   3559: aload #33
/*     */     //   3561: invokevirtual getY : ()D
/*     */     //   3564: invokevirtual b : (JLme/konsolas/aac/lq;D)D
/*     */     //   3567: invokevirtual setY : (D)Lorg/bukkit/util/Vector;
/*     */     //   3570: pop
/*     */     //   3571: iload #32
/*     */     //   3573: lload #4
/*     */     //   3575: lconst_0
/*     */     //   3576: lcmp
/*     */     //   3577: iflt -> 3658
/*     */     //   3580: ifeq -> 3623
/*     */     //   3583: iload #32
/*     */     //   3585: ifne -> 3529
/*     */     //   3588: lload #4
/*     */     //   3590: lconst_0
/*     */     //   3591: lcmp
/*     */     //   3592: iflt -> 3571
/*     */     //   3595: goto -> 3609
/*     */     //   3598: ldc2_w -1918344228954400149
/*     */     //   3601: lload #4
/*     */     //   3603: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   3608: athrow
/*     */     //   3609: aload #35
/*     */     //   3611: dconst_0
/*     */     //   3612: aload #33
/*     */     //   3614: invokevirtual getY : ()D
/*     */     //   3617: dconst_0
/*     */     //   3618: invokevirtual a : (DDD)Lme/konsolas/aac/lq;
/*     */     //   3621: astore #35
/*     */     //   3623: dload #39
/*     */     //   3625: dload #39
/*     */     //   3627: dmul
/*     */     //   3628: dload #43
/*     */     //   3630: dload #43
/*     */     //   3632: dmul
/*     */     //   3633: dadd
/*     */     //   3634: aload #33
/*     */     //   3636: invokevirtual getX : ()D
/*     */     //   3639: aload #33
/*     */     //   3641: invokevirtual getX : ()D
/*     */     //   3644: dmul
/*     */     //   3645: aload #33
/*     */     //   3647: invokevirtual getZ : ()D
/*     */     //   3650: aload #33
/*     */     //   3652: invokevirtual getZ : ()D
/*     */     //   3655: dmul
/*     */     //   3656: dadd
/*     */     //   3657: dcmpl
/*     */     //   3658: iload #32
/*     */     //   3660: lload #4
/*     */     //   3662: lconst_0
/*     */     //   3663: lcmp
/*     */     //   3664: iflt -> 3728
/*     */     //   3667: ifeq -> 3726
/*     */     //   3670: iflt -> 3715
/*     */     //   3673: goto -> 3687
/*     */     //   3676: ldc2_w -1918344228954400149
/*     */     //   3679: lload #4
/*     */     //   3681: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   3686: athrow
/*     */     //   3687: aload #33
/*     */     //   3689: dload #39
/*     */     //   3691: invokevirtual setX : (D)Lorg/bukkit/util/Vector;
/*     */     //   3694: pop
/*     */     //   3695: aload #33
/*     */     //   3697: dload #41
/*     */     //   3699: invokevirtual setY : (D)Lorg/bukkit/util/Vector;
/*     */     //   3702: pop
/*     */     //   3703: aload #33
/*     */     //   3705: dload #43
/*     */     //   3707: invokevirtual setZ : (D)Lorg/bukkit/util/Vector;
/*     */     //   3710: pop
/*     */     //   3711: aload #45
/*     */     //   3713: astore #35
/*     */     //   3715: aload #34
/*     */     //   3717: invokevirtual getX : ()D
/*     */     //   3720: aload #33
/*     */     //   3722: invokevirtual getX : ()D
/*     */     //   3725: dcmpl
/*     */     //   3726: iload #32
/*     */     //   3728: ifeq -> 3796
/*     */     //   3731: ifne -> 3795
/*     */     //   3734: goto -> 3748
/*     */     //   3737: ldc2_w -1918344228954400149
/*     */     //   3740: lload #4
/*     */     //   3742: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   3747: athrow
/*     */     //   3748: aload #34
/*     */     //   3750: invokevirtual getZ : ()D
/*     */     //   3753: aload #33
/*     */     //   3755: invokevirtual getZ : ()D
/*     */     //   3758: dcmpl
/*     */     //   3759: iload #32
/*     */     //   3761: ifeq -> 3796
/*     */     //   3764: goto -> 3778
/*     */     //   3767: ldc2_w -1918344228954400149
/*     */     //   3770: lload #4
/*     */     //   3772: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   3777: athrow
/*     */     //   3778: ifeq -> 3799
/*     */     //   3781: goto -> 3795
/*     */     //   3784: ldc2_w -1918344228954400149
/*     */     //   3787: lload #4
/*     */     //   3789: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   3794: athrow
/*     */     //   3795: iconst_1
/*     */     //   3796: goto -> 3800
/*     */     //   3799: iconst_0
/*     */     //   3800: istore #39
/*     */     //   3802: aload #34
/*     */     //   3804: invokevirtual getY : ()D
/*     */     //   3807: aload #33
/*     */     //   3809: invokevirtual getY : ()D
/*     */     //   3812: dcmpl
/*     */     //   3813: iload #32
/*     */     //   3815: ifeq -> 3836
/*     */     //   3818: ifeq -> 3839
/*     */     //   3821: goto -> 3835
/*     */     //   3824: ldc2_w -1918344228954400149
/*     */     //   3827: lload #4
/*     */     //   3829: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   3834: athrow
/*     */     //   3835: iconst_1
/*     */     //   3836: goto -> 3840
/*     */     //   3839: iconst_0
/*     */     //   3840: istore #40
/*     */     //   3842: iload #40
/*     */     //   3844: iload #32
/*     */     //   3846: lload #4
/*     */     //   3848: lconst_0
/*     */     //   3849: lcmp
/*     */     //   3850: iflt -> 3896
/*     */     //   3853: ifeq -> 3894
/*     */     //   3856: ifeq -> 3920
/*     */     //   3859: goto -> 3873
/*     */     //   3862: ldc2_w -1918344228954400149
/*     */     //   3865: lload #4
/*     */     //   3867: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   3872: athrow
/*     */     //   3873: aload #34
/*     */     //   3875: invokevirtual getY : ()D
/*     */     //   3878: dconst_0
/*     */     //   3879: dcmpg
/*     */     //   3880: goto -> 3894
/*     */     //   3883: ldc2_w -1918344228954400149
/*     */     //   3886: lload #4
/*     */     //   3888: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   3893: athrow
/*     */     //   3894: iload #32
/*     */     //   3896: ifeq -> 3917
/*     */     //   3899: ifge -> 3920
/*     */     //   3902: goto -> 3916
/*     */     //   3905: ldc2_w -1918344228954400149
/*     */     //   3908: lload #4
/*     */     //   3910: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   3915: athrow
/*     */     //   3916: iconst_1
/*     */     //   3917: goto -> 3921
/*     */     //   3920: iconst_0
/*     */     //   3921: istore #41
/*     */     //   3923: iload #32
/*     */     //   3925: lload #4
/*     */     //   3927: lconst_0
/*     */     //   3928: lcmp
/*     */     //   3929: ifle -> 4021
/*     */     //   3932: ifeq -> 4019
/*     */     //   3935: aload_1
/*     */     //   3936: invokeinterface r : ()Z
/*     */     //   3941: ifne -> 4007
/*     */     //   3944: goto -> 3958
/*     */     //   3947: ldc2_w -1918344228954400149
/*     */     //   3950: lload #4
/*     */     //   3952: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   3957: athrow
/*     */     //   3958: aload_1
/*     */     //   3959: invokeinterface h : ()Z
/*     */     //   3964: iload #32
/*     */     //   3966: lload #4
/*     */     //   3968: lconst_0
/*     */     //   3969: lcmp
/*     */     //   3970: iflt -> 4049
/*     */     //   3973: ifeq -> 4047
/*     */     //   3976: goto -> 3990
/*     */     //   3979: ldc2_w -1918344228954400149
/*     */     //   3982: lload #4
/*     */     //   3984: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   3989: athrow
/*     */     //   3990: ifeq -> 4031
/*     */     //   3993: goto -> 4007
/*     */     //   3996: ldc2_w -1918344228954400149
/*     */     //   3999: lload #4
/*     */     //   4001: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4006: athrow
/*     */     //   4007: new org/bukkit/util/Vector
/*     */     //   4010: dup
/*     */     //   4011: iconst_0
/*     */     //   4012: iconst_0
/*     */     //   4013: iconst_0
/*     */     //   4014: invokespecial <init> : (III)V
/*     */     //   4017: astore #6
/*     */     //   4019: iload #32
/*     */     //   4021: lload #4
/*     */     //   4023: lconst_0
/*     */     //   4024: lcmp
/*     */     //   4025: iflt -> 4033
/*     */     //   4028: ifne -> 5125
/*     */     //   4031: iload #40
/*     */     //   4033: goto -> 4047
/*     */     //   4036: ldc2_w -1918344228954400149
/*     */     //   4039: lload #4
/*     */     //   4041: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4046: athrow
/*     */     //   4047: iload #32
/*     */     //   4049: ifeq -> 4397
/*     */     //   4052: ifeq -> 4381
/*     */     //   4055: goto -> 4069
/*     */     //   4058: ldc2_w -1918344228954400149
/*     */     //   4061: lload #4
/*     */     //   4063: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4068: athrow
/*     */     //   4069: aload_2
/*     */     //   4070: aload_3
/*     */     //   4071: invokevirtual getX : ()D
/*     */     //   4074: aload #33
/*     */     //   4076: invokevirtual getX : ()D
/*     */     //   4079: dadd
/*     */     //   4080: aload_3
/*     */     //   4081: invokevirtual getY : ()D
/*     */     //   4084: aload #33
/*     */     //   4086: invokevirtual getY : ()D
/*     */     //   4089: dadd
/*     */     //   4090: ldc2_w 0.2
/*     */     //   4093: dsub
/*     */     //   4094: iload #19
/*     */     //   4096: dup_x2
/*     */     //   4097: pop
/*     */     //   4098: aload_3
/*     */     //   4099: invokevirtual getZ : ()D
/*     */     //   4102: aload #33
/*     */     //   4104: invokevirtual getZ : ()D
/*     */     //   4107: dadd
/*     */     //   4108: iload #20
/*     */     //   4110: i2b
/*     */     //   4111: dup_x2
/*     */     //   4112: pop
/*     */     //   4113: iload #21
/*     */     //   4115: dup_x2
/*     */     //   4116: pop
/*     */     //   4117: invokevirtual a : (DIDBID)Lorg/bukkit/Material;
/*     */     //   4120: getstatic org/bukkit/Material.SLIME_BLOCK : Lorg/bukkit/Material;
/*     */     //   4123: if_acmpne -> 4381
/*     */     //   4126: goto -> 4140
/*     */     //   4129: ldc2_w -1918344228954400149
/*     */     //   4132: lload #4
/*     */     //   4134: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4139: athrow
/*     */     //   4140: iload #8
/*     */     //   4142: iload #32
/*     */     //   4144: ifeq -> 4397
/*     */     //   4147: goto -> 4161
/*     */     //   4150: ldc2_w -1918344228954400149
/*     */     //   4153: lload #4
/*     */     //   4155: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4160: athrow
/*     */     //   4161: lload #4
/*     */     //   4163: lconst_0
/*     */     //   4164: lcmp
/*     */     //   4165: iflt -> 4383
/*     */     //   4168: ifne -> 4381
/*     */     //   4171: goto -> 4185
/*     */     //   4174: ldc2_w -1918344228954400149
/*     */     //   4177: lload #4
/*     */     //   4179: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4184: athrow
/*     */     //   4185: aload #6
/*     */     //   4187: invokevirtual getY : ()D
/*     */     //   4190: dconst_0
/*     */     //   4191: dcmpg
/*     */     //   4192: iload #32
/*     */     //   4194: lload #4
/*     */     //   4196: lconst_0
/*     */     //   4197: lcmp
/*     */     //   4198: iflt -> 4399
/*     */     //   4201: ifeq -> 4397
/*     */     //   4204: goto -> 4218
/*     */     //   4207: ldc2_w -1918344228954400149
/*     */     //   4210: lload #4
/*     */     //   4212: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4217: athrow
/*     */     //   4218: lload #4
/*     */     //   4220: lconst_0
/*     */     //   4221: lcmp
/*     */     //   4222: ifle -> 4383
/*     */     //   4225: ifge -> 4381
/*     */     //   4228: goto -> 4242
/*     */     //   4231: ldc2_w -1918344228954400149
/*     */     //   4234: lload #4
/*     */     //   4236: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4241: athrow
/*     */     //   4242: aload #6
/*     */     //   4244: aload #6
/*     */     //   4246: invokevirtual getY : ()D
/*     */     //   4249: dneg
/*     */     //   4250: invokevirtual setY : (D)Lorg/bukkit/util/Vector;
/*     */     //   4253: pop
/*     */     //   4254: aload #6
/*     */     //   4256: invokevirtual getY : ()D
/*     */     //   4259: invokestatic abs : (D)D
/*     */     //   4262: lload #4
/*     */     //   4264: lconst_0
/*     */     //   4265: lcmp
/*     */     //   4266: ifle -> 4339
/*     */     //   4269: ldc2_w 0.1
/*     */     //   4272: iload #32
/*     */     //   4274: ifeq -> 4338
/*     */     //   4277: goto -> 4291
/*     */     //   4280: ldc2_w -1918344228954400149
/*     */     //   4283: lload #4
/*     */     //   4285: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4290: athrow
/*     */     //   4291: dcmpg
/*     */     //   4292: ifge -> 5125
/*     */     //   4295: goto -> 4309
/*     */     //   4298: ldc2_w -1918344228954400149
/*     */     //   4301: lload #4
/*     */     //   4303: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4308: athrow
/*     */     //   4309: ldc2_w 0.4
/*     */     //   4312: aload #6
/*     */     //   4314: invokevirtual getY : ()D
/*     */     //   4317: invokestatic abs : (D)D
/*     */     //   4320: ldc2_w 0.2
/*     */     //   4323: dmul
/*     */     //   4324: goto -> 4338
/*     */     //   4327: ldc2_w -1918344228954400149
/*     */     //   4330: lload #4
/*     */     //   4332: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4337: athrow
/*     */     //   4338: dadd
/*     */     //   4339: dstore #42
/*     */     //   4341: aload #6
/*     */     //   4343: dload #42
/*     */     //   4345: aload #6
/*     */     //   4347: invokevirtual getX : ()D
/*     */     //   4350: dmul
/*     */     //   4351: invokevirtual setX : (D)Lorg/bukkit/util/Vector;
/*     */     //   4354: pop
/*     */     //   4355: aload #6
/*     */     //   4357: dload #42
/*     */     //   4359: aload #6
/*     */     //   4361: invokevirtual getZ : ()D
/*     */     //   4364: dmul
/*     */     //   4365: invokevirtual setZ : (D)Lorg/bukkit/util/Vector;
/*     */     //   4368: pop
/*     */     //   4369: iload #32
/*     */     //   4371: lload #4
/*     */     //   4373: lconst_0
/*     */     //   4374: lcmp
/*     */     //   4375: ifle -> 4383
/*     */     //   4378: ifne -> 5125
/*     */     //   4381: iload #40
/*     */     //   4383: goto -> 4397
/*     */     //   4386: ldc2_w -1918344228954400149
/*     */     //   4389: lload #4
/*     */     //   4391: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4396: athrow
/*     */     //   4397: iload #32
/*     */     //   4399: ifeq -> 4738
/*     */     //   4402: ifeq -> 4713
/*     */     //   4405: goto -> 4419
/*     */     //   4408: ldc2_w -1918344228954400149
/*     */     //   4411: lload #4
/*     */     //   4413: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4418: athrow
/*     */     //   4419: getstatic me/konsolas/aac/ei.BEDS : Ljava/util/Set;
/*     */     //   4422: aload_2
/*     */     //   4423: aload_3
/*     */     //   4424: invokevirtual getX : ()D
/*     */     //   4427: aload #33
/*     */     //   4429: invokevirtual getX : ()D
/*     */     //   4432: dadd
/*     */     //   4433: aload_3
/*     */     //   4434: invokevirtual getY : ()D
/*     */     //   4437: aload #33
/*     */     //   4439: invokevirtual getY : ()D
/*     */     //   4442: dadd
/*     */     //   4443: ldc2_w 0.2
/*     */     //   4446: dsub
/*     */     //   4447: iload #19
/*     */     //   4449: dup_x2
/*     */     //   4450: pop
/*     */     //   4451: aload_3
/*     */     //   4452: invokevirtual getZ : ()D
/*     */     //   4455: aload #33
/*     */     //   4457: invokevirtual getZ : ()D
/*     */     //   4460: dadd
/*     */     //   4461: iload #20
/*     */     //   4463: i2b
/*     */     //   4464: dup_x2
/*     */     //   4465: pop
/*     */     //   4466: iload #21
/*     */     //   4468: dup_x2
/*     */     //   4469: pop
/*     */     //   4470: invokevirtual a : (DIDBID)Lorg/bukkit/Material;
/*     */     //   4473: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   4478: iload #32
/*     */     //   4480: ifeq -> 4738
/*     */     //   4483: goto -> 4497
/*     */     //   4486: ldc2_w -1918344228954400149
/*     */     //   4489: lload #4
/*     */     //   4491: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4496: athrow
/*     */     //   4497: lload #4
/*     */     //   4499: lconst_0
/*     */     //   4500: lcmp
/*     */     //   4501: iflt -> 4724
/*     */     //   4504: ifeq -> 4713
/*     */     //   4507: goto -> 4521
/*     */     //   4510: ldc2_w -1918344228954400149
/*     */     //   4513: lload #4
/*     */     //   4515: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4520: athrow
/*     */     //   4521: iload #8
/*     */     //   4523: iload #32
/*     */     //   4525: ifeq -> 4738
/*     */     //   4528: goto -> 4542
/*     */     //   4531: ldc2_w -1918344228954400149
/*     */     //   4534: lload #4
/*     */     //   4536: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4541: athrow
/*     */     //   4542: lload #4
/*     */     //   4544: lconst_0
/*     */     //   4545: lcmp
/*     */     //   4546: iflt -> 4724
/*     */     //   4549: ifne -> 4713
/*     */     //   4552: goto -> 4566
/*     */     //   4555: ldc2_w -1918344228954400149
/*     */     //   4558: lload #4
/*     */     //   4560: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4565: athrow
/*     */     //   4566: aload #6
/*     */     //   4568: invokevirtual getY : ()D
/*     */     //   4571: dconst_0
/*     */     //   4572: dcmpg
/*     */     //   4573: iload #32
/*     */     //   4575: ifeq -> 4738
/*     */     //   4578: goto -> 4592
/*     */     //   4581: ldc2_w -1918344228954400149
/*     */     //   4584: lload #4
/*     */     //   4586: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4591: athrow
/*     */     //   4592: lload #4
/*     */     //   4594: lconst_0
/*     */     //   4595: lcmp
/*     */     //   4596: ifle -> 4724
/*     */     //   4599: ifge -> 4713
/*     */     //   4602: goto -> 4616
/*     */     //   4605: ldc2_w -1918344228954400149
/*     */     //   4608: lload #4
/*     */     //   4610: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4615: athrow
/*     */     //   4616: aload_0
/*     */     //   4617: getfield b : Lme/konsolas/aac/kP;
/*     */     //   4620: lload #9
/*     */     //   4622: getstatic me/konsolas/aac/kP.V1_12 : Lme/konsolas/aac/kP;
/*     */     //   4625: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*     */     //   4628: iload #32
/*     */     //   4630: lload #4
/*     */     //   4632: lconst_0
/*     */     //   4633: lcmp
/*     */     //   4634: iflt -> 4740
/*     */     //   4637: ifeq -> 4738
/*     */     //   4640: goto -> 4654
/*     */     //   4643: ldc2_w -1918344228954400149
/*     */     //   4646: lload #4
/*     */     //   4648: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4653: athrow
/*     */     //   4654: lload #4
/*     */     //   4656: lconst_0
/*     */     //   4657: lcmp
/*     */     //   4658: ifle -> 4724
/*     */     //   4661: ifeq -> 4713
/*     */     //   4664: goto -> 4678
/*     */     //   4667: ldc2_w -1918344228954400149
/*     */     //   4670: lload #4
/*     */     //   4672: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4677: athrow
/*     */     //   4678: aload #6
/*     */     //   4680: aload #6
/*     */     //   4682: invokevirtual getY : ()D
/*     */     //   4685: dneg
/*     */     //   4686: ldc2_w 0.6600000262260437
/*     */     //   4689: dmul
/*     */     //   4690: invokevirtual setY : (D)Lorg/bukkit/util/Vector;
/*     */     //   4693: pop
/*     */     //   4694: iload #32
/*     */     //   4696: ifne -> 5125
/*     */     //   4699: goto -> 4713
/*     */     //   4702: ldc2_w -1918344228954400149
/*     */     //   4705: lload #4
/*     */     //   4707: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4712: athrow
/*     */     //   4713: aload #34
/*     */     //   4715: invokevirtual getY : ()D
/*     */     //   4718: aload #33
/*     */     //   4720: invokevirtual getY : ()D
/*     */     //   4723: dcmpl
/*     */     //   4724: goto -> 4738
/*     */     //   4727: ldc2_w -1918344228954400149
/*     */     //   4730: lload #4
/*     */     //   4732: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4737: athrow
/*     */     //   4738: iload #32
/*     */     //   4740: lload #4
/*     */     //   4742: lconst_0
/*     */     //   4743: lcmp
/*     */     //   4744: ifle -> 4802
/*     */     //   4747: ifeq -> 4800
/*     */     //   4750: ifeq -> 4788
/*     */     //   4753: goto -> 4767
/*     */     //   4756: ldc2_w -1918344228954400149
/*     */     //   4759: lload #4
/*     */     //   4761: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4766: athrow
/*     */     //   4767: aload #6
/*     */     //   4769: iconst_0
/*     */     //   4770: invokevirtual setY : (I)Lorg/bukkit/util/Vector;
/*     */     //   4773: pop
/*     */     //   4774: goto -> 4788
/*     */     //   4777: ldc2_w -1918344228954400149
/*     */     //   4780: lload #4
/*     */     //   4782: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4787: athrow
/*     */     //   4788: aload_0
/*     */     //   4789: getfield b : Lme/konsolas/aac/kP;
/*     */     //   4792: lload #9
/*     */     //   4794: getstatic me/konsolas/aac/kP.V1_13 : Lme/konsolas/aac/kP;
/*     */     //   4797: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*     */     //   4800: iload #32
/*     */     //   4802: lload #4
/*     */     //   4804: lconst_0
/*     */     //   4805: lcmp
/*     */     //   4806: ifle -> 5030
/*     */     //   4809: ifeq -> 5021
/*     */     //   4812: ifeq -> 4996
/*     */     //   4815: goto -> 4829
/*     */     //   4818: ldc2_w -1918344228954400149
/*     */     //   4821: lload #4
/*     */     //   4823: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4828: athrow
/*     */     //   4829: aload #34
/*     */     //   4831: invokevirtual getZ : ()D
/*     */     //   4834: aload #33
/*     */     //   4836: invokevirtual getZ : ()D
/*     */     //   4839: dcmpl
/*     */     //   4840: lload #4
/*     */     //   4842: lconst_0
/*     */     //   4843: lcmp
/*     */     //   4844: ifle -> 4960
/*     */     //   4847: iload #32
/*     */     //   4849: ifeq -> 4960
/*     */     //   4852: goto -> 4866
/*     */     //   4855: ldc2_w -1918344228954400149
/*     */     //   4858: lload #4
/*     */     //   4860: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4865: athrow
/*     */     //   4866: ifeq -> 4909
/*     */     //   4869: goto -> 4883
/*     */     //   4872: ldc2_w -1918344228954400149
/*     */     //   4875: lload #4
/*     */     //   4877: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4882: athrow
/*     */     //   4883: aload #6
/*     */     //   4885: iconst_0
/*     */     //   4886: invokevirtual setZ : (I)Lorg/bukkit/util/Vector;
/*     */     //   4889: pop
/*     */     //   4890: iload #32
/*     */     //   4892: ifne -> 5125
/*     */     //   4895: goto -> 4909
/*     */     //   4898: ldc2_w -1918344228954400149
/*     */     //   4901: lload #4
/*     */     //   4903: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4908: athrow
/*     */     //   4909: aload #34
/*     */     //   4911: lload #4
/*     */     //   4913: lconst_0
/*     */     //   4914: lcmp
/*     */     //   4915: iflt -> 4983
/*     */     //   4918: iload #32
/*     */     //   4920: ifeq -> 4983
/*     */     //   4923: goto -> 4937
/*     */     //   4926: ldc2_w -1918344228954400149
/*     */     //   4929: lload #4
/*     */     //   4931: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4936: athrow
/*     */     //   4937: invokevirtual getX : ()D
/*     */     //   4940: aload #33
/*     */     //   4942: invokevirtual getX : ()D
/*     */     //   4945: dcmpl
/*     */     //   4946: goto -> 4960
/*     */     //   4949: ldc2_w -1918344228954400149
/*     */     //   4952: lload #4
/*     */     //   4954: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4959: athrow
/*     */     //   4960: ifeq -> 5125
/*     */     //   4963: aload #6
/*     */     //   4965: iconst_0
/*     */     //   4966: invokevirtual setX : (I)Lorg/bukkit/util/Vector;
/*     */     //   4969: goto -> 4983
/*     */     //   4972: ldc2_w -1918344228954400149
/*     */     //   4975: lload #4
/*     */     //   4977: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4982: athrow
/*     */     //   4983: pop
/*     */     //   4984: iload #32
/*     */     //   4986: lload #4
/*     */     //   4988: lconst_0
/*     */     //   4989: lcmp
/*     */     //   4990: iflt -> 5007
/*     */     //   4993: ifne -> 5125
/*     */     //   4996: aload #34
/*     */     //   4998: invokevirtual getX : ()D
/*     */     //   5001: aload #33
/*     */     //   5003: invokevirtual getX : ()D
/*     */     //   5006: dcmpl
/*     */     //   5007: goto -> 5021
/*     */     //   5010: ldc2_w -1918344228954400149
/*     */     //   5013: lload #4
/*     */     //   5015: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   5020: athrow
/*     */     //   5021: lload #4
/*     */     //   5023: lconst_0
/*     */     //   5024: lcmp
/*     */     //   5025: ifle -> 5101
/*     */     //   5028: iload #32
/*     */     //   5030: ifeq -> 5101
/*     */     //   5033: ifeq -> 5071
/*     */     //   5036: goto -> 5050
/*     */     //   5039: ldc2_w -1918344228954400149
/*     */     //   5042: lload #4
/*     */     //   5044: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   5049: athrow
/*     */     //   5050: aload #6
/*     */     //   5052: iconst_0
/*     */     //   5053: invokevirtual setX : (I)Lorg/bukkit/util/Vector;
/*     */     //   5056: pop
/*     */     //   5057: goto -> 5071
/*     */     //   5060: ldc2_w -1918344228954400149
/*     */     //   5063: lload #4
/*     */     //   5065: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   5070: athrow
/*     */     //   5071: aload #34
/*     */     //   5073: iload #32
/*     */     //   5075: ifeq -> 5124
/*     */     //   5078: invokevirtual getZ : ()D
/*     */     //   5081: aload #33
/*     */     //   5083: invokevirtual getZ : ()D
/*     */     //   5086: dcmpl
/*     */     //   5087: goto -> 5101
/*     */     //   5090: ldc2_w -1918344228954400149
/*     */     //   5093: lload #4
/*     */     //   5095: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   5100: athrow
/*     */     //   5101: ifeq -> 5125
/*     */     //   5104: aload #6
/*     */     //   5106: iconst_0
/*     */     //   5107: invokevirtual setZ : (I)Lorg/bukkit/util/Vector;
/*     */     //   5110: goto -> 5124
/*     */     //   5113: ldc2_w -1918344228954400149
/*     */     //   5116: lload #4
/*     */     //   5118: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   5123: athrow
/*     */     //   5124: pop
/*     */     //   5125: new me/konsolas/aac/cJ
/*     */     //   5128: dup
/*     */     //   5129: aload #35
/*     */     //   5131: invokevirtual a : ()Lorg/bukkit/util/Vector;
/*     */     //   5134: aload_3
/*     */     //   5135: invokevirtual subtract : (Lorg/bukkit/util/Vector;)Lorg/bukkit/util/Vector;
/*     */     //   5138: aload #6
/*     */     //   5140: iload #41
/*     */     //   5142: iload #39
/*     */     //   5144: iconst_0
/*     */     //   5145: invokespecial <init> : (Lorg/bukkit/util/Vector;Lorg/bukkit/util/Vector;ZZZ)V
/*     */     //   5148: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #103	-> 166
/*     */     //   #77	-> 175
/*     */     //   #43	-> 203
/*     */     //   #192	-> 218
/*     */     //   #98	-> 233
/*     */     //   #94	-> 274
/*     */     //   #197	-> 297
/*     */     //   #390	-> 312
/*     */     //   #244	-> 327
/*     */     //   #293	-> 356
/*     */     //   #303	-> 363
/*     */     //   #354	-> 383
/*     */     //   #357	-> 387
/*     */     //   #408	-> 411
/*     */     //   #12	-> 473
/*     */     //   #109	-> 528
/*     */     //   #177	-> 607
/*     */     //   #337	-> 704
/*     */     //   #137	-> 737
/*     */     //   #229	-> 787
/*     */     //   #127	-> 828
/*     */     //   #451	-> 857
/*     */     //   #298	-> 873
/*     */     //   #15	-> 980
/*     */     //   #369	-> 1077
/*     */     //   #483	-> 1110
/*     */     //   #419	-> 1160
/*     */     //   #304	-> 1201
/*     */     //   #311	-> 1230
/*     */     //   #49	-> 1246
/*     */     //   #288	-> 1400
/*     */     //   #205	-> 1497
/*     */     //   #30	-> 1530
/*     */     //   #230	-> 1580
/*     */     //   #139	-> 1621
/*     */     //   #189	-> 1650
/*     */     //   #220	-> 1661
/*     */     //   #55	-> 1744
/*     */     //   #240	-> 1777
/*     */     //   #257	-> 1827
/*     */     //   #449	-> 1868
/*     */     //   #418	-> 1897
/*     */     //   #45	-> 1913
/*     */     //   #436	-> 1933
/*     */     //   #394	-> 2068
/*     */     //   #319	-> 2193
/*     */     //   #133	-> 2222
/*     */     //   #156	-> 2247
/*     */     //   #316	-> 2264
/*     */     //   #375	-> 2283
/*     */     //   #309	-> 2332
/*     */     //   #179	-> 2366
/*     */     //   #308	-> 2386
/*     */     //   #171	-> 2410
/*     */     //   #324	-> 2435
/*     */     //   #106	-> 2486
/*     */     //   #33	-> 2490
/*     */     //   #184	-> 2520
/*     */     //   #70	-> 2566
/*     */     //   #67	-> 2603
/*     */     //   #13	-> 2628
/*     */     //   #431	-> 2636
/*     */     //   #247	-> 2640
/*     */     //   #194	-> 2645
/*     */     //   #108	-> 2652
/*     */     //   #270	-> 2659
/*     */     //   #172	-> 2666
/*     */     //   #129	-> 2670
/*     */     //   #180	-> 2674
/*     */     //   #207	-> 2686
/*     */     //   #216	-> 2696
/*     */     //   #93	-> 2712
/*     */     //   #474	-> 2734
/*     */     //   #325	-> 2738
/*     */     //   #349	-> 2746
/*     */     //   #407	-> 2758
/*     */     //   #318	-> 2772
/*     */     //   #74	-> 2779
/*     */     //   #223	-> 2810
/*     */     //   #284	-> 2830
/*     */     //   #255	-> 2861
/*     */     //   #237	-> 2872
/*     */     //   #140	-> 2879
/*     */     //   #175	-> 2910
/*     */     //   #90	-> 2930
/*     */     //   #5	-> 2961
/*     */     //   #72	-> 2972
/*     */     //   #341	-> 2979
/*     */     //   #437	-> 3010
/*     */     //   #386	-> 3030
/*     */     //   #222	-> 3061
/*     */     //   #458	-> 3072
/*     */     //   #280	-> 3076
/*     */     //   #467	-> 3083
/*     */     //   #92	-> 3114
/*     */     //   #152	-> 3134
/*     */     //   #76	-> 3165
/*     */     //   #225	-> 3176
/*     */     //   #149	-> 3183
/*     */     //   #101	-> 3214
/*     */     //   #124	-> 3234
/*     */     //   #143	-> 3265
/*     */     //   #17	-> 3276
/*     */     //   #266	-> 3283
/*     */     //   #58	-> 3314
/*     */     //   #47	-> 3334
/*     */     //   #420	-> 3365
/*     */     //   #425	-> 3376
/*     */     //   #39	-> 3389
/*     */     //   #8	-> 3402
/*     */     //   #393	-> 3436
/*     */     //   #422	-> 3444
/*     */     //   #198	-> 3452
/*     */     //   #307	-> 3461
/*     */     //   #362	-> 3477
/*     */     //   #314	-> 3485
/*     */     //   #114	-> 3493
/*     */     //   #41	-> 3516
/*     */     //   #360	-> 3520
/*     */     //   #296	-> 3551
/*     */     //   #379	-> 3571
/*     */     //   #87	-> 3609
/*     */     //   #320	-> 3623
/*     */     //   #18	-> 3687
/*     */     //   #262	-> 3695
/*     */     //   #160	-> 3703
/*     */     //   #285	-> 3711
/*     */     //   #215	-> 3715
/*     */     //   #99	-> 3802
/*     */     //   #302	-> 3842
/*     */     //   #170	-> 3923
/*     */     //   #226	-> 4007
/*     */     //   #380	-> 4031
/*     */     //   #153	-> 4071
/*     */     //   #145	-> 4117
/*     */     //   #26	-> 4187
/*     */     //   #231	-> 4242
/*     */     //   #173	-> 4254
/*     */     //   #7	-> 4309
/*     */     //   #22	-> 4341
/*     */     //   #63	-> 4355
/*     */     //   #56	-> 4369
/*     */     //   #346	-> 4381
/*     */     //   #359	-> 4424
/*     */     //   #253	-> 4470
/*     */     //   #479	-> 4568
/*     */     //   #64	-> 4625
/*     */     //   #201	-> 4678
/*     */     //   #104	-> 4713
/*     */     //   #382	-> 4788
/*     */     //   #342	-> 4829
/*     */     //   #332	-> 4883
/*     */     //   #242	-> 4909
/*     */     //   #405	-> 4963
/*     */     //   #154	-> 4996
/*     */     //   #397	-> 5071
/*     */     //   #452	-> 5125
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   175	189	192	aacinternal/v
/*     */     //   186	260	263	aacinternal/v
/*     */     //   203	280	283	aacinternal/v
/*     */     //   294	342	345	aacinternal/v
/*     */     //   411	421	424	aacinternal/v
/*     */     //   418	442	445	aacinternal/v
/*     */     //   435	459	462	aacinternal/v
/*     */     //   456	488	491	aacinternal/v
/*     */     //   473	512	512	aacinternal/v
/*     */     //   538	576	579	aacinternal/v
/*     */     //   571	593	596	aacinternal/v
/*     */     //   590	621	624	aacinternal/v
/*     */     //   607	638	641	aacinternal/v
/*     */     //   635	673	676	aacinternal/v
/*     */     //   652	690	693	aacinternal/v
/*     */     //   687	723	726	aacinternal/v
/*     */     //   704	744	747	aacinternal/v
/*     */     //   737	763	766	aacinternal/v
/*     */     //   777	814	817	aacinternal/v
/*     */     //   787	842	845	aacinternal/v
/*     */     //   887	923	926	aacinternal/v
/*     */     //   897	949	952	aacinternal/v
/*     */     //   937	966	969	aacinternal/v
/*     */     //   963	994	997	aacinternal/v
/*     */     //   980	1011	1014	aacinternal/v
/*     */     //   1008	1046	1049	aacinternal/v
/*     */     //   1025	1063	1066	aacinternal/v
/*     */     //   1060	1096	1099	aacinternal/v
/*     */     //   1077	1117	1120	aacinternal/v
/*     */     //   1110	1136	1139	aacinternal/v
/*     */     //   1150	1187	1190	aacinternal/v
/*     */     //   1160	1215	1218	aacinternal/v
/*     */     //   1260	1282	1285	aacinternal/v
/*     */     //   1270	1301	1304	aacinternal/v
/*     */     //   1296	1318	1321	aacinternal/v
/*     */     //   1315	1369	1372	aacinternal/v
/*     */     //   1332	1386	1389	aacinternal/v
/*     */     //   1383	1414	1417	aacinternal/v
/*     */     //   1400	1431	1434	aacinternal/v
/*     */     //   1428	1466	1469	aacinternal/v
/*     */     //   1445	1483	1486	aacinternal/v
/*     */     //   1480	1516	1519	aacinternal/v
/*     */     //   1497	1537	1540	aacinternal/v
/*     */     //   1530	1556	1559	aacinternal/v
/*     */     //   1570	1607	1610	aacinternal/v
/*     */     //   1580	1635	1638	aacinternal/v
/*     */     //   1650	1678	1681	aacinternal/v
/*     */     //   1675	1713	1716	aacinternal/v
/*     */     //   1692	1730	1733	aacinternal/v
/*     */     //   1727	1763	1766	aacinternal/v
/*     */     //   1744	1784	1787	aacinternal/v
/*     */     //   1777	1803	1806	aacinternal/v
/*     */     //   1817	1854	1857	aacinternal/v
/*     */     //   1827	1882	1885	aacinternal/v
/*     */     //   1942	1950	1953	aacinternal/v
/*     */     //   1947	1987	1990	aacinternal/v
/*     */     //   1964	2004	2007	aacinternal/v
/*     */     //   2001	2025	2028	aacinternal/v
/*     */     //   2039	2047	2050	aacinternal/v
/*     */     //   2068	2078	2081	aacinternal/v
/*     */     //   2075	2108	2111	aacinternal/v
/*     */     //   2092	2132	2135	aacinternal/v
/*     */     //   2122	2162	2165	aacinternal/v
/*     */     //   2146	2179	2182	aacinternal/v
/*     */     //   2176	2205	2208	aacinternal/v
/*     */     //   2308	2352	2355	aacinternal/v
/*     */     //   2386	2472	2475	aacinternal/v
/*     */     //   2490	2542	2545	aacinternal/v
/*     */     //   2556	2587	2590	aacinternal/v
/*     */     //   2830	2840	2850	aacinternal/v
/*     */     //   2930	2940	2950	aacinternal/v
/*     */     //   3030	3040	3050	aacinternal/v
/*     */     //   3134	3144	3154	aacinternal/v
/*     */     //   3234	3244	3254	aacinternal/v
/*     */     //   3334	3344	3354	aacinternal/v
/*     */     //   3402	3422	3425	aacinternal/v
/*     */     //   3465	3502	3505	aacinternal/v
/*     */     //   3551	3588	3598	aacinternal/v
/*     */     //   3623	3673	3676	aacinternal/v
/*     */     //   3726	3734	3737	aacinternal/v
/*     */     //   3731	3764	3767	aacinternal/v
/*     */     //   3748	3781	3784	aacinternal/v
/*     */     //   3802	3821	3824	aacinternal/v
/*     */     //   3842	3859	3862	aacinternal/v
/*     */     //   3856	3880	3883	aacinternal/v
/*     */     //   3894	3902	3905	aacinternal/v
/*     */     //   3923	3944	3947	aacinternal/v
/*     */     //   3935	3976	3979	aacinternal/v
/*     */     //   3958	3993	3996	aacinternal/v
/*     */     //   4019	4033	4036	aacinternal/v
/*     */     //   4047	4055	4058	aacinternal/v
/*     */     //   4052	4126	4129	aacinternal/v
/*     */     //   4069	4147	4150	aacinternal/v
/*     */     //   4140	4171	4174	aacinternal/v
/*     */     //   4161	4204	4207	aacinternal/v
/*     */     //   4185	4228	4231	aacinternal/v
/*     */     //   4218	4277	4280	aacinternal/v
/*     */     //   4242	4295	4298	aacinternal/v
/*     */     //   4291	4324	4327	aacinternal/v
/*     */     //   4341	4383	4386	aacinternal/v
/*     */     //   4397	4405	4408	aacinternal/v
/*     */     //   4402	4483	4486	aacinternal/v
/*     */     //   4419	4507	4510	aacinternal/v
/*     */     //   4497	4528	4531	aacinternal/v
/*     */     //   4521	4552	4555	aacinternal/v
/*     */     //   4542	4578	4581	aacinternal/v
/*     */     //   4566	4602	4605	aacinternal/v
/*     */     //   4592	4640	4643	aacinternal/v
/*     */     //   4616	4664	4667	aacinternal/v
/*     */     //   4654	4699	4702	aacinternal/v
/*     */     //   4678	4724	4727	aacinternal/v
/*     */     //   4738	4753	4756	aacinternal/v
/*     */     //   4750	4774	4777	aacinternal/v
/*     */     //   4800	4815	4818	aacinternal/v
/*     */     //   4812	4852	4855	aacinternal/v
/*     */     //   4829	4869	4872	aacinternal/v
/*     */     //   4866	4895	4898	aacinternal/v
/*     */     //   4883	4923	4926	aacinternal/v
/*     */     //   4909	4946	4949	aacinternal/v
/*     */     //   4960	4969	4972	aacinternal/v
/*     */     //   4983	5007	5010	aacinternal/v
/*     */     //   5021	5036	5039	aacinternal/v
/*     */     //   5033	5057	5060	aacinternal/v
/*     */     //   5071	5087	5090	aacinternal/v
/*     */     //   5101	5110	5113	aacinternal/v
/*     */   }
/*     */   
/*     */   private static final long d = nc.a(2132894848341291874L, -704136215435762742L, MethodHandles.lookup().lookupClass()).a(133457071781250L);
/*     */   
/*     */   static {
/*     */     c = new Vector(0, 0, 0);
/*     */   }
/*     */   
/*     */   private static Vector a(kP paramkP, long paramLong, float paramFloat1, float paramFloat2) {
/*     */     paramLong = d ^ paramLong;
/*     */     long l = paramLong ^ 0x20F31714C40EL;
/*     */     if (paramkP.a(l, kP.V1_13)) {
/*     */       float f5 = paramFloat1 * 0.017453292F;
/*     */       float f6 = -paramFloat2 * 0.017453292F;
/*     */     } 
/*     */     float f1 = e5.a(-paramFloat2 * 0.017453292F - 3.1415927F);
/*     */     float f2 = e5.b(-paramFloat2 * 0.017453292F - 3.1415927F);
/*     */     float f3 = -e5.a(-paramFloat1 * 0.017453292F);
/*     */     float f4 = e5.b(-paramFloat1 * 0.017453292F);
/*     */     return new Vector(f2 * f3, f4, f1 * f3);
/*     */   }
/*     */   
/*     */   private void a(mZ parammZ, double paramDouble, long paramLong, Vector paramVector, boolean paramBoolean) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/kz.d : J
/*     */     //   3: lload #4
/*     */     //   5: lxor
/*     */     //   6: lstore #4
/*     */     //   8: ldc2_w -7439651825763297596
/*     */     //   11: lload #4
/*     */     //   13: <illegal opcode> w : (JJ)I
/*     */     //   18: istore #8
/*     */     //   20: aload_1
/*     */     //   21: invokevirtual c : ()Z
/*     */     //   24: iload #8
/*     */     //   26: ifne -> 86
/*     */     //   29: ifne -> 268
/*     */     //   32: goto -> 46
/*     */     //   35: ldc2_w -7438326961664825394
/*     */     //   38: lload #4
/*     */     //   40: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   45: athrow
/*     */     //   46: aload #6
/*     */     //   48: iload #8
/*     */     //   50: ifne -> 267
/*     */     //   53: goto -> 67
/*     */     //   56: ldc2_w -7438326961664825394
/*     */     //   59: lload #4
/*     */     //   61: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   66: athrow
/*     */     //   67: invokevirtual getY : ()D
/*     */     //   70: dconst_0
/*     */     //   71: dcmpg
/*     */     //   72: goto -> 86
/*     */     //   75: ldc2_w -7438326961664825394
/*     */     //   78: lload #4
/*     */     //   80: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   85: athrow
/*     */     //   86: ifgt -> 237
/*     */     //   89: aload #6
/*     */     //   91: iload #8
/*     */     //   93: ifne -> 267
/*     */     //   96: goto -> 110
/*     */     //   99: ldc2_w -7438326961664825394
/*     */     //   102: lload #4
/*     */     //   104: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   109: athrow
/*     */     //   110: lload #4
/*     */     //   112: lconst_0
/*     */     //   113: lcmp
/*     */     //   114: ifle -> 253
/*     */     //   117: invokevirtual getY : ()D
/*     */     //   120: ldc2_w 0.005
/*     */     //   123: dsub
/*     */     //   124: invokestatic abs : (D)D
/*     */     //   127: ldc2_w 0.003
/*     */     //   130: dcmpl
/*     */     //   131: iflt -> 237
/*     */     //   134: goto -> 148
/*     */     //   137: ldc2_w -7438326961664825394
/*     */     //   140: lload #4
/*     */     //   142: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   147: athrow
/*     */     //   148: aload #6
/*     */     //   150: iload #8
/*     */     //   152: ifne -> 267
/*     */     //   155: goto -> 169
/*     */     //   158: ldc2_w -7438326961664825394
/*     */     //   161: lload #4
/*     */     //   163: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   168: athrow
/*     */     //   169: lload #4
/*     */     //   171: lconst_0
/*     */     //   172: lcmp
/*     */     //   173: ifle -> 253
/*     */     //   176: invokevirtual getY : ()D
/*     */     //   179: dload_2
/*     */     //   180: ldc2_w 16.0
/*     */     //   183: ddiv
/*     */     //   184: dsub
/*     */     //   185: invokestatic abs : (D)D
/*     */     //   188: ldc2_w 0.003
/*     */     //   191: dcmpg
/*     */     //   192: ifge -> 237
/*     */     //   195: goto -> 209
/*     */     //   198: ldc2_w -7438326961664825394
/*     */     //   201: lload #4
/*     */     //   203: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   208: athrow
/*     */     //   209: aload #6
/*     */     //   211: ldc2_w -0.003
/*     */     //   214: invokevirtual setY : (D)Lorg/bukkit/util/Vector;
/*     */     //   217: pop
/*     */     //   218: iload #8
/*     */     //   220: ifeq -> 268
/*     */     //   223: goto -> 237
/*     */     //   226: ldc2_w -7438326961664825394
/*     */     //   229: lload #4
/*     */     //   231: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   236: athrow
/*     */     //   237: aload #6
/*     */     //   239: aload #6
/*     */     //   241: invokevirtual getY : ()D
/*     */     //   244: dload_2
/*     */     //   245: ldc2_w 16.0
/*     */     //   248: ddiv
/*     */     //   249: dsub
/*     */     //   250: invokevirtual setY : (D)Lorg/bukkit/util/Vector;
/*     */     //   253: goto -> 267
/*     */     //   256: ldc2_w -7438326961664825394
/*     */     //   259: lload #4
/*     */     //   261: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   266: athrow
/*     */     //   267: pop
/*     */     //   268: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #269	-> 20
/*     */     //   #433	-> 46
/*     */     //   #361	-> 91
/*     */     //   #301	-> 150
/*     */     //   #442	-> 209
/*     */     //   #200	-> 237
/*     */     //   #384	-> 268
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   20	32	35	aacinternal/v
/*     */     //   29	53	56	aacinternal/v
/*     */     //   46	72	75	aacinternal/v
/*     */     //   86	96	99	aacinternal/v
/*     */     //   89	134	137	aacinternal/v
/*     */     //   110	155	158	aacinternal/v
/*     */     //   148	195	198	aacinternal/v
/*     */     //   169	223	226	aacinternal/v
/*     */     //   209	253	256	aacinternal/v
/*     */   }
/*     */   
/*     */   public ci a(Vector paramVector, gb paramgb, h8 paramh8, ci paramci, mZ parammZ, N paramN, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/kz.d : J
/*     */     //   3: lload #7
/*     */     //   5: lxor
/*     */     //   6: lstore #7
/*     */     //   8: lload #7
/*     */     //   10: dup2
/*     */     //   11: ldc2_w 69092535981644
/*     */     //   14: lxor
/*     */     //   15: lstore #9
/*     */     //   17: dup2
/*     */     //   18: ldc2_w 90595654709187
/*     */     //   21: lxor
/*     */     //   22: lstore #11
/*     */     //   24: dup2
/*     */     //   25: ldc2_w 66054345744128
/*     */     //   28: lxor
/*     */     //   29: lstore #13
/*     */     //   31: dup2
/*     */     //   32: ldc2_w 31126778440204
/*     */     //   35: lxor
/*     */     //   36: lstore #15
/*     */     //   38: dup2
/*     */     //   39: ldc2_w 138854087354293
/*     */     //   42: lxor
/*     */     //   43: lstore #17
/*     */     //   45: pop2
/*     */     //   46: aload_0
/*     */     //   47: aload_2
/*     */     //   48: lload #11
/*     */     //   50: aload #4
/*     */     //   52: invokevirtual a : (Lme/konsolas/aac/gb;JLme/konsolas/aac/ci;)D
/*     */     //   55: dstore #19
/*     */     //   57: aload_0
/*     */     //   58: aload_2
/*     */     //   59: aload #4
/*     */     //   61: invokevirtual a : ()Lme/konsolas/aac/cJ;
/*     */     //   64: invokevirtual b : ()Z
/*     */     //   67: lload #17
/*     */     //   69: aload #5
/*     */     //   71: invokespecial a : (Lme/konsolas/aac/gb;ZJLme/konsolas/aac/mZ;)Lme/konsolas/aac/gg;
/*     */     //   74: astore #21
/*     */     //   76: aload #4
/*     */     //   78: invokevirtual a : ()Lme/konsolas/aac/cJ;
/*     */     //   81: invokevirtual c : ()Z
/*     */     //   84: ifeq -> 123
/*     */     //   87: aload #6
/*     */     //   89: ifnonnull -> 123
/*     */     //   92: goto -> 106
/*     */     //   95: ldc2_w -131512717910703833
/*     */     //   98: lload #7
/*     */     //   100: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   105: athrow
/*     */     //   106: getstatic me/konsolas/aac/kz.c : Lorg/bukkit/util/Vector;
/*     */     //   109: goto -> 139
/*     */     //   112: ldc2_w -131512717910703833
/*     */     //   115: lload #7
/*     */     //   117: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   122: athrow
/*     */     //   123: aload_0
/*     */     //   124: aload_2
/*     */     //   125: lload #13
/*     */     //   127: aload_3
/*     */     //   128: aload #4
/*     */     //   130: aload #5
/*     */     //   132: aload #6
/*     */     //   134: dload #19
/*     */     //   136: invokevirtual a : (Lme/konsolas/aac/gb;JLme/konsolas/aac/h8;Lme/konsolas/aac/ci;Lme/konsolas/aac/mZ;Lme/konsolas/aac/N;D)Lorg/bukkit/util/Vector;
/*     */     //   139: astore #22
/*     */     //   141: aload_0
/*     */     //   142: aload_2
/*     */     //   143: aload_3
/*     */     //   144: aload #4
/*     */     //   146: aload #5
/*     */     //   148: aload #21
/*     */     //   150: aload #22
/*     */     //   152: invokevirtual clone : ()Lorg/bukkit/util/Vector;
/*     */     //   155: lload #9
/*     */     //   157: dload #19
/*     */     //   159: invokespecial a : (Lme/konsolas/aac/gb;Lme/konsolas/aac/h8;Lme/konsolas/aac/ci;Lme/konsolas/aac/mZ;Lme/konsolas/aac/gg;Lorg/bukkit/util/Vector;JD)Lorg/bukkit/util/Vector;
/*     */     //   162: astore #23
/*     */     //   164: aload_0
/*     */     //   165: aload_2
/*     */     //   166: aload_3
/*     */     //   167: aload_1
/*     */     //   168: lload #15
/*     */     //   170: aload #23
/*     */     //   172: aload #4
/*     */     //   174: invokevirtual a : ()Lme/konsolas/aac/cJ;
/*     */     //   177: invokevirtual b : ()Z
/*     */     //   180: aload #5
/*     */     //   182: invokevirtual b : ()Z
/*     */     //   185: invokespecial a : (Lme/konsolas/aac/gb;Lme/konsolas/aac/h8;Lorg/bukkit/util/Vector;JLorg/bukkit/util/Vector;ZZ)Lme/konsolas/aac/cJ;
/*     */     //   188: astore #24
/*     */     //   190: new me/konsolas/aac/ci
/*     */     //   193: dup
/*     */     //   194: aload #5
/*     */     //   196: aload #6
/*     */     //   198: aload #22
/*     */     //   200: aload #21
/*     */     //   202: aload #24
/*     */     //   204: invokespecial <init> : (Lme/konsolas/aac/mZ;Lme/konsolas/aac/N;Lorg/bukkit/util/Vector;Lme/konsolas/aac/gg;Lme/konsolas/aac/cJ;)V
/*     */     //   207: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #336	-> 46
/*     */     //   #348	-> 57
/*     */     //   #126	-> 61
/*     */     //   #50	-> 76
/*     */     //   #312	-> 123
/*     */     //   #38	-> 141
/*     */     //   #14	-> 164
/*     */     //   #423	-> 190
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   76	92	95	aacinternal/v
/*     */     //   87	112	112	aacinternal/v
/*     */   }
/*     */   
/*     */   private boolean a(long paramLong, h8 paramh8, lq paramlq, double paramDouble1, double paramDouble2, double paramDouble3) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/kz.d : J
/*     */     //   3: lload_1
/*     */     //   4: lxor
/*     */     //   5: lstore_1
/*     */     //   6: lload_1
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 105772215721620
/*     */     //   11: lxor
/*     */     //   12: lstore #11
/*     */     //   14: dup2
/*     */     //   15: ldc2_w 6119039609494
/*     */     //   18: lxor
/*     */     //   19: lstore #13
/*     */     //   21: pop2
/*     */     //   22: ldc2_w -8359720999731675192
/*     */     //   25: lload_1
/*     */     //   26: <illegal opcode> w : (JJ)I
/*     */     //   31: istore #15
/*     */     //   33: aload_3
/*     */     //   34: aload #4
/*     */     //   36: dload #5
/*     */     //   38: dload #7
/*     */     //   40: lload #11
/*     */     //   42: dload #9
/*     */     //   44: invokevirtual a : (Lme/konsolas/aac/lq;DDJD)Z
/*     */     //   47: ifeq -> 149
/*     */     //   50: aload_0
/*     */     //   51: getfield a : Lme/konsolas/aac/lq;
/*     */     //   54: lload_1
/*     */     //   55: lconst_0
/*     */     //   56: lcmp
/*     */     //   57: ifle -> 111
/*     */     //   60: iload #15
/*     */     //   62: ifeq -> 111
/*     */     //   65: goto -> 78
/*     */     //   68: ldc2_w -8379866603165059905
/*     */     //   71: lload_1
/*     */     //   72: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   77: athrow
/*     */     //   78: ifnull -> 145
/*     */     //   81: goto -> 94
/*     */     //   84: ldc2_w -8379866603165059905
/*     */     //   87: lload_1
/*     */     //   88: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   93: athrow
/*     */     //   94: aload_0
/*     */     //   95: getfield a : Lme/konsolas/aac/lq;
/*     */     //   98: goto -> 111
/*     */     //   101: ldc2_w -8379866603165059905
/*     */     //   104: lload_1
/*     */     //   105: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   110: athrow
/*     */     //   111: aload #4
/*     */     //   113: dload #5
/*     */     //   115: dload #7
/*     */     //   117: dload #9
/*     */     //   119: lload #13
/*     */     //   121: invokevirtual a : (Lme/konsolas/aac/lq;DDDJ)Z
/*     */     //   124: iload #15
/*     */     //   126: ifeq -> 146
/*     */     //   129: ifne -> 149
/*     */     //   132: goto -> 145
/*     */     //   135: ldc2_w -8379866603165059905
/*     */     //   138: lload_1
/*     */     //   139: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   144: athrow
/*     */     //   145: iconst_1
/*     */     //   146: goto -> 150
/*     */     //   149: iconst_0
/*     */     //   150: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #345	-> 33
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   33	65	68	aacinternal/v
/*     */     //   50	81	84	aacinternal/v
/*     */     //   78	98	101	aacinternal/v
/*     */     //   111	132	135	aacinternal/v
/*     */   }
/*     */   
/*     */   public kz(kP paramkP, lq paramlq) {
/*     */     this.b = paramkP;
/* 403 */     this.a = paramlq;
/*     */   }
/*     */   
/*     */   private Collection a(h8 paramh8, lq paramlq, short paramShort, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: iload_3
/*     */     //   1: i2l
/*     */     //   2: bipush #48
/*     */     //   4: lshl
/*     */     //   5: lload #4
/*     */     //   7: bipush #16
/*     */     //   9: lshl
/*     */     //   10: bipush #16
/*     */     //   12: lushr
/*     */     //   13: lor
/*     */     //   14: getstatic me/konsolas/aac/kz.d : J
/*     */     //   17: lxor
/*     */     //   18: lstore #6
/*     */     //   20: lload #6
/*     */     //   22: dup2
/*     */     //   23: ldc2_w 45055666689712
/*     */     //   26: lxor
/*     */     //   27: lstore #8
/*     */     //   29: dup2
/*     */     //   30: ldc2_w 139799430530515
/*     */     //   33: lxor
/*     */     //   34: dup2
/*     */     //   35: bipush #8
/*     */     //   37: lushr
/*     */     //   38: lstore #10
/*     */     //   40: dup2
/*     */     //   41: bipush #56
/*     */     //   43: lshl
/*     */     //   44: bipush #56
/*     */     //   46: lushr
/*     */     //   47: l2i
/*     */     //   48: istore #12
/*     */     //   50: pop2
/*     */     //   51: pop2
/*     */     //   52: ldc2_w -6432436953548877169
/*     */     //   55: lload #6
/*     */     //   57: <illegal opcode> w : (JJ)I
/*     */     //   62: aload_1
/*     */     //   63: aload_2
/*     */     //   64: lload #8
/*     */     //   66: invokevirtual a : (Lme/konsolas/aac/lq;J)Ljava/util/Collection;
/*     */     //   69: astore #14
/*     */     //   71: istore #13
/*     */     //   73: aload_0
/*     */     //   74: getfield a : Lme/konsolas/aac/lq;
/*     */     //   77: iload #13
/*     */     //   79: ifeq -> 100
/*     */     //   82: ifnull -> 163
/*     */     //   85: goto -> 99
/*     */     //   88: ldc2_w -6416625511687071240
/*     */     //   91: lload #6
/*     */     //   93: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   98: athrow
/*     */     //   99: aload_2
/*     */     //   100: aload_0
/*     */     //   101: getfield a : Lme/konsolas/aac/lq;
/*     */     //   104: lload #10
/*     */     //   106: dup2_x1
/*     */     //   107: pop2
/*     */     //   108: iload #12
/*     */     //   110: i2b
/*     */     //   111: swap
/*     */     //   112: invokevirtual b : (JBLme/konsolas/aac/lq;)Z
/*     */     //   115: iload #13
/*     */     //   117: ifeq -> 162
/*     */     //   120: ifeq -> 163
/*     */     //   123: goto -> 137
/*     */     //   126: ldc2_w -6416625511687071240
/*     */     //   129: lload #6
/*     */     //   131: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   136: athrow
/*     */     //   137: aload #14
/*     */     //   139: aload_0
/*     */     //   140: getfield a : Lme/konsolas/aac/lq;
/*     */     //   143: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   148: goto -> 162
/*     */     //   151: ldc2_w -6416625511687071240
/*     */     //   154: lload #6
/*     */     //   156: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   161: athrow
/*     */     //   162: pop
/*     */     //   163: aload #14
/*     */     //   165: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #400	-> 62
/*     */     //   #417	-> 73
/*     */     //   #195	-> 137
/*     */     //   #409	-> 163
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   73	85	88	aacinternal/v
/*     */     //   100	123	126	aacinternal/v
/*     */     //   120	148	151	aacinternal/v
/*     */   }
/*     */   
/*     */   private static Vector a(float paramFloat1, float paramFloat2, long paramLong, float paramFloat3, float paramFloat4) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/kz.d : J
/*     */     //   3: lload_2
/*     */     //   4: lxor
/*     */     //   5: lstore_2
/*     */     //   6: ldc2_w 1842547202224369062
/*     */     //   9: lload_2
/*     */     //   10: <illegal opcode> w : (JJ)I
/*     */     //   15: fload_0
/*     */     //   16: fload_0
/*     */     //   17: fmul
/*     */     //   18: fload_1
/*     */     //   19: fload_1
/*     */     //   20: fmul
/*     */     //   21: fadd
/*     */     //   22: fstore #7
/*     */     //   24: istore #6
/*     */     //   26: fload #7
/*     */     //   28: ldc_w 1.0E-4
/*     */     //   31: fcmpl
/*     */     //   32: iload #6
/*     */     //   34: ifeq -> 88
/*     */     //   37: iflt -> 166
/*     */     //   40: goto -> 53
/*     */     //   43: ldc2_w 1863082153031001809
/*     */     //   46: lload_2
/*     */     //   47: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   52: athrow
/*     */     //   53: fload #7
/*     */     //   55: invokestatic e : (F)F
/*     */     //   58: fstore #7
/*     */     //   60: fload #7
/*     */     //   62: lload_2
/*     */     //   63: lconst_0
/*     */     //   64: lcmp
/*     */     //   65: iflt -> 123
/*     */     //   68: fconst_1
/*     */     //   69: iload #6
/*     */     //   71: ifeq -> 119
/*     */     //   74: fcmpg
/*     */     //   75: goto -> 88
/*     */     //   78: ldc2_w 1863082153031001809
/*     */     //   81: lload_2
/*     */     //   82: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   87: athrow
/*     */     //   88: ifge -> 94
/*     */     //   91: fconst_1
/*     */     //   92: fstore #7
/*     */     //   94: fload #4
/*     */     //   96: fload #7
/*     */     //   98: fdiv
/*     */     //   99: fstore #7
/*     */     //   101: fload_0
/*     */     //   102: fload #7
/*     */     //   104: fmul
/*     */     //   105: fstore_0
/*     */     //   106: fload_1
/*     */     //   107: fload #7
/*     */     //   109: fmul
/*     */     //   110: fstore_1
/*     */     //   111: fload #5
/*     */     //   113: ldc 3.1415927
/*     */     //   115: fmul
/*     */     //   116: ldc_w 180.0
/*     */     //   119: fdiv
/*     */     //   120: invokestatic b : (F)F
/*     */     //   123: fstore #8
/*     */     //   125: fload #5
/*     */     //   127: ldc 3.1415927
/*     */     //   129: fmul
/*     */     //   130: ldc_w 180.0
/*     */     //   133: fdiv
/*     */     //   134: invokestatic a : (F)F
/*     */     //   137: fstore #9
/*     */     //   139: new org/bukkit/util/Vector
/*     */     //   142: dup
/*     */     //   143: fload_0
/*     */     //   144: fload #9
/*     */     //   146: fmul
/*     */     //   147: fload_1
/*     */     //   148: fload #8
/*     */     //   150: fmul
/*     */     //   151: fsub
/*     */     //   152: fconst_0
/*     */     //   153: fload_1
/*     */     //   154: fload #9
/*     */     //   156: fmul
/*     */     //   157: fload_0
/*     */     //   158: fload #8
/*     */     //   160: fmul
/*     */     //   161: fadd
/*     */     //   162: invokespecial <init> : (FFF)V
/*     */     //   165: areturn
/*     */     //   166: new org/bukkit/util/Vector
/*     */     //   169: dup
/*     */     //   170: iconst_0
/*     */     //   171: iconst_0
/*     */     //   172: iconst_0
/*     */     //   173: invokespecial <init> : (III)V
/*     */     //   176: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #415	-> 15
/*     */     //   #162	-> 26
/*     */     //   #28	-> 53
/*     */     //   #480	-> 60
/*     */     //   #283	-> 91
/*     */     //   #432	-> 94
/*     */     //   #186	-> 101
/*     */     //   #246	-> 106
/*     */     //   #174	-> 111
/*     */     //   #91	-> 125
/*     */     //   #462	-> 139
/*     */     //   #110	-> 166
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   26	40	43	aacinternal/v
/*     */     //   60	75	78	aacinternal/v
/*     */   }
/*     */   
/*     */   private Vector a(gb paramgb, h8 paramh8, ci paramci, mZ parammZ, gg paramgg, Vector paramVector, long paramLong, double paramDouble) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/kz.d : J
/*     */     //   3: lload #7
/*     */     //   5: lxor
/*     */     //   6: lstore #7
/*     */     //   8: lload #7
/*     */     //   10: dup2
/*     */     //   11: ldc2_w 28369684029260
/*     */     //   14: lxor
/*     */     //   15: lstore #11
/*     */     //   17: dup2
/*     */     //   18: ldc2_w 30409773179740
/*     */     //   21: lxor
/*     */     //   22: dup2
/*     */     //   23: bipush #32
/*     */     //   25: lushr
/*     */     //   26: lstore #13
/*     */     //   28: dup2
/*     */     //   29: bipush #32
/*     */     //   31: lshl
/*     */     //   32: bipush #32
/*     */     //   34: lushr
/*     */     //   35: l2i
/*     */     //   36: istore #15
/*     */     //   38: pop2
/*     */     //   39: dup2
/*     */     //   40: ldc2_w 62950531483746
/*     */     //   43: lxor
/*     */     //   44: lstore #16
/*     */     //   46: dup2
/*     */     //   47: ldc2_w 4875855638970
/*     */     //   50: lxor
/*     */     //   51: lstore #18
/*     */     //   53: dup2
/*     */     //   54: ldc2_w 84139857078786
/*     */     //   57: lxor
/*     */     //   58: lstore #20
/*     */     //   60: pop2
/*     */     //   61: ldc2_w -2800038770168457439
/*     */     //   64: lload #7
/*     */     //   66: <illegal opcode> w : (JJ)I
/*     */     //   71: istore #22
/*     */     //   73: aload_1
/*     */     //   74: invokeinterface a : ()Lorg/bukkit/entity/EntityType;
/*     */     //   79: getstatic org/bukkit/entity/EntityType.PLAYER : Lorg/bukkit/entity/EntityType;
/*     */     //   82: if_acmpeq -> 108
/*     */     //   85: aload #6
/*     */     //   87: ldc2_w 0.98
/*     */     //   90: invokevirtual multiply : (D)Lorg/bukkit/util/Vector;
/*     */     //   93: pop
/*     */     //   94: goto -> 108
/*     */     //   97: ldc2_w -2801082219286583765
/*     */     //   100: lload #7
/*     */     //   102: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   107: athrow
/*     */     //   108: iconst_0
/*     */     //   109: istore #23
/*     */     //   111: iload #23
/*     */     //   113: aload #4
/*     */     //   115: invokevirtual a : ()I
/*     */     //   118: if_icmpge -> 192
/*     */     //   121: aload #6
/*     */     //   123: aload #6
/*     */     //   125: invokevirtual getX : ()D
/*     */     //   128: ldc2_w 0.6
/*     */     //   131: dmul
/*     */     //   132: invokevirtual setX : (D)Lorg/bukkit/util/Vector;
/*     */     //   135: pop
/*     */     //   136: aload #6
/*     */     //   138: aload #6
/*     */     //   140: invokevirtual getZ : ()D
/*     */     //   143: ldc2_w 0.6
/*     */     //   146: dmul
/*     */     //   147: invokevirtual setZ : (D)Lorg/bukkit/util/Vector;
/*     */     //   150: pop
/*     */     //   151: iinc #23, 1
/*     */     //   154: iload #22
/*     */     //   156: lload #7
/*     */     //   158: lconst_0
/*     */     //   159: lcmp
/*     */     //   160: ifle -> 168
/*     */     //   163: ifne -> 386
/*     */     //   166: iload #22
/*     */     //   168: ifeq -> 111
/*     */     //   171: lload #7
/*     */     //   173: lconst_0
/*     */     //   174: lcmp
/*     */     //   175: iflt -> 154
/*     */     //   178: goto -> 192
/*     */     //   181: ldc2_w -2801082219286583765
/*     */     //   184: lload #7
/*     */     //   186: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   191: athrow
/*     */     //   192: aload_0
/*     */     //   193: getfield b : Lme/konsolas/aac/kP;
/*     */     //   196: lload #11
/*     */     //   198: getstatic me/konsolas/aac/kP.V1_13 : Lme/konsolas/aac/kP;
/*     */     //   201: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*     */     //   204: iload #22
/*     */     //   206: ifne -> 391
/*     */     //   209: ifeq -> 386
/*     */     //   212: goto -> 226
/*     */     //   215: ldc2_w -2801082219286583765
/*     */     //   218: lload #7
/*     */     //   220: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   225: athrow
/*     */     //   226: aload_1
/*     */     //   227: invokeinterface p : ()Z
/*     */     //   232: iload #22
/*     */     //   234: ifne -> 391
/*     */     //   237: goto -> 251
/*     */     //   240: ldc2_w -2801082219286583765
/*     */     //   243: lload #7
/*     */     //   245: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   250: athrow
/*     */     //   251: ifeq -> 386
/*     */     //   254: goto -> 268
/*     */     //   257: ldc2_w -2801082219286583765
/*     */     //   260: lload #7
/*     */     //   262: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   267: athrow
/*     */     //   268: aload #4
/*     */     //   270: invokevirtual b : ()Z
/*     */     //   273: iload #22
/*     */     //   275: ifne -> 391
/*     */     //   278: goto -> 292
/*     */     //   281: ldc2_w -2801082219286583765
/*     */     //   284: lload #7
/*     */     //   286: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   291: athrow
/*     */     //   292: ifeq -> 386
/*     */     //   295: goto -> 309
/*     */     //   298: ldc2_w -2801082219286583765
/*     */     //   301: lload #7
/*     */     //   303: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   308: athrow
/*     */     //   309: aload #4
/*     */     //   311: invokevirtual f : ()Z
/*     */     //   314: iload #22
/*     */     //   316: lload #7
/*     */     //   318: lconst_0
/*     */     //   319: lcmp
/*     */     //   320: iflt -> 393
/*     */     //   323: ifne -> 391
/*     */     //   326: goto -> 340
/*     */     //   329: ldc2_w -2801082219286583765
/*     */     //   332: lload #7
/*     */     //   334: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   339: athrow
/*     */     //   340: ifne -> 386
/*     */     //   343: goto -> 357
/*     */     //   346: ldc2_w -2801082219286583765
/*     */     //   349: lload #7
/*     */     //   351: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   356: athrow
/*     */     //   357: aload #6
/*     */     //   359: aload #6
/*     */     //   361: invokevirtual getY : ()D
/*     */     //   364: ldc2_w 0.03999999910593033
/*     */     //   367: dsub
/*     */     //   368: invokevirtual setY : (D)Lorg/bukkit/util/Vector;
/*     */     //   371: pop
/*     */     //   372: goto -> 386
/*     */     //   375: ldc2_w -2801082219286583765
/*     */     //   378: lload #7
/*     */     //   380: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   385: athrow
/*     */     //   386: aload #4
/*     */     //   388: invokevirtual f : ()Z
/*     */     //   391: iload #22
/*     */     //   393: ifne -> 574
/*     */     //   396: ifeq -> 562
/*     */     //   399: goto -> 413
/*     */     //   402: ldc2_w -2801082219286583765
/*     */     //   405: lload #7
/*     */     //   407: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   412: athrow
/*     */     //   413: iconst_0
/*     */     //   414: istore #23
/*     */     //   416: aload #4
/*     */     //   418: invokevirtual b : ()Z
/*     */     //   421: iload #22
/*     */     //   423: lload #7
/*     */     //   425: lconst_0
/*     */     //   426: lcmp
/*     */     //   427: ifle -> 460
/*     */     //   430: ifne -> 458
/*     */     //   433: ifeq -> 453
/*     */     //   436: goto -> 450
/*     */     //   439: ldc2_w -2801082219286583765
/*     */     //   442: lload #7
/*     */     //   444: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   449: athrow
/*     */     //   450: iinc #23, -1
/*     */     //   453: aload #4
/*     */     //   455: invokevirtual e : ()Z
/*     */     //   458: iload #22
/*     */     //   460: lload #7
/*     */     //   462: lconst_0
/*     */     //   463: lcmp
/*     */     //   464: ifle -> 494
/*     */     //   467: ifne -> 492
/*     */     //   470: ifeq -> 490
/*     */     //   473: goto -> 487
/*     */     //   476: ldc2_w -2801082219286583765
/*     */     //   479: lload #7
/*     */     //   481: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   486: athrow
/*     */     //   487: iinc #23, 1
/*     */     //   490: iload #23
/*     */     //   492: iload #22
/*     */     //   494: lload #7
/*     */     //   496: lconst_0
/*     */     //   497: lcmp
/*     */     //   498: ifle -> 576
/*     */     //   501: ifne -> 574
/*     */     //   504: ifeq -> 562
/*     */     //   507: goto -> 521
/*     */     //   510: ldc2_w -2801082219286583765
/*     */     //   513: lload #7
/*     */     //   515: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   520: athrow
/*     */     //   521: aload #6
/*     */     //   523: aload #6
/*     */     //   525: invokevirtual getY : ()D
/*     */     //   528: iload #23
/*     */     //   530: i2f
/*     */     //   531: aload_1
/*     */     //   532: invokeinterface c : ()F
/*     */     //   537: fmul
/*     */     //   538: ldc_w 3.0
/*     */     //   541: fmul
/*     */     //   542: f2d
/*     */     //   543: dadd
/*     */     //   544: invokevirtual setY : (D)Lorg/bukkit/util/Vector;
/*     */     //   547: pop
/*     */     //   548: goto -> 562
/*     */     //   551: ldc2_w -2801082219286583765
/*     */     //   554: lload #7
/*     */     //   556: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   561: athrow
/*     */     //   562: aload_0
/*     */     //   563: getfield b : Lme/konsolas/aac/kP;
/*     */     //   566: lload #11
/*     */     //   568: getstatic me/konsolas/aac/kP.V1_9 : Lme/konsolas/aac/kP;
/*     */     //   571: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*     */     //   574: iload #22
/*     */     //   576: lload #7
/*     */     //   578: lconst_0
/*     */     //   579: lcmp
/*     */     //   580: ifle -> 843
/*     */     //   583: ifne -> 841
/*     */     //   586: ifeq -> 815
/*     */     //   589: goto -> 603
/*     */     //   592: ldc2_w -2801082219286583765
/*     */     //   595: lload #7
/*     */     //   597: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   602: athrow
/*     */     //   603: aload #6
/*     */     //   605: invokevirtual getX : ()D
/*     */     //   608: invokestatic abs : (D)D
/*     */     //   611: ldc2_w 0.003
/*     */     //   614: dcmpg
/*     */     //   615: iload #22
/*     */     //   617: lload #7
/*     */     //   619: lconst_0
/*     */     //   620: lcmp
/*     */     //   621: iflt -> 700
/*     */     //   624: ifne -> 691
/*     */     //   627: goto -> 641
/*     */     //   630: ldc2_w -2801082219286583765
/*     */     //   633: lload #7
/*     */     //   635: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   640: athrow
/*     */     //   641: ifge -> 679
/*     */     //   644: goto -> 658
/*     */     //   647: ldc2_w -2801082219286583765
/*     */     //   650: lload #7
/*     */     //   652: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   657: athrow
/*     */     //   658: aload #6
/*     */     //   660: iconst_0
/*     */     //   661: invokevirtual setX : (I)Lorg/bukkit/util/Vector;
/*     */     //   664: pop
/*     */     //   665: goto -> 679
/*     */     //   668: ldc2_w -2801082219286583765
/*     */     //   671: lload #7
/*     */     //   673: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   678: athrow
/*     */     //   679: aload #6
/*     */     //   681: invokevirtual getY : ()D
/*     */     //   684: invokestatic abs : (D)D
/*     */     //   687: ldc2_w 0.003
/*     */     //   690: dcmpg
/*     */     //   691: lload #7
/*     */     //   693: lconst_0
/*     */     //   694: lcmp
/*     */     //   695: ifle -> 779
/*     */     //   698: iload #22
/*     */     //   700: ifne -> 779
/*     */     //   703: ifge -> 741
/*     */     //   706: goto -> 720
/*     */     //   709: ldc2_w -2801082219286583765
/*     */     //   712: lload #7
/*     */     //   714: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   719: athrow
/*     */     //   720: aload #6
/*     */     //   722: iconst_0
/*     */     //   723: invokevirtual setY : (I)Lorg/bukkit/util/Vector;
/*     */     //   726: pop
/*     */     //   727: goto -> 741
/*     */     //   730: ldc2_w -2801082219286583765
/*     */     //   733: lload #7
/*     */     //   735: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   740: athrow
/*     */     //   741: aload #6
/*     */     //   743: lload #7
/*     */     //   745: lconst_0
/*     */     //   746: lcmp
/*     */     //   747: iflt -> 802
/*     */     //   750: iload #22
/*     */     //   752: ifne -> 802
/*     */     //   755: invokevirtual getZ : ()D
/*     */     //   758: invokestatic abs : (D)D
/*     */     //   761: ldc2_w 0.003
/*     */     //   764: dcmpg
/*     */     //   765: goto -> 779
/*     */     //   768: ldc2_w -2801082219286583765
/*     */     //   771: lload #7
/*     */     //   773: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   778: athrow
/*     */     //   779: ifge -> 1008
/*     */     //   782: aload #6
/*     */     //   784: iconst_0
/*     */     //   785: invokevirtual setZ : (I)Lorg/bukkit/util/Vector;
/*     */     //   788: goto -> 802
/*     */     //   791: ldc2_w -2801082219286583765
/*     */     //   794: lload #7
/*     */     //   796: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   801: athrow
/*     */     //   802: pop
/*     */     //   803: iload #22
/*     */     //   805: lload #7
/*     */     //   807: lconst_0
/*     */     //   808: lcmp
/*     */     //   809: iflt -> 827
/*     */     //   812: ifeq -> 1008
/*     */     //   815: aload #6
/*     */     //   817: invokevirtual getX : ()D
/*     */     //   820: invokestatic abs : (D)D
/*     */     //   823: ldc2_w 0.005
/*     */     //   826: dcmpg
/*     */     //   827: goto -> 841
/*     */     //   830: ldc2_w -2801082219286583765
/*     */     //   833: lload #7
/*     */     //   835: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   840: athrow
/*     */     //   841: iload #22
/*     */     //   843: lload #7
/*     */     //   845: lconst_0
/*     */     //   846: lcmp
/*     */     //   847: iflt -> 912
/*     */     //   850: ifne -> 903
/*     */     //   853: ifge -> 891
/*     */     //   856: goto -> 870
/*     */     //   859: ldc2_w -2801082219286583765
/*     */     //   862: lload #7
/*     */     //   864: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   869: athrow
/*     */     //   870: aload #6
/*     */     //   872: iconst_0
/*     */     //   873: invokevirtual setX : (I)Lorg/bukkit/util/Vector;
/*     */     //   876: pop
/*     */     //   877: goto -> 891
/*     */     //   880: ldc2_w -2801082219286583765
/*     */     //   883: lload #7
/*     */     //   885: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   890: athrow
/*     */     //   891: aload #6
/*     */     //   893: invokevirtual getY : ()D
/*     */     //   896: invokestatic abs : (D)D
/*     */     //   899: ldc2_w 0.005
/*     */     //   902: dcmpg
/*     */     //   903: lload #7
/*     */     //   905: lconst_0
/*     */     //   906: lcmp
/*     */     //   907: ifle -> 984
/*     */     //   910: iload #22
/*     */     //   912: ifne -> 984
/*     */     //   915: ifge -> 953
/*     */     //   918: goto -> 932
/*     */     //   921: ldc2_w -2801082219286583765
/*     */     //   924: lload #7
/*     */     //   926: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   931: athrow
/*     */     //   932: aload #6
/*     */     //   934: iconst_0
/*     */     //   935: invokevirtual setY : (I)Lorg/bukkit/util/Vector;
/*     */     //   938: pop
/*     */     //   939: goto -> 953
/*     */     //   942: ldc2_w -2801082219286583765
/*     */     //   945: lload #7
/*     */     //   947: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   952: athrow
/*     */     //   953: aload #6
/*     */     //   955: iload #22
/*     */     //   957: ifne -> 1007
/*     */     //   960: invokevirtual getZ : ()D
/*     */     //   963: invokestatic abs : (D)D
/*     */     //   966: ldc2_w 0.005
/*     */     //   969: dcmpg
/*     */     //   970: goto -> 984
/*     */     //   973: ldc2_w -2801082219286583765
/*     */     //   976: lload #7
/*     */     //   978: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   983: athrow
/*     */     //   984: ifge -> 1008
/*     */     //   987: aload #6
/*     */     //   989: iconst_0
/*     */     //   990: invokevirtual setZ : (I)Lorg/bukkit/util/Vector;
/*     */     //   993: goto -> 1007
/*     */     //   996: ldc2_w -2801082219286583765
/*     */     //   999: lload #7
/*     */     //   1001: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1006: athrow
/*     */     //   1007: pop
/*     */     //   1008: aload #4
/*     */     //   1010: invokevirtual b : ()F
/*     */     //   1013: ldc_w 0.98
/*     */     //   1016: fmul
/*     */     //   1017: fstore #23
/*     */     //   1019: aload #4
/*     */     //   1021: invokevirtual c : ()F
/*     */     //   1024: ldc_w 0.98
/*     */     //   1027: fmul
/*     */     //   1028: fstore #24
/*     */     //   1030: iload #22
/*     */     //   1032: lload #7
/*     */     //   1034: lconst_0
/*     */     //   1035: lcmp
/*     */     //   1036: ifle -> 1080
/*     */     //   1039: ifne -> 1076
/*     */     //   1042: aload_1
/*     */     //   1043: invokeinterface a : ()Lorg/bukkit/entity/EntityType;
/*     */     //   1048: getstatic org/bukkit/entity/EntityType.PLAYER : Lorg/bukkit/entity/EntityType;
/*     */     //   1051: if_acmpeq -> 1117
/*     */     //   1054: goto -> 1068
/*     */     //   1057: ldc2_w -2801082219286583765
/*     */     //   1060: lload #7
/*     */     //   1062: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1067: athrow
/*     */     //   1068: fload #24
/*     */     //   1070: ldc_w 0.5
/*     */     //   1073: fmul
/*     */     //   1074: fstore #24
/*     */     //   1076: fload #23
/*     */     //   1078: fconst_0
/*     */     //   1079: fcmpg
/*     */     //   1080: iload #22
/*     */     //   1082: lload #7
/*     */     //   1084: lconst_0
/*     */     //   1085: lcmp
/*     */     //   1086: iflt -> 1124
/*     */     //   1089: ifne -> 1122
/*     */     //   1092: ifge -> 1117
/*     */     //   1095: goto -> 1109
/*     */     //   1098: ldc2_w -2801082219286583765
/*     */     //   1101: lload #7
/*     */     //   1103: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1108: athrow
/*     */     //   1109: fload #23
/*     */     //   1111: ldc_w 0.25
/*     */     //   1114: fmul
/*     */     //   1115: fstore #23
/*     */     //   1117: aload #4
/*     */     //   1119: invokevirtual d : ()Z
/*     */     //   1122: iload #22
/*     */     //   1124: ifne -> 1165
/*     */     //   1127: ifeq -> 1160
/*     */     //   1130: goto -> 1144
/*     */     //   1133: ldc2_w -2801082219286583765
/*     */     //   1136: lload #7
/*     */     //   1138: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1143: athrow
/*     */     //   1144: fload #23
/*     */     //   1146: ldc_w 0.2
/*     */     //   1149: fmul
/*     */     //   1150: fstore #23
/*     */     //   1152: fload #24
/*     */     //   1154: ldc_w 0.2
/*     */     //   1157: fmul
/*     */     //   1158: fstore #24
/*     */     //   1160: aload #4
/*     */     //   1162: invokevirtual b : ()Z
/*     */     //   1165: istore #25
/*     */     //   1167: aload_1
/*     */     //   1168: invokeinterface p : ()Z
/*     */     //   1173: iload #22
/*     */     //   1175: lload #7
/*     */     //   1177: lconst_0
/*     */     //   1178: lcmp
/*     */     //   1179: ifle -> 1334
/*     */     //   1182: ifne -> 1332
/*     */     //   1185: ifeq -> 1306
/*     */     //   1188: goto -> 1202
/*     */     //   1191: ldc2_w -2801082219286583765
/*     */     //   1194: lload #7
/*     */     //   1196: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1201: athrow
/*     */     //   1202: aload_0
/*     */     //   1203: getfield b : Lme/konsolas/aac/kP;
/*     */     //   1206: lload #11
/*     */     //   1208: getstatic me/konsolas/aac/kP.V1_15 : Lme/konsolas/aac/kP;
/*     */     //   1211: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*     */     //   1214: iload #22
/*     */     //   1216: ifne -> 1392
/*     */     //   1219: goto -> 1233
/*     */     //   1222: ldc2_w -2801082219286583765
/*     */     //   1225: lload #7
/*     */     //   1227: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1232: athrow
/*     */     //   1233: ifeq -> 1390
/*     */     //   1236: goto -> 1250
/*     */     //   1239: ldc2_w -2801082219286583765
/*     */     //   1242: lload #7
/*     */     //   1244: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1249: athrow
/*     */     //   1250: aload #4
/*     */     //   1252: invokevirtual c : ()Z
/*     */     //   1255: iload #22
/*     */     //   1257: ifne -> 1392
/*     */     //   1260: goto -> 1274
/*     */     //   1263: ldc2_w -2801082219286583765
/*     */     //   1266: lload #7
/*     */     //   1268: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1273: athrow
/*     */     //   1274: ifeq -> 1390
/*     */     //   1277: goto -> 1291
/*     */     //   1280: ldc2_w -2801082219286583765
/*     */     //   1283: lload #7
/*     */     //   1285: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1290: athrow
/*     */     //   1291: iconst_0
/*     */     //   1292: istore #25
/*     */     //   1294: iload #22
/*     */     //   1296: lload #7
/*     */     //   1298: lconst_0
/*     */     //   1299: lcmp
/*     */     //   1300: ifle -> 1318
/*     */     //   1303: ifeq -> 1390
/*     */     //   1306: aload_0
/*     */     //   1307: getfield b : Lme/konsolas/aac/kP;
/*     */     //   1310: lload #11
/*     */     //   1312: getstatic me/konsolas/aac/kP.V1_13 : Lme/konsolas/aac/kP;
/*     */     //   1315: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*     */     //   1318: goto -> 1332
/*     */     //   1321: ldc2_w -2801082219286583765
/*     */     //   1324: lload #7
/*     */     //   1326: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1331: athrow
/*     */     //   1332: iload #22
/*     */     //   1334: lload #7
/*     */     //   1336: lconst_0
/*     */     //   1337: lcmp
/*     */     //   1338: ifle -> 1394
/*     */     //   1341: ifne -> 1392
/*     */     //   1344: ifeq -> 1390
/*     */     //   1347: goto -> 1361
/*     */     //   1350: ldc2_w -2801082219286583765
/*     */     //   1353: lload #7
/*     */     //   1355: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1360: athrow
/*     */     //   1361: aload_1
/*     */     //   1362: invokeinterface a : ()Lme/konsolas/aac/mF;
/*     */     //   1367: getstatic me/konsolas/aac/mF.SWIMMING : Lme/konsolas/aac/mF;
/*     */     //   1370: if_acmpne -> 1390
/*     */     //   1373: goto -> 1387
/*     */     //   1376: ldc2_w -2801082219286583765
/*     */     //   1379: lload #7
/*     */     //   1381: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1386: athrow
/*     */     //   1387: iconst_1
/*     */     //   1388: istore #25
/*     */     //   1390: iload #25
/*     */     //   1392: iload #22
/*     */     //   1394: ifne -> 1487
/*     */     //   1397: ifeq -> 1482
/*     */     //   1400: goto -> 1414
/*     */     //   1403: ldc2_w -2801082219286583765
/*     */     //   1406: lload #7
/*     */     //   1408: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1413: athrow
/*     */     //   1414: aload #4
/*     */     //   1416: invokevirtual f : ()Z
/*     */     //   1419: iload #22
/*     */     //   1421: lload #7
/*     */     //   1423: lconst_0
/*     */     //   1424: lcmp
/*     */     //   1425: iflt -> 1489
/*     */     //   1428: ifne -> 1487
/*     */     //   1431: goto -> 1445
/*     */     //   1434: ldc2_w -2801082219286583765
/*     */     //   1437: lload #7
/*     */     //   1439: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1444: athrow
/*     */     //   1445: ifne -> 1482
/*     */     //   1448: goto -> 1462
/*     */     //   1451: ldc2_w -2801082219286583765
/*     */     //   1454: lload #7
/*     */     //   1456: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1461: athrow
/*     */     //   1462: fload #23
/*     */     //   1464: f2d
/*     */     //   1465: ldc2_w 0.3
/*     */     //   1468: dmul
/*     */     //   1469: d2f
/*     */     //   1470: fstore #23
/*     */     //   1472: fload #24
/*     */     //   1474: f2d
/*     */     //   1475: ldc2_w 0.3
/*     */     //   1478: dmul
/*     */     //   1479: d2f
/*     */     //   1480: fstore #24
/*     */     //   1482: aload #4
/*     */     //   1484: invokevirtual e : ()Z
/*     */     //   1487: iload #22
/*     */     //   1489: ifne -> 2252
/*     */     //   1492: ifeq -> 2240
/*     */     //   1495: goto -> 1509
/*     */     //   1498: ldc2_w -2801082219286583765
/*     */     //   1501: lload #7
/*     */     //   1503: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1508: athrow
/*     */     //   1509: aload #4
/*     */     //   1511: invokevirtual f : ()Z
/*     */     //   1514: iload #22
/*     */     //   1516: ifne -> 2252
/*     */     //   1519: goto -> 1533
/*     */     //   1522: ldc2_w -2801082219286583765
/*     */     //   1525: lload #7
/*     */     //   1527: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1532: athrow
/*     */     //   1533: ifne -> 2240
/*     */     //   1536: goto -> 1550
/*     */     //   1539: ldc2_w -2801082219286583765
/*     */     //   1542: lload #7
/*     */     //   1544: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1549: athrow
/*     */     //   1550: aload_0
/*     */     //   1551: getfield b : Lme/konsolas/aac/kP;
/*     */     //   1554: lload #11
/*     */     //   1556: getstatic me/konsolas/aac/kP.V1_13 : Lme/konsolas/aac/kP;
/*     */     //   1559: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*     */     //   1562: iload #22
/*     */     //   1564: lload #7
/*     */     //   1566: lconst_0
/*     */     //   1567: lcmp
/*     */     //   1568: iflt -> 2055
/*     */     //   1571: ifne -> 2053
/*     */     //   1574: goto -> 1588
/*     */     //   1577: ldc2_w -2801082219286583765
/*     */     //   1580: lload #7
/*     */     //   1582: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1587: athrow
/*     */     //   1588: ifeq -> 2033
/*     */     //   1591: goto -> 1605
/*     */     //   1594: ldc2_w -2801082219286583765
/*     */     //   1597: lload #7
/*     */     //   1599: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1604: athrow
/*     */     //   1605: aload_1
/*     */     //   1606: invokeinterface b : ()D
/*     */     //   1611: dstore #26
/*     */     //   1613: dload #26
/*     */     //   1615: dconst_0
/*     */     //   1616: dcmpl
/*     */     //   1617: iload #22
/*     */     //   1619: ifne -> 1758
/*     */     //   1622: ifle -> 1738
/*     */     //   1625: goto -> 1639
/*     */     //   1628: ldc2_w -2801082219286583765
/*     */     //   1631: lload #7
/*     */     //   1633: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1638: athrow
/*     */     //   1639: aload_3
/*     */     //   1640: invokevirtual a : ()Lme/konsolas/aac/cJ;
/*     */     //   1643: invokevirtual b : ()Z
/*     */     //   1646: iload #22
/*     */     //   1648: lload #7
/*     */     //   1650: lconst_0
/*     */     //   1651: lcmp
/*     */     //   1652: ifle -> 1711
/*     */     //   1655: ifne -> 1709
/*     */     //   1658: goto -> 1672
/*     */     //   1661: ldc2_w -2801082219286583765
/*     */     //   1664: lload #7
/*     */     //   1666: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1671: athrow
/*     */     //   1672: ifeq -> 1992
/*     */     //   1675: goto -> 1689
/*     */     //   1678: ldc2_w -2801082219286583765
/*     */     //   1681: lload #7
/*     */     //   1683: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1688: athrow
/*     */     //   1689: dload #26
/*     */     //   1691: ldc2_w 0.4
/*     */     //   1694: dcmpg
/*     */     //   1695: goto -> 1709
/*     */     //   1698: ldc2_w -2801082219286583765
/*     */     //   1701: lload #7
/*     */     //   1703: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1708: athrow
/*     */     //   1709: iload #22
/*     */     //   1711: lload #7
/*     */     //   1713: lconst_0
/*     */     //   1714: lcmp
/*     */     //   1715: ifle -> 1760
/*     */     //   1718: ifne -> 1758
/*     */     //   1721: ifgt -> 1992
/*     */     //   1724: goto -> 1738
/*     */     //   1727: ldc2_w -2801082219286583765
/*     */     //   1730: lload #7
/*     */     //   1732: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1737: athrow
/*     */     //   1738: aload_1
/*     */     //   1739: invokeinterface e : ()Z
/*     */     //   1744: goto -> 1758
/*     */     //   1747: ldc2_w -2801082219286583765
/*     */     //   1750: lload #7
/*     */     //   1752: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1757: athrow
/*     */     //   1758: iload #22
/*     */     //   1760: lload #7
/*     */     //   1762: lconst_0
/*     */     //   1763: lcmp
/*     */     //   1764: ifle -> 1851
/*     */     //   1767: ifne -> 1849
/*     */     //   1770: ifeq -> 1828
/*     */     //   1773: goto -> 1787
/*     */     //   1776: ldc2_w -2801082219286583765
/*     */     //   1779: lload #7
/*     */     //   1781: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1786: athrow
/*     */     //   1787: aload #6
/*     */     //   1789: aload #6
/*     */     //   1791: invokevirtual getY : ()D
/*     */     //   1794: ldc2_w 0.03999999910593033
/*     */     //   1797: dadd
/*     */     //   1798: invokevirtual setY : (D)Lorg/bukkit/util/Vector;
/*     */     //   1801: pop
/*     */     //   1802: iload #22
/*     */     //   1804: lload #7
/*     */     //   1806: lconst_0
/*     */     //   1807: lcmp
/*     */     //   1808: ifle -> 2023
/*     */     //   1811: ifeq -> 2021
/*     */     //   1814: goto -> 1828
/*     */     //   1817: ldc2_w -2801082219286583765
/*     */     //   1820: lload #7
/*     */     //   1822: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1827: athrow
/*     */     //   1828: aload_3
/*     */     //   1829: invokevirtual a : ()Lme/konsolas/aac/cJ;
/*     */     //   1832: invokevirtual b : ()Z
/*     */     //   1835: goto -> 1849
/*     */     //   1838: ldc2_w -2801082219286583765
/*     */     //   1841: lload #7
/*     */     //   1843: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1848: athrow
/*     */     //   1849: iload #22
/*     */     //   1851: lload #7
/*     */     //   1853: lconst_0
/*     */     //   1854: lcmp
/*     */     //   1855: iflt -> 1905
/*     */     //   1858: ifne -> 1896
/*     */     //   1861: ifne -> 1955
/*     */     //   1864: goto -> 1878
/*     */     //   1867: ldc2_w -2801082219286583765
/*     */     //   1870: lload #7
/*     */     //   1872: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1877: athrow
/*     */     //   1878: dload #26
/*     */     //   1880: dconst_0
/*     */     //   1881: dcmpl
/*     */     //   1882: goto -> 1896
/*     */     //   1885: ldc2_w -2801082219286583765
/*     */     //   1888: lload #7
/*     */     //   1890: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1895: athrow
/*     */     //   1896: lload #7
/*     */     //   1898: lconst_0
/*     */     //   1899: lcmp
/*     */     //   1900: iflt -> 1945
/*     */     //   1903: iload #22
/*     */     //   1905: ifne -> 1945
/*     */     //   1908: ifle -> 2021
/*     */     //   1911: goto -> 1925
/*     */     //   1914: ldc2_w -2801082219286583765
/*     */     //   1917: lload #7
/*     */     //   1919: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1924: athrow
/*     */     //   1925: dload #26
/*     */     //   1927: ldc2_w 0.4
/*     */     //   1930: dcmpg
/*     */     //   1931: goto -> 1945
/*     */     //   1934: ldc2_w -2801082219286583765
/*     */     //   1937: lload #7
/*     */     //   1939: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1944: athrow
/*     */     //   1945: lload #7
/*     */     //   1947: lconst_0
/*     */     //   1948: lcmp
/*     */     //   1949: iflt -> 2023
/*     */     //   1952: ifgt -> 2021
/*     */     //   1955: aload_0
/*     */     //   1956: lload #16
/*     */     //   1958: aload_1
/*     */     //   1959: aload #4
/*     */     //   1961: aload #6
/*     */     //   1963: invokespecial a : (JLme/konsolas/aac/gb;Lme/konsolas/aac/mZ;Lorg/bukkit/util/Vector;)V
/*     */     //   1966: iload #22
/*     */     //   1968: lload #7
/*     */     //   1970: lconst_0
/*     */     //   1971: lcmp
/*     */     //   1972: iflt -> 2023
/*     */     //   1975: ifeq -> 2021
/*     */     //   1978: goto -> 1992
/*     */     //   1981: ldc2_w -2801082219286583765
/*     */     //   1984: lload #7
/*     */     //   1986: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   1991: athrow
/*     */     //   1992: aload #6
/*     */     //   1994: aload #6
/*     */     //   1996: invokevirtual getY : ()D
/*     */     //   1999: ldc2_w 0.03999999910593033
/*     */     //   2002: dadd
/*     */     //   2003: invokevirtual setY : (D)Lorg/bukkit/util/Vector;
/*     */     //   2006: pop
/*     */     //   2007: goto -> 2021
/*     */     //   2010: ldc2_w -2801082219286583765
/*     */     //   2013: lload #7
/*     */     //   2015: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2020: athrow
/*     */     //   2021: iload #22
/*     */     //   2023: lload #7
/*     */     //   2025: lconst_0
/*     */     //   2026: lcmp
/*     */     //   2027: iflt -> 2039
/*     */     //   2030: ifeq -> 2240
/*     */     //   2033: aload_1
/*     */     //   2034: invokeinterface p : ()Z
/*     */     //   2039: goto -> 2053
/*     */     //   2042: ldc2_w -2801082219286583765
/*     */     //   2045: lload #7
/*     */     //   2047: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2052: athrow
/*     */     //   2053: iload #22
/*     */     //   2055: lload #7
/*     */     //   2057: lconst_0
/*     */     //   2058: lcmp
/*     */     //   2059: iflt -> 2104
/*     */     //   2062: ifne -> 2102
/*     */     //   2065: ifne -> 2131
/*     */     //   2068: goto -> 2082
/*     */     //   2071: ldc2_w -2801082219286583765
/*     */     //   2074: lload #7
/*     */     //   2076: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2081: athrow
/*     */     //   2082: aload_1
/*     */     //   2083: invokeinterface e : ()Z
/*     */     //   2088: goto -> 2102
/*     */     //   2091: ldc2_w -2801082219286583765
/*     */     //   2094: lload #7
/*     */     //   2096: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2101: athrow
/*     */     //   2102: iload #22
/*     */     //   2104: lload #7
/*     */     //   2106: lconst_0
/*     */     //   2107: lcmp
/*     */     //   2108: ifle -> 2188
/*     */     //   2111: ifne -> 2186
/*     */     //   2114: ifeq -> 2165
/*     */     //   2117: goto -> 2131
/*     */     //   2120: ldc2_w -2801082219286583765
/*     */     //   2123: lload #7
/*     */     //   2125: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2130: athrow
/*     */     //   2131: aload #6
/*     */     //   2133: aload #6
/*     */     //   2135: invokevirtual getY : ()D
/*     */     //   2138: ldc2_w 0.03999999910593033
/*     */     //   2141: dadd
/*     */     //   2142: invokevirtual setY : (D)Lorg/bukkit/util/Vector;
/*     */     //   2145: pop
/*     */     //   2146: iload #22
/*     */     //   2148: ifeq -> 2240
/*     */     //   2151: goto -> 2165
/*     */     //   2154: ldc2_w -2801082219286583765
/*     */     //   2157: lload #7
/*     */     //   2159: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2164: athrow
/*     */     //   2165: aload_3
/*     */     //   2166: invokevirtual a : ()Lme/konsolas/aac/cJ;
/*     */     //   2169: invokevirtual b : ()Z
/*     */     //   2172: goto -> 2186
/*     */     //   2175: ldc2_w -2801082219286583765
/*     */     //   2178: lload #7
/*     */     //   2180: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2185: athrow
/*     */     //   2186: iload #22
/*     */     //   2188: lload #7
/*     */     //   2190: lconst_0
/*     */     //   2191: lcmp
/*     */     //   2192: ifle -> 2254
/*     */     //   2195: ifne -> 2252
/*     */     //   2198: ifeq -> 2240
/*     */     //   2201: goto -> 2215
/*     */     //   2204: ldc2_w -2801082219286583765
/*     */     //   2207: lload #7
/*     */     //   2209: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2214: athrow
/*     */     //   2215: aload_0
/*     */     //   2216: lload #16
/*     */     //   2218: aload_1
/*     */     //   2219: aload #4
/*     */     //   2221: aload #6
/*     */     //   2223: invokespecial a : (JLme/konsolas/aac/gb;Lme/konsolas/aac/mZ;Lorg/bukkit/util/Vector;)V
/*     */     //   2226: goto -> 2240
/*     */     //   2229: ldc2_w -2801082219286583765
/*     */     //   2232: lload #7
/*     */     //   2234: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2239: athrow
/*     */     //   2240: aload_0
/*     */     //   2241: getfield b : Lme/konsolas/aac/kP;
/*     */     //   2244: lload #11
/*     */     //   2246: getstatic me/konsolas/aac/kP.V1_13 : Lme/konsolas/aac/kP;
/*     */     //   2249: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*     */     //   2252: iload #22
/*     */     //   2254: ifne -> 2640
/*     */     //   2257: ifeq -> 2635
/*     */     //   2260: goto -> 2274
/*     */     //   2263: ldc2_w -2801082219286583765
/*     */     //   2266: lload #7
/*     */     //   2268: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2273: athrow
/*     */     //   2274: aload_1
/*     */     //   2275: invokeinterface p : ()Z
/*     */     //   2280: iload #22
/*     */     //   2282: ifne -> 2640
/*     */     //   2285: goto -> 2299
/*     */     //   2288: ldc2_w -2801082219286583765
/*     */     //   2291: lload #7
/*     */     //   2293: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2298: athrow
/*     */     //   2299: ifeq -> 2635
/*     */     //   2302: goto -> 2316
/*     */     //   2305: ldc2_w -2801082219286583765
/*     */     //   2308: lload #7
/*     */     //   2310: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2315: athrow
/*     */     //   2316: aload #4
/*     */     //   2318: invokevirtual c : ()Z
/*     */     //   2321: iload #22
/*     */     //   2323: ifne -> 2640
/*     */     //   2326: goto -> 2340
/*     */     //   2329: ldc2_w -2801082219286583765
/*     */     //   2332: lload #7
/*     */     //   2334: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2339: athrow
/*     */     //   2340: ifeq -> 2635
/*     */     //   2343: goto -> 2357
/*     */     //   2346: ldc2_w -2801082219286583765
/*     */     //   2349: lload #7
/*     */     //   2351: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2356: athrow
/*     */     //   2357: aload #4
/*     */     //   2359: invokevirtual f : ()Z
/*     */     //   2362: iload #22
/*     */     //   2364: ifne -> 2640
/*     */     //   2367: goto -> 2381
/*     */     //   2370: ldc2_w -2801082219286583765
/*     */     //   2373: lload #7
/*     */     //   2375: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2380: athrow
/*     */     //   2381: ifne -> 2635
/*     */     //   2384: goto -> 2398
/*     */     //   2387: ldc2_w -2801082219286583765
/*     */     //   2390: lload #7
/*     */     //   2392: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2397: athrow
/*     */     //   2398: aload #4
/*     */     //   2400: invokevirtual d : ()F
/*     */     //   2403: f2d
/*     */     //   2404: invokestatic toRadians : (D)D
/*     */     //   2407: d2f
/*     */     //   2408: invokestatic b : (F)F
/*     */     //   2411: fneg
/*     */     //   2412: f2d
/*     */     //   2413: dstore #26
/*     */     //   2415: dload #26
/*     */     //   2417: iload #22
/*     */     //   2419: ifne -> 2460
/*     */     //   2422: ldc2_w -0.2
/*     */     //   2425: dcmpg
/*     */     //   2426: ifge -> 2463
/*     */     //   2429: goto -> 2443
/*     */     //   2432: ldc2_w -2801082219286583765
/*     */     //   2435: lload #7
/*     */     //   2437: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2442: athrow
/*     */     //   2443: ldc2_w 0.085
/*     */     //   2446: goto -> 2460
/*     */     //   2449: ldc2_w -2801082219286583765
/*     */     //   2452: lload #7
/*     */     //   2454: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2459: athrow
/*     */     //   2460: goto -> 2466
/*     */     //   2463: ldc2_w 0.06
/*     */     //   2466: dstore #28
/*     */     //   2468: dload #26
/*     */     //   2470: dconst_0
/*     */     //   2471: dcmpg
/*     */     //   2472: iload #22
/*     */     //   2474: lload #7
/*     */     //   2476: lconst_0
/*     */     //   2477: lcmp
/*     */     //   2478: ifle -> 2522
/*     */     //   2481: ifne -> 2520
/*     */     //   2484: ifle -> 2598
/*     */     //   2487: goto -> 2501
/*     */     //   2490: ldc2_w -2801082219286583765
/*     */     //   2493: lload #7
/*     */     //   2495: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2500: athrow
/*     */     //   2501: aload #4
/*     */     //   2503: invokevirtual e : ()Z
/*     */     //   2506: goto -> 2520
/*     */     //   2509: ldc2_w -2801082219286583765
/*     */     //   2512: lload #7
/*     */     //   2514: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2519: athrow
/*     */     //   2520: iload #22
/*     */     //   2522: lload #7
/*     */     //   2524: lconst_0
/*     */     //   2525: lcmp
/*     */     //   2526: ifle -> 2571
/*     */     //   2529: ifne -> 2569
/*     */     //   2532: ifne -> 2598
/*     */     //   2535: goto -> 2549
/*     */     //   2538: ldc2_w -2801082219286583765
/*     */     //   2541: lload #7
/*     */     //   2543: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2548: athrow
/*     */     //   2549: aload_1
/*     */     //   2550: invokeinterface a : ()Z
/*     */     //   2555: goto -> 2569
/*     */     //   2558: ldc2_w -2801082219286583765
/*     */     //   2561: lload #7
/*     */     //   2563: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2568: athrow
/*     */     //   2569: iload #22
/*     */     //   2571: lload #7
/*     */     //   2573: lconst_0
/*     */     //   2574: lcmp
/*     */     //   2575: ifle -> 2642
/*     */     //   2578: ifne -> 2640
/*     */     //   2581: ifeq -> 2635
/*     */     //   2584: goto -> 2598
/*     */     //   2587: ldc2_w -2801082219286583765
/*     */     //   2590: lload #7
/*     */     //   2592: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2597: athrow
/*     */     //   2598: aload #6
/*     */     //   2600: aload #6
/*     */     //   2602: invokevirtual getY : ()D
/*     */     //   2605: dload #26
/*     */     //   2607: aload #6
/*     */     //   2609: invokevirtual getY : ()D
/*     */     //   2612: dsub
/*     */     //   2613: dload #28
/*     */     //   2615: dmul
/*     */     //   2616: dadd
/*     */     //   2617: invokevirtual setY : (D)Lorg/bukkit/util/Vector;
/*     */     //   2620: pop
/*     */     //   2621: goto -> 2635
/*     */     //   2624: ldc2_w -2801082219286583765
/*     */     //   2627: lload #7
/*     */     //   2629: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2634: athrow
/*     */     //   2635: aload #4
/*     */     //   2637: invokevirtual a : ()Z
/*     */     //   2640: iload #22
/*     */     //   2642: lload #7
/*     */     //   2644: lconst_0
/*     */     //   2645: lcmp
/*     */     //   2646: ifle -> 2691
/*     */     //   2649: ifne -> 2689
/*     */     //   2652: ifeq -> 3989
/*     */     //   2655: goto -> 2669
/*     */     //   2658: ldc2_w -2801082219286583765
/*     */     //   2661: lload #7
/*     */     //   2663: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2668: athrow
/*     */     //   2669: aload_1
/*     */     //   2670: invokeinterface p : ()Z
/*     */     //   2675: goto -> 2689
/*     */     //   2678: ldc2_w -2801082219286583765
/*     */     //   2681: lload #7
/*     */     //   2683: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2688: athrow
/*     */     //   2689: iload #22
/*     */     //   2691: lload #7
/*     */     //   2693: lconst_0
/*     */     //   2694: lcmp
/*     */     //   2695: ifle -> 2740
/*     */     //   2698: ifne -> 2738
/*     */     //   2701: ifne -> 3989
/*     */     //   2704: goto -> 2718
/*     */     //   2707: ldc2_w -2801082219286583765
/*     */     //   2710: lload #7
/*     */     //   2712: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2717: athrow
/*     */     //   2718: aload_1
/*     */     //   2719: invokeinterface e : ()Z
/*     */     //   2724: goto -> 2738
/*     */     //   2727: ldc2_w -2801082219286583765
/*     */     //   2730: lload #7
/*     */     //   2732: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2737: athrow
/*     */     //   2738: iload #22
/*     */     //   2740: ifne -> 2805
/*     */     //   2743: ifne -> 3989
/*     */     //   2746: goto -> 2760
/*     */     //   2749: ldc2_w -2801082219286583765
/*     */     //   2752: lload #7
/*     */     //   2754: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2759: athrow
/*     */     //   2760: aload_0
/*     */     //   2761: getfield b : Lme/konsolas/aac/kP;
/*     */     //   2764: iload #22
/*     */     //   2766: ifne -> 3431
/*     */     //   2769: goto -> 2783
/*     */     //   2772: ldc2_w -2801082219286583765
/*     */     //   2775: lload #7
/*     */     //   2777: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2782: athrow
/*     */     //   2783: lload #11
/*     */     //   2785: getstatic me/konsolas/aac/kP.V1_13 : Lme/konsolas/aac/kP;
/*     */     //   2788: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*     */     //   2791: goto -> 2805
/*     */     //   2794: ldc2_w -2801082219286583765
/*     */     //   2797: lload #7
/*     */     //   2799: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2804: athrow
/*     */     //   2805: ifeq -> 3413
/*     */     //   2808: aload_0
/*     */     //   2809: getfield b : Lme/konsolas/aac/kP;
/*     */     //   2812: aload #4
/*     */     //   2814: invokevirtual d : ()F
/*     */     //   2817: lload #20
/*     */     //   2819: dup2_x1
/*     */     //   2820: pop2
/*     */     //   2821: aload #4
/*     */     //   2823: invokevirtual a : ()F
/*     */     //   2826: invokestatic a : (Lme/konsolas/aac/kP;JFF)Lorg/bukkit/util/Vector;
/*     */     //   2829: astore #26
/*     */     //   2831: aload #4
/*     */     //   2833: invokevirtual d : ()F
/*     */     //   2836: ldc 0.017453292
/*     */     //   2838: fmul
/*     */     //   2839: fstore #27
/*     */     //   2841: aload #26
/*     */     //   2843: invokevirtual getX : ()D
/*     */     //   2846: aload #26
/*     */     //   2848: invokevirtual getX : ()D
/*     */     //   2851: dmul
/*     */     //   2852: aload #26
/*     */     //   2854: invokevirtual getZ : ()D
/*     */     //   2857: aload #26
/*     */     //   2859: invokevirtual getZ : ()D
/*     */     //   2862: dmul
/*     */     //   2863: dadd
/*     */     //   2864: invokestatic sqrt : (D)D
/*     */     //   2867: dstore #28
/*     */     //   2869: aload #6
/*     */     //   2871: invokevirtual getX : ()D
/*     */     //   2874: aload #6
/*     */     //   2876: invokevirtual getX : ()D
/*     */     //   2879: dmul
/*     */     //   2880: aload #6
/*     */     //   2882: invokevirtual getZ : ()D
/*     */     //   2885: aload #6
/*     */     //   2887: invokevirtual getZ : ()D
/*     */     //   2890: dmul
/*     */     //   2891: dadd
/*     */     //   2892: invokestatic sqrt : (D)D
/*     */     //   2895: dstore #30
/*     */     //   2897: aload #26
/*     */     //   2899: invokevirtual length : ()D
/*     */     //   2902: dstore #32
/*     */     //   2904: fload #27
/*     */     //   2906: invokestatic a : (F)F
/*     */     //   2909: fstore #34
/*     */     //   2911: fload #34
/*     */     //   2913: f2d
/*     */     //   2914: fload #34
/*     */     //   2916: f2d
/*     */     //   2917: dmul
/*     */     //   2918: dconst_1
/*     */     //   2919: dload #32
/*     */     //   2921: ldc2_w 0.4
/*     */     //   2924: ddiv
/*     */     //   2925: invokestatic min : (DD)D
/*     */     //   2928: dmul
/*     */     //   2929: d2f
/*     */     //   2930: fstore #34
/*     */     //   2932: aload #6
/*     */     //   2934: aload #6
/*     */     //   2936: invokevirtual getY : ()D
/*     */     //   2939: dload #9
/*     */     //   2941: ldc2_w -1.0
/*     */     //   2944: fload #34
/*     */     //   2946: f2d
/*     */     //   2947: ldc2_w 0.75
/*     */     //   2950: dmul
/*     */     //   2951: dadd
/*     */     //   2952: dmul
/*     */     //   2953: dadd
/*     */     //   2954: invokevirtual setY : (D)Lorg/bukkit/util/Vector;
/*     */     //   2957: pop
/*     */     //   2958: aload #6
/*     */     //   2960: invokevirtual getY : ()D
/*     */     //   2963: dconst_0
/*     */     //   2964: dcmpg
/*     */     //   2965: iload #22
/*     */     //   2967: ifne -> 3113
/*     */     //   2970: ifge -> 3109
/*     */     //   2973: goto -> 2987
/*     */     //   2976: ldc2_w -2801082219286583765
/*     */     //   2979: lload #7
/*     */     //   2981: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   2986: athrow
/*     */     //   2987: dload #28
/*     */     //   2989: dconst_0
/*     */     //   2990: dcmpl
/*     */     //   2991: iload #22
/*     */     //   2993: lload #7
/*     */     //   2995: lconst_0
/*     */     //   2996: lcmp
/*     */     //   2997: iflt -> 3115
/*     */     //   3000: ifne -> 3113
/*     */     //   3003: goto -> 3017
/*     */     //   3006: ldc2_w -2801082219286583765
/*     */     //   3009: lload #7
/*     */     //   3011: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   3016: athrow
/*     */     //   3017: ifle -> 3109
/*     */     //   3020: goto -> 3034
/*     */     //   3023: ldc2_w -2801082219286583765
/*     */     //   3026: lload #7
/*     */     //   3028: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   3033: athrow
/*     */     //   3034: aload #6
/*     */     //   3036: invokevirtual getY : ()D
/*     */     //   3039: ldc2_w -0.1
/*     */     //   3042: dmul
/*     */     //   3043: fload #34
/*     */     //   3045: f2d
/*     */     //   3046: dmul
/*     */     //   3047: dstore #35
/*     */     //   3049: aload #6
/*     */     //   3051: aload #6
/*     */     //   3053: invokevirtual getY : ()D
/*     */     //   3056: dload #35
/*     */     //   3058: dadd
/*     */     //   3059: invokevirtual setY : (D)Lorg/bukkit/util/Vector;
/*     */     //   3062: pop
/*     */     //   3063: aload #6
/*     */     //   3065: aload #6
/*     */     //   3067: invokevirtual getX : ()D
/*     */     //   3070: aload #26
/*     */     //   3072: invokevirtual getX : ()D
/*     */     //   3075: dload #35
/*     */     //   3077: dmul
/*     */     //   3078: dload #28
/*     */     //   3080: ddiv
/*     */     //   3081: dadd
/*     */     //   3082: invokevirtual setX : (D)Lorg/bukkit/util/Vector;
/*     */     //   3085: pop
/*     */     //   3086: aload #6
/*     */     //   3088: aload #6
/*     */     //   3090: invokevirtual getZ : ()D
/*     */     //   3093: aload #26
/*     */     //   3095: invokevirtual getZ : ()D
/*     */     //   3098: dload #35
/*     */     //   3100: dmul
/*     */     //   3101: dload #28
/*     */     //   3103: ddiv
/*     */     //   3104: dadd
/*     */     //   3105: invokevirtual setZ : (D)Lorg/bukkit/util/Vector;
/*     */     //   3108: pop
/*     */     //   3109: fload #27
/*     */     //   3111: fconst_0
/*     */     //   3112: fcmpg
/*     */     //   3113: iload #22
/*     */     //   3115: ifne -> 3266
/*     */     //   3118: ifge -> 3262
/*     */     //   3121: goto -> 3135
/*     */     //   3124: ldc2_w -2801082219286583765
/*     */     //   3127: lload #7
/*     */     //   3129: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   3134: athrow
/*     */     //   3135: dload #28
/*     */     //   3137: dconst_0
/*     */     //   3138: dcmpl
/*     */     //   3139: lload #7
/*     */     //   3141: lconst_0
/*     */     //   3142: lcmp
/*     */     //   3143: iflt -> 3266
/*     */     //   3146: iload #22
/*     */     //   3148: ifne -> 3266
/*     */     //   3151: goto -> 3165
/*     */     //   3154: ldc2_w -2801082219286583765
/*     */     //   3157: lload #7
/*     */     //   3159: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   3164: athrow
/*     */     //   3165: ifle -> 3262
/*     */     //   3168: goto -> 3182
/*     */     //   3171: ldc2_w -2801082219286583765
/*     */     //   3174: lload #7
/*     */     //   3176: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   3181: athrow
/*     */     //   3182: dload #30
/*     */     //   3184: fload #27
/*     */     //   3186: invokestatic b : (F)F
/*     */     //   3189: fneg
/*     */     //   3190: f2d
/*     */     //   3191: dmul
/*     */     //   3192: ldc2_w 0.04
/*     */     //   3195: dmul
/*     */     //   3196: dstore #35
/*     */     //   3198: aload #6
/*     */     //   3200: aload #6
/*     */     //   3202: invokevirtual getY : ()D
/*     */     //   3205: dload #35
/*     */     //   3207: ldc2_w 3.2
/*     */     //   3210: dmul
/*     */     //   3211: dadd
/*     */     //   3212: invokevirtual setY : (D)Lorg/bukkit/util/Vector;
/*     */     //   3215: pop
/*     */     //   3216: aload #6
/*     */     //   3218: aload #6
/*     */     //   3220: invokevirtual getX : ()D
/*     */     //   3223: aload #26
/*     */     //   3225: invokevirtual getX : ()D
/*     */     //   3228: dload #35
/*     */     //   3230: dmul
/*     */     //   3231: dload #28
/*     */     //   3233: ddiv
/*     */     //   3234: dsub
/*     */     //   3235: invokevirtual setX : (D)Lorg/bukkit/util/Vector;
/*     */     //   3238: pop
/*     */     //   3239: aload #6
/*     */     //   3241: aload #6
/*     */     //   3243: invokevirtual getZ : ()D
/*     */     //   3246: aload #26
/*     */     //   3248: invokevirtual getZ : ()D
/*     */     //   3251: dload #35
/*     */     //   3253: dmul
/*     */     //   3254: dload #28
/*     */     //   3256: ddiv
/*     */     //   3257: dsub
/*     */     //   3258: invokevirtual setZ : (D)Lorg/bukkit/util/Vector;
/*     */     //   3261: pop
/*     */     //   3262: dload #28
/*     */     //   3264: dconst_0
/*     */     //   3265: dcmpl
/*     */     //   3266: lload #7
/*     */     //   3268: lconst_0
/*     */     //   3269: lcmp
/*     */     //   3270: ifle -> 3403
/*     */     //   3273: ifle -> 3356
/*     */     //   3276: aload #6
/*     */     //   3278: aload #6
/*     */     //   3280: invokevirtual getX : ()D
/*     */     //   3283: aload #26
/*     */     //   3285: invokevirtual getX : ()D
/*     */     //   3288: dload #28
/*     */     //   3290: ddiv
/*     */     //   3291: dload #30
/*     */     //   3293: dmul
/*     */     //   3294: aload #6
/*     */     //   3296: invokevirtual getX : ()D
/*     */     //   3299: dsub
/*     */     //   3300: ldc2_w 0.1
/*     */     //   3303: dmul
/*     */     //   3304: dadd
/*     */     //   3305: invokevirtual setX : (D)Lorg/bukkit/util/Vector;
/*     */     //   3308: pop
/*     */     //   3309: aload #6
/*     */     //   3311: aload #6
/*     */     //   3313: invokevirtual getZ : ()D
/*     */     //   3316: aload #26
/*     */     //   3318: invokevirtual getZ : ()D
/*     */     //   3321: dload #28
/*     */     //   3323: ddiv
/*     */     //   3324: dload #30
/*     */     //   3326: dmul
/*     */     //   3327: aload #6
/*     */     //   3329: invokevirtual getZ : ()D
/*     */     //   3332: dsub
/*     */     //   3333: ldc2_w 0.1
/*     */     //   3336: dmul
/*     */     //   3337: dadd
/*     */     //   3338: invokevirtual setZ : (D)Lorg/bukkit/util/Vector;
/*     */     //   3341: pop
/*     */     //   3342: goto -> 3356
/*     */     //   3345: ldc2_w -2801082219286583765
/*     */     //   3348: lload #7
/*     */     //   3350: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   3355: athrow
/*     */     //   3356: aload #6
/*     */     //   3358: aload #6
/*     */     //   3360: invokevirtual getY : ()D
/*     */     //   3363: ldc2_w 0.9800000190734863
/*     */     //   3366: dmul
/*     */     //   3367: invokevirtual setY : (D)Lorg/bukkit/util/Vector;
/*     */     //   3370: pop
/*     */     //   3371: aload #6
/*     */     //   3373: aload #6
/*     */     //   3375: invokevirtual getX : ()D
/*     */     //   3378: ldc2_w 0.9900000095367432
/*     */     //   3381: dmul
/*     */     //   3382: invokevirtual setX : (D)Lorg/bukkit/util/Vector;
/*     */     //   3385: pop
/*     */     //   3386: aload #6
/*     */     //   3388: aload #6
/*     */     //   3390: invokevirtual getZ : ()D
/*     */     //   3393: ldc2_w 0.9900000095367432
/*     */     //   3396: dmul
/*     */     //   3397: invokevirtual setZ : (D)Lorg/bukkit/util/Vector;
/*     */     //   3400: pop
/*     */     //   3401: iload #22
/*     */     //   3403: lload #7
/*     */     //   3405: lconst_0
/*     */     //   3406: lcmp
/*     */     //   3407: iflt -> 4036
/*     */     //   3410: ifeq -> 4030
/*     */     //   3413: aload_0
/*     */     //   3414: getfield b : Lme/konsolas/aac/kP;
/*     */     //   3417: goto -> 3431
/*     */     //   3420: ldc2_w -2801082219286583765
/*     */     //   3423: lload #7
/*     */     //   3425: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   3430: athrow
/*     */     //   3431: aload #4
/*     */     //   3433: invokevirtual d : ()F
/*     */     //   3436: lload #20
/*     */     //   3438: dup2_x1
/*     */     //   3439: pop2
/*     */     //   3440: aload #4
/*     */     //   3442: invokevirtual a : ()F
/*     */     //   3445: invokestatic a : (Lme/konsolas/aac/kP;JFF)Lorg/bukkit/util/Vector;
/*     */     //   3448: astore #26
/*     */     //   3450: aload #4
/*     */     //   3452: invokevirtual d : ()F
/*     */     //   3455: ldc 0.017453292
/*     */     //   3457: fmul
/*     */     //   3458: fstore #27
/*     */     //   3460: aload #26
/*     */     //   3462: invokevirtual getX : ()D
/*     */     //   3465: aload #26
/*     */     //   3467: invokevirtual getX : ()D
/*     */     //   3470: dmul
/*     */     //   3471: aload #26
/*     */     //   3473: invokevirtual getZ : ()D
/*     */     //   3476: aload #26
/*     */     //   3478: invokevirtual getZ : ()D
/*     */     //   3481: dmul
/*     */     //   3482: dadd
/*     */     //   3483: invokestatic sqrt : (D)D
/*     */     //   3486: dstore #28
/*     */     //   3488: aload #6
/*     */     //   3490: invokevirtual getX : ()D
/*     */     //   3493: aload #6
/*     */     //   3495: invokevirtual getX : ()D
/*     */     //   3498: dmul
/*     */     //   3499: aload #6
/*     */     //   3501: invokevirtual getZ : ()D
/*     */     //   3504: aload #6
/*     */     //   3506: invokevirtual getZ : ()D
/*     */     //   3509: dmul
/*     */     //   3510: dadd
/*     */     //   3511: invokestatic sqrt : (D)D
/*     */     //   3514: dstore #30
/*     */     //   3516: aload #26
/*     */     //   3518: invokevirtual length : ()D
/*     */     //   3521: dstore #32
/*     */     //   3523: fload #27
/*     */     //   3525: invokestatic a : (F)F
/*     */     //   3528: fstore #34
/*     */     //   3530: fload #34
/*     */     //   3532: f2d
/*     */     //   3533: fload #34
/*     */     //   3535: f2d
/*     */     //   3536: dmul
/*     */     //   3537: dconst_1
/*     */     //   3538: dload #32
/*     */     //   3540: ldc2_w 0.4
/*     */     //   3543: ddiv
/*     */     //   3544: invokestatic min : (DD)D
/*     */     //   3547: dmul
/*     */     //   3548: d2f
/*     */     //   3549: fstore #34
/*     */     //   3551: aload #6
/*     */     //   3553: aload #6
/*     */     //   3555: invokevirtual getY : ()D
/*     */     //   3558: ldc2_w 0.08
/*     */     //   3561: dsub
/*     */     //   3562: fload #34
/*     */     //   3564: f2d
/*     */     //   3565: ldc2_w 0.06
/*     */     //   3568: dmul
/*     */     //   3569: dadd
/*     */     //   3570: invokevirtual setY : (D)Lorg/bukkit/util/Vector;
/*     */     //   3573: pop
/*     */     //   3574: aload #6
/*     */     //   3576: invokevirtual getY : ()D
/*     */     //   3579: dconst_0
/*     */     //   3580: dcmpg
/*     */     //   3581: iload #22
/*     */     //   3583: ifne -> 3729
/*     */     //   3586: ifge -> 3725
/*     */     //   3589: goto -> 3603
/*     */     //   3592: ldc2_w -2801082219286583765
/*     */     //   3595: lload #7
/*     */     //   3597: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   3602: athrow
/*     */     //   3603: dload #28
/*     */     //   3605: dconst_0
/*     */     //   3606: dcmpl
/*     */     //   3607: iload #22
/*     */     //   3609: lload #7
/*     */     //   3611: lconst_0
/*     */     //   3612: lcmp
/*     */     //   3613: ifle -> 3738
/*     */     //   3616: ifne -> 3729
/*     */     //   3619: goto -> 3633
/*     */     //   3622: ldc2_w -2801082219286583765
/*     */     //   3625: lload #7
/*     */     //   3627: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   3632: athrow
/*     */     //   3633: ifle -> 3725
/*     */     //   3636: goto -> 3650
/*     */     //   3639: ldc2_w -2801082219286583765
/*     */     //   3642: lload #7
/*     */     //   3644: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   3649: athrow
/*     */     //   3650: aload #6
/*     */     //   3652: invokevirtual getY : ()D
/*     */     //   3655: ldc2_w -0.1
/*     */     //   3658: dmul
/*     */     //   3659: fload #34
/*     */     //   3661: f2d
/*     */     //   3662: dmul
/*     */     //   3663: dstore #35
/*     */     //   3665: aload #6
/*     */     //   3667: aload #6
/*     */     //   3669: invokevirtual getY : ()D
/*     */     //   3672: dload #35
/*     */     //   3674: dadd
/*     */     //   3675: invokevirtual setY : (D)Lorg/bukkit/util/Vector;
/*     */     //   3678: pop
/*     */     //   3679: aload #6
/*     */     //   3681: aload #6
/*     */     //   3683: invokevirtual getX : ()D
/*     */     //   3686: aload #26
/*     */     //   3688: invokevirtual getX : ()D
/*     */     //   3691: dload #35
/*     */     //   3693: dmul
/*     */     //   3694: dload #28
/*     */     //   3696: ddiv
/*     */     //   3697: dadd
/*     */     //   3698: invokevirtual setX : (D)Lorg/bukkit/util/Vector;
/*     */     //   3701: pop
/*     */     //   3702: aload #6
/*     */     //   3704: aload #6
/*     */     //   3706: invokevirtual getZ : ()D
/*     */     //   3709: aload #26
/*     */     //   3711: invokevirtual getZ : ()D
/*     */     //   3714: dload #35
/*     */     //   3716: dmul
/*     */     //   3717: dload #28
/*     */     //   3719: ddiv
/*     */     //   3720: dadd
/*     */     //   3721: invokevirtual setZ : (D)Lorg/bukkit/util/Vector;
/*     */     //   3724: pop
/*     */     //   3725: fload #27
/*     */     //   3727: fconst_0
/*     */     //   3728: fcmpg
/*     */     //   3729: lload #7
/*     */     //   3731: lconst_0
/*     */     //   3732: lcmp
/*     */     //   3733: iflt -> 3842
/*     */     //   3736: iload #22
/*     */     //   3738: ifne -> 3842
/*     */     //   3741: ifge -> 3838
/*     */     //   3744: goto -> 3758
/*     */     //   3747: ldc2_w -2801082219286583765
/*     */     //   3750: lload #7
/*     */     //   3752: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   3757: athrow
/*     */     //   3758: dload #30
/*     */     //   3760: fload #27
/*     */     //   3762: invokestatic b : (F)F
/*     */     //   3765: fneg
/*     */     //   3766: f2d
/*     */     //   3767: dmul
/*     */     //   3768: ldc2_w 0.04
/*     */     //   3771: dmul
/*     */     //   3772: dstore #35
/*     */     //   3774: aload #6
/*     */     //   3776: aload #6
/*     */     //   3778: invokevirtual getY : ()D
/*     */     //   3781: dload #35
/*     */     //   3783: ldc2_w 3.2
/*     */     //   3786: dmul
/*     */     //   3787: dadd
/*     */     //   3788: invokevirtual setY : (D)Lorg/bukkit/util/Vector;
/*     */     //   3791: pop
/*     */     //   3792: aload #6
/*     */     //   3794: aload #6
/*     */     //   3796: invokevirtual getX : ()D
/*     */     //   3799: aload #26
/*     */     //   3801: invokevirtual getX : ()D
/*     */     //   3804: dload #35
/*     */     //   3806: dmul
/*     */     //   3807: dload #28
/*     */     //   3809: ddiv
/*     */     //   3810: dsub
/*     */     //   3811: invokevirtual setX : (D)Lorg/bukkit/util/Vector;
/*     */     //   3814: pop
/*     */     //   3815: aload #6
/*     */     //   3817: aload #6
/*     */     //   3819: invokevirtual getZ : ()D
/*     */     //   3822: aload #26
/*     */     //   3824: invokevirtual getZ : ()D
/*     */     //   3827: dload #35
/*     */     //   3829: dmul
/*     */     //   3830: dload #28
/*     */     //   3832: ddiv
/*     */     //   3833: dsub
/*     */     //   3834: invokevirtual setZ : (D)Lorg/bukkit/util/Vector;
/*     */     //   3837: pop
/*     */     //   3838: dload #28
/*     */     //   3840: dconst_0
/*     */     //   3841: dcmpl
/*     */     //   3842: lload #7
/*     */     //   3844: lconst_0
/*     */     //   3845: lcmp
/*     */     //   3846: iflt -> 3979
/*     */     //   3849: ifle -> 3932
/*     */     //   3852: aload #6
/*     */     //   3854: aload #6
/*     */     //   3856: invokevirtual getX : ()D
/*     */     //   3859: aload #26
/*     */     //   3861: invokevirtual getX : ()D
/*     */     //   3864: dload #28
/*     */     //   3866: ddiv
/*     */     //   3867: dload #30
/*     */     //   3869: dmul
/*     */     //   3870: aload #6
/*     */     //   3872: invokevirtual getX : ()D
/*     */     //   3875: dsub
/*     */     //   3876: ldc2_w 0.1
/*     */     //   3879: dmul
/*     */     //   3880: dadd
/*     */     //   3881: invokevirtual setX : (D)Lorg/bukkit/util/Vector;
/*     */     //   3884: pop
/*     */     //   3885: aload #6
/*     */     //   3887: aload #6
/*     */     //   3889: invokevirtual getZ : ()D
/*     */     //   3892: aload #26
/*     */     //   3894: invokevirtual getZ : ()D
/*     */     //   3897: dload #28
/*     */     //   3899: ddiv
/*     */     //   3900: dload #30
/*     */     //   3902: dmul
/*     */     //   3903: aload #6
/*     */     //   3905: invokevirtual getZ : ()D
/*     */     //   3908: dsub
/*     */     //   3909: ldc2_w 0.1
/*     */     //   3912: dmul
/*     */     //   3913: dadd
/*     */     //   3914: invokevirtual setZ : (D)Lorg/bukkit/util/Vector;
/*     */     //   3917: pop
/*     */     //   3918: goto -> 3932
/*     */     //   3921: ldc2_w -2801082219286583765
/*     */     //   3924: lload #7
/*     */     //   3926: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   3931: athrow
/*     */     //   3932: aload #6
/*     */     //   3934: aload #6
/*     */     //   3936: invokevirtual getY : ()D
/*     */     //   3939: ldc2_w 0.9800000190734863
/*     */     //   3942: dmul
/*     */     //   3943: invokevirtual setY : (D)Lorg/bukkit/util/Vector;
/*     */     //   3946: pop
/*     */     //   3947: aload #6
/*     */     //   3949: aload #6
/*     */     //   3951: invokevirtual getX : ()D
/*     */     //   3954: ldc2_w 0.9900000095367432
/*     */     //   3957: dmul
/*     */     //   3958: invokevirtual setX : (D)Lorg/bukkit/util/Vector;
/*     */     //   3961: pop
/*     */     //   3962: aload #6
/*     */     //   3964: aload #6
/*     */     //   3966: invokevirtual getZ : ()D
/*     */     //   3969: ldc2_w 0.9900000095367432
/*     */     //   3972: dmul
/*     */     //   3973: invokevirtual setZ : (D)Lorg/bukkit/util/Vector;
/*     */     //   3976: pop
/*     */     //   3977: iload #22
/*     */     //   3979: lload #7
/*     */     //   3981: lconst_0
/*     */     //   3982: lcmp
/*     */     //   3983: iflt -> 4036
/*     */     //   3986: ifeq -> 4030
/*     */     //   3989: aload #6
/*     */     //   3991: fload #24
/*     */     //   3993: fload #23
/*     */     //   3995: aload #5
/*     */     //   3997: invokevirtual a : ()F
/*     */     //   4000: lload #18
/*     */     //   4002: dup2_x1
/*     */     //   4003: pop2
/*     */     //   4004: aload #4
/*     */     //   4006: invokevirtual a : ()F
/*     */     //   4009: invokestatic a : (FFJFF)Lorg/bukkit/util/Vector;
/*     */     //   4012: invokevirtual add : (Lorg/bukkit/util/Vector;)Lorg/bukkit/util/Vector;
/*     */     //   4015: pop
/*     */     //   4016: goto -> 4030
/*     */     //   4019: ldc2_w -2801082219286583765
/*     */     //   4022: lload #7
/*     */     //   4024: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4029: athrow
/*     */     //   4030: aload_1
/*     */     //   4031: invokeinterface p : ()Z
/*     */     //   4036: iload #22
/*     */     //   4038: lload #7
/*     */     //   4040: lconst_0
/*     */     //   4041: lcmp
/*     */     //   4042: ifle -> 4087
/*     */     //   4045: ifne -> 4085
/*     */     //   4048: ifne -> 4396
/*     */     //   4051: goto -> 4065
/*     */     //   4054: ldc2_w -2801082219286583765
/*     */     //   4057: lload #7
/*     */     //   4059: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4064: athrow
/*     */     //   4065: aload_1
/*     */     //   4066: invokeinterface e : ()Z
/*     */     //   4071: goto -> 4085
/*     */     //   4074: ldc2_w -2801082219286583765
/*     */     //   4077: lload #7
/*     */     //   4079: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4084: athrow
/*     */     //   4085: iload #22
/*     */     //   4087: lload #7
/*     */     //   4089: lconst_0
/*     */     //   4090: lcmp
/*     */     //   4091: ifle -> 4135
/*     */     //   4094: ifne -> 4133
/*     */     //   4097: ifne -> 4396
/*     */     //   4100: goto -> 4114
/*     */     //   4103: ldc2_w -2801082219286583765
/*     */     //   4106: lload #7
/*     */     //   4108: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4113: athrow
/*     */     //   4114: aload #4
/*     */     //   4116: invokevirtual a : ()Z
/*     */     //   4119: goto -> 4133
/*     */     //   4122: ldc2_w -2801082219286583765
/*     */     //   4125: lload #7
/*     */     //   4127: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4132: athrow
/*     */     //   4133: iload #22
/*     */     //   4135: ifne -> 4175
/*     */     //   4138: ifne -> 4396
/*     */     //   4141: goto -> 4155
/*     */     //   4144: ldc2_w -2801082219286583765
/*     */     //   4147: lload #7
/*     */     //   4149: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4154: athrow
/*     */     //   4155: aload_1
/*     */     //   4156: invokeinterface i : ()Z
/*     */     //   4161: goto -> 4175
/*     */     //   4164: ldc2_w -2801082219286583765
/*     */     //   4167: lload #7
/*     */     //   4169: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4174: athrow
/*     */     //   4175: ifeq -> 4396
/*     */     //   4178: ldc_w 0.15
/*     */     //   4181: fstore #26
/*     */     //   4183: aload #6
/*     */     //   4185: aload #6
/*     */     //   4187: invokevirtual getX : ()D
/*     */     //   4190: lload #13
/*     */     //   4192: dup2_x2
/*     */     //   4193: pop2
/*     */     //   4194: fload #26
/*     */     //   4196: fneg
/*     */     //   4197: f2d
/*     */     //   4198: fload #26
/*     */     //   4200: f2d
/*     */     //   4201: iload #15
/*     */     //   4203: invokestatic c : (JDDDI)D
/*     */     //   4206: invokevirtual setX : (D)Lorg/bukkit/util/Vector;
/*     */     //   4209: pop
/*     */     //   4210: aload #6
/*     */     //   4212: aload #6
/*     */     //   4214: invokevirtual getZ : ()D
/*     */     //   4217: lload #13
/*     */     //   4219: dup2_x2
/*     */     //   4220: pop2
/*     */     //   4221: fload #26
/*     */     //   4223: fneg
/*     */     //   4224: f2d
/*     */     //   4225: fload #26
/*     */     //   4227: f2d
/*     */     //   4228: iload #15
/*     */     //   4230: invokestatic c : (JDDDI)D
/*     */     //   4233: invokevirtual setZ : (D)Lorg/bukkit/util/Vector;
/*     */     //   4236: pop
/*     */     //   4237: aload #6
/*     */     //   4239: invokevirtual getY : ()D
/*     */     //   4242: ldc2_w -0.15
/*     */     //   4245: dcmpg
/*     */     //   4246: iload #22
/*     */     //   4248: lload #7
/*     */     //   4250: lconst_0
/*     */     //   4251: lcmp
/*     */     //   4252: ifle -> 4312
/*     */     //   4255: ifne -> 4303
/*     */     //   4258: ifge -> 4298
/*     */     //   4261: goto -> 4275
/*     */     //   4264: ldc2_w -2801082219286583765
/*     */     //   4267: lload #7
/*     */     //   4269: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4274: athrow
/*     */     //   4275: aload #6
/*     */     //   4277: ldc2_w -0.15
/*     */     //   4280: invokevirtual setY : (D)Lorg/bukkit/util/Vector;
/*     */     //   4283: pop
/*     */     //   4284: goto -> 4298
/*     */     //   4287: ldc2_w -2801082219286583765
/*     */     //   4290: lload #7
/*     */     //   4292: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4297: athrow
/*     */     //   4298: aload #4
/*     */     //   4300: invokevirtual b : ()Z
/*     */     //   4303: lload #7
/*     */     //   4305: lconst_0
/*     */     //   4306: lcmp
/*     */     //   4307: iflt -> 4372
/*     */     //   4310: iload #22
/*     */     //   4312: ifne -> 4372
/*     */     //   4315: ifeq -> 4396
/*     */     //   4318: goto -> 4332
/*     */     //   4321: ldc2_w -2801082219286583765
/*     */     //   4324: lload #7
/*     */     //   4326: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4331: athrow
/*     */     //   4332: aload #6
/*     */     //   4334: iload #22
/*     */     //   4336: ifne -> 4398
/*     */     //   4339: goto -> 4353
/*     */     //   4342: ldc2_w -2801082219286583765
/*     */     //   4345: lload #7
/*     */     //   4347: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4352: athrow
/*     */     //   4353: invokevirtual getY : ()D
/*     */     //   4356: dconst_0
/*     */     //   4357: dcmpg
/*     */     //   4358: goto -> 4372
/*     */     //   4361: ldc2_w -2801082219286583765
/*     */     //   4364: lload #7
/*     */     //   4366: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4371: athrow
/*     */     //   4372: ifge -> 4396
/*     */     //   4375: aload #6
/*     */     //   4377: dconst_0
/*     */     //   4378: invokevirtual setY : (D)Lorg/bukkit/util/Vector;
/*     */     //   4381: pop
/*     */     //   4382: goto -> 4396
/*     */     //   4385: ldc2_w -2801082219286583765
/*     */     //   4388: lload #7
/*     */     //   4390: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   4395: athrow
/*     */     //   4396: aload #6
/*     */     //   4398: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #450	-> 73
/*     */     //   #44	-> 85
/*     */     //   #181	-> 108
/*     */     //   #327	-> 121
/*     */     //   #120	-> 136
/*     */     //   #80	-> 151
/*     */     //   #31	-> 192
/*     */     //   #291	-> 357
/*     */     //   #3	-> 386
/*     */     //   #391	-> 413
/*     */     //   #37	-> 416
/*     */     //   #448	-> 453
/*     */     //   #125	-> 490
/*     */     //   #182	-> 562
/*     */     //   #363	-> 603
/*     */     //   #100	-> 679
/*     */     //   #21	-> 741
/*     */     //   #190	-> 815
/*     */     //   #238	-> 891
/*     */     //   #381	-> 953
/*     */     //   #329	-> 1008
/*     */     //   #234	-> 1019
/*     */     //   #23	-> 1030
/*     */     //   #323	-> 1068
/*     */     //   #461	-> 1076
/*     */     //   #376	-> 1117
/*     */     //   #19	-> 1144
/*     */     //   #148	-> 1152
/*     */     //   #401	-> 1160
/*     */     //   #187	-> 1167
/*     */     //   #118	-> 1202
/*     */     //   #383	-> 1291
/*     */     //   #338	-> 1306
/*     */     //   #259	-> 1387
/*     */     //   #334	-> 1390
/*     */     //   #134	-> 1462
/*     */     //   #411	-> 1472
/*     */     //   #250	-> 1482
/*     */     //   #272	-> 1550
/*     */     //   #410	-> 1605
/*     */     //   #392	-> 1613
/*     */     //   #185	-> 1640
/*     */     //   #385	-> 1738
/*     */     //   #61	-> 1787
/*     */     //   #444	-> 1828
/*     */     //   #206	-> 1955
/*     */     //   #142	-> 1992
/*     */     //   #203	-> 2021
/*     */     //   #378	-> 2033
/*     */     //   #169	-> 2131
/*     */     //   #166	-> 2165
/*     */     //   #10	-> 2215
/*     */     //   #53	-> 2240
/*     */     //   #374	-> 2398
/*     */     //   #188	-> 2415
/*     */     //   #115	-> 2468
/*     */     //   #191	-> 2598
/*     */     //   #57	-> 2635
/*     */     //   #347	-> 2760
/*     */     //   #263	-> 2808
/*     */     //   #65	-> 2831
/*     */     //   #453	-> 2841
/*     */     //   #199	-> 2869
/*     */     //   #121	-> 2897
/*     */     //   #373	-> 2904
/*     */     //   #315	-> 2911
/*     */     //   #330	-> 2932
/*     */     //   #275	-> 2958
/*     */     //   #282	-> 3034
/*     */     //   #212	-> 3049
/*     */     //   #286	-> 3063
/*     */     //   #144	-> 3086
/*     */     //   #305	-> 3109
/*     */     //   #299	-> 3182
/*     */     //   #438	-> 3198
/*     */     //   #289	-> 3216
/*     */     //   #326	-> 3239
/*     */     //   #340	-> 3262
/*     */     //   #413	-> 3276
/*     */     //   #254	-> 3309
/*     */     //   #460	-> 3356
/*     */     //   #146	-> 3371
/*     */     //   #454	-> 3386
/*     */     //   #176	-> 3401
/*     */     //   #484	-> 3413
/*     */     //   #48	-> 3450
/*     */     //   #34	-> 3460
/*     */     //   #155	-> 3488
/*     */     //   #131	-> 3516
/*     */     //   #389	-> 3523
/*     */     //   #395	-> 3530
/*     */     //   #136	-> 3551
/*     */     //   #414	-> 3574
/*     */     //   #339	-> 3650
/*     */     //   #292	-> 3665
/*     */     //   #150	-> 3679
/*     */     //   #178	-> 3702
/*     */     //   #466	-> 3725
/*     */     //   #141	-> 3758
/*     */     //   #306	-> 3774
/*     */     //   #117	-> 3792
/*     */     //   #271	-> 3815
/*     */     //   #294	-> 3838
/*     */     //   #278	-> 3852
/*     */     //   #322	-> 3885
/*     */     //   #112	-> 3932
/*     */     //   #290	-> 3947
/*     */     //   #446	-> 3962
/*     */     //   #331	-> 3977
/*     */     //   #463	-> 3989
/*     */     //   #478	-> 4030
/*     */     //   #321	-> 4155
/*     */     //   #202	-> 4178
/*     */     //   #473	-> 4183
/*     */     //   #435	-> 4210
/*     */     //   #158	-> 4237
/*     */     //   #370	-> 4275
/*     */     //   #52	-> 4298
/*     */     //   #350	-> 4375
/*     */     //   #60	-> 4396
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   73	94	97	aacinternal/v
/*     */     //   121	171	181	aacinternal/v
/*     */     //   192	212	215	aacinternal/v
/*     */     //   209	237	240	aacinternal/v
/*     */     //   226	254	257	aacinternal/v
/*     */     //   251	278	281	aacinternal/v
/*     */     //   268	295	298	aacinternal/v
/*     */     //   292	326	329	aacinternal/v
/*     */     //   309	343	346	aacinternal/v
/*     */     //   340	372	375	aacinternal/v
/*     */     //   391	399	402	aacinternal/v
/*     */     //   416	436	439	aacinternal/v
/*     */     //   458	473	476	aacinternal/v
/*     */     //   492	507	510	aacinternal/v
/*     */     //   504	548	551	aacinternal/v
/*     */     //   574	589	592	aacinternal/v
/*     */     //   586	627	630	aacinternal/v
/*     */     //   603	644	647	aacinternal/v
/*     */     //   641	665	668	aacinternal/v
/*     */     //   691	706	709	aacinternal/v
/*     */     //   703	727	730	aacinternal/v
/*     */     //   741	765	768	aacinternal/v
/*     */     //   779	788	791	aacinternal/v
/*     */     //   802	827	830	aacinternal/v
/*     */     //   841	856	859	aacinternal/v
/*     */     //   853	877	880	aacinternal/v
/*     */     //   903	918	921	aacinternal/v
/*     */     //   915	939	942	aacinternal/v
/*     */     //   953	970	973	aacinternal/v
/*     */     //   984	993	996	aacinternal/v
/*     */     //   1030	1054	1057	aacinternal/v
/*     */     //   1076	1095	1098	aacinternal/v
/*     */     //   1122	1130	1133	aacinternal/v
/*     */     //   1167	1188	1191	aacinternal/v
/*     */     //   1185	1219	1222	aacinternal/v
/*     */     //   1202	1236	1239	aacinternal/v
/*     */     //   1233	1260	1263	aacinternal/v
/*     */     //   1250	1277	1280	aacinternal/v
/*     */     //   1294	1318	1321	aacinternal/v
/*     */     //   1332	1347	1350	aacinternal/v
/*     */     //   1344	1373	1376	aacinternal/v
/*     */     //   1392	1400	1403	aacinternal/v
/*     */     //   1397	1431	1434	aacinternal/v
/*     */     //   1414	1448	1451	aacinternal/v
/*     */     //   1487	1495	1498	aacinternal/v
/*     */     //   1492	1519	1522	aacinternal/v
/*     */     //   1509	1536	1539	aacinternal/v
/*     */     //   1533	1574	1577	aacinternal/v
/*     */     //   1550	1591	1594	aacinternal/v
/*     */     //   1613	1625	1628	aacinternal/v
/*     */     //   1622	1658	1661	aacinternal/v
/*     */     //   1639	1675	1678	aacinternal/v
/*     */     //   1672	1695	1698	aacinternal/v
/*     */     //   1709	1724	1727	aacinternal/v
/*     */     //   1721	1744	1747	aacinternal/v
/*     */     //   1758	1773	1776	aacinternal/v
/*     */     //   1770	1814	1817	aacinternal/v
/*     */     //   1787	1835	1838	aacinternal/v
/*     */     //   1849	1864	1867	aacinternal/v
/*     */     //   1861	1882	1885	aacinternal/v
/*     */     //   1896	1911	1914	aacinternal/v
/*     */     //   1908	1931	1934	aacinternal/v
/*     */     //   1945	1978	1981	aacinternal/v
/*     */     //   1955	2007	2010	aacinternal/v
/*     */     //   2021	2039	2042	aacinternal/v
/*     */     //   2053	2068	2071	aacinternal/v
/*     */     //   2065	2088	2091	aacinternal/v
/*     */     //   2102	2117	2120	aacinternal/v
/*     */     //   2114	2151	2154	aacinternal/v
/*     */     //   2131	2172	2175	aacinternal/v
/*     */     //   2186	2201	2204	aacinternal/v
/*     */     //   2198	2226	2229	aacinternal/v
/*     */     //   2252	2260	2263	aacinternal/v
/*     */     //   2257	2285	2288	aacinternal/v
/*     */     //   2274	2302	2305	aacinternal/v
/*     */     //   2299	2326	2329	aacinternal/v
/*     */     //   2316	2343	2346	aacinternal/v
/*     */     //   2340	2367	2370	aacinternal/v
/*     */     //   2357	2384	2387	aacinternal/v
/*     */     //   2415	2429	2432	aacinternal/v
/*     */     //   2422	2446	2449	aacinternal/v
/*     */     //   2468	2487	2490	aacinternal/v
/*     */     //   2484	2506	2509	aacinternal/v
/*     */     //   2520	2535	2538	aacinternal/v
/*     */     //   2532	2555	2558	aacinternal/v
/*     */     //   2569	2584	2587	aacinternal/v
/*     */     //   2581	2621	2624	aacinternal/v
/*     */     //   2640	2655	2658	aacinternal/v
/*     */     //   2652	2675	2678	aacinternal/v
/*     */     //   2689	2704	2707	aacinternal/v
/*     */     //   2701	2724	2727	aacinternal/v
/*     */     //   2738	2746	2749	aacinternal/v
/*     */     //   2743	2769	2772	aacinternal/v
/*     */     //   2760	2791	2794	aacinternal/v
/*     */     //   2932	2973	2976	aacinternal/v
/*     */     //   2970	3003	3006	aacinternal/v
/*     */     //   2987	3020	3023	aacinternal/v
/*     */     //   3113	3121	3124	aacinternal/v
/*     */     //   3118	3151	3154	aacinternal/v
/*     */     //   3135	3168	3171	aacinternal/v
/*     */     //   3266	3342	3345	aacinternal/v
/*     */     //   3356	3417	3420	aacinternal/v
/*     */     //   3551	3589	3592	aacinternal/v
/*     */     //   3586	3619	3622	aacinternal/v
/*     */     //   3603	3636	3639	aacinternal/v
/*     */     //   3729	3744	3747	aacinternal/v
/*     */     //   3842	3918	3921	aacinternal/v
/*     */     //   3932	4016	4019	aacinternal/v
/*     */     //   4030	4051	4054	aacinternal/v
/*     */     //   4048	4071	4074	aacinternal/v
/*     */     //   4085	4100	4103	aacinternal/v
/*     */     //   4097	4119	4122	aacinternal/v
/*     */     //   4133	4141	4144	aacinternal/v
/*     */     //   4138	4161	4164	aacinternal/v
/*     */     //   4183	4261	4264	aacinternal/v
/*     */     //   4258	4284	4287	aacinternal/v
/*     */     //   4303	4318	4321	aacinternal/v
/*     */     //   4315	4339	4342	aacinternal/v
/*     */     //   4332	4358	4361	aacinternal/v
/*     */     //   4372	4382	4385	aacinternal/v
/*     */   }
/*     */   
/*     */   private gg a(gb paramgb, boolean paramBoolean, long paramLong, mZ parammZ) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/kz.d : J
/*     */     //   3: lload_3
/*     */     //   4: lxor
/*     */     //   5: lstore_3
/*     */     //   6: lload_3
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 98212823002805
/*     */     //   11: lxor
/*     */     //   12: lstore #6
/*     */     //   14: pop2
/*     */     //   15: ldc2_w -1667172931574913320
/*     */     //   18: lload_3
/*     */     //   19: <illegal opcode> w : (JJ)I
/*     */     //   24: aload_1
/*     */     //   25: invokeinterface a : ()F
/*     */     //   30: fstore #9
/*     */     //   32: istore #8
/*     */     //   34: aload #5
/*     */     //   36: invokevirtual c : ()Z
/*     */     //   39: iload #8
/*     */     //   41: ifne -> 75
/*     */     //   44: ifeq -> 70
/*     */     //   47: goto -> 60
/*     */     //   50: ldc2_w -1668075617433708590
/*     */     //   53: lload_3
/*     */     //   54: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   59: athrow
/*     */     //   60: fload #9
/*     */     //   62: f2d
/*     */     //   63: ldc2_w 1.300000011920929
/*     */     //   66: dmul
/*     */     //   67: d2f
/*     */     //   68: fstore #9
/*     */     //   70: aload #5
/*     */     //   72: invokevirtual f : ()Z
/*     */     //   75: iload #8
/*     */     //   77: lload_3
/*     */     //   78: lconst_0
/*     */     //   79: lcmp
/*     */     //   80: iflt -> 198
/*     */     //   83: ifne -> 196
/*     */     //   86: ifeq -> 177
/*     */     //   89: goto -> 102
/*     */     //   92: ldc2_w -1668075617433708590
/*     */     //   95: lload_3
/*     */     //   96: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   101: athrow
/*     */     //   102: aload_1
/*     */     //   103: iload #8
/*     */     //   105: ifne -> 191
/*     */     //   108: goto -> 121
/*     */     //   111: ldc2_w -1668075617433708590
/*     */     //   114: lload_3
/*     */     //   115: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   120: athrow
/*     */     //   121: invokeinterface a : ()Lorg/bukkit/entity/EntityType;
/*     */     //   126: getstatic org/bukkit/entity/EntityType.PLAYER : Lorg/bukkit/entity/EntityType;
/*     */     //   129: if_acmpne -> 177
/*     */     //   132: goto -> 145
/*     */     //   135: ldc2_w -1668075617433708590
/*     */     //   138: lload_3
/*     */     //   139: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   144: athrow
/*     */     //   145: aload_1
/*     */     //   146: invokeinterface c : ()F
/*     */     //   151: fstore #11
/*     */     //   153: aload #5
/*     */     //   155: invokevirtual c : ()Z
/*     */     //   158: ifeq -> 167
/*     */     //   161: fload #11
/*     */     //   163: fconst_2
/*     */     //   164: fmul
/*     */     //   165: fstore #11
/*     */     //   167: ldc_w 0.91
/*     */     //   170: fstore #10
/*     */     //   172: iload #8
/*     */     //   174: ifeq -> 790
/*     */     //   177: aload_1
/*     */     //   178: goto -> 191
/*     */     //   181: ldc2_w -1668075617433708590
/*     */     //   184: lload_3
/*     */     //   185: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   190: athrow
/*     */     //   191: invokeinterface p : ()Z
/*     */     //   196: iload #8
/*     */     //   198: ifne -> 632
/*     */     //   201: ifeq -> 613
/*     */     //   204: goto -> 217
/*     */     //   207: ldc2_w -1668075617433708590
/*     */     //   210: lload_3
/*     */     //   211: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   216: athrow
/*     */     //   217: aload_0
/*     */     //   218: getfield b : Lme/konsolas/aac/kP;
/*     */     //   221: lload #6
/*     */     //   223: getstatic me/konsolas/aac/kP.V1_13 : Lme/konsolas/aac/kP;
/*     */     //   226: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*     */     //   229: iload #8
/*     */     //   231: ifne -> 335
/*     */     //   234: goto -> 247
/*     */     //   237: ldc2_w -1668075617433708590
/*     */     //   240: lload_3
/*     */     //   241: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   246: athrow
/*     */     //   247: ifeq -> 324
/*     */     //   250: goto -> 263
/*     */     //   253: ldc2_w -1668075617433708590
/*     */     //   256: lload_3
/*     */     //   257: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   262: athrow
/*     */     //   263: aload #5
/*     */     //   265: invokevirtual c : ()Z
/*     */     //   268: lload_3
/*     */     //   269: lconst_0
/*     */     //   270: lcmp
/*     */     //   271: iflt -> 335
/*     */     //   274: iload #8
/*     */     //   276: ifne -> 335
/*     */     //   279: goto -> 292
/*     */     //   282: ldc2_w -1668075617433708590
/*     */     //   285: lload_3
/*     */     //   286: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   291: athrow
/*     */     //   292: ifeq -> 324
/*     */     //   295: goto -> 308
/*     */     //   298: ldc2_w -1668075617433708590
/*     */     //   301: lload_3
/*     */     //   302: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   307: athrow
/*     */     //   308: ldc_w 0.9
/*     */     //   311: goto -> 382
/*     */     //   314: ldc2_w -1668075617433708590
/*     */     //   317: lload_3
/*     */     //   318: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   323: athrow
/*     */     //   324: invokestatic a : ()Lme/konsolas/aac/kP;
/*     */     //   327: lload #6
/*     */     //   329: getstatic me/konsolas/aac/kP.V1_11 : Lme/konsolas/aac/kP;
/*     */     //   332: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*     */     //   335: ifeq -> 379
/*     */     //   338: aload_1
/*     */     //   339: invokeinterface a : ()Lorg/bukkit/entity/EntityType;
/*     */     //   344: getstatic org/bukkit/entity/EntityType.SKELETON_HORSE : Lorg/bukkit/entity/EntityType;
/*     */     //   347: if_acmpne -> 379
/*     */     //   350: goto -> 363
/*     */     //   353: ldc2_w -1668075617433708590
/*     */     //   356: lload_3
/*     */     //   357: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   362: athrow
/*     */     //   363: ldc_w 0.96
/*     */     //   366: goto -> 382
/*     */     //   369: ldc2_w -1668075617433708590
/*     */     //   372: lload_3
/*     */     //   373: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   378: athrow
/*     */     //   379: ldc_w 0.8
/*     */     //   382: fstore #10
/*     */     //   384: ldc_w 0.02
/*     */     //   387: fstore #11
/*     */     //   389: aload_1
/*     */     //   390: invokeinterface d : ()I
/*     */     //   395: i2f
/*     */     //   396: fstore #12
/*     */     //   398: fload #12
/*     */     //   400: ldc_w 3.0
/*     */     //   403: fcmpl
/*     */     //   404: iload #8
/*     */     //   406: lload_3
/*     */     //   407: lconst_0
/*     */     //   408: lcmp
/*     */     //   409: ifle -> 439
/*     */     //   412: ifne -> 437
/*     */     //   415: ifle -> 436
/*     */     //   418: goto -> 431
/*     */     //   421: ldc2_w -1668075617433708590
/*     */     //   424: lload_3
/*     */     //   425: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   430: athrow
/*     */     //   431: ldc_w 3.0
/*     */     //   434: fstore #12
/*     */     //   436: iload_2
/*     */     //   437: iload #8
/*     */     //   439: lload_3
/*     */     //   440: lconst_0
/*     */     //   441: lcmp
/*     */     //   442: ifle -> 478
/*     */     //   445: ifne -> 476
/*     */     //   448: ifne -> 472
/*     */     //   451: goto -> 464
/*     */     //   454: ldc2_w -1668075617433708590
/*     */     //   457: lload_3
/*     */     //   458: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   463: athrow
/*     */     //   464: fload #12
/*     */     //   466: ldc_w 0.5
/*     */     //   469: fmul
/*     */     //   470: fstore #12
/*     */     //   472: fload #12
/*     */     //   474: fconst_0
/*     */     //   475: fcmpl
/*     */     //   476: iload #8
/*     */     //   478: lload_3
/*     */     //   479: lconst_0
/*     */     //   480: lcmp
/*     */     //   481: ifle -> 556
/*     */     //   484: ifne -> 554
/*     */     //   487: ifle -> 542
/*     */     //   490: goto -> 503
/*     */     //   493: ldc2_w -1668075617433708590
/*     */     //   496: lload_3
/*     */     //   497: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   502: athrow
/*     */     //   503: fload #10
/*     */     //   505: f2d
/*     */     //   506: ldc2_w 0.546
/*     */     //   509: fload #10
/*     */     //   511: f2d
/*     */     //   512: dsub
/*     */     //   513: fload #12
/*     */     //   515: f2d
/*     */     //   516: dmul
/*     */     //   517: ldc2_w 3.0
/*     */     //   520: ddiv
/*     */     //   521: dadd
/*     */     //   522: d2f
/*     */     //   523: fstore #10
/*     */     //   525: fload #11
/*     */     //   527: fload #9
/*     */     //   529: fload #11
/*     */     //   531: fsub
/*     */     //   532: fload #12
/*     */     //   534: fmul
/*     */     //   535: ldc_w 3.0
/*     */     //   538: fdiv
/*     */     //   539: fadd
/*     */     //   540: fstore #11
/*     */     //   542: aload_0
/*     */     //   543: getfield b : Lme/konsolas/aac/kP;
/*     */     //   546: lload #6
/*     */     //   548: getstatic me/konsolas/aac/kP.V1_13 : Lme/konsolas/aac/kP;
/*     */     //   551: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*     */     //   554: iload #8
/*     */     //   556: ifne -> 594
/*     */     //   559: ifeq -> 602
/*     */     //   562: goto -> 575
/*     */     //   565: ldc2_w -1668075617433708590
/*     */     //   568: lload_3
/*     */     //   569: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   574: athrow
/*     */     //   575: aload_1
/*     */     //   576: invokeinterface l : ()Z
/*     */     //   581: goto -> 594
/*     */     //   584: ldc2_w -1668075617433708590
/*     */     //   587: lload_3
/*     */     //   588: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   593: athrow
/*     */     //   594: ifeq -> 602
/*     */     //   597: ldc_w 0.96
/*     */     //   600: fstore #10
/*     */     //   602: iload #8
/*     */     //   604: lload_3
/*     */     //   605: lconst_0
/*     */     //   606: lcmp
/*     */     //   607: iflt -> 619
/*     */     //   610: ifeq -> 790
/*     */     //   613: aload_1
/*     */     //   614: invokeinterface e : ()Z
/*     */     //   619: goto -> 632
/*     */     //   622: ldc2_w -1668075617433708590
/*     */     //   625: lload_3
/*     */     //   626: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   631: athrow
/*     */     //   632: ifeq -> 656
/*     */     //   635: ldc_w 0.02
/*     */     //   638: fstore #11
/*     */     //   640: ldc_w 0.5
/*     */     //   643: fstore #10
/*     */     //   645: iload #8
/*     */     //   647: lload_3
/*     */     //   648: lconst_0
/*     */     //   649: lcmp
/*     */     //   650: ifle -> 662
/*     */     //   653: ifeq -> 790
/*     */     //   656: ldc_w 0.91
/*     */     //   659: fstore #10
/*     */     //   661: iload_2
/*     */     //   662: ifeq -> 677
/*     */     //   665: aload_1
/*     */     //   666: invokeinterface b : ()F
/*     */     //   671: ldc_w 0.91
/*     */     //   674: fmul
/*     */     //   675: fstore #10
/*     */     //   677: ldc_w 0.16277136
/*     */     //   680: fload #10
/*     */     //   682: fload #10
/*     */     //   684: fmul
/*     */     //   685: fload #10
/*     */     //   687: fmul
/*     */     //   688: fdiv
/*     */     //   689: fstore #12
/*     */     //   691: iload_2
/*     */     //   692: ifeq -> 707
/*     */     //   695: fload #9
/*     */     //   697: fload #12
/*     */     //   699: fmul
/*     */     //   700: fstore #11
/*     */     //   702: iload #8
/*     */     //   704: ifeq -> 790
/*     */     //   707: aload_1
/*     */     //   708: invokeinterface a : ()Lorg/bukkit/entity/EntityType;
/*     */     //   713: getstatic org/bukkit/entity/EntityType.PLAYER : Lorg/bukkit/entity/EntityType;
/*     */     //   716: if_acmpne -> 782
/*     */     //   719: goto -> 732
/*     */     //   722: ldc2_w -1668075617433708590
/*     */     //   725: lload_3
/*     */     //   726: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   731: athrow
/*     */     //   732: ldc_w 0.02
/*     */     //   735: fstore #11
/*     */     //   737: iload #8
/*     */     //   739: lload_3
/*     */     //   740: lconst_0
/*     */     //   741: lcmp
/*     */     //   742: ifle -> 779
/*     */     //   745: ifne -> 777
/*     */     //   748: aload #5
/*     */     //   750: invokevirtual c : ()Z
/*     */     //   753: ifeq -> 790
/*     */     //   756: goto -> 769
/*     */     //   759: ldc2_w -1668075617433708590
/*     */     //   762: lload_3
/*     */     //   763: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   768: athrow
/*     */     //   769: fload #11
/*     */     //   771: ldc_w 0.006
/*     */     //   774: fadd
/*     */     //   775: fstore #11
/*     */     //   777: iload #8
/*     */     //   779: ifeq -> 790
/*     */     //   782: fload #9
/*     */     //   784: ldc_w 0.1
/*     */     //   787: fmul
/*     */     //   788: fstore #11
/*     */     //   790: new me/konsolas/aac/gg
/*     */     //   793: dup
/*     */     //   794: fload #11
/*     */     //   796: fload #10
/*     */     //   798: invokespecial <init> : (FF)V
/*     */     //   801: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #464	-> 24
/*     */     //   #36	-> 34
/*     */     //   #2	-> 60
/*     */     //   #243	-> 70
/*     */     //   #412	-> 145
/*     */     //   #470	-> 153
/*     */     //   #439	-> 161
/*     */     //   #130	-> 167
/*     */     //   #25	-> 177
/*     */     //   #159	-> 217
/*     */     //   #164	-> 324
/*     */     //   #475	-> 339
/*     */     //   #167	-> 384
/*     */     //   #71	-> 389
/*     */     //   #88	-> 398
/*     */     //   #96	-> 436
/*     */     //   #83	-> 464
/*     */     //   #59	-> 472
/*     */     //   #344	-> 503
/*     */     //   #440	-> 525
/*     */     //   #471	-> 542
/*     */     //   #73	-> 597
/*     */     //   #441	-> 602
/*     */     //   #214	-> 635
/*     */     //   #353	-> 640
/*     */     //   #402	-> 656
/*     */     //   #239	-> 661
/*     */     //   #258	-> 665
/*     */     //   #128	-> 677
/*     */     //   #54	-> 691
/*     */     //   #300	-> 695
/*     */     //   #4	-> 707
/*     */     //   #111	-> 732
/*     */     //   #447	-> 737
/*     */     //   #465	-> 769
/*     */     //   #89	-> 782
/*     */     //   #457	-> 790
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   34	47	50	aacinternal/v
/*     */     //   75	89	92	aacinternal/v
/*     */     //   86	108	111	aacinternal/v
/*     */     //   102	132	135	aacinternal/v
/*     */     //   172	178	181	aacinternal/v
/*     */     //   196	204	207	aacinternal/v
/*     */     //   201	234	237	aacinternal/v
/*     */     //   217	250	253	aacinternal/v
/*     */     //   247	279	282	aacinternal/v
/*     */     //   263	295	298	aacinternal/v
/*     */     //   292	314	314	aacinternal/v
/*     */     //   335	350	353	aacinternal/v
/*     */     //   338	369	369	aacinternal/v
/*     */     //   398	418	421	aacinternal/v
/*     */     //   437	451	454	aacinternal/v
/*     */     //   476	490	493	aacinternal/v
/*     */     //   554	562	565	aacinternal/v
/*     */     //   559	581	584	aacinternal/v
/*     */     //   602	619	622	aacinternal/v
/*     */     //   702	719	722	aacinternal/v
/*     */     //   737	756	759	aacinternal/v
/*     */   }
/*     */   
/*     */   private lq a(Vector paramVector, lq paramlq, short paramShort, int paramInt, char paramChar, Collection paramCollection) {
/*     */     // Byte code:
/*     */     //   0: iload_3
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
/*     */     //   25: getstatic me/konsolas/aac/kz.d : J
/*     */     //   28: lxor
/*     */     //   29: lstore #7
/*     */     //   31: lload #7
/*     */     //   33: dup2
/*     */     //   34: ldc2_w 12115398029120
/*     */     //   37: lxor
/*     */     //   38: lstore #9
/*     */     //   40: dup2
/*     */     //   41: ldc2_w 125342853394877
/*     */     //   44: lxor
/*     */     //   45: lstore #11
/*     */     //   47: dup2
/*     */     //   48: ldc2_w 3831767145793
/*     */     //   51: lxor
/*     */     //   52: lstore #13
/*     */     //   54: dup2
/*     */     //   55: ldc2_w 12259016844179
/*     */     //   58: lxor
/*     */     //   59: lstore #15
/*     */     //   61: pop2
/*     */     //   62: ldc2_w 7594311375417859408
/*     */     //   65: lload #7
/*     */     //   67: <illegal opcode> w : (JJ)I
/*     */     //   72: aload #6
/*     */     //   74: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   79: astore #18
/*     */     //   81: istore #17
/*     */     //   83: aload #18
/*     */     //   85: invokeinterface hasNext : ()Z
/*     */     //   90: ifeq -> 155
/*     */     //   93: aload #18
/*     */     //   95: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   100: checkcast me/konsolas/aac/lq
/*     */     //   103: astore #19
/*     */     //   105: aload_1
/*     */     //   106: aload #19
/*     */     //   108: lload #13
/*     */     //   110: aload_2
/*     */     //   111: aload_1
/*     */     //   112: invokevirtual getY : ()D
/*     */     //   115: invokevirtual b : (JLme/konsolas/aac/lq;D)D
/*     */     //   118: invokevirtual setY : (D)Lorg/bukkit/util/Vector;
/*     */     //   121: pop
/*     */     //   122: iload #17
/*     */     //   124: iload #4
/*     */     //   126: ifle -> 178
/*     */     //   129: ifeq -> 166
/*     */     //   132: iload #17
/*     */     //   134: ifne -> 83
/*     */     //   137: iload_3
/*     */     //   138: iflt -> 122
/*     */     //   141: goto -> 155
/*     */     //   144: ldc2_w 7578604099395655207
/*     */     //   147: lload #7
/*     */     //   149: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   154: athrow
/*     */     //   155: aload_2
/*     */     //   156: dconst_0
/*     */     //   157: aload_1
/*     */     //   158: invokevirtual getY : ()D
/*     */     //   161: dconst_0
/*     */     //   162: invokevirtual a : (DDD)Lme/konsolas/aac/lq;
/*     */     //   165: astore_2
/*     */     //   166: aload_0
/*     */     //   167: getfield b : Lme/konsolas/aac/kP;
/*     */     //   170: lload #9
/*     */     //   172: getstatic me/konsolas/aac/kP.V1_13 : Lme/konsolas/aac/kP;
/*     */     //   175: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*     */     //   178: iload #17
/*     */     //   180: iload #4
/*     */     //   182: iflt -> 236
/*     */     //   185: ifeq -> 234
/*     */     //   188: ifeq -> 692
/*     */     //   191: goto -> 205
/*     */     //   194: ldc2_w 7578604099395655207
/*     */     //   197: lload #7
/*     */     //   199: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   204: athrow
/*     */     //   205: aload_1
/*     */     //   206: invokevirtual getX : ()D
/*     */     //   209: invokestatic abs : (D)D
/*     */     //   212: aload_1
/*     */     //   213: invokevirtual getZ : ()D
/*     */     //   216: invokestatic abs : (D)D
/*     */     //   219: dcmpg
/*     */     //   220: goto -> 234
/*     */     //   223: ldc2_w 7578604099395655207
/*     */     //   226: lload #7
/*     */     //   228: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   233: athrow
/*     */     //   234: iload #17
/*     */     //   236: ifeq -> 257
/*     */     //   239: ifge -> 260
/*     */     //   242: goto -> 256
/*     */     //   245: ldc2_w 7578604099395655207
/*     */     //   248: lload #7
/*     */     //   250: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   255: athrow
/*     */     //   256: iconst_1
/*     */     //   257: goto -> 261
/*     */     //   260: iconst_0
/*     */     //   261: istore #18
/*     */     //   263: iload #18
/*     */     //   265: iload #17
/*     */     //   267: ifeq -> 431
/*     */     //   270: ifeq -> 425
/*     */     //   273: goto -> 287
/*     */     //   276: ldc2_w 7578604099395655207
/*     */     //   279: lload #7
/*     */     //   281: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   286: athrow
/*     */     //   287: aload_1
/*     */     //   288: invokevirtual getZ : ()D
/*     */     //   291: dconst_0
/*     */     //   292: dcmpl
/*     */     //   293: iload #17
/*     */     //   295: iload_3
/*     */     //   296: iflt -> 433
/*     */     //   299: ifeq -> 431
/*     */     //   302: goto -> 316
/*     */     //   305: ldc2_w 7578604099395655207
/*     */     //   308: lload #7
/*     */     //   310: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   315: athrow
/*     */     //   316: ifeq -> 425
/*     */     //   319: goto -> 333
/*     */     //   322: ldc2_w 7578604099395655207
/*     */     //   325: lload #7
/*     */     //   327: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   332: athrow
/*     */     //   333: aload #6
/*     */     //   335: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   340: astore #19
/*     */     //   342: aload #19
/*     */     //   344: invokeinterface hasNext : ()Z
/*     */     //   349: ifeq -> 414
/*     */     //   352: aload #19
/*     */     //   354: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   359: checkcast me/konsolas/aac/lq
/*     */     //   362: astore #20
/*     */     //   364: aload_1
/*     */     //   365: aload #20
/*     */     //   367: lload #15
/*     */     //   369: aload_2
/*     */     //   370: aload_1
/*     */     //   371: invokevirtual getZ : ()D
/*     */     //   374: invokevirtual a : (JLme/konsolas/aac/lq;D)D
/*     */     //   377: invokevirtual setZ : (D)Lorg/bukkit/util/Vector;
/*     */     //   380: iload_3
/*     */     //   381: iflt -> 426
/*     */     //   384: pop
/*     */     //   385: iload #17
/*     */     //   387: ifeq -> 425
/*     */     //   390: iload #17
/*     */     //   392: ifne -> 342
/*     */     //   395: iload #5
/*     */     //   397: iflt -> 385
/*     */     //   400: goto -> 414
/*     */     //   403: ldc2_w 7578604099395655207
/*     */     //   406: lload #7
/*     */     //   408: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   413: athrow
/*     */     //   414: aload_2
/*     */     //   415: dconst_0
/*     */     //   416: dconst_0
/*     */     //   417: aload_1
/*     */     //   418: invokevirtual getZ : ()D
/*     */     //   421: invokevirtual a : (DDD)Lme/konsolas/aac/lq;
/*     */     //   424: astore_2
/*     */     //   425: aload_1
/*     */     //   426: invokevirtual getX : ()D
/*     */     //   429: dconst_0
/*     */     //   430: dcmpl
/*     */     //   431: iload #17
/*     */     //   433: iload #5
/*     */     //   435: iflt -> 554
/*     */     //   438: ifeq -> 552
/*     */     //   441: ifeq -> 550
/*     */     //   444: goto -> 458
/*     */     //   447: ldc2_w 7578604099395655207
/*     */     //   450: lload #7
/*     */     //   452: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   457: athrow
/*     */     //   458: aload #6
/*     */     //   460: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   465: astore #19
/*     */     //   467: aload #19
/*     */     //   469: invokeinterface hasNext : ()Z
/*     */     //   474: ifeq -> 539
/*     */     //   477: aload #19
/*     */     //   479: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   484: checkcast me/konsolas/aac/lq
/*     */     //   487: astore #20
/*     */     //   489: aload_1
/*     */     //   490: aload #20
/*     */     //   492: lload #11
/*     */     //   494: aload_2
/*     */     //   495: aload_1
/*     */     //   496: invokevirtual getX : ()D
/*     */     //   499: invokevirtual c : (JLme/konsolas/aac/lq;D)D
/*     */     //   502: invokevirtual setX : (D)Lorg/bukkit/util/Vector;
/*     */     //   505: pop
/*     */     //   506: iload #17
/*     */     //   508: iload_3
/*     */     //   509: iflt -> 517
/*     */     //   512: ifeq -> 550
/*     */     //   515: iload #17
/*     */     //   517: ifne -> 467
/*     */     //   520: iload #4
/*     */     //   522: iflt -> 506
/*     */     //   525: goto -> 539
/*     */     //   528: ldc2_w 7578604099395655207
/*     */     //   531: lload #7
/*     */     //   533: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   538: athrow
/*     */     //   539: aload_2
/*     */     //   540: aload_1
/*     */     //   541: invokevirtual getX : ()D
/*     */     //   544: dconst_0
/*     */     //   545: dconst_0
/*     */     //   546: invokevirtual a : (DDD)Lme/konsolas/aac/lq;
/*     */     //   549: astore_2
/*     */     //   550: iload #18
/*     */     //   552: iload #17
/*     */     //   554: ifeq -> 594
/*     */     //   557: ifne -> 689
/*     */     //   560: goto -> 574
/*     */     //   563: ldc2_w 7578604099395655207
/*     */     //   566: lload #7
/*     */     //   568: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   573: athrow
/*     */     //   574: aload_1
/*     */     //   575: invokevirtual getZ : ()D
/*     */     //   578: dconst_0
/*     */     //   579: dcmpl
/*     */     //   580: goto -> 594
/*     */     //   583: ldc2_w 7578604099395655207
/*     */     //   586: lload #7
/*     */     //   588: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   593: athrow
/*     */     //   594: ifeq -> 689
/*     */     //   597: aload #6
/*     */     //   599: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   604: astore #19
/*     */     //   606: aload #19
/*     */     //   608: invokeinterface hasNext : ()Z
/*     */     //   613: ifeq -> 678
/*     */     //   616: aload #19
/*     */     //   618: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   623: checkcast me/konsolas/aac/lq
/*     */     //   626: astore #20
/*     */     //   628: aload_1
/*     */     //   629: aload #20
/*     */     //   631: lload #15
/*     */     //   633: aload_2
/*     */     //   634: aload_1
/*     */     //   635: invokevirtual getZ : ()D
/*     */     //   638: invokevirtual a : (JLme/konsolas/aac/lq;D)D
/*     */     //   641: invokevirtual setZ : (D)Lorg/bukkit/util/Vector;
/*     */     //   644: pop
/*     */     //   645: iload #17
/*     */     //   647: iload_3
/*     */     //   648: iflt -> 656
/*     */     //   651: ifeq -> 689
/*     */     //   654: iload #17
/*     */     //   656: ifne -> 606
/*     */     //   659: iload #5
/*     */     //   661: iflt -> 645
/*     */     //   664: goto -> 678
/*     */     //   667: ldc2_w 7578604099395655207
/*     */     //   670: lload #7
/*     */     //   672: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   677: athrow
/*     */     //   678: aload_2
/*     */     //   679: dconst_0
/*     */     //   680: dconst_0
/*     */     //   681: aload_1
/*     */     //   682: invokevirtual getZ : ()D
/*     */     //   685: invokevirtual a : (DDD)Lme/konsolas/aac/lq;
/*     */     //   688: astore_2
/*     */     //   689: goto -> 877
/*     */     //   692: aload #6
/*     */     //   694: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   699: astore #18
/*     */     //   701: aload #18
/*     */     //   703: invokeinterface hasNext : ()Z
/*     */     //   708: ifeq -> 773
/*     */     //   711: aload #18
/*     */     //   713: iload #4
/*     */     //   715: iflt -> 791
/*     */     //   718: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   723: checkcast me/konsolas/aac/lq
/*     */     //   726: astore #19
/*     */     //   728: aload_1
/*     */     //   729: aload #19
/*     */     //   731: lload #11
/*     */     //   733: aload_2
/*     */     //   734: aload_1
/*     */     //   735: invokevirtual getX : ()D
/*     */     //   738: invokevirtual c : (JLme/konsolas/aac/lq;D)D
/*     */     //   741: invokevirtual setX : (D)Lorg/bukkit/util/Vector;
/*     */     //   744: pop
/*     */     //   745: iload #17
/*     */     //   747: ifeq -> 784
/*     */     //   750: iload #17
/*     */     //   752: ifne -> 701
/*     */     //   755: iload_3
/*     */     //   756: iflt -> 745
/*     */     //   759: goto -> 773
/*     */     //   762: ldc2_w 7578604099395655207
/*     */     //   765: lload #7
/*     */     //   767: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   772: athrow
/*     */     //   773: aload_2
/*     */     //   774: aload_1
/*     */     //   775: invokevirtual getX : ()D
/*     */     //   778: dconst_0
/*     */     //   779: dconst_0
/*     */     //   780: invokevirtual a : (DDD)Lme/konsolas/aac/lq;
/*     */     //   783: astore_2
/*     */     //   784: aload #6
/*     */     //   786: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   791: astore #18
/*     */     //   793: aload #18
/*     */     //   795: invokeinterface hasNext : ()Z
/*     */     //   800: ifeq -> 866
/*     */     //   803: aload #18
/*     */     //   805: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   810: checkcast me/konsolas/aac/lq
/*     */     //   813: iload #5
/*     */     //   815: iflt -> 878
/*     */     //   818: astore #19
/*     */     //   820: aload_1
/*     */     //   821: aload #19
/*     */     //   823: lload #15
/*     */     //   825: aload_2
/*     */     //   826: aload_1
/*     */     //   827: invokevirtual getZ : ()D
/*     */     //   830: invokevirtual a : (JLme/konsolas/aac/lq;D)D
/*     */     //   833: invokevirtual setZ : (D)Lorg/bukkit/util/Vector;
/*     */     //   836: pop
/*     */     //   837: iload #17
/*     */     //   839: ifeq -> 877
/*     */     //   842: iload #17
/*     */     //   844: ifne -> 793
/*     */     //   847: iload #4
/*     */     //   849: ifle -> 837
/*     */     //   852: goto -> 866
/*     */     //   855: ldc2_w 7578604099395655207
/*     */     //   858: lload #7
/*     */     //   860: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   865: athrow
/*     */     //   866: aload_2
/*     */     //   867: dconst_0
/*     */     //   868: dconst_0
/*     */     //   869: aload_1
/*     */     //   870: invokevirtual getZ : ()D
/*     */     //   873: invokevirtual a : (DDD)Lme/konsolas/aac/lq;
/*     */     //   876: astore_2
/*     */     //   877: aload_2
/*     */     //   878: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #477	-> 72
/*     */     //   #209	-> 105
/*     */     //   #343	-> 122
/*     */     //   #264	-> 155
/*     */     //   #371	-> 166
/*     */     //   #227	-> 205
/*     */     //   #276	-> 263
/*     */     //   #105	-> 333
/*     */     //   #151	-> 364
/*     */     //   #46	-> 385
/*     */     //   #165	-> 414
/*     */     //   #368	-> 425
/*     */     //   #163	-> 458
/*     */     //   #335	-> 489
/*     */     //   #476	-> 506
/*     */     //   #427	-> 539
/*     */     //   #218	-> 550
/*     */     //   #366	-> 597
/*     */     //   #268	-> 628
/*     */     //   #482	-> 645
/*     */     //   #328	-> 678
/*     */     //   #372	-> 689
/*     */     //   #377	-> 692
/*     */     //   #119	-> 728
/*     */     //   #267	-> 745
/*     */     //   #310	-> 773
/*     */     //   #95	-> 784
/*     */     //   #430	-> 820
/*     */     //   #396	-> 837
/*     */     //   #249	-> 866
/*     */     //   #232	-> 877
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   105	137	144	aacinternal/v
/*     */     //   166	191	194	aacinternal/v
/*     */     //   188	220	223	aacinternal/v
/*     */     //   234	242	245	aacinternal/v
/*     */     //   263	273	276	aacinternal/v
/*     */     //   270	302	305	aacinternal/v
/*     */     //   287	319	322	aacinternal/v
/*     */     //   364	395	403	aacinternal/v
/*     */     //   431	444	447	aacinternal/v
/*     */     //   489	520	528	aacinternal/v
/*     */     //   552	560	563	aacinternal/v
/*     */     //   557	580	583	aacinternal/v
/*     */     //   628	659	667	aacinternal/v
/*     */     //   728	755	762	aacinternal/v
/*     */     //   820	847	855	aacinternal/v
/*     */   }
/*     */   
/*     */   private static v a(v paramv) {
/*     */     return paramv;
/*     */   }
/*     */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\kz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */