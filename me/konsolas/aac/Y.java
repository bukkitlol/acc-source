/*    */ package me.konsolas.aac;
/*  2 */ class y implements de { public boolean hasPrevious() { return this.a.hasPrevious(); } final ListIterator a; @Deprecated
/*    */   public void forEachRemaining(Consumer paramConsumer) {
/*  4 */     this.a.forEachRemaining(paramConsumer); } public void forEachRemaining(Object paramObject) {
/*  5 */     forEachRemaining((IntConsumer)paramObject);
/*    */   } public y(ListIterator paramListIterator) {
/*  7 */     this.a = paramListIterator;
/*    */   }
/*  9 */   public int nextIndex() { return this.a.nextIndex(); }
/* 10 */   public boolean hasNext() { return this.a.hasNext(); }
/* 11 */   public void c(int paramInt) { this.a.set(Integer.valueOf(paramInt)); }
/* 12 */   public void d(int paramInt) { this.a.add(Integer.valueOf(paramInt)); }
/* 13 */   public int a() { return ((Integer)this.a.previous()).intValue(); }
/* 14 */   public int previousIndex() { return this.a.previousIndex(); } public void remove() {
/* 15 */     this.a.remove();
/*    */   } public int nextInt() {
/* 17 */     return ((Integer)this.a.next()).intValue();
/*    */   }
/* 19 */   public void a(ho paramho) { this.a.forEachRemaining(paramho); } public void forEachRemaining(IntConsumer paramIntConsumer) { try {
/* 20 */       Objects.requireNonNull(paramIntConsumer);
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


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\y.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */