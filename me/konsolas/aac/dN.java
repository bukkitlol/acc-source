/* 1 */ package me.konsolas.aac;final class dn implements m9, Serializable { dn(K paramK) { this(); } private static final long serialVersionUID = -7046029254386353129L; public boolean a(float[][] paramArrayOffloat1, float[][] paramArrayOffloat2) {
/* 2 */     return kn.a(paramArrayOffloat1, paramArrayOffloat2); } public int a(float[][] paramArrayOffloat) {
/* 3 */     return Arrays.deepHashCode((Object[])paramArrayOffloat);
/*   */   } private dn() {}
/* 5 */   public int a(Object paramObject) { return a((float[][])paramObject); } public boolean a(Object paramObject1, Object paramObject2) {
/* 6 */     return a((float[][])paramObject1, (float[][])paramObject2);
/*   */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\dn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */