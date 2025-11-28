/*    */ package aacinternal;public class a4 extends aw implements s, Serializable { private static final long serialVersionUID = 20150412L; private final ax a;
/*    */   public double a(double[] paramArrayOfdouble, int paramInt1, long paramLong, int paramInt2) {
/*  3 */     long l1 = paramLong ^ 0x34A8411A5E36L, l2 = paramLong ^ 0x0L; return aL.l(l1, this.a.a(paramArrayOfdouble, paramInt1, l2, paramInt2) / paramInt2);
/*    */   } private final boolean c; private static final long d = nc.a(-6383247174054674873L, 4510258597987871008L, MethodHandles.lookup().lookupClass()).a(167304387342113L); public void a(long paramLong, Object paramObject) {
/*  5 */     long l = paramLong ^ 0x2F12FE1FF968L; a((a4)paramObject, l);
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
/*    */ 
/*    */ 
/*    */   
/*    */   public a4(a4 parama4, long paramLong) {
/* 27 */     az.a(l2, parama4); this.a = parama4.a.a(l1);
/*    */     this.c = parama4.c;
/*    */   } public a4(ax paramax) { this.a = paramax;
/*    */     this.c = false; } public a4() { this.a = new ax();
/* 31 */     this.c = true; }
/*    */ 
/*    */   
/*    */   public void a(long paramLong) {
/*    */     // Byte code:
/*    */     //   0: lload_1
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 0
/*    */     //   5: lxor
/*    */     //   6: lstore_3
/*    */     //   7: pop2
/*    */     //   8: ldc2_w -556918723324153403
/*    */     //   11: lload_1
/*    */     //   12: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   17: astore #5
/*    */     //   19: aload_0
/*    */     //   20: aload #5
/*    */     //   22: ifnull -> 58
/*    */     //   25: getfield c : Z
/*    */     //   28: ifeq -> 65
/*    */     //   31: goto -> 44
/*    */     //   34: ldc2_w -462291113225755918
/*    */     //   37: lload_1
/*    */     //   38: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   43: athrow
/*    */     //   44: aload_0
/*    */     //   45: goto -> 58
/*    */     //   48: ldc2_w -462291113225755918
/*    */     //   51: lload_1
/*    */     //   52: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   57: athrow
/*    */     //   58: getfield a : Laacinternal/ax;
/*    */     //   61: lload_3
/*    */     //   62: invokevirtual a : (J)V
/*    */     //   65: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #14	-> 19
/*    */     //   #23	-> 44
/*    */     //   #19	-> 65
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   19	31	34	aacinternal/g
/*    */     //   25	45	48	aacinternal/g
/*    */   }
/*    */   
/*    */   public a4 a(long paramLong) {
/*    */     paramLong = d ^ paramLong;
/*    */     long l = paramLong ^ 0x45C0746AAC6CL;
/*    */     return new a4(this, l);
/*    */   }
/*    */   
/*    */   public c a(long paramLong) {
/*    */     long l = paramLong ^ 0x12AC95942EE1L;
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
/*    */     //   23: ifnull -> 59
/*    */     //   26: getfield c : Z
/*    */     //   29: ifeq -> 68
/*    */     //   32: goto -> 45
/*    */     //   35: ldc2_w -1185393385356266261
/*    */     //   38: lload_3
/*    */     //   39: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   44: athrow
/*    */     //   45: aload_0
/*    */     //   46: goto -> 59
/*    */     //   49: ldc2_w -1185393385356266261
/*    */     //   52: lload_3
/*    */     //   53: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   58: athrow
/*    */     //   59: getfield a : Laacinternal/ax;
/*    */     //   62: dload_1
/*    */     //   63: lload #5
/*    */     //   65: invokevirtual a : (DJ)V
/*    */     //   68: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #18	-> 20
/*    */     //   #9	-> 45
/*    */     //   #7	-> 68
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   20	32	35	aacinternal/g
/*    */     //   26	46	49	aacinternal/g
/*    */   }
/*    */   
/*    */   public aa a(long paramLong) {
/*    */     long l = paramLong ^ 0x7CE1A174890FL;
/*    */     return a(l);
/*    */   }
/*    */   
/*    */   public long a() {
/*    */     return this.a.a();
/*    */   }
/*    */   
/*    */   public void a(a4 parama4, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic aacinternal/a4.d : J
/*    */     //   3: lload_2
/*    */     //   4: lxor
/*    */     //   5: lstore_2
/*    */     //   6: lload_2
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 138371121882617
/*    */     //   11: lxor
/*    */     //   12: lstore #4
/*    */     //   14: dup2
/*    */     //   15: ldc2_w 104572987325406
/*    */     //   18: lxor
/*    */     //   19: dup2
/*    */     //   20: bipush #48
/*    */     //   22: lushr
/*    */     //   23: l2i
/*    */     //   24: istore #6
/*    */     //   26: dup2
/*    */     //   27: bipush #16
/*    */     //   29: lshl
/*    */     //   30: bipush #16
/*    */     //   32: lushr
/*    */     //   33: lstore #7
/*    */     //   35: pop2
/*    */     //   36: pop2
/*    */     //   37: ldc2_w -4685038133463304325
/*    */     //   40: lload_2
/*    */     //   41: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   46: lload #4
/*    */     //   48: aload_1
/*    */     //   49: invokestatic a : (JLjava/lang/Object;)V
/*    */     //   52: astore #9
/*    */     //   54: aload_0
/*    */     //   55: aload #9
/*    */     //   57: ifnull -> 93
/*    */     //   60: getfield c : Z
/*    */     //   63: ifeq -> 111
/*    */     //   66: goto -> 79
/*    */     //   69: ldc2_w -4671473808045595572
/*    */     //   72: lload_2
/*    */     //   73: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   78: athrow
/*    */     //   79: aload_0
/*    */     //   80: goto -> 93
/*    */     //   83: ldc2_w -4671473808045595572
/*    */     //   86: lload_2
/*    */     //   87: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   92: athrow
/*    */     //   93: getfield a : Laacinternal/ax;
/*    */     //   96: aload_1
/*    */     //   97: getfield a : Laacinternal/ax;
/*    */     //   100: iload #6
/*    */     //   102: i2s
/*    */     //   103: swap
/*    */     //   104: lload #7
/*    */     //   106: dup2_x1
/*    */     //   107: pop2
/*    */     //   108: invokevirtual a : (SJLaacinternal/ax;)V
/*    */     //   111: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #30	-> 46
/*    */     //   #12	-> 54
/*    */     //   #28	-> 79
/*    */     //   #2	-> 111
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   54	66	69	aacinternal/g
/*    */     //   60	80	83	aacinternal/g
/*    */   }
/*    */   
/*    */   public double a(long paramLong) {
/*    */     // Byte code:
/*    */     //   0: lload_1
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 877865495781
/*    */     //   5: lxor
/*    */     //   6: lstore_3
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 0
/*    */     //   11: lxor
/*    */     //   12: lstore #5
/*    */     //   14: pop2
/*    */     //   15: ldc2_w -8115920260428364066
/*    */     //   18: lload_1
/*    */     //   19: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   24: astore #7
/*    */     //   26: aload_0
/*    */     //   27: getfield a : Laacinternal/ax;
/*    */     //   30: aload #7
/*    */     //   32: ifnull -> 73
/*    */     //   35: invokevirtual a : ()J
/*    */     //   38: lconst_0
/*    */     //   39: lcmp
/*    */     //   40: ifle -> 94
/*    */     //   43: goto -> 56
/*    */     //   46: ldc2_w -8174450638640278039
/*    */     //   49: lload_1
/*    */     //   50: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   55: athrow
/*    */     //   56: aload_0
/*    */     //   57: getfield a : Laacinternal/ax;
/*    */     //   60: goto -> 73
/*    */     //   63: ldc2_w -8174450638640278039
/*    */     //   66: lload_1
/*    */     //   67: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   72: athrow
/*    */     //   73: lload #5
/*    */     //   75: invokevirtual a : (J)D
/*    */     //   78: aload_0
/*    */     //   79: getfield a : Laacinternal/ax;
/*    */     //   82: invokevirtual a : ()J
/*    */     //   85: l2d
/*    */     //   86: ddiv
/*    */     //   87: lload_3
/*    */     //   88: dup2_x2
/*    */     //   89: pop2
/*    */     //   90: invokestatic l : (JD)D
/*    */     //   93: dreturn
/*    */     //   94: ldc2_w NaN
/*    */     //   97: dreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #32	-> 26
/*    */     //   #4	-> 56
/*    */     //   #26	-> 94
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   26	43	46	aacinternal/g
/*    */     //   35	60	63	aacinternal/g
/*    */   }
/*    */   
/*    */   private static g a(g paramg) {
/*    */     return paramg;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\a4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */