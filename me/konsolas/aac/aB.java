/*    */ package me.konsolas.aac;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.util.List;
/*    */ 
/*    */ class ab extends aR {
/*    */   final int a;
/*    */   
/*    */   ab(cZ paramcZ, String paramString, Object[] paramArrayOfObject, int paramInt, List paramList, boolean paramBoolean) {
/* 10 */     super(paramString, paramArrayOfObject);
/*    */   }
/*    */   
/*    */   final List d;
/*    */   final boolean f;
/*    */   final cZ e;
/*    */   
/*    */   private static IOException a(IOException paramIOException) {
/*    */     return paramIOException;
/*    */   }
/*    */   
/*    */   public void b(long paramLong) {
/*    */     // Byte code:
/*    */     //   0: lload_1
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 67223882825537
/*    */     //   5: lxor
/*    */     //   6: lstore_3
/*    */     //   7: pop2
/*    */     //   8: ldc2_w -1520133367558107423
/*    */     //   11: lload_1
/*    */     //   12: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   17: aload_0
/*    */     //   18: getfield e : Lme/konsolas/aac/cZ;
/*    */     //   21: getfield o : Lme/konsolas/aac/ky;
/*    */     //   24: aload_0
/*    */     //   25: getfield a : I
/*    */     //   28: aload_0
/*    */     //   29: getfield d : Ljava/util/List;
/*    */     //   32: aload_0
/*    */     //   33: getfield f : Z
/*    */     //   36: invokeinterface a : (ILjava/util/List;Z)Z
/*    */     //   41: istore #6
/*    */     //   43: astore #5
/*    */     //   45: iload #6
/*    */     //   47: aload #5
/*    */     //   49: ifnull -> 101
/*    */     //   52: ifeq -> 99
/*    */     //   55: goto -> 68
/*    */     //   58: ldc2_w -1515881686844946723
/*    */     //   61: lload_1
/*    */     //   62: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   67: athrow
/*    */     //   68: aload_0
/*    */     //   69: getfield e : Lme/konsolas/aac/cZ;
/*    */     //   72: getfield i : Lme/konsolas/aac/ja;
/*    */     //   75: aload_0
/*    */     //   76: getfield a : I
/*    */     //   79: lload_3
/*    */     //   80: getstatic me/konsolas/aac/eb.CANCEL : Lme/konsolas/aac/eb;
/*    */     //   83: invokevirtual a : (IJLme/konsolas/aac/eb;)V
/*    */     //   86: goto -> 99
/*    */     //   89: ldc2_w -1515881686844946723
/*    */     //   92: lload_1
/*    */     //   93: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   98: athrow
/*    */     //   99: iload #6
/*    */     //   101: aload #5
/*    */     //   103: ifnull -> 157
/*    */     //   106: ifne -> 160
/*    */     //   109: goto -> 122
/*    */     //   112: ldc2_w -1515881686844946723
/*    */     //   115: lload_1
/*    */     //   116: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   121: athrow
/*    */     //   122: aload_0
/*    */     //   123: aload #5
/*    */     //   125: ifnull -> 161
/*    */     //   128: goto -> 141
/*    */     //   131: ldc2_w -1515881686844946723
/*    */     //   134: lload_1
/*    */     //   135: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   140: athrow
/*    */     //   141: getfield f : Z
/*    */     //   144: goto -> 157
/*    */     //   147: ldc2_w -1515881686844946723
/*    */     //   150: lload_1
/*    */     //   151: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*    */     //   156: athrow
/*    */     //   157: ifeq -> 202
/*    */     //   160: aload_0
/*    */     //   161: getfield e : Lme/konsolas/aac/cZ;
/*    */     //   164: dup
/*    */     //   165: astore #7
/*    */     //   167: monitorenter
/*    */     //   168: aload_0
/*    */     //   169: getfield e : Lme/konsolas/aac/cZ;
/*    */     //   172: getfield p : Ljava/util/Set;
/*    */     //   175: aload_0
/*    */     //   176: getfield a : I
/*    */     //   179: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   182: invokeinterface remove : (Ljava/lang/Object;)Z
/*    */     //   187: pop
/*    */     //   188: aload #7
/*    */     //   190: monitorexit
/*    */     //   191: goto -> 202
/*    */     //   194: astore #8
/*    */     //   196: aload #7
/*    */     //   198: monitorexit
/*    */     //   199: aload #8
/*    */     //   201: athrow
/*    */     //   202: goto -> 207
/*    */     //   205: astore #7
/*    */     //   207: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #2	-> 17
/*    */     //   #7	-> 45
/*    */     //   #3	-> 99
/*    */     //   #9	-> 160
/*    */     //   #4	-> 168
/*    */     //   #8	-> 188
/*    */     //   #6	-> 202
/*    */     //   #5	-> 205
/*    */     //   #1	-> 207
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   45	55	58	java/io/IOException
/*    */     //   45	202	205	java/io/IOException
/*    */     //   52	86	89	java/io/IOException
/*    */     //   101	109	112	java/io/IOException
/*    */     //   106	128	131	java/io/IOException
/*    */     //   122	144	147	java/io/IOException
/*    */     //   168	191	194	finally
/*    */     //   194	199	194	finally
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ab.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */