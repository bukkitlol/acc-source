/*  1 */ package me.konsolas.aac;public abstract class bi extends bf { protected bi(int paramInt) { super(paramInt);
/*    */     
/*  3 */     this.b = -1;
/*    */     
/*  5 */     this.c = false; }
/*    */ 
/*    */ 
/*    */   
/*    */   protected int b;
/*    */   
/*    */   private boolean c;
/*    */ 
/*    */   
/*    */   public fK a() {
/*    */     fK fK = super.a();
/*    */     
/* 17 */     try { if (!this.c) try { if (fK != null) { this.b = c(); this.c = true; }  } catch (v v) { throw a(null); }   } catch (v v) { throw a(null); }
/* 18 */      return fK; } public Spliterator.OfInt trySplit() { return a(); }
/*    */ 
/*    */   
/*    */   protected final int a() {
/*    */     try {
/*    */     
/*    */     } catch (v v) {
/*    */       throw a(null);
/*    */     } 
/*    */     return this.c ? this.b : c();
/*    */   }
/*    */   
/*    */   protected bi(int paramInt1, int paramInt2) {
/*    */     super(paramInt1);
/*    */     this.b = -1;
/*    */     this.b = paramInt2;
/*    */     this.c = true;
/*    */   }
/*    */   
/*    */   public Spliterator.OfPrimitive trySplit() {
/*    */     return a();
/*    */   }
/*    */   
/*    */   public Spliterator trySplit() {
/*    */     return a();
/*    */   }
/*    */   
/*    */   protected abstract int c();
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\bi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */