/*    */ package me.konsolas.aac;final class a5 extends aw { final ip b; public Iterator iterator() {
/*  2 */     return b();
/*    */   }
/*  4 */   public boolean d(int paramInt) { int i = this.b.r;
/*    */ 
/*    */     
/*    */     try { this.b.b(paramInt); }
/*    */     catch (v v)
/*  9 */     { throw a(null); }  return (this.b.r != i); } public void a(IntConsumer paramIntConsumer) { try {
/*    */       if (this.b.k)
/*    */         paramIntConsumer.accept(this.b.t[this.b.o]); 
/*    */     } catch (v v) {
/*    */       throw a(null);
/* 14 */     }  for (int i = this.b.o; i-- != 0; ) { int j = this.b.t[i]; 
/* 15 */       try { if (j != 0) paramIntConsumer.accept(j);  } catch (v v) { throw a(null); }  }  }
/* 16 */   public boolean c(int paramInt) { return this.b.g(paramInt); } a5(ip paramip, bu parambu) { this(paramip); } public cA b() { return new dk(this.b); }
/* 17 */   public Spliterator spliterator() { return b(); } private a5(ip paramip) {} public fK b() { return new gE(this.b); } public void clear() { this.b.clear(); } public int size() {
/* 18 */     return this.b.r;
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\a5.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */