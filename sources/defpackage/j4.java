package defpackage;

import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j4 extends mbb {
    @Override // defpackage.mbb
    public final int a(int i) {
        return (h().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // defpackage.mbb
    public final float b() {
        return h().nextFloat();
    }

    @Override // defpackage.mbb
    public final int c() {
        return h().nextInt();
    }

    @Override // defpackage.mbb
    public final long e() {
        return h().nextLong();
    }

    public abstract Random h();

    public final int i(int i) {
        return h().nextInt(i);
    }
}
