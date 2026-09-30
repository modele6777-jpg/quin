package defpackage;

import android.util.Log;
import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ldd {
    public final m1d a;
    public final t0d b;
    public final s0d c;
    public final yxe d;
    public final fc3 e;
    public final iva f;
    public final pv2 g;
    public j0d h;
    public boolean i;
    public boolean j;
    public String k;

    public ldd(m1d m1dVar, t0d t0dVar, s0d s0dVar, yxe yxeVar, fc3 fc3Var, iva ivaVar, pv2 pv2Var) {
        m1dVar.getClass();
        t0dVar.getClass();
        s0dVar.getClass();
        yxeVar.getClass();
        fc3Var.getClass();
        ivaVar.getClass();
        pv2Var.getClass();
        this.a = m1dVar;
        this.b = t0dVar;
        this.c = s0dVar;
        this.d = yxeVar;
        this.e = fc3Var;
        this.f = ivaVar;
        this.g = pv2Var;
        this.k = "";
        ynb.V(jgb.k(pv2Var), null, null, new edd(this, null), 3);
    }

    public final void a() {
        this.i = false;
        if (this.h == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.f.a());
        ynb.V(jgb.k(this.g), null, null, new hdd(this, null), 3);
    }

    public final void b() {
        this.i = true;
        j0d j0dVar = this.h;
        if (j0dVar == null) {
            this.j = true;
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
        } else {
            if (j0dVar == null) {
                pa7.g0("localSessionData");
                throw null;
            }
            Log.d("FirebaseSessions", "App foregrounded on " + this.f.a());
            if (d(j0dVar) || c(j0dVar)) {
                ynb.V(jgb.k(this.g), null, null, new jdd(this, j0dVar, null), 3);
            }
        }
    }

    public final boolean c(j0d j0dVar) {
        Map map = j0dVar.c;
        boolean z = true;
        iva ivaVar = this.f;
        if (map == null) {
            Log.d("FirebaseSessions", "No process data for " + ivaVar.a());
            return true;
        }
        ivaVar.getClass();
        gva gvaVar = (gva) map.get(ivaVar.a());
        if (gvaVar != null && gvaVar.a == ivaVar.c && pa7.t(gvaVar.b, (String) ivaVar.d.getValue())) {
            z = false;
        }
        if (z) {
            Log.d("FirebaseSessions", "Process " + ivaVar.a() + " is stale");
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    /* JADX WARN: Code duplicated, block: B:18:0x004f  */
    public final boolean d(j0d j0dVar) {
        ar4 ar4VarC;
        long jT;
        jxe jxeVar = j0dVar.b;
        n0d n0dVar = j0dVar.a;
        if (jxeVar == null) {
            Log.d("FirebaseSessions", "Session " + n0dVar.a + " has not backgrounded yet");
            return false;
        }
        this.d.getClass();
        jxe jxeVarA = yxe.a();
        qfc qfcVar = ar4.b;
        long jU = y41.U(jxeVarA.a - jxeVar.a, gr4.MILLISECONDS);
        m1d m1dVar = this.a;
        ar4 ar4VarC2 = m1dVar.a.c();
        if (ar4VarC2 != null) {
            jT = ar4VarC2.a;
            if (jT <= 0 || ar4.f(jT)) {
                ar4VarC = m1dVar.b.c();
                if (ar4VarC != null) {
                    jT = ar4VarC.a;
                    if (jT > 0 || ar4.f(jT)) {
                        jT = y41.T(30, gr4.MINUTES);
                    }
                } else {
                    jT = y41.T(30, gr4.MINUTES);
                }
            }
        } else {
            ar4VarC = m1dVar.b.c();
            if (ar4VarC != null) {
                jT = ar4VarC.a;
                if (jT > 0) {
                    jT = y41.T(30, gr4.MINUTES);
                } else {
                    jT = y41.T(30, gr4.MINUTES);
                }
            } else {
                jT = y41.T(30, gr4.MINUTES);
            }
        }
        boolean z = ar4.c(jU, jT) > 0;
        if (z) {
            Log.d("FirebaseSessions", "Session " + n0dVar.a + " is expired");
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, fdd fddVar, xn2 xn2Var) {
        kdd kddVar;
        String str2;
        if (xn2Var instanceof kdd) {
            kddVar = (kdd) xn2Var;
            int i = kddVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kddVar.label = i - Integer.MIN_VALUE;
            } else {
                kddVar = new kdd(this, xn2Var);
            }
        } else {
            kddVar = new kdd(this, xn2Var);
        }
        Object objB = kddVar.result;
        int i2 = kddVar.label;
        if (i2 == 0) {
            jzb.q(objB);
            if (!pa7.t(this.k, str)) {
                this.k = str;
                xg5 xg5Var = xg5.a;
                kddVar.L$0 = str;
                kddVar.L$1 = fddVar;
                kddVar.label = 1;
                objB = xg5Var.b(kddVar);
                bw2 bw2Var = bw2.a;
                if (objB == bw2Var) {
                    return bw2Var;
                }
            }
            return wef.a;
        }
        if (i2 != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        fddVar = (fdd) kddVar.L$1;
        str = (String) kddVar.L$0;
        jzb.q(objB);
        for (CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber : ((Map) objB).values()) {
            crashlyticsAppQualitySessionsSubscriber.onSessionChanged(new i1d(str));
            int iOrdinal = fddVar.ordinal();
            if (iOrdinal == 0) {
                str2 = "Notified " + crashlyticsAppQualitySessionsSubscriber.getSessionSubscriberName() + " of new session " + str;
            } else {
                if (iOrdinal != 1) {
                    ap.c();
                    return null;
                }
                str2 = "Notified " + crashlyticsAppQualitySessionsSubscriber.getSessionSubscriberName() + " of new fallback session " + str;
            }
            Log.d("FirebaseSessions", str2);
        }
        return wef.a;
    }
}
