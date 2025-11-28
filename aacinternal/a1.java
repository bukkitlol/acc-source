/*    */ package aacinternal;
/*    */ class a1 { private final int c; private final double a;
/*  3 */   int a() { return this.c; }
/*    */   private final double b; private static final long d = nc.a(4381539134003306578L, -104160956560395498L, MethodHandles.lookup().lookupClass()).a(44527166138521L); a1(long paramLong, double paramDouble) { // Byte code:
/*    */     //   0: getstatic aacinternal/a1.d : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: aload_0
/*    */     //   7: invokespecial <init> : ()V
/*    */     //   10: ldc2_w 95133114902530253
/*    */     //   13: lload_1
/*    */     //   14: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*    */     //   19: dload_3
/*    */     //   20: ldc2_w 0.6366197723675814
/*    */     //   23: dmul
/*    */     //   24: d2i
/*    */     //   25: istore #6
/*    */     //   27: astore #5
/*    */     //   29: iload #6
/*    */     //   31: ineg
/*    */     //   32: i2d
/*    */     //   33: ldc2_w 1.570796251296997
/*    */     //   36: dmul
/*    */     //   37: dstore #11
/*    */     //   39: dload_3
/*    */     //   40: dload #11
/*    */     //   42: dadd
/*    */     //   43: dstore #7
/*    */     //   45: dload #7
/*    */     //   47: dload_3
/*    */     //   48: dsub
/*    */     //   49: dload #11
/*    */     //   51: dsub
/*    */     //   52: dneg
/*    */     //   53: dstore #9
/*    */     //   55: iload #6
/*    */     //   57: ineg
/*    */     //   58: i2d
/*    */     //   59: ldc2_w 7.549789948768648E-8
/*    */     //   62: dmul
/*    */     //   63: dstore #11
/*    */     //   65: dload #7
/*    */     //   67: dstore #13
/*    */     //   69: dload #11
/*    */     //   71: dload #13
/*    */     //   73: dadd
/*    */     //   74: dstore #7
/*    */     //   76: dload #9
/*    */     //   78: dload #7
/*    */     //   80: dload #13
/*    */     //   82: dsub
/*    */     //   83: dload #11
/*    */     //   85: dsub
/*    */     //   86: dneg
/*    */     //   87: dadd
/*    */     //   88: dstore #9
/*    */     //   90: iload #6
/*    */     //   92: ineg
/*    */     //   93: i2d
/*    */     //   94: ldc2_w 6.123233995736766E-17
/*    */     //   97: dmul
/*    */     //   98: dstore #11
/*    */     //   100: dload #7
/*    */     //   102: dstore #13
/*    */     //   104: dload #11
/*    */     //   106: dload #13
/*    */     //   108: dadd
/*    */     //   109: dstore #7
/*    */     //   111: dload #9
/*    */     //   113: dload #7
/*    */     //   115: dload #13
/*    */     //   117: dsub
/*    */     //   118: dload #11
/*    */     //   120: dsub
/*    */     //   121: dneg
/*    */     //   122: dadd
/*    */     //   123: dstore #9
/*    */     //   125: dload #7
/*    */     //   127: dconst_0
/*    */     //   128: dcmpl
/*    */     //   129: ifle -> 161
/*    */     //   132: aload #5
/*    */     //   134: lload_1
/*    */     //   135: lconst_0
/*    */     //   136: lcmp
/*    */     //   137: ifle -> 179
/*    */     //   140: ifnonnull -> 177
/*    */     //   143: aload #5
/*    */     //   145: ifnull -> 182
/*    */     //   148: goto -> 161
/*    */     //   151: ldc2_w 70067850469091017
/*    */     //   154: lload_1
/*    */     //   155: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   160: athrow
/*    */     //   161: iinc #6, -1
/*    */     //   164: goto -> 177
/*    */     //   167: ldc2_w 70067850469091017
/*    */     //   170: lload_1
/*    */     //   171: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   176: athrow
/*    */     //   177: aload #5
/*    */     //   179: ifnull -> 29
/*    */     //   182: aload_0
/*    */     //   183: iload #6
/*    */     //   185: putfield c : I
/*    */     //   188: aload_0
/*    */     //   189: dload #7
/*    */     //   191: putfield a : D
/*    */     //   194: aload_0
/*    */     //   195: dload #9
/*    */     //   197: putfield b : D
/*    */     //   200: lload_1
/*    */     //   201: lconst_0
/*    */     //   202: lcmp
/*    */     //   203: ifle -> 132
/*    */     //   206: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 6
/*    */     //   #2	-> 19
/*    */     //   #8	-> 29
/*    */     //   #11	-> 39
/*    */     //   #10	-> 45
/*    */     //   #7	-> 55
/*    */     //   #17	-> 65
/*    */     //   #12	-> 69
/*    */     //   #21	-> 76
/*    */     //   #24	-> 90
/*    */     //   #23	-> 100
/*    */     //   #15	-> 104
/*    */     //   #13	-> 111
/*    */     //   #20	-> 125
/*    */     //   #4	-> 132
/*    */     //   #6	-> 161
/*    */     //   #18	-> 177
/*    */     //   #16	-> 182
/*    */     //   #9	-> 188
/*    */     //   #19	-> 194
/*    */     //   #14	-> 200
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   132	148	151	aacinternal/v
/*    */     //   143	164	167	aacinternal/v } double b() {
/*  5 */     return this.a;
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
/*    */   double a() {
/* 22 */     return this.b;
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\a1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */