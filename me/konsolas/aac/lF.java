/*    */ package me.konsolas.aac;
/*    */ 
/*    */ import aacinternal.v;
/*    */ import java.util.concurrent.ForkJoinTask;
/*    */ import java.util.concurrent.RecursiveAction;
/*    */ 
/*    */ public class lf
/*    */   extends RecursiveAction
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   private final long a;
/*    */   private final long b;
/*    */   private final float[][] c;
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   }
/*    */   
/*    */   protected void compute() {
/* 20 */     float[][] arrayOfFloat = this.c;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     long l1 = this.b - this.a;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     try { if (l1 < 8192L)
/* 37 */       { kn.g(arrayOfFloat, this.a, this.b); return; }  } catch (v v) { throw a(null); }
/* 38 */      long l2 = this.a + l1 / 2L;
/*    */     long l3 = this.a;
/*    */     long l4 = this.b - 1L;
/*    */     long l5 = l1 / 8L;
/*    */     l3 = kn.a(arrayOfFloat, l3, l3 + l5, l3 + 2L * l5);
/*    */     l2 = kn.a(arrayOfFloat, l2 - l5, l2, l2 + l5);
/*    */     l4 = kn.a(arrayOfFloat, l4 - 2L * l5, l4 - l5, l4);
/*    */     l2 = kn.a(arrayOfFloat, l3, l2, l4);
/*    */     float f = k.a(arrayOfFloat, l2);
/*    */     long l6 = this.a, l7 = l6, l8 = this.b - 1L, l9 = l8;
/*    */     while (l7 <= l8) {
/*    */       int i;
/*    */       try {
/*    */         if ((i = Float.compare(k.a(arrayOfFloat, l7), f)) <= 0) {
/*    */           if (i == 0)
/*    */             k.b(arrayOfFloat, l6++, l7); 
/*    */           l7++;
/*    */         } 
/*    */       } catch (v v) {
/*    */         throw a(null);
/*    */       } 
/*    */     } 
/*    */     while (l8 >= l7) {
/*    */       int i;
/*    */       try {
/*    */         if ((i = Float.compare(k.a(arrayOfFloat, l8), f)) >= 0) {
/*    */           if (i == 0)
/*    */             k.b(arrayOfFloat, l8, l9--); 
/*    */           l8--;
/*    */         } 
/*    */       } catch (v v) {
/*    */         throw a(null);
/*    */       } 
/*    */     } 
/*    */     try {
/*    */       if (l7 > l8) {
/*    */         l5 = Math.min(l6 - this.a, l7 - l6);
/*    */         kn.a(arrayOfFloat, this.a, l7 - l5, l5);
/*    */         l5 = Math.min(l9 - l8, this.b - l9 - 1L);
/*    */         kn.a(arrayOfFloat, l7, this.b - l5, l5);
/*    */         l5 = l7 - l6;
/*    */         long l = l9 - l8;
/*    */         try {
/*    */           if (l5 > 1L)
/*    */             try {
/*    */               if (l > 1L) {
/*    */                 invokeAll(new lf(arrayOfFloat, this.a, this.a + l5), new lf(arrayOfFloat, this.b - l, this.b));
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
/*    */             invokeAll((ForkJoinTask<?>[])new ForkJoinTask[] { new lf(arrayOfFloat, this.a, this.a + l5) });
/*    */           } else {
/*    */             invokeAll((ForkJoinTask<?>[])new ForkJoinTask[] { new lf(arrayOfFloat, this.b - l, this.b) });
/*    */           } 
/*    */         } catch (v v) {
/*    */           throw a(null);
/*    */         } 
/*    */         return;
/*    */       } 
/*    */     } catch (v v) {
/*    */       throw a(null);
/*    */     } 
/*    */     k.b(arrayOfFloat, l7++, l8--);
/*    */   }
/*    */   
/*    */   public lf(float[][] paramArrayOffloat, long paramLong1, long paramLong2) {
/*    */     this.a = paramLong1;
/*    */     this.b = paramLong2;
/*    */     this.c = paramArrayOffloat;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\lf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */