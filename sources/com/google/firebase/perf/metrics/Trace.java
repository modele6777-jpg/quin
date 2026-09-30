package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import defpackage.ct;
import defpackage.dl2;
import defpackage.e4f;
import defpackage.g5b;
import defpackage.gb0;
import defpackage.hb0;
import defpackage.i8c;
import defpackage.ib8;
import defpackage.ji2;
import defpackage.k8a;
import defpackage.ks0;
import defpackage.n8a;
import defpackage.oye;
import defpackage.qc0;
import defpackage.rz9;
import defpackage.tec;
import defpackage.tzc;
import defpackage.vw2;
import io.sentry.android.core.b1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class Trace extends hb0 implements Parcelable, tzc {
    public static final Parcelable.Creator<Trace> CREATOR;
    public static final ct X = ct.d();
    public final WeakReference a;
    public final Trace b;
    public final GaugeManager c;
    public final String d;
    public final ConcurrentHashMap e;
    public final ConcurrentHashMap f;
    public final List g;
    public final ArrayList v;
    public final e4f w;
    public final i8c x;
    public oye y;
    public oye z;

    static {
        new ConcurrentHashMap();
        CREATOR = new rz9(12);
    }

    public Trace(Parcel parcel, boolean z) {
        super(z ? null : gb0.a());
        this.a = new WeakReference(this);
        this.b = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.d = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.v = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.e = concurrentHashMap;
        this.f = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, vw2.class.getClassLoader());
        this.y = (oye) parcel.readParcelable(oye.class.getClassLoader());
        this.z = (oye) parcel.readParcelable(oye.class.getClassLoader());
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        this.g = listSynchronizedList;
        parcel.readList(listSynchronizedList, n8a.class.getClassLoader());
        if (z) {
            this.w = null;
            this.x = null;
            this.c = null;
        } else {
            this.w = e4f.H0;
            this.x = new i8c(18);
            this.c = GaugeManager.getInstance();
        }
    }

    @Override // defpackage.tzc
    public final void a(n8a n8aVar) {
        if (n8aVar == null) {
            X.f("Unable to add new SessionId to the Trace. Continuing without it.");
        } else {
            if (this.y == null || b()) {
                return;
            }
            this.g.add(n8aVar);
        }
    }

    public final boolean b() {
        return this.z != null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void finalize() throws Throwable {
        try {
            if ((this.y != null) && !b()) {
                X.g("Trace '%s' is started but not stopped when it is destructed!", this.d);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    public String getAttribute(String str) {
        return (String) this.f.get(str);
    }

    public Map<String, String> getAttributes() {
        return new HashMap(this.f);
    }

    public long getLongMetric(String str) {
        vw2 vw2Var = str != null ? (vw2) this.e.get(str.trim()) : null;
        if (vw2Var == null) {
            return 0L;
        }
        return vw2Var.b.get();
    }

    public void incrementMetric(String str, long j) {
        String strC = k8a.c(str);
        ct ctVar = X;
        if (strC != null) {
            ctVar.c("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, strC);
            return;
        }
        oye oyeVar = this.y;
        String str2 = this.d;
        if (oyeVar == null) {
            ctVar.g("Cannot increment metric '%s' for trace '%s' because it's not started", str, str2);
            return;
        }
        if (b()) {
            ctVar.g("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, str2);
            return;
        }
        String strTrim = str.trim();
        ConcurrentHashMap concurrentHashMap = this.e;
        vw2 vw2Var = (vw2) concurrentHashMap.get(strTrim);
        if (vw2Var == null) {
            vw2Var = new vw2(strTrim);
            concurrentHashMap.put(strTrim, vw2Var);
        }
        AtomicLong atomicLong = vw2Var.b;
        atomicLong.addAndGet(j);
        if (ctVar.a) {
            StringBuilder sbP = tec.p("Incrementing metric '", str, "' to ");
            sbP.append(atomicLong.get());
            sbP.append(" on trace '");
            sbP.append(str2);
            sbP.append("'");
            ctVar.a(sbP.toString());
        }
    }

    public void putAttribute(String str, String str2) {
        boolean z;
        ConcurrentHashMap concurrentHashMap = this.f;
        ct ctVar = X;
        try {
            str = str.trim();
            str2 = str2.trim();
            boolean zB = b();
            String str3 = this.d;
            if (zB) {
                Locale locale = Locale.ENGLISH;
                qc0.j(ib8.j("Trace '", str3, "' has been stopped"));
            } else if (concurrentHashMap.containsKey(str) || concurrentHashMap.size() < 5) {
                k8a.b(str, str2);
            } else {
                Locale locale2 = Locale.ENGLISH;
                qc0.j("Exceeds max limit of number of attributes - 5");
            }
            ctVar.b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, str3);
            z = true;
        } catch (Exception e) {
            ctVar.c("Can not set attribute '%s' with value '%s' (%s)", str, str2, e.getMessage());
            z = false;
        }
        if (z) {
            concurrentHashMap.put(str, str2);
        }
    }

    public void putMetric(String str, long j) {
        String strC = k8a.c(str);
        ct ctVar = X;
        if (strC != null) {
            ctVar.c("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, strC);
            return;
        }
        oye oyeVar = this.y;
        String str2 = this.d;
        if (oyeVar == null) {
            ctVar.g("Cannot set value for metric '%s' for trace '%s' because it's not started", str, str2);
            return;
        }
        if (b()) {
            ctVar.g("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, str2);
            return;
        }
        String strTrim = str.trim();
        ConcurrentHashMap concurrentHashMap = this.e;
        vw2 vw2Var = (vw2) concurrentHashMap.get(strTrim);
        if (vw2Var == null) {
            vw2Var = new vw2(strTrim);
            concurrentHashMap.put(strTrim, vw2Var);
        }
        vw2Var.b.set(j);
        ctVar.b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j), str2);
    }

    public void removeAttribute(String str) {
        if (!b()) {
            this.f.remove(str);
        } else if (X.a) {
            b1.d("FirebasePerformance", "Can't remove a attribute from a Trace that's stopped.");
        }
    }

    public void start() {
        String str;
        boolean zN = ji2.e().n();
        ct ctVar = X;
        if (!zN) {
            ctVar.a("Trace feature is disabled.");
            return;
        }
        Pattern pattern = k8a.a;
        String str2 = this.d;
        if (str2 != null) {
            if (str2.length() <= 100) {
                if (!str2.startsWith("_")) {
                    str = null;
                    break;
                }
                dl2[] dl2VarArrValues = dl2.values();
                int length = dl2VarArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        if (!str2.startsWith("_st_")) {
                            str = "Trace name must not start with '_'";
                            break;
                        }
                        break;
                    } else if (!dl2VarArrValues[i].toString().equals(str2)) {
                        i++;
                    }
                    str = null;
                    break;
                }
            } else {
                Locale locale = Locale.US;
                str = "Trace name must not exceed 100 characters";
            }
        } else {
            str = "Trace name must not be null";
        }
        if (str != null) {
            ctVar.c("Cannot start trace '%s'. Trace name is invalid.(%s)", str2, str);
            return;
        }
        if (this.y != null) {
            ctVar.c("Trace '%s' has already started, should not start again!", str2);
            return;
        }
        this.x.getClass();
        this.y = new oye();
        registerForAppState();
        n8a n8aVarPerfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.a);
        a(n8aVarPerfSession);
        if (n8aVarPerfSession.c) {
            this.c.collectGaugeMetricOnce(n8aVarPerfSession.b);
        }
    }

    public void stop() {
        oye oyeVar = this.y;
        String str = this.d;
        ct ctVar = X;
        if (oyeVar == null) {
            ctVar.c("Trace '%s' has not been started so unable to stop!", str);
            return;
        }
        if (b()) {
            ctVar.c("Trace '%s' has already stopped, should not stop again!", str);
            return;
        }
        SessionManager.getInstance().unregisterForSessionUpdates(this.a);
        unregisterForAppState();
        this.x.getClass();
        oye oyeVar2 = new oye();
        this.z = oyeVar2;
        if (this.b == null) {
            ArrayList arrayList = this.v;
            if (!arrayList.isEmpty()) {
                Trace trace = (Trace) ks0.f(1, arrayList);
                if (trace.z == null) {
                    trace.z = oyeVar2;
                }
            }
            if (str.isEmpty()) {
                if (ctVar.a) {
                    b1.d("FirebasePerformance", "Trace name is empty, no log is sent to server");
                    return;
                }
                return;
            }
            this.w.c(new g5b(11, this).k(), getAppState());
            if (SessionManager.getInstance().perfSession().c) {
                this.c.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().b);
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, 0);
        parcel.writeString(this.d);
        parcel.writeList(this.v);
        parcel.writeMap(this.e);
        parcel.writeParcelable(this.y, 0);
        parcel.writeParcelable(this.z, 0);
        synchronized (this.g) {
            parcel.writeList(this.g);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Trace(String str, e4f e4fVar, i8c i8cVar, gb0 gb0Var) {
        super(gb0Var);
        GaugeManager gaugeManager = GaugeManager.getInstance();
        this.a = new WeakReference(this);
        this.b = null;
        this.d = str.trim();
        this.v = new ArrayList();
        this.e = new ConcurrentHashMap();
        this.f = new ConcurrentHashMap();
        this.x = i8cVar;
        this.w = e4fVar;
        this.g = Collections.synchronizedList(new ArrayList());
        this.c = gaugeManager;
    }
}
