/*    */ package aacinternal;public class ay extends aw implements s, ad, Serializable { private static final long serialVersionUID = 20150412L; private long c;
/*    */   
/*    */   public void a(long paramLong) {
/*  4 */     this.a = 1.0D;
/*    */     this.c = 0L;
/*    */   }
/*    */   private double a; private static final long d = nc.a(459776461597149461L, -3473002280279432524L, MethodHandles.lookup().lookupClass()).a(73965832442822L);
/*    */   public void a(ay paramay, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic aacinternal/ay.d : J
/*    */     //   3: lload_2
/*    */     //   4: lxor
/*    */     //   5: lstore_2
/*    */     //   6: lload_2
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 83757386054280
/*    */     //   11: lxor
/*    */     //   12: lstore #4
/*    */     //   14: pop2
/*    */     //   15: ldc2_w -6882223808037563752
/*    */     //   18: lload_2
/*    */     //   19: <illegal opcode> w : (JJ)[I
/*    */     //   24: lload #4
/*    */     //   26: aload_1
/*    */     //   27: invokestatic a : (JLjava/lang/Object;)V
/*    */     //   30: astore #6
/*    */     //   32: aload_1
/*    */     //   33: aload #6
/*    */     //   35: ifnull -> 86
/*    */     //   38: getfield c : J
/*    */     //   41: lconst_0
/*    */     //   42: lcmp
/*    */     //   43: ifle -> 98
/*    */     //   46: goto -> 59
/*    */     //   49: ldc2_w -6805778913017101437
/*    */     //   52: lload_2
/*    */     //   53: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   58: athrow
/*    */     //   59: aload_0
/*    */     //   60: dup
/*    */     //   61: getfield c : J
/*    */     //   64: aload_1
/*    */     //   65: getfield c : J
/*    */     //   68: ladd
/*    */     //   69: putfield c : J
/*    */     //   72: aload_0
/*    */     //   73: goto -> 86
/*    */     //   76: ldc2_w -6805778913017101437
/*    */     //   79: lload_2
/*    */     //   80: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   85: athrow
/*    */     //   86: dup
/*    */     //   87: getfield a : D
/*    */     //   90: aload_1
/*    */     //   91: getfield a : D
/*    */     //   94: dmul
/*    */     //   95: putfield a : D
/*    */     //   98: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #9	-> 24
/*    */     //   #34	-> 32
/*    */     //   #28	-> 59
/*    */     //   #37	-> 72
/*    */     //   #32	-> 98
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   32	46	49	aacinternal/g
/*    */     //   38	73	76	aacinternal/g
/*    */   }
/*    */   
/*    */   public double a(long paramLong) {
/* 13 */     return this.a;
/*    */   } public aa a(long paramLong) {
/* 15 */     long l = paramLong ^ 0x2123F1B8DD3DL; return a(l);
/*    */   } public ay() {
/*    */     this.c = 0L;
/*    */     this.a = 1.0D;
/*    */   }
/* 20 */   public c a(long paramLong) { long l = paramLong ^ 0x4F6EC5587AD3L; return a(l); } public long a() {
/* 21 */     return this.c;
/*    */   }
/* 23 */   public void a(double paramDouble, long paramLong) { this.a *= paramDouble;
/*    */     this.c++; } public double a(double[] paramArrayOfdouble1, double[] paramArrayOfdouble2, int paramInt1, int paramInt2, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: lload #5
/*    */     //   2: dup2
/*    */     //   3: ldc2_w 81709578628827
/*    */     //   6: lxor
/*    */     //   7: lstore #7
/*    */     //   9: dup2
/*    */     //   10: ldc2_w 45314056409828
/*    */     //   13: lxor
/*    */     //   14: dup2
/*    */     //   15: bipush #16
/*    */     //   17: lushr
/*    */     //   18: lstore #9
/*    */     //   20: dup2
/*    */     //   21: bipush #48
/*    */     //   23: lshl
/*    */     //   24: bipush #48
/*    */     //   26: lushr
/*    */     //   27: l2i
/*    */     //   28: istore #11
/*    */     //   30: pop2
/*    */     //   31: pop2
/*    */     //   32: ldc2_w -7786349525302025964
/*    */     //   35: lload #5
/*    */     //   37: <illegal opcode> w : (JJ)[I
/*    */     //   42: ldc2_w NaN
/*    */     //   45: dstore #13
/*    */     //   47: astore #12
/*    */     //   49: aload_1
/*    */     //   50: lload #7
/*    */     //   52: aload_2
/*    */     //   53: iload_3
/*    */     //   54: iload #4
/*    */     //   56: iconst_1
/*    */     //   57: invokestatic a : ([DJ[DIIZ)Z
/*    */     //   60: aload #12
/*    */     //   62: ifnull -> 86
/*    */     //   65: ifeq -> 135
/*    */     //   68: goto -> 82
/*    */     //   71: ldc2_w -7925986153336033265
/*    */     //   74: lload #5
/*    */     //   76: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   81: athrow
/*    */     //   82: dconst_1
/*    */     //   83: dstore #13
/*    */     //   85: iload_3
/*    */     //   86: istore #15
/*    */     //   88: iload #15
/*    */     //   90: iload_3
/*    */     //   91: iload #4
/*    */     //   93: iadd
/*    */     //   94: if_icmpge -> 135
/*    */     //   97: dload #13
/*    */     //   99: aload_1
/*    */     //   100: iload #15
/*    */     //   102: daload
/*    */     //   103: aload_2
/*    */     //   104: iload #15
/*    */     //   106: daload
/*    */     //   107: lload #9
/*    */     //   109: dup2_x2
/*    */     //   110: pop2
/*    */     //   111: iload #11
/*    */     //   113: i2c
/*    */     //   114: dup_x2
/*    */     //   115: pop
/*    */     //   116: invokestatic g : (DJCD)D
/*    */     //   119: dmul
/*    */     //   120: aload #12
/*    */     //   122: ifnull -> 137
/*    */     //   125: dstore #13
/*    */     //   127: iinc #15, 1
/*    */     //   130: aload #12
/*    */     //   132: ifnonnull -> 88
/*    */     //   135: dload #13
/*    */     //   137: dreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #26	-> 42
/*    */     //   #16	-> 49
/*    */     //   #7	-> 82
/*    */     //   #30	-> 85
/*    */     //   #22	-> 97
/*    */     //   #19	-> 127
/*    */     //   #12	-> 135
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   49	68	71	aacinternal/v
/*    */   } public void a(long paramLong, Object paramObject) {
/* 27 */     long l = paramLong ^ 0x5629C5B7A8BBL; a((ay)paramObject, l);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public ay a(long paramLong) {
/* 33 */     paramLong = d ^ paramLong; long l = paramLong ^ 0x15F75504718BL; return new ay(l, this);
/*    */   } public double a(double[] paramArrayOfdouble, int paramInt1, long paramLong, int paramInt2) {
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
/*    */     //   23: pop2
/*    */     //   24: ldc2_w -4865440797987615073
/*    */     //   27: lload_3
/*    */     //   28: <illegal opcode> w : (JJ)[I
/*    */     //   33: ldc2_w NaN
/*    */     //   36: dstore #10
/*    */     //   38: astore #9
/*    */     //   40: iload #6
/*    */     //   42: i2s
/*    */     //   43: aload_1
/*    */     //   44: iload_2
/*    */     //   45: lload #7
/*    */     //   47: iload #5
/*    */     //   49: iconst_1
/*    */     //   50: invokestatic a : (S[DIJIZ)Z
/*    */     //   53: aload #9
/*    */     //   55: ifnull -> 78
/*    */     //   58: ifeq -> 111
/*    */     //   61: goto -> 74
/*    */     //   64: ldc2_w -4788994821443575932
/*    */     //   67: lload_3
/*    */     //   68: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   73: athrow
/*    */     //   74: dconst_1
/*    */     //   75: dstore #10
/*    */     //   77: iload_2
/*    */     //   78: istore #12
/*    */     //   80: iload #12
/*    */     //   82: iload_2
/*    */     //   83: iload #5
/*    */     //   85: iadd
/*    */     //   86: if_icmpge -> 111
/*    */     //   89: dload #10
/*    */     //   91: aload_1
/*    */     //   92: iload #12
/*    */     //   94: daload
/*    */     //   95: dmul
/*    */     //   96: aload #9
/*    */     //   98: ifnull -> 113
/*    */     //   101: dstore #10
/*    */     //   103: iinc #12, 1
/*    */     //   106: aload #9
/*    */     //   108: ifnonnull -> 80
/*    */     //   111: dload #10
/*    */     //   113: dreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #35	-> 33
/*    */     //   #25	-> 40
/*    */     //   #39	-> 74
/*    */     //   #8	-> 77
/*    */     //   #31	-> 89
/*    */     //   #14	-> 103
/*    */     //   #5	-> 111
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   40	61	64	aacinternal/v
/*    */   }
/*    */   public ay(long paramLong, ay paramay) {
/*    */     az.a(l, paramay);
/*    */     this.c = paramay.c;
/* 40 */     this.a = paramay.a;
/*    */   }
/*    */   
/*    */   private static RuntimeException a(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\ay.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */