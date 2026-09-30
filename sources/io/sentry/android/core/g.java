package io.sentry.android.core;

import io.sentry.android.navigation.SentryNavigationListener;
import io.sentry.g4;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements g4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ io.sentry.q1 b;

    public /* synthetic */ g(io.sentry.q1 q1Var) {
        this.b = q1Var;
    }

    @Override // io.sentry.g4
    public final void g(io.sentry.e1 e1Var) {
        int i = this.a;
        io.sentry.q1 q1Var = this.b;
        switch (i) {
            case 0:
                e1Var.I(new h(q1Var, e1Var));
                break;
            default:
                int i2 = SentryNavigationListener.g;
                e1Var.getClass();
                e1Var.I(new h(e1Var, q1Var));
                break;
        }
    }
}
