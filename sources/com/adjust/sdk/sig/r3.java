package com.adjust.sdk.sig;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.SystemClock;
import androidx.core.app.FrameMetricsAggregator;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.je9;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.c4;
import io.sentry.c7;
import io.sentry.p4;
import io.sentry.q5;
import io.sentry.q6;
import io.sentry.u4;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r3 implements io.sentry.b2, io.sentry.util.e, c4, io.sentry.transport.f, p4 {
    public final /* synthetic */ int a;

    public /* synthetic */ r3(int i) {
        this.a = i;
    }

    public static /* synthetic */ void f() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void g(int i, StringBuilder sb) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void h(Object obj, Object obj2, String str) {
        throw new NumberFormatException(str + obj + obj2);
    }

    public static /* synthetic */ void i(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void j(String str, double d) {
        throw new IllegalArgumentException(str + d);
    }

    public static /* synthetic */ void k(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void l() {
        throw new IllegalStateException();
    }

    public static /* synthetic */ void m(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void n(String str) {
        throw new NoSuchElementException(str);
    }

    @Override // io.sentry.b2
    public Object a() {
        return null;
    }

    @Override // io.sentry.util.e
    public Object c() {
        switch (this.a) {
            case 9:
                return q6.empty();
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return q6.empty();
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 14:
            default:
                try {
                    return Build.MODEL.split(" ", -1)[0];
                } catch (Throwable unused) {
                    q5 q5Var = q5.DEBUG;
                    return null;
                }
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return new u4();
            case 15:
                return new FrameMetricsAggregator();
        }
    }

    public Object e(Context context) {
        String string = null;
        switch (this.a) {
            case 18:
                return io.sentry.android.core.p0.h(context);
            case 19:
                try {
                    return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                } catch (Throwable unused) {
                    return null;
                }
            case 20:
                try {
                    ApplicationInfo applicationInfo = context.getApplicationInfo();
                    int i = applicationInfo.labelRes;
                    if (i == 0) {
                        CharSequence charSequence = applicationInfo.nonLocalizedLabel;
                        string = charSequence != null ? charSequence.toString() : context.getPackageManager().getApplicationLabel(applicationInfo).toString();
                    } else {
                        string = context.getString(i);
                    }
                    break;
                } catch (Throwable unused2) {
                }
                return string;
            case 21:
                return io.sentry.android.core.p0.i(context);
            default:
                try {
                    return context.getPackageManager().getApplicationInfo(context.getPackageName(), UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                } catch (Throwable unused3) {
                    return null;
                }
        }
    }

    @Override // io.sentry.transport.f
    public long getCurrentTimeMillis() {
        return SystemClock.uptimeMillis();
    }

    @Override // io.sentry.c4
    public void b(c7 c7Var) {
    }

    @Override // io.sentry.p4
    public void d(SentryAndroidOptions sentryAndroidOptions) {
    }
}
