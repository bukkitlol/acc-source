/*    */ package me.konsolas.aac;
/*    */ public class in extends RecursiveAction { private static final long serialVersionUID = 1L;
/*    */   private final long c;
/*    */   private final long d;
/*    */   private final Object[][] b;
/*    */   private final Comparator a;
/*    */   
/*  8 */   public in(Object[][] paramArrayOfObject, long paramLong1, long paramLong2, Comparator paramComparator) { this.c = paramLong1;
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
/* 36 */     this.d = paramLong2; this.b = paramArrayOfObject; this.a = paramComparator; } protected void compute() { Object[][] arrayOfObject = this.b; long l1 = this.d - this.c;
/*    */     
/* 38 */     try { if (l1 < 8192L) { ie.c(arrayOfObject, this.c, this.d, this.a); return; }  } catch (v v) { throw a(null); }  long l2 = this.c + l1 / 2L; long l3 = this.c; long l4 = this.d - 1L; long l5 = l1 / 8L; l3 = ie.a(arrayOfObject, l3, l3 + l5, l3 + 2L * l5, this.a); l2 = ie.a(arrayOfObject, l2 - l5, l2, l2 + l5, this.a); l4 = ie.a(arrayOfObject, l4 - 2L * l5, l4 - l5, l4, this.a); l2 = ie.a(arrayOfObject, l3, l2, l4, this.a); Object object = k.a(arrayOfObject, l2); long l6 = this.c, l7 = l6, l8 = this.d - 1L, l9 = l8; while (l7 <= l8) { int i; try { if ((i = this.a.compare(k.a(arrayOfObject, l7), object)) <= 0) { if (i == 0) k.c(arrayOfObject, l6++, l7);  l7++; }  } catch (v v) { throw a(null); }  }  while (l8 >= l7) { int i; try { if ((i = this.a.compare(k.a(arrayOfObject, l8), object)) >= 0) { if (i == 0)
/* 39 */             k.c(arrayOfObject, l8, l9--);  l8--; }
/*    */          }
/*    */       catch (v v)
/*    */       { throw a(null); }
/*    */        }
/*    */     
/*    */     try {
/*    */       if (l7 > l8) {
/*    */         l5 = Math.min(l6 - this.c, l7 - l6);
/*    */         ie.a(arrayOfObject, this.c, l7 - l5, l5);
/*    */         l5 = Math.min(l9 - l8, this.d - l9 - 1L);
/*    */         ie.a(arrayOfObject, l7, this.d - l5, l5);
/*    */         l5 = l7 - l6;
/*    */         long l = l9 - l8;
/*    */         try {
/*    */           if (l5 > 1L)
/*    */             try {
/*    */               if (l > 1L) {
/*    */                 invokeAll(new in(arrayOfObject, this.c, this.c + l5, this.a), new in(arrayOfObject, this.d - l, this.d, this.a));
/*    */                 return;
/*    */               } 
/*    */             } catch (v v) {
/*    */               throw a(null);
/*    */             }  
/*    */         } catch (v v) {
/*    */           throw a(null);
/*    */         } 
/*    */         try {
/*    */           if (l5 > 1L) {
/*    */             invokeAll((ForkJoinTask<?>[])new ForkJoinTask[] { new in(arrayOfObject, this.c, this.c + l5, this.a) });
/*    */           } else {
/*    */             invokeAll((ForkJoinTask<?>[])new ForkJoinTask[] { new in(arrayOfObject, this.d - l, this.d, this.a) });
/*    */           } 
/*    */         } catch (v v) {
/*    */           throw a(null);
/*    */         } 
/*    */         return;
/*    */       } 
/*    */     } catch (v v) {
/*    */       throw a(null);
/*    */     } 
/*    */     k.c(arrayOfObject, l7++, l8--); }
/*    */ 
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\in.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */