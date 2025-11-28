/*   */ package aacinternal;enum aj { protected double a(double[] paramArrayOfdouble, short paramShort1, int[] paramArrayOfint, double paramDouble, int paramInt1, short paramShort2, int paramInt2, af paramaf) {
/* 2 */     long l = paramShort1 << 48L | paramInt1 << 32L >>> 16L | paramShort2 << 48L >>> 48L; int i = (int)((l ^ 0x289B5C212DE2L) >>> 32L), j = (int)((l ^ 0x289B5C212DE2L) << 32L >>> 40L), k = (int)((l ^ 0x289B5C212DE2L) << 56L >>> 56L); l ^ 0x289B5C212DE2L; int m = (int)((l ^ 0x0L) >>> 48L), n = (int)((l ^ 0x0L) << 16L >>> 32L), i1 = (int)((l ^ 0x0L) << 48L >>> 48L); l ^ 0x0L; return super.a(paramArrayOfdouble, (short)m, paramArrayOfint, aL.D(i, j, paramDouble - 0.5D, (byte)k), n, (short)i1, paramInt2, paramaf);
/*   */   }
/*   */   
/*   */   protected double a(double paramDouble, long paramLong, int paramInt) {
/*   */     // Byte code:
/*   */     //   0: ldc2_w -8817724927611501331
/*   */     //   3: lload_3
/*   */     //   4: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*   */     //   9: dconst_0
/*   */     //   10: dstore #7
/*   */     //   12: astore #6
/*   */     //   14: dload_1
/*   */     //   15: dconst_0
/*   */     //   16: lload_3
/*   */     //   17: lconst_0
/*   */     //   18: lcmp
/*   */     //   19: iflt -> 68
/*   */     //   22: invokestatic compare : (DD)I
/*   */     //   25: aload #6
/*   */     //   27: ifnull -> 62
/*   */     //   30: ifne -> 60
/*   */     //   33: goto -> 46
/*   */     //   36: ldc2_w -8868681299120546338
/*   */     //   39: lload_3
/*   */     //   40: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*   */     //   45: athrow
/*   */     //   46: dconst_0
/*   */     //   47: goto -> 69
/*   */     //   50: ldc2_w -8868681299120546338
/*   */     //   53: lload_3
/*   */     //   54: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*   */     //   59: athrow
/*   */     //   60: iload #5
/*   */     //   62: i2d
/*   */     //   63: dload_1
/*   */     //   64: dmul
/*   */     //   65: ldc2_w 0.5
/*   */     //   68: dadd
/*   */     //   69: dreturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 9
/*   */     //   #4	-> 14
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   14	33	36	aacinternal/v
/*   */     //   30	50	50	aacinternal/v
/*   */   }
/*   */   
/*   */   private static v b(v paramv) {
/*   */     return paramv;
/*   */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\aj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */