/*    */ package aacinternal;
/*    */ public interface c extends aa, DoubleConsumer {
/*  3 */   default aa a(long paramLong) { long l = paramLong ^ 0x6E4D34E0A7EEL; return a(l); } public static final long m = nc.a(-674891939512281540L, -3756433546847972374L, MethodHandles.lookup().lookupClass()).a(281381776448700L); default double a(double[] paramArrayOfdouble, int paramInt1, long paramLong, int paramInt2) throws v {
/*  4 */     long l1 = paramLong ^ 0x2CBEE17C45C8L, l2 = paramLong ^ 0x6734CED7D58CL, l3 = paramLong ^ 0x4B93A2F0E8D8L; int i = (int)((paramLong ^ 0xE9B6F4C9216L) >>> 32L), j = (int)((paramLong ^ 0xE9B6F4C9216L) << 32L >>> 48L), k = (int)((paramLong ^ 0xE9B6F4C9216L) << 48L >>> 48L); paramLong ^ 0xE9B6F4C9216L; long l4 = paramLong ^ 0x346425C632D3L; if (L.a(paramArrayOfdouble, paramInt1, l2, paramInt2)) {
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
/* 16 */       c c1 = a(l3);
/*    */       
/* 18 */       c1.a(l1);
/*    */       c1.a(i, (short)j, paramArrayOfdouble, paramInt1, (char)k, paramInt2);
/*    */       return c1.a(l4);
/*    */     } 
/*    */     return Double.NaN;
/*    */   }
/*    */   
/*    */   default void a(int paramInt1, short paramShort, double[] paramArrayOfdouble, int paramInt2, char paramChar, int paramInt3) throws v {
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
/*    */     //   14: iload #5
/*    */     //   16: i2l
/*    */     //   17: bipush #48
/*    */     //   19: lshl
/*    */     //   20: bipush #48
/*    */     //   22: lushr
/*    */     //   23: lor
/*    */     //   24: getstatic aacinternal/c.m : J
/*    */     //   27: lxor
/*    */     //   28: lstore #7
/*    */     //   30: lload #7
/*    */     //   32: dup2
/*    */     //   33: ldc2_w 35285633718562
/*    */     //   36: lxor
/*    */     //   37: lstore #9
/*    */     //   39: dup2
/*    */     //   40: ldc2_w 94335398076287
/*    */     //   43: lxor
/*    */     //   44: lstore #11
/*    */     //   46: pop2
/*    */     //   47: ldc2_w 3972021164771276711
/*    */     //   50: lload #7
/*    */     //   52: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   57: astore #13
/*    */     //   59: aload_3
/*    */     //   60: iload #4
/*    */     //   62: lload #11
/*    */     //   64: iload #6
/*    */     //   66: invokestatic a : ([DIJI)Z
/*    */     //   69: aload #13
/*    */     //   71: ifnull -> 110
/*    */     //   74: ifeq -> 143
/*    */     //   77: goto -> 91
/*    */     //   80: ldc2_w 4025900975267619769
/*    */     //   83: lload #7
/*    */     //   85: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   90: athrow
/*    */     //   91: iload #4
/*    */     //   93: iload #6
/*    */     //   95: iadd
/*    */     //   96: goto -> 110
/*    */     //   99: ldc2_w 4025900975267619769
/*    */     //   102: lload #7
/*    */     //   104: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   109: athrow
/*    */     //   110: istore #14
/*    */     //   112: iload #4
/*    */     //   114: istore #15
/*    */     //   116: iload #15
/*    */     //   118: iload #14
/*    */     //   120: if_icmpge -> 143
/*    */     //   123: aload_0
/*    */     //   124: aload_3
/*    */     //   125: iload #15
/*    */     //   127: daload
/*    */     //   128: lload #9
/*    */     //   130: invokeinterface a : (DJ)V
/*    */     //   135: iinc #15, 1
/*    */     //   138: aload #13
/*    */     //   140: ifnonnull -> 116
/*    */     //   143: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #8	-> 59
/*    */     //   #5	-> 91
/*    */     //   #14	-> 112
/*    */     //   #6	-> 123
/*    */     //   #1	-> 135
/*    */     //   #17	-> 143
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   59	77	80	aacinternal/v
/*    */     //   74	96	99	aacinternal/v
/*    */   }
/*    */   
/*    */   default void a(long paramLong, double[] paramArrayOfdouble) throws v {
/*    */     paramLong = m ^ paramLong;
/*    */     long l = paramLong ^ 0x570BEBB9CC15L;
/*    */     int i = (int)((paramLong ^ 0xC6A84060AE7L) >>> 32L), j = (int)((paramLong ^ 0xC6A84060AE7L) << 32L >>> 48L), k = (int)((paramLong ^ 0xC6A84060AE7L) << 48L >>> 48L);
/*    */     paramLong ^ 0xC6A84060AE7L;
/*    */     az.a(paramArrayOfdouble, P.INPUT_ARRAY, new Object[0], l);
/*    */     a(i, (short)j, paramArrayOfdouble, 0, (char)k, paramArrayOfdouble.length);
/*    */   }
/*    */   
/*    */   default void accept(double paramDouble) {
/*    */     long l1 = m ^ 0x5021FF272CE1L, l2 = l1 ^ 0x1020C675DB55L;
/*    */     a(paramDouble, l2);
/*    */   }
/*    */   
/*    */   void a(double paramDouble, long paramLong);
/*    */   
/*    */   double a(long paramLong);
/*    */   
/*    */   long a();
/*    */   
/*    */   void a(long paramLong);
/*    */   
/*    */   c a(long paramLong);
/*    */   
/*    */   private static v b(v paramv) {
/*    */     return paramv;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */