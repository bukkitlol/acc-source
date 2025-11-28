/*    */ package me.konsolas.aac;public class fo implements Iterator { public Object next() {
/*  2 */     long l1 = d ^ 0x789AD8CFC8A7L, l2 = l1 ^ 0x41775A28D87DL; return a(l2);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private static final float[][] a;
/*    */ 
/*    */   
/*    */   private int b;
/*    */ 
/*    */   
/*    */   private final List c;
/*    */ 
/*    */ 
/*    */   
/*    */   private void a(float[] paramArrayOffloat, Boolean paramBoolean1, Boolean paramBoolean2, Boolean paramBoolean3, long paramLong, Boolean paramBoolean4, int paramInt, float paramFloat1, float paramFloat2, boolean paramBoolean5, byte paramByte, boolean paramBoolean6, boolean paramBoolean7, boolean paramBoolean8) {
/*    */     // Byte code:
/*    */     //   0: lload #5
/*    */     //   2: bipush #8
/*    */     //   4: lshl
/*    */     //   5: iload #12
/*    */     //   7: i2l
/*    */     //   8: bipush #56
/*    */     //   10: lshl
/*    */     //   11: bipush #56
/*    */     //   13: lushr
/*    */     //   14: lor
/*    */     //   15: getstatic me/konsolas/aac/fo.d : J
/*    */     //   18: lxor
/*    */     //   19: lstore #16
/*    */     //   21: lload #16
/*    */     //   23: dup2
/*    */     //   24: ldc2_w 87031010112292
/*    */     //   27: lxor
/*    */     //   28: lstore #18
/*    */     //   30: pop2
/*    */     //   31: ldc2_w -4275229715881267041
/*    */     //   34: lload #16
/*    */     //   36: <illegal opcode> w : (JJ)I
/*    */     //   41: istore #28
/*    */     //   43: iload #15
/*    */     //   45: iload #28
/*    */     //   47: ifeq -> 363
/*    */     //   50: ifeq -> 340
/*    */     //   53: goto -> 67
/*    */     //   56: ldc2_w -4227193952329921981
/*    */     //   59: lload #16
/*    */     //   61: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   66: athrow
/*    */     //   67: iload #11
/*    */     //   69: iload #28
/*    */     //   71: ifeq -> 363
/*    */     //   74: goto -> 88
/*    */     //   77: ldc2_w -4227193952329921981
/*    */     //   80: lload #16
/*    */     //   82: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   87: athrow
/*    */     //   88: ifeq -> 340
/*    */     //   91: goto -> 105
/*    */     //   94: ldc2_w -4227193952329921981
/*    */     //   97: lload #16
/*    */     //   99: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   104: athrow
/*    */     //   105: aload_1
/*    */     //   106: iconst_0
/*    */     //   107: faload
/*    */     //   108: fconst_0
/*    */     //   109: fcmpl
/*    */     //   110: iload #28
/*    */     //   112: lload #5
/*    */     //   114: lconst_0
/*    */     //   115: lcmp
/*    */     //   116: iflt -> 278
/*    */     //   119: ifeq -> 276
/*    */     //   122: goto -> 136
/*    */     //   125: ldc2_w -4227193952329921981
/*    */     //   128: lload #16
/*    */     //   130: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   135: athrow
/*    */     //   136: lload #5
/*    */     //   138: lconst_0
/*    */     //   139: lcmp
/*    */     //   140: iflt -> 262
/*    */     //   143: ifgt -> 239
/*    */     //   146: goto -> 160
/*    */     //   149: ldc2_w -4227193952329921981
/*    */     //   152: lload #16
/*    */     //   154: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   159: athrow
/*    */     //   160: iload #14
/*    */     //   162: iload #28
/*    */     //   164: ifeq -> 363
/*    */     //   167: goto -> 181
/*    */     //   170: ldc2_w -4227193952329921981
/*    */     //   173: lload #16
/*    */     //   175: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   180: athrow
/*    */     //   181: ifeq -> 340
/*    */     //   184: goto -> 198
/*    */     //   187: ldc2_w -4227193952329921981
/*    */     //   190: lload #16
/*    */     //   192: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   197: athrow
/*    */     //   198: aload_1
/*    */     //   199: iconst_0
/*    */     //   200: faload
/*    */     //   201: fconst_0
/*    */     //   202: fcmpl
/*    */     //   203: iload #28
/*    */     //   205: ifeq -> 363
/*    */     //   208: goto -> 222
/*    */     //   211: ldc2_w -4227193952329921981
/*    */     //   214: lload #16
/*    */     //   216: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   221: athrow
/*    */     //   222: iflt -> 340
/*    */     //   225: goto -> 239
/*    */     //   228: ldc2_w -4227193952329921981
/*    */     //   231: lload #16
/*    */     //   233: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   238: athrow
/*    */     //   239: aload_0
/*    */     //   240: aload_1
/*    */     //   241: iconst_1
/*    */     //   242: lload #18
/*    */     //   244: iconst_0
/*    */     //   245: aload_2
/*    */     //   246: aload_3
/*    */     //   247: aload #4
/*    */     //   249: aload #7
/*    */     //   251: fload #9
/*    */     //   253: fload #10
/*    */     //   255: iload #8
/*    */     //   257: invokespecial a : ([FZJZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;FFI)V
/*    */     //   260: iload #13
/*    */     //   262: goto -> 276
/*    */     //   265: ldc2_w -4227193952329921981
/*    */     //   268: lload #16
/*    */     //   270: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   275: athrow
/*    */     //   276: iload #28
/*    */     //   278: lload #5
/*    */     //   280: lconst_0
/*    */     //   281: lcmp
/*    */     //   282: ifle -> 365
/*    */     //   285: ifeq -> 363
/*    */     //   288: ifeq -> 340
/*    */     //   291: goto -> 305
/*    */     //   294: ldc2_w -4227193952329921981
/*    */     //   297: lload #16
/*    */     //   299: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   304: athrow
/*    */     //   305: aload_0
/*    */     //   306: aload_1
/*    */     //   307: iconst_1
/*    */     //   308: lload #18
/*    */     //   310: iconst_1
/*    */     //   311: aload_2
/*    */     //   312: aload_3
/*    */     //   313: aload #4
/*    */     //   315: aload #7
/*    */     //   317: fload #9
/*    */     //   319: fload #10
/*    */     //   321: iload #8
/*    */     //   323: invokespecial a : ([FZJZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;FFI)V
/*    */     //   326: goto -> 340
/*    */     //   329: ldc2_w -4227193952329921981
/*    */     //   332: lload #16
/*    */     //   334: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   339: athrow
/*    */     //   340: aload_0
/*    */     //   341: aload_1
/*    */     //   342: iconst_0
/*    */     //   343: lload #18
/*    */     //   345: iconst_0
/*    */     //   346: aload_2
/*    */     //   347: aload_3
/*    */     //   348: aload #4
/*    */     //   350: aload #7
/*    */     //   352: fload #9
/*    */     //   354: fload #10
/*    */     //   356: iload #8
/*    */     //   358: invokespecial a : ([FZJZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;FFI)V
/*    */     //   361: iload #13
/*    */     //   363: iload #28
/*    */     //   365: iload #12
/*    */     //   367: iflt -> 429
/*    */     //   370: ifeq -> 427
/*    */     //   373: ifeq -> 425
/*    */     //   376: goto -> 390
/*    */     //   379: ldc2_w -4227193952329921981
/*    */     //   382: lload #16
/*    */     //   384: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   389: athrow
/*    */     //   390: aload_0
/*    */     //   391: aload_1
/*    */     //   392: iconst_0
/*    */     //   393: lload #18
/*    */     //   395: iconst_1
/*    */     //   396: aload_2
/*    */     //   397: aload_3
/*    */     //   398: aload #4
/*    */     //   400: aload #7
/*    */     //   402: fload #9
/*    */     //   404: fload #10
/*    */     //   406: iload #8
/*    */     //   408: invokespecial a : ([FZJZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;FFI)V
/*    */     //   411: goto -> 425
/*    */     //   414: ldc2_w -4227193952329921981
/*    */     //   417: lload #16
/*    */     //   419: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   424: athrow
/*    */     //   425: iload #15
/*    */     //   427: iload #28
/*    */     //   429: iload #12
/*    */     //   431: iflt -> 458
/*    */     //   434: ifeq -> 456
/*    */     //   437: ifne -> 763
/*    */     //   440: goto -> 454
/*    */     //   443: ldc2_w -4227193952329921981
/*    */     //   446: lload #16
/*    */     //   448: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   453: athrow
/*    */     //   454: iload #11
/*    */     //   456: iload #28
/*    */     //   458: lload #5
/*    */     //   460: lconst_0
/*    */     //   461: lcmp
/*    */     //   462: iflt -> 506
/*    */     //   465: ifeq -> 504
/*    */     //   468: ifeq -> 763
/*    */     //   471: goto -> 485
/*    */     //   474: ldc2_w -4227193952329921981
/*    */     //   477: lload #16
/*    */     //   479: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   484: athrow
/*    */     //   485: aload_1
/*    */     //   486: iconst_0
/*    */     //   487: faload
/*    */     //   488: fconst_0
/*    */     //   489: fcmpl
/*    */     //   490: goto -> 504
/*    */     //   493: ldc2_w -4227193952329921981
/*    */     //   496: lload #16
/*    */     //   498: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   503: athrow
/*    */     //   504: iload #28
/*    */     //   506: ifeq -> 693
/*    */     //   509: ifgt -> 619
/*    */     //   512: goto -> 526
/*    */     //   515: ldc2_w -4227193952329921981
/*    */     //   518: lload #16
/*    */     //   520: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   525: athrow
/*    */     //   526: iload #14
/*    */     //   528: iload #28
/*    */     //   530: lload #5
/*    */     //   532: lconst_0
/*    */     //   533: lcmp
/*    */     //   534: ifle -> 599
/*    */     //   537: ifeq -> 590
/*    */     //   540: goto -> 554
/*    */     //   543: ldc2_w -4227193952329921981
/*    */     //   546: lload #16
/*    */     //   548: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   553: athrow
/*    */     //   554: ifeq -> 763
/*    */     //   557: goto -> 571
/*    */     //   560: ldc2_w -4227193952329921981
/*    */     //   563: lload #16
/*    */     //   565: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   570: athrow
/*    */     //   571: aload_1
/*    */     //   572: iconst_0
/*    */     //   573: faload
/*    */     //   574: fconst_0
/*    */     //   575: fcmpl
/*    */     //   576: goto -> 590
/*    */     //   579: ldc2_w -4227193952329921981
/*    */     //   582: lload #16
/*    */     //   584: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   589: athrow
/*    */     //   590: lload #5
/*    */     //   592: lconst_0
/*    */     //   593: lcmp
/*    */     //   594: ifle -> 693
/*    */     //   597: iload #28
/*    */     //   599: ifeq -> 693
/*    */     //   602: iflt -> 763
/*    */     //   605: goto -> 619
/*    */     //   608: ldc2_w -4227193952329921981
/*    */     //   611: lload #16
/*    */     //   613: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   618: athrow
/*    */     //   619: aload_0
/*    */     //   620: aload_1
/*    */     //   621: iconst_1
/*    */     //   622: iconst_0
/*    */     //   623: aload_2
/*    */     //   624: aload_3
/*    */     //   625: aload #4
/*    */     //   627: aload #7
/*    */     //   629: fload #9
/*    */     //   631: fload #10
/*    */     //   633: iload #8
/*    */     //   635: iload #28
/*    */     //   637: ifeq -> 726
/*    */     //   640: goto -> 654
/*    */     //   643: ldc2_w -4227193952329921981
/*    */     //   646: lload #16
/*    */     //   648: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   653: athrow
/*    */     //   654: istore #20
/*    */     //   656: fstore #21
/*    */     //   658: fstore #22
/*    */     //   660: astore #23
/*    */     //   662: astore #24
/*    */     //   664: astore #25
/*    */     //   666: astore #26
/*    */     //   668: istore #27
/*    */     //   670: lload #18
/*    */     //   672: iload #27
/*    */     //   674: aload #26
/*    */     //   676: aload #25
/*    */     //   678: aload #24
/*    */     //   680: aload #23
/*    */     //   682: fload #22
/*    */     //   684: fload #21
/*    */     //   686: iload #20
/*    */     //   688: invokespecial a : ([FZJZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;FFI)V
/*    */     //   691: iload #13
/*    */     //   693: ifeq -> 763
/*    */     //   696: aload_0
/*    */     //   697: aload_1
/*    */     //   698: iconst_1
/*    */     //   699: iconst_1
/*    */     //   700: aload_2
/*    */     //   701: aload_3
/*    */     //   702: aload #4
/*    */     //   704: aload #7
/*    */     //   706: fload #9
/*    */     //   708: fload #10
/*    */     //   710: iload #8
/*    */     //   712: goto -> 726
/*    */     //   715: ldc2_w -4227193952329921981
/*    */     //   718: lload #16
/*    */     //   720: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   725: athrow
/*    */     //   726: istore #20
/*    */     //   728: fstore #21
/*    */     //   730: fstore #22
/*    */     //   732: astore #23
/*    */     //   734: astore #24
/*    */     //   736: astore #25
/*    */     //   738: astore #26
/*    */     //   740: istore #27
/*    */     //   742: lload #18
/*    */     //   744: iload #27
/*    */     //   746: aload #26
/*    */     //   748: aload #25
/*    */     //   750: aload #24
/*    */     //   752: aload #23
/*    */     //   754: fload #22
/*    */     //   756: fload #21
/*    */     //   758: iload #20
/*    */     //   760: invokespecial a : ([FZJZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;FFI)V
/*    */     //   763: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #5	-> 43
/*    */     //   #32	-> 105
/*    */     //   #1	-> 239
/*    */     //   #22	-> 260
/*    */     //   #38	-> 305
/*    */     //   #47	-> 340
/*    */     //   #26	-> 361
/*    */     //   #9	-> 390
/*    */     //   #18	-> 425
/*    */     //   #16	-> 485
/*    */     //   #17	-> 619
/*    */     //   #27	-> 691
/*    */     //   #46	-> 696
/*    */     //   #4	-> 763
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   43	53	56	aacinternal/v
/*    */     //   50	74	77	aacinternal/v
/*    */     //   67	91	94	aacinternal/v
/*    */     //   88	122	125	aacinternal/v
/*    */     //   105	146	149	aacinternal/v
/*    */     //   136	167	170	aacinternal/v
/*    */     //   160	184	187	aacinternal/v
/*    */     //   181	208	211	aacinternal/v
/*    */     //   198	225	228	aacinternal/v
/*    */     //   222	262	265	aacinternal/v
/*    */     //   276	291	294	aacinternal/v
/*    */     //   288	326	329	aacinternal/v
/*    */     //   363	376	379	aacinternal/v
/*    */     //   373	411	414	aacinternal/v
/*    */     //   427	440	443	aacinternal/v
/*    */     //   456	471	474	aacinternal/v
/*    */     //   468	490	493	aacinternal/v
/*    */     //   504	512	515	aacinternal/v
/*    */     //   509	540	543	aacinternal/v
/*    */     //   526	557	560	aacinternal/v
/*    */     //   554	576	579	aacinternal/v
/*    */     //   590	605	608	aacinternal/v
/*    */     //   602	640	643	aacinternal/v
/*    */     //   693	712	715	aacinternal/v
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean hasNext() {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/fo.d : J
/*    */     //   3: ldc2_w 16037310426951
/*    */     //   6: lxor
/*    */     //   7: lstore_1
/*    */     //   8: ldc2_w -3102575910892805947
/*    */     //   11: lload_1
/*    */     //   12: <illegal opcode> w : (JJ)I
/*    */     //   17: istore_3
/*    */     //   18: aload_0
/*    */     //   19: getfield b : I
/*    */     //   22: iload_3
/*    */     //   23: ifeq -> 65
/*    */     //   26: aload_0
/*    */     //   27: getfield c : Ljava/util/List;
/*    */     //   30: invokeinterface size : ()I
/*    */     //   35: if_icmpge -> 68
/*    */     //   38: goto -> 51
/*    */     //   41: ldc2_w -3094034637189735911
/*    */     //   44: lload_1
/*    */     //   45: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   50: athrow
/*    */     //   51: iconst_1
/*    */     //   52: goto -> 65
/*    */     //   55: ldc2_w -3094034637189735911
/*    */     //   58: lload_1
/*    */     //   59: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   64: athrow
/*    */     //   65: goto -> 69
/*    */     //   68: iconst_0
/*    */     //   69: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #13	-> 18
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   18	38	41	aacinternal/v
/*    */     //   26	52	55	aacinternal/v
/*    */   }
/*    */ 
/*    */   
/*    */   private void a(float[] paramArrayOffloat, boolean paramBoolean1, long paramLong, boolean paramBoolean2, Boolean paramBoolean3, Boolean paramBoolean4, Boolean paramBoolean5, Boolean paramBoolean6, float paramFloat1, float paramFloat2, int paramInt) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/fo.d : J
/*    */     //   3: lload_3
/*    */     //   4: lxor
/*    */     //   5: lstore_3
/*    */     //   6: ldc2_w -3648704530463030440
/*    */     //   9: lload_3
/*    */     //   10: <illegal opcode> w : (JJ)I
/*    */     //   15: istore #13
/*    */     //   17: aload #6
/*    */     //   19: iload #13
/*    */     //   21: ifne -> 56
/*    */     //   24: ifnonnull -> 54
/*    */     //   27: goto -> 40
/*    */     //   30: ldc2_w -3679543806520261639
/*    */     //   33: lload_3
/*    */     //   34: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   39: athrow
/*    */     //   40: iconst_0
/*    */     //   41: goto -> 59
/*    */     //   44: ldc2_w -3679543806520261639
/*    */     //   47: lload_3
/*    */     //   48: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   53: athrow
/*    */     //   54: aload #6
/*    */     //   56: invokevirtual booleanValue : ()Z
/*    */     //   59: istore #14
/*    */     //   61: aload #7
/*    */     //   63: iload #13
/*    */     //   65: ifne -> 100
/*    */     //   68: ifnonnull -> 98
/*    */     //   71: goto -> 84
/*    */     //   74: ldc2_w -3679543806520261639
/*    */     //   77: lload_3
/*    */     //   78: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   83: athrow
/*    */     //   84: iconst_0
/*    */     //   85: goto -> 103
/*    */     //   88: ldc2_w -3679543806520261639
/*    */     //   91: lload_3
/*    */     //   92: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   97: athrow
/*    */     //   98: aload #7
/*    */     //   100: invokevirtual booleanValue : ()Z
/*    */     //   103: istore #15
/*    */     //   105: aload #8
/*    */     //   107: iload #13
/*    */     //   109: ifne -> 144
/*    */     //   112: ifnonnull -> 142
/*    */     //   115: goto -> 128
/*    */     //   118: ldc2_w -3679543806520261639
/*    */     //   121: lload_3
/*    */     //   122: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   127: athrow
/*    */     //   128: iconst_1
/*    */     //   129: goto -> 147
/*    */     //   132: ldc2_w -3679543806520261639
/*    */     //   135: lload_3
/*    */     //   136: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   141: athrow
/*    */     //   142: aload #8
/*    */     //   144: invokevirtual booleanValue : ()Z
/*    */     //   147: istore #16
/*    */     //   149: aload #9
/*    */     //   151: iload #13
/*    */     //   153: ifne -> 188
/*    */     //   156: ifnonnull -> 186
/*    */     //   159: goto -> 172
/*    */     //   162: ldc2_w -3679543806520261639
/*    */     //   165: lload_3
/*    */     //   166: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   171: athrow
/*    */     //   172: iconst_1
/*    */     //   173: goto -> 191
/*    */     //   176: ldc2_w -3679543806520261639
/*    */     //   179: lload_3
/*    */     //   180: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   185: athrow
/*    */     //   186: aload #9
/*    */     //   188: invokevirtual booleanValue : ()Z
/*    */     //   191: istore #17
/*    */     //   193: aload_0
/*    */     //   194: getfield c : Ljava/util/List;
/*    */     //   197: new me/konsolas/aac/mZ
/*    */     //   200: dup
/*    */     //   201: aload_1
/*    */     //   202: iconst_0
/*    */     //   203: faload
/*    */     //   204: aload_1
/*    */     //   205: iconst_1
/*    */     //   206: faload
/*    */     //   207: iload_2
/*    */     //   208: iload #5
/*    */     //   210: iload #14
/*    */     //   212: iload #15
/*    */     //   214: iload #16
/*    */     //   216: iload #17
/*    */     //   218: fload #10
/*    */     //   220: fload #11
/*    */     //   222: iload #12
/*    */     //   224: invokespecial <init> : (FFZZZZZZFFI)V
/*    */     //   227: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   232: pop
/*    */     //   233: aload #8
/*    */     //   235: iload #13
/*    */     //   237: lload_3
/*    */     //   238: lconst_0
/*    */     //   239: lcmp
/*    */     //   240: ifle -> 318
/*    */     //   243: ifne -> 316
/*    */     //   246: ifnonnull -> 314
/*    */     //   249: goto -> 262
/*    */     //   252: ldc2_w -3679543806520261639
/*    */     //   255: lload_3
/*    */     //   256: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   261: athrow
/*    */     //   262: aload_0
/*    */     //   263: getfield c : Ljava/util/List;
/*    */     //   266: new me/konsolas/aac/mZ
/*    */     //   269: dup
/*    */     //   270: aload_1
/*    */     //   271: iconst_0
/*    */     //   272: faload
/*    */     //   273: aload_1
/*    */     //   274: iconst_1
/*    */     //   275: faload
/*    */     //   276: iload_2
/*    */     //   277: iload #5
/*    */     //   279: iload #14
/*    */     //   281: iload #15
/*    */     //   283: iconst_0
/*    */     //   284: iload #17
/*    */     //   286: fload #10
/*    */     //   288: fload #11
/*    */     //   290: iload #12
/*    */     //   292: invokespecial <init> : (FFZZZZZZFFI)V
/*    */     //   295: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   300: pop
/*    */     //   301: goto -> 314
/*    */     //   304: ldc2_w -3679543806520261639
/*    */     //   307: lload_3
/*    */     //   308: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   313: athrow
/*    */     //   314: aload #9
/*    */     //   316: iload #13
/*    */     //   318: lload_3
/*    */     //   319: lconst_0
/*    */     //   320: lcmp
/*    */     //   321: ifle -> 399
/*    */     //   324: ifne -> 397
/*    */     //   327: ifnonnull -> 395
/*    */     //   330: goto -> 343
/*    */     //   333: ldc2_w -3679543806520261639
/*    */     //   336: lload_3
/*    */     //   337: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   342: athrow
/*    */     //   343: aload_0
/*    */     //   344: getfield c : Ljava/util/List;
/*    */     //   347: new me/konsolas/aac/mZ
/*    */     //   350: dup
/*    */     //   351: aload_1
/*    */     //   352: iconst_0
/*    */     //   353: faload
/*    */     //   354: aload_1
/*    */     //   355: iconst_1
/*    */     //   356: faload
/*    */     //   357: iload_2
/*    */     //   358: iload #5
/*    */     //   360: iload #14
/*    */     //   362: iload #15
/*    */     //   364: iload #16
/*    */     //   366: iconst_0
/*    */     //   367: fload #10
/*    */     //   369: fload #11
/*    */     //   371: iload #12
/*    */     //   373: invokespecial <init> : (FFZZZZZZFFI)V
/*    */     //   376: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   381: pop
/*    */     //   382: goto -> 395
/*    */     //   385: ldc2_w -3679543806520261639
/*    */     //   388: lload_3
/*    */     //   389: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   394: athrow
/*    */     //   395: aload #6
/*    */     //   397: iload #13
/*    */     //   399: lload_3
/*    */     //   400: lconst_0
/*    */     //   401: lcmp
/*    */     //   402: ifle -> 480
/*    */     //   405: ifne -> 478
/*    */     //   408: ifnonnull -> 476
/*    */     //   411: goto -> 424
/*    */     //   414: ldc2_w -3679543806520261639
/*    */     //   417: lload_3
/*    */     //   418: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   423: athrow
/*    */     //   424: aload_0
/*    */     //   425: getfield c : Ljava/util/List;
/*    */     //   428: new me/konsolas/aac/mZ
/*    */     //   431: dup
/*    */     //   432: aload_1
/*    */     //   433: iconst_0
/*    */     //   434: faload
/*    */     //   435: aload_1
/*    */     //   436: iconst_1
/*    */     //   437: faload
/*    */     //   438: iload_2
/*    */     //   439: iload #5
/*    */     //   441: iconst_1
/*    */     //   442: iload #15
/*    */     //   444: iload #16
/*    */     //   446: iload #17
/*    */     //   448: fload #10
/*    */     //   450: fload #11
/*    */     //   452: iload #12
/*    */     //   454: invokespecial <init> : (FFZZZZZZFFI)V
/*    */     //   457: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   462: pop
/*    */     //   463: goto -> 476
/*    */     //   466: ldc2_w -3679543806520261639
/*    */     //   469: lload_3
/*    */     //   470: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   475: athrow
/*    */     //   476: aload #7
/*    */     //   478: iload #13
/*    */     //   480: lload_3
/*    */     //   481: lconst_0
/*    */     //   482: lcmp
/*    */     //   483: ifle -> 567
/*    */     //   486: ifne -> 559
/*    */     //   489: ifnonnull -> 557
/*    */     //   492: goto -> 505
/*    */     //   495: ldc2_w -3679543806520261639
/*    */     //   498: lload_3
/*    */     //   499: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   504: athrow
/*    */     //   505: aload_0
/*    */     //   506: getfield c : Ljava/util/List;
/*    */     //   509: new me/konsolas/aac/mZ
/*    */     //   512: dup
/*    */     //   513: aload_1
/*    */     //   514: iconst_0
/*    */     //   515: faload
/*    */     //   516: aload_1
/*    */     //   517: iconst_1
/*    */     //   518: faload
/*    */     //   519: iload_2
/*    */     //   520: iload #5
/*    */     //   522: iload #14
/*    */     //   524: iconst_1
/*    */     //   525: iload #16
/*    */     //   527: iload #17
/*    */     //   529: fload #10
/*    */     //   531: fload #11
/*    */     //   533: iload #12
/*    */     //   535: invokespecial <init> : (FFZZZZZZFFI)V
/*    */     //   538: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   543: pop
/*    */     //   544: goto -> 557
/*    */     //   547: ldc2_w -3679543806520261639
/*    */     //   550: lload_3
/*    */     //   551: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   556: athrow
/*    */     //   557: aload #6
/*    */     //   559: lload_3
/*    */     //   560: lconst_0
/*    */     //   561: lcmp
/*    */     //   562: iflt -> 588
/*    */     //   565: iload #13
/*    */     //   567: ifne -> 588
/*    */     //   570: ifnonnull -> 642
/*    */     //   573: goto -> 586
/*    */     //   576: ldc2_w -3679543806520261639
/*    */     //   579: lload_3
/*    */     //   580: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   585: athrow
/*    */     //   586: aload #7
/*    */     //   588: ifnonnull -> 642
/*    */     //   591: aload_0
/*    */     //   592: getfield c : Ljava/util/List;
/*    */     //   595: new me/konsolas/aac/mZ
/*    */     //   598: dup
/*    */     //   599: aload_1
/*    */     //   600: iconst_0
/*    */     //   601: faload
/*    */     //   602: aload_1
/*    */     //   603: iconst_1
/*    */     //   604: faload
/*    */     //   605: iload_2
/*    */     //   606: iload #5
/*    */     //   608: iconst_1
/*    */     //   609: iconst_1
/*    */     //   610: iload #16
/*    */     //   612: iload #17
/*    */     //   614: fload #10
/*    */     //   616: fload #11
/*    */     //   618: iload #12
/*    */     //   620: invokespecial <init> : (FFZZZZZZFFI)V
/*    */     //   623: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   628: pop
/*    */     //   629: goto -> 642
/*    */     //   632: ldc2_w -3679543806520261639
/*    */     //   635: lload_3
/*    */     //   636: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   641: athrow
/*    */     //   642: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #24	-> 17
/*    */     //   #11	-> 61
/*    */     //   #39	-> 105
/*    */     //   #12	-> 149
/*    */     //   #34	-> 193
/*    */     //   #35	-> 233
/*    */     //   #15	-> 262
/*    */     //   #19	-> 314
/*    */     //   #23	-> 343
/*    */     //   #20	-> 395
/*    */     //   #30	-> 424
/*    */     //   #45	-> 476
/*    */     //   #28	-> 505
/*    */     //   #6	-> 557
/*    */     //   #43	-> 591
/*    */     //   #33	-> 642
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   17	27	30	aacinternal/v
/*    */     //   24	44	44	aacinternal/v
/*    */     //   61	71	74	aacinternal/v
/*    */     //   68	88	88	aacinternal/v
/*    */     //   105	115	118	aacinternal/v
/*    */     //   112	132	132	aacinternal/v
/*    */     //   149	159	162	aacinternal/v
/*    */     //   156	176	176	aacinternal/v
/*    */     //   193	249	252	aacinternal/v
/*    */     //   246	301	304	aacinternal/v
/*    */     //   316	330	333	aacinternal/v
/*    */     //   327	382	385	aacinternal/v
/*    */     //   397	411	414	aacinternal/v
/*    */     //   408	463	466	aacinternal/v
/*    */     //   478	492	495	aacinternal/v
/*    */     //   489	544	547	aacinternal/v
/*    */     //   559	573	576	aacinternal/v
/*    */     //   588	629	632	aacinternal/v
/*    */   }
/*    */ 
/*    */   
/*    */   public fo(mZ parammZ, float paramFloat1, float paramFloat2, boolean paramBoolean1, int paramInt, boolean paramBoolean2, Boolean paramBoolean3, Boolean paramBoolean4, long paramLong, Boolean paramBoolean5, Boolean paramBoolean6) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/fo.d : J
/*    */     //   3: lload #9
/*    */     //   5: lxor
/*    */     //   6: lstore #9
/*    */     //   8: lload #9
/*    */     //   10: dup2
/*    */     //   11: ldc2_w 89445004798722
/*    */     //   14: lxor
/*    */     //   15: dup2
/*    */     //   16: bipush #8
/*    */     //   18: lushr
/*    */     //   19: lstore #13
/*    */     //   21: dup2
/*    */     //   22: bipush #56
/*    */     //   24: lshl
/*    */     //   25: bipush #56
/*    */     //   27: lushr
/*    */     //   28: l2i
/*    */     //   29: istore #15
/*    */     //   31: pop2
/*    */     //   32: pop2
/*    */     //   33: aload_0
/*    */     //   34: invokespecial <init> : ()V
/*    */     //   37: aload_0
/*    */     //   38: iconst_0
/*    */     //   39: putfield b : I
/*    */     //   42: ldc2_w 1528712999321411843
/*    */     //   45: lload #9
/*    */     //   47: <illegal opcode> w : (JJ)I
/*    */     //   52: aload_0
/*    */     //   53: new java/util/ArrayList
/*    */     //   56: dup
/*    */     //   57: invokespecial <init> : ()V
/*    */     //   60: putfield c : Ljava/util/List;
/*    */     //   63: istore #16
/*    */     //   65: aload_1
/*    */     //   66: invokevirtual c : ()Z
/*    */     //   69: iload #16
/*    */     //   71: ifeq -> 111
/*    */     //   74: ifeq -> 137
/*    */     //   77: goto -> 91
/*    */     //   80: ldc2_w 1497935170279496671
/*    */     //   83: lload #9
/*    */     //   85: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   90: athrow
/*    */     //   91: aload_1
/*    */     //   92: invokevirtual b : ()F
/*    */     //   95: fconst_0
/*    */     //   96: fcmpl
/*    */     //   97: goto -> 111
/*    */     //   100: ldc2_w 1497935170279496671
/*    */     //   103: lload #9
/*    */     //   105: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   110: athrow
/*    */     //   111: iload #16
/*    */     //   113: ifeq -> 134
/*    */     //   116: ifle -> 137
/*    */     //   119: goto -> 133
/*    */     //   122: ldc2_w 1497935170279496671
/*    */     //   125: lload #9
/*    */     //   127: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   132: athrow
/*    */     //   133: iconst_1
/*    */     //   134: goto -> 138
/*    */     //   137: iconst_0
/*    */     //   138: istore #17
/*    */     //   140: iconst_0
/*    */     //   141: istore #18
/*    */     //   143: iload #18
/*    */     //   145: iload #5
/*    */     //   147: if_icmpgt -> 371
/*    */     //   150: aload_0
/*    */     //   151: iconst_2
/*    */     //   152: newarray float
/*    */     //   154: dup
/*    */     //   155: iconst_0
/*    */     //   156: aload_1
/*    */     //   157: invokevirtual b : ()F
/*    */     //   160: fastore
/*    */     //   161: dup
/*    */     //   162: iconst_1
/*    */     //   163: aload_1
/*    */     //   164: invokevirtual c : ()F
/*    */     //   167: fastore
/*    */     //   168: aload #7
/*    */     //   170: aload #8
/*    */     //   172: aload #11
/*    */     //   174: lload #13
/*    */     //   176: aload #12
/*    */     //   178: iload #18
/*    */     //   180: fload_2
/*    */     //   181: fload_3
/*    */     //   182: iload #6
/*    */     //   184: iload #15
/*    */     //   186: i2b
/*    */     //   187: iload #4
/*    */     //   189: iload #17
/*    */     //   191: aload_1
/*    */     //   192: invokevirtual c : ()Z
/*    */     //   195: invokespecial a : ([FLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;JLjava/lang/Boolean;IFFZBZZZ)V
/*    */     //   198: getstatic me/konsolas/aac/fo.a : [[F
/*    */     //   201: astore #19
/*    */     //   203: aload #19
/*    */     //   205: arraylength
/*    */     //   206: istore #20
/*    */     //   208: iconst_0
/*    */     //   209: istore #21
/*    */     //   211: iload #21
/*    */     //   213: iload #20
/*    */     //   215: if_icmpge -> 356
/*    */     //   218: aload #19
/*    */     //   220: iload #21
/*    */     //   222: aaload
/*    */     //   223: astore #22
/*    */     //   225: aload #22
/*    */     //   227: iconst_0
/*    */     //   228: faload
/*    */     //   229: aload_1
/*    */     //   230: invokevirtual b : ()F
/*    */     //   233: fcmpl
/*    */     //   234: iload #16
/*    */     //   236: ifeq -> 145
/*    */     //   239: iload #16
/*    */     //   241: lload #9
/*    */     //   243: lconst_0
/*    */     //   244: lcmp
/*    */     //   245: ifle -> 215
/*    */     //   248: ifeq -> 291
/*    */     //   251: ifne -> 301
/*    */     //   254: goto -> 268
/*    */     //   257: ldc2_w 1497935170279496671
/*    */     //   260: lload #9
/*    */     //   262: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   267: athrow
/*    */     //   268: aload #22
/*    */     //   270: iconst_1
/*    */     //   271: faload
/*    */     //   272: aload_1
/*    */     //   273: invokevirtual c : ()F
/*    */     //   276: fcmpl
/*    */     //   277: goto -> 291
/*    */     //   280: ldc2_w 1497935170279496671
/*    */     //   283: lload #9
/*    */     //   285: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   290: athrow
/*    */     //   291: lload #9
/*    */     //   293: lconst_0
/*    */     //   294: lcmp
/*    */     //   295: ifle -> 353
/*    */     //   298: ifeq -> 348
/*    */     //   301: aload_0
/*    */     //   302: aload #22
/*    */     //   304: aload #7
/*    */     //   306: aload #8
/*    */     //   308: aload #11
/*    */     //   310: lload #13
/*    */     //   312: aload #12
/*    */     //   314: iload #18
/*    */     //   316: fload_2
/*    */     //   317: fload_3
/*    */     //   318: iload #6
/*    */     //   320: iload #15
/*    */     //   322: i2b
/*    */     //   323: iload #4
/*    */     //   325: iload #17
/*    */     //   327: aload_1
/*    */     //   328: invokevirtual b : ()Z
/*    */     //   331: invokespecial a : ([FLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;JLjava/lang/Boolean;IFFZBZZZ)V
/*    */     //   334: goto -> 348
/*    */     //   337: ldc2_w 1497935170279496671
/*    */     //   340: lload #9
/*    */     //   342: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   347: athrow
/*    */     //   348: iinc #21, 1
/*    */     //   351: iload #16
/*    */     //   353: ifne -> 211
/*    */     //   356: iinc #18, 1
/*    */     //   359: iload #16
/*    */     //   361: lload #9
/*    */     //   363: lconst_0
/*    */     //   364: lcmp
/*    */     //   365: iflt -> 145
/*    */     //   368: ifne -> 143
/*    */     //   371: lload #9
/*    */     //   373: lconst_0
/*    */     //   374: lcmp
/*    */     //   375: ifle -> 198
/*    */     //   378: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #36	-> 33
/*    */     //   #25	-> 37
/*    */     //   #7	-> 52
/*    */     //   #21	-> 65
/*    */     //   #31	-> 140
/*    */     //   #10	-> 150
/*    */     //   #14	-> 198
/*    */     //   #42	-> 225
/*    */     //   #41	-> 301
/*    */     //   #44	-> 348
/*    */     //   #29	-> 356
/*    */     //   #3	-> 371
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   65	77	80	aacinternal/v
/*    */     //   74	97	100	aacinternal/v
/*    */     //   111	119	122	aacinternal/v
/*    */     //   239	254	257	aacinternal/v
/*    */     //   251	277	280	aacinternal/v
/*    */     //   291	334	337	aacinternal/v
/*    */   }
/*    */ 
/*    */   
/* 37 */   private static final long d = nc.a(-3158013364218378544L, 7387796068560702870L, MethodHandles.lookup().lookupClass()).a(20412977019956L); static { a = new float[][] { { 1.0F, 0.0F }, { 1.0F, -1.0F }, { 1.0F, 1.0F }, { 0.0F, 1.0F }, { 0.0F, -1.0F }, { -1.0F, 0.0F }, { -1.0F, 1.0F }, { -1.0F, -1.0F }, { 0.0F, 0.0F } }; }
/*    */ 
/*    */   
/*    */   public mZ a(long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/fo.d : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: ldc2_w 1278582818003050427
/*    */     //   9: lload_1
/*    */     //   10: <illegal opcode> w : (JJ)I
/*    */     //   15: istore_3
/*    */     //   16: aload_0
/*    */     //   17: iload_3
/*    */     //   18: ifne -> 81
/*    */     //   21: getfield b : I
/*    */     //   24: aload_0
/*    */     //   25: getfield c : Ljava/util/List;
/*    */     //   28: invokeinterface size : ()I
/*    */     //   33: if_icmplt -> 61
/*    */     //   36: goto -> 49
/*    */     //   39: ldc2_w 1156546203555913498
/*    */     //   42: lload_1
/*    */     //   43: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   48: athrow
/*    */     //   49: aconst_null
/*    */     //   50: areturn
/*    */     //   51: ldc2_w 1156546203555913498
/*    */     //   54: lload_1
/*    */     //   55: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   60: athrow
/*    */     //   61: aload_0
/*    */     //   62: getfield c : Ljava/util/List;
/*    */     //   65: aload_0
/*    */     //   66: dup
/*    */     //   67: getfield b : I
/*    */     //   70: dup_x1
/*    */     //   71: iconst_1
/*    */     //   72: iadd
/*    */     //   73: putfield b : I
/*    */     //   76: invokeinterface get : (I)Ljava/lang/Object;
/*    */     //   81: checkcast me/konsolas/aac/mZ
/*    */     //   84: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #40	-> 16
/*    */     //   #8	-> 61
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   16	36	39	aacinternal/v
/*    */     //   21	51	51	aacinternal/v
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\fo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */