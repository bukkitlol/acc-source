/*  1 */ package aacinternal;public class aq extends aw implements s, Serializable { public double a(long paramLong) { return this.a; }
/*    */   
/*    */   private static final long serialVersionUID = 20150412L;
/*    */   private long c;
/*    */   private double a;
/*    */   private static final long d = nc.a(2555850453115471208L, -7009468312713722414L, MethodHandles.lookup().lookupClass()).a(13909751369043L);
/*    */   
/*    */   public long a() {
/*  9 */     return this.c;
/*    */   }
/*    */   public c a(long paramLong) {
/* 12 */     long l = paramLong ^ 0x14F4A0F6FC10L; return a(l);
/*    */   }
/*    */   
/*    */   public aa a(long paramLong) {
/* 16 */     long l = paramLong ^ 0x7AB994165BFEL; return a(l);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public aq a(long paramLong) {
/* 22 */     paramLong = d ^ paramLong; long l = paramLong ^ 0x14B9B56738D5L; return new aq(l, this);
/*    */   }
/*    */   
/* 25 */   public void a(long paramLong) { this.a = Double.NaN;
/*    */     this.c = 0L; }
/*    */   public double a(double[] paramArrayOfdouble, int paramInt1, long paramLong, int paramInt2) { // Byte code:
/*    */     //   0: lload_3
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 113476506211724
/*    */     //   5: lxor
/*    */     //   6: lstore #6
/*    */     //   8: pop2
/*    */     //   9: ldc2_w -4813778690600387458
/*    */     //   12: lload_3
/*    */     //   13: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   18: ldc2_w NaN
/*    */     //   21: dstore #9
/*    */     //   23: astore #8
/*    */     //   25: aload_1
/*    */     //   26: iload_2
/*    */     //   27: lload #6
/*    */     //   29: iload #5
/*    */     //   31: invokestatic a : ([DIJI)Z
/*    */     //   34: aload #8
/*    */     //   36: ifnull -> 61
/*    */     //   39: ifeq -> 178
/*    */     //   42: goto -> 55
/*    */     //   45: ldc2_w -4880700944914362396
/*    */     //   48: lload_3
/*    */     //   49: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   54: athrow
/*    */     //   55: aload_1
/*    */     //   56: iload_2
/*    */     //   57: daload
/*    */     //   58: dstore #9
/*    */     //   60: iload_2
/*    */     //   61: istore #11
/*    */     //   63: iload #11
/*    */     //   65: iload_2
/*    */     //   66: iload #5
/*    */     //   68: iadd
/*    */     //   69: if_icmpge -> 178
/*    */     //   72: aload_1
/*    */     //   73: iload #11
/*    */     //   75: daload
/*    */     //   76: aload #8
/*    */     //   78: ifnull -> 180
/*    */     //   81: invokestatic isNaN : (D)Z
/*    */     //   84: aload #8
/*    */     //   86: ifnull -> 156
/*    */     //   89: goto -> 102
/*    */     //   92: ldc2_w -4880700944914362396
/*    */     //   95: lload_3
/*    */     //   96: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   101: athrow
/*    */     //   102: ifne -> 170
/*    */     //   105: goto -> 118
/*    */     //   108: ldc2_w -4880700944914362396
/*    */     //   111: lload_3
/*    */     //   112: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   117: athrow
/*    */     //   118: dload #9
/*    */     //   120: aload #8
/*    */     //   122: ifnull -> 161
/*    */     //   125: goto -> 138
/*    */     //   128: ldc2_w -4880700944914362396
/*    */     //   131: lload_3
/*    */     //   132: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   137: athrow
/*    */     //   138: aload_1
/*    */     //   139: iload #11
/*    */     //   141: daload
/*    */     //   142: dcmpl
/*    */     //   143: goto -> 156
/*    */     //   146: ldc2_w -4880700944914362396
/*    */     //   149: lload_3
/*    */     //   150: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   155: athrow
/*    */     //   156: ifle -> 164
/*    */     //   159: dload #9
/*    */     //   161: goto -> 168
/*    */     //   164: aload_1
/*    */     //   165: iload #11
/*    */     //   167: daload
/*    */     //   168: dstore #9
/*    */     //   170: iinc #11, 1
/*    */     //   173: aload #8
/*    */     //   175: ifnonnull -> 63
/*    */     //   178: dload #9
/*    */     //   180: dreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #27	-> 18
/*    */     //   #5	-> 25
/*    */     //   #18	-> 55
/*    */     //   #10	-> 60
/*    */     //   #8	-> 72
/*    */     //   #3	-> 118
/*    */     //   #14	-> 170
/*    */     //   #20	-> 178
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   25	42	45	aacinternal/v
/*    */     //   72	89	92	aacinternal/v
/*    */     //   81	105	108	aacinternal/v
/*    */     //   102	125	128	aacinternal/v
/*    */     //   118	143	146	aacinternal/v }
/* 28 */   public void a(long paramLong, Object paramObject) { int i = (int)((paramLong ^ 0x16C9C66B3F2FL) >>> 32L), j = (int)((paramLong ^ 0x16C9C66B3F2FL) << 32L >>> 48L), k = (int)((paramLong ^ 0x16C9C66B3F2FL) << 48L >>> 48L); paramLong ^ 0x16C9C66B3F2FL; a(i, j, (short)k, (aq)paramObject); } public aq(long paramLong, aq paramaq) { az.a(l, paramaq);
/*    */     this.c = paramaq.c;
/*    */     this.a = paramaq.a; }
/* 31 */   public aq() { this.c = 0L;
/*    */     this.a = Double.NaN; }
/*    */ 
/*    */   
/*    */   public void a(int paramInt1, int paramInt2, short paramShort, aq paramaq) {
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
/*    */     //   14: iload_3
/*    */     //   15: i2l
/*    */     //   16: bipush #48
/*    */     //   18: lshl
/*    */     //   19: bipush #48
/*    */     //   21: lushr
/*    */     //   22: lor
/*    */     //   23: getstatic aacinternal/aq.d : J
/*    */     //   26: lxor
/*    */     //   27: lstore #5
/*    */     //   29: lload #5
/*    */     //   31: dup2
/*    */     //   32: ldc2_w 1613078614701
/*    */     //   35: lxor
/*    */     //   36: lstore #7
/*    */     //   38: pop2
/*    */     //   39: ldc2_w -3958560557073610660
/*    */     //   42: lload #5
/*    */     //   44: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   49: lload #7
/*    */     //   51: aload #4
/*    */     //   53: invokestatic a : (JLjava/lang/Object;)V
/*    */     //   56: astore #9
/*    */     //   58: aload #4
/*    */     //   60: getfield c : J
/*    */     //   63: lconst_0
/*    */     //   64: lcmp
/*    */     //   65: aload #9
/*    */     //   67: ifnull -> 130
/*    */     //   70: ifle -> 213
/*    */     //   73: goto -> 87
/*    */     //   76: ldc2_w -4006479956218659898
/*    */     //   79: lload #5
/*    */     //   81: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   86: athrow
/*    */     //   87: aload #4
/*    */     //   89: aload #9
/*    */     //   91: ifnull -> 191
/*    */     //   94: goto -> 108
/*    */     //   97: ldc2_w -4006479956218659898
/*    */     //   100: lload #5
/*    */     //   102: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   107: athrow
/*    */     //   108: getfield a : D
/*    */     //   111: aload_0
/*    */     //   112: getfield a : D
/*    */     //   115: dcmpl
/*    */     //   116: goto -> 130
/*    */     //   119: ldc2_w -4006479956218659898
/*    */     //   122: lload #5
/*    */     //   124: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   129: athrow
/*    */     //   130: ifgt -> 176
/*    */     //   133: aload_0
/*    */     //   134: aload #9
/*    */     //   136: ifnull -> 200
/*    */     //   139: goto -> 153
/*    */     //   142: ldc2_w -4006479956218659898
/*    */     //   145: lload #5
/*    */     //   147: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   152: athrow
/*    */     //   153: getfield a : D
/*    */     //   156: invokestatic isNaN : (D)Z
/*    */     //   159: ifeq -> 199
/*    */     //   162: goto -> 176
/*    */     //   165: ldc2_w -4006479956218659898
/*    */     //   168: lload #5
/*    */     //   170: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   175: athrow
/*    */     //   176: aload_0
/*    */     //   177: goto -> 191
/*    */     //   180: ldc2_w -4006479956218659898
/*    */     //   183: lload #5
/*    */     //   185: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   190: athrow
/*    */     //   191: aload #4
/*    */     //   193: getfield a : D
/*    */     //   196: putfield a : D
/*    */     //   199: aload_0
/*    */     //   200: dup
/*    */     //   201: getfield c : J
/*    */     //   204: aload #4
/*    */     //   206: getfield c : J
/*    */     //   209: ladd
/*    */     //   210: putfield c : J
/*    */     //   213: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #33	-> 49
/*    */     //   #30	-> 58
/*    */     //   #2	-> 87
/*    */     //   #36	-> 176
/*    */     //   #24	-> 199
/*    */     //   #19	-> 213
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   58	73	76	aacinternal/g
/*    */     //   70	94	97	aacinternal/g
/*    */     //   87	116	119	aacinternal/g
/*    */     //   130	139	142	aacinternal/g
/*    */     //   133	162	165	aacinternal/g
/*    */     //   153	177	180	aacinternal/g
/*    */   }
/*    */   
/*    */   public void a(double paramDouble, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: ldc2_w -1233116418947321937
/*    */     //   3: lload_3
/*    */     //   4: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   9: astore #5
/*    */     //   11: dload_1
/*    */     //   12: aload_0
/*    */     //   13: getfield a : D
/*    */     //   16: dcmpl
/*    */     //   17: lload_3
/*    */     //   18: lconst_0
/*    */     //   19: lcmp
/*    */     //   20: ifle -> 88
/*    */     //   23: aload #5
/*    */     //   25: ifnull -> 88
/*    */     //   28: ifgt -> 91
/*    */     //   31: goto -> 44
/*    */     //   34: ldc2_w -1182943983304893387
/*    */     //   37: lload_3
/*    */     //   38: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   43: athrow
/*    */     //   44: lload_3
/*    */     //   45: lconst_0
/*    */     //   46: lcmp
/*    */     //   47: iflt -> 119
/*    */     //   50: aload_0
/*    */     //   51: aload #5
/*    */     //   53: ifnull -> 110
/*    */     //   56: goto -> 69
/*    */     //   59: ldc2_w -1182943983304893387
/*    */     //   62: lload_3
/*    */     //   63: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   68: athrow
/*    */     //   69: getfield a : D
/*    */     //   72: invokestatic isNaN : (D)Z
/*    */     //   75: goto -> 88
/*    */     //   78: ldc2_w -1182943983304893387
/*    */     //   81: lload_3
/*    */     //   82: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   87: athrow
/*    */     //   88: ifeq -> 109
/*    */     //   91: aload_0
/*    */     //   92: dload_1
/*    */     //   93: putfield a : D
/*    */     //   96: goto -> 109
/*    */     //   99: ldc2_w -1182943983304893387
/*    */     //   102: lload_3
/*    */     //   103: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   108: athrow
/*    */     //   109: aload_0
/*    */     //   110: dup
/*    */     //   111: getfield c : J
/*    */     //   114: lconst_1
/*    */     //   115: ladd
/*    */     //   116: putfield c : J
/*    */     //   119: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #35	-> 11
/*    */     //   #21	-> 91
/*    */     //   #4	-> 109
/*    */     //   #29	-> 119
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   11	31	34	aacinternal/g
/*    */     //   28	56	59	aacinternal/g
/*    */     //   44	75	78	aacinternal/g
/*    */     //   88	96	99	aacinternal/g
/*    */   }
/*    */   
/*    */   private static RuntimeException a(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\aq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */