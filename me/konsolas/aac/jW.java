/*   */ package me.konsolas.aac;
/* 2 */ final class jw implements m9, Serializable { private static final long serialVersionUID = -7046029254386353129L; public boolean a(double[][] paramArrayOfdouble1, double[][] paramArrayOfdouble2) { return L.a(paramArrayOfdouble1, paramArrayOfdouble2); } private jw() {} public boolean a(Object paramObject1, Object paramObject2) {
/* 3 */     return a((double[][])paramObject1, (double[][])paramObject2); }
/* 4 */   jw(lv paramlv) { this(); }
/* 5 */   public int a(double[][] paramArrayOfdouble) { return Arrays.deepHashCode((Object[])paramArrayOfdouble); } public int a(Object paramObject) {
/* 6 */     return a((double[][])paramObject);
/*   */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\jw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */