/*  1 */ package me.konsolas.aac;public interface jz { default Object f() { return d(); }
/*  2 */   default Object b() { return e(); } default jz f(Object paramObject) {
/*  3 */     return d(paramObject);
/*    */   }
/*  5 */   default jz b(Object paramObject) { return c(paramObject); }
/*  6 */   default Object c() { return e(); }
/*  7 */   default jz d(Object paramObject) { throw new UnsupportedOperationException(); }
/*  8 */   default jz e(Object paramObject) { return d(paramObject); }
/*  9 */   static Comparator a() { return (paramjz1, paramjz2) -> { int i = ((Comparable<Object>)paramjz1.e()).compareTo(paramjz2.e()); 
/*    */         try { if (i != 0)
/*    */             return i;  }
/* 12 */         catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return ((Comparable<Object>)paramjz1.d()).compareTo(paramjz2.d()); }; }
/* 13 */   default jz a(Object paramObject) { return c(paramObject); } default jz c(Object paramObject) { throw new UnsupportedOperationException(); }
/* 14 */   static jz a(Object paramObject1, Object paramObject2) { return new hU(paramObject1, paramObject2); } default Object a() { return d(); }
/*    */ 
/*    */   
/*    */   Object e();
/*    */   
/*    */   Object d();
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\jz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */