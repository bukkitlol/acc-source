/*     */ package me.konsolas.aac;final class q implements bX { public final fw c; public final hp b; boolean a;
/*     */   
/*     */   public long b(long paramLong, gZ paramgZ) {
/*   4 */     long l = paramLong ^ 0x21A868CB3E2L; return b(l, paramgZ, 0L);
/*     */   }
/*     */   private static final long d = nc.a(-3950918010213085392L, 4018588014737468108L, MethodHandles.lookup().lookupClass()).a(24384669051705L); private static final String[] e; private static final String[] f; private static final Map g = new HashMap<>(13);
/*     */   
/*     */   public boolean a(long paramLong1, byte paramByte, long paramLong2) {
/*     */     // Byte code:
/*     */     //   0: iload_3
/*     */     //   1: i2l
/*     */     //   2: bipush #56
/*     */     //   4: lshl
/*     */     //   5: lload #4
/*     */     //   7: bipush #8
/*     */     //   9: lshl
/*     */     //   10: bipush #8
/*     */     //   12: lushr
/*     */     //   13: lor
/*     */     //   14: lstore #6
/*     */     //   16: lload #6
/*     */     //   18: dup2
/*     */     //   19: ldc2_w 21824841712250
/*     */     //   22: lxor
/*     */     //   23: lstore #8
/*     */     //   25: pop2
/*     */     //   26: ldc2_w -8381144637842279432
/*     */     //   29: lload #6
/*     */     //   31: <illegal opcode> w : (JJ)I
/*     */     //   36: istore #10
/*     */     //   38: lload_1
/*     */     //   39: lconst_0
/*     */     //   40: lcmp
/*     */     //   41: iload #10
/*     */     //   43: ifeq -> 117
/*     */     //   46: ifge -> 113
/*     */     //   49: goto -> 63
/*     */     //   52: ldc2_w -8385364300731274780
/*     */     //   55: lload #6
/*     */     //   57: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   62: athrow
/*     */     //   63: new java/lang/IllegalArgumentException
/*     */     //   66: dup
/*     */     //   67: new java/lang/StringBuilder
/*     */     //   70: dup
/*     */     //   71: invokespecial <init> : ()V
/*     */     //   74: sipush #16251
/*     */     //   77: ldc2_w 8569368704509333710
/*     */     //   80: lload #6
/*     */     //   82: lxor
/*     */     //   83: <illegal opcode> f : (IJ)Ljava/lang/String;
/*     */     //   88: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   91: lload_1
/*     */     //   92: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*     */     //   95: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   98: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   101: athrow
/*     */     //   102: ldc2_w -8385364300731274780
/*     */     //   105: lload #6
/*     */     //   107: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   112: athrow
/*     */     //   113: aload_0
/*     */     //   114: getfield a : Z
/*     */     //   117: lload #4
/*     */     //   119: lconst_0
/*     */     //   120: lcmp
/*     */     //   121: ifle -> 188
/*     */     //   124: iload #10
/*     */     //   126: ifeq -> 188
/*     */     //   129: ifeq -> 179
/*     */     //   132: goto -> 146
/*     */     //   135: ldc2_w -8385364300731274780
/*     */     //   138: lload #6
/*     */     //   140: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   145: athrow
/*     */     //   146: new java/lang/IllegalStateException
/*     */     //   149: dup
/*     */     //   150: sipush #5192
/*     */     //   153: ldc2_w 611751037076896764
/*     */     //   156: lload #6
/*     */     //   158: lxor
/*     */     //   159: <illegal opcode> f : (IJ)Ljava/lang/String;
/*     */     //   164: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   167: athrow
/*     */     //   168: ldc2_w -8385364300731274780
/*     */     //   171: lload #6
/*     */     //   173: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   178: athrow
/*     */     //   179: aload_0
/*     */     //   180: getfield c : Lme/konsolas/aac/fw;
/*     */     //   183: getfield a : J
/*     */     //   186: lload_1
/*     */     //   187: lcmp
/*     */     //   188: iload_3
/*     */     //   189: iflt -> 251
/*     */     //   192: ifge -> 250
/*     */     //   195: aload_0
/*     */     //   196: getfield b : Lme/konsolas/aac/hp;
/*     */     //   199: aload_0
/*     */     //   200: getfield c : Lme/konsolas/aac/fw;
/*     */     //   203: lload #8
/*     */     //   205: dup2_x1
/*     */     //   206: pop2
/*     */     //   207: ldc2_w 8192
/*     */     //   210: invokeinterface a : (JLme/konsolas/aac/fw;J)J
/*     */     //   215: ldc2_w -1
/*     */     //   218: lcmp
/*     */     //   219: goto -> 233
/*     */     //   222: ldc2_w -8385364300731274780
/*     */     //   225: lload #6
/*     */     //   227: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   232: athrow
/*     */     //   233: ifne -> 179
/*     */     //   236: iconst_0
/*     */     //   237: lload #4
/*     */     //   239: lconst_0
/*     */     //   240: lcmp
/*     */     //   241: iflt -> 188
/*     */     //   244: iload #10
/*     */     //   246: ifeq -> 233
/*     */     //   249: ireturn
/*     */     //   250: iconst_1
/*     */     //   251: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #7	-> 38
/*     */     //   #109	-> 113
/*     */     //   #86	-> 179
/*     */     //   #64	-> 195
/*     */     //   #59	-> 250
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   38	49	52	java/io/IOException
/*     */     //   46	102	102	java/io/IOException
/*     */     //   117	132	135	java/io/IOException
/*     */     //   129	168	168	java/io/IOException
/*     */     //   188	219	222	java/io/IOException
/*     */   }
/*     */   
/*     */   public byte[] a(long paramLong1, long paramLong2) {
/*  13 */     long l1 = paramLong2 ^ 0x55C30C4A6A0EL, l2 = paramLong2 ^ 0x0L; b(paramLong1, l1);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 171 */     return this.c.a(paramLong1, l2);
/*     */   } public fw a() {
/*     */     return this.c;
/*     */   } public li a() {
/*     */     return this.b.a();
/*     */   }
/*     */   public void a(long paramLong1, long paramLong2) {
/*     */     // Byte code:
/*     */     //   0: lload_3
/*     */     //   1: dup2
/*     */     //   2: ldc2_w 0
/*     */     //   5: lxor
/*     */     //   6: lstore #5
/*     */     //   8: dup2
/*     */     //   9: ldc2_w 63062641999687
/*     */     //   12: lxor
/*     */     //   13: lstore #7
/*     */     //   15: pop2
/*     */     //   16: ldc2_w 8542514686972808901
/*     */     //   19: lload_3
/*     */     //   20: <illegal opcode> w : (JJ)I
/*     */     //   25: istore #9
/*     */     //   27: aload_0
/*     */     //   28: getfield a : Z
/*     */     //   31: iload #9
/*     */     //   33: ifeq -> 86
/*     */     //   36: ifeq -> 83
/*     */     //   39: goto -> 52
/*     */     //   42: ldc2_w 8546733796614231257
/*     */     //   45: lload_3
/*     */     //   46: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   51: athrow
/*     */     //   52: new java/lang/IllegalStateException
/*     */     //   55: dup
/*     */     //   56: sipush #5192
/*     */     //   59: ldc2_w 611727382148941505
/*     */     //   62: lload_3
/*     */     //   63: lxor
/*     */     //   64: <illegal opcode> f : (IJ)Ljava/lang/String;
/*     */     //   69: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   72: athrow
/*     */     //   73: ldc2_w 8546733796614231257
/*     */     //   76: lload_3
/*     */     //   77: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   82: athrow
/*     */     //   83: lload_1
/*     */     //   84: lconst_0
/*     */     //   85: lcmp
/*     */     //   86: ifle -> 248
/*     */     //   89: aload_0
/*     */     //   90: getfield c : Lme/konsolas/aac/fw;
/*     */     //   93: getfield a : J
/*     */     //   96: lconst_0
/*     */     //   97: iload #9
/*     */     //   99: ifeq -> 222
/*     */     //   102: goto -> 115
/*     */     //   105: ldc2_w 8546733796614231257
/*     */     //   108: lload_3
/*     */     //   109: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   114: athrow
/*     */     //   115: lcmp
/*     */     //   116: ifne -> 214
/*     */     //   119: goto -> 132
/*     */     //   122: ldc2_w 8546733796614231257
/*     */     //   125: lload_3
/*     */     //   126: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   131: athrow
/*     */     //   132: aload_0
/*     */     //   133: getfield b : Lme/konsolas/aac/hp;
/*     */     //   136: aload_0
/*     */     //   137: getfield c : Lme/konsolas/aac/fw;
/*     */     //   140: lload #7
/*     */     //   142: dup2_x1
/*     */     //   143: pop2
/*     */     //   144: ldc2_w 8192
/*     */     //   147: invokeinterface a : (JLme/konsolas/aac/fw;J)J
/*     */     //   152: lload_3
/*     */     //   153: lconst_0
/*     */     //   154: lcmp
/*     */     //   155: iflt -> 225
/*     */     //   158: ldc2_w -1
/*     */     //   161: iload #9
/*     */     //   163: ifeq -> 222
/*     */     //   166: goto -> 179
/*     */     //   169: ldc2_w 8546733796614231257
/*     */     //   172: lload_3
/*     */     //   173: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   178: athrow
/*     */     //   179: lcmp
/*     */     //   180: ifne -> 214
/*     */     //   183: goto -> 196
/*     */     //   186: ldc2_w 8546733796614231257
/*     */     //   189: lload_3
/*     */     //   190: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   195: athrow
/*     */     //   196: new java/io/EOFException
/*     */     //   199: dup
/*     */     //   200: invokespecial <init> : ()V
/*     */     //   203: athrow
/*     */     //   204: ldc2_w 8546733796614231257
/*     */     //   207: lload_3
/*     */     //   208: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   213: athrow
/*     */     //   214: lload_1
/*     */     //   215: aload_0
/*     */     //   216: getfield c : Lme/konsolas/aac/fw;
/*     */     //   219: invokevirtual f : ()J
/*     */     //   222: invokestatic min : (JJ)J
/*     */     //   225: lstore #10
/*     */     //   227: aload_0
/*     */     //   228: getfield c : Lme/konsolas/aac/fw;
/*     */     //   231: lload #10
/*     */     //   233: lload #5
/*     */     //   235: invokevirtual a : (JJ)V
/*     */     //   238: lload_1
/*     */     //   239: lload #10
/*     */     //   241: lsub
/*     */     //   242: lstore_1
/*     */     //   243: iload #9
/*     */     //   245: ifne -> 83
/*     */     //   248: lload_3
/*     */     //   249: lconst_0
/*     */     //   250: lcmp
/*     */     //   251: iflt -> 89
/*     */     //   254: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #25	-> 27
/*     */     //   #74	-> 83
/*     */     //   #194	-> 89
/*     */     //   #156	-> 196
/*     */     //   #204	-> 214
/*     */     //   #29	-> 227
/*     */     //   #148	-> 238
/*     */     //   #181	-> 243
/*     */     //   #37	-> 248
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   27	39	42	java/io/IOException
/*     */     //   36	73	73	java/io/IOException
/*     */     //   86	102	105	java/io/IOException
/*     */     //   89	119	122	java/io/IOException
/*     */     //   115	166	169	java/io/IOException
/*     */     //   132	183	186	java/io/IOException
/*     */     //   179	204	204	java/io/IOException
/*     */   }
/*     */   public String b(long paramLong1, long paramLong2) {
/*     */     long l1 = paramLong2 ^ 0x6B15785DB482L, l2 = paramLong2 ^ 0x0L;
/*     */     b(paramLong1, l1);
/*     */     return this.c.b(paramLong1, l2);
/*     */   }
/*     */   public int a(long paramLong) { long l1 = paramLong ^ 0x510D8F552AA2L, l2 = paramLong ^ 0x0L;
/*     */     b(4L, l1);
/* 187 */     return this.c.a(l2); } public long a(long paramLong, byte paramByte) { long l = paramLong ^ 0x533670B17DF6L; return a(paramByte, 0L, Long.MAX_VALUE, l); }
/*     */   public short a(long paramLong) { long l1 = paramLong ^ 0x6BA2F2244E4AL, l2 = paramLong ^ 0x0L; b(2L, l1); return this.c.a(l2); }
/*     */   public InputStream a() { return new aT(this); }
/*     */   public long a(gZ paramgZ, long paramLong1, long paramLong2) { // Byte code:
/*     */     //   0: lload #4
/*     */     //   2: dup2
/*     */     //   3: ldc2_w 123150958528685
/*     */     //   6: lxor
/*     */     //   7: lstore #6
/*     */     //   9: dup2
/*     */     //   10: ldc2_w 0
/*     */     //   13: lxor
/*     */     //   14: lstore #8
/*     */     //   16: pop2
/*     */     //   17: ldc2_w -9086337185227089954
/*     */     //   20: lload #4
/*     */     //   22: <illegal opcode> w : (JJ)I
/*     */     //   27: istore #10
/*     */     //   29: aload_0
/*     */     //   30: iload #10
/*     */     //   32: ifne -> 89
/*     */     //   35: getfield a : Z
/*     */     //   38: ifeq -> 88
/*     */     //   41: goto -> 55
/*     */     //   44: ldc2_w -9118012156628393165
/*     */     //   47: lload #4
/*     */     //   49: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   54: athrow
/*     */     //   55: new java/lang/IllegalStateException
/*     */     //   58: dup
/*     */     //   59: sipush #204
/*     */     //   62: ldc2_w 7518983451296294311
/*     */     //   65: lload #4
/*     */     //   67: lxor
/*     */     //   68: <illegal opcode> f : (IJ)Ljava/lang/String;
/*     */     //   73: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   76: athrow
/*     */     //   77: ldc2_w -9118012156628393165
/*     */     //   80: lload #4
/*     */     //   82: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   87: athrow
/*     */     //   88: aload_0
/*     */     //   89: getfield c : Lme/konsolas/aac/fw;
/*     */     //   92: aload_1
/*     */     //   93: lload_2
/*     */     //   94: lload #8
/*     */     //   96: invokevirtual a : (Lme/konsolas/aac/gZ;JJ)J
/*     */     //   99: lstore #11
/*     */     //   101: lload #11
/*     */     //   103: lload #4
/*     */     //   105: lconst_0
/*     */     //   106: lcmp
/*     */     //   107: ifle -> 119
/*     */     //   110: ldc2_w -1
/*     */     //   113: lcmp
/*     */     //   114: ifeq -> 150
/*     */     //   117: lload #11
/*     */     //   119: iload #10
/*     */     //   121: ifne -> 157
/*     */     //   124: goto -> 138
/*     */     //   127: ldc2_w -9118012156628393165
/*     */     //   130: lload #4
/*     */     //   132: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   137: athrow
/*     */     //   138: lreturn
/*     */     //   139: ldc2_w -9118012156628393165
/*     */     //   142: lload #4
/*     */     //   144: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   149: athrow
/*     */     //   150: aload_0
/*     */     //   151: getfield c : Lme/konsolas/aac/fw;
/*     */     //   154: getfield a : J
/*     */     //   157: lstore #13
/*     */     //   159: aload_0
/*     */     //   160: getfield b : Lme/konsolas/aac/hp;
/*     */     //   163: aload_0
/*     */     //   164: getfield c : Lme/konsolas/aac/fw;
/*     */     //   167: lload #6
/*     */     //   169: dup2_x1
/*     */     //   170: pop2
/*     */     //   171: ldc2_w 8192
/*     */     //   174: invokeinterface a : (JLme/konsolas/aac/fw;J)J
/*     */     //   179: lload #4
/*     */     //   181: lconst_0
/*     */     //   182: lcmp
/*     */     //   183: iflt -> 241
/*     */     //   186: ldc2_w -1
/*     */     //   189: iload #10
/*     */     //   191: ifne -> 238
/*     */     //   194: lcmp
/*     */     //   195: ifne -> 227
/*     */     //   198: goto -> 212
/*     */     //   201: ldc2_w -9118012156628393165
/*     */     //   204: lload #4
/*     */     //   206: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   211: athrow
/*     */     //   212: ldc2_w -1
/*     */     //   215: lreturn
/*     */     //   216: ldc2_w -9118012156628393165
/*     */     //   219: lload #4
/*     */     //   221: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   226: athrow
/*     */     //   227: lload_2
/*     */     //   228: lload #13
/*     */     //   230: aload_1
/*     */     //   231: invokevirtual a : ()I
/*     */     //   234: i2l
/*     */     //   235: lsub
/*     */     //   236: lconst_1
/*     */     //   237: ladd
/*     */     //   238: invokestatic max : (JJ)J
/*     */     //   241: lstore_2
/*     */     //   242: goto -> 88
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #51	-> 29
/*     */     //   #66	-> 88
/*     */     //   #207	-> 101
/*     */     //   #180	-> 150
/*     */     //   #18	-> 159
/*     */     //   #3	-> 227
/*     */     //   #78	-> 242
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   29	41	44	java/io/IOException
/*     */     //   35	77	77	java/io/IOException
/*     */     //   101	124	127	java/io/IOException
/*     */     //   117	139	139	java/io/IOException
/*     */     //   159	198	201	java/io/IOException
/*     */     //   194	216	216	java/io/IOException }
/* 191 */   public long a(long paramLong) { long l1 = paramLong ^ 0x827CD3CC69FL, l2 = paramLong ^ 0x0L; b(8L, l1);
/*     */     return this.c.a(l2); }
/*     */ 
/*     */   
/*     */   public boolean a(long paramLong, short paramShort, int paramInt1, gZ paramgZ, int paramInt2, int paramInt3, int paramInt4) {
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
/*     */     //   15: iload #8
/*     */     //   17: i2l
/*     */     //   18: bipush #48
/*     */     //   20: lshl
/*     */     //   21: bipush #48
/*     */     //   23: lushr
/*     */     //   24: lor
/*     */     //   25: lstore #9
/*     */     //   27: lload #9
/*     */     //   29: dup2
/*     */     //   30: ldc2_w 102621870207548
/*     */     //   33: lxor
/*     */     //   34: lstore #11
/*     */     //   36: dup2
/*     */     //   37: ldc2_w 37051743702513
/*     */     //   40: lxor
/*     */     //   41: lstore #13
/*     */     //   43: dup2
/*     */     //   44: ldc2_w 17902667233650
/*     */     //   47: lxor
/*     */     //   48: dup2
/*     */     //   49: bipush #56
/*     */     //   51: lushr
/*     */     //   52: l2i
/*     */     //   53: istore #15
/*     */     //   55: dup2
/*     */     //   56: bipush #8
/*     */     //   58: lshl
/*     */     //   59: bipush #8
/*     */     //   61: lushr
/*     */     //   62: lstore #16
/*     */     //   64: pop2
/*     */     //   65: pop2
/*     */     //   66: ldc2_w 8233613560237794427
/*     */     //   69: lload #9
/*     */     //   71: <illegal opcode> w : (JJ)I
/*     */     //   76: istore #18
/*     */     //   78: aload_0
/*     */     //   79: getfield a : Z
/*     */     //   82: iload #18
/*     */     //   84: ifne -> 140
/*     */     //   87: ifeq -> 137
/*     */     //   90: goto -> 104
/*     */     //   93: ldc2_w 8273996320372773014
/*     */     //   96: lload #9
/*     */     //   98: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   103: athrow
/*     */     //   104: new java/lang/IllegalStateException
/*     */     //   107: dup
/*     */     //   108: sipush #5192
/*     */     //   111: ldc2_w 611768389918982798
/*     */     //   114: lload #9
/*     */     //   116: lxor
/*     */     //   117: <illegal opcode> f : (IJ)Ljava/lang/String;
/*     */     //   122: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   125: athrow
/*     */     //   126: ldc2_w 8273996320372773014
/*     */     //   129: lload #9
/*     */     //   131: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   136: athrow
/*     */     //   137: lload_1
/*     */     //   138: lconst_0
/*     */     //   139: lcmp
/*     */     //   140: iload #18
/*     */     //   142: ifne -> 307
/*     */     //   145: iflt -> 292
/*     */     //   148: goto -> 162
/*     */     //   151: ldc2_w 8273996320372773014
/*     */     //   154: lload #9
/*     */     //   156: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   161: athrow
/*     */     //   162: iload #6
/*     */     //   164: iload #18
/*     */     //   166: ifne -> 307
/*     */     //   169: goto -> 183
/*     */     //   172: ldc2_w 8273996320372773014
/*     */     //   175: lload #9
/*     */     //   177: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   182: athrow
/*     */     //   183: iload_3
/*     */     //   184: iflt -> 293
/*     */     //   187: iflt -> 292
/*     */     //   190: goto -> 204
/*     */     //   193: ldc2_w 8273996320372773014
/*     */     //   196: lload #9
/*     */     //   198: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   203: athrow
/*     */     //   204: iload #7
/*     */     //   206: iload #18
/*     */     //   208: ifne -> 307
/*     */     //   211: goto -> 225
/*     */     //   214: ldc2_w 8273996320372773014
/*     */     //   217: lload #9
/*     */     //   219: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   224: athrow
/*     */     //   225: iload_3
/*     */     //   226: iflt -> 293
/*     */     //   229: iflt -> 292
/*     */     //   232: goto -> 246
/*     */     //   235: ldc2_w 8273996320372773014
/*     */     //   238: lload #9
/*     */     //   240: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   245: athrow
/*     */     //   246: aload #5
/*     */     //   248: invokevirtual a : ()I
/*     */     //   251: iload #6
/*     */     //   253: isub
/*     */     //   254: iload #18
/*     */     //   256: ifne -> 309
/*     */     //   259: goto -> 273
/*     */     //   262: ldc2_w 8273996320372773014
/*     */     //   265: lload #9
/*     */     //   267: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   272: athrow
/*     */     //   273: iload #7
/*     */     //   275: if_icmpge -> 308
/*     */     //   278: goto -> 292
/*     */     //   281: ldc2_w 8273996320372773014
/*     */     //   284: lload #9
/*     */     //   286: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   291: athrow
/*     */     //   292: iconst_0
/*     */     //   293: goto -> 307
/*     */     //   296: ldc2_w 8273996320372773014
/*     */     //   299: lload #9
/*     */     //   301: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   306: athrow
/*     */     //   307: ireturn
/*     */     //   308: iconst_0
/*     */     //   309: istore #19
/*     */     //   311: iload #19
/*     */     //   313: iload #7
/*     */     //   315: if_icmpge -> 475
/*     */     //   318: lload_1
/*     */     //   319: iload #19
/*     */     //   321: i2l
/*     */     //   322: ladd
/*     */     //   323: lstore #20
/*     */     //   325: aload_0
/*     */     //   326: lload #20
/*     */     //   328: lconst_1
/*     */     //   329: ladd
/*     */     //   330: iload #15
/*     */     //   332: i2b
/*     */     //   333: lload #16
/*     */     //   335: invokevirtual a : (JBJ)Z
/*     */     //   338: iload #18
/*     */     //   340: iload #8
/*     */     //   342: ifle -> 350
/*     */     //   345: ifne -> 476
/*     */     //   348: iload #18
/*     */     //   350: iload_3
/*     */     //   351: iflt -> 414
/*     */     //   354: ifne -> 412
/*     */     //   357: goto -> 371
/*     */     //   360: ldc2_w 8273996320372773014
/*     */     //   363: lload #9
/*     */     //   365: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   370: athrow
/*     */     //   371: ifne -> 401
/*     */     //   374: goto -> 388
/*     */     //   377: ldc2_w 8273996320372773014
/*     */     //   380: lload #9
/*     */     //   382: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   387: athrow
/*     */     //   388: iconst_0
/*     */     //   389: ireturn
/*     */     //   390: ldc2_w 8273996320372773014
/*     */     //   393: lload #9
/*     */     //   395: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   400: athrow
/*     */     //   401: aload_0
/*     */     //   402: getfield c : Lme/konsolas/aac/fw;
/*     */     //   405: lload #20
/*     */     //   407: lload #13
/*     */     //   409: invokevirtual a : (JJ)B
/*     */     //   412: iload #18
/*     */     //   414: iload #4
/*     */     //   416: iflt -> 434
/*     */     //   419: ifne -> 466
/*     */     //   422: aload #5
/*     */     //   424: iload #6
/*     */     //   426: iload #19
/*     */     //   428: iadd
/*     */     //   429: lload #11
/*     */     //   431: invokevirtual a : (IJ)B
/*     */     //   434: if_icmpeq -> 467
/*     */     //   437: goto -> 451
/*     */     //   440: ldc2_w 8273996320372773014
/*     */     //   443: lload #9
/*     */     //   445: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   450: athrow
/*     */     //   451: iconst_0
/*     */     //   452: goto -> 466
/*     */     //   455: ldc2_w 8273996320372773014
/*     */     //   458: lload #9
/*     */     //   460: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   465: athrow
/*     */     //   466: ireturn
/*     */     //   467: iinc #19, 1
/*     */     //   470: iload #18
/*     */     //   472: ifeq -> 311
/*     */     //   475: iconst_1
/*     */     //   476: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #53	-> 78
/*     */     //   #201	-> 137
/*     */     //   #134	-> 248
/*     */     //   #144	-> 292
/*     */     //   #116	-> 308
/*     */     //   #113	-> 318
/*     */     //   #92	-> 325
/*     */     //   #55	-> 401
/*     */     //   #163	-> 467
/*     */     //   #178	-> 475
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   78	90	93	java/io/IOException
/*     */     //   87	126	126	java/io/IOException
/*     */     //   140	148	151	java/io/IOException
/*     */     //   145	169	172	java/io/IOException
/*     */     //   162	190	193	java/io/IOException
/*     */     //   183	211	214	java/io/IOException
/*     */     //   204	232	235	java/io/IOException
/*     */     //   225	259	262	java/io/IOException
/*     */     //   246	278	281	java/io/IOException
/*     */     //   273	293	296	java/io/IOException
/*     */     //   325	357	360	java/io/IOException
/*     */     //   348	374	377	java/io/IOException
/*     */     //   371	390	390	java/io/IOException
/*     */     //   412	437	440	java/io/IOException
/*     */     //   422	452	455	java/io/IOException
/*     */   }
/*     */   
/*     */   public String a(long paramLong1, long paramLong2) {
/*     */     // Byte code:
/*     */     //   0: lload_3
/*     */     //   1: dup2
/*     */     //   2: ldc2_w 76089796238307
/*     */     //   5: lxor
/*     */     //   6: lstore #5
/*     */     //   8: dup2
/*     */     //   9: ldc2_w 69681995621465
/*     */     //   12: lxor
/*     */     //   13: lstore #7
/*     */     //   15: dup2
/*     */     //   16: ldc2_w 118581739165018
/*     */     //   19: lxor
/*     */     //   20: dup2
/*     */     //   21: bipush #16
/*     */     //   23: lushr
/*     */     //   24: lstore #9
/*     */     //   26: dup2
/*     */     //   27: bipush #48
/*     */     //   29: lshl
/*     */     //   30: bipush #48
/*     */     //   32: lushr
/*     */     //   33: l2i
/*     */     //   34: istore #11
/*     */     //   36: pop2
/*     */     //   37: dup2
/*     */     //   38: ldc2_w 9487604013681
/*     */     //   41: lxor
/*     */     //   42: lstore #12
/*     */     //   44: dup2
/*     */     //   45: ldc2_w 63065208860402
/*     */     //   48: lxor
/*     */     //   49: dup2
/*     */     //   50: bipush #56
/*     */     //   52: lushr
/*     */     //   53: l2i
/*     */     //   54: istore #14
/*     */     //   56: dup2
/*     */     //   57: bipush #8
/*     */     //   59: lshl
/*     */     //   60: bipush #8
/*     */     //   62: lushr
/*     */     //   63: lstore #15
/*     */     //   65: pop2
/*     */     //   66: dup2
/*     */     //   67: ldc2_w 61365127752447
/*     */     //   70: lxor
/*     */     //   71: lstore #17
/*     */     //   73: dup2
/*     */     //   74: ldc2_w 1778011895243
/*     */     //   77: lxor
/*     */     //   78: lstore #19
/*     */     //   80: pop2
/*     */     //   81: ldc2_w -6502209421998689285
/*     */     //   84: lload_3
/*     */     //   85: <illegal opcode> w : (JJ)I
/*     */     //   90: istore #21
/*     */     //   92: lload_1
/*     */     //   93: lconst_0
/*     */     //   94: lcmp
/*     */     //   95: iload #21
/*     */     //   97: ifne -> 187
/*     */     //   100: ifge -> 164
/*     */     //   103: goto -> 116
/*     */     //   106: ldc2_w -6533866801381210346
/*     */     //   109: lload_3
/*     */     //   110: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   115: athrow
/*     */     //   116: new java/lang/IllegalArgumentException
/*     */     //   119: dup
/*     */     //   120: new java/lang/StringBuilder
/*     */     //   123: dup
/*     */     //   124: invokespecial <init> : ()V
/*     */     //   127: sipush #27920
/*     */     //   130: ldc2_w 4991268317608553564
/*     */     //   133: lload_3
/*     */     //   134: lxor
/*     */     //   135: <illegal opcode> f : (IJ)Ljava/lang/String;
/*     */     //   140: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   143: lload_1
/*     */     //   144: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*     */     //   147: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   150: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   153: athrow
/*     */     //   154: ldc2_w -6533866801381210346
/*     */     //   157: lload_3
/*     */     //   158: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   163: athrow
/*     */     //   164: lload_1
/*     */     //   165: ldc2_w 9223372036854775807
/*     */     //   168: iload #21
/*     */     //   170: ifne -> 208
/*     */     //   173: lcmp
/*     */     //   174: goto -> 187
/*     */     //   177: ldc2_w -6533866801381210346
/*     */     //   180: lload_3
/*     */     //   181: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   186: athrow
/*     */     //   187: ifne -> 206
/*     */     //   190: ldc2_w 9223372036854775807
/*     */     //   193: goto -> 209
/*     */     //   196: ldc2_w -6533866801381210346
/*     */     //   199: lload_3
/*     */     //   200: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   205: athrow
/*     */     //   206: lload_1
/*     */     //   207: lconst_1
/*     */     //   208: ladd
/*     */     //   209: lstore #22
/*     */     //   211: aload_0
/*     */     //   212: bipush #10
/*     */     //   214: lconst_0
/*     */     //   215: lload #22
/*     */     //   217: lload #19
/*     */     //   219: invokevirtual a : (BJJJ)J
/*     */     //   222: lstore #24
/*     */     //   224: lload #24
/*     */     //   226: ldc2_w -1
/*     */     //   229: lcmp
/*     */     //   230: iload #21
/*     */     //   232: lload_3
/*     */     //   233: lconst_0
/*     */     //   234: lcmp
/*     */     //   235: ifle -> 287
/*     */     //   238: ifne -> 285
/*     */     //   241: ifeq -> 279
/*     */     //   244: goto -> 257
/*     */     //   247: ldc2_w -6533866801381210346
/*     */     //   250: lload_3
/*     */     //   251: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   256: athrow
/*     */     //   257: aload_0
/*     */     //   258: getfield c : Lme/konsolas/aac/fw;
/*     */     //   261: lload #24
/*     */     //   263: lload #5
/*     */     //   265: invokevirtual c : (JJ)Ljava/lang/String;
/*     */     //   268: areturn
/*     */     //   269: ldc2_w -6533866801381210346
/*     */     //   272: lload_3
/*     */     //   273: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   278: athrow
/*     */     //   279: lload #22
/*     */     //   281: ldc2_w 9223372036854775807
/*     */     //   284: lcmp
/*     */     //   285: iload #21
/*     */     //   287: lload_3
/*     */     //   288: lconst_0
/*     */     //   289: lcmp
/*     */     //   290: iflt -> 338
/*     */     //   293: ifne -> 336
/*     */     //   296: ifge -> 540
/*     */     //   299: goto -> 312
/*     */     //   302: ldc2_w -6533866801381210346
/*     */     //   305: lload_3
/*     */     //   306: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   311: athrow
/*     */     //   312: aload_0
/*     */     //   313: lload #22
/*     */     //   315: iload #14
/*     */     //   317: i2b
/*     */     //   318: lload #15
/*     */     //   320: invokevirtual a : (JBJ)Z
/*     */     //   323: goto -> 336
/*     */     //   326: ldc2_w -6533866801381210346
/*     */     //   329: lload_3
/*     */     //   330: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   335: athrow
/*     */     //   336: iload #21
/*     */     //   338: lload_3
/*     */     //   339: lconst_0
/*     */     //   340: lcmp
/*     */     //   341: iflt -> 409
/*     */     //   344: ifne -> 407
/*     */     //   347: ifeq -> 540
/*     */     //   350: goto -> 363
/*     */     //   353: ldc2_w -6533866801381210346
/*     */     //   356: lload_3
/*     */     //   357: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   362: athrow
/*     */     //   363: aload_0
/*     */     //   364: getfield c : Lme/konsolas/aac/fw;
/*     */     //   367: iload #21
/*     */     //   369: ifne -> 547
/*     */     //   372: goto -> 385
/*     */     //   375: ldc2_w -6533866801381210346
/*     */     //   378: lload_3
/*     */     //   379: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   384: athrow
/*     */     //   385: lload #22
/*     */     //   387: lconst_1
/*     */     //   388: lsub
/*     */     //   389: lload #12
/*     */     //   391: invokevirtual a : (JJ)B
/*     */     //   394: goto -> 407
/*     */     //   397: ldc2_w -6533866801381210346
/*     */     //   400: lload_3
/*     */     //   401: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   406: athrow
/*     */     //   407: bipush #13
/*     */     //   409: lload_3
/*     */     //   410: lconst_0
/*     */     //   411: lcmp
/*     */     //   412: ifle -> 433
/*     */     //   415: if_icmpne -> 540
/*     */     //   418: aload_0
/*     */     //   419: lload #22
/*     */     //   421: lconst_1
/*     */     //   422: ladd
/*     */     //   423: iload #14
/*     */     //   425: i2b
/*     */     //   426: lload #15
/*     */     //   428: invokevirtual a : (JBJ)Z
/*     */     //   431: iload #21
/*     */     //   433: lload_3
/*     */     //   434: lconst_0
/*     */     //   435: lcmp
/*     */     //   436: iflt -> 515
/*     */     //   439: ifne -> 513
/*     */     //   442: goto -> 455
/*     */     //   445: ldc2_w -6533866801381210346
/*     */     //   448: lload_3
/*     */     //   449: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   454: athrow
/*     */     //   455: ifeq -> 540
/*     */     //   458: goto -> 471
/*     */     //   461: ldc2_w -6533866801381210346
/*     */     //   464: lload_3
/*     */     //   465: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   470: athrow
/*     */     //   471: aload_0
/*     */     //   472: getfield c : Lme/konsolas/aac/fw;
/*     */     //   475: iload #21
/*     */     //   477: ifne -> 547
/*     */     //   480: goto -> 493
/*     */     //   483: ldc2_w -6533866801381210346
/*     */     //   486: lload_3
/*     */     //   487: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   492: athrow
/*     */     //   493: lload #22
/*     */     //   495: lload #12
/*     */     //   497: invokevirtual a : (JJ)B
/*     */     //   500: goto -> 513
/*     */     //   503: ldc2_w -6533866801381210346
/*     */     //   506: lload_3
/*     */     //   507: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   512: athrow
/*     */     //   513: bipush #10
/*     */     //   515: if_icmpne -> 540
/*     */     //   518: aload_0
/*     */     //   519: getfield c : Lme/konsolas/aac/fw;
/*     */     //   522: lload #22
/*     */     //   524: lload #5
/*     */     //   526: invokevirtual c : (JJ)Ljava/lang/String;
/*     */     //   529: areturn
/*     */     //   530: ldc2_w -6533866801381210346
/*     */     //   533: lload_3
/*     */     //   534: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   539: athrow
/*     */     //   540: new me/konsolas/aac/fw
/*     */     //   543: dup
/*     */     //   544: invokespecial <init> : ()V
/*     */     //   547: astore #26
/*     */     //   549: aload_0
/*     */     //   550: getfield c : Lme/konsolas/aac/fw;
/*     */     //   553: aload #26
/*     */     //   555: lconst_0
/*     */     //   556: ldc2_w 32
/*     */     //   559: aload_0
/*     */     //   560: getfield c : Lme/konsolas/aac/fw;
/*     */     //   563: invokevirtual f : ()J
/*     */     //   566: invokestatic min : (JJ)J
/*     */     //   569: lload #9
/*     */     //   571: dup2_x2
/*     */     //   572: pop2
/*     */     //   573: iload #11
/*     */     //   575: i2s
/*     */     //   576: dup_x2
/*     */     //   577: pop
/*     */     //   578: invokevirtual a : (Lme/konsolas/aac/fw;JJSJ)Lme/konsolas/aac/fw;
/*     */     //   581: pop
/*     */     //   582: new java/io/EOFException
/*     */     //   585: dup
/*     */     //   586: new java/lang/StringBuilder
/*     */     //   589: dup
/*     */     //   590: invokespecial <init> : ()V
/*     */     //   593: sipush #8977
/*     */     //   596: ldc2_w 2883508082795143774
/*     */     //   599: lload_3
/*     */     //   600: lxor
/*     */     //   601: <illegal opcode> f : (IJ)Ljava/lang/String;
/*     */     //   606: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   609: aload_0
/*     */     //   610: getfield c : Lme/konsolas/aac/fw;
/*     */     //   613: invokevirtual f : ()J
/*     */     //   616: lload_1
/*     */     //   617: invokestatic min : (JJ)J
/*     */     //   620: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*     */     //   623: sipush #1078
/*     */     //   626: ldc2_w 5566114432021906806
/*     */     //   629: lload_3
/*     */     //   630: lxor
/*     */     //   631: <illegal opcode> f : (IJ)Ljava/lang/String;
/*     */     //   636: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   639: aload #26
/*     */     //   641: lload #7
/*     */     //   643: invokevirtual a : (J)Lme/konsolas/aac/gZ;
/*     */     //   646: lload #17
/*     */     //   648: invokevirtual d : (J)Ljava/lang/String;
/*     */     //   651: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   654: sipush #8230
/*     */     //   657: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   660: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   663: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   666: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #58	-> 92
/*     */     //   #36	-> 164
/*     */     //   #199	-> 211
/*     */     //   #164	-> 224
/*     */     //   #32	-> 279
/*     */     //   #2	-> 315
/*     */     //   #193	-> 423
/*     */     //   #26	-> 518
/*     */     //   #44	-> 540
/*     */     //   #46	-> 549
/*     */     //   #189	-> 582
/*     */     //   #83	-> 641
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   92	103	106	java/io/IOException
/*     */     //   100	154	154	java/io/IOException
/*     */     //   164	174	177	java/io/IOException
/*     */     //   187	196	196	java/io/IOException
/*     */     //   224	244	247	java/io/IOException
/*     */     //   241	269	269	java/io/IOException
/*     */     //   285	299	302	java/io/IOException
/*     */     //   296	323	326	java/io/IOException
/*     */     //   336	350	353	java/io/IOException
/*     */     //   347	372	375	java/io/IOException
/*     */     //   363	394	397	java/io/IOException
/*     */     //   407	442	445	java/io/IOException
/*     */     //   418	458	461	java/io/IOException
/*     */     //   455	480	483	java/io/IOException
/*     */     //   471	500	503	java/io/IOException
/*     */     //   513	530	530	java/io/IOException
/*     */   }
/*     */   
/*     */   public long b(long paramLong1, gZ paramgZ, long paramLong2) {
/*     */     // Byte code:
/*     */     //   0: lload_1
/*     */     //   1: dup2
/*     */     //   2: ldc2_w 27974454046419
/*     */     //   5: lxor
/*     */     //   6: lstore #6
/*     */     //   8: dup2
/*     */     //   9: ldc2_w 0
/*     */     //   12: lxor
/*     */     //   13: lstore #8
/*     */     //   15: pop2
/*     */     //   16: ldc2_w -1794337060179878063
/*     */     //   19: lload_1
/*     */     //   20: <illegal opcode> w : (JJ)I
/*     */     //   25: istore #10
/*     */     //   27: aload_0
/*     */     //   28: iload #10
/*     */     //   30: ifeq -> 84
/*     */     //   33: getfield a : Z
/*     */     //   36: ifeq -> 83
/*     */     //   39: goto -> 52
/*     */     //   42: ldc2_w -1799125170057722547
/*     */     //   45: lload_1
/*     */     //   46: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   51: athrow
/*     */     //   52: new java/lang/IllegalStateException
/*     */     //   55: dup
/*     */     //   56: sipush #5192
/*     */     //   59: ldc2_w 611762752899553109
/*     */     //   62: lload_1
/*     */     //   63: lxor
/*     */     //   64: <illegal opcode> f : (IJ)Ljava/lang/String;
/*     */     //   69: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   72: athrow
/*     */     //   73: ldc2_w -1799125170057722547
/*     */     //   76: lload_1
/*     */     //   77: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   82: athrow
/*     */     //   83: aload_0
/*     */     //   84: getfield c : Lme/konsolas/aac/fw;
/*     */     //   87: lload #8
/*     */     //   89: aload_3
/*     */     //   90: lload #4
/*     */     //   92: invokevirtual b : (JLme/konsolas/aac/gZ;J)J
/*     */     //   95: lstore #11
/*     */     //   97: lload #11
/*     */     //   99: lload_1
/*     */     //   100: lconst_0
/*     */     //   101: lcmp
/*     */     //   102: ifle -> 114
/*     */     //   105: ldc2_w -1
/*     */     //   108: lcmp
/*     */     //   109: ifeq -> 143
/*     */     //   112: lload #11
/*     */     //   114: iload #10
/*     */     //   116: ifeq -> 150
/*     */     //   119: goto -> 132
/*     */     //   122: ldc2_w -1799125170057722547
/*     */     //   125: lload_1
/*     */     //   126: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   131: athrow
/*     */     //   132: lreturn
/*     */     //   133: ldc2_w -1799125170057722547
/*     */     //   136: lload_1
/*     */     //   137: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   142: athrow
/*     */     //   143: aload_0
/*     */     //   144: getfield c : Lme/konsolas/aac/fw;
/*     */     //   147: getfield a : J
/*     */     //   150: lstore #13
/*     */     //   152: aload_0
/*     */     //   153: getfield b : Lme/konsolas/aac/hp;
/*     */     //   156: aload_0
/*     */     //   157: getfield c : Lme/konsolas/aac/fw;
/*     */     //   160: lload #6
/*     */     //   162: dup2_x1
/*     */     //   163: pop2
/*     */     //   164: ldc2_w 8192
/*     */     //   167: invokeinterface a : (JLme/konsolas/aac/fw;J)J
/*     */     //   172: lload_1
/*     */     //   173: lconst_0
/*     */     //   174: lcmp
/*     */     //   175: ifle -> 224
/*     */     //   178: ldc2_w -1
/*     */     //   181: iload #10
/*     */     //   183: ifeq -> 221
/*     */     //   186: lcmp
/*     */     //   187: ifne -> 217
/*     */     //   190: goto -> 203
/*     */     //   193: ldc2_w -1799125170057722547
/*     */     //   196: lload_1
/*     */     //   197: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   202: athrow
/*     */     //   203: ldc2_w -1
/*     */     //   206: lreturn
/*     */     //   207: ldc2_w -1799125170057722547
/*     */     //   210: lload_1
/*     */     //   211: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   216: athrow
/*     */     //   217: lload #4
/*     */     //   219: lload #13
/*     */     //   221: invokestatic max : (JJ)J
/*     */     //   224: lstore #4
/*     */     //   226: goto -> 83
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #67	-> 27
/*     */     //   #35	-> 83
/*     */     //   #167	-> 97
/*     */     //   #71	-> 143
/*     */     //   #130	-> 152
/*     */     //   #112	-> 217
/*     */     //   #179	-> 226
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   27	39	42	java/io/IOException
/*     */     //   33	73	73	java/io/IOException
/*     */     //   97	119	122	java/io/IOException
/*     */     //   112	133	133	java/io/IOException
/*     */     //   152	190	193	java/io/IOException
/*     */     //   186	207	207	java/io/IOException
/*     */   }
/*     */   
/*     */   public int c(long paramLong) {
/*     */     long l1 = paramLong ^ 0x306EDC2F05D5L, l2 = paramLong ^ 0x0L;
/*     */     b(4L, l1);
/*     */     return this.c.c(l2);
/*     */   }
/*     */   
/*     */   public void a(long paramLong1, fw paramfw, long paramLong2) {
/*     */     long l1 = paramLong1 ^ 0x44E6AFFD26C7L, l2 = paramLong1 ^ 0x1284E7944A68L, l3 = paramLong1 ^ 0x0L;
/*     */     try {
/*     */       b(paramLong2, l1);
/*     */     } catch (EOFException eOFException) {
/*     */       paramfw.a(l2, this.c);
/*     */       throw eOFException;
/*     */     } 
/*     */     this.c.a(l3, paramfw, paramLong2);
/*     */   }
/*     */   
/*     */   public byte a(long paramLong) {
/*     */     long l1 = paramLong ^ 0x20083FAC034L, l2 = paramLong ^ 0x0L;
/*     */     b(1L, l1);
/*     */     return this.c.a(l2);
/*     */   }
/*     */   
/*     */   public int a(long paramLong, byte[] paramArrayOfbyte) {
/*     */     int i = (int)((paramLong ^ 0x52480F09A05BL) >>> 32L), j = (int)((paramLong ^ 0x52480F09A05BL) << 32L >>> 32L);
/*     */     paramLong ^ 0x52480F09A05BL;
/*     */     return a(i, paramArrayOfbyte, 0, paramArrayOfbyte.length, j);
/*     */   }
/*     */   
/*     */   public long b(long paramLong) {
/*     */     long l1 = paramLong ^ 0x796F14A71409L, l2 = paramLong ^ 0x0L;
/*     */     b(8L, l1);
/*     */     return this.c.b(l2);
/*     */   }
/*     */   
/*     */   public int a(int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3, int paramInt4) {
/*     */     // Byte code:
/*     */     //   0: iload_1
/*     */     //   1: i2l
/*     */     //   2: bipush #32
/*     */     //   4: lshl
/*     */     //   5: iload #5
/*     */     //   7: i2l
/*     */     //   8: bipush #32
/*     */     //   10: lshl
/*     */     //   11: bipush #32
/*     */     //   13: lushr
/*     */     //   14: lor
/*     */     //   15: lstore #6
/*     */     //   17: lload #6
/*     */     //   19: dup2
/*     */     //   20: ldc2_w 126154618483898
/*     */     //   23: lxor
/*     */     //   24: lstore #8
/*     */     //   26: dup2
/*     */     //   27: ldc2_w 102977648657808
/*     */     //   30: lxor
/*     */     //   31: lstore #10
/*     */     //   33: dup2
/*     */     //   34: ldc2_w 0
/*     */     //   37: lxor
/*     */     //   38: dup2
/*     */     //   39: bipush #32
/*     */     //   41: lushr
/*     */     //   42: l2i
/*     */     //   43: istore #12
/*     */     //   45: dup2
/*     */     //   46: bipush #32
/*     */     //   48: lshl
/*     */     //   49: bipush #32
/*     */     //   51: lushr
/*     */     //   52: l2i
/*     */     //   53: istore #13
/*     */     //   55: pop2
/*     */     //   56: pop2
/*     */     //   57: ldc2_w 4427126664127120696
/*     */     //   60: lload #6
/*     */     //   62: <illegal opcode> w : (JJ)I
/*     */     //   67: aload_2
/*     */     //   68: arraylength
/*     */     //   69: i2l
/*     */     //   70: iload_3
/*     */     //   71: i2l
/*     */     //   72: iload #4
/*     */     //   74: i2l
/*     */     //   75: lload #10
/*     */     //   77: invokestatic a : (JJJJ)V
/*     */     //   80: istore #14
/*     */     //   82: aload_0
/*     */     //   83: getfield c : Lme/konsolas/aac/fw;
/*     */     //   86: getfield a : J
/*     */     //   89: lconst_0
/*     */     //   90: lcmp
/*     */     //   91: iload #14
/*     */     //   93: ifeq -> 190
/*     */     //   96: ifne -> 176
/*     */     //   99: goto -> 113
/*     */     //   102: ldc2_w 4422907556748533540
/*     */     //   105: lload #6
/*     */     //   107: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   112: athrow
/*     */     //   113: aload_0
/*     */     //   114: getfield b : Lme/konsolas/aac/hp;
/*     */     //   117: aload_0
/*     */     //   118: getfield c : Lme/konsolas/aac/fw;
/*     */     //   121: lload #8
/*     */     //   123: dup2_x1
/*     */     //   124: pop2
/*     */     //   125: ldc2_w 8192
/*     */     //   128: invokeinterface a : (JLme/konsolas/aac/fw;J)J
/*     */     //   133: lstore #15
/*     */     //   135: lload #15
/*     */     //   137: ldc2_w -1
/*     */     //   140: lcmp
/*     */     //   141: iload #14
/*     */     //   143: ifeq -> 190
/*     */     //   146: ifne -> 176
/*     */     //   149: goto -> 163
/*     */     //   152: ldc2_w 4422907556748533540
/*     */     //   155: lload #6
/*     */     //   157: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   162: athrow
/*     */     //   163: iconst_m1
/*     */     //   164: ireturn
/*     */     //   165: ldc2_w 4422907556748533540
/*     */     //   168: lload #6
/*     */     //   170: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   175: athrow
/*     */     //   176: iload #4
/*     */     //   178: i2l
/*     */     //   179: aload_0
/*     */     //   180: getfield c : Lme/konsolas/aac/fw;
/*     */     //   183: getfield a : J
/*     */     //   186: invokestatic min : (JJ)J
/*     */     //   189: l2i
/*     */     //   190: istore #15
/*     */     //   192: aload_0
/*     */     //   193: getfield c : Lme/konsolas/aac/fw;
/*     */     //   196: iload #12
/*     */     //   198: aload_2
/*     */     //   199: iload_3
/*     */     //   200: iload #15
/*     */     //   202: iload #13
/*     */     //   204: invokevirtual a : (I[BIII)I
/*     */     //   207: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #98	-> 67
/*     */     //   #182	-> 82
/*     */     //   #22	-> 113
/*     */     //   #17	-> 135
/*     */     //   #102	-> 176
/*     */     //   #205	-> 192
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   82	99	102	java/io/IOException
/*     */     //   135	149	152	java/io/IOException
/*     */     //   146	165	165	java/io/IOException
/*     */   }
/*     */   
/*     */   public void b(long paramLong1, long paramLong2) {
/*     */     // Byte code:
/*     */     //   0: lload_3
/*     */     //   1: dup2
/*     */     //   2: ldc2_w 19946252321286
/*     */     //   5: lxor
/*     */     //   6: dup2
/*     */     //   7: bipush #56
/*     */     //   9: lushr
/*     */     //   10: l2i
/*     */     //   11: istore #5
/*     */     //   13: dup2
/*     */     //   14: bipush #8
/*     */     //   16: lshl
/*     */     //   17: bipush #8
/*     */     //   19: lushr
/*     */     //   20: lstore #6
/*     */     //   22: pop2
/*     */     //   23: pop2
/*     */     //   24: aload_0
/*     */     //   25: lload_1
/*     */     //   26: iload #5
/*     */     //   28: i2b
/*     */     //   29: lload #6
/*     */     //   31: invokevirtual a : (JBJ)Z
/*     */     //   34: ifne -> 55
/*     */     //   37: new java/io/EOFException
/*     */     //   40: dup
/*     */     //   41: invokespecial <init> : ()V
/*     */     //   44: athrow
/*     */     //   45: ldc2_w 5307247779631033314
/*     */     //   48: lload_3
/*     */     //   49: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   54: athrow
/*     */     //   55: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #103	-> 24
/*     */     //   #200	-> 55
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   24	45	45	java/io/IOException
/*     */   }
/*     */   
/*     */   public String a(long paramLong1, long paramLong2, Charset paramCharset) {
/*     */     // Byte code:
/*     */     //   0: lload_3
/*     */     //   1: dup2
/*     */     //   2: ldc2_w 140645107443131
/*     */     //   5: lxor
/*     */     //   6: lstore #6
/*     */     //   8: dup2
/*     */     //   9: ldc2_w 0
/*     */     //   12: lxor
/*     */     //   13: lstore #8
/*     */     //   15: pop2
/*     */     //   16: ldc2_w 7821862425018055348
/*     */     //   19: lload_3
/*     */     //   20: <illegal opcode> w : (JJ)I
/*     */     //   25: istore #10
/*     */     //   27: aload_0
/*     */     //   28: iload #10
/*     */     //   30: ifne -> 89
/*     */     //   33: lload_1
/*     */     //   34: lload #6
/*     */     //   36: invokevirtual b : (JJ)V
/*     */     //   39: aload #5
/*     */     //   41: ifnonnull -> 88
/*     */     //   44: goto -> 57
/*     */     //   47: ldc2_w 7790205182969138777
/*     */     //   50: lload_3
/*     */     //   51: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   56: athrow
/*     */     //   57: new java/lang/IllegalArgumentException
/*     */     //   60: dup
/*     */     //   61: sipush #24477
/*     */     //   64: ldc2_w 1767973069419370391
/*     */     //   67: lload_3
/*     */     //   68: lxor
/*     */     //   69: <illegal opcode> f : (IJ)Ljava/lang/String;
/*     */     //   74: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   77: athrow
/*     */     //   78: ldc2_w 7790205182969138777
/*     */     //   81: lload_3
/*     */     //   82: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   87: athrow
/*     */     //   88: aload_0
/*     */     //   89: getfield c : Lme/konsolas/aac/fw;
/*     */     //   92: lload_1
/*     */     //   93: lload #8
/*     */     //   95: aload #5
/*     */     //   97: invokevirtual a : (JJLjava/nio/charset/Charset;)Ljava/lang/String;
/*     */     //   100: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #105	-> 27
/*     */     //   #140	-> 39
/*     */     //   #40	-> 88
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   27	44	47	java/io/IOException
/*     */     //   33	78	78	java/io/IOException
/*     */   }
/*     */   
/*     */   public boolean isOpen() {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/q.d : J
/*     */     //   3: ldc2_w 63864801365036
/*     */     //   6: lxor
/*     */     //   7: lstore_1
/*     */     //   8: ldc2_w -3862409050864837539
/*     */     //   11: lload_1
/*     */     //   12: <illegal opcode> w : (JJ)I
/*     */     //   17: istore_3
/*     */     //   18: aload_0
/*     */     //   19: getfield a : Z
/*     */     //   22: iload_3
/*     */     //   23: ifne -> 43
/*     */     //   26: ifne -> 46
/*     */     //   29: goto -> 42
/*     */     //   32: ldc2_w -3822008698480891728
/*     */     //   35: lload_1
/*     */     //   36: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   41: athrow
/*     */     //   42: iconst_1
/*     */     //   43: goto -> 47
/*     */     //   46: iconst_0
/*     */     //   47: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #114	-> 18
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   18	29	32	java/lang/NullPointerException
/*     */   }
/*     */   
/*     */   public short b(long paramLong) {
/*     */     long l1 = paramLong ^ 0x44F12826D5A6L, l2 = paramLong ^ 0x0L;
/*     */     b(2L, l1);
/*     */     return this.c.b(l2);
/*     */   }
/*     */   
/*     */   public String c(long paramLong) {
/*     */     long l1 = paramLong ^ 0x311E4F1380DBL, l2 = paramLong ^ 0x0L;
/*     */     this.c.a(l1, this.b);
/*     */     return this.c.c(l2);
/*     */   }
/*     */   
/*     */   public bX a(long paramLong) {
/*     */     long l = paramLong ^ 0x17BF6225D069L;
/*     */     int i = (int)((paramLong ^ 0x11E8ED32A713L) >>> 48L), j = (int)((paramLong ^ 0x11E8ED32A713L) << 16L >>> 48L), k = (int)((paramLong ^ 0x11E8ED32A713L) << 32L >>> 32L);
/*     */     paramLong ^ 0x11E8ED32A713L;
/*     */     mB mB = new mB(this, l);
/*     */     return ds.a((short)i, mB, (char)j, k);
/*     */   }
/*     */   
/*     */   public byte[] a(long paramLong) {
/*     */     long l1 = paramLong ^ 0x33281C7F210L, l2 = paramLong ^ 0x0L;
/*     */     this.c.a(l1, this.b);
/*     */     return this.c.a(l2);
/*     */   }
/*     */   
/*     */   public long d(long paramLong) {
/*     */     // Byte code:
/*     */     //   0: lload_1
/*     */     //   1: dup2
/*     */     //   2: ldc2_w 99811726332827
/*     */     //   5: lxor
/*     */     //   6: lstore_3
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 0
/*     */     //   11: lxor
/*     */     //   12: lstore #5
/*     */     //   14: dup2
/*     */     //   15: ldc2_w 133150985266462
/*     */     //   18: lxor
/*     */     //   19: lstore #7
/*     */     //   21: dup2
/*     */     //   22: ldc2_w 80140385571229
/*     */     //   25: lxor
/*     */     //   26: dup2
/*     */     //   27: bipush #56
/*     */     //   29: lushr
/*     */     //   30: l2i
/*     */     //   31: istore #9
/*     */     //   33: dup2
/*     */     //   34: bipush #8
/*     */     //   36: lshl
/*     */     //   37: bipush #8
/*     */     //   39: lushr
/*     */     //   40: lstore #10
/*     */     //   42: pop2
/*     */     //   43: pop2
/*     */     //   44: aload_0
/*     */     //   45: lconst_1
/*     */     //   46: lload_3
/*     */     //   47: invokevirtual b : (JJ)V
/*     */     //   50: ldc2_w 6497983669771919973
/*     */     //   53: lload_1
/*     */     //   54: <illegal opcode> w : (JJ)I
/*     */     //   59: iconst_0
/*     */     //   60: istore #13
/*     */     //   62: istore #12
/*     */     //   64: aload_0
/*     */     //   65: iload #13
/*     */     //   67: iconst_1
/*     */     //   68: iadd
/*     */     //   69: i2l
/*     */     //   70: iload #9
/*     */     //   72: i2b
/*     */     //   73: lload #10
/*     */     //   75: invokevirtual a : (JBJ)Z
/*     */     //   78: ifeq -> 423
/*     */     //   81: aload_0
/*     */     //   82: getfield c : Lme/konsolas/aac/fw;
/*     */     //   85: iload #12
/*     */     //   87: lload_1
/*     */     //   88: lconst_0
/*     */     //   89: lcmp
/*     */     //   90: ifle -> 98
/*     */     //   93: ifeq -> 433
/*     */     //   96: iload #13
/*     */     //   98: i2l
/*     */     //   99: lload #7
/*     */     //   101: invokevirtual a : (JJ)B
/*     */     //   104: istore #14
/*     */     //   106: iload #14
/*     */     //   108: bipush #48
/*     */     //   110: iload #12
/*     */     //   112: ifeq -> 192
/*     */     //   115: if_icmplt -> 175
/*     */     //   118: goto -> 131
/*     */     //   121: ldc2_w 6502207733274343545
/*     */     //   124: lload_1
/*     */     //   125: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   130: athrow
/*     */     //   131: iload #14
/*     */     //   133: bipush #57
/*     */     //   135: iload #12
/*     */     //   137: lload_1
/*     */     //   138: lconst_0
/*     */     //   139: lcmp
/*     */     //   140: ifle -> 194
/*     */     //   143: ifeq -> 192
/*     */     //   146: goto -> 159
/*     */     //   149: ldc2_w 6502207733274343545
/*     */     //   152: lload_1
/*     */     //   153: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   158: athrow
/*     */     //   159: if_icmple -> 415
/*     */     //   162: goto -> 175
/*     */     //   165: ldc2_w 6502207733274343545
/*     */     //   168: lload_1
/*     */     //   169: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   174: athrow
/*     */     //   175: iload #14
/*     */     //   177: bipush #97
/*     */     //   179: goto -> 192
/*     */     //   182: ldc2_w 6502207733274343545
/*     */     //   185: lload_1
/*     */     //   186: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   191: athrow
/*     */     //   192: iload #12
/*     */     //   194: ifeq -> 292
/*     */     //   197: if_icmplt -> 257
/*     */     //   200: goto -> 213
/*     */     //   203: ldc2_w 6502207733274343545
/*     */     //   206: lload_1
/*     */     //   207: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   212: athrow
/*     */     //   213: iload #14
/*     */     //   215: bipush #102
/*     */     //   217: lload_1
/*     */     //   218: lconst_0
/*     */     //   219: lcmp
/*     */     //   220: iflt -> 292
/*     */     //   223: iload #12
/*     */     //   225: ifeq -> 292
/*     */     //   228: goto -> 241
/*     */     //   231: ldc2_w 6502207733274343545
/*     */     //   234: lload_1
/*     */     //   235: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   240: athrow
/*     */     //   241: if_icmple -> 415
/*     */     //   244: goto -> 257
/*     */     //   247: ldc2_w 6502207733274343545
/*     */     //   250: lload_1
/*     */     //   251: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   256: athrow
/*     */     //   257: iload #14
/*     */     //   259: iload #12
/*     */     //   261: ifeq -> 366
/*     */     //   264: goto -> 277
/*     */     //   267: ldc2_w 6502207733274343545
/*     */     //   270: lload_1
/*     */     //   271: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   276: athrow
/*     */     //   277: bipush #65
/*     */     //   279: goto -> 292
/*     */     //   282: ldc2_w 6502207733274343545
/*     */     //   285: lload_1
/*     */     //   286: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   291: athrow
/*     */     //   292: lload_1
/*     */     //   293: lconst_0
/*     */     //   294: lcmp
/*     */     //   295: ifle -> 311
/*     */     //   298: if_icmplt -> 351
/*     */     //   301: iload #14
/*     */     //   303: lload_1
/*     */     //   304: lconst_0
/*     */     //   305: lcmp
/*     */     //   306: iflt -> 366
/*     */     //   309: iload #12
/*     */     //   311: ifeq -> 366
/*     */     //   314: goto -> 327
/*     */     //   317: ldc2_w 6502207733274343545
/*     */     //   320: lload_1
/*     */     //   321: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   326: athrow
/*     */     //   327: lload_1
/*     */     //   328: lconst_0
/*     */     //   329: lcmp
/*     */     //   330: ifle -> 420
/*     */     //   333: bipush #70
/*     */     //   335: if_icmple -> 415
/*     */     //   338: goto -> 351
/*     */     //   341: ldc2_w 6502207733274343545
/*     */     //   344: lload_1
/*     */     //   345: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   350: athrow
/*     */     //   351: iload #13
/*     */     //   353: goto -> 366
/*     */     //   356: ldc2_w 6502207733274343545
/*     */     //   359: lload_1
/*     */     //   360: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   365: athrow
/*     */     //   366: ifne -> 423
/*     */     //   369: new java/lang/NumberFormatException
/*     */     //   372: dup
/*     */     //   373: sipush #28130
/*     */     //   376: ldc2_w 326289391288374222
/*     */     //   379: lload_1
/*     */     //   380: lxor
/*     */     //   381: <illegal opcode> f : (IJ)Ljava/lang/String;
/*     */     //   386: iconst_1
/*     */     //   387: anewarray java/lang/Object
/*     */     //   390: dup
/*     */     //   391: iconst_0
/*     */     //   392: iload #14
/*     */     //   394: invokestatic valueOf : (B)Ljava/lang/Byte;
/*     */     //   397: aastore
/*     */     //   398: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   401: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   404: athrow
/*     */     //   405: ldc2_w 6502207733274343545
/*     */     //   408: lload_1
/*     */     //   409: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   414: athrow
/*     */     //   415: iinc #13, 1
/*     */     //   418: iload #12
/*     */     //   420: ifne -> 64
/*     */     //   423: aload_0
/*     */     //   424: lload_1
/*     */     //   425: lconst_0
/*     */     //   426: lcmp
/*     */     //   427: ifle -> 82
/*     */     //   430: getfield c : Lme/konsolas/aac/fw;
/*     */     //   433: lload #5
/*     */     //   435: invokevirtual d : (J)J
/*     */     //   438: lreturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #136	-> 44
/*     */     //   #185	-> 59
/*     */     //   #79	-> 81
/*     */     //   #101	-> 106
/*     */     //   #172	-> 351
/*     */     //   #20	-> 369
/*     */     //   #42	-> 394
/*     */     //   #126	-> 398
/*     */     //   #165	-> 415
/*     */     //   #149	-> 423
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   106	118	121	java/io/IOException
/*     */     //   115	146	149	java/io/IOException
/*     */     //   131	162	165	java/io/IOException
/*     */     //   159	179	182	java/io/IOException
/*     */     //   192	200	203	java/io/IOException
/*     */     //   197	228	231	java/io/IOException
/*     */     //   213	244	247	java/io/IOException
/*     */     //   241	264	267	java/io/IOException
/*     */     //   257	279	282	java/io/IOException
/*     */     //   292	314	317	java/io/IOException
/*     */     //   301	338	341	java/io/IOException
/*     */     //   327	353	356	java/io/IOException
/*     */     //   366	405	405	java/io/IOException
/*     */   }
/*     */   
/*     */   public fw b() {
/*     */     return this.c;
/*     */   }
/*     */   
/*     */   public void a(long paramLong, byte[] paramArrayOfbyte) {
/*     */     // Byte code:
/*     */     //   0: lload_1
/*     */     //   1: dup2
/*     */     //   2: ldc2_w 60086081626668
/*     */     //   5: lxor
/*     */     //   6: lstore #4
/*     */     //   8: dup2
/*     */     //   9: ldc2_w 76846293931754
/*     */     //   12: lxor
/*     */     //   13: dup2
/*     */     //   14: bipush #32
/*     */     //   16: lushr
/*     */     //   17: l2i
/*     */     //   18: istore #6
/*     */     //   20: dup2
/*     */     //   21: bipush #32
/*     */     //   23: lshl
/*     */     //   24: bipush #32
/*     */     //   26: lushr
/*     */     //   27: l2i
/*     */     //   28: istore #7
/*     */     //   30: pop2
/*     */     //   31: dup2
/*     */     //   32: ldc2_w 0
/*     */     //   35: lxor
/*     */     //   36: lstore #8
/*     */     //   38: pop2
/*     */     //   39: ldc2_w 7717937352140340515
/*     */     //   42: lload_1
/*     */     //   43: <illegal opcode> w : (JJ)I
/*     */     //   48: istore #10
/*     */     //   50: aload_0
/*     */     //   51: aload_3
/*     */     //   52: arraylength
/*     */     //   53: i2l
/*     */     //   54: lload #4
/*     */     //   56: invokevirtual b : (JJ)V
/*     */     //   59: goto -> 166
/*     */     //   62: astore #11
/*     */     //   64: iconst_0
/*     */     //   65: istore #12
/*     */     //   67: aload_0
/*     */     //   68: getfield c : Lme/konsolas/aac/fw;
/*     */     //   71: getfield a : J
/*     */     //   74: lconst_0
/*     */     //   75: lcmp
/*     */     //   76: ifle -> 163
/*     */     //   79: aload_0
/*     */     //   80: getfield c : Lme/konsolas/aac/fw;
/*     */     //   83: iload #6
/*     */     //   85: aload_3
/*     */     //   86: iload #12
/*     */     //   88: aload_0
/*     */     //   89: getfield c : Lme/konsolas/aac/fw;
/*     */     //   92: getfield a : J
/*     */     //   95: l2i
/*     */     //   96: iload #7
/*     */     //   98: invokevirtual a : (I[BIII)I
/*     */     //   101: istore #13
/*     */     //   103: iload #13
/*     */     //   105: lload_1
/*     */     //   106: lconst_0
/*     */     //   107: lcmp
/*     */     //   108: iflt -> 160
/*     */     //   111: iconst_m1
/*     */     //   112: iload #10
/*     */     //   114: ifne -> 155
/*     */     //   117: if_icmpne -> 151
/*     */     //   120: goto -> 133
/*     */     //   123: ldc2_w 7749312981815413198
/*     */     //   126: lload_1
/*     */     //   127: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   132: athrow
/*     */     //   133: new java/lang/AssertionError
/*     */     //   136: dup
/*     */     //   137: invokespecial <init> : ()V
/*     */     //   140: athrow
/*     */     //   141: ldc2_w 7749312981815413198
/*     */     //   144: lload_1
/*     */     //   145: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   150: athrow
/*     */     //   151: iload #12
/*     */     //   153: iload #13
/*     */     //   155: iadd
/*     */     //   156: istore #12
/*     */     //   158: iload #10
/*     */     //   160: ifeq -> 67
/*     */     //   163: aload #11
/*     */     //   165: athrow
/*     */     //   166: aload_0
/*     */     //   167: getfield c : Lme/konsolas/aac/fw;
/*     */     //   170: lload #8
/*     */     //   172: aload_3
/*     */     //   173: invokevirtual a : (J[B)V
/*     */     //   176: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #141	-> 50
/*     */     //   #50	-> 59
/*     */     //   #6	-> 62
/*     */     //   #158	-> 64
/*     */     //   #62	-> 67
/*     */     //   #87	-> 79
/*     */     //   #119	-> 103
/*     */     //   #96	-> 151
/*     */     //   #10	-> 158
/*     */     //   #63	-> 163
/*     */     //   #118	-> 166
/*     */     //   #89	-> 176
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   50	59	62	java/io/EOFException
/*     */     //   103	120	123	java/io/EOFException
/*     */     //   117	141	141	java/io/EOFException
/*     */   }
/*     */   
/*     */   public long a(int paramInt1, short paramShort, gp paramgp, int paramInt2) {
/*     */     // Byte code:
/*     */     //   0: iload_1
/*     */     //   1: i2l
/*     */     //   2: bipush #32
/*     */     //   4: lshl
/*     */     //   5: iload_2
/*     */     //   6: i2l
/*     */     //   7: bipush #48
/*     */     //   9: lshl
/*     */     //   10: bipush #32
/*     */     //   12: lushr
/*     */     //   13: lor
/*     */     //   14: iload #4
/*     */     //   16: i2l
/*     */     //   17: bipush #48
/*     */     //   19: lshl
/*     */     //   20: bipush #48
/*     */     //   22: lushr
/*     */     //   23: lor
/*     */     //   24: lstore #5
/*     */     //   26: lload #5
/*     */     //   28: dup2
/*     */     //   29: ldc2_w 38031015200232
/*     */     //   32: lxor
/*     */     //   33: lstore #7
/*     */     //   35: dup2
/*     */     //   36: ldc2_w 132028272969959
/*     */     //   39: lxor
/*     */     //   40: dup2
/*     */     //   41: bipush #32
/*     */     //   43: lushr
/*     */     //   44: l2i
/*     */     //   45: istore #9
/*     */     //   47: dup2
/*     */     //   48: bipush #32
/*     */     //   50: lshl
/*     */     //   51: bipush #48
/*     */     //   53: lushr
/*     */     //   54: l2i
/*     */     //   55: istore #10
/*     */     //   57: dup2
/*     */     //   58: bipush #48
/*     */     //   60: lshl
/*     */     //   61: bipush #48
/*     */     //   63: lushr
/*     */     //   64: l2i
/*     */     //   65: istore #11
/*     */     //   67: pop2
/*     */     //   68: dup2
/*     */     //   69: ldc2_w 9254943869291
/*     */     //   72: lxor
/*     */     //   73: lstore #12
/*     */     //   75: pop2
/*     */     //   76: ldc2_w 5522410327944731291
/*     */     //   79: lload #5
/*     */     //   81: <illegal opcode> w : (JJ)I
/*     */     //   86: istore #14
/*     */     //   88: aload_3
/*     */     //   89: ifnonnull -> 125
/*     */     //   92: new java/lang/IllegalArgumentException
/*     */     //   95: dup
/*     */     //   96: sipush #26182
/*     */     //   99: ldc2_w 8270616696422649451
/*     */     //   102: lload #5
/*     */     //   104: lxor
/*     */     //   105: <illegal opcode> f : (IJ)Ljava/lang/String;
/*     */     //   110: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   113: athrow
/*     */     //   114: ldc2_w 5490735493714636406
/*     */     //   117: lload #5
/*     */     //   119: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   124: athrow
/*     */     //   125: lconst_0
/*     */     //   126: lstore #15
/*     */     //   128: aload_0
/*     */     //   129: getfield b : Lme/konsolas/aac/hp;
/*     */     //   132: aload_0
/*     */     //   133: getfield c : Lme/konsolas/aac/fw;
/*     */     //   136: lload #7
/*     */     //   138: dup2_x1
/*     */     //   139: pop2
/*     */     //   140: ldc2_w 8192
/*     */     //   143: invokeinterface a : (JLme/konsolas/aac/fw;J)J
/*     */     //   148: ldc2_w -1
/*     */     //   151: lcmp
/*     */     //   152: ifeq -> 268
/*     */     //   155: aload_0
/*     */     //   156: getfield c : Lme/konsolas/aac/fw;
/*     */     //   159: iload #9
/*     */     //   161: iload #10
/*     */     //   163: i2c
/*     */     //   164: iload #11
/*     */     //   166: i2s
/*     */     //   167: invokevirtual e : (ICS)J
/*     */     //   170: lstore #17
/*     */     //   172: lload #17
/*     */     //   174: iload #4
/*     */     //   176: ifle -> 245
/*     */     //   179: lconst_0
/*     */     //   180: iload #14
/*     */     //   182: ifne -> 244
/*     */     //   185: lcmp
/*     */     //   186: iload #14
/*     */     //   188: ifne -> 300
/*     */     //   191: goto -> 205
/*     */     //   194: ldc2_w 5490735493714636406
/*     */     //   197: lload #5
/*     */     //   199: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   204: athrow
/*     */     //   205: iload_1
/*     */     //   206: ifle -> 265
/*     */     //   209: ifle -> 263
/*     */     //   212: goto -> 226
/*     */     //   215: ldc2_w 5490735493714636406
/*     */     //   218: lload #5
/*     */     //   220: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   225: athrow
/*     */     //   226: lload #15
/*     */     //   228: lload #17
/*     */     //   230: goto -> 244
/*     */     //   233: ldc2_w 5490735493714636406
/*     */     //   236: lload #5
/*     */     //   238: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   243: athrow
/*     */     //   244: ladd
/*     */     //   245: lstore #15
/*     */     //   247: aload_3
/*     */     //   248: aload_0
/*     */     //   249: getfield c : Lme/konsolas/aac/fw;
/*     */     //   252: lload #12
/*     */     //   254: dup2_x1
/*     */     //   255: pop2
/*     */     //   256: lload #17
/*     */     //   258: invokeinterface b : (JLme/konsolas/aac/fw;J)V
/*     */     //   263: iload #14
/*     */     //   265: ifeq -> 128
/*     */     //   268: aload_0
/*     */     //   269: getfield c : Lme/konsolas/aac/fw;
/*     */     //   272: invokevirtual f : ()J
/*     */     //   275: iload_2
/*     */     //   276: ifge -> 170
/*     */     //   279: iload #14
/*     */     //   281: ifne -> 338
/*     */     //   284: lconst_0
/*     */     //   285: lcmp
/*     */     //   286: goto -> 300
/*     */     //   289: ldc2_w 5490735493714636406
/*     */     //   292: lload #5
/*     */     //   294: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   299: athrow
/*     */     //   300: ifle -> 336
/*     */     //   303: lload #15
/*     */     //   305: aload_0
/*     */     //   306: getfield c : Lme/konsolas/aac/fw;
/*     */     //   309: invokevirtual f : ()J
/*     */     //   312: ladd
/*     */     //   313: lstore #15
/*     */     //   315: aload_3
/*     */     //   316: aload_0
/*     */     //   317: getfield c : Lme/konsolas/aac/fw;
/*     */     //   320: lload #12
/*     */     //   322: dup2_x1
/*     */     //   323: pop2
/*     */     //   324: aload_0
/*     */     //   325: getfield c : Lme/konsolas/aac/fw;
/*     */     //   328: invokevirtual f : ()J
/*     */     //   331: invokeinterface b : (JLme/konsolas/aac/fw;J)V
/*     */     //   336: lload #15
/*     */     //   338: lreturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #142	-> 88
/*     */     //   #57	-> 125
/*     */     //   #61	-> 128
/*     */     //   #169	-> 155
/*     */     //   #190	-> 172
/*     */     //   #68	-> 226
/*     */     //   #93	-> 247
/*     */     //   #1	-> 263
/*     */     //   #161	-> 268
/*     */     //   #173	-> 303
/*     */     //   #27	-> 315
/*     */     //   #147	-> 336
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   88	114	114	java/io/IOException
/*     */     //   172	191	194	java/io/IOException
/*     */     //   185	212	215	java/io/IOException
/*     */     //   205	230	233	java/io/IOException
/*     */     //   268	286	289	java/io/IOException
/*     */   }
/*     */   
/*     */   public gZ a(long paramLong) {
/*     */     long l1 = paramLong ^ 0x0L, l2 = paramLong ^ 0x427DC8E62402L;
/*     */     this.c.a(l2, this.b);
/*     */     return this.c.a(l1);
/*     */   }
/*     */   
/*     */   public void close() {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/q.d : J
/*     */     //   3: ldc2_w 3477705632323
/*     */     //   6: lxor
/*     */     //   7: lstore_1
/*     */     //   8: lload_1
/*     */     //   9: dup2
/*     */     //   10: ldc2_w 125828418045274
/*     */     //   13: lxor
/*     */     //   14: dup2
/*     */     //   15: bipush #48
/*     */     //   17: lushr
/*     */     //   18: l2i
/*     */     //   19: istore_3
/*     */     //   20: dup2
/*     */     //   21: bipush #16
/*     */     //   23: lshl
/*     */     //   24: bipush #32
/*     */     //   26: lushr
/*     */     //   27: l2i
/*     */     //   28: istore #4
/*     */     //   30: dup2
/*     */     //   31: bipush #48
/*     */     //   33: lshl
/*     */     //   34: bipush #48
/*     */     //   36: lushr
/*     */     //   37: l2i
/*     */     //   38: istore #5
/*     */     //   40: pop2
/*     */     //   41: pop2
/*     */     //   42: ldc2_w -1438110276316120526
/*     */     //   45: lload_1
/*     */     //   46: <illegal opcode> w : (JJ)I
/*     */     //   51: istore #6
/*     */     //   53: aload_0
/*     */     //   54: iload #6
/*     */     //   56: ifne -> 104
/*     */     //   59: getfield a : Z
/*     */     //   62: ifeq -> 89
/*     */     //   65: goto -> 78
/*     */     //   68: ldc2_w -1397727310191014177
/*     */     //   71: lload_1
/*     */     //   72: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   77: athrow
/*     */     //   78: return
/*     */     //   79: ldc2_w -1397727310191014177
/*     */     //   82: lload_1
/*     */     //   83: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   88: athrow
/*     */     //   89: aload_0
/*     */     //   90: iconst_1
/*     */     //   91: putfield a : Z
/*     */     //   94: aload_0
/*     */     //   95: getfield b : Lme/konsolas/aac/hp;
/*     */     //   98: invokeinterface close : ()V
/*     */     //   103: aload_0
/*     */     //   104: getfield c : Lme/konsolas/aac/fw;
/*     */     //   107: iload_3
/*     */     //   108: i2c
/*     */     //   109: iload #4
/*     */     //   111: iload #5
/*     */     //   113: invokevirtual a : (CII)V
/*     */     //   116: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #150	-> 53
/*     */     //   #11	-> 89
/*     */     //   #198	-> 94
/*     */     //   #132	-> 103
/*     */     //   #56	-> 116
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   53	65	68	java/io/IOException
/*     */     //   59	79	79	java/io/IOException
/*     */   }
/*     */   
/*     */   public long a(long paramLong1, fw paramfw, long paramLong2) {
/*     */     // Byte code:
/*     */     //   0: lload_1
/*     */     //   1: dup2
/*     */     //   2: ldc2_w 0
/*     */     //   5: lxor
/*     */     //   6: lstore #6
/*     */     //   8: dup2
/*     */     //   9: ldc2_w 0
/*     */     //   12: lxor
/*     */     //   13: lstore #8
/*     */     //   15: pop2
/*     */     //   16: ldc2_w -8517957803077422718
/*     */     //   19: lload_1
/*     */     //   20: <illegal opcode> w : (JJ)I
/*     */     //   25: istore #10
/*     */     //   27: aload_3
/*     */     //   28: ifnonnull -> 62
/*     */     //   31: new java/lang/IllegalArgumentException
/*     */     //   34: dup
/*     */     //   35: sipush #941
/*     */     //   38: ldc2_w 6927682117581336174
/*     */     //   41: lload_1
/*     */     //   42: lxor
/*     */     //   43: <illegal opcode> f : (IJ)Ljava/lang/String;
/*     */     //   48: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   51: athrow
/*     */     //   52: ldc2_w -8513175203120174178
/*     */     //   55: lload_1
/*     */     //   56: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   61: athrow
/*     */     //   62: lload #4
/*     */     //   64: lconst_0
/*     */     //   65: lcmp
/*     */     //   66: iload #10
/*     */     //   68: lload_1
/*     */     //   69: lconst_0
/*     */     //   70: lcmp
/*     */     //   71: iflt -> 148
/*     */     //   74: ifeq -> 146
/*     */     //   77: ifge -> 142
/*     */     //   80: goto -> 93
/*     */     //   83: ldc2_w -8513175203120174178
/*     */     //   86: lload_1
/*     */     //   87: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   92: athrow
/*     */     //   93: new java/lang/IllegalArgumentException
/*     */     //   96: dup
/*     */     //   97: new java/lang/StringBuilder
/*     */     //   100: dup
/*     */     //   101: invokespecial <init> : ()V
/*     */     //   104: sipush #2418
/*     */     //   107: ldc2_w 6435891268889666736
/*     */     //   110: lload_1
/*     */     //   111: lxor
/*     */     //   112: <illegal opcode> f : (IJ)Ljava/lang/String;
/*     */     //   117: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   120: lload #4
/*     */     //   122: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*     */     //   125: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   128: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   131: athrow
/*     */     //   132: ldc2_w -8513175203120174178
/*     */     //   135: lload_1
/*     */     //   136: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   141: athrow
/*     */     //   142: aload_0
/*     */     //   143: getfield a : Z
/*     */     //   146: iload #10
/*     */     //   148: ifeq -> 225
/*     */     //   151: ifeq -> 198
/*     */     //   154: goto -> 167
/*     */     //   157: ldc2_w -8513175203120174178
/*     */     //   160: lload_1
/*     */     //   161: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   166: athrow
/*     */     //   167: new java/lang/IllegalStateException
/*     */     //   170: dup
/*     */     //   171: sipush #5192
/*     */     //   174: ldc2_w 611772164324063622
/*     */     //   177: lload_1
/*     */     //   178: lxor
/*     */     //   179: <illegal opcode> f : (IJ)Ljava/lang/String;
/*     */     //   184: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   187: athrow
/*     */     //   188: ldc2_w -8513175203120174178
/*     */     //   191: lload_1
/*     */     //   192: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   197: athrow
/*     */     //   198: aload_0
/*     */     //   199: getfield c : Lme/konsolas/aac/fw;
/*     */     //   202: getfield a : J
/*     */     //   205: lconst_0
/*     */     //   206: iload #10
/*     */     //   208: ifeq -> 306
/*     */     //   211: lcmp
/*     */     //   212: goto -> 225
/*     */     //   215: ldc2_w -8513175203120174178
/*     */     //   218: lload_1
/*     */     //   219: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   224: athrow
/*     */     //   225: ifne -> 297
/*     */     //   228: aload_0
/*     */     //   229: getfield b : Lme/konsolas/aac/hp;
/*     */     //   232: aload_0
/*     */     //   233: getfield c : Lme/konsolas/aac/fw;
/*     */     //   236: lload #6
/*     */     //   238: dup2_x1
/*     */     //   239: pop2
/*     */     //   240: ldc2_w 8192
/*     */     //   243: invokeinterface a : (JLme/konsolas/aac/fw;J)J
/*     */     //   248: lstore #11
/*     */     //   250: lload #11
/*     */     //   252: lload_1
/*     */     //   253: lconst_0
/*     */     //   254: lcmp
/*     */     //   255: iflt -> 323
/*     */     //   258: ldc2_w -1
/*     */     //   261: iload #10
/*     */     //   263: ifeq -> 306
/*     */     //   266: lcmp
/*     */     //   267: ifne -> 297
/*     */     //   270: goto -> 283
/*     */     //   273: ldc2_w -8513175203120174178
/*     */     //   276: lload_1
/*     */     //   277: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   282: athrow
/*     */     //   283: ldc2_w -1
/*     */     //   286: lreturn
/*     */     //   287: ldc2_w -8513175203120174178
/*     */     //   290: lload_1
/*     */     //   291: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   296: athrow
/*     */     //   297: lload #4
/*     */     //   299: aload_0
/*     */     //   300: getfield c : Lme/konsolas/aac/fw;
/*     */     //   303: getfield a : J
/*     */     //   306: invokestatic min : (JJ)J
/*     */     //   309: lstore #11
/*     */     //   311: aload_0
/*     */     //   312: getfield c : Lme/konsolas/aac/fw;
/*     */     //   315: lload #8
/*     */     //   317: aload_3
/*     */     //   318: lload #11
/*     */     //   320: invokevirtual a : (JLme/konsolas/aac/fw;J)J
/*     */     //   323: lreturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #151	-> 27
/*     */     //   #206	-> 62
/*     */     //   #106	-> 142
/*     */     //   #48	-> 198
/*     */     //   #146	-> 228
/*     */     //   #31	-> 250
/*     */     //   #81	-> 297
/*     */     //   #85	-> 311
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   27	52	52	java/io/IOException
/*     */     //   62	80	83	java/io/IOException
/*     */     //   77	132	132	java/io/IOException
/*     */     //   146	154	157	java/io/IOException
/*     */     //   151	188	188	java/io/IOException
/*     */     //   198	212	215	java/io/IOException
/*     */     //   250	270	273	java/io/IOException
/*     */     //   266	287	287	java/io/IOException
/*     */   }
/*     */   
/*     */   public long a(long paramLong, gZ paramgZ) {
/*     */     long l = paramLong ^ 0x1825ADC869CFL;
/*     */     return a(paramgZ, 0L, l);
/*     */   }
/*     */   
/*     */   public boolean a(long paramLong1, gZ paramgZ, long paramLong2) {
/*     */     int i = (int)((paramLong2 ^ 0x54128F4AFFB4L) >>> 48L), j = (int)((paramLong2 ^ 0x54128F4AFFB4L) << 16L >>> 32L), k = (int)((paramLong2 ^ 0x54128F4AFFB4L) << 48L >>> 48L);
/*     */     paramLong2 ^ 0x54128F4AFFB4L;
/*     */     return a(paramLong1, (short)i, j, paramgZ, 0, paramgZ.a(), k);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public String a(long paramLong) {
/*     */     // Byte code:
/*     */     //   0: lload_1
/*     */     //   1: dup2
/*     */     //   2: ldc2_w 71156544916611
/*     */     //   5: lxor
/*     */     //   6: lstore_3
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 76869304684310
/*     */     //   11: lxor
/*     */     //   12: lstore #5
/*     */     //   14: dup2
/*     */     //   15: ldc2_w 90666888207560
/*     */     //   18: lxor
/*     */     //   19: lstore #7
/*     */     //   21: pop2
/*     */     //   22: ldc2_w -5641030261236987393
/*     */     //   25: lload_1
/*     */     //   26: <illegal opcode> w : (JJ)I
/*     */     //   31: aload_0
/*     */     //   32: lload #7
/*     */     //   34: bipush #10
/*     */     //   36: invokevirtual a : (JB)J
/*     */     //   39: lstore #10
/*     */     //   41: istore #9
/*     */     //   43: lload #10
/*     */     //   45: ldc2_w -1
/*     */     //   48: lcmp
/*     */     //   49: iload #9
/*     */     //   51: ifeq -> 110
/*     */     //   54: ifne -> 130
/*     */     //   57: goto -> 70
/*     */     //   60: ldc2_w -5645813956293717021
/*     */     //   63: lload_1
/*     */     //   64: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   69: athrow
/*     */     //   70: aload_0
/*     */     //   71: iload #9
/*     */     //   73: ifeq -> 114
/*     */     //   76: goto -> 89
/*     */     //   79: ldc2_w -5645813956293717021
/*     */     //   82: lload_1
/*     */     //   83: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   88: athrow
/*     */     //   89: getfield c : Lme/konsolas/aac/fw;
/*     */     //   92: getfield a : J
/*     */     //   95: lconst_0
/*     */     //   96: lcmp
/*     */     //   97: goto -> 110
/*     */     //   100: ldc2_w -5645813956293717021
/*     */     //   103: lload_1
/*     */     //   104: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   109: athrow
/*     */     //   110: ifeq -> 128
/*     */     //   113: aload_0
/*     */     //   114: aload_0
/*     */     //   115: getfield c : Lme/konsolas/aac/fw;
/*     */     //   118: getfield a : J
/*     */     //   121: lload_3
/*     */     //   122: invokevirtual b : (JJ)Ljava/lang/String;
/*     */     //   125: goto -> 129
/*     */     //   128: aconst_null
/*     */     //   129: areturn
/*     */     //   130: aload_0
/*     */     //   131: getfield c : Lme/konsolas/aac/fw;
/*     */     //   134: lload #10
/*     */     //   136: lload #5
/*     */     //   138: invokevirtual c : (JJ)Ljava/lang/String;
/*     */     //   141: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #154	-> 31
/*     */     //   #70	-> 43
/*     */     //   #117	-> 70
/*     */     //   #65	-> 130
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   43	57	60	java/io/IOException
/*     */     //   54	76	79	java/io/IOException
/*     */     //   70	97	100	java/io/IOException
/*     */   }
/*     */   
/*     */   public long c(char paramChar, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: iload_1
/*     */     //   1: i2l
/*     */     //   2: bipush #48
/*     */     //   4: lshl
/*     */     //   5: lload_2
/*     */     //   6: bipush #16
/*     */     //   8: lshl
/*     */     //   9: bipush #16
/*     */     //   11: lushr
/*     */     //   12: lor
/*     */     //   13: lstore #4
/*     */     //   15: lload #4
/*     */     //   17: dup2
/*     */     //   18: ldc2_w 140425969815172
/*     */     //   21: lxor
/*     */     //   22: lstore #6
/*     */     //   24: dup2
/*     */     //   25: ldc2_w 101609856038913
/*     */     //   28: lxor
/*     */     //   29: lstore #8
/*     */     //   31: dup2
/*     */     //   32: ldc2_w 120479759502466
/*     */     //   35: lxor
/*     */     //   36: dup2
/*     */     //   37: bipush #56
/*     */     //   39: lushr
/*     */     //   40: l2i
/*     */     //   41: istore #10
/*     */     //   43: dup2
/*     */     //   44: bipush #8
/*     */     //   46: lshl
/*     */     //   47: bipush #8
/*     */     //   49: lushr
/*     */     //   50: lstore #11
/*     */     //   52: pop2
/*     */     //   53: dup2
/*     */     //   54: ldc2_w 0
/*     */     //   57: lxor
/*     */     //   58: dup2
/*     */     //   59: bipush #48
/*     */     //   61: lushr
/*     */     //   62: l2i
/*     */     //   63: istore #13
/*     */     //   65: dup2
/*     */     //   66: bipush #16
/*     */     //   68: lshl
/*     */     //   69: bipush #16
/*     */     //   71: lushr
/*     */     //   72: lstore #14
/*     */     //   74: pop2
/*     */     //   75: pop2
/*     */     //   76: ldc2_w 555022697798193547
/*     */     //   79: lload #4
/*     */     //   81: <illegal opcode> w : (JJ)I
/*     */     //   86: aload_0
/*     */     //   87: lconst_1
/*     */     //   88: lload #6
/*     */     //   90: invokevirtual b : (JJ)V
/*     */     //   93: istore #16
/*     */     //   95: iconst_0
/*     */     //   96: istore #17
/*     */     //   98: aload_0
/*     */     //   99: iload #17
/*     */     //   101: iconst_1
/*     */     //   102: iadd
/*     */     //   103: i2l
/*     */     //   104: iload #10
/*     */     //   106: i2b
/*     */     //   107: lload #11
/*     */     //   109: invokevirtual a : (JBJ)Z
/*     */     //   112: ifeq -> 383
/*     */     //   115: aload_0
/*     */     //   116: getfield c : Lme/konsolas/aac/fw;
/*     */     //   119: iload #16
/*     */     //   121: lload_2
/*     */     //   122: lconst_0
/*     */     //   123: lcmp
/*     */     //   124: iflt -> 394
/*     */     //   127: ifne -> 391
/*     */     //   130: iload #17
/*     */     //   132: i2l
/*     */     //   133: lload #8
/*     */     //   135: invokevirtual a : (JJ)B
/*     */     //   138: istore #18
/*     */     //   140: iload #18
/*     */     //   142: iload #16
/*     */     //   144: iload_1
/*     */     //   145: iflt -> 153
/*     */     //   148: ifne -> 236
/*     */     //   151: bipush #48
/*     */     //   153: if_icmplt -> 220
/*     */     //   156: goto -> 170
/*     */     //   159: ldc2_w 514358187947664742
/*     */     //   162: lload #4
/*     */     //   164: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   169: athrow
/*     */     //   170: iload #18
/*     */     //   172: iload #16
/*     */     //   174: lload_2
/*     */     //   175: lconst_0
/*     */     //   176: lcmp
/*     */     //   177: iflt -> 238
/*     */     //   180: ifne -> 236
/*     */     //   183: goto -> 197
/*     */     //   186: ldc2_w 514358187947664742
/*     */     //   189: lload #4
/*     */     //   191: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   196: athrow
/*     */     //   197: iload_1
/*     */     //   198: iflt -> 380
/*     */     //   201: bipush #57
/*     */     //   203: if_icmple -> 375
/*     */     //   206: goto -> 220
/*     */     //   209: ldc2_w 514358187947664742
/*     */     //   212: lload #4
/*     */     //   214: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   219: athrow
/*     */     //   220: iload #17
/*     */     //   222: goto -> 236
/*     */     //   225: ldc2_w 514358187947664742
/*     */     //   228: lload #4
/*     */     //   230: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   235: athrow
/*     */     //   236: iload #16
/*     */     //   238: ifne -> 324
/*     */     //   241: ifne -> 308
/*     */     //   244: goto -> 258
/*     */     //   247: ldc2_w 514358187947664742
/*     */     //   250: lload #4
/*     */     //   252: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   257: athrow
/*     */     //   258: iload #18
/*     */     //   260: lload_2
/*     */     //   261: lconst_0
/*     */     //   262: lcmp
/*     */     //   263: ifle -> 324
/*     */     //   266: iload #16
/*     */     //   268: ifne -> 324
/*     */     //   271: goto -> 285
/*     */     //   274: ldc2_w 514358187947664742
/*     */     //   277: lload #4
/*     */     //   279: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   284: athrow
/*     */     //   285: iload_1
/*     */     //   286: iflt -> 380
/*     */     //   289: bipush #45
/*     */     //   291: if_icmpeq -> 375
/*     */     //   294: goto -> 308
/*     */     //   297: ldc2_w 514358187947664742
/*     */     //   300: lload #4
/*     */     //   302: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   307: athrow
/*     */     //   308: iload #17
/*     */     //   310: goto -> 324
/*     */     //   313: ldc2_w 514358187947664742
/*     */     //   316: lload #4
/*     */     //   318: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   323: athrow
/*     */     //   324: ifne -> 383
/*     */     //   327: new java/lang/NumberFormatException
/*     */     //   330: dup
/*     */     //   331: sipush #21849
/*     */     //   334: ldc2_w 2761905390084961896
/*     */     //   337: lload #4
/*     */     //   339: lxor
/*     */     //   340: <illegal opcode> f : (IJ)Ljava/lang/String;
/*     */     //   345: iconst_1
/*     */     //   346: anewarray java/lang/Object
/*     */     //   349: dup
/*     */     //   350: iconst_0
/*     */     //   351: iload #18
/*     */     //   353: invokestatic valueOf : (B)Ljava/lang/Byte;
/*     */     //   356: aastore
/*     */     //   357: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   360: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   363: athrow
/*     */     //   364: ldc2_w 514358187947664742
/*     */     //   367: lload #4
/*     */     //   369: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   374: athrow
/*     */     //   375: iinc #17, 1
/*     */     //   378: iload #16
/*     */     //   380: ifeq -> 98
/*     */     //   383: aload_0
/*     */     //   384: iload_1
/*     */     //   385: iflt -> 116
/*     */     //   388: getfield c : Lme/konsolas/aac/fw;
/*     */     //   391: iload #13
/*     */     //   393: i2c
/*     */     //   394: lload #14
/*     */     //   396: invokevirtual c : (CJ)J
/*     */     //   399: lreturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #155	-> 86
/*     */     //   #60	-> 95
/*     */     //   #196	-> 115
/*     */     //   #49	-> 140
/*     */     //   #212	-> 308
/*     */     //   #125	-> 327
/*     */     //   #210	-> 353
/*     */     //   #162	-> 357
/*     */     //   #8	-> 375
/*     */     //   #124	-> 383
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   140	156	159	java/io/IOException
/*     */     //   151	183	186	java/io/IOException
/*     */     //   170	206	209	java/io/IOException
/*     */     //   197	222	225	java/io/IOException
/*     */     //   236	244	247	java/io/IOException
/*     */     //   241	271	274	java/io/IOException
/*     */     //   258	294	297	java/io/IOException
/*     */     //   285	310	313	java/io/IOException
/*     */     //   324	364	364	java/io/IOException
/*     */   }
/*     */   
/*     */   public String toString() {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/q.d : J
/*     */     //   3: ldc2_w 19176226809976
/*     */     //   6: lxor
/*     */     //   7: lstore_1
/*     */     //   8: new java/lang/StringBuilder
/*     */     //   11: dup
/*     */     //   12: invokespecial <init> : ()V
/*     */     //   15: sipush #13537
/*     */     //   18: ldc2_w 7545292043641355863
/*     */     //   21: lload_1
/*     */     //   22: lxor
/*     */     //   23: <illegal opcode> f : (IJ)Ljava/lang/String;
/*     */     //   28: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   31: aload_0
/*     */     //   32: getfield b : Lme/konsolas/aac/hp;
/*     */     //   35: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   38: ldc_w 'ꖕ盺'
/*     */     //   41: invokevirtual toCharArray : ()[C
/*     */     //   44: dup
/*     */     //   45: dup
/*     */     //   46: iconst_0
/*     */     //   47: dup_x1
/*     */     //   48: caload
/*     */     //   49: sipush #21174
/*     */     //   52: ixor
/*     */     //   53: i2c
/*     */     //   54: castore
/*     */     //   55: sipush #18802
/*     */     //   58: iconst_1
/*     */     //   59: iconst_0
/*     */     //   60: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*     */     //   63: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   66: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   69: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #157	-> 8
/*     */   }
/*     */   
/*     */   public long a(byte paramByte, long paramLong1, long paramLong2) {
/*     */     long l = paramLong2 ^ 0x705FAF3D478EL;
/*     */     return a(paramByte, paramLong1, Long.MAX_VALUE, l);
/*     */   }
/*     */   
/*     */   public int b(long paramLong) {
/*     */     // Byte code:
/*     */     //   0: lload_1
/*     */     //   1: dup2
/*     */     //   2: ldc2_w 0
/*     */     //   5: lxor
/*     */     //   6: lstore_3
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 5978076553664
/*     */     //   11: lxor
/*     */     //   12: lstore #5
/*     */     //   14: dup2
/*     */     //   15: ldc2_w 42543705397061
/*     */     //   18: lxor
/*     */     //   19: lstore #7
/*     */     //   21: pop2
/*     */     //   22: ldc2_w 7563704226147679951
/*     */     //   25: lload_1
/*     */     //   26: <illegal opcode> w : (JJ)I
/*     */     //   31: aload_0
/*     */     //   32: lconst_1
/*     */     //   33: lload #5
/*     */     //   35: invokevirtual b : (JJ)V
/*     */     //   38: istore #9
/*     */     //   40: aload_0
/*     */     //   41: getfield c : Lme/konsolas/aac/fw;
/*     */     //   44: lconst_0
/*     */     //   45: lload #7
/*     */     //   47: invokevirtual a : (JJ)B
/*     */     //   50: istore #10
/*     */     //   52: iload #10
/*     */     //   54: sipush #224
/*     */     //   57: iand
/*     */     //   58: sipush #192
/*     */     //   61: iload #9
/*     */     //   63: ifne -> 137
/*     */     //   66: if_icmpne -> 115
/*     */     //   69: goto -> 82
/*     */     //   72: ldc2_w 7523022193060629026
/*     */     //   75: lload_1
/*     */     //   76: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   81: athrow
/*     */     //   82: aload_0
/*     */     //   83: lload_1
/*     */     //   84: lconst_0
/*     */     //   85: lcmp
/*     */     //   86: iflt -> 263
/*     */     //   89: ldc2_w 2
/*     */     //   92: lload #5
/*     */     //   94: invokevirtual b : (JJ)V
/*     */     //   97: iload #9
/*     */     //   99: ifeq -> 262
/*     */     //   102: goto -> 115
/*     */     //   105: ldc2_w 7523022193060629026
/*     */     //   108: lload_1
/*     */     //   109: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   114: athrow
/*     */     //   115: iload #10
/*     */     //   117: sipush #240
/*     */     //   120: iand
/*     */     //   121: sipush #224
/*     */     //   124: goto -> 137
/*     */     //   127: ldc2_w 7523022193060629026
/*     */     //   130: lload_1
/*     */     //   131: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   136: athrow
/*     */     //   137: lload_1
/*     */     //   138: lconst_0
/*     */     //   139: lcmp
/*     */     //   140: ifle -> 237
/*     */     //   143: iload #9
/*     */     //   145: ifne -> 237
/*     */     //   148: if_icmpne -> 197
/*     */     //   151: goto -> 164
/*     */     //   154: ldc2_w 7523022193060629026
/*     */     //   157: lload_1
/*     */     //   158: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   163: athrow
/*     */     //   164: aload_0
/*     */     //   165: lload_1
/*     */     //   166: lconst_0
/*     */     //   167: lcmp
/*     */     //   168: ifle -> 263
/*     */     //   171: ldc2_w 3
/*     */     //   174: lload #5
/*     */     //   176: invokevirtual b : (JJ)V
/*     */     //   179: iload #9
/*     */     //   181: ifeq -> 262
/*     */     //   184: goto -> 197
/*     */     //   187: ldc2_w 7523022193060629026
/*     */     //   190: lload_1
/*     */     //   191: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   196: athrow
/*     */     //   197: iload #10
/*     */     //   199: sipush #248
/*     */     //   202: iand
/*     */     //   203: iload #9
/*     */     //   205: ifne -> 270
/*     */     //   208: goto -> 221
/*     */     //   211: ldc2_w 7523022193060629026
/*     */     //   214: lload_1
/*     */     //   215: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   220: athrow
/*     */     //   221: sipush #240
/*     */     //   224: goto -> 237
/*     */     //   227: ldc2_w 7523022193060629026
/*     */     //   230: lload_1
/*     */     //   231: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   236: athrow
/*     */     //   237: if_icmpne -> 262
/*     */     //   240: aload_0
/*     */     //   241: ldc2_w 4
/*     */     //   244: lload #5
/*     */     //   246: invokevirtual b : (JJ)V
/*     */     //   249: goto -> 262
/*     */     //   252: ldc2_w 7523022193060629026
/*     */     //   255: lload_1
/*     */     //   256: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   261: athrow
/*     */     //   262: aload_0
/*     */     //   263: getfield c : Lme/konsolas/aac/fw;
/*     */     //   266: lload_3
/*     */     //   267: invokevirtual b : (J)I
/*     */     //   270: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #166	-> 31
/*     */     //   #213	-> 40
/*     */     //   #110	-> 52
/*     */     //   #30	-> 82
/*     */     //   #90	-> 115
/*     */     //   #145	-> 164
/*     */     //   #99	-> 197
/*     */     //   #75	-> 240
/*     */     //   #111	-> 262
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   52	69	72	java/io/IOException
/*     */     //   66	102	105	java/io/IOException
/*     */     //   82	124	127	java/io/IOException
/*     */     //   137	151	154	java/io/IOException
/*     */     //   148	184	187	java/io/IOException
/*     */     //   164	208	211	java/io/IOException
/*     */     //   197	224	227	java/io/IOException
/*     */     //   237	249	252	java/io/IOException
/*     */   }
/*     */   
/*     */   public int a(ag paramag, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: lload_2
/*     */     //   1: dup2
/*     */     //   2: ldc2_w 51066954293383
/*     */     //   5: lxor
/*     */     //   6: lstore #4
/*     */     //   8: dup2
/*     */     //   9: ldc2_w 25473886478272
/*     */     //   12: lxor
/*     */     //   13: lstore #6
/*     */     //   15: dup2
/*     */     //   16: ldc2_w 62690484777480
/*     */     //   19: lxor
/*     */     //   20: lstore #8
/*     */     //   22: pop2
/*     */     //   23: ldc2_w -3023545199621444030
/*     */     //   26: lload_2
/*     */     //   27: <illegal opcode> w : (JJ)I
/*     */     //   32: istore #10
/*     */     //   34: aload_0
/*     */     //   35: getfield a : Z
/*     */     //   38: iload #10
/*     */     //   40: ifeq -> 101
/*     */     //   43: ifeq -> 90
/*     */     //   46: goto -> 59
/*     */     //   49: ldc2_w -3018758192744106914
/*     */     //   52: lload_2
/*     */     //   53: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   58: athrow
/*     */     //   59: new java/lang/IllegalStateException
/*     */     //   62: dup
/*     */     //   63: sipush #5192
/*     */     //   66: ldc2_w 611755770600859206
/*     */     //   69: lload_2
/*     */     //   70: lxor
/*     */     //   71: <illegal opcode> f : (IJ)Ljava/lang/String;
/*     */     //   76: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   79: athrow
/*     */     //   80: ldc2_w -3018758192744106914
/*     */     //   83: lload_2
/*     */     //   84: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   89: athrow
/*     */     //   90: aload_0
/*     */     //   91: getfield c : Lme/konsolas/aac/fw;
/*     */     //   94: aload_1
/*     */     //   95: lload #8
/*     */     //   97: iconst_1
/*     */     //   98: invokevirtual a : (Lme/konsolas/aac/ag;JZ)I
/*     */     //   101: istore #11
/*     */     //   103: iload #11
/*     */     //   105: iconst_m1
/*     */     //   106: lload_2
/*     */     //   107: lconst_0
/*     */     //   108: lcmp
/*     */     //   109: ifle -> 118
/*     */     //   112: if_icmpne -> 151
/*     */     //   115: iconst_m1
/*     */     //   116: iload #10
/*     */     //   118: lload_2
/*     */     //   119: lconst_0
/*     */     //   120: lcmp
/*     */     //   121: ifle -> 155
/*     */     //   124: ifeq -> 153
/*     */     //   127: goto -> 140
/*     */     //   130: ldc2_w -3018758192744106914
/*     */     //   133: lload_2
/*     */     //   134: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   139: athrow
/*     */     //   140: ireturn
/*     */     //   141: ldc2_w -3018758192744106914
/*     */     //   144: lload_2
/*     */     //   145: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   150: athrow
/*     */     //   151: iload #11
/*     */     //   153: iload #10
/*     */     //   155: lload_2
/*     */     //   156: lconst_0
/*     */     //   157: lcmp
/*     */     //   158: iflt -> 166
/*     */     //   161: ifeq -> 252
/*     */     //   164: bipush #-2
/*     */     //   166: if_icmpne -> 242
/*     */     //   169: goto -> 182
/*     */     //   172: ldc2_w -3018758192744106914
/*     */     //   175: lload_2
/*     */     //   176: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   181: athrow
/*     */     //   182: aload_0
/*     */     //   183: getfield b : Lme/konsolas/aac/hp;
/*     */     //   186: aload_0
/*     */     //   187: getfield c : Lme/konsolas/aac/fw;
/*     */     //   190: lload #6
/*     */     //   192: dup2_x1
/*     */     //   193: pop2
/*     */     //   194: ldc2_w 8192
/*     */     //   197: invokeinterface a : (JLme/konsolas/aac/fw;J)J
/*     */     //   202: ldc2_w -1
/*     */     //   205: lcmp
/*     */     //   206: iload #10
/*     */     //   208: ifeq -> 241
/*     */     //   211: goto -> 224
/*     */     //   214: ldc2_w -3018758192744106914
/*     */     //   217: lload_2
/*     */     //   218: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   223: athrow
/*     */     //   224: ifne -> 269
/*     */     //   227: goto -> 240
/*     */     //   230: ldc2_w -3018758192744106914
/*     */     //   233: lload_2
/*     */     //   234: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   239: athrow
/*     */     //   240: iconst_m1
/*     */     //   241: ireturn
/*     */     //   242: aload_1
/*     */     //   243: getfield a : [Lme/konsolas/aac/gZ;
/*     */     //   246: iload #11
/*     */     //   248: aaload
/*     */     //   249: invokevirtual a : ()I
/*     */     //   252: istore #12
/*     */     //   254: aload_0
/*     */     //   255: getfield c : Lme/konsolas/aac/fw;
/*     */     //   258: iload #12
/*     */     //   260: i2l
/*     */     //   261: lload #4
/*     */     //   263: invokevirtual a : (JJ)V
/*     */     //   266: iload #11
/*     */     //   268: ireturn
/*     */     //   269: goto -> 90
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #170	-> 34
/*     */     //   #12	-> 90
/*     */     //   #24	-> 103
/*     */     //   #197	-> 151
/*     */     //   #28	-> 182
/*     */     //   #175	-> 242
/*     */     //   #202	-> 254
/*     */     //   #16	-> 266
/*     */     //   #5	-> 269
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   34	46	49	java/io/IOException
/*     */     //   43	80	80	java/io/IOException
/*     */     //   103	127	130	java/io/IOException
/*     */     //   115	141	141	java/io/IOException
/*     */     //   153	169	172	java/io/IOException
/*     */     //   164	211	214	java/io/IOException
/*     */     //   182	227	230	java/io/IOException
/*     */   }
/*     */   
/*     */   public String a(Charset paramCharset, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: lload_2
/*     */     //   1: dup2
/*     */     //   2: ldc2_w 0
/*     */     //   5: lxor
/*     */     //   6: lstore #4
/*     */     //   8: dup2
/*     */     //   9: ldc2_w 96800971858637
/*     */     //   12: lxor
/*     */     //   13: lstore #6
/*     */     //   15: pop2
/*     */     //   16: ldc2_w -8694858869431217811
/*     */     //   19: lload_2
/*     */     //   20: <illegal opcode> w : (JJ)I
/*     */     //   25: istore #8
/*     */     //   27: iload #8
/*     */     //   29: ifne -> 96
/*     */     //   32: aload_1
/*     */     //   33: ifnonnull -> 80
/*     */     //   36: goto -> 49
/*     */     //   39: ldc2_w -8663465716369808000
/*     */     //   42: lload_2
/*     */     //   43: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   48: athrow
/*     */     //   49: new java/lang/IllegalArgumentException
/*     */     //   52: dup
/*     */     //   53: sipush #4451
/*     */     //   56: ldc2_w 5918069380448547516
/*     */     //   59: lload_2
/*     */     //   60: lxor
/*     */     //   61: <illegal opcode> f : (IJ)Ljava/lang/String;
/*     */     //   66: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   69: athrow
/*     */     //   70: ldc2_w -8663465716369808000
/*     */     //   73: lload_2
/*     */     //   74: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   79: athrow
/*     */     //   80: aload_0
/*     */     //   81: getfield c : Lme/konsolas/aac/fw;
/*     */     //   84: aload_0
/*     */     //   85: getfield b : Lme/konsolas/aac/hp;
/*     */     //   88: lload #6
/*     */     //   90: dup2_x1
/*     */     //   91: pop2
/*     */     //   92: invokevirtual a : (JLme/konsolas/aac/hp;)J
/*     */     //   95: pop2
/*     */     //   96: aload_0
/*     */     //   97: getfield c : Lme/konsolas/aac/fw;
/*     */     //   100: aload_1
/*     */     //   101: lload #4
/*     */     //   103: invokevirtual a : (Ljava/nio/charset/Charset;J)Ljava/lang/String;
/*     */     //   106: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #174	-> 27
/*     */     //   #73	-> 80
/*     */     //   #127	-> 96
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   27	36	39	java/io/IOException
/*     */     //   32	70	70	java/io/IOException
/*     */   }
/*     */   
/*     */   public String b(short paramShort1, short paramShort2, int paramInt) {
/*     */     long l1 = paramShort1 << 48L | paramShort2 << 48L >>> 16L | paramInt << 32L >>> 32L, l2 = l1 ^ 0x7F68DFF671F5L;
/*     */     return a(Long.MAX_VALUE, l2);
/*     */   }
/*     */   
/*     */   public gZ a(long paramLong1, long paramLong2) {
/*     */     long l1 = paramLong2 ^ 0x695C3535C388L, l2 = paramLong2 ^ 0x0L;
/*     */     b(paramLong1, l1);
/*     */     return this.c.a(paramLong1, l2);
/*     */   }
/*     */   
/*     */   public long a(byte paramByte, long paramLong1, long paramLong2, long paramLong3) {
/*     */     // Byte code:
/*     */     //   0: lload #6
/*     */     //   2: dup2
/*     */     //   3: ldc2_w 47412268456259
/*     */     //   6: lxor
/*     */     //   7: lstore #8
/*     */     //   9: dup2
/*     */     //   10: ldc2_w 0
/*     */     //   13: lxor
/*     */     //   14: lstore #10
/*     */     //   16: pop2
/*     */     //   17: ldc2_w -3456368236082919888
/*     */     //   20: lload #6
/*     */     //   22: <illegal opcode> w : (JJ)I
/*     */     //   27: istore #12
/*     */     //   29: aload_0
/*     */     //   30: getfield a : Z
/*     */     //   33: iload #12
/*     */     //   35: ifne -> 91
/*     */     //   38: ifeq -> 88
/*     */     //   41: goto -> 55
/*     */     //   44: ldc2_w -3415967815043058979
/*     */     //   47: lload #6
/*     */     //   49: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   54: athrow
/*     */     //   55: new java/lang/IllegalStateException
/*     */     //   58: dup
/*     */     //   59: sipush #5192
/*     */     //   62: ldc2_w 611742524811944133
/*     */     //   65: lload #6
/*     */     //   67: lxor
/*     */     //   68: <illegal opcode> f : (IJ)Ljava/lang/String;
/*     */     //   73: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   76: athrow
/*     */     //   77: ldc2_w -3415967815043058979
/*     */     //   80: lload #6
/*     */     //   82: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   87: athrow
/*     */     //   88: lload_2
/*     */     //   89: lconst_0
/*     */     //   90: lcmp
/*     */     //   91: iload #12
/*     */     //   93: lload #6
/*     */     //   95: lconst_0
/*     */     //   96: lcmp
/*     */     //   97: iflt -> 140
/*     */     //   100: ifne -> 138
/*     */     //   103: iflt -> 160
/*     */     //   106: goto -> 120
/*     */     //   109: ldc2_w -3415967815043058979
/*     */     //   112: lload #6
/*     */     //   114: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   119: athrow
/*     */     //   120: lload #4
/*     */     //   122: lload_2
/*     */     //   123: lcmp
/*     */     //   124: goto -> 138
/*     */     //   127: ldc2_w -3415967815043058979
/*     */     //   130: lload #6
/*     */     //   132: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   137: athrow
/*     */     //   138: iload #12
/*     */     //   140: ifne -> 219
/*     */     //   143: ifge -> 215
/*     */     //   146: goto -> 160
/*     */     //   149: ldc2_w -3415967815043058979
/*     */     //   152: lload #6
/*     */     //   154: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   159: athrow
/*     */     //   160: new java/lang/IllegalArgumentException
/*     */     //   163: dup
/*     */     //   164: sipush #8959
/*     */     //   167: ldc2_w 1668519128500377206
/*     */     //   170: lload #6
/*     */     //   172: lxor
/*     */     //   173: <illegal opcode> f : (IJ)Ljava/lang/String;
/*     */     //   178: iconst_2
/*     */     //   179: anewarray java/lang/Object
/*     */     //   182: dup
/*     */     //   183: iconst_0
/*     */     //   184: lload_2
/*     */     //   185: invokestatic valueOf : (J)Ljava/lang/Long;
/*     */     //   188: aastore
/*     */     //   189: dup
/*     */     //   190: iconst_1
/*     */     //   191: lload #4
/*     */     //   193: invokestatic valueOf : (J)Ljava/lang/Long;
/*     */     //   196: aastore
/*     */     //   197: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   200: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   203: athrow
/*     */     //   204: ldc2_w -3415967815043058979
/*     */     //   207: lload #6
/*     */     //   209: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   214: athrow
/*     */     //   215: lload_2
/*     */     //   216: lload #4
/*     */     //   218: lcmp
/*     */     //   219: ifge -> 438
/*     */     //   222: aload_0
/*     */     //   223: getfield c : Lme/konsolas/aac/fw;
/*     */     //   226: iload_1
/*     */     //   227: lload_2
/*     */     //   228: lload #4
/*     */     //   230: lload #10
/*     */     //   232: invokevirtual a : (BJJJ)J
/*     */     //   235: lstore #13
/*     */     //   237: lload #13
/*     */     //   239: iload #12
/*     */     //   241: lload #6
/*     */     //   243: lconst_0
/*     */     //   244: lcmp
/*     */     //   245: ifle -> 253
/*     */     //   248: ifne -> 448
/*     */     //   251: iload #12
/*     */     //   253: ifne -> 312
/*     */     //   256: goto -> 270
/*     */     //   259: ldc2_w -3415967815043058979
/*     */     //   262: lload #6
/*     */     //   264: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   269: athrow
/*     */     //   270: ldc2_w -1
/*     */     //   273: lcmp
/*     */     //   274: ifeq -> 305
/*     */     //   277: goto -> 291
/*     */     //   280: ldc2_w -3415967815043058979
/*     */     //   283: lload #6
/*     */     //   285: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   290: athrow
/*     */     //   291: lload #13
/*     */     //   293: lreturn
/*     */     //   294: ldc2_w -3415967815043058979
/*     */     //   297: lload #6
/*     */     //   299: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   304: athrow
/*     */     //   305: aload_0
/*     */     //   306: getfield c : Lme/konsolas/aac/fw;
/*     */     //   309: getfield a : J
/*     */     //   312: lstore #15
/*     */     //   314: lload #15
/*     */     //   316: iload #12
/*     */     //   318: ifne -> 425
/*     */     //   321: lload #4
/*     */     //   323: lcmp
/*     */     //   324: ifge -> 408
/*     */     //   327: goto -> 341
/*     */     //   330: ldc2_w -3415967815043058979
/*     */     //   333: lload #6
/*     */     //   335: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   340: athrow
/*     */     //   341: aload_0
/*     */     //   342: getfield b : Lme/konsolas/aac/hp;
/*     */     //   345: aload_0
/*     */     //   346: getfield c : Lme/konsolas/aac/fw;
/*     */     //   349: lload #8
/*     */     //   351: dup2_x1
/*     */     //   352: pop2
/*     */     //   353: ldc2_w 8192
/*     */     //   356: invokeinterface a : (JLme/konsolas/aac/fw;J)J
/*     */     //   361: lload #6
/*     */     //   363: lconst_0
/*     */     //   364: lcmp
/*     */     //   365: iflt -> 432
/*     */     //   368: ldc2_w -1
/*     */     //   371: iload #12
/*     */     //   373: ifne -> 429
/*     */     //   376: goto -> 390
/*     */     //   379: ldc2_w -3415967815043058979
/*     */     //   382: lload #6
/*     */     //   384: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   389: athrow
/*     */     //   390: lcmp
/*     */     //   391: ifne -> 426
/*     */     //   394: goto -> 408
/*     */     //   397: ldc2_w -3415967815043058979
/*     */     //   400: lload #6
/*     */     //   402: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   407: athrow
/*     */     //   408: ldc2_w -1
/*     */     //   411: goto -> 425
/*     */     //   414: ldc2_w -3415967815043058979
/*     */     //   417: lload #6
/*     */     //   419: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   424: athrow
/*     */     //   425: lreturn
/*     */     //   426: lload_2
/*     */     //   427: lload #15
/*     */     //   429: invokestatic max : (JJ)J
/*     */     //   432: lstore_2
/*     */     //   433: iload #12
/*     */     //   435: ifeq -> 215
/*     */     //   438: lload #6
/*     */     //   440: lconst_0
/*     */     //   441: lcmp
/*     */     //   442: iflt -> 222
/*     */     //   445: ldc2_w -1
/*     */     //   448: lreturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #188	-> 29
/*     */     //   #123	-> 88
/*     */     //   #139	-> 160
/*     */     //   #211	-> 185
/*     */     //   #19	-> 215
/*     */     //   #135	-> 222
/*     */     //   #209	-> 237
/*     */     //   #107	-> 305
/*     */     //   #138	-> 314
/*     */     //   #121	-> 426
/*     */     //   #88	-> 433
/*     */     //   #183	-> 438
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   29	41	44	java/io/IOException
/*     */     //   38	77	77	java/io/IOException
/*     */     //   91	106	109	java/io/IOException
/*     */     //   103	124	127	java/io/IOException
/*     */     //   138	146	149	java/io/IOException
/*     */     //   143	204	204	java/io/IOException
/*     */     //   237	256	259	java/io/IOException
/*     */     //   251	277	280	java/io/IOException
/*     */     //   270	294	294	java/io/IOException
/*     */     //   314	327	330	java/io/IOException
/*     */     //   321	376	379	java/io/IOException
/*     */     //   341	394	397	java/io/IOException
/*     */     //   390	411	414	java/io/IOException
/*     */   }
/*     */   
/*     */   q(long paramLong, hp paramhp) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/q.d : J
/*     */     //   3: lload_1
/*     */     //   4: lxor
/*     */     //   5: lstore_1
/*     */     //   6: ldc2_w 7641377098535287859
/*     */     //   9: lload_1
/*     */     //   10: <illegal opcode> w : (JJ)I
/*     */     //   15: aload_0
/*     */     //   16: invokespecial <init> : ()V
/*     */     //   19: istore #4
/*     */     //   21: aload_0
/*     */     //   22: new me/konsolas/aac/fw
/*     */     //   25: dup
/*     */     //   26: invokespecial <init> : ()V
/*     */     //   29: putfield c : Lme/konsolas/aac/fw;
/*     */     //   32: iload #4
/*     */     //   34: ifne -> 90
/*     */     //   37: aload_3
/*     */     //   38: ifnonnull -> 85
/*     */     //   41: goto -> 54
/*     */     //   44: ldc2_w 7681759721306802398
/*     */     //   47: lload_1
/*     */     //   48: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   53: athrow
/*     */     //   54: new java/lang/NullPointerException
/*     */     //   57: dup
/*     */     //   58: sipush #13726
/*     */     //   61: ldc2_w 1678760364563741470
/*     */     //   64: lload_1
/*     */     //   65: lxor
/*     */     //   66: <illegal opcode> f : (IJ)Ljava/lang/String;
/*     */     //   71: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   74: athrow
/*     */     //   75: ldc2_w 7681759721306802398
/*     */     //   78: lload_1
/*     */     //   79: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   84: athrow
/*     */     //   85: aload_0
/*     */     //   86: aload_3
/*     */     //   87: putfield b : Lme/konsolas/aac/hp;
/*     */     //   90: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #192	-> 15
/*     */     //   #84	-> 21
/*     */     //   #186	-> 32
/*     */     //   #131	-> 85
/*     */     //   #160	-> 90
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   21	41	44	java/lang/NullPointerException
/*     */     //   37	75	75	java/lang/NullPointerException
/*     */   }
/*     */   
/*     */   public int read(ByteBuffer paramByteBuffer) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/q.d : J
/*     */     //   3: ldc2_w 37085947946829
/*     */     //   6: lxor
/*     */     //   7: lstore_2
/*     */     //   8: lload_2
/*     */     //   9: dup2
/*     */     //   10: ldc2_w 75558503327823
/*     */     //   13: lxor
/*     */     //   14: lstore #4
/*     */     //   16: pop2
/*     */     //   17: ldc2_w -6807922861298312755
/*     */     //   20: lload_2
/*     */     //   21: <illegal opcode> w : (JJ)I
/*     */     //   26: istore #6
/*     */     //   28: aload_0
/*     */     //   29: getfield c : Lme/konsolas/aac/fw;
/*     */     //   32: getfield a : J
/*     */     //   35: lconst_0
/*     */     //   36: lcmp
/*     */     //   37: iload #6
/*     */     //   39: ifeq -> 127
/*     */     //   42: ifne -> 119
/*     */     //   45: goto -> 58
/*     */     //   48: ldc2_w -6803702113242479663
/*     */     //   51: lload_2
/*     */     //   52: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   57: athrow
/*     */     //   58: aload_0
/*     */     //   59: getfield b : Lme/konsolas/aac/hp;
/*     */     //   62: aload_0
/*     */     //   63: getfield c : Lme/konsolas/aac/fw;
/*     */     //   66: lload #4
/*     */     //   68: dup2_x1
/*     */     //   69: pop2
/*     */     //   70: ldc2_w 8192
/*     */     //   73: invokeinterface a : (JLme/konsolas/aac/fw;J)J
/*     */     //   78: lstore #7
/*     */     //   80: lload #7
/*     */     //   82: ldc2_w -1
/*     */     //   85: lcmp
/*     */     //   86: iload #6
/*     */     //   88: ifeq -> 127
/*     */     //   91: ifne -> 119
/*     */     //   94: goto -> 107
/*     */     //   97: ldc2_w -6803702113242479663
/*     */     //   100: lload_2
/*     */     //   101: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   106: athrow
/*     */     //   107: iconst_m1
/*     */     //   108: ireturn
/*     */     //   109: ldc2_w -6803702113242479663
/*     */     //   112: lload_2
/*     */     //   113: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   118: athrow
/*     */     //   119: aload_0
/*     */     //   120: getfield c : Lme/konsolas/aac/fw;
/*     */     //   123: aload_1
/*     */     //   124: invokevirtual read : (Ljava/nio/ByteBuffer;)I
/*     */     //   127: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #203	-> 28
/*     */     //   #115	-> 58
/*     */     //   #100	-> 80
/*     */     //   #168	-> 119
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   28	45	48	java/io/IOException
/*     */     //   80	94	97	java/io/IOException
/*     */     //   91	109	109	java/io/IOException
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt1, char paramChar, int paramInt2) {
/*     */     // Byte code:
/*     */     //   0: iload_1
/*     */     //   1: i2l
/*     */     //   2: bipush #32
/*     */     //   4: lshl
/*     */     //   5: iload_2
/*     */     //   6: i2l
/*     */     //   7: bipush #48
/*     */     //   9: lshl
/*     */     //   10: bipush #32
/*     */     //   12: lushr
/*     */     //   13: lor
/*     */     //   14: iload_3
/*     */     //   15: i2l
/*     */     //   16: bipush #48
/*     */     //   18: lshl
/*     */     //   19: bipush #48
/*     */     //   21: lushr
/*     */     //   22: lor
/*     */     //   23: lstore #4
/*     */     //   25: lload #4
/*     */     //   27: dup2
/*     */     //   28: ldc2_w 0
/*     */     //   31: lxor
/*     */     //   32: dup2
/*     */     //   33: bipush #32
/*     */     //   35: lushr
/*     */     //   36: l2i
/*     */     //   37: istore #6
/*     */     //   39: dup2
/*     */     //   40: bipush #32
/*     */     //   42: lshl
/*     */     //   43: bipush #48
/*     */     //   45: lushr
/*     */     //   46: l2i
/*     */     //   47: istore #7
/*     */     //   49: dup2
/*     */     //   50: bipush #48
/*     */     //   52: lshl
/*     */     //   53: bipush #48
/*     */     //   55: lushr
/*     */     //   56: l2i
/*     */     //   57: istore #8
/*     */     //   59: pop2
/*     */     //   60: dup2
/*     */     //   61: ldc2_w 133643679924634
/*     */     //   64: lxor
/*     */     //   65: lstore #9
/*     */     //   67: pop2
/*     */     //   68: ldc2_w 635519875790364393
/*     */     //   71: lload #4
/*     */     //   73: <illegal opcode> w : (JJ)I
/*     */     //   78: istore #11
/*     */     //   80: aload_0
/*     */     //   81: getfield a : Z
/*     */     //   84: iload #11
/*     */     //   86: ifne -> 153
/*     */     //   89: ifeq -> 139
/*     */     //   92: goto -> 106
/*     */     //   95: ldc2_w 594855365800765956
/*     */     //   98: lload #4
/*     */     //   100: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   105: athrow
/*     */     //   106: new java/lang/IllegalStateException
/*     */     //   109: dup
/*     */     //   110: sipush #5192
/*     */     //   113: ldc2_w 611656147728889884
/*     */     //   116: lload #4
/*     */     //   118: lxor
/*     */     //   119: <illegal opcode> f : (IJ)Ljava/lang/String;
/*     */     //   124: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   127: athrow
/*     */     //   128: ldc2_w 594855365800765956
/*     */     //   131: lload #4
/*     */     //   133: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   138: athrow
/*     */     //   139: aload_0
/*     */     //   140: getfield c : Lme/konsolas/aac/fw;
/*     */     //   143: iload #6
/*     */     //   145: iload #7
/*     */     //   147: i2c
/*     */     //   148: iload #8
/*     */     //   150: invokevirtual a : (ICI)Z
/*     */     //   153: iload #11
/*     */     //   155: iload_2
/*     */     //   156: iflt -> 219
/*     */     //   159: ifne -> 217
/*     */     //   162: ifeq -> 243
/*     */     //   165: goto -> 179
/*     */     //   168: ldc2_w 594855365800765956
/*     */     //   171: lload #4
/*     */     //   173: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   178: athrow
/*     */     //   179: aload_0
/*     */     //   180: getfield b : Lme/konsolas/aac/hp;
/*     */     //   183: aload_0
/*     */     //   184: getfield c : Lme/konsolas/aac/fw;
/*     */     //   187: lload #9
/*     */     //   189: dup2_x1
/*     */     //   190: pop2
/*     */     //   191: ldc2_w 8192
/*     */     //   194: invokeinterface a : (JLme/konsolas/aac/fw;J)J
/*     */     //   199: ldc2_w -1
/*     */     //   202: lcmp
/*     */     //   203: goto -> 217
/*     */     //   206: ldc2_w 594855365800765956
/*     */     //   209: lload #4
/*     */     //   211: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   216: athrow
/*     */     //   217: iload #11
/*     */     //   219: ifne -> 240
/*     */     //   222: ifne -> 243
/*     */     //   225: goto -> 239
/*     */     //   228: ldc2_w 594855365800765956
/*     */     //   231: lload #4
/*     */     //   233: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   238: athrow
/*     */     //   239: iconst_1
/*     */     //   240: goto -> 244
/*     */     //   243: iconst_0
/*     */     //   244: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #208	-> 80
/*     */     //   #9	-> 139
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   80	92	95	java/io/IOException
/*     */     //   89	128	128	java/io/IOException
/*     */     //   153	165	168	java/io/IOException
/*     */     //   162	203	206	java/io/IOException
/*     */     //   217	225	228	java/io/IOException
/*     */   }
/*     */   
/*     */   static {
/*     */     long l = d ^ 0x1D3AD832AAFL;
/*     */     "䮥⩗淳虷쥲ڜጉ˞믉뱲缙碌鍑舿Î뿗ꭌ奿".toCharArray()[10] = (char)("䮥⩗淳虷쥲ڜጉ˞믉뱲缙碌鍑舿Î뿗ꭌ奿".toCharArray()[10] ^ 0x2F88);
/*     */     "菏횓ϙ".toCharArray()[1] = (char)("菏횓ϙ".toCharArray()[1] ^ 0x1829);
/*     */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*     */     for (byte b1 = 1; b1 < 8; b1++)
/*     */       (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
/*     */     Cipher cipher;
/*     */     (cipher = Cipher.getInstance(hY$g6.H("䮥⩗淳虷쥲ڜጉ˞믉뱲缙碌鍑舿Î뿗ꭌ奿".toCharArray(), (short)14590, (byte)3, (byte)3))).init(2, SecretKeyFactory.getInstance(hY$g6.H("菏횓ϙ".toCharArray(), (short)3644, (byte)1, (byte)0)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*     */     String[] arrayOfString = new String[16];
/*     */     boolean bool = false;
/*     */     "됟Ớ᳡좔⎩䡋㌩౵膅?趿䌬⬉㰨ꑇﶤ圭ᦎ㠾쫰旅왞?兪?뫇폕榘ⓨ逧ۙ丩檲☒걨䭏지ぃ葒⍻鴨쉎䖤겠⿖瞭씪⫍澭企柮⪜?륍ᕄ项ꆍ⯏ఠ샺楔䎉藅뉽諂㕍鷷郾맃냬튏䳂禞ᠾ딞줓෼娽龴峏݁䨺ﹷ䯄蝹㲘⣯穠ᬐ稸魏ꠘ￬愯䐃쭀曘ﵝ疑뺍?訊㑞⴨蒊惡?཯뛾?雫来宨䮀ۘ栾炩릯獛᳋妄쫬⥶뾮犟ꄐᄊꪰ濫᎝爧㑏ቶ혍䃕蒁煮䐽骗㺋袼뭜씴뿣뵬傺䆺垝Ⓦ␰缆松闺颩錎ⴙ澈鱴跅ǽ䐶猌兊둭ﰊ琰Ɔ᚞璺똕ꗈ⫝̸셳쪽鵫稨ᓀض휥ꓺ嵟室ꛏ㭧廐꾸ᇘ褺驭ﾲ雼귉瀸鱮຃쟷ʻƧꖕ몣霛퇰М俿ꌿ휌팠⹯࣫嶹暾슖鉅엚⚌霜例엡⑬擉薆㒯點℟ⵐ쵎鈙Ꮴ밴툶瘄␑ᬤà行蟡齹匮脻ᮭ藎홺쥛꓍ꭻ狅뚎᫑詍튆⫦荴톳䧒揺벙㜾킎彇嶕㷩崸넺⟁薯ꢮ켕䎳ꓸ䳥⯬밀裝?榩﹬匽ﮱ郻䜫摄哰⧍雙⭗缋╞塦퐂᰸࠻鿰슼譻櫶̻?첳ꗱꞒ콐䃻婅둩ㄍ熉喕?拁挶᥎呢ᓓ适䀃䄞楯諨䡙픶⌡풡塢孀⬡쒣ﲳ웼꽢?徍鵃즇磛?܁⹁蜽䞆订袵仦ౚ봌씁淯?嗐㟅蕺硉┳䃖倠୵㷾釪尯ꌝꦻ纄㰄⿙᛼⹿곺缕䰾횣쁠箻汅辻൰Ⱇ稈셺଺⎪格飠ݥᤌ邖邬ｴ鄔뭊﫭鰹圅⡦깅䈽艄顨?樂辜騕幺ⶹག㍭몿﷖넙律趎K럝聟諧Გ〹殼㿽貛髏㗯絪鯚懚㾞␕낡슢⒐玳싪஘ꫮᰍ紊㕱瑭맀茢ʌ⶧㕊雫즲엯ꯏ?㷻㗯泘貫噟솓顖铴쨤᫲⃵ⰼ㙟?猘甦䝞貑뼅삞皜鴻瑮傍㎄ꦛٿ춧浒傛哈Ⓑᇌ閦⵼㕍捝㱼ﵓⲱ鹵켕푣┨＃๢ᨙ襉唻棴췏䏧".toCharArray()[166] = (char)("됟Ớ᳡좔⎩䡋㌩౵膅?趿䌬⬉㰨ꑇﶤ圭ᦎ㠾쫰旅왞?兪?뫇폕榘ⓨ逧ۙ丩檲☒걨䭏지ぃ葒⍻鴨쉎䖤겠⿖瞭씪⫍澭企柮⪜?륍ᕄ项ꆍ⯏ఠ샺楔䎉藅뉽諂㕍鷷郾맃냬튏䳂禞ᠾ딞줓෼娽龴峏݁䨺ﹷ䯄蝹㲘⣯穠ᬐ稸魏ꠘ￬愯䐃쭀曘ﵝ疑뺍?訊㑞⴨蒊惡?཯뛾?雫来宨䮀ۘ栾炩릯獛᳋妄쫬⥶뾮犟ꄐᄊꪰ濫᎝爧㑏ቶ혍䃕蒁煮䐽骗㺋袼뭜씴뿣뵬傺䆺垝Ⓦ␰缆松闺颩錎ⴙ澈鱴跅ǽ䐶猌兊둭ﰊ琰Ɔ᚞璺똕ꗈ⫝̸셳쪽鵫稨ᓀض휥ꓺ嵟室ꛏ㭧廐꾸ᇘ褺驭ﾲ雼귉瀸鱮຃쟷ʻƧꖕ몣霛퇰М俿ꌿ휌팠⹯࣫嶹暾슖鉅엚⚌霜例엡⑬擉薆㒯點℟ⵐ쵎鈙Ꮴ밴툶瘄␑ᬤà行蟡齹匮脻ᮭ藎홺쥛꓍ꭻ狅뚎᫑詍튆⫦荴톳䧒揺벙㜾킎彇嶕㷩崸넺⟁薯ꢮ켕䎳ꓸ䳥⯬밀裝?榩﹬匽ﮱ郻䜫摄哰⧍雙⭗缋╞塦퐂᰸࠻鿰슼譻櫶̻?첳ꗱꞒ콐䃻婅둩ㄍ熉喕?拁挶᥎呢ᓓ适䀃䄞楯諨䡙픶⌡풡塢孀⬡쒣ﲳ웼꽢?徍鵃즇磛?܁⹁蜽䞆订袵仦ౚ봌씁淯?嗐㟅蕺硉┳䃖倠୵㷾釪尯ꌝꦻ纄㰄⿙᛼⹿곺缕䰾횣쁠箻汅辻൰Ⱇ稈셺଺⎪格飠ݥᤌ邖邬ｴ鄔뭊﫭鰹圅⡦깅䈽艄顨?樂辜騕幺ⶹག㍭몿﷖넙律趎K럝聟諧Გ〹殼㿽貛髏㗯絪鯚懚㾞␕낡슢⒐玳싪஘ꫮᰍ紊㕱瑭맀茢ʌ⶧㕊雫즲엯ꯏ?㷻㗯泘貫噟솓顖铴쨤᫲⃵ⰼ㙟?猘甦䝞貑뼅삞皜鴻瑮傍㎄ꦛٿ춧浒傛哈Ⓑᇌ閦⵼㕍捝㱼ﵓⲱ鹵켕푣┨＃๢ᨙ襉唻棴췏䏧".toCharArray()[166] ^ 0x10D6);
/*     */     String str;
/*     */     int i = (str = hY$g6.H("됟Ớ᳡좔⎩䡋㌩౵膅?趿䌬⬉㰨ꑇﶤ圭ᦎ㠾쫰旅왞?兪?뫇폕榘ⓨ逧ۙ丩檲☒걨䭏지ぃ葒⍻鴨쉎䖤겠⿖瞭씪⫍澭企柮⪜?륍ᕄ项ꆍ⯏ఠ샺楔䎉藅뉽諂㕍鷷郾맃냬튏䳂禞ᠾ딞줓෼娽龴峏݁䨺ﹷ䯄蝹㲘⣯穠ᬐ稸魏ꠘ￬愯䐃쭀曘ﵝ疑뺍?訊㑞⴨蒊惡?཯뛾?雫来宨䮀ۘ栾炩릯獛᳋妄쫬⥶뾮犟ꄐᄊꪰ濫᎝爧㑏ቶ혍䃕蒁煮䐽骗㺋袼뭜씴뿣뵬傺䆺垝Ⓦ␰缆松闺颩錎ⴙ澈鱴跅ǽ䐶猌兊둭ﰊ琰Ɔ᚞璺똕ꗈ⫝̸셳쪽鵫稨ᓀض휥ꓺ嵟室ꛏ㭧廐꾸ᇘ褺驭ﾲ雼귉瀸鱮຃쟷ʻƧꖕ몣霛퇰М俿ꌿ휌팠⹯࣫嶹暾슖鉅엚⚌霜例엡⑬擉薆㒯點℟ⵐ쵎鈙Ꮴ밴툶瘄␑ᬤà行蟡齹匮脻ᮭ藎홺쥛꓍ꭻ狅뚎᫑詍튆⫦荴톳䧒揺벙㜾킎彇嶕㷩崸넺⟁薯ꢮ켕䎳ꓸ䳥⯬밀裝?榩﹬匽ﮱ郻䜫摄哰⧍雙⭗缋╞塦퐂᰸࠻鿰슼譻櫶̻?첳ꗱꞒ콐䃻婅둩ㄍ熉喕?拁挶᥎呢ᓓ适䀃䄞楯諨䡙픶⌡풡塢孀⬡쒣ﲳ웼꽢?徍鵃즇磛?܁⹁蜽䞆订袵仦ౚ봌씁淯?嗐㟅蕺硉┳䃖倠୵㷾釪尯ꌝꦻ纄㰄⿙᛼⹿곺缕䰾횣쁠箻汅辻൰Ⱇ稈셺଺⎪格飠ݥᤌ邖邬ｴ鄔뭊﫭鰹圅⡦깅䈽艄顨?樂辜騕幺ⶹག㍭몿﷖넙律趎K럝聟諧Გ〹殼㿽貛髏㗯絪鯚懚㾞␕낡슢⒐玳싪஘ꫮᰍ紊㕱瑭맀茢ʌ⶧㕊雫즲엯ꯏ?㷻㗯泘貫噟솓顖铴쨤᫲⃵ⰼ㙟?猘甦䝞貑뼅삞皜鴻瑮傍㎄ꦛٿ춧浒傛哈Ⓑᇌ閦⵼㕍捝㱼ﵓⲱ鹵켕푣┨＃๢ᨙ襉唻棴췏䏧".toCharArray(), (short)6660, (byte)0, (byte)4)).length();
/*     */     byte b2 = 32;
/*     */     byte b = -1;
/*     */     while (true);
/*     */   }
/*     */   
/*     */   private static Exception a(Exception paramException) {
/*     */     return paramException;
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
/*     */     int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x6508;
/*     */     if (f[i] == null) {
/*     */       Object[] arrayOfObject;
/*     */       try {
/*     */         Long long_ = Long.valueOf(Thread.currentThread().getId());
/*     */         arrayOfObject = (Object[])g.get(long_);
/*     */         if (arrayOfObject == null) {
/*     */           arrayOfObject = new Object[3];
/*     */           "䛃ᦟ￲읂塞؛둞Ẹⷧ醅淐鴿茹㬞垳㲥ꃿ윶䩘".toCharArray()[0] = (char)("䛃ᦟ￲읂塞؛둞Ẹⷧ醅淐鴿茹㬞垳㲥ꃿ윶䩘".toCharArray()[0] ^ 0x1B98);
/*     */           arrayOfObject[0] = Cipher.getInstance(hY$g6.H("䛃ᦟ￲읂塞؛둞Ẹⷧ醅淐鴿茹㬞垳㲥ꃿ윶䩘".toCharArray(), (short)29027, (byte)0, (byte)1));
/*     */           "衁솎陋֙".toCharArray()[1] = (char)("衁솎陋֙".toCharArray()[1] ^ 0x25AC);
/*     */           arrayOfObject[1] = SecretKeyFactory.getInstance(hY$g6.H("衁솎陋֙".toCharArray(), (short)29734, (byte)4, (byte)5));
/*     */           arrayOfObject[2] = new IvParameterSpec(new byte[8]);
/*     */           g.put(long_, arrayOfObject);
/*     */         } 
/*     */       } catch (Exception exception) {
/*     */         "ㆄ㎠迭긇΅贻𖺫뛑῟羵齊蟄ꩡ챇噣怕".toCharArray()[1] = (char)("ㆄ㎠迭긇΅贻𖺫뛑῟羵齊蟄ꩡ챇噣怕".toCharArray()[1] ^ 0x1278);
/*     */         throw new RuntimeException(hY$g6.H("ㆄ㎠迭긇΅贻𖺫뛑῟羵齊蟄ꩡ챇噣怕".toCharArray(), (short)24628, (byte)5, (byte)4), exception);
/*     */       } 
/*     */       byte[] arrayOfByte1 = new byte[8];
/*     */       arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
/*     */       for (byte b = 1; b < 8; b++)
/*     */         arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
/*     */       DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
/*     */       SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
/*     */       ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
/*     */       "뗈礵퇯쬛뗈㴻띇㽱Ꮦ".toCharArray()[7] = (char)("뗈礵퇯쬛뗈㴻띇㽱Ꮦ".toCharArray()[7] ^ 0x473F);
/*     */       byte[] arrayOfByte2 = e[i].getBytes(hY$g6.H("뗈礵퇯쬛뗈㴻띇㽱Ꮦ".toCharArray(), (short)15507, (byte)1, (byte)2));
/*     */       f[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
/*     */     } 
/*     */     return f[i];
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
/*     */     //   50: goto -> 170
/*     */     //   53: astore #4
/*     */     //   55: new java/lang/RuntimeException
/*     */     //   58: dup
/*     */     //   59: new java/lang/StringBuilder
/*     */     //   62: dup
/*     */     //   63: invokespecial <init> : ()V
/*     */     //   66: ldc_w '銄犣ᣒ㶑ꃮ欙칫끙諉뗑藪罥灱ર'
/*     */     //   69: invokevirtual toCharArray : ()[C
/*     */     //   72: dup
/*     */     //   73: dup
/*     */     //   74: iconst_4
/*     */     //   75: dup_x1
/*     */     //   76: caload
/*     */     //   77: sipush #3367
/*     */     //   80: ixor
/*     */     //   81: i2c
/*     */     //   82: castore
/*     */     //   83: sipush #20890
/*     */     //   86: iconst_2
/*     */     //   87: iconst_1
/*     */     //   88: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*     */     //   91: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   94: ldc_w '︦ᖛᨺ㻻'
/*     */     //   97: invokevirtual toCharArray : ()[C
/*     */     //   100: dup
/*     */     //   101: dup
/*     */     //   102: iconst_0
/*     */     //   103: dup_x1
/*     */     //   104: caload
/*     */     //   105: sipush #29032
/*     */     //   108: ixor
/*     */     //   109: i2c
/*     */     //   110: castore
/*     */     //   111: sipush #21019
/*     */     //   114: iconst_3
/*     */     //   115: iconst_2
/*     */     //   116: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*     */     //   119: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   122: aload_1
/*     */     //   123: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   126: ldc_w 'Ỽ嵶憎癀'
/*     */     //   129: invokevirtual toCharArray : ()[C
/*     */     //   132: dup
/*     */     //   133: dup
/*     */     //   134: iconst_0
/*     */     //   135: dup_x1
/*     */     //   136: caload
/*     */     //   137: sipush #13653
/*     */     //   140: ixor
/*     */     //   141: i2c
/*     */     //   142: castore
/*     */     //   143: sipush #16734
/*     */     //   146: iconst_5
/*     */     //   147: iconst_2
/*     */     //   148: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*     */     //   151: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   154: aload_2
/*     */     //   155: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   158: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   161: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   164: aload #4
/*     */     //   166: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   169: athrow
/*     */     //   170: aload_3
/*     */     //   171: areturn
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   9	50	53	java/lang/Exception
/*     */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\q.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */