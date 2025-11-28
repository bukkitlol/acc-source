/*    */ package me.konsolas.aac;
/*    */ 
/*    */ 
/*    */ public class fl extends RecursiveAction {
/*    */   private static final long serialVersionUID = 1L;
/*    */   private final int d;
/*    */   private final int c;
/*    */   private final int[] a;
/*    */   private final int[] b;
/*    */   
/* 11 */   public fl(int[] paramArrayOfint1, int[] paramArrayOfint2, int paramInt1, int paramInt2) { this.d = paramInt1;
/*    */ 
/*    */     
/* 14 */     this.c = paramInt2;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 35 */     this.b = paramArrayOfint2; this.a = paramArrayOfint1; } protected void compute() { int[] arrayOfInt = this.b; int i = this.c - this.d; try { if (i < 8192) { fG.g(this.a, arrayOfInt, this.d, this.c); return; }
/*    */        }
/*    */     catch (v v)
/*    */     { throw a(null); }
/* 39 */      int j = this.d + i / 2; int k = this.d; int m = this.c - 1; int n = i / 8; k = fG.b(this.a, arrayOfInt, k, k + n, k + 2 * n); j = fG.b(this.a, arrayOfInt, j - n, j, j + n); m = fG.b(this.a, arrayOfInt, m - 2 * n, m - n, m);
/*    */     j = fG.b(this.a, arrayOfInt, k, j, m);
/*    */     int i1 = arrayOfInt[this.a[j]];
/*    */     int i2 = this.d, i3 = i2, i4 = this.c - 1, i5 = i4;
/*    */     for (;; fG.g(this.a, i3++, i4--)) {
/*    */       if (i3 <= i4) {
/*    */         int i7;
/*    */         try {
/*    */           if ((i7 = Integer.compare(arrayOfInt[this.a[i3]], i1)) <= 0) {
/*    */             try {
/*    */               if (i7 == 0)
/*    */                 fG.g(this.a, i2++, i3); 
/*    */             } catch (v v) {
/*    */               throw a(null);
/*    */             } 
/*    */             i3++;
/*    */           } 
/*    */         } catch (v v) {
/*    */           throw a(null);
/*    */         } 
/*    */       } 
/*    */       continue;
/*    */       while (i4 >= i3) {
/*    */         int i7;
/*    */         try {
/*    */           if ((i7 = Integer.compare(arrayOfInt[this.a[i4]], i1)) >= 0) {
/*    */             try {
/*    */               if (i7 == 0)
/*    */                 fG.g(this.a, i4, i5--); 
/*    */             } catch (v v) {
/*    */               throw a(null);
/*    */             } 
/*    */             i4--;
/*    */           } 
/*    */         } catch (v v) {
/*    */           throw a(null);
/*    */         } 
/*    */       } 
/*    */       try {
/*    */         if (i3 > i4)
/*    */           break; 
/*    */       } catch (v v) {
/*    */         throw a(null);
/*    */       } 
/*    */     } 
/*    */     n = Math.min(i2 - this.d, i3 - i2);
/*    */     fG.b(this.a, this.d, i3 - n, n);
/*    */     n = Math.min(i5 - i4, this.c - i5 - 1);
/*    */     fG.b(this.a, i3, this.c - n, n);
/*    */     n = i3 - i2;
/*    */     int i6 = i5 - i4;
/*    */     try {
/*    */       if (n > 1)
/*    */         try {
/*    */           if (i6 > 1) {
/*    */             invokeAll(new fl(this.a, arrayOfInt, this.d, this.d + n), new fl(this.a, arrayOfInt, this.c - i6, this.c));
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
/*    */         invokeAll((ForkJoinTask<?>[])new ForkJoinTask[] { new fl(this.a, arrayOfInt, this.d, this.d + n) });
/*    */       } else {
/*    */         invokeAll((ForkJoinTask<?>[])new ForkJoinTask[] { new fl(this.a, arrayOfInt, this.c - i6, this.c) });
/*    */       } 
/*    */     } catch (v v) {
/*    */       throw a(null);
/*    */     }  }
/*    */ 
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\fl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */