/*   */ package me.konsolas.aac;
/*   */ class a0 extends aR {
/*   */   a0(cZ paramcZ, String paramString, Object[] paramArrayOfObject, int paramInt, List paramList) {
/* 4 */     super(paramString, paramArrayOfObject);
/*   */   }
/*   */   
/*   */   final int a;
/*   */   final List d;
/*   */   final cZ e;
/*   */   
/*   */   private static IOException a(IOException paramIOException) {
/*   */     return paramIOException;
/*   */   }
/*   */   
/*   */   public void b(long paramLong) {
/*   */     // Byte code:
/*   */     //   0: lload_1
/*   */     //   1: dup2
/*   */     //   2: ldc2_w 67223882825537
/*   */     //   5: lxor
/*   */     //   6: lstore_3
/*   */     //   7: pop2
/*   */     //   8: ldc2_w -1520133367558107423
/*   */     //   11: lload_1
/*   */     //   12: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*   */     //   17: aload_0
/*   */     //   18: getfield e : Lme/konsolas/aac/cZ;
/*   */     //   21: getfield o : Lme/konsolas/aac/ky;
/*   */     //   24: aload_0
/*   */     //   25: getfield a : I
/*   */     //   28: aload_0
/*   */     //   29: getfield d : Ljava/util/List;
/*   */     //   32: invokeinterface a : (ILjava/util/List;)Z
/*   */     //   37: istore #6
/*   */     //   39: astore #5
/*   */     //   41: aload #5
/*   */     //   43: ifnull -> 95
/*   */     //   46: iload #6
/*   */     //   48: ifeq -> 137
/*   */     //   51: goto -> 64
/*   */     //   54: ldc2_w -1463049424396970730
/*   */     //   57: lload_1
/*   */     //   58: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*   */     //   63: athrow
/*   */     //   64: aload_0
/*   */     //   65: getfield e : Lme/konsolas/aac/cZ;
/*   */     //   68: getfield i : Lme/konsolas/aac/ja;
/*   */     //   71: aload_0
/*   */     //   72: getfield a : I
/*   */     //   75: lload_3
/*   */     //   76: getstatic me/konsolas/aac/eb.CANCEL : Lme/konsolas/aac/eb;
/*   */     //   79: invokevirtual a : (IJLme/konsolas/aac/eb;)V
/*   */     //   82: goto -> 95
/*   */     //   85: ldc2_w -1463049424396970730
/*   */     //   88: lload_1
/*   */     //   89: <illegal opcode> w : (Ljava/io/IOException;JJ)Ljava/io/IOException;
/*   */     //   94: athrow
/*   */     //   95: aload_0
/*   */     //   96: getfield e : Lme/konsolas/aac/cZ;
/*   */     //   99: dup
/*   */     //   100: astore #7
/*   */     //   102: monitorenter
/*   */     //   103: aload_0
/*   */     //   104: getfield e : Lme/konsolas/aac/cZ;
/*   */     //   107: getfield p : Ljava/util/Set;
/*   */     //   110: aload_0
/*   */     //   111: getfield a : I
/*   */     //   114: invokestatic valueOf : (I)Ljava/lang/Integer;
/*   */     //   117: invokeinterface remove : (Ljava/lang/Object;)Z
/*   */     //   122: pop
/*   */     //   123: aload #7
/*   */     //   125: monitorexit
/*   */     //   126: goto -> 137
/*   */     //   129: astore #8
/*   */     //   131: aload #7
/*   */     //   133: monitorexit
/*   */     //   134: aload #8
/*   */     //   136: athrow
/*   */     //   137: goto -> 142
/*   */     //   140: astore #7
/*   */     //   142: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #2	-> 17
/*   */     //   #5	-> 41
/*   */     //   #7	-> 64
/*   */     //   #6	-> 95
/*   */     //   #1	-> 103
/*   */     //   #9	-> 123
/*   */     //   #8	-> 137
/*   */     //   #10	-> 140
/*   */     //   #3	-> 142
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   41	51	54	java/io/IOException
/*   */     //   41	137	140	java/io/IOException
/*   */     //   46	82	85	java/io/IOException
/*   */     //   103	126	129	finally
/*   */     //   129	134	129	finally
/*   */   }
/*   */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\a0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */