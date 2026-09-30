package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class elg extends RuntimeException {
    public static elg a(String str, int i, String str2, int i2) {
        return new elg(c(str, i, str2, i2));
    }

    public static elg b(int i, String str, String str2) {
        return new elg(c(str, i, str2, i + 1));
    }

    public static String c(String str, int i, String str2, int i2) {
        if (i2 < 0) {
            i2 = str2.length();
        }
        StringBuilder sbQ = kv2.q(str, ": ");
        if (i > 8) {
            sbQ.append("...");
            sbQ.append((CharSequence) str2, i - 5, i);
        } else {
            sbQ.append((CharSequence) str2, 0, i);
        }
        sbQ.append('[');
        sbQ.append(str2.substring(i, i2));
        sbQ.append(']');
        if (str2.length() - i2 > 8) {
            sbQ.append((CharSequence) str2, i2, i2 + 5);
            sbQ.append("...");
        } else {
            sbQ.append((CharSequence) str2, i2, str2.length());
        }
        return sbQ.toString();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
