/*    */ package me.konsolas.aac;
/*    */ 
/*    */ import aacinternal.v;
/*    */ import java.util.concurrent.RecursiveAction;
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
/*    */ 
/*    */ 
/*    */ public class f
/*    */   extends RecursiveAction
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   private final long c;
/*    */   private final long b;
/*    */   private final double[][] a;
/*    */   
/*    */   public f(double[][] paramArrayOfdouble, long paramLong1, long paramLong2) {
/* 27 */     this.c = paramLong1;
/*    */     
/* 29 */     this.b = paramLong2;
/*    */     this.a = paramArrayOfdouble;
/*    */   }
/*    */   
/*    */   protected void compute() {
/*    */     double[][] arrayOfDouble = this.a;
/*    */     long l1 = this.b - this.c;
/*    */     
/* 37 */     try { if (l1 < 8192L) { L.g(arrayOfDouble, this.c, this.b); return; }  } catch (v v) { throw a(null); }
/* 38 */      long l2 = this.c + l1 / 2L; long l3 = this.c; long l4 = this.b - 1L;
/*    */     long l5 = l1 / 8L;
/*    */     l3 = L.b(arrayOfDouble, l3, l3 + l5, l3 + 2L * l5);
/*    */     l2 = L.b(arrayOfDouble, l2 - l5, l2, l2 + l5);
/*    */     l4 = L.b(arrayOfDouble, l4 - 2L * l5, l4 - l5, l4);
/*    */     l2 = L.b(arrayOfDouble, l3, l2, l4);
/*    */     double d = k.a(arrayOfDouble, l2);
/*    */     long l6 = this.c, l7 = l6, l8 = this.b - 1L, l9 = l8;
/*    */     while (l7 <= l8) {
/*    */       int i;
/*    */       try {
/*    */         if ((i = Double.compare(k.a(arrayOfDouble, l7), d)) <= 0) {
/*    */           if (i == 0)
/*    */             k.a(arrayOfDouble, l6++, l7); 
/*    */           l7++;
/*    */         } 
/*    */       } catch (v v) {
/*    */         throw a(null);
/*    */       } 
/*    */     } 
/*    */     while (l8 >= l7) {
/*    */       int i;
/*    */       try {
/*    */         if ((i = Double.compare(k.a(arrayOfDouble, l8), d)) >= 0) {
/*    */           if (i == 0)
/*    */             k.a(arrayOfDouble, l8, l9--); 
/*    */           l8--;
/*    */         } 
/*    */       } catch (v v) {
/*    */         throw a(null);
/*    */       } 
/*    */     } 
/*    */     try {
/*    */       if (l7 > l8) {
/*    */         l5 = Math.min(l6 - this.c, l7 - l6);
/*    */         L.b(arrayOfDouble, this.c, l7 - l5, l5);
/*    */       } 
/*    */     } catch (v v) {
/*    */       throw a(null);
/*    */     } 
/*    */     k.a(arrayOfDouble, l7++, l8--);
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */