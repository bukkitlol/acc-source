/* 1 */ package me.konsolas.aac;public class ay extends aq implements kQ, Serializable, Cloneable { public boolean d(int paramInt) { throw new UnsupportedOperationException(); } private static final long serialVersionUID = -7046029254386353129L; private Object readResolve() {
/* 2 */     return aU.c; } public boolean equals(Object paramObject) { 
/* 3 */     try { if (paramObject instanceof Set) try { if (((Set)paramObject).isEmpty()); } catch (UnsupportedOperationException unsupportedOperationException) { throw c(null); }   } catch (UnsupportedOperationException unsupportedOperationException) { throw c(null); }  return false; }
/*   */   @Deprecated
/* 5 */   public boolean b(int paramInt) { return super.b(paramInt); } public Object clone() {
/* 6 */     return aU.c;
/*   */   }
/*   */   
/*   */   private static UnsupportedOperationException c(UnsupportedOperationException paramUnsupportedOperationException) {
/*   */     return paramUnsupportedOperationException;
/*   */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ay.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */