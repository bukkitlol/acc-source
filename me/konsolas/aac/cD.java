/*   */ package me.konsolas.aac;
/* 2 */ final class cd implements m9, Serializable { private static final long serialVersionUID = -7046029254386353129L; public boolean a(Object paramObject1, Object paramObject2) { return a((byte[][])paramObject1, (byte[][])paramObject2); } private cd() {} public int a(byte[][] paramArrayOfbyte) {
/* 3 */     return Arrays.deepHashCode((Object[])paramArrayOfbyte); }
/* 4 */   public int a(Object paramObject) { return a((byte[][])paramObject); }
/* 5 */   public boolean a(byte[][] paramArrayOfbyte1, byte[][] paramArrayOfbyte2) { return fd.a(paramArrayOfbyte1, paramArrayOfbyte2); } cd(M paramM) {
/* 6 */     this();
/*   */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\cd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */