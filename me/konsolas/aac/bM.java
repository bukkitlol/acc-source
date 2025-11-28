/*    */ package me.konsolas.aac;
/*    */ import java.lang.invoke.MethodHandle;
/*    */ import java.lang.invoke.MethodHandles;
/*    */ import java.lang.invoke.MutableCallSite;
/*    */ import java.net.Proxy;
/*    */ import java.util.Collections;
/*    */ import java.util.HashMap;
/*    */ import java.util.List;
/*    */ import javax.crypto.Cipher;
/*    */ import javax.crypto.SecretKey;
/*    */ import javax.crypto.SecretKeyFactory;
/*    */ import javax.crypto.spec.DESKeySpec;
/*    */ import javax.crypto.spec.IvParameterSpec;
/*    */ 
/*    */ final class bm {
/*    */   bm(jh paramjh, int paramInt1, bU parambU, gC paramgC, cv paramcv, int paramInt2, char paramChar) {
/* 17 */     this.c = paramjh;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 68 */     this.e = parambU;
/*    */     this.g = paramgC;
/*    */     this.a = paramcv;
/*    */     a((char)i, paramjh.a(), (char)j, k, paramjh.a());
/*    */   }
/*    */   
/*    */   private boolean a(long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/bm.i : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: ldc2_w 2158137694846903353
/*    */     //   9: lload_1
/*    */     //   10: <illegal opcode> w : (JJ)I
/*    */     //   15: istore_3
/*    */     //   16: aload_0
/*    */     //   17: getfield f : I
/*    */     //   20: iload_3
/*    */     //   21: ifeq -> 63
/*    */     //   24: aload_0
/*    */     //   25: getfield h : Ljava/util/List;
/*    */     //   28: invokeinterface size : ()I
/*    */     //   33: if_icmpge -> 66
/*    */     //   36: goto -> 49
/*    */     //   39: ldc2_w 2107611248149986394
/*    */     //   42: lload_1
/*    */     //   43: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   48: athrow
/*    */     //   49: iconst_1
/*    */     //   50: goto -> 63
/*    */     //   53: ldc2_w 2107611248149986394
/*    */     //   56: lload_1
/*    */     //   57: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   62: athrow
/*    */     //   63: goto -> 67
/*    */     //   66: iconst_0
/*    */     //   67: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #2	-> 16
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   16	36	39	java/util/NoSuchElementException
/*    */     //   24	50	53	java/util/NoSuchElementException
/*    */   }
/*    */   
/*    */   static String a(InetSocketAddress paramInetSocketAddress, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/bm.i : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: ldc2_w -6007173718800312984
/*    */     //   9: lload_1
/*    */     //   10: <illegal opcode> w : (JJ)I
/*    */     //   15: aload_0
/*    */     //   16: invokevirtual getAddress : ()Ljava/net/InetAddress;
/*    */     //   19: astore #4
/*    */     //   21: istore_3
/*    */     //   22: aload #4
/*    */     //   24: iload_3
/*    */     //   25: ifeq -> 61
/*    */     //   28: ifnonnull -> 59
/*    */     //   31: goto -> 44
/*    */     //   34: ldc2_w -6021672399165305589
/*    */     //   37: lload_1
/*    */     //   38: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   43: athrow
/*    */     //   44: aload_0
/*    */     //   45: invokevirtual getHostName : ()Ljava/lang/String;
/*    */     //   48: areturn
/*    */     //   49: ldc2_w -6021672399165305589
/*    */     //   52: lload_1
/*    */     //   53: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   58: athrow
/*    */     //   59: aload #4
/*    */     //   61: invokevirtual getHostAddress : ()Ljava/lang/String;
/*    */     //   64: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #7	-> 15
/*    */     //   #46	-> 22
/*    */     //   #36	-> 44
/*    */     //   #35	-> 59
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   22	31	34	java/util/NoSuchElementException
/*    */     //   28	49	49	java/util/NoSuchElementException
/*    */   }
/*    */   
/*    */   private void a(long paramLong, Proxy paramProxy) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/bm.i : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: lload_1
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 75511895450838
/*    */     //   11: lxor
/*    */     //   12: lstore #4
/*    */     //   14: pop2
/*    */     //   15: ldc2_w -7099407353259767463
/*    */     //   18: lload_1
/*    */     //   19: <illegal opcode> w : (JJ)I
/*    */     //   24: istore #6
/*    */     //   26: aload_0
/*    */     //   27: iload #6
/*    */     //   29: ifne -> 107
/*    */     //   32: new java/util/ArrayList
/*    */     //   35: dup
/*    */     //   36: invokespecial <init> : ()V
/*    */     //   39: putfield b : Ljava/util/List;
/*    */     //   42: aload_3
/*    */     //   43: invokevirtual type : ()Ljava/net/Proxy$Type;
/*    */     //   46: getstatic java/net/Proxy$Type.DIRECT : Ljava/net/Proxy$Type;
/*    */     //   49: if_acmpeq -> 93
/*    */     //   52: goto -> 65
/*    */     //   55: ldc2_w -7127531737069618064
/*    */     //   58: lload_1
/*    */     //   59: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   64: athrow
/*    */     //   65: aload_3
/*    */     //   66: iload #6
/*    */     //   68: ifne -> 155
/*    */     //   71: invokevirtual type : ()Ljava/net/Proxy$Type;
/*    */     //   74: getstatic java/net/Proxy$Type.SOCKS : Ljava/net/Proxy$Type;
/*    */     //   77: if_acmpne -> 141
/*    */     //   80: goto -> 93
/*    */     //   83: ldc2_w -7127531737069618064
/*    */     //   86: lload_1
/*    */     //   87: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   92: athrow
/*    */     //   93: aload_0
/*    */     //   94: goto -> 107
/*    */     //   97: ldc2_w -7127531737069618064
/*    */     //   100: lload_1
/*    */     //   101: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   106: athrow
/*    */     //   107: getfield c : Lme/konsolas/aac/jh;
/*    */     //   110: invokevirtual a : ()Lme/konsolas/aac/l6;
/*    */     //   113: invokevirtual d : ()Ljava/lang/String;
/*    */     //   116: astore #7
/*    */     //   118: aload_0
/*    */     //   119: getfield c : Lme/konsolas/aac/jh;
/*    */     //   122: invokevirtual a : ()Lme/konsolas/aac/l6;
/*    */     //   125: invokevirtual c : ()I
/*    */     //   128: istore #8
/*    */     //   130: iload #6
/*    */     //   132: lload_1
/*    */     //   133: lconst_0
/*    */     //   134: lcmp
/*    */     //   135: iflt -> 263
/*    */     //   138: ifeq -> 261
/*    */     //   141: aload_3
/*    */     //   142: goto -> 155
/*    */     //   145: ldc2_w -7127531737069618064
/*    */     //   148: lload_1
/*    */     //   149: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   154: athrow
/*    */     //   155: invokevirtual address : ()Ljava/net/SocketAddress;
/*    */     //   158: astore #9
/*    */     //   160: aload #9
/*    */     //   162: iload #6
/*    */     //   164: ifne -> 240
/*    */     //   167: instanceof java/net/InetSocketAddress
/*    */     //   170: ifne -> 238
/*    */     //   173: goto -> 186
/*    */     //   176: ldc2_w -7127531737069618064
/*    */     //   179: lload_1
/*    */     //   180: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   185: athrow
/*    */     //   186: new java/lang/IllegalArgumentException
/*    */     //   189: dup
/*    */     //   190: new java/lang/StringBuilder
/*    */     //   193: dup
/*    */     //   194: invokespecial <init> : ()V
/*    */     //   197: sipush #16650
/*    */     //   200: ldc2_w 440027361644195452
/*    */     //   203: lload_1
/*    */     //   204: lxor
/*    */     //   205: <illegal opcode> i : (IJ)Ljava/lang/String;
/*    */     //   210: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   213: aload #9
/*    */     //   215: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   218: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   221: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   224: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   227: athrow
/*    */     //   228: ldc2_w -7127531737069618064
/*    */     //   231: lload_1
/*    */     //   232: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   237: athrow
/*    */     //   238: aload #9
/*    */     //   240: checkcast java/net/InetSocketAddress
/*    */     //   243: astore #10
/*    */     //   245: aload #10
/*    */     //   247: lload #4
/*    */     //   249: invokestatic a : (Ljava/net/InetSocketAddress;J)Ljava/lang/String;
/*    */     //   252: astore #7
/*    */     //   254: aload #10
/*    */     //   256: invokevirtual getPort : ()I
/*    */     //   259: istore #8
/*    */     //   261: iload #8
/*    */     //   263: iconst_1
/*    */     //   264: lload_1
/*    */     //   265: lconst_0
/*    */     //   266: lcmp
/*    */     //   267: ifle -> 309
/*    */     //   270: iload #6
/*    */     //   272: ifne -> 309
/*    */     //   275: if_icmplt -> 312
/*    */     //   278: goto -> 291
/*    */     //   281: ldc2_w -7127531737069618064
/*    */     //   284: lload_1
/*    */     //   285: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   290: athrow
/*    */     //   291: iload #8
/*    */     //   293: ldc_w 65535
/*    */     //   296: goto -> 309
/*    */     //   299: ldc2_w -7127531737069618064
/*    */     //   302: lload_1
/*    */     //   303: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   308: athrow
/*    */     //   309: if_icmple -> 410
/*    */     //   312: new java/net/SocketException
/*    */     //   315: dup
/*    */     //   316: new java/lang/StringBuilder
/*    */     //   319: dup
/*    */     //   320: invokespecial <init> : ()V
/*    */     //   323: sipush #7629
/*    */     //   326: ldc2_w 320252184959644350
/*    */     //   329: lload_1
/*    */     //   330: lxor
/*    */     //   331: <illegal opcode> i : (IJ)Ljava/lang/String;
/*    */     //   336: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   339: aload #7
/*    */     //   341: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   344: ldc_w '䩊>'
/*    */     //   347: invokevirtual toCharArray : ()[C
/*    */     //   350: dup
/*    */     //   351: dup
/*    */     //   352: iconst_0
/*    */     //   353: dup_x1
/*    */     //   354: caload
/*    */     //   355: sipush #20665
/*    */     //   358: ixor
/*    */     //   359: i2c
/*    */     //   360: castore
/*    */     //   361: sipush #30552
/*    */     //   364: iconst_1
/*    */     //   365: iconst_1
/*    */     //   366: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   369: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   372: iload #8
/*    */     //   374: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   377: sipush #26050
/*    */     //   380: ldc2_w 3103914250348497584
/*    */     //   383: lload_1
/*    */     //   384: lxor
/*    */     //   385: <illegal opcode> i : (IJ)Ljava/lang/String;
/*    */     //   390: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   393: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   396: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   399: athrow
/*    */     //   400: ldc2_w -7127531737069618064
/*    */     //   403: lload_1
/*    */     //   404: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   409: athrow
/*    */     //   410: lload_1
/*    */     //   411: lconst_0
/*    */     //   412: lcmp
/*    */     //   413: ifle -> 474
/*    */     //   416: aload_3
/*    */     //   417: invokevirtual type : ()Ljava/net/Proxy$Type;
/*    */     //   420: getstatic java/net/Proxy$Type.SOCKS : Ljava/net/Proxy$Type;
/*    */     //   423: if_acmpne -> 461
/*    */     //   426: aload_0
/*    */     //   427: getfield b : Ljava/util/List;
/*    */     //   430: aload #7
/*    */     //   432: iload #8
/*    */     //   434: invokestatic createUnresolved : (Ljava/lang/String;I)Ljava/net/InetSocketAddress;
/*    */     //   437: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   442: pop
/*    */     //   443: iload #6
/*    */     //   445: ifeq -> 654
/*    */     //   448: goto -> 461
/*    */     //   451: ldc2_w -7127531737069618064
/*    */     //   454: lload_1
/*    */     //   455: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   460: athrow
/*    */     //   461: aload_0
/*    */     //   462: getfield a : Lme/konsolas/aac/cv;
/*    */     //   465: aload_0
/*    */     //   466: getfield g : Lme/konsolas/aac/gC;
/*    */     //   469: aload #7
/*    */     //   471: invokevirtual a : (Lme/konsolas/aac/gC;Ljava/lang/String;)V
/*    */     //   474: aload_0
/*    */     //   475: getfield c : Lme/konsolas/aac/jh;
/*    */     //   478: invokevirtual a : ()Lme/konsolas/aac/k4;
/*    */     //   481: aload #7
/*    */     //   483: invokeinterface a : (Ljava/lang/String;)Ljava/util/List;
/*    */     //   488: astore #9
/*    */     //   490: aload #9
/*    */     //   492: invokeinterface isEmpty : ()Z
/*    */     //   497: iload #6
/*    */     //   499: ifne -> 593
/*    */     //   502: ifeq -> 577
/*    */     //   505: goto -> 518
/*    */     //   508: ldc2_w -7127531737069618064
/*    */     //   511: lload_1
/*    */     //   512: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   517: athrow
/*    */     //   518: new java/net/UnknownHostException
/*    */     //   521: dup
/*    */     //   522: new java/lang/StringBuilder
/*    */     //   525: dup
/*    */     //   526: invokespecial <init> : ()V
/*    */     //   529: aload_0
/*    */     //   530: getfield c : Lme/konsolas/aac/jh;
/*    */     //   533: invokevirtual a : ()Lme/konsolas/aac/k4;
/*    */     //   536: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   539: sipush #13905
/*    */     //   542: ldc2_w 2565296283045779745
/*    */     //   545: lload_1
/*    */     //   546: lxor
/*    */     //   547: <illegal opcode> i : (IJ)Ljava/lang/String;
/*    */     //   552: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   555: aload #7
/*    */     //   557: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   560: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   563: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   566: athrow
/*    */     //   567: ldc2_w -7127531737069618064
/*    */     //   570: lload_1
/*    */     //   571: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   576: athrow
/*    */     //   577: aload_0
/*    */     //   578: getfield a : Lme/konsolas/aac/cv;
/*    */     //   581: aload_0
/*    */     //   582: getfield g : Lme/konsolas/aac/gC;
/*    */     //   585: aload #7
/*    */     //   587: aload #9
/*    */     //   589: invokevirtual a : (Lme/konsolas/aac/gC;Ljava/lang/String;Ljava/util/List;)V
/*    */     //   592: iconst_0
/*    */     //   593: istore #10
/*    */     //   595: aload #9
/*    */     //   597: invokeinterface size : ()I
/*    */     //   602: istore #11
/*    */     //   604: iload #10
/*    */     //   606: iload #11
/*    */     //   608: if_icmpge -> 654
/*    */     //   611: aload #9
/*    */     //   613: iload #10
/*    */     //   615: invokeinterface get : (I)Ljava/lang/Object;
/*    */     //   620: checkcast java/net/InetAddress
/*    */     //   623: astore #12
/*    */     //   625: aload_0
/*    */     //   626: getfield b : Ljava/util/List;
/*    */     //   629: new java/net/InetSocketAddress
/*    */     //   632: dup
/*    */     //   633: aload #12
/*    */     //   635: iload #8
/*    */     //   637: invokespecial <init> : (Ljava/net/InetAddress;I)V
/*    */     //   640: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   645: pop
/*    */     //   646: iinc #10, 1
/*    */     //   649: iload #6
/*    */     //   651: ifeq -> 604
/*    */     //   654: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #19	-> 26
/*    */     //   #67	-> 42
/*    */     //   #5	-> 93
/*    */     //   #13	-> 118
/*    */     //   #38	-> 141
/*    */     //   #57	-> 160
/*    */     //   #56	-> 186
/*    */     //   #3	-> 215
/*    */     //   #30	-> 238
/*    */     //   #10	-> 245
/*    */     //   #62	-> 254
/*    */     //   #54	-> 261
/*    */     //   #58	-> 312
/*    */     //   #60	-> 410
/*    */     //   #32	-> 426
/*    */     //   #12	-> 461
/*    */     //   #16	-> 474
/*    */     //   #69	-> 490
/*    */     //   #49	-> 518
/*    */     //   #48	-> 577
/*    */     //   #39	-> 592
/*    */     //   #63	-> 611
/*    */     //   #29	-> 625
/*    */     //   #24	-> 646
/*    */     //   #51	-> 654
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   26	52	55	java/io/IOException
/*    */     //   65	80	83	java/io/IOException
/*    */     //   71	94	97	java/io/IOException
/*    */     //   130	142	145	java/io/IOException
/*    */     //   160	173	176	java/io/IOException
/*    */     //   167	228	228	java/io/IOException
/*    */     //   261	278	281	java/io/IOException
/*    */     //   275	296	299	java/io/IOException
/*    */     //   309	400	400	java/io/IOException
/*    */     //   410	448	451	java/io/IOException
/*    */     //   490	505	508	java/io/IOException
/*    */     //   502	567	567	java/io/IOException
/*    */   }
/*    */   
/*    */   private List b = Collections.emptyList();
/*    */   
/*    */   public boolean b(long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/bm.i : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: lload_1
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 100557795276705
/*    */     //   11: lxor
/*    */     //   12: lstore_3
/*    */     //   13: pop2
/*    */     //   14: ldc2_w -155668623784395
/*    */     //   17: lload_1
/*    */     //   18: <illegal opcode> w : (JJ)I
/*    */     //   23: istore #5
/*    */     //   25: aload_0
/*    */     //   26: lload_3
/*    */     //   27: invokespecial a : (J)Z
/*    */     //   30: iload #5
/*    */     //   32: ifeq -> 95
/*    */     //   35: ifne -> 94
/*    */     //   38: goto -> 51
/*    */     //   41: ldc2_w -57436406559531434
/*    */     //   44: lload_1
/*    */     //   45: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   50: athrow
/*    */     //   51: aload_0
/*    */     //   52: getfield d : Ljava/util/List;
/*    */     //   55: invokeinterface isEmpty : ()Z
/*    */     //   60: iload #5
/*    */     //   62: ifeq -> 95
/*    */     //   65: goto -> 78
/*    */     //   68: ldc2_w -57436406559531434
/*    */     //   71: lload_1
/*    */     //   72: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   77: athrow
/*    */     //   78: ifne -> 98
/*    */     //   81: goto -> 94
/*    */     //   84: ldc2_w -57436406559531434
/*    */     //   87: lload_1
/*    */     //   88: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   93: athrow
/*    */     //   94: iconst_1
/*    */     //   95: goto -> 99
/*    */     //   98: iconst_0
/*    */     //   99: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #22	-> 25
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   25	38	41	java/util/NoSuchElementException
/*    */     //   35	65	68	java/util/NoSuchElementException
/*    */     //   51	81	84	java/util/NoSuchElementException
/*    */   }
/*    */   
/*    */   private final List d = new ArrayList();
/*    */   
/*    */   private Proxy a(long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/bm.i : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: lload_1
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 104369989664517
/*    */     //   11: lxor
/*    */     //   12: lstore_3
/*    */     //   13: dup2
/*    */     //   14: ldc2_w 8839245348655
/*    */     //   17: lxor
/*    */     //   18: lstore #5
/*    */     //   20: pop2
/*    */     //   21: ldc2_w -622772233781637487
/*    */     //   24: lload_1
/*    */     //   25: <illegal opcode> w : (JJ)I
/*    */     //   30: istore #7
/*    */     //   32: aload_0
/*    */     //   33: iload #7
/*    */     //   35: ifeq -> 158
/*    */     //   38: lload_3
/*    */     //   39: invokespecial a : (J)Z
/*    */     //   42: ifne -> 138
/*    */     //   45: goto -> 58
/*    */     //   48: ldc2_w -605746811002808590
/*    */     //   51: lload_1
/*    */     //   52: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   57: athrow
/*    */     //   58: new java/net/SocketException
/*    */     //   61: dup
/*    */     //   62: new java/lang/StringBuilder
/*    */     //   65: dup
/*    */     //   66: invokespecial <init> : ()V
/*    */     //   69: sipush #1956
/*    */     //   72: ldc2_w 770170578919424599
/*    */     //   75: lload_1
/*    */     //   76: lxor
/*    */     //   77: <illegal opcode> i : (IJ)Ljava/lang/String;
/*    */     //   82: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   85: aload_0
/*    */     //   86: getfield c : Lme/konsolas/aac/jh;
/*    */     //   89: invokevirtual a : ()Lme/konsolas/aac/l6;
/*    */     //   92: invokevirtual d : ()Ljava/lang/String;
/*    */     //   95: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   98: sipush #17616
/*    */     //   101: ldc2_w 4807248053347336485
/*    */     //   104: lload_1
/*    */     //   105: lxor
/*    */     //   106: <illegal opcode> i : (IJ)Ljava/lang/String;
/*    */     //   111: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   114: aload_0
/*    */     //   115: getfield h : Ljava/util/List;
/*    */     //   118: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   121: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   124: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   127: athrow
/*    */     //   128: ldc2_w -605746811002808590
/*    */     //   131: lload_1
/*    */     //   132: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   137: athrow
/*    */     //   138: aload_0
/*    */     //   139: getfield h : Ljava/util/List;
/*    */     //   142: aload_0
/*    */     //   143: dup
/*    */     //   144: getfield f : I
/*    */     //   147: dup_x1
/*    */     //   148: iconst_1
/*    */     //   149: iadd
/*    */     //   150: putfield f : I
/*    */     //   153: invokeinterface get : (I)Ljava/lang/Object;
/*    */     //   158: checkcast java/net/Proxy
/*    */     //   161: astore #8
/*    */     //   163: aload_0
/*    */     //   164: lload #5
/*    */     //   166: aload #8
/*    */     //   168: invokespecial a : (JLjava/net/Proxy;)V
/*    */     //   171: aload #8
/*    */     //   173: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #25	-> 32
/*    */     //   #34	-> 58
/*    */     //   #71	-> 138
/*    */     //   #14	-> 163
/*    */     //   #50	-> 171
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   32	45	48	java/io/IOException
/*    */     //   38	128	128	java/io/IOException
/*    */   }
/*    */   
/*    */   public ib a(long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/bm.i : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: lload_1
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 126301897196531
/*    */     //   11: lxor
/*    */     //   12: lstore_3
/*    */     //   13: dup2
/*    */     //   14: ldc2_w 19937667432869
/*    */     //   17: lxor
/*    */     //   18: lstore #5
/*    */     //   20: dup2
/*    */     //   21: ldc2_w 26089746843905
/*    */     //   24: lxor
/*    */     //   25: lstore #7
/*    */     //   27: dup2
/*    */     //   28: ldc2_w 103925840946089
/*    */     //   31: lxor
/*    */     //   32: lstore #9
/*    */     //   34: pop2
/*    */     //   35: ldc2_w 7734871955909918583
/*    */     //   38: lload_1
/*    */     //   39: <illegal opcode> w : (JJ)I
/*    */     //   44: istore #11
/*    */     //   46: aload_0
/*    */     //   47: lload #5
/*    */     //   49: invokevirtual b : (J)Z
/*    */     //   52: ifne -> 73
/*    */     //   55: new java/util/NoSuchElementException
/*    */     //   58: dup
/*    */     //   59: invokespecial <init> : ()V
/*    */     //   62: athrow
/*    */     //   63: ldc2_w 7727037959075498590
/*    */     //   66: lload_1
/*    */     //   67: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   72: athrow
/*    */     //   73: new java/util/ArrayList
/*    */     //   76: dup
/*    */     //   77: invokespecial <init> : ()V
/*    */     //   80: astore #12
/*    */     //   82: aload_0
/*    */     //   83: lload #9
/*    */     //   85: invokespecial a : (J)Z
/*    */     //   88: ifeq -> 354
/*    */     //   91: aload_0
/*    */     //   92: lload #7
/*    */     //   94: invokespecial a : (J)Ljava/net/Proxy;
/*    */     //   97: astore #13
/*    */     //   99: iconst_0
/*    */     //   100: istore #14
/*    */     //   102: aload_0
/*    */     //   103: getfield b : Ljava/util/List;
/*    */     //   106: invokeinterface size : ()I
/*    */     //   111: iload #11
/*    */     //   113: lload_1
/*    */     //   114: lconst_0
/*    */     //   115: lcmp
/*    */     //   116: iflt -> 363
/*    */     //   119: ifne -> 361
/*    */     //   122: istore #15
/*    */     //   124: iload #14
/*    */     //   126: iload #15
/*    */     //   128: if_icmpge -> 290
/*    */     //   131: new me/konsolas/aac/hQ
/*    */     //   134: dup
/*    */     //   135: aload_0
/*    */     //   136: getfield c : Lme/konsolas/aac/jh;
/*    */     //   139: lload_3
/*    */     //   140: dup2_x1
/*    */     //   141: pop2
/*    */     //   142: aload #13
/*    */     //   144: aload_0
/*    */     //   145: getfield b : Ljava/util/List;
/*    */     //   148: iload #14
/*    */     //   150: invokeinterface get : (I)Ljava/lang/Object;
/*    */     //   155: checkcast java/net/InetSocketAddress
/*    */     //   158: invokespecial <init> : (JLme/konsolas/aac/jh;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V
/*    */     //   161: astore #16
/*    */     //   163: aload_0
/*    */     //   164: getfield e : Lme/konsolas/aac/bU;
/*    */     //   167: aload #16
/*    */     //   169: invokevirtual a : (Lme/konsolas/aac/hQ;)Z
/*    */     //   172: lload_1
/*    */     //   173: lconst_0
/*    */     //   174: lcmp
/*    */     //   175: ifle -> 303
/*    */     //   178: iload #11
/*    */     //   180: ifne -> 303
/*    */     //   183: iload #11
/*    */     //   185: ifne -> 281
/*    */     //   188: goto -> 201
/*    */     //   191: ldc2_w 7727037959075498590
/*    */     //   194: lload_1
/*    */     //   195: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   200: athrow
/*    */     //   201: lload_1
/*    */     //   202: lconst_0
/*    */     //   203: lcmp
/*    */     //   204: iflt -> 268
/*    */     //   207: ifeq -> 259
/*    */     //   210: goto -> 223
/*    */     //   213: ldc2_w 7727037959075498590
/*    */     //   216: lload_1
/*    */     //   217: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   222: athrow
/*    */     //   223: aload_0
/*    */     //   224: getfield d : Ljava/util/List;
/*    */     //   227: aload #16
/*    */     //   229: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   234: pop
/*    */     //   235: iload #11
/*    */     //   237: lload_1
/*    */     //   238: lconst_0
/*    */     //   239: lcmp
/*    */     //   240: iflt -> 287
/*    */     //   243: ifeq -> 282
/*    */     //   246: goto -> 259
/*    */     //   249: ldc2_w 7727037959075498590
/*    */     //   252: lload_1
/*    */     //   253: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   258: athrow
/*    */     //   259: aload #12
/*    */     //   261: aload #16
/*    */     //   263: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   268: goto -> 281
/*    */     //   271: ldc2_w 7727037959075498590
/*    */     //   274: lload_1
/*    */     //   275: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   280: athrow
/*    */     //   281: pop
/*    */     //   282: iinc #14, 1
/*    */     //   285: iload #11
/*    */     //   287: ifeq -> 124
/*    */     //   290: aload #12
/*    */     //   292: lload_1
/*    */     //   293: lconst_0
/*    */     //   294: lcmp
/*    */     //   295: ifle -> 356
/*    */     //   298: invokeinterface isEmpty : ()Z
/*    */     //   303: lload_1
/*    */     //   304: lconst_0
/*    */     //   305: lcmp
/*    */     //   306: ifle -> 332
/*    */     //   309: ifne -> 330
/*    */     //   312: iload #11
/*    */     //   314: ifeq -> 354
/*    */     //   317: goto -> 330
/*    */     //   320: ldc2_w 7727037959075498590
/*    */     //   323: lload_1
/*    */     //   324: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   329: athrow
/*    */     //   330: iload #11
/*    */     //   332: ifeq -> 82
/*    */     //   335: lload_1
/*    */     //   336: lconst_0
/*    */     //   337: lcmp
/*    */     //   338: iflt -> 102
/*    */     //   341: goto -> 354
/*    */     //   344: ldc2_w 7727037959075498590
/*    */     //   347: lload_1
/*    */     //   348: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   353: athrow
/*    */     //   354: aload #12
/*    */     //   356: invokeinterface isEmpty : ()Z
/*    */     //   361: iload #11
/*    */     //   363: ifne -> 406
/*    */     //   366: ifeq -> 416
/*    */     //   369: goto -> 382
/*    */     //   372: ldc2_w 7727037959075498590
/*    */     //   375: lload_1
/*    */     //   376: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   381: athrow
/*    */     //   382: aload #12
/*    */     //   384: aload_0
/*    */     //   385: getfield d : Ljava/util/List;
/*    */     //   388: invokeinterface addAll : (Ljava/util/Collection;)Z
/*    */     //   393: goto -> 406
/*    */     //   396: ldc2_w 7727037959075498590
/*    */     //   399: lload_1
/*    */     //   400: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   405: athrow
/*    */     //   406: pop
/*    */     //   407: aload_0
/*    */     //   408: getfield d : Ljava/util/List;
/*    */     //   411: invokeinterface clear : ()V
/*    */     //   416: new me/konsolas/aac/ib
/*    */     //   419: dup
/*    */     //   420: aload #12
/*    */     //   422: invokespecial <init> : (Ljava/util/List;)V
/*    */     //   425: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #26	-> 46
/*    */     //   #4	-> 55
/*    */     //   #55	-> 73
/*    */     //   #44	-> 82
/*    */     //   #8	-> 91
/*    */     //   #20	-> 99
/*    */     //   #66	-> 131
/*    */     //   #70	-> 163
/*    */     //   #65	-> 223
/*    */     //   #53	-> 259
/*    */     //   #28	-> 282
/*    */     //   #47	-> 290
/*    */     //   #42	-> 312
/*    */     //   #15	-> 330
/*    */     //   #64	-> 354
/*    */     //   #27	-> 382
/*    */     //   #43	-> 407
/*    */     //   #9	-> 416
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   46	63	63	java/io/IOException
/*    */     //   163	188	191	java/io/IOException
/*    */     //   183	210	213	java/io/IOException
/*    */     //   201	246	249	java/io/IOException
/*    */     //   223	268	271	java/io/IOException
/*    */     //   303	317	320	java/io/IOException
/*    */     //   312	335	344	java/io/IOException
/*    */     //   361	369	372	java/io/IOException
/*    */     //   366	393	396	java/io/IOException
/*    */   }
/*    */   
/*    */   private List h = Collections.emptyList();
/*    */   private final jh c;
/*    */   private final bU e;
/*    */   private final gC g;
/*    */   private final cv a;
/*    */   private int f;
/*    */   private static final long i = nc.a(-8650431771443963780L, 5660725272474972426L, MethodHandles.lookup().lookupClass()).a(107159491210474L);
/*    */   private static final String[] j;
/*    */   private static final String[] k;
/*    */   private static final Map l = new HashMap<>(13);
/*    */   
/*    */   private void a(char paramChar1, l6 paraml6, char paramChar2, int paramInt, Proxy paramProxy) {
/*    */     // Byte code:
/*    */     //   0: iload_1
/*    */     //   1: i2l
/*    */     //   2: bipush #48
/*    */     //   4: lshl
/*    */     //   5: iload_3
/*    */     //   6: i2l
/*    */     //   7: bipush #48
/*    */     //   9: lshl
/*    */     //   10: bipush #16
/*    */     //   12: lushr
/*    */     //   13: lor
/*    */     //   14: iload #4
/*    */     //   16: i2l
/*    */     //   17: bipush #32
/*    */     //   19: lshl
/*    */     //   20: bipush #32
/*    */     //   22: lushr
/*    */     //   23: lor
/*    */     //   24: getstatic me/konsolas/aac/bm.i : J
/*    */     //   27: lxor
/*    */     //   28: lstore #6
/*    */     //   30: lload #6
/*    */     //   32: dup2
/*    */     //   33: ldc2_w 135936501173202
/*    */     //   36: lxor
/*    */     //   37: dup2
/*    */     //   38: bipush #32
/*    */     //   40: lushr
/*    */     //   41: l2i
/*    */     //   42: istore #8
/*    */     //   44: dup2
/*    */     //   45: bipush #32
/*    */     //   47: lshl
/*    */     //   48: bipush #48
/*    */     //   50: lushr
/*    */     //   51: l2i
/*    */     //   52: istore #9
/*    */     //   54: dup2
/*    */     //   55: bipush #48
/*    */     //   57: lshl
/*    */     //   58: bipush #48
/*    */     //   60: lushr
/*    */     //   61: l2i
/*    */     //   62: istore #10
/*    */     //   64: pop2
/*    */     //   65: pop2
/*    */     //   66: ldc2_w -2441345714170656194
/*    */     //   69: lload #6
/*    */     //   71: <illegal opcode> w : (JJ)I
/*    */     //   76: istore #11
/*    */     //   78: iload #11
/*    */     //   80: ifne -> 125
/*    */     //   83: aload #5
/*    */     //   85: ifnull -> 130
/*    */     //   88: goto -> 102
/*    */     //   91: ldc2_w -2417689711189672169
/*    */     //   94: lload #6
/*    */     //   96: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   101: athrow
/*    */     //   102: aload_0
/*    */     //   103: aload #5
/*    */     //   105: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
/*    */     //   108: putfield h : Ljava/util/List;
/*    */     //   111: goto -> 125
/*    */     //   114: ldc2_w -2417689711189672169
/*    */     //   117: lload #6
/*    */     //   119: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   124: athrow
/*    */     //   125: iload #11
/*    */     //   127: ifeq -> 247
/*    */     //   130: aload_0
/*    */     //   131: getfield c : Lme/konsolas/aac/jh;
/*    */     //   134: invokevirtual a : ()Ljava/net/ProxySelector;
/*    */     //   137: aload_2
/*    */     //   138: iload #8
/*    */     //   140: iload #9
/*    */     //   142: i2s
/*    */     //   143: iload #10
/*    */     //   145: i2s
/*    */     //   146: invokevirtual a : (ISS)Ljava/net/URI;
/*    */     //   149: invokevirtual select : (Ljava/net/URI;)Ljava/util/List;
/*    */     //   152: astore #12
/*    */     //   154: aload_0
/*    */     //   155: aload #12
/*    */     //   157: iload_1
/*    */     //   158: iflt -> 185
/*    */     //   161: iload #11
/*    */     //   163: ifne -> 185
/*    */     //   166: ifnull -> 231
/*    */     //   169: goto -> 183
/*    */     //   172: ldc2_w -2417689711189672169
/*    */     //   175: lload #6
/*    */     //   177: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   182: athrow
/*    */     //   183: aload #12
/*    */     //   185: invokeinterface isEmpty : ()Z
/*    */     //   190: iload #11
/*    */     //   192: ifne -> 232
/*    */     //   195: ifne -> 231
/*    */     //   198: goto -> 212
/*    */     //   201: ldc2_w -2417689711189672169
/*    */     //   204: lload #6
/*    */     //   206: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   211: athrow
/*    */     //   212: aload #12
/*    */     //   214: invokestatic a : (Ljava/util/List;)Ljava/util/List;
/*    */     //   217: goto -> 244
/*    */     //   220: ldc2_w -2417689711189672169
/*    */     //   223: lload #6
/*    */     //   225: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   230: athrow
/*    */     //   231: iconst_1
/*    */     //   232: anewarray java/net/Proxy
/*    */     //   235: dup
/*    */     //   236: iconst_0
/*    */     //   237: getstatic java/net/Proxy.NO_PROXY : Ljava/net/Proxy;
/*    */     //   240: aastore
/*    */     //   241: invokestatic a : ([Ljava/lang/Object;)Ljava/util/List;
/*    */     //   244: putfield h : Ljava/util/List;
/*    */     //   247: aload_0
/*    */     //   248: iconst_0
/*    */     //   249: putfield f : I
/*    */     //   252: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #59	-> 78
/*    */     //   #18	-> 102
/*    */     //   #52	-> 130
/*    */     //   #31	-> 154
/*    */     //   #11	-> 212
/*    */     //   #61	-> 231
/*    */     //   #6	-> 247
/*    */     //   #45	-> 252
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   78	88	91	java/util/NoSuchElementException
/*    */     //   83	111	114	java/util/NoSuchElementException
/*    */     //   154	169	172	java/util/NoSuchElementException
/*    */     //   185	198	201	java/util/NoSuchElementException
/*    */     //   195	220	220	java/util/NoSuchElementException
/*    */   }
/*    */   
/*    */   static {
/*    */     long l = i ^ 0x7DABD5E6961CL;
/*    */     "沷嘑㢪휜縟븾䵗善옉䲉宕찷爓䛀咐ރ浙귇䛂".toCharArray()[3] = (char)("沷嘑㢪휜縟븾䵗善옉䲉宕찷爓䛀咐ރ浙귇䛂".toCharArray()[3] ^ 0x5DAD);
/*    */     "셐秃熃瀘".toCharArray()[1] = (char)("셐秃熃瀘".toCharArray()[1] ^ 0x4A89);
/*    */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*    */     for (byte b1 = 1; b1 < 8; b1++)
/*    */       (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
/*    */     Cipher cipher;
/*    */     (cipher = Cipher.getInstance(fW$gy.A("沷嘑㢪휜縟븾䵗善옉䲉宕찷爓䛀咐ރ浙귇䛂".toCharArray(), (short)27474, true, 4))).init(2, SecretKeyFactory.getInstance(fW$gy.A("셐秃熃瀘".toCharArray(), (short)5526, false, 5)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*    */     String[] arrayOfString = new String[6];
/*    */     boolean bool = false;
/*    */     "ᶘ날ꞌ⼀挌蠔咡࣬ങ陶ꁖ흄ɪ㗵ై밙뮄徍?椎㭶甼蠺້う㖣亸䊤ᤞⱸ칫ಆ⿪켳ᗎ䝖湺巓틡쓉爇誣ᾘ殇忳봈걤睴咩಼멷⎫氱Κ魦䮡欟㋆饀츹剳聼蘄雂뙮唠ళ䮵퉮髑낣儵执㍮뺤ꗣ물?뙣?眃收섺坦孇瓉裡錝䁒麯诓冤䔰ⱓ辏咀터涾坶鍮盖씳ꅶᑛ靝钪態䜠9?ꊃ?鲐掄锽蘩䪲꘼몤႒촁䨜축呡?쬫땦贜ꖄﶁ벪빛丳???籏毸Ⲵ".toCharArray()[101] = (char)("ᶘ날ꞌ⼀挌蠔咡࣬ങ陶ꁖ흄ɪ㗵ై밙뮄徍?椎㭶甼蠺້う㖣亸䊤ᤞⱸ칫ಆ⿪켳ᗎ䝖湺巓틡쓉爇誣ᾘ殇忳봈걤睴咩಼멷⎫氱Κ魦䮡欟㋆饀츹剳聼蘄雂뙮唠ళ䮵퉮髑낣儵执㍮뺤ꗣ물?뙣?眃收섺坦孇瓉裡錝䁒麯诓冤䔰ⱓ辏咀터涾坶鍮盖씳ꅶᑛ靝钪態䜠9?ꊃ?鲐掄锽蘩䪲꘼몤႒촁䨜축呡?쬫땦贜ꖄﶁ벪빛丳???籏毸Ⲵ".toCharArray()[101] ^ 0x15A1);
/*    */     String str;
/*    */     int i = (str = fW$gy.A("ᶘ날ꞌ⼀挌蠔咡࣬ങ陶ꁖ흄ɪ㗵ై밙뮄徍?椎㭶甼蠺້う㖣亸䊤ᤞⱸ칫ಆ⿪켳ᗎ䝖湺巓틡쓉爇誣ᾘ殇忳봈걤睴咩಼멷⎫氱Κ魦䮡欟㋆饀츹剳聼蘄雂뙮唠ళ䮵퉮髑낣儵执㍮뺤ꗣ물?뙣?眃收섺坦孇瓉裡錝䁒麯诓冤䔰ⱓ辏咀터涾坶鍮盖씳ꅶᑛ靝钪態䜠9?ꊃ?鲐掄锽蘩䪲꘼몤႒촁䨜축呡?쬫땦贜ꖄﶁ벪빛丳???籏毸Ⲵ".toCharArray(), (short)22320, true, 1)).length();
/*    */     byte b2 = 40;
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
/*    */     int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x7332;
/*    */     if (k[i] == null) {
/*    */       Object[] arrayOfObject;
/*    */       try {
/*    */         Long long_ = Long.valueOf(Thread.currentThread().getId());
/*    */         arrayOfObject = (Object[])l.get(long_);
/*    */         if (arrayOfObject == null) {
/*    */           arrayOfObject = new Object[3];
/*    */           "ࠧ臗㨠䟡顳꼑砤ﹼꔊ㇎卖漭㫋줠떅∞⫭滝秽㈼".toCharArray()[12] = (char)("ࠧ臗㨠䟡顳꼑砤ﹼꔊ㇎卖漭㫋줠떅∞⫭滝秽㈼".toCharArray()[12] ^ 0x4973);
/*    */           arrayOfObject[0] = Cipher.getInstance(fW$gy.A("ࠧ臗㨠䟡顳꼑砤ﹼꔊ㇎卖漭㫋줠떅∞⫭滝秽㈼".toCharArray(), (short)58, false, 2));
/*    */           "끲᭣".toCharArray()[2] = (char)("끲᭣".toCharArray()[2] ^ 0x5414);
/*    */           arrayOfObject[1] = SecretKeyFactory.getInstance(fW$gy.A("끲᭣".toCharArray(), (short)6793, true, 5));
/*    */           arrayOfObject[2] = new IvParameterSpec(new byte[8]);
/*    */           l.put(long_, arrayOfObject);
/*    */         } 
/*    */       } catch (Exception exception) {
/*    */         "B烰놑럤ሏ瞄ᑸ쀡櫩䳻ԗ孌㦣땘進긊ᅛǘ᛿".toCharArray()[15] = (char)("B烰놑럤ሏ瞄ᑸ쀡櫩䳻ԗ孌㦣땘進긊ᅛǘ᛿".toCharArray()[15] ^ 0x6008);
/*    */         throw new RuntimeException(fW$gy.A("B烰놑럤ሏ瞄ᑸ쀡櫩䳻ԗ孌㦣땘進긊ᅛǘ᛿".toCharArray(), (short)10550, true, 2), exception);
/*    */       } 
/*    */       byte[] arrayOfByte1 = new byte[8];
/*    */       arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
/*    */       for (byte b = 1; b < 8; b++)
/*    */         arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
/*    */       DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
/*    */       SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
/*    */       ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
/*    */       "㲆웦んᓣ已廬鈨渔돝亥".toCharArray()[8] = (char)("㲆웦んᓣ已廬鈨渔돝亥".toCharArray()[8] ^ 0x4046);
/*    */       byte[] arrayOfByte2 = j[i].getBytes(fW$gy.A("㲆웦んᓣ已廬鈨渔돝亥".toCharArray(), (short)25012, false, 3));
/*    */       k[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
/*    */     } 
/*    */     return k[i];
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
/*    */     //   50: goto -> 171
/*    */     //   53: astore #4
/*    */     //   55: new java/lang/RuntimeException
/*    */     //   58: dup
/*    */     //   59: new java/lang/StringBuilder
/*    */     //   62: dup
/*    */     //   63: invokespecial <init> : ()V
/*    */     //   66: ldc_w '昻姊∄恮渂㈼谁螏ؤ駬⠸ꟓ稚ꇖ?ꉲ▋'
/*    */     //   69: invokevirtual toCharArray : ()[C
/*    */     //   72: dup
/*    */     //   73: dup
/*    */     //   74: bipush #8
/*    */     //   76: dup_x1
/*    */     //   77: caload
/*    */     //   78: sipush #6157
/*    */     //   81: ixor
/*    */     //   82: i2c
/*    */     //   83: castore
/*    */     //   84: sipush #13413
/*    */     //   87: iconst_1
/*    */     //   88: iconst_0
/*    */     //   89: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*    */     //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   95: ldc_w '쿻ㆈ凧'
/*    */     //   98: invokevirtual toCharArray : ()[C
/*    */     //   101: dup
/*    */     //   102: dup
/*    */     //   103: iconst_1
/*    */     //   104: dup_x1
/*    */     //   105: caload
/*    */     //   106: sipush #19079
/*    */     //   109: ixor
/*    */     //   110: i2c
/*    */     //   111: castore
/*    */     //   112: sipush #13050
/*    */     //   115: iconst_0
/*    */     //   116: iconst_5
/*    */     //   117: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*    */     //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   123: aload_1
/*    */     //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   127: ldc_w '꫽쏹㲳'
/*    */     //   130: invokevirtual toCharArray : ()[C
/*    */     //   133: dup
/*    */     //   134: dup
/*    */     //   135: iconst_0
/*    */     //   136: dup_x1
/*    */     //   137: caload
/*    */     //   138: sipush #1774
/*    */     //   141: ixor
/*    */     //   142: i2c
/*    */     //   143: castore
/*    */     //   144: sipush #3985
/*    */     //   147: iconst_1
/*    */     //   148: iconst_3
/*    */     //   149: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*    */     //   152: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   155: aload_2
/*    */     //   156: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   159: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   162: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   165: aload #4
/*    */     //   167: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   170: athrow
/*    */     //   171: aload_3
/*    */     //   172: areturn
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   9	50	53	java/lang/Exception
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\bm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */