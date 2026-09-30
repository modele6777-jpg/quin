package defpackage;

import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yl {
    public final /* synthetic */ int a;
    public long b;
    public long c;
    public long d;
    public final Object e;
    public Object f;
    public Object g;
    public final Object h;

    public yl(w3h w3hVar, String str, String str2, String str3, long j, long j2, long j3, Bundle bundle) {
        esg esgVar;
        this.a = 1;
        oa7.x(str2);
        oa7.x(str3);
        this.e = str2;
        this.f = str3;
        this.g = true == TextUtils.isEmpty(str) ? null : str;
        this.b = j;
        this.c = j2;
        this.d = j3;
        if (j3 != 0 && j3 > j) {
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.x.b(w0h.E0(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle == null || bundle.isEmpty()) {
            esgVar = new esg(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    w0h w0hVar2 = w3hVar.f;
                    w3h.h(w0hVar2);
                    w0hVar2.g.a("Param name can't be null");
                    it.remove();
                } else {
                    qch qchVar = w3hVar.w;
                    w3h.f(qchVar);
                    Object objJ0 = qchVar.J0(bundle2.get(next), next);
                    if (objJ0 == null) {
                        w0h w0hVar3 = w3hVar.f;
                        w3h.h(w0hVar3);
                        w0hVar3.x.b(w3hVar.x.b(next), "Param value can't be null");
                        it.remove();
                    } else {
                        qch qchVar2 = w3hVar.w;
                        w3h.f(qchVar2);
                        qchVar2.R0(bundle2, next, objJ0);
                    }
                }
            }
            esgVar = new esg(bundle2);
        }
        this.h = esgVar;
    }

    public void a(Message message) {
        synchronized (this.e) {
            try {
                xl xlVar = (xl) this.f;
                if (xlVar == null) {
                    zl.d("Dead mixpanel worker dropping a message: " + message.what);
                } else {
                    xlVar.sendMessage(message);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.b;
        long j2 = 1 + j;
        long j3 = this.d;
        if (j3 > 0) {
            long j4 = ((this.c * j) + (jCurrentTimeMillis - j3)) / j2;
            this.c = j4;
            zl.d("Average send frequency approximately " + (j4 / 1000) + " seconds.");
        }
        this.d = jCurrentTimeMillis;
        this.b = j2;
    }

    public yl c(w3h w3hVar, long j) {
        return new yl(w3hVar, (String) this.g, (String) this.e, (String) this.f, this.b, this.c, j, (esg) this.h);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                String string = ((esg) this.h).a.toString();
                String str = (String) this.e;
                int length = String.valueOf(str).length();
                String str2 = (String) this.f;
                StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + string.length() + 1);
                ub3.v(sb, "Event{appId='", str, "', name='", str2);
                return ib8.m(sb, "', params=", string, "}");
            default:
                return super.toString();
        }
    }

    public yl(w3h w3hVar, String str, String str2, String str3, long j, long j2, long j3, esg esgVar) {
        this.a = 1;
        oa7.x(str2);
        oa7.x(str3);
        this.e = str2;
        this.f = str3;
        this.g = true == TextUtils.isEmpty(str) ? null : str;
        this.b = j;
        this.c = j2;
        this.d = j3;
        if (j3 != 0 && j3 > j) {
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.x.c(w0h.E0(str2), w0h.E0(str3), "Event created with reverse previous/current timestamps. appId, name");
        }
        this.h = esgVar;
    }

    public yl(zl zlVar) {
        this.a = 0;
        this.h = zlVar;
        this.e = new Object();
        this.b = 0L;
        this.c = 0L;
        this.d = -1L;
        HandlerThread handlerThread = new HandlerThread("com.mixpanel.android.AnalyticsWorker", 10);
        handlerThread.start();
        this.f = new xl(this, handlerThread.getLooper());
    }
}
