package defpackage;

import android.content.Context;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class e4f implements fb0 {
    public static final ct G0 = ct.d();
    public static final e4f H0 = new e4f();
    public String E0;
    public gb0 X;
    public vb0 Y;
    public String Z;
    public final ConcurrentHashMap a;
    public ff5 d;
    public cg5 e;
    public of5 f;
    public i1b g;
    public fj5 v;
    public Context x;
    public ji2 y;
    public qbb z;
    public final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
    public final AtomicBoolean c = new AtomicBoolean(false);
    public boolean F0 = false;
    public final ThreadPoolExecutor w = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public e4f() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.a = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    public static String a(j8a j8aVar) {
        if (j8aVar.b()) {
            b1f b1fVarC = j8aVar.c();
            long jA = b1fVarC.A();
            Locale locale = Locale.ENGLISH;
            return tec.m("trace metric: ", b1fVarC.B(), " (duration: ", new DecimalFormat("#.####").format(jA / 1000.0d), "ms)");
        }
        if (j8aVar.d()) {
            je9 je9VarE = j8aVar.e();
            long jB = je9VarE.K() ? je9VarE.B() : 0L;
            String strValueOf = je9VarE.G() ? String.valueOf(je9VarE.w()) : "UNKNOWN";
            Locale locale2 = Locale.ENGLISH;
            return ks0.l(ib8.o("network request trace: ", je9VarE.D(), " (responseCode: ", strValueOf, ", responseTime: "), new DecimalFormat("#.####").format(jB / 1000.0d), "ms)");
        }
        if (!j8aVar.a()) {
            return "log";
        }
        y46 y46VarF = j8aVar.f();
        Locale locale3 = Locale.ENGLISH;
        boolean zX = y46VarF.x();
        int iU = y46VarF.u();
        int iT = y46VarF.t();
        StringBuilder sb = new StringBuilder("gauges (hasMetadata: ");
        sb.append(zX);
        sb.append(", cpuGaugeCount: ");
        sb.append(iU);
        sb.append(", memoryGaugeCount: ");
        return tec.g(iT, ")", sb);
    }

    public final void b(i8a i8aVar) {
        if (i8aVar.b()) {
            this.X.b(cl2.TRACE_EVENT_RATE_LIMITED.toString());
        } else if (i8aVar.d()) {
            this.X.b(cl2.NETWORK_TRACE_EVENT_RATE_LIMITED.toString());
        }
    }

    public final void c(b1f b1fVar, zb0 zb0Var) {
        this.w.execute(new qae(this, b1fVar, zb0Var, 2));
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0303  */
    /* JADX WARN: Code duplicated, block: B:141:0x0359  */
    /* JADX WARN: Code duplicated, block: B:146:0x0393  */
    /* JADX WARN: Code duplicated, block: B:148:0x039d  */
    /* JADX WARN: Code duplicated, block: B:151:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:160:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:162:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:166:0x03e5 A[Catch: all -> 0x03ed, TRY_LEAVE, TryCatch #4 {, blocks: (B:164:0x03e1, B:166:0x03e5), top: B:237:0x03e1 }] */
    /* JADX WARN: Code duplicated, block: B:173:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:176:0x042b  */
    /* JADX WARN: Code duplicated, block: B:178:0x0435  */
    /* JADX WARN: Code duplicated, block: B:181:0x0450  */
    /* JADX WARN: Code duplicated, block: B:183:0x0458  */
    /* JADX WARN: Code duplicated, block: B:187:0x0460  */
    /* JADX WARN: Code duplicated, block: B:194:0x048f  */
    /* JADX WARN: Code duplicated, block: B:201:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:206:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:208:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:210:0x04de  */
    /* JADX WARN: Code duplicated, block: B:212:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:213:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:215:0x0503  */
    /* JADX WARN: Code duplicated, block: B:217:0x051f  */
    /* JADX WARN: Code duplicated, block: B:218:0x052a  */
    /* JADX WARN: Code duplicated, block: B:220:0x053c  */
    /* JADX WARN: Code duplicated, block: B:223:0x0551  */
    /* JADX WARN: Code duplicated, block: B:225:0x055b  */
    /* JADX WARN: Code duplicated, block: B:226:0x0573  */
    /* JADX WARN: Code duplicated, block: B:229:0x057c  */
    /* JADX WARN: Code duplicated, block: B:230:0x058e  */
    /* JADX WARN: Code duplicated, block: B:237:0x03e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x046c, code lost:
    
        if (defpackage.qbb.a(r14.e().x()) == false) goto L189;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(defpackage.h8a r14, defpackage.zb0 r15) {
        /*
            Method dump skipped, instruction units count: 1435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e4f.d(h8a, zb0):void");
    }

    @Override // defpackage.fb0
    public final void onUpdateAppState(zb0 zb0Var) {
        int i = 0;
        this.F0 = zb0Var == zb0.FOREGROUND;
        if (this.c.get()) {
            this.w.execute(new d4f(this, i));
        }
    }
}
