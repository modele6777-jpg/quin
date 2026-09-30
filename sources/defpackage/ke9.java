package defpackage;

import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ke9 extends hb0 implements tzc {
    public static final ct v = ct.d();
    public final List a;
    public final GaugeManager b;
    public final e4f c;
    public final fe9 d;
    public final WeakReference e;
    public String f;
    public boolean g;

    /* JADX WARN: Illegal instructions before constructor call */
    public ke9(e4f e4fVar) {
        gb0 gb0VarA = gb0.a();
        GaugeManager gaugeManager = GaugeManager.getInstance();
        super(gb0VarA);
        this.d = je9.M();
        this.e = new WeakReference(this);
        this.c = e4fVar;
        this.b = gaugeManager;
        this.a = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }

    @Override // defpackage.tzc
    public final void a(n8a n8aVar) {
        if (n8aVar == null) {
            v.f("Unable to add new SessionId to the Network Trace. Continuing without it.");
            return;
        }
        fe9 fe9Var = this.d;
        if (!((je9) fe9Var.b).E() || ((je9) fe9Var.b).K()) {
            return;
        }
        this.a.add(n8aVar);
    }

    public final void b() {
        List listUnmodifiableList;
        SessionManager.getInstance().unregisterForSessionUpdates(this.e);
        unregisterForAppState();
        synchronized (this.a) {
            try {
                ArrayList arrayList = new ArrayList();
                for (n8a n8aVar : this.a) {
                    if (n8aVar != null) {
                        arrayList.add(n8aVar);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        m8a[] m8aVarArrB = n8a.b(listUnmodifiableList);
        if (m8aVarArrB != null) {
            fe9 fe9Var = this.d;
            List listAsList = Arrays.asList(m8aVarArrB);
            fe9Var.i();
            ((je9) fe9Var.b).r(listAsList);
        }
        je9 je9Var = (je9) this.d.h();
        String str = this.f;
        if (str == null) {
            Pattern pattern = le9.a;
        } else if (le9.a.matcher(str).matches()) {
            v.a("Dropping network request from a 'User-Agent' that is not allowed");
            return;
        }
        if (this.g) {
            return;
        }
        e4f e4fVar = this.c;
        e4fVar.w.execute(new qae(e4fVar, je9Var, getAppState(), 3));
        this.g = true;
    }

    public final void c(String str) {
        he9 he9Var;
        if (str != null) {
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            switch (upperCase) {
                case "OPTIONS":
                    he9Var = he9.OPTIONS;
                    break;
                case "GET":
                    he9Var = he9.GET;
                    break;
                case "PUT":
                    he9Var = he9.PUT;
                    break;
                case "HEAD":
                    he9Var = he9.HEAD;
                    break;
                case "POST":
                    he9Var = he9.POST;
                    break;
                case "PATCH":
                    he9Var = he9.PATCH;
                    break;
                case "TRACE":
                    he9Var = he9.TRACE;
                    break;
                case "CONNECT":
                    he9Var = he9.CONNECT;
                    break;
                case "DELETE":
                    he9Var = he9.DELETE;
                    break;
                default:
                    he9Var = he9.HTTP_METHOD_UNKNOWN;
                    break;
            }
            fe9 fe9Var = this.d;
            fe9Var.i();
            ((je9) fe9Var.b).O(he9Var);
        }
    }

    public final void d(int i) {
        fe9 fe9Var = this.d;
        fe9Var.i();
        ((je9) fe9Var.b).P(i);
    }

    public final void e(long j) {
        fe9 fe9Var = this.d;
        fe9Var.i();
        ((je9) fe9Var.b).R(j);
    }

    public final void f(long j) {
        n8a n8aVarPerfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.e);
        fe9 fe9Var = this.d;
        fe9Var.i();
        ((je9) fe9Var.b).N(j);
        a(n8aVarPerfSession);
        if (n8aVarPerfSession.c) {
            this.b.collectGaugeMetricOnce(n8aVarPerfSession.b);
        }
    }

    public final void g(String str) {
        fe9 fe9Var = this.d;
        if (str == null) {
            fe9Var.i();
            ((je9) fe9Var.b).s();
            return;
        }
        if (str.length() <= 128) {
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt > 31 && cCharAt <= 127) {
                }
            }
            fe9Var.i();
            ((je9) fe9Var.b).S(str);
            return;
        }
        v.f("The content type of the response is not a valid content-type:".concat(str));
    }

    public final void h(long j) {
        fe9 fe9Var = this.d;
        fe9Var.i();
        ((je9) fe9Var.b).T(j);
    }

    public final void i(long j) {
        fe9 fe9Var = this.d;
        fe9Var.i();
        ((je9) fe9Var.b).V(j);
        if (SessionManager.getInstance().perfSession().c) {
            this.b.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().b);
        }
    }

    public final void j(String str) {
        ct6 ct6VarA;
        int iLastIndexOf;
        if (str != null) {
            ct6 ct6VarA2 = null;
            try {
                bt6 bt6Var = new bt6();
                bt6Var.d(null, str);
                ct6VarA = bt6Var.a();
            } catch (IllegalArgumentException unused) {
                ct6VarA = null;
            }
            if (ct6VarA != null) {
                bt6 bt6VarG = ct6VarA.g();
                bt6VarG.f = n16.x(0, 0, 123, "", " \"':;<=>@[]^`{}|/\\?#");
                bt6VarG.g = n16.x(0, 0, 123, "", " \"':;<=>@[]^`{}|/\\?#");
                bt6VarG.c = null;
                bt6VarG.i = null;
                str = bt6VarG.toString();
            }
            if (str.length() > 2000) {
                if (str.charAt(2000) == '/') {
                    str = str.substring(0, 2000);
                } else {
                    try {
                        bt6 bt6Var2 = new bt6();
                        bt6Var2.d(null, str);
                        ct6VarA2 = bt6Var2.a();
                    } catch (IllegalArgumentException unused2) {
                    }
                    str = (ct6VarA2 != null && ct6VarA2.b().lastIndexOf(47) >= 0 && (iLastIndexOf = str.lastIndexOf(47, 1999)) >= 0) ? str.substring(0, iLastIndexOf) : str.substring(0, 2000);
                }
            }
            fe9 fe9Var = this.d;
            fe9Var.i();
            ((je9) fe9Var.b).X(str);
        }
    }
}
