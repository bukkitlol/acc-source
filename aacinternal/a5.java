/*    */ package aacinternal;class a5 extends a9 implements Serializable {
/*    */   public void a(long paramLong) {
/*  3 */     long l = paramLong ^ 0x0L; super.a(l);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*  9 */     this.h = Double.NaN;
/*    */     this.i = Double.NaN;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private static final long serialVersionUID = 20150412L;
/*    */ 
/*    */   
/*    */   protected double h;
/*    */ 
/*    */   
/*    */   protected double i;
/*    */   
/*    */   private static final long q = nc.a(-794387716413791354L, -9101094750613431456L, MethodHandles.lookup().lookupClass()).a(157420234498004L);
/*    */ 
/*    */   
/*    */   a5() {
/* 27 */     this.h = Double.NaN;
/* 28 */     this.i = Double.NaN; } public double a(long paramLong) { return this.h; }
/*    */ 
/*    */   
/*    */   public a2 a(long paramLong) {
/*    */     long l = paramLong ^ 0x2D45784ED45DL;
/*    */     return a(l);
/*    */   }
/*    */   
/*    */   public void a(double paramDouble, long paramLong) {
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
/*    */     //   23: ifnull -> 76
/*    */     //   26: getfield e : J
/*    */     //   29: lconst_1
/*    */     //   30: lcmp
/*    */     //   31: ifge -> 75
/*    */     //   34: goto -> 47
/*    */     //   37: ldc2_w -1175206560714762311
/*    */     //   40: lload_3
/*    */     //   41: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   46: athrow
/*    */     //   47: aload_0
/*    */     //   48: aload_0
/*    */     //   49: aload_0
/*    */     //   50: dconst_0
/*    */     //   51: dup2_x1
/*    */     //   52: putfield d : D
/*    */     //   55: dup2_x1
/*    */     //   56: putfield f : D
/*    */     //   59: putfield h : D
/*    */     //   62: goto -> 75
/*    */     //   65: ldc2_w -1175206560714762311
/*    */     //   68: lload_3
/*    */     //   69: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   74: athrow
/*    */     //   75: aload_0
/*    */     //   76: getfield f : D
/*    */     //   79: dstore #8
/*    */     //   81: aload_0
/*    */     //   82: dload_1
/*    */     //   83: lload #5
/*    */     //   85: invokespecial a : (DJ)V
/*    */     //   88: aload_0
/*    */     //   89: aload_0
/*    */     //   90: getfield c : D
/*    */     //   93: aload_0
/*    */     //   94: getfield c : D
/*    */     //   97: dmul
/*    */     //   98: putfield i : D
/*    */     //   101: aload_0
/*    */     //   102: getfield e : J
/*    */     //   105: l2d
/*    */     //   106: dstore #10
/*    */     //   108: aload_0
/*    */     //   109: aload_0
/*    */     //   110: getfield h : D
/*    */     //   113: ldc2_w 3.0
/*    */     //   116: aload_0
/*    */     //   117: getfield c : D
/*    */     //   120: dmul
/*    */     //   121: dload #8
/*    */     //   123: dmul
/*    */     //   124: dsub
/*    */     //   125: dload #10
/*    */     //   127: dconst_1
/*    */     //   128: dsub
/*    */     //   129: dload #10
/*    */     //   131: ldc2_w 2.0
/*    */     //   134: dsub
/*    */     //   135: dmul
/*    */     //   136: aload_0
/*    */     //   137: getfield i : D
/*    */     //   140: dmul
/*    */     //   141: aload_0
/*    */     //   142: getfield a : D
/*    */     //   145: dmul
/*    */     //   146: dadd
/*    */     //   147: putfield h : D
/*    */     //   150: ldc2_w -1280663902071117159
/*    */     //   153: lload_3
/*    */     //   154: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   159: lload_3
/*    */     //   160: lconst_0
/*    */     //   161: lcmp
/*    */     //   162: iflt -> 172
/*    */     //   165: ifnull -> 194
/*    */     //   168: iconst_2
/*    */     //   169: anewarray me/konsolas/aac/aN
/*    */     //   172: ldc2_w -1279293478266640260
/*    */     //   175: lload_3
/*    */     //   176: <illegal opcode> w : ([Lme/konsolas/aac/aN;JJ)V
/*    */     //   181: goto -> 194
/*    */     //   184: ldc2_w -1175206560714762311
/*    */     //   187: lload_3
/*    */     //   188: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   193: athrow
/*    */     //   194: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #12	-> 20
/*    */     //   #1	-> 47
/*    */     //   #2	-> 75
/*    */     //   #21	-> 81
/*    */     //   #23	-> 88
/*    */     //   #10	-> 101
/*    */     //   #6	-> 108
/*    */     //   #15	-> 150
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   20	34	37	aacinternal/g
/*    */     //   26	62	65	aacinternal/g
/*    */     //   108	181	184	aacinternal/g
/*    */   }
/*    */   
/*    */   public c a(long paramLong) {
/*    */     long l = paramLong ^ 0x6F116B7540E6L;
/*    */     return a(l);
/*    */   }
/*    */   
/*    */   public void a(a9 parama9, long paramLong) {
/*    */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   public a9 a(long paramLong) {
/*    */     long l = paramLong ^ 0xFAD6D12D30EL;
/*    */     return a(l);
/*    */   }
/*    */   
/*    */   a5(a5 parama5, short paramShort, int paramInt1, int paramInt2) {
/*    */     super(parama5, l2);
/*    */     this.h = parama5.h;
/*    */     this.i = parama5.i;
/*    */   }
/*    */   
/*    */   public aa a(long paramLong) {
/*    */     long l = paramLong ^ 0x15C5F95E708L;
/*    */     return a(l);
/*    */   }
/*    */   
/*    */   public a5 a(long paramLong) {
/*    */     int i = (int)((paramLong ^ 0x4879F7E3EBC2L) >>> 48L), j = (int)((paramLong ^ 0x4879F7E3EBC2L) << 16L >>> 32L), k = (int)((paramLong ^ 0x4879F7E3EBC2L) << 48L >>> 48L);
/*    */     paramLong ^ 0x4879F7E3EBC2L;
/*    */     return new a5(this, (short)i, j, k);
/*    */   }
/*    */   
/*    */   public void a(long paramLong, Object paramObject) {
/*    */     long l = paramLong ^ 0xDB2171EADABL;
/*    */     a((a9)paramObject, l);
/*    */   }
/*    */   
/*    */   private static g a(g paramg) {
/*    */     return paramg;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\a5.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */