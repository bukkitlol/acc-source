/*  1 */ package me.konsolas.aac;final class e7 extends ez { public boolean tryAdvance(Consumer<Object> paramConsumer) { try { if (this.a >= b()) return false;  } catch (v v) { throw a(null); }
/*    */ 
/*    */     
/*  4 */     paramConsumer.accept(this.d.g.d[this.a++]);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 14 */     return true; } final bw d; protected final Object a(int paramInt) {
/*    */     return this.d.g.d[paramInt];
/*    */   } e7(bw parambw) {
/* 17 */     super(parambw.d);
/*    */   }
/*    */   
/*    */   public void forEachRemaining(Consumer<Object> paramConsumer) {
/*    */     int i = b();
/*    */     try {
/*    */       while (this.a < i)
/*    */         paramConsumer.accept(this.d.g.d[this.a++]); 
/*    */     } catch (v v) {
/*    */       throw a(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   private e7(bw parambw, int paramInt1, int paramInt2) {
/*    */     super(paramInt1, paramInt2);
/*    */   }
/*    */   
/*    */   protected final e7 a(int paramInt1, int paramInt2) {
/*    */     return new e7(this.d, paramInt1, paramInt2);
/*    */   }
/*    */   
/*    */   protected final int c() {
/*    */     return this.d.e;
/*    */   }
/*    */   
/*    */   protected ae a(int paramInt1, int paramInt2) {
/*    */     return a(paramInt1, paramInt2);
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\e7.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */