/*   */ package me.konsolas.aac;
/* 2 */ final class cl implements m9, Serializable { private static final long serialVersionUID = -7046029254386353129L; public boolean a(int[] paramArrayOfint1, int[] paramArrayOfint2) { return Arrays.equals(paramArrayOfint1, paramArrayOfint2); } private cl() {} public int a(int[] paramArrayOfint) {
/* 3 */     return Arrays.hashCode(paramArrayOfint); }
/* 4 */   public int a(Object paramObject) { return a((int[])paramObject); }
/* 5 */   cl(c9 paramc9) { this(); } public boolean a(Object paramObject1, Object paramObject2) {
/* 6 */     return a((int[])paramObject1, (int[])paramObject2);
/*   */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\cl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */