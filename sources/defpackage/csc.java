package defpackage;

import ai.askquin.ui.router.AppRoute;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class csc implements ja9 {
    public static final vea b = new vea(7, new qdc(12), new fnc(14));
    public boolean a;

    public csc(boolean z) {
        this.a = z;
    }

    @Override // defpackage.ja9
    public final void a(ka9 ka9Var, ua9 ua9Var, Bundle bundle) {
        ua9Var.getClass();
        int i = ua9.e;
        if (kj0.k0(ua9Var, job.a.b(AppRoute.Main.class))) {
            return;
        }
        this.a = true;
    }
}
