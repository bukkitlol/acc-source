/*    */ package me.konsolas.aac;
/*    */ public class f7 extends RecursiveAction {
/*    */   private static final long serialVersionUID = 1L;
/*    */   private final int b;
/*    */   private final int a;
/*    */   private final boolean[] d;
/*    */   private final boolean[] c;
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   }
/*    */   
/* 13 */   protected void compute() { boolean[] arrayOfBoolean1 = this.d;
/*    */ 
/*    */     
/*    */     boolean[] arrayOfBoolean2 = this.c;
/*    */ 
/*    */     
/*    */     int i = this.a - this.b;
/*    */ 
/*    */ 
/*    */     
/* 23 */     try { if (i < 8192) { iE.d(arrayOfBoolean1, arrayOfBoolean2, this.b, this.a); return; }  }
/*    */     catch (v v) { throw a(null); }
/* 25 */      int j = this.b + i / 2; int k = this.b;
/*    */ 
/*    */     
/* 28 */     int m = this.a - 1;
/*    */ 
/*    */ 
/*    */     
/* 32 */     int n = i / 8; k = iE.b(arrayOfBoolean1, arrayOfBoolean2, k, k + n, k + 2 * n);
/* 33 */     j = iE.b(arrayOfBoolean1, arrayOfBoolean2, j - n, j, j + n); m = iE.b(arrayOfBoolean1, arrayOfBoolean2, m - 2 * n, m - n, m); j = iE.b(arrayOfBoolean1, arrayOfBoolean2, k, j, m); boolean bool1 = arrayOfBoolean1[j], bool2 = arrayOfBoolean2[j]; int i1 = this.b, i2 = i1, i3 = this.a - 1, i4 = i3; while (true) { if (i2 <= i3) { int i6; int i7; try {  }
/*    */         catch (v v) { throw a(null); }
/*    */          try { if ((i6 = ((i7 = Boolean.compare(arrayOfBoolean1[i2], bool1)) == 0) ? Boolean.compare(arrayOfBoolean2[i2], bool2) : i7) <= 0)
/*    */           { 
/* 37 */             try { if (i6 == 0) iE.b(arrayOfBoolean1, arrayOfBoolean2, i1++, i2);  } catch (v v) { throw a(null); }
/* 38 */              i2++; continue; }  } catch (v v) { throw a(null); }  }  while (i3 >= i2) { int i6; int i7; try {  } catch (v v) { throw a(null); }  try { if ((i6 = ((i7 = Boolean.compare(arrayOfBoolean1[i3], bool1)) == 0) ? Boolean.compare(arrayOfBoolean2[i3], bool2) : i7) >= 0) { try { if (i6 == 0) iE.b(arrayOfBoolean1, arrayOfBoolean2, i3, i4--);  } catch (v v) { throw a(null); }  i3--; }  } catch (v v) { throw a(null); }  }  try { if (i2 > i3)
/*    */           break;  } catch (v v) { throw a(null); }  iE.b(arrayOfBoolean1, arrayOfBoolean2, i2++, i3--); }  n = Math.min(i1 - this.b, i2 - i1); iE.b(arrayOfBoolean1, arrayOfBoolean2, this.b, i2 - n, n); n = Math.min(i4 - i3, this.a - i4 - 1); iE.b(arrayOfBoolean1, arrayOfBoolean2, i2, this.a - n, n); n = i2 - i1; int i5 = i4 - i3; try { if (n > 1)
/* 40 */         try { if (i5 > 1) { invokeAll(new f7(arrayOfBoolean1, arrayOfBoolean2, this.b, this.b + n), new f7(arrayOfBoolean1, arrayOfBoolean2, this.a - i5, this.a)); return; }  } catch (v v) { throw a(null); }   } catch (v v) { throw a(null); }  try { if (n > 1) { invokeAll((ForkJoinTask<?>[])new ForkJoinTask[] { new f7(arrayOfBoolean1, arrayOfBoolean2, this.b, this.b + n) }); } else { invokeAll((ForkJoinTask<?>[])new ForkJoinTask[] { new f7(arrayOfBoolean1, arrayOfBoolean2, this.a - i5, this.a) }); }  } catch (v v) { throw a(null); }  } public f7(boolean[] paramArrayOfboolean1, boolean[] paramArrayOfboolean2, int paramInt1, int paramInt2) { this.b = paramInt1; this.a = paramInt2; this.d = paramArrayOfboolean1; this.c = paramArrayOfboolean2; }
/*    */ 
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\f7.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */