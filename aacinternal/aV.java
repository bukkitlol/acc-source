/*    */ package aacinternal;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.lang.invoke.MethodHandles;
/*    */ import me.konsolas.aac.nc;
/*    */ 
/*    */ public class av extends aw implements Serializable {
/*    */   private static final long serialVersionUID = 20150412L;
/*    */   protected final a5 c;
/*    */   protected final boolean a;
/*    */   private static final long d = nc.a(7750125469346440544L, -7739467375090773624L, MethodHandles.lookup().lookupClass()).a(139434698258376L);
/*    */   
/*    */   public av(a5 parama5) {
/* 14 */     this.c = parama5;
/*    */     
/* 16 */     this.a = false;
/*    */   }
/*    */ 
/*    */   
/*    */   public av a(short paramShort, char paramChar, int paramInt) {
/*    */     long l1 = (paramShort << 48L | paramChar << 48L >>> 16L | paramInt << 32L >>> 32L) ^ d, l2 = l1 ^ 0x1EA4808DB0E8L;
/*    */     return new av(this, l2);
/*    */   }
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
/*    */     //   25: getfield a : Z
/*    */     //   28: ifeq -> 65
/*    */     //   31: goto -> 44
/*    */     //   34: ldc2_w -560216389722151717
/*    */     //   37: lload_1
/*    */     //   38: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   43: athrow
/*    */     //   44: aload_0
/*    */     //   45: goto -> 58
/*    */     //   48: ldc2_w -560216389722151717
/*    */     //   51: lload_1
/*    */     //   52: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   57: athrow
/*    */     //   58: getfield c : Laacinternal/a5;
/*    */     //   61: lload_3
/*    */     //   62: invokevirtual a : (J)V
/*    */     //   65: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #8	-> 19
/*    */     //   #20	-> 44
/*    */     //   #2	-> 65
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   19	31	34	aacinternal/g
/*    */     //   25	45	48	aacinternal/g
/*    */   }
/*    */ 
/*    */   
/*    */   public aa a(long paramLong) {
/*    */     int i = (int)((paramLong ^ 0x469B55C0F9C5L) >>> 48L), j = (int)((paramLong ^ 0x469B55C0F9C5L) << 16L >>> 48L), k = (int)((paramLong ^ 0x469B55C0F9C5L) << 32L >>> 32L);
/*    */     paramLong ^ 0x469B55C0F9C5L;
/*    */     return a((short)i, (char)j, k);
/*    */   }
/*    */   
/*    */   public double a(long paramLong) {
/*    */     // Byte code:
/*    */     //   0: ldc2_w -8115920260428364066
/*    */     //   3: lload_1
/*    */     //   4: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   9: astore_3
/*    */     //   10: aload_0
/*    */     //   11: getfield c : Laacinternal/a5;
/*    */     //   14: aload_3
/*    */     //   15: ifnull -> 59
/*    */     //   18: getfield e : J
/*    */     //   21: ldc2_w 3
/*    */     //   24: lcmp
/*    */     //   25: ifge -> 55
/*    */     //   28: goto -> 41
/*    */     //   31: ldc2_w -8132745615660018752
/*    */     //   34: lload_1
/*    */     //   35: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   40: athrow
/*    */     //   41: ldc2_w NaN
/*    */     //   44: dreturn
/*    */     //   45: ldc2_w -8132745615660018752
/*    */     //   48: lload_1
/*    */     //   49: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   54: athrow
/*    */     //   55: aload_0
/*    */     //   56: getfield c : Laacinternal/a5;
/*    */     //   59: getfield f : D
/*    */     //   62: aload_0
/*    */     //   63: getfield c : Laacinternal/a5;
/*    */     //   66: getfield e : J
/*    */     //   69: lconst_1
/*    */     //   70: lsub
/*    */     //   71: l2d
/*    */     //   72: ddiv
/*    */     //   73: dstore #4
/*    */     //   75: dload #4
/*    */     //   77: aload_3
/*    */     //   78: ifnull -> 121
/*    */     //   81: ldc2_w 1.0E-19
/*    */     //   84: dcmpg
/*    */     //   85: ifge -> 113
/*    */     //   88: goto -> 101
/*    */     //   91: ldc2_w -8132745615660018752
/*    */     //   94: lload_1
/*    */     //   95: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   100: athrow
/*    */     //   101: dconst_0
/*    */     //   102: dreturn
/*    */     //   103: ldc2_w -8132745615660018752
/*    */     //   106: lload_1
/*    */     //   107: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   112: athrow
/*    */     //   113: aload_0
/*    */     //   114: getfield c : Laacinternal/a5;
/*    */     //   117: invokevirtual a : ()J
/*    */     //   120: l2d
/*    */     //   121: dstore #6
/*    */     //   123: dload #6
/*    */     //   125: aload_0
/*    */     //   126: getfield c : Laacinternal/a5;
/*    */     //   129: getfield h : D
/*    */     //   132: dmul
/*    */     //   133: dload #6
/*    */     //   135: dconst_1
/*    */     //   136: dsub
/*    */     //   137: dload #6
/*    */     //   139: ldc2_w 2.0
/*    */     //   142: dsub
/*    */     //   143: dmul
/*    */     //   144: dload #4
/*    */     //   146: invokestatic a : (D)D
/*    */     //   149: dmul
/*    */     //   150: dload #4
/*    */     //   152: dmul
/*    */     //   153: ddiv
/*    */     //   154: dreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #21	-> 10
/*    */     //   #46	-> 41
/*    */     //   #37	-> 55
/*    */     //   #9	-> 75
/*    */     //   #15	-> 101
/*    */     //   #48	-> 113
/*    */     //   #10	-> 123
/*    */     //   #34	-> 146
/*    */     //   #12	-> 154
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   10	28	31	aacinternal/g
/*    */     //   18	45	45	aacinternal/g
/*    */     //   75	88	91	aacinternal/g
/*    */     //   81	103	103	aacinternal/g
/*    */   }
/*    */   
/*    */   public av() {
/* 42 */     this.c = new a5();
/*    */     this.a = true;
/*    */   }
/*    */   
/*    */   public av(av paramav, long paramLong) {
/*    */     az.a(l1, paramav);
/*    */     this.c = paramav.c.a(l2);
/*    */     this.a = paramav.a;
/*    */   }
/*    */   
/*    */   public c a(long paramLong) {
/* 53 */     int i = (int)((paramLong ^ 0x28D661205E2BL) >>> 48L), j = (int)((paramLong ^ 0x28D661205E2BL) << 16L >>> 48L), k = (int)((paramLong ^ 0x28D661205E2BL) << 32L >>> 32L); paramLong ^ 0x28D661205E2BL; return a((short)i, (char)j, k);
/*    */   }
/*    */   
/*    */   public long a() {
/*    */     return this.c.a();
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
/*    */     //   26: getfield a : Z
/*    */     //   29: ifeq -> 68
/*    */     //   32: goto -> 45
/*    */     //   35: ldc2_w -1287879440379645246
/*    */     //   38: lload_3
/*    */     //   39: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   44: athrow
/*    */     //   45: aload_0
/*    */     //   46: goto -> 59
/*    */     //   49: ldc2_w -1287879440379645246
/*    */     //   52: lload_3
/*    */     //   53: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   58: athrow
/*    */     //   59: getfield c : Laacinternal/a5;
/*    */     //   62: dload_1
/*    */     //   63: lload #5
/*    */     //   65: invokevirtual a : (DJ)V
/*    */     //   68: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #38	-> 20
/*    */     //   #45	-> 45
/*    */     //   #28	-> 68
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   20	32	35	aacinternal/g
/*    */     //   26	46	49	aacinternal/g
/*    */   }
/*    */   
/*    */   public double a(double[] paramArrayOfdouble, int paramInt1, long paramLong, int paramInt2) {
/*    */     // Byte code:
/*    */     //   0: lload_3
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 0
/*    */     //   5: lxor
/*    */     //   6: lstore #6
/*    */     //   8: dup2
/*    */     //   9: ldc2_w 113476506211724
/*    */     //   12: lxor
/*    */     //   13: lstore #8
/*    */     //   15: pop2
/*    */     //   16: ldc2_w -4788098390745172979
/*    */     //   19: lload_3
/*    */     //   20: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   25: ldc2_w NaN
/*    */     //   28: dstore #11
/*    */     //   30: astore #10
/*    */     //   32: aload_1
/*    */     //   33: iload_2
/*    */     //   34: lload #8
/*    */     //   36: iload #5
/*    */     //   38: invokestatic a : ([DIJI)Z
/*    */     //   41: aload #10
/*    */     //   43: ifnull -> 64
/*    */     //   46: ifeq -> 304
/*    */     //   49: goto -> 62
/*    */     //   52: ldc2_w -4759853355604500205
/*    */     //   55: lload_3
/*    */     //   56: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   61: athrow
/*    */     //   62: iload #5
/*    */     //   64: iconst_2
/*    */     //   65: if_icmple -> 304
/*    */     //   68: new aacinternal/aJ
/*    */     //   71: dup
/*    */     //   72: invokespecial <init> : ()V
/*    */     //   75: astore #13
/*    */     //   77: aload #13
/*    */     //   79: aload_1
/*    */     //   80: iload_2
/*    */     //   81: lload #6
/*    */     //   83: iload #5
/*    */     //   85: invokevirtual a : ([DIJI)D
/*    */     //   88: dstore #14
/*    */     //   90: dconst_0
/*    */     //   91: dstore #16
/*    */     //   93: dconst_0
/*    */     //   94: dstore #18
/*    */     //   96: iload_2
/*    */     //   97: istore #20
/*    */     //   99: iload #20
/*    */     //   101: iload_2
/*    */     //   102: iload #5
/*    */     //   104: iadd
/*    */     //   105: if_icmpge -> 172
/*    */     //   108: aload_1
/*    */     //   109: iload #20
/*    */     //   111: daload
/*    */     //   112: dload #14
/*    */     //   114: dsub
/*    */     //   115: dstore #21
/*    */     //   117: dload #16
/*    */     //   119: dload #21
/*    */     //   121: dload #21
/*    */     //   123: dmul
/*    */     //   124: dadd
/*    */     //   125: dstore #16
/*    */     //   127: dload #18
/*    */     //   129: dload #21
/*    */     //   131: dadd
/*    */     //   132: lload_3
/*    */     //   133: lconst_0
/*    */     //   134: lcmp
/*    */     //   135: ifle -> 306
/*    */     //   138: dstore #18
/*    */     //   140: iinc #20, 1
/*    */     //   143: aload #10
/*    */     //   145: ifnull -> 304
/*    */     //   148: aload #10
/*    */     //   150: ifnonnull -> 99
/*    */     //   153: lload_3
/*    */     //   154: lconst_0
/*    */     //   155: lcmp
/*    */     //   156: iflt -> 143
/*    */     //   159: goto -> 172
/*    */     //   162: ldc2_w -4759853355604500205
/*    */     //   165: lload_3
/*    */     //   166: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   171: athrow
/*    */     //   172: dload #16
/*    */     //   174: dload #18
/*    */     //   176: dload #18
/*    */     //   178: dmul
/*    */     //   179: iload #5
/*    */     //   181: i2d
/*    */     //   182: ddiv
/*    */     //   183: dsub
/*    */     //   184: iload #5
/*    */     //   186: iconst_1
/*    */     //   187: isub
/*    */     //   188: i2d
/*    */     //   189: ddiv
/*    */     //   190: dstore #20
/*    */     //   192: dconst_0
/*    */     //   193: dstore #22
/*    */     //   195: iload_2
/*    */     //   196: istore #24
/*    */     //   198: iload #24
/*    */     //   200: iload_2
/*    */     //   201: iload #5
/*    */     //   203: iadd
/*    */     //   204: if_icmpge -> 267
/*    */     //   207: aload_1
/*    */     //   208: iload #24
/*    */     //   210: daload
/*    */     //   211: dload #14
/*    */     //   213: dsub
/*    */     //   214: dstore #25
/*    */     //   216: dload #22
/*    */     //   218: dload #25
/*    */     //   220: dload #25
/*    */     //   222: dmul
/*    */     //   223: dload #25
/*    */     //   225: dmul
/*    */     //   226: dadd
/*    */     //   227: lload_3
/*    */     //   228: lconst_0
/*    */     //   229: lcmp
/*    */     //   230: iflt -> 283
/*    */     //   233: dstore #22
/*    */     //   235: iinc #24, 1
/*    */     //   238: aload #10
/*    */     //   240: ifnull -> 280
/*    */     //   243: aload #10
/*    */     //   245: ifnonnull -> 198
/*    */     //   248: lload_3
/*    */     //   249: lconst_0
/*    */     //   250: lcmp
/*    */     //   251: ifle -> 238
/*    */     //   254: goto -> 267
/*    */     //   257: ldc2_w -4759853355604500205
/*    */     //   260: lload_3
/*    */     //   261: <illegal opcode> w : (Ljava/lang/RuntimeException;JJ)Ljava/lang/RuntimeException;
/*    */     //   266: athrow
/*    */     //   267: dload #22
/*    */     //   269: dload #20
/*    */     //   271: dload #20
/*    */     //   273: invokestatic a : (D)D
/*    */     //   276: dmul
/*    */     //   277: ddiv
/*    */     //   278: dstore #22
/*    */     //   280: iload #5
/*    */     //   282: i2d
/*    */     //   283: dstore #24
/*    */     //   285: dload #24
/*    */     //   287: dload #24
/*    */     //   289: dconst_1
/*    */     //   290: dsub
/*    */     //   291: dload #24
/*    */     //   293: ldc2_w 2.0
/*    */     //   296: dsub
/*    */     //   297: dmul
/*    */     //   298: ddiv
/*    */     //   299: dload #22
/*    */     //   301: dmul
/*    */     //   302: dstore #11
/*    */     //   304: dload #11
/*    */     //   306: dreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #41	-> 25
/*    */     //   #33	-> 32
/*    */     //   #29	-> 68
/*    */     //   #40	-> 77
/*    */     //   #7	-> 90
/*    */     //   #51	-> 93
/*    */     //   #36	-> 96
/*    */     //   #18	-> 108
/*    */     //   #32	-> 117
/*    */     //   #3	-> 127
/*    */     //   #30	-> 140
/*    */     //   #17	-> 172
/*    */     //   #44	-> 192
/*    */     //   #47	-> 195
/*    */     //   #49	-> 207
/*    */     //   #43	-> 216
/*    */     //   #1	-> 235
/*    */     //   #13	-> 267
/*    */     //   #35	-> 280
/*    */     //   #24	-> 285
/*    */     //   #27	-> 304
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   32	49	52	aacinternal/v
/*    */     //   140	153	162	aacinternal/v
/*    */     //   235	248	257	aacinternal/v
/*    */   }
/*    */   
/*    */   private static RuntimeException a(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\av.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */