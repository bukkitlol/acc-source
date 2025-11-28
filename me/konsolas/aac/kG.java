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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class kg
/*    */   extends RecursiveAction
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   private final int b;
/*    */   private final int c;
/*    */   private final Object[] a;
/*    */   
/*    */   public kg(Object[] paramArrayOfObject, int paramInt1, int paramInt2) {
/* 31 */     this.b = paramInt1;
/*    */     this.c = paramInt2;
/*    */     this.a = paramArrayOfObject; } protected void compute() {
/* 34 */     Object[] arrayOfObject = this.a; int i = this.c - this.b; try { if (i < 8192) { mK.a(arrayOfObject, this.b, this.c); return; }  }
/*    */     catch (v v) { throw a(null); }
/* 36 */      int j = this.b + i / 2; int k = this.b; int m = this.c - 1; int n = i / 8; k = mK.b(arrayOfObject, k, k + n, k + 2 * n); j = mK.b(arrayOfObject, j - n, j, j + n); m = mK.b(arrayOfObject, m - 2 * n, m - n, m); j = mK.b(arrayOfObject, k, j, m); Object object = arrayOfObject[j]; int i1 = this.b, i2 = i1, i3 = this.c - 1, i4 = i3; for (;; i2++) { if (i2 <= i3) { int i6; try { if ((i6 = ((Comparable<Object>)arrayOfObject[i2]).compareTo(object)) <= 0) { try { if (i6 == 0) mK.c(arrayOfObject, i1++, i2);  } catch (v v) { throw a(null); }  continue; }  } catch (v v) { throw a(null); }  }  while (i3 >= i2) { int i6; try { if ((i6 = ((Comparable<Object>)arrayOfObject[i3]).compareTo(object)) >= 0) { try { if (i6 == 0) mK.c(arrayOfObject, i3, i4--);  } catch (v v) { throw a(null); }  i3--; }  } catch (v v) { throw a(null); }  }  try { if (i2 > i3)
/* 37 */           break;  } catch (v v) { throw a(null); }  mK.c(arrayOfObject, i2++, i3--); continue; }  n = Math.min(i1 - this.b, i2 - i1); mK.a(arrayOfObject, this.b, i2 - n, n); n = Math.min(i4 - i3, this.c - i4 - 1); mK.a(arrayOfObject, i2, this.c - n, n); n = i2 - i1; int i5 = i4 - i3; try { if (n > 1)
/* 38 */         try { if (i5 > 1) { invokeAll(new kg(arrayOfObject, this.b, this.b + n), new kg(arrayOfObject, this.c - i5, this.c)); return; }  } catch (v v) { throw a(null); }   } catch (v v) { throw a(null); }  try { if (n > 1) { invokeAll((ForkJoinTask<?>[])new ForkJoinTask[] { new kg(arrayOfObject, this.b, this.b + n) }); } else { invokeAll((ForkJoinTask<?>[])new ForkJoinTask[] { new kg(arrayOfObject, this.c - i5, this.c) }); }  } catch (v v) { throw a(null); }
/*    */   
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\kg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */