package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class b4h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ndh b;
    public final /* synthetic */ e5h c;

    public /* synthetic */ b4h(e5h e5hVar, ndh ndhVar, int i) {
        this.a = i;
        this.b = ndhVar;
        this.c = e5hVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.a;
        ndh ndhVar = this.b;
        e5h e5hVar = this.c;
        switch (i) {
            case 0:
                ich ichVar = e5hVar.d;
                ichVar.U();
                ichVar.Z().A0();
                ichVar.m0();
                oa7.A(ndhVar);
                String str = ndhVar.a;
                oa7.x(str);
                int i2 = 0;
                if (ichVar.f0().L0(null, bzg.y0)) {
                    ichVar.E().getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int iJ0 = ichVar.f0().J0(null, bzg.h0);
                    ichVar.f0();
                    long jLongValue = jCurrentTimeMillis - ((Long) bzg.e.a(null)).longValue();
                    while (i2 < iJ0 && ichVar.G(jLongValue, null)) {
                        i2++;
                    }
                } else {
                    ichVar.f0();
                    long jIntValue = ((Integer) bzg.l.a(null)).intValue();
                    while (i2 < jIntValue && ichVar.G(0L, str)) {
                        i2++;
                    }
                }
                if (ichVar.f0().L0(null, bzg.z0)) {
                    ichVar.Z().A0();
                    ichVar.F();
                }
                zbh zbhVar = ichVar.x;
                j4h j4hVarA = j4h.a(ndhVar.T0);
                zbhVar.A0();
                if (j4hVarA == j4h.CLIENT_UPLOAD_ELIGIBLE && !zbh.D0(str)) {
                    y2h y2hVar = zbhVar.c.a;
                    ich.S(y2hVar);
                    d0h d0hVarM0 = y2hVar.M0(str);
                    if (d0hVarM0 != null && d0hVarM0.F() && !d0hVarM0.G().s().isEmpty()) {
                        ichVar.v().Z.b(str, "[sgtm] Going background, trigger client side upload. appId");
                        ichVar.E().getClass();
                        ichVar.m(System.currentTimeMillis(), str);
                        break;
                    }
                }
                break;
            case 1:
                ich ichVar2 = e5hVar.d;
                ichVar2.U();
                if (ichVar2.N0 != null) {
                    ArrayList arrayList = new ArrayList();
                    ichVar2.O0 = arrayList;
                    arrayList.addAll(ichVar2.N0);
                }
                krg krgVar = ichVar2.c;
                ich.S(krgVar);
                w3h w3hVar = (w3h) krgVar.b;
                String str2 = ndhVar.a;
                oa7.A(str2);
                oa7.x(str2);
                krgVar.A0();
                krgVar.B0();
                try {
                    SQLiteDatabase sQLiteDatabaseR1 = krgVar.r1();
                    String[] strArr = {str2};
                    int iDelete = sQLiteDatabaseR1.delete("apps", "app_id=?", strArr) + sQLiteDatabaseR1.delete("events", "app_id=?", strArr) + sQLiteDatabaseR1.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseR1.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseR1.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseR1.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseR1.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseR1.delete("queue", "app_id=?", strArr) + sQLiteDatabaseR1.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseR1.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseR1.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseR1.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseR1.delete("upload_queue", "app_id=?", strArr);
                    ((epg) dpg.b.a.get()).getClass();
                    if (w3hVar.d.L0(null, bzg.c1)) {
                        iDelete += sQLiteDatabaseR1.delete("no_data_mode_events", "app_id=?", strArr);
                    }
                    int iDelete2 = iDelete + sQLiteDatabaseR1.delete("diagnostic_signals", "app_id=?", strArr);
                    if (iDelete2 > 0) {
                        w0h w0hVar = w3hVar.f;
                        w3h.h(w0hVar);
                        w0hVar.Z.c(str2, Integer.valueOf(iDelete2), "Reset analytics data. app, records");
                    }
                } catch (SQLiteException e) {
                    w0h w0hVar2 = w3hVar.f;
                    w3h.h(w0hVar2);
                    w0hVar2.g.c(w0h.E0(str2), e, "Error resetting analytics data. appId, error");
                }
                if (ndhVar.v) {
                    ichVar2.X(ndhVar);
                }
                break;
            default:
                ich ichVar3 = e5hVar.d;
                ichVar3.U();
                ichVar3.n0(ndhVar);
                break;
        }
    }
}
