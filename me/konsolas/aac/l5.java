/*   */ package me.konsolas.aac;
/*   */ 
/*   */ import java.io.IOException;
/*   */ import java.lang.invoke.MethodHandles;
/*   */ 
/*   */ class l5 extends l9 {
/*   */   l5(gd paramgd, gp paramgp, long paramLong, hW paramhW, dO paramdO) {
/* 8 */     super(paramgp, l);
/*   */   }
/*   */   
/*   */   final hW d;
/*   */   final dO c;
/*   */   final gd b;
/*   */   private static final long e = nc.a(4350575911340837659L, -7962586978469912202L, MethodHandles.lookup().lookupClass()).a(51074125154627L);
/*   */   
/*   */   private static IOException a(IOException paramIOException) {
/*   */     return paramIOException;
/*   */   }
/*   */   
/*   */   public void close() {
/*   */     // Byte code:
/*   */     //   0: getstatic me/konsolas/aac/l5.e : J
/*   */     //   3: ldc2_w 104206425984880
/*   */     //   6: lxor
/*   */     //   7: lstore_1
/*   */     //   8: lload_1
/*   */     //   9: dup2
/*   */     //   10: ldc2_w 95997539515745
/*   */     //   13: lxor
/*   */     //   14: lstore_3
/*   */     //   15: pop2
/*   */     //   16: ldc2_w -1768253001424967753
/*   */     //   19: lload_1
/*   */     //   20: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*   */     //   25: aload_0
/*   */     //   26: getfield b : Lme/konsolas/aac/gd;
/*   */     //   29: getfield b : Lme/konsolas/aac/hW;
/*   */     //   32: dup
/*   */     //   33: astore #6
/*   */     //   35: monitorenter
/*   */     //   36: astore #5
/*   */     //   38: aload_0
/*   */     //   39: getfield b : Lme/konsolas/aac/gd;
/*   */     //   42: aload #5
/*   */     //   44: ifnonnull -> 82
/*   */     //   47: getfield a : Z
/*   */     //   50: ifeq -> 70
/*   */     //   53: goto -> 66
/*   */     //   56: ldc2_w -1818844914251334221
/*   */     //   59: lload_1
/*   */     //   60: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*   */     //   65: athrow
/*   */     //   66: aload #6
/*   */     //   68: monitorexit
/*   */     //   69: return
/*   */     //   70: aload_0
/*   */     //   71: getfield b : Lme/konsolas/aac/gd;
/*   */     //   74: iconst_1
/*   */     //   75: putfield a : Z
/*   */     //   78: aload_0
/*   */     //   79: getfield b : Lme/konsolas/aac/gd;
/*   */     //   82: getfield b : Lme/konsolas/aac/hW;
/*   */     //   85: dup
/*   */     //   86: getfield e : I
/*   */     //   89: iconst_1
/*   */     //   90: iadd
/*   */     //   91: putfield e : I
/*   */     //   94: aload #6
/*   */     //   96: monitorexit
/*   */     //   97: goto -> 108
/*   */     //   100: astore #7
/*   */     //   102: aload #6
/*   */     //   104: monitorexit
/*   */     //   105: aload #7
/*   */     //   107: athrow
/*   */     //   108: aload_0
/*   */     //   109: invokespecial close : ()V
/*   */     //   112: aload_0
/*   */     //   113: getfield c : Lme/konsolas/aac/dO;
/*   */     //   116: lload_3
/*   */     //   117: invokevirtual c : (J)V
/*   */     //   120: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #7	-> 25
/*   */     //   #6	-> 38
/*   */     //   #3	-> 66
/*   */     //   #9	-> 70
/*   */     //   #10	-> 78
/*   */     //   #5	-> 94
/*   */     //   #4	-> 108
/*   */     //   #2	-> 112
/*   */     //   #1	-> 120
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   38	53	56	java/io/IOException
/*   */     //   38	69	100	finally
/*   */     //   70	97	100	finally
/*   */     //   100	105	100	finally
/*   */   }
/*   */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\l5.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */