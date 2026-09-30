package io.sentry;

import java.time.Instant;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class m5 extends z4 {
    public final Instant a = Instant.now();

    @Override // io.sentry.z4
    public final long d() {
        Instant instant = this.a;
        return (instant.getEpochSecond() * 1000000000) + ((long) instant.getNano());
    }
}
