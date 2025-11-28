/*   */ package me.konsolas.aac;
/* 2 */ public interface ik extends cA, m4 { default int b(int paramInt) { return super.b(paramInt); } @Deprecated
/* 3 */   default Integer a() { return Integer.valueOf(a()); }
/*   */   
/* 5 */   default int a(int paramInt) { int i = paramInt; while (true) { try { if (i-- != 0)
/* 6 */           try { if (hasPrevious()) { a(); continue; }  } catch (v v) { throw c(null); }   } catch (v v) { throw c(null); }  break; }  return paramInt - i - 1; } @Deprecated default Object previous() { return a(); }
/*   */ 
/*   */   
/*   */   int a();
/*   */   
/*   */   private static v c(v paramv) {
/*   */     return paramv;
/*   */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ik.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */