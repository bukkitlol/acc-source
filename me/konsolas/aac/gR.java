/*  1 */ package me.konsolas.aac;public interface gr extends Iterable { @Deprecated default void forEach(Consumer paramConsumer) { try { Objects.requireNonNull(paramConsumer);
/*    */ 
/*    */ 
/*    */       
/*  5 */       Objects.requireNonNull(paramConsumer); } catch (v v) { throw b(null); }  a((paramConsumer instanceof IntConsumer) ? (IntConsumer)paramConsumer : paramConsumer::accept); }
/*  6 */   default void a(ho paramho) { a(paramho); } default cA a() { return b(); }
/*    */   default fK b() { return hl.a(b(), 0); }
/*    */   default Spliterator spliterator() { return b(); } default fK a() {
/*  9 */     return b();
/*    */   }
/* 11 */   default void a(IntConsumer paramIntConsumer) { Objects.requireNonNull(paramIntConsumer);
/* 12 */     b().forEachRemaining(paramIntConsumer); } default Iterator iterator() {
/* 13 */     return b();
/*    */   }
/*    */   
/*    */   cA b();
/*    */   
/*    */   private static v b(v paramv) {
/*    */     return paramv;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\gr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */