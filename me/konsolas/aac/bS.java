/* 1 */ package me.konsolas.aac;public class bs extends bE implements hy, Serializable, Cloneable { public Object clone() { return e9.b; } private static final long serialVersionUID = -7046029254386353129L; public boolean remove(Object paramObject) {
/* 2 */     throw new UnsupportedOperationException();
/*   */   }
/* 4 */   private Object readResolve() { return e9.b; } public boolean equals(Object paramObject) { 
/* 5 */     try { if (paramObject instanceof Set) try { if (((Set)paramObject).isEmpty()); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }   } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return false; }
/*   */ 
/*   */   
/*   */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*   */     return paramUnsupportedOperationException;
/*   */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\bs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */