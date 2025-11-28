/*    */ package me.konsolas.aac;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.lang.invoke.MethodHandles;
/*    */ 
/*    */ final class gd
/*    */   implements iA {
/*    */   private final dO e;
/*    */   
/*    */   public gp a() {
/* 11 */     return this.d;
/*    */   }
/*    */   
/*    */   private gp c;
/*    */   private gp d;
/*    */   boolean a;
/*    */   final hW b;
/*    */   private static final long f = nc.a(-4380211175145857956L, -6159544676305326932L, MethodHandles.lookup().lookupClass()).a(43767189650299L);
/*    */   
/*    */   public void a(long paramLong, int paramInt) {
/*    */     // Byte code:
/*    */     //   0: lload_1
/*    */     //   1: bipush #32
/*    */     //   3: lshl
/*    */     //   4: iload_3
/*    */     //   5: i2l
/*    */     //   6: bipush #32
/*    */     //   8: lshl
/*    */     //   9: bipush #32
/*    */     //   11: lushr
/*    */     //   12: lor
/*    */     //   13: lstore #4
/*    */     //   15: lload #4
/*    */     //   17: dup2
/*    */     //   18: ldc2_w 108523725272918
/*    */     //   21: lxor
/*    */     //   22: dup2
/*    */     //   23: bipush #48
/*    */     //   25: lushr
/*    */     //   26: l2i
/*    */     //   27: istore #6
/*    */     //   29: dup2
/*    */     //   30: bipush #16
/*    */     //   32: lshl
/*    */     //   33: bipush #48
/*    */     //   35: lushr
/*    */     //   36: l2i
/*    */     //   37: istore #7
/*    */     //   39: dup2
/*    */     //   40: bipush #32
/*    */     //   42: lshl
/*    */     //   43: bipush #32
/*    */     //   45: lushr
/*    */     //   46: l2i
/*    */     //   47: istore #8
/*    */     //   49: pop2
/*    */     //   50: dup2
/*    */     //   51: ldc2_w 13495003019928
/*    */     //   54: lxor
/*    */     //   55: lstore #9
/*    */     //   57: pop2
/*    */     //   58: ldc2_w 2250332855876788216
/*    */     //   61: lload #4
/*    */     //   63: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   68: aload_0
/*    */     //   69: getfield b : Lme/konsolas/aac/hW;
/*    */     //   72: dup
/*    */     //   73: astore #12
/*    */     //   75: monitorenter
/*    */     //   76: astore #11
/*    */     //   78: aload_0
/*    */     //   79: aload #11
/*    */     //   81: ifnonnull -> 114
/*    */     //   84: getfield a : Z
/*    */     //   87: ifeq -> 108
/*    */     //   90: goto -> 104
/*    */     //   93: ldc2_w 2236766268102091295
/*    */     //   96: lload #4
/*    */     //   98: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   103: athrow
/*    */     //   104: aload #12
/*    */     //   106: monitorexit
/*    */     //   107: return
/*    */     //   108: aload_0
/*    */     //   109: iconst_1
/*    */     //   110: putfield a : Z
/*    */     //   113: aload_0
/*    */     //   114: getfield b : Lme/konsolas/aac/hW;
/*    */     //   117: dup
/*    */     //   118: getfield c : I
/*    */     //   121: iconst_1
/*    */     //   122: iadd
/*    */     //   123: putfield c : I
/*    */     //   126: aload #12
/*    */     //   128: monitorexit
/*    */     //   129: goto -> 140
/*    */     //   132: astore #13
/*    */     //   134: aload #12
/*    */     //   136: monitorexit
/*    */     //   137: aload #13
/*    */     //   139: athrow
/*    */     //   140: aload_0
/*    */     //   141: getfield c : Lme/konsolas/aac/gp;
/*    */     //   144: lload #9
/*    */     //   146: dup2_x1
/*    */     //   147: pop2
/*    */     //   148: invokestatic a : (JLjava/io/Closeable;)V
/*    */     //   151: aload_0
/*    */     //   152: getfield e : Lme/konsolas/aac/dO;
/*    */     //   155: iload #6
/*    */     //   157: i2c
/*    */     //   158: iload #7
/*    */     //   160: i2c
/*    */     //   161: iload #8
/*    */     //   163: invokevirtual d : (CCI)V
/*    */     //   166: goto -> 171
/*    */     //   169: astore #12
/*    */     //   171: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 68
/*    */     //   #5	-> 78
/*    */     //   #4	-> 104
/*    */     //   #14	-> 108
/*    */     //   #15	-> 113
/*    */     //   #7	-> 126
/*    */     //   #16	-> 140
/*    */     //   #17	-> 151
/*    */     //   #8	-> 166
/*    */     //   #2	-> 169
/*    */     //   #13	-> 171
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   78	90	93	java/io/IOException
/*    */     //   78	107	132	finally
/*    */     //   108	129	132	finally
/*    */     //   132	137	132	finally
/*    */     //   151	166	169	java/io/IOException
/*    */   }
/*    */   
/*    */   gd(hW paramhW, long paramLong, dO paramdO) {
/*    */     this.e = paramdO;
/*    */     this.c = paramdO.a(l1, 1);
/*    */     this.d = new l5(this, this.c, l2, paramhW, paramdO);
/*    */   }
/*    */   
/*    */   private static IOException a(IOException paramIOException) {
/*    */     return paramIOException;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\gd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */