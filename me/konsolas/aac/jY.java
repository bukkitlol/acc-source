/*    */ package me.konsolas.aac;class jy implements cA { public void forEachRemaining(IntConsumer paramIntConsumer) { 
/*  2 */     try { Objects.requireNonNull(paramIntConsumer);
/*    */ 
/*    */ 
/*    */       
/*  6 */       Objects.requireNonNull(paramIntConsumer); } catch (v v) { throw a(null); }  this.a.forEachRemaining((paramIntConsumer instanceof Consumer) ? (Consumer)paramIntConsumer : paramIntConsumer::accept); }
/*  7 */   final Iterator a; @Deprecated public void forEachRemaining(Consumer paramConsumer) { this.a.forEachRemaining(paramConsumer); } public int nextInt() { return ((Integer)this.a.next()).intValue(); } public void remove() { this.a.remove(); } public void forEachRemaining(Object paramObject) {
/*    */     forEachRemaining((IntConsumer)paramObject);
/*    */   }
/*    */   public void a(ho paramho) {
/* 11 */     this.a.forEachRemaining(paramho); } public boolean hasNext() {
/* 12 */     return this.a.hasNext();
/*    */   } public jy(Iterator paramIterator) {
/* 14 */     this.a = paramIterator;
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\jy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */