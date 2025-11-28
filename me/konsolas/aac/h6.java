/*    */ package me.konsolas.aac;final class h6 implements fK { boolean b; int c; int a; static final boolean d; final aQ e;
/*    */   
/*    */   public long a(long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/h6.f : J
/*    */     //   3: ldc2_w 42803346146723
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
/*    */     //   25: ldc '崲ឍ⚈闫ȟ糖僀뾡?瞐㦆쨳殌嵜簎㘅ึ啑勹㾮즍莧?焠冔醗渳'
/*    */     //   27: invokevirtual toCharArray : ()[C
/*    */     //   30: dup
/*    */     //   31: dup
/*    */     //   32: bipush #23
/*    */     //   34: dup_x1
/*    */     //   35: caload
/*    */     //   36: sipush #28735
/*    */     //   39: ixor
/*    */     //   40: i2c
/*    */     //   41: castore
/*    */     //   42: sipush #28855
/*    */     //   45: iconst_0
/*    */     //   46: iconst_0
/*    */     //   47: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   50: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   53: lload_1
/*    */     //   54: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*    */     //   57: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   60: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   63: athrow
/*    */     //   64: ldc2_w 5145786954256664008
/*    */     //   67: lload_3
/*    */     //   68: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   73: athrow
/*    */     //   74: aload_0
/*    */     //   75: invokespecial a : ()I
/*    */     //   78: istore #5
/*    */     //   80: aload_0
/*    */     //   81: getfield c : I
/*    */     //   84: iload #5
/*    */     //   86: if_icmplt -> 101
/*    */     //   89: lconst_0
/*    */     //   90: lreturn
/*    */     //   91: ldc2_w 5145786954256664008
/*    */     //   94: lload_3
/*    */     //   95: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   100: athrow
/*    */     //   101: iload #5
/*    */     //   103: aload_0
/*    */     //   104: getfield c : I
/*    */     //   107: isub
/*    */     //   108: istore #6
/*    */     //   110: lload_1
/*    */     //   111: iload #6
/*    */     //   113: i2l
/*    */     //   114: lcmp
/*    */     //   115: ifge -> 144
/*    */     //   118: aload_0
/*    */     //   119: aload_0
/*    */     //   120: getfield c : I
/*    */     //   123: i2l
/*    */     //   124: lload_1
/*    */     //   125: ladd
/*    */     //   126: invokestatic a : (J)I
/*    */     //   129: putfield c : I
/*    */     //   132: lload_1
/*    */     //   133: lreturn
/*    */     //   134: ldc2_w 5145786954256664008
/*    */     //   137: lload_3
/*    */     //   138: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   143: athrow
/*    */     //   144: iload #6
/*    */     //   146: i2l
/*    */     //   147: lstore_1
/*    */     //   148: aload_0
/*    */     //   149: iload #5
/*    */     //   151: putfield c : I
/*    */     //   154: lload_1
/*    */     //   155: lreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 8
/*    */     //   #6	-> 74
/*    */     //   #24	-> 80
/*    */     //   #32	-> 101
/*    */     //   #40	-> 110
/*    */     //   #28	-> 118
/*    */     //   #4	-> 132
/*    */     //   #13	-> 144
/*    */     //   #9	-> 148
/*    */     //   #14	-> 154
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	64	64	java/lang/IllegalArgumentException
/*    */     //   80	91	91	java/lang/IllegalArgumentException
/*    */     //   110	134	134	java/lang/IllegalArgumentException
/*    */   }
/*    */   
/*  7 */   public void forEachRemaining(IntConsumer paramIntConsumer) { int i = a(); try { while (this.c < i)
/*    */       
/*    */       { 
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
/* 20 */         paramIntConsumer.accept(aQ.a(this.e)[this.c]);
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
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 37 */         this.c++; }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  }
/* 38 */   public void forEachRemaining(Object paramObject) { forEachRemaining((IntConsumer)paramObject); } private static final long f = nc.a(7822190389321613344L, -7584746470839273926L, MethodHandles.lookup().lookupClass()).a(41867638751161L); static { try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  d = !aQ.class.desiredAssertionStatus(); } private int a() { try {  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return this.b ? this.a : aQ.b(this.e); } public Spliterator trySplit() { return a(); }
/*    */   public h6(aQ paramaQ) { this(paramaQ, 0, aQ.b(paramaQ), false); }
/*    */   private h6(aQ paramaQ, int paramInt1, int paramInt2, boolean paramBoolean) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/h6.f : J
/*    */     //   3: ldc2_w 105537340662682
/*    */     //   6: lxor
/*    */     //   7: lstore #5
/*    */     //   9: aload_0
/*    */     //   10: aload_1
/*    */     //   11: putfield e : Lme/konsolas/aac/aQ;
/*    */     //   14: aload_0
/*    */     //   15: invokespecial <init> : ()V
/*    */     //   18: aload_0
/*    */     //   19: iconst_0
/*    */     //   20: putfield b : Z
/*    */     //   23: getstatic me/konsolas/aac/h6.d : Z
/*    */     //   26: ifne -> 125
/*    */     //   29: iload_2
/*    */     //   30: iload_3
/*    */     //   31: if_icmple -> 125
/*    */     //   34: new java/lang/AssertionError
/*    */     //   37: dup
/*    */     //   38: new java/lang/StringBuilder
/*    */     //   41: dup
/*    */     //   42: invokespecial <init> : ()V
/*    */     //   45: ldc '꣬嚳ঙ'
/*    */     //   47: invokevirtual toCharArray : ()[C
/*    */     //   50: dup
/*    */     //   51: dup
/*    */     //   52: iconst_3
/*    */     //   53: dup_x1
/*    */     //   54: caload
/*    */     //   55: sipush #11935
/*    */     //   58: ixor
/*    */     //   59: i2c
/*    */     //   60: castore
/*    */     //   61: sipush #1535
/*    */     //   64: iconst_1
/*    */     //   65: iconst_5
/*    */     //   66: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   69: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   72: iload_2
/*    */     //   73: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   76: ldc '嵀ᆡ﫠ᘦᎌๆ꺎篈鎝믶ᒔ웪ស㩍'
/*    */     //   78: invokevirtual toCharArray : ()[C
/*    */     //   81: dup
/*    */     //   82: dup
/*    */     //   83: iconst_0
/*    */     //   84: dup_x1
/*    */     //   85: caload
/*    */     //   86: sipush #27488
/*    */     //   89: ixor
/*    */     //   90: i2c
/*    */     //   91: castore
/*    */     //   92: sipush #27573
/*    */     //   95: iconst_0
/*    */     //   96: iconst_3
/*    */     //   97: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   100: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   103: iload_3
/*    */     //   104: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   107: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   110: invokespecial <init> : (Ljava/lang/Object;)V
/*    */     //   113: athrow
/*    */     //   114: ldc2_w 2400692281398240241
/*    */     //   117: lload #5
/*    */     //   119: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   124: athrow
/*    */     //   125: aload_0
/*    */     //   126: iload_2
/*    */     //   127: putfield c : I
/*    */     //   130: aload_0
/*    */     //   131: iload_3
/*    */     //   132: putfield a : I
/*    */     //   135: aload_0
/*    */     //   136: iload #4
/*    */     //   138: putfield b : Z
/*    */     //   141: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #26	-> 9
/*    */     //   #18	-> 18
/*    */     //   #12	-> 23
/*    */     //   #16	-> 125
/*    */     //   #5	-> 130
/*    */     //   #21	-> 135
/*    */     //   #15	-> 141
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   29	114	114	java/lang/IllegalArgumentException }
/* 41 */   public Spliterator.OfPrimitive trySplit() { return a(); } public Spliterator.OfInt trySplit() { return a(); } public boolean tryAdvance(Object paramObject) { return tryAdvance((IntConsumer)paramObject); } public fK a() { int i = a(); int j = i - this.c >> 1; try { if (j <= 1)
/* 42 */         return null;  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  this.a = i; int k = this.c + j; int m = k; int n = this.c; this.c = k; this.b = true; return new h6(this.e, n, m, true); } public boolean tryAdvance(IntConsumer paramIntConsumer) { 
/* 43 */     try { if (this.c >= a()) return false;  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/* 44 */      paramIntConsumer.accept(aQ.a(this.e)[this.c++]); return true; } public int characteristics() { return 16721; } public long estimateSize() {
/* 45 */     return (a() - this.c);
/*    */   }
/*    */   
/*    */   private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
/*    */     return paramIllegalArgumentException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\h6.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */