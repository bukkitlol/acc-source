/* 1 */ package me.konsolas.aac;public interface ih extends m4, jx { default int b(int paramInt) { return j6.a(d(paramInt)); }
/*   */   
/*   */   default void b(Object paramObject) {
/* 4 */     throw new UnsupportedOperationException();
/*   */   }
/* 6 */   default long c(long paramLong) { long l = paramLong; while (true) { try { if (l-- != 0L)
/* 7 */           try { if (hasPrevious()) { previous(); continue; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }   } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  break; }  return paramLong - l - 1L; } default void a(Object paramObject) { throw new UnsupportedOperationException(); } default long d(long paramLong) {
/* 8 */     long l = paramLong; while (true) { try { if (l-- != 0L)
/* 9 */           try { if (hasNext()) { next(); continue; }  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }   } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  break; }  return paramLong - l - 1L;
/*   */   }
/*   */   
/*   */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*   */     return paramUnsupportedOperationException;
/*   */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ih.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */