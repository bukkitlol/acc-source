/*    */ package me.konsolas.aac;
/*    */ 
/*    */ import aacinternal.v;
/*    */ import java.util.concurrent.ForkJoinTask;
/*    */ import java.util.concurrent.RecursiveAction;
/*    */ 
/*    */ public class mh extends RecursiveAction {
/*    */   private static final long serialVersionUID = 1L;
/*    */   private final long b;
/*    */   private final long d;
/*    */   private final int[][] a;
/*    */   private final kx c;
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   }
/*    */   
/*    */   protected void compute() {
/* 19 */     int[][] arrayOfInt = this.a;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 27 */     long l1 = this.d - this.b;
/*    */     
/*    */     try {
/*    */       if (l1 < 8192L) {
/*    */         hr.c(arrayOfInt, this.b, this.d, this.c);
/*    */         return;
/*    */       } 
/*    */     } catch (v v) {
/*    */       throw a(null);
/*    */     } 
/*    */     long l2 = this.b + l1 / 2L;
/*    */     long l3 = this.b;
/* 39 */     long l4 = this.d - 1L;
/*    */     long l5 = l1 / 8L;
/*    */     l3 = hr.a(arrayOfInt, l3, l3 + l5, l3 + 2L * l5, this.c);
/*    */     l2 = hr.a(arrayOfInt, l2 - l5, l2, l2 + l5, this.c);
/*    */     l4 = hr.a(arrayOfInt, l4 - 2L * l5, l4 - l5, l4, this.c);
/*    */     l2 = hr.a(arrayOfInt, l3, l2, l4, this.c);
/*    */     int i = k.a(arrayOfInt, l2);
/*    */     long l6 = this.b, l7 = l6, l8 = this.d - 1L, l9 = l8;
/*    */     while (l7 <= l8) {
/*    */       int j;
/*    */       try {
/*    */         if ((j = this.c.a(k.a(arrayOfInt, l7), i)) <= 0) {
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
/*    */         if ((j = this.c.a(k.a(arrayOfInt, l8), i)) >= 0) {
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
/*    */         l5 = Math.min(l6 - this.b, l7 - l6);
/*    */         hr.a(arrayOfInt, this.b, l7 - l5, l5);
/*    */         l5 = Math.min(l9 - l8, this.d - l9 - 1L);
/*    */         hr.a(arrayOfInt, l7, this.d - l5, l5);
/*    */         l5 = l7 - l6;
/*    */         long l = l9 - l8;
/*    */         try {
/*    */           if (l5 > 1L)
/*    */             try {
/*    */               if (l > 1L) {
/*    */                 invokeAll(new mh(arrayOfInt, this.b, this.b + l5, this.c), new mh(arrayOfInt, this.d - l, this.d, this.c));
/*    */                 return;
/*    */               } 
/*    */             } catch (v v) {
/*    */               throw a(null);
/*    */             }  
/*    */         } catch (v v) {
/*    */           throw a(null);
/*    */         } 
/*    */         try {
/*    */           if (l5 > 1L) {
/*    */             invokeAll((ForkJoinTask<?>[])new ForkJoinTask[] { new mh(arrayOfInt, this.b, this.b + l5, this.c) });
/*    */           } else {
/*    */             invokeAll((ForkJoinTask<?>[])new ForkJoinTask[] { new mh(arrayOfInt, this.d - l, this.d, this.c) });
/*    */           } 
/*    */         } catch (v v) {
/*    */           throw a(null);
/*    */         } 
/*    */         return;
/*    */       } 
/*    */     } catch (v v) {
/*    */       throw a(null);
/*    */     } 
/*    */     k.a(arrayOfInt, l7++, l8--);
/*    */   }
/*    */   
/*    */   public mh(int[][] paramArrayOfint, long paramLong1, long paramLong2, kx paramkx) {
/*    */     this.b = paramLong1;
/*    */     this.d = paramLong2;
/*    */     this.a = paramArrayOfint;
/*    */     this.c = paramkx;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\mh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */