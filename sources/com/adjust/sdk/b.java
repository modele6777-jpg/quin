package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements IRunActivityHandler {
    public final /* synthetic */ ActivityHandler a;

    public b(ActivityHandler activityHandler) {
        this.a = activityHandler;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        activityHandler.lambda$setEnabled$5(this.a.adjustConfig.startEnabled.booleanValue());
    }
}
