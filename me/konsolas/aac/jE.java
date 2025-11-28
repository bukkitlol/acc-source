/* 1 */ package me.konsolas.aac;class je implements Supplier { static final int c = 8; public Object get() { return a(); }
/*   */   
/*   */   final AtomicInteger a;
/*   */   final int b;
/*   */   final IntFunction d;
/*   */   
/*   */   je(int paramInt, IntFunction paramIntFunction) {
/* 8 */     this.a = new AtomicInteger(0); this.b = paramInt;
/* 9 */     this.d = paramIntFunction;
/*   */   }
/*   */   
/*   */   public n a() {
/*   */     int i = 1 + (this.b - 1) / this.a.incrementAndGet();
/*   */     if (i < 0)
/*   */       i = 8; 
/*   */     return this.d.apply(i);
/*   */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\je.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */