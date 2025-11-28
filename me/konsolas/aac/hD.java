/*    */ package me.konsolas.aac;
/*    */ final class hd extends hi { final Y d; public int nextInt() { 
/*  3 */     try { if (!hasNext()) throw new NoSuchElementException();  } catch (NoSuchElementException noSuchElementException) { throw c(null); }  return this.d.g.d[this.d.d + (this.a = this.c++)]; }
/*    */   protected final void e(int paramInt) { this.d.d(paramInt); }
/*    */   public void forEachRemaining(Object paramObject) {
/*    */     forEachRemaining((IntConsumer)paramObject);
/*    */   } protected final void b(int paramInt1, int paramInt2) {
/*    */     this.d.a(paramInt1, paramInt2);
/*  9 */   } hd(Y paramY, int paramInt) { super(0, paramInt); }
/*    */   protected final int c(int paramInt) { return this.d.g.d[this.d.d + paramInt]; } public void forEachRemaining(IntConsumer paramIntConsumer) {
/* 11 */     int i = this.d.c - this.d.d; try { while (this.c < i)
/* 12 */         paramIntConsumer.accept(this.d.g.d[this.d.d + (this.a = this.c++)]);  } catch (NoSuchElementException noSuchElementException) { throw c(null); }  } public int a() { try { if (!hasPrevious()) throw new NoSuchElementException();  } catch (NoSuchElementException noSuchElementException) { throw c(null); }  return this.d.g.d[this.d.d + (this.a = --this.c)]; }
/*    */   
/* 14 */   protected final void a(int paramInt1, int paramInt2) { this.d.a(paramInt1, paramInt2); } protected final int b() {
/* 15 */     return this.d.c - this.d.d;
/*    */   }
/*    */   
/*    */   private static NoSuchElementException c(NoSuchElementException paramNoSuchElementException) {
/*    */     return paramNoSuchElementException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\hd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */