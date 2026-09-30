package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xx extends gu7 implements a26 {
    public static final xx E0;
    public static final xx F0;
    public static final xx G0;
    public static final xx H0;
    public static final xx I0;
    public static final xx J0;
    public static final xx K0;
    public static final xx L0;
    public static final xx M0;
    public static final xx N0;
    public static final xx O0;
    public static final xx P0;
    public static final xx Q0;
    public static final xx R0;
    public static final xx S0;
    public static final xx X;
    public static final xx Y;
    public static final xx Z;
    public static final xx b;
    public static final xx c;
    public static final xx d;
    public static final xx e;
    public static final xx f;
    public static final xx g;
    public static final xx v;
    public static final xx w;
    public static final xx x;
    public static final xx y;
    public static final xx z;
    public final /* synthetic */ int a;

    static {
        int i = 1;
        b = new xx(i, 0);
        c = new xx(i, 1);
        d = new xx(i, 2);
        e = new xx(i, 3);
        f = new xx(i, 4);
        g = new xx(i, 5);
        v = new xx(i, 6);
        w = new xx(i, 7);
        x = new xx(i, 8);
        y = new xx(i, 9);
        z = new xx(i, 10);
        X = new xx(i, 11);
        Y = new xx(i, 12);
        Z = new xx(i, 13);
        E0 = new xx(i, 14);
        F0 = new xx(i, 15);
        G0 = new xx(i, 16);
        H0 = new xx(i, 17);
        I0 = new xx(i, 18);
        J0 = new xx(i, 19);
        K0 = new xx(i, 20);
        L0 = new xx(i, 21);
        M0 = new xx(i, 22);
        N0 = new xx(i, 23);
        O0 = new xx(i, 24);
        P0 = new xx(i, 25);
        Q0 = new xx(i, 26);
        R0 = new xx(i, 27);
        S0 = new xx(i, 28);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xx(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                return kn2.c0(rw4.f(b21.T(220, 90, null, 4), 2).a(rw4.h(b21.T(220, 90, null, 4))), rw4.g(b21.T(90, 0, null, 6), 2));
            case 1:
                return obj;
            case 2:
                return kn2.c0(rw4.f(b21.T(220, 90, null, 4), 2).a(rw4.h(b21.T(220, 90, null, 4))), rw4.g(b21.T(90, 0, null, 6), 2));
            case 3:
                return obj;
            case 4:
                return null;
            case 5:
                return kn2.c0(rw4.f(b21.T(220, 90, null, 4), 2).a(rw4.h(b21.T(220, 90, null, 4))), rw4.g(b21.T(90, 0, null, 6), 2));
            case 6:
                return obj;
            case 7:
                return null;
            case 8:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 9:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return bool2;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return bool3;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                long jA = y72.a(((y72) obj).a, s82.x);
                return new a00(y72.c(jA), y72.g(jA), y72.f(jA), y72.d(jA));
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return obj;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                long j = ((r2f) obj).a;
                return new yz(r2f.b(j), r2f.c(j));
            case 14:
                yz yzVar = (yz) obj;
                return new r2f(sfc.d(yzVar.a, yzVar.b));
            case 15:
                return b21.P(0.0f, 0.0f, 7, null);
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((Number) obj).intValue();
                return 0;
            case 17:
                long j2 = ((e77) obj).a;
                return new e77(0L);
            case 18:
                ((Number) obj).intValue();
                return 0;
            case 19:
                ((Number) obj).intValue();
                return 0;
            case 20:
                long j3 = ((e77) obj).a;
                return new e77(0L);
            case 21:
                ((Number) obj).intValue();
                return 0;
            case 22:
                return Integer.valueOf((-((Number) obj).intValue()) / 2);
            case 23:
                return Integer.valueOf((-((Number) obj).intValue()) / 2);
            case 24:
                long j4 = ((e77) obj).a;
                return new w67(0L);
            case 25:
                e77 e77Var = (e77) obj;
                long j5 = e77Var.a;
                return e77Var;
            case 26:
                return rw4.d;
            case 27:
                return wefVar;
            default:
                sn4.y0((sn4) obj, y72.j, 0L, 0L, 0.0f, null, 0, 126);
                return wefVar;
        }
    }
}
