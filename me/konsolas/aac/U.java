/*    */ package me.konsolas.aac;class u implements ae { private static final int g = 16448; private static final int e = 5;
/*    */   final ae[] b;
/*    */   int c;
/*    */   int h;
/*    */   
/*    */   public int characteristics() {
/*  7 */     return this.f;
/*    */   }
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
/*    */   public void forEachRemaining(Consumer<? super T> paramConsumer) {
/*    */     try {
/* 25 */       for (; this.h > 0; 
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
/* 42 */         a())
/*    */       {
/*    */ 
/*    */ 
/*    */         
/* 47 */         this.b[this.c].forEachRemaining(paramConsumer);
/*    */       }
/*    */     } catch (IllegalStateException illegalStateException) {
/*    */       throw a(null);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public long a(long paramLong)
/*    */   {
/*    */     long l = 0L;
/*    */     try {
/*    */       if (this.h <= 0) {
/*    */         return 0L;
/*    */       }
/*    */     } catch (IllegalStateException illegalStateException) {
/*    */       throw a(null);
/*    */     } 
/*    */     while (true)
/*    */     { 
/*    */       try { if (l < paramLong && this.h >= 0)
/* 68 */         { long l1 = this.b[this.c].a(paramLong - l); l += l1; }  } catch (IllegalStateException illegalStateException) { throw a(null); }  break; }  return l;
/* 69 */   } public Comparator getComparator() { try { if (this.h == 1) try { if ((this.f & 0x4) != 0) return this.b[this.c].getComparator();  } catch (IllegalStateException illegalStateException) { throw a(null); }   } catch (IllegalStateException illegalStateException) { throw a(null); }  throw new IllegalStateException(); } long d = Long.MAX_VALUE; int f; private long a() { int i = this.h - 1; int j = this.c + 1; long l = 0L; while (i > 0) { long l1 = this.b[j++].estimateSize(); 
/* 70 */       try { i--; if (l1 == Long.MAX_VALUE) return Long.MAX_VALUE;  } catch (IllegalStateException illegalStateException) { throw a(null); }  }  return l; }
/*    */   private static final long a = nc.a(4109461403784419912L, -3577749359077766108L, MethodHandles.lookup().lookupClass()).a(213462521456729L); private void a() { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/u.a : J
/*    */     //   3: ldc2_w 86353879686307
/*    */     //   6: lxor
/*    */     //   7: lstore_1
/*    */     //   8: aload_0
/*    */     //   9: getfield h : I
/*    */     //   12: ifgt -> 58
/*    */     //   15: new java/lang/AssertionError
/*    */     //   18: dup
/*    */     //   19: ldc '썊?潔獃घ蹟蘻ꎾꕘ亰䙂偘彌逦몃훲눼릴㽱궝␍뛾◘퟈㊱䐕偪覻픹矽᫚ϒ귞Ꟁ蓁稔㞥狤敷赱ሶᷝ抾헲譻ᮄ'
/*    */     //   21: invokevirtual toCharArray : ()[C
/*    */     //   24: dup
/*    */     //   25: dup
/*    */     //   26: bipush #16
/*    */     //   28: dup_x1
/*    */     //   29: caload
/*    */     //   30: sipush #26587
/*    */     //   33: ixor
/*    */     //   34: i2c
/*    */     //   35: castore
/*    */     //   36: sipush #25697
/*    */     //   39: iconst_1
/*    */     //   40: iconst_3
/*    */     //   41: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   44: invokespecial <init> : (Ljava/lang/Object;)V
/*    */     //   47: athrow
/*    */     //   48: ldc2_w -1971639442456684997
/*    */     //   51: lload_1
/*    */     //   52: <illegal opcode> w : (Ljava/lang/IllegalStateException;JJ)Ljava/lang/IllegalStateException;
/*    */     //   57: athrow
/*    */     //   58: aload_0
/*    */     //   59: dup
/*    */     //   60: getfield c : I
/*    */     //   63: iconst_1
/*    */     //   64: iadd
/*    */     //   65: putfield c : I
/*    */     //   68: aload_0
/*    */     //   69: dup
/*    */     //   70: getfield h : I
/*    */     //   73: iconst_1
/*    */     //   74: isub
/*    */     //   75: putfield h : I
/*    */     //   78: aload_0
/*    */     //   79: aload_0
/*    */     //   80: invokespecial a : ()J
/*    */     //   83: putfield d : J
/*    */     //   86: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #43	-> 8
/*    */     //   #65	-> 15
/*    */     //   #37	-> 58
/*    */     //   #85	-> 68
/*    */     //   #32	-> 78
/*    */     //   #74	-> 86
/*    */     // Exception table:
/*    */     //   from	to	target	type
/* 71 */     //   8	48	48	java/lang/IllegalStateException } public boolean tryAdvance(Consumer<? super T> paramConsumer) { boolean bool = false; while (true) { try { if (this.h > 0) { if (this.b[this.c].tryAdvance(paramConsumer)) { bool = true; break; }  a();
/*    */ 
/*    */           
/*    */           continue; }
/*    */          }
/*    */       catch (IllegalStateException illegalStateException)
/*    */       { throw a(null); }
/*    */ 
/*    */ 
/*    */       
/*    */       break; }
/*    */ 
/*    */     
/* 84 */     return bool; } public u(ae[] paramArrayOfae, int paramInt1, int paramInt2) { this.f = 0; this.b = paramArrayOfae; this.c = paramInt1; this.h = paramInt2; this.d = a(); this.f = a(); }
/*    */   public Spliterator trySplit() { return a(); }
/* 86 */   private int a() { try { if (this.h <= 0) return 16448;  } catch (IllegalStateException illegalStateException) { throw a(null); }  int i = -1; int j = this.h; int k = this.c; if (j > 1) i &= 0xFFFFFFFA;  for (; j > 0; j--) i &= this.b[k++].characteristics();  return i; } public ae a() { try { ae ae1; switch (this.h) { case 0: return null;case 1: ae1 = this.b[this.c].a(); this.f = this.b[this.c].characteristics(); return ae1;
/* 87 */         case 2: ae1 = this.b[this.c++]; this.h--; this.f = this.b[this.c].characteristics(); this.d = 0L; return ae1; }  } catch (IllegalStateException illegalStateException) { throw a(null); }  int i = this.h >> 1; int j = this.c; int k = this.c + i; int m = i; int n = this.h - i;
/*    */     this.c = k;
/*    */     this.h = n;
/*    */     this.d = a();
/*    */     this.f = a();
/*    */     return new u(this.b, j, m); }
/*    */ 
/*    */   
/*    */   public long estimateSize() {
/*    */     try {
/*    */       if (this.h <= 0)
/*    */         return 0L; 
/*    */     } catch (IllegalStateException illegalStateException) {
/*    */       throw a(null);
/*    */     } 
/*    */     long l = this.b[this.c].estimateSize() + this.d;
/*    */     try {
/*    */       if (l < 0L)
/*    */         return Long.MAX_VALUE; 
/*    */     } catch (IllegalStateException illegalStateException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return l;
/*    */   }
/*    */   
/*    */   private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
/*    */     return paramIllegalStateException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aa\\u.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */