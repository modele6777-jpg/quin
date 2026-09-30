package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class llg {
    public static final llg b = new llg(0);
    public static final llg c = new llg(1);
    public static final llg d = new llg(2);
    public static final llg e = new llg(3);
    public static final llg f = new llg(4);
    public static final llg g = new llg(5);
    public static final llg h = new llg(6);
    public static final llg i = new llg(7);
    public static final llg j = new llg(8);
    public static final llg k = new llg(9);
    public static final llg l = new llg(10);
    public static final llg m = new llg(11);
    public static final llg n = new llg(12);
    public static final llg o = new llg(13);
    public static final llg p = new llg(14);
    public final /* synthetic */ int a;

    public /* synthetic */ llg(int i2) {
        this.a = i2;
    }

    public final boolean a(int i2) {
        switch (this.a) {
            case 0:
                return mlg.a(i2) != null;
            case 1:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 2:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return true;
                    default:
                        return false;
                }
            case 3:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 4:
                return fbc.n(i2) != 0;
            case 5:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 6:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 7:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 8:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 9:
                return i2 == 0 || i2 == 1;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return i2 == 1 || i2 == 2;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return j4h.a(i2) != null;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            default:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
        }
    }
}
