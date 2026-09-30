package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class b1f extends t56 {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final b1f DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile j0a PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private ql8 counters_;
    private ql8 customAttributes_;
    private long durationUs_;
    private boolean isAuto_;
    private String name_;
    private n87 perfSessions_;
    private n87 subtraces_;

    static {
        b1f b1fVar = new b1f();
        DEFAULT_INSTANCE = b1fVar;
        t56.o(b1f.class, b1fVar);
    }

    public b1f() {
        ql8 ql8Var = ql8.a;
        this.counters_ = ql8Var;
        this.customAttributes_ = ql8Var;
        this.name_ = "";
        w0b w0bVar = w0b.d;
        this.subtraces_ = w0bVar;
        this.perfSessions_ = w0bVar;
    }

    public static y0f H() {
        return (y0f) DEFAULT_INSTANCE.h();
    }

    public static b1f z() {
        return DEFAULT_INSTANCE;
    }

    public final long A() {
        return this.durationUs_;
    }

    public final String B() {
        return this.name_;
    }

    public final n87 C() {
        return this.perfSessions_;
    }

    public final n87 D() {
        return this.subtraces_;
    }

    public final boolean E() {
        return (this.bitField0_ & 4) != 0;
    }

    public final ql8 F() {
        if (!this.counters_.d()) {
            this.counters_ = this.counters_.g();
        }
        return this.counters_;
    }

    public final ql8 G() {
        if (!this.customAttributes_.d()) {
            this.customAttributes_ = this.customAttributes_.g();
        }
        return this.customAttributes_;
    }

    public final void I(long j) {
        this.bitField0_ |= 4;
        this.clientStartTimeUs_ = j;
    }

    public final void J(long j) {
        this.bitField0_ |= 8;
        this.durationUs_ = j;
    }

    public final void K(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    @Override // defpackage.t56
    public final Object i(int i) {
        j0a n56Var;
        switch (kv2.B(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new hdb(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", z0f.a, "subtraces_", b1f.class, "customAttributes_", a1f.a, "perfSessions_", m8a.class});
            case 3:
                return new b1f();
            case 4:
                return new y0f(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                j0a j0aVar = PARSER;
                if (j0aVar != null) {
                    return j0aVar;
                }
                synchronized (b1f.class) {
                    try {
                        n56Var = PARSER;
                        if (n56Var == null) {
                            n56Var = new n56();
                            PARSER = n56Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return n56Var;
            default:
                cva.f();
                return null;
        }
    }

    public final void r(List list) {
        n87 n87VarN = this.perfSessions_;
        if (!((l4) n87VarN).a) {
            n87VarN = t56.n(n87VarN);
            this.perfSessions_ = n87VarN;
        }
        k56.g(list, n87VarN);
    }

    public final void s(ArrayList arrayList) {
        n87 n87VarN = this.subtraces_;
        if (!((l4) n87VarN).a) {
            n87VarN = t56.n(n87VarN);
            this.subtraces_ = n87VarN;
        }
        k56.g(arrayList, n87VarN);
    }

    public final void t(m8a m8aVar) {
        n87 n87VarN = this.perfSessions_;
        if (!((l4) n87VarN).a) {
            n87VarN = t56.n(n87VarN);
            this.perfSessions_ = n87VarN;
        }
        n87VarN.add(m8aVar);
    }

    public final void u(b1f b1fVar) {
        b1fVar.getClass();
        n87 n87VarN = this.subtraces_;
        if (!((l4) n87VarN).a) {
            n87VarN = t56.n(n87VarN);
            this.subtraces_ = n87VarN;
        }
        n87VarN.add(b1fVar);
    }

    public final boolean v() {
        return this.customAttributes_.containsKey("Hosting_activity");
    }

    public final int w() {
        return this.counters_.size();
    }

    public final Map x() {
        return Collections.unmodifiableMap(this.counters_);
    }

    public final Map y() {
        return Collections.unmodifiableMap(this.customAttributes_);
    }
}
