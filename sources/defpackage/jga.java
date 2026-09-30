package defpackage;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jga extends j4 {
    @Override // defpackage.mbb
    public final int d(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(0, i2);
    }

    @Override // defpackage.mbb
    public final long g() {
        return ThreadLocalRandom.current().nextLong(500L, 1500L);
    }

    @Override // defpackage.j4
    public final Random h() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        threadLocalRandomCurrent.getClass();
        return threadLocalRandomCurrent;
    }
}
