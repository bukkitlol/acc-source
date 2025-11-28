/*  1 */ package me.konsolas.aac;@FunctionalInterface public interface j4 extends Consumer, IntConsumer { @Deprecated default Consumer andThen(Consumer<?> paramConsumer) { return super.andThen(paramConsumer); }
/*  2 */   default j4 a(j4 paramj4) { Objects.requireNonNull(paramj4);
/*  3 */     return paramShort -> { a(paramShort); paramj4.a(paramShort);
/*  4 */       }; } @Deprecated default void accept(int paramInt) { a(j6.a(paramInt)); } @Deprecated
/*  5 */   default void accept(Object paramObject) { a((Short)paramObject); } default IntConsumer andThen(IntConsumer paramIntConsumer) {
/*  6 */     return a(paramIntConsumer);
/*    */   }
/*    */   @Deprecated
/*  9 */   default void a(Short paramShort) { a(paramShort.shortValue()); } default j4 a(IntConsumer paramIntConsumer) { 
/* 10 */     try { Objects.requireNonNull(paramIntConsumer); } catch (v v) { throw a(null); }  return a((paramIntConsumer instanceof j4) ? (j4)paramIntConsumer : paramIntConsumer::accept); }
/*    */ 
/*    */   
/*    */   void a(short paramShort);
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\j4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */