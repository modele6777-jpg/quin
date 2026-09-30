package defpackage;

import java.util.List;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class um8 {
    public final Matcher a;
    public final CharSequence b;
    public final tm8 c;
    public sm8 d;

    public um8(Matcher matcher, CharSequence charSequence) {
        charSequence.getClass();
        this.a = matcher;
        this.b = charSequence;
        this.c = new tm8(0, this);
    }

    public final List a() {
        sm8 sm8Var = this.d;
        if (sm8Var != null) {
            return sm8Var;
        }
        sm8 sm8Var2 = new sm8(this);
        this.d = sm8Var2;
        return sm8Var2;
    }

    public final z67 b() {
        Matcher matcher = this.a;
        return mh3.c0(matcher.start(), matcher.end());
    }

    public final um8 c() {
        Matcher matcher = this.a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        if (matcher2.find(iEnd)) {
            return new um8(matcher2, charSequence);
        }
        return null;
    }
}
