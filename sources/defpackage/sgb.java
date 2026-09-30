package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sgb {
    public static final Set a = qd0.I0(new String[]{"dr.", "jr.", "mr.", "mrs.", "ms.", "prof.", "sr.", "st."});
    public static final Set b = qd0.I0(new String[]{"a.m.", "e.g.", "etc.", "i.e.", "p.m.", "vs."});

    public static final boolean a(char c) {
        if ('0' <= c && c < ':') {
            return true;
        }
        if ('A' > c || c >= '[') {
            return 'a' <= c && c < '{';
        }
        return true;
    }

    public static final boolean b(char c) {
        if (('\t' <= c && c < 14) || c == ' ' || c == 133 || c == 160 || c == 5760) {
            return true;
        }
        return (8192 <= c && c < 8204) || c == 8232 || c == 8233 || c == 8239 || c == 8287 || c == 12288;
    }

    public static final eue c(int i, int i2, String str) {
        while (i < i2 && b(str.charAt(i))) {
            i++;
        }
        while (i2 > i && b(str.charAt(i2 - 1))) {
            i2--;
        }
        long jB = u3c.b(i, i2);
        eue eueVar = new eue(jB);
        if (eue.d(jB)) {
            return null;
        }
        return eueVar;
    }
}
