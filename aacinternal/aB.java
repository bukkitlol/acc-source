/*    */ package aacinternal;public abstract class ab implements aa { private double[] a;
/*    */   
/*    */   public double a(long paramLong) {
/*  4 */     paramLong = j ^ paramLong; long l = paramLong ^ 0xC501E184915L; return a(this.a, l);
/*    */   } private static final long j = nc.a(-149983097161126522L, 143984449517845134L, MethodHandles.lookup().lookupClass()).a(113874271802505L);
/*    */   protected ab() {}
/*    */   public double[] b(int paramInt1, int paramInt2) {
/*    */     // Byte code:
/*    */     //   0: iload_1
/*    */     //   1: i2l
/*    */     //   2: bipush #32
/*    */     //   4: lshl
/*    */     //   5: iload_2
/*    */     //   6: i2l
/*    */     //   7: bipush #32
/*    */     //   9: lshl
/*    */     //   10: bipush #32
/*    */     //   12: lushr
/*    */     //   13: lor
/*    */     //   14: getstatic aacinternal/ab.j : J
/*    */     //   17: lxor
/*    */     //   18: lstore_3
/*    */     //   19: ldc2_w -6563339075021118382
/*    */     //   22: lload_3
/*    */     //   23: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   28: astore #5
/*    */     //   30: aload_0
/*    */     //   31: getfield a : [D
/*    */     //   34: aload #5
/*    */     //   36: ifnull -> 76
/*    */     //   39: ifnonnull -> 69
/*    */     //   42: goto -> 55
/*    */     //   45: ldc2_w -6531355794312433612
/*    */     //   48: lload_3
/*    */     //   49: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   54: athrow
/*    */     //   55: aconst_null
/*    */     //   56: goto -> 79
/*    */     //   59: ldc2_w -6531355794312433612
/*    */     //   62: lload_3
/*    */     //   63: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   68: athrow
/*    */     //   69: aload_0
/*    */     //   70: getfield a : [D
/*    */     //   73: invokevirtual clone : ()Ljava/lang/Object;
/*    */     //   76: checkcast [D
/*    */     //   79: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #10	-> 30
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   30	42	45	aacinternal/v
/*    */     //   39	59	59	aacinternal/v
/*    */   }
/*    */   protected ab(ab paramab, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic aacinternal/ab.j : J
/*    */     //   3: lload_2
/*    */     //   4: lxor
/*    */     //   5: lstore_2
/*    */     //   6: lload_2
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 74694298650200
/*    */     //   11: lxor
/*    */     //   12: lstore #4
/*    */     //   14: pop2
/*    */     //   15: ldc2_w -2505303521461101181
/*    */     //   18: lload_2
/*    */     //   19: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   24: aload_0
/*    */     //   25: invokespecial <init> : ()V
/*    */     //   28: astore #6
/*    */     //   30: lload #4
/*    */     //   32: aload_1
/*    */     //   33: invokestatic a : (JLjava/lang/Object;)V
/*    */     //   36: aload_0
/*    */     //   37: aload_1
/*    */     //   38: getfield a : [D
/*    */     //   41: aload #6
/*    */     //   43: ifnull -> 85
/*    */     //   46: ifnull -> 88
/*    */     //   49: goto -> 62
/*    */     //   52: ldc2_w -2554951832552404507
/*    */     //   55: lload_2
/*    */     //   56: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   61: athrow
/*    */     //   62: aload_1
/*    */     //   63: getfield a : [D
/*    */     //   66: invokevirtual clone : ()Ljava/lang/Object;
/*    */     //   69: checkcast [D
/*    */     //   72: goto -> 85
/*    */     //   75: ldc2_w -2554951832552404507
/*    */     //   78: lload_2
/*    */     //   79: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   84: athrow
/*    */     //   85: goto -> 89
/*    */     //   88: aconst_null
/*    */     //   89: putfield a : [D
/*    */     //   92: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #12	-> 24
/*    */     //   #18	-> 30
/*    */     //   #21	-> 36
/*    */     //   #8	-> 92
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   30	49	52	aacinternal/v
/*    */     //   46	72	75	aacinternal/v
/*    */   }
/*    */   public void a(int paramInt1, char paramChar, int paramInt2, double[] paramArrayOfdouble) {
/*    */     // Byte code:
/*    */     //   0: iload_1
/*    */     //   1: i2l
/*    */     //   2: bipush #32
/*    */     //   4: lshl
/*    */     //   5: iload_2
/*    */     //   6: i2l
/*    */     //   7: bipush #48
/*    */     //   9: lshl
/*    */     //   10: bipush #32
/*    */     //   12: lushr
/*    */     //   13: lor
/*    */     //   14: iload_3
/*    */     //   15: i2l
/*    */     //   16: bipush #48
/*    */     //   18: lshl
/*    */     //   19: bipush #48
/*    */     //   21: lushr
/*    */     //   22: lor
/*    */     //   23: lstore #5
/*    */     //   25: ldc2_w -3559117410998841821
/*    */     //   28: lload #5
/*    */     //   30: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   35: astore #7
/*    */     //   37: aload_0
/*    */     //   38: aload #4
/*    */     //   40: aload #7
/*    */     //   42: ifnull -> 82
/*    */     //   45: ifnonnull -> 77
/*    */     //   48: goto -> 62
/*    */     //   51: ldc2_w -3518759423684371899
/*    */     //   54: lload #5
/*    */     //   56: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   61: athrow
/*    */     //   62: aconst_null
/*    */     //   63: goto -> 85
/*    */     //   66: ldc2_w -3518759423684371899
/*    */     //   69: lload #5
/*    */     //   71: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   76: athrow
/*    */     //   77: aload #4
/*    */     //   79: invokevirtual clone : ()Ljava/lang/Object;
/*    */     //   82: checkcast [D
/*    */     //   85: putfield a : [D
/*    */     //   88: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #15	-> 37
/*    */     //   #16	-> 88
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   37	48	51	aacinternal/v
/*    */     //   45	66	66	aacinternal/v
/*    */   }
/*    */   public void a(double[] paramArrayOfdouble, int paramInt1, long paramLong, int paramInt2) {
/*    */     // Byte code:
/*    */     //   0: lload_3
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 102344380286119
/*    */     //   5: lxor
/*    */     //   6: lstore #6
/*    */     //   8: dup2
/*    */     //   9: ldc2_w 77510359475775
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
/*    */     //   41: pop2
/*    */     //   42: ldc2_w 7903621780792159511
/*    */     //   45: lload_3
/*    */     //   46: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   51: aload_1
/*    */     //   52: getstatic aacinternal/P.INPUT_ARRAY : Laacinternal/P;
/*    */     //   55: iconst_0
/*    */     //   56: anewarray java/lang/Object
/*    */     //   59: lload #6
/*    */     //   61: invokestatic a : (Ljava/lang/Object;Laacinternal/H;[Ljava/lang/Object;J)V
/*    */     //   64: astore #11
/*    */     //   66: iload_2
/*    */     //   67: aload #11
/*    */     //   69: ifnull -> 130
/*    */     //   72: ifge -> 128
/*    */     //   75: goto -> 88
/*    */     //   78: ldc2_w 7790925276167649649
/*    */     //   81: lload_3
/*    */     //   82: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   87: athrow
/*    */     //   88: new aacinternal/v
/*    */     //   91: dup
/*    */     //   92: getstatic aacinternal/P.START_POSITION : Laacinternal/P;
/*    */     //   95: iconst_1
/*    */     //   96: anewarray java/lang/Object
/*    */     //   99: dup
/*    */     //   100: iconst_0
/*    */     //   101: iload_2
/*    */     //   102: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   105: aastore
/*    */     //   106: iload #8
/*    */     //   108: i2s
/*    */     //   109: iload #9
/*    */     //   111: iload #10
/*    */     //   113: i2s
/*    */     //   114: invokespecial <init> : (Laacinternal/H;[Ljava/lang/Object;SIS)V
/*    */     //   117: athrow
/*    */     //   118: ldc2_w 7790925276167649649
/*    */     //   121: lload_3
/*    */     //   122: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   127: athrow
/*    */     //   128: iload #5
/*    */     //   130: lload_3
/*    */     //   131: lconst_0
/*    */     //   132: lcmp
/*    */     //   133: iflt -> 202
/*    */     //   136: aload #11
/*    */     //   138: ifnull -> 202
/*    */     //   141: ifge -> 198
/*    */     //   144: goto -> 157
/*    */     //   147: ldc2_w 7790925276167649649
/*    */     //   150: lload_3
/*    */     //   151: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   156: athrow
/*    */     //   157: new aacinternal/v
/*    */     //   160: dup
/*    */     //   161: getstatic aacinternal/P.LENGTH : Laacinternal/P;
/*    */     //   164: iconst_1
/*    */     //   165: anewarray java/lang/Object
/*    */     //   168: dup
/*    */     //   169: iconst_0
/*    */     //   170: iload #5
/*    */     //   172: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   175: aastore
/*    */     //   176: iload #8
/*    */     //   178: i2s
/*    */     //   179: iload #9
/*    */     //   181: iload #10
/*    */     //   183: i2s
/*    */     //   184: invokespecial <init> : (Laacinternal/H;[Ljava/lang/Object;SIS)V
/*    */     //   187: athrow
/*    */     //   188: ldc2_w 7790925276167649649
/*    */     //   191: lload_3
/*    */     //   192: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   197: athrow
/*    */     //   198: iload_2
/*    */     //   199: iload #5
/*    */     //   201: iadd
/*    */     //   202: aload_1
/*    */     //   203: arraylength
/*    */     //   204: if_icmple -> 265
/*    */     //   207: new aacinternal/v
/*    */     //   210: dup
/*    */     //   211: getstatic aacinternal/P.SUBARRAY_ENDS_AFTER_ARRAY_END : Laacinternal/P;
/*    */     //   214: iconst_3
/*    */     //   215: anewarray java/lang/Object
/*    */     //   218: dup
/*    */     //   219: iconst_0
/*    */     //   220: iload_2
/*    */     //   221: iload #5
/*    */     //   223: iadd
/*    */     //   224: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   227: aastore
/*    */     //   228: dup
/*    */     //   229: iconst_1
/*    */     //   230: aload_1
/*    */     //   231: arraylength
/*    */     //   232: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   235: aastore
/*    */     //   236: dup
/*    */     //   237: iconst_2
/*    */     //   238: iconst_1
/*    */     //   239: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*    */     //   242: aastore
/*    */     //   243: iload #8
/*    */     //   245: i2s
/*    */     //   246: iload #9
/*    */     //   248: iload #10
/*    */     //   250: i2s
/*    */     //   251: invokespecial <init> : (Laacinternal/H;[Ljava/lang/Object;SIS)V
/*    */     //   254: athrow
/*    */     //   255: ldc2_w 7790925276167649649
/*    */     //   258: lload_3
/*    */     //   259: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   264: athrow
/*    */     //   265: aload_0
/*    */     //   266: iload #5
/*    */     //   268: newarray double
/*    */     //   270: putfield a : [D
/*    */     //   273: aload_1
/*    */     //   274: iload_2
/*    */     //   275: aload_0
/*    */     //   276: getfield a : [D
/*    */     //   279: iconst_0
/*    */     //   280: iload #5
/*    */     //   282: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
/*    */     //   285: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #17	-> 51
/*    */     //   #19	-> 66
/*    */     //   #6	-> 88
/*    */     //   #5	-> 128
/*    */     //   #3	-> 157
/*    */     //   #22	-> 198
/*    */     //   #14	-> 207
/*    */     //   #9	-> 224
/*    */     //   #1	-> 265
/*    */     //   #13	-> 273
/*    */     //   #11	-> 285
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   66	75	78	aacinternal/v
/*    */     //   72	118	118	aacinternal/v
/*    */     //   130	144	147	aacinternal/v
/*    */     //   141	188	188	aacinternal/v
/*    */     //   202	255	255	aacinternal/v
/*    */   }
/*    */   protected double[] a() {
/* 20 */     return this.a;
/*    */   }
/*    */   
/*    */   public abstract double a(double[] paramArrayOfdouble, int paramInt1, long paramLong, int paramInt2);
/*    */   
/*    */   public abstract aa a(long paramLong);
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\ab.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */