/*    */ package aacinternal;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.lang.invoke.MethodHandles;
/*    */ import me.konsolas.aac.nc;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class af
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 20140713L;
/*    */   private static final int b = 15;
/*    */   private final l a;
/*    */   private static final long c = nc.a(-7962910822973165252L, -8861309137233904636L, MethodHandles.lookup().lookupClass()).a(52413245213556L);
/*    */   
/*    */   private int a(double[] paramArrayOfdouble, int paramInt1, long paramLong, int paramInt2, int paramInt3) {
/*    */     // Byte code:
/*    */     //   0: getstatic aacinternal/af.c : J
/*    */     //   3: lload_3
/*    */     //   4: lxor
/*    */     //   5: lstore_3
/*    */     //   6: ldc2_w 507184269573443221
/*    */     //   9: lload_3
/*    */     //   10: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*    */     //   15: aload_1
/*    */     //   16: iload #6
/*    */     //   18: daload
/*    */     //   19: dstore #8
/*    */     //   21: astore #7
/*    */     //   23: aload_1
/*    */     //   24: iload #6
/*    */     //   26: aload_1
/*    */     //   27: iload_2
/*    */     //   28: daload
/*    */     //   29: dastore
/*    */     //   30: iload_2
/*    */     //   31: iconst_1
/*    */     //   32: iadd
/*    */     //   33: istore #10
/*    */     //   35: iload #5
/*    */     //   37: iconst_1
/*    */     //   38: isub
/*    */     //   39: istore #11
/*    */     //   41: iload #10
/*    */     //   43: iload #11
/*    */     //   45: if_icmpge -> 298
/*    */     //   48: iload #10
/*    */     //   50: iload #11
/*    */     //   52: aload #7
/*    */     //   54: ifnonnull -> 332
/*    */     //   57: if_icmpge -> 154
/*    */     //   60: aload_1
/*    */     //   61: iload #11
/*    */     //   63: daload
/*    */     //   64: dload #8
/*    */     //   66: invokestatic compare : (DD)I
/*    */     //   69: aload #7
/*    */     //   71: ifnonnull -> 156
/*    */     //   74: goto -> 87
/*    */     //   77: ldc2_w 446857069623577605
/*    */     //   80: lload_3
/*    */     //   81: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   86: athrow
/*    */     //   87: lload_3
/*    */     //   88: lconst_0
/*    */     //   89: lcmp
/*    */     //   90: ifle -> 156
/*    */     //   93: aload #7
/*    */     //   95: ifnonnull -> 156
/*    */     //   98: goto -> 111
/*    */     //   101: ldc2_w 446857069623577605
/*    */     //   104: lload_3
/*    */     //   105: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   110: athrow
/*    */     //   111: ifle -> 154
/*    */     //   114: goto -> 127
/*    */     //   117: ldc2_w 446857069623577605
/*    */     //   120: lload_3
/*    */     //   121: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   126: athrow
/*    */     //   127: iinc #11, -1
/*    */     //   130: aload #7
/*    */     //   132: ifnull -> 48
/*    */     //   135: lload_3
/*    */     //   136: lconst_0
/*    */     //   137: lcmp
/*    */     //   138: iflt -> 154
/*    */     //   141: goto -> 154
/*    */     //   144: ldc2_w 446857069623577605
/*    */     //   147: lload_3
/*    */     //   148: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   153: athrow
/*    */     //   154: iload #10
/*    */     //   156: lload_3
/*    */     //   157: lconst_0
/*    */     //   158: lcmp
/*    */     //   159: iflt -> 176
/*    */     //   162: iload #11
/*    */     //   164: if_icmpge -> 255
/*    */     //   167: aload_1
/*    */     //   168: iload #10
/*    */     //   170: daload
/*    */     //   171: dload #8
/*    */     //   173: invokestatic compare : (DD)I
/*    */     //   176: aload #7
/*    */     //   178: ifnonnull -> 257
/*    */     //   181: goto -> 194
/*    */     //   184: ldc2_w 446857069623577605
/*    */     //   187: lload_3
/*    */     //   188: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   193: athrow
/*    */     //   194: aload #7
/*    */     //   196: ifnonnull -> 257
/*    */     //   199: goto -> 212
/*    */     //   202: ldc2_w 446857069623577605
/*    */     //   205: lload_3
/*    */     //   206: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   211: athrow
/*    */     //   212: ifge -> 255
/*    */     //   215: goto -> 228
/*    */     //   218: ldc2_w 446857069623577605
/*    */     //   221: lload_3
/*    */     //   222: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   227: athrow
/*    */     //   228: iinc #10, 1
/*    */     //   231: aload #7
/*    */     //   233: ifnull -> 154
/*    */     //   236: lload_3
/*    */     //   237: lconst_0
/*    */     //   238: lcmp
/*    */     //   239: ifle -> 255
/*    */     //   242: goto -> 255
/*    */     //   245: ldc2_w 446857069623577605
/*    */     //   248: lload_3
/*    */     //   249: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   254: athrow
/*    */     //   255: iload #10
/*    */     //   257: iload #11
/*    */     //   259: aload #7
/*    */     //   261: ifnonnull -> 45
/*    */     //   264: if_icmpge -> 41
/*    */     //   267: aload_1
/*    */     //   268: iload #10
/*    */     //   270: daload
/*    */     //   271: dstore #12
/*    */     //   273: aload_1
/*    */     //   274: iload #10
/*    */     //   276: iinc #10, 1
/*    */     //   279: aload_1
/*    */     //   280: iload #11
/*    */     //   282: daload
/*    */     //   283: dastore
/*    */     //   284: aload_1
/*    */     //   285: iload #11
/*    */     //   287: iinc #11, -1
/*    */     //   290: dload #12
/*    */     //   292: dastore
/*    */     //   293: aload #7
/*    */     //   295: ifnull -> 41
/*    */     //   298: iload #10
/*    */     //   300: aload #7
/*    */     //   302: lload_3
/*    */     //   303: lconst_0
/*    */     //   304: lcmp
/*    */     //   305: ifle -> 359
/*    */     //   308: lload_3
/*    */     //   309: lconst_0
/*    */     //   310: lcmp
/*    */     //   311: ifle -> 359
/*    */     //   314: ifnonnull -> 357
/*    */     //   317: iload #5
/*    */     //   319: goto -> 332
/*    */     //   322: ldc2_w 446857069623577605
/*    */     //   325: lload_3
/*    */     //   326: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   331: athrow
/*    */     //   332: if_icmpge -> 378
/*    */     //   335: aload_1
/*    */     //   336: iload #10
/*    */     //   338: daload
/*    */     //   339: dload #8
/*    */     //   341: invokestatic compare : (DD)I
/*    */     //   344: goto -> 357
/*    */     //   347: ldc2_w 446857069623577605
/*    */     //   350: lload_3
/*    */     //   351: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   356: athrow
/*    */     //   357: aload #7
/*    */     //   359: ifnonnull -> 396
/*    */     //   362: ifle -> 381
/*    */     //   365: goto -> 378
/*    */     //   368: ldc2_w 446857069623577605
/*    */     //   371: lload_3
/*    */     //   372: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   377: athrow
/*    */     //   378: iinc #10, -1
/*    */     //   381: aload_1
/*    */     //   382: iload_2
/*    */     //   383: aload_1
/*    */     //   384: iload #10
/*    */     //   386: daload
/*    */     //   387: dastore
/*    */     //   388: aload_1
/*    */     //   389: iload #10
/*    */     //   391: dload #8
/*    */     //   393: dastore
/*    */     //   394: iload #10
/*    */     //   396: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #14	-> 15
/*    */     //   #25	-> 23
/*    */     //   #34	-> 30
/*    */     //   #2	-> 35
/*    */     //   #47	-> 41
/*    */     //   #44	-> 48
/*    */     //   #29	-> 127
/*    */     //   #8	-> 154
/*    */     //   #11	-> 228
/*    */     //   #26	-> 255
/*    */     //   #22	-> 267
/*    */     //   #13	-> 273
/*    */     //   #3	-> 284
/*    */     //   #12	-> 293
/*    */     //   #28	-> 298
/*    */     //   #38	-> 378
/*    */     //   #40	-> 381
/*    */     //   #32	-> 388
/*    */     //   #36	-> 394
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   57	74	77	aacinternal/g
/*    */     //   60	98	101	aacinternal/g
/*    */     //   87	114	117	aacinternal/g
/*    */     //   111	135	144	aacinternal/g
/*    */     //   156	181	184	aacinternal/g
/*    */     //   167	199	202	aacinternal/g
/*    */     //   194	215	218	aacinternal/g
/*    */     //   212	236	245	aacinternal/g
/*    */     //   298	319	322	aacinternal/g
/*    */     //   332	344	347	aacinternal/g
/*    */     //   357	365	368	aacinternal/g
/*    */   }
/*    */   
/*    */   public af() {
/* 41 */     this.a = l.MEDIAN_OF_3;
/*    */   }
/*    */   
/*    */   public l a() {
/*    */     return this.a;
/*    */   }
/*    */   
/*    */   public double a(long paramLong, double[] paramArrayOfdouble, int[] paramArrayOfint, int paramInt) {
/*    */     // Byte code:
/*    */     //   0: getstatic aacinternal/af.c : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: lload_1
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 29045719869384
/*    */     //   11: lxor
/*    */     //   12: lstore #6
/*    */     //   14: dup2
/*    */     //   15: ldc2_w 10702430489237
/*    */     //   18: lxor
/*    */     //   19: lstore #8
/*    */     //   21: dup2
/*    */     //   22: ldc2_w 75251650251736
/*    */     //   25: lxor
/*    */     //   26: lstore #10
/*    */     //   28: pop2
/*    */     //   29: ldc2_w 8673582481454281154
/*    */     //   32: lload_1
/*    */     //   33: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*    */     //   38: iconst_0
/*    */     //   39: istore #13
/*    */     //   41: aload_3
/*    */     //   42: arraylength
/*    */     //   43: istore #14
/*    */     //   45: astore #12
/*    */     //   47: iconst_0
/*    */     //   48: istore #15
/*    */     //   50: aload #4
/*    */     //   52: ifnull -> 69
/*    */     //   55: iconst_1
/*    */     //   56: goto -> 70
/*    */     //   59: ldc2_w 8747307739517842258
/*    */     //   62: lload_1
/*    */     //   63: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   68: athrow
/*    */     //   69: iconst_0
/*    */     //   70: istore #16
/*    */     //   72: iload #14
/*    */     //   74: iload #13
/*    */     //   76: isub
/*    */     //   77: bipush #15
/*    */     //   79: if_icmple -> 580
/*    */     //   82: aload #12
/*    */     //   84: ifnonnull -> 594
/*    */     //   87: iload #16
/*    */     //   89: aload #12
/*    */     //   91: ifnonnull -> 269
/*    */     //   94: goto -> 107
/*    */     //   97: ldc2_w 8747307739517842258
/*    */     //   100: lload_1
/*    */     //   101: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   106: athrow
/*    */     //   107: lload_1
/*    */     //   108: lconst_0
/*    */     //   109: lcmp
/*    */     //   110: ifle -> 256
/*    */     //   113: ifeq -> 231
/*    */     //   116: goto -> 129
/*    */     //   119: ldc2_w 8747307739517842258
/*    */     //   122: lload_1
/*    */     //   123: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   128: athrow
/*    */     //   129: iload #15
/*    */     //   131: aload #12
/*    */     //   133: ifnonnull -> 269
/*    */     //   136: goto -> 149
/*    */     //   139: ldc2_w 8747307739517842258
/*    */     //   142: lload_1
/*    */     //   143: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   148: athrow
/*    */     //   149: lload_1
/*    */     //   150: lconst_0
/*    */     //   151: lcmp
/*    */     //   152: ifle -> 256
/*    */     //   155: aload #4
/*    */     //   157: arraylength
/*    */     //   158: if_icmpge -> 231
/*    */     //   161: goto -> 174
/*    */     //   164: ldc2_w 8747307739517842258
/*    */     //   167: lload_1
/*    */     //   168: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   173: athrow
/*    */     //   174: aload #4
/*    */     //   176: iload #15
/*    */     //   178: iaload
/*    */     //   179: aload #12
/*    */     //   181: ifnonnull -> 269
/*    */     //   184: goto -> 197
/*    */     //   187: ldc2_w 8747307739517842258
/*    */     //   190: lload_1
/*    */     //   191: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   196: athrow
/*    */     //   197: iflt -> 231
/*    */     //   200: goto -> 213
/*    */     //   203: ldc2_w 8747307739517842258
/*    */     //   206: lload_1
/*    */     //   207: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   212: athrow
/*    */     //   213: aload #4
/*    */     //   215: iload #15
/*    */     //   217: iaload
/*    */     //   218: lload_1
/*    */     //   219: lconst_0
/*    */     //   220: lcmp
/*    */     //   221: ifle -> 256
/*    */     //   224: istore #17
/*    */     //   226: aload #12
/*    */     //   228: ifnull -> 359
/*    */     //   231: aload_0
/*    */     //   232: aload_3
/*    */     //   233: iload #13
/*    */     //   235: lload #6
/*    */     //   237: iload #14
/*    */     //   239: aload_0
/*    */     //   240: getfield a : Laacinternal/l;
/*    */     //   243: aload_3
/*    */     //   244: iload #13
/*    */     //   246: lload #8
/*    */     //   248: iload #14
/*    */     //   250: invokevirtual a : ([DIJI)I
/*    */     //   253: invokespecial a : ([DIJII)I
/*    */     //   256: goto -> 269
/*    */     //   259: ldc2_w 8747307739517842258
/*    */     //   262: lload_1
/*    */     //   263: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   268: athrow
/*    */     //   269: istore #17
/*    */     //   271: iload #16
/*    */     //   273: aload #12
/*    */     //   275: ifnonnull -> 361
/*    */     //   278: ifeq -> 359
/*    */     //   281: goto -> 294
/*    */     //   284: ldc2_w 8747307739517842258
/*    */     //   287: lload_1
/*    */     //   288: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   293: athrow
/*    */     //   294: iload #15
/*    */     //   296: aload #4
/*    */     //   298: arraylength
/*    */     //   299: aload #12
/*    */     //   301: lload_1
/*    */     //   302: lconst_0
/*    */     //   303: lcmp
/*    */     //   304: iflt -> 365
/*    */     //   307: ifnonnull -> 363
/*    */     //   310: goto -> 323
/*    */     //   313: ldc2_w 8747307739517842258
/*    */     //   316: lload_1
/*    */     //   317: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   322: athrow
/*    */     //   323: if_icmpge -> 359
/*    */     //   326: goto -> 339
/*    */     //   329: ldc2_w 8747307739517842258
/*    */     //   332: lload_1
/*    */     //   333: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   338: athrow
/*    */     //   339: aload #4
/*    */     //   341: iload #15
/*    */     //   343: iload #17
/*    */     //   345: iastore
/*    */     //   346: goto -> 359
/*    */     //   349: ldc2_w 8747307739517842258
/*    */     //   352: lload_1
/*    */     //   353: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   358: athrow
/*    */     //   359: iload #5
/*    */     //   361: iload #17
/*    */     //   363: aload #12
/*    */     //   365: lload_1
/*    */     //   366: lconst_0
/*    */     //   367: lcmp
/*    */     //   368: ifle -> 411
/*    */     //   371: ifnonnull -> 409
/*    */     //   374: if_icmpne -> 405
/*    */     //   377: goto -> 390
/*    */     //   380: ldc2_w 8747307739517842258
/*    */     //   383: lload_1
/*    */     //   384: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   389: athrow
/*    */     //   390: aload_3
/*    */     //   391: iload #5
/*    */     //   393: daload
/*    */     //   394: dreturn
/*    */     //   395: ldc2_w 8747307739517842258
/*    */     //   398: lload_1
/*    */     //   399: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   404: athrow
/*    */     //   405: iload #5
/*    */     //   407: iload #17
/*    */     //   409: aload #12
/*    */     //   411: lload_1
/*    */     //   412: lconst_0
/*    */     //   413: lcmp
/*    */     //   414: iflt -> 526
/*    */     //   417: ifnonnull -> 524
/*    */     //   420: if_icmpge -> 510
/*    */     //   423: goto -> 436
/*    */     //   426: ldc2_w 8747307739517842258
/*    */     //   429: lload_1
/*    */     //   430: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   435: athrow
/*    */     //   436: iload #17
/*    */     //   438: istore #14
/*    */     //   440: iconst_2
/*    */     //   441: iload #15
/*    */     //   443: imul
/*    */     //   444: iconst_1
/*    */     //   445: iadd
/*    */     //   446: iload #16
/*    */     //   448: aload #12
/*    */     //   450: ifnonnull -> 485
/*    */     //   453: ifeq -> 488
/*    */     //   456: goto -> 469
/*    */     //   459: ldc2_w 8747307739517842258
/*    */     //   462: lload_1
/*    */     //   463: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   468: athrow
/*    */     //   469: aload #4
/*    */     //   471: arraylength
/*    */     //   472: goto -> 485
/*    */     //   475: ldc2_w 8747307739517842258
/*    */     //   478: lload_1
/*    */     //   479: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   484: athrow
/*    */     //   485: goto -> 490
/*    */     //   488: iload #14
/*    */     //   490: lload #10
/*    */     //   492: dup2_x2
/*    */     //   493: pop2
/*    */     //   494: invokestatic f : (JII)I
/*    */     //   497: istore #15
/*    */     //   499: aload #12
/*    */     //   501: lload_1
/*    */     //   502: lconst_0
/*    */     //   503: lcmp
/*    */     //   504: ifle -> 577
/*    */     //   507: ifnull -> 575
/*    */     //   510: iload #17
/*    */     //   512: iconst_1
/*    */     //   513: iadd
/*    */     //   514: istore #13
/*    */     //   516: iconst_2
/*    */     //   517: iload #15
/*    */     //   519: imul
/*    */     //   520: iconst_2
/*    */     //   521: iadd
/*    */     //   522: iload #16
/*    */     //   524: aload #12
/*    */     //   526: ifnonnull -> 561
/*    */     //   529: ifeq -> 564
/*    */     //   532: goto -> 545
/*    */     //   535: ldc2_w 8747307739517842258
/*    */     //   538: lload_1
/*    */     //   539: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   544: athrow
/*    */     //   545: aload #4
/*    */     //   547: arraylength
/*    */     //   548: goto -> 561
/*    */     //   551: ldc2_w 8747307739517842258
/*    */     //   554: lload_1
/*    */     //   555: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   560: athrow
/*    */     //   561: goto -> 566
/*    */     //   564: iload #14
/*    */     //   566: lload #10
/*    */     //   568: dup2_x2
/*    */     //   569: pop2
/*    */     //   570: invokestatic f : (JII)I
/*    */     //   573: istore #15
/*    */     //   575: aload #12
/*    */     //   577: ifnull -> 72
/*    */     //   580: aload_3
/*    */     //   581: iload #13
/*    */     //   583: iload #14
/*    */     //   585: invokestatic sort : ([DII)V
/*    */     //   588: lload_1
/*    */     //   589: lconst_0
/*    */     //   590: lcmp
/*    */     //   591: ifle -> 82
/*    */     //   594: aload_3
/*    */     //   595: iload #5
/*    */     //   597: daload
/*    */     //   598: dreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #30	-> 38
/*    */     //   #45	-> 41
/*    */     //   #31	-> 47
/*    */     //   #5	-> 50
/*    */     //   #1	-> 72
/*    */     //   #42	-> 82
/*    */     //   #20	-> 213
/*    */     //   #9	-> 231
/*    */     //   #4	-> 271
/*    */     //   #21	-> 339
/*    */     //   #46	-> 359
/*    */     //   #18	-> 390
/*    */     //   #7	-> 405
/*    */     //   #6	-> 436
/*    */     //   #33	-> 440
/*    */     //   #35	-> 510
/*    */     //   #37	-> 516
/*    */     //   #19	-> 575
/*    */     //   #23	-> 580
/*    */     //   #16	-> 594
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   50	59	59	aacinternal/g
/*    */     //   82	94	97	aacinternal/g
/*    */     //   87	116	119	aacinternal/g
/*    */     //   107	136	139	aacinternal/g
/*    */     //   129	161	164	aacinternal/g
/*    */     //   149	184	187	aacinternal/g
/*    */     //   174	200	203	aacinternal/g
/*    */     //   226	256	259	aacinternal/g
/*    */     //   271	281	284	aacinternal/g
/*    */     //   278	310	313	aacinternal/g
/*    */     //   294	326	329	aacinternal/g
/*    */     //   323	346	349	aacinternal/g
/*    */     //   363	377	380	aacinternal/g
/*    */     //   374	395	395	aacinternal/g
/*    */     //   409	423	426	aacinternal/g
/*    */     //   440	456	459	aacinternal/g
/*    */     //   453	472	475	aacinternal/g
/*    */     //   524	532	535	aacinternal/g
/*    */     //   529	548	551	aacinternal/g
/*    */   }
/*    */   
/*    */   public af(l paraml, long paramLong) {
/*    */     az.a(l1, paraml);
/*    */     this.a = paraml;
/*    */   }
/*    */   
/*    */   private static g a(g paramg) {
/*    */     return paramg;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\af.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */