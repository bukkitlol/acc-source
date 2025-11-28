/*    */ package me.konsolas.aac;
/*    */ 
/*    */ import aacinternal.v;
/*    */ import java.util.concurrent.RecursiveAction;
/*    */ 
/*    */ public class dm extends RecursiveAction {
/*    */   private static final long serialVersionUID = 1L;
/*    */   private final long a;
/*    */   
/*    */   protected void compute() {
/* 11 */     int[][] arrayOfInt = this.b;
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
/*    */     try {
/*    */       if (l1 < 8192L) {
/* 24 */         hr.g(arrayOfInt, this.a, this.c); return;
/*    */       } 
/*    */     } catch (v v) {
/*    */       throw a(null);
/* 28 */     }  long l2 = this.a + l1 / 2L; long l3 = this.a; long l4 = this.c - 1L; long l5 = l1 / 8L; l3 = hr.a(arrayOfInt, l3, l3 + l5, l3 + 2L * l5);
/*    */     l2 = hr.a(arrayOfInt, l2 - l5, l2, l2 + l5);
/*    */     l4 = hr.a(arrayOfInt, l4 - 2L * l5, l4 - l5, l4);
/* 31 */     l2 = hr.a(arrayOfInt, l3, l2, l4);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 37 */     int i = k.a(arrayOfInt, l2);
/*    */     long l6 = this.a, l7 = l6, l8 = this.c - 1L, l9 = l8;
/*    */     while (l7 <= l8) {
/*    */       int j;
/*    */       try {
/*    */         if ((j = Integer.compare(k.a(arrayOfInt, l7), i)) <= 0) {
/*    */           if (j == 0)
/*    */             k.a(arrayOfInt, l6++, l7); 
/*    */           l7++;
/*    */         } 
/*    */       } catch (v v) {
/*    */         throw a(null);
/*    */       } 
/*    */     } 
/*    */     while (l8 >= l7) {
/*    */       int j;
/*    */       try {
/*    */         if ((j = Integer.compare(k.a(arrayOfInt, l8), i)) >= 0) {
/*    */           if (j == 0)
/*    */             k.a(arrayOfInt, l8, l9--); 
/*    */           l8--;
/*    */         } 
/*    */       } catch (v v) {
/*    */         throw a(null);
/*    */       } 
/*    */     } 
/*    */     try {
/*    */       if (l7 > l8) {
/*    */         l5 = Math.min(l6 - this.a, l7 - l6);
/*    */         hr.a(arrayOfInt, this.a, l7 - l5, l5);
/*    */         l5 = Math.min(l9 - l8, this.c - l9 - 1L);
/*    */         hr.a(arrayOfInt, l7, this.c - l5, l5);
/*    */         l5 = l7 - l6;
/*    */         long l = l9 - l8;
/*    */       } 
/*    */     } catch (v v) {
/*    */       throw a(null);
/*    */     } 
/*    */     k.a(arrayOfInt, l7++, l8--);
/*    */   }
/*    */   
/*    */   private final long c;
/*    */   private final int[][] b;
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   }
/*    */   
/*    */   public dm(int[][] paramArrayOfint, long paramLong1, long paramLong2) {
/*    */     this.a = paramLong1;
/*    */     this.c = paramLong2;
/*    */     this.b = paramArrayOfint;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\dm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */