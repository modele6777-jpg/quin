package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class og5 implements ng5 {
    public final String a;
    public final int b;

    public og5(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean a() {
        if (this.b != 0) {
            String strTrim = d().trim();
            if (ei2.e.matcher(strTrim).matches()) {
                return true;
            }
            if (!ei2.f.matcher(strTrim).matches()) {
                qc0.j(ib8.j("[Value: ", strTrim, "] cannot be converted to a boolean."));
                return false;
            }
        }
        return false;
    }

    public final double b() {
        if (this.b == 0) {
            return 0.0d;
        }
        String strTrim = d().trim();
        try {
            return Double.valueOf(strTrim).doubleValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ib8.j("[Value: ", strTrim, "] cannot be converted to a double."), e);
        }
    }

    public final long c() {
        if (this.b == 0) {
            return 0L;
        }
        String strTrim = d().trim();
        try {
            return Long.valueOf(strTrim).longValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ib8.j("[Value: ", strTrim, "] cannot be converted to a long."), e);
        }
    }

    public final String d() {
        return this.b == 0 ? "" : this.a;
    }
}
