package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ex5 {
    public static final t99 e = t99.g("<root>");
    public final String a;
    public transient dx5 b;
    public transient ex5 c;
    public transient t99 d;

    static {
        Pattern.compile("\\.").getClass();
    }

    public ex5(dx5 dx5Var, String str) {
        str.getClass();
        this.a = str;
        this.b = dx5Var;
    }

    public static final List f(ex5 ex5Var) {
        if (ex5Var.c()) {
            return new ArrayList();
        }
        List listF = f(ex5Var.e());
        listF.add(ex5Var.g());
        return listF;
    }

    public final ex5 a(t99 t99Var) {
        String strB;
        t99Var.getClass();
        if (c()) {
            strB = t99Var.b();
        } else {
            strB = this.a + '.' + t99Var.b();
        }
        strB.getClass();
        return new ex5(strB, this, t99Var);
    }

    public final void b() {
        String str = this.a;
        int length = str.length() - 1;
        boolean z = false;
        while (true) {
            if (length < 0) {
                length = -1;
                break;
            }
            char cCharAt = str.charAt(length);
            if (cCharAt == '.' && !z) {
                break;
            }
            if (cCharAt == '`') {
                z = !z;
            } else if (cCharAt == '\\') {
                length--;
            }
            length--;
        }
        if (length >= 0) {
            this.d = t99.d(str.substring(length + 1));
            this.c = new ex5(str.substring(0, length));
        } else {
            this.d = t99.d(str);
            this.c = dx5.c.a;
        }
    }

    public final boolean c() {
        return this.a.length() == 0;
    }

    public final boolean d() {
        return this.b != null || v4e.N(this.a, '<', 0, 6) < 0;
    }

    public final ex5 e() {
        ex5 ex5Var = this.c;
        if (ex5Var != null) {
            return ex5Var;
        }
        if (c()) {
            qc0.p("root");
            return null;
        }
        b();
        ex5 ex5Var2 = this.c;
        ex5Var2.getClass();
        return ex5Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ex5) {
            return pa7.t(this.a, ((ex5) obj).a);
        }
        return false;
    }

    public final t99 g() {
        t99 t99Var = this.d;
        if (t99Var != null) {
            return t99Var;
        }
        if (c()) {
            qc0.p("root");
            return null;
        }
        b();
        t99 t99Var2 = this.d;
        t99Var2.getClass();
        return t99Var2;
    }

    public final boolean h(t99 t99Var) {
        t99Var.getClass();
        if (!c()) {
            String str = this.a;
            int iN = v4e.N(str, '.', 0, 6);
            if (iN == -1) {
                iN = str.length();
            }
            int i = iN;
            String strB = t99Var.b();
            strB.getClass();
            if (i == strB.length() && c5e.x(0, 0, i, this.a, strB, false)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final dx5 i() {
        dx5 dx5Var = this.b;
        if (dx5Var != null) {
            return dx5Var;
        }
        dx5 dx5Var2 = new dx5(this);
        this.b = dx5Var2;
        return dx5Var2;
    }

    public final String toString() {
        if (!c()) {
            return this.a;
        }
        String strB = e.b();
        strB.getClass();
        return strB;
    }

    public ex5(String str) {
        this.a = str;
    }

    public ex5(String str, ex5 ex5Var, t99 t99Var) {
        this.a = str;
        this.c = ex5Var;
        this.d = t99Var;
    }
}
