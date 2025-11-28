/*    */ package me.konsolas.aac;
/*    */ public class cj extends RecursiveAction { private static final long serialVersionUID = 1L;
/*    */   private final int a;
/*    */   private final int d;
/*    */   private final short[] b;
/*    */   private final ad c;
/*    */   
/*  8 */   public cj(short[] paramArrayOfshort, int paramInt1, int paramInt2, ad paramad) { this.a = paramInt1;
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
/* 36 */     this.d = paramInt2; this.b = paramArrayOfshort; this.c = paramad; } protected void compute() { short[] arrayOfShort = this.b; int i = this.d - this.a; try { if (i < 8192) { j.g(arrayOfShort, this.a, this.d, this.c); return; }  } catch (v v) { throw a(null); }  int j = this.a + i / 2; int k = this.a; int m = this.d - 1; int n = i / 8; k = j.b(arrayOfShort, k, k + n, k + 2 * n, this.c); j = j.b(arrayOfShort, j - n, j, j + n, this.c); m = j.b(arrayOfShort, m - 2 * n, m - n, m, this.c); j = j.b(arrayOfShort, k, j, m, this.c); short s = arrayOfShort[j]; int i1 = this.a, i2 = i1, i3 = this.d - 1, i4 = i3; while (true) { if (i2 <= i3) { int i6; try { if ((i6 = this.c.a(arrayOfShort[i2], s)) <= 0) { try { if (i6 == 0) j.c(arrayOfShort, i1++, i2);  } catch (v v) { throw a(null); }  i2++; }  } catch (v v) { throw a(null); }  }  continue; while (i3 >= i2) { int i6; try { if ((i6 = this.c.a(arrayOfShort[i3], s)) >= 0) { try { if (i6 == 0) j.c(arrayOfShort, i3, i4--);  } catch (v v) { throw a(null); }  i3--; }  } catch (v v) { throw a(null); }  }  try { if (i2 > i3)
/* 37 */           break;  } catch (v v) { throw a(null); }  j.c(arrayOfShort, i2++, i3--); }  n = Math.min(i1 - this.a, i2 - i1); j.a(arrayOfShort, this.a, i2 - n, n); n = Math.min(i4 - i3, this.d - i4 - 1); j.a(arrayOfShort, i2, this.d - n, n); n = i2 - i1; int i5 = i4 - i3; 
/* 38 */     try { if (n > 1) try { if (i5 > 1) { invokeAll(new cj(arrayOfShort, this.a, this.a + n, this.c), new cj(arrayOfShort, this.d - i5, this.d, this.c)); return; }  } catch (v v) { throw a(null); }   } catch (v v) { throw a(null); }  try { if (n > 1) { invokeAll((ForkJoinTask<?>[])new ForkJoinTask[] { new cj(arrayOfShort, this.a, this.a + n, this.c) }); }
/* 39 */       else { invokeAll((ForkJoinTask<?>[])new ForkJoinTask[] { new cj(arrayOfShort, this.d - i5, this.d, this.c) }); }
/*    */        }
/*    */     catch (v v)
/*    */     { throw a(null); }
/*    */      }
/*    */ 
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\cj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */