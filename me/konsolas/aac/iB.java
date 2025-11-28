/*   */ package me.konsolas.aac;
/*   */ public final class ib { private final List b;
/* 3 */   public List a() { return new ArrayList(this.b); }
/*   */   public boolean a(short paramShort1, short paramShort2, int paramInt) { // Byte code:
/*   */     //   0: iload_1
/*   */     //   1: i2l
/*   */     //   2: bipush #48
/*   */     //   4: lshl
/*   */     //   5: iload_2
/*   */     //   6: i2l
/*   */     //   7: bipush #48
/*   */     //   9: lshl
/*   */     //   10: bipush #16
/*   */     //   12: lushr
/*   */     //   13: lor
/*   */     //   14: iload_3
/*   */     //   15: i2l
/*   */     //   16: bipush #32
/*   */     //   18: lshl
/*   */     //   19: bipush #32
/*   */     //   21: lushr
/*   */     //   22: lor
/*   */     //   23: getstatic me/konsolas/aac/ib.c : J
/*   */     //   26: lxor
/*   */     //   27: lstore #4
/*   */     //   29: ldc2_w -860674188007436860
/*   */     //   32: lload #4
/*   */     //   34: <illegal opcode> w : (JJ)I
/*   */     //   39: istore #6
/*   */     //   41: aload_0
/*   */     //   42: getfield a : I
/*   */     //   45: iload #6
/*   */     //   47: ifeq -> 91
/*   */     //   50: aload_0
/*   */     //   51: getfield b : Ljava/util/List;
/*   */     //   54: invokeinterface size : ()I
/*   */     //   59: if_icmpge -> 94
/*   */     //   62: goto -> 76
/*   */     //   65: ldc2_w -858887796748397554
/*   */     //   68: lload #4
/*   */     //   70: <illegal opcode> w : (Ljava/util/NoSuchElementException;JJ)Ljava/util/NoSuchElementException;
/*   */     //   75: athrow
/*   */     //   76: iconst_1
/*   */     //   77: goto -> 91
/*   */     //   80: ldc2_w -858887796748397554
/*   */     //   83: lload #4
/*   */     //   85: <illegal opcode> w : (Ljava/util/NoSuchElementException;JJ)Ljava/util/NoSuchElementException;
/*   */     //   90: athrow
/*   */     //   91: goto -> 95
/*   */     //   94: iconst_0
/*   */     //   95: ireturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 41
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   41	62	65	java/util/NoSuchElementException
/*   */     //   50	77	80	java/util/NoSuchElementException }
/*   */   public hQ a(long paramLong) { // Byte code:
/*   */     //   0: getstatic me/konsolas/aac/ib.c : J
/*   */     //   3: lload_1
/*   */     //   4: lxor
/*   */     //   5: lstore_1
/*   */     //   6: lload_1
/*   */     //   7: dup2
/*   */     //   8: ldc2_w 102807530482569
/*   */     //   11: lxor
/*   */     //   12: dup2
/*   */     //   13: bipush #48
/*   */     //   15: lushr
/*   */     //   16: l2i
/*   */     //   17: istore_3
/*   */     //   18: dup2
/*   */     //   19: bipush #16
/*   */     //   21: lshl
/*   */     //   22: bipush #48
/*   */     //   24: lushr
/*   */     //   25: l2i
/*   */     //   26: istore #4
/*   */     //   28: dup2
/*   */     //   29: bipush #32
/*   */     //   31: lshl
/*   */     //   32: bipush #32
/*   */     //   34: lushr
/*   */     //   35: l2i
/*   */     //   36: istore #5
/*   */     //   38: pop2
/*   */     //   39: pop2
/*   */     //   40: ldc2_w 5223391498859688375
/*   */     //   43: lload_1
/*   */     //   44: <illegal opcode> w : (JJ)I
/*   */     //   49: istore #6
/*   */     //   51: aload_0
/*   */     //   52: iload #6
/*   */     //   54: ifeq -> 121
/*   */     //   57: iload_3
/*   */     //   58: i2s
/*   */     //   59: iload #4
/*   */     //   61: i2s
/*   */     //   62: iload #5
/*   */     //   64: invokevirtual a : (SSI)Z
/*   */     //   67: ifne -> 101
/*   */     //   70: goto -> 83
/*   */     //   73: ldc2_w 5217399960970946685
/*   */     //   76: lload_1
/*   */     //   77: <illegal opcode> w : (Ljava/util/NoSuchElementException;JJ)Ljava/util/NoSuchElementException;
/*   */     //   82: athrow
/*   */     //   83: new java/util/NoSuchElementException
/*   */     //   86: dup
/*   */     //   87: invokespecial <init> : ()V
/*   */     //   90: athrow
/*   */     //   91: ldc2_w 5217399960970946685
/*   */     //   94: lload_1
/*   */     //   95: <illegal opcode> w : (Ljava/util/NoSuchElementException;JJ)Ljava/util/NoSuchElementException;
/*   */     //   100: athrow
/*   */     //   101: aload_0
/*   */     //   102: getfield b : Ljava/util/List;
/*   */     //   105: aload_0
/*   */     //   106: dup
/*   */     //   107: getfield a : I
/*   */     //   110: dup_x1
/*   */     //   111: iconst_1
/*   */     //   112: iadd
/*   */     //   113: putfield a : I
/*   */     //   116: invokeinterface get : (I)Ljava/lang/Object;
/*   */     //   121: checkcast me/konsolas/aac/hQ
/*   */     //   124: areturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #2	-> 51
/*   */     //   #4	-> 83
/*   */     //   #6	-> 101
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   51	70	73	java/util/NoSuchElementException
/* 5 */     //   57	91	91	java/util/NoSuchElementException } ib(List paramList) { this.b = paramList; }
/*   */ 
/*   */   
/* 8 */   private int a = 0;
/*   */   private static final long c = nc.a(-6597495139686325938L, -52309252775650354L, MethodHandles.lookup().lookupClass()).a(75584423615025L);
/*   */   
/*   */   private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
/*   */     return paramNoSuchElementException;
/*   */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ib.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */