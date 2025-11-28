/*    */ package me.konsolas.aac;
/*    */ import java.lang.invoke.MethodHandles;
/*    */ import java.lang.invoke.MutableCallSite;
/*    */ import javax.crypto.Cipher;
/*    */ import javax.crypto.SecretKeyFactory;
/*    */ import javax.crypto.spec.DESKeySpec;
/*    */ import javax.crypto.spec.IvParameterSpec;
/*    */ 
/*    */ public final class g2 extends gK {
/*    */   public int hashCode() {
/* 11 */     return this.a.hashCode();
/*    */   }
/*    */   
/*    */   private static final int c = 9;
/*    */   private final mV a;
/*    */   private static final long d = nc.a(6302388015957532366L, 1692620501538525602L, MethodHandles.lookup().lookupClass()).a(1955244487210L);
/*    */   private static final String[] f;
/*    */   private static final String[] g;
/*    */   private static final Map h = new HashMap<>(13);
/*    */   
/*    */   public List a(List paramList, String paramString, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: lload_3
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 87573865319414
/*    */     //   5: lxor
/*    */     //   6: lstore #5
/*    */     //   8: dup2
/*    */     //   9: ldc2_w 4678920901799
/*    */     //   12: lxor
/*    */     //   13: dup2
/*    */     //   14: bipush #48
/*    */     //   16: lushr
/*    */     //   17: l2i
/*    */     //   18: istore #7
/*    */     //   20: dup2
/*    */     //   21: bipush #16
/*    */     //   23: lshl
/*    */     //   24: bipush #48
/*    */     //   26: lushr
/*    */     //   27: l2i
/*    */     //   28: istore #8
/*    */     //   30: dup2
/*    */     //   31: bipush #32
/*    */     //   33: lshl
/*    */     //   34: bipush #32
/*    */     //   36: lushr
/*    */     //   37: l2i
/*    */     //   38: istore #9
/*    */     //   40: pop2
/*    */     //   41: pop2
/*    */     //   42: new java/util/ArrayDeque
/*    */     //   45: dup
/*    */     //   46: aload_1
/*    */     //   47: invokespecial <init> : (Ljava/util/Collection;)V
/*    */     //   50: astore #11
/*    */     //   52: ldc2_w 4740053634214277801
/*    */     //   55: lload_3
/*    */     //   56: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*    */     //   61: new java/util/ArrayList
/*    */     //   64: dup
/*    */     //   65: invokespecial <init> : ()V
/*    */     //   68: astore #12
/*    */     //   70: aload #12
/*    */     //   72: aload #11
/*    */     //   74: invokeinterface removeFirst : ()Ljava/lang/Object;
/*    */     //   79: checkcast java/security/cert/Certificate
/*    */     //   82: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   87: pop
/*    */     //   88: iconst_0
/*    */     //   89: istore #13
/*    */     //   91: astore #10
/*    */     //   93: iconst_0
/*    */     //   94: istore #14
/*    */     //   96: iload #14
/*    */     //   98: bipush #9
/*    */     //   100: if_icmpge -> 580
/*    */     //   103: aload #12
/*    */     //   105: aload #12
/*    */     //   107: invokeinterface size : ()I
/*    */     //   112: iconst_1
/*    */     //   113: isub
/*    */     //   114: invokeinterface get : (I)Ljava/lang/Object;
/*    */     //   119: checkcast java/security/cert/X509Certificate
/*    */     //   122: astore #15
/*    */     //   124: aload_0
/*    */     //   125: getfield a : Lme/konsolas/aac/mV;
/*    */     //   128: lload #5
/*    */     //   130: aload #15
/*    */     //   132: invokeinterface a : (JLjava/security/cert/X509Certificate;)Ljava/security/cert/X509Certificate;
/*    */     //   137: astore #16
/*    */     //   139: lload_3
/*    */     //   140: lconst_0
/*    */     //   141: lcmp
/*    */     //   142: ifle -> 150
/*    */     //   145: aload #16
/*    */     //   147: ifnull -> 358
/*    */     //   150: aload #12
/*    */     //   152: invokeinterface size : ()I
/*    */     //   157: aload #10
/*    */     //   159: ifnonnull -> 267
/*    */     //   162: goto -> 175
/*    */     //   165: ldc2_w 4621183086632422425
/*    */     //   168: lload_3
/*    */     //   169: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   174: athrow
/*    */     //   175: lload_3
/*    */     //   176: lconst_0
/*    */     //   177: lcmp
/*    */     //   178: iflt -> 254
/*    */     //   181: iconst_1
/*    */     //   182: if_icmpgt -> 245
/*    */     //   185: goto -> 198
/*    */     //   188: ldc2_w 4621183086632422425
/*    */     //   191: lload_3
/*    */     //   192: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   197: athrow
/*    */     //   198: aload #15
/*    */     //   200: aload #16
/*    */     //   202: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   205: aload #10
/*    */     //   207: lload_3
/*    */     //   208: lconst_0
/*    */     //   209: lcmp
/*    */     //   210: iflt -> 286
/*    */     //   213: ifnonnull -> 284
/*    */     //   216: goto -> 229
/*    */     //   219: ldc2_w 4621183086632422425
/*    */     //   222: lload_3
/*    */     //   223: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   228: athrow
/*    */     //   229: ifne -> 268
/*    */     //   232: goto -> 245
/*    */     //   235: ldc2_w 4621183086632422425
/*    */     //   238: lload_3
/*    */     //   239: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   244: athrow
/*    */     //   245: aload #12
/*    */     //   247: aload #16
/*    */     //   249: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   254: goto -> 267
/*    */     //   257: ldc2_w 4621183086632422425
/*    */     //   260: lload_3
/*    */     //   261: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   266: athrow
/*    */     //   267: pop
/*    */     //   268: aload_0
/*    */     //   269: aload #16
/*    */     //   271: iload #7
/*    */     //   273: i2c
/*    */     //   274: aload #16
/*    */     //   276: iload #8
/*    */     //   278: i2c
/*    */     //   279: iload #9
/*    */     //   281: invokespecial a : (Ljava/security/cert/X509Certificate;CLjava/security/cert/X509Certificate;CI)Z
/*    */     //   284: aload #10
/*    */     //   286: ifnonnull -> 319
/*    */     //   289: ifeq -> 318
/*    */     //   292: goto -> 305
/*    */     //   295: ldc2_w 4621183086632422425
/*    */     //   298: lload_3
/*    */     //   299: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   304: athrow
/*    */     //   305: aload #12
/*    */     //   307: areturn
/*    */     //   308: ldc2_w 4621183086632422425
/*    */     //   311: lload_3
/*    */     //   312: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   317: athrow
/*    */     //   318: iconst_1
/*    */     //   319: istore #13
/*    */     //   321: aload #10
/*    */     //   323: lload_3
/*    */     //   324: lconst_0
/*    */     //   325: lcmp
/*    */     //   326: iflt -> 577
/*    */     //   329: ifnull -> 572
/*    */     //   332: iconst_5
/*    */     //   333: anewarray me/konsolas/aac/aN
/*    */     //   336: ldc2_w 4642081900006513086
/*    */     //   339: lload_3
/*    */     //   340: <illegal opcode> w : ([Lme/konsolas/aac/aN;JJ)V
/*    */     //   345: goto -> 358
/*    */     //   348: ldc2_w 4621183086632422425
/*    */     //   351: lload_3
/*    */     //   352: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   357: athrow
/*    */     //   358: aload #11
/*    */     //   360: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   365: astore #17
/*    */     //   367: aload #17
/*    */     //   369: invokeinterface hasNext : ()Z
/*    */     //   374: ifeq -> 515
/*    */     //   377: aload #17
/*    */     //   379: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   384: checkcast java/security/cert/X509Certificate
/*    */     //   387: astore #18
/*    */     //   389: aload_0
/*    */     //   390: aload #15
/*    */     //   392: iload #7
/*    */     //   394: i2c
/*    */     //   395: aload #18
/*    */     //   397: iload #8
/*    */     //   399: i2c
/*    */     //   400: iload #9
/*    */     //   402: invokespecial a : (Ljava/security/cert/X509Certificate;CLjava/security/cert/X509Certificate;CI)Z
/*    */     //   405: lload_3
/*    */     //   406: lconst_0
/*    */     //   407: lcmp
/*    */     //   408: ifle -> 517
/*    */     //   411: aload #10
/*    */     //   413: ifnonnull -> 517
/*    */     //   416: aload #10
/*    */     //   418: ifnonnull -> 479
/*    */     //   421: goto -> 434
/*    */     //   424: ldc2_w 4621183086632422425
/*    */     //   427: lload_3
/*    */     //   428: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   433: athrow
/*    */     //   434: ifeq -> 491
/*    */     //   437: goto -> 450
/*    */     //   440: ldc2_w 4621183086632422425
/*    */     //   443: lload_3
/*    */     //   444: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   449: athrow
/*    */     //   450: aload #17
/*    */     //   452: invokeinterface remove : ()V
/*    */     //   457: aload #12
/*    */     //   459: aload #18
/*    */     //   461: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   466: goto -> 479
/*    */     //   469: ldc2_w 4621183086632422425
/*    */     //   472: lload_3
/*    */     //   473: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   478: athrow
/*    */     //   479: pop
/*    */     //   480: aload #10
/*    */     //   482: lload_3
/*    */     //   483: lconst_0
/*    */     //   484: lcmp
/*    */     //   485: ifle -> 577
/*    */     //   488: ifnull -> 572
/*    */     //   491: aload #10
/*    */     //   493: ifnull -> 367
/*    */     //   496: lload_3
/*    */     //   497: lconst_0
/*    */     //   498: lcmp
/*    */     //   499: ifle -> 389
/*    */     //   502: goto -> 515
/*    */     //   505: ldc2_w 4621183086632422425
/*    */     //   508: lload_3
/*    */     //   509: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   514: athrow
/*    */     //   515: iload #13
/*    */     //   517: ifeq -> 533
/*    */     //   520: aload #12
/*    */     //   522: areturn
/*    */     //   523: ldc2_w 4621183086632422425
/*    */     //   526: lload_3
/*    */     //   527: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   532: athrow
/*    */     //   533: new javax/net/ssl/SSLPeerUnverifiedException
/*    */     //   536: dup
/*    */     //   537: new java/lang/StringBuilder
/*    */     //   540: dup
/*    */     //   541: invokespecial <init> : ()V
/*    */     //   544: sipush #5494
/*    */     //   547: ldc2_w 1364989988731465031
/*    */     //   550: lload_3
/*    */     //   551: lxor
/*    */     //   552: <illegal opcode> f : (IJ)Ljava/lang/String;
/*    */     //   557: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   560: aload #15
/*    */     //   562: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   565: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   568: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   571: athrow
/*    */     //   572: iinc #14, 1
/*    */     //   575: aload #10
/*    */     //   577: ifnull -> 96
/*    */     //   580: new javax/net/ssl/SSLPeerUnverifiedException
/*    */     //   583: dup
/*    */     //   584: new java/lang/StringBuilder
/*    */     //   587: dup
/*    */     //   588: invokespecial <init> : ()V
/*    */     //   591: sipush #31657
/*    */     //   594: ldc2_w 4200674269003531161
/*    */     //   597: lload_3
/*    */     //   598: lxor
/*    */     //   599: <illegal opcode> f : (IJ)Ljava/lang/String;
/*    */     //   604: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   607: aload #12
/*    */     //   609: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   612: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   615: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   618: lload_3
/*    */     //   619: lconst_0
/*    */     //   620: lcmp
/*    */     //   621: ifle -> 119
/*    */     //   624: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #15	-> 42
/*    */     //   #36	-> 61
/*    */     //   #25	-> 70
/*    */     //   #31	-> 88
/*    */     //   #10	-> 93
/*    */     //   #30	-> 103
/*    */     //   #22	-> 124
/*    */     //   #37	-> 139
/*    */     //   #14	-> 150
/*    */     //   #39	-> 245
/*    */     //   #8	-> 268
/*    */     //   #27	-> 305
/*    */     //   #5	-> 318
/*    */     //   #32	-> 321
/*    */     //   #19	-> 358
/*    */     //   #24	-> 377
/*    */     //   #29	-> 389
/*    */     //   #21	-> 450
/*    */     //   #18	-> 457
/*    */     //   #17	-> 480
/*    */     //   #35	-> 491
/*    */     //   #6	-> 515
/*    */     //   #33	-> 520
/*    */     //   #13	-> 533
/*    */     //   #2	-> 572
/*    */     //   #7	-> 580
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   139	162	165	javax/net/ssl/SSLPeerUnverifiedException
/*    */     //   150	185	188	javax/net/ssl/SSLPeerUnverifiedException
/*    */     //   175	216	219	javax/net/ssl/SSLPeerUnverifiedException
/*    */     //   198	232	235	javax/net/ssl/SSLPeerUnverifiedException
/*    */     //   229	254	257	javax/net/ssl/SSLPeerUnverifiedException
/*    */     //   284	292	295	javax/net/ssl/SSLPeerUnverifiedException
/*    */     //   289	308	308	javax/net/ssl/SSLPeerUnverifiedException
/*    */     //   321	345	348	javax/net/ssl/SSLPeerUnverifiedException
/*    */     //   389	421	424	javax/net/ssl/SSLPeerUnverifiedException
/*    */     //   416	437	440	javax/net/ssl/SSLPeerUnverifiedException
/*    */     //   434	466	469	javax/net/ssl/SSLPeerUnverifiedException
/*    */     //   479	496	505	javax/net/ssl/SSLPeerUnverifiedException
/*    */     //   517	523	523	javax/net/ssl/SSLPeerUnverifiedException
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/g2.d : J
/*    */     //   3: ldc2_w 49721104293104
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: ldc2_w 5109415731089520009
/*    */     //   11: lload_2
/*    */     //   12: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*    */     //   17: astore #4
/*    */     //   19: aload_1
/*    */     //   20: aload #4
/*    */     //   22: ifnonnull -> 55
/*    */     //   25: aload_0
/*    */     //   26: if_acmpne -> 54
/*    */     //   29: goto -> 42
/*    */     //   32: ldc2_w 5116646265190533945
/*    */     //   35: lload_2
/*    */     //   36: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   41: athrow
/*    */     //   42: iconst_1
/*    */     //   43: ireturn
/*    */     //   44: ldc2_w 5116646265190533945
/*    */     //   47: lload_2
/*    */     //   48: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   53: athrow
/*    */     //   54: aload_1
/*    */     //   55: instanceof me/konsolas/aac/g2
/*    */     //   58: aload #4
/*    */     //   60: ifnonnull -> 106
/*    */     //   63: ifeq -> 131
/*    */     //   66: goto -> 79
/*    */     //   69: ldc2_w 5116646265190533945
/*    */     //   72: lload_2
/*    */     //   73: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   78: athrow
/*    */     //   79: aload_1
/*    */     //   80: checkcast me/konsolas/aac/g2
/*    */     //   83: getfield a : Lme/konsolas/aac/mV;
/*    */     //   86: aload_0
/*    */     //   87: getfield a : Lme/konsolas/aac/mV;
/*    */     //   90: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   93: goto -> 106
/*    */     //   96: ldc2_w 5116646265190533945
/*    */     //   99: lload_2
/*    */     //   100: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   105: athrow
/*    */     //   106: aload #4
/*    */     //   108: ifnonnull -> 128
/*    */     //   111: ifeq -> 131
/*    */     //   114: goto -> 127
/*    */     //   117: ldc2_w 5116646265190533945
/*    */     //   120: lload_2
/*    */     //   121: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   126: athrow
/*    */     //   127: iconst_1
/*    */     //   128: goto -> 132
/*    */     //   131: iconst_0
/*    */     //   132: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #16	-> 19
/*    */     //   #9	-> 54
/*    */     //   #3	-> 90
/*    */     //   #23	-> 132
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   19	29	32	aacinternal/v
/*    */     //   25	44	44	aacinternal/v
/*    */     //   55	66	69	aacinternal/v
/*    */     //   63	93	96	aacinternal/v
/*    */     //   106	114	117	aacinternal/v
/*    */   }
/*    */   
/*    */   public g2(mV parammV) {
/*    */     this.a = parammV;
/*    */   }
/*    */   
/*    */   private boolean a(X509Certificate paramX509Certificate1, char paramChar1, X509Certificate paramX509Certificate2, char paramChar2, int paramInt) {
/*    */     // Byte code:
/*    */     //   0: iload_2
/*    */     //   1: i2l
/*    */     //   2: bipush #48
/*    */     //   4: lshl
/*    */     //   5: iload #4
/*    */     //   7: i2l
/*    */     //   8: bipush #48
/*    */     //   10: lshl
/*    */     //   11: bipush #16
/*    */     //   13: lushr
/*    */     //   14: lor
/*    */     //   15: iload #5
/*    */     //   17: i2l
/*    */     //   18: bipush #32
/*    */     //   20: lshl
/*    */     //   21: bipush #32
/*    */     //   23: lushr
/*    */     //   24: lor
/*    */     //   25: getstatic me/konsolas/aac/g2.d : J
/*    */     //   28: lxor
/*    */     //   29: lstore #6
/*    */     //   31: ldc2_w 5729172468084849891
/*    */     //   34: lload #6
/*    */     //   36: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*    */     //   41: astore #8
/*    */     //   43: aload_1
/*    */     //   44: invokevirtual getIssuerDN : ()Ljava/security/Principal;
/*    */     //   47: aload_3
/*    */     //   48: invokevirtual getSubjectDN : ()Ljava/security/Principal;
/*    */     //   51: invokeinterface equals : (Ljava/lang/Object;)Z
/*    */     //   56: aload #8
/*    */     //   58: ifnonnull -> 100
/*    */     //   61: ifne -> 91
/*    */     //   64: goto -> 78
/*    */     //   67: ldc2_w 5650799424902120019
/*    */     //   70: lload #6
/*    */     //   72: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   77: athrow
/*    */     //   78: iconst_0
/*    */     //   79: ireturn
/*    */     //   80: ldc2_w 5650799424902120019
/*    */     //   83: lload #6
/*    */     //   85: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   90: athrow
/*    */     //   91: aload_1
/*    */     //   92: aload_3
/*    */     //   93: invokevirtual getPublicKey : ()Ljava/security/PublicKey;
/*    */     //   96: invokevirtual verify : (Ljava/security/PublicKey;)V
/*    */     //   99: iconst_1
/*    */     //   100: ireturn
/*    */     //   101: astore #9
/*    */     //   103: iconst_0
/*    */     //   104: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #28	-> 43
/*    */     //   #38	-> 91
/*    */     //   #12	-> 99
/*    */     //   #26	-> 101
/*    */     //   #1	-> 103
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   43	64	67	java/security/GeneralSecurityException
/*    */     //   61	80	80	java/security/GeneralSecurityException
/*    */     //   91	100	101	java/security/GeneralSecurityException
/*    */   }
/*    */   
/*    */   static {
/*    */     long l = d ^ 0x39C5111FD9F3L;
/*    */     "?ɴ㶖뽍瓿摤킐⚘꭮ᣄ茇ኍꟌ썘﩯眐Ⓕ⃘︅㟍".toCharArray()[10] = (char)("?ɴ㶖뽍瓿摤킐⚘꭮ᣄ茇ኍꟌ썘﩯眐Ⓕ⃘︅㟍".toCharArray()[10] ^ 0x3C17);
/*    */     "킁Ǧ䨌旙".toCharArray()[0] = (char)("킁Ǧ䨌旙".toCharArray()[0] ^ 0x2099);
/*    */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*    */     for (byte b1 = 1; b1 < 8; b1++)
/*    */       (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
/*    */     Cipher cipher;
/*    */     (cipher = Cipher.getInstance(da$gx.U("?ɴ㶖뽍瓿摤킐⚘꭮ᣄ茇ኍꟌ썘﩯眐Ⓕ⃘︅㟍".toCharArray(), (short)1461, false, false))).init(2, SecretKeyFactory.getInstance(da$gx.U("킁Ǧ䨌旙".toCharArray(), (short)21784, true, true)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*    */     String[] arrayOfString = new String[2];
/*    */     boolean bool = false;
/*    */     "䆋ᬙ廟䐜齻찻刧풫짶ᇲꅺ뀞쒒莖ࠥ䲽᪊럅쇒谶鿥陁㿈휎怈뷀쎯劤?雜۸䟊鍺벺謚౟ಯ팋뀨㝥෤ꮐ櫓焸?遃倬訒⋢ﱷꗶḿ먢喎ꢇ㪝읹䭊ꩌ廧썘ꦷ烐⒩㵅鹅耚駸蕺賤⨊錭트ퟀ▲忕ྀ?껭릙⨯熄봣鄚?˼浪듲蹯짵䡔烹㣩鱈羷ٴ캘屁鷩긢텹㯸楙㵙䘖偡闈휔빷娾㴇霑騁狻豱␏峒﫭㔧獴ﯽҋꮝ삁ﳤ㣶".toCharArray()[135] = (char)("䆋ᬙ廟䐜齻찻刧풫짶ᇲꅺ뀞쒒莖ࠥ䲽᪊럅쇒谶鿥陁㿈휎怈뷀쎯劤?雜۸䟊鍺벺謚౟ಯ팋뀨㝥෤ꮐ櫓焸?遃倬訒⋢ﱷꗶḿ먢喎ꢇ㪝읹䭊ꩌ廧썘ꦷ烐⒩㵅鹅耚駸蕺賤⨊錭트ퟀ▲忕ྀ?껭릙⨯熄봣鄚?˼浪듲蹯짵䡔烹㣩鱈羷ٴ캘屁鷩긢텹㯸楙㵙䘖偡闈휔빷娾㴇霑騁狻豱␏峒﫭㔧獴ﯽҋꮝ삁ﳤ㣶".toCharArray()[135] ^ 0x26CB);
/*    */     String str;
/*    */     int i = (str = da$gx.U("䆋ᬙ廟䐜齻찻刧풫짶ᇲꅺ뀞쒒莖ࠥ䲽᪊럅쇒谶鿥陁㿈휎怈뷀쎯劤?雜۸䟊鍺벺謚౟ಯ팋뀨㝥෤ꮐ櫓焸?遃倬訒⋢ﱷꗶḿ먢喎ꢇ㪝읹䭊ꩌ廧썘ꦷ烐⒩㵅鹅耚駸蕺賤⨊錭트ퟀ▲忕ྀ?껭릙⨯熄봣鄚?˼浪듲蹯짵䡔烹㣩鱈羷ٴ캘屁鷩긢텹㯸楙㵙䘖偡闈휔빷娾㴇霑騁狻豱␏峒﫭㔧獴ﯽҋꮝ삁ﳤ㣶".toCharArray(), (short)32669, true, false)).length();
/*    */     byte b2 = 80;
/*    */     byte b = -1;
/*    */     while (true);
/*    */   }
/*    */   
/*    */   private static Exception a(Exception paramException) {
/*    */     return paramException;
/*    */   }
/*    */   
/*    */   private static String a(byte[] paramArrayOfbyte) {
/*    */     byte b1 = 0;
/*    */     int i;
/*    */     char[] arrayOfChar = new char[i = paramArrayOfbyte.length];
/*    */     for (byte b2 = 0; b2 < i; b2++) {
/*    */       int j;
/*    */       if ((j = 0xFF & paramArrayOfbyte[b2]) < 192) {
/*    */         arrayOfChar[b1++] = (char)j;
/*    */       } else if (j < 224) {
/*    */         char c = (char)((char)(j & 0x1F) << 6);
/*    */         j = paramArrayOfbyte[++b2];
/*    */         c = (char)(c | (char)(j & 0x3F));
/*    */         arrayOfChar[b1++] = c;
/*    */       } else if (b2 < i - 2) {
/*    */         char c = (char)((char)(j & 0xF) << 12);
/*    */         j = paramArrayOfbyte[++b2];
/*    */         c = (char)(c | (char)(j & 0x3F) << 6);
/*    */         j = paramArrayOfbyte[++b2];
/*    */         c = (char)(c | (char)(j & 0x3F));
/*    */         arrayOfChar[b1++] = c;
/*    */       } 
/*    */     } 
/*    */     return new String(arrayOfChar, 0, b1);
/*    */   }
/*    */   
/*    */   private static String a(int paramInt, long paramLong) {
/*    */     int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x790C;
/*    */     if (g[i] == null) {
/*    */       Object[] arrayOfObject;
/*    */       try {
/*    */         Long long_ = Long.valueOf(Thread.currentThread().getId());
/*    */         arrayOfObject = (Object[])h.get(long_);
/*    */         if (arrayOfObject == null) {
/*    */           arrayOfObject = new Object[3];
/*    */           "ꮨ퉌㠔倎㕧╈枰쓛峯璖趱椬৻ꣷ䩭?찃࠶?㞑".toCharArray()[11] = (char)("ꮨ퉌㠔倎㕧╈枰쓛峯璖趱椬৻ꣷ䩭?찃࠶?㞑".toCharArray()[11] ^ 0x50A5);
/*    */           arrayOfObject[0] = Cipher.getInstance(fW$gy.A("ꮨ퉌㠔倎㕧╈枰쓛峯璖趱椬৻ꣷ䩭?찃࠶?㞑".toCharArray(), (short)26471, true, 0));
/*    */           "?ꁃ夞๥".toCharArray()[1] = (char)("?ꁃ夞๥".toCharArray()[1] ^ 0x3866);
/*    */           arrayOfObject[1] = SecretKeyFactory.getInstance(fW$gy.A("?ꁃ夞๥".toCharArray(), (short)16048, false, 0));
/*    */           arrayOfObject[2] = new IvParameterSpec(new byte[8]);
/*    */           h.put(long_, arrayOfObject);
/*    */         } 
/*    */       } catch (Exception exception) {
/*    */         "뚊䐫?탬춞뱴َ揄롤㳿冔Ṣ꫔ꪤꄨᑣ≆".toCharArray()[14] = (char)("뚊䐫?탬춞뱴َ揄롤㳿冔Ṣ꫔ꪤꄨᑣ≆".toCharArray()[14] ^ 0x1AB6);
/*    */         throw new RuntimeException(fW$gy.A("뚊䐫?탬춞뱴َ揄롤㳿冔Ṣ꫔ꪤꄨᑣ≆".toCharArray(), (short)13381, false, 0), exception);
/*    */       } 
/*    */       byte[] arrayOfByte1 = new byte[8];
/*    */       arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
/*    */       for (byte b = 1; b < 8; b++)
/*    */         arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
/*    */       DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
/*    */       SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
/*    */       ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
/*    */       "緞ꁔ狆楻䳶ꊘ᧣絃鮽欙".toCharArray()[3] = (char)("緞ꁔ狆楻䳶ꊘ᧣絃鮽欙".toCharArray()[3] ^ 0x6E3B);
/*    */       byte[] arrayOfByte2 = f[i].getBytes(fW$gy.A("緞ꁔ狆楻䳶ꊘ᧣絃鮽欙".toCharArray(), (short)3834, false, 0));
/*    */       g[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
/*    */     } 
/*    */     return g[i];
/*    */   }
/*    */   
/*    */   private static Object a(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
/*    */     int i = ((Integer)paramArrayOfObject[0]).intValue();
/*    */     long l = ((Long)paramArrayOfObject[1]).longValue();
/*    */     String str = a(i, l);
/*    */     MethodHandle methodHandle = MethodHandles.constant(String.class, str);
/*    */     paramMutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[] { int.class, long.class }));
/*    */     return str;
/*    */   }
/*    */   
/*    */   private static CallSite a(MethodHandles.Lookup paramLookup, String paramString, MethodType paramMethodType) {
/*    */     // Byte code:
/*    */     //   0: new java/lang/invoke/MutableCallSite
/*    */     //   3: dup
/*    */     //   4: aload_2
/*    */     //   5: invokespecial <init> : (Ljava/lang/invoke/MethodType;)V
/*    */     //   8: astore_3
/*    */     //   9: aload_3
/*    */     //   10: ldc_w
/*    */     //   13: ldc_w [Ljava/lang/Object;
/*    */     //   16: aload_2
/*    */     //   17: invokevirtual parameterCount : ()I
/*    */     //   20: invokevirtual asCollector : (Ljava/lang/Class;I)Ljava/lang/invoke/MethodHandle;
/*    */     //   23: iconst_0
/*    */     //   24: iconst_3
/*    */     //   25: anewarray java/lang/Object
/*    */     //   28: dup
/*    */     //   29: iconst_0
/*    */     //   30: aload_0
/*    */     //   31: aastore
/*    */     //   32: dup
/*    */     //   33: iconst_1
/*    */     //   34: aload_3
/*    */     //   35: aastore
/*    */     //   36: dup
/*    */     //   37: iconst_2
/*    */     //   38: aload_1
/*    */     //   39: aastore
/*    */     //   40: invokestatic insertArguments : (Ljava/lang/invoke/MethodHandle;I[Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;
/*    */     //   43: aload_2
/*    */     //   44: invokestatic explicitCastArguments : (Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;
/*    */     //   47: invokevirtual setTarget : (Ljava/lang/invoke/MethodHandle;)V
/*    */     //   50: goto -> 170
/*    */     //   53: astore #4
/*    */     //   55: new java/lang/RuntimeException
/*    */     //   58: dup
/*    */     //   59: new java/lang/StringBuilder
/*    */     //   62: dup
/*    */     //   63: invokespecial <init> : ()V
/*    */     //   66: ldc_w '?䭝쟚⸎듃蛞勯䫚鵻쏦௠胈栙陠糜짵튋趆㧡'
/*    */     //   69: invokevirtual toCharArray : ()[C
/*    */     //   72: dup
/*    */     //   73: dup
/*    */     //   74: iconst_0
/*    */     //   75: dup_x1
/*    */     //   76: caload
/*    */     //   77: sipush #20095
/*    */     //   80: ixor
/*    */     //   81: i2c
/*    */     //   82: castore
/*    */     //   83: sipush #7864
/*    */     //   86: iconst_1
/*    */     //   87: iconst_1
/*    */     //   88: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   91: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   94: ldc_w 'Ⓗ靲ꥇ㿵'
/*    */     //   97: invokevirtual toCharArray : ()[C
/*    */     //   100: dup
/*    */     //   101: dup
/*    */     //   102: iconst_0
/*    */     //   103: dup_x1
/*    */     //   104: caload
/*    */     //   105: sipush #30749
/*    */     //   108: ixor
/*    */     //   109: i2c
/*    */     //   110: castore
/*    */     //   111: sipush #29598
/*    */     //   114: iconst_1
/*    */     //   115: iconst_0
/*    */     //   116: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   119: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   122: aload_1
/*    */     //   123: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   126: ldc_w 'ල᫵⻾䵢'
/*    */     //   129: invokevirtual toCharArray : ()[C
/*    */     //   132: dup
/*    */     //   133: dup
/*    */     //   134: iconst_0
/*    */     //   135: dup_x1
/*    */     //   136: caload
/*    */     //   137: sipush #10805
/*    */     //   140: ixor
/*    */     //   141: i2c
/*    */     //   142: castore
/*    */     //   143: sipush #4462
/*    */     //   146: iconst_1
/*    */     //   147: iconst_1
/*    */     //   148: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   151: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   154: aload_2
/*    */     //   155: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   158: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   161: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   164: aload #4
/*    */     //   166: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   169: athrow
/*    */     //   170: aload_3
/*    */     //   171: areturn
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   9	50	53	java/lang/Exception
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\g2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */