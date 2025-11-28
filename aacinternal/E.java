/*    */ package aacinternal;
/*    */ 
/*    */ import java.lang.invoke.MethodHandles;
/*    */ 
/*    */ public class e extends d {
/*    */   private static final long serialVersionUID = 20160320L;
/*    */   private final double e;
/*    */   
/*  9 */   public e(char paramChar, double paramDouble, short paramShort, int paramInt) { this(l2, paramDouble, 1.0E-9D); }
/*    */   private final double a; private static final long f = nc.a(-5051339639699850983L, 6917535121438680140L, MethodHandles.lookup().lookupClass()).a(214167163215207L); public double b(long paramLong, double paramDouble) { // Byte code:
/*    */     //   0: lload_1
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 104910698083957
/*    */     //   5: lxor
/*    */     //   6: lstore #5
/*    */     //   8: pop2
/*    */     //   9: ldc2_w 3653986650689435450
/*    */     //   12: lload_1
/*    */     //   13: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   18: astore #7
/*    */     //   20: dload_3
/*    */     //   21: dconst_0
/*    */     //   22: aload #7
/*    */     //   24: ifnull -> 94
/*    */     //   27: dcmpl
/*    */     //   28: ifne -> 60
/*    */     //   31: goto -> 44
/*    */     //   34: ldc2_w 3670324059290705388
/*    */     //   37: lload_1
/*    */     //   38: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   43: athrow
/*    */     //   44: ldc2_w 0.5
/*    */     //   47: lload_1
/*    */     //   48: lconst_0
/*    */     //   49: lcmp
/*    */     //   50: iflt -> 73
/*    */     //   53: dstore #8
/*    */     //   55: aload #7
/*    */     //   57: ifnonnull -> 176
/*    */     //   60: aload_0
/*    */     //   61: getfield e : D
/*    */     //   64: aload_0
/*    */     //   65: getfield e : D
/*    */     //   68: dload_3
/*    */     //   69: dload_3
/*    */     //   70: dmul
/*    */     //   71: dadd
/*    */     //   72: ddiv
/*    */     //   73: ldc2_w 0.5
/*    */     //   76: aload_0
/*    */     //   77: getfield e : D
/*    */     //   80: dmul
/*    */     //   81: goto -> 94
/*    */     //   84: ldc2_w 3670324059290705388
/*    */     //   87: lload_1
/*    */     //   88: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   93: athrow
/*    */     //   94: ldc2_w 0.5
/*    */     //   97: lload #5
/*    */     //   99: invokestatic a : (DDDJ)D
/*    */     //   102: dstore #10
/*    */     //   104: dload_3
/*    */     //   105: lload_1
/*    */     //   106: lconst_0
/*    */     //   107: lcmp
/*    */     //   108: ifle -> 174
/*    */     //   111: dconst_0
/*    */     //   112: aload #7
/*    */     //   114: ifnull -> 173
/*    */     //   117: dcmpg
/*    */     //   118: ifge -> 153
/*    */     //   121: goto -> 134
/*    */     //   124: ldc2_w 3670324059290705388
/*    */     //   127: lload_1
/*    */     //   128: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   133: athrow
/*    */     //   134: ldc2_w 0.5
/*    */     //   137: dload #10
/*    */     //   139: dmul
/*    */     //   140: lload_1
/*    */     //   141: lconst_0
/*    */     //   142: lcmp
/*    */     //   143: ifle -> 154
/*    */     //   146: dstore #8
/*    */     //   148: aload #7
/*    */     //   150: ifnonnull -> 176
/*    */     //   153: dconst_1
/*    */     //   154: ldc2_w 0.5
/*    */     //   157: dload #10
/*    */     //   159: dmul
/*    */     //   160: goto -> 173
/*    */     //   163: ldc2_w 3670324059290705388
/*    */     //   166: lload_1
/*    */     //   167: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   172: athrow
/*    */     //   173: dsub
/*    */     //   174: dstore #8
/*    */     //   176: dload #8
/*    */     //   178: dreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #6	-> 20
/*    */     //   #24	-> 44
/*    */     //   #17	-> 60
/*    */     //   #21	-> 97
/*    */     //   #32	-> 104
/*    */     //   #26	-> 134
/*    */     //   #25	-> 153
/*    */     //   #33	-> 176
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   20	31	34	aacinternal/v
/*    */     //   55	81	84	aacinternal/v
/*    */     //   104	121	124	aacinternal/v
/*    */     //   148	160	163	aacinternal/v } public double a(long paramLong, double paramDouble) {
/*    */     // Byte code:
/*    */     //   0: lload_1
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 51172520241476
/*    */     //   5: lxor
/*    */     //   6: dup2
/*    */     //   7: bipush #32
/*    */     //   9: lushr
/*    */     //   10: l2i
/*    */     //   11: istore #5
/*    */     //   13: dup2
/*    */     //   14: bipush #32
/*    */     //   16: lshl
/*    */     //   17: bipush #48
/*    */     //   19: lushr
/*    */     //   20: l2i
/*    */     //   21: istore #6
/*    */     //   23: dup2
/*    */     //   24: bipush #48
/*    */     //   26: lshl
/*    */     //   27: bipush #48
/*    */     //   29: lushr
/*    */     //   30: l2i
/*    */     //   31: istore #7
/*    */     //   33: pop2
/*    */     //   34: pop2
/*    */     //   35: ldc2_w 1404518977131173618
/*    */     //   38: lload_1
/*    */     //   39: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   44: aload_0
/*    */     //   45: getfield e : D
/*    */     //   48: dstore #9
/*    */     //   50: dload #9
/*    */     //   52: dconst_1
/*    */     //   53: dadd
/*    */     //   54: ldc2_w 2.0
/*    */     //   57: ddiv
/*    */     //   58: dstore #11
/*    */     //   60: astore #8
/*    */     //   62: aload_0
/*    */     //   63: getfield a : D
/*    */     //   66: dload #11
/*    */     //   68: dconst_1
/*    */     //   69: dload_3
/*    */     //   70: dload_3
/*    */     //   71: dmul
/*    */     //   72: dload #9
/*    */     //   74: ddiv
/*    */     //   75: dadd
/*    */     //   76: iload #5
/*    */     //   78: iload #6
/*    */     //   80: iload #7
/*    */     //   82: invokestatic h : (DIII)D
/*    */     //   85: dmul
/*    */     //   86: dsub
/*    */     //   87: ldc2_w 1371653844745869226
/*    */     //   90: lload_1
/*    */     //   91: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   96: ifnull -> 125
/*    */     //   99: iconst_5
/*    */     //   100: anewarray me/konsolas/aac/aN
/*    */     //   103: ldc2_w 1386137834973983789
/*    */     //   106: lload_1
/*    */     //   107: <illegal opcode> w : ([Lme/konsolas/aac/aN;JJ)V
/*    */     //   112: goto -> 125
/*    */     //   115: ldc2_w 1380308925571251236
/*    */     //   118: lload_1
/*    */     //   119: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   124: athrow
/*    */     //   125: dreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #12	-> 44
/*    */     //   #39	-> 50
/*    */     //   #31	-> 62
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   62	112	115	aacinternal/v
/*    */   } public double f() {
/* 13 */     return this.e;
/*    */   } public double b(long paramLong) {
/*    */     // Byte code:
/*    */     //   0: ldc2_w 3505690647647876393
/*    */     //   3: lload_1
/*    */     //   4: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   9: aload_0
/*    */     //   10: invokevirtual f : ()D
/*    */     //   13: dstore #4
/*    */     //   15: astore_3
/*    */     //   16: dload #4
/*    */     //   18: aload_3
/*    */     //   19: ifnull -> 55
/*    */     //   22: dconst_1
/*    */     //   23: dcmpl
/*    */     //   24: ifle -> 52
/*    */     //   27: goto -> 40
/*    */     //   30: ldc2_w 3529900885117149183
/*    */     //   33: lload_1
/*    */     //   34: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   39: athrow
/*    */     //   40: dconst_0
/*    */     //   41: dreturn
/*    */     //   42: ldc2_w 3529900885117149183
/*    */     //   45: lload_1
/*    */     //   46: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   51: athrow
/*    */     //   52: ldc2_w NaN
/*    */     //   55: dreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #15	-> 9
/*    */     //   #34	-> 16
/*    */     //   #1	-> 40
/*    */     //   #23	-> 52
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   16	27	30	aacinternal/v
/*    */     //   22	42	42	aacinternal/v
/*    */   } public e(long paramLong, double paramDouble1, double paramDouble2) {
/*    */     // Byte code:
/*    */     //   0: getstatic aacinternal/e.f : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: lload_1
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 69798237630414
/*    */     //   11: lxor
/*    */     //   12: lstore #7
/*    */     //   14: dup2
/*    */     //   15: ldc2_w 44467327838384
/*    */     //   18: lxor
/*    */     //   19: dup2
/*    */     //   20: bipush #48
/*    */     //   22: lushr
/*    */     //   23: l2i
/*    */     //   24: istore #9
/*    */     //   26: dup2
/*    */     //   27: bipush #16
/*    */     //   29: lshl
/*    */     //   30: bipush #32
/*    */     //   32: lushr
/*    */     //   33: l2i
/*    */     //   34: istore #10
/*    */     //   36: dup2
/*    */     //   37: bipush #48
/*    */     //   39: lshl
/*    */     //   40: bipush #48
/*    */     //   42: lushr
/*    */     //   43: l2i
/*    */     //   44: istore #11
/*    */     //   46: pop2
/*    */     //   47: dup2
/*    */     //   48: ldc2_w 113886985951594
/*    */     //   51: lxor
/*    */     //   52: dup2
/*    */     //   53: bipush #32
/*    */     //   55: lushr
/*    */     //   56: l2i
/*    */     //   57: istore #12
/*    */     //   59: dup2
/*    */     //   60: bipush #32
/*    */     //   62: lshl
/*    */     //   63: bipush #48
/*    */     //   65: lushr
/*    */     //   66: l2i
/*    */     //   67: istore #13
/*    */     //   69: dup2
/*    */     //   70: bipush #48
/*    */     //   72: lshl
/*    */     //   73: bipush #48
/*    */     //   75: lushr
/*    */     //   76: l2i
/*    */     //   77: istore #14
/*    */     //   79: pop2
/*    */     //   80: pop2
/*    */     //   81: ldc2_w -6677831577411426596
/*    */     //   84: lload_1
/*    */     //   85: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   90: aload_0
/*    */     //   91: dload #5
/*    */     //   93: invokespecial <init> : (D)V
/*    */     //   96: astore #15
/*    */     //   98: dload_3
/*    */     //   99: aload #15
/*    */     //   101: ifnull -> 168
/*    */     //   104: dconst_0
/*    */     //   105: dcmpg
/*    */     //   106: ifgt -> 162
/*    */     //   109: goto -> 122
/*    */     //   112: ldc2_w -6698648451413308406
/*    */     //   115: lload_1
/*    */     //   116: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   121: athrow
/*    */     //   122: new aacinternal/v
/*    */     //   125: dup
/*    */     //   126: getstatic aacinternal/P.DEGREES_OF_FREEDOM : Laacinternal/P;
/*    */     //   129: iconst_1
/*    */     //   130: anewarray java/lang/Object
/*    */     //   133: dup
/*    */     //   134: iconst_0
/*    */     //   135: dload_3
/*    */     //   136: invokestatic valueOf : (D)Ljava/lang/Double;
/*    */     //   139: aastore
/*    */     //   140: iload #9
/*    */     //   142: i2s
/*    */     //   143: iload #10
/*    */     //   145: iload #11
/*    */     //   147: i2s
/*    */     //   148: invokespecial <init> : (Laacinternal/H;[Ljava/lang/Object;SIS)V
/*    */     //   151: athrow
/*    */     //   152: ldc2_w -6698648451413308406
/*    */     //   155: lload_1
/*    */     //   156: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   161: athrow
/*    */     //   162: aload_0
/*    */     //   163: dload_3
/*    */     //   164: putfield e : D
/*    */     //   167: dload_3
/*    */     //   168: dstore #16
/*    */     //   170: dload #16
/*    */     //   172: dconst_1
/*    */     //   173: dadd
/*    */     //   174: ldc2_w 2.0
/*    */     //   177: ddiv
/*    */     //   178: dstore #18
/*    */     //   180: aload_0
/*    */     //   181: dload #18
/*    */     //   183: lload #7
/*    */     //   185: invokestatic b : (DJ)D
/*    */     //   188: ldc2_w 0.5
/*    */     //   191: ldc2_w 3.141592653589793
/*    */     //   194: iload #12
/*    */     //   196: iload #13
/*    */     //   198: iload #14
/*    */     //   200: invokestatic h : (DIII)D
/*    */     //   203: dload #16
/*    */     //   205: iload #12
/*    */     //   207: iload #13
/*    */     //   209: iload #14
/*    */     //   211: invokestatic h : (DIII)D
/*    */     //   214: dadd
/*    */     //   215: dmul
/*    */     //   216: dsub
/*    */     //   217: dload #16
/*    */     //   219: ldc2_w 2.0
/*    */     //   222: ddiv
/*    */     //   223: lload #7
/*    */     //   225: invokestatic b : (DJ)D
/*    */     //   228: dsub
/*    */     //   229: putfield a : D
/*    */     //   232: aload #15
/*    */     //   234: lload_1
/*    */     //   235: lconst_0
/*    */     //   236: lcmp
/*    */     //   237: ifle -> 247
/*    */     //   240: ifnonnull -> 269
/*    */     //   243: iconst_1
/*    */     //   244: anewarray me/konsolas/aac/aN
/*    */     //   247: ldc2_w -6693884540385330481
/*    */     //   250: lload_1
/*    */     //   251: <illegal opcode> w : ([Lme/konsolas/aac/aN;JJ)V
/*    */     //   256: goto -> 269
/*    */     //   259: ldc2_w -6698648451413308406
/*    */     //   262: lload_1
/*    */     //   263: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   268: athrow
/*    */     //   269: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #19	-> 90
/*    */     //   #8	-> 98
/*    */     //   #38	-> 122
/*    */     //   #14	-> 136
/*    */     //   #7	-> 162
/*    */     //   #5	-> 167
/*    */     //   #4	-> 170
/*    */     //   #10	-> 180
/*    */     //   #28	-> 194
/*    */     //   #18	-> 223
/*    */     //   #2	-> 232
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   98	109	112	aacinternal/v
/*    */     //   104	152	152	aacinternal/v
/*    */     //   180	256	259	aacinternal/v
/*    */   }
/*    */   public double c() {
/* 20 */     return Double.POSITIVE_INFINITY;
/*    */   }
/*    */ 
/*    */   
/*    */   public double a(short paramShort1, int paramInt, short paramShort2) {
/*    */     // Byte code:
/*    */     //   0: iload_1
/*    */     //   1: i2l
/*    */     //   2: bipush #48
/*    */     //   4: lshl
/*    */     //   5: iload_2
/*    */     //   6: i2l
/*    */     //   7: bipush #32
/*    */     //   9: lshl
/*    */     //   10: bipush #16
/*    */     //   12: lushr
/*    */     //   13: lor
/*    */     //   14: iload_3
/*    */     //   15: i2l
/*    */     //   16: bipush #48
/*    */     //   18: lshl
/*    */     //   19: bipush #48
/*    */     //   21: lushr
/*    */     //   22: lor
/*    */     //   23: lstore #4
/*    */     //   25: ldc2_w -6321395542589477430
/*    */     //   28: lload #4
/*    */     //   30: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   35: aload_0
/*    */     //   36: invokevirtual f : ()D
/*    */     //   39: dstore #7
/*    */     //   41: astore #6
/*    */     //   43: dload #7
/*    */     //   45: ldc2_w 2.0
/*    */     //   48: dcmpl
/*    */     //   49: aload #6
/*    */     //   51: ifnull -> 115
/*    */     //   54: ifle -> 92
/*    */     //   57: goto -> 71
/*    */     //   60: ldc2_w -6332086322236487908
/*    */     //   63: lload #4
/*    */     //   65: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   70: athrow
/*    */     //   71: dload #7
/*    */     //   73: dload #7
/*    */     //   75: ldc2_w 2.0
/*    */     //   78: dsub
/*    */     //   79: ddiv
/*    */     //   80: dreturn
/*    */     //   81: ldc2_w -6332086322236487908
/*    */     //   84: lload #4
/*    */     //   86: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   91: athrow
/*    */     //   92: dload #7
/*    */     //   94: aload #6
/*    */     //   96: ifnull -> 178
/*    */     //   99: dconst_1
/*    */     //   100: dcmpl
/*    */     //   101: goto -> 115
/*    */     //   104: ldc2_w -6332086322236487908
/*    */     //   107: lload #4
/*    */     //   109: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   114: athrow
/*    */     //   115: ifle -> 175
/*    */     //   118: dload #7
/*    */     //   120: aload #6
/*    */     //   122: ifnull -> 178
/*    */     //   125: goto -> 139
/*    */     //   128: ldc2_w -6332086322236487908
/*    */     //   131: lload #4
/*    */     //   133: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   138: athrow
/*    */     //   139: ldc2_w 2.0
/*    */     //   142: dcmpg
/*    */     //   143: ifgt -> 175
/*    */     //   146: goto -> 160
/*    */     //   149: ldc2_w -6332086322236487908
/*    */     //   152: lload #4
/*    */     //   154: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   159: athrow
/*    */     //   160: ldc2_w Infinity
/*    */     //   163: dreturn
/*    */     //   164: ldc2_w -6332086322236487908
/*    */     //   167: lload #4
/*    */     //   169: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   174: athrow
/*    */     //   175: ldc2_w NaN
/*    */     //   178: dreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #22	-> 35
/*    */     //   #11	-> 43
/*    */     //   #16	-> 71
/*    */     //   #3	-> 92
/*    */     //   #29	-> 160
/*    */     //   #27	-> 175
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   43	57	60	aacinternal/v
/*    */     //   54	81	81	aacinternal/v
/*    */     //   92	101	104	aacinternal/v
/*    */     //   115	125	128	aacinternal/v
/*    */     //   118	146	149	aacinternal/v
/*    */     //   139	164	164	aacinternal/v
/*    */   }
/*    */ 
/*    */   
/*    */   public double d() {
/* 30 */     return Double.NEGATIVE_INFINITY;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a()
/*    */   {
/* 36 */     return true; } public double c(double paramDouble, long paramLong) {
/* 37 */     long l1 = paramLong ^ 0x777D4126CEF5L, l2 = paramLong ^ 0x6C2A9C243E21L; return aL.l(l2, a(l1, paramDouble));
/*    */   }
/*    */   
/*    */   private static v b(v paramv) {
/*    */     return paramv;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */