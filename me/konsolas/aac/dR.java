/*    */ package me.konsolas.aac;
/*    */ 
/*    */ public class dr extends RecursiveAction {
/*    */   protected void compute() {
/*  5 */     long[][] arrayOfLong = this.b;
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
/*    */     long l1 = this.c - this.a;
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
/*    */     
/* 28 */     try { if (l1 < 8192L) { l0.g(arrayOfLong, this.a, this.c); return; }
/*    */        }
/*    */     catch (v v) { throw a(null); }
/* 31 */      long l2 = this.a + l1 / 2L; long l3 = this.a;
/*    */ 
/*    */     
/*    */     long l4 = this.c - 1L;
/*    */     
/*    */     long l5 = l1 / 8L;
/*    */     
/* 38 */     l3 = l0.a(arrayOfLong, l3, l3 + l5, l3 + 2L * l5);
/*    */     l2 = l0.a(arrayOfLong, l2 - l5, l2, l2 + l5);
/*    */     l4 = l0.a(arrayOfLong, l4 - 2L * l5, l4 - l5, l4);
/*    */     l2 = l0.a(arrayOfLong, l3, l2, l4);
/*    */     long l6 = k.a(arrayOfLong, l2);
/*    */     long l7 = this.a, l8 = l7, l9 = this.c - 1L, l10 = l9;
/*    */     while (l8 <= l9) {
/*    */       int i;
/*    */       try {
/*    */         if ((i = Long.compare(k.a(arrayOfLong, l8), l6)) <= 0) {
/*    */           if (i == 0)
/*    */             k.e(arrayOfLong, l7++, l8); 
/*    */           l8++;
/*    */         } 
/*    */       } catch (v v) {
/*    */         throw a(null);
/*    */       } 
/*    */     } 
/*    */     while (l9 >= l8) {
/*    */       int i;
/*    */       try {
/*    */         if ((i = Long.compare(k.a(arrayOfLong, l9), l6)) >= 0) {
/*    */           if (i == 0)
/*    */             k.e(arrayOfLong, l9, l10--); 
/*    */           l9--;
/*    */         } 
/*    */       } catch (v v) {
/*    */         throw a(null);
/*    */       } 
/*    */     } 
/*    */     try {
/*    */       if (l8 > l9) {
/*    */         l5 = Math.min(l7 - this.a, l8 - l7);
/*    */         l0.a(arrayOfLong, this.a, l8 - l5, l5);
/*    */       } 
/*    */     } catch (v v) {
/*    */       throw a(null);
/*    */     } 
/*    */     k.e(arrayOfLong, l8++, l9--);
/*    */   }
/*    */   
/*    */   private static final long serialVersionUID = 1L;
/*    */   private final long a;
/*    */   private final long c;
/*    */   private final long[][] b;
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   }
/*    */   
/*    */   public dr(long[][] paramArrayOflong, long paramLong1, long paramLong2) {
/*    */     this.a = paramLong1;
/*    */     this.c = paramLong2;
/*    */     this.b = paramArrayOflong;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\dr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */