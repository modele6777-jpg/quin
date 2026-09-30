package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yb0 extends t56 {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final yb0 DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile j0a PARSER;
    private xo androidAppInfo_;
    private int applicationProcessState_;
    private int bitField0_;
    private ql8 customAttributes_ = ql8.a;
    private String googleAppId_ = "";
    private String appInstanceId_ = "";

    static {
        yb0 yb0Var = new yb0();
        DEFAULT_INSTANCE = yb0Var;
        t56.o(yb0.class, yb0Var);
    }

    public static yb0 s() {
        return DEFAULT_INSTANCE;
    }

    public static vb0 y() {
        return (vb0) DEFAULT_INSTANCE.h();
    }

    public final void A(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.appInstanceId_ = str;
    }

    public final void B(zb0 zb0Var) {
        this.applicationProcessState_ = zb0Var.a();
        this.bitField0_ |= 8;
    }

    public final void C(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.googleAppId_ = str;
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
                return new hdb(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005᠌\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", qk6.c, "customAttributes_", wb0.a});
            case 3:
                return new yb0();
            case 4:
                return new vb0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                j0a j0aVar = PARSER;
                if (j0aVar != null) {
                    return j0aVar;
                }
                synchronized (yb0.class) {
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

    public final xo r() {
        xo xoVar = this.androidAppInfo_;
        return xoVar == null ? xo.r() : xoVar;
    }

    public final boolean t() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean u() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean v() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean w() {
        return (this.bitField0_ & 1) != 0;
    }

    public final ql8 x() {
        if (!this.customAttributes_.d()) {
            this.customAttributes_ = this.customAttributes_.g();
        }
        return this.customAttributes_;
    }

    public final void z(xo xoVar) {
        this.androidAppInfo_ = xoVar;
        this.bitField0_ |= 4;
    }
}
