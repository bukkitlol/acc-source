/*   */ package me.konsolas.aac;class l4 extends lQ { static final boolean c;
/* 2 */   private static final long e = nc.a(-5915114338074056815L, 1200545090099438100L, MethodHandles.lookup().lookupClass()).a(246020609166473L); final m5 d; static { try {  } catch (v v) { throw a(null); }  c = !m5.class.desiredAssertionStatus(); }
/*   */   protected void a(IOException paramIOException, long paramLong) { // Byte code:
/*   */     //   0: ldc2_w -1084484677903622252
/*   */     //   3: lload_2
/*   */     //   4: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*   */     //   9: astore #4
/*   */     //   11: aload #4
/*   */     //   13: ifnonnull -> 108
/*   */     //   16: getstatic me/konsolas/aac/l4.c : Z
/*   */     //   19: ifne -> 100
/*   */     //   22: goto -> 35
/*   */     //   25: ldc2_w -1133069972818055730
/*   */     //   28: lload_2
/*   */     //   29: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*   */     //   34: athrow
/*   */     //   35: lload_2
/*   */     //   36: lconst_0
/*   */     //   37: lcmp
/*   */     //   38: iflt -> 108
/*   */     //   41: aload_0
/*   */     //   42: getfield d : Lme/konsolas/aac/m5;
/*   */     //   45: aload #4
/*   */     //   47: ifnonnull -> 104
/*   */     //   50: goto -> 63
/*   */     //   53: ldc2_w -1133069972818055730
/*   */     //   56: lload_2
/*   */     //   57: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*   */     //   62: athrow
/*   */     //   63: invokestatic holdsLock : (Ljava/lang/Object;)Z
/*   */     //   66: ifne -> 100
/*   */     //   69: goto -> 82
/*   */     //   72: ldc2_w -1133069972818055730
/*   */     //   75: lload_2
/*   */     //   76: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*   */     //   81: athrow
/*   */     //   82: new java/lang/AssertionError
/*   */     //   85: dup
/*   */     //   86: invokespecial <init> : ()V
/*   */     //   89: athrow
/*   */     //   90: ldc2_w -1133069972818055730
/*   */     //   93: lload_2
/*   */     //   94: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*   */     //   99: athrow
/*   */     //   100: aload_0
/*   */     //   101: getfield d : Lme/konsolas/aac/m5;
/*   */     //   104: iconst_1
/*   */     //   105: putfield d : Z
/*   */     //   108: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 11
/*   */     //   #5	-> 100
/*   */     //   #3	-> 108
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   11	22	25	aacinternal/v
/*   */     //   16	50	53	aacinternal/v
/*   */     //   35	69	72	aacinternal/v
/*   */     //   63	90	90	aacinternal/v } l4(m5 paramm5, long paramLong, gp paramgp) {
/* 4 */     super(l, paramgp);
/*   */   }
/*   */   
/*   */   private static v a(v paramv) {
/*   */     return paramv;
/*   */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\l4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */