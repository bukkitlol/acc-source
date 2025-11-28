/*   */ package aacinternal;public class b implements p { private final int a; public int a() {
/* 2 */     return this.a;
/*   */   }
/*   */   private static final long b = nc.a(-602959699819400992L, -478110166708518690L, MethodHandles.lookup().lookupClass()).a(191008916388279L);
/*   */   public static b a(long paramLong) {
/* 6 */     paramLong = b ^ paramLong; long l = paramLong ^ 0x7E022155535DL; return new b(l, 2147483647);
/*   */   }
/*   */   
/*   */   public b(long paramLong, int paramInt) {
/*   */     // Byte code:
/*   */     //   0: getstatic aacinternal/b.b : J
/*   */     //   3: lload_1
/*   */     //   4: lxor
/*   */     //   5: lstore_1
/*   */     //   6: lload_1
/*   */     //   7: dup2
/*   */     //   8: ldc2_w 25454765687617
/*   */     //   11: lxor
/*   */     //   12: dup2
/*   */     //   13: bipush #48
/*   */     //   15: lushr
/*   */     //   16: l2i
/*   */     //   17: istore #4
/*   */     //   19: dup2
/*   */     //   20: bipush #16
/*   */     //   22: lshl
/*   */     //   23: bipush #32
/*   */     //   25: lushr
/*   */     //   26: l2i
/*   */     //   27: istore #5
/*   */     //   29: dup2
/*   */     //   30: bipush #48
/*   */     //   32: lshl
/*   */     //   33: bipush #48
/*   */     //   35: lushr
/*   */     //   36: l2i
/*   */     //   37: istore #6
/*   */     //   39: pop2
/*   */     //   40: pop2
/*   */     //   41: ldc2_w 5284655305342930218
/*   */     //   44: lload_1
/*   */     //   45: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*   */     //   50: aload_0
/*   */     //   51: invokespecial <init> : ()V
/*   */     //   54: astore #7
/*   */     //   56: aload #7
/*   */     //   58: ifnonnull -> 130
/*   */     //   61: iload_3
/*   */     //   62: ifgt -> 125
/*   */     //   65: goto -> 78
/*   */     //   68: ldc2_w 5248452075572961226
/*   */     //   71: lload_1
/*   */     //   72: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*   */     //   77: athrow
/*   */     //   78: new aacinternal/v
/*   */     //   81: dup
/*   */     //   82: getstatic aacinternal/P.NUMBER_TOO_SMALL_BOUND_EXCLUDED : Laacinternal/P;
/*   */     //   85: iconst_2
/*   */     //   86: anewarray java/lang/Object
/*   */     //   89: dup
/*   */     //   90: iconst_0
/*   */     //   91: iload_3
/*   */     //   92: invokestatic valueOf : (I)Ljava/lang/Integer;
/*   */     //   95: aastore
/*   */     //   96: dup
/*   */     //   97: iconst_1
/*   */     //   98: iconst_0
/*   */     //   99: invokestatic valueOf : (I)Ljava/lang/Integer;
/*   */     //   102: aastore
/*   */     //   103: iload #4
/*   */     //   105: i2s
/*   */     //   106: iload #5
/*   */     //   108: iload #6
/*   */     //   110: i2s
/*   */     //   111: invokespecial <init> : (Laacinternal/H;[Ljava/lang/Object;SIS)V
/*   */     //   114: athrow
/*   */     //   115: ldc2_w 5248452075572961226
/*   */     //   118: lload_1
/*   */     //   119: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*   */     //   124: athrow
/*   */     //   125: aload_0
/*   */     //   126: iload_3
/*   */     //   127: putfield a : I
/*   */     //   130: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #8	-> 50
/*   */     //   #4	-> 56
/*   */     //   #3	-> 78
/*   */     //   #7	-> 92
/*   */     //   #1	-> 125
/*   */     //   #5	-> 130
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   56	65	68	aacinternal/v
/*   */     //   61	115	115	aacinternal/v
/*   */   }
/*   */   
/*   */   private static v a(v paramv) {
/*   */     return paramv;
/*   */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */