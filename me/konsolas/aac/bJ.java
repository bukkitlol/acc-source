/*    */ package me.konsolas.aac;
/*    */ 
/*    */ import aacinternal.v;
/*    */ import java.util.concurrent.RecursiveAction;
/*    */ 
/*    */ public class bj
/*    */   extends RecursiveAction {
/*    */   private static final long serialVersionUID = 1L;
/*    */   private final long c;
/*    */   
/*    */   public bj(char[][] paramArrayOfchar, long paramLong1, long paramLong2) {
/* 12 */     this.c = paramLong1;
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
/* 25 */     this.b = paramLong2;
/*    */     this.a = paramArrayOfchar;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private final long b;
/*    */   
/*    */   private final char[][] a;
/*    */ 
/*    */   
/*    */   protected void compute() {
/* 37 */     char[][] arrayOfChar = this.a;
/*    */     long l1 = this.b - this.c;
/*    */     try {
/*    */       if (l1 < 8192L) {
/*    */         eE.d(arrayOfChar, this.c, this.b);
/*    */         return;
/*    */       } 
/*    */     } catch (v v) {
/*    */       throw a(null);
/*    */     } 
/*    */     long l2 = this.c + l1 / 2L;
/*    */     long l3 = this.c;
/*    */     long l4 = this.b - 1L;
/*    */     long l5 = l1 / 8L;
/*    */     l3 = eE.b(arrayOfChar, l3, l3 + l5, l3 + 2L * l5);
/*    */     l2 = eE.b(arrayOfChar, l2 - l5, l2, l2 + l5);
/*    */     l4 = eE.b(arrayOfChar, l4 - 2L * l5, l4 - l5, l4);
/*    */     l2 = eE.b(arrayOfChar, l3, l2, l4);
/*    */     char c = k.a(arrayOfChar, l2);
/*    */     long l6 = this.c, l7 = l6, l8 = this.b - 1L, l9 = l8;
/*    */     while (l7 <= l8) {
/*    */       int i;
/*    */       try {
/*    */         if ((i = Character.compare(k.a(arrayOfChar, l7), c)) <= 0) {
/*    */           if (i == 0)
/*    */             k.c(arrayOfChar, l6++, l7); 
/*    */           l7++;
/*    */         } 
/*    */       } catch (v v) {
/*    */         throw a(null);
/*    */       } 
/*    */     } 
/*    */     while (l8 >= l7) {
/*    */       int i;
/*    */       try {
/*    */         if ((i = Character.compare(k.a(arrayOfChar, l8), c)) >= 0) {
/*    */           if (i == 0)
/*    */             k.c(arrayOfChar, l8, l9--); 
/*    */           l8--;
/*    */         } 
/*    */       } catch (v v) {
/*    */         throw a(null);
/*    */       } 
/*    */     } 
/*    */     try {
/*    */       if (l7 > l8) {
/*    */         l5 = Math.min(l6 - this.c, l7 - l6);
/*    */         eE.b(arrayOfChar, this.c, l7 - l5, l5);
/*    */         l5 = Math.min(l9 - l8, this.b - l9 - 1L);
/*    */         eE.b(arrayOfChar, l7, this.b - l5, l5);
/*    */         l5 = l7 - l6;
/*    */         long l = l9 - l8;
/*    */       } 
/*    */     } catch (v v) {
/*    */       throw a(null);
/*    */     } 
/*    */     k.c(arrayOfChar, l7++, l8--);
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\bj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */