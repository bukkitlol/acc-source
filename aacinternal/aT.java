/*    */ package aacinternal;abstract class at extends au { public void a(char paramChar, int paramInt1, byte[] paramArrayOfbyte, int paramInt2) {
/*  2 */     long l = paramChar << 48L | paramInt1 << 32L >>> 16L | paramInt2 << 48L >>> 48L; int i = (int)((l ^ 0x5FDBDEDBD2A6L) >>> 56L), j = (int)((l ^ 0x5FDBDEDBD2A6L) << 8L >>> 32L), k = (int)((l ^ 0x5FDBDEDBD2A6L) << 40L >>> 40L); l ^ 0x5FDBDEDBD2A6L; b(paramArrayOfbyte, 0, (byte)i, paramArrayOfbyte.length, j, k);
/*    */   }
/*    */ 
/*    */   
/*    */   private static final long k = nc.a(-1004948052425781558L, -1742575131967027768L, MethodHandles.lookup().lookupClass()).a(11370534249046L);
/*    */ 
/*    */   
/*    */   public boolean a(int paramInt, short paramShort1, short paramShort2) {
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
/*    */     //   23: lstore #4
/*    */     //   25: lload #4
/*    */     //   27: dup2
/*    */     //   28: ldc2_w 82661679573572
/*    */     //   31: lxor
/*    */     //   32: dup2
/*    */     //   33: bipush #48
/*    */     //   35: lushr
/*    */     //   36: l2i
/*    */     //   37: istore #6
/*    */     //   39: dup2
/*    */     //   40: bipush #16
/*    */     //   42: lshl
/*    */     //   43: bipush #32
/*    */     //   45: lushr
/*    */     //   46: l2i
/*    */     //   47: istore #7
/*    */     //   49: dup2
/*    */     //   50: bipush #48
/*    */     //   52: lshl
/*    */     //   53: bipush #48
/*    */     //   55: lushr
/*    */     //   56: l2i
/*    */     //   57: istore #8
/*    */     //   59: pop2
/*    */     //   60: pop2
/*    */     //   61: ldc2_w 8481731533230017256
/*    */     //   64: lload #4
/*    */     //   66: <illegal opcode> w : (JJ)I
/*    */     //   71: istore #9
/*    */     //   73: aload_0
/*    */     //   74: iload #6
/*    */     //   76: i2s
/*    */     //   77: iload #7
/*    */     //   79: iload #8
/*    */     //   81: i2s
/*    */     //   82: invokevirtual a : (SIS)I
/*    */     //   85: bipush #31
/*    */     //   87: iushr
/*    */     //   88: iload #9
/*    */     //   90: ifeq -> 111
/*    */     //   93: ifeq -> 114
/*    */     //   96: goto -> 110
/*    */     //   99: ldc2_w 8477645144861178165
/*    */     //   102: lload #4
/*    */     //   104: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   109: athrow
/*    */     //   110: iconst_1
/*    */     //   111: goto -> 115
/*    */     //   114: iconst_0
/*    */     //   115: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #10	-> 73
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   73	96	99	aacinternal/v
/*    */   }
/*    */   
/*    */   private void b(byte[] paramArrayOfbyte, int paramInt1, byte paramByte, int paramInt2, int paramInt3, int paramInt4) {
/*    */     // Byte code:
/*    */     //   0: iload_3
/*    */     //   1: i2l
/*    */     //   2: bipush #56
/*    */     //   4: lshl
/*    */     //   5: iload #5
/*    */     //   7: i2l
/*    */     //   8: bipush #32
/*    */     //   10: lshl
/*    */     //   11: bipush #8
/*    */     //   13: lushr
/*    */     //   14: lor
/*    */     //   15: iload #6
/*    */     //   17: i2l
/*    */     //   18: bipush #40
/*    */     //   20: lshl
/*    */     //   21: bipush #40
/*    */     //   23: lushr
/*    */     //   24: lor
/*    */     //   25: getstatic aacinternal/at.k : J
/*    */     //   28: lxor
/*    */     //   29: lstore #7
/*    */     //   31: lload #7
/*    */     //   33: dup2
/*    */     //   34: ldc2_w 18619999299160
/*    */     //   37: lxor
/*    */     //   38: dup2
/*    */     //   39: bipush #48
/*    */     //   41: lushr
/*    */     //   42: l2i
/*    */     //   43: istore #9
/*    */     //   45: dup2
/*    */     //   46: bipush #16
/*    */     //   48: lshl
/*    */     //   49: bipush #32
/*    */     //   51: lushr
/*    */     //   52: l2i
/*    */     //   53: istore #10
/*    */     //   55: dup2
/*    */     //   56: bipush #48
/*    */     //   58: lshl
/*    */     //   59: bipush #48
/*    */     //   61: lushr
/*    */     //   62: l2i
/*    */     //   63: istore #11
/*    */     //   65: pop2
/*    */     //   66: pop2
/*    */     //   67: ldc2_w -456708382685264140
/*    */     //   70: lload #7
/*    */     //   72: <illegal opcode> w : (JJ)I
/*    */     //   77: iload_2
/*    */     //   78: istore #13
/*    */     //   80: iload #13
/*    */     //   82: iload #4
/*    */     //   84: ldc 2147483644
/*    */     //   86: iand
/*    */     //   87: iadd
/*    */     //   88: istore #14
/*    */     //   90: istore #12
/*    */     //   92: iload #13
/*    */     //   94: iload #14
/*    */     //   96: if_icmpge -> 194
/*    */     //   99: aload_0
/*    */     //   100: iload #9
/*    */     //   102: i2s
/*    */     //   103: iload #10
/*    */     //   105: iload #11
/*    */     //   107: i2s
/*    */     //   108: invokevirtual a : (SIS)I
/*    */     //   111: istore #15
/*    */     //   113: aload_1
/*    */     //   114: iload #13
/*    */     //   116: iinc #13, 1
/*    */     //   119: iload #15
/*    */     //   121: i2b
/*    */     //   122: bastore
/*    */     //   123: aload_1
/*    */     //   124: iload #13
/*    */     //   126: iinc #13, 1
/*    */     //   129: iload #15
/*    */     //   131: bipush #8
/*    */     //   133: iushr
/*    */     //   134: i2b
/*    */     //   135: bastore
/*    */     //   136: aload_1
/*    */     //   137: iload #13
/*    */     //   139: iinc #13, 1
/*    */     //   142: iload #15
/*    */     //   144: bipush #16
/*    */     //   146: iushr
/*    */     //   147: i2b
/*    */     //   148: bastore
/*    */     //   149: aload_1
/*    */     //   150: iload #13
/*    */     //   152: iinc #13, 1
/*    */     //   155: iload #15
/*    */     //   157: bipush #24
/*    */     //   159: iushr
/*    */     //   160: i2b
/*    */     //   161: bastore
/*    */     //   162: iload #12
/*    */     //   164: iload_3
/*    */     //   165: iflt -> 202
/*    */     //   168: ifeq -> 200
/*    */     //   171: iload #12
/*    */     //   173: ifne -> 92
/*    */     //   176: iload_3
/*    */     //   177: iflt -> 162
/*    */     //   180: goto -> 194
/*    */     //   183: ldc2_w -451768888686906071
/*    */     //   186: lload #7
/*    */     //   188: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   193: athrow
/*    */     //   194: iload_2
/*    */     //   195: iload #4
/*    */     //   197: iadd
/*    */     //   198: istore #15
/*    */     //   200: iload #13
/*    */     //   202: iload #12
/*    */     //   204: iload #5
/*    */     //   206: ifle -> 214
/*    */     //   209: ifeq -> 257
/*    */     //   212: iload #15
/*    */     //   214: if_icmpge -> 288
/*    */     //   217: goto -> 231
/*    */     //   220: ldc2_w -451768888686906071
/*    */     //   223: lload #7
/*    */     //   225: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   230: athrow
/*    */     //   231: aload_0
/*    */     //   232: iload #9
/*    */     //   234: i2s
/*    */     //   235: iload #10
/*    */     //   237: iload #11
/*    */     //   239: i2s
/*    */     //   240: invokevirtual a : (SIS)I
/*    */     //   243: goto -> 257
/*    */     //   246: ldc2_w -451768888686906071
/*    */     //   249: lload #7
/*    */     //   251: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   256: athrow
/*    */     //   257: istore #16
/*    */     //   259: aload_1
/*    */     //   260: iload #13
/*    */     //   262: iinc #13, 1
/*    */     //   265: iload #16
/*    */     //   267: i2b
/*    */     //   268: bastore
/*    */     //   269: iload #13
/*    */     //   271: iload #15
/*    */     //   273: if_icmpge -> 288
/*    */     //   276: iload #16
/*    */     //   278: bipush #8
/*    */     //   280: iushr
/*    */     //   281: istore #16
/*    */     //   283: iload #12
/*    */     //   285: ifne -> 259
/*    */     //   288: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #16	-> 77
/*    */     //   #13	-> 80
/*    */     //   #1	-> 92
/*    */     //   #26	-> 99
/*    */     //   #5	-> 113
/*    */     //   #27	-> 123
/*    */     //   #17	-> 136
/*    */     //   #25	-> 149
/*    */     //   #24	-> 162
/*    */     //   #30	-> 194
/*    */     //   #28	-> 200
/*    */     //   #6	-> 231
/*    */     //   #29	-> 259
/*    */     //   #21	-> 269
/*    */     //   #14	-> 276
/*    */     //   #3	-> 288
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   113	176	183	aacinternal/v
/*    */     //   200	217	220	aacinternal/v
/*    */     //   212	243	246	aacinternal/v
/*    */   }
/*    */   
/*    */   public float a(long paramLong) {
/* 18 */     int i = (int)((paramLong ^ 0x3D7E1858C18L) >>> 48L), j = (int)((paramLong ^ 0x3D7E1858C18L) << 16L >>> 32L), k = (int)((paramLong ^ 0x3D7E1858C18L) << 48L >>> 48L); paramLong ^ 0x3D7E1858C18L; return (a((short)i, j, (short)k) >>> 9) * 1.1920929E-7F;
/*    */   }
/*    */   
/*    */   public double b(long paramLong) {
/* 22 */     int i = (int)((paramLong ^ 0x729A917E095EL) >>> 48L), j = (int)((paramLong ^ 0x729A917E095EL) << 16L >>> 32L), k = (int)((paramLong ^ 0x729A917E095EL) << 48L >>> 48L); paramLong ^ 0x729A917E095EL; long l = (a((short)i, j, (short)k) >>> 6) << 26L;
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
/* 33 */     int m = a((short)i, j, (short)k) >>> 6;
/*    */     return (l | m) * 2.220446049250313E-16D;
/*    */   }
/*    */   
/*    */   public void a(long paramLong, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
/*    */     // Byte code:
/*    */     //   0: lload_1
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 1651309374820
/*    */     //   5: lxor
/*    */     //   6: dup2
/*    */     //   7: bipush #56
/*    */     //   9: lushr
/*    */     //   10: l2i
/*    */     //   11: istore #6
/*    */     //   13: dup2
/*    */     //   14: bipush #8
/*    */     //   16: lshl
/*    */     //   17: bipush #32
/*    */     //   19: lushr
/*    */     //   20: l2i
/*    */     //   21: istore #7
/*    */     //   23: dup2
/*    */     //   24: bipush #40
/*    */     //   26: lshl
/*    */     //   27: bipush #40
/*    */     //   29: lushr
/*    */     //   30: l2i
/*    */     //   31: istore #8
/*    */     //   33: pop2
/*    */     //   34: dup2
/*    */     //   35: ldc2_w 94240520417772
/*    */     //   38: lxor
/*    */     //   39: dup2
/*    */     //   40: bipush #48
/*    */     //   42: lushr
/*    */     //   43: l2i
/*    */     //   44: istore #9
/*    */     //   46: dup2
/*    */     //   47: bipush #16
/*    */     //   49: lshl
/*    */     //   50: bipush #32
/*    */     //   52: lushr
/*    */     //   53: l2i
/*    */     //   54: istore #10
/*    */     //   56: dup2
/*    */     //   57: bipush #48
/*    */     //   59: lshl
/*    */     //   60: bipush #48
/*    */     //   62: lushr
/*    */     //   63: l2i
/*    */     //   64: istore #11
/*    */     //   66: pop2
/*    */     //   67: pop2
/*    */     //   68: ldc2_w 4223107788759798408
/*    */     //   71: lload_1
/*    */     //   72: <illegal opcode> w : (JJ)I
/*    */     //   77: istore #12
/*    */     //   79: iload #4
/*    */     //   81: iload #12
/*    */     //   83: ifne -> 104
/*    */     //   86: iflt -> 133
/*    */     //   89: goto -> 102
/*    */     //   92: ldc2_w 4192467221378938557
/*    */     //   95: lload_1
/*    */     //   96: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   101: athrow
/*    */     //   102: iload #4
/*    */     //   104: iload #12
/*    */     //   106: lload_1
/*    */     //   107: lconst_0
/*    */     //   108: lcmp
/*    */     //   109: ifle -> 193
/*    */     //   112: ifne -> 191
/*    */     //   115: aload_3
/*    */     //   116: arraylength
/*    */     //   117: if_icmplt -> 189
/*    */     //   120: goto -> 133
/*    */     //   123: ldc2_w 4192467221378938557
/*    */     //   126: lload_1
/*    */     //   127: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   132: athrow
/*    */     //   133: new aacinternal/v
/*    */     //   136: dup
/*    */     //   137: getstatic aacinternal/P.OUT_OF_RANGE_SIMPLE : Laacinternal/P;
/*    */     //   140: iconst_3
/*    */     //   141: anewarray java/lang/Object
/*    */     //   144: dup
/*    */     //   145: iconst_0
/*    */     //   146: iload #4
/*    */     //   148: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   151: aastore
/*    */     //   152: dup
/*    */     //   153: iconst_1
/*    */     //   154: iconst_0
/*    */     //   155: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   158: aastore
/*    */     //   159: dup
/*    */     //   160: iconst_2
/*    */     //   161: aload_3
/*    */     //   162: arraylength
/*    */     //   163: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   166: aastore
/*    */     //   167: iload #9
/*    */     //   169: i2s
/*    */     //   170: iload #10
/*    */     //   172: iload #11
/*    */     //   174: i2s
/*    */     //   175: invokespecial <init> : (Laacinternal/H;[Ljava/lang/Object;SIS)V
/*    */     //   178: athrow
/*    */     //   179: ldc2_w 4192467221378938557
/*    */     //   182: lload_1
/*    */     //   183: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   188: athrow
/*    */     //   189: iload #5
/*    */     //   191: iload #12
/*    */     //   193: lload_1
/*    */     //   194: lconst_0
/*    */     //   195: lcmp
/*    */     //   196: ifle -> 225
/*    */     //   199: ifne -> 220
/*    */     //   202: iflt -> 228
/*    */     //   205: goto -> 218
/*    */     //   208: ldc2_w 4192467221378938557
/*    */     //   211: lload_1
/*    */     //   212: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   217: athrow
/*    */     //   218: iload #5
/*    */     //   220: aload_3
/*    */     //   221: arraylength
/*    */     //   222: iload #4
/*    */     //   224: isub
/*    */     //   225: if_icmple -> 287
/*    */     //   228: new aacinternal/v
/*    */     //   231: dup
/*    */     //   232: getstatic aacinternal/P.OUT_OF_RANGE_SIMPLE : Laacinternal/P;
/*    */     //   235: iconst_3
/*    */     //   236: anewarray java/lang/Object
/*    */     //   239: dup
/*    */     //   240: iconst_0
/*    */     //   241: iload #5
/*    */     //   243: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   246: aastore
/*    */     //   247: dup
/*    */     //   248: iconst_1
/*    */     //   249: iconst_0
/*    */     //   250: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   253: aastore
/*    */     //   254: dup
/*    */     //   255: iconst_2
/*    */     //   256: aload_3
/*    */     //   257: arraylength
/*    */     //   258: iload #4
/*    */     //   260: isub
/*    */     //   261: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   264: aastore
/*    */     //   265: iload #9
/*    */     //   267: i2s
/*    */     //   268: iload #10
/*    */     //   270: iload #11
/*    */     //   272: i2s
/*    */     //   273: invokespecial <init> : (Laacinternal/H;[Ljava/lang/Object;SIS)V
/*    */     //   276: athrow
/*    */     //   277: ldc2_w 4192467221378938557
/*    */     //   280: lload_1
/*    */     //   281: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   286: athrow
/*    */     //   287: aload_0
/*    */     //   288: aload_3
/*    */     //   289: iload #4
/*    */     //   291: iload #6
/*    */     //   293: i2b
/*    */     //   294: iload #5
/*    */     //   296: iload #7
/*    */     //   298: iload #8
/*    */     //   300: invokespecial b : ([BIBIII)V
/*    */     //   303: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #31	-> 79
/*    */     //   #20	-> 133
/*    */     //   #7	-> 148
/*    */     //   #12	-> 189
/*    */     //   #15	-> 228
/*    */     //   #11	-> 243
/*    */     //   #23	-> 287
/*    */     //   #8	-> 303
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   79	89	92	aacinternal/v
/*    */     //   104	120	123	aacinternal/v
/*    */     //   115	179	179	aacinternal/v
/*    */     //   191	205	208	aacinternal/v
/*    */     //   220	277	277	aacinternal/v
/*    */   }
/*    */   
/*    */   public long a(long paramLong) {
/*    */     int i = (int)((paramLong ^ 0x779CBA171B22L) >>> 48L), j = (int)((paramLong ^ 0x779CBA171B22L) << 16L >>> 32L), k = (int)((paramLong ^ 0x779CBA171B22L) << 48L >>> 48L);
/*    */     paramLong ^ 0x779CBA171B22L;
/*    */     return a((short)i, j, (short)k) << 32L | a((short)i, j, (short)k) & 0xFFFFFFFFL;
/*    */   }
/*    */   
/*    */   public abstract int a(short paramShort1, int paramInt, short paramShort2);
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\at.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */