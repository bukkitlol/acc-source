/* 1 */ package me.konsolas.aac;final class f9 implements m9, Serializable { public int a(Object paramObject) { return a((long[])paramObject); } private static final long serialVersionUID = -7046029254386353129L; public boolean a(long[] paramArrayOflong1, long[] paramArrayOflong2) {
/* 2 */     return Arrays.equals(paramArrayOflong1, paramArrayOflong2);
/*   */   } private f9() {}
/* 4 */   public int a(long[] paramArrayOflong) { return Arrays.hashCode(paramArrayOflong); }
/* 5 */   public boolean a(Object paramObject1, Object paramObject2) { return a((long[])paramObject1, (long[])paramObject2); } f9(iZ paramiZ) {
/* 6 */     this();
/*   */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\f9.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */