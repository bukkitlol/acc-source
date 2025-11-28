/*    */ package me.konsolas.aac;
/*    */ public abstract class d2 implements Closeable { @Nullable
/*    */   private Reader a; private static final long g = nc.a(-7600930712453479708L, 7480614247934623038L, MethodHandles.lookup().lookupClass()).a(87590119639173L);
/*    */   private static final String[] h;
/*    */   
/*  6 */   public final InputStream a() { return a().a(); }
/*    */   private static final String[] i; private static final Map j = new HashMap<>(13); public static d2 a(@Nullable mm parammm, long paramLong, String paramString) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/d2.g : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: lload_1
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 63040032096137
/*    */     //   11: lxor
/*    */     //   12: lstore #4
/*    */     //   14: dup2
/*    */     //   15: ldc2_w 72841608534658
/*    */     //   18: lxor
/*    */     //   19: lstore #6
/*    */     //   21: dup2
/*    */     //   22: ldc2_w 29626977033735
/*    */     //   25: lxor
/*    */     //   26: dup2
/*    */     //   27: bipush #32
/*    */     //   29: lushr
/*    */     //   30: l2i
/*    */     //   31: istore #8
/*    */     //   33: dup2
/*    */     //   34: bipush #32
/*    */     //   36: lshl
/*    */     //   37: bipush #48
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
/*    */     //   54: dup2
/*    */     //   55: ldc2_w 61624312543503
/*    */     //   58: lxor
/*    */     //   59: dup2
/*    */     //   60: bipush #48
/*    */     //   62: lushr
/*    */     //   63: l2i
/*    */     //   64: istore #11
/*    */     //   66: dup2
/*    */     //   67: bipush #16
/*    */     //   69: lshl
/*    */     //   70: bipush #16
/*    */     //   72: lushr
/*    */     //   73: lstore #12
/*    */     //   75: pop2
/*    */     //   76: pop2
/*    */     //   77: ldc2_w 8964399219362921637
/*    */     //   80: lload_1
/*    */     //   81: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   86: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
/*    */     //   89: astore #15
/*    */     //   91: astore #14
/*    */     //   93: aload_0
/*    */     //   94: aload #14
/*    */     //   96: ifnonnull -> 116
/*    */     //   99: ifnull -> 193
/*    */     //   102: goto -> 115
/*    */     //   105: ldc2_w 8958697969809481365
/*    */     //   108: lload_1
/*    */     //   109: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   114: athrow
/*    */     //   115: aload_0
/*    */     //   116: lload #4
/*    */     //   118: invokevirtual a : (J)Ljava/nio/charset/Charset;
/*    */     //   121: astore #15
/*    */     //   123: lload_1
/*    */     //   124: lconst_0
/*    */     //   125: lcmp
/*    */     //   126: iflt -> 157
/*    */     //   129: aload #15
/*    */     //   131: aload #14
/*    */     //   133: ifnonnull -> 155
/*    */     //   136: ifnonnull -> 193
/*    */     //   139: goto -> 152
/*    */     //   142: ldc2_w 8958697969809481365
/*    */     //   145: lload_1
/*    */     //   146: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   151: athrow
/*    */     //   152: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
/*    */     //   155: astore #15
/*    */     //   157: new java/lang/StringBuilder
/*    */     //   160: dup
/*    */     //   161: invokespecial <init> : ()V
/*    */     //   164: aload_0
/*    */     //   165: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   168: sipush #31369
/*    */     //   171: ldc2_w 5991396427018961237
/*    */     //   174: lload_1
/*    */     //   175: lxor
/*    */     //   176: <illegal opcode> v : (IJ)Ljava/lang/String;
/*    */     //   181: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   184: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   187: lload #6
/*    */     //   189: invokestatic b : (Ljava/lang/String;J)Lme/konsolas/aac/mm;
/*    */     //   192: astore_0
/*    */     //   193: new me/konsolas/aac/fw
/*    */     //   196: dup
/*    */     //   197: invokespecial <init> : ()V
/*    */     //   200: iload #8
/*    */     //   202: aload_3
/*    */     //   203: iload #9
/*    */     //   205: i2s
/*    */     //   206: iload #10
/*    */     //   208: i2c
/*    */     //   209: aload #15
/*    */     //   211: invokevirtual a : (ILjava/lang/String;SCLjava/nio/charset/Charset;)Lme/konsolas/aac/fw;
/*    */     //   214: astore #16
/*    */     //   216: aload_0
/*    */     //   217: aload #16
/*    */     //   219: invokevirtual f : ()J
/*    */     //   222: aload #16
/*    */     //   224: iload #11
/*    */     //   226: i2s
/*    */     //   227: lload #12
/*    */     //   229: invokestatic a : (Lme/konsolas/aac/mm;JLme/konsolas/aac/bX;SJ)Lme/konsolas/aac/d2;
/*    */     //   232: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #5	-> 86
/*    */     //   #41	-> 93
/*    */     //   #25	-> 115
/*    */     //   #11	-> 123
/*    */     //   #28	-> 152
/*    */     //   #31	-> 157
/*    */     //   #29	-> 193
/*    */     //   #4	-> 216
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   93	102	105	java/lang/NullPointerException
/*    */     //   123	139	142	java/lang/NullPointerException } public void close() {
/*  8 */     long l1 = g ^ 0x21A715F39556L, l2 = l1 ^ 0x2A90BEA9CBB9L; eO.a(l2, a());
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private Charset a(long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/d2.g : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: lload_1
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 20133394360697
/*    */     //   11: lxor
/*    */     //   12: dup2
/*    */     //   13: bipush #48
/*    */     //   15: lushr
/*    */     //   16: l2i
/*    */     //   17: istore_3
/*    */     //   18: dup2
/*    */     //   19: bipush #16
/*    */     //   21: lshl
/*    */     //   22: bipush #48
/*    */     //   24: lushr
/*    */     //   25: l2i
/*    */     //   26: istore #4
/*    */     //   28: dup2
/*    */     //   29: bipush #32
/*    */     //   31: lshl
/*    */     //   32: bipush #32
/*    */     //   34: lushr
/*    */     //   35: l2i
/*    */     //   36: istore #5
/*    */     //   38: pop2
/*    */     //   39: dup2
/*    */     //   40: ldc2_w 63590996150209
/*    */     //   43: lxor
/*    */     //   44: lstore #6
/*    */     //   46: pop2
/*    */     //   47: ldc2_w 1488668086175994986
/*    */     //   50: lload_1
/*    */     //   51: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   56: aload_0
/*    */     //   57: iload_3
/*    */     //   58: i2c
/*    */     //   59: iload #4
/*    */     //   61: i2c
/*    */     //   62: iload #5
/*    */     //   64: invokevirtual a : (CCI)Lme/konsolas/aac/mm;
/*    */     //   67: astore #9
/*    */     //   69: astore #8
/*    */     //   71: aload #9
/*    */     //   73: aload #8
/*    */     //   75: ifnonnull -> 96
/*    */     //   78: ifnull -> 107
/*    */     //   81: goto -> 94
/*    */     //   84: ldc2_w 1485218597848528474
/*    */     //   87: lload_1
/*    */     //   88: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   93: athrow
/*    */     //   94: aload #9
/*    */     //   96: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
/*    */     //   99: lload #6
/*    */     //   101: invokevirtual a : (Ljava/nio/charset/Charset;J)Ljava/nio/charset/Charset;
/*    */     //   104: goto -> 110
/*    */     //   107: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
/*    */     //   110: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #16	-> 56
/*    */     //   #22	-> 71
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   71	81	84	java/lang/NullPointerException
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public final String a(long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/d2.g : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: lload_1
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 63649645975507
/*    */     //   11: lxor
/*    */     //   12: lstore_3
/*    */     //   13: dup2
/*    */     //   14: ldc2_w 67914849025760
/*    */     //   17: lxor
/*    */     //   18: lstore #5
/*    */     //   20: dup2
/*    */     //   21: ldc2_w 79834507415891
/*    */     //   24: lxor
/*    */     //   25: lstore #7
/*    */     //   27: dup2
/*    */     //   28: ldc2_w 113128324460968
/*    */     //   31: lxor
/*    */     //   32: lstore #9
/*    */     //   34: pop2
/*    */     //   35: aload_0
/*    */     //   36: invokevirtual a : ()Lme/konsolas/aac/bX;
/*    */     //   39: astore #11
/*    */     //   41: aconst_null
/*    */     //   42: astore #12
/*    */     //   44: aload #11
/*    */     //   46: aload_0
/*    */     //   47: lload #5
/*    */     //   49: invokespecial a : (J)Ljava/nio/charset/Charset;
/*    */     //   52: lload #9
/*    */     //   54: invokestatic a : (Lme/konsolas/aac/bX;Ljava/nio/charset/Charset;J)Ljava/nio/charset/Charset;
/*    */     //   57: astore #13
/*    */     //   59: aload #11
/*    */     //   61: aload #13
/*    */     //   63: lload_3
/*    */     //   64: invokeinterface a : (Ljava/nio/charset/Charset;J)Ljava/lang/String;
/*    */     //   69: astore #14
/*    */     //   71: aload #11
/*    */     //   73: ifnull -> 98
/*    */     //   76: lload #7
/*    */     //   78: aload #12
/*    */     //   80: aload #11
/*    */     //   82: invokestatic a : (JLjava/lang/Throwable;Ljava/lang/AutoCloseable;)V
/*    */     //   85: goto -> 98
/*    */     //   88: ldc2_w 5896852524930364179
/*    */     //   91: lload_1
/*    */     //   92: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   97: athrow
/*    */     //   98: aload #14
/*    */     //   100: areturn
/*    */     //   101: astore #13
/*    */     //   103: aload #13
/*    */     //   105: astore #12
/*    */     //   107: aload #13
/*    */     //   109: athrow
/*    */     //   110: astore #15
/*    */     //   112: lload_1
/*    */     //   113: lconst_0
/*    */     //   114: lcmp
/*    */     //   115: iflt -> 132
/*    */     //   118: aload #11
/*    */     //   120: ifnull -> 145
/*    */     //   123: lload #7
/*    */     //   125: aload #12
/*    */     //   127: aload #11
/*    */     //   129: invokestatic a : (JLjava/lang/Throwable;Ljava/lang/AutoCloseable;)V
/*    */     //   132: goto -> 145
/*    */     //   135: ldc2_w 5896852524930364179
/*    */     //   138: lload_1
/*    */     //   139: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   144: athrow
/*    */     //   145: aload #15
/*    */     //   147: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #20	-> 35
/*    */     //   #21	-> 44
/*    */     //   #14	-> 59
/*    */     //   #2	-> 71
/*    */     //   #3	-> 98
/*    */     //   #7	-> 101
/*    */     //   #38	-> 110
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   44	71	101	java/lang/Throwable
/*    */     //   44	71	110	finally
/*    */     //   71	85	88	java/lang/Throwable
/*    */     //   101	112	110	finally
/*    */     //   112	132	135	java/lang/Throwable
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static d2 a(@Nullable mm parammm, long paramLong1, bX parambX, short paramShort, long paramLong2) {
/*    */     // Byte code:
/*    */     //   0: iload #4
/*    */     //   2: i2l
/*    */     //   3: bipush #48
/*    */     //   5: lshl
/*    */     //   6: lload #5
/*    */     //   8: bipush #16
/*    */     //   10: lshl
/*    */     //   11: bipush #16
/*    */     //   13: lushr
/*    */     //   14: lor
/*    */     //   15: getstatic me/konsolas/aac/d2.g : J
/*    */     //   18: lxor
/*    */     //   19: lstore #7
/*    */     //   21: aload_3
/*    */     //   22: ifnonnull -> 58
/*    */     //   25: new java/lang/NullPointerException
/*    */     //   28: dup
/*    */     //   29: sipush #15846
/*    */     //   32: ldc2_w 7866222450381309086
/*    */     //   35: lload #7
/*    */     //   37: lxor
/*    */     //   38: <illegal opcode> v : (IJ)Ljava/lang/String;
/*    */     //   43: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   46: athrow
/*    */     //   47: ldc2_w 9148481880754412595
/*    */     //   50: lload #7
/*    */     //   52: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   57: athrow
/*    */     //   58: new me/konsolas/aac/d5
/*    */     //   61: dup
/*    */     //   62: aload_0
/*    */     //   63: lload_1
/*    */     //   64: aload_3
/*    */     //   65: invokespecial <init> : (Lme/konsolas/aac/mm;JLme/konsolas/aac/bX;)V
/*    */     //   68: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #24	-> 21
/*    */     //   #30	-> 58
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   21	47	47	java/lang/NullPointerException
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static d2 a(long paramLong, @Nullable mm parammm, byte[] paramArrayOfbyte) {
/* 32 */     paramLong = g ^ paramLong; int i = (int)((paramLong ^ 0x22C9716C6117L) >>> 48L); long l = (paramLong ^ 0x22C9716C6117L) << 16L >>> 16L; paramLong ^ 0x22C9716C6117L; int j = (int)((paramLong ^ 0x4247082C2C7L) >>> 32L), k = (int)((paramLong ^ 0x4247082C2C7L) << 32L >>> 48L), m = (int)((paramLong ^ 0x4247082C2C7L) << 48L >>> 48L); paramLong ^ 0x4247082C2C7L; fw fw = (new fw()).a(j, (char)k, (char)m, paramArrayOfbyte);
/*    */     
/* 34 */     return a(parammm, paramArrayOfbyte.length, fw, (short)i, l);
/*    */   } public final byte[] a(int paramInt1, byte paramByte, int paramInt2) { // Byte code:
/*    */     //   0: iload_1
/*    */     //   1: i2l
/*    */     //   2: bipush #32
/*    */     //   4: lshl
/*    */     //   5: iload_2
/*    */     //   6: i2l
/*    */     //   7: bipush #56
/*    */     //   9: lshl
/*    */     //   10: bipush #32
/*    */     //   12: lushr
/*    */     //   13: lor
/*    */     //   14: iload_3
/*    */     //   15: i2l
/*    */     //   16: bipush #40
/*    */     //   18: lshl
/*    */     //   19: bipush #40
/*    */     //   21: lushr
/*    */     //   22: lor
/*    */     //   23: getstatic me/konsolas/aac/d2.g : J
/*    */     //   26: lxor
/*    */     //   27: lstore #4
/*    */     //   29: lload #4
/*    */     //   31: dup2
/*    */     //   32: ldc2_w 96128756439721
/*    */     //   35: lxor
/*    */     //   36: lstore #6
/*    */     //   38: dup2
/*    */     //   39: ldc2_w 88422110549954
/*    */     //   42: lxor
/*    */     //   43: lstore #8
/*    */     //   45: dup2
/*    */     //   46: ldc2_w 137634371423476
/*    */     //   49: lxor
/*    */     //   50: lstore #10
/*    */     //   52: pop2
/*    */     //   53: ldc2_w -8338801356595229564
/*    */     //   56: lload #4
/*    */     //   58: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   63: aload_0
/*    */     //   64: lload #8
/*    */     //   66: invokevirtual a : (J)J
/*    */     //   69: lstore #13
/*    */     //   71: astore #12
/*    */     //   73: lload #13
/*    */     //   75: ldc2_w 2147483647
/*    */     //   78: lcmp
/*    */     //   79: ifle -> 133
/*    */     //   82: new java/io/IOException
/*    */     //   85: dup
/*    */     //   86: new java/lang/StringBuilder
/*    */     //   89: dup
/*    */     //   90: invokespecial <init> : ()V
/*    */     //   93: sipush #23742
/*    */     //   96: ldc2_w 2457285471457335111
/*    */     //   99: lload #4
/*    */     //   101: lxor
/*    */     //   102: <illegal opcode> v : (IJ)Ljava/lang/String;
/*    */     //   107: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   110: lload #13
/*    */     //   112: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*    */     //   115: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   118: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   121: athrow
/*    */     //   122: ldc2_w -8326344724580192588
/*    */     //   125: lload #4
/*    */     //   127: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   132: athrow
/*    */     //   133: aload_0
/*    */     //   134: invokevirtual a : ()Lme/konsolas/aac/bX;
/*    */     //   137: astore #16
/*    */     //   139: aconst_null
/*    */     //   140: astore #17
/*    */     //   142: aload #16
/*    */     //   144: lload #6
/*    */     //   146: invokeinterface a : (J)[B
/*    */     //   151: astore #15
/*    */     //   153: aload #12
/*    */     //   155: ifnonnull -> 200
/*    */     //   158: aload #16
/*    */     //   160: ifnull -> 249
/*    */     //   163: goto -> 177
/*    */     //   166: ldc2_w -8326344724580192588
/*    */     //   169: lload #4
/*    */     //   171: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   176: athrow
/*    */     //   177: lload #10
/*    */     //   179: aload #17
/*    */     //   181: aload #16
/*    */     //   183: invokestatic a : (JLjava/lang/Throwable;Ljava/lang/AutoCloseable;)V
/*    */     //   186: goto -> 200
/*    */     //   189: ldc2_w -8326344724580192588
/*    */     //   192: lload #4
/*    */     //   194: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   199: athrow
/*    */     //   200: goto -> 249
/*    */     //   203: astore #18
/*    */     //   205: aload #18
/*    */     //   207: astore #17
/*    */     //   209: aload #18
/*    */     //   211: athrow
/*    */     //   212: astore #19
/*    */     //   214: iload_1
/*    */     //   215: iflt -> 232
/*    */     //   218: aload #16
/*    */     //   220: ifnull -> 246
/*    */     //   223: lload #10
/*    */     //   225: aload #17
/*    */     //   227: aload #16
/*    */     //   229: invokestatic a : (JLjava/lang/Throwable;Ljava/lang/AutoCloseable;)V
/*    */     //   232: goto -> 246
/*    */     //   235: ldc2_w -8326344724580192588
/*    */     //   238: lload #4
/*    */     //   240: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   245: athrow
/*    */     //   246: aload #19
/*    */     //   248: athrow
/*    */     //   249: lload #13
/*    */     //   251: ldc2_w -1
/*    */     //   254: lcmp
/*    */     //   255: iload_2
/*    */     //   256: ifle -> 302
/*    */     //   259: aload #12
/*    */     //   261: ifnonnull -> 302
/*    */     //   264: ifeq -> 396
/*    */     //   267: goto -> 281
/*    */     //   270: ldc2_w -8326344724580192588
/*    */     //   273: lload #4
/*    */     //   275: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   280: athrow
/*    */     //   281: lload #13
/*    */     //   283: aload #15
/*    */     //   285: arraylength
/*    */     //   286: i2l
/*    */     //   287: lcmp
/*    */     //   288: goto -> 302
/*    */     //   291: ldc2_w -8326344724580192588
/*    */     //   294: lload #4
/*    */     //   296: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   301: athrow
/*    */     //   302: ifeq -> 396
/*    */     //   305: new java/io/IOException
/*    */     //   308: dup
/*    */     //   309: new java/lang/StringBuilder
/*    */     //   312: dup
/*    */     //   313: invokespecial <init> : ()V
/*    */     //   316: sipush #20446
/*    */     //   319: ldc2_w 6444614759488046114
/*    */     //   322: lload #4
/*    */     //   324: lxor
/*    */     //   325: <illegal opcode> v : (IJ)Ljava/lang/String;
/*    */     //   330: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   333: lload #13
/*    */     //   335: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*    */     //   338: sipush #22582
/*    */     //   341: ldc2_w 494798473412498382
/*    */     //   344: lload #4
/*    */     //   346: lxor
/*    */     //   347: <illegal opcode> v : (IJ)Ljava/lang/String;
/*    */     //   352: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   355: aload #15
/*    */     //   357: arraylength
/*    */     //   358: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   361: sipush #18848
/*    */     //   364: ldc2_w 4304504152307417694
/*    */     //   367: lload #4
/*    */     //   369: lxor
/*    */     //   370: <illegal opcode> v : (IJ)Ljava/lang/String;
/*    */     //   375: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   378: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   381: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   384: athrow
/*    */     //   385: ldc2_w -8326344724580192588
/*    */     //   388: lload #4
/*    */     //   390: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   395: athrow
/*    */     //   396: aload #15
/*    */     //   398: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #35	-> 63
/*    */     //   #26	-> 73
/*    */     //   #9	-> 82
/*    */     //   #23	-> 133
/*    */     //   #12	-> 142
/*    */     //   #1	-> 153
/*    */     //   #18	-> 203
/*    */     //   #27	-> 212
/*    */     //   #13	-> 249
/*    */     //   #17	-> 305
/*    */     //   #19	-> 396
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   73	122	122	java/lang/Throwable
/*    */     //   142	153	203	java/lang/Throwable
/*    */     //   142	153	212	finally
/*    */     //   153	163	166	java/lang/Throwable
/*    */     //   158	186	189	java/lang/Throwable
/*    */     //   203	214	212	finally
/*    */     //   214	232	235	java/lang/Throwable
/*    */     //   249	267	270	java/lang/Throwable
/*    */     //   264	288	291	java/lang/Throwable
/*    */     //   302	385	385	java/lang/Throwable } public final Reader a(long paramLong) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/d2.g : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: lload_1
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 87175861899908
/*    */     //   11: lxor
/*    */     //   12: lstore_3
/*    */     //   13: pop2
/*    */     //   14: ldc2_w 4433203824312073543
/*    */     //   17: lload_1
/*    */     //   18: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   23: aload_0
/*    */     //   24: getfield a : Ljava/io/Reader;
/*    */     //   27: astore #6
/*    */     //   29: astore #5
/*    */     //   31: aload #6
/*    */     //   33: aload #5
/*    */     //   35: ifnonnull -> 56
/*    */     //   38: ifnull -> 59
/*    */     //   41: goto -> 54
/*    */     //   44: ldc2_w 4445517571154616183
/*    */     //   47: lload_1
/*    */     //   48: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   53: athrow
/*    */     //   54: aload #6
/*    */     //   56: goto -> 80
/*    */     //   59: aload_0
/*    */     //   60: new me/konsolas/aac/kb
/*    */     //   63: dup
/*    */     //   64: aload_0
/*    */     //   65: invokevirtual a : ()Lme/konsolas/aac/bX;
/*    */     //   68: aload_0
/*    */     //   69: lload_3
/*    */     //   70: invokespecial a : (J)Ljava/nio/charset/Charset;
/*    */     //   73: invokespecial <init> : (Lme/konsolas/aac/bX;Ljava/nio/charset/Charset;)V
/*    */     //   76: dup_x1
/*    */     //   77: putfield a : Ljava/io/Reader;
/*    */     //   80: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #36	-> 23
/*    */     //   #39	-> 31
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   31	41	44	java/lang/NullPointerException }
/*    */   public static d2 a(long paramLong, @Nullable mm parammm, gZ paramgZ) {
/* 37 */     paramLong = g ^ paramLong; int i = (int)((paramLong ^ 0x21A994A78C92L) >>> 48L); long l1 = (paramLong ^ 0x21A994A78C92L) << 16L >>> 16L; paramLong ^ 0x21A994A78C92L; int j = (int)((paramLong ^ 0x1CF23856F962L) >>> 32L); long l2 = (paramLong ^ 0x1CF23856F962L) << 32L >>> 32L; paramLong ^ 0x1CF23856F962L; fw fw = (new fw()).a(paramgZ, j, l2);
/*    */ 
/*    */     
/* 40 */     return a(parammm, paramgZ.a(), fw, (short)i, l1);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public abstract mm a(char paramChar1, char paramChar2, int paramInt);
/*    */   
/*    */   public abstract long a(long paramLong);
/*    */   
/*    */   public abstract bX a();
/*    */   
/*    */   static {
/*    */     long l = g ^ 0x34018553B64FL;
/*    */     "帀ᐦ攳Ḿ茾𚬑隅㔉臟⎘᛼㐂?瀊챷殥뒉ᩐ䣣戆".toCharArray()[9] = (char)("帀ᐦ攳Ḿ茾𚬑隅㔉臟⎘᛼㐂?瀊챷殥뒉ᩐ䣣戆".toCharArray()[9] ^ 0x584B);
/*    */     "⛁ህ뾻Ἅ".toCharArray()[1] = (char)("⛁ህ뾻Ἅ".toCharArray()[1] ^ 0x55D5);
/*    */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*    */     for (byte b1 = 1; b1 < 8; b1++)
/*    */       (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
/*    */     Cipher cipher;
/*    */     (cipher = Cipher.getInstance(hY$g6.H("帀ᐦ攳Ḿ茾𚬑隅㔉臟⎘᛼㐂?瀊챷殥뒉ᩐ䣣戆".toCharArray(), (short)3070, (byte)4, (byte)5))).init(2, SecretKeyFactory.getInstance(hY$g6.H("⛁ህ뾻Ἅ".toCharArray(), (short)12847, (byte)5, (byte)3)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*    */     String[] arrayOfString = new String[6];
/*    */     boolean bool = false;
/*    */     "Ѽ떈蔽蒹퇏熏ਛ鐭몤퉮?鞤쀘ἂꋼ㛳᜵겝뼻쿥ⶂ씪佉礤둘ᖥ狵詑쮚醍沷㝣縷煅숐㝡該讅㴏쐚ᓬ蜳ᴕꬉ?ﺟ訨?㹜割⩮್?ꢭ몲拖嵴￻혺䁢앂벰詢?힮翔嬧澓ᛚ嬪⸫般?엫畆䄆浟㧢ꃋ뷡묄ဇ⻲俨쁨ᨮ‼瞤ⓗ䘰觱঺덾ꮶ্큹龞춅廿䯍ﲇ㑞岺䪍Ḩⓕ薊馐战瑣魣긭旫ਏʎ㯸ᚫ凴橴ᨠ叠".toCharArray()[1] = (char)("Ѽ떈蔽蒹퇏熏ਛ鐭몤퉮?鞤쀘ἂꋼ㛳᜵겝뼻쿥ⶂ씪佉礤둘ᖥ狵詑쮚醍沷㝣縷煅숐㝡該讅㴏쐚ᓬ蜳ᴕꬉ?ﺟ訨?㹜割⩮್?ꢭ몲拖嵴￻혺䁢앂벰詢?힮翔嬧澓ᛚ嬪⸫般?엫畆䄆浟㧢ꃋ뷡묄ဇ⻲俨쁨ᨮ‼瞤ⓗ䘰觱঺덾ꮶ্큹龞춅廿䯍ﲇ㑞岺䪍Ḩⓕ薊馐战瑣魣긭旫ਏʎ㯸ᚫ凴橴ᨠ叠".toCharArray()[1] ^ 0x57B4);
/*    */     String str;
/*    */     int i = (str = hY$g6.H("Ѽ떈蔽蒹퇏熏ਛ鐭몤퉮?鞤쀘ἂꋼ㛳᜵겝뼻쿥ⶂ씪佉礤둘ᖥ狵詑쮚醍沷㝣縷煅숐㝡該讅㴏쐚ᓬ蜳ᴕꬉ?ﺟ訨?㹜割⩮್?ꢭ몲拖嵴￻혺䁢앂벰詢?힮翔嬧澓ᛚ嬪⸫般?엫畆䄆浟㧢ꃋ뷡묄ဇ⻲俨쁨ᨮ‼瞤ⓗ䘰觱঺덾ꮶ্큹龞춅廿䯍ﲇ㑞岺䪍Ḩⓕ薊馐战瑣魣긭旫ਏʎ㯸ᚫ凴橴ᨠ叠".toCharArray(), (short)4506, (byte)1, (byte)4)).length();
/*    */     byte b2 = 32;
/*    */     byte b = -1;
/*    */     while (true);
/*    */   }
/*    */   
/*    */   private static Throwable a(Throwable paramThrowable) {
/*    */     return paramThrowable;
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
/*    */     int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x75F;
/*    */     if (i[i] == null) {
/*    */       Object[] arrayOfObject;
/*    */       try {
/*    */         Long long_ = Long.valueOf(Thread.currentThread().getId());
/*    */         arrayOfObject = (Object[])j.get(long_);
/*    */         if (arrayOfObject == null) {
/*    */           arrayOfObject = new Object[3];
/*    */           "꾔퓙⊱踂箙룃䮈ꅓ볭ĕ↢ꀵ컎ꑙ⥫熒祆惩礱爁".toCharArray()[8] = (char)("꾔퓙⊱踂箙룃䮈ꅓ볭ĕ↢ꀵ컎ꑙ⥫熒祆惩礱爁".toCharArray()[8] ^ 0x6B10);
/*    */           arrayOfObject[0] = Cipher.getInstance(fW$gy.A("꾔퓙⊱踂箙룃䮈ꅓ볭ĕ↢ꀵ컎ꑙ⥫熒祆惩礱爁".toCharArray(), (short)13536, false, 0));
/*    */           "铥䟍鰡၍".toCharArray()[2] = (char)("铥䟍鰡၍".toCharArray()[2] ^ 0x645F);
/*    */           arrayOfObject[1] = SecretKeyFactory.getInstance(fW$gy.A("铥䟍鰡၍".toCharArray(), (short)25791, true, 4));
/*    */           arrayOfObject[2] = new IvParameterSpec(new byte[8]);
/*    */           j.put(long_, arrayOfObject);
/*    */         } 
/*    */       } catch (Exception exception) {
/*    */         "?ᘒ໭翺떯㬘䒔㑗퐮霖뷹ᘸ嫭ⅳ묙骲?ȯ".toCharArray()[2] = (char)("?ᘒ໭翺떯㬘䒔㑗퐮霖뷹ᘸ嫭ⅳ묙骲?ȯ".toCharArray()[2] ^ 0x736A);
/*    */         throw new RuntimeException(fW$gy.A("?ᘒ໭翺떯㬘䒔㑗퐮霖뷹ᘸ嫭ⅳ묙骲?ȯ".toCharArray(), (short)6639, false, 0), exception);
/*    */       } 
/*    */       byte[] arrayOfByte1 = new byte[8];
/*    */       arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
/*    */       for (byte b = 1; b < 8; b++)
/*    */         arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
/*    */       DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
/*    */       SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
/*    */       ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
/*    */       "⺈犊㿘팵ﱠ?ꗆ꿓㠈璔".toCharArray()[0] = (char)("⺈犊㿘팵ﱠ?ꗆ꿓㠈璔".toCharArray()[0] ^ 0x44AE);
/*    */       byte[] arrayOfByte2 = h[i].getBytes(fW$gy.A("⺈犊㿘팵ﱠ?ꗆ꿓㠈璔".toCharArray(), (short)32209, true, 4));
/*    */       i[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
/*    */     } 
/*    */     return i[i];
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
/*    */     //   66: ldc_w '먛퐹鮀쾬嶭궄芜䁁좷ꂸ摱?禴Ꙕ䁤怸㑡'
/*    */     //   69: invokevirtual toCharArray : ()[C
/*    */     //   72: dup
/*    */     //   73: dup
/*    */     //   74: iconst_5
/*    */     //   75: dup_x1
/*    */     //   76: caload
/*    */     //   77: sipush #17801
/*    */     //   80: ixor
/*    */     //   81: i2c
/*    */     //   82: castore
/*    */     //   83: sipush #5911
/*    */     //   86: iconst_0
/*    */     //   87: iconst_1
/*    */     //   88: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   91: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   94: ldc_w 'ﰝ뤳኏€'
/*    */     //   97: invokevirtual toCharArray : ()[C
/*    */     //   100: dup
/*    */     //   101: dup
/*    */     //   102: iconst_2
/*    */     //   103: dup_x1
/*    */     //   104: caload
/*    */     //   105: sipush #4349
/*    */     //   108: ixor
/*    */     //   109: i2c
/*    */     //   110: castore
/*    */     //   111: sipush #29097
/*    */     //   114: iconst_0
/*    */     //   115: iconst_0
/*    */     //   116: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   119: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   122: aload_1
/*    */     //   123: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   126: ldc_w '槏屫柦⽑'
/*    */     //   129: invokevirtual toCharArray : ()[C
/*    */     //   132: dup
/*    */     //   133: dup
/*    */     //   134: iconst_2
/*    */     //   135: dup_x1
/*    */     //   136: caload
/*    */     //   137: sipush #11913
/*    */     //   140: ixor
/*    */     //   141: i2c
/*    */     //   142: castore
/*    */     //   143: sipush #9211
/*    */     //   146: iconst_1
/*    */     //   147: iconst_1
/*    */     //   148: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
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


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\d2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */