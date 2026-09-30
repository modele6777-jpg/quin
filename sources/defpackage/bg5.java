package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class bg5 extends k8a {
    public static final ct d = ct.d();
    public final b1f c;

    public bg5(b1f b1fVar) {
        this.c = b1fVar;
    }

    public static boolean d(b1f b1fVar, int i) {
        if (b1fVar != null) {
            ct ctVar = d;
            if (i > 1) {
                ctVar.f("Exceed MAX_SUBTRACE_DEEP:1");
                return false;
            }
            for (Map.Entry entry : b1fVar.x().entrySet()) {
                String str = (String) entry.getKey();
                if (str != null) {
                    String strTrim = str.trim();
                    if (strTrim.isEmpty()) {
                        ctVar.f("counterId is empty");
                    } else if (strTrim.length() > 100) {
                        ctVar.f("counterId exceeded max length 100");
                    } else if (((Long) entry.getValue()) == null) {
                        ctVar.f("invalid CounterValue:" + entry.getValue());
                        return false;
                    }
                }
                ctVar.f("invalid CounterId:" + ((String) entry.getKey()));
                return false;
            }
            Iterator it = b1fVar.D().iterator();
            while (it.hasNext()) {
                if (!d((b1f) it.next(), i + 1)) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean e(b1f b1fVar, int i) {
        Long l;
        ct ctVar = d;
        if (b1fVar == null) {
            ctVar.f("TraceMetric is null");
            return false;
        }
        if (i > 1) {
            ctVar.f("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        String strB = b1fVar.B();
        if (strB != null) {
            String strTrim = strB.trim();
            if (!strTrim.isEmpty() && strTrim.length() <= 100) {
                if (b1fVar.A() <= 0) {
                    ctVar.f("invalid TraceDuration:" + b1fVar.A());
                    return false;
                }
                if (!b1fVar.E()) {
                    ctVar.f("clientStartTimeUs is null.");
                    return false;
                }
                if (b1fVar.B().startsWith("_st_") && ((l = (Long) b1fVar.x().get(cl2.FRAMES_TOTAL.toString())) == null || l.compareTo((Long) 0L) <= 0)) {
                    ctVar.f("non-positive totalFrames in screen trace " + b1fVar.B());
                    return false;
                }
                Iterator it = b1fVar.D().iterator();
                while (it.hasNext()) {
                    if (!e((b1f) it.next(), i + 1)) {
                        return false;
                    }
                }
                for (Map.Entry entry : b1fVar.y().entrySet()) {
                    try {
                        k8a.b((String) entry.getKey(), (String) entry.getValue());
                    } catch (IllegalArgumentException e) {
                        ctVar.f(e.getLocalizedMessage());
                        return false;
                    }
                }
                return true;
            }
        }
        ctVar.f("invalid TraceId:" + b1fVar.B());
        return false;
    }

    @Override // defpackage.k8a
    public final boolean a() {
        b1f b1fVar = this.c;
        boolean zE = e(b1fVar, 0);
        ct ctVar = d;
        if (!zE) {
            ctVar.f("Invalid Trace:" + b1fVar.B());
            return false;
        }
        if (b1fVar.w() <= 0) {
            Iterator it = b1fVar.D().iterator();
            while (it.hasNext()) {
                if (((b1f) it.next()).w() > 0) {
                }
            }
            return true;
        }
        if (d(b1fVar, 0)) {
            return true;
        }
        ctVar.f("Invalid Counters for Trace:" + b1fVar.B());
        return false;
    }
}
