package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xo extends t56 {
    private static final xo DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile j0a PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String packageName_ = "";
    private String sdkVersion_ = "";
    private String versionName_ = "";

    static {
        xo xoVar = new xo();
        DEFAULT_INSTANCE = xoVar;
        t56.o(xo.class, xoVar);
    }

    public static xo r() {
        return DEFAULT_INSTANCE;
    }

    public static vo u() {
        return (vo) DEFAULT_INSTANCE.h();
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
                return new hdb(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "packageName_", "sdkVersion_", "versionName_"});
            case 3:
                return new xo();
            case 4:
                return new vo(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                j0a j0aVar = PARSER;
                if (j0aVar != null) {
                    return j0aVar;
                }
                synchronized (xo.class) {
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

    public final boolean s() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean t() {
        return (this.bitField0_ & 2) != 0;
    }

    public final void v(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.packageName_ = str;
    }

    public final void w() {
        this.bitField0_ |= 2;
        this.sdkVersion_ = "22.0.6";
    }

    public final void x(String str) {
        this.bitField0_ |= 4;
        this.versionName_ = str;
    }
}
