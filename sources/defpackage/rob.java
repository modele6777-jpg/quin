package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rob implements Serializable {
    private Set<? extends sob> _options;
    private final Pattern nativePattern;

    public rob(String str, int i) {
        str.getClass();
        int iA = sob.IGNORE_CASE.a();
        Pattern patternCompile = Pattern.compile(str, (iA & 2) != 0 ? iA | 64 : iA);
        patternCompile.getClass();
        this.nativePattern = patternCompile;
    }

    public static um8 b(rob robVar, CharSequence charSequence) {
        robVar.getClass();
        charSequence.getClass();
        Matcher matcher = robVar.nativePattern.matcher(charSequence);
        matcher.getClass();
        if (matcher.find(0)) {
            return new um8(matcher, charSequence);
        }
        return null;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        String strPattern = this.nativePattern.pattern();
        strPattern.getClass();
        return new qob(strPattern, this.nativePattern.flags());
    }

    public final boolean a(CharSequence charSequence) {
        return this.nativePattern.matcher(charSequence).find();
    }

    public final String c() {
        String strPattern = this.nativePattern.pattern();
        strPattern.getClass();
        return strPattern;
    }

    public final um8 d(int i, String str) {
        Matcher matcherRegion = this.nativePattern.matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i, str.length());
        if (matcherRegion.lookingAt()) {
            return new um8(matcherRegion, str);
        }
        return null;
    }

    public final um8 e(CharSequence charSequence) {
        charSequence.getClass();
        Matcher matcher = this.nativePattern.matcher(charSequence);
        matcher.getClass();
        if (matcher.matches()) {
            return new um8(matcher, charSequence);
        }
        return null;
    }

    public final boolean g(CharSequence charSequence) {
        charSequence.getClass();
        return this.nativePattern.matcher(charSequence).matches();
    }

    public final String h(CharSequence charSequence, String str) {
        charSequence.getClass();
        String strReplaceAll = this.nativePattern.matcher(charSequence).replaceAll(str);
        strReplaceAll.getClass();
        return strReplaceAll;
    }

    public final String i(String str, a26 a26Var) {
        str.getClass();
        um8 um8VarB = b(this, str);
        if (um8VarB == null) {
            return str.toString();
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        int i = 0;
        do {
            sb.append((CharSequence) str, i, um8VarB.b().a);
            sb.append((CharSequence) a26Var.d(um8VarB));
            i = um8VarB.b().b + 1;
            um8VarB = um8VarB.c();
            if (i >= length) {
                break;
            }
        } while (um8VarB != null);
        if (i < length) {
            sb.append((CharSequence) str, i, length);
        }
        return sb.toString();
    }

    public final List j(String str) {
        int iEnd = 0;
        v4e.a0(0);
        Matcher matcher = this.nativePattern.matcher(str);
        if (!matcher.find()) {
            return t72.H(str.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        do {
            arrayList.add(str.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
        } while (matcher.find());
        arrayList.add(str.subSequence(iEnd, str.length()).toString());
        return arrayList;
    }

    public final String toString() {
        String string = this.nativePattern.toString();
        string.getClass();
        return string;
    }

    public rob(String str) {
        str.getClass();
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        this.nativePattern = patternCompile;
    }

    public rob(Pattern pattern) {
        this.nativePattern = pattern;
    }
}
