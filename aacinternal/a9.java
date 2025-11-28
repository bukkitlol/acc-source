/*    */ package aacinternal;public class a9 extends a2 implements s, Serializable { private static final long serialVersionUID = 20150412L;
/*    */   protected double f;
/*    */   private static aN[] g;
/*    */   private static final long p;
/*    */   
/*    */   public c a(long paramLong) {
/*  7 */     long l = paramLong ^ 0x60BC066793E8L; return a(l);
/*    */   }
/*    */   
/* 10 */   public a9(a9 parama9, long paramLong) { super(parama9, l);
/* 11 */     this.f = parama9.f; } public a2 a(long paramLong) { long l = paramLong ^ 0x22E8155C0753L; return a(l); }
/* 12 */   public void a(long paramLong, Object paramObject) { long l = paramLong ^ 0xDB2171EADABL; a((a9)paramObject, l); } public aa a(long paramLong) {
/* 13 */     long l = paramLong ^ 0xEF132873406L; return a(l);
/*    */   }
/*    */   public a9 a(long paramLong) {
/* 16 */     long l = paramLong ^ 0x27BFE4BF84FBL; return new a9(this, l);
/*    */   } public void a(double paramDouble, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: lload_3
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 0
/*    */     //   5: lxor
/*    */     //   6: lstore #5
/*    */     //   8: pop2
/*    */     //   9: ldc2_w -1271049672133580836
/*    */     //   12: lload_3
/*    */     //   13: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   18: astore #7
/*    */     //   20: aload_0
/*    */     //   21: aload #7
/*    */     //   23: ifnull -> 78
/*    */     //   26: getfield e : J
/*    */     //   29: lconst_1
/*    */     //   30: lcmp
/*    */     //   31: ifge -> 70
/*    */     //   34: goto -> 47
/*    */     //   37: ldc2_w -1232978977966625598
/*    */     //   40: lload_3
/*    */     //   41: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   46: athrow
/*    */     //   47: aload_0
/*    */     //   48: aload_0
/*    */     //   49: dconst_0
/*    */     //   50: dup2_x1
/*    */     //   51: putfield f : D
/*    */     //   54: putfield d : D
/*    */     //   57: goto -> 70
/*    */     //   60: ldc2_w -1232978977966625598
/*    */     //   63: lload_3
/*    */     //   64: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   69: athrow
/*    */     //   70: aload_0
/*    */     //   71: dload_1
/*    */     //   72: lload #5
/*    */     //   74: invokespecial a : (DJ)V
/*    */     //   77: aload_0
/*    */     //   78: dup
/*    */     //   79: getfield f : D
/*    */     //   82: aload_0
/*    */     //   83: getfield e : J
/*    */     //   86: l2d
/*    */     //   87: dconst_1
/*    */     //   88: dsub
/*    */     //   89: aload_0
/*    */     //   90: getfield a : D
/*    */     //   93: dmul
/*    */     //   94: aload_0
/*    */     //   95: getfield c : D
/*    */     //   98: dmul
/*    */     //   99: dadd
/*    */     //   100: putfield f : D
/*    */     //   103: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #22	-> 20
/*    */     //   #1	-> 47
/*    */     //   #3	-> 70
/*    */     //   #14	-> 77
/*    */     //   #17	-> 103
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   20	34	37	aacinternal/g
/*    */     //   26	57	60	aacinternal/g
/*    */   } public void a(long paramLong) {
/* 20 */     long l = paramLong ^ 0x0L; super.a(l);
/*    */     this.f = Double.NaN;
/*    */   } public a9() {
/*    */     this.f = Double.NaN;
/*    */   }
/*    */   public long a() {
/* 26 */     return super.a(); } public void a(a9 parama9, long paramLong) { // Byte code:
/*    */     //   0: lload_2
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 92408117684613
/*    */     //   5: lxor
/*    */     //   6: lstore #4
/*    */     //   8: pop2
/*    */     //   9: ldc2_w -7046937460132636748
/*    */     //   12: lload_2
/*    */     //   13: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   18: astore #6
/*    */     //   20: aload_1
/*    */     //   21: getfield e : J
/*    */     //   24: aload #6
/*    */     //   26: ifnull -> 64
/*    */     //   29: lconst_0
/*    */     //   30: lcmp
/*    */     //   31: ifle -> 182
/*    */     //   34: goto -> 47
/*    */     //   37: ldc2_w -7022245831831380822
/*    */     //   40: lload_2
/*    */     //   41: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   46: athrow
/*    */     //   47: aload_0
/*    */     //   48: getfield e : J
/*    */     //   51: goto -> 64
/*    */     //   54: ldc2_w -7022245831831380822
/*    */     //   57: lload_2
/*    */     //   58: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   63: athrow
/*    */     //   64: l2d
/*    */     //   65: dstore #7
/*    */     //   67: lload_2
/*    */     //   68: lconst_0
/*    */     //   69: lcmp
/*    */     //   70: iflt -> 85
/*    */     //   73: aload_0
/*    */     //   74: aload_1
/*    */     //   75: aload #6
/*    */     //   77: ifnull -> 146
/*    */     //   80: lload #4
/*    */     //   82: invokespecial a : (Laacinternal/a2;J)V
/*    */     //   85: dload #7
/*    */     //   87: dconst_0
/*    */     //   88: dcmpl
/*    */     //   89: ifne -> 131
/*    */     //   92: goto -> 105
/*    */     //   95: ldc2_w -7022245831831380822
/*    */     //   98: lload_2
/*    */     //   99: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   104: athrow
/*    */     //   105: aload_0
/*    */     //   106: aload_1
/*    */     //   107: getfield f : D
/*    */     //   110: putfield f : D
/*    */     //   113: aload #6
/*    */     //   115: ifnonnull -> 182
/*    */     //   118: goto -> 131
/*    */     //   121: ldc2_w -7022245831831380822
/*    */     //   124: lload_2
/*    */     //   125: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   130: athrow
/*    */     //   131: aload_0
/*    */     //   132: dup
/*    */     //   133: goto -> 146
/*    */     //   136: ldc2_w -7022245831831380822
/*    */     //   139: lload_2
/*    */     //   140: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   145: athrow
/*    */     //   146: getfield f : D
/*    */     //   149: aload_1
/*    */     //   150: getfield f : D
/*    */     //   153: aload_1
/*    */     //   154: getfield e : J
/*    */     //   157: l2d
/*    */     //   158: dload #7
/*    */     //   160: dmul
/*    */     //   161: aload_0
/*    */     //   162: getfield e : J
/*    */     //   165: l2d
/*    */     //   166: ddiv
/*    */     //   167: aload_0
/*    */     //   168: getfield a : D
/*    */     //   171: dmul
/*    */     //   172: aload_0
/*    */     //   173: getfield a : D
/*    */     //   176: dmul
/*    */     //   177: dadd
/*    */     //   178: dadd
/*    */     //   179: putfield f : D
/*    */     //   182: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #27	-> 20
/*    */     //   #4	-> 47
/*    */     //   #2	-> 67
/*    */     //   #5	-> 85
/*    */     //   #6	-> 105
/*    */     //   #23	-> 131
/*    */     //   #24	-> 182
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   20	34	37	aacinternal/g
/*    */     //   29	51	54	aacinternal/g
/*    */     //   67	92	95	aacinternal/g
/*    */     //   80	118	121	aacinternal/g
/*    */     //   105	133	136	aacinternal/g }
/*    */   public double a(long paramLong) {
/* 28 */     return this.f;
/*    */   }
/*    */   
/*    */   public static void a(aN[] paramArrayOfaN) {
/*    */     g = paramArrayOfaN;
/*    */   }
/*    */   
/*    */   public static aN[] a() {
/*    */     return g;
/*    */   }
/*    */   
/*    */   static {
/*    */     // Byte code:
/*    */     //   0: ldc2_w -274621467235602780
/*    */     //   3: ldc2_w 481591101644543128
/*    */     //   6: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
/*    */     //   9: invokevirtual lookupClass : ()Ljava/lang/Class;
/*    */     //   12: invokestatic a : (JJLjava/lang/Object;)Lme/konsolas/aac/na;
/*    */     //   15: ldc2_w 143485663524712
/*    */     //   18: invokeinterface a : (J)J
/*    */     //   23: putstatic aacinternal/a9.p : J
/*    */     //   26: getstatic aacinternal/a9.p : J
/*    */     //   29: ldc2_w 23104027341179
/*    */     //   32: lxor
/*    */     //   33: lstore_0
/*    */     //   34: ldc2_w -2209794781101823787
/*    */     //   37: lload_0
/*    */     //   38: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   43: ifnonnull -> 59
/*    */     //   46: iconst_5
/*    */     //   47: anewarray me/konsolas/aac/aN
/*    */     //   50: ldc2_w -2218479077482731659
/*    */     //   53: lload_0
/*    */     //   54: <illegal opcode> w : ([Lme/konsolas/aac/aN;JJ)V
/*    */     //   59: return
/*    */   }
/*    */   
/*    */   private static g b(g paramg) {
/*    */     return paramg;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\a9.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */