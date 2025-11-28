/*  1 */ package me.konsolas.aac;public abstract class ez extends eG { protected ez(int paramInt) { super(paramInt);
/*    */ 
/*    */     
/*  4 */     this.c = -1;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 15 */     this.b = false; }
/*    */ 
/*    */   
/*    */   protected int c;
/*    */   private boolean b;
/*    */   
/*    */   protected ez(int paramInt1, int paramInt2) {
/*    */     super(paramInt1);
/*    */     this.c = -1;
/*    */     this.c = paramInt2;
/*    */     this.b = true;
/*    */   }
/*    */   
/*    */   protected final int b() {
/*    */     try {
/*    */     
/*    */     } catch (v v) {
/*    */       throw b(null);
/*    */     } 
/*    */     return this.b ? this.c : c();
/*    */   }
/*    */   
/*    */   public Spliterator trySplit() {
/*    */     return a();
/*    */   }
/*    */   
/*    */   public ae a() {
/*    */     ae ae = super.a();
/*    */     try {
/*    */       if (!this.b)
/*    */         try {
/*    */           if (ae != null) {
/*    */             this.c = c();
/*    */             this.b = true;
/*    */           } 
/*    */         } catch (v v) {
/*    */           throw b(null);
/*    */         }  
/*    */     } catch (v v) {
/*    */       throw b(null);
/*    */     } 
/*    */     return ae;
/*    */   }
/*    */   
/*    */   protected abstract int c();
/*    */   
/*    */   private static v b(v paramv) {
/*    */     return paramv;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ez.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */