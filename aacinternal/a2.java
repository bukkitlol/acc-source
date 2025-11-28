/*    */ package aacinternal;
/*    */ import java.io.Serializable;
/*    */ 
/*    */ class a2 extends aw implements Serializable {
/*    */   private static final long serialVersionUID = 20150412L;
/*    */   protected long e;
/*    */   protected double d;
/*    */   
/*    */   a2(a2 parama2, long paramLong) {
/* 10 */     az.a(l, parama2);
/*    */ 
/*    */     
/* 13 */     this.e = parama2.e;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 20 */     this.d = parama2.d;
/*    */     this.a = parama2.a;
/*    */     this.c = parama2.c;
/*    */   }
/*    */   protected double a; protected double c; private static final long o = nc.a(210744322544931750L, -3488700732717615698L, MethodHandles.lookup().lookupClass()).a(175330861781582L);
/*    */   public aa a(long paramLong) {
/*    */     long l = paramLong ^ 0x2C1927DB3355L;
/*    */     return a(l);
/*    */   }
/*    */   public a2 a(long paramLong) {
/*    */     long l = paramLong ^ 0x7390BDF86CFCL;
/*    */     return new a2(this, l);
/*    */   }
/*    */   public long a() {
/*    */     return this.e;
/*    */   }
/*    */   a2() {
/* 37 */     this.e = 0L;
/*    */     this.d = Double.NaN;
/*    */     this.a = Double.NaN;
/*    */     this.c = Double.NaN;
/*    */   }
/*    */   
/*    */   public c a(long paramLong) {
/*    */     long l = paramLong ^ 0x4254133B94BBL;
/*    */     return a(l);
/*    */   }
/*    */   
/*    */   public void a(long paramLong) {
/*    */     this.d = Double.NaN;
/*    */     this.e = 0L;
/*    */     this.a = Double.NaN;
/*    */     this.c = Double.NaN;
/*    */   }
/*    */   
/*    */   public void a(double paramDouble, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: ldc2_w -1271049672133580836
/*    */     //   3: lload_3
/*    */     //   4: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   9: astore #5
/*    */     //   11: aload_0
/*    */     //   12: getfield e : J
/*    */     //   15: aload #5
/*    */     //   17: ifnull -> 70
/*    */     //   20: lconst_0
/*    */     //   21: lcmp
/*    */     //   22: ifne -> 56
/*    */     //   25: goto -> 38
/*    */     //   28: ldc2_w -1226152861283511984
/*    */     //   31: lload_3
/*    */     //   32: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   37: athrow
/*    */     //   38: aload_0
/*    */     //   39: dconst_0
/*    */     //   40: putfield d : D
/*    */     //   43: goto -> 56
/*    */     //   46: ldc2_w -1226152861283511984
/*    */     //   49: lload_3
/*    */     //   50: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   55: athrow
/*    */     //   56: aload_0
/*    */     //   57: dup
/*    */     //   58: getfield e : J
/*    */     //   61: lconst_1
/*    */     //   62: ladd
/*    */     //   63: putfield e : J
/*    */     //   66: aload_0
/*    */     //   67: getfield e : J
/*    */     //   70: l2d
/*    */     //   71: dstore #6
/*    */     //   73: aload_0
/*    */     //   74: dload_1
/*    */     //   75: aload_0
/*    */     //   76: getfield d : D
/*    */     //   79: dsub
/*    */     //   80: putfield a : D
/*    */     //   83: aload_0
/*    */     //   84: aload_0
/*    */     //   85: getfield a : D
/*    */     //   88: dload #6
/*    */     //   90: ddiv
/*    */     //   91: putfield c : D
/*    */     //   94: aload_0
/*    */     //   95: dup
/*    */     //   96: getfield d : D
/*    */     //   99: aload_0
/*    */     //   100: getfield c : D
/*    */     //   103: dadd
/*    */     //   104: putfield d : D
/*    */     //   107: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #31	-> 11
/*    */     //   #33	-> 38
/*    */     //   #23	-> 56
/*    */     //   #35	-> 66
/*    */     //   #29	-> 73
/*    */     //   #34	-> 83
/*    */     //   #17	-> 94
/*    */     //   #11	-> 107
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   11	25	28	aacinternal/g
/*    */     //   20	43	46	aacinternal/g
/*    */   }
/*    */   
/*    */   public double a(long paramLong) {
/*    */     return this.d;
/*    */   }
/*    */   
/*    */   protected void a(a2 parama2, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic aacinternal/a2.o : J
/*    */     //   3: lload_2
/*    */     //   4: lxor
/*    */     //   5: lstore_2
/*    */     //   6: lload_2
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 115824959951637
/*    */     //   11: lxor
/*    */     //   12: lstore #4
/*    */     //   14: pop2
/*    */     //   15: ldc2_w -8640311821283393129
/*    */     //   18: lload_2
/*    */     //   19: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   24: lload #4
/*    */     //   26: aload_1
/*    */     //   27: invokestatic a : (JLjava/lang/Object;)V
/*    */     //   30: astore #6
/*    */     //   32: aload_1
/*    */     //   33: getfield e : J
/*    */     //   36: lconst_0
/*    */     //   37: lcmp
/*    */     //   38: aload #6
/*    */     //   40: ifnull -> 96
/*    */     //   43: ifle -> 182
/*    */     //   46: goto -> 59
/*    */     //   49: ldc2_w -8597101913541150949
/*    */     //   52: lload_2
/*    */     //   53: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   58: athrow
/*    */     //   59: aload_0
/*    */     //   60: aload #6
/*    */     //   62: ifnull -> 158
/*    */     //   65: goto -> 78
/*    */     //   68: ldc2_w -8597101913541150949
/*    */     //   71: lload_2
/*    */     //   72: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   77: athrow
/*    */     //   78: getfield e : J
/*    */     //   81: lconst_0
/*    */     //   82: lcmp
/*    */     //   83: goto -> 96
/*    */     //   86: ldc2_w -8597101913541150949
/*    */     //   89: lload_2
/*    */     //   90: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   95: athrow
/*    */     //   96: ifne -> 117
/*    */     //   99: aload_0
/*    */     //   100: dconst_0
/*    */     //   101: putfield d : D
/*    */     //   104: goto -> 117
/*    */     //   107: ldc2_w -8597101913541150949
/*    */     //   110: lload_2
/*    */     //   111: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   116: athrow
/*    */     //   117: aload_0
/*    */     //   118: dup
/*    */     //   119: getfield e : J
/*    */     //   122: aload_1
/*    */     //   123: getfield e : J
/*    */     //   126: ladd
/*    */     //   127: putfield e : J
/*    */     //   130: aload_0
/*    */     //   131: aload_1
/*    */     //   132: getfield d : D
/*    */     //   135: aload_0
/*    */     //   136: getfield d : D
/*    */     //   139: dsub
/*    */     //   140: putfield a : D
/*    */     //   143: aload_0
/*    */     //   144: aload_0
/*    */     //   145: getfield a : D
/*    */     //   148: aload_0
/*    */     //   149: getfield e : J
/*    */     //   152: l2d
/*    */     //   153: ddiv
/*    */     //   154: putfield c : D
/*    */     //   157: aload_0
/*    */     //   158: dup
/*    */     //   159: getfield d : D
/*    */     //   162: aload_1
/*    */     //   163: getfield e : J
/*    */     //   166: l2d
/*    */     //   167: aload_0
/*    */     //   168: getfield e : J
/*    */     //   171: l2d
/*    */     //   172: ddiv
/*    */     //   173: aload_0
/*    */     //   174: getfield a : D
/*    */     //   177: dmul
/*    */     //   178: dadd
/*    */     //   179: putfield d : D
/*    */     //   182: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #38	-> 24
/*    */     //   #2	-> 32
/*    */     //   #40	-> 59
/*    */     //   #36	-> 99
/*    */     //   #16	-> 117
/*    */     //   #25	-> 130
/*    */     //   #12	-> 143
/*    */     //   #39	-> 157
/*    */     //   #27	-> 182
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   32	46	49	aacinternal/g
/*    */     //   43	65	68	aacinternal/g
/*    */     //   59	83	86	aacinternal/g
/*    */     //   96	104	107	aacinternal/g
/*    */   }
/*    */   
/*    */   private static g d(g paramg) {
/*    */     return paramg;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\a2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */