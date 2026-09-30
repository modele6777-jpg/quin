package defpackage;

import java.time.LocalDate;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xf3 implements wf3 {
    public final z67 a;
    public final Locale b;
    public final l91 c;
    public final vz9 d;
    public final vz9 e;
    public final vz9 f;
    public final vz9 g;

    public xf3(Long l, Long l2, z67 z67Var, int i, euc eucVar, Locale locale) {
        n91 n91VarE;
        this.a = z67Var;
        this.b = locale;
        l91 l91Var = new l91(locale);
        this.c = l91Var;
        this.d = q1c.f(eucVar);
        if (l2 != null) {
            n91VarE = l91Var.a(l2.longValue());
            if (!z67Var.e(n91VarE.a)) {
                c91 c91VarB = l91Var.b();
                n91VarE = l91Var.e(LocalDate.of(c91VarB.a, c91VarB.b, 1));
            }
        } else {
            c91 c91VarB2 = l91Var.b();
            n91VarE = l91Var.e(LocalDate.of(c91VarB2.a, c91VarB2.b, 1));
        }
        this.e = q1c.f(n91VarE);
        c91 c91Var = null;
        if (l != null) {
            c91 c91VarD = this.c.d(l.longValue());
            if (z67Var.e(c91VarD.a)) {
                c91Var = c91VarD;
            }
        }
        this.f = q1c.f(c91Var);
        this.g = q1c.f(new ka4(i));
    }

    public final int a() {
        return ((ka4) this.g.getValue()).a;
    }

    public final Long b() {
        c91 c91Var = (c91) this.f.getValue();
        if (c91Var != null) {
            return Long.valueOf(c91Var.d);
        }
        return null;
    }

    public final void c(Long l) {
        vz9 vz9Var = this.f;
        if (l == null) {
            vz9Var.setValue(null);
        } else {
            c91 c91VarD = this.c.d(l.longValue());
            vz9Var.setValue(this.a.e(c91VarD.a) ? c91VarD : null);
        }
    }
}
