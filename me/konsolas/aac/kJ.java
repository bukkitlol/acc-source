/*  1 */ package me.konsolas.aac;final class kj implements cA { public void forEachRemaining(Object paramObject) { forEachRemaining((IntConsumer)paramObject); } final en a; public boolean hasNext() {
/*  2 */     return this.a.hasNext(); } public kj(en paramen) {
/*  3 */     this.a = paramen;
/*    */   }
/*  5 */   public int nextInt() { return this.a.a(); } @Deprecated
/*  6 */   public Object next() { return next(); }
/*  7 */   public void remove() { this.a.remove(); } public int b(int paramInt) {
/*  8 */     return this.a.a(paramInt);
/*    */   } @Deprecated
/*    */   public Integer next() {
/* 11 */     return Integer.valueOf(this.a.a());
/*    */   } public void forEachRemaining(IntConsumer paramIntConsumer) {
/* 13 */     Objects.requireNonNull(paramIntConsumer);
/*    */     Objects.requireNonNull(paramIntConsumer);
/*    */     this.a.a(paramIntConsumer::accept);
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\kj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */