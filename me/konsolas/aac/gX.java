/*  1 */ package me.konsolas.aac;final class gx extends gM implements ae { private static final int g = 0; public Spliterator trySplit() { return (Spliterator)a(); } final ip h; public ae a() {
/*  2 */     return (ae)a(); }
/*  3 */   public boolean tryAdvance(Consumer paramConsumer) { return tryAdvance(paramConsumer); }
/*  4 */   gx(ip paramip) { super(paramip); } final gx a(int paramInt1, int paramInt2, boolean paramBoolean) {
/*  5 */     return new gx(this.h, paramInt1, paramInt2, paramBoolean, true);
/*    */   }
/*  7 */   final void a(Consumer<Object> paramConsumer, int paramInt) { paramConsumer.accept(this.h.q[paramInt]); }
/*  8 */   gM a(int paramInt1, int paramInt2, boolean paramBoolean) { return a(paramInt1, paramInt2, paramBoolean); } void a(Object paramObject, int paramInt) {
/*  9 */     a((Consumer)paramObject, paramInt);
/*    */   }
/*    */   
/* 12 */   public void forEachRemaining(Consumer paramConsumer) { forEachRemaining(paramConsumer); } public int characteristics() { try {  }
/* 13 */     catch (v v) { throw a(null); }  return this.d ? 0 : 64; }
/*    */ 
/*    */   
/*    */   gx(ip paramip, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
/*    */     super(paramip, paramInt1, paramInt2, paramBoolean1, paramBoolean2);
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\gx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */