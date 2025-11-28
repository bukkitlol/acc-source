/*  1 */ package me.konsolas.aac;final class gy extends gM implements ae { private static final int h = 1; public int characteristics() { try {  } catch (v v) { throw a(null); }  return this.d ? 1 : 65; } final ip g; public boolean tryAdvance(Consumer paramConsumer) {
/*  2 */     return tryAdvance(paramConsumer);
/*    */   }
/*  4 */   final gy a(int paramInt1, int paramInt2, boolean paramBoolean) { return new gy(this.g, paramInt1, paramInt2, paramBoolean, true); }
/*  5 */   public ae a() { return (ae)a(); }
/*  6 */   public Spliterator trySplit() { return (Spliterator)a(); }
/*  7 */   gy(ip paramip) { super(paramip); }
/*  8 */   gM a(int paramInt1, int paramInt2, boolean paramBoolean) { return a(paramInt1, paramInt2, paramBoolean); } gy(ip paramip, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
/*    */     super(paramip, paramInt1, paramInt2, paramBoolean1, paramBoolean2);
/*    */   } final void a(Consumer<aI> paramConsumer, int paramInt) {
/* 11 */     paramConsumer.accept(new aI(this.g, paramInt));
/*    */   }
/* 13 */   public void forEachRemaining(Consumer paramConsumer) { forEachRemaining(paramConsumer); } void a(Object paramObject, int paramInt) {
/* 14 */     a((Consumer)paramObject, paramInt);
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\gy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */