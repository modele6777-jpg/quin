package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o82 {
    public static final pr4 a = new pr4(1, new r02(11));
    public static final pr4 b = new pr4(1, new r02(12));

    public static final long a(m82 m82Var, long j) {
        long j2 = m82Var.a;
        long j3 = m82Var.U;
        long j4 = m82Var.Q;
        long j5 = m82Var.M;
        long j6 = m82Var.q;
        int i = y72.l;
        if (faf.a(j, j2)) {
            return m82Var.b;
        }
        if (faf.a(j, m82Var.f)) {
            return m82Var.g;
        }
        if (faf.a(j, m82Var.j)) {
            return m82Var.k;
        }
        if (faf.a(j, m82Var.n)) {
            return m82Var.o;
        }
        if (faf.a(j, m82Var.w)) {
            return m82Var.x;
        }
        if (faf.a(j, m82Var.c)) {
            return m82Var.d;
        }
        if (faf.a(j, m82Var.h)) {
            return m82Var.i;
        }
        if (faf.a(j, m82Var.l)) {
            return m82Var.m;
        }
        if (faf.a(j, m82Var.y)) {
            return m82Var.z;
        }
        if (faf.a(j, m82Var.u)) {
            return m82Var.v;
        }
        if (!faf.a(j, m82Var.p)) {
            if (faf.a(j, m82Var.r)) {
                return m82Var.s;
            }
            if (!faf.a(j, m82Var.D) && !faf.a(j, m82Var.F) && !faf.a(j, m82Var.G) && !faf.a(j, m82Var.H) && !faf.a(j, m82Var.I) && !faf.a(j, m82Var.J) && !faf.a(j, m82Var.E)) {
                if (faf.a(j, m82Var.K) || faf.a(j, m82Var.L)) {
                    return j5;
                }
                if (faf.a(j, m82Var.O) || faf.a(j, m82Var.P)) {
                    return j4;
                }
                return (faf.a(j, m82Var.S) || faf.a(j, m82Var.T)) ? j3 : y72.k;
            }
        }
        return j6;
    }

    public static final long b(long j, l46 l46Var) {
        l46Var.f0(89374938);
        long jA = a((m82) l46Var.k(a), j);
        if (jA == 16) {
            jA = ((y72) l46Var.k(em2.a)).a;
        }
        l46Var.r(false);
        return jA;
    }

    public static final long c(m82 m82Var, n82 n82Var) {
        switch (n82Var.ordinal()) {
            case 0:
                return m82Var.n;
            case 1:
                return m82Var.w;
            case 2:
                return m82Var.y;
            case 3:
                return m82Var.v;
            case 4:
                return m82Var.e;
            case 5:
                return m82Var.u;
            case 6:
                return m82Var.o;
            case 7:
                return m82Var.x;
            case 8:
                return m82Var.z;
            case 9:
                return m82Var.b;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return m82Var.d;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return m82Var.M;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return m82Var.N;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return m82Var.g;
            case 14:
                return m82Var.i;
            case 15:
                return m82Var.Q;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return m82Var.R;
            case 17:
                return m82Var.q;
            case 18:
                return m82Var.s;
            case 19:
                return m82Var.k;
            case 20:
                return m82Var.m;
            case 21:
                return m82Var.U;
            case 22:
                return m82Var.V;
            case 23:
                return m82Var.A;
            case 24:
                return m82Var.B;
            case 25:
                return m82Var.a;
            case 26:
                return m82Var.c;
            case 27:
                return m82Var.K;
            case 28:
                return m82Var.L;
            case 29:
                return m82Var.C;
            case 30:
                return m82Var.f;
            case 31:
                return m82Var.h;
            case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                return m82Var.O;
            case 33:
                return m82Var.P;
            case 34:
                return m82Var.p;
            case 35:
                return m82Var.D;
            case 36:
                return m82Var.F;
            case 37:
                return m82Var.G;
            case 38:
                return m82Var.H;
            case 39:
                return m82Var.I;
            case 40:
                return m82Var.J;
            case 41:
                return m82Var.E;
            case 42:
                return m82Var.t;
            case 43:
                return m82Var.r;
            case 44:
                return m82Var.j;
            case 45:
                return m82Var.l;
            case 46:
                return m82Var.S;
            case 47:
                return m82Var.T;
            default:
                ap.c();
                return 0L;
        }
    }

    public static final long d(n82 n82Var, l46 l46Var) {
        return c((m82) l46Var.k(a), n82Var);
    }

    public static m82 e(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, int i) {
        long j31 = (i & 1) != 0 ? h82.z : j;
        return new m82(j31, (i & 2) != 0 ? h82.j : j2, (i & 4) != 0 ? h82.A : j3, (i & 8) != 0 ? h82.k : j4, (i & 16) != 0 ? h82.e : j5, (i & 32) != 0 ? h82.E : j6, (i & 64) != 0 ? h82.n : j7, (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? h82.F : j8, (i & 256) != 0 ? h82.o : j9, (i & 512) != 0 ? h82.R : j10, (i & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? h82.t : j11, (i & 2048) != 0 ? h82.S : j12, (i & 4096) != 0 ? h82.u : j13, (i & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? h82.a : j14, (i & 16384) != 0 ? h82.g : j15, (32768 & i) != 0 ? h82.I : j16, (65536 & i) != 0 ? h82.r : j17, (131072 & i) != 0 ? h82.Q : j18, (262144 & i) != 0 ? h82.s : j19, (524288 & i) != 0 ? j31 : j20, (1048576 & i) != 0 ? h82.f : j21, (2097152 & i) != 0 ? h82.d : j22, (4194304 & i) != 0 ? h82.b : j23, (8388608 & i) != 0 ? h82.h : j24, (16777216 & i) != 0 ? h82.c : j25, (33554432 & i) != 0 ? h82.i : j26, (67108864 & i) != 0 ? h82.x : j27, (134217728 & i) != 0 ? h82.y : j28, (268435456 & i) != 0 ? h82.D : j29, h82.J, h82.P, (i & 1073741824) != 0 ? h82.K : j30, h82.L, h82.M, h82.N, h82.O, h82.B, h82.C, h82.l, h82.m, h82.G, h82.H, h82.p, h82.q, h82.T, h82.U, h82.v, h82.w);
    }
}
