/*    */ package me.konsolas.aac;
/*    */ 
/*    */ import aacinternal.v;
/*    */ import java.util.concurrent.ForkJoinTask;
/*    */ import java.util.concurrent.RecursiveAction;
/*    */ 
/*    */ public class eu
/*    */   extends RecursiveAction
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   private final int a;
/*    */   private final int b;
/*    */   private final short[] c;
/*    */   
/*    */   public eu(short[] paramArrayOfshort, int paramInt1, int paramInt2) {
/* 16 */     this.a = paramInt1; this.b = paramInt2;
/* 17 */     this.c = paramArrayOfshort;
/*    */   }
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
/*    */   protected void compute() {
/* 32 */     short[] arrayOfShort = this.c; int i = this.b - this.a; try { if (i < 8192) { j.i(arrayOfShort, this.a, this.b); return; }
/*    */        }
/*    */     catch (v v)
/* 35 */     { throw a(null); }
/*    */      int j = this.a + i / 2; int k = this.a; int m = this.b - 1; int n = i / 8; k = j.a(arrayOfShort, k, k + n, k + 2 * n); j = j.a(arrayOfShort, j - n, j, j + n); m = j.a(arrayOfShort, m - 2 * n, m - n, m); j = j.a(arrayOfShort, k, j, m);
/* 37 */     short s = arrayOfShort[j]; int i1 = this.a, i2 = i1, i3 = this.b - 1, i4 = i3; while (true) { if (i2 <= i3) { int i6; try { if ((i6 = Short.compare(arrayOfShort[i2], s)) <= 0) { try { if (i6 == 0) j.c(arrayOfShort, i1++, i2);  } catch (v v) { throw a(null); }  i2++; continue; }  } catch (v v) { throw a(null); }  }  while (i3 >= i2) { int i6; try { if ((i6 = Short.compare(arrayOfShort[i3], s)) >= 0) { try { if (i6 == 0) j.c(arrayOfShort, i3, i4--);  } catch (v v) { throw a(null); }  i3--; }  } catch (v v) { throw a(null); }  }  try { if (i2 > i3)
/* 38 */           break;  } catch (v v) { throw a(null); }  j.c(arrayOfShort, i2++, i3--); }  n = Math.min(i1 - this.a, i2 - i1); j.a(arrayOfShort, this.a, i2 - n, n); n = Math.min(i4 - i3, this.b - i4 - 1); j.a(arrayOfShort, i2, this.b - n, n); n = i2 - i1;
/*    */     int i5 = i4 - i3;
/*    */     try {
/*    */       if (n > 1)
/*    */         try {
/*    */           if (i5 > 1) {
/*    */             invokeAll(new eu(arrayOfShort, this.a, this.a + n), new eu(arrayOfShort, this.b - i5, this.b));
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
/*    */         invokeAll((ForkJoinTask<?>[])new ForkJoinTask[] { new eu(arrayOfShort, this.a, this.a + n) });
/*    */       } else {
/*    */         invokeAll((ForkJoinTask<?>[])new ForkJoinTask[] { new eu(arrayOfShort, this.b - i5, this.b) });
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


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\eu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */