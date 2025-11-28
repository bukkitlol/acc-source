/*    */ package me.konsolas.aac;
/*  2 */ public interface d4 extends ik, jx { default long a(long paramLong) { long l = paramLong; while (true) { try { if (l-- != 0L)
/*    */           try { if (hasPrevious()) { a(); continue; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }   } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  break; }
/*  4 */      return paramLong - l - 1L; }
/*  5 */   default void a(int paramInt) { throw new UnsupportedOperationException(); } @Deprecated default void a(Integer paramInteger) { b(paramInteger.intValue()); } default int b(int paramInt) {
/*  6 */     return j6.a(b(paramInt));
/*    */   }
/*    */   @Deprecated
/*  9 */   default void b(Integer paramInteger) { a(paramInteger.intValue()); }
/* 10 */   default long b(long paramLong) { long l = paramLong; while (true) { try { if (l-- != 0L)
/* 11 */           try { if (hasNext()) { nextInt(); continue; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }   } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  break; }  return paramLong - l - 1L; } @Deprecated default void b(Object paramObject) { a((Integer)paramObject); }
/* 12 */   default void b(int paramInt) { throw new UnsupportedOperationException(); } @Deprecated
/* 13 */   default void a(Object paramObject) { b((Integer)paramObject); }
/*    */ 
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\d4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */