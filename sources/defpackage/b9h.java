package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class b9h extends fzg {
    public final Object X;
    public volatile t8h d;
    public volatile t8h e;
    public t8h f;
    public final ConcurrentHashMap g;
    public iwg v;
    public volatile boolean w;
    public volatile t8h x;
    public t8h y;
    public boolean z;

    public b9h(w3h w3hVar) {
        super(w3hVar);
        this.X = new Object();
        this.g = new ConcurrentHashMap();
    }

    @Override // defpackage.fzg
    public final boolean D0() {
        return false;
    }

    public final t8h E0(boolean z) {
        B0();
        A0();
        t8h t8hVar = this.f;
        return (z && t8hVar == null) ? this.y : t8hVar;
    }

    public final String F0(String str) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str2 = length > 0 ? strArrSplit[length - 1] : "";
        w3h w3hVar = (w3h) this.b;
        int length2 = str2.length();
        w3hVar.d.getClass();
        if (length2 <= 500) {
            return str2;
        }
        w3hVar.d.getClass();
        return str2.substring(0, 500);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0033  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b5  */
    public final void G0(t8h t8hVar, t8h t8hVar2, long j, boolean z, Bundle bundle) {
        boolean z2;
        long j2;
        Bundle bundle2;
        boolean z3 = t8hVar.e;
        w3h w3hVar = (w3h) this.b;
        A0();
        boolean z4 = false;
        if (t8hVar2 != null) {
            if (t8hVar2.c == t8hVar.c && Objects.equals(t8hVar2.b, t8hVar.b) && Objects.equals(t8hVar2.a, t8hVar.a)) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = true;
        }
        if (z && this.f != null) {
            z4 = true;
        }
        if (z2) {
            Bundle bundle3 = bundle != null ? new Bundle(bundle) : new Bundle();
            qch.x1(t8hVar, bundle3, true);
            if (t8hVar2 != null) {
                String str = t8hVar2.a;
                if (str != null) {
                    bundle3.putString("_pn", str);
                }
                String str2 = t8hVar2.b;
                if (str2 != null) {
                    bundle3.putString("_pc", str2);
                }
                bundle3.putLong("_pi", t8hVar2.c);
            }
            if (z4) {
                ebh ebhVar = w3hVar.v;
                w3h.g(ebhVar);
                y21 y21Var = ebhVar.g;
                long j3 = j - y21Var.b;
                y21Var.b = j;
                if (j3 > 0) {
                    qch qchVar = w3hVar.w;
                    w3h.f(qchVar);
                    qchVar.n1(bundle3, j3);
                }
            }
            qqg qqgVar = w3hVar.d;
            hj6 hj6Var = w3hVar.y;
            if (!qqgVar.P0()) {
                bundle3.putLong("_mst", 1L);
            }
            String str3 = true != z3 ? "auto" : "app";
            hj6Var.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (z3) {
                long j4 = t8hVar.f;
                if (j4 != 0) {
                    j2 = j4;
                } else {
                    j2 = jCurrentTimeMillis;
                }
            } else {
                j2 = jCurrentTimeMillis;
            }
            long jElapsedRealtime = w3hVar.d.L0(null, bzg.e1) ? SystemClock.elapsedRealtime() : 0L;
            if (z3) {
                bundle2 = bundle3;
                long j5 = t8hVar.g;
                if (j5 != 0) {
                    jElapsedRealtime = j5;
                }
            } else {
                bundle2 = bundle3;
            }
            c8h c8hVar = w3hVar.X;
            w3h.g(c8hVar);
            c8hVar.I0(j2, jElapsedRealtime, bundle2, str3, "_vs");
        }
        if (z4) {
            J0(this.f, true, j);
        }
        this.f = t8hVar;
        if (z3) {
            this.y = t8hVar;
        }
        lah lahVarJ = w3hVar.j();
        lahVarJ.A0();
        lahVarJ.B0();
        lahVarJ.O0(new n6h(lahVarJ, t8hVar));
    }

    public final void H0(iwg iwgVar, Bundle bundle) {
        Bundle bundle2;
        if (!((w3h) this.b).d.P0() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.g.put(Integer.valueOf(iwgVar.a), new t8h(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void I0(String str, t8h t8hVar, boolean z) {
        t8h t8hVar2;
        t8h t8hVar3 = this.d == null ? this.e : this.d;
        if (t8hVar.b == null) {
            String strF0 = str != null ? F0(str) : null;
            t8hVar2 = new t8h(t8hVar.c, t8hVar.f, t8hVar.g, t8hVar.a, strF0, t8hVar.e);
        } else {
            t8hVar2 = t8hVar;
        }
        this.e = this.d;
        this.d = t8hVar2;
        w3h w3hVar = (w3h) this.b;
        w3hVar.y.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        m3h m3hVar = w3hVar.g;
        w3h.h(m3hVar);
        m3hVar.J0(new u8h(this, t8hVar2, t8hVar3, jElapsedRealtime, z));
    }

    public final void J0(t8h t8hVar, boolean z, long j) {
        w3h w3hVar = (w3h) this.b;
        bwg bwgVar = w3hVar.Y;
        w3h.e(bwgVar);
        w3hVar.y.getClass();
        bwgVar.D0(SystemClock.elapsedRealtime());
        boolean z2 = t8hVar != null && t8hVar.d;
        ebh ebhVar = w3hVar.v;
        w3h.g(ebhVar);
        if (!ebhVar.g.n(j, z2, z) || t8hVar == null) {
            return;
        }
        t8hVar.d = false;
    }

    public final t8h K0(iwg iwgVar) {
        oa7.A(iwgVar);
        Integer numValueOf = Integer.valueOf(iwgVar.a);
        ConcurrentHashMap concurrentHashMap = this.g;
        t8h t8hVar = (t8h) concurrentHashMap.get(numValueOf);
        if (t8hVar == null) {
            String strF0 = F0(iwgVar.b);
            qch qchVar = ((w3h) this.b).w;
            w3h.f(qchVar);
            t8h t8hVar2 = new t8h(null, strF0, qchVar.z1());
            concurrentHashMap.put(numValueOf, t8hVar2);
            t8hVar = t8hVar2;
        }
        return this.x != null ? this.x : t8hVar;
    }
}
