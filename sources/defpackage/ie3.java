package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ie3 {
    public final z67 a;
    public final euc b;
    public final be3 c;
    public final ne3 d;
    public final String e;
    public final String f;
    public final String g;

    public ie3(z67 z67Var, euc eucVar, be3 be3Var, ne3 ne3Var, String str, String str2, String str3) {
        this.a = z67Var;
        this.b = eucVar;
        this.c = be3Var;
        this.d = ne3Var;
        this.e = str;
        this.f = str2;
        this.g = str3;
    }

    public final String a(c91 c91Var, Locale locale) {
        if (c91Var == null) {
            String upperCase = this.c.a.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            Object[] objArrCopyOf = Arrays.copyOf(new Object[]{upperCase}, 1);
            return String.format(this.e, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        }
        long j = c91Var.d;
        int i = c91Var.a;
        z67 z67Var = this.a;
        if (!z67Var.e(i)) {
            Object[] objArrCopyOf2 = Arrays.copyOf(new Object[]{i91.a(z67Var.a, locale), i91.a(z67Var.b, locale)}, 2);
            return String.format(this.f, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
        }
        euc eucVar = this.b;
        eucVar.getClass();
        if (eucVar.a(j)) {
            return "";
        }
        Object[] objArrCopyOf3 = Arrays.copyOf(new Object[]{this.d.a(Long.valueOf(j), locale, false)}, 1);
        return String.format(this.g, Arrays.copyOf(objArrCopyOf3, objArrCopyOf3.length));
    }
}
