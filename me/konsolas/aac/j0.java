/*    */ package me.konsolas.aac;
/*    */ 
/*    */ import java.lang.invoke.CallSite;
/*    */ import java.lang.invoke.MethodHandle;
/*    */ import java.lang.invoke.MethodHandles;
/*    */ import java.lang.invoke.MethodType;
/*    */ import java.lang.invoke.MutableCallSite;
/*    */ import java.nio.charset.Charset;
/*    */ import java.util.HashMap;
/*    */ import javax.crypto.Cipher;
/*    */ import javax.crypto.SecretKey;
/*    */ import javax.crypto.SecretKeyFactory;
/*    */ import javax.crypto.spec.DESKeySpec;
/*    */ import javax.crypto.spec.IvParameterSpec;
/*    */ 
/*    */ final class j0 implements gi {
/*    */   public final fw b;
/*    */   public final gp a;
/*    */   boolean c;
/*    */   private static final long d = nc.a(-8211647636899113642L, -1644407095975520830L, MethodHandles.lookup().lookupClass()).a(167454222674655L);
/*    */   private static final String[] e;
/*    */   
/* 23 */   public OutputStream a() { return new kA(this); }
/*    */   private static final String[] f;
/*    */   private static final Map g = new HashMap<>(13);
/*    */   public gi a(int paramInt1, int paramInt2, String paramString, int paramInt3, int paramInt4, int paramInt5, Charset paramCharset) { // Byte code:
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
/*    */     //   14: iload #6
/*    */     //   16: i2l
/*    */     //   17: bipush #48
/*    */     //   19: lshl
/*    */     //   20: bipush #48
/*    */     //   22: lushr
/*    */     //   23: lor
/*    */     //   24: lstore #8
/*    */     //   26: lload #8
/*    */     //   28: dup2
/*    */     //   29: ldc2_w 95020525510522
/*    */     //   32: lxor
/*    */     //   33: lstore #10
/*    */     //   35: dup2
/*    */     //   36: ldc2_w 10600180492463
/*    */     //   39: lxor
/*    */     //   40: dup2
/*    */     //   41: bipush #32
/*    */     //   43: lushr
/*    */     //   44: l2i
/*    */     //   45: istore #12
/*    */     //   47: dup2
/*    */     //   48: bipush #32
/*    */     //   50: lshl
/*    */     //   51: bipush #48
/*    */     //   53: lushr
/*    */     //   54: l2i
/*    */     //   55: istore #13
/*    */     //   57: dup2
/*    */     //   58: bipush #48
/*    */     //   60: lshl
/*    */     //   61: bipush #48
/*    */     //   63: lushr
/*    */     //   64: l2i
/*    */     //   65: istore #14
/*    */     //   67: pop2
/*    */     //   68: pop2
/*    */     //   69: ldc2_w -2172542792058751007
/*    */     //   72: lload #8
/*    */     //   74: <illegal opcode> w : (JJ)I
/*    */     //   79: istore #15
/*    */     //   81: aload_0
/*    */     //   82: iload #15
/*    */     //   84: ifne -> 167
/*    */     //   87: getfield c : Z
/*    */     //   90: ifeq -> 140
/*    */     //   93: goto -> 107
/*    */     //   96: ldc2_w -2230683719968165960
/*    */     //   99: lload #8
/*    */     //   101: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   106: athrow
/*    */     //   107: new java/lang/IllegalStateException
/*    */     //   110: dup
/*    */     //   111: sipush #6421
/*    */     //   114: ldc2_w 5052471334243770219
/*    */     //   117: lload #8
/*    */     //   119: lxor
/*    */     //   120: <illegal opcode> m : (IJ)Ljava/lang/String;
/*    */     //   125: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   128: athrow
/*    */     //   129: ldc2_w -2230683719968165960
/*    */     //   132: lload #8
/*    */     //   134: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   139: athrow
/*    */     //   140: aload_0
/*    */     //   141: getfield b : Lme/konsolas/aac/fw;
/*    */     //   144: iload #12
/*    */     //   146: iload #13
/*    */     //   148: iload #14
/*    */     //   150: aload_3
/*    */     //   151: iload #4
/*    */     //   153: iload #5
/*    */     //   155: aload #7
/*    */     //   157: invokevirtual a : (IIILjava/lang/String;IILjava/nio/charset/Charset;)Lme/konsolas/aac/fw;
/*    */     //   160: pop
/*    */     //   161: aload_0
/*    */     //   162: lload #10
/*    */     //   164: invokevirtual b : (J)Lme/konsolas/aac/gi;
/*    */     //   167: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #5	-> 81
/*    */     //   #37	-> 140
/*    */     //   #98	-> 161
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   81	93	96	java/io/IOException
/*    */     //   87	129	129	java/io/IOException }
/*    */   public gi b(long paramLong) { // Byte code:
/*    */     //   0: lload_1
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 60782309833447
/*    */     //   5: lxor
/*    */     //   6: dup2
/*    */     //   7: bipush #32
/*    */     //   9: lushr
/*    */     //   10: l2i
/*    */     //   11: istore_3
/*    */     //   12: dup2
/*    */     //   13: bipush #32
/*    */     //   15: lshl
/*    */     //   16: bipush #48
/*    */     //   18: lushr
/*    */     //   19: l2i
/*    */     //   20: istore #4
/*    */     //   22: dup2
/*    */     //   23: bipush #48
/*    */     //   25: lshl
/*    */     //   26: bipush #48
/*    */     //   28: lushr
/*    */     //   29: l2i
/*    */     //   30: istore #5
/*    */     //   32: pop2
/*    */     //   33: dup2
/*    */     //   34: ldc2_w 78310475807595
/*    */     //   37: lxor
/*    */     //   38: lstore #6
/*    */     //   40: pop2
/*    */     //   41: ldc2_w -4709703370084194149
/*    */     //   44: lload_1
/*    */     //   45: <illegal opcode> w : (JJ)I
/*    */     //   50: istore #8
/*    */     //   52: aload_0
/*    */     //   53: iload #8
/*    */     //   55: ifne -> 109
/*    */     //   58: getfield c : Z
/*    */     //   61: ifeq -> 108
/*    */     //   64: goto -> 77
/*    */     //   67: ldc2_w -4723903747088469822
/*    */     //   70: lload_1
/*    */     //   71: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   76: athrow
/*    */     //   77: new java/lang/IllegalStateException
/*    */     //   80: dup
/*    */     //   81: sipush #6421
/*    */     //   84: ldc2_w 5052385137209819153
/*    */     //   87: lload_1
/*    */     //   88: lxor
/*    */     //   89: <illegal opcode> m : (IJ)Ljava/lang/String;
/*    */     //   94: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   97: athrow
/*    */     //   98: ldc2_w -4723903747088469822
/*    */     //   101: lload_1
/*    */     //   102: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   107: athrow
/*    */     //   108: aload_0
/*    */     //   109: getfield b : Lme/konsolas/aac/fw;
/*    */     //   112: iload_3
/*    */     //   113: iload #4
/*    */     //   115: i2c
/*    */     //   116: iload #5
/*    */     //   118: i2s
/*    */     //   119: invokevirtual e : (ICS)J
/*    */     //   122: lstore #9
/*    */     //   124: lload_1
/*    */     //   125: lconst_0
/*    */     //   126: lcmp
/*    */     //   127: iflt -> 156
/*    */     //   130: lload #9
/*    */     //   132: lconst_0
/*    */     //   133: lcmp
/*    */     //   134: ifle -> 169
/*    */     //   137: aload_0
/*    */     //   138: getfield a : Lme/konsolas/aac/gp;
/*    */     //   141: aload_0
/*    */     //   142: getfield b : Lme/konsolas/aac/fw;
/*    */     //   145: lload #6
/*    */     //   147: dup2_x1
/*    */     //   148: pop2
/*    */     //   149: lload #9
/*    */     //   151: invokeinterface b : (JLme/konsolas/aac/fw;J)V
/*    */     //   156: goto -> 169
/*    */     //   159: ldc2_w -4723903747088469822
/*    */     //   162: lload_1
/*    */     //   163: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   168: athrow
/*    */     //   169: aload_0
/*    */     //   170: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #13	-> 52
/*    */     //   #108	-> 108
/*    */     //   #62	-> 124
/*    */     //   #58	-> 169
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   52	64	67	java/io/IOException
/*    */     //   58	98	98	java/io/IOException
/*    */     //   124	156	159	java/io/IOException } public String toString() { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/j0.d : J
/*    */     //   3: ldc2_w 69549893536860
/*    */     //   6: lxor
/*    */     //   7: lstore_1
/*    */     //   8: new java/lang/StringBuilder
/*    */     //   11: dup
/*    */     //   12: invokespecial <init> : ()V
/*    */     //   15: sipush #26676
/*    */     //   18: ldc2_w 2347272031427990473
/*    */     //   21: lload_1
/*    */     //   22: lxor
/*    */     //   23: <illegal opcode> m : (IJ)Ljava/lang/String;
/*    */     //   28: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   31: aload_0
/*    */     //   32: getfield a : Lme/konsolas/aac/gp;
/*    */     //   35: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   38: ldc_w '쒄ე'
/*    */     //   41: invokevirtual toCharArray : ()[C
/*    */     //   44: dup
/*    */     //   45: dup
/*    */     //   46: iconst_0
/*    */     //   47: dup_x1
/*    */     //   48: caload
/*    */     //   49: sipush #13400
/*    */     //   52: ixor
/*    */     //   53: i2c
/*    */     //   54: castore
/*    */     //   55: sipush #22546
/*    */     //   58: iconst_0
/*    */     //   59: iconst_0
/*    */     //   60: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   63: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   66: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   69: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #20	-> 8 } public gi b(long paramLong1, long paramLong2) { // Byte code:
/*    */     //   0: lload_3
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 63299109697638
/*    */     //   5: lxor
/*    */     //   6: lstore #5
/*    */     //   8: dup2
/*    */     //   9: ldc2_w 85573153727526
/*    */     //   12: lxor
/*    */     //   13: lstore #7
/*    */     //   15: pop2
/*    */     //   16: ldc2_w 488073405184692477
/*    */     //   19: lload_3
/*    */     //   20: <illegal opcode> w : (JJ)I
/*    */     //   25: istore #9
/*    */     //   27: aload_0
/*    */     //   28: iload #9
/*    */     //   30: ifne -> 100
/*    */     //   33: getfield c : Z
/*    */     //   36: ifeq -> 83
/*    */     //   39: goto -> 52
/*    */     //   42: ldc2_w 438937153504086180
/*    */     //   45: lload_3
/*    */     //   46: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   51: athrow
/*    */     //   52: new java/lang/IllegalStateException
/*    */     //   55: dup
/*    */     //   56: sipush #6421
/*    */     //   59: ldc2_w 5052357164210354295
/*    */     //   62: lload_3
/*    */     //   63: lxor
/*    */     //   64: <illegal opcode> m : (IJ)Ljava/lang/String;
/*    */     //   69: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   72: athrow
/*    */     //   73: ldc2_w 438937153504086180
/*    */     //   76: lload_3
/*    */     //   77: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   82: athrow
/*    */     //   83: aload_0
/*    */     //   84: getfield b : Lme/konsolas/aac/fw;
/*    */     //   87: lload_1
/*    */     //   88: lload #7
/*    */     //   90: invokevirtual d : (JJ)Lme/konsolas/aac/fw;
/*    */     //   93: pop
/*    */     //   94: aload_0
/*    */     //   95: lload #5
/*    */     //   97: invokevirtual b : (J)Lme/konsolas/aac/gi;
/*    */     //   100: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #24	-> 27
/*    */     //   #50	-> 83
/*    */     //   #101	-> 94
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   27	39	42	java/io/IOException
/*    */     //   33	73	73	java/io/IOException } public gi a(String paramString, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: lload_2
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 47416892628233
/*    */     //   5: lxor
/*    */     //   6: lstore #4
/*    */     //   8: dup2
/*    */     //   9: ldc2_w 66806717355484
/*    */     //   12: lxor
/*    */     //   13: lstore #6
/*    */     //   15: pop2
/*    */     //   16: ldc2_w 2570128895305151890
/*    */     //   19: lload_2
/*    */     //   20: <illegal opcode> w : (JJ)I
/*    */     //   25: istore #8
/*    */     //   27: aload_0
/*    */     //   28: iload #8
/*    */     //   30: ifne -> 100
/*    */     //   33: getfield c : Z
/*    */     //   36: ifeq -> 83
/*    */     //   39: goto -> 52
/*    */     //   42: ldc2_w 2555926594391453131
/*    */     //   45: lload_2
/*    */     //   46: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   51: athrow
/*    */     //   52: new java/lang/IllegalStateException
/*    */     //   55: dup
/*    */     //   56: sipush #6421
/*    */     //   59: ldc2_w 5052342393241623832
/*    */     //   62: lload_2
/*    */     //   63: lxor
/*    */     //   64: <illegal opcode> m : (IJ)Ljava/lang/String;
/*    */     //   69: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   72: athrow
/*    */     //   73: ldc2_w 2555926594391453131
/*    */     //   76: lload_2
/*    */     //   77: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   82: athrow
/*    */     //   83: aload_0
/*    */     //   84: getfield b : Lme/konsolas/aac/fw;
/*    */     //   87: lload #6
/*    */     //   89: aload_1
/*    */     //   90: invokevirtual a : (JLjava/lang/String;)Lme/konsolas/aac/fw;
/*    */     //   93: pop
/*    */     //   94: aload_0
/*    */     //   95: lload #4
/*    */     //   97: invokevirtual b : (J)Lme/konsolas/aac/gi;
/*    */     //   100: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #27	-> 27
/*    */     //   #36	-> 83
/*    */     //   #82	-> 94
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   27	39	42	java/io/IOException
/*    */     //   33	73	73	java/io/IOException
/*    */   } public gi c(long paramLong, int paramInt) {
/*    */     // Byte code:
/*    */     //   0: lload_1
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 97237926547043
/*    */     //   5: lxor
/*    */     //   6: lstore #4
/*    */     //   8: dup2
/*    */     //   9: ldc2_w 113563962179816
/*    */     //   12: lxor
/*    */     //   13: lstore #6
/*    */     //   15: pop2
/*    */     //   16: ldc2_w -5746286185101490167
/*    */     //   19: lload_1
/*    */     //   20: <illegal opcode> w : (JJ)I
/*    */     //   25: istore #8
/*    */     //   27: aload_0
/*    */     //   28: iload #8
/*    */     //   30: ifeq -> 100
/*    */     //   33: getfield c : Z
/*    */     //   36: ifeq -> 83
/*    */     //   39: goto -> 52
/*    */     //   42: ldc2_w -5759528887521001823
/*    */     //   45: lload_1
/*    */     //   46: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   51: athrow
/*    */     //   52: new java/lang/IllegalStateException
/*    */     //   55: dup
/*    */     //   56: sipush #6421
/*    */     //   59: ldc2_w 5052464753151626866
/*    */     //   62: lload_1
/*    */     //   63: lxor
/*    */     //   64: <illegal opcode> m : (IJ)Ljava/lang/String;
/*    */     //   69: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   72: athrow
/*    */     //   73: ldc2_w -5759528887521001823
/*    */     //   76: lload_1
/*    */     //   77: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   82: athrow
/*    */     //   83: aload_0
/*    */     //   84: getfield b : Lme/konsolas/aac/fw;
/*    */     //   87: lload #6
/*    */     //   89: iload_3
/*    */     //   90: invokevirtual b : (JI)Lme/konsolas/aac/fw;
/*    */     //   93: pop
/*    */     //   94: aload_0
/*    */     //   95: lload #4
/*    */     //   97: invokevirtual b : (J)Lme/konsolas/aac/gi;
/*    */     //   100: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #31	-> 27
/*    */     //   #89	-> 83
/*    */     //   #59	-> 94
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   27	39	42	java/io/IOException
/*    */     //   33	73	73	java/io/IOException
/*    */   } public fw a() {
/* 32 */     return this.b;
/*    */   }
/*    */   public boolean isOpen() {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/j0.d : J
/*    */     //   3: ldc2_w 108328721061804
/*    */     //   6: lxor
/*    */     //   7: lstore_1
/*    */     //   8: ldc2_w 5127972756826324834
/*    */     //   11: lload_1
/*    */     //   12: <illegal opcode> w : (JJ)I
/*    */     //   17: istore_3
/*    */     //   18: aload_0
/*    */     //   19: getfield c : Z
/*    */     //   22: iload_3
/*    */     //   23: ifeq -> 43
/*    */     //   26: ifne -> 46
/*    */     //   29: goto -> 42
/*    */     //   32: ldc2_w 5150189260707219914
/*    */     //   35: lload_1
/*    */     //   36: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   41: athrow
/*    */     //   42: iconst_1
/*    */     //   43: goto -> 47
/*    */     //   46: iconst_0
/*    */     //   47: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #33	-> 18
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   18	29	32	java/lang/NullPointerException
/*    */   }
/*    */   public long a(long paramLong, hp paramhp) {
/*    */     // Byte code:
/*    */     //   0: lload_1
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 96341163355347
/*    */     //   5: lxor
/*    */     //   6: lstore #4
/*    */     //   8: dup2
/*    */     //   9: ldc2_w 64158829943611
/*    */     //   12: lxor
/*    */     //   13: lstore #6
/*    */     //   15: pop2
/*    */     //   16: ldc2_w 2709196542542050208
/*    */     //   19: lload_1
/*    */     //   20: <illegal opcode> w : (JJ)I
/*    */     //   25: istore #8
/*    */     //   27: aload_3
/*    */     //   28: ifnonnull -> 62
/*    */     //   31: new java/lang/IllegalArgumentException
/*    */     //   34: dup
/*    */     //   35: sipush #20192
/*    */     //   38: ldc2_w 1435637279566466267
/*    */     //   41: lload_1
/*    */     //   42: lxor
/*    */     //   43: <illegal opcode> m : (IJ)Ljava/lang/String;
/*    */     //   48: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   51: athrow
/*    */     //   52: ldc2_w 2687075336518315001
/*    */     //   55: lload_1
/*    */     //   56: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   61: athrow
/*    */     //   62: lconst_0
/*    */     //   63: lstore #9
/*    */     //   65: aload_3
/*    */     //   66: aload_0
/*    */     //   67: getfield b : Lme/konsolas/aac/fw;
/*    */     //   70: lload #4
/*    */     //   72: dup2_x1
/*    */     //   73: pop2
/*    */     //   74: ldc2_w 8192
/*    */     //   77: invokeinterface a : (JLme/konsolas/aac/fw;J)J
/*    */     //   82: dup2
/*    */     //   83: lstore #11
/*    */     //   85: ldc2_w -1
/*    */     //   88: lcmp
/*    */     //   89: ifeq -> 116
/*    */     //   92: lload #9
/*    */     //   94: lload #11
/*    */     //   96: ladd
/*    */     //   97: iload #8
/*    */     //   99: ifne -> 124
/*    */     //   102: lstore #9
/*    */     //   104: aload_0
/*    */     //   105: lload #6
/*    */     //   107: invokevirtual b : (J)Lme/konsolas/aac/gi;
/*    */     //   110: pop
/*    */     //   111: iload #8
/*    */     //   113: ifeq -> 65
/*    */     //   116: lload_1
/*    */     //   117: lconst_0
/*    */     //   118: lcmp
/*    */     //   119: iflt -> 111
/*    */     //   122: lload #9
/*    */     //   124: lreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #34	-> 27
/*    */     //   #49	-> 62
/*    */     //   #95	-> 65
/*    */     //   #44	-> 92
/*    */     //   #104	-> 104
/*    */     //   #91	-> 116
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   27	52	52	java/io/IOException
/*    */   }
/*    */   
/*    */   public gi a(long paramLong, String paramString, int paramInt1, int paramInt2) {
/*    */     // Byte code:
/*    */     //   0: lload_1
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 25146648573180
/*    */     //   5: lxor
/*    */     //   6: lstore #6
/*    */     //   8: dup2
/*    */     //   9: ldc2_w 63706311210864
/*    */     //   12: lxor
/*    */     //   13: lstore #8
/*    */     //   15: pop2
/*    */     //   16: ldc2_w -8475823555732972441
/*    */     //   19: lload_1
/*    */     //   20: <illegal opcode> w : (JJ)I
/*    */     //   25: istore #10
/*    */     //   27: aload_0
/*    */     //   28: iload #10
/*    */     //   30: ifne -> 104
/*    */     //   33: getfield c : Z
/*    */     //   36: ifeq -> 83
/*    */     //   39: goto -> 52
/*    */     //   42: ldc2_w -8463033027647667138
/*    */     //   45: lload_1
/*    */     //   46: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   51: athrow
/*    */     //   52: new java/lang/IllegalStateException
/*    */     //   55: dup
/*    */     //   56: sipush #6421
/*    */     //   59: ldc2_w 5052400367549347053
/*    */     //   62: lload_1
/*    */     //   63: lxor
/*    */     //   64: <illegal opcode> m : (IJ)Ljava/lang/String;
/*    */     //   69: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   72: athrow
/*    */     //   73: ldc2_w -8463033027647667138
/*    */     //   76: lload_1
/*    */     //   77: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   82: athrow
/*    */     //   83: aload_0
/*    */     //   84: getfield b : Lme/konsolas/aac/fw;
/*    */     //   87: aload_3
/*    */     //   88: iload #4
/*    */     //   90: lload #8
/*    */     //   92: iload #5
/*    */     //   94: invokevirtual a : (Ljava/lang/String;IJI)Lme/konsolas/aac/fw;
/*    */     //   97: pop
/*    */     //   98: aload_0
/*    */     //   99: lload #6
/*    */     //   101: invokevirtual b : (J)Lme/konsolas/aac/gi;
/*    */     //   104: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #38	-> 27
/*    */     //   #65	-> 83
/*    */     //   #30	-> 98
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   27	39	42	java/io/IOException
/*    */     //   33	73	73	java/io/IOException
/*    */   }
/*    */   
/*    */   public gi f(long paramLong, int paramInt) {
/*    */     // Byte code:
/*    */     //   0: lload_1
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 75589486670416
/*    */     //   5: lxor
/*    */     //   6: lstore #4
/*    */     //   8: dup2
/*    */     //   9: ldc2_w 41767723295742
/*    */     //   12: lxor
/*    */     //   13: lstore #6
/*    */     //   15: pop2
/*    */     //   16: ldc2_w -2495592052425454747
/*    */     //   19: lload_1
/*    */     //   20: <illegal opcode> w : (JJ)I
/*    */     //   25: istore #8
/*    */     //   27: aload_0
/*    */     //   28: iload #8
/*    */     //   30: ifne -> 100
/*    */     //   33: getfield c : Z
/*    */     //   36: ifeq -> 83
/*    */     //   39: goto -> 52
/*    */     //   42: ldc2_w -2481633551839603908
/*    */     //   45: lload_1
/*    */     //   46: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   51: athrow
/*    */     //   52: new java/lang/IllegalStateException
/*    */     //   55: dup
/*    */     //   56: sipush #6421
/*    */     //   59: ldc2_w 5052344439068271599
/*    */     //   62: lload_1
/*    */     //   63: lxor
/*    */     //   64: <illegal opcode> m : (IJ)Ljava/lang/String;
/*    */     //   69: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   72: athrow
/*    */     //   73: ldc2_w -2481633551839603908
/*    */     //   76: lload_1
/*    */     //   77: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   82: athrow
/*    */     //   83: aload_0
/*    */     //   84: getfield b : Lme/konsolas/aac/fw;
/*    */     //   87: lload #4
/*    */     //   89: iload_3
/*    */     //   90: invokevirtual d : (JI)Lme/konsolas/aac/fw;
/*    */     //   93: pop
/*    */     //   94: aload_0
/*    */     //   95: lload #6
/*    */     //   97: invokevirtual b : (J)Lme/konsolas/aac/gi;
/*    */     //   100: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #48	-> 27
/*    */     //   #6	-> 83
/*    */     //   #90	-> 94
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   27	39	42	java/io/IOException
/*    */     //   33	73	73	java/io/IOException
/*    */   }
/*    */   
/*    */   public gi a(int paramInt, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: lload_2
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 52709058729013
/*    */     //   5: lxor
/*    */     //   6: lstore #4
/*    */     //   8: dup2
/*    */     //   9: ldc2_w 137750546622950
/*    */     //   12: lxor
/*    */     //   13: lstore #6
/*    */     //   15: pop2
/*    */     //   16: ldc2_w 7644685233054306911
/*    */     //   19: lload_2
/*    */     //   20: <illegal opcode> w : (JJ)I
/*    */     //   25: istore #8
/*    */     //   27: aload_0
/*    */     //   28: iload #8
/*    */     //   30: ifeq -> 100
/*    */     //   33: getfield c : Z
/*    */     //   36: ifeq -> 83
/*    */     //   39: goto -> 52
/*    */     //   42: ldc2_w 7657383127523747063
/*    */     //   45: lload_2
/*    */     //   46: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   51: athrow
/*    */     //   52: new java/lang/IllegalStateException
/*    */     //   55: dup
/*    */     //   56: sipush #6421
/*    */     //   59: ldc2_w 5052337788274480164
/*    */     //   62: lload_2
/*    */     //   63: lxor
/*    */     //   64: <illegal opcode> m : (IJ)Ljava/lang/String;
/*    */     //   69: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   72: athrow
/*    */     //   73: ldc2_w 7657383127523747063
/*    */     //   76: lload_2
/*    */     //   77: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   82: athrow
/*    */     //   83: aload_0
/*    */     //   84: getfield b : Lme/konsolas/aac/fw;
/*    */     //   87: iload_1
/*    */     //   88: lload #6
/*    */     //   90: invokevirtual c : (IJ)Lme/konsolas/aac/fw;
/*    */     //   93: pop
/*    */     //   94: aload_0
/*    */     //   95: lload #4
/*    */     //   97: invokevirtual b : (J)Lme/konsolas/aac/gi;
/*    */     //   100: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #52	-> 27
/*    */     //   #96	-> 83
/*    */     //   #47	-> 94
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   27	39	42	java/io/IOException
/*    */     //   33	73	73	java/io/IOException
/*    */   }
/*    */   
/*    */   public li a() {
/* 54 */     return this.a.a();
/*    */   }
/*    */   
/*    */   public void close() {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/j0.d : J
/*    */     //   3: ldc2_w 75702661327072
/*    */     //   6: lxor
/*    */     //   7: lstore_1
/*    */     //   8: lload_1
/*    */     //   9: dup2
/*    */     //   10: ldc2_w 24379559836975
/*    */     //   13: lxor
/*    */     //   14: lstore_3
/*    */     //   15: pop2
/*    */     //   16: ldc2_w -511276576030282017
/*    */     //   19: lload_1
/*    */     //   20: <illegal opcode> w : (JJ)I
/*    */     //   25: istore #5
/*    */     //   27: aload_0
/*    */     //   28: getfield c : Z
/*    */     //   31: ifeq -> 45
/*    */     //   34: return
/*    */     //   35: ldc2_w -561538698660743546
/*    */     //   38: lload_1
/*    */     //   39: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   44: athrow
/*    */     //   45: aconst_null
/*    */     //   46: astore #6
/*    */     //   48: aload_0
/*    */     //   49: getfield b : Lme/konsolas/aac/fw;
/*    */     //   52: iload #5
/*    */     //   54: ifne -> 95
/*    */     //   57: getfield a : J
/*    */     //   60: lconst_0
/*    */     //   61: lcmp
/*    */     //   62: ifle -> 114
/*    */     //   65: goto -> 78
/*    */     //   68: ldc2_w -561538698660743546
/*    */     //   71: lload_1
/*    */     //   72: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   77: athrow
/*    */     //   78: aload_0
/*    */     //   79: getfield a : Lme/konsolas/aac/gp;
/*    */     //   82: goto -> 95
/*    */     //   85: ldc2_w -561538698660743546
/*    */     //   88: lload_1
/*    */     //   89: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   94: athrow
/*    */     //   95: aload_0
/*    */     //   96: getfield b : Lme/konsolas/aac/fw;
/*    */     //   99: lload_3
/*    */     //   100: dup2_x1
/*    */     //   101: pop2
/*    */     //   102: aload_0
/*    */     //   103: getfield b : Lme/konsolas/aac/fw;
/*    */     //   106: getfield a : J
/*    */     //   109: invokeinterface b : (JLme/konsolas/aac/fw;J)V
/*    */     //   114: goto -> 123
/*    */     //   117: astore #7
/*    */     //   119: aload #7
/*    */     //   121: astore #6
/*    */     //   123: aload_0
/*    */     //   124: getfield a : Lme/konsolas/aac/gp;
/*    */     //   127: invokeinterface close : ()V
/*    */     //   132: goto -> 164
/*    */     //   135: astore #7
/*    */     //   137: aload #6
/*    */     //   139: iload #5
/*    */     //   141: ifne -> 171
/*    */     //   144: ifnonnull -> 164
/*    */     //   147: goto -> 160
/*    */     //   150: ldc2_w -561538698660743546
/*    */     //   153: lload_1
/*    */     //   154: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   159: athrow
/*    */     //   160: aload #7
/*    */     //   162: astore #6
/*    */     //   164: aload_0
/*    */     //   165: iconst_1
/*    */     //   166: putfield c : Z
/*    */     //   169: aload #6
/*    */     //   171: iload #5
/*    */     //   173: ifne -> 194
/*    */     //   176: ifnull -> 197
/*    */     //   179: goto -> 192
/*    */     //   182: ldc2_w -561538698660743546
/*    */     //   185: lload_1
/*    */     //   186: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   191: athrow
/*    */     //   192: aload #6
/*    */     //   194: invokestatic b : (Ljava/lang/Throwable;)V
/*    */     //   197: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #63	-> 27
/*    */     //   #15	-> 45
/*    */     //   #18	-> 48
/*    */     //   #69	-> 78
/*    */     //   #74	-> 114
/*    */     //   #3	-> 117
/*    */     //   #84	-> 119
/*    */     //   #105	-> 123
/*    */     //   #1	-> 132
/*    */     //   #39	-> 135
/*    */     //   #76	-> 137
/*    */     //   #78	-> 164
/*    */     //   #7	-> 169
/*    */     //   #103	-> 197
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   27	35	35	java/lang/Throwable
/*    */     //   48	65	68	java/lang/Throwable
/*    */     //   48	114	117	java/lang/Throwable
/*    */     //   57	82	85	java/lang/Throwable
/*    */     //   123	132	135	java/lang/Throwable
/*    */     //   137	147	150	java/lang/Throwable
/*    */     //   171	179	182	java/lang/Throwable
/*    */   }
/*    */   
/*    */   public gi d(int paramInt, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: lload_2
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 24715809525501
/*    */     //   5: lxor
/*    */     //   6: lstore #4
/*    */     //   8: dup2
/*    */     //   9: ldc2_w 29446763591168
/*    */     //   12: lxor
/*    */     //   13: lstore #6
/*    */     //   15: pop2
/*    */     //   16: ldc2_w -8600785169889501541
/*    */     //   19: lload_2
/*    */     //   20: <illegal opcode> w : (JJ)I
/*    */     //   25: istore #8
/*    */     //   27: aload_0
/*    */     //   28: iload #8
/*    */     //   30: ifne -> 100
/*    */     //   33: getfield c : Z
/*    */     //   36: ifeq -> 83
/*    */     //   39: goto -> 52
/*    */     //   42: ldc2_w -8615025060358027582
/*    */     //   45: lload_2
/*    */     //   46: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   51: athrow
/*    */     //   52: new java/lang/IllegalStateException
/*    */     //   55: dup
/*    */     //   56: sipush #6421
/*    */     //   59: ldc2_w 5052395891344340497
/*    */     //   62: lload_2
/*    */     //   63: lxor
/*    */     //   64: <illegal opcode> m : (IJ)Ljava/lang/String;
/*    */     //   69: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   72: athrow
/*    */     //   73: ldc2_w -8615025060358027582
/*    */     //   76: lload_2
/*    */     //   77: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   82: athrow
/*    */     //   83: aload_0
/*    */     //   84: getfield b : Lme/konsolas/aac/fw;
/*    */     //   87: iload_1
/*    */     //   88: lload #4
/*    */     //   90: invokevirtual a : (IJ)Lme/konsolas/aac/fw;
/*    */     //   93: pop
/*    */     //   94: aload_0
/*    */     //   95: lload #6
/*    */     //   97: invokevirtual b : (J)Lme/konsolas/aac/gi;
/*    */     //   100: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #67	-> 27
/*    */     //   #99	-> 83
/*    */     //   #102	-> 94
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   27	39	42	java/io/IOException
/*    */     //   33	73	73	java/io/IOException
/*    */   }
/*    */   
/*    */   public gi e(long paramLong, int paramInt) {
/*    */     // Byte code:
/*    */     //   0: lload_1
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 128670670030209
/*    */     //   5: lxor
/*    */     //   6: lstore #4
/*    */     //   8: dup2
/*    */     //   9: ldc2_w 8946686042802
/*    */     //   12: lxor
/*    */     //   13: lstore #6
/*    */     //   15: pop2
/*    */     //   16: ldc2_w -7200748242166822359
/*    */     //   19: lload_1
/*    */     //   20: <illegal opcode> w : (JJ)I
/*    */     //   25: istore #8
/*    */     //   27: aload_0
/*    */     //   28: iload #8
/*    */     //   30: ifne -> 100
/*    */     //   33: getfield c : Z
/*    */     //   36: ifeq -> 83
/*    */     //   39: goto -> 52
/*    */     //   42: ldc2_w -7150772066781982096
/*    */     //   45: lload_1
/*    */     //   46: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   51: athrow
/*    */     //   52: new java/lang/IllegalStateException
/*    */     //   55: dup
/*    */     //   56: sipush #6421
/*    */     //   59: ldc2_w 5052376465401832099
/*    */     //   62: lload_1
/*    */     //   63: lxor
/*    */     //   64: <illegal opcode> m : (IJ)Ljava/lang/String;
/*    */     //   69: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   72: athrow
/*    */     //   73: ldc2_w -7150772066781982096
/*    */     //   76: lload_1
/*    */     //   77: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   82: athrow
/*    */     //   83: aload_0
/*    */     //   84: getfield b : Lme/konsolas/aac/fw;
/*    */     //   87: lload #4
/*    */     //   89: iload_3
/*    */     //   90: invokevirtual e : (JI)Lme/konsolas/aac/fw;
/*    */     //   93: pop
/*    */     //   94: aload_0
/*    */     //   95: lload #6
/*    */     //   97: invokevirtual b : (J)Lme/konsolas/aac/gi;
/*    */     //   100: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #68	-> 27
/*    */     //   #16	-> 83
/*    */     //   #64	-> 94
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   27	39	42	java/io/IOException
/*    */     //   33	73	73	java/io/IOException
/*    */   }
/*    */   
/*    */   public gi a(long paramLong, char paramChar) {
/*    */     // Byte code:
/*    */     //   0: lload_1
/*    */     //   1: bipush #16
/*    */     //   3: lshl
/*    */     //   4: iload_3
/*    */     //   5: i2l
/*    */     //   6: bipush #48
/*    */     //   8: lshl
/*    */     //   9: bipush #48
/*    */     //   11: lushr
/*    */     //   12: lor
/*    */     //   13: lstore #4
/*    */     //   15: lload #4
/*    */     //   17: dup2
/*    */     //   18: ldc2_w 110548454709867
/*    */     //   21: lxor
/*    */     //   22: lstore #6
/*    */     //   24: pop2
/*    */     //   25: ldc2_w -6943453248747222629
/*    */     //   28: lload #4
/*    */     //   30: <illegal opcode> w : (JJ)I
/*    */     //   35: istore #8
/*    */     //   37: aload_0
/*    */     //   38: iload #8
/*    */     //   40: ifne -> 97
/*    */     //   43: getfield c : Z
/*    */     //   46: ifeq -> 96
/*    */     //   49: goto -> 63
/*    */     //   52: ldc2_w -6957655566975004222
/*    */     //   55: lload #4
/*    */     //   57: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   62: athrow
/*    */     //   63: new java/lang/IllegalStateException
/*    */     //   66: dup
/*    */     //   67: sipush #6421
/*    */     //   70: ldc2_w 5052350700207661329
/*    */     //   73: lload #4
/*    */     //   75: lxor
/*    */     //   76: <illegal opcode> m : (IJ)Ljava/lang/String;
/*    */     //   81: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   84: athrow
/*    */     //   85: ldc2_w -6957655566975004222
/*    */     //   88: lload #4
/*    */     //   90: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   95: athrow
/*    */     //   96: aload_0
/*    */     //   97: getfield b : Lme/konsolas/aac/fw;
/*    */     //   100: invokevirtual f : ()J
/*    */     //   103: lstore #9
/*    */     //   105: iload_3
/*    */     //   106: ifle -> 135
/*    */     //   109: lload #9
/*    */     //   111: lconst_0
/*    */     //   112: lcmp
/*    */     //   113: ifle -> 149
/*    */     //   116: aload_0
/*    */     //   117: getfield a : Lme/konsolas/aac/gp;
/*    */     //   120: aload_0
/*    */     //   121: getfield b : Lme/konsolas/aac/fw;
/*    */     //   124: lload #6
/*    */     //   126: dup2_x1
/*    */     //   127: pop2
/*    */     //   128: lload #9
/*    */     //   130: invokeinterface b : (JLme/konsolas/aac/fw;J)V
/*    */     //   135: goto -> 149
/*    */     //   138: ldc2_w -6957655566975004222
/*    */     //   141: lload #4
/*    */     //   143: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   148: athrow
/*    */     //   149: aload_0
/*    */     //   150: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #70	-> 37
/*    */     //   #81	-> 96
/*    */     //   #17	-> 105
/*    */     //   #55	-> 149
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   37	49	52	java/io/IOException
/*    */     //   43	85	85	java/io/IOException
/*    */     //   105	135	138	java/io/IOException
/*    */   }
/*    */   
/*    */   public gi a(String paramString, Charset paramCharset, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: lload_3
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 41763499732323
/*    */     //   5: lxor
/*    */     //   6: lstore #5
/*    */     //   8: dup2
/*    */     //   9: ldc2_w 877237711047
/*    */     //   12: lxor
/*    */     //   13: dup2
/*    */     //   14: bipush #32
/*    */     //   16: lushr
/*    */     //   17: l2i
/*    */     //   18: istore #7
/*    */     //   20: dup2
/*    */     //   21: bipush #32
/*    */     //   23: lshl
/*    */     //   24: bipush #48
/*    */     //   26: lushr
/*    */     //   27: l2i
/*    */     //   28: istore #8
/*    */     //   30: dup2
/*    */     //   31: bipush #48
/*    */     //   33: lshl
/*    */     //   34: bipush #48
/*    */     //   36: lushr
/*    */     //   37: l2i
/*    */     //   38: istore #9
/*    */     //   40: pop2
/*    */     //   41: pop2
/*    */     //   42: ldc2_w 6035070097267820024
/*    */     //   45: lload_3
/*    */     //   46: <illegal opcode> w : (JJ)I
/*    */     //   51: istore #10
/*    */     //   53: aload_0
/*    */     //   54: iload #10
/*    */     //   56: ifne -> 133
/*    */     //   59: getfield c : Z
/*    */     //   62: ifeq -> 109
/*    */     //   65: goto -> 78
/*    */     //   68: ldc2_w 5985978151127702945
/*    */     //   71: lload_3
/*    */     //   72: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   77: athrow
/*    */     //   78: new java/lang/IllegalStateException
/*    */     //   81: dup
/*    */     //   82: sipush #6421
/*    */     //   85: ldc2_w 5052344408797228402
/*    */     //   88: lload_3
/*    */     //   89: lxor
/*    */     //   90: <illegal opcode> m : (IJ)Ljava/lang/String;
/*    */     //   95: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   98: athrow
/*    */     //   99: ldc2_w 5985978151127702945
/*    */     //   102: lload_3
/*    */     //   103: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   108: athrow
/*    */     //   109: aload_0
/*    */     //   110: getfield b : Lme/konsolas/aac/fw;
/*    */     //   113: iload #7
/*    */     //   115: aload_1
/*    */     //   116: iload #8
/*    */     //   118: i2s
/*    */     //   119: iload #9
/*    */     //   121: i2c
/*    */     //   122: aload_2
/*    */     //   123: invokevirtual a : (ILjava/lang/String;SCLjava/nio/charset/Charset;)Lme/konsolas/aac/fw;
/*    */     //   126: pop
/*    */     //   127: aload_0
/*    */     //   128: lload #5
/*    */     //   130: invokevirtual b : (J)Lme/konsolas/aac/gi;
/*    */     //   133: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #71	-> 53
/*    */     //   #35	-> 109
/*    */     //   #106	-> 127
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   53	65	68	java/io/IOException
/*    */     //   59	99	99	java/io/IOException
/*    */   }
/*    */   
/*    */   public gi c(long paramLong1, long paramLong2) {
/*    */     // Byte code:
/*    */     //   0: lload_3
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 64121991437865
/*    */     //   5: lxor
/*    */     //   6: lstore #5
/*    */     //   8: dup2
/*    */     //   9: ldc2_w 78284693900668
/*    */     //   12: lxor
/*    */     //   13: lstore #7
/*    */     //   15: pop2
/*    */     //   16: ldc2_w -5485522266127800857
/*    */     //   19: lload_3
/*    */     //   20: <illegal opcode> w : (JJ)I
/*    */     //   25: istore #9
/*    */     //   27: aload_0
/*    */     //   28: iload #9
/*    */     //   30: ifne -> 100
/*    */     //   33: getfield c : Z
/*    */     //   36: ifeq -> 83
/*    */     //   39: goto -> 52
/*    */     //   42: ldc2_w -5544751784671003202
/*    */     //   45: lload_3
/*    */     //   46: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   51: athrow
/*    */     //   52: new java/lang/IllegalStateException
/*    */     //   55: dup
/*    */     //   56: sipush #32762
/*    */     //   59: ldc2_w 5859273418515360640
/*    */     //   62: lload_3
/*    */     //   63: lxor
/*    */     //   64: <illegal opcode> m : (IJ)Ljava/lang/String;
/*    */     //   69: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   72: athrow
/*    */     //   73: ldc2_w -5544751784671003202
/*    */     //   76: lload_3
/*    */     //   77: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   82: athrow
/*    */     //   83: aload_0
/*    */     //   84: getfield b : Lme/konsolas/aac/fw;
/*    */     //   87: lload_1
/*    */     //   88: lload #5
/*    */     //   90: invokevirtual a : (JJ)Lme/konsolas/aac/fw;
/*    */     //   93: pop
/*    */     //   94: aload_0
/*    */     //   95: lload #7
/*    */     //   97: invokevirtual b : (J)Lme/konsolas/aac/gi;
/*    */     //   100: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #73	-> 27
/*    */     //   #57	-> 83
/*    */     //   #11	-> 94
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   27	39	42	java/io/IOException
/*    */     //   33	73	73	java/io/IOException
/*    */   }
/*    */   
/*    */   public void b(long paramLong1, fw paramfw, long paramLong2) {
/*    */     // Byte code:
/*    */     //   0: lload_1
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 0
/*    */     //   5: lxor
/*    */     //   6: lstore #6
/*    */     //   8: dup2
/*    */     //   9: ldc2_w 78310475807595
/*    */     //   12: lxor
/*    */     //   13: lstore #8
/*    */     //   15: pop2
/*    */     //   16: ldc2_w 380844980938161409
/*    */     //   19: lload_1
/*    */     //   20: <illegal opcode> w : (JJ)I
/*    */     //   25: istore #10
/*    */     //   27: aload_0
/*    */     //   28: iload #10
/*    */     //   30: ifeq -> 101
/*    */     //   33: getfield c : Z
/*    */     //   36: ifeq -> 83
/*    */     //   39: goto -> 52
/*    */     //   42: ldc2_w 367630144131566505
/*    */     //   45: lload_1
/*    */     //   46: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   51: athrow
/*    */     //   52: new java/lang/IllegalStateException
/*    */     //   55: dup
/*    */     //   56: sipush #6421
/*    */     //   59: ldc2_w 5052452443440118650
/*    */     //   62: lload_1
/*    */     //   63: lxor
/*    */     //   64: <illegal opcode> m : (IJ)Ljava/lang/String;
/*    */     //   69: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   72: athrow
/*    */     //   73: ldc2_w 367630144131566505
/*    */     //   76: lload_1
/*    */     //   77: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   82: athrow
/*    */     //   83: aload_0
/*    */     //   84: getfield b : Lme/konsolas/aac/fw;
/*    */     //   87: lload #6
/*    */     //   89: aload_3
/*    */     //   90: lload #4
/*    */     //   92: invokevirtual b : (JLme/konsolas/aac/fw;J)V
/*    */     //   95: aload_0
/*    */     //   96: lload #8
/*    */     //   98: invokevirtual b : (J)Lme/konsolas/aac/gi;
/*    */     //   101: pop
/*    */     //   102: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #79	-> 27
/*    */     //   #28	-> 83
/*    */     //   #10	-> 95
/*    */     //   #92	-> 102
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   27	39	42	java/io/IOException
/*    */     //   33	73	73	java/io/IOException
/*    */   }
/*    */   
/*    */   public gi a(byte[] paramArrayOfbyte, long paramLong, int paramInt1, int paramInt2) {
/*    */     // Byte code:
/*    */     //   0: lload_2
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 32660652706763
/*    */     //   5: lxor
/*    */     //   6: lstore #6
/*    */     //   8: dup2
/*    */     //   9: ldc2_w 97485360405520
/*    */     //   12: lxor
/*    */     //   13: lstore #8
/*    */     //   15: pop2
/*    */     //   16: ldc2_w -6722857103185349493
/*    */     //   19: lload_2
/*    */     //   20: <illegal opcode> w : (JJ)I
/*    */     //   25: istore #10
/*    */     //   27: aload_0
/*    */     //   28: iload #10
/*    */     //   30: ifne -> 104
/*    */     //   33: getfield c : Z
/*    */     //   36: ifeq -> 83
/*    */     //   39: goto -> 52
/*    */     //   42: ldc2_w -6746099515790414638
/*    */     //   45: lload_2
/*    */     //   46: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   51: athrow
/*    */     //   52: new java/lang/IllegalStateException
/*    */     //   55: dup
/*    */     //   56: sipush #6421
/*    */     //   59: ldc2_w 5052463921737096193
/*    */     //   62: lload_2
/*    */     //   63: lxor
/*    */     //   64: <illegal opcode> m : (IJ)Ljava/lang/String;
/*    */     //   69: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   72: athrow
/*    */     //   73: ldc2_w -6746099515790414638
/*    */     //   76: lload_2
/*    */     //   77: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   82: athrow
/*    */     //   83: aload_0
/*    */     //   84: getfield b : Lme/konsolas/aac/fw;
/*    */     //   87: aload_1
/*    */     //   88: lload #6
/*    */     //   90: iload #4
/*    */     //   92: iload #5
/*    */     //   94: invokevirtual a : ([BJII)Lme/konsolas/aac/fw;
/*    */     //   97: pop
/*    */     //   98: aload_0
/*    */     //   99: lload #8
/*    */     //   101: invokevirtual b : (J)Lme/konsolas/aac/gi;
/*    */     //   104: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #80	-> 27
/*    */     //   #22	-> 83
/*    */     //   #51	-> 98
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   27	39	42	java/io/IOException
/*    */     //   33	73	73	java/io/IOException
/*    */   }
/*    */   
/*    */   public gi a(gZ paramgZ, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: lload_2
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 26846940438679
/*    */     //   5: lxor
/*    */     //   6: lstore #4
/*    */     //   8: dup2
/*    */     //   9: ldc2_w 38451189297099
/*    */     //   12: lxor
/*    */     //   13: dup2
/*    */     //   14: bipush #32
/*    */     //   16: lushr
/*    */     //   17: l2i
/*    */     //   18: istore #6
/*    */     //   20: dup2
/*    */     //   21: bipush #32
/*    */     //   23: lshl
/*    */     //   24: bipush #32
/*    */     //   26: lushr
/*    */     //   27: lstore #7
/*    */     //   29: pop2
/*    */     //   30: pop2
/*    */     //   31: ldc2_w -7046763605081798644
/*    */     //   34: lload_2
/*    */     //   35: <illegal opcode> w : (JJ)I
/*    */     //   40: istore #9
/*    */     //   42: aload_0
/*    */     //   43: iload #9
/*    */     //   45: ifne -> 117
/*    */     //   48: getfield c : Z
/*    */     //   51: ifeq -> 98
/*    */     //   54: goto -> 67
/*    */     //   57: ldc2_w -6996822538638684075
/*    */     //   60: lload_2
/*    */     //   61: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   66: athrow
/*    */     //   67: new java/lang/IllegalStateException
/*    */     //   70: dup
/*    */     //   71: sipush #6421
/*    */     //   74: ldc2_w 5052394372289781894
/*    */     //   77: lload_2
/*    */     //   78: lxor
/*    */     //   79: <illegal opcode> m : (IJ)Ljava/lang/String;
/*    */     //   84: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   87: athrow
/*    */     //   88: ldc2_w -6996822538638684075
/*    */     //   91: lload_2
/*    */     //   92: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   97: athrow
/*    */     //   98: aload_0
/*    */     //   99: getfield b : Lme/konsolas/aac/fw;
/*    */     //   102: aload_1
/*    */     //   103: iload #6
/*    */     //   105: lload #7
/*    */     //   107: invokevirtual a : (Lme/konsolas/aac/gZ;IJ)Lme/konsolas/aac/fw;
/*    */     //   110: pop
/*    */     //   111: aload_0
/*    */     //   112: lload #4
/*    */     //   114: invokevirtual b : (J)Lme/konsolas/aac/gi;
/*    */     //   117: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #85	-> 42
/*    */     //   #19	-> 98
/*    */     //   #45	-> 111
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   42	54	57	java/io/IOException
/*    */     //   48	88	88	java/io/IOException
/*    */   }
/*    */   
/*    */   public gi a(char paramChar1, int paramInt, byte[] paramArrayOfbyte, char paramChar2) {
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
/*    */     //   14: iload #4
/*    */     //   16: i2l
/*    */     //   17: bipush #48
/*    */     //   19: lshl
/*    */     //   20: bipush #48
/*    */     //   22: lushr
/*    */     //   23: lor
/*    */     //   24: lstore #5
/*    */     //   26: lload #5
/*    */     //   28: dup2
/*    */     //   29: ldc2_w 78711627341652
/*    */     //   32: lxor
/*    */     //   33: lstore #7
/*    */     //   35: dup2
/*    */     //   36: ldc2_w 112916848838184
/*    */     //   39: lxor
/*    */     //   40: dup2
/*    */     //   41: bipush #32
/*    */     //   43: lushr
/*    */     //   44: l2i
/*    */     //   45: istore #9
/*    */     //   47: dup2
/*    */     //   48: bipush #32
/*    */     //   50: lshl
/*    */     //   51: bipush #48
/*    */     //   53: lushr
/*    */     //   54: l2i
/*    */     //   55: istore #10
/*    */     //   57: dup2
/*    */     //   58: bipush #48
/*    */     //   60: lshl
/*    */     //   61: bipush #48
/*    */     //   63: lushr
/*    */     //   64: l2i
/*    */     //   65: istore #11
/*    */     //   67: pop2
/*    */     //   68: pop2
/*    */     //   69: ldc2_w -2200561672474666690
/*    */     //   72: lload #5
/*    */     //   74: <illegal opcode> w : (JJ)I
/*    */     //   79: istore #12
/*    */     //   81: aload_0
/*    */     //   82: iload #12
/*    */     //   84: ifeq -> 163
/*    */     //   87: getfield c : Z
/*    */     //   90: ifeq -> 140
/*    */     //   93: goto -> 107
/*    */     //   96: ldc2_w -2223347732046549098
/*    */     //   99: lload #5
/*    */     //   101: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   106: athrow
/*    */     //   107: new java/lang/IllegalStateException
/*    */     //   110: dup
/*    */     //   111: sipush #6421
/*    */     //   114: ldc2_w 5052451732916576069
/*    */     //   117: lload #5
/*    */     //   119: lxor
/*    */     //   120: <illegal opcode> m : (IJ)Ljava/lang/String;
/*    */     //   125: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   128: athrow
/*    */     //   129: ldc2_w -2223347732046549098
/*    */     //   132: lload #5
/*    */     //   134: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   139: athrow
/*    */     //   140: aload_0
/*    */     //   141: getfield b : Lme/konsolas/aac/fw;
/*    */     //   144: iload #9
/*    */     //   146: iload #10
/*    */     //   148: i2c
/*    */     //   149: iload #11
/*    */     //   151: i2c
/*    */     //   152: aload_3
/*    */     //   153: invokevirtual a : (ICC[B)Lme/konsolas/aac/fw;
/*    */     //   156: pop
/*    */     //   157: aload_0
/*    */     //   158: lload #7
/*    */     //   160: invokevirtual b : (J)Lme/konsolas/aac/gi;
/*    */     //   163: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #86	-> 81
/*    */     //   #25	-> 140
/*    */     //   #14	-> 157
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   81	93	96	java/io/IOException
/*    */     //   87	129	129	java/io/IOException
/*    */   }
/*    */   
/*    */   public gi a(hp paramhp, int paramInt1, int paramInt2, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: iload_2
/*    */     //   1: i2l
/*    */     //   2: bipush #32
/*    */     //   4: lshl
/*    */     //   5: iload_3
/*    */     //   6: i2l
/*    */     //   7: bipush #32
/*    */     //   9: lshl
/*    */     //   10: bipush #32
/*    */     //   12: lushr
/*    */     //   13: lor
/*    */     //   14: lstore #6
/*    */     //   16: lload #6
/*    */     //   18: dup2
/*    */     //   19: ldc2_w 44864574111137
/*    */     //   22: lxor
/*    */     //   23: lstore #8
/*    */     //   25: dup2
/*    */     //   26: ldc2_w 75904178293321
/*    */     //   29: lxor
/*    */     //   30: lstore #10
/*    */     //   32: pop2
/*    */     //   33: ldc2_w 3813001546132513490
/*    */     //   36: lload #6
/*    */     //   38: <illegal opcode> w : (JJ)I
/*    */     //   43: istore #12
/*    */     //   45: lload #4
/*    */     //   47: lconst_0
/*    */     //   48: lcmp
/*    */     //   49: ifle -> 140
/*    */     //   52: aload_1
/*    */     //   53: aload_0
/*    */     //   54: getfield b : Lme/konsolas/aac/fw;
/*    */     //   57: lload #8
/*    */     //   59: dup2_x1
/*    */     //   60: pop2
/*    */     //   61: lload #4
/*    */     //   63: invokeinterface a : (JLme/konsolas/aac/fw;J)J
/*    */     //   68: lstore #13
/*    */     //   70: lload #13
/*    */     //   72: iload_3
/*    */     //   73: ifge -> 126
/*    */     //   76: ldc2_w -1
/*    */     //   79: iload #12
/*    */     //   81: ifne -> 125
/*    */     //   84: lcmp
/*    */     //   85: ifne -> 121
/*    */     //   88: goto -> 102
/*    */     //   91: ldc2_w 3762783442353404555
/*    */     //   94: lload #6
/*    */     //   96: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   101: athrow
/*    */     //   102: new java/io/EOFException
/*    */     //   105: dup
/*    */     //   106: invokespecial <init> : ()V
/*    */     //   109: athrow
/*    */     //   110: ldc2_w 3762783442353404555
/*    */     //   113: lload #6
/*    */     //   115: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   120: athrow
/*    */     //   121: lload #4
/*    */     //   123: lload #13
/*    */     //   125: lsub
/*    */     //   126: lstore #4
/*    */     //   128: aload_0
/*    */     //   129: lload #10
/*    */     //   131: invokevirtual b : (J)Lme/konsolas/aac/gi;
/*    */     //   134: pop
/*    */     //   135: iload #12
/*    */     //   137: ifeq -> 45
/*    */     //   140: aload_0
/*    */     //   141: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #87	-> 45
/*    */     //   #29	-> 52
/*    */     //   #72	-> 70
/*    */     //   #43	-> 121
/*    */     //   #42	-> 128
/*    */     //   #66	-> 135
/*    */     //   #2	-> 140
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   70	88	91	java/io/IOException
/*    */     //   84	110	110	java/io/IOException
/*    */   }
/*    */   
/*    */   j0(gp paramgp, byte paramByte, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: iload_2
/*    */     //   1: i2l
/*    */     //   2: bipush #56
/*    */     //   4: lshl
/*    */     //   5: lload_3
/*    */     //   6: bipush #8
/*    */     //   8: lshl
/*    */     //   9: bipush #8
/*    */     //   11: lushr
/*    */     //   12: lor
/*    */     //   13: getstatic me/konsolas/aac/j0.d : J
/*    */     //   16: lxor
/*    */     //   17: lstore #5
/*    */     //   19: ldc2_w -4716259593699227964
/*    */     //   22: lload #5
/*    */     //   24: <illegal opcode> w : (JJ)I
/*    */     //   29: aload_0
/*    */     //   30: invokespecial <init> : ()V
/*    */     //   33: istore #7
/*    */     //   35: aload_0
/*    */     //   36: new me/konsolas/aac/fw
/*    */     //   39: dup
/*    */     //   40: invokespecial <init> : ()V
/*    */     //   43: putfield b : Lme/konsolas/aac/fw;
/*    */     //   46: iload #7
/*    */     //   48: ifeq -> 107
/*    */     //   51: aload_1
/*    */     //   52: ifnonnull -> 102
/*    */     //   55: goto -> 69
/*    */     //   58: ldc2_w -4692918804131827604
/*    */     //   61: lload #5
/*    */     //   63: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   68: athrow
/*    */     //   69: new java/lang/NullPointerException
/*    */     //   72: dup
/*    */     //   73: sipush #28032
/*    */     //   76: ldc2_w 6857310851478860841
/*    */     //   79: lload #5
/*    */     //   81: lxor
/*    */     //   82: <illegal opcode> m : (IJ)Ljava/lang/String;
/*    */     //   87: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   90: athrow
/*    */     //   91: ldc2_w -4692918804131827604
/*    */     //   94: lload #5
/*    */     //   96: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   101: athrow
/*    */     //   102: aload_0
/*    */     //   103: aload_1
/*    */     //   104: putfield a : Lme/konsolas/aac/gp;
/*    */     //   107: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #88	-> 29
/*    */     //   #21	-> 35
/*    */     //   #56	-> 46
/*    */     //   #75	-> 102
/*    */     //   #8	-> 107
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   35	55	58	java/lang/NullPointerException
/*    */     //   51	91	91	java/lang/NullPointerException
/*    */   }
/*    */   
/*    */   public gi a(short paramShort1, int paramInt, long paramLong, short paramShort2) {
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
/*    */     //   14: iload #5
/*    */     //   16: i2l
/*    */     //   17: bipush #48
/*    */     //   19: lshl
/*    */     //   20: bipush #48
/*    */     //   22: lushr
/*    */     //   23: lor
/*    */     //   24: lstore #6
/*    */     //   26: lload #6
/*    */     //   28: dup2
/*    */     //   29: ldc2_w 89058211135303
/*    */     //   32: lxor
/*    */     //   33: lstore #8
/*    */     //   35: dup2
/*    */     //   36: ldc2_w 21083183575692
/*    */     //   39: lxor
/*    */     //   40: dup2
/*    */     //   41: bipush #48
/*    */     //   43: lushr
/*    */     //   44: l2i
/*    */     //   45: istore #10
/*    */     //   47: dup2
/*    */     //   48: bipush #16
/*    */     //   50: lshl
/*    */     //   51: bipush #32
/*    */     //   53: lushr
/*    */     //   54: l2i
/*    */     //   55: istore #11
/*    */     //   57: dup2
/*    */     //   58: bipush #48
/*    */     //   60: lshl
/*    */     //   61: bipush #48
/*    */     //   63: lushr
/*    */     //   64: l2i
/*    */     //   65: istore #12
/*    */     //   67: pop2
/*    */     //   68: pop2
/*    */     //   69: ldc2_w 4748084024694675420
/*    */     //   72: lload #6
/*    */     //   74: <illegal opcode> w : (JJ)I
/*    */     //   79: istore #13
/*    */     //   81: aload_0
/*    */     //   82: iload #13
/*    */     //   84: ifne -> 162
/*    */     //   87: getfield c : Z
/*    */     //   90: ifeq -> 140
/*    */     //   93: goto -> 107
/*    */     //   96: ldc2_w 4698945930440626053
/*    */     //   99: lload #6
/*    */     //   101: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   106: athrow
/*    */     //   107: new java/lang/IllegalStateException
/*    */     //   110: dup
/*    */     //   111: sipush #6421
/*    */     //   114: ldc2_w 5052473066011180886
/*    */     //   117: lload #6
/*    */     //   119: lxor
/*    */     //   120: <illegal opcode> m : (IJ)Ljava/lang/String;
/*    */     //   125: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   128: athrow
/*    */     //   129: ldc2_w 4698945930440626053
/*    */     //   132: lload #6
/*    */     //   134: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   139: athrow
/*    */     //   140: aload_0
/*    */     //   141: getfield b : Lme/konsolas/aac/fw;
/*    */     //   144: lload_3
/*    */     //   145: iload #10
/*    */     //   147: i2s
/*    */     //   148: iload #11
/*    */     //   150: iload #12
/*    */     //   152: invokevirtual c : (JSII)Lme/konsolas/aac/fw;
/*    */     //   155: pop
/*    */     //   156: aload_0
/*    */     //   157: lload #8
/*    */     //   159: invokevirtual b : (J)Lme/konsolas/aac/gi;
/*    */     //   162: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #93	-> 81
/*    */     //   #9	-> 140
/*    */     //   #41	-> 156
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   81	93	96	java/io/IOException
/*    */     //   87	129	129	java/io/IOException
/*    */   }
/*    */   
/*    */   public gi b(long paramLong, int paramInt) {
/*    */     // Byte code:
/*    */     //   0: lload_1
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 5728630451068
/*    */     //   5: lxor
/*    */     //   6: lstore #4
/*    */     //   8: dup2
/*    */     //   9: ldc2_w 124591783787826
/*    */     //   12: lxor
/*    */     //   13: lstore #6
/*    */     //   15: pop2
/*    */     //   16: ldc2_w 1576190089788146663
/*    */     //   19: lload_1
/*    */     //   20: <illegal opcode> w : (JJ)I
/*    */     //   25: istore #8
/*    */     //   27: aload_0
/*    */     //   28: iload #8
/*    */     //   30: ifne -> 100
/*    */     //   33: getfield c : Z
/*    */     //   36: ifeq -> 83
/*    */     //   39: goto -> 52
/*    */     //   42: ldc2_w 1516965027710245822
/*    */     //   45: lload_1
/*    */     //   46: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   51: athrow
/*    */     //   52: new java/lang/IllegalStateException
/*    */     //   55: dup
/*    */     //   56: sipush #6421
/*    */     //   59: ldc2_w 5052379859689499501
/*    */     //   62: lload_1
/*    */     //   63: lxor
/*    */     //   64: <illegal opcode> m : (IJ)Ljava/lang/String;
/*    */     //   69: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   72: athrow
/*    */     //   73: ldc2_w 1516965027710245822
/*    */     //   76: lload_1
/*    */     //   77: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   82: athrow
/*    */     //   83: aload_0
/*    */     //   84: getfield b : Lme/konsolas/aac/fw;
/*    */     //   87: iload_3
/*    */     //   88: lload #6
/*    */     //   90: invokevirtual f : (IJ)Lme/konsolas/aac/fw;
/*    */     //   93: pop
/*    */     //   94: aload_0
/*    */     //   95: lload #4
/*    */     //   97: invokevirtual b : (J)Lme/konsolas/aac/gi;
/*    */     //   100: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #97	-> 27
/*    */     //   #94	-> 83
/*    */     //   #77	-> 94
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   27	39	42	java/io/IOException
/*    */     //   33	73	73	java/io/IOException
/*    */   }
/*    */   
/*    */   public void flush() {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/j0.d : J
/*    */     //   3: ldc2_w 100535434404946
/*    */     //   6: lxor
/*    */     //   7: lstore_1
/*    */     //   8: lload_1
/*    */     //   9: dup2
/*    */     //   10: ldc2_w 10557363499421
/*    */     //   13: lxor
/*    */     //   14: lstore_3
/*    */     //   15: pop2
/*    */     //   16: ldc2_w -5416702372641928036
/*    */     //   19: lload_1
/*    */     //   20: <illegal opcode> w : (JJ)I
/*    */     //   25: istore #5
/*    */     //   27: aload_0
/*    */     //   28: getfield c : Z
/*    */     //   31: iload #5
/*    */     //   33: ifeq -> 110
/*    */     //   36: ifeq -> 83
/*    */     //   39: goto -> 52
/*    */     //   42: ldc2_w -5438347028141262284
/*    */     //   45: lload_1
/*    */     //   46: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   51: athrow
/*    */     //   52: new java/lang/IllegalStateException
/*    */     //   55: dup
/*    */     //   56: sipush #6421
/*    */     //   59: ldc2_w 5052444085641267943
/*    */     //   62: lload_1
/*    */     //   63: lxor
/*    */     //   64: <illegal opcode> m : (IJ)Ljava/lang/String;
/*    */     //   69: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   72: athrow
/*    */     //   73: ldc2_w -5438347028141262284
/*    */     //   76: lload_1
/*    */     //   77: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   82: athrow
/*    */     //   83: aload_0
/*    */     //   84: getfield b : Lme/konsolas/aac/fw;
/*    */     //   87: iload #5
/*    */     //   89: ifeq -> 153
/*    */     //   92: getfield a : J
/*    */     //   95: lconst_0
/*    */     //   96: lcmp
/*    */     //   97: goto -> 110
/*    */     //   100: ldc2_w -5438347028141262284
/*    */     //   103: lload_1
/*    */     //   104: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   109: athrow
/*    */     //   110: ifle -> 149
/*    */     //   113: aload_0
/*    */     //   114: getfield a : Lme/konsolas/aac/gp;
/*    */     //   117: aload_0
/*    */     //   118: getfield b : Lme/konsolas/aac/fw;
/*    */     //   121: lload_3
/*    */     //   122: dup2_x1
/*    */     //   123: pop2
/*    */     //   124: aload_0
/*    */     //   125: getfield b : Lme/konsolas/aac/fw;
/*    */     //   128: getfield a : J
/*    */     //   131: invokeinterface b : (JLme/konsolas/aac/fw;J)V
/*    */     //   136: goto -> 149
/*    */     //   139: ldc2_w -5438347028141262284
/*    */     //   142: lload_1
/*    */     //   143: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   148: athrow
/*    */     //   149: aload_0
/*    */     //   150: getfield a : Lme/konsolas/aac/gp;
/*    */     //   153: invokeinterface flush : ()V
/*    */     //   158: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #100	-> 27
/*    */     //   #40	-> 83
/*    */     //   #83	-> 113
/*    */     //   #53	-> 149
/*    */     //   #26	-> 158
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   27	39	42	java/io/IOException
/*    */     //   36	73	73	java/io/IOException
/*    */     //   83	97	100	java/io/IOException
/*    */     //   110	136	139	java/io/IOException
/*    */   }
/*    */   
/*    */   public int write(ByteBuffer paramByteBuffer) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/j0.d : J
/*    */     //   3: ldc2_w 5880001623256
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: lload_2
/*    */     //   9: dup2
/*    */     //   10: ldc2_w 18235194055292
/*    */     //   13: lxor
/*    */     //   14: lstore #4
/*    */     //   16: pop2
/*    */     //   17: ldc2_w 2657076678767440615
/*    */     //   20: lload_2
/*    */     //   21: <illegal opcode> w : (JJ)I
/*    */     //   26: istore #6
/*    */     //   28: aload_0
/*    */     //   29: getfield c : Z
/*    */     //   32: iload #6
/*    */     //   34: ifne -> 92
/*    */     //   37: ifeq -> 84
/*    */     //   40: goto -> 53
/*    */     //   43: ldc2_w 2597805160980032190
/*    */     //   46: lload_2
/*    */     //   47: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   52: athrow
/*    */     //   53: new java/lang/IllegalStateException
/*    */     //   56: dup
/*    */     //   57: sipush #6421
/*    */     //   60: ldc2_w 5052402262615874157
/*    */     //   63: lload_2
/*    */     //   64: lxor
/*    */     //   65: <illegal opcode> m : (IJ)Ljava/lang/String;
/*    */     //   70: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   73: athrow
/*    */     //   74: ldc2_w 2597805160980032190
/*    */     //   77: lload_2
/*    */     //   78: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   83: athrow
/*    */     //   84: aload_0
/*    */     //   85: getfield b : Lme/konsolas/aac/fw;
/*    */     //   88: aload_1
/*    */     //   89: invokevirtual write : (Ljava/nio/ByteBuffer;)I
/*    */     //   92: istore #7
/*    */     //   94: aload_0
/*    */     //   95: lload #4
/*    */     //   97: invokevirtual b : (J)Lme/konsolas/aac/gi;
/*    */     //   100: pop
/*    */     //   101: iload #7
/*    */     //   103: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #107	-> 28
/*    */     //   #4	-> 84
/*    */     //   #60	-> 94
/*    */     //   #61	-> 101
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   28	40	43	java/io/IOException
/*    */     //   37	74	74	java/io/IOException
/*    */   }
/*    */   
/*    */   public gi d(long paramLong1, long paramLong2) {
/*    */     // Byte code:
/*    */     //   0: lload_3
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 138235972375796
/*    */     //   5: lxor
/*    */     //   6: lstore #5
/*    */     //   8: dup2
/*    */     //   9: ldc2_w 134989461408983
/*    */     //   12: lxor
/*    */     //   13: lstore #7
/*    */     //   15: pop2
/*    */     //   16: ldc2_w -939786111792854339
/*    */     //   19: lload_3
/*    */     //   20: <illegal opcode> w : (JJ)I
/*    */     //   25: istore #9
/*    */     //   27: aload_0
/*    */     //   28: iload #9
/*    */     //   30: ifeq -> 100
/*    */     //   33: getfield c : Z
/*    */     //   36: ifeq -> 83
/*    */     //   39: goto -> 52
/*    */     //   42: ldc2_w -962037113329353707
/*    */     //   45: lload_3
/*    */     //   46: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   51: athrow
/*    */     //   52: new java/lang/IllegalStateException
/*    */     //   55: dup
/*    */     //   56: sipush #6421
/*    */     //   59: ldc2_w 5052431056204958918
/*    */     //   62: lload_3
/*    */     //   63: lxor
/*    */     //   64: <illegal opcode> m : (IJ)Ljava/lang/String;
/*    */     //   69: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   72: athrow
/*    */     //   73: ldc2_w -962037113329353707
/*    */     //   76: lload_3
/*    */     //   77: <illegal opcode> w : (Ljava/lang/Throwable;JJ)Ljava/lang/Throwable;
/*    */     //   82: athrow
/*    */     //   83: aload_0
/*    */     //   84: getfield b : Lme/konsolas/aac/fw;
/*    */     //   87: lload_1
/*    */     //   88: lload #5
/*    */     //   90: invokevirtual b : (JJ)Lme/konsolas/aac/fw;
/*    */     //   93: pop
/*    */     //   94: aload_0
/*    */     //   95: lload #7
/*    */     //   97: invokevirtual b : (J)Lme/konsolas/aac/gi;
/*    */     //   100: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #109	-> 27
/*    */     //   #12	-> 83
/*    */     //   #46	-> 94
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   27	39	42	java/io/IOException
/*    */     //   33	73	73	java/io/IOException
/*    */   }
/*    */   
/*    */   static {
/*    */     long l = d ^ 0x3ACF2849547L;
/*    */     "왂뒎冲了ແ掄ូ钨绶칶ꏦ砧넟쥯?媃".toCharArray()[2] = (char)("왂뒎冲了ແ掄ូ钨绶칶ꏦ砧넟쥯?媃".toCharArray()[2] ^ 0x5AE0);
/*    */     "㊧堅ⓧ»".toCharArray()[2] = (char)("㊧堅ⓧ»".toCharArray()[2] ^ 0x434);
/*    */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*    */     for (byte b1 = 1; b1 < 8; b1++)
/*    */       (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
/*    */     Cipher cipher;
/*    */     (cipher = Cipher.getInstance(da$gx.U("왂뒎冲了ແ掄ូ钨绶칶ꏦ砧넟쥯?媃".toCharArray(), (short)6586, false, false))).init(2, SecretKeyFactory.getInstance(da$gx.U("㊧堅ⓧ»".toCharArray(), (short)4556, true, false)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*    */     String[] arrayOfString = new String[5];
/*    */     boolean bool = false;
/*    */     "缓⥆煑䗽୭匝঴～?⽷⨴餵㔂Ϋ纲Ħ譸겳ꚋ㮨ᝪᑒO芝襞ᷟ늮곇ঠؚ怚䁀ꂥ鳘擒풾黨嬃쾚吉ᾝ磦厨듿犤ŵّ".toCharArray()[15] = (char)("缓⥆煑䗽୭匝঴～?⽷⨴餵㔂Ϋ纲Ħ譸겳ꚋ㮨ᝪᑒO芝襞ᷟ늮곇ঠؚ怚䁀ꂥ鳘擒풾黨嬃쾚吉ᾝ磦厨듿犤ŵّ".toCharArray()[15] ^ 0x416E);
/*    */     String str;
/*    */     int i = (str = da$gx.U("缓⥆煑䗽୭匝঴～?⽷⨴餵㔂Ϋ纲Ħ譸겳ꚋ㮨ᝪᑒO芝襞ᷟ늮곇ঠؚ怚䁀ꂥ鳘擒풾黨嬃쾚吉ᾝ磦厨듿犤ŵّ".toCharArray(), (short)19568, false, false)).length();
/*    */     byte b2 = 16;
/*    */     byte b = -1;
/*    */     while (true);
/*    */   }
/*    */   
/*    */   private static Throwable a(Throwable paramThrowable) {
/*    */     return paramThrowable;
/*    */   }
/*    */   
/*    */   private static String a(byte[] paramArrayOfbyte) {
/*    */     byte b1 = 0;
/*    */     int i;
/*    */     char[] arrayOfChar = new char[i = paramArrayOfbyte.length];
/*    */     for (byte b2 = 0; b2 < i; b2++) {
/*    */       int j;
/*    */       if ((j = 0xFF & paramArrayOfbyte[b2]) < 192) {
/*    */         arrayOfChar[b1++] = (char)j;
/*    */       } else if (j < 224) {
/*    */         char c = (char)((char)(j & 0x1F) << 6);
/*    */         j = paramArrayOfbyte[++b2];
/*    */         c = (char)(c | (char)(j & 0x3F));
/*    */         arrayOfChar[b1++] = c;
/*    */       } else if (b2 < i - 2) {
/*    */         char c = (char)((char)(j & 0xF) << 12);
/*    */         j = paramArrayOfbyte[++b2];
/*    */         c = (char)(c | (char)(j & 0x3F) << 6);
/*    */         j = paramArrayOfbyte[++b2];
/*    */         c = (char)(c | (char)(j & 0x3F));
/*    */         arrayOfChar[b1++] = c;
/*    */       } 
/*    */     } 
/*    */     return new String(arrayOfChar, 0, b1);
/*    */   }
/*    */   
/*    */   private static String b(int paramInt, long paramLong) {
/*    */     int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x6624;
/*    */     if (f[i] == null) {
/*    */       Object[] arrayOfObject;
/*    */       try {
/*    */         Long long_ = Long.valueOf(Thread.currentThread().getId());
/*    */         arrayOfObject = (Object[])g.get(long_);
/*    */         if (arrayOfObject == null) {
/*    */           arrayOfObject = new Object[3];
/*    */           "뇙ᬗի䙎礶ӵ潧䳗磕ᢱ黈迻⨜㗨褟ၰᩃᚮ".toCharArray()[14] = (char)("뇙ᬗի䙎礶ӵ潧䳗磕ᢱ黈迻⨜㗨褟ၰᩃᚮ".toCharArray()[14] ^ 0x3A27);
/*    */           arrayOfObject[0] = Cipher.getInstance(a0$cc.G("뇙ᬗի䙎礶ӵ潧䳗磕ᢱ黈迻⨜㗨褟ၰᩃᚮ".toCharArray(), (short)11118, false, (byte)5));
/*    */           "瑸瓺㊰".toCharArray()[1] = (char)("瑸瓺㊰".toCharArray()[1] ^ 0x436);
/*    */           arrayOfObject[1] = SecretKeyFactory.getInstance(a0$cc.G("瑸瓺㊰".toCharArray(), (short)27133, false, (byte)1));
/*    */           arrayOfObject[2] = new IvParameterSpec(new byte[8]);
/*    */           g.put(long_, arrayOfObject);
/*    */         } 
/*    */       } catch (Exception exception) {
/*    */         "࿉땅ࠡ溱ቮ娦餰渚䓞࿘㥥?♍藹㡮ᙣ㉗".toCharArray()[1] = (char)("࿉땅ࠡ溱ቮ娦餰渚䓞࿘㥥?♍藹㡮ᙣ㉗".toCharArray()[1] ^ 0x43FC);
/*    */         throw new RuntimeException(a0$cc.G("࿉땅ࠡ溱ቮ娦餰渚䓞࿘㥥?♍藹㡮ᙣ㉗".toCharArray(), (short)19063, false, (byte)2), exception);
/*    */       } 
/*    */       byte[] arrayOfByte1 = new byte[8];
/*    */       arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
/*    */       for (byte b = 1; b < 8; b++)
/*    */         arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
/*    */       DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
/*    */       SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
/*    */       ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
/*    */       "㺺䝜娱ꖆ近芕╣㚼?ポ".toCharArray()[7] = (char)("㺺䝜娱ꖆ近芕╣㚼?ポ".toCharArray()[7] ^ 0x4FD9);
/*    */       byte[] arrayOfByte2 = e[i].getBytes(a0$cc.G("㺺䝜娱ꖆ近芕╣㚼?ポ".toCharArray(), (short)8150, true, (byte)4));
/*    */       f[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
/*    */     } 
/*    */     return f[i];
/*    */   }
/*    */   
/*    */   private static Object a(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
/*    */     int i = ((Integer)paramArrayOfObject[0]).intValue();
/*    */     long l = ((Long)paramArrayOfObject[1]).longValue();
/*    */     String str = b(i, l);
/*    */     MethodHandle methodHandle = MethodHandles.constant(String.class, str);
/*    */     paramMutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[] { int.class, long.class }));
/*    */     return str;
/*    */   }
/*    */   
/*    */   private static CallSite a(MethodHandles.Lookup paramLookup, String paramString, MethodType paramMethodType) {
/*    */     // Byte code:
/*    */     //   0: new java/lang/invoke/MutableCallSite
/*    */     //   3: dup
/*    */     //   4: aload_2
/*    */     //   5: invokespecial <init> : (Ljava/lang/invoke/MethodType;)V
/*    */     //   8: astore_3
/*    */     //   9: aload_3
/*    */     //   10: ldc_w
/*    */     //   13: ldc_w [Ljava/lang/Object;
/*    */     //   16: aload_2
/*    */     //   17: invokevirtual parameterCount : ()I
/*    */     //   20: invokevirtual asCollector : (Ljava/lang/Class;I)Ljava/lang/invoke/MethodHandle;
/*    */     //   23: iconst_0
/*    */     //   24: iconst_3
/*    */     //   25: anewarray java/lang/Object
/*    */     //   28: dup
/*    */     //   29: iconst_0
/*    */     //   30: aload_0
/*    */     //   31: aastore
/*    */     //   32: dup
/*    */     //   33: iconst_1
/*    */     //   34: aload_3
/*    */     //   35: aastore
/*    */     //   36: dup
/*    */     //   37: iconst_2
/*    */     //   38: aload_1
/*    */     //   39: aastore
/*    */     //   40: invokestatic insertArguments : (Ljava/lang/invoke/MethodHandle;I[Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;
/*    */     //   43: aload_2
/*    */     //   44: invokestatic explicitCastArguments : (Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;
/*    */     //   47: invokevirtual setTarget : (Ljava/lang/invoke/MethodHandle;)V
/*    */     //   50: goto -> 171
/*    */     //   53: astore #4
/*    */     //   55: new java/lang/RuntimeException
/*    */     //   58: dup
/*    */     //   59: new java/lang/StringBuilder
/*    */     //   62: dup
/*    */     //   63: invokespecial <init> : ()V
/*    */     //   66: ldc_w 'Ħ凬䱈똽䶁패赩뾟˃鰇׆๢聒着䍒'
/*    */     //   69: invokevirtual toCharArray : ()[C
/*    */     //   72: dup
/*    */     //   73: dup
/*    */     //   74: bipush #7
/*    */     //   76: dup_x1
/*    */     //   77: caload
/*    */     //   78: sipush #17996
/*    */     //   81: ixor
/*    */     //   82: i2c
/*    */     //   83: castore
/*    */     //   84: sipush #22182
/*    */     //   87: iconst_5
/*    */     //   88: iconst_0
/*    */     //   89: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   95: ldc_w '皲椃밗癗'
/*    */     //   98: invokevirtual toCharArray : ()[C
/*    */     //   101: dup
/*    */     //   102: dup
/*    */     //   103: iconst_2
/*    */     //   104: dup_x1
/*    */     //   105: caload
/*    */     //   106: sipush #29326
/*    */     //   109: ixor
/*    */     //   110: i2c
/*    */     //   111: castore
/*    */     //   112: sipush #11174
/*    */     //   115: iconst_1
/*    */     //   116: iconst_0
/*    */     //   117: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   123: aload_1
/*    */     //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   127: ldc_w '⟎xៈ⺨'
/*    */     //   130: invokevirtual toCharArray : ()[C
/*    */     //   133: dup
/*    */     //   134: dup
/*    */     //   135: iconst_2
/*    */     //   136: dup_x1
/*    */     //   137: caload
/*    */     //   138: sipush #17110
/*    */     //   141: ixor
/*    */     //   142: i2c
/*    */     //   143: castore
/*    */     //   144: sipush #23632
/*    */     //   147: iconst_3
/*    */     //   148: iconst_0
/*    */     //   149: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   152: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   155: aload_2
/*    */     //   156: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   159: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   162: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   165: aload #4
/*    */     //   167: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   170: athrow
/*    */     //   171: aload_3
/*    */     //   172: areturn
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   9	50	53	java/lang/Exception
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\j0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */