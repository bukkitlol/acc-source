/*    */ package me.konsolas.aac;final class k8 implements ae { boolean c; int b;
/*    */   
/*    */   public boolean tryAdvance(Consumer<Object> paramConsumer) {
/*    */     
/*  5 */     try { if (this.b >= a()) return false;  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
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
/*    */ 
/*    */     
/* 18 */     paramConsumer.accept(bq.a(this.e)[this.b++]);
/*    */ 
/*    */ 
/*    */     
/* 22 */     return true;
/*    */   }
/*    */   int a; static final boolean d; final bq e;
/*    */   
/*    */   public long estimateSize() {
/*    */     return (a() - this.b);
/*    */   }
/*    */   
/*    */   private int a() {
/*    */     try {
/*    */     
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return this.c ? this.a : bq.a(this.e);
/*    */   }
/*    */   
/*    */   public ae a() {
/*    */     int i = a();
/* 41 */     int j = i - this.b >> 1;
/*    */     try {
/*    */       if (j <= 1)
/*    */         return null; 
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw a(null);
/*    */     } 
/*    */     this.a = i;
/*    */     int k = this.b + j;
/*    */     int m = k;
/*    */     int n = this.b;
/*    */     this.b = k;
/*    */     this.c = true;
/*    */     return new k8(this.e, n, m, true);
/*    */   }
/*    */   
/*    */   public k8(bq parambq) {
/*    */     this(parambq, 0, bq.a(parambq), false);
/*    */   }
/*    */   
/*    */   private static final long f = nc.a(7567588600485177550L, 8263641183641765796L, MethodHandles.lookup().lookupClass()).a(260967381351633L);
/*    */   
/*    */   static {
/*    */     try {
/*    */     
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw a(null);
/*    */     } 
/*    */     d = !bq.class.desiredAssertionStatus();
/*    */   }
/*    */   
/*    */   public int characteristics() {
/*    */     return 16465;
/*    */   }
/*    */   
/*    */   private k8(bq parambq, int paramInt1, int paramInt2, boolean paramBoolean) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/k8.f : J
/*    */     //   3: ldc2_w 70298995506205
/*    */     //   6: lxor
/*    */     //   7: lstore #5
/*    */     //   9: aload_0
/*    */     //   10: aload_1
/*    */     //   11: putfield e : Lme/konsolas/aac/bq;
/*    */     //   14: aload_0
/*    */     //   15: invokespecial <init> : ()V
/*    */     //   18: aload_0
/*    */     //   19: iconst_0
/*    */     //   20: putfield c : Z
/*    */     //   23: getstatic me/konsolas/aac/k8.d : Z
/*    */     //   26: ifne -> 126
/*    */     //   29: iload_2
/*    */     //   30: iload_3
/*    */     //   31: if_icmple -> 126
/*    */     //   34: new java/lang/AssertionError
/*    */     //   37: dup
/*    */     //   38: new java/lang/StringBuilder
/*    */     //   41: dup
/*    */     //   42: invokespecial <init> : ()V
/*    */     //   45: ldc '퍊榕獎靘့'
/*    */     //   47: invokevirtual toCharArray : ()[C
/*    */     //   50: dup
/*    */     //   51: dup
/*    */     //   52: iconst_1
/*    */     //   53: dup_x1
/*    */     //   54: caload
/*    */     //   55: sipush #11883
/*    */     //   58: ixor
/*    */     //   59: i2c
/*    */     //   60: castore
/*    */     //   61: sipush #6892
/*    */     //   64: iconst_0
/*    */     //   65: iconst_0
/*    */     //   66: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   69: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   72: iload_2
/*    */     //   73: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   76: ldc 'Ⲡ聚荫뵉Ͻ㪭ͦ䀨جᯭ⚉듃뙏Ɒ貝髈㷐'
/*    */     //   78: invokevirtual toCharArray : ()[C
/*    */     //   81: dup
/*    */     //   82: dup
/*    */     //   83: bipush #12
/*    */     //   85: dup_x1
/*    */     //   86: caload
/*    */     //   87: sipush #9257
/*    */     //   90: ixor
/*    */     //   91: i2c
/*    */     //   92: castore
/*    */     //   93: sipush #22500
/*    */     //   96: iconst_0
/*    */     //   97: iconst_0
/*    */     //   98: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   101: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   104: iload_3
/*    */     //   105: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   108: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   111: invokespecial <init> : (Ljava/lang/Object;)V
/*    */     //   114: athrow
/*    */     //   115: ldc2_w 7857308806359078923
/*    */     //   118: lload #5
/*    */     //   120: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   125: athrow
/*    */     //   126: aload_0
/*    */     //   127: iload_2
/*    */     //   128: putfield b : I
/*    */     //   131: aload_0
/*    */     //   132: iload_3
/*    */     //   133: putfield a : I
/*    */     //   136: aload_0
/*    */     //   137: iload #4
/*    */     //   139: putfield c : Z
/*    */     //   142: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #30	-> 9
/*    */     //   #8	-> 18
/*    */     //   #31	-> 23
/*    */     //   #2	-> 126
/*    */     //   #11	-> 131
/*    */     //   #4	-> 136
/*    */     //   #24	-> 142
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   29	115	115	java/lang/IllegalArgumentException
/*    */   }
/*    */   
/*    */   public Spliterator trySplit() {
/*    */     return a();
/*    */   }
/*    */   
/*    */   public long a(long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/k8.f : J
/*    */     //   3: ldc2_w 85048419391362
/*    */     //   6: lxor
/*    */     //   7: lstore_3
/*    */     //   8: lload_1
/*    */     //   9: lconst_0
/*    */     //   10: lcmp
/*    */     //   11: ifge -> 74
/*    */     //   14: new java/lang/IllegalArgumentException
/*    */     //   17: dup
/*    */     //   18: new java/lang/StringBuilder
/*    */     //   21: dup
/*    */     //   22: invokespecial <init> : ()V
/*    */     //   25: ldc 'ﮒ粒?㗫덈琳럙ᮅ䗁勜볭䧝ﭼ걾ۯ崏২⤀䯮荙咸⤸壁礿矱䊭㤨菠໪'
/*    */     //   27: invokevirtual toCharArray : ()[C
/*    */     //   30: dup
/*    */     //   31: dup
/*    */     //   32: bipush #9
/*    */     //   34: dup_x1
/*    */     //   35: caload
/*    */     //   36: sipush #4157
/*    */     //   39: ixor
/*    */     //   40: i2c
/*    */     //   41: castore
/*    */     //   42: sipush #13232
/*    */     //   45: iconst_0
/*    */     //   46: iconst_3
/*    */     //   47: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*    */     //   50: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   53: lload_1
/*    */     //   54: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*    */     //   57: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   60: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   63: athrow
/*    */     //   64: ldc2_w 5086171520730985364
/*    */     //   67: lload_3
/*    */     //   68: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   73: athrow
/*    */     //   74: aload_0
/*    */     //   75: invokespecial a : ()I
/*    */     //   78: istore #5
/*    */     //   80: aload_0
/*    */     //   81: getfield b : I
/*    */     //   84: iload #5
/*    */     //   86: if_icmplt -> 101
/*    */     //   89: lconst_0
/*    */     //   90: lreturn
/*    */     //   91: ldc2_w 5086171520730985364
/*    */     //   94: lload_3
/*    */     //   95: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   100: athrow
/*    */     //   101: iload #5
/*    */     //   103: aload_0
/*    */     //   104: getfield b : I
/*    */     //   107: isub
/*    */     //   108: istore #6
/*    */     //   110: lload_1
/*    */     //   111: iload #6
/*    */     //   113: i2l
/*    */     //   114: lcmp
/*    */     //   115: ifge -> 144
/*    */     //   118: aload_0
/*    */     //   119: aload_0
/*    */     //   120: getfield b : I
/*    */     //   123: i2l
/*    */     //   124: lload_1
/*    */     //   125: ladd
/*    */     //   126: invokestatic a : (J)I
/*    */     //   129: putfield b : I
/*    */     //   132: lload_1
/*    */     //   133: lreturn
/*    */     //   134: ldc2_w 5086171520730985364
/*    */     //   137: lload_3
/*    */     //   138: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   143: athrow
/*    */     //   144: iload #6
/*    */     //   146: i2l
/*    */     //   147: lstore_1
/*    */     //   148: aload_0
/*    */     //   149: iload #5
/*    */     //   151: putfield b : I
/*    */     //   154: lload_1
/*    */     //   155: lreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #36	-> 8
/*    */     //   #29	-> 74
/*    */     //   #19	-> 80
/*    */     //   #15	-> 101
/*    */     //   #40	-> 110
/*    */     //   #33	-> 118
/*    */     //   #26	-> 132
/*    */     //   #25	-> 144
/*    */     //   #38	-> 148
/*    */     //   #16	-> 154
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	64	64	java/lang/IllegalArgumentException
/*    */     //   80	91	91	java/lang/IllegalArgumentException
/*    */     //   110	134	134	java/lang/IllegalArgumentException
/*    */   }
/*    */   
/*    */   public void forEachRemaining(Consumer<Object> paramConsumer) {
/*    */     int i = a();
/*    */     try {
/*    */       for (; this.b < i; this.b++)
/*    */         paramConsumer.accept(bq.a(this.e)[this.b]); 
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw a(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
/*    */     return paramIllegalArgumentException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\k8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */