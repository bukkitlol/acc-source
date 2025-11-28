/*  1 */ package me.konsolas.aac;final class ac extends aR { private final lR d; private volatile AtomicInteger a; static final boolean f; final bL e; s a() { return this.e.e; }
/*    */    private static final long g; private static final String[] i; private static final String[] j; private static final Map k; bL a() {
/*  3 */     return this.e; } void a(ac paramac) {
/*  4 */     this.a = paramac.a;
/*    */   }
/*    */ 
/*    */   
/*    */   void a(long paramLong, ExecutorService paramExecutorService) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/ac.g : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: lload_1
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 28043322019888
/*    */     //   11: lxor
/*    */     //   12: lstore #4
/*    */     //   14: dup2
/*    */     //   15: ldc2_w 76616553533501
/*    */     //   18: lxor
/*    */     //   19: lstore #6
/*    */     //   21: dup2
/*    */     //   22: ldc2_w 65034834345703
/*    */     //   25: lxor
/*    */     //   26: dup2
/*    */     //   27: bipush #48
/*    */     //   29: lushr
/*    */     //   30: l2i
/*    */     //   31: istore #8
/*    */     //   33: dup2
/*    */     //   34: bipush #16
/*    */     //   36: lshl
/*    */     //   37: bipush #32
/*    */     //   39: lushr
/*    */     //   40: l2i
/*    */     //   41: istore #9
/*    */     //   43: dup2
/*    */     //   44: bipush #48
/*    */     //   46: lshl
/*    */     //   47: bipush #48
/*    */     //   49: lushr
/*    */     //   50: l2i
/*    */     //   51: istore #10
/*    */     //   53: pop2
/*    */     //   54: pop2
/*    */     //   55: ldc2_w 292643395149235405
/*    */     //   58: lload_1
/*    */     //   59: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   64: astore #11
/*    */     //   66: getstatic me/konsolas/aac/ac.f : Z
/*    */     //   69: aload #11
/*    */     //   71: ifnonnull -> 156
/*    */     //   74: ifne -> 155
/*    */     //   77: goto -> 90
/*    */     //   80: ldc2_w 378419279606415640
/*    */     //   83: lload_1
/*    */     //   84: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   89: athrow
/*    */     //   90: aload_0
/*    */     //   91: getfield e : Lme/konsolas/aac/bL;
/*    */     //   94: getfield d : Lme/konsolas/aac/gf;
/*    */     //   97: invokevirtual a : ()Lme/konsolas/aac/jT;
/*    */     //   100: invokestatic holdsLock : (Ljava/lang/Object;)Z
/*    */     //   103: aload #11
/*    */     //   105: ifnonnull -> 156
/*    */     //   108: goto -> 121
/*    */     //   111: ldc2_w 378419279606415640
/*    */     //   114: lload_1
/*    */     //   115: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   120: athrow
/*    */     //   121: ifeq -> 155
/*    */     //   124: goto -> 137
/*    */     //   127: ldc2_w 378419279606415640
/*    */     //   130: lload_1
/*    */     //   131: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   136: athrow
/*    */     //   137: new java/lang/AssertionError
/*    */     //   140: dup
/*    */     //   141: invokespecial <init> : ()V
/*    */     //   144: athrow
/*    */     //   145: ldc2_w 378419279606415640
/*    */     //   148: lload_1
/*    */     //   149: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   154: athrow
/*    */     //   155: iconst_0
/*    */     //   156: istore #12
/*    */     //   158: aload_3
/*    */     //   159: aload_0
/*    */     //   160: invokeinterface execute : (Ljava/lang/Runnable;)V
/*    */     //   165: iconst_1
/*    */     //   166: lload_1
/*    */     //   167: lconst_0
/*    */     //   168: lcmp
/*    */     //   169: ifle -> 181
/*    */     //   172: istore #12
/*    */     //   174: aload #11
/*    */     //   176: ifnonnull -> 226
/*    */     //   179: iload #12
/*    */     //   181: ifne -> 386
/*    */     //   184: goto -> 197
/*    */     //   187: ldc2_w 378419279606415640
/*    */     //   190: lload_1
/*    */     //   191: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   196: athrow
/*    */     //   197: aload_0
/*    */     //   198: getfield e : Lme/konsolas/aac/bL;
/*    */     //   201: getfield d : Lme/konsolas/aac/gf;
/*    */     //   204: invokevirtual a : ()Lme/konsolas/aac/jT;
/*    */     //   207: lload #4
/*    */     //   209: aload_0
/*    */     //   210: invokevirtual b : (JLme/konsolas/aac/ac;)V
/*    */     //   213: goto -> 226
/*    */     //   216: ldc2_w 378419279606415640
/*    */     //   219: lload_1
/*    */     //   220: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   225: athrow
/*    */     //   226: goto -> 386
/*    */     //   229: astore #13
/*    */     //   231: new java/io/InterruptedIOException
/*    */     //   234: dup
/*    */     //   235: sipush #3378
/*    */     //   238: ldc2_w 269495515260431750
/*    */     //   241: lload_1
/*    */     //   242: lxor
/*    */     //   243: <illegal opcode> t : (IJ)Ljava/lang/String;
/*    */     //   248: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   251: astore #14
/*    */     //   253: aload #14
/*    */     //   255: aload #13
/*    */     //   257: invokevirtual initCause : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
/*    */     //   260: pop
/*    */     //   261: aload_0
/*    */     //   262: getfield e : Lme/konsolas/aac/bL;
/*    */     //   265: invokestatic a : (Lme/konsolas/aac/bL;)Lme/konsolas/aac/fO;
/*    */     //   268: aload #14
/*    */     //   270: lload #6
/*    */     //   272: invokevirtual a : (Ljava/io/IOException;J)Ljava/io/IOException;
/*    */     //   275: pop
/*    */     //   276: aload_0
/*    */     //   277: getfield d : Lme/konsolas/aac/lR;
/*    */     //   280: aload_0
/*    */     //   281: getfield e : Lme/konsolas/aac/bL;
/*    */     //   284: iload #8
/*    */     //   286: i2s
/*    */     //   287: aload #14
/*    */     //   289: iload #9
/*    */     //   291: iload #10
/*    */     //   293: i2c
/*    */     //   294: invokeinterface a : (Lme/konsolas/aac/gC;SLjava/io/IOException;IC)V
/*    */     //   299: aload #11
/*    */     //   301: ifnonnull -> 338
/*    */     //   304: iload #12
/*    */     //   306: ifne -> 386
/*    */     //   309: aload_0
/*    */     //   310: getfield e : Lme/konsolas/aac/bL;
/*    */     //   313: getfield d : Lme/konsolas/aac/gf;
/*    */     //   316: invokevirtual a : ()Lme/konsolas/aac/jT;
/*    */     //   319: lload #4
/*    */     //   321: aload_0
/*    */     //   322: invokevirtual b : (JLme/konsolas/aac/ac;)V
/*    */     //   325: goto -> 338
/*    */     //   328: ldc2_w 378419279606415640
/*    */     //   331: lload_1
/*    */     //   332: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   337: athrow
/*    */     //   338: goto -> 386
/*    */     //   341: astore #15
/*    */     //   343: lload_1
/*    */     //   344: lconst_0
/*    */     //   345: lcmp
/*    */     //   346: iflt -> 370
/*    */     //   349: iload #12
/*    */     //   351: ifne -> 383
/*    */     //   354: aload_0
/*    */     //   355: getfield e : Lme/konsolas/aac/bL;
/*    */     //   358: getfield d : Lme/konsolas/aac/gf;
/*    */     //   361: invokevirtual a : ()Lme/konsolas/aac/jT;
/*    */     //   364: lload #4
/*    */     //   366: aload_0
/*    */     //   367: invokevirtual b : (JLme/konsolas/aac/ac;)V
/*    */     //   370: goto -> 383
/*    */     //   373: ldc2_w 378419279606415640
/*    */     //   376: lload_1
/*    */     //   377: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   382: athrow
/*    */     //   383: aload #15
/*    */     //   385: athrow
/*    */     //   386: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #13	-> 66
/*    */     //   #7	-> 155
/*    */     //   #22	-> 158
/*    */     //   #12	-> 165
/*    */     //   #39	-> 174
/*    */     //   #14	-> 197
/*    */     //   #8	-> 229
/*    */     //   #49	-> 231
/*    */     //   #40	-> 253
/*    */     //   #29	-> 261
/*    */     //   #50	-> 276
/*    */     //   #38	-> 299
/*    */     //   #23	-> 309
/*    */     //   #18	-> 341
/*    */     //   #25	-> 354
/*    */     //   #41	-> 386
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   66	77	80	java/util/concurrent/RejectedExecutionException
/*    */     //   74	108	111	java/util/concurrent/RejectedExecutionException
/*    */     //   90	124	127	java/util/concurrent/RejectedExecutionException
/*    */     //   121	145	145	java/util/concurrent/RejectedExecutionException
/*    */     //   158	174	229	java/util/concurrent/RejectedExecutionException
/*    */     //   158	174	341	finally
/*    */     //   174	184	187	java/util/concurrent/RejectedExecutionException
/*    */     //   179	213	216	java/util/concurrent/RejectedExecutionException
/*    */     //   229	299	341	finally
/*    */     //   304	325	328	java/util/concurrent/RejectedExecutionException
/*    */     //   341	343	341	finally
/*    */     //   343	370	373	java/util/concurrent/RejectedExecutionException
/*    */   }
/*    */ 
/*    */   
/*    */   static {
/*    */     long l;
/*    */     byte b1;
/* 16 */     for (g = nc.a(1979871934076468088L, -5763836787274329316L, MethodHandles.lookup().lookupClass()).a(265723251978953L), k = new HashMap<>(13), l = g ^ 0x9699A914509L, "䶎＞蕪蚭䰤ꍃ쭢୫胾䵆ᥭ㿶躺䇳﬷ㄵₕ".toCharArray()[16] = (char)("䶎＞蕪蚭䰤ꍃ쭢୫胾䵆ᥭ㿶躺䇳﬷ㄵₕ".toCharArray()[16] ^ 0x616B), "즢鷎鐤秨".toCharArray()[2] = (char)("즢鷎鐤秨".toCharArray()[2] ^ 0x185F), (new byte[8])[0] = (byte)(int)(l >>> 56L), b1 = 1; b1 < 8; ) { (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); b1++; }  Cipher cipher; (cipher = Cipher.getInstance(a0$cc.G("䶎＞蕪蚭䰤ꍃ쭢୫胾䵆ᥭ㿶躺䇳﬷ㄵₕ".toCharArray(), (short)26269, false, (byte)3))).init(2, SecretKeyFactory.getInstance(a0$cc.G("즢鷎鐤秨".toCharArray(), (short)5357, false, (byte)4)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8])); String[] arrayOfString = new String[4]; boolean bool = false; "跰약锝甒紕⑪⃨꽸칃뉴蓰﯁밁籋榁淭煟ᮀ퐈䁻蜜轌ꅪኊ摂ꨘ⌯ৢ㲝寑꣒呐ꠃ?ꎑ튌⢚?攡扴泲䯇≧￠લ袁ￍ癒轅潖᛾젶輭ㅣ賓ำ➸嶸".toCharArray()[3] = (char)("跰약锝甒紕⑪⃨꽸칃뉴蓰﯁밁籋榁淭煟ᮀ퐈䁻蜜轌ꅪኊ摂ꨘ⌯ৢ㲝寑꣒呐ꠃ?ꎑ튌⢚?攡扴泲䯇≧￠લ袁ￍ癒轅潖᛾젶輭ㅣ賓ำ➸嶸".toCharArray()[3] ^ 0x56E3); String str; int i = (str = a0$cc.G("跰약锝甒紕⑪⃨꽸칃뉴蓰﯁밁籋榁淭煟ᮀ퐈䁻蜜轌ꅪኊ摂ꨘ⌯ৢ㲝寑꣒呐ꠃ?ꎑ튌⢚?攡扴泲䯇≧￠લ袁ￍ癒轅潖᛾젶輭ㅣ賓ำ➸嶸".toCharArray(), (short)22095, false, (byte)3)).length(); byte b2 = 24; byte b = -1; while (true); throw a(-1);
/*    */   }
/*    */   String a() {
/* 19 */     return this.e.e.a().d();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   ac(bL parambL, long paramLong, lR paramlR) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/ac.g : J
/*    */     //   3: lload_2
/*    */     //   4: lxor
/*    */     //   5: lstore_2
/*    */     //   6: lload_2
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 83872853229716
/*    */     //   11: lxor
/*    */     //   12: lstore #5
/*    */     //   14: pop2
/*    */     //   15: aload_0
/*    */     //   16: aload_1
/*    */     //   17: putfield e : Lme/konsolas/aac/bL;
/*    */     //   20: aload_0
/*    */     //   21: sipush #20500
/*    */     //   24: ldc2_w 2133662642741407195
/*    */     //   27: lload_2
/*    */     //   28: lxor
/*    */     //   29: <illegal opcode> t : (IJ)Ljava/lang/String;
/*    */     //   34: iconst_1
/*    */     //   35: anewarray java/lang/Object
/*    */     //   38: dup
/*    */     //   39: iconst_0
/*    */     //   40: aload_1
/*    */     //   41: lload #5
/*    */     //   43: invokevirtual b : (J)Ljava/lang/String;
/*    */     //   46: aastore
/*    */     //   47: invokespecial <init> : (Ljava/lang/String;[Ljava/lang/Object;)V
/*    */     //   50: aload_0
/*    */     //   51: new java/util/concurrent/atomic/AtomicInteger
/*    */     //   54: dup
/*    */     //   55: iconst_0
/*    */     //   56: invokespecial <init> : (I)V
/*    */     //   59: putfield a : Ljava/util/concurrent/atomic/AtomicInteger;
/*    */     //   62: aload_0
/*    */     //   63: aload #4
/*    */     //   65: putfield d : Lme/konsolas/aac/lR;
/*    */     //   68: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #21	-> 15
/*    */     //   #36	-> 20
/*    */     //   #30	-> 50
/*    */     //   #27	-> 62
/*    */     //   #32	-> 68
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void b(long paramLong) {
/*    */     // Byte code:
/*    */     //   0: lload_1
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 99138115367872
/*    */     //   5: lxor
/*    */     //   6: dup2
/*    */     //   7: bipush #32
/*    */     //   9: lushr
/*    */     //   10: l2i
/*    */     //   11: istore_3
/*    */     //   12: dup2
/*    */     //   13: bipush #32
/*    */     //   15: lshl
/*    */     //   16: bipush #48
/*    */     //   18: lushr
/*    */     //   19: l2i
/*    */     //   20: istore #4
/*    */     //   22: dup2
/*    */     //   23: bipush #48
/*    */     //   25: lshl
/*    */     //   26: bipush #48
/*    */     //   28: lushr
/*    */     //   29: l2i
/*    */     //   30: istore #5
/*    */     //   32: pop2
/*    */     //   33: dup2
/*    */     //   34: ldc2_w 90104664627388
/*    */     //   37: lxor
/*    */     //   38: lstore #6
/*    */     //   40: dup2
/*    */     //   41: ldc2_w 135378257933399
/*    */     //   44: lxor
/*    */     //   45: dup2
/*    */     //   46: bipush #32
/*    */     //   48: lushr
/*    */     //   49: l2i
/*    */     //   50: istore #8
/*    */     //   52: dup2
/*    */     //   53: bipush #32
/*    */     //   55: lshl
/*    */     //   56: bipush #48
/*    */     //   58: lushr
/*    */     //   59: l2i
/*    */     //   60: istore #9
/*    */     //   62: dup2
/*    */     //   63: bipush #48
/*    */     //   65: lshl
/*    */     //   66: bipush #48
/*    */     //   68: lushr
/*    */     //   69: l2i
/*    */     //   70: istore #10
/*    */     //   72: pop2
/*    */     //   73: dup2
/*    */     //   74: ldc2_w 139885285457796
/*    */     //   77: lxor
/*    */     //   78: lstore #11
/*    */     //   80: dup2
/*    */     //   81: ldc2_w 124465044906474
/*    */     //   84: lxor
/*    */     //   85: dup2
/*    */     //   86: bipush #32
/*    */     //   88: lushr
/*    */     //   89: l2i
/*    */     //   90: istore #13
/*    */     //   92: dup2
/*    */     //   93: bipush #32
/*    */     //   95: lshl
/*    */     //   96: bipush #48
/*    */     //   98: lushr
/*    */     //   99: l2i
/*    */     //   100: istore #14
/*    */     //   102: dup2
/*    */     //   103: bipush #48
/*    */     //   105: lshl
/*    */     //   106: bipush #48
/*    */     //   108: lushr
/*    */     //   109: l2i
/*    */     //   110: istore #15
/*    */     //   112: pop2
/*    */     //   113: dup2
/*    */     //   114: ldc2_w 126855851040050
/*    */     //   117: lxor
/*    */     //   118: lstore #16
/*    */     //   120: dup2
/*    */     //   121: ldc2_w 75805100074224
/*    */     //   124: lxor
/*    */     //   125: lstore #18
/*    */     //   127: dup2
/*    */     //   128: ldc2_w 102936788210003
/*    */     //   131: lxor
/*    */     //   132: dup2
/*    */     //   133: bipush #48
/*    */     //   135: lushr
/*    */     //   136: l2i
/*    */     //   137: istore #20
/*    */     //   139: dup2
/*    */     //   140: bipush #16
/*    */     //   142: lshl
/*    */     //   143: bipush #32
/*    */     //   145: lushr
/*    */     //   146: l2i
/*    */     //   147: istore #21
/*    */     //   149: dup2
/*    */     //   150: bipush #48
/*    */     //   152: lshl
/*    */     //   153: bipush #48
/*    */     //   155: lushr
/*    */     //   156: l2i
/*    */     //   157: istore #22
/*    */     //   159: pop2
/*    */     //   160: pop2
/*    */     //   161: ldc2_w -1460350286840403079
/*    */     //   164: lload_1
/*    */     //   165: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   170: iconst_0
/*    */     //   171: istore #24
/*    */     //   173: aload_0
/*    */     //   174: getfield e : Lme/konsolas/aac/bL;
/*    */     //   177: invokestatic a : (Lme/konsolas/aac/bL;)Lme/konsolas/aac/fO;
/*    */     //   180: iload_3
/*    */     //   181: iload #4
/*    */     //   183: iload #5
/*    */     //   185: invokevirtual e : (III)V
/*    */     //   188: astore #23
/*    */     //   190: aload_0
/*    */     //   191: getfield e : Lme/konsolas/aac/bL;
/*    */     //   194: iload #8
/*    */     //   196: iload #9
/*    */     //   198: i2s
/*    */     //   199: iload #10
/*    */     //   201: i2s
/*    */     //   202: invokevirtual b : (ISS)Lme/konsolas/aac/H;
/*    */     //   205: astore #25
/*    */     //   207: iconst_1
/*    */     //   208: istore #24
/*    */     //   210: aload_0
/*    */     //   211: getfield d : Lme/konsolas/aac/lR;
/*    */     //   214: aload_0
/*    */     //   215: getfield e : Lme/konsolas/aac/bL;
/*    */     //   218: lload #6
/*    */     //   220: aload #25
/*    */     //   222: invokeinterface a : (Lme/konsolas/aac/gC;JLme/konsolas/aac/H;)V
/*    */     //   227: aload_0
/*    */     //   228: getfield e : Lme/konsolas/aac/bL;
/*    */     //   231: getfield d : Lme/konsolas/aac/gf;
/*    */     //   234: invokevirtual a : ()Lme/konsolas/aac/jT;
/*    */     //   237: lload #11
/*    */     //   239: aload_0
/*    */     //   240: invokevirtual b : (JLme/konsolas/aac/ac;)V
/*    */     //   243: goto -> 523
/*    */     //   246: astore #25
/*    */     //   248: aload #23
/*    */     //   250: lload_1
/*    */     //   251: lconst_0
/*    */     //   252: lcmp
/*    */     //   253: iflt -> 355
/*    */     //   256: ifnonnull -> 347
/*    */     //   259: iload #24
/*    */     //   261: ifeq -> 358
/*    */     //   264: goto -> 277
/*    */     //   267: ldc2_w -1516572963584250196
/*    */     //   270: lload_1
/*    */     //   271: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   276: athrow
/*    */     //   277: invokestatic c : ()Lme/konsolas/aac/io;
/*    */     //   280: iconst_4
/*    */     //   281: new java/lang/StringBuilder
/*    */     //   284: dup
/*    */     //   285: invokespecial <init> : ()V
/*    */     //   288: sipush #12223
/*    */     //   291: ldc2_w 4735165366732775614
/*    */     //   294: lload_1
/*    */     //   295: lxor
/*    */     //   296: <illegal opcode> t : (IJ)Ljava/lang/String;
/*    */     //   301: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   304: aload_0
/*    */     //   305: getfield e : Lme/konsolas/aac/bL;
/*    */     //   308: lload #16
/*    */     //   310: invokevirtual a : (J)Ljava/lang/String;
/*    */     //   313: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   316: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   319: iload #13
/*    */     //   321: swap
/*    */     //   322: iload #14
/*    */     //   324: i2c
/*    */     //   325: swap
/*    */     //   326: iload #15
/*    */     //   328: i2s
/*    */     //   329: aload #25
/*    */     //   331: invokevirtual a : (IICLjava/lang/String;SLjava/lang/Throwable;)V
/*    */     //   334: goto -> 347
/*    */     //   337: ldc2_w -1516572963584250196
/*    */     //   340: lload_1
/*    */     //   341: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   346: athrow
/*    */     //   347: lload_1
/*    */     //   348: lconst_0
/*    */     //   349: lcmp
/*    */     //   350: iflt -> 410
/*    */     //   353: aload #23
/*    */     //   355: ifnull -> 394
/*    */     //   358: aload_0
/*    */     //   359: getfield d : Lme/konsolas/aac/lR;
/*    */     //   362: aload_0
/*    */     //   363: getfield e : Lme/konsolas/aac/bL;
/*    */     //   366: iload #20
/*    */     //   368: i2s
/*    */     //   369: aload #25
/*    */     //   371: iload #21
/*    */     //   373: iload #22
/*    */     //   375: i2c
/*    */     //   376: invokeinterface a : (Lme/konsolas/aac/gC;SLjava/io/IOException;IC)V
/*    */     //   381: goto -> 394
/*    */     //   384: ldc2_w -1516572963584250196
/*    */     //   387: lload_1
/*    */     //   388: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   393: athrow
/*    */     //   394: aload_0
/*    */     //   395: getfield e : Lme/konsolas/aac/bL;
/*    */     //   398: getfield d : Lme/konsolas/aac/gf;
/*    */     //   401: invokevirtual a : ()Lme/konsolas/aac/jT;
/*    */     //   404: lload #11
/*    */     //   406: aload_0
/*    */     //   407: invokevirtual b : (JLme/konsolas/aac/ac;)V
/*    */     //   410: goto -> 523
/*    */     //   413: astore #25
/*    */     //   415: aload_0
/*    */     //   416: getfield e : Lme/konsolas/aac/bL;
/*    */     //   419: lload #18
/*    */     //   421: invokevirtual a : (J)V
/*    */     //   424: iload #24
/*    */     //   426: ifne -> 499
/*    */     //   429: new java/io/IOException
/*    */     //   432: dup
/*    */     //   433: new java/lang/StringBuilder
/*    */     //   436: dup
/*    */     //   437: invokespecial <init> : ()V
/*    */     //   440: sipush #25155
/*    */     //   443: ldc2_w 1764512651427753281
/*    */     //   446: lload_1
/*    */     //   447: lxor
/*    */     //   448: <illegal opcode> t : (IJ)Ljava/lang/String;
/*    */     //   453: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   456: aload #25
/*    */     //   458: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   461: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   464: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   467: astore #26
/*    */     //   469: aload #26
/*    */     //   471: aload #25
/*    */     //   473: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
/*    */     //   476: aload_0
/*    */     //   477: getfield d : Lme/konsolas/aac/lR;
/*    */     //   480: aload_0
/*    */     //   481: getfield e : Lme/konsolas/aac/bL;
/*    */     //   484: iload #20
/*    */     //   486: i2s
/*    */     //   487: aload #26
/*    */     //   489: iload #21
/*    */     //   491: iload #22
/*    */     //   493: i2c
/*    */     //   494: invokeinterface a : (Lme/konsolas/aac/gC;SLjava/io/IOException;IC)V
/*    */     //   499: aload #25
/*    */     //   501: athrow
/*    */     //   502: astore #27
/*    */     //   504: aload_0
/*    */     //   505: getfield e : Lme/konsolas/aac/bL;
/*    */     //   508: getfield d : Lme/konsolas/aac/gf;
/*    */     //   511: invokevirtual a : ()Lme/konsolas/aac/jT;
/*    */     //   514: lload #11
/*    */     //   516: aload_0
/*    */     //   517: invokevirtual b : (JLme/konsolas/aac/ac;)V
/*    */     //   520: aload #27
/*    */     //   522: athrow
/*    */     //   523: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #42	-> 170
/*    */     //   #37	-> 173
/*    */     //   #20	-> 190
/*    */     //   #11	-> 207
/*    */     //   #43	-> 210
/*    */     //   #24	-> 227
/*    */     //   #46	-> 243
/*    */     //   #45	-> 246
/*    */     //   #15	-> 248
/*    */     //   #2	-> 277
/*    */     //   #34	-> 358
/*    */     //   #44	-> 394
/*    */     //   #28	-> 410
/*    */     //   #31	-> 413
/*    */     //   #48	-> 415
/*    */     //   #9	-> 424
/*    */     //   #33	-> 429
/*    */     //   #10	-> 469
/*    */     //   #5	-> 476
/*    */     //   #6	-> 499
/*    */     //   #35	-> 502
/*    */     //   #17	-> 523
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   190	227	246	java/io/IOException
/*    */     //   190	227	413	java/lang/Throwable
/*    */     //   190	227	502	finally
/*    */     //   246	394	502	finally
/*    */     //   248	264	267	java/io/IOException
/*    */     //   259	334	337	java/io/IOException
/*    */     //   347	381	384	java/io/IOException
/*    */     //   413	504	502	finally
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   AtomicInteger a() {
/* 47 */     return this.a;
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
/*    */     int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x245C;
/*    */     if (j[i] == null) {
/*    */       Object[] arrayOfObject;
/*    */       try {
/*    */         Long long_ = Long.valueOf(Thread.currentThread().getId());
/*    */         arrayOfObject = (Object[])k.get(long_);
/*    */         if (arrayOfObject == null) {
/*    */           arrayOfObject = new Object[3];
/*    */           "肉ջ㻑渺᤻㗯㏠馫౸飛옫돥檛앻跹?䏦Ŀ褐?࢝".toCharArray()[3] = (char)("肉ջ㻑渺᤻㗯㏠馫౸飛옫돥檛앻跹?䏦Ŀ褐?࢝".toCharArray()[3] ^ 0x317);
/*    */           arrayOfObject[0] = Cipher.getInstance(a0$cc.G("肉ջ㻑渺᤻㗯㏠馫౸飛옫돥檛앻跹?䏦Ŀ褐?࢝".toCharArray(), (short)25606, false, (byte)0));
/*    */           "虸⏚㷛๶".toCharArray()[0] = (char)("虸⏚㷛๶".toCharArray()[0] ^ 0x228C);
/*    */           arrayOfObject[1] = SecretKeyFactory.getInstance(a0$cc.G("虸⏚㷛๶".toCharArray(), (short)18406, false, (byte)3));
/*    */           arrayOfObject[2] = new IvParameterSpec(new byte[8]);
/*    */           k.put(long_, arrayOfObject);
/*    */         } 
/*    */       } catch (Exception exception) {
/*    */         "ﲍ햫ᄑ໒墁郤̂‪죅〚鋟劮춗鞬㊊ꮘ祖⠅癳".toCharArray()[11] = (char)("ﲍ햫ᄑ໒墁郤̂‪죅〚鋟劮춗鞬㊊ꮘ祖⠅癳".toCharArray()[11] ^ 0xFCA);
/*    */         throw new RuntimeException(a0$cc.G("ﲍ햫ᄑ໒墁郤̂‪죅〚鋟劮춗鞬㊊ꮘ祖⠅癳".toCharArray(), (short)7082, true, (byte)3), exception);
/*    */       } 
/*    */       byte[] arrayOfByte1 = new byte[8];
/*    */       arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
/*    */       for (byte b = 1; b < 8; b++)
/*    */         arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
/*    */       DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
/*    */       SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
/*    */       ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
/*    */       "霍❋椄䍷鹺葷㷫㿿葾⇤".toCharArray()[9] = (char)("霍❋椄䍷鹺葷㷫㿿葾⇤".toCharArray()[9] ^ 0x2B97);
/*    */       byte[] arrayOfByte2 = i[i].getBytes(a0$cc.G("霍❋椄䍷鹺葷㷫㿿葾⇤".toCharArray(), (short)2638, false, (byte)4));
/*    */       j[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
/*    */     } 
/*    */     return j[i];
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
/*    */     //   66: ldc_w '썄譿⧅ﰐ㑯첒㦦룽笘▝髷谀␋덭踦杅'
/*    */     //   69: invokevirtual toCharArray : ()[C
/*    */     //   72: dup
/*    */     //   73: dup
/*    */     //   74: iconst_2
/*    */     //   75: dup_x1
/*    */     //   76: caload
/*    */     //   77: sipush #7399
/*    */     //   80: ixor
/*    */     //   81: i2c
/*    */     //   82: castore
/*    */     //   83: sipush #24047
/*    */     //   86: iconst_1
/*    */     //   87: iconst_1
/*    */     //   88: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   91: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   94: ldc_w '习踭ⳳ'
/*    */     //   97: invokevirtual toCharArray : ()[C
/*    */     //   100: dup
/*    */     //   101: dup
/*    */     //   102: iconst_2
/*    */     //   103: dup_x1
/*    */     //   104: caload
/*    */     //   105: sipush #29729
/*    */     //   108: ixor
/*    */     //   109: i2c
/*    */     //   110: castore
/*    */     //   111: sipush #30878
/*    */     //   114: iconst_0
/*    */     //   115: iconst_0
/*    */     //   116: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   119: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   122: aload_1
/*    */     //   123: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   126: ldc_w '濺쓑Ɛ'
/*    */     //   129: invokevirtual toCharArray : ()[C
/*    */     //   132: dup
/*    */     //   133: dup
/*    */     //   134: iconst_0
/*    */     //   135: dup_x1
/*    */     //   136: caload
/*    */     //   137: sipush #17144
/*    */     //   140: ixor
/*    */     //   141: i2c
/*    */     //   142: castore
/*    */     //   143: sipush #23200
/*    */     //   146: iconst_0
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
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ac.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */