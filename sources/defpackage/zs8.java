package defpackage;

import android.util.LongSparseArray;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zs8 implements occ {
    public final ixa a;
    public final ixa b;
    public final fz3 c = new fz3(7, false);
    public final tm3 d = new tm3(1);
    public final LongSparseArray e = new LongSparseArray();
    public final int f;
    public byte[] g;
    public long h;
    public boolean i;
    public boolean j;

    public zs8(ixa ixaVar, ixa ixaVar2, rr5 rr5Var) {
        this.a = ixaVar;
        this.b = ixaVar2;
        int i = rr5Var.r;
        this.f = i != -1 ? i + 2 : 18;
        this.h = -9223372036854775807L;
    }

    @Override // defpackage.occ
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.occ
    public final int b() {
        return this.a.b();
    }

    @Override // defpackage.occ
    public final int c(fz3 fz3Var, tm3 tm3Var, int i) {
        byte[] bArr;
        boolean z;
        int length;
        int length2;
        int iC = this.a.c(fz3Var, tm3Var, i);
        if (iC == -4) {
            int i2 = 4;
            if (!tm3Var.d(4) && (i & 4) == 0) {
                boolean z2 = true;
                if ((i & 1) == 0 && !this.i) {
                    long j = tm3Var.g;
                    boolean z3 = this.j;
                    byte[] bArr2 = null;
                    LongSparseArray longSparseArray = this.e;
                    if (z3) {
                        break;
                    }
                    while (true) {
                        tm3 tm3Var2 = this.d;
                        tm3Var2.e();
                        ixa ixaVar = this.b;
                        fz3 fz3Var2 = this.c;
                        int iC2 = ixaVar.c(fz3Var2, tm3Var2, 0);
                        if (iC2 != -3) {
                            if (iC2 != -5) {
                                if (tm3Var2.d(i2)) {
                                    this.j = z2;
                                } else {
                                    long j2 = tm3Var2.g;
                                    long j3 = this.h;
                                    if (j3 != -9223372036854775807L && j2 < j3) {
                                        this.i = z2;
                                        longSparseArray.clear();
                                        this.g = bArr2;
                                    }
                                    this.h = j2;
                                    ByteBuffer byteBuffer = tm3Var2.e;
                                    if (this.i || byteBuffer == null) {
                                        z = z2;
                                    } else {
                                        tm3Var2.i();
                                        rr5 rr5Var = (rr5) fz3Var2.c;
                                        if (rr5Var != null) {
                                            List list = rr5Var.s;
                                            length = 0;
                                            for (int i3 = 0; i3 < list.size(); i3++) {
                                                length += ((byte[]) list.get(i3)).length;
                                            }
                                        } else {
                                            length = 0;
                                        }
                                        byte[] bArr3 = new byte[byteBuffer.remaining() + length];
                                        if (rr5Var != null) {
                                            List list2 = rr5Var.s;
                                            int i4 = 0;
                                            length2 = 0;
                                            while (i4 < list2.size()) {
                                                byte[] bArr4 = (byte[]) list2.get(i4);
                                                System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
                                                length2 += bArr4.length;
                                                i4++;
                                                z2 = z2;
                                            }
                                        } else {
                                            length2 = 0;
                                        }
                                        z = z2;
                                        byteBuffer.get(bArr3, length2, byteBuffer.remaining());
                                        longSparseArray.put(j2, bArr3);
                                        while (longSparseArray.size() > this.f) {
                                            longSparseArray.removeAt(0);
                                        }
                                    }
                                    if (j2 > j) {
                                        break;
                                    }
                                    z2 = z;
                                    i2 = 4;
                                    bArr2 = null;
                                }
                            }
                        }
                        break;
                        break;
                    }
                    long j4 = tm3Var.g;
                    int size = longSparseArray.size() - 1;
                    while (true) {
                        if (size < 0) {
                            bArr = null;
                            break;
                        }
                        if (longSparseArray.keyAt(size) <= j4) {
                            bArr = (byte[]) longSparseArray.valueAt(size);
                            break;
                        }
                        size--;
                    }
                    if (bArr != null) {
                        this.g = bArr;
                    }
                    byte[] bArr5 = this.g;
                    if (bArr5 != null) {
                        int length3 = bArr5.length;
                        ByteBuffer byteBuffer2 = tm3Var.v;
                        if (byteBuffer2 == null || byteBuffer2.capacity() < length3) {
                            tm3Var.v = ByteBuffer.allocate(length3);
                        } else {
                            tm3Var.v.clear();
                        }
                        tm3Var.v.put(bArr5);
                        tm3Var.a(268435456);
                        return iC;
                    }
                }
            }
        }
        return iC;
    }

    @Override // defpackage.occ
    public final void d() throws IOException {
        this.a.d();
        if (this.i) {
            return;
        }
        this.b.d();
    }

    @Override // defpackage.occ
    public final int e(long j) {
        return this.a.e(j);
    }
}
