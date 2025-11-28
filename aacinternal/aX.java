/*    */ package aacinternal;
/*    */ public class ax extends aw implements s, Serializable {
/*  3 */   public aa a(long paramLong) { long l = paramLong ^ 0x7377AF66173EL; return a(l); } private static final long d = nc.a(5861768710189595724L, 9018097040924561680L, MethodHandles.lookup().lookupClass()).a(40428613066608L); public void a(double paramDouble, long paramLong) {
/*  4 */     int i = (int)((paramLong ^ 0x139A6D66D477L) >>> 32L), j = (int)((paramLong ^ 0x139A6D66D477L) << 32L >>> 48L), k = (int)((paramLong ^ 0x139A6D66D477L) << 48L >>> 48L); paramLong ^ 0x139A6D66D477L; this.a += aL.h(paramDouble, i, j, k);
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
/* 25 */     this.c++;
/*    */   }
/*    */   
/*    */   public double a(double[] paramArrayOfdouble, int paramInt1, long paramLong, int paramInt2) {
/*    */     // Byte code:
/*    */     //   0: lload_3
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 56825965262196
/*    */     //   5: lxor
/*    */     //   6: dup2
/*    */     //   7: bipush #48
/*    */     //   9: lushr
/*    */     //   10: l2i
/*    */     //   11: istore #6
/*    */     //   13: dup2
/*    */     //   14: bipush #16
/*    */     //   16: lshl
/*    */     //   17: bipush #16
/*    */     //   19: lushr
/*    */     //   20: lstore #7
/*    */     //   22: pop2
/*    */     //   23: dup2
/*    */     //   24: ldc2_w 1602492336038
/*    */     //   27: lxor
/*    */     //   28: dup2
/*    */     //   29: bipush #32
/*    */     //   31: lushr
/*    */     //   32: l2i
/*    */     //   33: istore #9
/*    */     //   35: dup2
/*    */     //   36: bipush #32
/*    */     //   38: lshl
/*    */     //   39: bipush #48
/*    */     //   41: lushr
/*    */     //   42: l2i
/*    */     //   43: istore #10
/*    */     //   45: dup2
/*    */     //   46: bipush #48
/*    */     //   48: lshl
/*    */     //   49: bipush #48
/*    */     //   51: lushr
/*    */     //   52: l2i
/*    */     //   53: istore #11
/*    */     //   55: pop2
/*    */     //   56: pop2
/*    */     //   57: ldc2_w -4865440797987615073
/*    */     //   60: lload_3
/*    */     //   61: <illegal opcode> w : (JJ)[I
/*    */     //   66: ldc2_w NaN
/*    */     //   69: dstore #13
/*    */     //   71: astore #12
/*    */     //   73: iload #6
/*    */     //   75: i2s
/*    */     //   76: aload_1
/*    */     //   77: iload_2
/*    */     //   78: lload #7
/*    */     //   80: iload #5
/*    */     //   82: iconst_1
/*    */     //   83: invokestatic a : (S[DIJIZ)Z
/*    */     //   86: aload #12
/*    */     //   88: ifnull -> 111
/*    */     //   91: ifeq -> 153
/*    */     //   94: goto -> 107
/*    */     //   97: ldc2_w -4779046937677657975
/*    */     //   100: lload_3
/*    */     //   101: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   106: athrow
/*    */     //   107: dconst_0
/*    */     //   108: dstore #13
/*    */     //   110: iload_2
/*    */     //   111: istore #15
/*    */     //   113: iload #15
/*    */     //   115: iload_2
/*    */     //   116: iload #5
/*    */     //   118: iadd
/*    */     //   119: if_icmpge -> 153
/*    */     //   122: dload #13
/*    */     //   124: aload_1
/*    */     //   125: iload #15
/*    */     //   127: daload
/*    */     //   128: iload #9
/*    */     //   130: iload #10
/*    */     //   132: iload #11
/*    */     //   134: invokestatic h : (DIII)D
/*    */     //   137: dadd
/*    */     //   138: aload #12
/*    */     //   140: ifnull -> 155
/*    */     //   143: dstore #13
/*    */     //   145: iinc #15, 1
/*    */     //   148: aload #12
/*    */     //   150: ifnonnull -> 113
/*    */     //   153: dload #13
/*    */     //   155: dreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #5	-> 66
/*    */     //   #26	-> 73
/*    */     //   #28	-> 107
/*    */     //   #8	-> 110
/*    */     //   #33	-> 122
/*    */     //   #11	-> 145
/*    */     //   #1	-> 153
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   73	94	97	aacinternal/v
/*    */   }
/*    */   
/*    */   private double a = 0.0D;
/*    */   
/*    */   public void a(long paramLong, Object paramObject) {
/*    */     int i = (int)((paramLong ^ 0xBBD5579B6BAL) >>> 48L);
/*    */     long l = (paramLong ^ 0xBBD5579B6BAL) << 16L >>> 16L;
/*    */     paramLong ^ 0xBBD5579B6BAL;
/*    */     a((short)i, l, (ax)paramObject);
/*    */   }
/*    */   
/*    */   private int c = 0;
/*    */   private static final long serialVersionUID = 20150412L;
/*    */   
/*    */   public void a(short paramShort, long paramLong, ax paramax) {
/*    */     // Byte code:
/*    */     //   0: iload_1
/*    */     //   1: i2l
/*    */     //   2: bipush #48
/*    */     //   4: lshl
/*    */     //   5: lload_2
/*    */     //   6: bipush #16
/*    */     //   8: lshl
/*    */     //   9: bipush #16
/*    */     //   11: lushr
/*    */     //   12: lor
/*    */     //   13: getstatic aacinternal/ax.d : J
/*    */     //   16: lxor
/*    */     //   17: lstore #5
/*    */     //   19: lload #5
/*    */     //   21: dup2
/*    */     //   22: ldc2_w 102631472590983
/*    */     //   25: lxor
/*    */     //   26: lstore #7
/*    */     //   28: pop2
/*    */     //   29: ldc2_w -1553041948398970729
/*    */     //   32: lload #5
/*    */     //   34: <illegal opcode> w : (JJ)[I
/*    */     //   39: lload #7
/*    */     //   41: aload #4
/*    */     //   43: invokestatic a : (JLjava/lang/Object;)V
/*    */     //   46: astore #9
/*    */     //   48: aload #4
/*    */     //   50: aload #9
/*    */     //   52: ifnull -> 104
/*    */     //   55: getfield c : I
/*    */     //   58: ifle -> 117
/*    */     //   61: goto -> 75
/*    */     //   64: ldc2_w -1466645236231348607
/*    */     //   67: lload #5
/*    */     //   69: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   74: athrow
/*    */     //   75: aload_0
/*    */     //   76: dup
/*    */     //   77: getfield c : I
/*    */     //   80: aload #4
/*    */     //   82: getfield c : I
/*    */     //   85: iadd
/*    */     //   86: putfield c : I
/*    */     //   89: aload_0
/*    */     //   90: goto -> 104
/*    */     //   93: ldc2_w -1466645236231348607
/*    */     //   96: lload #5
/*    */     //   98: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   103: athrow
/*    */     //   104: dup
/*    */     //   105: getfield a : D
/*    */     //   108: aload #4
/*    */     //   110: getfield a : D
/*    */     //   113: dadd
/*    */     //   114: putfield a : D
/*    */     //   117: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #14	-> 39
/*    */     //   #30	-> 48
/*    */     //   #32	-> 75
/*    */     //   #19	-> 89
/*    */     //   #6	-> 117
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   48	61	64	aacinternal/g
/*    */     //   55	90	93	aacinternal/g
/*    */   }
/*    */   
/*    */   public ax a(long paramLong) {
/*    */     paramLong = d ^ paramLong;
/*    */     int i = (int)((paramLong ^ 0x1BF875EC8783L) >>> 56L), j = (int)((paramLong ^ 0x1BF875EC8783L) << 8L >>> 32L), k = (int)((paramLong ^ 0x1BF875EC8783L) << 40L >>> 40L);
/*    */     paramLong ^ 0x1BF875EC8783L;
/*    */     return new ax(this, (byte)i, j, k);
/*    */   }
/*    */   
/*    */   public c a(long paramLong) {
/*    */     long l = paramLong ^ 0x1D3A9B86B0D0L;
/*    */     return a(l);
/*    */   }
/*    */   
/*    */   public void a(long paramLong) {
/*    */     this.a = 0.0D;
/*    */     this.c = 0;
/*    */   }
/*    */   
/*    */   public double a(long paramLong) {
/*    */     return this.a;
/*    */   }
/*    */   
/*    */   public long a() {
/*    */     return this.c;
/*    */   }
/*    */   
/*    */   public ax(ax paramax, byte paramByte, int paramInt1, int paramInt2) {
/*    */     // Byte code:
/*    */     //   0: iload_2
/*    */     //   1: i2l
/*    */     //   2: bipush #56
/*    */     //   4: lshl
/*    */     //   5: iload_3
/*    */     //   6: i2l
/*    */     //   7: bipush #32
/*    */     //   9: lshl
/*    */     //   10: bipush #8
/*    */     //   12: lushr
/*    */     //   13: lor
/*    */     //   14: iload #4
/*    */     //   16: i2l
/*    */     //   17: bipush #40
/*    */     //   19: lshl
/*    */     //   20: bipush #40
/*    */     //   22: lushr
/*    */     //   23: lor
/*    */     //   24: getstatic aacinternal/ax.d : J
/*    */     //   27: lxor
/*    */     //   28: lstore #5
/*    */     //   30: lload #5
/*    */     //   32: dup2
/*    */     //   33: ldc2_w 26157907638532
/*    */     //   36: lxor
/*    */     //   37: lstore #7
/*    */     //   39: pop2
/*    */     //   40: ldc2_w 7201596713249509652
/*    */     //   43: lload #5
/*    */     //   45: <illegal opcode> w : (JJ)[I
/*    */     //   50: aload_0
/*    */     //   51: invokespecial <init> : ()V
/*    */     //   54: lload #7
/*    */     //   56: aload_1
/*    */     //   57: invokestatic a : (JLjava/lang/Object;)V
/*    */     //   60: astore #9
/*    */     //   62: aload_0
/*    */     //   63: aload_1
/*    */     //   64: getfield c : I
/*    */     //   67: putfield c : I
/*    */     //   70: aload_0
/*    */     //   71: aload_1
/*    */     //   72: getfield a : D
/*    */     //   75: putfield a : D
/*    */     //   78: aload #9
/*    */     //   80: ifnonnull -> 111
/*    */     //   83: iconst_4
/*    */     //   84: anewarray me/konsolas/aac/aN
/*    */     //   87: ldc2_w 7087998177406335880
/*    */     //   90: lload #5
/*    */     //   92: <illegal opcode> w : ([Lme/konsolas/aac/aN;JJ)V
/*    */     //   97: goto -> 111
/*    */     //   100: ldc2_w 7072383627867510530
/*    */     //   103: lload #5
/*    */     //   105: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   110: athrow
/*    */     //   111: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #31	-> 50
/*    */     //   #24	-> 54
/*    */     //   #29	-> 62
/*    */     //   #12	-> 70
/*    */     //   #27	-> 78
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   62	97	100	aacinternal/g
/*    */   }
/*    */   
/*    */   public ax() {}
/*    */   
/*    */   private static RuntimeException a(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\ax.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */