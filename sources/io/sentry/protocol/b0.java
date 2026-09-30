package io.sentry.protocol;

import io.sentry.k2;
import io.sentry.m3;
import io.sentry.z0;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public enum b0 implements k2 {
    AUTO,
    ALL,
    ALL_BUT_FIRST,
    NONE;

    @Override // io.sentry.k2
    public void serialize(m3 m3Var, z0 z0Var) {
        ((io.sentry.internal.debugmeta.c) m3Var).z(toString().toLowerCase(Locale.ROOT));
    }
}
