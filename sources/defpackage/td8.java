package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class td8 {
    public static final td8 b = c(new LocaleList(new Locale[0]));
    public final ud8 a;

    public td8(ud8 ud8Var) {
        this.a = ud8Var;
    }

    public static td8 a(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(strArrSplit[i]);
        }
        return c(new LocaleList(localeArr));
    }

    public static td8 c(LocaleList localeList) {
        return new td8(new ud8(localeList));
    }

    public final Locale b(int i) {
        return this.a.a.get(i);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof td8) {
            return this.a.equals(((td8) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a.toString();
    }
}
