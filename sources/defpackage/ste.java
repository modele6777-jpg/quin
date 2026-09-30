package defpackage;

import android.graphics.RectF;
import android.text.Layout;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ste {
    public final rte a;
    public final b59 b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public ste(rte rteVar, b59 b59Var, long j) {
        this.a = rteVar;
        this.b = b59Var;
        this.c = j;
        ArrayList arrayList = b59Var.h;
        float fD = 0.0f;
        this.d = arrayList.isEmpty() ? 0.0f : ((oy9) arrayList.get(0)).a.d.d(0) + 0.0f;
        if (!arrayList.isEmpty()) {
            oy9 oy9Var = (oy9) s72.F0(arrayList);
            qte qteVar = oy9Var.a.d;
            fD = qteVar.d(qteVar.g - 1) + 0.0f + oy9Var.f;
        }
        this.e = fD;
        this.f = b59Var.g;
    }

    public final txb a(int i) {
        b59 b59Var = this.b;
        b59Var.k(i);
        int length = ((k00) b59Var.a.c).b.length();
        ArrayList arrayList = b59Var.h;
        oy9 oy9Var = (oy9) arrayList.get(i == length ? arrayList.size() - 1 : hkg.p0(i, arrayList));
        return oy9Var.a.d.f.isRtlCharAt(oy9Var.d(i)) ? txb.b : txb.a;
    }

    public final hkb b(int i) {
        float fK;
        float fK2;
        float fJ;
        float fJ2;
        b59 b59Var = this.b;
        b59Var.j(i);
        ArrayList arrayList = b59Var.h;
        oy9 oy9Var = (oy9) arrayList.get(hkg.p0(i, arrayList));
        tt ttVar = oy9Var.a;
        int iD = oy9Var.d(i);
        CharSequence charSequence = ttVar.e;
        if (iD < 0 || iD >= charSequence.length()) {
            j37.a("offset(" + iD + ") is out of bounds [0," + charSequence.length() + ")");
        }
        qte qteVar = ttVar.d;
        int iG = qteVar.g(iD);
        float fI = qteVar.i(iG);
        float fE = qteVar.e(iG);
        Layout layout = qteVar.f;
        boolean z = layout.getParagraphDirection(iG) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iD);
        if (!z || zIsRtlCharAt) {
            if (z && zIsRtlCharAt) {
                fJ = qteVar.k(iD, false);
                fJ2 = qteVar.k(iD + 1, true);
            } else if (zIsRtlCharAt) {
                fJ = qteVar.j(iD, false);
                fJ2 = qteVar.j(iD + 1, true);
            } else {
                fK = qteVar.k(iD, false);
                fK2 = qteVar.k(iD + 1, true);
            }
            float f = fJ;
            fK = fJ2;
            fK2 = f;
        } else {
            fK = qteVar.j(iD, false);
            fK2 = qteVar.j(iD + 1, true);
        }
        RectF rectF = new RectF(fK, fI, fK2, fE);
        return oy9Var.a(new hkb(rectF.left, rectF.top + 0.0f, rectF.right, rectF.bottom + 0.0f));
    }

    public final hkb c(int i) {
        b59 b59Var = this.b;
        b59Var.k(i);
        int length = ((k00) b59Var.a.c).b.length();
        ArrayList arrayList = b59Var.h;
        oy9 oy9Var = (oy9) arrayList.get(i == length ? arrayList.size() - 1 : hkg.p0(i, arrayList));
        tt ttVar = oy9Var.a;
        int iD = oy9Var.d(i);
        CharSequence charSequence = ttVar.e;
        qte qteVar = ttVar.d;
        if (iD < 0 || iD > charSequence.length()) {
            j37.a("offset(" + iD + ") is out of bounds [0," + charSequence.length() + "]");
        }
        float fJ = qteVar.j(iD, false);
        int iG = qteVar.g(iD);
        return oy9Var.a(new hkb(fJ, qteVar.i(iG) + 0.0f, fJ, qteVar.e(iG) + 0.0f));
    }

    public final boolean d() {
        b59 b59Var = this.b;
        return b59Var.c || ((float) ((int) (this.c & 4294967295L))) < b59Var.e;
    }

    public final boolean e() {
        return ((float) ((int) (this.c >> 32))) < this.b.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ste) {
            ste steVar = (ste) obj;
            if (this.a.equals(steVar.a) && this.b == steVar.b && e77.b(this.c, steVar.c) && this.d == steVar.d && this.e == steVar.e && this.f.equals(steVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return e() || d();
    }

    public final float g(int i, boolean z) {
        b59 b59Var = this.b;
        b59Var.k(i);
        int length = ((k00) b59Var.a.c).b.length();
        ArrayList arrayList = b59Var.h;
        oy9 oy9Var = (oy9) arrayList.get(i == length ? arrayList.size() - 1 : hkg.p0(i, arrayList));
        tt ttVar = oy9Var.a;
        int iD = oy9Var.d(i);
        qte qteVar = ttVar.d;
        return z ? qteVar.j(iD, false) : qteVar.k(iD, false);
    }

    public final float h(int i) {
        b59 b59Var = this.b;
        b59Var.l(i);
        ArrayList arrayList = b59Var.h;
        oy9 oy9Var = (oy9) arrayList.get(hkg.q0(i, arrayList));
        tt ttVar = oy9Var.a;
        int i2 = i - oy9Var.d;
        qte qteVar = ttVar.d;
        return qteVar.f.getLineLeft(i2) + (i2 == qteVar.g + (-1) ? qteVar.j : 0.0f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ub3.a(this.e, ub3.a(this.d, ib8.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31), 31);
    }

    public final float i(int i) {
        b59 b59Var = this.b;
        b59Var.l(i);
        ArrayList arrayList = b59Var.h;
        oy9 oy9Var = (oy9) arrayList.get(hkg.q0(i, arrayList));
        tt ttVar = oy9Var.a;
        int i2 = i - oy9Var.d;
        qte qteVar = ttVar.d;
        return qteVar.f.getLineRight(i2) + (i2 == qteVar.g + (-1) ? qteVar.k : 0.0f);
    }

    public final int j(int i) {
        b59 b59Var = this.b;
        b59Var.l(i);
        ArrayList arrayList = b59Var.h;
        oy9 oy9Var = (oy9) arrayList.get(hkg.q0(i, arrayList));
        tt ttVar = oy9Var.a;
        return ttVar.d.f.getLineStart(i - oy9Var.d) + oy9Var.b;
    }

    public final txb k(int i) {
        b59 b59Var = this.b;
        b59Var.k(i);
        int length = ((k00) b59Var.a.c).b.length();
        ArrayList arrayList = b59Var.h;
        oy9 oy9Var = (oy9) arrayList.get(i == length ? arrayList.size() - 1 : hkg.p0(i, arrayList));
        tt ttVar = oy9Var.a;
        int iD = oy9Var.d(i);
        qte qteVar = ttVar.d;
        return qteVar.f.getParagraphDirection(qteVar.g(iD)) == 1 ? txb.a : txb.b;
    }

    public final zt l(int i, int i2) {
        b59 b59Var = this.b;
        k00 k00Var = (k00) b59Var.a.c;
        if (i < 0 || i > i2 || i2 > k00Var.b.length()) {
            int length = k00Var.b.length();
            StringBuilder sbN = ib8.n(i, i2, "Start(", ") or End(", ") is out of range [0..");
            sbN.append(length);
            sbN.append("), or start > end!");
            j37.a(sbN.toString());
        }
        if (i == i2) {
            return cu.a();
        }
        zt ztVarA = cu.a();
        hkg.s0(b59Var.h, u3c.b(i, i2), new rp4(ztVarA, i, i2, 1));
        return ztVarA;
    }

    public final long m(int i) {
        int iA0;
        int iL;
        int iL2;
        b59 b59Var = this.b;
        b59Var.k(i);
        int length = ((k00) b59Var.a.c).b.length();
        ArrayList arrayList = b59Var.h;
        oy9 oy9Var = (oy9) arrayList.get(i == length ? arrayList.size() - 1 : hkg.p0(i, arrayList));
        tt ttVar = oy9Var.a;
        int iD = oy9Var.d(i);
        p90 p90VarL = ttVar.d.l();
        if (p90VarL.I(p90VarL.a0(iD))) {
            p90VarL.j(iD);
            iA0 = iD;
            while (iA0 != -1 && (!p90VarL.I(iA0) || p90VarL.E(iA0))) {
                iA0 = p90VarL.a0(iA0);
            }
        } else {
            p90VarL.j(iD);
            if (p90VarL.H(iD)) {
                iA0 = (!p90VarL.F(iD) || p90VarL.D(iD)) ? p90VarL.a0(iD) : iD;
            } else {
                iA0 = p90VarL.D(iD) ? p90VarL.a0(iD) : -1;
            }
        }
        if (iA0 == -1) {
            iA0 = iD;
        }
        if (p90VarL.E(p90VarL.L(iD))) {
            p90VarL.j(iD);
            iL = iD;
            while (iL != -1 && (p90VarL.I(iL) || !p90VarL.E(iL))) {
                iL = p90VarL.L(iL);
            }
        } else {
            p90VarL.j(iD);
            if (p90VarL.D(iD)) {
                if (!p90VarL.F(iD) || p90VarL.H(iD)) {
                    iL2 = p90VarL.L(iD);
                    iL = iL2;
                } else {
                    iL = iD;
                }
            } else if (p90VarL.H(iD)) {
                iL2 = p90VarL.L(iD);
                iL = iL2;
            } else {
                iL = -1;
            }
        }
        if (iL != -1) {
            iD = iL;
        }
        return oy9Var.b(u3c.b(iA0, iD), false);
    }

    public final boolean n(int i) {
        b59 b59Var = this.b;
        b59Var.l(i);
        ArrayList arrayList = b59Var.h;
        oy9 oy9Var = (oy9) arrayList.get(hkg.q0(i, arrayList));
        tt ttVar = oy9Var.a;
        int i2 = i - oy9Var.d;
        Layout layout = ttVar.d.f;
        ThreadLocal threadLocal = vte.a;
        return layout.getEllipsisCount(i2) > 0;
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + e77.c(this.c) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ")";
    }
}
