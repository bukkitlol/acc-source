package me.konsolas.aac;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;

public interface gi extends gp, WritableByteChannel {
  fw a();
  
  gi a(gZ paramgZ, long paramLong) throws IOException;
  
  gi a(char paramChar1, int paramInt, byte[] paramArrayOfbyte, char paramChar2) throws IOException;
  
  gi a(byte[] paramArrayOfbyte, long paramLong, int paramInt1, int paramInt2) throws IOException;
  
  long a(long paramLong, hp paramhp) throws IOException;
  
  gi a(hp paramhp, int paramInt1, int paramInt2, long paramLong) throws IOException;
  
  gi a(String paramString, long paramLong) throws IOException;
  
  gi a(long paramLong, String paramString, int paramInt1, int paramInt2) throws IOException;
  
  gi f(long paramLong, int paramInt) throws IOException;
  
  gi a(String paramString, Charset paramCharset, long paramLong) throws IOException;
  
  gi a(int paramInt1, int paramInt2, String paramString, int paramInt3, int paramInt4, int paramInt5, Charset paramCharset) throws IOException;
  
  gi d(int paramInt, long paramLong) throws IOException;
  
  gi e(long paramLong, int paramInt) throws IOException;
  
  gi b(long paramLong, int paramInt) throws IOException;
  
  gi c(long paramLong, int paramInt) throws IOException;
  
  gi a(int paramInt, long paramLong) throws IOException;
  
  gi d(long paramLong1, long paramLong2) throws IOException;
  
  gi b(long paramLong1, long paramLong2) throws IOException;
  
  gi a(short paramShort1, int paramInt, long paramLong, short paramShort2) throws IOException;
  
  gi c(long paramLong1, long paramLong2) throws IOException;
  
  void flush() throws IOException;
  
  gi a(long paramLong, char paramChar) throws IOException;
  
  gi b(long paramLong) throws IOException;
  
  OutputStream a();
}


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\gi.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */