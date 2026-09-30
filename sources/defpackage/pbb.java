package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pbb {
    public static final long i;
    public ip3 b;
    public final ip3 e;
    public final ip3 f;
    public final long g;
    public final long h;
    public long c = 500;
    public double d = 500.0d;
    public oye a = new oye();

    static {
        ct.d();
        i = 1000000L;
    }

    public pbb(ip3 ip3Var, i8c i8cVar, ji2 ji2Var, String str) {
        aj2 aj2Var;
        long jLongValue;
        zi2 zi2Var;
        long jLongValue2;
        lj2 lj2Var;
        mj2 mj2Var;
        this.b = ip3Var;
        long j = str == "Trace" ? ji2Var.j() : ji2Var.j();
        if (str == "Trace") {
            synchronized (mj2.class) {
                mj2Var = mj2.l;
                if (mj2Var == null) {
                    mj2Var = new mj2();
                    mj2.l = mj2Var;
                }
            }
            ur9 ur9Var = ji2Var.a.getLong("fpr_rl_trace_event_count_fg");
            if (ur9Var.b() && ji2.k(((Long) ur9Var.a()).longValue())) {
                ji2Var.c.d(((Long) ur9Var.a()).longValue(), "com.google.firebase.perf.TraceEventCountForeground");
                jLongValue = ((Long) ur9Var.a()).longValue();
            } else {
                ur9 ur9VarC = ji2Var.c(mj2Var);
                jLongValue = (ur9VarC.b() && ji2.k(((Long) ur9VarC.a()).longValue())) ? ((Long) ur9VarC.a()).longValue() : 300L;
            }
        } else {
            synchronized (aj2.class) {
                aj2Var = aj2.l;
                if (aj2Var == null) {
                    aj2Var = new aj2();
                    aj2.l = aj2Var;
                }
            }
            ur9 ur9Var2 = ji2Var.a.getLong("fpr_rl_network_event_count_fg");
            if (ur9Var2.b() && ji2.k(((Long) ur9Var2.a()).longValue())) {
                ji2Var.c.d(((Long) ur9Var2.a()).longValue(), "com.google.firebase.perf.NetworkEventCountForeground");
                jLongValue = ((Long) ur9Var2.a()).longValue();
            } else {
                ur9 ur9VarC2 = ji2Var.c(aj2Var);
                jLongValue = (ur9VarC2.b() && ji2.k(((Long) ur9VarC2.a()).longValue())) ? ((Long) ur9VarC2.a()).longValue() : 700L;
            }
        }
        long j2 = jLongValue;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.e = new ip3(j2, timeUnit, j);
        this.g = j2;
        long j3 = str == "Trace" ? ji2Var.j() : ji2Var.j();
        if (str == "Trace") {
            synchronized (lj2.class) {
                lj2Var = lj2.l;
                if (lj2Var == null) {
                    lj2Var = new lj2();
                    lj2.l = lj2Var;
                }
            }
            ur9 ur9Var3 = ji2Var.a.getLong("fpr_rl_trace_event_count_bg");
            if (ur9Var3.b() && ji2.k(((Long) ur9Var3.a()).longValue())) {
                ji2Var.c.d(((Long) ur9Var3.a()).longValue(), "com.google.firebase.perf.TraceEventCountBackground");
                jLongValue2 = ((Long) ur9Var3.a()).longValue();
            } else {
                ur9 ur9VarC3 = ji2Var.c(lj2Var);
                jLongValue2 = (ur9VarC3.b() && ji2.k(((Long) ur9VarC3.a()).longValue())) ? ((Long) ur9VarC3.a()).longValue() : 30L;
            }
        } else {
            synchronized (zi2.class) {
                zi2Var = zi2.l;
                if (zi2Var == null) {
                    zi2Var = new zi2();
                    zi2.l = zi2Var;
                }
            }
            ur9 ur9Var4 = ji2Var.a.getLong("fpr_rl_network_event_count_bg");
            if (ur9Var4.b() && ji2.k(((Long) ur9Var4.a()).longValue())) {
                ji2Var.c.d(((Long) ur9Var4.a()).longValue(), "com.google.firebase.perf.NetworkEventCountBackground");
                jLongValue2 = ((Long) ur9Var4.a()).longValue();
            } else {
                ur9 ur9VarC4 = ji2Var.c(zi2Var);
                jLongValue2 = (ur9VarC4.b() && ji2.k(((Long) ur9VarC4.a()).longValue())) ? ((Long) ur9VarC4.a()).longValue() : 70L;
            }
        }
        long j4 = jLongValue2;
        this.f = new ip3(j4, timeUnit, j3);
        this.h = j4;
    }

    public final synchronized void a(boolean z) {
        try {
            this.b = z ? this.e : this.f;
            this.c = z ? this.g : this.h;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005c A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:3:0x0001, B:9:0x002c, B:14:0x0051, B:16:0x005c, B:19:0x006d, B:21:0x0075, B:10:0x0034, B:11:0x003c, B:12:0x003f, B:13:0x0048), top: B:29:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0075 A[Catch: all -> 0x006b, TRY_LEAVE, TryCatch #0 {all -> 0x006b, blocks: (B:3:0x0001, B:9:0x002c, B:14:0x0051, B:16:0x005c, B:19:0x006d, B:21:0x0075, B:10:0x0034, B:11:0x003c, B:12:0x003f, B:13:0x0048), top: B:29:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x007a A[DONT_GENERATE] */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x007a, please report this as an issue */
    public final synchronized boolean b() {
        double d;
        double d2;
        double seconds;
        double d3;
        double d4;
        try {
            oye oyeVar = new oye();
            oye oyeVar2 = this.a;
            oyeVar2.getClass();
            double d5 = oyeVar.b - oyeVar2.b;
            ip3 ip3Var = this.b;
            long j = ip3Var.a;
            long j2 = ip3Var.b;
            int[] iArr = obb.a;
            TimeUnit timeUnit = (TimeUnit) ip3Var.c;
            int i2 = iArr[timeUnit.ordinal()];
            if (i2 == 1) {
                d = j / j2;
                d2 = 1.0E9d;
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        seconds = j / timeUnit.toSeconds(j2);
                    } else {
                        d = j / j2;
                        d2 = 1000.0d;
                    }
                    d3 = (d5 * seconds) / i;
                    if (d3 > 0.0d) {
                        this.d = Math.min(this.d + d3, this.c);
                        this.a = oyeVar;
                    }
                    d4 = this.d;
                    if (d4 >= 1.0d) {
                        return false;
                    }
                    this.d = d4 - 1.0d;
                    return true;
                }
                d = j / j2;
                d2 = 1000000.0d;
            }
            seconds = d * d2;
            d3 = (d5 * seconds) / i;
            if (d3 > 0.0d) {
                this.d = Math.min(this.d + d3, this.c);
                this.a = oyeVar;
            }
            d4 = this.d;
            if (d4 >= 1.0d) {
                return false;
            }
            this.d = d4 - 1.0d;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
