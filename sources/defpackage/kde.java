package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kde {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;

    public kde(int i, int i2, String str, String str2, String str3, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
        this.f = i2;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        this.g = v4e.F(upperCase, "INT", false) ? 3 : (v4e.F(upperCase, "CHAR", false) || v4e.F(upperCase, "CLOB", false) || v4e.F(upperCase, "TEXT", false)) ? 2 : v4e.F(upperCase, "BLOB", false) ? 5 : (v4e.F(upperCase, "REAL", false) || v4e.F(upperCase, "FLOA", false) || v4e.F(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof kde) {
                boolean z = this.d > 0;
                kde kdeVar = (kde) obj;
                int i = kdeVar.f;
                if (z == (kdeVar.d > 0) && pa7.t(this.a, kdeVar.a) && this.c == kdeVar.c) {
                    String str = kdeVar.e;
                    int i2 = this.f;
                    String str2 = this.e;
                    if ((i2 != 1 || i != 2 || str2 == null || v2c.q(str2, str)) && ((i2 != 2 || i != 1 || str == null || v2c.q(str, str2)) && ((i2 == 0 || i2 != i || (str2 == null ? str == null : v2c.q(str2, str))) && this.g == kdeVar.g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.g) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   type = '");
        sb.append(this.b);
        sb.append("',\n            |   affinity = '");
        sb.append(this.g);
        sb.append("',\n            |   notNull = '");
        sb.append(this.c);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.d);
        sb.append("',\n            |   defaultValue = '");
        String str = this.e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return w4e.o(w4e.q(sb.toString()));
    }
}
