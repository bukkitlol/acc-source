/*    */ package aacinternal;public final class z { public int d(int paramInt) {
/*  2 */     return this.e[paramInt];
/*    */   }
/*    */   private final int[] c;
/*    */   private final int[] b;
/*    */   private final int[] e;
/*    */   private final int[] d;
/*    */   private final int[] a;
/*    */   private static final long f = nc.a(4502609058791939782L, -8495323044528597684L, MethodHandles.lookup().lookupClass()).a(19752796750411L);
/*    */   
/*    */   public int e(int paramInt) {
/* 12 */     return this.c[paramInt];
/*    */   }
/*    */   
/* 15 */   public int c(int paramInt) { return this.d[paramInt]; } public int a(int paramInt) {
/* 16 */     return this.a[paramInt];
/*    */   } public int b(int paramInt) {
/* 18 */     return this.b[paramInt];
/*    */   }
/*    */   
/*    */   public z(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*    */     // Byte code:
/*    */     //   0: getstatic aacinternal/z.f : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: aload_0
/*    */     //   7: invokespecial <init> : ()V
/*    */     //   10: iload_3
/*    */     //   11: invokestatic b : (I)I
/*    */     //   14: istore #7
/*    */     //   16: aload_0
/*    */     //   17: iload #7
/*    */     //   19: newarray int
/*    */     //   21: putfield c : [I
/*    */     //   24: aload_0
/*    */     //   25: iload #7
/*    */     //   27: newarray int
/*    */     //   29: putfield b : [I
/*    */     //   32: aload_0
/*    */     //   33: iload #7
/*    */     //   35: newarray int
/*    */     //   37: putfield e : [I
/*    */     //   40: aload_0
/*    */     //   41: iload #7
/*    */     //   43: newarray int
/*    */     //   45: putfield d : [I
/*    */     //   48: aload_0
/*    */     //   49: iload #7
/*    */     //   51: newarray int
/*    */     //   53: putfield a : [I
/*    */     //   56: iconst_0
/*    */     //   57: istore #8
/*    */     //   59: iload #8
/*    */     //   61: iload #7
/*    */     //   63: if_icmpge -> 161
/*    */     //   66: aload_0
/*    */     //   67: getfield c : [I
/*    */     //   70: iload #8
/*    */     //   72: iload #8
/*    */     //   74: iload #7
/*    */     //   76: iadd
/*    */     //   77: iconst_1
/*    */     //   78: isub
/*    */     //   79: iload #7
/*    */     //   81: irem
/*    */     //   82: iastore
/*    */     //   83: aload_0
/*    */     //   84: getfield b : [I
/*    */     //   87: iload #8
/*    */     //   89: iload #8
/*    */     //   91: iload #7
/*    */     //   93: iadd
/*    */     //   94: iconst_2
/*    */     //   95: isub
/*    */     //   96: iload #7
/*    */     //   98: irem
/*    */     //   99: iastore
/*    */     //   100: aload_0
/*    */     //   101: getfield e : [I
/*    */     //   104: iload #8
/*    */     //   106: iload #8
/*    */     //   108: iload #4
/*    */     //   110: iadd
/*    */     //   111: iload #7
/*    */     //   113: irem
/*    */     //   114: iastore
/*    */     //   115: aload_0
/*    */     //   116: getfield d : [I
/*    */     //   119: iload #8
/*    */     //   121: iload #8
/*    */     //   123: iload #5
/*    */     //   125: iadd
/*    */     //   126: iload #7
/*    */     //   128: irem
/*    */     //   129: iastore
/*    */     //   130: aload_0
/*    */     //   131: getfield a : [I
/*    */     //   134: iload #8
/*    */     //   136: iload #8
/*    */     //   138: iload #6
/*    */     //   140: iadd
/*    */     //   141: iload #7
/*    */     //   143: irem
/*    */     //   144: iastore
/*    */     //   145: iinc #8, 1
/*    */     //   148: goto -> 59
/*    */     //   151: ldc2_w 4755020796788949897
/*    */     //   154: lload_1
/*    */     //   155: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   160: athrow
/*    */     //   161: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #19	-> 6
/*    */     //   #5	-> 10
/*    */     //   #7	-> 16
/*    */     //   #8	-> 24
/*    */     //   #14	-> 32
/*    */     //   #1	-> 40
/*    */     //   #6	-> 48
/*    */     //   #4	-> 56
/*    */     //   #9	-> 66
/*    */     //   #10	-> 83
/*    */     //   #11	-> 100
/*    */     //   #13	-> 115
/*    */     //   #17	-> 130
/*    */     //   #3	-> 145
/*    */     //   #20	-> 161
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   59	151	151	aacinternal/v
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\z.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */