package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class e41 extends InputStream {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public e41(vr3 vr3Var, amg amgVar) {
        this.a = 3;
        this.b = amgVar;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (int) Math.min(((f41) obj).b, 2147483647L);
            case 1:
                yhb yhbVar = (yhb) obj;
                if (!yhbVar.c) {
                    return (int) Math.min(yhbVar.b.b, 2147483647L);
                }
                yg5.m("closed");
                return 0;
            default:
                return super.available();
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.a) {
            case 0:
                break;
            case 1:
                ((yhb) this.b).close();
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                bArr.getClass();
                return ((f41) obj).read(bArr, i, i2);
            case 1:
                bArr.getClass();
                yhb yhbVar = (yhb) obj;
                f41 f41Var = yhbVar.b;
                if (yhbVar.c) {
                    yg5.m("closed");
                    return 0;
                }
                vpf.s(bArr.length, i, i2);
                if (f41Var.b == 0 && yhbVar.a.c0(f41Var, 8192L) == -1) {
                    return -1;
                }
                return f41Var.read(bArr, i, i2);
            case 2:
                Inflater inflater = (Inflater) ((vr3) obj).b;
                try {
                    int iInflate = inflater.inflate(bArr, i, i2);
                    if (iInflate > 0) {
                        return iInflate;
                    }
                    if (i2 == 0) {
                        return 0;
                    }
                    if (inflater.getRemaining() == 0) {
                        return -1;
                    }
                    int remaining = inflater.getRemaining();
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 70 + String.valueOf(remaining).length());
                    sb.append("Read no bytes (requested up to ");
                    sb.append(i2);
                    sb.append(") but did not reach end of stream, had ");
                    sb.append(remaining);
                    throw new IOException(sb.toString());
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            default:
                return ((amg) obj).f(bArr, i, i2);
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        switch (this.a) {
            case 3:
                if (j <= 0) {
                    return 0L;
                }
                int i = j > 2147483647L ? Integer.MAX_VALUE : (int) j;
                ((amg) this.b).g(i);
                return i;
            default:
                return super.skip(j);
        }
    }

    public String toString() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((f41) obj) + ".inputStream()";
            case 1:
                return ((yhb) obj) + ".inputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.InputStream
    public long transferTo(OutputStream outputStream) throws IOException {
        switch (this.a) {
            case 1:
                outputStream.getClass();
                yhb yhbVar = (yhb) this.b;
                f41 f41Var = yhbVar.b;
                if (yhbVar.c) {
                    yg5.m("closed");
                    return 0L;
                }
                long j = 0;
                while (true) {
                    if (f41Var.b == 0 && yhbVar.a.c0(f41Var, 8192L) == -1) {
                        return j;
                    }
                    long j2 = f41Var.b;
                    j += j2;
                    vpf.s(j2, 0L, j2);
                    qtc qtcVar = f41Var.a;
                    while (j2 > 0) {
                        qtcVar.getClass();
                        int iMin = (int) Math.min(j2, qtcVar.c - qtcVar.b);
                        outputStream.write(qtcVar.a, qtcVar.b, iMin);
                        int i = qtcVar.b + iMin;
                        qtcVar.b = i;
                        long j3 = iMin;
                        f41Var.b -= j3;
                        j2 -= j3;
                        if (i == qtcVar.c) {
                            qtc qtcVarA = qtcVar.a();
                            f41Var.a = qtcVarA;
                            ttc.a(qtcVar);
                            qtcVar = qtcVarA;
                        }
                    }
                }
                break;
            default:
                return super.transferTo(outputStream);
        }
    }

    public /* synthetic */ e41(Closeable closeable, int i) {
        this.a = i;
        this.b = closeable;
    }

    private final void b() {
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                f41 f41Var = (f41) obj;
                if (f41Var.b > 0) {
                    return f41Var.h0() & 255;
                }
                return -1;
            case 1:
                yhb yhbVar = (yhb) obj;
                f41 f41Var2 = yhbVar.b;
                if (yhbVar.c) {
                    yg5.m("closed");
                    return 0;
                }
                if (f41Var2.b == 0 && yhbVar.a.c0(f41Var2, 8192L) == -1) {
                    return -1;
                }
                return f41Var2.h0() & 255;
            case 2:
                byte[] bArr = new byte[1];
                if (read(bArr, 0, 1) == -1) {
                    return -1;
                }
                return bArr[0];
            default:
                byte[] bArr2 = new byte[1];
                if (((amg) obj).f(bArr2, 0, 1) == -1) {
                    return -1;
                }
                return bArr2[0];
        }
    }
}
