/*    */ package me.konsolas.aac;final class lg implements cA { final gj a;
/*  2 */   public int nextInt() { return this.a.a(); }
/*  3 */   public void forEachRemaining(IntConsumer paramIntConsumer) { Objects.requireNonNull(paramIntConsumer);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*  9 */     Objects.requireNonNull(paramIntConsumer); this.a.a(paramIntConsumer::accept); }
/* 10 */   public void forEachRemaining(Object paramObject) { forEachRemaining((IntConsumer)paramObject); } public lg(gj paramgj) { this.a = paramgj; } @Deprecated public Integer next() { return Integer.valueOf(this.a.a()); }
/* 11 */   @Deprecated public Object next() { return next(); } public int b(int paramInt) { return this.a.a(paramInt); } public void remove() { this.a.remove(); } public boolean hasNext() {
/* 12 */     return this.a.hasNext();
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\lg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */