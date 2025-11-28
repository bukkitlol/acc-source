/*  1 */ package aacinternal;public class as extends aw implements s, Serializable { private static final long serialVersionUID = 20150412L; private long c; public aa a(long paramLong) { long l = paramLong ^ 0x2E2001AB34EDL; return a(l); } private double a; private static final long d = nc.a(7431384115900122063L, -5893459845750818238L, MethodHandles.lookup().lookupClass()).a(61022190840087L); public double a(long paramLong) {
/*  2 */     return this.a; }
/*  3 */   public c a(long paramLong) { long l = paramLong ^ 0x406D354B9303L; return a(l); } public long a() {
/*  4 */     return this.c;
/*    */   }
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
/*    */   public as() {
/* 23 */     this.c = 0L;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 32 */     this.a = 0.0D;
/*    */   } public void a(long paramLong, as paramas) { // Byte code:
/*    */     //   0: getstatic aacinternal/as.d : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: lload_1
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 76378394770440
/*    */     //   11: lxor
/*    */     //   12: lstore #4
/*    */     //   14: pop2
/*    */     //   15: ldc2_w 2809512464440874008
/*    */     //   18: lload_1
/*    */     //   19: <illegal opcode> w : (JJ)[I
/*    */     //   24: lload #4
/*    */     //   26: aload_3
/*    */     //   27: invokestatic a : (JLjava/lang/Object;)V
/*    */     //   30: astore #6
/*    */     //   32: aload_3
/*    */     //   33: aload #6
/*    */     //   35: ifnull -> 86
/*    */     //   38: getfield c : J
/*    */     //   41: lconst_0
/*    */     //   42: lcmp
/*    */     //   43: ifle -> 98
/*    */     //   46: goto -> 59
/*    */     //   49: ldc2_w 2856205129987968484
/*    */     //   52: lload_1
/*    */     //   53: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   58: athrow
/*    */     //   59: aload_0
/*    */     //   60: dup
/*    */     //   61: getfield c : J
/*    */     //   64: aload_3
/*    */     //   65: getfield c : J
/*    */     //   68: ladd
/*    */     //   69: putfield c : J
/*    */     //   72: aload_0
/*    */     //   73: goto -> 86
/*    */     //   76: ldc2_w 2856205129987968484
/*    */     //   79: lload_1
/*    */     //   80: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   85: athrow
/*    */     //   86: dup
/*    */     //   87: getfield a : D
/*    */     //   90: aload_3
/*    */     //   91: getfield a : D
/*    */     //   94: dadd
/*    */     //   95: putfield a : D
/*    */     //   98: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #8	-> 24
/*    */     //   #30	-> 32
/*    */     //   #13	-> 59
/*    */     //   #20	-> 72
/*    */     //   #31	-> 98
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   32	46	49	aacinternal/g
/* 33 */     //   38	73	76	aacinternal/g } public void a(double paramDouble, long paramLong) { this.a += paramDouble * paramDouble;
/*    */     this.c++; }
/*    */ 
/*    */   
/*    */   public as a(long paramLong) {
/*    */     paramLong = d ^ paramLong;
/*    */     long l = paramLong ^ 0x1A0BBD88867EL;
/*    */     return new as(l, this);
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
/*    */     //   58: ifeq -> 116
/*    */     //   61: goto -> 74
/*    */     //   64: ldc2_w -4817628381819283613
/*    */     //   67: lload_3
/*    */     //   68: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   73: athrow
/*    */     //   74: dconst_0
/*    */     //   75: dstore #10
/*    */     //   77: iload_2
/*    */     //   78: istore #12
/*    */     //   80: iload #12
/*    */     //   82: iload_2
/*    */     //   83: iload #5
/*    */     //   85: iadd
/*    */     //   86: if_icmpge -> 116
/*    */     //   89: dload #10
/*    */     //   91: aload_1
/*    */     //   92: iload #12
/*    */     //   94: daload
/*    */     //   95: aload_1
/*    */     //   96: iload #12
/*    */     //   98: daload
/*    */     //   99: dmul
/*    */     //   100: dadd
/*    */     //   101: aload #9
/*    */     //   103: ifnull -> 118
/*    */     //   106: dstore #10
/*    */     //   108: iinc #12, 1
/*    */     //   111: aload #9
/*    */     //   113: ifnonnull -> 80
/*    */     //   116: dload #10
/*    */     //   118: dreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #15	-> 33
/*    */     //   #17	-> 40
/*    */     //   #24	-> 74
/*    */     //   #16	-> 77
/*    */     //   #18	-> 89
/*    */     //   #27	-> 108
/*    */     //   #19	-> 116
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   40	61	64	aacinternal/v
/*    */   }
/*    */   
/*    */   public void a(long paramLong) {
/*    */     this.a = 0.0D;
/*    */     this.c = 0L;
/*    */   }
/*    */   
/*    */   public void a(long paramLong, Object paramObject) {
/*    */     long l = paramLong ^ 0x372131F4B8A0L;
/*    */     a(l, (as)paramObject);
/*    */   }
/*    */   
/*    */   public as(long paramLong, as paramas) {
/*    */     az.a(l, paramas);
/*    */     this.c = paramas.c;
/*    */     this.a = paramas.a;
/*    */   }
/*    */   
/*    */   private static RuntimeException a(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\as.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */