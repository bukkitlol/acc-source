/*  1 */ package me.konsolas.aac;class as extends ax { public as(Spliterator paramSpliterator, kx paramkx) { super(paramSpliterator);
/*    */     
/*  3 */     this.b = paramkx; }
/*    */    final kx b; public fK a() {
/*  5 */     Spliterator spliterator = this.a.trySplit();
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 10 */     try { if (spliterator == null) return null;  } catch (v v) { throw a(null); }  return new as(spliterator, this.b); } public Comparator getComparator() { return a(); }
/* 11 */   public Spliterator.OfPrimitive trySplit() { return a(); }
/*    */ 
/*    */   
/*    */   public kx a() {
/*    */     return this.b;
/*    */   }
/*    */   
/*    */   public Spliterator.OfInt trySplit() {
/*    */     return a();
/*    */   }
/*    */   
/*    */   public Spliterator trySplit() {
/*    */     return a();
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\as.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */