package com.adjust.sdk;

import defpackage.ib8;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class h {
    public final ActivityHandler a;
    public final ArrayList b = new ArrayList();
    public int c = 0;

    public h(ActivityHandler activityHandler) {
        this.a = activityHandler;
    }

    public final void a(Runnable runnable, String str) {
        if (this.c != 3) {
            runnable.run();
        } else {
            this.a.getAdjustConfig().getLogger().debug(ib8.j("Enqueuing \"", str, "\" action to be executed after first session delay ends"), new Object[0]);
            this.b.add(runnable);
        }
    }

    public final void b(String str, IRunActivityHandler iRunActivityHandler) {
        int i = this.c;
        ActivityHandler activityHandler = this.a;
        if (i != 3) {
            iRunActivityHandler.run(activityHandler);
        } else {
            activityHandler.getAdjustConfig().getLogger().debug(ib8.j("Enqueuing \"", str, "\" action to be executed after first session delay ends"), new Object[0]);
            activityHandler.getAdjustConfig().preLaunchActions.preLaunchActionsArray.add(iRunActivityHandler);
        }
    }
}
