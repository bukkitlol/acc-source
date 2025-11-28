/*   */ package me.konsolas.aac;
/* 2 */ class i2 implements g9 { final Comparator a; public int a(Byte paramByte1, Byte paramByte2) { return this.a.compare(paramByte1, paramByte2); } i2(Comparator paramComparator) {} public int compare(Object paramObject1, Object paramObject2) {
/* 3 */     return a((Byte)paramObject1, (Byte)paramObject2); } public int a(byte paramByte1, byte paramByte2) {
/* 4 */     return this.a.compare(Byte.valueOf(paramByte1), Byte.valueOf(paramByte2));
/*   */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\i2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */