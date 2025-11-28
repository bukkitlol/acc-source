/*    */ package me.konsolas.aac;class ax implements fK { final Spliterator a; @Deprecated
/*  2 */   public boolean tryAdvance(Consumer paramConsumer) { return this.a.tryAdvance(paramConsumer); }
/*    */   
/*  4 */   public Spliterator trySplit() { return a(); }
/*  5 */   public boolean tryAdvance(Object paramObject) { return tryAdvance((IntConsumer)paramObject); }
/*  6 */   public void forEachRemaining(Object paramObject) { forEachRemaining((IntConsumer)paramObject); }
/*  7 */   public int characteristics() { return this.a.characteristics(); }
/*  8 */   public fK a() { Spliterator spliterator = this.a.trySplit();
/*    */ 
/*    */     
/* 11 */     try { if (spliterator == null) return null;  } catch (v v) { throw b(null); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 19 */     return new ax(spliterator); }
/*    */   public boolean a(ho paramho) { return this.a.tryAdvance(paramho); }
/*    */   public Spliterator.OfPrimitive trySplit() { return a(); }
/*    */   public kx a() { return iO.a(this.a.getComparator()); }
/*    */   public Comparator getComparator() { return a(); }
/* 24 */   public boolean tryAdvance(IntConsumer paramIntConsumer) { try { Objects.requireNonNull(paramIntConsumer); Objects.requireNonNull(paramIntConsumer); } catch (v v) { throw b(null); }  return this.a.tryAdvance((paramIntConsumer instanceof Consumer) ? (Consumer)paramIntConsumer : paramIntConsumer::accept); } public ax(Spliterator paramSpliterator) { this.a = paramSpliterator; }
/* 25 */   public long estimateSize() { return this.a.estimateSize(); } @Deprecated public void forEachRemaining(Consumer paramConsumer) { this.a.forEachRemaining(paramConsumer); } public void a(ho paramho) { this.a.forEachRemaining(paramho); } public Spliterator.OfInt trySplit() { return a(); } public void forEachRemaining(IntConsumer paramIntConsumer) { try {
/* 26 */       Objects.requireNonNull(paramIntConsumer);
/*    */       Objects.requireNonNull(paramIntConsumer);
/*    */     } catch (v v) {
/*    */       throw b(null);
/*    */     } 
/*    */     this.a.forEachRemaining((paramIntConsumer instanceof Consumer) ? (Consumer)paramIntConsumer : paramIntConsumer::accept); }
/*    */ 
/*    */   
/*    */   private static v b(v paramv) {
/*    */     return paramv;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ax.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */