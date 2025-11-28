/*    */ package me.konsolas.aac;
/*    */ import java.lang.invoke.CallSite;
/*    */ import java.lang.invoke.MethodHandle;
/*    */ import java.lang.invoke.MethodHandles;
/*    */ import java.lang.invoke.MutableCallSite;
/*    */ import java.util.HashMap;
/*    */ import javax.crypto.Cipher;
/*    */ import javax.crypto.SecretKey;
/*    */ import javax.crypto.SecretKeyFactory;
/*    */ import javax.crypto.spec.DESKeySpec;
/*    */ import javax.crypto.spec.IvParameterSpec;
/*    */ 
/*    */ class mo extends mf {
/*    */   mo(long paramLong, iL paramiL, l6 paraml6) {
/* 15 */     super(l, paramiL, null);
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
/* 30 */     this.h = -1L;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 38 */     this.e = true;
/*    */     this.f = paraml6;
/*    */   }
/*    */   
/*    */   private static final long g = -1L;
/*    */   private final l6 f;
/*    */   private long h;
/*    */   private boolean e;
/*    */   final iL d;
/*    */   private static final long j = nc.a(-5223357099648637492L, 4147022936568261090L, MethodHandles.lookup().lookupClass()).a(71670383573104L);
/*    */   private static final String[] l;
/*    */   private static final String[] m;
/*    */   private static final Map n = new HashMap<>(13);
/*    */   
/*    */   public long a(long paramLong1, fw paramfw, long paramLong2) {
/*    */     // Byte code:
/*    */     //   0: lload_1
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 59621419606579
/*    */     //   5: lxor
/*    */     //   6: lstore #6
/*    */     //   8: dup2
/*    */     //   9: ldc2_w 46665601277342
/*    */     //   12: lxor
/*    */     //   13: dup2
/*    */     //   14: bipush #48
/*    */     //   16: lushr
/*    */     //   17: l2i
/*    */     //   18: istore #8
/*    */     //   20: dup2
/*    */     //   21: bipush #16
/*    */     //   23: lshl
/*    */     //   24: bipush #32
/*    */     //   26: lushr
/*    */     //   27: l2i
/*    */     //   28: istore #9
/*    */     //   30: dup2
/*    */     //   31: bipush #48
/*    */     //   33: lshl
/*    */     //   34: bipush #48
/*    */     //   36: lushr
/*    */     //   37: l2i
/*    */     //   38: istore #10
/*    */     //   40: pop2
/*    */     //   41: dup2
/*    */     //   42: ldc2_w 110028954399489
/*    */     //   45: lxor
/*    */     //   46: lstore #11
/*    */     //   48: dup2
/*    */     //   49: ldc2_w 0
/*    */     //   52: lxor
/*    */     //   53: lstore #13
/*    */     //   55: pop2
/*    */     //   56: ldc2_w -8522862058668917232
/*    */     //   59: lload_1
/*    */     //   60: <illegal opcode> w : (JJ)Z
/*    */     //   65: istore #15
/*    */     //   67: lload #4
/*    */     //   69: lconst_0
/*    */     //   70: lcmp
/*    */     //   71: iload #15
/*    */     //   73: ifne -> 145
/*    */     //   76: ifge -> 141
/*    */     //   79: goto -> 92
/*    */     //   82: ldc2_w -8637643077229783784
/*    */     //   85: lload_1
/*    */     //   86: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   91: athrow
/*    */     //   92: new java/lang/IllegalArgumentException
/*    */     //   95: dup
/*    */     //   96: new java/lang/StringBuilder
/*    */     //   99: dup
/*    */     //   100: invokespecial <init> : ()V
/*    */     //   103: sipush #12077
/*    */     //   106: ldc2_w 994484240286406771
/*    */     //   109: lload_1
/*    */     //   110: lxor
/*    */     //   111: <illegal opcode> c : (IJ)Ljava/lang/String;
/*    */     //   116: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   119: lload #4
/*    */     //   121: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*    */     //   124: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   127: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   130: athrow
/*    */     //   131: ldc2_w -8637643077229783784
/*    */     //   134: lload_1
/*    */     //   135: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   140: athrow
/*    */     //   141: aload_0
/*    */     //   142: getfield a : Z
/*    */     //   145: iload #15
/*    */     //   147: lload_1
/*    */     //   148: lconst_0
/*    */     //   149: lcmp
/*    */     //   150: iflt -> 209
/*    */     //   153: ifne -> 207
/*    */     //   156: ifeq -> 203
/*    */     //   159: goto -> 172
/*    */     //   162: ldc2_w -8637643077229783784
/*    */     //   165: lload_1
/*    */     //   166: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   171: athrow
/*    */     //   172: new java/lang/IllegalStateException
/*    */     //   175: dup
/*    */     //   176: sipush #20961
/*    */     //   179: ldc2_w 2256114592526182077
/*    */     //   182: lload_1
/*    */     //   183: lxor
/*    */     //   184: <illegal opcode> c : (IJ)Ljava/lang/String;
/*    */     //   189: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   192: athrow
/*    */     //   193: ldc2_w -8637643077229783784
/*    */     //   196: lload_1
/*    */     //   197: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   202: athrow
/*    */     //   203: aload_0
/*    */     //   204: getfield e : Z
/*    */     //   207: iload #15
/*    */     //   209: lload_1
/*    */     //   210: lconst_0
/*    */     //   211: lcmp
/*    */     //   212: iflt -> 262
/*    */     //   215: ifne -> 254
/*    */     //   218: ifne -> 248
/*    */     //   221: goto -> 234
/*    */     //   224: ldc2_w -8637643077229783784
/*    */     //   227: lload_1
/*    */     //   228: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   233: athrow
/*    */     //   234: ldc2_w -1
/*    */     //   237: lreturn
/*    */     //   238: ldc2_w -8637643077229783784
/*    */     //   241: lload_1
/*    */     //   242: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   247: athrow
/*    */     //   248: aload_0
/*    */     //   249: getfield h : J
/*    */     //   252: lconst_0
/*    */     //   253: lcmp
/*    */     //   254: lload_1
/*    */     //   255: lconst_0
/*    */     //   256: lcmp
/*    */     //   257: ifle -> 370
/*    */     //   260: iload #15
/*    */     //   262: ifne -> 370
/*    */     //   265: ifeq -> 323
/*    */     //   268: goto -> 281
/*    */     //   271: ldc2_w -8637643077229783784
/*    */     //   274: lload_1
/*    */     //   275: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   280: athrow
/*    */     //   281: aload_0
/*    */     //   282: getfield h : J
/*    */     //   285: iload #15
/*    */     //   287: ifne -> 403
/*    */     //   290: goto -> 303
/*    */     //   293: ldc2_w -8637643077229783784
/*    */     //   296: lload_1
/*    */     //   297: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   302: athrow
/*    */     //   303: ldc2_w -1
/*    */     //   306: lcmp
/*    */     //   307: ifne -> 387
/*    */     //   310: goto -> 323
/*    */     //   313: ldc2_w -8637643077229783784
/*    */     //   316: lload_1
/*    */     //   317: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   322: athrow
/*    */     //   323: aload_0
/*    */     //   324: iload #8
/*    */     //   326: i2c
/*    */     //   327: iload #9
/*    */     //   329: iload #10
/*    */     //   331: i2c
/*    */     //   332: invokespecial b : (CIC)V
/*    */     //   335: aload_0
/*    */     //   336: iload #15
/*    */     //   338: ifne -> 388
/*    */     //   341: goto -> 354
/*    */     //   344: ldc2_w -8637643077229783784
/*    */     //   347: lload_1
/*    */     //   348: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   353: athrow
/*    */     //   354: getfield e : Z
/*    */     //   357: goto -> 370
/*    */     //   360: ldc2_w -8637643077229783784
/*    */     //   363: lload_1
/*    */     //   364: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   369: athrow
/*    */     //   370: ifne -> 387
/*    */     //   373: ldc2_w -1
/*    */     //   376: lreturn
/*    */     //   377: ldc2_w -8637643077229783784
/*    */     //   380: lload_1
/*    */     //   381: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   386: athrow
/*    */     //   387: aload_0
/*    */     //   388: lload #13
/*    */     //   390: aload_3
/*    */     //   391: lload #4
/*    */     //   393: aload_0
/*    */     //   394: getfield h : J
/*    */     //   397: invokestatic min : (JJ)J
/*    */     //   400: invokespecial a : (JLme/konsolas/aac/fw;J)J
/*    */     //   403: lstore #16
/*    */     //   405: lload #16
/*    */     //   407: iload #15
/*    */     //   409: ifne -> 488
/*    */     //   412: ldc2_w -1
/*    */     //   415: lcmp
/*    */     //   416: ifne -> 475
/*    */     //   419: goto -> 432
/*    */     //   422: ldc2_w -8637643077229783784
/*    */     //   425: lload_1
/*    */     //   426: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   431: athrow
/*    */     //   432: aload_0
/*    */     //   433: getfield d : Lme/konsolas/aac/iL;
/*    */     //   436: invokestatic a : (Lme/konsolas/aac/iL;)Lme/konsolas/aac/el;
/*    */     //   439: lload #11
/*    */     //   441: invokevirtual a : (J)V
/*    */     //   444: new java/net/ProtocolException
/*    */     //   447: dup
/*    */     //   448: sipush #23470
/*    */     //   451: ldc2_w 1428371947019545841
/*    */     //   454: lload_1
/*    */     //   455: lxor
/*    */     //   456: <illegal opcode> c : (IJ)Ljava/lang/String;
/*    */     //   461: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   464: astore #18
/*    */     //   466: aload_0
/*    */     //   467: lload #6
/*    */     //   469: invokevirtual a : (J)V
/*    */     //   472: aload #18
/*    */     //   474: athrow
/*    */     //   475: aload_0
/*    */     //   476: dup
/*    */     //   477: getfield h : J
/*    */     //   480: lload #16
/*    */     //   482: lsub
/*    */     //   483: putfield h : J
/*    */     //   486: lload #16
/*    */     //   488: lreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #6	-> 67
/*    */     //   #9	-> 141
/*    */     //   #11	-> 203
/*    */     //   #37	-> 248
/*    */     //   #3	-> 323
/*    */     //   #26	-> 335
/*    */     //   #18	-> 387
/*    */     //   #10	-> 405
/*    */     //   #14	-> 432
/*    */     //   #23	-> 444
/*    */     //   #33	-> 466
/*    */     //   #19	-> 472
/*    */     //   #5	-> 475
/*    */     //   #22	-> 486
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   67	79	82	java/io/IOException
/*    */     //   76	131	131	java/io/IOException
/*    */     //   145	159	162	java/io/IOException
/*    */     //   156	193	193	java/io/IOException
/*    */     //   207	221	224	java/io/IOException
/*    */     //   218	238	238	java/io/IOException
/*    */     //   254	268	271	java/io/IOException
/*    */     //   265	290	293	java/io/IOException
/*    */     //   281	310	313	java/io/IOException
/*    */     //   303	341	344	java/io/IOException
/*    */     //   323	357	360	java/io/IOException
/*    */     //   370	377	377	java/io/IOException
/*    */     //   405	419	422	java/io/IOException
/*    */   }
/*    */   
/*    */   private void b(char paramChar1, int paramInt, char paramChar2) {
/*    */     // Byte code:
/*    */     //   0: iload_1
/*    */     //   1: i2l
/*    */     //   2: bipush #48
/*    */     //   4: lshl
/*    */     //   5: iload_2
/*    */     //   6: i2l
/*    */     //   7: bipush #32
/*    */     //   9: lshl
/*    */     //   10: bipush #16
/*    */     //   12: lushr
/*    */     //   13: lor
/*    */     //   14: iload_3
/*    */     //   15: i2l
/*    */     //   16: bipush #48
/*    */     //   18: lshl
/*    */     //   19: bipush #48
/*    */     //   21: lushr
/*    */     //   22: lor
/*    */     //   23: getstatic me/konsolas/aac/mo.j : J
/*    */     //   26: lxor
/*    */     //   27: lstore #4
/*    */     //   29: lload #4
/*    */     //   31: dup2
/*    */     //   32: ldc2_w 128121369918333
/*    */     //   35: lxor
/*    */     //   36: lstore #6
/*    */     //   38: dup2
/*    */     //   39: ldc2_w 97808356321808
/*    */     //   42: lxor
/*    */     //   43: lstore #8
/*    */     //   45: dup2
/*    */     //   46: ldc2_w 107171698904734
/*    */     //   49: lxor
/*    */     //   50: lstore #10
/*    */     //   52: dup2
/*    */     //   53: ldc2_w 59335629216708
/*    */     //   56: lxor
/*    */     //   57: lstore #12
/*    */     //   59: dup2
/*    */     //   60: ldc2_w 65040174912862
/*    */     //   63: lxor
/*    */     //   64: dup2
/*    */     //   65: bipush #48
/*    */     //   67: lushr
/*    */     //   68: l2i
/*    */     //   69: istore #14
/*    */     //   71: dup2
/*    */     //   72: bipush #16
/*    */     //   74: lshl
/*    */     //   75: bipush #48
/*    */     //   77: lushr
/*    */     //   78: l2i
/*    */     //   79: istore #15
/*    */     //   81: dup2
/*    */     //   82: bipush #32
/*    */     //   84: lshl
/*    */     //   85: bipush #32
/*    */     //   87: lushr
/*    */     //   88: l2i
/*    */     //   89: istore #16
/*    */     //   91: pop2
/*    */     //   92: pop2
/*    */     //   93: ldc2_w 4739247389747964465
/*    */     //   96: lload #4
/*    */     //   98: <illegal opcode> w : (JJ)Z
/*    */     //   103: istore #17
/*    */     //   105: aload_0
/*    */     //   106: iload #17
/*    */     //   108: ifeq -> 189
/*    */     //   111: getfield h : J
/*    */     //   114: ldc2_w -1
/*    */     //   117: lcmp
/*    */     //   118: ifeq -> 170
/*    */     //   121: goto -> 135
/*    */     //   124: ldc2_w 4612675234569887035
/*    */     //   127: lload #4
/*    */     //   129: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   134: athrow
/*    */     //   135: aload_0
/*    */     //   136: getfield d : Lme/konsolas/aac/iL;
/*    */     //   139: invokestatic a : (Lme/konsolas/aac/iL;)Lme/konsolas/aac/bX;
/*    */     //   142: iload #14
/*    */     //   144: i2s
/*    */     //   145: iload #15
/*    */     //   147: i2s
/*    */     //   148: iload #16
/*    */     //   150: invokeinterface b : (SSI)Ljava/lang/String;
/*    */     //   155: pop
/*    */     //   156: goto -> 170
/*    */     //   159: ldc2_w 4612675234569887035
/*    */     //   162: lload #4
/*    */     //   164: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   169: athrow
/*    */     //   170: aload_0
/*    */     //   171: aload_0
/*    */     //   172: getfield d : Lme/konsolas/aac/iL;
/*    */     //   175: invokestatic a : (Lme/konsolas/aac/iL;)Lme/konsolas/aac/bX;
/*    */     //   178: lload #12
/*    */     //   180: invokeinterface d : (J)J
/*    */     //   185: putfield h : J
/*    */     //   188: aload_0
/*    */     //   189: getfield d : Lme/konsolas/aac/iL;
/*    */     //   192: invokestatic a : (Lme/konsolas/aac/iL;)Lme/konsolas/aac/bX;
/*    */     //   195: iload #14
/*    */     //   197: i2s
/*    */     //   198: iload #15
/*    */     //   200: i2s
/*    */     //   201: iload #16
/*    */     //   203: invokeinterface b : (SSI)Ljava/lang/String;
/*    */     //   208: invokevirtual trim : ()Ljava/lang/String;
/*    */     //   211: astore #18
/*    */     //   213: aload_0
/*    */     //   214: getfield h : J
/*    */     //   217: lconst_0
/*    */     //   218: lcmp
/*    */     //   219: iload #17
/*    */     //   221: iload_2
/*    */     //   222: ifle -> 270
/*    */     //   225: ifeq -> 264
/*    */     //   228: iflt -> 336
/*    */     //   231: goto -> 245
/*    */     //   234: ldc2_w 4612675234569887035
/*    */     //   237: lload #4
/*    */     //   239: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   244: athrow
/*    */     //   245: aload #18
/*    */     //   247: invokevirtual isEmpty : ()Z
/*    */     //   250: goto -> 264
/*    */     //   253: ldc2_w 4612675234569887035
/*    */     //   256: lload #4
/*    */     //   258: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   263: athrow
/*    */     //   264: iload_2
/*    */     //   265: iflt -> 333
/*    */     //   268: iload #17
/*    */     //   270: ifeq -> 333
/*    */     //   273: ifne -> 421
/*    */     //   276: goto -> 290
/*    */     //   279: ldc2_w 4612675234569887035
/*    */     //   282: lload #4
/*    */     //   284: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   289: athrow
/*    */     //   290: aload #18
/*    */     //   292: ldc '宪塤'
/*    */     //   294: invokevirtual toCharArray : ()[C
/*    */     //   297: dup
/*    */     //   298: dup
/*    */     //   299: iconst_0
/*    */     //   300: dup_x1
/*    */     //   301: caload
/*    */     //   302: sipush #18102
/*    */     //   305: ixor
/*    */     //   306: i2c
/*    */     //   307: castore
/*    */     //   308: sipush #29561
/*    */     //   311: iconst_1
/*    */     //   312: iconst_5
/*    */     //   313: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*    */     //   316: invokevirtual startsWith : (Ljava/lang/String;)Z
/*    */     //   319: goto -> 333
/*    */     //   322: ldc2_w 4612675234569887035
/*    */     //   325: lload #4
/*    */     //   327: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   332: athrow
/*    */     //   333: ifne -> 421
/*    */     //   336: new java/net/ProtocolException
/*    */     //   339: dup
/*    */     //   340: new java/lang/StringBuilder
/*    */     //   343: dup
/*    */     //   344: invokespecial <init> : ()V
/*    */     //   347: sipush #8310
/*    */     //   350: ldc2_w 4801394517299109640
/*    */     //   353: lload #4
/*    */     //   355: lxor
/*    */     //   356: <illegal opcode> c : (IJ)Ljava/lang/String;
/*    */     //   361: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   364: aload_0
/*    */     //   365: getfield h : J
/*    */     //   368: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*    */     //   371: aload #18
/*    */     //   373: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   376: ldc 'ªᩥ'
/*    */     //   378: invokevirtual toCharArray : ()[C
/*    */     //   381: dup
/*    */     //   382: dup
/*    */     //   383: iconst_0
/*    */     //   384: dup_x1
/*    */     //   385: caload
/*    */     //   386: sipush #20565
/*    */     //   389: ixor
/*    */     //   390: i2c
/*    */     //   391: castore
/*    */     //   392: sipush #28541
/*    */     //   395: iconst_0
/*    */     //   396: iconst_0
/*    */     //   397: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*    */     //   400: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   403: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   406: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   409: athrow
/*    */     //   410: ldc2_w 4612675234569887035
/*    */     //   413: lload #4
/*    */     //   415: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   420: athrow
/*    */     //   421: goto -> 439
/*    */     //   424: astore #18
/*    */     //   426: new java/net/ProtocolException
/*    */     //   429: dup
/*    */     //   430: aload #18
/*    */     //   432: invokevirtual getMessage : ()Ljava/lang/String;
/*    */     //   435: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   438: athrow
/*    */     //   439: aload_0
/*    */     //   440: iload #17
/*    */     //   442: ifeq -> 534
/*    */     //   445: getfield h : J
/*    */     //   448: lconst_0
/*    */     //   449: lcmp
/*    */     //   450: ifne -> 539
/*    */     //   453: goto -> 467
/*    */     //   456: ldc2_w 4612675234569887035
/*    */     //   459: lload #4
/*    */     //   461: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   466: athrow
/*    */     //   467: aload_0
/*    */     //   468: iconst_0
/*    */     //   469: putfield e : Z
/*    */     //   472: aload_0
/*    */     //   473: getfield d : Lme/konsolas/aac/iL;
/*    */     //   476: aload_0
/*    */     //   477: getfield d : Lme/konsolas/aac/iL;
/*    */     //   480: lload #6
/*    */     //   482: dup2_x1
/*    */     //   483: pop2
/*    */     //   484: invokestatic a : (JLme/konsolas/aac/iL;)Lme/konsolas/aac/J;
/*    */     //   487: invokestatic a : (Lme/konsolas/aac/iL;Lme/konsolas/aac/J;)Lme/konsolas/aac/J;
/*    */     //   490: pop
/*    */     //   491: aload_0
/*    */     //   492: getfield d : Lme/konsolas/aac/iL;
/*    */     //   495: invokestatic a : (Lme/konsolas/aac/iL;)Lme/konsolas/aac/gf;
/*    */     //   498: invokevirtual a : ()Lme/konsolas/aac/iD;
/*    */     //   501: aload_0
/*    */     //   502: getfield f : Lme/konsolas/aac/l6;
/*    */     //   505: aload_0
/*    */     //   506: getfield d : Lme/konsolas/aac/iL;
/*    */     //   509: invokestatic b : (Lme/konsolas/aac/iL;)Lme/konsolas/aac/J;
/*    */     //   512: lload #10
/*    */     //   514: dup2_x1
/*    */     //   515: pop2
/*    */     //   516: invokestatic a : (Lme/konsolas/aac/iD;Lme/konsolas/aac/l6;JLme/konsolas/aac/J;)V
/*    */     //   519: aload_0
/*    */     //   520: goto -> 534
/*    */     //   523: ldc2_w 4612675234569887035
/*    */     //   526: lload #4
/*    */     //   528: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   533: athrow
/*    */     //   534: lload #8
/*    */     //   536: invokevirtual a : (J)V
/*    */     //   539: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #7	-> 105
/*    */     //   #12	-> 135
/*    */     //   #25	-> 170
/*    */     //   #39	-> 188
/*    */     //   #1	-> 213
/*    */     //   #31	-> 336
/*    */     //   #27	-> 421
/*    */     //   #28	-> 424
/*    */     //   #34	-> 426
/*    */     //   #32	-> 439
/*    */     //   #35	-> 467
/*    */     //   #36	-> 472
/*    */     //   #17	-> 491
/*    */     //   #40	-> 519
/*    */     //   #24	-> 539
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   105	121	124	java/lang/NumberFormatException
/*    */     //   111	156	159	java/lang/NumberFormatException
/*    */     //   170	421	424	java/lang/NumberFormatException
/*    */     //   213	231	234	java/lang/NumberFormatException
/*    */     //   228	250	253	java/lang/NumberFormatException
/*    */     //   264	276	279	java/lang/NumberFormatException
/*    */     //   273	319	322	java/lang/NumberFormatException
/*    */     //   333	410	410	java/lang/NumberFormatException
/*    */     //   439	453	456	java/lang/NumberFormatException
/*    */     //   445	520	523	java/lang/NumberFormatException
/*    */   }
/*    */   
/*    */   public void close() {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/mo.j : J
/*    */     //   3: ldc2_w 96713346732528
/*    */     //   6: lxor
/*    */     //   7: lstore_1
/*    */     //   8: lload_1
/*    */     //   9: dup2
/*    */     //   10: ldc2_w 52502894423734
/*    */     //   13: lxor
/*    */     //   14: lstore_3
/*    */     //   15: dup2
/*    */     //   16: ldc2_w 138452119830404
/*    */     //   19: lxor
/*    */     //   20: lstore #5
/*    */     //   22: dup2
/*    */     //   23: ldc2_w 138253157346466
/*    */     //   26: lxor
/*    */     //   27: lstore #7
/*    */     //   29: pop2
/*    */     //   30: ldc2_w -4234034677067533675
/*    */     //   33: lload_1
/*    */     //   34: <illegal opcode> w : (JJ)Z
/*    */     //   39: istore #9
/*    */     //   41: aload_0
/*    */     //   42: getfield a : Z
/*    */     //   45: iload #9
/*    */     //   47: ifne -> 89
/*    */     //   50: ifeq -> 67
/*    */     //   53: goto -> 66
/*    */     //   56: ldc2_w -4276743323138582115
/*    */     //   59: lload_1
/*    */     //   60: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   65: athrow
/*    */     //   66: return
/*    */     //   67: aload_0
/*    */     //   68: iload #9
/*    */     //   70: ifne -> 170
/*    */     //   73: getfield e : Z
/*    */     //   76: goto -> 89
/*    */     //   79: ldc2_w -4276743323138582115
/*    */     //   82: lload_1
/*    */     //   83: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   88: athrow
/*    */     //   89: ifeq -> 169
/*    */     //   92: aload_0
/*    */     //   93: bipush #100
/*    */     //   95: iload #9
/*    */     //   97: ifne -> 171
/*    */     //   100: goto -> 113
/*    */     //   103: ldc2_w -4276743323138582115
/*    */     //   106: lload_1
/*    */     //   107: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   112: athrow
/*    */     //   113: getstatic java/util/concurrent/TimeUnit.MILLISECONDS : Ljava/util/concurrent/TimeUnit;
/*    */     //   116: lload #7
/*    */     //   118: dup2_x2
/*    */     //   119: pop2
/*    */     //   120: invokestatic b : (Lme/konsolas/aac/hp;JILjava/util/concurrent/TimeUnit;)Z
/*    */     //   123: ifne -> 169
/*    */     //   126: goto -> 139
/*    */     //   129: ldc2_w -4276743323138582115
/*    */     //   132: lload_1
/*    */     //   133: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   138: athrow
/*    */     //   139: aload_0
/*    */     //   140: getfield d : Lme/konsolas/aac/iL;
/*    */     //   143: invokestatic a : (Lme/konsolas/aac/iL;)Lme/konsolas/aac/el;
/*    */     //   146: lload #5
/*    */     //   148: invokevirtual a : (J)V
/*    */     //   151: aload_0
/*    */     //   152: lload_3
/*    */     //   153: invokevirtual a : (J)V
/*    */     //   156: goto -> 169
/*    */     //   159: ldc2_w -4276743323138582115
/*    */     //   162: lload_1
/*    */     //   163: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   168: athrow
/*    */     //   169: aload_0
/*    */     //   170: iconst_1
/*    */     //   171: putfield a : Z
/*    */     //   174: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #29	-> 41
/*    */     //   #16	-> 67
/*    */     //   #2	-> 139
/*    */     //   #4	-> 151
/*    */     //   #20	-> 169
/*    */     //   #13	-> 174
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   41	53	56	java/io/IOException
/*    */     //   67	76	79	java/io/IOException
/*    */     //   89	100	103	java/io/IOException
/*    */     //   92	126	129	java/io/IOException
/*    */     //   113	156	159	java/io/IOException
/*    */   }
/*    */   
/*    */   static {
/*    */     long l = j ^ 0x52643B699DB4L;
/*    */     "츖㿿㹃럐桛ࣕ땑擭쌫撠络ꈆ㲻㼥挐䢨谏酾໵?伀".toCharArray()[13] = (char)("츖㿿㹃럐桛ࣕ땑擭쌫撠络ꈆ㲻㼥挐䢨谏酾໵?伀".toCharArray()[13] ^ 0x36A3);
/*    */     "烒髓ᤕ剼".toCharArray()[2] = (char)("烒髓ᤕ剼".toCharArray()[2] ^ 0x723C);
/*    */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*    */     for (byte b1 = 1; b1 < 8; b1++)
/*    */       (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
/*    */     Cipher cipher;
/*    */     (cipher = Cipher.getInstance(a0$cc.G("츖㿿㹃럐桛ࣕ땑擭쌫撠络ꈆ㲻㼥挐䢨谏酾໵?伀".toCharArray(), (short)14277, false, (byte)1))).init(2, SecretKeyFactory.getInstance(a0$cc.G("烒髓ᤕ剼".toCharArray(), (short)29370, false, (byte)5)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*    */     String[] arrayOfString = new String[4];
/*    */     boolean bool = false;
/*    */     "왩컔퐗譏袬䖝끇㗭幎?ŋၣ懪প艍渫峋遼卞囖䥐逶뎍ᐇ쏎彻⼗ⷔ츪嫗뛗颂繞瘀˕駷叺锯퍺跚ງ䨽볂缋ꦊ᷹㈸ด洡쿲儠笆꣥꼊ﹲ嬗㲬?঑ꙫ襷侑᪼玴樍戬鍽꼩쾹ঌ眺ὀ㯟㧲蒚借㛕㒃掗즳笒첿憥쮠訆稹鎁路ᩍ萛䔤뾤鳳ꢗ퍌漥ﾄ盤".toCharArray()[40] = (char)("왩컔퐗譏袬䖝끇㗭幎?ŋၣ懪প艍渫峋遼卞囖䥐逶뎍ᐇ쏎彻⼗ⷔ츪嫗뛗颂繞瘀˕駷叺锯퍺跚ງ䨽볂缋ꦊ᷹㈸ด洡쿲儠笆꣥꼊ﹲ嬗㲬?঑ꙫ襷侑᪼玴樍戬鍽꼩쾹ঌ眺ὀ㯟㧲蒚借㛕㒃掗즳笒첿憥쮠訆稹鎁路ᩍ萛䔤뾤鳳ꢗ퍌漥ﾄ盤".toCharArray()[40] ^ 0xF59);
/*    */     String str;
/*    */     int i = (str = a0$cc.G("왩컔퐗譏袬䖝끇㗭幎?ŋၣ懪প艍渫峋遼卞囖䥐逶뎍ᐇ쏎彻⼗ⷔ츪嫗뛗颂繞瘀˕駷叺锯퍺跚ງ䨽볂缋ꦊ᷹㈸ด洡쿲儠笆꣥꼊ﹲ嬗㲬?঑ꙫ襷侑᪼玴樍戬鍽꼩쾹ঌ眺ὀ㯟㧲蒚借㛕㒃掗즳笒첿憥쮠訆稹鎁路ᩍ萛䔤뾤鳳ꢗ퍌漥ﾄ盤".toCharArray(), (short)20723, false, (byte)0)).length();
/*    */     byte b2 = 88;
/*    */     byte b = -1;
/*    */     while (true);
/*    */   }
/*    */   
/*    */   private static Exception a(Exception paramException) {
/*    */     return paramException;
/*    */   }
/*    */   
/*    */   private static String b(byte[] paramArrayOfbyte) {
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
/*    */     int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x7F95;
/*    */     if (m[i] == null) {
/*    */       Object[] arrayOfObject;
/*    */       try {
/*    */         Long long_ = Long.valueOf(Thread.currentThread().getId());
/*    */         arrayOfObject = (Object[])n.get(long_);
/*    */         if (arrayOfObject == null) {
/*    */           arrayOfObject = new Object[3];
/*    */           "婕쫲杜࣫阠뻠쓀飔酞䞊듨屄妙鰘铌硻?䅂ꇼ啯䃊".toCharArray()[15] = (char)("婕쫲杜࣫阠뻠쓀飔酞䞊듨屄妙鰘铌硻?䅂ꇼ啯䃊".toCharArray()[15] ^ 0x866);
/*    */           arrayOfObject[0] = Cipher.getInstance(fW$gy.A("婕쫲杜࣫阠뻠쓀飔酞䞊듨屄妙鰘铌硻?䅂ꇼ啯䃊".toCharArray(), (short)16338, false, 1));
/*    */           "땋蔊ꭙᖣ".toCharArray()[2] = (char)("땋蔊ꭙᖣ".toCharArray()[2] ^ 0x2FA4);
/*    */           arrayOfObject[1] = SecretKeyFactory.getInstance(fW$gy.A("땋蔊ꭙᖣ".toCharArray(), (short)12129, true, 3));
/*    */           arrayOfObject[2] = new IvParameterSpec(new byte[8]);
/*    */           n.put(long_, arrayOfObject);
/*    */         } 
/*    */       } catch (Exception exception) {
/*    */         "䭈꽌袨ൿ꾳䉐㛭㚉鈊확ቡ흆讇?죢璕㠈働".toCharArray()[7] = (char)("䭈꽌袨ൿ꾳䉐㛭㚉鈊확ቡ흆讇?죢璕㠈働".toCharArray()[7] ^ 0x603B);
/*    */         throw new RuntimeException(fW$gy.A("䭈꽌袨ൿ꾳䉐㛭㚉鈊확ቡ흆讇?죢璕㠈働".toCharArray(), (short)30159, true, 5), exception);
/*    */       } 
/*    */       byte[] arrayOfByte1 = new byte[8];
/*    */       arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
/*    */       for (byte b = 1; b < 8; b++)
/*    */         arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
/*    */       DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
/*    */       SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
/*    */       ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
/*    */       "ங໓鸻㨱算⠋ꑣ纁".toCharArray()[7] = (char)("ங໓鸻㨱算⠋ꑣ纁".toCharArray()[7] ^ 0x35A9);
/*    */       byte[] arrayOfByte2 = l[i].getBytes(fW$gy.A("ங໓鸻㨱算⠋ꑣ纁".toCharArray(), (short)32038, true, 4));
/*    */       m[i] = b(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
/*    */     } 
/*    */     return m[i];
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
/*    */     //   66: ldc_w 'ቺ䥠᤽ᛎ꾠纫擇䮣ᨂ㲹仉㊁⻬䄬'
/*    */     //   69: invokevirtual toCharArray : ()[C
/*    */     //   72: dup
/*    */     //   73: dup
/*    */     //   74: iconst_0
/*    */     //   75: dup_x1
/*    */     //   76: caload
/*    */     //   77: sipush #24557
/*    */     //   80: ixor
/*    */     //   81: i2c
/*    */     //   82: castore
/*    */     //   83: sipush #18238
/*    */     //   86: iconst_1
/*    */     //   87: iconst_4
/*    */     //   88: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*    */     //   91: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   94: ldc_w '彋ᬜ痷坂'
/*    */     //   97: invokevirtual toCharArray : ()[C
/*    */     //   100: dup
/*    */     //   101: dup
/*    */     //   102: iconst_1
/*    */     //   103: dup_x1
/*    */     //   104: caload
/*    */     //   105: sipush #18091
/*    */     //   108: ixor
/*    */     //   109: i2c
/*    */     //   110: castore
/*    */     //   111: sipush #19763
/*    */     //   114: iconst_1
/*    */     //   115: iconst_1
/*    */     //   116: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*    */     //   119: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   122: aload_1
/*    */     //   123: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   126: ldc_w 'ؿꆟ︂⩖'
/*    */     //   129: invokevirtual toCharArray : ()[C
/*    */     //   132: dup
/*    */     //   133: dup
/*    */     //   134: iconst_2
/*    */     //   135: dup_x1
/*    */     //   136: caload
/*    */     //   137: sipush #3482
/*    */     //   140: ixor
/*    */     //   141: i2c
/*    */     //   142: castore
/*    */     //   143: sipush #29565
/*    */     //   146: iconst_0
/*    */     //   147: iconst_5
/*    */     //   148: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
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


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\mo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */