package defpackage;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l94 implements k1f {
    public final byte[] a = new byte[4096];

    @Override // defpackage.k1f
    public final void b(d0a d0aVar, int i, int i2) {
        d0aVar.N(i);
    }

    @Override // defpackage.k1f
    public final int f(sb3 sb3Var, int i, boolean z) throws EOFException {
        byte[] bArr = this.a;
        int i2 = sb3Var.read(bArr, 0, Math.min(bArr.length, i));
        if (i2 != -1) {
            return i2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.k1f
    public final void g(rr5 rr5Var) {
    }

    @Override // defpackage.k1f
    public final void a(long j, int i, int i2, int i3, j1f j1fVar) {
    }
}
