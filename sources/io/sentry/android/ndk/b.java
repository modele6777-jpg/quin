package io.sentry.android.ndk;

import defpackage.bwe;
import defpackage.nzf;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.d;
import io.sentry.e4;
import io.sentry.e7;
import io.sentry.g;
import io.sentry.h4;
import io.sentry.protocol.i0;
import io.sentry.q5;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends h4 {
    public final SentryAndroidOptions a;

    public b(SentryAndroidOptions sentryAndroidOptions) {
        this.a = sentryAndroidOptions;
    }

    @Override // io.sentry.f1
    public final void c(i0 i0Var) {
        SentryAndroidOptions sentryAndroidOptions = this.a;
        try {
            sentryAndroidOptions.getExecutorService().submit(new bwe(19, this, i0Var));
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().c(q5.ERROR, th, "Scope sync setUser has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.f1
    public final void j(g gVar) {
        SentryAndroidOptions sentryAndroidOptions = this.a;
        try {
            sentryAndroidOptions.getExecutorService().submit(new nzf(13, this, gVar));
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().c(q5.ERROR, th, "Scope sync addBreadcrumb has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.h4, io.sentry.f1
    public final void l() {
        SentryAndroidOptions sentryAndroidOptions = this.a;
        try {
            sentryAndroidOptions.getExecutorService().submit(new d(this));
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().c(q5.ERROR, th, "Scope sync clearAttachments has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.h4, io.sentry.f1
    public final void m(String str, String str2) {
        SentryAndroidOptions sentryAndroidOptions = this.a;
        try {
            sentryAndroidOptions.getExecutorService().submit(new nzf(this, str, str2, 14));
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().c(q5.ERROR, th, "Scope sync setExtra(%s) has an error.", str);
        }
    }

    @Override // io.sentry.h4, io.sentry.f1
    public final void o(String str) {
        SentryAndroidOptions sentryAndroidOptions = this.a;
        try {
            sentryAndroidOptions.getExecutorService().submit(new bwe(20, this, str));
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().c(q5.ERROR, th, "Scope sync removeExtra(%s) has an error.", str);
        }
    }

    @Override // io.sentry.f1
    public final void p(e7 e7Var, e4 e4Var) {
        SentryAndroidOptions sentryAndroidOptions = this.a;
        if (e7Var == null) {
            return;
        }
        try {
            sentryAndroidOptions.getExecutorService().submit(new bwe(18, this, e7Var));
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().c(q5.ERROR, th, "Scope sync setTrace failed.", new Object[0]);
        }
    }
}
