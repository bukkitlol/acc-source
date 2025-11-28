/*   */ package me.konsolas.aac;class ga implements Supplier {
/* 2 */   final AtomicInteger a = new AtomicInteger(0); static final int c = 8; final int b; final IntFunction d;
/*   */   
/*   */   public jM a() {
/* 5 */     int i = 1 + (this.b - 1) / this.a.incrementAndGet();
/*   */     
/* 7 */     if (i < 0)
/* 8 */       i = 8;  return this.d.apply(i); } ga(int paramInt, IntFunction paramIntFunction) { this.b = paramInt;
/* 9 */     this.d = paramIntFunction; } public Object get() { return a(); }
/*   */ 
/*   */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ga.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */