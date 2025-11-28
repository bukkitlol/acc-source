/*     */ package me.konsolas.aac;public class e5 { public static final float e; private static final float[] b; private static final Random c;
/*     */   private static final int[] f;
/*     */   
/*     */   public static double b(double paramDouble1, double paramDouble2, double paramDouble3) {
/*   5 */     return (paramDouble1 - paramDouble2) / (paramDouble3 - paramDouble2);
/*     */   } private static final double g; private static final double[] a; private static final double[] d; public static int a(int paramInt, char paramChar1, char paramChar2, double paramDouble) {
/*     */     // Byte code:
/*     */     //   0: iload_0
/*     */     //   1: i2l
/*     */     //   2: bipush #32
/*     */     //   4: lshl
/*     */     //   5: iload_1
/*     */     //   6: i2l
/*     */     //   7: bipush #48
/*     */     //   9: lshl
/*     */     //   10: bipush #32
/*     */     //   12: lushr
/*     */     //   13: lor
/*     */     //   14: iload_2
/*     */     //   15: i2l
/*     */     //   16: bipush #48
/*     */     //   18: lshl
/*     */     //   19: bipush #48
/*     */     //   21: lushr
/*     */     //   22: lor
/*     */     //   23: getstatic me/konsolas/aac/e5.h : J
/*     */     //   26: lxor
/*     */     //   27: lstore #5
/*     */     //   29: ldc2_w 2436534229930011248
/*     */     //   32: lload #5
/*     */     //   34: <illegal opcode> w : (JJ)[I
/*     */     //   39: dload_3
/*     */     //   40: d2i
/*     */     //   41: istore #8
/*     */     //   43: astore #7
/*     */     //   45: dload_3
/*     */     //   46: iload #8
/*     */     //   48: i2d
/*     */     //   49: dcmpg
/*     */     //   50: aload #7
/*     */     //   52: ifnull -> 90
/*     */     //   55: ifge -> 93
/*     */     //   58: goto -> 72
/*     */     //   61: ldc2_w 2419375702671633427
/*     */     //   64: lload #5
/*     */     //   66: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   71: athrow
/*     */     //   72: iload #8
/*     */     //   74: iconst_1
/*     */     //   75: isub
/*     */     //   76: goto -> 90
/*     */     //   79: ldc2_w 2419375702671633427
/*     */     //   82: lload #5
/*     */     //   84: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   89: athrow
/*     */     //   90: goto -> 95
/*     */     //   93: iload #8
/*     */     //   95: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #2	-> 39
/*     */     //   #56	-> 45
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   45	58	61	aacinternal/v
/*     */     //   55	76	79	aacinternal/v
/*     */   } private static boolean a(short paramShort, int paramInt1, char paramChar, int paramInt2) {
/*     */     // Byte code:
/*     */     //   0: iload_0
/*     */     //   1: i2l
/*     */     //   2: bipush #48
/*     */     //   4: lshl
/*     */     //   5: iload_1
/*     */     //   6: i2l
/*     */     //   7: bipush #32
/*     */     //   9: lshl
/*     */     //   10: bipush #16
/*     */     //   12: lushr
/*     */     //   13: lor
/*     */     //   14: iload_2
/*     */     //   15: i2l
/*     */     //   16: bipush #48
/*     */     //   18: lshl
/*     */     //   19: bipush #48
/*     */     //   21: lushr
/*     */     //   22: lor
/*     */     //   23: getstatic me/konsolas/aac/e5.h : J
/*     */     //   26: lxor
/*     */     //   27: lstore #4
/*     */     //   29: ldc2_w -7254683581976391438
/*     */     //   32: lload #4
/*     */     //   34: <illegal opcode> w : (JJ)[I
/*     */     //   39: astore #6
/*     */     //   41: iload_3
/*     */     //   42: aload #6
/*     */     //   44: ifnull -> 83
/*     */     //   47: ifeq -> 109
/*     */     //   50: goto -> 64
/*     */     //   53: ldc2_w -7272970200125106543
/*     */     //   56: lload #4
/*     */     //   58: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   63: athrow
/*     */     //   64: iload_3
/*     */     //   65: iload_3
/*     */     //   66: iconst_1
/*     */     //   67: isub
/*     */     //   68: iand
/*     */     //   69: goto -> 83
/*     */     //   72: ldc2_w -7272970200125106543
/*     */     //   75: lload #4
/*     */     //   77: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   82: athrow
/*     */     //   83: aload #6
/*     */     //   85: ifnull -> 106
/*     */     //   88: ifne -> 109
/*     */     //   91: goto -> 105
/*     */     //   94: ldc2_w -7272970200125106543
/*     */     //   97: lload #4
/*     */     //   99: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   104: athrow
/*     */     //   105: iconst_1
/*     */     //   106: goto -> 110
/*     */     //   109: iconst_0
/*     */     //   110: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #3	-> 41
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   41	50	53	aacinternal/v
/*     */     //   47	69	72	aacinternal/v
/*     */     //   83	91	94	aacinternal/v
/*     */   } public static int c(long paramLong, double paramDouble) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/e5.h : J
/*     */     //   3: lload_0
/*     */     //   4: lxor
/*     */     //   5: lstore_0
/*     */     //   6: ldc2_w -7751133702195224626
/*     */     //   9: lload_0
/*     */     //   10: <illegal opcode> w : (JJ)[I
/*     */     //   15: astore #4
/*     */     //   17: dload_2
/*     */     //   18: dconst_0
/*     */     //   19: aload #4
/*     */     //   21: ifnull -> 58
/*     */     //   24: dcmpl
/*     */     //   25: iflt -> 55
/*     */     //   28: goto -> 41
/*     */     //   31: ldc2_w -7769440068323599955
/*     */     //   34: lload_0
/*     */     //   35: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   40: athrow
/*     */     //   41: dload_2
/*     */     //   42: goto -> 59
/*     */     //   45: ldc2_w -7769440068323599955
/*     */     //   48: lload_0
/*     */     //   49: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   54: athrow
/*     */     //   55: dload_2
/*     */     //   56: dneg
/*     */     //   57: dconst_1
/*     */     //   58: dadd
/*     */     //   59: d2i
/*     */     //   60: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #6	-> 17
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   17	28	31	aacinternal/v
/*     */     //   24	45	45	aacinternal/v
/*     */   }
/*     */   public static boolean a(float paramFloat1, float paramFloat2, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/e5.h : J
/*     */     //   3: lload_2
/*     */     //   4: lxor
/*     */     //   5: lstore_2
/*     */     //   6: lload_2
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 95522085484835
/*     */     //   11: lxor
/*     */     //   12: lstore #4
/*     */     //   14: pop2
/*     */     //   15: ldc2_w -5915628889644374457
/*     */     //   18: lload_2
/*     */     //   19: <illegal opcode> w : (JJ)[I
/*     */     //   24: astore #6
/*     */     //   26: fload_1
/*     */     //   27: fload_0
/*     */     //   28: fsub
/*     */     //   29: lload #4
/*     */     //   31: invokestatic d : (FJ)F
/*     */     //   34: ldc 1.0E-5
/*     */     //   36: fcmpg
/*     */     //   37: aload #6
/*     */     //   39: ifnull -> 59
/*     */     //   42: ifge -> 62
/*     */     //   45: goto -> 58
/*     */     //   48: ldc2_w -5934511459511853020
/*     */     //   51: lload_2
/*     */     //   52: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   57: athrow
/*     */     //   58: iconst_1
/*     */     //   59: goto -> 63
/*     */     //   62: iconst_0
/*     */     //   63: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #13	-> 26
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   26	45	48	aacinternal/v
/*     */   }
/*     */   public static double a(long paramLong, double paramDouble1, double paramDouble2) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/e5.h : J
/*     */     //   3: lload_0
/*     */     //   4: lxor
/*     */     //   5: lstore_0
/*     */     //   6: ldc2_w -3086339556758970741
/*     */     //   9: lload_0
/*     */     //   10: <illegal opcode> w : (JJ)[I
/*     */     //   15: astore #6
/*     */     //   17: dload_2
/*     */     //   18: dconst_0
/*     */     //   19: dcmpg
/*     */     //   20: aload #6
/*     */     //   22: ifnull -> 72
/*     */     //   25: ifge -> 44
/*     */     //   28: goto -> 41
/*     */     //   31: ldc2_w -3069193124101236504
/*     */     //   34: lload_0
/*     */     //   35: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   40: athrow
/*     */     //   41: dload_2
/*     */     //   42: dneg
/*     */     //   43: dstore_2
/*     */     //   44: dload #4
/*     */     //   46: lload_0
/*     */     //   47: lconst_0
/*     */     //   48: lcmp
/*     */     //   49: ifle -> 86
/*     */     //   52: dconst_0
/*     */     //   53: aload #6
/*     */     //   55: ifnull -> 83
/*     */     //   58: dcmpg
/*     */     //   59: goto -> 72
/*     */     //   62: ldc2_w -3069193124101236504
/*     */     //   65: lload_0
/*     */     //   66: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   71: athrow
/*     */     //   72: ifge -> 80
/*     */     //   75: dload #4
/*     */     //   77: dneg
/*     */     //   78: dstore #4
/*     */     //   80: dload_2
/*     */     //   81: dload #4
/*     */     //   83: invokestatic max : (DD)D
/*     */     //   86: dreturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #14	-> 17
/*     */     //   #45	-> 41
/*     */     //   #7	-> 44
/*     */     //   #190	-> 75
/*     */     //   #183	-> 80
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   17	28	31	aacinternal/v
/*     */     //   44	59	62	aacinternal/v
/*     */   }
/*     */   public static float c(float paramFloat1, float paramFloat2, long paramLong, float paramFloat3) {
/*  20 */     paramLong = h ^ paramLong; long l1 = paramLong ^ 0x46E8A1DA60F6L, l2 = paramLong ^ 0x1C4B9C97C849L; float f = a(l1, paramFloat2, paramFloat1);
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
/* 144 */     return b(paramFloat1, l2, paramFloat1 + f, paramFloat3);
/*     */   }
/*     */ 
/*     */   
/*     */   public static int b(int paramInt1, short paramShort1, short paramShort2, int paramInt2, int paramInt3, int paramInt4) {
/*     */     // Byte code:
/*     */     //   0: iload_0
/*     */     //   1: i2l
/*     */     //   2: bipush #32
/*     */     //   4: lshl
/*     */     //   5: iload_1
/*     */     //   6: i2l
/*     */     //   7: bipush #48
/*     */     //   9: lshl
/*     */     //   10: bipush #32
/*     */     //   12: lushr
/*     */     //   13: lor
/*     */     //   14: iload_2
/*     */     //   15: i2l
/*     */     //   16: bipush #48
/*     */     //   18: lshl
/*     */     //   19: bipush #48
/*     */     //   21: lushr
/*     */     //   22: lor
/*     */     //   23: getstatic me/konsolas/aac/e5.h : J
/*     */     //   26: lxor
/*     */     //   27: lstore #6
/*     */     //   29: ldc2_w 1170400373013339038
/*     */     //   32: lload #6
/*     */     //   34: <illegal opcode> w : (JJ)[I
/*     */     //   39: astore #8
/*     */     //   41: iload_3
/*     */     //   42: iload #4
/*     */     //   44: aload #8
/*     */     //   46: ifnull -> 83
/*     */     //   49: if_icmpge -> 80
/*     */     //   52: goto -> 66
/*     */     //   55: ldc2_w 1188122829796351485
/*     */     //   58: lload #6
/*     */     //   60: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   65: athrow
/*     */     //   66: iload #4
/*     */     //   68: ireturn
/*     */     //   69: ldc2_w 1188122829796351485
/*     */     //   72: lload #6
/*     */     //   74: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   79: athrow
/*     */     //   80: iload_3
/*     */     //   81: iload #5
/*     */     //   83: invokestatic min : (II)I
/*     */     //   86: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #25	-> 41
/*     */     //   #113	-> 66
/*     */     //   #131	-> 80
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   41	52	55	aacinternal/v
/*     */     //   49	69	69	aacinternal/v
/*     */   }
/*     */ 
/*     */   
/*     */   public static float d(float paramFloat, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/e5.h : J
/*     */     //   3: lload_1
/*     */     //   4: lxor
/*     */     //   5: lstore_1
/*     */     //   6: ldc2_w 5219798547844989904
/*     */     //   9: lload_1
/*     */     //   10: <illegal opcode> w : (JJ)[I
/*     */     //   15: astore_3
/*     */     //   16: fload_0
/*     */     //   17: aload_3
/*     */     //   18: ifnull -> 54
/*     */     //   21: fconst_0
/*     */     //   22: fcmpl
/*     */     //   23: iflt -> 53
/*     */     //   26: goto -> 39
/*     */     //   29: ldc2_w 5202612515839428019
/*     */     //   32: lload_1
/*     */     //   33: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   38: athrow
/*     */     //   39: fload_0
/*     */     //   40: goto -> 55
/*     */     //   43: ldc2_w 5202612515839428019
/*     */     //   46: lload_1
/*     */     //   47: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   52: athrow
/*     */     //   53: fload_0
/*     */     //   54: fneg
/*     */     //   55: freturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #29	-> 16
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   16	26	29	aacinternal/v
/*     */     //   21	43	43	aacinternal/v
/*     */   }
/*     */ 
/*     */   
/*     */   public static UUID a() {
/*     */     return a(c);
/*     */   }
/*     */ 
/*     */   
/*     */   public static float b(float paramFloat) {
/*     */     return b[(int)(paramFloat * 10430.378F) & 0xFFFF];
/*     */   }
/*     */ 
/*     */   
/*     */   public static double a(long paramLong, long[] paramArrayOflong) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/e5.h : J
/*     */     //   3: lload_0
/*     */     //   4: lxor
/*     */     //   5: lstore_0
/*     */     //   6: lconst_0
/*     */     //   7: lstore #4
/*     */     //   9: aload_2
/*     */     //   10: astore #6
/*     */     //   12: ldc2_w 2540369564403886305
/*     */     //   15: lload_0
/*     */     //   16: <illegal opcode> w : (JJ)[I
/*     */     //   21: aload #6
/*     */     //   23: arraylength
/*     */     //   24: istore #7
/*     */     //   26: astore_3
/*     */     //   27: iconst_0
/*     */     //   28: istore #8
/*     */     //   30: iload #8
/*     */     //   32: iload #7
/*     */     //   34: if_icmpge -> 68
/*     */     //   37: aload #6
/*     */     //   39: iload #8
/*     */     //   41: laload
/*     */     //   42: lstore #9
/*     */     //   44: lload_0
/*     */     //   45: lconst_0
/*     */     //   46: lcmp
/*     */     //   47: iflt -> 64
/*     */     //   50: lload #4
/*     */     //   52: lload #9
/*     */     //   54: ladd
/*     */     //   55: aload_3
/*     */     //   56: ifnull -> 70
/*     */     //   59: lstore #4
/*     */     //   61: iinc #8, 1
/*     */     //   64: aload_3
/*     */     //   65: ifnonnull -> 30
/*     */     //   68: lload #4
/*     */     //   70: l2d
/*     */     //   71: aload_2
/*     */     //   72: arraylength
/*     */     //   73: i2d
/*     */     //   74: ddiv
/*     */     //   75: dreturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #36	-> 6
/*     */     //   #69	-> 9
/*     */     //   #128	-> 44
/*     */     //   #1	-> 61
/*     */     //   #94	-> 68
/*     */   }
/*     */ 
/*     */   
/*     */   public static double a(double paramDouble1, double paramDouble2, long paramLong, double paramDouble3) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/e5.h : J
/*     */     //   3: lload #4
/*     */     //   5: lxor
/*     */     //   6: lstore #4
/*     */     //   8: ldc2_w 5610084096776898171
/*     */     //   11: lload #4
/*     */     //   13: <illegal opcode> w : (JJ)[I
/*     */     //   18: astore #8
/*     */     //   20: dload #6
/*     */     //   22: dconst_0
/*     */     //   23: dcmpg
/*     */     //   24: aload #8
/*     */     //   26: ifnull -> 82
/*     */     //   29: ifge -> 59
/*     */     //   32: goto -> 46
/*     */     //   35: ldc2_w 5591239107244081176
/*     */     //   38: lload #4
/*     */     //   40: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   45: athrow
/*     */     //   46: dload_0
/*     */     //   47: dreturn
/*     */     //   48: ldc2_w 5591239107244081176
/*     */     //   51: lload #4
/*     */     //   53: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   58: athrow
/*     */     //   59: dload #6
/*     */     //   61: dconst_1
/*     */     //   62: aload #8
/*     */     //   64: ifnull -> 107
/*     */     //   67: dcmpl
/*     */     //   68: goto -> 82
/*     */     //   71: ldc2_w 5591239107244081176
/*     */     //   74: lload #4
/*     */     //   76: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   81: athrow
/*     */     //   82: ifle -> 100
/*     */     //   85: dload_2
/*     */     //   86: goto -> 108
/*     */     //   89: ldc2_w 5591239107244081176
/*     */     //   92: lload #4
/*     */     //   94: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   99: athrow
/*     */     //   100: dload_0
/*     */     //   101: dload_2
/*     */     //   102: dload_0
/*     */     //   103: dsub
/*     */     //   104: dload #6
/*     */     //   106: dmul
/*     */     //   107: dadd
/*     */     //   108: dreturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #37	-> 20
/*     */     //   #92	-> 46
/*     */     //   #105	-> 59
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   20	32	35	aacinternal/v
/*     */     //   29	48	48	aacinternal/v
/*     */     //   59	68	71	aacinternal/v
/*     */     //   82	89	89	aacinternal/v
/*     */   }
/*     */ 
/*     */   
/*     */   public static float a(long paramLong, float paramFloat1, float paramFloat2, float paramFloat3) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/e5.h : J
/*     */     //   3: lload_0
/*     */     //   4: lxor
/*     */     //   5: lstore_0
/*     */     //   6: ldc2_w -3793712120320687878
/*     */     //   9: lload_0
/*     */     //   10: <illegal opcode> w : (JJ)[I
/*     */     //   15: astore #5
/*     */     //   17: fload_2
/*     */     //   18: fload_3
/*     */     //   19: aload #5
/*     */     //   21: ifnull -> 56
/*     */     //   24: fcmpg
/*     */     //   25: ifge -> 53
/*     */     //   28: goto -> 41
/*     */     //   31: ldc2_w -3811996410320271719
/*     */     //   34: lload_0
/*     */     //   35: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   40: athrow
/*     */     //   41: fload_3
/*     */     //   42: freturn
/*     */     //   43: ldc2_w -3811996410320271719
/*     */     //   46: lload_0
/*     */     //   47: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   52: athrow
/*     */     //   53: fload_2
/*     */     //   54: fload #4
/*     */     //   56: invokestatic min : (FF)F
/*     */     //   59: freturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #41	-> 17
/*     */     //   #182	-> 41
/*     */     //   #187	-> 53
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   17	28	31	aacinternal/v
/*     */     //   24	43	43	aacinternal/v
/*     */   }
/*     */ 
/*     */   
/*     */   public static long a(double paramDouble, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/e5.h : J
/*     */     //   3: lload_2
/*     */     //   4: lxor
/*     */     //   5: lstore_2
/*     */     //   6: dload_0
/*     */     //   7: d2l
/*     */     //   8: lstore #4
/*     */     //   10: dload_0
/*     */     //   11: lload #4
/*     */     //   13: l2d
/*     */     //   14: dcmpg
/*     */     //   15: ifge -> 35
/*     */     //   18: lload #4
/*     */     //   20: lconst_1
/*     */     //   21: lsub
/*     */     //   22: goto -> 37
/*     */     //   25: ldc2_w 3100492350283261575
/*     */     //   28: lload_2
/*     */     //   29: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   34: athrow
/*     */     //   35: lload #4
/*     */     //   37: lreturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #49	-> 6
/*     */     //   #96	-> 10
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   10	25	25	aacinternal/v
/*     */   }
/*     */ 
/*     */   
/*     */   public static double a(String paramString, double paramDouble) {
/*     */     
/*     */     try { return Double.parseDouble(paramString); }
/* 191 */     catch (Throwable throwable) { return paramDouble; } 
/*     */   } public static float e(float paramFloat) { return (float)Math.sqrt(paramFloat); } public static int a(long paramLong, float paramFloat) { // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/e5.h : J
/*     */     //   3: lload_0
/*     */     //   4: lxor
/*     */     //   5: lstore_0
/*     */     //   6: ldc2_w 8497761876907048526
/*     */     //   9: lload_0
/*     */     //   10: <illegal opcode> w : (JJ)[I
/*     */     //   15: fload_2
/*     */     //   16: f2i
/*     */     //   17: istore #4
/*     */     //   19: astore_3
/*     */     //   20: fload_2
/*     */     //   21: iload #4
/*     */     //   23: i2f
/*     */     //   24: fcmpl
/*     */     //   25: aload_3
/*     */     //   26: ifnull -> 62
/*     */     //   29: ifle -> 65
/*     */     //   32: goto -> 45
/*     */     //   35: ldc2_w 8479445752854902829
/*     */     //   38: lload_0
/*     */     //   39: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   44: athrow
/*     */     //   45: iload #4
/*     */     //   47: iconst_1
/*     */     //   48: iadd
/*     */     //   49: goto -> 62
/*     */     //   52: ldc2_w 8479445752854902829
/*     */     //   55: lload_0
/*     */     //   56: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   61: athrow
/*     */     //   62: goto -> 67
/*     */     //   65: iload #4
/*     */     //   67: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #66	-> 15
/*     */     //   #177	-> 20
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   20	32	35	aacinternal/v
/*     */     //   29	49	52	aacinternal/v } public static int d(int paramInt1, int paramInt2, long paramLong) { // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/e5.h : J
/*     */     //   3: lload_2
/*     */     //   4: lxor
/*     */     //   5: lstore_2
/*     */     //   6: iload_0
/*     */     //   7: ldc_w 16711680
/*     */     //   10: iand
/*     */     //   11: bipush #16
/*     */     //   13: ishr
/*     */     //   14: istore #5
/*     */     //   16: iload_1
/*     */     //   17: ldc_w 16711680
/*     */     //   20: iand
/*     */     //   21: bipush #16
/*     */     //   23: ishr
/*     */     //   24: istore #6
/*     */     //   26: iload_0
/*     */     //   27: ldc_w 65280
/*     */     //   30: iand
/*     */     //   31: bipush #8
/*     */     //   33: ishr
/*     */     //   34: istore #7
/*     */     //   36: iload_1
/*     */     //   37: ldc_w 65280
/*     */     //   40: iand
/*     */     //   41: bipush #8
/*     */     //   43: ishr
/*     */     //   44: istore #8
/*     */     //   46: iload_0
/*     */     //   47: sipush #255
/*     */     //   50: iand
/*     */     //   51: istore #9
/*     */     //   53: ldc2_w 7951144039914382840
/*     */     //   56: lload_2
/*     */     //   57: <illegal opcode> w : (JJ)[I
/*     */     //   62: iload_1
/*     */     //   63: sipush #255
/*     */     //   66: iand
/*     */     //   67: istore #10
/*     */     //   69: iload #5
/*     */     //   71: i2f
/*     */     //   72: iload #6
/*     */     //   74: i2f
/*     */     //   75: fmul
/*     */     //   76: ldc_w 255.0
/*     */     //   79: fdiv
/*     */     //   80: f2i
/*     */     //   81: istore #11
/*     */     //   83: iload #7
/*     */     //   85: i2f
/*     */     //   86: iload #8
/*     */     //   88: i2f
/*     */     //   89: fmul
/*     */     //   90: ldc_w 255.0
/*     */     //   93: fdiv
/*     */     //   94: f2i
/*     */     //   95: istore #12
/*     */     //   97: astore #4
/*     */     //   99: iload #9
/*     */     //   101: i2f
/*     */     //   102: iload #10
/*     */     //   104: i2f
/*     */     //   105: fmul
/*     */     //   106: ldc_w 255.0
/*     */     //   109: fdiv
/*     */     //   110: f2i
/*     */     //   111: istore #13
/*     */     //   113: iload_0
/*     */     //   114: ldc_w -16777216
/*     */     //   117: iand
/*     */     //   118: iload #11
/*     */     //   120: bipush #16
/*     */     //   122: ishl
/*     */     //   123: ior
/*     */     //   124: iload #12
/*     */     //   126: bipush #8
/*     */     //   128: ishl
/*     */     //   129: ior
/*     */     //   130: iload #13
/*     */     //   132: ior
/*     */     //   133: aload #4
/*     */     //   135: ifnonnull -> 164
/*     */     //   138: iconst_3
/*     */     //   139: anewarray me/konsolas/aac/aN
/*     */     //   142: ldc2_w 7956624848703961022
/*     */     //   145: lload_2
/*     */     //   146: <illegal opcode> w : ([Lme/konsolas/aac/aN;JJ)V
/*     */     //   151: goto -> 164
/*     */     //   154: ldc2_w 7933993423415370651
/*     */     //   157: lload_2
/*     */     //   158: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   163: athrow
/*     */     //   164: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #72	-> 6
/*     */     //   #176	-> 16
/*     */     //   #181	-> 26
/*     */     //   #43	-> 36
/*     */     //   #32	-> 46
/*     */     //   #58	-> 62
/*     */     //   #158	-> 69
/*     */     //   #21	-> 83
/*     */     //   #167	-> 99
/*     */     //   #61	-> 113
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   113	151	154	aacinternal/v }
/*     */   public static int e(int paramInt, long paramLong) { // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/e5.h : J
/*     */     //   3: lload_1
/*     */     //   4: lxor
/*     */     //   5: lstore_1
/*     */     //   6: lload_1
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 53293816951649
/*     */     //   11: lxor
/*     */     //   12: dup2
/*     */     //   13: bipush #48
/*     */     //   15: lushr
/*     */     //   16: l2i
/*     */     //   17: istore_3
/*     */     //   18: dup2
/*     */     //   19: bipush #16
/*     */     //   21: lshl
/*     */     //   22: bipush #32
/*     */     //   24: lushr
/*     */     //   25: l2i
/*     */     //   26: istore #4
/*     */     //   28: dup2
/*     */     //   29: bipush #48
/*     */     //   31: lshl
/*     */     //   32: bipush #48
/*     */     //   34: lushr
/*     */     //   35: l2i
/*     */     //   36: istore #5
/*     */     //   38: pop2
/*     */     //   39: pop2
/*     */     //   40: ldc2_w 8396764562197430055
/*     */     //   43: lload_1
/*     */     //   44: <illegal opcode> w : (JJ)[I
/*     */     //   49: astore #6
/*     */     //   51: iload_3
/*     */     //   52: i2s
/*     */     //   53: iload #4
/*     */     //   55: iload #5
/*     */     //   57: i2c
/*     */     //   58: iload_0
/*     */     //   59: invokestatic a : (SICI)Z
/*     */     //   62: aload #6
/*     */     //   64: ifnull -> 98
/*     */     //   67: ifeq -> 97
/*     */     //   70: goto -> 83
/*     */     //   73: ldc2_w 8413950586560936260
/*     */     //   76: lload_1
/*     */     //   77: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   82: athrow
/*     */     //   83: iload_0
/*     */     //   84: goto -> 101
/*     */     //   87: ldc2_w 8413950586560936260
/*     */     //   90: lload_1
/*     */     //   91: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   96: athrow
/*     */     //   97: iload_0
/*     */     //   98: invokestatic f : (I)I
/*     */     //   101: istore_0
/*     */     //   102: getstatic me/konsolas/aac/e5.f : [I
/*     */     //   105: iload_0
/*     */     //   106: i2l
/*     */     //   107: ldc2_w 125613361
/*     */     //   110: lmul
/*     */     //   111: bipush #27
/*     */     //   113: lshr
/*     */     //   114: l2i
/*     */     //   115: bipush #31
/*     */     //   117: iand
/*     */     //   118: iaload
/*     */     //   119: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #74	-> 51
/*     */     //   #34	-> 102
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   51	70	73	aacinternal/v
/*     */     //   67	87	87	aacinternal/v }
/* 194 */   public static long a(int paramInt1, int paramInt2, int paramInt3) { long l = paramInt1 * 3129871L ^ paramInt3 * 116129781L ^ paramInt2; l = l * l * 42317861L + l * 11L; return l >> 16L; }
/*     */ 
/*     */   
/*     */   public static int b(long paramLong, double paramDouble) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/e5.h : J
/*     */     //   3: lload_0
/*     */     //   4: lxor
/*     */     //   5: lstore_0
/*     */     //   6: ldc2_w 2475572909964716539
/*     */     //   9: lload_0
/*     */     //   10: <illegal opcode> w : (JJ)[I
/*     */     //   15: dload_2
/*     */     //   16: d2i
/*     */     //   17: istore #5
/*     */     //   19: astore #4
/*     */     //   21: dload_2
/*     */     //   22: iload #5
/*     */     //   24: i2d
/*     */     //   25: dcmpl
/*     */     //   26: aload #4
/*     */     //   28: ifnull -> 64
/*     */     //   31: ifle -> 67
/*     */     //   34: goto -> 47
/*     */     //   37: ldc2_w 2456739886627827608
/*     */     //   40: lload_0
/*     */     //   41: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   46: athrow
/*     */     //   47: iload #5
/*     */     //   49: iconst_1
/*     */     //   50: iadd
/*     */     //   51: goto -> 64
/*     */     //   54: ldc2_w 2456739886627827608
/*     */     //   57: lload_0
/*     */     //   58: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   63: athrow
/*     */     //   64: goto -> 69
/*     */     //   67: iload #5
/*     */     //   69: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #77	-> 15
/*     */     //   #52	-> 21
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   21	34	37	aacinternal/v
/*     */     //   31	51	54	aacinternal/v
/*     */   }
/*     */   
/*     */   public static float a(long paramLong, float paramFloat1, float paramFloat2) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/e5.h : J
/*     */     //   3: lload_0
/*     */     //   4: lxor
/*     */     //   5: lstore_0
/*     */     //   6: lload_0
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 2312787584456
/*     */     //   11: lxor
/*     */     //   12: lstore #4
/*     */     //   14: pop2
/*     */     //   15: ldc2_w -1482425613352558387
/*     */     //   18: lload_0
/*     */     //   19: <illegal opcode> w : (JJ)[I
/*     */     //   24: fload_2
/*     */     //   25: fload_3
/*     */     //   26: fsub
/*     */     //   27: lload #4
/*     */     //   29: dup2_x1
/*     */     //   30: pop2
/*     */     //   31: invokestatic c : (JF)F
/*     */     //   34: fstore #7
/*     */     //   36: astore #6
/*     */     //   38: fload #7
/*     */     //   40: ldc 180.0
/*     */     //   42: aload #6
/*     */     //   44: ifnull -> 83
/*     */     //   47: fcmpg
/*     */     //   48: ifge -> 79
/*     */     //   51: goto -> 64
/*     */     //   54: ldc2_w -1500179878214572370
/*     */     //   57: lload_0
/*     */     //   58: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   63: athrow
/*     */     //   64: fload #7
/*     */     //   66: goto -> 84
/*     */     //   69: ldc2_w -1500179878214572370
/*     */     //   72: lload_0
/*     */     //   73: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   78: athrow
/*     */     //   79: fload #7
/*     */     //   81: ldc 360.0
/*     */     //   83: fsub
/*     */     //   84: freturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #80	-> 24
/*     */     //   #108	-> 38
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   38	51	54	aacinternal/v
/*     */     //   47	69	69	aacinternal/v
/*     */   }
/*     */   
/*     */   public static double c(double paramDouble) {
/*     */     double d = 0.5D * paramDouble;
/*     */     long l = Double.doubleToRawLongBits(paramDouble);
/*     */     l = 6910469410427058090L - (l >> 1L);
/*     */     paramDouble = Double.longBitsToDouble(l);
/*     */     paramDouble *= 1.5D - d * paramDouble * paramDouble;
/*     */     return paramDouble;
/*     */   }
/*     */   
/*     */   public static float a(double paramDouble) {
/*     */     return (float)Math.sqrt(paramDouble);
/*     */   }
/*     */   
/*     */   public static double a(int paramInt, char paramChar1, char paramChar2, double paramDouble) {
/*     */     // Byte code:
/*     */     //   0: iload_0
/*     */     //   1: i2l
/*     */     //   2: bipush #32
/*     */     //   4: lshl
/*     */     //   5: iload_1
/*     */     //   6: i2l
/*     */     //   7: bipush #48
/*     */     //   9: lshl
/*     */     //   10: bipush #32
/*     */     //   12: lushr
/*     */     //   13: lor
/*     */     //   14: iload_2
/*     */     //   15: i2l
/*     */     //   16: bipush #48
/*     */     //   18: lshl
/*     */     //   19: bipush #48
/*     */     //   21: lushr
/*     */     //   22: lor
/*     */     //   23: getstatic me/konsolas/aac/e5.h : J
/*     */     //   26: lxor
/*     */     //   27: lstore #5
/*     */     //   29: ldc2_w -5636779658137142682
/*     */     //   32: lload #5
/*     */     //   34: <illegal opcode> w : (JJ)[I
/*     */     //   39: dload_3
/*     */     //   40: ldc2_w 360.0
/*     */     //   43: drem
/*     */     //   44: dstore_3
/*     */     //   45: astore #7
/*     */     //   47: dload_3
/*     */     //   48: ldc2_w 180.0
/*     */     //   51: dcmpl
/*     */     //   52: aload #7
/*     */     //   54: ifnull -> 104
/*     */     //   57: iflt -> 80
/*     */     //   60: goto -> 74
/*     */     //   63: ldc2_w -5655055074646508539
/*     */     //   66: lload #5
/*     */     //   68: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   73: athrow
/*     */     //   74: dload_3
/*     */     //   75: ldc2_w 360.0
/*     */     //   78: dsub
/*     */     //   79: dstore_3
/*     */     //   80: dload_3
/*     */     //   81: aload #7
/*     */     //   83: ifnull -> 114
/*     */     //   86: ldc2_w -180.0
/*     */     //   89: dcmpg
/*     */     //   90: goto -> 104
/*     */     //   93: ldc2_w -5655055074646508539
/*     */     //   96: lload #5
/*     */     //   98: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   103: athrow
/*     */     //   104: ifge -> 113
/*     */     //   107: dload_3
/*     */     //   108: ldc2_w 360.0
/*     */     //   111: dadd
/*     */     //   112: dstore_3
/*     */     //   113: dload_3
/*     */     //   114: dreturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #87	-> 39
/*     */     //   #165	-> 47
/*     */     //   #12	-> 74
/*     */     //   #39	-> 80
/*     */     //   #50	-> 107
/*     */     //   #60	-> 113
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   47	60	63	aacinternal/v
/*     */     //   80	90	93	aacinternal/v
/*     */   }
/*     */   
/*     */   public static int a(int paramInt1, int paramInt2, int paramInt3) {
/*     */     int i = (paramInt1 << 8) + paramInt2;
/*     */     i = (i << 8) + paramInt3;
/*     */     return i;
/*     */   }
/*     */   
/*     */   public static int f(int paramInt) {
/*     */     int i = paramInt - 1;
/*     */     i |= i >> 1;
/*     */     i |= i >> 2;
/*     */     i |= i >> 4;
/*     */     i |= i >> 8;
/*     */     i |= i >> 16;
/*     */     return i + 1;
/*     */   }
/*     */   
/*     */   public static int a(int paramInt, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/e5.h : J
/*     */     //   3: lload_1
/*     */     //   4: lxor
/*     */     //   5: lstore_1
/*     */     //   6: ldc2_w -7347884669362024025
/*     */     //   9: lload_1
/*     */     //   10: <illegal opcode> w : (JJ)[I
/*     */     //   15: iload_0
/*     */     //   16: sipush #360
/*     */     //   19: irem
/*     */     //   20: istore_0
/*     */     //   21: astore_3
/*     */     //   22: iload_0
/*     */     //   23: sipush #180
/*     */     //   26: aload_3
/*     */     //   27: ifnull -> 73
/*     */     //   30: if_icmplt -> 52
/*     */     //   33: goto -> 46
/*     */     //   36: ldc2_w -7330727378859485244
/*     */     //   39: lload_1
/*     */     //   40: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   45: athrow
/*     */     //   46: wide iinc #0 -360
/*     */     //   52: iload_0
/*     */     //   53: aload_3
/*     */     //   54: ifnull -> 83
/*     */     //   57: sipush #-180
/*     */     //   60: goto -> 73
/*     */     //   63: ldc2_w -7330727378859485244
/*     */     //   66: lload_1
/*     */     //   67: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   72: athrow
/*     */     //   73: if_icmpge -> 82
/*     */     //   76: wide iinc #0 360
/*     */     //   82: iload_0
/*     */     //   83: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #99	-> 15
/*     */     //   #17	-> 22
/*     */     //   #126	-> 46
/*     */     //   #64	-> 52
/*     */     //   #8	-> 76
/*     */     //   #71	-> 82
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   22	33	36	aacinternal/v
/*     */     //   52	60	63	aacinternal/v
/*     */   }
/*     */   
/*     */   public static double c(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt) {
/*     */     // Byte code:
/*     */     //   0: lload_0
/*     */     //   1: bipush #32
/*     */     //   3: lshl
/*     */     //   4: iload #8
/*     */     //   6: i2l
/*     */     //   7: bipush #32
/*     */     //   9: lshl
/*     */     //   10: bipush #32
/*     */     //   12: lushr
/*     */     //   13: lor
/*     */     //   14: getstatic me/konsolas/aac/e5.h : J
/*     */     //   17: lxor
/*     */     //   18: lstore #9
/*     */     //   20: ldc2_w 7407716512133393773
/*     */     //   23: lload #9
/*     */     //   25: <illegal opcode> w : (JJ)[I
/*     */     //   30: astore #11
/*     */     //   32: dload_2
/*     */     //   33: dload #4
/*     */     //   35: aload #11
/*     */     //   37: ifnull -> 75
/*     */     //   40: dcmpg
/*     */     //   41: ifge -> 72
/*     */     //   44: goto -> 58
/*     */     //   47: ldc2_w 7389959970927373070
/*     */     //   50: lload #9
/*     */     //   52: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   57: athrow
/*     */     //   58: dload #4
/*     */     //   60: dreturn
/*     */     //   61: ldc2_w 7389959970927373070
/*     */     //   64: lload #9
/*     */     //   66: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   71: athrow
/*     */     //   72: dload_2
/*     */     //   73: dload #6
/*     */     //   75: invokestatic min : (DD)D
/*     */     //   78: dreturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #101	-> 32
/*     */     //   #10	-> 58
/*     */     //   #154	-> 72
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   32	44	47	aacinternal/v
/*     */     //   40	61	61	aacinternal/v
/*     */   }
/*     */   
/*     */   public static float b(float paramFloat1, int paramInt1, short paramShort, float paramFloat2, int paramInt2) {
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
/*     */     //   24: getstatic me/konsolas/aac/e5.h : J
/*     */     //   27: lxor
/*     */     //   28: lstore #5
/*     */     //   30: lload #5
/*     */     //   32: dup2
/*     */     //   33: ldc2_w 76811058363229
/*     */     //   36: lxor
/*     */     //   37: lstore #7
/*     */     //   39: dup2
/*     */     //   40: ldc2_w 64036810694972
/*     */     //   43: lxor
/*     */     //   44: lstore #9
/*     */     //   46: pop2
/*     */     //   47: ldc2_w -5793487409239464903
/*     */     //   50: lload #5
/*     */     //   52: <illegal opcode> w : (JJ)[I
/*     */     //   57: fload_0
/*     */     //   58: fload_3
/*     */     //   59: fsub
/*     */     //   60: lload #9
/*     */     //   62: dup2_x1
/*     */     //   63: pop2
/*     */     //   64: invokestatic c : (JF)F
/*     */     //   67: fstore #12
/*     */     //   69: astore #11
/*     */     //   71: fload #12
/*     */     //   73: ldc 180.0
/*     */     //   75: aload #11
/*     */     //   77: ifnull -> 123
/*     */     //   80: fcmpg
/*     */     //   81: ifge -> 119
/*     */     //   84: goto -> 98
/*     */     //   87: ldc2_w -5775177684033232294
/*     */     //   90: lload #5
/*     */     //   92: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   97: athrow
/*     */     //   98: fload #12
/*     */     //   100: lload #7
/*     */     //   102: invokestatic d : (FJ)F
/*     */     //   105: goto -> 129
/*     */     //   108: ldc2_w -5775177684033232294
/*     */     //   111: lload #5
/*     */     //   113: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   118: athrow
/*     */     //   119: fload #12
/*     */     //   121: ldc 360.0
/*     */     //   123: fsub
/*     */     //   124: lload #7
/*     */     //   126: invokestatic d : (FJ)F
/*     */     //   129: freturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #104	-> 57
/*     */     //   #107	-> 71
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   71	84	87	aacinternal/v
/*     */     //   80	108	108	aacinternal/v
/*     */   }
/*     */   
/*     */   public static float a(Random paramRandom, float paramFloat1, float paramFloat2, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/e5.h : J
/*     */     //   3: lload_3
/*     */     //   4: lxor
/*     */     //   5: lstore_3
/*     */     //   6: ldc2_w -7717062155336261817
/*     */     //   9: lload_3
/*     */     //   10: <illegal opcode> w : (JJ)[I
/*     */     //   15: astore #5
/*     */     //   17: fload_1
/*     */     //   18: fload_2
/*     */     //   19: aload #5
/*     */     //   21: ifnull -> 64
/*     */     //   24: fcmpl
/*     */     //   25: iflt -> 55
/*     */     //   28: goto -> 41
/*     */     //   31: ldc2_w -7735940335743231708
/*     */     //   34: lload_3
/*     */     //   35: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   40: athrow
/*     */     //   41: fload_1
/*     */     //   42: goto -> 65
/*     */     //   45: ldc2_w -7735940335743231708
/*     */     //   48: lload_3
/*     */     //   49: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   54: athrow
/*     */     //   55: aload_0
/*     */     //   56: invokevirtual nextFloat : ()F
/*     */     //   59: fload_2
/*     */     //   60: fload_1
/*     */     //   61: fsub
/*     */     //   62: fmul
/*     */     //   63: fload_1
/*     */     //   64: fadd
/*     */     //   65: freturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #106	-> 17
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   17	28	31	aacinternal/v
/*     */     //   24	45	45	aacinternal/v
/*     */   }
/*     */   
/*     */   public static int b(int paramInt1, int paramInt2) {
/*     */     return Math.floorMod(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public static Object a(Object paramObject, Consumer<Object> paramConsumer) {
/*     */     paramConsumer.accept(paramObject);
/*     */     return paramObject;
/*     */   }
/*     */   
/*     */   public static int d(double paramDouble) {
/*     */     return (int)(paramDouble + 1024.0D) - 1024;
/*     */   }
/*     */   
/*     */   public static int a(float paramFloat1, float paramFloat2, long paramLong, float paramFloat3) {
/*     */     paramLong = h ^ paramLong;
/*     */     int i = (int)((paramLong ^ 0x2CD5DCB0C6C4L) >>> 48L), j = (int)((paramLong ^ 0x2CD5DCB0C6C4L) << 16L >>> 32L), k = (int)((paramLong ^ 0x2CD5DCB0C6C4L) << 48L >>> 48L);
/*     */     paramLong ^ 0x2CD5DCB0C6C4L;
/*     */     return a(b(paramFloat1 * 255.0F, (short)i, j, k), b(paramFloat2 * 255.0F, (short)i, j, k), b(paramFloat3 * 255.0F, (short)i, j, k));
/*     */   }
/*     */   
/*     */   public static int b(float paramFloat, short paramShort, int paramInt1, int paramInt2) {
/*     */     // Byte code:
/*     */     //   0: iload_1
/*     */     //   1: i2l
/*     */     //   2: bipush #48
/*     */     //   4: lshl
/*     */     //   5: iload_2
/*     */     //   6: i2l
/*     */     //   7: bipush #32
/*     */     //   9: lshl
/*     */     //   10: bipush #16
/*     */     //   12: lushr
/*     */     //   13: lor
/*     */     //   14: iload_3
/*     */     //   15: i2l
/*     */     //   16: bipush #48
/*     */     //   18: lshl
/*     */     //   19: bipush #48
/*     */     //   21: lushr
/*     */     //   22: lor
/*     */     //   23: getstatic me/konsolas/aac/e5.h : J
/*     */     //   26: lxor
/*     */     //   27: lstore #4
/*     */     //   29: ldc2_w -1288006409465944704
/*     */     //   32: lload #4
/*     */     //   34: <illegal opcode> w : (JJ)[I
/*     */     //   39: fload_0
/*     */     //   40: f2i
/*     */     //   41: istore #7
/*     */     //   43: astore #6
/*     */     //   45: fload_0
/*     */     //   46: iload #7
/*     */     //   48: i2f
/*     */     //   49: fcmpg
/*     */     //   50: aload #6
/*     */     //   52: ifnull -> 90
/*     */     //   55: ifge -> 93
/*     */     //   58: goto -> 72
/*     */     //   61: ldc2_w -1269166934530595869
/*     */     //   64: lload #4
/*     */     //   66: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   71: athrow
/*     */     //   72: iload #7
/*     */     //   74: iconst_1
/*     */     //   75: isub
/*     */     //   76: goto -> 90
/*     */     //   79: ldc2_w -1269166934530595869
/*     */     //   82: lload #4
/*     */     //   84: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   89: athrow
/*     */     //   90: goto -> 95
/*     */     //   93: iload #7
/*     */     //   95: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #129	-> 39
/*     */     //   #156	-> 45
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   45	58	61	aacinternal/v
/*     */     //   55	76	79	aacinternal/v
/*     */   }
/*     */   
/*     */   public static double a(String paramString, double paramDouble1, double paramDouble2) {
/*     */     return Math.max(paramDouble2, a(paramString, paramDouble1));
/*     */   }
/*     */   
/*     */   public static int c(int paramInt1, int paramInt2) {
/*     */     return Math.floorDiv(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public static double a(Random paramRandom, long paramLong, double paramDouble1, double paramDouble2) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/e5.h : J
/*     */     //   3: lload_1
/*     */     //   4: lxor
/*     */     //   5: lstore_1
/*     */     //   6: ldc2_w -8204622862944680573
/*     */     //   9: lload_1
/*     */     //   10: <illegal opcode> w : (JJ)[I
/*     */     //   15: astore #7
/*     */     //   17: dload_3
/*     */     //   18: dload #5
/*     */     //   20: aload #7
/*     */     //   22: ifnull -> 66
/*     */     //   25: dcmpl
/*     */     //   26: iflt -> 56
/*     */     //   29: goto -> 42
/*     */     //   32: ldc2_w -8187467831058070560
/*     */     //   35: lload_1
/*     */     //   36: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   41: athrow
/*     */     //   42: dload_3
/*     */     //   43: goto -> 67
/*     */     //   46: ldc2_w -8187467831058070560
/*     */     //   49: lload_1
/*     */     //   50: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   55: athrow
/*     */     //   56: aload_0
/*     */     //   57: invokevirtual nextDouble : ()D
/*     */     //   60: dload #5
/*     */     //   62: dload_3
/*     */     //   63: dsub
/*     */     //   64: dmul
/*     */     //   65: dload_3
/*     */     //   66: dadd
/*     */     //   67: dreturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #139	-> 17
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   17	29	32	aacinternal/v
/*     */     //   25	46	46	aacinternal/v
/*     */   }
/*     */   
/*     */   public static float a(float paramFloat) {
/*     */     return b[(int)(paramFloat * 10430.378F + 16384.0F) & 0xFFFF];
/*     */   }
/*     */   
/*     */   public static float b(float paramFloat1, long paramLong, float paramFloat2, float paramFloat3) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/e5.h : J
/*     */     //   3: lload_1
/*     */     //   4: lxor
/*     */     //   5: lstore_1
/*     */     //   6: lload_1
/*     */     //   7: dup2
/*     */     //   8: ldc2_w 43289196615446
/*     */     //   11: lxor
/*     */     //   12: lstore #5
/*     */     //   14: dup2
/*     */     //   15: ldc2_w 90905641505852
/*     */     //   18: lxor
/*     */     //   19: lstore #7
/*     */     //   21: pop2
/*     */     //   22: ldc2_w 4886976660913752178
/*     */     //   25: lload_1
/*     */     //   26: <illegal opcode> w : (JJ)[I
/*     */     //   31: fload #4
/*     */     //   33: lload #5
/*     */     //   35: invokestatic d : (FJ)F
/*     */     //   38: fstore #4
/*     */     //   40: astore #12
/*     */     //   42: fload_0
/*     */     //   43: fload_3
/*     */     //   44: aload #12
/*     */     //   46: ifnull -> 97
/*     */     //   49: fcmpg
/*     */     //   50: ifge -> 92
/*     */     //   53: goto -> 66
/*     */     //   56: ldc2_w 4868691339813408273
/*     */     //   59: lload_1
/*     */     //   60: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   65: athrow
/*     */     //   66: fload_0
/*     */     //   67: fload #4
/*     */     //   69: fadd
/*     */     //   70: lload #7
/*     */     //   72: dup2_x1
/*     */     //   73: pop2
/*     */     //   74: fload_0
/*     */     //   75: fload_3
/*     */     //   76: invokestatic a : (JFFF)F
/*     */     //   79: goto -> 115
/*     */     //   82: ldc2_w 4868691339813408273
/*     */     //   85: lload_1
/*     */     //   86: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   91: athrow
/*     */     //   92: fload_0
/*     */     //   93: fload #4
/*     */     //   95: fsub
/*     */     //   96: fload_3
/*     */     //   97: fload_0
/*     */     //   98: fstore #9
/*     */     //   100: fstore #10
/*     */     //   102: fstore #11
/*     */     //   104: lload #7
/*     */     //   106: fload #11
/*     */     //   108: fload #10
/*     */     //   110: fload #9
/*     */     //   112: invokestatic a : (JFFF)F
/*     */     //   115: freturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #142	-> 31
/*     */     //   #59	-> 42
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   42	53	56	aacinternal/v
/*     */     //   49	82	82	aacinternal/v
/*     */   }
/*     */   
/*     */   public static int a(int paramInt1, int paramInt2, IntPredicate paramIntPredicate, long paramLong) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/e5.h : J
/*     */     //   3: lload_3
/*     */     //   4: lxor
/*     */     //   5: lstore_3
/*     */     //   6: ldc2_w 1138285197706708076
/*     */     //   9: lload_3
/*     */     //   10: <illegal opcode> w : (JJ)[I
/*     */     //   15: iload_1
/*     */     //   16: iload_0
/*     */     //   17: isub
/*     */     //   18: istore #6
/*     */     //   20: astore #5
/*     */     //   22: iload #6
/*     */     //   24: ifle -> 126
/*     */     //   27: iload #6
/*     */     //   29: iconst_2
/*     */     //   30: idiv
/*     */     //   31: istore #7
/*     */     //   33: iload_0
/*     */     //   34: iload #7
/*     */     //   36: iadd
/*     */     //   37: istore #8
/*     */     //   39: aload_2
/*     */     //   40: iload #8
/*     */     //   42: invokeinterface test : (I)Z
/*     */     //   47: aload #5
/*     */     //   49: lload_3
/*     */     //   50: lconst_0
/*     */     //   51: lcmp
/*     */     //   52: ifle -> 60
/*     */     //   55: ifnull -> 127
/*     */     //   58: aload #5
/*     */     //   60: ifnull -> 119
/*     */     //   63: goto -> 76
/*     */     //   66: ldc2_w 1121140946237260303
/*     */     //   69: lload_3
/*     */     //   70: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   75: athrow
/*     */     //   76: ifeq -> 107
/*     */     //   79: goto -> 92
/*     */     //   82: ldc2_w 1121140946237260303
/*     */     //   85: lload_3
/*     */     //   86: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   91: athrow
/*     */     //   92: iload #7
/*     */     //   94: istore #6
/*     */     //   96: aload #5
/*     */     //   98: lload_3
/*     */     //   99: lconst_0
/*     */     //   100: lcmp
/*     */     //   101: iflt -> 123
/*     */     //   104: ifnonnull -> 121
/*     */     //   107: iload #8
/*     */     //   109: iconst_1
/*     */     //   110: iadd
/*     */     //   111: istore_0
/*     */     //   112: iload #6
/*     */     //   114: iload #7
/*     */     //   116: iconst_1
/*     */     //   117: iadd
/*     */     //   118: isub
/*     */     //   119: istore #6
/*     */     //   121: aload #5
/*     */     //   123: ifnonnull -> 22
/*     */     //   126: iload_0
/*     */     //   127: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #148	-> 15
/*     */     //   #119	-> 22
/*     */     //   #175	-> 27
/*     */     //   #143	-> 33
/*     */     //   #18	-> 39
/*     */     //   #27	-> 92
/*     */     //   #22	-> 107
/*     */     //   #145	-> 112
/*     */     //   #38	-> 121
/*     */     //   #48	-> 126
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   39	63	66	aacinternal/v
/*     */     //   58	79	82	aacinternal/v
/*     */   }
/*     */   
/*     */   public static double b(double paramDouble) {
/*     */     return paramDouble - Math.floor(paramDouble);
/*     */   }
/*     */   
/*     */   public static UUID a(Random paramRandom) {
/*     */     long l1 = paramRandom.nextLong() & 0xFFFFFFFFFFFF0FFFL | 0x4000L;
/*     */     long l2 = paramRandom.nextLong() & 0x3FFFFFFFFFFFFFFFL | Long.MIN_VALUE;
/*     */     return new UUID(l1, l2);
/*     */   }
/*     */   
/*     */   public static int a(int paramInt1, short paramShort, char paramChar, int paramInt2, int paramInt3) {
/*     */     // Byte code:
/*     */     //   0: iload_0
/*     */     //   1: i2l
/*     */     //   2: bipush #32
/*     */     //   4: lshl
/*     */     //   5: iload_1
/*     */     //   6: i2l
/*     */     //   7: bipush #48
/*     */     //   9: lshl
/*     */     //   10: bipush #32
/*     */     //   12: lushr
/*     */     //   13: lor
/*     */     //   14: iload_2
/*     */     //   15: i2l
/*     */     //   16: bipush #48
/*     */     //   18: lshl
/*     */     //   19: bipush #48
/*     */     //   21: lushr
/*     */     //   22: lor
/*     */     //   23: getstatic me/konsolas/aac/e5.h : J
/*     */     //   26: lxor
/*     */     //   27: lstore #5
/*     */     //   29: ldc2_w 4293679784436035638
/*     */     //   32: lload #5
/*     */     //   34: <illegal opcode> w : (JJ)[I
/*     */     //   39: astore #7
/*     */     //   41: iload #4
/*     */     //   43: aload #7
/*     */     //   45: ifnull -> 79
/*     */     //   48: ifne -> 78
/*     */     //   51: goto -> 65
/*     */     //   54: ldc2_w 4311388058830190165
/*     */     //   57: lload #5
/*     */     //   59: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   64: athrow
/*     */     //   65: iconst_0
/*     */     //   66: ireturn
/*     */     //   67: ldc2_w 4311388058830190165
/*     */     //   70: lload #5
/*     */     //   72: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   77: athrow
/*     */     //   78: iload_3
/*     */     //   79: aload #7
/*     */     //   81: iload_0
/*     */     //   82: iflt -> 122
/*     */     //   85: ifnull -> 120
/*     */     //   88: ifne -> 119
/*     */     //   91: goto -> 105
/*     */     //   94: ldc2_w 4311388058830190165
/*     */     //   97: lload #5
/*     */     //   99: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   104: athrow
/*     */     //   105: iload #4
/*     */     //   107: ireturn
/*     */     //   108: ldc2_w 4311388058830190165
/*     */     //   111: lload #5
/*     */     //   113: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   118: athrow
/*     */     //   119: iload_3
/*     */     //   120: aload #7
/*     */     //   122: ifnull -> 152
/*     */     //   125: ifge -> 148
/*     */     //   128: goto -> 142
/*     */     //   131: ldc2_w 4311388058830190165
/*     */     //   134: lload #5
/*     */     //   136: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   141: athrow
/*     */     //   142: iload #4
/*     */     //   144: iconst_m1
/*     */     //   145: imul
/*     */     //   146: istore #4
/*     */     //   148: iload_3
/*     */     //   149: iload #4
/*     */     //   151: irem
/*     */     //   152: istore #8
/*     */     //   154: iload #8
/*     */     //   156: aload #7
/*     */     //   158: ifnull -> 197
/*     */     //   161: ifne -> 193
/*     */     //   164: goto -> 178
/*     */     //   167: ldc2_w 4311388058830190165
/*     */     //   170: lload #5
/*     */     //   172: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   177: athrow
/*     */     //   178: iload_3
/*     */     //   179: goto -> 200
/*     */     //   182: ldc2_w 4311388058830190165
/*     */     //   185: lload #5
/*     */     //   187: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   192: athrow
/*     */     //   193: iload_3
/*     */     //   194: iload #4
/*     */     //   196: iadd
/*     */     //   197: iload #8
/*     */     //   199: isub
/*     */     //   200: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #151	-> 41
/*     */     //   #100	-> 65
/*     */     //   #53	-> 78
/*     */     //   #171	-> 105
/*     */     //   #55	-> 119
/*     */     //   #130	-> 142
/*     */     //   #141	-> 148
/*     */     //   #169	-> 154
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   41	51	54	aacinternal/v
/*     */     //   48	67	67	aacinternal/v
/*     */     //   79	91	94	aacinternal/v
/*     */     //   88	108	108	aacinternal/v
/*     */     //   120	128	131	aacinternal/v
/*     */     //   154	164	167	aacinternal/v
/*     */     //   161	182	182	aacinternal/v
/*     */   }
/*     */   
/*     */   public static float c(float paramFloat1, float paramFloat2) {
/*     */     return (paramFloat1 % paramFloat2 + paramFloat2) % paramFloat2;
/*     */   }
/*     */   
/*     */   public static int c(int paramInt1, char paramChar, int paramInt2, short paramShort) {
/*     */     // Byte code:
/*     */     //   0: iload_0
/*     */     //   1: i2l
/*     */     //   2: bipush #32
/*     */     //   4: lshl
/*     */     //   5: iload_1
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
/*     */     //   23: getstatic me/konsolas/aac/e5.h : J
/*     */     //   26: lxor
/*     */     //   27: lstore #4
/*     */     //   29: lload #4
/*     */     //   31: dup2
/*     */     //   32: ldc2_w 18332418836078
/*     */     //   35: lxor
/*     */     //   36: dup2
/*     */     //   37: bipush #48
/*     */     //   39: lushr
/*     */     //   40: l2i
/*     */     //   41: istore #6
/*     */     //   43: dup2
/*     */     //   44: bipush #16
/*     */     //   46: lshl
/*     */     //   47: bipush #32
/*     */     //   49: lushr
/*     */     //   50: l2i
/*     */     //   51: istore #7
/*     */     //   53: dup2
/*     */     //   54: bipush #48
/*     */     //   56: lshl
/*     */     //   57: bipush #48
/*     */     //   59: lushr
/*     */     //   60: l2i
/*     */     //   61: istore #8
/*     */     //   63: pop2
/*     */     //   64: dup2
/*     */     //   65: ldc2_w 127499920861627
/*     */     //   68: lxor
/*     */     //   69: lstore #9
/*     */     //   71: pop2
/*     */     //   72: ldc2_w 4722143186704304680
/*     */     //   75: lload #4
/*     */     //   77: <illegal opcode> w : (JJ)[I
/*     */     //   82: astore #11
/*     */     //   84: iload_2
/*     */     //   85: lload #9
/*     */     //   87: invokestatic e : (IJ)I
/*     */     //   90: iload #6
/*     */     //   92: i2s
/*     */     //   93: iload #7
/*     */     //   95: iload #8
/*     */     //   97: i2c
/*     */     //   98: iload_2
/*     */     //   99: invokestatic a : (SICI)Z
/*     */     //   102: aload #11
/*     */     //   104: ifnull -> 125
/*     */     //   107: ifeq -> 128
/*     */     //   110: goto -> 124
/*     */     //   113: ldc2_w 4741019022339886155
/*     */     //   116: lload #4
/*     */     //   118: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   123: athrow
/*     */     //   124: iconst_0
/*     */     //   125: goto -> 129
/*     */     //   128: iconst_1
/*     */     //   129: isub
/*     */     //   130: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #159	-> 84
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   84	110	113	aacinternal/v
/*     */   }
/*     */   
/*     */   public static double c(long paramLong, double paramDouble1, int paramInt, double paramDouble2) {
/*     */     // Byte code:
/*     */     //   0: lload_0
/*     */     //   1: bipush #32
/*     */     //   3: lshl
/*     */     //   4: iload #4
/*     */     //   6: i2l
/*     */     //   7: bipush #32
/*     */     //   9: lshl
/*     */     //   10: bipush #32
/*     */     //   12: lushr
/*     */     //   13: lor
/*     */     //   14: getstatic me/konsolas/aac/e5.h : J
/*     */     //   17: lxor
/*     */     //   18: lstore #7
/*     */     //   20: ldc2_w 2506897667024152938
/*     */     //   23: lload #7
/*     */     //   25: <illegal opcode> w : (JJ)[I
/*     */     //   30: dload #5
/*     */     //   32: dload #5
/*     */     //   34: dmul
/*     */     //   35: dload_2
/*     */     //   36: dload_2
/*     */     //   37: dmul
/*     */     //   38: dadd
/*     */     //   39: dstore #10
/*     */     //   41: astore #9
/*     */     //   43: dload #10
/*     */     //   45: invokestatic isNaN : (D)Z
/*     */     //   48: aload #9
/*     */     //   50: ifnull -> 88
/*     */     //   53: ifeq -> 85
/*     */     //   56: goto -> 70
/*     */     //   59: ldc2_w 2488623341850603273
/*     */     //   62: lload #7
/*     */     //   64: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   69: athrow
/*     */     //   70: ldc2_w NaN
/*     */     //   73: dreturn
/*     */     //   74: ldc2_w 2488623341850603273
/*     */     //   77: lload #7
/*     */     //   79: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   84: athrow
/*     */     //   85: dload_2
/*     */     //   86: dconst_0
/*     */     //   87: dcmpg
/*     */     //   88: aload #9
/*     */     //   90: ifnull -> 111
/*     */     //   93: ifge -> 114
/*     */     //   96: goto -> 110
/*     */     //   99: ldc2_w 2488623341850603273
/*     */     //   102: lload #7
/*     */     //   104: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   109: athrow
/*     */     //   110: iconst_1
/*     */     //   111: goto -> 115
/*     */     //   114: iconst_0
/*     */     //   115: istore #12
/*     */     //   117: iload #12
/*     */     //   119: aload #9
/*     */     //   121: iload #4
/*     */     //   123: ifge -> 155
/*     */     //   126: ifnull -> 153
/*     */     //   129: ifeq -> 149
/*     */     //   132: goto -> 146
/*     */     //   135: ldc2_w 2488623341850603273
/*     */     //   138: lload #7
/*     */     //   140: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   145: athrow
/*     */     //   146: dload_2
/*     */     //   147: dneg
/*     */     //   148: dstore_2
/*     */     //   149: dload #5
/*     */     //   151: dconst_0
/*     */     //   152: dcmpg
/*     */     //   153: aload #9
/*     */     //   155: ifnull -> 176
/*     */     //   158: ifge -> 179
/*     */     //   161: goto -> 175
/*     */     //   164: ldc2_w 2488623341850603273
/*     */     //   167: lload #7
/*     */     //   169: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   174: athrow
/*     */     //   175: iconst_1
/*     */     //   176: goto -> 180
/*     */     //   179: iconst_0
/*     */     //   180: istore #13
/*     */     //   182: iload #13
/*     */     //   184: aload #9
/*     */     //   186: lload_0
/*     */     //   187: lconst_0
/*     */     //   188: lcmp
/*     */     //   189: iflt -> 223
/*     */     //   192: ifnull -> 221
/*     */     //   195: ifeq -> 217
/*     */     //   198: goto -> 212
/*     */     //   201: ldc2_w 2488623341850603273
/*     */     //   204: lload #7
/*     */     //   206: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   211: athrow
/*     */     //   212: dload #5
/*     */     //   214: dneg
/*     */     //   215: dstore #5
/*     */     //   217: dload_2
/*     */     //   218: dload #5
/*     */     //   220: dcmpl
/*     */     //   221: aload #9
/*     */     //   223: ifnull -> 244
/*     */     //   226: ifle -> 247
/*     */     //   229: goto -> 243
/*     */     //   232: ldc2_w 2488623341850603273
/*     */     //   235: lload #7
/*     */     //   237: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   242: athrow
/*     */     //   243: iconst_1
/*     */     //   244: goto -> 248
/*     */     //   247: iconst_0
/*     */     //   248: istore #14
/*     */     //   250: iload #14
/*     */     //   252: ifeq -> 265
/*     */     //   255: dload #5
/*     */     //   257: dstore #15
/*     */     //   259: dload_2
/*     */     //   260: dstore #5
/*     */     //   262: dload #15
/*     */     //   264: dstore_2
/*     */     //   265: dload #10
/*     */     //   267: invokestatic c : (D)D
/*     */     //   270: dstore #15
/*     */     //   272: dload #5
/*     */     //   274: dload #15
/*     */     //   276: dmul
/*     */     //   277: dstore #5
/*     */     //   279: dload_2
/*     */     //   280: dload #15
/*     */     //   282: dmul
/*     */     //   283: dstore_2
/*     */     //   284: getstatic me/konsolas/aac/e5.g : D
/*     */     //   287: dload_2
/*     */     //   288: dadd
/*     */     //   289: dstore #17
/*     */     //   291: dload #17
/*     */     //   293: invokestatic doubleToRawLongBits : (D)J
/*     */     //   296: l2i
/*     */     //   297: istore #19
/*     */     //   299: getstatic me/konsolas/aac/e5.a : [D
/*     */     //   302: iload #19
/*     */     //   304: daload
/*     */     //   305: dstore #20
/*     */     //   307: getstatic me/konsolas/aac/e5.d : [D
/*     */     //   310: iload #19
/*     */     //   312: daload
/*     */     //   313: dstore #22
/*     */     //   315: dload #17
/*     */     //   317: getstatic me/konsolas/aac/e5.g : D
/*     */     //   320: dsub
/*     */     //   321: dstore #24
/*     */     //   323: dload_2
/*     */     //   324: dload #22
/*     */     //   326: dmul
/*     */     //   327: dload #5
/*     */     //   329: dload #24
/*     */     //   331: dmul
/*     */     //   332: dsub
/*     */     //   333: dstore #26
/*     */     //   335: ldc2_w 6.0
/*     */     //   338: dload #26
/*     */     //   340: dload #26
/*     */     //   342: dmul
/*     */     //   343: dadd
/*     */     //   344: dload #26
/*     */     //   346: dmul
/*     */     //   347: ldc2_w 0.16666666666666666
/*     */     //   350: dmul
/*     */     //   351: dstore #28
/*     */     //   353: dload #20
/*     */     //   355: dload #28
/*     */     //   357: dadd
/*     */     //   358: dstore #30
/*     */     //   360: iload #14
/*     */     //   362: aload #9
/*     */     //   364: lload_0
/*     */     //   365: lconst_0
/*     */     //   366: lcmp
/*     */     //   367: iflt -> 402
/*     */     //   370: ifnull -> 400
/*     */     //   373: ifeq -> 398
/*     */     //   376: goto -> 390
/*     */     //   379: ldc2_w 2488623341850603273
/*     */     //   382: lload #7
/*     */     //   384: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   389: athrow
/*     */     //   390: ldc2_w 1.5707963267948966
/*     */     //   393: dload #30
/*     */     //   395: dsub
/*     */     //   396: dstore #30
/*     */     //   398: iload #13
/*     */     //   400: aload #9
/*     */     //   402: ifnull -> 432
/*     */     //   405: ifeq -> 430
/*     */     //   408: goto -> 422
/*     */     //   411: ldc2_w 2488623341850603273
/*     */     //   414: lload #7
/*     */     //   416: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   421: athrow
/*     */     //   422: ldc2_w 3.141592653589793
/*     */     //   425: dload #30
/*     */     //   427: dsub
/*     */     //   428: dstore #30
/*     */     //   430: iload #12
/*     */     //   432: ifeq -> 440
/*     */     //   435: dload #30
/*     */     //   437: dneg
/*     */     //   438: dstore #30
/*     */     //   440: dload #30
/*     */     //   442: dreturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #163	-> 30
/*     */     //   #33	-> 43
/*     */     //   #122	-> 70
/*     */     //   #134	-> 85
/*     */     //   #93	-> 117
/*     */     //   #109	-> 146
/*     */     //   #68	-> 149
/*     */     //   #16	-> 182
/*     */     //   #124	-> 212
/*     */     //   #97	-> 217
/*     */     //   #168	-> 250
/*     */     //   #19	-> 255
/*     */     //   #4	-> 259
/*     */     //   #67	-> 262
/*     */     //   #40	-> 265
/*     */     //   #63	-> 272
/*     */     //   #138	-> 279
/*     */     //   #46	-> 284
/*     */     //   #162	-> 291
/*     */     //   #115	-> 299
/*     */     //   #123	-> 307
/*     */     //   #125	-> 315
/*     */     //   #30	-> 323
/*     */     //   #193	-> 335
/*     */     //   #174	-> 353
/*     */     //   #70	-> 360
/*     */     //   #147	-> 390
/*     */     //   #178	-> 398
/*     */     //   #102	-> 422
/*     */     //   #146	-> 430
/*     */     //   #79	-> 435
/*     */     //   #84	-> 440
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   43	56	59	aacinternal/v
/*     */     //   53	74	74	aacinternal/v
/*     */     //   88	96	99	aacinternal/v
/*     */     //   117	132	135	aacinternal/v
/*     */     //   153	161	164	aacinternal/v
/*     */     //   182	198	201	aacinternal/v
/*     */     //   221	229	232	aacinternal/v
/*     */     //   360	376	379	aacinternal/v
/*     */     //   400	408	411	aacinternal/v
/*     */   }
/*     */   
/*     */   public static int d(int paramInt) {
/*     */     paramInt ^= paramInt >>> 16;
/*     */     paramInt *= -2048144789;
/*     */     paramInt ^= paramInt >>> 13;
/*     */     paramInt *= -1028477387;
/*     */     paramInt ^= paramInt >>> 16;
/*     */     return paramInt;
/*     */   }
/*     */   
/*     */   public static double b(double paramDouble1, double paramDouble2) {
/*     */     return (paramDouble1 % paramDouble2 + paramDouble2) % paramDouble2;
/*     */   }
/*     */   
/*     */   public static int a(Random paramRandom, long paramLong, int paramInt1, int paramInt2) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/e5.h : J
/*     */     //   3: lload_1
/*     */     //   4: lxor
/*     */     //   5: lstore_1
/*     */     //   6: ldc2_w -441278984457473472
/*     */     //   9: lload_1
/*     */     //   10: <illegal opcode> w : (JJ)[I
/*     */     //   15: astore #5
/*     */     //   17: iload_3
/*     */     //   18: iload #4
/*     */     //   20: aload #5
/*     */     //   22: ifnull -> 66
/*     */     //   25: if_icmplt -> 55
/*     */     //   28: goto -> 41
/*     */     //   31: ldc2_w -458429823607639005
/*     */     //   34: lload_1
/*     */     //   35: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   40: athrow
/*     */     //   41: iload_3
/*     */     //   42: goto -> 67
/*     */     //   45: ldc2_w -458429823607639005
/*     */     //   48: lload_1
/*     */     //   49: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   54: athrow
/*     */     //   55: aload_0
/*     */     //   56: iload #4
/*     */     //   58: iload_3
/*     */     //   59: isub
/*     */     //   60: iconst_1
/*     */     //   61: iadd
/*     */     //   62: invokevirtual nextInt : (I)I
/*     */     //   65: iload_3
/*     */     //   66: iadd
/*     */     //   67: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #188	-> 17
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   17	28	31	aacinternal/v
/*     */     //   25	45	45	aacinternal/v
/*     */   }
/*     */   
/*     */   private static final long h = nc.a(-7181275099235700736L, 6736653402068311630L, MethodHandles.lookup().lookupClass()).a(92725443694252L);
/*     */   
/*     */   static {
/*     */     e = e(2.0F);
/*     */     b = (float[])a(new float[65536], paramArrayOffloat -> {
/*     */           // Byte code:
/*     */           //   0: getstatic me/konsolas/aac/e5.h : J
/*     */           //   3: ldc2_w 95293600855196
/*     */           //   6: lxor
/*     */           //   7: lstore_1
/*     */           //   8: ldc2_w -6247273493003345171
/*     */           //   11: lload_1
/*     */           //   12: <illegal opcode> w : (JJ)[I
/*     */           //   17: iconst_0
/*     */           //   18: istore #4
/*     */           //   20: astore_3
/*     */           //   21: iload #4
/*     */           //   23: aload_0
/*     */           //   24: arraylength
/*     */           //   25: if_icmpge -> 58
/*     */           //   28: aload_0
/*     */           //   29: iload #4
/*     */           //   31: iload #4
/*     */           //   33: i2d
/*     */           //   34: ldc2_w 3.141592653589793
/*     */           //   37: dmul
/*     */           //   38: ldc2_w 2.0
/*     */           //   41: dmul
/*     */           //   42: ldc2_w 65536.0
/*     */           //   45: ddiv
/*     */           //   46: invokestatic sin : (D)D
/*     */           //   49: d2f
/*     */           //   50: fastore
/*     */           //   51: iinc #4, 1
/*     */           //   54: aload_3
/*     */           //   55: ifnonnull -> 21
/*     */           //   58: return
/*     */           // Line number table:
/*     */           //   Java source line number -> byte code offset
/*     */           //   #161	-> 17
/*     */           //   #103	-> 28
/*     */           //   #44	-> 51
/*     */           //   #57	-> 58
/*     */         });
/*     */     c = new Random();
/*     */     f = new int[] { 
/*     */         0, 1, 28, 2, 29, 14, 24, 3, 30, 22, 
/*     */         20, 15, 25, 17, 4, 8, 31, 27, 13, 23, 
/*     */         21, 19, 16, 7, 26, 12, 18, 6, 11, 5, 
/*     */         10, 9 };
/*     */     g = Double.longBitsToDouble(4805340802404319232L);
/*     */     a = new double[257];
/*     */     d = new double[257];
/*     */     for (byte b = 0; b < 'ā'; b++) {
/*     */       double d1 = b / 256.0D;
/*     */       double d2 = Math.asin(d1);
/*     */       d[b] = Math.cos(d2);
/*     */       a[b] = d2;
/*     */     } 
/*     */   }
/*     */   
/*     */   public static float c(long paramLong, float paramFloat) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/e5.h : J
/*     */     //   3: lload_0
/*     */     //   4: lxor
/*     */     //   5: lstore_0
/*     */     //   6: ldc2_w -3309849983529444943
/*     */     //   9: lload_0
/*     */     //   10: <illegal opcode> w : (JJ)[I
/*     */     //   15: fload_2
/*     */     //   16: ldc 360.0
/*     */     //   18: frem
/*     */     //   19: fstore_2
/*     */     //   20: astore_3
/*     */     //   21: fload_2
/*     */     //   22: ldc 180.0
/*     */     //   24: fcmpl
/*     */     //   25: aload_3
/*     */     //   26: ifnull -> 71
/*     */     //   29: iflt -> 50
/*     */     //   32: goto -> 45
/*     */     //   35: ldc2_w -3291538265871491118
/*     */     //   38: lload_0
/*     */     //   39: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   44: athrow
/*     */     //   45: fload_2
/*     */     //   46: ldc 360.0
/*     */     //   48: fsub
/*     */     //   49: fstore_2
/*     */     //   50: fload_2
/*     */     //   51: aload_3
/*     */     //   52: ifnull -> 80
/*     */     //   55: ldc -180.0
/*     */     //   57: fcmpg
/*     */     //   58: goto -> 71
/*     */     //   61: ldc2_w -3291538265871491118
/*     */     //   64: lload_0
/*     */     //   65: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   70: athrow
/*     */     //   71: ifge -> 79
/*     */     //   74: fload_2
/*     */     //   75: ldc 360.0
/*     */     //   77: fadd
/*     */     //   78: fstore_2
/*     */     //   79: fload_2
/*     */     //   80: freturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #192	-> 15
/*     */     //   #180	-> 21
/*     */     //   #173	-> 45
/*     */     //   #152	-> 50
/*     */     //   #15	-> 74
/*     */     //   #114	-> 79
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   21	32	35	aacinternal/v
/*     */     //   50	58	61	aacinternal/v
/*     */   }
/*     */   
/*     */   public static int b(long paramLong, int paramInt) {
/*     */     // Byte code:
/*     */     //   0: getstatic me/konsolas/aac/e5.h : J
/*     */     //   3: lload_0
/*     */     //   4: lxor
/*     */     //   5: lstore_0
/*     */     //   6: ldc2_w -825453678108786901
/*     */     //   9: lload_0
/*     */     //   10: <illegal opcode> w : (JJ)[I
/*     */     //   15: astore_3
/*     */     //   16: iload_2
/*     */     //   17: aload_3
/*     */     //   18: ifnull -> 52
/*     */     //   21: iflt -> 51
/*     */     //   24: goto -> 37
/*     */     //   27: ldc2_w -808270944275269304
/*     */     //   30: lload_0
/*     */     //   31: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   36: athrow
/*     */     //   37: iload_2
/*     */     //   38: goto -> 53
/*     */     //   41: ldc2_w -808270944275269304
/*     */     //   44: lload_0
/*     */     //   45: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*     */     //   50: athrow
/*     */     //   51: iload_2
/*     */     //   52: ineg
/*     */     //   53: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #195	-> 16
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   16	24	27	aacinternal/v
/*     */     //   21	41	41	aacinternal/v
/*     */   }
/*     */   
/*     */   private static v a(v paramv) {
/*     */     return paramv;
/*     */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\e5.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */