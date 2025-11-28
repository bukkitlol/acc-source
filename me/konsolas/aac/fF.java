/*  1 */ package me.konsolas.aac;public interface ff extends jz { default ff c(int paramInt) { return a(paramInt); } @Deprecated
/*  2 */   default Object e() { return c(); }
/*  3 */   default int b() { return c(); }
/*  4 */   static Comparator b() { return (paramff1, paramff2) -> {
/*    */         int i = Integer.compare(paramff1.c(), paramff2.c());
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/*    */         try { if (i != 0) {
/*    */             return i;
/*    */           } }
/* 21 */         catch (UnsupportedOperationException unsupportedOperationException) { throw b(null); }  return ((Comparable<Object>)paramff1.d()).compareTo(paramff2.d());
/* 22 */       }; } @Deprecated default jz b(Object paramObject) { return b((Integer)paramObject); }
/*    */ 
/*    */   
/*    */   default ff a(int paramInt) {
/*    */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default ff b(Integer paramInteger) {
/*    */     return c(paramInteger.intValue());
/*    */   }
/*    */   
/*    */   default int d() {
/*    */     return b();
/*    */   }
/*    */   
/*    */   default ff b(int paramInt) {
/*    */     return a(paramInt);
/*    */   }
/*    */   
/*    */   static ff a(int paramInt, Object paramObject) {
/*    */     return new jr(paramInt, paramObject);
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default jz a(Object paramObject) {
/*    */     return a((Integer)paramObject);
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default ff a(Integer paramInteger) {
/*    */     return b(paramInteger.intValue());
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Integer d() {
/*    */     return Integer.valueOf(d());
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default jz c(Object paramObject) {
/*    */     return c((Integer)paramObject);
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Object b() {
/*    */     return b();
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Integer b() {
/*    */     return Integer.valueOf(b());
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Object c() {
/*    */     return d();
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default ff c(Integer paramInteger) {
/*    */     return a(paramInteger.intValue());
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   default Integer c() {
/*    */     return Integer.valueOf(c());
/*    */   }
/*    */   
/*    */   int c();
/*    */   
/*    */   private static UnsupportedOperationException b(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ff.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */