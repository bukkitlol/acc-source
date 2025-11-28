/*    */ package me.konsolas.aac;
/*    */ 
/*    */ import java.util.NoSuchElementException;
/*    */ import java.util.function.Consumer;
/*    */ 
/*    */ 
/*    */ final class d6
/*    */   implements ea
/*    */ {
/*    */   d6(bM parambM, fV paramfV) {
/* 11 */     this(parambM);
/*    */   } public Object next() { 
/* 13 */     try { if (!hasNext()) throw new NoSuchElementException();  } catch (NoSuchElementException noSuchElementException) { throw a(null); }
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
/* 36 */     try { this.d--;
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
/* 50 */       if (this.c) { this.c = false; this.f = this.b.q; return this.b.n[this.b.q]; }  } catch (NoSuchElementException noSuchElementException) { throw a(null); }
/*    */      Object[] arrayOfObject = this.b.n; while (true) { if (--this.a < 0) { this.f = Integer.MIN_VALUE; return this.e.get(-this.a - 1); }
/*    */        if (arrayOfObject[this.a] != null)
/*    */         return arrayOfObject[this.f = this.a];  }
/* 54 */      } public void forEachRemaining(Consumer<Object> paramConsumer) { Object[] arrayOfObject = this.b.n; try { if (this.c) { this.c = false; this.f = this.b.q; paramConsumer.accept(arrayOfObject[this.b.q]); this.d--; }  } catch (NoSuchElementException noSuchElementException) { throw a(null); }  while (true) { try { if (this.d != 0) { try { if (--this.a < 0) { this.f = Integer.MIN_VALUE; paramConsumer.accept(this.e.get(-this.a - 1)); this.d--; continue; }  } catch (NoSuchElementException noSuchElementException) { throw a(null); }  if (arrayOfObject[this.a] != null) { paramConsumer.accept(arrayOfObject[this.f = this.a]); this.d--; }  }  } catch (NoSuchElementException noSuchElementException) { throw a(null); }  break; }  } private final void a(int paramInt) { Object[] arrayOfObject = this.b.n; while (true) { Object object; int i; paramInt = (i = paramInt) + 1 & this.b.l; for (;; paramInt = paramInt + 1 & this.b.l) { try { if ((object = arrayOfObject[paramInt]) == null) { arrayOfObject[i] = null; return; }  } catch (NoSuchElementException noSuchElementException) { throw a(null); }  int j = i3.c(object.hashCode()) & this.b.l; try { if (i <= paramInt) { try { if (i < j) { try { if (j > paramInt) break;  } catch (NoSuchElementException noSuchElementException) { throw a(null); }  } else { break; }  } catch (NoSuchElementException noSuchElementException) { throw a(null); }  } else { try { if (i >= j) try { if (j > paramInt)
/*    */                     break;  } catch (NoSuchElementException noSuchElementException) { throw a(null); }   } catch (NoSuchElementException noSuchElementException) { throw a(null); }  }  } catch (NoSuchElementException noSuchElementException) { throw a(null); }  }  try { if (paramInt < i) { try { if (this.e == null)
/* 56 */               this.e = new b2(2);  } catch (NoSuchElementException noSuchElementException) { throw a(null); }  this.e.add(arrayOfObject[paramInt]); }
/*    */          }
/*    */       catch (NoSuchElementException noSuchElementException)
/*    */       { throw a(null); }
/*    */       
/*    */       arrayOfObject[i] = object; }
/*    */      }
/*    */ 
/*    */   
/*    */   int f = -1;
/*    */   int d = this.b.m;
/*    */   int a = this.b.q;
/*    */   boolean c;
/*    */   b2 e;
/*    */   final bM b;
/*    */   
/*    */   private d6(bM parambM) {
/*    */     this.c = this.b.t;
/*    */   }
/*    */   
/*    */   public void remove() {
/*    */     try {
/*    */       if (this.f == -1)
/*    */         throw new IllegalStateException(); 
/*    */     } catch (NoSuchElementException noSuchElementException) {
/*    */       throw a(null);
/*    */     } 
/*    */     try {
/*    */       if (this.f == this.b.q) {
/*    */         this.b.t = false;
/*    */         this.b.n[this.b.q] = null;
/*    */       } else {
/*    */         try {
/*    */           if (this.a >= 0) {
/*    */             a(this.f);
/*    */           } else {
/*    */             this.b.remove(this.e.set(-this.a - 1, null));
/*    */             this.f = -1;
/*    */             return;
/*    */           } 
/*    */         } catch (NoSuchElementException noSuchElementException) {
/*    */           throw a(null);
/*    */         } 
/*    */       } 
/*    */     } catch (NoSuchElementException noSuchElementException) {
/*    */       throw a(null);
/*    */     } 
/*    */     this.b.m--;
/*    */     this.f = -1;
/*    */   }
/*    */   
/*    */   public boolean hasNext() {
/*    */     try {
/*    */     
/*    */     } catch (NoSuchElementException noSuchElementException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return (this.d != 0);
/*    */   }
/*    */   
/*    */   private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
/*    */     return paramNoSuchElementException;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\d6.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */