/*    */ package me.konsolas.aac;
/*    */ final class bk implements fK { int b;
/*    */   int c;
/*    */   
/*  5 */   public Spliterator.OfInt trySplit() { return a(); }
/*    */   static final boolean d; final at a; public long a(long paramLong) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/bk.e : J
/*    */     //   3: ldc2_w 122834343260367
/*    */     //   6: lxor
/*    */     //   7: lstore_3
/*    */     //   8: lload_1
/*    */     //   9: lconst_0
/*    */     //   10: lcmp
/*    */     //   11: ifge -> 73
/*    */     //   14: new java/lang/IllegalArgumentException
/*    */     //   17: dup
/*    */     //   18: new java/lang/StringBuilder
/*    */     //   21: dup
/*    */     //   22: invokespecial <init> : ()V
/*    */     //   25: ldc '骹받謙蜛멠䨓ꔕﺍרּ䶱㗲ꦧװᐗ儝?듸切忠蒰㪋藲ࣕߒ㳑緜扟뮥麅憾'
/*    */     //   27: invokevirtual toCharArray : ()[C
/*    */     //   30: dup
/*    */     //   31: dup
/*    */     //   32: iconst_0
/*    */     //   33: dup_x1
/*    */     //   34: caload
/*    */     //   35: sipush #15942
/*    */     //   38: ixor
/*    */     //   39: i2c
/*    */     //   40: castore
/*    */     //   41: sipush #24449
/*    */     //   44: iconst_0
/*    */     //   45: iconst_0
/*    */     //   46: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*    */     //   49: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   52: lload_1
/*    */     //   53: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*    */     //   56: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   59: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   62: athrow
/*    */     //   63: ldc2_w 5082230060076785501
/*    */     //   66: lload_3
/*    */     //   67: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   72: athrow
/*    */     //   73: aload_0
/*    */     //   74: getfield b : I
/*    */     //   77: aload_0
/*    */     //   78: getfield c : I
/*    */     //   81: if_icmplt -> 96
/*    */     //   84: lconst_0
/*    */     //   85: lreturn
/*    */     //   86: ldc2_w 5082230060076785501
/*    */     //   89: lload_3
/*    */     //   90: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   95: athrow
/*    */     //   96: aload_0
/*    */     //   97: getfield c : I
/*    */     //   100: aload_0
/*    */     //   101: getfield b : I
/*    */     //   104: isub
/*    */     //   105: istore #5
/*    */     //   107: lload_1
/*    */     //   108: iload #5
/*    */     //   110: i2l
/*    */     //   111: lcmp
/*    */     //   112: ifge -> 141
/*    */     //   115: aload_0
/*    */     //   116: aload_0
/*    */     //   117: getfield b : I
/*    */     //   120: i2l
/*    */     //   121: lload_1
/*    */     //   122: ladd
/*    */     //   123: invokestatic a : (J)I
/*    */     //   126: putfield b : I
/*    */     //   129: lload_1
/*    */     //   130: lreturn
/*    */     //   131: ldc2_w 5082230060076785501
/*    */     //   134: lload_3
/*    */     //   135: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   140: athrow
/*    */     //   141: iload #5
/*    */     //   143: i2l
/*    */     //   144: lstore_1
/*    */     //   145: aload_0
/*    */     //   146: aload_0
/*    */     //   147: getfield c : I
/*    */     //   150: putfield b : I
/*    */     //   153: lload_1
/*    */     //   154: lreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #4	-> 8
/*    */     //   #33	-> 73
/*    */     //   #26	-> 96
/*    */     //   #16	-> 107
/*    */     //   #21	-> 115
/*    */     //   #32	-> 129
/*    */     //   #27	-> 141
/*    */     //   #31	-> 145
/*    */     //   #35	-> 153
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	63	63	java/lang/IllegalArgumentException
/*    */     //   73	86	86	java/lang/IllegalArgumentException
/*    */     //   107	131	131	java/lang/IllegalArgumentException } public void forEachRemaining(Object paramObject) {
/*  7 */     forEachRemaining((IntConsumer)paramObject);
/*    */   }
/*    */   public Spliterator.OfPrimitive trySplit() {
/* 10 */     return a();
/*    */   }
/*    */   public Spliterator trySplit() {
/* 13 */     return a();
/*    */   }
/*    */   
/*    */   public int characteristics()
/*    */   {
/* 18 */     return 17744; } public boolean tryAdvance(Object paramObject) {
/* 19 */     return tryAdvance((IntConsumer)paramObject);
/*    */   }
/*    */   
/*    */   public long estimateSize() {
/* 23 */     return (this.c - this.b);
/* 24 */   } public fK a() { int i = this.c - this.b >> 1;
/*    */     
/*    */     try {
/*    */       if (i <= 1) {
/*    */         return null;
/*    */       }
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw a(null);
/*    */     } 
/*    */     
/*    */     int j = this.b + i;
/*    */     
/*    */     int k = j;
/* 37 */     int m = this.b; this.b = j; return new bk(this.a, m, k); } private static final long e = nc.a(-7289379304318890772L, 3442466649187778100L, MethodHandles.lookup().lookupClass()).a(259761684679810L); public boolean tryAdvance(IntConsumer paramIntConsumer) { 
/* 38 */     try { if (this.b >= this.c) return false;  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/*    */     
/*    */     paramIntConsumer.accept(at.a(this.a)[this.b++]);
/*    */     return true; }
/*    */ 
/*    */   
/*    */   static {
/*    */     try {
/*    */     
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw a(null);
/*    */     } 
/*    */     d = !at.class.desiredAssertionStatus();
/*    */   }
/*    */   
/*    */   public void forEachRemaining(IntConsumer paramIntConsumer) {
/*    */     try {
/*    */       for (; this.b < this.c; this.b++)
/*    */         paramIntConsumer.accept(at.a(this.a)[this.b]); 
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw a(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   public bk(at paramat) {
/*    */     this(paramat, 0, (at.a(paramat)).length);
/*    */   }
/*    */   
/*    */   private bk(at paramat, int paramInt1, int paramInt2) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/bk.e : J
/*    */     //   3: ldc2_w 81455587121728
/*    */     //   6: lxor
/*    */     //   7: lstore #4
/*    */     //   9: aload_0
/*    */     //   10: aload_1
/*    */     //   11: putfield a : Lme/konsolas/aac/at;
/*    */     //   14: aload_0
/*    */     //   15: invokespecial <init> : ()V
/*    */     //   18: getstatic me/konsolas/aac/bk.d : Z
/*    */     //   21: ifne -> 120
/*    */     //   24: iload_2
/*    */     //   25: iload_3
/*    */     //   26: if_icmple -> 120
/*    */     //   29: new java/lang/AssertionError
/*    */     //   32: dup
/*    */     //   33: new java/lang/StringBuilder
/*    */     //   36: dup
/*    */     //   37: invokespecial <init> : ()V
/*    */     //   40: ldc 'ﯡ❝ꩧὴ㟋'
/*    */     //   42: invokevirtual toCharArray : ()[C
/*    */     //   45: dup
/*    */     //   46: dup
/*    */     //   47: iconst_2
/*    */     //   48: dup_x1
/*    */     //   49: caload
/*    */     //   50: sipush #28790
/*    */     //   53: ixor
/*    */     //   54: i2c
/*    */     //   55: castore
/*    */     //   56: sipush #19753
/*    */     //   59: iconst_1
/*    */     //   60: iconst_0
/*    */     //   61: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   64: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   67: iload_2
/*    */     //   68: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   71: ldc '㷺⪌¢歀닏叺?뱓㜣䛻轊?ᩎᝬ봹ও'
/*    */     //   73: invokevirtual toCharArray : ()[C
/*    */     //   76: dup
/*    */     //   77: dup
/*    */     //   78: iconst_2
/*    */     //   79: dup_x1
/*    */     //   80: caload
/*    */     //   81: sipush #24875
/*    */     //   84: ixor
/*    */     //   85: i2c
/*    */     //   86: castore
/*    */     //   87: sipush #18752
/*    */     //   90: iconst_0
/*    */     //   91: iconst_3
/*    */     //   92: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   95: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   98: iload_3
/*    */     //   99: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   102: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   105: invokespecial <init> : (Ljava/lang/Object;)V
/*    */     //   108: athrow
/*    */     //   109: ldc2_w -1438740708272835118
/*    */     //   112: lload #4
/*    */     //   114: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   119: athrow
/*    */     //   120: aload_0
/*    */     //   121: iload_2
/*    */     //   122: putfield b : I
/*    */     //   125: aload_0
/*    */     //   126: iload_3
/*    */     //   127: putfield c : I
/*    */     //   130: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #36	-> 9
/*    */     //   #6	-> 18
/*    */     //   #2	-> 120
/*    */     //   #22	-> 125
/*    */     //   #9	-> 130
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   24	109	109	java/lang/IllegalArgumentException
/*    */   }
/*    */   
/*    */   private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
/*    */     return paramIllegalArgumentException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\bk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */