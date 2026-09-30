package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r9f {
    public static final pr4 a = new pr4(1, new mie(22));

    public static final mue a(q9f q9fVar, l46 l46Var) {
        p9f p9fVar = (p9f) l46Var.k(a);
        switch (q9fVar.ordinal()) {
            case 0:
                return p9fVar.j;
            case 1:
                return p9fVar.k;
            case 2:
                return p9fVar.l;
            case 3:
                return p9fVar.a;
            case 4:
                return p9fVar.b;
            case 5:
                return p9fVar.c;
            case 6:
                return p9fVar.d;
            case 7:
                return p9fVar.e;
            case 8:
                return p9fVar.f;
            case 9:
                return p9fVar.m;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return p9fVar.n;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return p9fVar.o;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return p9fVar.g;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return p9fVar.h;
            case 14:
                return p9fVar.i;
            case 15:
                return p9fVar.y;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return p9fVar.z;
            case 17:
                return p9fVar.A;
            case 18:
                return p9fVar.p;
            case 19:
                return p9fVar.q;
            case 20:
                return p9fVar.r;
            case 21:
                return p9fVar.s;
            case 22:
                return p9fVar.t;
            case 23:
                return p9fVar.u;
            case 24:
                return p9fVar.B;
            case 25:
                return p9fVar.C;
            case 26:
                return p9fVar.D;
            case 27:
                return p9fVar.v;
            case 28:
                return p9fVar.w;
            case 29:
                return p9fVar.x;
            default:
                ap.c();
                return null;
        }
    }
}
