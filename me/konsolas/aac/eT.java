/* 1 */ package me.konsolas.aac;final class et implements m9, Serializable { public boolean a(char[] paramArrayOfchar1, char[] paramArrayOfchar2) { return Arrays.equals(paramArrayOfchar1, paramArrayOfchar2); }
/*   */    private static final long serialVersionUID = -7046029254386353129L; private et() {} public int a(Object paramObject) {
/* 3 */     return a((char[])paramObject); }
/* 4 */   public boolean a(Object paramObject1, Object paramObject2) { return a((char[])paramObject1, (char[])paramObject2); }
/* 5 */   public int a(char[] paramArrayOfchar) { return Arrays.hashCode(paramArrayOfchar); } et(e0 parame0) {
/* 6 */     this();
/*   */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\et.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */