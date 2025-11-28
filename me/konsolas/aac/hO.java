/* 1 */ package me.konsolas.aac;@FunctionalInterface public interface ho extends Consumer, IntConsumer { @Deprecated default Consumer andThen(Consumer<?> paramConsumer) { return super.andThen(paramConsumer); }
/*   */   
/* 3 */   default ho a(ho paramho) { return a(paramho); }
/*   */   @Deprecated
/* 5 */   default void c(Integer paramInteger) { accept(paramInteger.intValue()); }
/* 6 */   default IntConsumer andThen(IntConsumer paramIntConsumer) { return a(paramIntConsumer); } @Deprecated
/* 7 */   default void accept(Object paramObject) { c((Integer)paramObject); }
/*   */    default ho a(IntConsumer paramIntConsumer) {
/* 9 */     Objects.requireNonNull(paramIntConsumer);
/*   */     return paramInt -> {
/*   */         accept(paramInt);
/*   */         paramIntConsumer.accept(paramInt);
/*   */       };
/*   */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ho.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */