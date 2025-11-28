/*    */ package aacinternal;public final class az { public static final double c = 6.283185307179586D; public static final double d = 9.869604401089358D; private static boolean b; private static final long a;
/*    */   
/*    */   public static int a(int paramInt1, long paramLong, int paramInt2) {
/*    */     // Byte code:
/*    */     //   0: getstatic aacinternal/az.a : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: lload_1
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 3523548262370
/*    */     //   11: lxor
/*    */     //   12: lstore #4
/*    */     //   14: pop2
/*    */     //   15: ldc2_w 7556139232100950336
/*    */     //   18: lload_1
/*    */     //   19: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*    */     //   24: astore #6
/*    */     //   26: iload_0
/*    */     //   27: aload #6
/*    */     //   29: ifnonnull -> 84
/*    */     //   32: iflt -> 83
/*    */     //   35: goto -> 48
/*    */     //   38: ldc2_w 7597353501417422939
/*    */     //   41: lload_1
/*    */     //   42: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   47: athrow
/*    */     //   48: iload_3
/*    */     //   49: aload #6
/*    */     //   51: ifnonnull -> 147
/*    */     //   54: goto -> 67
/*    */     //   57: ldc2_w 7597353501417422939
/*    */     //   60: lload_1
/*    */     //   61: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   66: athrow
/*    */     //   67: ifge -> 146
/*    */     //   70: goto -> 83
/*    */     //   73: ldc2_w 7597353501417422939
/*    */     //   76: lload_1
/*    */     //   77: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   82: athrow
/*    */     //   83: iload_0
/*    */     //   84: aload #6
/*    */     //   86: ifnonnull -> 149
/*    */     //   89: ifge -> 148
/*    */     //   92: goto -> 105
/*    */     //   95: ldc2_w 7597353501417422939
/*    */     //   98: lload_1
/*    */     //   99: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   104: athrow
/*    */     //   105: iload_3
/*    */     //   106: aload #6
/*    */     //   108: lload_1
/*    */     //   109: lconst_0
/*    */     //   110: lcmp
/*    */     //   111: ifle -> 151
/*    */     //   114: ifnonnull -> 149
/*    */     //   117: goto -> 130
/*    */     //   120: ldc2_w 7597353501417422939
/*    */     //   123: lload_1
/*    */     //   124: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   129: athrow
/*    */     //   130: ifge -> 148
/*    */     //   133: goto -> 146
/*    */     //   136: ldc2_w 7597353501417422939
/*    */     //   139: lload_1
/*    */     //   140: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   145: athrow
/*    */     //   146: iload_0
/*    */     //   147: ireturn
/*    */     //   148: iload_3
/*    */     //   149: aload #6
/*    */     //   151: ifnonnull -> 242
/*    */     //   154: iflt -> 240
/*    */     //   157: goto -> 170
/*    */     //   160: ldc2_w 7597353501417422939
/*    */     //   163: lload_1
/*    */     //   164: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   169: athrow
/*    */     //   170: iload_0
/*    */     //   171: aload #6
/*    */     //   173: ifnonnull -> 242
/*    */     //   176: goto -> 189
/*    */     //   179: ldc2_w 7597353501417422939
/*    */     //   182: lload_1
/*    */     //   183: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   188: athrow
/*    */     //   189: lload_1
/*    */     //   190: lconst_0
/*    */     //   191: lcmp
/*    */     //   192: iflt -> 241
/*    */     //   195: ldc -2147483648
/*    */     //   197: if_icmpne -> 240
/*    */     //   200: goto -> 213
/*    */     //   203: ldc2_w 7597353501417422939
/*    */     //   206: lload_1
/*    */     //   207: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   212: athrow
/*    */     //   213: new aacinternal/u
/*    */     //   216: dup
/*    */     //   217: getstatic aacinternal/P.OVERFLOW : Laacinternal/P;
/*    */     //   220: iconst_0
/*    */     //   221: anewarray java/lang/Object
/*    */     //   224: lload #4
/*    */     //   226: invokespecial <init> : (Laacinternal/H;[Ljava/lang/Object;J)V
/*    */     //   229: athrow
/*    */     //   230: ldc2_w 7597353501417422939
/*    */     //   233: lload_1
/*    */     //   234: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   239: athrow
/*    */     //   240: iload_0
/*    */     //   241: ineg
/*    */     //   242: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #2	-> 26
/*    */     //   #56	-> 146
/*    */     //   #31	-> 148
/*    */     //   #11	-> 213
/*    */     //   #8	-> 240
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   26	35	38	aacinternal/u
/*    */     //   32	54	57	aacinternal/u
/*    */     //   48	70	73	aacinternal/u
/*    */     //   84	92	95	aacinternal/u
/*    */     //   89	117	120	aacinternal/u
/*    */     //   105	133	136	aacinternal/u
/*    */     //   149	157	160	aacinternal/u
/*    */     //   154	176	179	aacinternal/u
/*    */     //   170	200	203	aacinternal/u
/*    */     //   189	230	230	aacinternal/u
/*    */   }
/*    */   
/*    */   public static void a(long paramLong1, long paramLong2, long paramLong3, long paramLong4) {
/*    */     // Byte code:
/*    */     //   0: getstatic aacinternal/az.a : J
/*    */     //   3: lload #6
/*    */     //   5: lxor
/*    */     //   6: lstore #6
/*    */     //   8: lload #6
/*    */     //   10: dup2
/*    */     //   11: ldc2_w 103197435202031
/*    */     //   14: lxor
/*    */     //   15: dup2
/*    */     //   16: bipush #48
/*    */     //   18: lushr
/*    */     //   19: l2i
/*    */     //   20: istore #8
/*    */     //   22: dup2
/*    */     //   23: bipush #16
/*    */     //   25: lshl
/*    */     //   26: bipush #32
/*    */     //   28: lushr
/*    */     //   29: l2i
/*    */     //   30: istore #9
/*    */     //   32: dup2
/*    */     //   33: bipush #48
/*    */     //   35: lshl
/*    */     //   36: bipush #48
/*    */     //   38: lushr
/*    */     //   39: l2i
/*    */     //   40: istore #10
/*    */     //   42: pop2
/*    */     //   43: pop2
/*    */     //   44: ldc2_w -8959734505877026252
/*    */     //   47: lload #6
/*    */     //   49: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*    */     //   54: astore #11
/*    */     //   56: lload_0
/*    */     //   57: lload_2
/*    */     //   58: lcmp
/*    */     //   59: aload #11
/*    */     //   61: ifnonnull -> 99
/*    */     //   64: iflt -> 102
/*    */     //   67: goto -> 81
/*    */     //   70: ldc2_w -9071563938630948049
/*    */     //   73: lload #6
/*    */     //   75: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   80: athrow
/*    */     //   81: lload_0
/*    */     //   82: lload #4
/*    */     //   84: lcmp
/*    */     //   85: goto -> 99
/*    */     //   88: ldc2_w -9071563938630948049
/*    */     //   91: lload #6
/*    */     //   93: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   98: athrow
/*    */     //   99: ifle -> 158
/*    */     //   102: new aacinternal/v
/*    */     //   105: dup
/*    */     //   106: getstatic aacinternal/P.OUT_OF_RANGE_SIMPLE : Laacinternal/P;
/*    */     //   109: iconst_3
/*    */     //   110: anewarray java/lang/Object
/*    */     //   113: dup
/*    */     //   114: iconst_0
/*    */     //   115: lload_0
/*    */     //   116: invokestatic valueOf : (J)Ljava/lang/Long;
/*    */     //   119: aastore
/*    */     //   120: dup
/*    */     //   121: iconst_1
/*    */     //   122: lload_2
/*    */     //   123: invokestatic valueOf : (J)Ljava/lang/Long;
/*    */     //   126: aastore
/*    */     //   127: dup
/*    */     //   128: iconst_2
/*    */     //   129: lload #4
/*    */     //   131: invokestatic valueOf : (J)Ljava/lang/Long;
/*    */     //   134: aastore
/*    */     //   135: iload #8
/*    */     //   137: i2s
/*    */     //   138: iload #9
/*    */     //   140: iload #10
/*    */     //   142: i2s
/*    */     //   143: invokespecial <init> : (Laacinternal/H;[Ljava/lang/Object;SIS)V
/*    */     //   146: athrow
/*    */     //   147: ldc2_w -9071563938630948049
/*    */     //   150: lload #6
/*    */     //   152: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   157: athrow
/*    */     //   158: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #12	-> 56
/*    */     //   #55	-> 102
/*    */     //   #14	-> 116
/*    */     //   #34	-> 158
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   56	67	70	aacinternal/u
/*    */     //   64	85	88	aacinternal/u
/*    */     //   99	147	147	aacinternal/u
/*    */   }
/*    */   
/*    */   public static void a(double paramDouble1, double paramDouble2, double paramDouble3, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic aacinternal/az.a : J
/*    */     //   3: lload #6
/*    */     //   5: lxor
/*    */     //   6: lstore #6
/*    */     //   8: lload #6
/*    */     //   10: dup2
/*    */     //   11: ldc2_w 48086121931176
/*    */     //   14: lxor
/*    */     //   15: dup2
/*    */     //   16: bipush #48
/*    */     //   18: lushr
/*    */     //   19: l2i
/*    */     //   20: istore #8
/*    */     //   22: dup2
/*    */     //   23: bipush #16
/*    */     //   25: lshl
/*    */     //   26: bipush #32
/*    */     //   28: lushr
/*    */     //   29: l2i
/*    */     //   30: istore #9
/*    */     //   32: dup2
/*    */     //   33: bipush #48
/*    */     //   35: lshl
/*    */     //   36: bipush #48
/*    */     //   38: lushr
/*    */     //   39: l2i
/*    */     //   40: istore #10
/*    */     //   42: pop2
/*    */     //   43: pop2
/*    */     //   44: ldc2_w 7777670997286789747
/*    */     //   47: lload #6
/*    */     //   49: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*    */     //   54: astore #11
/*    */     //   56: dload_0
/*    */     //   57: dload_2
/*    */     //   58: dcmpg
/*    */     //   59: aload #11
/*    */     //   61: ifnonnull -> 99
/*    */     //   64: iflt -> 102
/*    */     //   67: goto -> 81
/*    */     //   70: ldc2_w 7664038913952465768
/*    */     //   73: lload #6
/*    */     //   75: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   80: athrow
/*    */     //   81: dload_0
/*    */     //   82: dload #4
/*    */     //   84: dcmpl
/*    */     //   85: goto -> 99
/*    */     //   88: ldc2_w 7664038913952465768
/*    */     //   91: lload #6
/*    */     //   93: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   98: athrow
/*    */     //   99: ifle -> 158
/*    */     //   102: new aacinternal/v
/*    */     //   105: dup
/*    */     //   106: getstatic aacinternal/P.OUT_OF_RANGE_SIMPLE : Laacinternal/P;
/*    */     //   109: iconst_3
/*    */     //   110: anewarray java/lang/Object
/*    */     //   113: dup
/*    */     //   114: iconst_0
/*    */     //   115: dload_0
/*    */     //   116: invokestatic valueOf : (D)Ljava/lang/Double;
/*    */     //   119: aastore
/*    */     //   120: dup
/*    */     //   121: iconst_1
/*    */     //   122: dload_2
/*    */     //   123: invokestatic valueOf : (D)Ljava/lang/Double;
/*    */     //   126: aastore
/*    */     //   127: dup
/*    */     //   128: iconst_2
/*    */     //   129: dload #4
/*    */     //   131: invokestatic valueOf : (D)Ljava/lang/Double;
/*    */     //   134: aastore
/*    */     //   135: iload #8
/*    */     //   137: i2s
/*    */     //   138: iload #9
/*    */     //   140: iload #10
/*    */     //   142: i2s
/*    */     //   143: invokespecial <init> : (Laacinternal/H;[Ljava/lang/Object;SIS)V
/*    */     //   146: athrow
/*    */     //   147: ldc2_w 7664038913952465768
/*    */     //   150: lload #6
/*    */     //   152: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   157: athrow
/*    */     //   158: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #16	-> 56
/*    */     //   #22	-> 102
/*    */     //   #5	-> 116
/*    */     //   #6	-> 158
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   56	67	70	aacinternal/u
/*    */     //   64	85	88	aacinternal/u
/*    */     //   99	147	147	aacinternal/u
/*    */   }
/*    */   
/*    */   public static C b(C paramC1, long paramLong, C paramC2) {
/*    */     // Byte code:
/*    */     //   0: getstatic aacinternal/az.a : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: ldc2_w 5956542438688627509
/*    */     //   9: lload_1
/*    */     //   10: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*    */     //   15: astore #4
/*    */     //   17: aload_0
/*    */     //   18: aload_3
/*    */     //   19: invokeinterface g : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   24: checkcast aacinternal/C
/*    */     //   27: aload #4
/*    */     //   29: ifnonnull -> 69
/*    */     //   32: invokeinterface a : ()D
/*    */     //   37: dconst_0
/*    */     //   38: dcmpl
/*    */     //   39: iflt -> 72
/*    */     //   42: goto -> 55
/*    */     //   45: ldc2_w 5988124565213575726
/*    */     //   48: lload_1
/*    */     //   49: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   54: athrow
/*    */     //   55: aload_0
/*    */     //   56: goto -> 69
/*    */     //   59: ldc2_w 5988124565213575726
/*    */     //   62: lload_1
/*    */     //   63: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   68: athrow
/*    */     //   69: goto -> 73
/*    */     //   72: aload_3
/*    */     //   73: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #17	-> 17
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   17	42	45	aacinternal/u
/*    */     //   32	56	59	aacinternal/u
/*    */   }
/*    */   
/* 19 */   public static double a(double paramDouble1, long paramLong, double paramDouble2) { paramLong = a ^ paramLong; long l = paramLong ^ 0x35C52D32AAF4L; return paramDouble1 - 6.283185307179586D * aL.t(l, (paramDouble1 + Math.PI - paramDouble2) / 6.283185307179586D); }
/*    */ 
/*    */   
/*    */   public static void a(int paramInt, short paramShort1, double paramDouble, short paramShort2) {
/*    */     // Byte code:
/*    */     //   0: iload_0
/*    */     //   1: i2l
/*    */     //   2: bipush #32
/*    */     //   4: lshl
/*    */     //   5: iload_1
/*    */     //   6: i2l
/*    */     //   7: bipush #48
/*    */     //   9: lshl
/*    */     //   10: bipush #32
/*    */     //   12: lushr
/*    */     //   13: lor
/*    */     //   14: iload #4
/*    */     //   16: i2l
/*    */     //   17: bipush #48
/*    */     //   19: lshl
/*    */     //   20: bipush #48
/*    */     //   22: lushr
/*    */     //   23: lor
/*    */     //   24: getstatic aacinternal/az.a : J
/*    */     //   27: lxor
/*    */     //   28: lstore #5
/*    */     //   30: lload #5
/*    */     //   32: dup2
/*    */     //   33: ldc2_w 110208516578813
/*    */     //   36: lxor
/*    */     //   37: dup2
/*    */     //   38: bipush #48
/*    */     //   40: lushr
/*    */     //   41: l2i
/*    */     //   42: istore #7
/*    */     //   44: dup2
/*    */     //   45: bipush #16
/*    */     //   47: lshl
/*    */     //   48: bipush #32
/*    */     //   50: lushr
/*    */     //   51: l2i
/*    */     //   52: istore #8
/*    */     //   54: dup2
/*    */     //   55: bipush #48
/*    */     //   57: lshl
/*    */     //   58: bipush #48
/*    */     //   60: lushr
/*    */     //   61: l2i
/*    */     //   62: istore #9
/*    */     //   64: pop2
/*    */     //   65: pop2
/*    */     //   66: ldc2_w 6321533322752106022
/*    */     //   69: lload #5
/*    */     //   71: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*    */     //   76: astore #10
/*    */     //   78: dload_2
/*    */     //   79: invokestatic isInfinite : (D)Z
/*    */     //   82: aload #10
/*    */     //   84: ifnonnull -> 122
/*    */     //   87: ifne -> 125
/*    */     //   90: goto -> 104
/*    */     //   93: ldc2_w 6199606523789082429
/*    */     //   96: lload #5
/*    */     //   98: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   103: athrow
/*    */     //   104: dload_2
/*    */     //   105: invokestatic isNaN : (D)Z
/*    */     //   108: goto -> 122
/*    */     //   111: ldc2_w 6199606523789082429
/*    */     //   114: lload #5
/*    */     //   116: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   121: athrow
/*    */     //   122: ifeq -> 166
/*    */     //   125: new aacinternal/v
/*    */     //   128: dup
/*    */     //   129: getstatic aacinternal/P.NOT_FINITE_NUMBER : Laacinternal/P;
/*    */     //   132: iconst_1
/*    */     //   133: anewarray java/lang/Object
/*    */     //   136: dup
/*    */     //   137: iconst_0
/*    */     //   138: dload_2
/*    */     //   139: invokestatic valueOf : (D)Ljava/lang/Double;
/*    */     //   142: aastore
/*    */     //   143: iload #7
/*    */     //   145: i2s
/*    */     //   146: iload #8
/*    */     //   148: iload #9
/*    */     //   150: i2s
/*    */     //   151: invokespecial <init> : (Laacinternal/H;[Ljava/lang/Object;SIS)V
/*    */     //   154: athrow
/*    */     //   155: ldc2_w 6199606523789082429
/*    */     //   158: lload #5
/*    */     //   160: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   165: athrow
/*    */     //   166: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #20	-> 78
/*    */     //   #41	-> 125
/*    */     //   #40	-> 166
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   78	90	93	aacinternal/v
/*    */     //   87	108	111	aacinternal/v
/*    */     //   122	155	155	aacinternal/v
/*    */   }
/* 25 */   public static int a(double paramDouble) { return Double.hashCode(paramDouble); }
/*    */   public static void a(double[] paramArrayOfdouble, long paramLong) { // Byte code:
/*    */     //   0: getstatic aacinternal/az.a : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: lload_1
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 5545387389574
/*    */     //   11: lxor
/*    */     //   12: dup2
/*    */     //   13: bipush #48
/*    */     //   15: lushr
/*    */     //   16: l2i
/*    */     //   17: istore_3
/*    */     //   18: dup2
/*    */     //   19: bipush #16
/*    */     //   21: lshl
/*    */     //   22: bipush #32
/*    */     //   24: lushr
/*    */     //   25: l2i
/*    */     //   26: istore #4
/*    */     //   28: dup2
/*    */     //   29: bipush #48
/*    */     //   31: lshl
/*    */     //   32: bipush #48
/*    */     //   34: lushr
/*    */     //   35: l2i
/*    */     //   36: istore #5
/*    */     //   38: pop2
/*    */     //   39: pop2
/*    */     //   40: ldc2_w 8701508774127219037
/*    */     //   43: lload_1
/*    */     //   44: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*    */     //   49: iconst_0
/*    */     //   50: istore #7
/*    */     //   52: astore #6
/*    */     //   54: iload #7
/*    */     //   56: aload_0
/*    */     //   57: arraylength
/*    */     //   58: if_icmpge -> 168
/*    */     //   61: aload_0
/*    */     //   62: iload #7
/*    */     //   64: daload
/*    */     //   65: dstore #8
/*    */     //   67: dload #8
/*    */     //   69: invokestatic isInfinite : (D)Z
/*    */     //   72: lload_1
/*    */     //   73: lconst_0
/*    */     //   74: lcmp
/*    */     //   75: ifle -> 117
/*    */     //   78: aload #6
/*    */     //   80: ifnonnull -> 117
/*    */     //   83: ifne -> 120
/*    */     //   86: goto -> 99
/*    */     //   89: ldc2_w 8751070742382596166
/*    */     //   92: lload_1
/*    */     //   93: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   98: athrow
/*    */     //   99: dload #8
/*    */     //   101: invokestatic isNaN : (D)Z
/*    */     //   104: goto -> 117
/*    */     //   107: ldc2_w 8751070742382596166
/*    */     //   110: lload_1
/*    */     //   111: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   116: athrow
/*    */     //   117: ifeq -> 160
/*    */     //   120: new aacinternal/v
/*    */     //   123: dup
/*    */     //   124: getstatic aacinternal/P.NOT_FINITE_NUMBER : Laacinternal/P;
/*    */     //   127: iconst_1
/*    */     //   128: anewarray java/lang/Object
/*    */     //   131: dup
/*    */     //   132: iconst_0
/*    */     //   133: dload #8
/*    */     //   135: invokestatic valueOf : (D)Ljava/lang/Double;
/*    */     //   138: aastore
/*    */     //   139: iload_3
/*    */     //   140: i2s
/*    */     //   141: iload #4
/*    */     //   143: iload #5
/*    */     //   145: i2s
/*    */     //   146: invokespecial <init> : (Laacinternal/H;[Ljava/lang/Object;SIS)V
/*    */     //   149: athrow
/*    */     //   150: ldc2_w 8751070742382596166
/*    */     //   153: lload_1
/*    */     //   154: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   159: athrow
/*    */     //   160: iinc #7, 1
/*    */     //   163: aload #6
/*    */     //   165: ifnull -> 54
/*    */     //   168: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #21	-> 49
/*    */     //   #37	-> 61
/*    */     //   #24	-> 67
/*    */     //   #33	-> 120
/*    */     //   #13	-> 160
/*    */     //   #18	-> 168
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   67	86	89	aacinternal/v
/*    */     //   83	104	107	aacinternal/v
/*    */     //   117	150	150	aacinternal/v }
/*    */   public static long a(short paramShort, long paramLong1, long paramLong2, int paramInt, char paramChar) { // Byte code:
/*    */     //   0: iload_0
/*    */     //   1: i2l
/*    */     //   2: bipush #48
/*    */     //   4: lshl
/*    */     //   5: iload #5
/*    */     //   7: i2l
/*    */     //   8: bipush #32
/*    */     //   10: lshl
/*    */     //   11: bipush #16
/*    */     //   13: lushr
/*    */     //   14: lor
/*    */     //   15: iload #6
/*    */     //   17: i2l
/*    */     //   18: bipush #48
/*    */     //   20: lshl
/*    */     //   21: bipush #48
/*    */     //   23: lushr
/*    */     //   24: lor
/*    */     //   25: getstatic aacinternal/az.a : J
/*    */     //   28: lxor
/*    */     //   29: lstore #7
/*    */     //   31: lload #7
/*    */     //   33: dup2
/*    */     //   34: ldc2_w 24879805987452
/*    */     //   37: lxor
/*    */     //   38: lstore #9
/*    */     //   40: pop2
/*    */     //   41: ldc2_w -4809042805056998178
/*    */     //   44: lload #7
/*    */     //   46: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*    */     //   51: astore #11
/*    */     //   53: lload_1
/*    */     //   54: lconst_0
/*    */     //   55: lcmp
/*    */     //   56: aload #11
/*    */     //   58: ifnonnull -> 134
/*    */     //   61: iflt -> 117
/*    */     //   64: goto -> 78
/*    */     //   67: ldc2_w -4832031080332225083
/*    */     //   70: lload #7
/*    */     //   72: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   77: athrow
/*    */     //   78: lload_3
/*    */     //   79: aload #11
/*    */     //   81: ifnonnull -> 201
/*    */     //   84: goto -> 98
/*    */     //   87: ldc2_w -4832031080332225083
/*    */     //   90: lload #7
/*    */     //   92: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   97: athrow
/*    */     //   98: lconst_0
/*    */     //   99: lcmp
/*    */     //   100: ifge -> 200
/*    */     //   103: goto -> 117
/*    */     //   106: ldc2_w -4832031080332225083
/*    */     //   109: lload #7
/*    */     //   111: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   116: athrow
/*    */     //   117: lload_1
/*    */     //   118: lconst_0
/*    */     //   119: lcmp
/*    */     //   120: goto -> 134
/*    */     //   123: ldc2_w -4832031080332225083
/*    */     //   126: lload #7
/*    */     //   128: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   133: athrow
/*    */     //   134: aload #11
/*    */     //   136: ifnonnull -> 224
/*    */     //   139: ifge -> 202
/*    */     //   142: goto -> 156
/*    */     //   145: ldc2_w -4832031080332225083
/*    */     //   148: lload #7
/*    */     //   150: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   155: athrow
/*    */     //   156: lload_3
/*    */     //   157: lconst_0
/*    */     //   158: lcmp
/*    */     //   159: iload #6
/*    */     //   161: ifle -> 224
/*    */     //   164: aload #11
/*    */     //   166: ifnonnull -> 224
/*    */     //   169: goto -> 183
/*    */     //   172: ldc2_w -4832031080332225083
/*    */     //   175: lload #7
/*    */     //   177: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   182: athrow
/*    */     //   183: ifge -> 202
/*    */     //   186: goto -> 200
/*    */     //   189: ldc2_w -4832031080332225083
/*    */     //   192: lload #7
/*    */     //   194: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   199: athrow
/*    */     //   200: lload_1
/*    */     //   201: lreturn
/*    */     //   202: lload_3
/*    */     //   203: aload #11
/*    */     //   205: ifnonnull -> 302
/*    */     //   208: lconst_0
/*    */     //   209: lcmp
/*    */     //   210: goto -> 224
/*    */     //   213: ldc2_w -4832031080332225083
/*    */     //   216: lload #7
/*    */     //   218: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   223: athrow
/*    */     //   224: iflt -> 300
/*    */     //   227: lload_1
/*    */     //   228: aload #11
/*    */     //   230: ifnonnull -> 302
/*    */     //   233: goto -> 247
/*    */     //   236: ldc2_w -4832031080332225083
/*    */     //   239: lload #7
/*    */     //   241: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   246: athrow
/*    */     //   247: iload_0
/*    */     //   248: iflt -> 301
/*    */     //   251: ldc2_w -9223372036854775808
/*    */     //   254: lcmp
/*    */     //   255: ifne -> 300
/*    */     //   258: goto -> 272
/*    */     //   261: ldc2_w -4832031080332225083
/*    */     //   264: lload #7
/*    */     //   266: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   271: athrow
/*    */     //   272: new aacinternal/u
/*    */     //   275: dup
/*    */     //   276: getstatic aacinternal/P.OVERFLOW : Laacinternal/P;
/*    */     //   279: iconst_0
/*    */     //   280: anewarray java/lang/Object
/*    */     //   283: lload #9
/*    */     //   285: invokespecial <init> : (Laacinternal/H;[Ljava/lang/Object;J)V
/*    */     //   288: athrow
/*    */     //   289: ldc2_w -4832031080332225083
/*    */     //   292: lload #7
/*    */     //   294: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   299: athrow
/*    */     //   300: lload_1
/*    */     //   301: lneg
/*    */     //   302: lreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #23	-> 53
/*    */     //   #30	-> 200
/*    */     //   #57	-> 202
/*    */     //   #53	-> 272
/*    */     //   #52	-> 300
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   53	64	67	aacinternal/u
/*    */     //   61	84	87	aacinternal/u
/*    */     //   78	103	106	aacinternal/u
/*    */     //   98	120	123	aacinternal/u
/*    */     //   134	142	145	aacinternal/u
/*    */     //   139	169	172	aacinternal/u
/*    */     //   156	186	189	aacinternal/u
/*    */     //   202	210	213	aacinternal/u
/*    */     //   224	233	236	aacinternal/u
/*    */     //   227	258	261	aacinternal/u
/* 27 */     //   247	289	289	aacinternal/u } public static int a(double[] paramArrayOfdouble) { return Arrays.hashCode(paramArrayOfdouble); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean a(double paramDouble1, double paramDouble2)
/*    */   {
/* 35 */     return (new Double(paramDouble1)).equals(new Double(paramDouble2)); } public static C a(C paramC1, C paramC2) {
/* 36 */     return (C)paramC1.g(aL.b((C)((C)((C)paramC1.e(Math.PI)).g(paramC2)).d(6.283185307179586D)).g(6.283185307179586D));
/*    */   } public static void a(long paramLong, Object paramObject) {
/*    */     // Byte code:
/*    */     //   0: getstatic aacinternal/az.a : J
/*    */     //   3: lload_0
/*    */     //   4: lxor
/*    */     //   5: lstore_0
/*    */     //   6: lload_0
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 135939902836913
/*    */     //   11: lxor
/*    */     //   12: lstore_3
/*    */     //   13: pop2
/*    */     //   14: aload_2
/*    */     //   15: ifnonnull -> 44
/*    */     //   18: new aacinternal/g
/*    */     //   21: dup
/*    */     //   22: lload_3
/*    */     //   23: getstatic aacinternal/P.NULL_NOT_ALLOWED : Laacinternal/P;
/*    */     //   26: iconst_0
/*    */     //   27: anewarray java/lang/Object
/*    */     //   30: invokespecial <init> : (JLaacinternal/H;[Ljava/lang/Object;)V
/*    */     //   33: athrow
/*    */     //   34: ldc2_w -867781005042066751
/*    */     //   37: lload_0
/*    */     //   38: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   43: athrow
/*    */     //   44: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #39	-> 14
/*    */     //   #28	-> 18
/*    */     //   #26	-> 44
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   14	34	34	aacinternal/g
/*    */   } public static short a(short paramShort1, short paramShort2, int paramInt, char paramChar1, char paramChar2) {
/*    */     // Byte code:
/*    */     //   0: iload_2
/*    */     //   1: i2l
/*    */     //   2: bipush #32
/*    */     //   4: lshl
/*    */     //   5: iload_3
/*    */     //   6: i2l
/*    */     //   7: bipush #48
/*    */     //   9: lshl
/*    */     //   10: bipush #32
/*    */     //   12: lushr
/*    */     //   13: lor
/*    */     //   14: iload #4
/*    */     //   16: i2l
/*    */     //   17: bipush #48
/*    */     //   19: lshl
/*    */     //   20: bipush #48
/*    */     //   22: lushr
/*    */     //   23: lor
/*    */     //   24: getstatic aacinternal/az.a : J
/*    */     //   27: lxor
/*    */     //   28: lstore #5
/*    */     //   30: lload #5
/*    */     //   32: dup2
/*    */     //   33: ldc2_w 92107719631142
/*    */     //   36: lxor
/*    */     //   37: lstore #7
/*    */     //   39: pop2
/*    */     //   40: ldc2_w 2745115951677206404
/*    */     //   43: lload #5
/*    */     //   45: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*    */     //   50: astore #9
/*    */     //   52: iload_0
/*    */     //   53: aload #9
/*    */     //   55: ifnonnull -> 113
/*    */     //   58: iflt -> 112
/*    */     //   61: goto -> 75
/*    */     //   64: ldc2_w 2858492947374083743
/*    */     //   67: lload #5
/*    */     //   69: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   74: athrow
/*    */     //   75: iload_1
/*    */     //   76: aload #9
/*    */     //   78: ifnonnull -> 178
/*    */     //   81: goto -> 95
/*    */     //   84: ldc2_w 2858492947374083743
/*    */     //   87: lload #5
/*    */     //   89: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   94: athrow
/*    */     //   95: ifge -> 177
/*    */     //   98: goto -> 112
/*    */     //   101: ldc2_w 2858492947374083743
/*    */     //   104: lload #5
/*    */     //   106: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   111: athrow
/*    */     //   112: iload_0
/*    */     //   113: aload #9
/*    */     //   115: ifnonnull -> 180
/*    */     //   118: ifge -> 179
/*    */     //   121: goto -> 135
/*    */     //   124: ldc2_w 2858492947374083743
/*    */     //   127: lload #5
/*    */     //   129: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   134: athrow
/*    */     //   135: iload_1
/*    */     //   136: aload #9
/*    */     //   138: iload #4
/*    */     //   140: iflt -> 182
/*    */     //   143: ifnonnull -> 180
/*    */     //   146: goto -> 160
/*    */     //   149: ldc2_w 2858492947374083743
/*    */     //   152: lload #5
/*    */     //   154: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   159: athrow
/*    */     //   160: ifge -> 179
/*    */     //   163: goto -> 177
/*    */     //   166: ldc2_w 2858492947374083743
/*    */     //   169: lload #5
/*    */     //   171: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   176: athrow
/*    */     //   177: iload_0
/*    */     //   178: ireturn
/*    */     //   179: iload_1
/*    */     //   180: aload #9
/*    */     //   182: ifnonnull -> 277
/*    */     //   185: iflt -> 274
/*    */     //   188: goto -> 202
/*    */     //   191: ldc2_w 2858492947374083743
/*    */     //   194: lload #5
/*    */     //   196: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   201: athrow
/*    */     //   202: iload_0
/*    */     //   203: aload #9
/*    */     //   205: ifnonnull -> 277
/*    */     //   208: goto -> 222
/*    */     //   211: ldc2_w 2858492947374083743
/*    */     //   214: lload #5
/*    */     //   216: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   221: athrow
/*    */     //   222: iload_3
/*    */     //   223: ifle -> 276
/*    */     //   226: sipush #-32768
/*    */     //   229: if_icmpne -> 274
/*    */     //   232: goto -> 246
/*    */     //   235: ldc2_w 2858492947374083743
/*    */     //   238: lload #5
/*    */     //   240: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   245: athrow
/*    */     //   246: new aacinternal/u
/*    */     //   249: dup
/*    */     //   250: getstatic aacinternal/P.OVERFLOW : Laacinternal/P;
/*    */     //   253: iconst_0
/*    */     //   254: anewarray java/lang/Object
/*    */     //   257: lload #7
/*    */     //   259: invokespecial <init> : (Laacinternal/H;[Ljava/lang/Object;J)V
/*    */     //   262: athrow
/*    */     //   263: ldc2_w 2858492947374083743
/*    */     //   266: lload #5
/*    */     //   268: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   273: athrow
/*    */     //   274: iload_0
/*    */     //   275: ineg
/*    */     //   276: i2s
/*    */     //   277: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #45	-> 52
/*    */     //   #44	-> 177
/*    */     //   #43	-> 179
/*    */     //   #29	-> 246
/*    */     //   #1	-> 274
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   52	61	64	aacinternal/u
/*    */     //   58	81	84	aacinternal/u
/*    */     //   75	98	101	aacinternal/u
/*    */     //   113	121	124	aacinternal/u
/*    */     //   118	146	149	aacinternal/u
/*    */     //   135	163	166	aacinternal/u
/*    */     //   180	188	191	aacinternal/u
/*    */     //   185	208	211	aacinternal/u
/*    */     //   202	232	235	aacinternal/u
/*    */     //   222	263	263	aacinternal/u
/*    */   } public static C c(C paramC1, C paramC2, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic aacinternal/az.a : J
/*    */     //   3: lload_2
/*    */     //   4: lxor
/*    */     //   5: lstore_2
/*    */     //   6: ldc2_w 474237940060606216
/*    */     //   9: lload_2
/*    */     //   10: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*    */     //   15: astore #4
/*    */     //   17: aload_0
/*    */     //   18: aload_1
/*    */     //   19: invokeinterface g : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   24: checkcast aacinternal/C
/*    */     //   27: aload #4
/*    */     //   29: ifnonnull -> 69
/*    */     //   32: invokeinterface a : ()D
/*    */     //   37: dconst_0
/*    */     //   38: dcmpl
/*    */     //   39: iflt -> 72
/*    */     //   42: goto -> 55
/*    */     //   45: ldc2_w 515416682430737939
/*    */     //   48: lload_2
/*    */     //   49: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   54: athrow
/*    */     //   55: aload_1
/*    */     //   56: goto -> 69
/*    */     //   59: ldc2_w 515416682430737939
/*    */     //   62: lload_2
/*    */     //   63: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   68: athrow
/*    */     //   69: goto -> 73
/*    */     //   72: aload_0
/*    */     //   73: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #48	-> 17
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   17	42	45	aacinternal/u
/*    */     //   32	56	59	aacinternal/u
/*    */   }
/*    */   public static void a(long paramLong, int paramInt1, int paramInt2) {
/*    */     // Byte code:
/*    */     //   0: getstatic aacinternal/az.a : J
/*    */     //   3: lload_0
/*    */     //   4: lxor
/*    */     //   5: lstore_0
/*    */     //   6: lload_0
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 39674186339502
/*    */     //   11: lxor
/*    */     //   12: dup2
/*    */     //   13: bipush #48
/*    */     //   15: lushr
/*    */     //   16: l2i
/*    */     //   17: istore #4
/*    */     //   19: dup2
/*    */     //   20: bipush #16
/*    */     //   22: lshl
/*    */     //   23: bipush #32
/*    */     //   25: lushr
/*    */     //   26: l2i
/*    */     //   27: istore #5
/*    */     //   29: dup2
/*    */     //   30: bipush #48
/*    */     //   32: lshl
/*    */     //   33: bipush #48
/*    */     //   35: lushr
/*    */     //   36: l2i
/*    */     //   37: istore #6
/*    */     //   39: pop2
/*    */     //   40: pop2
/*    */     //   41: iload_2
/*    */     //   42: iload_3
/*    */     //   43: if_icmpeq -> 93
/*    */     //   46: new aacinternal/v
/*    */     //   49: dup
/*    */     //   50: getstatic aacinternal/P.DIMENSIONS_MISMATCH : Laacinternal/P;
/*    */     //   53: iconst_2
/*    */     //   54: anewarray java/lang/Object
/*    */     //   57: dup
/*    */     //   58: iconst_0
/*    */     //   59: iload_2
/*    */     //   60: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   63: aastore
/*    */     //   64: dup
/*    */     //   65: iconst_1
/*    */     //   66: iload_3
/*    */     //   67: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   70: aastore
/*    */     //   71: iload #4
/*    */     //   73: i2s
/*    */     //   74: iload #5
/*    */     //   76: iload #6
/*    */     //   78: i2s
/*    */     //   79: invokespecial <init> : (Laacinternal/H;[Ljava/lang/Object;SIS)V
/*    */     //   82: athrow
/*    */     //   83: ldc2_w -6964203949560187282
/*    */     //   86: lload_0
/*    */     //   87: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   92: athrow
/*    */     //   93: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #49	-> 41
/*    */     //   #3	-> 46
/*    */     //   #10	-> 60
/*    */     //   #15	-> 93
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   41	83	83	aacinternal/u
/*    */   }
/*    */   public static byte a(byte paramByte1, long paramLong, byte paramByte2) {
/*    */     // Byte code:
/*    */     //   0: getstatic aacinternal/az.a : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: lload_1
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 52149608452441
/*    */     //   11: lxor
/*    */     //   12: lstore #4
/*    */     //   14: pop2
/*    */     //   15: ldc2_w -2997179900614303749
/*    */     //   18: lload_1
/*    */     //   19: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*    */     //   24: astore #6
/*    */     //   26: iload_0
/*    */     //   27: aload #6
/*    */     //   29: ifnonnull -> 84
/*    */     //   32: iflt -> 83
/*    */     //   35: goto -> 48
/*    */     //   38: ldc2_w -2894666001717461280
/*    */     //   41: lload_1
/*    */     //   42: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   47: athrow
/*    */     //   48: iload_3
/*    */     //   49: aload #6
/*    */     //   51: ifnonnull -> 147
/*    */     //   54: goto -> 67
/*    */     //   57: ldc2_w -2894666001717461280
/*    */     //   60: lload_1
/*    */     //   61: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   66: athrow
/*    */     //   67: ifge -> 146
/*    */     //   70: goto -> 83
/*    */     //   73: ldc2_w -2894666001717461280
/*    */     //   76: lload_1
/*    */     //   77: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   82: athrow
/*    */     //   83: iload_0
/*    */     //   84: aload #6
/*    */     //   86: ifnonnull -> 149
/*    */     //   89: ifge -> 148
/*    */     //   92: goto -> 105
/*    */     //   95: ldc2_w -2894666001717461280
/*    */     //   98: lload_1
/*    */     //   99: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   104: athrow
/*    */     //   105: iload_3
/*    */     //   106: aload #6
/*    */     //   108: lload_1
/*    */     //   109: lconst_0
/*    */     //   110: lcmp
/*    */     //   111: iflt -> 151
/*    */     //   114: ifnonnull -> 149
/*    */     //   117: goto -> 130
/*    */     //   120: ldc2_w -2894666001717461280
/*    */     //   123: lload_1
/*    */     //   124: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   129: athrow
/*    */     //   130: ifge -> 148
/*    */     //   133: goto -> 146
/*    */     //   136: ldc2_w -2894666001717461280
/*    */     //   139: lload_1
/*    */     //   140: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   145: athrow
/*    */     //   146: iload_0
/*    */     //   147: ireturn
/*    */     //   148: iload_3
/*    */     //   149: aload #6
/*    */     //   151: ifnonnull -> 243
/*    */     //   154: iflt -> 240
/*    */     //   157: goto -> 170
/*    */     //   160: ldc2_w -2894666001717461280
/*    */     //   163: lload_1
/*    */     //   164: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   169: athrow
/*    */     //   170: iload_0
/*    */     //   171: aload #6
/*    */     //   173: ifnonnull -> 243
/*    */     //   176: goto -> 189
/*    */     //   179: ldc2_w -2894666001717461280
/*    */     //   182: lload_1
/*    */     //   183: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   188: athrow
/*    */     //   189: lload_1
/*    */     //   190: lconst_0
/*    */     //   191: lcmp
/*    */     //   192: iflt -> 242
/*    */     //   195: bipush #-128
/*    */     //   197: if_icmpne -> 240
/*    */     //   200: goto -> 213
/*    */     //   203: ldc2_w -2894666001717461280
/*    */     //   206: lload_1
/*    */     //   207: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   212: athrow
/*    */     //   213: new aacinternal/u
/*    */     //   216: dup
/*    */     //   217: getstatic aacinternal/P.OVERFLOW : Laacinternal/P;
/*    */     //   220: iconst_0
/*    */     //   221: anewarray java/lang/Object
/*    */     //   224: lload #4
/*    */     //   226: invokespecial <init> : (Laacinternal/H;[Ljava/lang/Object;J)V
/*    */     //   229: athrow
/*    */     //   230: ldc2_w -2894666001717461280
/*    */     //   233: lload_1
/*    */     //   234: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   239: athrow
/*    */     //   240: iload_0
/*    */     //   241: ineg
/*    */     //   242: i2b
/*    */     //   243: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #50	-> 26
/*    */     //   #32	-> 146
/*    */     //   #38	-> 148
/*    */     //   #47	-> 213
/*    */     //   #4	-> 240
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   26	35	38	aacinternal/u
/*    */     //   32	54	57	aacinternal/u
/*    */     //   48	70	73	aacinternal/u
/*    */     //   84	92	95	aacinternal/u
/*    */     //   89	117	120	aacinternal/u
/*    */     //   105	133	136	aacinternal/u
/*    */     //   149	157	160	aacinternal/u
/*    */     //   154	176	179	aacinternal/u
/*    */     //   170	200	203	aacinternal/u
/*    */     //   189	230	230	aacinternal/u
/*    */   }
/*    */   public static double a(double paramDouble1, long paramLong, double paramDouble2, double paramDouble3) {
/* 51 */     paramLong = a ^ paramLong; long l = paramLong ^ 0x210C83FD8240L; double d = aL.z(paramDouble2);
/*    */     return paramDouble1 - d * aL.t(l, (paramDouble1 - paramDouble3) / d) - paramDouble3;
/*    */   }
/*    */   
/*    */   public static void a(Object paramObject, H paramH, Object[] paramArrayOfObject, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic aacinternal/az.a : J
/*    */     //   3: lload_3
/*    */     //   4: lxor
/*    */     //   5: lstore_3
/*    */     //   6: lload_3
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 128384780591834
/*    */     //   11: lxor
/*    */     //   12: lstore #5
/*    */     //   14: pop2
/*    */     //   15: aload_0
/*    */     //   16: ifnonnull -> 41
/*    */     //   19: new aacinternal/g
/*    */     //   22: dup
/*    */     //   23: lload #5
/*    */     //   25: aload_1
/*    */     //   26: aload_2
/*    */     //   27: invokespecial <init> : (JLaacinternal/H;[Ljava/lang/Object;)V
/*    */     //   30: athrow
/*    */     //   31: ldc2_w -9106829683667654486
/*    */     //   34: lload_3
/*    */     //   35: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   40: athrow
/*    */     //   41: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #54	-> 15
/*    */     //   #42	-> 19
/*    */     //   #46	-> 41
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   15	31	31	aacinternal/g
/*    */   }
/*    */   
/*    */   public static void b(boolean paramBoolean) {
/*    */     b = paramBoolean;
/*    */   }
/*    */   
/*    */   public static boolean b() {
/*    */     return b;
/*    */   }
/*    */   
/*    */   public static boolean a() {
/*    */     boolean bool = b();
/*    */     try {
/*    */       if (!bool)
/*    */         return true; 
/*    */     } catch (u u) {
/*    */       throw a(null);
/*    */     } 
/*    */     return false;
/*    */   }
/*    */   
/*    */   static {
/*    */     // Byte code:
/*    */     //   0: ldc2_w -2419692907216888222
/*    */     //   3: ldc2_w -6476031244101400158
/*    */     //   6: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
/*    */     //   9: invokevirtual lookupClass : ()Ljava/lang/Class;
/*    */     //   12: invokestatic a : (JJLjava/lang/Object;)Lme/konsolas/aac/na;
/*    */     //   15: ldc2_w 138900600927220
/*    */     //   18: invokeinterface a : (J)J
/*    */     //   23: putstatic aacinternal/az.a : J
/*    */     //   26: getstatic aacinternal/az.a : J
/*    */     //   29: ldc2_w 122055787713538
/*    */     //   32: lxor
/*    */     //   33: lstore_0
/*    */     //   34: ldc2_w -175455560724508645
/*    */     //   37: lload_0
/*    */     //   38: <illegal opcode> w : (JJ)Z
/*    */     //   43: ifeq -> 56
/*    */     //   46: iconst_1
/*    */     //   47: ldc2_w -277557215566587175
/*    */     //   50: lload_0
/*    */     //   51: <illegal opcode> w : (ZJJ)V
/*    */     //   56: return
/*    */   }
/*    */   
/*    */   private static RuntimeException a(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\az.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */