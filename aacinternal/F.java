/*    */ package aacinternal;public final class f { private static final aa g; private static final aa j; private static final aa f; private static final aa d; private static final aa a; private static final aa i; private static final aa e; private static final a8 h; private static final aD b; private static final a4 c; public static double f(double[] paramArrayOfdouble, long paramLong) {
/*  2 */     paramLong = k ^ paramLong; long l = paramLong ^ 0x1A4B60BC6569L; return h.a(paramArrayOfdouble, l);
/*  3 */   } private static final long k = nc.a(-22381400443907222L, 703979095490743334L, MethodHandles.lookup().lookupClass()).a(279304950761138L); public static double b(long paramLong, double[] paramArrayOfdouble) { paramLong = k ^ paramLong; long l = paramLong ^ 0x73F328F2ABB2L; return c.a(paramArrayOfdouble, l); } public static double a(double[] paramArrayOfdouble, double paramDouble, int paramInt1, long paramLong, int paramInt2) { paramLong = k ^ paramLong; long l = paramLong ^ 0x6661A726D45CL; return h.a(l, paramArrayOfdouble, paramDouble, paramInt1, paramInt2); } public static double c(short paramShort, int paramInt, double[] paramArrayOfdouble, char paramChar, double paramDouble) { long l1 = (paramShort << 48L | paramInt << 32L >>> 16L | paramChar << 48L >>> 48L) ^ k, l2 = l1 ^ 0x311526ED083L; return (new a8(false)).a(paramArrayOfdouble, paramDouble, l2); } public static double a(double[] paramArrayOfdouble, double paramDouble, long paramLong) { paramLong = k ^ paramLong; int i = (int)((paramLong ^ 0x774601426574L) >>> 48L), j = (int)((paramLong ^ 0x774601426574L) << 16L >>> 32L), k = (int)((paramLong ^ 0x774601426574L) << 48L >>> 48L); paramLong ^ 0x774601426574L; return b.a(paramArrayOfdouble, paramDouble, (char)i, j, k); } public static double b(long paramLong, double[] paramArrayOfdouble, char paramChar, double paramDouble, int paramInt1, int paramInt2) { long l1 = (paramLong << 16L | paramChar << 48L >>> 48L) ^ k, l2 = l1 ^ 0x61A5CE2635B9L; return (new a8(false)).a(l2, paramArrayOfdouble, paramDouble, paramInt1, paramInt2); } public static double e(long paramLong, double[] paramArrayOfdouble) { paramLong = k ^ paramLong; long l = paramLong ^ 0x30B75191E0D1L; return i.a(paramArrayOfdouble, l); } public static double a(double[] paramArrayOfdouble1, double[] paramArrayOfdouble2, long paramLong) { paramLong = k ^ paramLong; int i = (int)((paramLong ^ 0x38C441E2E5C6L) >>> 48L), j = (int)((paramLong ^ 0x38C441E2E5C6L) << 16L >>> 32L), k = (int)((paramLong ^ 0x38C441E2E5C6L) << 48L >>> 48L); paramLong ^ 0x38C441E2E5C6L; return b((short)i, paramArrayOfdouble1, j, paramArrayOfdouble2, (short)k) / paramArrayOfdouble1.length; } public static double e(double[] paramArrayOfdouble, int paramInt1, int paramInt2, long paramLong) { paramLong = k ^ paramLong; long l = paramLong ^ 0x2E06930459D8L; return f.a(paramArrayOfdouble, paramInt1, l, paramInt2); } private static double[] a(double[] paramArrayOfdouble, int paramInt1, int paramInt2) { X x = new X(); Arrays.stream(paramArrayOfdouble, paramInt1, paramInt1 + paramInt2).filter(paramDouble -> { // Byte code:
/*    */           //   0: getstatic aacinternal/f.k : J
/*    */           //   3: ldc2_w 103959116926703
/*    */           //   6: lxor
/*    */           //   7: lstore_2
/*    */           //   8: ldc2_w 4881620070941387134
/*    */           //   11: lload_2
/*    */           //   12: <illegal opcode> w : (JJ)I
/*    */           //   17: istore #4
/*    */           //   19: dload_0
/*    */           //   20: invokestatic isNaN : (D)Z
/*    */           //   23: iload #4
/*    */           //   25: ifeq -> 45
/*    */           //   28: ifne -> 48
/*    */           //   31: goto -> 44
/*    */           //   34: ldc2_w 4829434253333520430
/*    */           //   37: lload_2
/*    */           //   38: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */           //   43: athrow
/*    */           //   44: iconst_1
/*    */           //   45: goto -> 49
/*    */           //   48: iconst_0
/*    */           //   49: ireturn
/*    */           // Line number table:
/*    */           //   Java source line number -> byte code offset
/*    */           //   #71	-> 19
/*    */           // Exception table:
/*    */           //   from	to	target	type
/*    */           //   19	31	34	aacinternal/v }).forEach(x::a); List list = x.a(); return list.stream().mapToDouble(Double::doubleValue).toArray(); } public static double b(long paramLong, double[] paramArrayOfdouble, int paramInt1, int paramInt2) { paramLong = k ^ paramLong; long l = paramLong ^ 0x612CE1F2EA6FL; return h.a(paramArrayOfdouble, paramInt1, l, paramInt2); } public static double h(double[] paramArrayOfdouble, long paramLong, int paramInt1, int paramInt2) { paramLong = k ^ paramLong; long l = paramLong ^ 0x76EE5955EEDFL; return g.a(paramArrayOfdouble, paramInt1, l, paramInt2); } public static double h(long paramLong, double[] paramArrayOfdouble) { paramLong = k ^ paramLong; long l = paramLong ^ 0x246503E35F7AL; return e.a(paramArrayOfdouble, l); } public static double a(double[] paramArrayOfdouble, int paramInt1, long paramLong, int paramInt2, double paramDouble) { paramLong = k ^ paramLong; long l = paramLong ^ 0x75E2C983A73AL; return b.a(paramArrayOfdouble, l, paramInt1, paramInt2, paramDouble); } public static double[] a(double[] paramArrayOfdouble, long paramLong) { // Byte code:
/*    */     //   0: getstatic aacinternal/f.k : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: lload_1
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 103126290432616
/*    */     //   11: lxor
/*    */     //   12: lstore_3
/*    */     //   13: dup2
/*    */     //   14: ldc2_w 102430782011987
/*    */     //   17: lxor
/*    */     //   18: lstore #5
/*    */     //   20: dup2
/*    */     //   21: ldc2_w 115110789442940
/*    */     //   24: lxor
/*    */     //   25: lstore #7
/*    */     //   27: dup2
/*    */     //   28: ldc2_w 18185957214455
/*    */     //   31: lxor
/*    */     //   32: lstore #9
/*    */     //   34: pop2
/*    */     //   35: ldc2_w 2403954292610861980
/*    */     //   38: lload_1
/*    */     //   39: <illegal opcode> w : (JJ)I
/*    */     //   44: new aacinternal/am
/*    */     //   47: dup
/*    */     //   48: lload #7
/*    */     //   50: invokespecial <init> : (J)V
/*    */     //   53: astore #12
/*    */     //   55: iconst_0
/*    */     //   56: istore #13
/*    */     //   58: istore #11
/*    */     //   60: iload #13
/*    */     //   62: aload_0
/*    */     //   63: arraylength
/*    */     //   64: if_icmpge -> 116
/*    */     //   67: lload_1
/*    */     //   68: lconst_0
/*    */     //   69: lcmp
/*    */     //   70: iflt -> 92
/*    */     //   73: aload #12
/*    */     //   75: iload #11
/*    */     //   77: ifeq -> 118
/*    */     //   80: aload_0
/*    */     //   81: iload #13
/*    */     //   83: daload
/*    */     //   84: lload #9
/*    */     //   86: invokevirtual a : (DJ)V
/*    */     //   89: iinc #13, 1
/*    */     //   92: iload #11
/*    */     //   94: ifne -> 60
/*    */     //   97: lload_1
/*    */     //   98: lconst_0
/*    */     //   99: lcmp
/*    */     //   100: ifle -> 67
/*    */     //   103: goto -> 116
/*    */     //   106: ldc2_w 2443177490889573068
/*    */     //   109: lload_1
/*    */     //   110: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   115: athrow
/*    */     //   116: aload #12
/*    */     //   118: lload_3
/*    */     //   119: invokevirtual b : (J)D
/*    */     //   122: dstore #13
/*    */     //   124: aload #12
/*    */     //   126: lload #5
/*    */     //   128: invokevirtual c : (J)D
/*    */     //   131: dstore #15
/*    */     //   133: aload_0
/*    */     //   134: arraylength
/*    */     //   135: newarray double
/*    */     //   137: astore #17
/*    */     //   139: iconst_0
/*    */     //   140: istore #18
/*    */     //   142: iload #18
/*    */     //   144: aload_0
/*    */     //   145: arraylength
/*    */     //   146: if_icmpge -> 202
/*    */     //   149: aload #17
/*    */     //   151: lload_1
/*    */     //   152: lconst_0
/*    */     //   153: lcmp
/*    */     //   154: ifle -> 204
/*    */     //   157: iload #11
/*    */     //   159: ifeq -> 204
/*    */     //   162: iload #18
/*    */     //   164: aload_0
/*    */     //   165: iload #18
/*    */     //   167: daload
/*    */     //   168: dload #13
/*    */     //   170: dsub
/*    */     //   171: dload #15
/*    */     //   173: ddiv
/*    */     //   174: dastore
/*    */     //   175: iinc #18, 1
/*    */     //   178: iload #11
/*    */     //   180: ifne -> 142
/*    */     //   183: lload_1
/*    */     //   184: lconst_0
/*    */     //   185: lcmp
/*    */     //   186: iflt -> 149
/*    */     //   189: goto -> 202
/*    */     //   192: ldc2_w 2443177490889573068
/*    */     //   195: lload_1
/*    */     //   196: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   201: athrow
/*    */     //   202: aload #17
/*    */     //   204: lload_1
/*    */     //   205: lconst_0
/*    */     //   206: lcmp
/*    */     //   207: ifle -> 236
/*    */     //   210: ldc2_w 2393462898724398484
/*    */     //   213: lload_1
/*    */     //   214: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   219: ifnull -> 249
/*    */     //   222: iinc #11, 1
/*    */     //   225: iload #11
/*    */     //   227: ldc2_w 2401265096428753358
/*    */     //   230: lload_1
/*    */     //   231: <illegal opcode> w : (IJJ)V
/*    */     //   236: goto -> 249
/*    */     //   239: ldc2_w 2443177490889573068
/*    */     //   242: lload_1
/*    */     //   243: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   248: athrow
/*    */     //   249: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #49	-> 44
/*    */     //   #32	-> 55
/*    */     //   #19	-> 67
/*    */     //   #52	-> 89
/*    */     //   #67	-> 116
/*    */     //   #5	-> 124
/*    */     //   #6	-> 133
/*    */     //   #54	-> 139
/*    */     //   #90	-> 149
/*    */     //   #43	-> 175
/*    */     //   #21	-> 202
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   67	97	106	aacinternal/v
/*    */     //   149	183	192	aacinternal/v
/*  3 */     //   204	236	239	aacinternal/v } public static double g(byte paramByte, int paramInt1, int paramInt2, double[] paramArrayOfdouble) { long l1 = (paramByte << 56L | paramInt1 << 32L >>> 8L | paramInt2 << 40L >>> 40L) ^ k, l2 = l1 ^ 0x768111CC5250L; return a.a(paramArrayOfdouble, l2); } static { long l1 = k ^ 0x439B05103932L, l2 = l1 ^ 0x3DE5C88BB32L; g = new aE();
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
/* 27 */     j = new as();
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
/* 61 */     f = new ay();
/*    */ 
/*    */ 
/*    */     
/*    */     d = new ax();
/*    */ 
/*    */     
/*    */     a = new aM();
/*    */ 
/*    */     
/*    */     i = new aq();
/*    */ 
/*    */     
/* 74 */     e = new aJ();
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     h = new a8();
/*    */ 
/*    */ 
/*    */     
/* 83 */     b = new aD(l2); c = new a4(); }
/*    */   public static double j(double[] paramArrayOfdouble, long paramLong) { paramLong = k ^ paramLong; long l = paramLong ^ 0x4D63F44696E0L; return g.a(paramArrayOfdouble, l); } public static double c(double[] paramArrayOfdouble, int paramInt1, int paramInt2, long paramLong) { paramLong = k ^ paramLong; long l = paramLong ^ 0x14B58E36CE59L; return d.a(paramArrayOfdouble, paramInt1, l, paramInt2); } public static double a(long paramLong, double[] paramArrayOfdouble, int paramInt1, int paramInt2) { paramLong = k ^ paramLong; long l = paramLong ^ 0x3A53E4F003CEL; return c.a(paramArrayOfdouble, paramInt1, l, paramInt2); } public static double d(double[] paramArrayOfdouble, long paramLong) { paramLong = k ^ paramLong; long l = paramLong ^ 0x7185B012158EL; return (new a8(false)).a(paramArrayOfdouble, l); } public static double j(long paramLong, double[] paramArrayOfdouble, int paramInt1, int paramInt2) { paramLong = k ^ paramLong; long l = paramLong ^ 0x5AAC9934EF89L; return i.a(paramArrayOfdouble, paramInt1, l, paramInt2); } public static double f(double[] paramArrayOfdouble, int paramInt1, long paramLong, int paramInt2) { paramLong = k ^ paramLong; long l = paramLong ^ 0x167891EABFFFL; return e.a(paramArrayOfdouble, paramInt1, l, paramInt2); } public static double a(long paramLong, int paramInt, double[] paramArrayOfdouble) { long l1 = (paramLong << 32L | paramInt << 32L >>> 32L) ^ k, l2 = l1 ^ 0xCB4A84C312DL; return f.a(paramArrayOfdouble, l2); } public static double[] b(double[] paramArrayOfdouble, byte paramByte, long paramLong, int paramInt1, int paramInt2) { // Byte code:
/*    */     //   0: iload_1
/*    */     //   1: i2l
/*    */     //   2: bipush #56
/*    */     //   4: lshl
/*    */     //   5: lload_2
/*    */     //   6: bipush #8
/*    */     //   8: lshl
/*    */     //   9: bipush #8
/*    */     //   11: lushr
/*    */     //   12: lor
/*    */     //   13: getstatic aacinternal/f.k : J
/*    */     //   16: lxor
/*    */     //   17: lstore #6
/*    */     //   19: lload #6
/*    */     //   21: dup2
/*    */     //   22: ldc2_w 103337035966023
/*    */     //   25: lxor
/*    */     //   26: lstore #8
/*    */     //   28: dup2
/*    */     //   29: ldc2_w 77610701669599
/*    */     //   32: lxor
/*    */     //   33: dup2
/*    */     //   34: bipush #48
/*    */     //   36: lushr
/*    */     //   37: l2i
/*    */     //   38: istore #10
/*    */     //   40: dup2
/*    */     //   41: bipush #16
/*    */     //   43: lshl
/*    */     //   44: bipush #32
/*    */     //   46: lushr
/*    */     //   47: l2i
/*    */     //   48: istore #11
/*    */     //   50: dup2
/*    */     //   51: bipush #48
/*    */     //   53: lshl
/*    */     //   54: bipush #48
/*    */     //   56: lushr
/*    */     //   57: l2i
/*    */     //   58: istore #12
/*    */     //   60: pop2
/*    */     //   61: pop2
/*    */     //   62: ldc2_w -3520699470842272285
/*    */     //   65: lload #6
/*    */     //   67: <illegal opcode> w : (JJ)I
/*    */     //   72: aload_0
/*    */     //   73: getstatic aacinternal/P.INPUT_ARRAY : Laacinternal/P;
/*    */     //   76: iconst_0
/*    */     //   77: anewarray java/lang/Object
/*    */     //   80: lload #8
/*    */     //   82: invokestatic a : (Ljava/lang/Object;Laacinternal/H;[Ljava/lang/Object;J)V
/*    */     //   85: istore #13
/*    */     //   87: iload #4
/*    */     //   89: iload #13
/*    */     //   91: ifeq -> 155
/*    */     //   94: ifge -> 153
/*    */     //   97: goto -> 111
/*    */     //   100: ldc2_w -3487878247744082765
/*    */     //   103: lload #6
/*    */     //   105: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   110: athrow
/*    */     //   111: new aacinternal/v
/*    */     //   114: dup
/*    */     //   115: getstatic aacinternal/P.START_POSITION : Laacinternal/P;
/*    */     //   118: iconst_1
/*    */     //   119: anewarray java/lang/Object
/*    */     //   122: dup
/*    */     //   123: iconst_0
/*    */     //   124: iload #4
/*    */     //   126: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   129: aastore
/*    */     //   130: iload #10
/*    */     //   132: i2s
/*    */     //   133: iload #11
/*    */     //   135: iload #12
/*    */     //   137: i2s
/*    */     //   138: invokespecial <init> : (Laacinternal/H;[Ljava/lang/Object;SIS)V
/*    */     //   141: athrow
/*    */     //   142: ldc2_w -3487878247744082765
/*    */     //   145: lload #6
/*    */     //   147: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   152: athrow
/*    */     //   153: iload #5
/*    */     //   155: ifge -> 200
/*    */     //   158: new aacinternal/v
/*    */     //   161: dup
/*    */     //   162: getstatic aacinternal/P.LENGTH : Laacinternal/P;
/*    */     //   165: iconst_1
/*    */     //   166: anewarray java/lang/Object
/*    */     //   169: dup
/*    */     //   170: iconst_0
/*    */     //   171: iload #5
/*    */     //   173: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   176: aastore
/*    */     //   177: iload #10
/*    */     //   179: i2s
/*    */     //   180: iload #11
/*    */     //   182: iload #12
/*    */     //   184: i2s
/*    */     //   185: invokespecial <init> : (Laacinternal/H;[Ljava/lang/Object;SIS)V
/*    */     //   188: athrow
/*    */     //   189: ldc2_w -3487878247744082765
/*    */     //   192: lload #6
/*    */     //   194: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   199: athrow
/*    */     //   200: aload_0
/*    */     //   201: iload #4
/*    */     //   203: iload #5
/*    */     //   205: invokestatic a : ([DII)[D
/*    */     //   208: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #68	-> 72
/*    */     //   #11	-> 87
/*    */     //   #39	-> 111
/*    */     //   #13	-> 153
/*    */     //   #33	-> 158
/*    */     //   #26	-> 200
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   87	97	100	aacinternal/v
/*    */     //   94	142	142	aacinternal/v
/*    */     //   155	189	189	aacinternal/v } public static double g(double[] paramArrayOfdouble, int paramInt1, int paramInt2, long paramLong) { paramLong = k ^ paramLong; long l = paramLong ^ 0x559B05A172B1L; return a.a(paramArrayOfdouble, paramInt1, l, paramInt2); } public static double i(double[] paramArrayOfdouble, int paramInt1, long paramLong, int paramInt2) { paramLong = k ^ paramLong; long l = paramLong ^ 0x222994A96E79L; return j.a(paramArrayOfdouble, paramInt1, l, paramInt2); } public static double b(short paramShort1, double[] paramArrayOfdouble1, int paramInt, double[] paramArrayOfdouble2, short paramShort2) { // Byte code:
/*    */     //   0: iload_0
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
/*    */     //   14: iload #4
/*    */     //   16: i2l
/*    */     //   17: bipush #48
/*    */     //   19: lshl
/*    */     //   20: bipush #48
/*    */     //   22: lushr
/*    */     //   23: lor
/*    */     //   24: getstatic aacinternal/f.k : J
/*    */     //   27: lxor
/*    */     //   28: lstore #5
/*    */     //   30: lload #5
/*    */     //   32: dup2
/*    */     //   33: ldc2_w 59641567693422
/*    */     //   36: lxor
/*    */     //   37: lstore #7
/*    */     //   39: dup2
/*    */     //   40: ldc2_w 76520337860995
/*    */     //   43: lxor
/*    */     //   44: dup2
/*    */     //   45: bipush #48
/*    */     //   47: lushr
/*    */     //   48: l2i
/*    */     //   49: istore #9
/*    */     //   51: dup2
/*    */     //   52: bipush #16
/*    */     //   54: lshl
/*    */     //   55: bipush #32
/*    */     //   57: lushr
/*    */     //   58: l2i
/*    */     //   59: istore #10
/*    */     //   61: dup2
/*    */     //   62: bipush #48
/*    */     //   64: lshl
/*    */     //   65: bipush #48
/*    */     //   67: lushr
/*    */     //   68: l2i
/*    */     //   69: istore #11
/*    */     //   71: pop2
/*    */     //   72: pop2
/*    */     //   73: aload_1
/*    */     //   74: arraylength
/*    */     //   75: istore #13
/*    */     //   77: ldc2_w 7087200454830147995
/*    */     //   80: lload #5
/*    */     //   82: <illegal opcode> w : (JJ)I
/*    */     //   87: lload #7
/*    */     //   89: aload_1
/*    */     //   90: aload_3
/*    */     //   91: invokestatic a : (J[D[D)V
/*    */     //   94: istore #12
/*    */     //   96: iload #13
/*    */     //   98: ifgt -> 135
/*    */     //   101: new aacinternal/v
/*    */     //   104: dup
/*    */     //   105: getstatic aacinternal/P.INSUFFICIENT_DIMENSION : Laacinternal/P;
/*    */     //   108: iconst_0
/*    */     //   109: anewarray java/lang/Object
/*    */     //   112: iload #9
/*    */     //   114: i2s
/*    */     //   115: iload #10
/*    */     //   117: iload #11
/*    */     //   119: i2s
/*    */     //   120: invokespecial <init> : (Laacinternal/H;[Ljava/lang/Object;SIS)V
/*    */     //   123: athrow
/*    */     //   124: ldc2_w 7116974084506075631
/*    */     //   127: lload #5
/*    */     //   129: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   134: athrow
/*    */     //   135: dconst_0
/*    */     //   136: dstore #14
/*    */     //   138: iconst_0
/*    */     //   139: istore #16
/*    */     //   141: iload #16
/*    */     //   143: iload #13
/*    */     //   145: if_icmpge -> 175
/*    */     //   148: dload #14
/*    */     //   150: aload_1
/*    */     //   151: iload #16
/*    */     //   153: daload
/*    */     //   154: aload_3
/*    */     //   155: iload #16
/*    */     //   157: daload
/*    */     //   158: dsub
/*    */     //   159: dadd
/*    */     //   160: iload #12
/*    */     //   162: ifne -> 182
/*    */     //   165: dstore #14
/*    */     //   167: iinc #16, 1
/*    */     //   170: iload #12
/*    */     //   172: ifeq -> 141
/*    */     //   175: iload #4
/*    */     //   177: ifle -> 170
/*    */     //   180: dload #14
/*    */     //   182: dreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #75	-> 73
/*    */     //   #46	-> 87
/*    */     //   #40	-> 96
/*    */     //   #58	-> 101
/*    */     //   #1	-> 135
/*    */     //   #91	-> 138
/*    */     //   #60	-> 148
/*    */     //   #62	-> 167
/*    */     //   #15	-> 175
/*    */     // Exception table:
/*    */     //   from	to	target	type
/* 84 */     //   96	124	124	aacinternal/v } public static double i(double[] paramArrayOfdouble, long paramLong) { paramLong = k ^ paramLong; long l = paramLong ^ 0x199A5C38EECCL; return j.a(paramArrayOfdouble, l); } public static double b(double[] paramArrayOfdouble, char paramChar1, double paramDouble, char paramChar2, int paramInt) { long l1 = (paramChar1 << 48L | paramChar2 << 48L >>> 16L | paramInt << 32L >>> 32L) ^ k, l2 = l1 ^ 0x271881DD5EC1L; return h.a(paramArrayOfdouble, paramDouble, l2); } public static double c(long paramLong, double[] paramArrayOfdouble) { paramLong = k ^ paramLong; long l = paramLong ^ 0x64C84CA7FEAEL; return d.a(paramArrayOfdouble, l); } public static double[] b(double[] paramArrayOfdouble, long paramLong) { paramLong = k ^ paramLong; long l = paramLong ^ 0x5CFFB7722506L; az.a(paramArrayOfdouble, P.INPUT_ARRAY, new Object[0], l);
/*    */     return a(paramArrayOfdouble, 0, paramArrayOfdouble.length); } public static double a(long paramLong, double[] paramArrayOfdouble1, double[] paramArrayOfdouble2, double paramDouble) { // Byte code:
/*    */     //   0: getstatic aacinternal/f.k : J
/*    */     //   3: lload_0
/*    */     //   4: lxor
/*    */     //   5: lstore_0
/*    */     //   6: lload_0
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 103695750084319
/*    */     //   11: lxor
/*    */     //   12: lstore #6
/*    */     //   14: dup2
/*    */     //   15: ldc2_w 50481596699954
/*    */     //   18: lxor
/*    */     //   19: dup2
/*    */     //   20: bipush #48
/*    */     //   22: lushr
/*    */     //   23: l2i
/*    */     //   24: istore #8
/*    */     //   26: dup2
/*    */     //   27: bipush #16
/*    */     //   29: lshl
/*    */     //   30: bipush #32
/*    */     //   32: lushr
/*    */     //   33: l2i
/*    */     //   34: istore #9
/*    */     //   36: dup2
/*    */     //   37: bipush #48
/*    */     //   39: lshl
/*    */     //   40: bipush #48
/*    */     //   42: lushr
/*    */     //   43: l2i
/*    */     //   44: istore #10
/*    */     //   46: pop2
/*    */     //   47: pop2
/*    */     //   48: dconst_0
/*    */     //   49: dstore #12
/*    */     //   51: dconst_0
/*    */     //   52: dstore #14
/*    */     //   54: ldc2_w -6995318159099120342
/*    */     //   57: lload_0
/*    */     //   58: <illegal opcode> w : (JJ)I
/*    */     //   63: dconst_0
/*    */     //   64: dstore #16
/*    */     //   66: istore #11
/*    */     //   68: aload_2
/*    */     //   69: arraylength
/*    */     //   70: istore #18
/*    */     //   72: lload #6
/*    */     //   74: aload_2
/*    */     //   75: aload_3
/*    */     //   76: invokestatic a : (J[D[D)V
/*    */     //   79: iload #18
/*    */     //   81: iload #11
/*    */     //   83: ifne -> 152
/*    */     //   86: iconst_2
/*    */     //   87: if_icmpge -> 151
/*    */     //   90: goto -> 103
/*    */     //   93: ldc2_w -7028436451590619810
/*    */     //   96: lload_0
/*    */     //   97: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   102: athrow
/*    */     //   103: new aacinternal/v
/*    */     //   106: dup
/*    */     //   107: getstatic aacinternal/P.NUMBER_TOO_SMALL : Laacinternal/P;
/*    */     //   110: iconst_2
/*    */     //   111: anewarray java/lang/Object
/*    */     //   114: dup
/*    */     //   115: iconst_0
/*    */     //   116: iload #18
/*    */     //   118: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   121: aastore
/*    */     //   122: dup
/*    */     //   123: iconst_1
/*    */     //   124: iconst_2
/*    */     //   125: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   128: aastore
/*    */     //   129: iload #8
/*    */     //   131: i2s
/*    */     //   132: iload #9
/*    */     //   134: iload #10
/*    */     //   136: i2s
/*    */     //   137: invokespecial <init> : (Laacinternal/H;[Ljava/lang/Object;SIS)V
/*    */     //   140: athrow
/*    */     //   141: ldc2_w -7028436451590619810
/*    */     //   144: lload_0
/*    */     //   145: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   150: athrow
/*    */     //   151: iconst_0
/*    */     //   152: istore #19
/*    */     //   154: iload #19
/*    */     //   156: iload #18
/*    */     //   158: if_icmpge -> 236
/*    */     //   161: aload_2
/*    */     //   162: iload #19
/*    */     //   164: daload
/*    */     //   165: aload_3
/*    */     //   166: iload #19
/*    */     //   168: daload
/*    */     //   169: dsub
/*    */     //   170: dstore #16
/*    */     //   172: dload #12
/*    */     //   174: dload #16
/*    */     //   176: dload #4
/*    */     //   178: dsub
/*    */     //   179: dload #16
/*    */     //   181: dload #4
/*    */     //   183: dsub
/*    */     //   184: dmul
/*    */     //   185: dadd
/*    */     //   186: dstore #12
/*    */     //   188: lload_0
/*    */     //   189: lconst_0
/*    */     //   190: lcmp
/*    */     //   191: ifle -> 212
/*    */     //   194: dload #14
/*    */     //   196: dload #16
/*    */     //   198: dload #4
/*    */     //   200: dsub
/*    */     //   201: dadd
/*    */     //   202: iload #11
/*    */     //   204: ifne -> 254
/*    */     //   207: dstore #14
/*    */     //   209: iinc #19, 1
/*    */     //   212: iload #11
/*    */     //   214: ifeq -> 154
/*    */     //   217: iconst_1
/*    */     //   218: lload_0
/*    */     //   219: lconst_0
/*    */     //   220: lcmp
/*    */     //   221: iflt -> 214
/*    */     //   224: anewarray me/konsolas/aac/aN
/*    */     //   227: ldc2_w -7018702921831397555
/*    */     //   230: lload_0
/*    */     //   231: <illegal opcode> w : ([Lme/konsolas/aac/aN;JJ)V
/*    */     //   236: dload #12
/*    */     //   238: dload #14
/*    */     //   240: dload #14
/*    */     //   242: dmul
/*    */     //   243: iload #18
/*    */     //   245: i2d
/*    */     //   246: ddiv
/*    */     //   247: dsub
/*    */     //   248: iload #18
/*    */     //   250: iconst_1
/*    */     //   251: isub
/*    */     //   252: i2d
/*    */     //   253: ddiv
/*    */     //   254: dreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #86	-> 48
/*    */     //   #23	-> 51
/*    */     //   #47	-> 63
/*    */     //   #69	-> 68
/*    */     //   #18	-> 72
/*    */     //   #7	-> 79
/*    */     //   #70	-> 103
/*    */     //   #20	-> 118
/*    */     //   #77	-> 151
/*    */     //   #89	-> 161
/*    */     //   #17	-> 172
/*    */     //   #85	-> 188
/*    */     //   #88	-> 209
/*    */     //   #24	-> 236
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   72	90	93	aacinternal/v
/*    */     //   86	141	141	aacinternal/v }
/*    */   public static double d(int paramInt1, double[] paramArrayOfdouble, int paramInt2, int paramInt3, int paramInt4) {
/* 87 */     long l1 = (paramInt1 << 32L | paramInt4 << 32L >>> 32L) ^ k, l2 = l1 ^ 0xF6C3A29EDA6L; return (new a8(false)).a(paramArrayOfdouble, paramInt2, l2, paramInt3);
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */