package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class i8a extends t56 implements j8a {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final i8a DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile j0a PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private yb0 applicationInfo_;
    private int bitField0_;
    private y46 gaugeMetric_;
    private je9 networkRequestMetric_;
    private b1f traceMetric_;
    private c4f transportInfo_;

    static {
        i8a i8aVar = new i8a();
        DEFAULT_INSTANCE = i8aVar;
        t56.o(i8a.class, i8aVar);
    }

    public static h8a t() {
        return (h8a) DEFAULT_INSTANCE.h();
    }

    @Override // defpackage.j8a
    public final boolean a() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // defpackage.j8a
    public final boolean b() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // defpackage.j8a
    public final b1f c() {
        b1f b1fVar = this.traceMetric_;
        return b1fVar == null ? b1f.z() : b1fVar;
    }

    @Override // defpackage.j8a
    public final boolean d() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // defpackage.j8a
    public final je9 e() {
        je9 je9Var = this.networkRequestMetric_;
        return je9Var == null ? je9.u() : je9Var;
    }

    @Override // defpackage.j8a
    public final y46 f() {
        y46 y46Var = this.gaugeMetric_;
        return y46Var == null ? y46.v() : y46Var;
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
                return new hdb(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 3:
                return new i8a();
            case 4:
                return new h8a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                j0a j0aVar = PARSER;
                if (j0aVar != null) {
                    return j0aVar;
                }
                synchronized (i8a.class) {
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

    public final yb0 r() {
        yb0 yb0Var = this.applicationInfo_;
        return yb0Var == null ? yb0.s() : yb0Var;
    }

    public final boolean s() {
        return (this.bitField0_ & 1) != 0;
    }

    public final void u(yb0 yb0Var) {
        this.applicationInfo_ = yb0Var;
        this.bitField0_ |= 1;
    }

    public final void v(y46 y46Var) {
        this.gaugeMetric_ = y46Var;
        this.bitField0_ |= 8;
    }

    public final void w(je9 je9Var) {
        this.networkRequestMetric_ = je9Var;
        this.bitField0_ |= 4;
    }

    public final void x(b1f b1fVar) {
        this.traceMetric_ = b1fVar;
        this.bitField0_ |= 2;
    }
}
