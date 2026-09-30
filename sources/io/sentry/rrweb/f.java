package io.sentry.rrweb;

import io.sentry.k2;
import io.sentry.m3;
import io.sentry.z0;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public enum f implements k2 {
    MouseUp,
    MouseDown,
    Click,
    ContextMenu,
    DblClick,
    Focus,
    Blur,
    TouchStart,
    TouchMove_Departed,
    TouchEnd,
    TouchCancel;

    @Override // io.sentry.k2
    public void serialize(m3 m3Var, z0 z0Var) {
        ((io.sentry.internal.debugmeta.c) m3Var).v(ordinal());
    }
}
