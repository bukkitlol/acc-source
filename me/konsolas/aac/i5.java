/*  1 */ package me.konsolas.aac;@FunctionalInterface public interface i5 extends Consumer, IntConsumer { @Deprecated default void accept(Object paramObject) { a((Byte)paramObject); }
/*    */   
/*  3 */   default i5 a(i5 parami5) { Objects.requireNonNull(parami5);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 10 */     return paramByte -> { a(paramByte); parami5.a(paramByte);
/* 11 */       }; } @Deprecated default void accept(int paramInt) { a(j6.a(paramInt)); }
/*    */ 
/*    */   
/*    */   @Deprecated
/*    */   default Consumer andThen(Consumer<?> paramConsumer) {
/*    */     return super.andThen(paramConsumer);
/*    */   }
/*    */   
/*    */   default i5 a(IntConsumer paramIntConsumer) {
/*    */     try {
/*    */       Objects.requireNonNull(paramIntConsumer);
/*    */     } catch (v v) {
/*    */       throw a(null);
/*    */     } 
/*    */     return a((paramIntConsumer instanceof i5) ? (i5)paramIntConsumer : paramIntConsumer::accept);
/*    */   }
/*    */   
/*    */   default IntConsumer andThen(IntConsumer paramIntConsumer) {
/*    */     return a(paramIntConsumer);
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default void a(Byte paramByte) {
/*    */     a(paramByte.byteValue());
/*    */   }
/*    */   
/*    */   void a(byte paramByte);
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\i5.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */