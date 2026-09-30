package io.sentry.android.core;

import io.sentry.android.navigation.SentryNavigationListener;
import io.sentry.d4;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements d4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ io.sentry.e1 b;
    public final /* synthetic */ io.sentry.q1 c;

    public /* synthetic */ h(io.sentry.e1 e1Var, io.sentry.q1 q1Var) {
        this.b = e1Var;
        this.c = q1Var;
    }

    @Override // io.sentry.d4
    public final void c(io.sentry.q1 q1Var) {
        int i = this.a;
        io.sentry.q1 q1Var2 = this.c;
        io.sentry.e1 e1Var = this.b;
        switch (i) {
            case 0:
                if (q1Var == q1Var2) {
                    e1Var.s();
                }
                break;
            default:
                int i2 = SentryNavigationListener.g;
                if (q1Var == null) {
                    e1Var.K(q1Var2);
                }
                break;
        }
    }

    public /* synthetic */ h(io.sentry.q1 q1Var, io.sentry.e1 e1Var) {
        this.c = q1Var;
        this.b = e1Var;
    }
}
