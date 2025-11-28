/* 1 */ package me.konsolas.aac;public interface t extends cE { @Deprecated default void a(Object paramObject) { a((Integer)paramObject); } @Deprecated
/* 2 */   default Object b() { return a(); }
/*   */   @Deprecated
/* 4 */   default void a(Integer paramInteger) { b(paramInteger.intValue()); } @Deprecated
/* 5 */   default Integer a() { return Integer.valueOf(a()); } @Deprecated
/* 6 */   default Integer b() { return Integer.valueOf(b()); } @Deprecated
/* 7 */   default Object a(int paramInt) { return c(paramInt); } @Deprecated
/* 8 */   default Integer c(int paramInt) { return Integer.valueOf(e(paramInt)); } @Deprecated
/* 9 */   default Object a() { return b(); }
/*   */ 
/*   */   
/*   */   void b(int paramInt);
/*   */   
/*   */   int a();
/*   */   
/*   */   int b();
/*   */   
/*   */   int e(int paramInt); }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\t.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */