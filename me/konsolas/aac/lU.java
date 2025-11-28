/* 1 */ package me.konsolas.aac;@FunctionalInterface public interface lu extends UnaryOperator, IntUnaryOperator { static lu b() { return paramInt -> -paramInt; } @Deprecated
/* 2 */   default int applyAsInt(int paramInt) { return a(paramInt); } static lu a() {
/* 3 */     return paramInt -> paramInt;
/*   */   }
/*   */   @Deprecated
/* 6 */   default Object apply(Object paramObject) { return a((Integer)paramObject); } @Deprecated
/* 7 */   default Integer a(Integer paramInteger) { return Integer.valueOf(a(paramInteger.intValue())); }
/*   */ 
/*   */   
/*   */   int a(int paramInt); }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\lu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */