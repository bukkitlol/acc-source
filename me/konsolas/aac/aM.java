/*    */ package me.konsolas.aac;
/*    */ 
/*    */ import aacinternal.v;
/*    */ import java.util.concurrent.ForkJoinTask;
/*    */ import java.util.concurrent.RecursiveAction;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class am
/*    */   extends RecursiveAction
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   private final int a;
/*    */   private final int c;
/*    */   private final int[] b;
/*    */   private final short[] d;
/*    */   
/*    */   public am(int[] paramArrayOfint, short[] paramArrayOfshort, int paramInt1, int paramInt2) {
/* 23 */     this.a = paramInt1;
/*    */     
/*    */     this.c = paramInt2;
/*    */     
/* 27 */     this.d = paramArrayOfshort;
/*    */     this.b = paramArrayOfint;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void compute() {
/* 35 */     short[] arrayOfShort = this.d; int i = this.c - this.a; try { if (i < 8192) { j.d(this.b, arrayOfShort, this.a, this.c); return; }
/*    */        }
/*    */     catch (v v)
/*    */     { throw a(null); }
/* 39 */      int j = this.a + i / 2; int k = this.a; int m = this.c - 1; int n = i / 8;
/*    */     k = j.b(this.b, arrayOfShort, k, k + n, k + 2 * n);
/*    */     j = j.b(this.b, arrayOfShort, j - n, j, j + n);
/*    */     m = j.b(this.b, arrayOfShort, m - 2 * n, m - n, m);
/*    */     j = j.b(this.b, arrayOfShort, k, j, m);
/*    */     short s = arrayOfShort[this.b[j]];
/*    */     int i1 = this.a, i2 = i1, i3 = this.c - 1, i4 = i3;
/*    */     while (true) {
/*    */       if (i2 <= i3) {
/*    */         int i6;
/*    */         try {
/*    */           if ((i6 = Short.compare(arrayOfShort[this.b[i2]], s)) <= 0) {
/*    */             try {
/*    */               if (i6 == 0)
/*    */                 fG.g(this.b, i1++, i2); 
/*    */             } catch (v v) {
/*    */               throw a(null);
/*    */             } 
/*    */             i2++;
/*    */             continue;
/*    */           } 
/*    */         } catch (v v) {
/*    */           throw a(null);
/*    */         } 
/*    */       } 
/*    */       while (i3 >= i2) {
/*    */         int i6;
/*    */         try {
/*    */           if ((i6 = Short.compare(arrayOfShort[this.b[i3]], s)) >= 0) {
/*    */             try {
/*    */               if (i6 == 0)
/*    */                 fG.g(this.b, i3, i4--); 
/*    */             } catch (v v) {
/*    */               throw a(null);
/*    */             } 
/*    */             i3--;
/*    */           } 
/*    */         } catch (v v) {
/*    */           throw a(null);
/*    */         } 
/*    */       } 
/*    */       try {
/*    */         if (i2 > i3)
/*    */           break; 
/*    */       } catch (v v) {
/*    */         throw a(null);
/*    */       } 
/*    */       fG.g(this.b, i2++, i3--);
/*    */     } 
/*    */     n = Math.min(i1 - this.a, i2 - i1);
/*    */     fG.b(this.b, this.a, i2 - n, n);
/*    */     n = Math.min(i4 - i3, this.c - i4 - 1);
/*    */     fG.b(this.b, i2, this.c - n, n);
/*    */     n = i2 - i1;
/*    */     int i5 = i4 - i3;
/*    */     try {
/*    */       if (n > 1)
/*    */         try {
/*    */           if (i5 > 1) {
/*    */             invokeAll(new am(this.b, arrayOfShort, this.a, this.a + n), new am(this.b, arrayOfShort, this.c - i5, this.c));
/*    */             return;
/*    */           } 
/*    */         } catch (v v) {
/*    */           throw a(null);
/*    */         }  
/*    */     } catch (v v) {
/*    */       throw a(null);
/*    */     } 
/*    */     try {
/*    */       if (n > 1) {
/*    */         invokeAll((ForkJoinTask<?>[])new ForkJoinTask[] { new am(this.b, arrayOfShort, this.a, this.a + n) });
/*    */       } else {
/*    */         invokeAll((ForkJoinTask<?>[])new ForkJoinTask[] { new am(this.b, arrayOfShort, this.c - i5, this.c) });
/*    */       } 
/*    */     } catch (v v) {
/*    */       throw a(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\am.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */