/*     */ package me.konsolas.aac;
/*     */ 
/*     */ import java.lang.invoke.MethodHandles;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ final class jk
/*     */ {
/*  17 */   int e = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   void a(long paramLong, int paramInt1, int paramInt2, int paramInt3) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/jk.m : J
/*     */     //   3: lload_1
/*     */     //   4: lxor
/*     */     //   5: lstore_1
/*     */     //   6: lload_1
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 81775513074506
/*     */     //   11: lxor
/*     */     //   12: lstore #6
/*     */     //   14: pop2
/*     */     //   15: ldc2_w -202902399281850071
/*     */     //   18: lload_1
/*     */     //   19: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*     */     //   24: astore #8
/*     */     //   26: iload_3
/*     */     //   27: iload #4
/*     */     //   29: aload #8
/*     */     //   31: ifnull -> 93
/*     */     //   34: if_icmpge -> 75
/*     */     //   37: goto -> 50
/*     */     //   40: ldc2_w -260221077668430103
/*     */     //   43: lload_1
/*     */     //   44: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   49: athrow
/*     */     //   50: aload_0
/*     */     //   51: getfield k : Lme/konsolas/aac/fw;
/*     */     //   54: iload #5
/*     */     //   56: iload_3
/*     */     //   57: ior
/*     */     //   58: lload #6
/*     */     //   60: invokevirtual a : (IJ)Lme/konsolas/aac/fw;
/*     */     //   63: pop
/*     */     //   64: return
/*     */     //   65: ldc2_w -260221077668430103
/*     */     //   68: lload_1
/*     */     //   69: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   74: athrow
/*     */     //   75: aload_0
/*     */     //   76: getfield k : Lme/konsolas/aac/fw;
/*     */     //   79: iload #5
/*     */     //   81: iload #4
/*     */     //   83: ior
/*     */     //   84: lload #6
/*     */     //   86: invokevirtual a : (IJ)Lme/konsolas/aac/fw;
/*     */     //   89: pop
/*     */     //   90: iload_3
/*     */     //   91: iload #4
/*     */     //   93: isub
/*     */     //   94: istore_3
/*     */     //   95: iload_3
/*     */     //   96: sipush #128
/*     */     //   99: if_icmplt -> 164
/*     */     //   102: iload_3
/*     */     //   103: bipush #127
/*     */     //   105: iand
/*     */     //   106: istore #9
/*     */     //   108: aload_0
/*     */     //   109: getfield k : Lme/konsolas/aac/fw;
/*     */     //   112: iload #9
/*     */     //   114: sipush #128
/*     */     //   117: ior
/*     */     //   118: lload #6
/*     */     //   120: invokevirtual a : (IJ)Lme/konsolas/aac/fw;
/*     */     //   123: pop
/*     */     //   124: iload_3
/*     */     //   125: bipush #7
/*     */     //   127: iushr
/*     */     //   128: istore_3
/*     */     //   129: aload #8
/*     */     //   131: lload_1
/*     */     //   132: lconst_0
/*     */     //   133: lcmp
/*     */     //   134: iflt -> 142
/*     */     //   137: ifnull -> 175
/*     */     //   140: aload #8
/*     */     //   142: ifnonnull -> 95
/*     */     //   145: lload_1
/*     */     //   146: lconst_0
/*     */     //   147: lcmp
/*     */     //   148: iflt -> 129
/*     */     //   151: goto -> 164
/*     */     //   154: ldc2_w -260221077668430103
/*     */     //   157: lload_1
/*     */     //   158: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   163: athrow
/*     */     //   164: aload_0
/*     */     //   165: getfield k : Lme/konsolas/aac/fw;
/*     */     //   168: iload_3
/*     */     //   169: lload #6
/*     */     //   171: invokevirtual a : (IJ)Lme/konsolas/aac/fw;
/*     */     //   174: pop
/*     */     //   175: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #21	-> 26
/*     */     //   #65	-> 50
/*     */     //   #77	-> 64
/*     */     //   #63	-> 75
/*     */     //   #48	-> 90
/*     */     //   #47	-> 95
/*     */     //   #66	-> 102
/*     */     //   #55	-> 108
/*     */     //   #68	-> 124
/*     */     //   #31	-> 129
/*     */     //   #111	-> 164
/*     */     //   #52	-> 175
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   26	37	40	aacinternal/v
/*     */     //   34	65	65	aacinternal/v
/*     */     //   129	145	154	aacinternal/v
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void a(long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/jk.m : J
/*     */     //   3: lload_1
/*     */     //   4: lxor
/*     */     //   5: lstore_1
/*     */     //   6: lload_1
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 17452286980360
/*     */     //   11: lxor
/*     */     //   12: lstore_3
/*     */     //   13: pop2
/*     */     //   14: ldc2_w -243112538570352474
/*     */     //   17: lload_1
/*     */     //   18: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*     */     //   23: astore #5
/*     */     //   25: aload_0
/*     */     //   26: getfield f : I
/*     */     //   29: aload #5
/*     */     //   31: ifnull -> 71
/*     */     //   34: aload_0
/*     */     //   35: getfield e : I
/*     */     //   38: if_icmpge -> 142
/*     */     //   41: goto -> 54
/*     */     //   44: ldc2_w -149483596243402906
/*     */     //   47: lload_1
/*     */     //   48: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   53: athrow
/*     */     //   54: aload_0
/*     */     //   55: getfield f : I
/*     */     //   58: goto -> 71
/*     */     //   61: ldc2_w -149483596243402906
/*     */     //   64: lload_1
/*     */     //   65: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   70: athrow
/*     */     //   71: aload #5
/*     */     //   73: ifnull -> 141
/*     */     //   76: ifne -> 114
/*     */     //   79: goto -> 92
/*     */     //   82: ldc2_w -149483596243402906
/*     */     //   85: lload_1
/*     */     //   86: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   91: athrow
/*     */     //   92: aload_0
/*     */     //   93: invokespecial b : ()V
/*     */     //   96: aload #5
/*     */     //   98: ifnonnull -> 142
/*     */     //   101: goto -> 114
/*     */     //   104: ldc2_w -149483596243402906
/*     */     //   107: lload_1
/*     */     //   108: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   113: athrow
/*     */     //   114: aload_0
/*     */     //   115: aload_0
/*     */     //   116: getfield e : I
/*     */     //   119: aload_0
/*     */     //   120: getfield f : I
/*     */     //   123: isub
/*     */     //   124: lload_3
/*     */     //   125: invokespecial a : (IJ)I
/*     */     //   128: goto -> 141
/*     */     //   131: ldc2_w -149483596243402906
/*     */     //   134: lload_1
/*     */     //   135: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   140: athrow
/*     */     //   141: pop
/*     */     //   142: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #35	-> 25
/*     */     //   #96	-> 54
/*     */     //   #12	-> 92
/*     */     //   #106	-> 114
/*     */     //   #103	-> 142
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   25	41	44	aacinternal/v
/*     */     //   34	58	61	aacinternal/v
/*     */     //   71	79	82	aacinternal/v
/*     */     //   76	101	104	aacinternal/v
/*     */     //   92	128	131	aacinternal/v
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  36 */   g[] h = new g[8];
/*     */   
/*  38 */   private int l = Integer.MAX_VALUE;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   void a(gZ paramgZ, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/jk.m : J
/*     */     //   3: lload_2
/*     */     //   4: lxor
/*     */     //   5: lstore_2
/*     */     //   6: lload_2
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 16300008643722
/*     */     //   11: lxor
/*     */     //   12: lstore #4
/*     */     //   14: dup2
/*     */     //   15: ldc2_w 138175553263780
/*     */     //   18: lxor
/*     */     //   19: dup2
/*     */     //   20: bipush #48
/*     */     //   22: lushr
/*     */     //   23: l2i
/*     */     //   24: istore #6
/*     */     //   26: dup2
/*     */     //   27: bipush #16
/*     */     //   29: lshl
/*     */     //   30: bipush #32
/*     */     //   32: lushr
/*     */     //   33: l2i
/*     */     //   34: istore #7
/*     */     //   36: dup2
/*     */     //   37: bipush #48
/*     */     //   39: lshl
/*     */     //   40: bipush #48
/*     */     //   42: lushr
/*     */     //   43: l2i
/*     */     //   44: istore #8
/*     */     //   46: pop2
/*     */     //   47: dup2
/*     */     //   48: ldc2_w 43840848683819
/*     */     //   51: lxor
/*     */     //   52: lstore #9
/*     */     //   54: dup2
/*     */     //   55: ldc2_w 102295029736129
/*     */     //   58: lxor
/*     */     //   59: lstore #11
/*     */     //   61: dup2
/*     */     //   62: ldc2_w 84003650055407
/*     */     //   65: lxor
/*     */     //   66: dup2
/*     */     //   67: bipush #32
/*     */     //   69: lushr
/*     */     //   70: l2i
/*     */     //   71: istore #13
/*     */     //   73: dup2
/*     */     //   74: bipush #32
/*     */     //   76: lshl
/*     */     //   77: bipush #32
/*     */     //   79: lushr
/*     */     //   80: lstore #14
/*     */     //   82: pop2
/*     */     //   83: pop2
/*     */     //   84: ldc2_w -7121574959584478931
/*     */     //   87: lload_2
/*     */     //   88: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*     */     //   93: astore #16
/*     */     //   95: aload_0
/*     */     //   96: aload #16
/*     */     //   98: ifnull -> 255
/*     */     //   101: getfield d : Z
/*     */     //   104: ifeq -> 226
/*     */     //   107: goto -> 120
/*     */     //   110: ldc2_w -7176571392637427987
/*     */     //   113: lload_2
/*     */     //   114: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   119: athrow
/*     */     //   120: invokestatic a : ()Lme/konsolas/aac/jY;
/*     */     //   123: iload #6
/*     */     //   125: i2c
/*     */     //   126: iload #7
/*     */     //   128: iload #8
/*     */     //   130: aload_1
/*     */     //   131: invokevirtual a : (CIILme/konsolas/aac/gZ;)I
/*     */     //   134: aload_1
/*     */     //   135: invokevirtual a : ()I
/*     */     //   138: if_icmpge -> 226
/*     */     //   141: goto -> 154
/*     */     //   144: ldc2_w -7176571392637427987
/*     */     //   147: lload_2
/*     */     //   148: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   153: athrow
/*     */     //   154: new me/konsolas/aac/fw
/*     */     //   157: dup
/*     */     //   158: invokespecial <init> : ()V
/*     */     //   161: astore #17
/*     */     //   163: invokestatic a : ()Lme/konsolas/aac/jY;
/*     */     //   166: aload_1
/*     */     //   167: aload #17
/*     */     //   169: lload #11
/*     */     //   171: invokevirtual a : (Lme/konsolas/aac/gZ;Lme/konsolas/aac/gi;J)V
/*     */     //   174: aload #17
/*     */     //   176: lload #4
/*     */     //   178: invokevirtual a : (J)Lme/konsolas/aac/gZ;
/*     */     //   181: astore #18
/*     */     //   183: aload_0
/*     */     //   184: aload #18
/*     */     //   186: invokevirtual a : ()I
/*     */     //   189: lload #9
/*     */     //   191: dup2_x1
/*     */     //   192: pop2
/*     */     //   193: bipush #127
/*     */     //   195: sipush #128
/*     */     //   198: invokevirtual a : (JIII)V
/*     */     //   201: aload_0
/*     */     //   202: getfield k : Lme/konsolas/aac/fw;
/*     */     //   205: aload #18
/*     */     //   207: iload #13
/*     */     //   209: lload #14
/*     */     //   211: invokevirtual a : (Lme/konsolas/aac/gZ;IJ)Lme/konsolas/aac/fw;
/*     */     //   214: pop
/*     */     //   215: lload_2
/*     */     //   216: lconst_0
/*     */     //   217: lcmp
/*     */     //   218: iflt -> 241
/*     */     //   221: aload #16
/*     */     //   223: ifnonnull -> 267
/*     */     //   226: aload_0
/*     */     //   227: aload_1
/*     */     //   228: invokevirtual a : ()I
/*     */     //   231: lload #9
/*     */     //   233: dup2_x1
/*     */     //   234: pop2
/*     */     //   235: bipush #127
/*     */     //   237: iconst_0
/*     */     //   238: invokevirtual a : (JIII)V
/*     */     //   241: aload_0
/*     */     //   242: goto -> 255
/*     */     //   245: ldc2_w -7176571392637427987
/*     */     //   248: lload_2
/*     */     //   249: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   254: athrow
/*     */     //   255: getfield k : Lme/konsolas/aac/fw;
/*     */     //   258: aload_1
/*     */     //   259: iload #13
/*     */     //   261: lload #14
/*     */     //   263: invokevirtual a : (Lme/konsolas/aac/gZ;IJ)Lme/konsolas/aac/fw;
/*     */     //   266: pop
/*     */     //   267: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #42	-> 95
/*     */     //   #70	-> 154
/*     */     //   #22	-> 163
/*     */     //   #43	-> 174
/*     */     //   #56	-> 183
/*     */     //   #3	-> 201
/*     */     //   #121	-> 215
/*     */     //   #7	-> 226
/*     */     //   #46	-> 241
/*     */     //   #57	-> 267
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   95	107	110	java/io/IOException
/*     */     //   101	141	144	java/io/IOException
/*     */     //   183	242	245	java/io/IOException
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private int a(int paramInt, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/jk.m : J
/*     */     //   3: lload_2
/*     */     //   4: lxor
/*     */     //   5: lstore_2
/*     */     //   6: ldc2_w 5658582126449437313
/*     */     //   9: lload_2
/*     */     //   10: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*     */     //   15: iconst_0
/*     */     //   16: istore #5
/*     */     //   18: astore #4
/*     */     //   20: iload_1
/*     */     //   21: aload #4
/*     */     //   23: ifnull -> 244
/*     */     //   26: ifle -> 242
/*     */     //   29: goto -> 42
/*     */     //   32: ldc2_w 5749959208831241537
/*     */     //   35: lload_2
/*     */     //   36: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   41: athrow
/*     */     //   42: aload_0
/*     */     //   43: getfield h : [Lme/konsolas/aac/g;
/*     */     //   46: arraylength
/*     */     //   47: iconst_1
/*     */     //   48: isub
/*     */     //   49: istore #6
/*     */     //   51: iload #6
/*     */     //   53: aload_0
/*     */     //   54: getfield i : I
/*     */     //   57: if_icmplt -> 172
/*     */     //   60: iload_1
/*     */     //   61: aload #4
/*     */     //   63: lload_2
/*     */     //   64: lconst_0
/*     */     //   65: lcmp
/*     */     //   66: iflt -> 74
/*     */     //   69: ifnull -> 244
/*     */     //   72: aload #4
/*     */     //   74: ifnull -> 131
/*     */     //   77: goto -> 90
/*     */     //   80: ldc2_w 5749959208831241537
/*     */     //   83: lload_2
/*     */     //   84: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   89: athrow
/*     */     //   90: ifle -> 172
/*     */     //   93: goto -> 106
/*     */     //   96: ldc2_w 5749959208831241537
/*     */     //   99: lload_2
/*     */     //   100: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   105: athrow
/*     */     //   106: iload_1
/*     */     //   107: aload_0
/*     */     //   108: getfield h : [Lme/konsolas/aac/g;
/*     */     //   111: iload #6
/*     */     //   113: aaload
/*     */     //   114: getfield k : I
/*     */     //   117: isub
/*     */     //   118: goto -> 131
/*     */     //   121: ldc2_w 5749959208831241537
/*     */     //   124: lload_2
/*     */     //   125: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   130: athrow
/*     */     //   131: istore_1
/*     */     //   132: aload_0
/*     */     //   133: dup
/*     */     //   134: getfield e : I
/*     */     //   137: aload_0
/*     */     //   138: getfield h : [Lme/konsolas/aac/g;
/*     */     //   141: iload #6
/*     */     //   143: aaload
/*     */     //   144: getfield k : I
/*     */     //   147: isub
/*     */     //   148: putfield e : I
/*     */     //   151: aload_0
/*     */     //   152: dup
/*     */     //   153: getfield b : I
/*     */     //   156: iconst_1
/*     */     //   157: isub
/*     */     //   158: putfield b : I
/*     */     //   161: iinc #5, 1
/*     */     //   164: iinc #6, -1
/*     */     //   167: aload #4
/*     */     //   169: ifnonnull -> 51
/*     */     //   172: aload_0
/*     */     //   173: getfield h : [Lme/konsolas/aac/g;
/*     */     //   176: aload_0
/*     */     //   177: getfield i : I
/*     */     //   180: iconst_1
/*     */     //   181: iadd
/*     */     //   182: aload_0
/*     */     //   183: getfield h : [Lme/konsolas/aac/g;
/*     */     //   186: aload_0
/*     */     //   187: getfield i : I
/*     */     //   190: iconst_1
/*     */     //   191: iadd
/*     */     //   192: iload #5
/*     */     //   194: iadd
/*     */     //   195: aload_0
/*     */     //   196: getfield b : I
/*     */     //   199: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
/*     */     //   202: aload_0
/*     */     //   203: getfield h : [Lme/konsolas/aac/g;
/*     */     //   206: aload_0
/*     */     //   207: getfield i : I
/*     */     //   210: iconst_1
/*     */     //   211: iadd
/*     */     //   212: aload_0
/*     */     //   213: getfield i : I
/*     */     //   216: iconst_1
/*     */     //   217: iadd
/*     */     //   218: iload #5
/*     */     //   220: iadd
/*     */     //   221: aconst_null
/*     */     //   222: invokestatic fill : ([Ljava/lang/Object;IILjava/lang/Object;)V
/*     */     //   225: aload_0
/*     */     //   226: dup
/*     */     //   227: getfield i : I
/*     */     //   230: iload #5
/*     */     //   232: iadd
/*     */     //   233: lload_2
/*     */     //   234: lconst_0
/*     */     //   235: lcmp
/*     */     //   236: ifle -> 158
/*     */     //   239: putfield i : I
/*     */     //   242: iload #5
/*     */     //   244: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #62	-> 15
/*     */     //   #125	-> 20
/*     */     //   #75	-> 42
/*     */     //   #50	-> 106
/*     */     //   #33	-> 132
/*     */     //   #20	-> 151
/*     */     //   #84	-> 161
/*     */     //   #19	-> 164
/*     */     //   #23	-> 172
/*     */     //   #107	-> 202
/*     */     //   #85	-> 225
/*     */     //   #54	-> 242
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   20	29	32	aacinternal/v
/*     */     //   60	77	80	aacinternal/v
/*     */     //   72	93	96	aacinternal/v
/*     */     //   90	118	121	aacinternal/v
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   jk(fw paramfw) {
/*     */     this(4096, true, paramfw);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   jk(int paramInt, boolean paramBoolean, fw paramfw) {
/*  71 */     this.g = paramInt;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     this.f = paramInt;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     this.d = paramBoolean;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 100 */     this.k = paramfw;
/* 101 */   } int i = this.h.length - 1;
/*     */ 
/*     */   
/*     */   void a(List paramList, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/jk.m : J
/*     */     //   3: lload_2
/*     */     //   4: lxor
/*     */     //   5: lstore_2
/*     */     //   6: lload_2
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 78543951519081
/*     */     //   11: lxor
/*     */     //   12: lstore #4
/*     */     //   14: dup2
/*     */     //   15: ldc2_w 69257851502301
/*     */     //   18: lxor
/*     */     //   19: dup2
/*     */     //   20: bipush #48
/*     */     //   22: lushr
/*     */     //   23: l2i
/*     */     //   24: istore #6
/*     */     //   26: dup2
/*     */     //   27: bipush #16
/*     */     //   29: lshl
/*     */     //   30: bipush #32
/*     */     //   32: lushr
/*     */     //   33: l2i
/*     */     //   34: istore #7
/*     */     //   36: dup2
/*     */     //   37: bipush #48
/*     */     //   39: lshl
/*     */     //   40: bipush #48
/*     */     //   42: lushr
/*     */     //   43: l2i
/*     */     //   44: istore #8
/*     */     //   46: pop2
/*     */     //   47: dup2
/*     */     //   48: ldc2_w 47209576547592
/*     */     //   51: lxor
/*     */     //   52: lstore #9
/*     */     //   54: dup2
/*     */     //   55: ldc2_w 12316402539339
/*     */     //   58: lxor
/*     */     //   59: lstore #11
/*     */     //   61: dup2
/*     */     //   62: ldc2_w 29645006644492
/*     */     //   65: lxor
/*     */     //   66: lstore #13
/*     */     //   68: dup2
/*     */     //   69: ldc2_w 82950727475449
/*     */     //   72: lxor
/*     */     //   73: lstore #15
/*     */     //   75: pop2
/*     */     //   76: ldc2_w -2662708854981705974
/*     */     //   79: lload_2
/*     */     //   80: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*     */     //   85: astore #17
/*     */     //   87: aload_0
/*     */     //   88: getfield j : Z
/*     */     //   91: aload #17
/*     */     //   93: ifnull -> 217
/*     */     //   96: ifeq -> 216
/*     */     //   99: goto -> 112
/*     */     //   102: ldc2_w -2720016402147911478
/*     */     //   105: lload_2
/*     */     //   106: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   111: athrow
/*     */     //   112: aload_0
/*     */     //   113: aload #17
/*     */     //   115: ifnull -> 201
/*     */     //   118: goto -> 131
/*     */     //   121: ldc2_w -2720016402147911478
/*     */     //   124: lload_2
/*     */     //   125: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   130: athrow
/*     */     //   131: lload_2
/*     */     //   132: lconst_0
/*     */     //   133: lcmp
/*     */     //   134: iflt -> 195
/*     */     //   137: getfield l : I
/*     */     //   140: aload_0
/*     */     //   141: getfield f : I
/*     */     //   144: if_icmpge -> 189
/*     */     //   147: goto -> 160
/*     */     //   150: ldc2_w -2720016402147911478
/*     */     //   153: lload_2
/*     */     //   154: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   159: athrow
/*     */     //   160: aload_0
/*     */     //   161: aload_0
/*     */     //   162: getfield l : I
/*     */     //   165: lload #13
/*     */     //   167: dup2_x1
/*     */     //   168: pop2
/*     */     //   169: bipush #31
/*     */     //   171: bipush #32
/*     */     //   173: invokevirtual a : (JIII)V
/*     */     //   176: goto -> 189
/*     */     //   179: ldc2_w -2720016402147911478
/*     */     //   182: lload_2
/*     */     //   183: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   188: athrow
/*     */     //   189: aload_0
/*     */     //   190: iconst_0
/*     */     //   191: putfield j : Z
/*     */     //   194: aload_0
/*     */     //   195: ldc 2147483647
/*     */     //   197: putfield l : I
/*     */     //   200: aload_0
/*     */     //   201: aload_0
/*     */     //   202: getfield f : I
/*     */     //   205: lload #13
/*     */     //   207: dup2_x1
/*     */     //   208: pop2
/*     */     //   209: bipush #31
/*     */     //   211: bipush #32
/*     */     //   213: invokevirtual a : (JIII)V
/*     */     //   216: iconst_0
/*     */     //   217: istore #18
/*     */     //   219: aload_1
/*     */     //   220: invokeinterface size : ()I
/*     */     //   225: istore #19
/*     */     //   227: iload #18
/*     */     //   229: iload #19
/*     */     //   231: if_icmpge -> 1142
/*     */     //   234: aload_1
/*     */     //   235: iload #18
/*     */     //   237: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   242: checkcast me/konsolas/aac/g
/*     */     //   245: astore #20
/*     */     //   247: aload #20
/*     */     //   249: getfield j : Lme/konsolas/aac/gZ;
/*     */     //   252: iload #6
/*     */     //   254: i2s
/*     */     //   255: iload #7
/*     */     //   257: iload #8
/*     */     //   259: i2c
/*     */     //   260: invokevirtual e : (SIC)Lme/konsolas/aac/gZ;
/*     */     //   263: astore #21
/*     */     //   265: aload #20
/*     */     //   267: getfield c : Lme/konsolas/aac/gZ;
/*     */     //   270: astore #22
/*     */     //   272: iconst_m1
/*     */     //   273: istore #23
/*     */     //   275: iconst_m1
/*     */     //   276: istore #24
/*     */     //   278: getstatic me/konsolas/aac/e8.b : Ljava/util/Map;
/*     */     //   281: aload #21
/*     */     //   283: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   288: checkcast java/lang/Integer
/*     */     //   291: astore #25
/*     */     //   293: lload_2
/*     */     //   294: lconst_0
/*     */     //   295: lcmp
/*     */     //   296: iflt -> 331
/*     */     //   299: aload #25
/*     */     //   301: aload #17
/*     */     //   303: ifnull -> 324
/*     */     //   306: ifnull -> 524
/*     */     //   309: goto -> 322
/*     */     //   312: ldc2_w -2720016402147911478
/*     */     //   315: lload_2
/*     */     //   316: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   321: athrow
/*     */     //   322: aload #25
/*     */     //   324: invokevirtual intValue : ()I
/*     */     //   327: iconst_1
/*     */     //   328: iadd
/*     */     //   329: istore #24
/*     */     //   331: iload #24
/*     */     //   333: iconst_1
/*     */     //   334: aload #17
/*     */     //   336: ifnull -> 527
/*     */     //   339: if_icmple -> 524
/*     */     //   342: goto -> 355
/*     */     //   345: ldc2_w -2720016402147911478
/*     */     //   348: lload_2
/*     */     //   349: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   354: athrow
/*     */     //   355: iload #24
/*     */     //   357: bipush #8
/*     */     //   359: aload #17
/*     */     //   361: lload_2
/*     */     //   362: lconst_0
/*     */     //   363: lcmp
/*     */     //   364: ifle -> 529
/*     */     //   367: ifnull -> 527
/*     */     //   370: goto -> 383
/*     */     //   373: ldc2_w -2720016402147911478
/*     */     //   376: lload_2
/*     */     //   377: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   382: athrow
/*     */     //   383: if_icmpge -> 524
/*     */     //   386: goto -> 399
/*     */     //   389: ldc2_w -2720016402147911478
/*     */     //   392: lload_2
/*     */     //   393: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   398: athrow
/*     */     //   399: getstatic me/konsolas/aac/e8.f : [Lme/konsolas/aac/g;
/*     */     //   402: iload #24
/*     */     //   404: iconst_1
/*     */     //   405: isub
/*     */     //   406: aaload
/*     */     //   407: getfield c : Lme/konsolas/aac/gZ;
/*     */     //   410: aload #22
/*     */     //   412: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   415: aload #17
/*     */     //   417: lload_2
/*     */     //   418: lconst_0
/*     */     //   419: lcmp
/*     */     //   420: ifle -> 499
/*     */     //   423: ifnull -> 497
/*     */     //   426: goto -> 439
/*     */     //   429: ldc2_w -2720016402147911478
/*     */     //   432: lload_2
/*     */     //   433: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   438: athrow
/*     */     //   439: ifeq -> 470
/*     */     //   442: goto -> 455
/*     */     //   445: ldc2_w -2720016402147911478
/*     */     //   448: lload_2
/*     */     //   449: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   454: athrow
/*     */     //   455: iload #24
/*     */     //   457: lload_2
/*     */     //   458: lconst_0
/*     */     //   459: lcmp
/*     */     //   460: ifle -> 484
/*     */     //   463: istore #23
/*     */     //   465: aload #17
/*     */     //   467: ifnonnull -> 524
/*     */     //   470: getstatic me/konsolas/aac/e8.f : [Lme/konsolas/aac/g;
/*     */     //   473: iload #24
/*     */     //   475: aaload
/*     */     //   476: getfield c : Lme/konsolas/aac/gZ;
/*     */     //   479: aload #22
/*     */     //   481: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   484: goto -> 497
/*     */     //   487: ldc2_w -2720016402147911478
/*     */     //   490: lload_2
/*     */     //   491: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   496: athrow
/*     */     //   497: aload #17
/*     */     //   499: ifnull -> 526
/*     */     //   502: ifeq -> 524
/*     */     //   505: goto -> 518
/*     */     //   508: ldc2_w -2720016402147911478
/*     */     //   511: lload_2
/*     */     //   512: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   517: athrow
/*     */     //   518: iload #24
/*     */     //   520: iconst_1
/*     */     //   521: iadd
/*     */     //   522: istore #23
/*     */     //   524: iload #23
/*     */     //   526: iconst_m1
/*     */     //   527: aload #17
/*     */     //   529: lload_2
/*     */     //   530: lconst_0
/*     */     //   531: lcmp
/*     */     //   532: ifle -> 817
/*     */     //   535: ifnull -> 809
/*     */     //   538: if_icmpne -> 800
/*     */     //   541: goto -> 554
/*     */     //   544: ldc2_w -2720016402147911478
/*     */     //   547: lload_2
/*     */     //   548: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   553: athrow
/*     */     //   554: aload_0
/*     */     //   555: getfield i : I
/*     */     //   558: iconst_1
/*     */     //   559: iadd
/*     */     //   560: istore #26
/*     */     //   562: aload_0
/*     */     //   563: getfield h : [Lme/konsolas/aac/g;
/*     */     //   566: arraylength
/*     */     //   567: istore #27
/*     */     //   569: iload #26
/*     */     //   571: iload #27
/*     */     //   573: if_icmpge -> 800
/*     */     //   576: aload_0
/*     */     //   577: getfield h : [Lme/konsolas/aac/g;
/*     */     //   580: iload #26
/*     */     //   582: aaload
/*     */     //   583: getfield j : Lme/konsolas/aac/gZ;
/*     */     //   586: aload #21
/*     */     //   588: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   591: aload #17
/*     */     //   593: lload_2
/*     */     //   594: lconst_0
/*     */     //   595: lcmp
/*     */     //   596: iflt -> 604
/*     */     //   599: ifnull -> 808
/*     */     //   602: aload #17
/*     */     //   604: lload_2
/*     */     //   605: lconst_0
/*     */     //   606: lcmp
/*     */     //   607: ifle -> 678
/*     */     //   610: ifnull -> 670
/*     */     //   613: goto -> 626
/*     */     //   616: ldc2_w -2720016402147911478
/*     */     //   619: lload_2
/*     */     //   620: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   625: athrow
/*     */     //   626: ifeq -> 792
/*     */     //   629: goto -> 642
/*     */     //   632: ldc2_w -2720016402147911478
/*     */     //   635: lload_2
/*     */     //   636: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   641: athrow
/*     */     //   642: aload_0
/*     */     //   643: getfield h : [Lme/konsolas/aac/g;
/*     */     //   646: iload #26
/*     */     //   648: aaload
/*     */     //   649: getfield c : Lme/konsolas/aac/gZ;
/*     */     //   652: aload #22
/*     */     //   654: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   657: goto -> 670
/*     */     //   660: ldc2_w -2720016402147911478
/*     */     //   663: lload_2
/*     */     //   664: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   669: athrow
/*     */     //   670: lload_2
/*     */     //   671: lconst_0
/*     */     //   672: lcmp
/*     */     //   673: iflt -> 737
/*     */     //   676: aload #17
/*     */     //   678: ifnull -> 737
/*     */     //   681: ifeq -> 722
/*     */     //   684: goto -> 697
/*     */     //   687: ldc2_w -2720016402147911478
/*     */     //   690: lload_2
/*     */     //   691: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   696: athrow
/*     */     //   697: iload #26
/*     */     //   699: aload_0
/*     */     //   700: getfield i : I
/*     */     //   703: isub
/*     */     //   704: getstatic me/konsolas/aac/e8.f : [Lme/konsolas/aac/g;
/*     */     //   707: arraylength
/*     */     //   708: iadd
/*     */     //   709: lload_2
/*     */     //   710: lconst_0
/*     */     //   711: lcmp
/*     */     //   712: iflt -> 724
/*     */     //   715: istore #23
/*     */     //   717: aload #17
/*     */     //   719: ifnonnull -> 800
/*     */     //   722: iload #24
/*     */     //   724: goto -> 737
/*     */     //   727: ldc2_w -2720016402147911478
/*     */     //   730: lload_2
/*     */     //   731: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   736: athrow
/*     */     //   737: lload_2
/*     */     //   738: lconst_0
/*     */     //   739: lcmp
/*     */     //   740: iflt -> 790
/*     */     //   743: iconst_m1
/*     */     //   744: aload #17
/*     */     //   746: ifnull -> 789
/*     */     //   749: if_icmpne -> 792
/*     */     //   752: goto -> 765
/*     */     //   755: ldc2_w -2720016402147911478
/*     */     //   758: lload_2
/*     */     //   759: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   764: athrow
/*     */     //   765: iload #26
/*     */     //   767: aload_0
/*     */     //   768: getfield i : I
/*     */     //   771: isub
/*     */     //   772: getstatic me/konsolas/aac/e8.f : [Lme/konsolas/aac/g;
/*     */     //   775: arraylength
/*     */     //   776: goto -> 789
/*     */     //   779: ldc2_w -2720016402147911478
/*     */     //   782: lload_2
/*     */     //   783: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   788: athrow
/*     */     //   789: iadd
/*     */     //   790: istore #24
/*     */     //   792: iinc #26, 1
/*     */     //   795: aload #17
/*     */     //   797: ifnonnull -> 569
/*     */     //   800: lload_2
/*     */     //   801: lconst_0
/*     */     //   802: lcmp
/*     */     //   803: ifle -> 976
/*     */     //   806: iload #23
/*     */     //   808: iconst_m1
/*     */     //   809: lload_2
/*     */     //   810: lconst_0
/*     */     //   811: lcmp
/*     */     //   812: iflt -> 913
/*     */     //   815: aload #17
/*     */     //   817: ifnull -> 913
/*     */     //   820: if_icmpeq -> 873
/*     */     //   823: goto -> 836
/*     */     //   826: ldc2_w -2720016402147911478
/*     */     //   829: lload_2
/*     */     //   830: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   835: athrow
/*     */     //   836: aload_0
/*     */     //   837: lload #13
/*     */     //   839: iload #23
/*     */     //   841: bipush #127
/*     */     //   843: sipush #128
/*     */     //   846: invokevirtual a : (JIII)V
/*     */     //   849: aload #17
/*     */     //   851: lload_2
/*     */     //   852: lconst_0
/*     */     //   853: lcmp
/*     */     //   854: iflt -> 1139
/*     */     //   857: ifnonnull -> 1134
/*     */     //   860: goto -> 873
/*     */     //   863: ldc2_w -2720016402147911478
/*     */     //   866: lload_2
/*     */     //   867: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   872: athrow
/*     */     //   873: iload #24
/*     */     //   875: aload #17
/*     */     //   877: lload_2
/*     */     //   878: lconst_0
/*     */     //   879: lcmp
/*     */     //   880: iflt -> 1007
/*     */     //   883: ifnull -> 999
/*     */     //   886: goto -> 899
/*     */     //   889: ldc2_w -2720016402147911478
/*     */     //   892: lload_2
/*     */     //   893: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   898: athrow
/*     */     //   899: iconst_m1
/*     */     //   900: goto -> 913
/*     */     //   903: ldc2_w -2720016402147911478
/*     */     //   906: lload_2
/*     */     //   907: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   912: athrow
/*     */     //   913: if_icmpne -> 976
/*     */     //   916: aload_0
/*     */     //   917: getfield k : Lme/konsolas/aac/fw;
/*     */     //   920: bipush #64
/*     */     //   922: lload #4
/*     */     //   924: invokevirtual a : (IJ)Lme/konsolas/aac/fw;
/*     */     //   927: pop
/*     */     //   928: aload_0
/*     */     //   929: aload #21
/*     */     //   931: lload #9
/*     */     //   933: invokevirtual a : (Lme/konsolas/aac/gZ;J)V
/*     */     //   936: aload_0
/*     */     //   937: aload #22
/*     */     //   939: lload #9
/*     */     //   941: invokevirtual a : (Lme/konsolas/aac/gZ;J)V
/*     */     //   944: aload_0
/*     */     //   945: aload #20
/*     */     //   947: lload #15
/*     */     //   949: invokespecial a : (Lme/konsolas/aac/g;J)V
/*     */     //   952: aload #17
/*     */     //   954: lload_2
/*     */     //   955: lconst_0
/*     */     //   956: lcmp
/*     */     //   957: iflt -> 1139
/*     */     //   960: ifnonnull -> 1134
/*     */     //   963: goto -> 976
/*     */     //   966: ldc2_w -2720016402147911478
/*     */     //   969: lload_2
/*     */     //   970: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   975: athrow
/*     */     //   976: aload #21
/*     */     //   978: lload #11
/*     */     //   980: getstatic me/konsolas/aac/g.a : Lme/konsolas/aac/gZ;
/*     */     //   983: invokevirtual a : (JLme/konsolas/aac/gZ;)Z
/*     */     //   986: goto -> 999
/*     */     //   989: ldc2_w -2720016402147911478
/*     */     //   992: lload_2
/*     */     //   993: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   998: athrow
/*     */     //   999: lload_2
/*     */     //   1000: lconst_0
/*     */     //   1001: lcmp
/*     */     //   1002: iflt -> 1047
/*     */     //   1005: aload #17
/*     */     //   1007: ifnull -> 1047
/*     */     //   1010: ifeq -> 1093
/*     */     //   1013: goto -> 1026
/*     */     //   1016: ldc2_w -2720016402147911478
/*     */     //   1019: lload_2
/*     */     //   1020: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   1025: athrow
/*     */     //   1026: getstatic me/konsolas/aac/g.g : Lme/konsolas/aac/gZ;
/*     */     //   1029: aload #21
/*     */     //   1031: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1034: goto -> 1047
/*     */     //   1037: ldc2_w -2720016402147911478
/*     */     //   1040: lload_2
/*     */     //   1041: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   1046: athrow
/*     */     //   1047: ifne -> 1093
/*     */     //   1050: aload_0
/*     */     //   1051: lload #13
/*     */     //   1053: iload #24
/*     */     //   1055: bipush #15
/*     */     //   1057: iconst_0
/*     */     //   1058: invokevirtual a : (JIII)V
/*     */     //   1061: aload_0
/*     */     //   1062: aload #22
/*     */     //   1064: lload #9
/*     */     //   1066: invokevirtual a : (Lme/konsolas/aac/gZ;J)V
/*     */     //   1069: aload #17
/*     */     //   1071: lload_2
/*     */     //   1072: lconst_0
/*     */     //   1073: lcmp
/*     */     //   1074: iflt -> 1139
/*     */     //   1077: ifnonnull -> 1134
/*     */     //   1080: goto -> 1093
/*     */     //   1083: ldc2_w -2720016402147911478
/*     */     //   1086: lload_2
/*     */     //   1087: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   1092: athrow
/*     */     //   1093: aload_0
/*     */     //   1094: lload #13
/*     */     //   1096: iload #24
/*     */     //   1098: bipush #63
/*     */     //   1100: bipush #64
/*     */     //   1102: invokevirtual a : (JIII)V
/*     */     //   1105: aload_0
/*     */     //   1106: aload #22
/*     */     //   1108: lload #9
/*     */     //   1110: invokevirtual a : (Lme/konsolas/aac/gZ;J)V
/*     */     //   1113: aload_0
/*     */     //   1114: aload #20
/*     */     //   1116: lload #15
/*     */     //   1118: invokespecial a : (Lme/konsolas/aac/g;J)V
/*     */     //   1121: goto -> 1134
/*     */     //   1124: ldc2_w -2720016402147911478
/*     */     //   1127: lload_2
/*     */     //   1128: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   1133: athrow
/*     */     //   1134: iinc #18, 1
/*     */     //   1137: aload #17
/*     */     //   1139: ifnonnull -> 227
/*     */     //   1142: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #89	-> 87
/*     */     //   #14	-> 112
/*     */     //   #6	-> 160
/*     */     //   #37	-> 189
/*     */     //   #59	-> 194
/*     */     //   #124	-> 200
/*     */     //   #87	-> 216
/*     */     //   #1	-> 234
/*     */     //   #28	-> 247
/*     */     //   #8	-> 265
/*     */     //   #126	-> 272
/*     */     //   #83	-> 275
/*     */     //   #104	-> 278
/*     */     //   #49	-> 293
/*     */     //   #113	-> 322
/*     */     //   #123	-> 331
/*     */     //   #39	-> 399
/*     */     //   #116	-> 455
/*     */     //   #74	-> 470
/*     */     //   #73	-> 518
/*     */     //   #64	-> 524
/*     */     //   #118	-> 554
/*     */     //   #4	-> 576
/*     */     //   #80	-> 642
/*     */     //   #18	-> 697
/*     */     //   #102	-> 717
/*     */     //   #61	-> 722
/*     */     //   #26	-> 765
/*     */     //   #30	-> 792
/*     */     //   #60	-> 800
/*     */     //   #79	-> 836
/*     */     //   #78	-> 873
/*     */     //   #44	-> 916
/*     */     //   #45	-> 928
/*     */     //   #110	-> 936
/*     */     //   #9	-> 944
/*     */     //   #15	-> 976
/*     */     //   #53	-> 1050
/*     */     //   #95	-> 1061
/*     */     //   #34	-> 1093
/*     */     //   #58	-> 1105
/*     */     //   #88	-> 1113
/*     */     //   #99	-> 1134
/*     */     //   #27	-> 1142
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   87	99	102	java/io/IOException
/*     */     //   96	118	121	java/io/IOException
/*     */     //   112	147	150	java/io/IOException
/*     */     //   131	176	179	java/io/IOException
/*     */     //   293	309	312	java/io/IOException
/*     */     //   331	342	345	java/io/IOException
/*     */     //   339	370	373	java/io/IOException
/*     */     //   355	386	389	java/io/IOException
/*     */     //   383	426	429	java/io/IOException
/*     */     //   399	442	445	java/io/IOException
/*     */     //   465	484	487	java/io/IOException
/*     */     //   497	505	508	java/io/IOException
/*     */     //   527	541	544	java/io/IOException
/*     */     //   576	613	616	java/io/IOException
/*     */     //   602	629	632	java/io/IOException
/*     */     //   626	657	660	java/io/IOException
/*     */     //   670	684	687	java/io/IOException
/*     */     //   717	724	727	java/io/IOException
/*     */     //   737	752	755	java/io/IOException
/*     */     //   749	776	779	java/io/IOException
/*     */     //   809	823	826	java/io/IOException
/*     */     //   820	860	863	java/io/IOException
/*     */     //   836	886	889	java/io/IOException
/*     */     //   873	900	903	java/io/IOException
/*     */     //   913	963	966	java/io/IOException
/*     */     //   916	986	989	java/io/IOException
/*     */     //   999	1013	1016	java/io/IOException
/*     */     //   1010	1034	1037	java/io/IOException
/*     */     //   1047	1080	1083	java/io/IOException
/*     */     //   1050	1121	1124	java/io/IOException
/*     */   }
/*     */ 
/*     */   
/*     */   int b = 0;
/*     */   private static final int a = 4096;
/*     */   private static final int c = 16384;
/*     */   private final fw k;
/*     */   
/*     */   private void b() {
/* 115 */     Arrays.fill((Object[])this.h, (Object)null);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 120 */     this.i = this.h.length - 1;
/*     */     this.b = 0;
/*     */     this.e = 0;
/*     */   }
/*     */   
/*     */   private final boolean d;
/*     */   private boolean j;
/*     */   int g;
/*     */   int f;
/*     */   private static final long m = nc.a(-7937409282524630664L, 2398437174871314800L, MethodHandles.lookup().lookupClass()).a(19946329969649L);
/*     */   
/*     */   private void a(g paramg, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/jk.m : J
/*     */     //   3: lload_2
/*     */     //   4: lxor
/*     */     //   5: lstore_2
/*     */     //   6: lload_2
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 54291562149234
/*     */     //   11: lxor
/*     */     //   12: lstore #4
/*     */     //   14: pop2
/*     */     //   15: ldc2_w -514970766483579684
/*     */     //   18: lload_2
/*     */     //   19: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*     */     //   24: aload_1
/*     */     //   25: getfield k : I
/*     */     //   28: istore #7
/*     */     //   30: astore #6
/*     */     //   32: iload #7
/*     */     //   34: aload_0
/*     */     //   35: getfield f : I
/*     */     //   38: aload #6
/*     */     //   40: ifnull -> 85
/*     */     //   43: if_icmple -> 74
/*     */     //   46: goto -> 59
/*     */     //   49: ldc2_w -461949048258888932
/*     */     //   52: lload_2
/*     */     //   53: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   58: athrow
/*     */     //   59: aload_0
/*     */     //   60: invokespecial b : ()V
/*     */     //   63: return
/*     */     //   64: ldc2_w -461949048258888932
/*     */     //   67: lload_2
/*     */     //   68: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   73: athrow
/*     */     //   74: aload_0
/*     */     //   75: getfield e : I
/*     */     //   78: iload #7
/*     */     //   80: iadd
/*     */     //   81: aload_0
/*     */     //   82: getfield f : I
/*     */     //   85: isub
/*     */     //   86: istore #8
/*     */     //   88: aload_0
/*     */     //   89: iload #8
/*     */     //   91: lload #4
/*     */     //   93: invokespecial a : (IJ)I
/*     */     //   96: pop
/*     */     //   97: aload_0
/*     */     //   98: getfield b : I
/*     */     //   101: iconst_1
/*     */     //   102: lload_2
/*     */     //   103: lconst_0
/*     */     //   104: lcmp
/*     */     //   105: iflt -> 119
/*     */     //   108: iadd
/*     */     //   109: aload #6
/*     */     //   111: ifnull -> 195
/*     */     //   114: aload_0
/*     */     //   115: getfield h : [Lme/konsolas/aac/g;
/*     */     //   118: arraylength
/*     */     //   119: if_icmple -> 184
/*     */     //   122: goto -> 135
/*     */     //   125: ldc2_w -461949048258888932
/*     */     //   128: lload_2
/*     */     //   129: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   134: athrow
/*     */     //   135: aload_0
/*     */     //   136: getfield h : [Lme/konsolas/aac/g;
/*     */     //   139: arraylength
/*     */     //   140: iconst_2
/*     */     //   141: imul
/*     */     //   142: anewarray me/konsolas/aac/g
/*     */     //   145: astore #9
/*     */     //   147: aload_0
/*     */     //   148: getfield h : [Lme/konsolas/aac/g;
/*     */     //   151: iconst_0
/*     */     //   152: aload #9
/*     */     //   154: aload_0
/*     */     //   155: getfield h : [Lme/konsolas/aac/g;
/*     */     //   158: arraylength
/*     */     //   159: aload_0
/*     */     //   160: getfield h : [Lme/konsolas/aac/g;
/*     */     //   163: arraylength
/*     */     //   164: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
/*     */     //   167: aload_0
/*     */     //   168: aload_0
/*     */     //   169: getfield h : [Lme/konsolas/aac/g;
/*     */     //   172: arraylength
/*     */     //   173: iconst_1
/*     */     //   174: isub
/*     */     //   175: putfield i : I
/*     */     //   178: aload_0
/*     */     //   179: aload #9
/*     */     //   181: putfield h : [Lme/konsolas/aac/g;
/*     */     //   184: aload_0
/*     */     //   185: dup
/*     */     //   186: getfield i : I
/*     */     //   189: dup_x1
/*     */     //   190: iconst_1
/*     */     //   191: isub
/*     */     //   192: putfield i : I
/*     */     //   195: istore #9
/*     */     //   197: aload_0
/*     */     //   198: getfield h : [Lme/konsolas/aac/g;
/*     */     //   201: iload #9
/*     */     //   203: aload_1
/*     */     //   204: aastore
/*     */     //   205: aload_0
/*     */     //   206: dup
/*     */     //   207: getfield b : I
/*     */     //   210: iconst_1
/*     */     //   211: iadd
/*     */     //   212: putfield b : I
/*     */     //   215: aload_0
/*     */     //   216: dup
/*     */     //   217: getfield e : I
/*     */     //   220: iload #7
/*     */     //   222: iadd
/*     */     //   223: putfield e : I
/*     */     //   226: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #117	-> 24
/*     */     //   #98	-> 32
/*     */     //   #72	-> 59
/*     */     //   #29	-> 63
/*     */     //   #108	-> 74
/*     */     //   #105	-> 88
/*     */     //   #11	-> 97
/*     */     //   #109	-> 135
/*     */     //   #119	-> 147
/*     */     //   #92	-> 167
/*     */     //   #76	-> 178
/*     */     //   #41	-> 184
/*     */     //   #67	-> 197
/*     */     //   #82	-> 205
/*     */     //   #25	-> 215
/*     */     //   #90	-> 226
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   32	46	49	aacinternal/v
/*     */     //   43	64	64	aacinternal/v
/*     */     //   88	122	125	aacinternal/v
/*     */   }
/*     */   
/*     */   void a(long paramLong, int paramInt) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/jk.m : J
/*     */     //   3: lload_1
/*     */     //   4: lxor
/*     */     //   5: lstore_1
/*     */     //   6: lload_1
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 48858038929058
/*     */     //   11: lxor
/*     */     //   12: lstore #4
/*     */     //   14: pop2
/*     */     //   15: ldc2_w -491611687481828053
/*     */     //   18: lload_1
/*     */     //   19: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*     */     //   24: aload_0
/*     */     //   25: iload_3
/*     */     //   26: putfield g : I
/*     */     //   29: astore #6
/*     */     //   31: iload_3
/*     */     //   32: sipush #16384
/*     */     //   35: invokestatic min : (II)I
/*     */     //   38: istore #7
/*     */     //   40: aload_0
/*     */     //   41: getfield f : I
/*     */     //   44: iload #7
/*     */     //   46: aload #6
/*     */     //   48: ifnull -> 74
/*     */     //   51: if_icmpne -> 68
/*     */     //   54: goto -> 67
/*     */     //   57: ldc2_w -548921424819193109
/*     */     //   60: lload_1
/*     */     //   61: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   66: athrow
/*     */     //   67: return
/*     */     //   68: iload #7
/*     */     //   70: aload_0
/*     */     //   71: getfield f : I
/*     */     //   74: if_icmpge -> 103
/*     */     //   77: aload_0
/*     */     //   78: aload_0
/*     */     //   79: getfield l : I
/*     */     //   82: iload #7
/*     */     //   84: invokestatic min : (II)I
/*     */     //   87: putfield l : I
/*     */     //   90: goto -> 103
/*     */     //   93: ldc2_w -548921424819193109
/*     */     //   96: lload_1
/*     */     //   97: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*     */     //   102: athrow
/*     */     //   103: aload_0
/*     */     //   104: iconst_1
/*     */     //   105: putfield j : Z
/*     */     //   108: aload_0
/*     */     //   109: iload #7
/*     */     //   111: putfield f : I
/*     */     //   114: aload_0
/*     */     //   115: lload #4
/*     */     //   117: invokespecial a : (J)V
/*     */     //   120: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #122	-> 24
/*     */     //   #16	-> 31
/*     */     //   #10	-> 40
/*     */     //   #112	-> 68
/*     */     //   #24	-> 77
/*     */     //   #69	-> 103
/*     */     //   #51	-> 108
/*     */     //   #114	-> 114
/*     */     //   #40	-> 120
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   40	54	57	aacinternal/v
/*     */     //   74	90	93	aacinternal/v
/*     */   }
/*     */   
/*     */   private static Exception a(Exception paramException) {
/*     */     return paramException;
/*     */   }
/*     */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\jk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */