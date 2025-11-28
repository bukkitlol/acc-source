/*    */ package me.konsolas.aac;public class hj extends RecursiveAction { private static final long serialVersionUID = 1L; private final int a; private final int c; private final Object[] d; private final Object[] b; public hj(Object[] paramArrayOfObject1, Object[] paramArrayOfObject2, int paramInt1, int paramInt2) {
/*  2 */     this.a = paramInt1;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 30 */     this.c = paramInt2;
/*    */     this.d = paramArrayOfObject1;
/*    */     this.b = paramArrayOfObject2;
/*    */   }
/*    */   protected void compute() {
/*    */     Object[] arrayOfObject1 = this.d;
/*    */     Object[] arrayOfObject2 = this.b;
/*    */     int i = this.c - this.a;
/*    */     
/* 39 */     try { if (i < 8192) { mK.d(arrayOfObject1, arrayOfObject2, this.a, this.c); return; }  } catch (v v) { throw a(null); }  int j = this.a + i / 2; int k = this.a; int m = this.c - 1; int n = i / 8; k = mK.b(arrayOfObject1, arrayOfObject2, k, k + n, k + 2 * n); j = mK.b(arrayOfObject1, arrayOfObject2, j - n, j, j + n); m = mK.b(arrayOfObject1, arrayOfObject2, m - 2 * n, m - n, m); j = mK.b(arrayOfObject1, arrayOfObject2, k, j, m); Object object1 = arrayOfObject1[j], object2 = arrayOfObject2[j]; int i1 = this.a, i2 = i1, i3 = this.c - 1, i4 = i3; while (true) { if (i2 <= i3) { int i6; int i7; try {  } catch (v v) { throw a(null); }  try { if ((i6 = ((i7 = ((Comparable<Object>)arrayOfObject1[i2]).compareTo(object1)) == 0) ? ((Comparable<Object>)arrayOfObject2[i2]).compareTo(object2) : i7) <= 0) { try { if (i6 == 0) mK.e(arrayOfObject1, arrayOfObject2, i1++, i2);  } catch (v v) { throw a(null); }  i2++; continue; }  } catch (v v) { throw a(null); }  }  while (i3 >= i2) { int i6; int i7; try {  } catch (v v) { throw a(null); }  try { if ((i6 = ((i7 = ((Comparable<Object>)arrayOfObject1[i3]).compareTo(object1)) == 0) ? ((Comparable<Object>)arrayOfObject2[i3]).compareTo(object2) : i7) >= 0) { try { if (i6 == 0) mK.e(arrayOfObject1, arrayOfObject2, i3, i4--);  } catch (v v) { throw a(null); }  i3--; }  } catch (v v) { throw a(null); }  }  try { if (i2 > i3)
/* 40 */           break;  } catch (v v) { throw a(null); }  mK.e(arrayOfObject1, arrayOfObject2, i2++, i3--); }  n = Math.min(i1 - this.a, i2 - i1);
/*    */     mK.a(arrayOfObject1, arrayOfObject2, this.a, i2 - n, n);
/*    */     n = Math.min(i4 - i3, this.c - i4 - 1);
/*    */     mK.a(arrayOfObject1, arrayOfObject2, i2, this.c - n, n);
/*    */     n = i2 - i1;
/*    */     int i5 = i4 - i3;
/*    */     try {
/*    */       if (n > 1)
/*    */         try {
/*    */           if (i5 > 1) {
/*    */             invokeAll(new hj(arrayOfObject1, arrayOfObject2, this.a, this.a + n), new hj(arrayOfObject1, arrayOfObject2, this.c - i5, this.c));
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
/*    */         invokeAll((ForkJoinTask<?>[])new ForkJoinTask[] { new hj(arrayOfObject1, arrayOfObject2, this.a, this.a + n) });
/*    */       } else {
/*    */         invokeAll((ForkJoinTask<?>[])new ForkJoinTask[] { new hj(arrayOfObject1, arrayOfObject2, this.c - i5, this.c) });
/*    */       } 
/*    */     } catch (v v) {
/*    */       throw a(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\hj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */