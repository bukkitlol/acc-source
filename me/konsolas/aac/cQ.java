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
/*    */ public class cq
/*    */   extends RecursiveAction
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   private final long a;
/*    */   private final long b;
/*    */   private final short[][] c;
/*    */   
/*    */   public cq(short[][] paramArrayOfshort, long paramLong1, long paramLong2) {
/* 26 */     this.a = paramLong1;
/*    */     this.b = paramLong2;
/*    */     this.c = paramArrayOfshort;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void compute() {
/* 38 */     short[][] arrayOfShort = this.c;
/*    */     long l1 = this.b - this.a;
/*    */     try {
/*    */       if (l1 < 8192L) {
/*    */         ct.d(arrayOfShort, this.a, this.b);
/*    */         return;
/*    */       } 
/*    */     } catch (v v) {
/*    */       throw a(null);
/*    */     } 
/*    */     long l2 = this.a + l1 / 2L;
/*    */     long l3 = this.a;
/*    */     long l4 = this.b - 1L;
/*    */     long l5 = l1 / 8L;
/*    */     l3 = ct.b(arrayOfShort, l3, l3 + l5, l3 + 2L * l5);
/*    */     l2 = ct.b(arrayOfShort, l2 - l5, l2, l2 + l5);
/*    */     l4 = ct.b(arrayOfShort, l4 - 2L * l5, l4 - l5, l4);
/*    */     l2 = ct.b(arrayOfShort, l3, l2, l4);
/*    */     short s = k.a(arrayOfShort, l2);
/*    */     long l6 = this.a, l7 = l6, l8 = this.b - 1L, l9 = l8;
/*    */     while (l7 <= l8) {
/*    */       int i;
/*    */       try {
/*    */         if ((i = Short.compare(k.a(arrayOfShort, l7), s)) <= 0) {
/*    */           if (i == 0)
/*    */             k.c(arrayOfShort, l6++, l7); 
/*    */           l7++;
/*    */         } 
/*    */       } catch (v v) {
/*    */         throw a(null);
/*    */       } 
/*    */     } 
/*    */     while (l8 >= l7) {
/*    */       int i;
/*    */       try {
/*    */         if ((i = Short.compare(k.a(arrayOfShort, l8), s)) >= 0) {
/*    */           if (i == 0)
/*    */             k.c(arrayOfShort, l8, l9--); 
/*    */           l8--;
/*    */         } 
/*    */       } catch (v v) {
/*    */         throw a(null);
/*    */       } 
/*    */     } 
/*    */     try {
/*    */       if (l7 > l8) {
/*    */         l5 = Math.min(l6 - this.a, l7 - l6);
/*    */         ct.b(arrayOfShort, this.a, l7 - l5, l5);
/*    */         l5 = Math.min(l9 - l8, this.b - l9 - 1L);
/*    */         ct.b(arrayOfShort, l7, this.b - l5, l5);
/*    */       } 
/*    */     } catch (v v) {
/*    */       throw a(null);
/*    */     } 
/*    */     k.c(arrayOfShort, l7++, l8--);
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\cq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */