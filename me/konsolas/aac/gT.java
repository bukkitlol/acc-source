/*    */ package me.konsolas.aac;
/*    */ final class gt implements fK { private static final int g = 257; int c; int b; int d; boolean f; boolean a; final a4 e;
/*    */   private static final long h = nc.a(1168287919272075200L, -1104492832138379676L, MethodHandles.lookup().lookupClass()).a(40507730397960L);
/*    */   
/*  5 */   public fK a() { return a(); } public boolean tryAdvance(Object paramObject) {
/*  6 */     return tryAdvance((IntConsumer)paramObject);
/*    */   }
/*    */ 
/*    */   
/*    */   public long a(long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/gt.h : J
/*    */     //   3: ldc2_w 94278707851588
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
/*    */     //   25: ldc '℃㚗蔈⒀小腩㶻俞?饆?䔂醀却뾽쾲쩐럜䑻遒뤅녍즑ᱰ墁䡽嵒ࢎ≵'
/*    */     //   27: invokevirtual toCharArray : ()[C
/*    */     //   30: dup
/*    */     //   31: dup
/*    */     //   32: bipush #25
/*    */     //   34: dup_x1
/*    */     //   35: caload
/*    */     //   36: sipush #545
/*    */     //   39: ixor
/*    */     //   40: i2c
/*    */     //   41: castore
/*    */     //   42: sipush #16129
/*    */     //   45: iconst_1
/*    */     //   46: iconst_0
/*    */     //   47: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   50: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   53: lload_1
/*    */     //   54: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*    */     //   57: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   60: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   63: athrow
/*    */     //   64: ldc2_w 5122519591751921115
/*    */     //   67: lload_3
/*    */     //   68: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   73: athrow
/*    */     //   74: lload_1
/*    */     //   75: lconst_0
/*    */     //   76: lcmp
/*    */     //   77: ifne -> 92
/*    */     //   80: lconst_0
/*    */     //   81: lreturn
/*    */     //   82: ldc2_w 5122519591751921115
/*    */     //   85: lload_3
/*    */     //   86: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   91: athrow
/*    */     //   92: lconst_0
/*    */     //   93: lstore #5
/*    */     //   95: aload_0
/*    */     //   96: getfield f : Z
/*    */     //   99: ifeq -> 117
/*    */     //   102: aload_0
/*    */     //   103: iconst_0
/*    */     //   104: putfield f : Z
/*    */     //   107: lload #5
/*    */     //   109: lconst_1
/*    */     //   110: ladd
/*    */     //   111: lstore #5
/*    */     //   113: lload_1
/*    */     //   114: lconst_1
/*    */     //   115: lsub
/*    */     //   116: lstore_1
/*    */     //   117: aload_0
/*    */     //   118: getfield e : Lme/konsolas/aac/a4;
/*    */     //   121: getfield k : [I
/*    */     //   124: astore #7
/*    */     //   126: aload_0
/*    */     //   127: getfield c : I
/*    */     //   130: aload_0
/*    */     //   131: getfield b : I
/*    */     //   134: if_icmpge -> 199
/*    */     //   137: lload_1
/*    */     //   138: lconst_0
/*    */     //   139: lcmp
/*    */     //   140: ifle -> 199
/*    */     //   143: goto -> 156
/*    */     //   146: ldc2_w 5122519591751921115
/*    */     //   149: lload_3
/*    */     //   150: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   155: athrow
/*    */     //   156: aload #7
/*    */     //   158: aload_0
/*    */     //   159: dup
/*    */     //   160: getfield c : I
/*    */     //   163: dup_x1
/*    */     //   164: iconst_1
/*    */     //   165: iadd
/*    */     //   166: putfield c : I
/*    */     //   169: iaload
/*    */     //   170: ifeq -> 126
/*    */     //   173: goto -> 186
/*    */     //   176: ldc2_w 5122519591751921115
/*    */     //   179: lload_3
/*    */     //   180: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   185: athrow
/*    */     //   186: lload #5
/*    */     //   188: lconst_1
/*    */     //   189: ladd
/*    */     //   190: lstore #5
/*    */     //   192: lload_1
/*    */     //   193: lconst_1
/*    */     //   194: lsub
/*    */     //   195: lstore_1
/*    */     //   196: goto -> 126
/*    */     //   199: lload #5
/*    */     //   201: lreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #17	-> 8
/*    */     //   #3	-> 74
/*    */     //   #66	-> 92
/*    */     //   #64	-> 95
/*    */     //   #26	-> 102
/*    */     //   #11	-> 107
/*    */     //   #46	-> 113
/*    */     //   #52	-> 117
/*    */     //   #39	-> 126
/*    */     //   #25	-> 156
/*    */     //   #1	-> 186
/*    */     //   #2	-> 192
/*    */     //   #44	-> 199
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	64	64	java/lang/IllegalArgumentException
/*    */     //   74	82	82	java/lang/IllegalArgumentException
/*    */     //   126	143	146	java/lang/IllegalArgumentException
/*    */     //   137	173	176	java/lang/IllegalArgumentException
/*    */   }
/*    */ 
/*    */   
/*    */   public int characteristics() {
/*    */     
/*    */     try {  }
/*    */     catch (IllegalArgumentException illegalArgumentException)
/* 19 */     { throw a(null); }  return this.a ? 257 : 321; } public long estimateSize() {
/*    */     
/* 21 */     try { if (!this.a)
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 42 */         return (this.e.q - this.d); }  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/*    */     
/*    */     try {
/*    */     
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return Math.min((this.e.q - this.d), (long)(a4.a(this.e) / this.e.s * (this.b - this.c)) + (this.f ? 1L : 0L));
/*    */   }
/*    */   public Spliterator.OfInt trySplit() {
/*    */     return a();
/*    */   }
/*    */   public Spliterator.OfPrimitive trySplit() {
/*    */     return a();
/*    */   }
/*    */   
/*    */   public void forEachRemaining(Object paramObject) {
/*    */     forEachRemaining((IntConsumer)paramObject);
/*    */   }
/*    */   
/*    */   public boolean tryAdvance(IntConsumer paramIntConsumer) {
/*    */     
/*    */     try { if (this.f) {
/* 65 */         this.f = false; this.d++; paramIntConsumer.accept(this.e.k[this.e.s]); return true;
/*    */       }  }
/*    */     catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/*    */      int[] arrayOfInt = this.e.k; while (true) { try { if (this.c < this.b) { try { if (arrayOfInt[this.c] != 0) { this.d++; paramIntConsumer.accept(arrayOfInt[this.c++]); return true; }
/*    */              }
/*    */           catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/*    */            this.c++; }
/*    */          }
/*    */       catch (IllegalArgumentException illegalArgumentException) { throw a(null); }
/*    */        break; }
/* 75 */      return false;
/*    */   }
/*    */   
/*    */   public void forEachRemaining(IntConsumer paramIntConsumer) {
/*    */     int[] arrayOfInt = this.e.k;
/*    */     try {
/*    */       if (this.f) {
/*    */         this.f = false;
/*    */         paramIntConsumer.accept(arrayOfInt[this.e.s]);
/*    */         this.d++;
/*    */       } 
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw a(null);
/*    */     } 
/*    */     while (true) {
/*    */       try {
/*    */         if (this.c < this.b) {
/*    */           try {
/*    */             if (arrayOfInt[this.c] != 0) {
/*    */               paramIntConsumer.accept(arrayOfInt[this.c]);
/*    */               this.d++;
/*    */             } 
/*    */           } catch (IllegalArgumentException illegalArgumentException) {
/*    */             throw a(null);
/*    */           } 
/*    */           this.c++;
/*    */           continue;
/*    */         } 
/*    */       } catch (IllegalArgumentException illegalArgumentException) {
/*    */         throw a(null);
/*    */       } 
/*    */       break;
/*    */     } 
/*    */   }
/*    */   
/*    */   public Spliterator trySplit() {
/*    */     return a();
/*    */   }
/*    */   
/*    */   gt(a4 parama4) {
/*    */     this.c = 0;
/*    */     this.b = this.e.s;
/*    */     this.d = 0;
/*    */     this.f = this.e.o;
/*    */     this.a = false;
/*    */   }
/*    */   
/*    */   public gt a() {
/*    */     try {
/*    */       if (this.c >= this.b - 1)
/*    */         return null; 
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw a(null);
/*    */     } 
/*    */     int i = this.b - this.c >> 1;
/*    */     try {
/*    */       if (i <= 1)
/*    */         return null; 
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw a(null);
/*    */     } 
/*    */     int j = this.c + i;
/*    */     int k = this.c;
/*    */     int m = j;
/*    */     gt gt1 = new gt(this.e, k, m, this.f, true);
/*    */     this.c = j;
/*    */     this.f = false;
/*    */     this.a = true;
/*    */     return gt1;
/*    */   }
/*    */   
/*    */   gt(a4 parama4, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
/*    */     this.c = 0;
/*    */     this.b = this.e.s;
/*    */     this.d = 0;
/*    */     this.f = this.e.o;
/*    */     this.a = false;
/*    */     this.c = paramInt1;
/*    */     this.b = paramInt2;
/*    */     this.f = paramBoolean1;
/*    */     this.a = paramBoolean2;
/*    */   }
/*    */   
/*    */   private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
/*    */     return paramIllegalArgumentException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\gt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */