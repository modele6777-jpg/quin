package defpackage;

import java.io.InvalidObjectException;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ycg extends mbb implements Serializable {
    private static final long serialVersionUID = 0;
    private int addend;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    public ycg(int i, int i2) {
        int i3 = ~i;
        int i4 = (i << 10) ^ (i2 >>> 4);
        this.x = i;
        this.y = i2;
        this.z = 0;
        this.w = 0;
        this.v = i3;
        this.addend = i4;
        h();
        for (int i5 = 0; i5 < 64; i5++) {
            c();
        }
    }

    private final Object readResolve() throws Throwable {
        try {
            h();
            return this;
        } catch (Throwable th) {
            Throwable thInitCause = new InvalidObjectException(th.getMessage()).initCause(th);
            thInitCause.getClass();
            throw thInitCause;
        }
    }

    @Override // defpackage.mbb
    public final int a(int i) {
        return (c() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // defpackage.mbb
    public final int c() {
        int i = this.x;
        int i2 = i ^ (i >>> 2);
        this.x = this.y;
        this.y = this.z;
        this.z = this.w;
        int i3 = this.v;
        this.w = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.v = i4;
        int i5 = this.addend + 362437;
        this.addend = i5;
        return i4 + i5;
    }

    public final void h() {
        if ((this.v | this.x | this.y | this.z | this.w) != 0) {
            return;
        }
        qc0.j("Initial state must have at least one non-zero element.");
    }
}
