package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hk9 implements yoa {
    public static final hk9 b = new hk9(">");
    public static final hk9 c = new hk9(">=");
    public static final hk9 d = new hk9("<");
    public static final hk9 e = new hk9("<=");
    public final String a;

    public hk9(String str) {
        this.a = str;
    }

    @Override // defpackage.yoa
    public final Object b(Object obj, String str, List list) throws ci7 {
        byte b2 = 3;
        int iMin = Math.min(list.size(), 3);
        String str2 = this.a;
        if (iMin < 2) {
            throw new ci7(ib8.j("'", str2, "' requires at least 2 arguments"), str);
        }
        double[] dArr = new double[iMin];
        boolean z = false;
        for (int i = 0; i < iMin; i++) {
            Object obj2 = list.get(i);
            if (obj2 instanceof String) {
                try {
                    dArr[i] = Double.parseDouble((String) obj2);
                } catch (NumberFormatException unused) {
                    return Boolean.FALSE;
                }
            } else {
                if (!(obj2 instanceof Number)) {
                    return Boolean.FALSE;
                }
                dArr[i] = ((Number) obj2).doubleValue();
            }
        }
        if (list.size() < 3) {
            switch (str2.hashCode()) {
                case 60:
                    b2 = str2.equals("<") ? (byte) 0 : (byte) -1;
                    break;
                case 62:
                    b2 = str2.equals(">") ? (byte) 1 : (byte) -1;
                    break;
                case 1921:
                    b2 = str2.equals("<=") ? (byte) 2 : (byte) -1;
                    break;
                case 1983:
                    if (!str2.equals(">=")) {
                        b2 = -1;
                    }
                    break;
                default:
                    b2 = -1;
                    break;
            }
            switch (b2) {
                case 0:
                    return Boolean.valueOf(dArr[0] < dArr[1]);
                case 1:
                    return Boolean.valueOf(dArr[0] > dArr[1]);
                case 2:
                    return Boolean.valueOf(dArr[0] <= dArr[1]);
                case 3:
                    return Boolean.valueOf(dArr[0] >= dArr[1]);
                default:
                    throw new ci7(ib8.j("'", str2, "' is not a comparison expression"), str);
            }
        }
        switch (str2.hashCode()) {
            case 60:
                b2 = str2.equals("<") ? (byte) 0 : (byte) -1;
                break;
            case 62:
                b2 = str2.equals(">") ? (byte) 1 : (byte) -1;
                break;
            case 1921:
                b2 = str2.equals("<=") ? (byte) 2 : (byte) -1;
                break;
            case 1983:
                if (!str2.equals(">=")) {
                    b2 = -1;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                double d2 = dArr[0];
                double d3 = dArr[1];
                if (d2 < d3 && d3 < dArr[2]) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                double d4 = dArr[0];
                double d5 = dArr[1];
                if (d4 > d5 && d5 > dArr[2]) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                double d6 = dArr[0];
                double d7 = dArr[1];
                if (d6 <= d7 && d7 <= dArr[2]) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                double d8 = dArr[0];
                double d9 = dArr[1];
                if (d8 >= d9 && d9 >= dArr[2]) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                throw new ci7(ib8.j("'", str2, "' does not support between comparisons"), str);
        }
    }

    @Override // defpackage.ei7
    public final String c() {
        return this.a;
    }
}
