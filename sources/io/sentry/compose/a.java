package io.sentry.compose;

import defpackage.f48;
import defpackage.ja9;
import defpackage.ka9;
import defpackage.u48;
import defpackage.x48;
import io.sentry.android.navigation.SentryNavigationListener;
import io.sentry.o5;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements u48 {
    public final ka9 a;
    public final ja9 b;

    static {
        o5.d().b("maven:io.sentry:sentry-compose", "8.53.0");
    }

    public a(ka9 ka9Var, SentryNavigationListener sentryNavigationListener) {
        ka9Var.getClass();
        sentryNavigationListener.getClass();
        this.a = ka9Var;
        this.b = sentryNavigationListener;
        io.sentry.util.b.a("ComposeNavigation");
    }

    @Override // defpackage.u48
    public final void h(x48 x48Var, f48 f48Var) {
        f48 f48Var2 = f48.ON_RESUME;
        ja9 ja9Var = this.b;
        ka9 ka9Var = this.a;
        if (f48Var == f48Var2) {
            ka9Var.a(ja9Var);
        } else if (f48Var == f48.ON_PAUSE) {
            ka9Var.i(ja9Var);
        }
    }
}
