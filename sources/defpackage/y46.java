package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class y46 extends t56 {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final y46 DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile j0a PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private n87 androidMemoryReadings_;
    private int bitField0_;
    private n87 cpuMetricReadings_;
    private v46 gaugeMetadata_;
    private String sessionId_ = "";

    static {
        y46 y46Var = new y46();
        DEFAULT_INSTANCE = y46Var;
        t56.o(y46.class, y46Var);
    }

    public y46() {
        w0b w0bVar = w0b.d;
        this.cpuMetricReadings_ = w0bVar;
        this.androidMemoryReadings_ = w0bVar;
    }

    public static y46 v() {
        return DEFAULT_INSTANCE;
    }

    public static x46 z() {
        return (x46) DEFAULT_INSTANCE.h();
    }

    public final void A(v46 v46Var) {
        v46Var.getClass();
        this.gaugeMetadata_ = v46Var;
        this.bitField0_ |= 2;
    }

    public final void B(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
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
                return new hdb(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", dx2.class, "gaugeMetadata_", "androidMemoryReadings_", ht.class});
            case 3:
                return new y46();
            case 4:
                return new x46(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                j0a j0aVar = PARSER;
                if (j0aVar != null) {
                    return j0aVar;
                }
                synchronized (y46.class) {
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

    public final void r(ht htVar) {
        htVar.getClass();
        n87 n87VarN = this.androidMemoryReadings_;
        if (!((l4) n87VarN).a) {
            n87VarN = t56.n(n87VarN);
            this.androidMemoryReadings_ = n87VarN;
        }
        n87VarN.add(htVar);
    }

    public final void s(dx2 dx2Var) {
        dx2Var.getClass();
        n87 n87VarN = this.cpuMetricReadings_;
        if (!((l4) n87VarN).a) {
            n87VarN = t56.n(n87VarN);
            this.cpuMetricReadings_ = n87VarN;
        }
        n87VarN.add(dx2Var);
    }

    public final int t() {
        return this.androidMemoryReadings_.size();
    }

    public final int u() {
        return this.cpuMetricReadings_.size();
    }

    public final v46 w() {
        v46 v46Var = this.gaugeMetadata_;
        return v46Var == null ? v46.r() : v46Var;
    }

    public final boolean x() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean y() {
        return (this.bitField0_ & 1) != 0;
    }
}
