/*  1 */ package me.konsolas.aac;final class al extends aN { public ea b() { return new eY(this); } final i7 b; public int size() {
/*  2 */     return i7.a(this.b);
/*    */   }
/*  4 */   public void forEach(Consumer<Object> paramConsumer) { byte b = 0; int i = i7.a(this.b); try { for (; b < i; b++)
/*    */       {
/*    */ 
/*    */ 
/*    */         
/*  9 */         paramConsumer.accept(i7.a(this.b)[b]); }  } catch (v v) { throw b(null); }  } public void clear() { this.b.clear(); }
/* 10 */   public boolean contains(Object paramObject) { return this.b.containsValue(paramObject); } private al(i7 parami7) {} public Iterator iterator() { return b(); }
/*    */   public ae a() {
/* 12 */     return new e3(this, 0, i7.a(this.b)); }
/* 13 */   public Spliterator spliterator() { return a(); } al(i7 parami7, kI paramkI) {
/* 14 */     this(parami7);
/*    */   }
/*    */   
/*    */   private static v b(v paramv) {
/*    */     return paramv;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\al.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */