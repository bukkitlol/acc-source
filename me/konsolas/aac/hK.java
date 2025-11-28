package me.konsolas.aac;

import aacinternal.v;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class hk {
  private static final long a = nc.a(5676900273510671312L, -4911698784748962692L, MethodHandles.lookup().lookupClass()).a(96285146026321L);
  
  private static v a(v paramv) {
    return paramv;
  }
  
  private static boolean a(List paramList, double paramDouble, long paramLong) {
    // Byte code:
    //   0: getstatic me/konsolas/aac/hk.a : J
    //   3: lload_3
    //   4: lxor
    //   5: lstore_3
    //   6: lload_3
    //   7: dup2
    //   8: ldc2_w 132486757523095
    //   11: lxor
    //   12: dup2
    //   13: bipush #48
    //   15: lushr
    //   16: l2i
    //   17: istore #5
    //   19: dup2
    //   20: bipush #16
    //   22: lshl
    //   23: bipush #48
    //   25: lushr
    //   26: l2i
    //   27: istore #6
    //   29: dup2
    //   30: bipush #32
    //   32: lshl
    //   33: bipush #32
    //   35: lushr
    //   36: l2i
    //   37: istore #7
    //   39: pop2
    //   40: dup2
    //   41: ldc2_w 82227920761109
    //   44: lxor
    //   45: lstore #8
    //   47: pop2
    //   48: ldc2_w 8438205262842814751
    //   51: lload_3
    //   52: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
    //   57: dconst_0
    //   58: dstore #11
    //   60: astore #10
    //   62: dconst_0
    //   63: dstore #13
    //   65: aload_0
    //   66: ldc2_w 8444851181276588960
    //   69: lload_3
    //   70: <illegal opcode> b : (Ljava/util/List;JJ)I
    //   75: istore #15
    //   77: iload #15
    //   79: aload #10
    //   81: ifnonnull -> 116
    //   84: bipush #6
    //   86: if_icmpgt -> 117
    //   89: goto -> 102
    //   92: ldc2_w 8411077635828765383
    //   95: lload_3
    //   96: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   101: athrow
    //   102: iconst_0
    //   103: goto -> 116
    //   106: ldc2_w 8411077635828765383
    //   109: lload_3
    //   110: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   115: athrow
    //   116: ireturn
    //   117: aload_0
    //   118: ldc2_w 8441703374796418712
    //   121: lload_3
    //   122: <illegal opcode> b : (Ljava/util/List;JJ)Ljava/util/Iterator;
    //   127: astore #16
    //   129: aload #16
    //   131: invokeinterface hasNext : ()Z
    //   136: ifeq -> 193
    //   139: aload #16
    //   141: invokeinterface next : ()Ljava/lang/Object;
    //   146: checkcast java/lang/Double
    //   149: ldc2_w 8487249779074350647
    //   152: lload_3
    //   153: <illegal opcode> b : (Ljava/lang/Double;JJ)D
    //   158: dstore #17
    //   160: dload #11
    //   162: dload #17
    //   164: dadd
    //   165: dstore #11
    //   167: lload_3
    //   168: lconst_0
    //   169: lcmp
    //   170: ifle -> 188
    //   173: dload #13
    //   175: dload #17
    //   177: dload #17
    //   179: dmul
    //   180: dadd
    //   181: aload #10
    //   183: ifnonnull -> 205
    //   186: dstore #13
    //   188: aload #10
    //   190: ifnull -> 129
    //   193: dload #11
    //   195: lload_3
    //   196: lconst_0
    //   197: lcmp
    //   198: iflt -> 158
    //   201: iload #15
    //   203: i2d
    //   204: ddiv
    //   205: dstore #16
    //   207: dload #13
    //   209: iload #15
    //   211: i2d
    //   212: ddiv
    //   213: dload #16
    //   215: dload #16
    //   217: dmul
    //   218: dsub
    //   219: dstore #18
    //   221: dload #18
    //   223: ldc2_w 8400326036081982441
    //   226: lload_3
    //   227: <illegal opcode> w : (DJJ)D
    //   232: dstore #20
    //   234: dconst_0
    //   235: dstore #22
    //   237: iconst_m1
    //   238: istore #24
    //   240: iconst_0
    //   241: istore #25
    //   243: iload #25
    //   245: aload_0
    //   246: ldc2_w 8444851181276588960
    //   249: lload_3
    //   250: <illegal opcode> b : (Ljava/util/List;JJ)I
    //   255: if_icmpge -> 372
    //   258: aload_0
    //   259: iload #25
    //   261: ldc2_w 8434546384469375861
    //   264: lload_3
    //   265: <illegal opcode> b : (Ljava/util/List;IJJ)Ljava/lang/Object;
    //   270: checkcast java/lang/Double
    //   273: ldc2_w 8487249779074350647
    //   276: lload_3
    //   277: <illegal opcode> b : (Ljava/lang/Double;JJ)D
    //   282: dstore #26
    //   284: dload #16
    //   286: dload #26
    //   288: dsub
    //   289: ldc2_w 8500731070531067586
    //   292: lload_3
    //   293: <illegal opcode> w : (DJJ)D
    //   298: dstore #28
    //   300: aload #10
    //   302: lload_3
    //   303: lconst_0
    //   304: lcmp
    //   305: ifle -> 369
    //   308: ifnonnull -> 367
    //   311: dload #28
    //   313: lload_3
    //   314: lconst_0
    //   315: lcmp
    //   316: iflt -> 383
    //   319: dload #22
    //   321: aload #10
    //   323: ifnonnull -> 382
    //   326: goto -> 339
    //   329: ldc2_w 8411077635828765383
    //   332: lload_3
    //   333: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   338: athrow
    //   339: dcmpl
    //   340: ifle -> 364
    //   343: goto -> 356
    //   346: ldc2_w 8411077635828765383
    //   349: lload_3
    //   350: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   355: athrow
    //   356: dload #28
    //   358: dstore #22
    //   360: iload #25
    //   362: istore #24
    //   364: iinc #25, 1
    //   367: aload #10
    //   369: ifnull -> 243
    //   372: dload #22
    //   374: lload_3
    //   375: lconst_0
    //   376: lcmp
    //   377: ifle -> 282
    //   380: dload #20
    //   382: ddiv
    //   383: dstore #25
    //   385: new aacinternal/e
    //   388: dup
    //   389: iload #15
    //   391: i2d
    //   392: ldc2_w 2.0
    //   395: dsub
    //   396: iload #5
    //   398: i2c
    //   399: dup_x2
    //   400: pop
    //   401: iload #6
    //   403: i2s
    //   404: iload #7
    //   406: invokespecial <init> : (CDSI)V
    //   409: astore #27
    //   411: aload #27
    //   413: dload_1
    //   414: iconst_2
    //   415: iload #15
    //   417: imul
    //   418: i2d
    //   419: ddiv
    //   420: lload #8
    //   422: ldc2_w 8498601142579708968
    //   425: lload_3
    //   426: <illegal opcode> b : (Laacinternal/d;DJJJ)D
    //   431: dstore #28
    //   433: dload #28
    //   435: dload #28
    //   437: dmul
    //   438: dstore #30
    //   440: iload #15
    //   442: iconst_1
    //   443: isub
    //   444: i2d
    //   445: iload #15
    //   447: i2d
    //   448: ldc2_w 8400326036081982441
    //   451: lload_3
    //   452: <illegal opcode> w : (DJJ)D
    //   457: ddiv
    //   458: dload #30
    //   460: iload #15
    //   462: iconst_2
    //   463: isub
    //   464: i2d
    //   465: dload #30
    //   467: dadd
    //   468: ddiv
    //   469: ldc2_w 8400326036081982441
    //   472: lload_3
    //   473: <illegal opcode> w : (DJJ)D
    //   478: dmul
    //   479: dstore #32
    //   481: dload #25
    //   483: dload #32
    //   485: dcmpl
    //   486: aload #10
    //   488: ifnonnull -> 533
    //   491: ifle -> 532
    //   494: goto -> 507
    //   497: ldc2_w 8411077635828765383
    //   500: lload_3
    //   501: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   506: athrow
    //   507: aload_0
    //   508: iload #24
    //   510: ldc2_w 8407720329336837735
    //   513: lload_3
    //   514: <illegal opcode> b : (Ljava/util/List;IJJ)Ljava/lang/Object;
    //   519: pop
    //   520: iconst_1
    //   521: ireturn
    //   522: ldc2_w 8411077635828765383
    //   525: lload_3
    //   526: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   531: athrow
    //   532: iconst_0
    //   533: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #19	-> 57
    //   #18	-> 62
    //   #26	-> 65
    //   #22	-> 77
    //   #11	-> 117
    //   #32	-> 160
    //   #31	-> 167
    //   #2	-> 188
    //   #3	-> 193
    //   #24	-> 207
    //   #16	-> 221
    //   #23	-> 234
    //   #33	-> 237
    //   #14	-> 240
    //   #10	-> 258
    //   #25	-> 284
    //   #17	-> 300
    //   #9	-> 356
    //   #7	-> 360
    //   #12	-> 364
    //   #5	-> 372
    //   #6	-> 385
    //   #15	-> 411
    //   #30	-> 433
    //   #20	-> 440
    //   #1	-> 481
    //   #29	-> 507
    //   #8	-> 520
    //   #21	-> 532
    // Exception table:
    //   from	to	target	type
    //   77	89	92	aacinternal/v
    //   84	103	106	aacinternal/v
    //   300	326	329	aacinternal/v
    //   311	343	346	aacinternal/v
    //   481	494	497	aacinternal/v
    //   491	522	522	aacinternal/v
  }
  
  public static int a(List paramList, double paramDouble, long paramLong) {
    // Byte code:
    //   0: getstatic me/konsolas/aac/hk.a : J
    //   3: lload_3
    //   4: lxor
    //   5: lstore_3
    //   6: lload_3
    //   7: dup2
    //   8: ldc2_w 86390246319889
    //   11: lxor
    //   12: lstore #5
    //   14: pop2
    //   15: ldc2_w -8697916091055205553
    //   18: lload_3
    //   19: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
    //   24: iconst_0
    //   25: istore #8
    //   27: astore #7
    //   29: aload_0
    //   30: dload_1
    //   31: lload #5
    //   33: ldc2_w -8730587758655419218
    //   36: lload_3
    //   37: <illegal opcode> w : (Ljava/util/List;DJJJ)Z
    //   42: ifeq -> 53
    //   45: iinc #8, 1
    //   48: aload #7
    //   50: ifnull -> 29
    //   53: lload_3
    //   54: lconst_0
    //   55: lcmp
    //   56: iflt -> 48
    //   59: iload #8
    //   61: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #28	-> 24
    //   #27	-> 29
    //   #4	-> 53
  }
}


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\hk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */