/*  1 */ package me.konsolas.aac;final class jo implements fK { public void forEachRemaining(Object paramObject) { forEachRemaining((IntConsumer)paramObject); } final d a; public int characteristics() {
/*  2 */     return this.a.characteristics(); } public fK a() {
/*  3 */     d d1 = this.a.a();
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
/* 19 */     try { if (d1 == null) return null;  } catch (v v) { throw a(null); }
/*    */     
/*    */     return new jo(d1);
/*    */   }
/*    */   
/*    */   public jo(d paramd) {
/*    */     this.a = paramd;
/*    */   }
/*    */   
/*    */   public Spliterator trySplit() {
/*    */     return a();
/*    */   }
/*    */   
/*    */   public void forEachRemaining(IntConsumer paramIntConsumer) {
/*    */     Objects.requireNonNull(paramIntConsumer);
/*    */     Objects.requireNonNull(paramIntConsumer);
/*    */     this.a.forEachRemaining((T_CONS)paramIntConsumer::accept);
/*    */   }
/*    */   
/*    */   public long estimateSize() {
/*    */     return this.a.estimateSize();
/*    */   }
/*    */   
/*    */   public Spliterator.OfPrimitive trySplit() {
/*    */     return a();
/*    */   }
/*    */   
/*    */   public Spliterator.OfInt trySplit() {
/*    */     return a();
/*    */   }
/*    */   
/*    */   public boolean tryAdvance(IntConsumer paramIntConsumer) {
/*    */     Objects.requireNonNull(paramIntConsumer);
/*    */     Objects.requireNonNull(paramIntConsumer);
/*    */     return this.a.tryAdvance((T_CONS)paramIntConsumer::accept);
/*    */   }
/*    */   
/*    */   public boolean tryAdvance(Object paramObject) {
/*    */     return tryAdvance((IntConsumer)paramObject);
/*    */   }
/*    */   
/*    */   public long a(long paramLong) {
/*    */     return this.a.a(paramLong);
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\jo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */