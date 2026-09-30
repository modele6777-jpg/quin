package com.google.firebase.crashlytics.internal.concurrency;

import defpackage.h36;
import defpackage.x16;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = z7c.f)
public /* synthetic */ class CrashlyticsWorkers$Companion$checkBlockingThread$1 extends h36 implements x16 {
    public CrashlyticsWorkers$Companion$checkBlockingThread$1(Object obj) {
        super(0, 0, CrashlyticsWorkers.Companion.class, obj, "isBlockingThread", "isBlockingThread()Z");
    }

    @Override // defpackage.x16
    public final Boolean invoke() {
        return Boolean.valueOf(((CrashlyticsWorkers.Companion) this.receiver).isBlockingThread());
    }
}
