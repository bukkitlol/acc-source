/*    */ package aacinternal;public class a8 extends aw implements s, ad, Serializable { private static final long serialVersionUID = 20150412L;
/*    */   public long a() {
/*  3 */     return this.a.a();
/*    */   }
/*    */   protected final a9 a; protected final boolean c; private final boolean d; private static final long f = nc.a(5657143861581349042L, -1490217935213742998L, MethodHandles.lookup().lookupClass()).a(188146229388625L);
/*    */   public void a(long paramLong) {
/*    */     // Byte code:
/*    */     //   0: lload_1
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 0
/*    */     //   5: lxor
/*    */     //   6: lstore_3
/*    */     //   7: pop2
/*    */     //   8: ldc2_w -556918723324153403
/*    */     //   11: lload_1
/*    */     //   12: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   17: astore #5
/*    */     //   19: aload_0
/*    */     //   20: aload #5
/*    */     //   22: ifnull -> 58
/*    */     //   25: getfield c : Z
/*    */     //   28: ifeq -> 65
/*    */     //   31: goto -> 44
/*    */     //   34: ldc2_w -574768601201907041
/*    */     //   37: lload_1
/*    */     //   38: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   43: athrow
/*    */     //   44: aload_0
/*    */     //   45: goto -> 58
/*    */     //   48: ldc2_w -574768601201907041
/*    */     //   51: lload_1
/*    */     //   52: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   57: athrow
/*    */     //   58: getfield a : Laacinternal/a9;
/*    */     //   61: lload_3
/*    */     //   62: invokevirtual a : (J)V
/*    */     //   65: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 19
/*    */     //   #95	-> 44
/*    */     //   #4	-> 65
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   19	31	34	aacinternal/g
/*    */     //   25	45	48	aacinternal/g
/*    */   }
/*    */   public double a(double[] paramArrayOfdouble1, double[] paramArrayOfdouble2, int paramInt1, int paramInt2, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: lload #5
/*    */     //   2: dup2
/*    */     //   3: ldc2_w 79015001850151
/*    */     //   6: lxor
/*    */     //   7: lstore #7
/*    */     //   9: dup2
/*    */     //   10: ldc2_w 33424241364303
/*    */     //   13: lxor
/*    */     //   14: lstore #9
/*    */     //   16: dup2
/*    */     //   17: ldc2_w 0
/*    */     //   20: lxor
/*    */     //   21: lstore #11
/*    */     //   23: pop2
/*    */     //   24: ldc2_w -7924524573728072826
/*    */     //   27: lload #5
/*    */     //   29: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   34: ldc2_w NaN
/*    */     //   37: dstore #14
/*    */     //   39: astore #13
/*    */     //   41: aload_1
/*    */     //   42: aload_2
/*    */     //   43: lload #9
/*    */     //   45: iload_3
/*    */     //   46: iload #4
/*    */     //   48: invokestatic a : ([D[DJII)Z
/*    */     //   51: aload #13
/*    */     //   53: ifnull -> 75
/*    */     //   56: ifeq -> 171
/*    */     //   59: goto -> 73
/*    */     //   62: ldc2_w -7906912757568143140
/*    */     //   65: lload #5
/*    */     //   67: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   72: athrow
/*    */     //   73: iload #4
/*    */     //   75: iconst_1
/*    */     //   76: aload #13
/*    */     //   78: ifnull -> 130
/*    */     //   81: if_icmpne -> 113
/*    */     //   84: goto -> 98
/*    */     //   87: ldc2_w -7906912757568143140
/*    */     //   90: lload #5
/*    */     //   92: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   97: athrow
/*    */     //   98: dconst_0
/*    */     //   99: lload #5
/*    */     //   101: lconst_0
/*    */     //   102: lcmp
/*    */     //   103: ifle -> 173
/*    */     //   106: dstore #14
/*    */     //   108: aload #13
/*    */     //   110: ifnonnull -> 171
/*    */     //   113: iload #4
/*    */     //   115: iconst_1
/*    */     //   116: goto -> 130
/*    */     //   119: ldc2_w -7906912757568143140
/*    */     //   122: lload #5
/*    */     //   124: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   129: athrow
/*    */     //   130: if_icmple -> 171
/*    */     //   133: new aacinternal/aJ
/*    */     //   136: dup
/*    */     //   137: invokespecial <init> : ()V
/*    */     //   140: astore #16
/*    */     //   142: aload #16
/*    */     //   144: aload_1
/*    */     //   145: aload_2
/*    */     //   146: iload_3
/*    */     //   147: iload #4
/*    */     //   149: lload #11
/*    */     //   151: invokevirtual a : ([D[DIIJ)D
/*    */     //   154: dstore #17
/*    */     //   156: aload_0
/*    */     //   157: lload #7
/*    */     //   159: aload_1
/*    */     //   160: aload_2
/*    */     //   161: dload #17
/*    */     //   163: iload_3
/*    */     //   164: iload #4
/*    */     //   166: invokevirtual a : (J[D[DDII)D
/*    */     //   169: dstore #14
/*    */     //   171: dload #14
/*    */     //   173: dreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #6	-> 34
/*    */     //   #45	-> 41
/*    */     //   #16	-> 73
/*    */     //   #100	-> 98
/*    */     //   #49	-> 113
/*    */     //   #12	-> 133
/*    */     //   #94	-> 142
/*    */     //   #44	-> 156
/*    */     //   #43	-> 171
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   41	59	62	aacinternal/v
/*    */     //   75	84	87	aacinternal/v
/*    */     //   108	116	119	aacinternal/v
/*    */   }
/*    */   public double a(long paramLong) {
/*    */     // Byte code:
/*    */     //   0: ldc2_w -8115920260428364066
/*    */     //   3: lload_1
/*    */     //   4: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   9: astore_3
/*    */     //   10: aload_0
/*    */     //   11: getfield a : Laacinternal/a9;
/*    */     //   14: getfield e : J
/*    */     //   17: lconst_0
/*    */     //   18: lcmp
/*    */     //   19: aload_3
/*    */     //   20: lload_1
/*    */     //   21: lconst_0
/*    */     //   22: lcmp
/*    */     //   23: iflt -> 75
/*    */     //   26: ifnull -> 68
/*    */     //   29: ifne -> 59
/*    */     //   32: goto -> 45
/*    */     //   35: ldc2_w -8134314727133831804
/*    */     //   38: lload_1
/*    */     //   39: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   44: athrow
/*    */     //   45: ldc2_w NaN
/*    */     //   48: dreturn
/*    */     //   49: ldc2_w -8134314727133831804
/*    */     //   52: lload_1
/*    */     //   53: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   58: athrow
/*    */     //   59: aload_0
/*    */     //   60: getfield a : Laacinternal/a9;
/*    */     //   63: getfield e : J
/*    */     //   66: lconst_1
/*    */     //   67: lcmp
/*    */     //   68: lload_1
/*    */     //   69: lconst_0
/*    */     //   70: lcmp
/*    */     //   71: ifle -> 127
/*    */     //   74: aload_3
/*    */     //   75: ifnull -> 127
/*    */     //   78: ifne -> 106
/*    */     //   81: goto -> 94
/*    */     //   84: ldc2_w -8134314727133831804
/*    */     //   87: lload_1
/*    */     //   88: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   93: athrow
/*    */     //   94: dconst_0
/*    */     //   95: dreturn
/*    */     //   96: ldc2_w -8134314727133831804
/*    */     //   99: lload_1
/*    */     //   100: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   105: athrow
/*    */     //   106: aload_0
/*    */     //   107: aload_3
/*    */     //   108: ifnull -> 160
/*    */     //   111: getfield d : Z
/*    */     //   114: goto -> 127
/*    */     //   117: ldc2_w -8134314727133831804
/*    */     //   120: lload_1
/*    */     //   121: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   126: athrow
/*    */     //   127: ifeq -> 159
/*    */     //   130: aload_0
/*    */     //   131: getfield a : Laacinternal/a9;
/*    */     //   134: getfield f : D
/*    */     //   137: aload_0
/*    */     //   138: getfield a : Laacinternal/a9;
/*    */     //   141: getfield e : J
/*    */     //   144: l2d
/*    */     //   145: dconst_1
/*    */     //   146: dsub
/*    */     //   147: ddiv
/*    */     //   148: dreturn
/*    */     //   149: ldc2_w -8134314727133831804
/*    */     //   152: lload_1
/*    */     //   153: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   158: athrow
/*    */     //   159: aload_0
/*    */     //   160: getfield a : Laacinternal/a9;
/*    */     //   163: getfield f : D
/*    */     //   166: aload_0
/*    */     //   167: getfield a : Laacinternal/a9;
/*    */     //   170: getfield e : J
/*    */     //   173: l2d
/*    */     //   174: ddiv
/*    */     //   175: dreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #15	-> 10
/*    */     //   #91	-> 45
/*    */     //   #101	-> 59
/*    */     //   #10	-> 94
/*    */     //   #60	-> 106
/*    */     //   #69	-> 130
/*    */     //   #65	-> 159
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   10	32	35	aacinternal/g
/*    */     //   29	49	49	aacinternal/g
/*    */     //   68	81	84	aacinternal/g
/*    */     //   78	96	96	aacinternal/g
/*    */     //   106	114	117	aacinternal/g
/*    */     //   127	149	149	aacinternal/g
/*    */   }
/*    */   
/*    */   public a8(boolean paramBoolean, a9 parama9) {
/* 17 */     this(parama9, false, paramBoolean);
/*    */   }
/*    */ 
/*    */   
/*    */   public double a(double[] paramArrayOfdouble, double paramDouble, long paramLong) {
/*    */     paramLong = f ^ paramLong;
/*    */     long l = paramLong ^ 0x4F085ED2E1F4L;
/*    */     return a(l, paramArrayOfdouble, paramDouble, 0, paramArrayOfdouble.length);
/*    */   }
/*    */ 
/*    */   
/*    */   public aa a(long paramLong) {
/*    */     long l = paramLong ^ 0x613E7D381249L;
/*    */     return a(l);
/*    */   }
/*    */ 
/*    */   
/*    */   public a8 a(boolean paramBoolean) {
/*    */     return new a8(this.a, this.c, paramBoolean);
/*    */   }
/*    */ 
/*    */   
/*    */   public double a(long paramLong, double[] paramArrayOfdouble, double paramDouble, int paramInt1, int paramInt2) {
/*    */     // Byte code:
/*    */     //   0: getstatic aacinternal/a8.f : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: lload_1
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 68171036259509
/*    */     //   11: lxor
/*    */     //   12: lstore #8
/*    */     //   14: pop2
/*    */     //   15: ldc2_w 2068305433297294644
/*    */     //   18: lload_1
/*    */     //   19: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   24: ldc2_w NaN
/*    */     //   27: dstore #11
/*    */     //   29: astore #10
/*    */     //   31: aload_3
/*    */     //   32: iload #6
/*    */     //   34: lload #8
/*    */     //   36: iload #7
/*    */     //   38: invokestatic a : ([DIJI)Z
/*    */     //   41: aload #10
/*    */     //   43: ifnull -> 64
/*    */     //   46: ifeq -> 275
/*    */     //   49: goto -> 62
/*    */     //   52: ldc2_w 2087267290616827502
/*    */     //   55: lload_1
/*    */     //   56: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   61: athrow
/*    */     //   62: iload #7
/*    */     //   64: iconst_1
/*    */     //   65: aload #10
/*    */     //   67: ifnull -> 110
/*    */     //   70: if_icmpne -> 94
/*    */     //   73: goto -> 86
/*    */     //   76: ldc2_w 2087267290616827502
/*    */     //   79: lload_1
/*    */     //   80: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   85: athrow
/*    */     //   86: dconst_0
/*    */     //   87: dstore #11
/*    */     //   89: aload #10
/*    */     //   91: ifnonnull -> 275
/*    */     //   94: iload #7
/*    */     //   96: iconst_1
/*    */     //   97: goto -> 110
/*    */     //   100: ldc2_w 2087267290616827502
/*    */     //   103: lload_1
/*    */     //   104: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   109: athrow
/*    */     //   110: if_icmple -> 275
/*    */     //   113: dconst_0
/*    */     //   114: dstore #13
/*    */     //   116: dconst_0
/*    */     //   117: dstore #15
/*    */     //   119: dconst_0
/*    */     //   120: dstore #17
/*    */     //   122: iload #6
/*    */     //   124: istore #19
/*    */     //   126: iload #19
/*    */     //   128: iload #6
/*    */     //   130: iload #7
/*    */     //   132: iadd
/*    */     //   133: if_icmpge -> 200
/*    */     //   136: aload_3
/*    */     //   137: iload #19
/*    */     //   139: daload
/*    */     //   140: dload #4
/*    */     //   142: dsub
/*    */     //   143: dstore #15
/*    */     //   145: dload #13
/*    */     //   147: dload #15
/*    */     //   149: dload #15
/*    */     //   151: dmul
/*    */     //   152: dadd
/*    */     //   153: dstore #13
/*    */     //   155: dload #17
/*    */     //   157: dload #15
/*    */     //   159: dadd
/*    */     //   160: lload_1
/*    */     //   161: lconst_0
/*    */     //   162: lcmp
/*    */     //   163: ifle -> 277
/*    */     //   166: dstore #17
/*    */     //   168: iinc #19, 1
/*    */     //   171: aload #10
/*    */     //   173: ifnull -> 275
/*    */     //   176: aload #10
/*    */     //   178: ifnonnull -> 126
/*    */     //   181: lload_1
/*    */     //   182: lconst_0
/*    */     //   183: lcmp
/*    */     //   184: iflt -> 171
/*    */     //   187: goto -> 200
/*    */     //   190: ldc2_w 2087267290616827502
/*    */     //   193: lload_1
/*    */     //   194: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   199: athrow
/*    */     //   200: iload #7
/*    */     //   202: i2d
/*    */     //   203: dstore #19
/*    */     //   205: aload #10
/*    */     //   207: lload_1
/*    */     //   208: lconst_0
/*    */     //   209: lcmp
/*    */     //   210: iflt -> 256
/*    */     //   213: ifnull -> 254
/*    */     //   216: aload_0
/*    */     //   217: getfield d : Z
/*    */     //   220: ifeq -> 259
/*    */     //   223: goto -> 236
/*    */     //   226: ldc2_w 2087267290616827502
/*    */     //   229: lload_1
/*    */     //   230: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   235: athrow
/*    */     //   236: dload #13
/*    */     //   238: dload #17
/*    */     //   240: dload #17
/*    */     //   242: dmul
/*    */     //   243: dload #19
/*    */     //   245: ddiv
/*    */     //   246: dsub
/*    */     //   247: dload #19
/*    */     //   249: dconst_1
/*    */     //   250: dsub
/*    */     //   251: ddiv
/*    */     //   252: dstore #11
/*    */     //   254: aload #10
/*    */     //   256: ifnonnull -> 275
/*    */     //   259: dload #13
/*    */     //   261: dload #17
/*    */     //   263: dload #17
/*    */     //   265: dmul
/*    */     //   266: dload #19
/*    */     //   268: ddiv
/*    */     //   269: dsub
/*    */     //   270: dload #19
/*    */     //   272: ddiv
/*    */     //   273: dstore #11
/*    */     //   275: dload #11
/*    */     //   277: dreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #38	-> 24
/*    */     //   #22	-> 31
/*    */     //   #87	-> 62
/*    */     //   #13	-> 86
/*    */     //   #40	-> 94
/*    */     //   #62	-> 113
/*    */     //   #79	-> 116
/*    */     //   #66	-> 119
/*    */     //   #59	-> 122
/*    */     //   #77	-> 136
/*    */     //   #8	-> 145
/*    */     //   #48	-> 155
/*    */     //   #71	-> 168
/*    */     //   #2	-> 200
/*    */     //   #11	-> 205
/*    */     //   #19	-> 236
/*    */     //   #30	-> 259
/*    */     //   #34	-> 275
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   31	49	52	aacinternal/v
/*    */     //   64	73	76	aacinternal/v
/*    */     //   89	97	100	aacinternal/v
/*    */     //   168	181	190	aacinternal/v
/*    */     //   205	223	226	aacinternal/v
/*    */   }
/*    */ 
/*    */   
/*    */   public a8 a(long paramLong) {
/*    */     paramLong = f ^ paramLong;
/*    */     long l = paramLong ^ 0x1FD3AF46BB5EL;
/*    */     return new a8(l, this);
/*    */   }
/*    */ 
/*    */   
/*    */   public double a(double[] paramArrayOfdouble1, double[] paramArrayOfdouble2, long paramLong, double paramDouble) {
/*    */     paramLong = f ^ paramLong;
/*    */     long l = paramLong ^ 0x5AA2CC51F51EL;
/*    */     return a(l, paramArrayOfdouble1, paramArrayOfdouble2, paramDouble, 0, paramArrayOfdouble1.length);
/*    */   }
/*    */ 
/*    */   
/*    */   public a8(a9 parama9) {
/*    */     this(true, parama9);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/*    */     return this.d;
/*    */   }
/*    */   
/*    */   public a8(boolean paramBoolean) {
/*    */     this(new a9(), true, paramBoolean);
/*    */   }
/*    */   
/*    */   private a8(a9 parama9, boolean paramBoolean1, boolean paramBoolean2) {
/* 72 */     this.a = parama9;
/*    */     
/*    */     this.c = paramBoolean1;
/*    */     
/* 76 */     this.d = paramBoolean2;
/*    */   }
/*    */   public double a(long paramLong, double[] paramArrayOfdouble1, double[] paramArrayOfdouble2, double paramDouble, int paramInt1, int paramInt2) {
/*    */     // Byte code:
/*    */     //   0: getstatic aacinternal/a8.f : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: lload_1
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 5223770993383
/*    */     //   11: lxor
/*    */     //   12: lstore #9
/*    */     //   14: pop2
/*    */     //   15: ldc2_w -5931675820973186002
/*    */     //   18: lload_1
/*    */     //   19: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   24: ldc2_w NaN
/*    */     //   27: dstore #12
/*    */     //   29: astore #11
/*    */     //   31: aload_3
/*    */     //   32: aload #4
/*    */     //   34: lload #9
/*    */     //   36: iload #7
/*    */     //   38: iload #8
/*    */     //   40: invokestatic a : ([D[DJII)Z
/*    */     //   43: aload #11
/*    */     //   45: ifnull -> 66
/*    */     //   48: ifeq -> 325
/*    */     //   51: goto -> 64
/*    */     //   54: ldc2_w -5914042031760556172
/*    */     //   57: lload_1
/*    */     //   58: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   63: athrow
/*    */     //   64: iload #8
/*    */     //   66: iconst_1
/*    */     //   67: aload #11
/*    */     //   69: ifnull -> 112
/*    */     //   72: if_icmpne -> 96
/*    */     //   75: goto -> 88
/*    */     //   78: ldc2_w -5914042031760556172
/*    */     //   81: lload_1
/*    */     //   82: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   87: athrow
/*    */     //   88: dconst_0
/*    */     //   89: dstore #12
/*    */     //   91: aload #11
/*    */     //   93: ifnonnull -> 325
/*    */     //   96: iload #8
/*    */     //   98: iconst_1
/*    */     //   99: goto -> 112
/*    */     //   102: ldc2_w -5914042031760556172
/*    */     //   105: lload_1
/*    */     //   106: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   111: athrow
/*    */     //   112: if_icmple -> 325
/*    */     //   115: dconst_0
/*    */     //   116: dstore #14
/*    */     //   118: dconst_0
/*    */     //   119: dstore #16
/*    */     //   121: dconst_0
/*    */     //   122: dstore #18
/*    */     //   124: iload #7
/*    */     //   126: istore #20
/*    */     //   128: iload #20
/*    */     //   130: iload #7
/*    */     //   132: iload #8
/*    */     //   134: iadd
/*    */     //   135: if_icmpge -> 214
/*    */     //   138: aload_3
/*    */     //   139: iload #20
/*    */     //   141: daload
/*    */     //   142: dload #5
/*    */     //   144: dsub
/*    */     //   145: dstore #16
/*    */     //   147: dload #14
/*    */     //   149: aload #4
/*    */     //   151: iload #20
/*    */     //   153: daload
/*    */     //   154: dload #16
/*    */     //   156: dload #16
/*    */     //   158: dmul
/*    */     //   159: dmul
/*    */     //   160: dadd
/*    */     //   161: dstore #14
/*    */     //   163: dload #18
/*    */     //   165: aload #4
/*    */     //   167: iload #20
/*    */     //   169: daload
/*    */     //   170: dload #16
/*    */     //   172: dmul
/*    */     //   173: dadd
/*    */     //   174: lload_1
/*    */     //   175: lconst_0
/*    */     //   176: lcmp
/*    */     //   177: iflt -> 327
/*    */     //   180: dstore #18
/*    */     //   182: iinc #20, 1
/*    */     //   185: aload #11
/*    */     //   187: ifnull -> 325
/*    */     //   190: aload #11
/*    */     //   192: ifnonnull -> 128
/*    */     //   195: lload_1
/*    */     //   196: lconst_0
/*    */     //   197: lcmp
/*    */     //   198: iflt -> 185
/*    */     //   201: goto -> 214
/*    */     //   204: ldc2_w -5914042031760556172
/*    */     //   207: lload_1
/*    */     //   208: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   213: athrow
/*    */     //   214: dconst_0
/*    */     //   215: dstore #20
/*    */     //   217: iload #7
/*    */     //   219: istore #22
/*    */     //   221: iload #22
/*    */     //   223: iload #7
/*    */     //   225: iload #8
/*    */     //   227: iadd
/*    */     //   228: if_icmpge -> 279
/*    */     //   231: dload #20
/*    */     //   233: aload #4
/*    */     //   235: iload #22
/*    */     //   237: daload
/*    */     //   238: dadd
/*    */     //   239: lload_1
/*    */     //   240: lconst_0
/*    */     //   241: lcmp
/*    */     //   242: iflt -> 323
/*    */     //   245: dstore #20
/*    */     //   247: iinc #22, 1
/*    */     //   250: aload #11
/*    */     //   252: ifnull -> 309
/*    */     //   255: aload #11
/*    */     //   257: ifnonnull -> 221
/*    */     //   260: lload_1
/*    */     //   261: lconst_0
/*    */     //   262: lcmp
/*    */     //   263: ifle -> 250
/*    */     //   266: goto -> 279
/*    */     //   269: ldc2_w -5914042031760556172
/*    */     //   272: lload_1
/*    */     //   273: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   278: athrow
/*    */     //   279: aload_0
/*    */     //   280: getfield d : Z
/*    */     //   283: ifeq -> 309
/*    */     //   286: dload #14
/*    */     //   288: dload #18
/*    */     //   290: dload #18
/*    */     //   292: dmul
/*    */     //   293: dload #20
/*    */     //   295: ddiv
/*    */     //   296: dsub
/*    */     //   297: dload #20
/*    */     //   299: dconst_1
/*    */     //   300: dsub
/*    */     //   301: ddiv
/*    */     //   302: dstore #12
/*    */     //   304: aload #11
/*    */     //   306: ifnonnull -> 325
/*    */     //   309: dload #14
/*    */     //   311: dload #18
/*    */     //   313: dload #18
/*    */     //   315: dmul
/*    */     //   316: dload #20
/*    */     //   318: ddiv
/*    */     //   319: dsub
/*    */     //   320: dload #20
/*    */     //   322: ddiv
/*    */     //   323: dstore #12
/*    */     //   325: dload #12
/*    */     //   327: dreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #74	-> 24
/*    */     //   #57	-> 31
/*    */     //   #25	-> 64
/*    */     //   #55	-> 88
/*    */     //   #20	-> 96
/*    */     //   #18	-> 115
/*    */     //   #5	-> 118
/*    */     //   #58	-> 121
/*    */     //   #73	-> 124
/*    */     //   #82	-> 138
/*    */     //   #7	-> 147
/*    */     //   #32	-> 163
/*    */     //   #86	-> 182
/*    */     //   #21	-> 214
/*    */     //   #9	-> 217
/*    */     //   #53	-> 231
/*    */     //   #29	-> 247
/*    */     //   #61	-> 279
/*    */     //   #24	-> 286
/*    */     //   #80	-> 309
/*    */     //   #75	-> 325
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   31	51	54	aacinternal/v
/*    */     //   66	75	78	aacinternal/v
/*    */     //   91	99	102	aacinternal/v
/*    */     //   182	195	204	aacinternal/v
/*    */     //   247	260	269	aacinternal/v
/*    */   }
/*    */   public double a(double[] paramArrayOfdouble, int paramInt1, long paramLong, int paramInt2) {
/*    */     // Byte code:
/*    */     //   0: lload_3
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 43519471956910
/*    */     //   5: lxor
/*    */     //   6: lstore #6
/*    */     //   8: dup2
/*    */     //   9: ldc2_w 113476506211724
/*    */     //   12: lxor
/*    */     //   13: lstore #8
/*    */     //   15: dup2
/*    */     //   16: ldc2_w 4741319139254
/*    */     //   19: lxor
/*    */     //   20: lstore #10
/*    */     //   22: pop2
/*    */     //   23: ldc2_w -4788098390745172979
/*    */     //   26: lload_3
/*    */     //   27: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   32: ldc2_w NaN
/*    */     //   35: dstore #13
/*    */     //   37: astore #12
/*    */     //   39: aload_1
/*    */     //   40: iload_2
/*    */     //   41: lload #8
/*    */     //   43: iload #5
/*    */     //   45: invokestatic a : ([DIJI)Z
/*    */     //   48: aload #12
/*    */     //   50: ifnull -> 71
/*    */     //   53: ifeq -> 151
/*    */     //   56: goto -> 69
/*    */     //   59: ldc2_w -4769822461171355817
/*    */     //   62: lload_3
/*    */     //   63: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   68: athrow
/*    */     //   69: iload #5
/*    */     //   71: iconst_1
/*    */     //   72: aload #12
/*    */     //   74: ifnull -> 123
/*    */     //   77: if_icmpne -> 107
/*    */     //   80: goto -> 93
/*    */     //   83: ldc2_w -4769822461171355817
/*    */     //   86: lload_3
/*    */     //   87: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   92: athrow
/*    */     //   93: dconst_0
/*    */     //   94: lload_3
/*    */     //   95: lconst_0
/*    */     //   96: lcmp
/*    */     //   97: ifle -> 153
/*    */     //   100: dstore #13
/*    */     //   102: aload #12
/*    */     //   104: ifnonnull -> 151
/*    */     //   107: iload #5
/*    */     //   109: iconst_1
/*    */     //   110: goto -> 123
/*    */     //   113: ldc2_w -4769822461171355817
/*    */     //   116: lload_3
/*    */     //   117: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   122: athrow
/*    */     //   123: if_icmple -> 151
/*    */     //   126: aload_1
/*    */     //   127: iload_2
/*    */     //   128: lload #6
/*    */     //   130: iload #5
/*    */     //   132: invokestatic f : ([DIJI)D
/*    */     //   135: dstore #15
/*    */     //   137: aload_0
/*    */     //   138: lload #10
/*    */     //   140: aload_1
/*    */     //   141: dload #15
/*    */     //   143: iload_2
/*    */     //   144: iload #5
/*    */     //   146: invokevirtual a : (J[DDII)D
/*    */     //   149: dstore #13
/*    */     //   151: dload #13
/*    */     //   153: dreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #84	-> 32
/*    */     //   #88	-> 39
/*    */     //   #14	-> 69
/*    */     //   #23	-> 93
/*    */     //   #97	-> 107
/*    */     //   #33	-> 126
/*    */     //   #68	-> 137
/*    */     //   #46	-> 151
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   39	56	59	aacinternal/v
/*    */     //   71	80	83	aacinternal/v
/*    */     //   102	110	113	aacinternal/v
/*    */   }
/*    */   
/*    */   public void a(double paramDouble, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: lload_3
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 0
/*    */     //   5: lxor
/*    */     //   6: lstore #5
/*    */     //   8: pop2
/*    */     //   9: ldc2_w -1271049672133580836
/*    */     //   12: lload_3
/*    */     //   13: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   18: astore #7
/*    */     //   20: aload_0
/*    */     //   21: aload #7
/*    */     //   23: ifnull -> 59
/*    */     //   26: getfield c : Z
/*    */     //   29: ifeq -> 68
/*    */     //   32: goto -> 45
/*    */     //   35: ldc2_w -1288243549385917306
/*    */     //   38: lload_3
/*    */     //   39: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   44: athrow
/*    */     //   45: aload_0
/*    */     //   46: goto -> 59
/*    */     //   49: ldc2_w -1288243549385917306
/*    */     //   52: lload_3
/*    */     //   53: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   58: athrow
/*    */     //   59: getfield a : Laacinternal/a9;
/*    */     //   62: dload_1
/*    */     //   63: lload #5
/*    */     //   65: invokevirtual a : (DJ)V
/*    */     //   68: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #89	-> 20
/*    */     //   #85	-> 45
/*    */     //   #81	-> 68
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   20	32	35	aacinternal/g
/*    */     //   26	46	49	aacinternal/g
/*    */   }
/*    */   
/*    */   public a8() {
/* 90 */     this(true);
/*    */   } public void a(long paramLong, Object paramObject) {
/* 92 */     long l = paramLong ^ 0x441A5F58C8ECL; a((a8)paramObject, l);
/*    */   }
/*    */   
/*    */   public c a(long paramLong) {
/* 96 */     long l = paramLong ^ 0xF7349D8B5A7L; return a(l);
/*    */   }
/*    */   
/*    */   public a8(long paramLong, a8 parama8) {
/*    */     az.a(l1, parama8);
/*    */     this.a = parama8.a.a(l2);
/*    */     this.c = parama8.c;
/*    */     this.d = parama8.d;
/*    */   }
/*    */   
/*    */   public void a(a8 parama8, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic aacinternal/a8.f : J
/*    */     //   3: lload_2
/*    */     //   4: lxor
/*    */     //   5: lstore_2
/*    */     //   6: lload_2
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 22897080097736
/*    */     //   11: lxor
/*    */     //   12: lstore #4
/*    */     //   14: dup2
/*    */     //   15: ldc2_w 52908165324542
/*    */     //   18: lxor
/*    */     //   19: lstore #6
/*    */     //   21: pop2
/*    */     //   22: ldc2_w -4180418643559592836
/*    */     //   25: lload_2
/*    */     //   26: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   31: lload #6
/*    */     //   33: aload_1
/*    */     //   34: invokestatic a : (JLjava/lang/Object;)V
/*    */     //   37: astore #8
/*    */     //   39: aload_0
/*    */     //   40: aload #8
/*    */     //   42: ifnull -> 78
/*    */     //   45: getfield c : Z
/*    */     //   48: ifeq -> 90
/*    */     //   51: goto -> 64
/*    */     //   54: ldc2_w -4197560203886602458
/*    */     //   57: lload_2
/*    */     //   58: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   63: athrow
/*    */     //   64: aload_0
/*    */     //   65: goto -> 78
/*    */     //   68: ldc2_w -4197560203886602458
/*    */     //   71: lload_2
/*    */     //   72: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   77: athrow
/*    */     //   78: getfield a : Laacinternal/a9;
/*    */     //   81: aload_1
/*    */     //   82: getfield a : Laacinternal/a9;
/*    */     //   85: lload #4
/*    */     //   87: invokevirtual a : (Laacinternal/a9;J)V
/*    */     //   90: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #99	-> 31
/*    */     //   #47	-> 39
/*    */     //   #93	-> 64
/*    */     //   #36	-> 90
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   39	51	54	aacinternal/g
/*    */     //   45	65	68	aacinternal/g
/*    */   }
/*    */   
/*    */   private static RuntimeException a(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\a8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */