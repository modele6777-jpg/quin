package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dx2 extends t56 {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final dx2 DEFAULT_INSTANCE;
    private static volatile j0a PARSER = null;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;

    static {
        dx2 dx2Var = new dx2();
        DEFAULT_INSTANCE = dx2Var;
        t56.o(dx2.class, dx2Var);
    }

    public static cx2 r() {
        return (cx2) DEFAULT_INSTANCE.h();
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
                return new hdb(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_"});
            case 3:
                return new dx2();
            case 4:
                return new cx2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                j0a j0aVar = PARSER;
                if (j0aVar != null) {
                    return j0aVar;
                }
                synchronized (dx2.class) {
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

    public final void s(long j) {
        this.bitField0_ |= 1;
        this.clientTimeUs_ = j;
    }

    public final void t(long j) {
        this.bitField0_ |= 4;
        this.systemTimeUs_ = j;
    }

    public final void u(long j) {
        this.bitField0_ |= 2;
        this.userTimeUs_ = j;
    }
}
