/*    */ package me.konsolas.aac;
/*    */ class lw implements fK { private static final int b = 16448; private static final int c = 5; final fK[] g; int e; int f; long a; int d; private static final long h = nc.a(-7827161153158876418L, 1901161839182454720L, MethodHandles.lookup().lookupClass()).a(55919786478177L); private int a() { try {
/*    */       if (this.f <= 0)
/*    */         return 16448; 
/*    */     } catch (IllegalStateException illegalStateException) {
/*    */       throw a(null);
/*    */     }  int i = -1; int j = this.f; int k = this.e; if (j > 1)
/*    */       i &= 0xFFFFFFFA;  for (; j > 0; j--)
/*  9 */       i &= this.g[k++].characteristics();  return i; } public long a(long paramLong) { long l = 0L;
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
/*    */     try {
/*    */       if (this.f <= 0) {
/*    */         return 0L;
/*    */       }
/*    */     } catch (IllegalStateException illegalStateException) {
/*    */       throw a(null);
/*    */     } 
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
/*    */     while (true) {
/*    */       
/* 57 */       try { if (l < paramLong && this.f >= 0)
/*    */         { long l1 = this.g[this.e].a(paramLong - l);
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
/* 77 */           l += l1;
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
/* 92 */           try { if (l < paramLong) a();  } catch (IllegalStateException illegalStateException) { throw a(null); }  continue; }  } catch (IllegalStateException illegalStateException) { throw a(null); }
/*    */        break;
/*    */     }  return l; }
/*    */   private void a() { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/lw.h : J
/*    */     //   3: ldc2_w 105400613253107
/*    */     //   6: lxor
/*    */     //   7: lstore_1
/*    */     //   8: aload_0
/*    */     //   9: getfield f : I
/*    */     //   12: ifgt -> 58
/*    */     //   15: new java/lang/AssertionError
/*    */     //   18: dup
/*    */     //   19: ldc '痾?࣭⑞䀍嬽俛⩖ᴩ〜臗䚄挆෪偕㝨⑁ꌀﴇ澝梡竻셈傉듲Ā扺籛廀탍됉͘꫇鮅㸯㼌텢㕬Ⲕ避坨꽼銋䤣⡼'
/*    */     //   21: invokevirtual toCharArray : ()[C
/*    */     //   24: dup
/*    */     //   25: dup
/*    */     //   26: bipush #31
/*    */     //   28: dup_x1
/*    */     //   29: caload
/*    */     //   30: sipush #16749
/*    */     //   33: ixor
/*    */     //   34: i2c
/*    */     //   35: castore
/*    */     //   36: sipush #9060
/*    */     //   39: iconst_0
/*    */     //   40: iconst_5
/*    */     //   41: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   44: invokespecial <init> : (Ljava/lang/Object;)V
/*    */     //   47: athrow
/*    */     //   48: ldc2_w 8394921620196216261
/*    */     //   51: lload_1
/*    */     //   52: <illegal opcode> w : (Ljava/lang/IllegalStateException;JJ)Ljava/lang/IllegalStateException;
/*    */     //   57: athrow
/*    */     //   58: aload_0
/*    */     //   59: dup
/*    */     //   60: getfield e : I
/*    */     //   63: iconst_1
/*    */     //   64: iadd
/*    */     //   65: putfield e : I
/*    */     //   68: aload_0
/*    */     //   69: dup
/*    */     //   70: getfield f : I
/*    */     //   73: iconst_1
/*    */     //   74: isub
/*    */     //   75: putfield f : I
/*    */     //   78: aload_0
/*    */     //   79: aload_0
/*    */     //   80: invokespecial a : ()J
/*    */     //   83: putfield a : J
/*    */     //   86: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #17	-> 8
/*    */     //   #94	-> 15
/*    */     //   #35	-> 58
/*    */     //   #29	-> 68
/*    */     //   #4	-> 78
/*    */     //   #82	-> 86
/*    */     // Exception table:
/*    */     //   from	to	target	type
/* 95 */     //   8	48	48	java/lang/IllegalStateException } public boolean tryAdvance(IntConsumer paramIntConsumer) { boolean bool = false; while (true) { try { if (this.f > 0) { if (this.g[this.e].tryAdvance(paramIntConsumer)) { bool = true; break; }  a(); }  } catch (IllegalStateException illegalStateException) { throw a(null); }  break; }  return bool; } public lw(fK[] paramArrayOffK, int paramInt1, int paramInt2) { this.a = Long.MAX_VALUE; this.d = 0; this.g = paramArrayOffK; this.e = paramInt1; this.f = paramInt2; this.a = a(); this.d = a(); }
/* 96 */   public kx a() { try { if (this.f == 1) try { if ((this.d & 0x4) != 0) return this.g[this.e].a();  } catch (IllegalStateException illegalStateException) { throw a(null); }   } catch (IllegalStateException illegalStateException) { throw a(null); }
/*    */     
/*    */     throw new IllegalStateException(); }
/*    */ 
/*    */   
/*    */   public Spliterator trySplit() {
/*    */     return a();
/*    */   }
/*    */   
/*    */   public long estimateSize() {
/*    */     try {
/*    */       if (this.f <= 0)
/*    */         return 0L; 
/*    */     } catch (IllegalStateException illegalStateException) {
/*    */       throw a(null);
/*    */     } 
/*    */     long l = this.g[this.e].estimateSize() + this.a;
/*    */     try {
/*    */       if (l < 0L)
/*    */         return Long.MAX_VALUE; 
/*    */     } catch (IllegalStateException illegalStateException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return l;
/*    */   }
/*    */   
/*    */   public void forEachRemaining(Object paramObject) {
/*    */     forEachRemaining((IntConsumer)paramObject);
/*    */   }
/*    */   
/*    */   public Spliterator.OfInt trySplit() {
/*    */     return a();
/*    */   }
/*    */   
/*    */   public fK a() {
/*    */     try {
/*    */       fK fK1;
/*    */       switch (this.f) {
/*    */         case 0:
/*    */           return null;
/*    */         case 1:
/*    */           fK1 = this.g[this.e].a();
/*    */           this.d = this.g[this.e].characteristics();
/*    */           return fK1;
/*    */         case 2:
/*    */           fK1 = this.g[this.e++];
/*    */           this.f--;
/*    */           this.d = this.g[this.e].characteristics();
/*    */           this.a = 0L;
/*    */           return fK1;
/*    */       } 
/*    */     } catch (IllegalStateException illegalStateException) {
/*    */       throw a(null);
/*    */     } 
/*    */     int i = this.f >> 1;
/*    */     int j = this.e;
/*    */     int k = this.e + i;
/*    */     int m = i;
/*    */     int n = this.f - i;
/*    */     this.e = k;
/*    */     this.f = n;
/*    */     this.a = a();
/*    */     this.d = a();
/*    */     return new lw(this.g, j, m);
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   public void forEachRemaining(Consumer paramConsumer) {
/*    */     try {
/*    */       while (this.f > 0) {
/*    */         this.g[this.e].forEachRemaining(paramConsumer);
/*    */         a();
/*    */       } 
/*    */     } catch (IllegalStateException illegalStateException) {
/*    */       throw a(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   public Comparator getComparator() {
/*    */     return a();
/*    */   }
/*    */   
/*    */   public Spliterator.OfPrimitive trySplit() {
/*    */     return a();
/*    */   }
/*    */   
/*    */   private long a() {
/*    */     int i = this.f - 1;
/*    */     int j = this.e + 1;
/*    */     long l = 0L;
/*    */     while (i > 0) {
/*    */       long l1 = this.g[j++].estimateSize();
/*    */       try {
/*    */         i--;
/*    */         if (l1 == Long.MAX_VALUE)
/*    */           return Long.MAX_VALUE; 
/*    */       } catch (IllegalStateException illegalStateException) {
/*    */         throw a(null);
/*    */       } 
/*    */       l += l1;
/*    */     } 
/*    */     return l;
/*    */   }
/*    */   
/*    */   public boolean tryAdvance(Object paramObject) {
/*    */     return tryAdvance((IntConsumer)paramObject);
/*    */   }
/*    */   
/*    */   public void forEachRemaining(IntConsumer paramIntConsumer) {
/*    */     try {
/*    */       while (this.f > 0) {
/*    */         this.g[this.e].forEachRemaining(paramIntConsumer);
/*    */         a();
/*    */       } 
/*    */     } catch (IllegalStateException illegalStateException) {
/*    */       throw a(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   public int characteristics() {
/*    */     return this.d;
/*    */   }
/*    */   
/*    */   private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
/*    */     return paramIllegalStateException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\lw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */