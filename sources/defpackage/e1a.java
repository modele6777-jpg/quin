package defpackage;

import java.io.File;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class e1a implements Comparable {
    public static final String b;
    public final a71 a;

    static {
        String str = File.separator;
        str.getClass();
        b = str;
    }

    public e1a(a71 a71Var) {
        a71Var.getClass();
        this.a = a71Var;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int iC = c.c(this);
        a71 a71Var = this.a;
        if (iC == -1) {
            iC = 0;
        } else if (iC < a71Var.e() && a71Var.k(iC) == 92) {
            iC++;
        }
        int iE = a71Var.e();
        int i = iC;
        while (iC < iE) {
            if (a71Var.k(iC) == 47 || a71Var.k(iC) == 92) {
                arrayList.add(a71Var.q(i, iC));
                i = iC + 1;
            }
            iC++;
        }
        if (i < a71Var.e()) {
            arrayList.add(a71Var.q(i, a71Var.e()));
        }
        return arrayList;
    }

    public final String b() {
        a71 a71Var = c.a;
        a71 a71VarR = this.a;
        int iM = a71.m(a71VarR, a71Var);
        if (iM == -1) {
            iM = a71.m(a71VarR, c.b);
        }
        if (iM != -1) {
            a71VarR = a71.r(a71VarR, iM + 1, 0, 2);
        } else if (f() != null && a71VarR.e() == 2) {
            a71VarR = a71.c;
        }
        return a71VarR.t();
    }

    public final e1a c() {
        a71 a71Var = c.d;
        a71 a71Var2 = this.a;
        if (pa7.t(a71Var2, a71Var)) {
            return null;
        }
        a71 a71Var3 = c.a;
        if (pa7.t(a71Var2, a71Var3)) {
            return null;
        }
        a71 a71Var4 = c.b;
        if (pa7.t(a71Var2, a71Var4)) {
            return null;
        }
        a71 a71Var5 = c.e;
        a71Var2.getClass();
        a71Var5.getClass();
        if (a71Var2.n(a71Var2.e() - a71Var5.e(), a71Var5, a71Var5.e()) && (a71Var2.e() == 2 || a71Var2.n(a71Var2.e() - 3, a71Var3, 1) || a71Var2.n(a71Var2.e() - 3, a71Var4, 1))) {
            return null;
        }
        int iM = a71.m(a71Var2, a71Var3);
        if (iM == -1) {
            iM = a71.m(a71Var2, a71Var4);
        }
        if (iM == 2 && f() != null) {
            if (a71Var2.e() == 3) {
                return null;
            }
            return new e1a(a71.r(a71Var2, 0, 3, 1));
        }
        if (iM == 1) {
            a71Var4.getClass();
            if (a71Var2.n(0, a71Var4, a71Var4.e())) {
                return null;
            }
        }
        if (iM != -1 || f() == null) {
            if (iM == -1) {
                return new e1a(a71Var);
            }
            return iM == 0 ? new e1a(a71.r(a71Var2, 0, 1, 1)) : new e1a(a71.r(a71Var2, 0, iM, 1));
        }
        if (a71Var2.e() == 2) {
            return null;
        }
        return new e1a(a71.r(a71Var2, 0, 2, 1));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        e1a e1aVar = (e1a) obj;
        e1aVar.getClass();
        return this.a.compareTo(e1aVar.a);
    }

    public final e1a d(e1a e1aVar) {
        e1aVar.getClass();
        a71 a71Var = e1aVar.a;
        int iC = c.c(this);
        a71 a71Var2 = this.a;
        e1a e1aVar2 = iC == -1 ? null : new e1a(a71Var2.q(0, iC));
        int iC2 = c.c(e1aVar);
        if (!pa7.t(e1aVar2, iC2 == -1 ? null : new e1a(a71Var.q(0, iC2)))) {
            ho7.x("Paths of different roots cannot be relative to each other: ", this, " and ", e1aVar);
            return null;
        }
        ArrayList arrayListA = a();
        ArrayList arrayListA2 = e1aVar.a();
        int iMin = Math.min(arrayListA.size(), arrayListA2.size());
        int i = 0;
        while (i < iMin && pa7.t(arrayListA.get(i), arrayListA2.get(i))) {
            i++;
        }
        if (i == iMin && a71Var2.e() == a71Var.e()) {
            return y25.r(".");
        }
        if (arrayListA2.subList(i, arrayListA2.size()).indexOf(c.e) != -1) {
            ho7.x("Impossible relative path to resolve: ", this, " and ", e1aVar);
            return null;
        }
        if (pa7.t(a71Var, c.d)) {
            return this;
        }
        f41 f41Var = new f41();
        a71 a71VarB = c.b(e1aVar);
        if (a71VarB == null && (a71VarB = c.b(this)) == null) {
            a71VarB = c.f(b);
        }
        int size = arrayListA2.size();
        for (int i2 = i; i2 < size; i2++) {
            f41Var.f1(c.e);
            f41Var.f1(a71VarB);
        }
        int size2 = arrayListA.size();
        while (i < size2) {
            f41Var.f1((a71) arrayListA.get(i));
            f41Var.f1(a71VarB);
            i++;
        }
        return c.d(f41Var, false);
    }

    public final e1a e(String str) {
        str.getClass();
        f41 f41Var = new f41();
        f41Var.n1(str);
        return c.a(this, c.d(f41Var, false), false);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e1a) && pa7.t(((e1a) obj).a, this.a);
    }

    public final Character f() {
        a71 a71Var = c.a;
        a71 a71Var2 = this.a;
        if (a71.i(a71Var2, a71Var) != -1 || a71Var2.e() < 2 || a71Var2.k(1) != 58) {
            return null;
        }
        char cK = (char) a71Var2.k(0);
        if (('a' > cK || cK >= '{') && ('A' > cK || cK >= '[')) {
            return null;
        }
        return Character.valueOf(cK);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final File toFile() {
        return new File(this.a.t());
    }

    public final String toString() {
        return this.a.t();
    }
}
