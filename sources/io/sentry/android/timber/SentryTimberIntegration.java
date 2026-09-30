package io.sentry.android.timber;

import defpackage.gxe;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.z7c;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.o5;
import io.sentry.q5;
import io.sentry.u5;
import io.sentry.util.b;
import io.sentry.w1;
import io.sentry.z0;
import java.io.Closeable;
import java.util.ArrayList;
import kotlin.Metadata;
import timber.log.Timber;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/sentry/android/timber/SentryTimberIntegration;", "Lio/sentry/w1;", "Ljava/io/Closeable;", "Lio/sentry/q5;", "minEventLevel", "minBreadcrumbLevel", "Lio/sentry/u5;", "minLogsLevel", "<init>", "(Lio/sentry/q5;Lio/sentry/q5;Lio/sentry/u5;)V", "sentry-android-timber_release"}, k = 1, mv = {1, 9, 0}, xi = z7c.f)
public final class SentryTimberIntegration implements w1, Closeable {
    public final q5 a;
    public final q5 b;
    public final u5 c;
    public a d;
    public z0 e;

    static {
        o5.d().b("maven:io.sentry:sentry-android-timber", "8.53.0");
    }

    public /* synthetic */ SentryTimberIntegration(q5 q5Var, q5 q5Var2, u5 u5Var, int i, rp3 rp3Var) {
        this((i & 1) != 0 ? q5.ERROR : q5Var, (i & 2) != 0 ? q5.INFO : q5Var2, (i & 4) != 0 ? u5.INFO : u5Var);
    }

    @Override // io.sentry.w1
    public final void R(SentryAndroidOptions sentryAndroidOptions) {
        z0 logger = sentryAndroidOptions.getLogger();
        logger.getClass();
        this.e = logger;
        a aVar = new a(this.a, this.b, this.c);
        this.d = aVar;
        Timber.a.k(aVar);
        z0 z0Var = this.e;
        if (z0Var == null) {
            pa7.g0("logger");
            throw null;
        }
        z0Var.i(q5.DEBUG, "SentryTimberIntegration installed.", new Object[0]);
        b.a("Timber");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a aVar = this.d;
        if (aVar != null) {
            if (aVar == null) {
                pa7.g0("tree");
                throw null;
            }
            Timber.a.getClass();
            ArrayList arrayList = Timber.b;
            synchronized (arrayList) {
                if (!arrayList.remove(aVar)) {
                    throw new IllegalArgumentException(("Cannot uproot tree which is not planted: " + aVar).toString());
                }
                Object[] array = arrayList.toArray(new gxe[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                Timber.c = (gxe[]) array;
            }
            z0 z0Var = this.e;
            if (z0Var != null) {
                if (z0Var != null) {
                    z0Var.i(q5.DEBUG, "SentryTimberIntegration removed.", new Object[0]);
                } else {
                    pa7.g0("logger");
                    throw null;
                }
            }
        }
    }

    public SentryTimberIntegration(q5 q5Var, q5 q5Var2, u5 u5Var) {
        q5Var.getClass();
        q5Var2.getClass();
        u5Var.getClass();
        this.a = q5Var;
        this.b = q5Var2;
        this.c = u5Var;
    }

    public SentryTimberIntegration() {
        this(null, null, null, 7, null);
    }
}
