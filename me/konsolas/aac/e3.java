/*  1 */ package me.konsolas.aac;final class e3 extends ed implements ae { public void forEachRemaining(Consumer<Object> paramConsumer) { int i = i7.a(this.c.b);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     try {
/* 11 */       while (this.a < i)
/*    */         paramConsumer.accept(i7.a(this.c.b)[this.a++]); 
/*    */     } catch (v v) {
/*    */       throw a(null);
/*    */     }  }
/*    */ 
/*    */   
/*    */   final al c;
/*    */   
/*    */   protected final e3 a(int paramInt1, int paramInt2) {
/*    */     return new e3(this.c, paramInt1, paramInt2);
/*    */   }
/*    */   
/*    */   protected final Object a(int paramInt) {
/*    */     return i7.a(this.c.b)[paramInt];
/*    */   }
/*    */   
/*    */   e3(al paramal, int paramInt1, int paramInt2) {
/*    */     super(paramInt1, paramInt2);
/*    */   }
/*    */   
/*    */   protected ae a(int paramInt1, int paramInt2) {
/*    */     return a(paramInt1, paramInt2);
/*    */   }
/*    */   
/*    */   public int characteristics() {
/*    */     return 16464;
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\e3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */