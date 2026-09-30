package io.sentry;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import defpackage.je9;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c5 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ io.sentry.internal.debugmeta.c b;

    public /* synthetic */ c5(io.sentry.internal.debugmeta.c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        io.sentry.internal.debugmeta.c cVar = this.b;
        switch (i) {
            case 0:
                return Integer.valueOf(cVar.p().length);
            case 1:
                return cVar.p();
            case 2:
                return Integer.valueOf(cVar.p().length);
            case 3:
                return cVar.p();
            case 4:
                return Integer.valueOf(cVar.p().length);
            case 5:
                return cVar.p();
            case 6:
                return Integer.valueOf(cVar.p().length);
            case 7:
                return Integer.valueOf(cVar.p().length);
            case 8:
                return cVar.p();
            case 9:
                return Integer.valueOf(cVar.p().length);
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return cVar.p();
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return Integer.valueOf(cVar.p().length);
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return cVar.p();
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return Integer.valueOf(cVar.p().length);
            case 14:
                return cVar.p();
            case 15:
                return cVar.p();
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return Integer.valueOf(cVar.p().length);
            case 17:
                return cVar.p();
            case 18:
                return Integer.valueOf(cVar.p().length);
            default:
                return cVar.p();
        }
    }
}
