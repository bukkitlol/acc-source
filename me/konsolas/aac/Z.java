/*    */ package me.konsolas.aac;
/*    */ import java.util.NoSuchElementException;
/*    */ final class z implements cA { int a = this.e.q; boolean c = this.e.o; public boolean hasNext() { try {  } catch (NoSuchElementException noSuchElementException) { throw a(null); }  return (this.a != 0); } int f = -1; public void remove() { try { if (this.f == -1)
/*    */         throw new IllegalStateException();  } catch (NoSuchElementException noSuchElementException) { throw a(null); }  try { if (this.f == this.e.s) { this.e.o = false; this.e.k[this.e.s] = 0; } else { try { if (this.b >= 0) { a(this.f); } else { this.e.d(this.d.b(-this.b - 1)); this.f = -1; return; }
/*    */            }
/*    */         catch (NoSuchElementException noSuchElementException) { throw a(null); }
/*    */          }
/*    */        }
/*    */     catch (NoSuchElementException noSuchElementException) { throw a(null); }
/* 10 */      this.e.q--; this.f = -1; } int b = this.e.s; public int nextInt() { try { if (!hasNext()) throw new NoSuchElementException();  } catch (NoSuchElementException noSuchElementException) { throw a(null); }
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     try {
/* 47 */       this.a--; if (this.c) {
/*    */         this.c = false; this.f = this.e.s; return this.e.k[this.e.s];
/*    */       } 
/*    */     } catch (NoSuchElementException noSuchElementException) {
/*    */       throw a(null);
/*    */     }  int[] arrayOfInt = this.e.k; while (true)
/*    */     { if (--this.b < 0)
/* 54 */       { this.f = Integer.MIN_VALUE; return this.d.b(-this.b - 1); }  if (arrayOfInt[this.b] != 0)
/* 55 */         return arrayOfInt[this.f = this.b];  }  } Z d; final a4 e; public void forEachRemaining(IntConsumer paramIntConsumer) { int[] arrayOfInt = this.e.k; try { if (this.c) { this.c = false;
/* 56 */         this.f = this.e.s; paramIntConsumer.accept(arrayOfInt[this.e.s]); this.a--; }  } catch (NoSuchElementException noSuchElementException) { throw a(null); }  while (true) { try { if (this.a != 0) { try { if (--this.b < 0) { this.f = Integer.MIN_VALUE; paramIntConsumer.accept(this.d.b(-this.b - 1)); this.a--; continue; }  } catch (NoSuchElementException noSuchElementException) { throw a(null); }  if (arrayOfInt[this.b] != 0) { paramIntConsumer.accept(arrayOfInt[this.f = this.b]); this.a--; }  continue; }  } catch (NoSuchElementException noSuchElementException) { throw a(null); }  break; }  } public void forEachRemaining(Object paramObject) { forEachRemaining((IntConsumer)paramObject); } z(a4 parama4, gn paramgn) { this(parama4); }
/* 57 */   private final void a(int paramInt) { int[] arrayOfInt = this.e.k;
/*    */     for (;; arrayOfInt[i] = j) {
/*    */       int j, i;
/*    */       paramInt = (i = paramInt) + 1 & this.e.m;
/*    */       while (true) {
/*    */         try {
/*    */           if ((j = arrayOfInt[paramInt]) == 0) {
/*    */             arrayOfInt[i] = 0;
/*    */             return;
/*    */           } 
/*    */         } catch (NoSuchElementException noSuchElementException) {
/*    */           throw a(null);
/*    */         } 
/*    */         int k = i3.c(j) & this.e.m;
/*    */         try {
/*    */           if (i <= paramInt) {
/*    */             try {
/*    */               if (i < k) {
/*    */                 try {
/*    */                   if (k > paramInt)
/*    */                     break; 
/*    */                 } catch (NoSuchElementException noSuchElementException) {
/*    */                   throw a(null);
/*    */                 } 
/*    */               } else {
/*    */                 break;
/*    */               } 
/*    */             } catch (NoSuchElementException noSuchElementException) {
/*    */               throw a(null);
/*    */             } 
/*    */           } else {
/*    */             try {
/*    */               if (i >= k)
/*    */                 try {
/*    */                   if (k > paramInt)
/*    */                     break; 
/*    */                 } catch (NoSuchElementException noSuchElementException) {
/*    */                   throw a(null);
/*    */                 }  
/*    */             } catch (NoSuchElementException noSuchElementException) {
/*    */               throw a(null);
/*    */             } 
/*    */           } 
/*    */         } catch (NoSuchElementException noSuchElementException) {
/*    */           throw a(null);
/*    */         } 
/*    */         paramInt = paramInt + 1 & this.e.m;
/*    */       } 
/*    */       try {
/*    */         if (paramInt < i) {
/*    */           try {
/*    */             if (this.d == null)
/*    */               this.d = new Z(2); 
/*    */           } catch (NoSuchElementException noSuchElementException) {
/*    */             throw a(null);
/*    */           } 
/*    */           this.d.a(arrayOfInt[paramInt]);
/*    */         } 
/*    */       } catch (NoSuchElementException noSuchElementException) {
/*    */         throw a(null);
/*    */       } 
/*    */     }  }
/*    */ 
/*    */   
/*    */   private z(a4 parama4) {}
/*    */   
/*    */   private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
/*    */     return paramNoSuchElementException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\z.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */