/* 1 */ package me.konsolas.aac;final class hf implements m9, Serializable { hf(me paramme) { this(); }
/*   */    private static final long serialVersionUID = -7046029254386353129L; private hf() {} public int a(char[][] paramArrayOfchar) {
/* 3 */     return Arrays.deepHashCode((Object[])paramArrayOfchar); }
/* 4 */   public boolean a(Object paramObject1, Object paramObject2) { return a((char[][])paramObject1, (char[][])paramObject2); }
/* 5 */   public boolean a(char[][] paramArrayOfchar1, char[][] paramArrayOfchar2) { return eE.a(paramArrayOfchar1, paramArrayOfchar2); } public int a(Object paramObject) {
/* 6 */     return a((char[][])paramObject);
/*   */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\hf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */