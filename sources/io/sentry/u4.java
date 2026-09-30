package io.sentry;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class u4 implements a5 {
    public final a5 a;

    public u4() {
        if (io.sentry.util.j.a || !io.sentry.util.j.b) {
            this.a = new n5(1);
        } else {
            this.a = new n5(0);
        }
    }

    @Override // io.sentry.a5
    public final z4 a() {
        return this.a.a();
    }
}
