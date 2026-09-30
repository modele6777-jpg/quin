package defpackage;

import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b59 {
    public final a82 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final ArrayList g;
    public final ArrayList h;

    public b59(a82 a82Var, long j, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int iG;
        int i5;
        this.a = a82Var;
        this.b = i;
        if (kl2.j(j) != 0 || kl2.i(j) != 0) {
            j37.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) a82Var.b;
        int size = arrayList2.size();
        float f = 0.0f;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i6 >= size) {
                i3 = 0;
                z = false;
                break;
            }
            py9 py9Var = (py9) arrayList2.get(i6);
            xt xtVar = py9Var.a;
            int iH = kl2.h(j);
            if (kl2.c(j)) {
                i4 = i6;
                iG = kl2.g(j) - ((int) Math.ceil(f));
                if (iG < 0) {
                    iG = 0;
                }
            } else {
                i4 = i6;
                iG = kl2.g(j);
            }
            i3 = 0;
            tt ttVar = new tt(xtVar, this.b - i7, i2, ll2.b(0, iH, 0, iG, 5));
            float f2 = ttVar.f + f;
            qte qteVar = ttVar.d;
            int i8 = i7 + qteVar.g;
            arrayList.add(new oy9(ttVar, py9Var.b, py9Var.c, i7, i8, f, f2));
            if (!qteVar.d) {
                if (i8 == this.b) {
                    i5 = i4;
                    if (i5 != t72.E((ArrayList) this.a.b)) {
                    }
                } else {
                    i5 = i4;
                }
                i6 = i5 + 1;
                i7 = i8;
                f = f2;
            }
            z = true;
            i7 = i8;
            f = f2;
            break;
        }
        this.e = f;
        this.f = i7;
        this.c = z;
        this.h = arrayList;
        this.d = kl2.h(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i9 = i3; i9 < size2; i9++) {
            oy9 oy9Var = (oy9) arrayList.get(i9);
            List list = oy9Var.a.g;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i10 = i3; i10 < size3; i10++) {
                hkb hkbVar = (hkb) list.get(i10);
                arrayList4.add(hkbVar != null ? oy9Var.a(hkbVar) : null);
            }
            x72.g0(arrayList3, arrayList4);
        }
        if (arrayList3.size() < ((List) this.a.d).size()) {
            int size4 = ((List) this.a.d).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i11 = i3; i11 < size4; i11++) {
                arrayList5.add(null);
            }
            arrayList3 = s72.Q0(arrayList3, arrayList5);
        }
        this.g = arrayList3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(long j, float[] fArr) {
        j(eue.g(j));
        k(eue.f(j));
        kmb kmbVar = new kmb();
        kmbVar.element = 0;
        hkg.s0(this.h, j, new r01(j, fArr, kmbVar, new jmb(), 2));
    }

    public final float b(int i) {
        l(i);
        ArrayList arrayList = this.h;
        oy9 oy9Var = (oy9) arrayList.get(hkg.q0(i, arrayList));
        tt ttVar = oy9Var.a;
        return ttVar.d.e(i - oy9Var.d) + oy9Var.f;
    }

    public final int c(int i, boolean z) {
        int iF;
        l(i);
        ArrayList arrayList = this.h;
        oy9 oy9Var = (oy9) arrayList.get(hkg.q0(i, arrayList));
        tt ttVar = oy9Var.a;
        int i2 = i - oy9Var.d;
        qte qteVar = ttVar.d;
        if (z) {
            Layout layout = qteVar.f;
            ThreadLocal threadLocal = vte.a;
            if (layout.getEllipsisCount(i2) <= 0 || qteVar.b != TextUtils.TruncateAt.END) {
                a82 a82VarC = qteVar.c();
                Layout layout2 = (Layout) a82VarC.c;
                iF = a82VarC.H(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                iF = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            iF = qteVar.f(i2);
        }
        return iF + oy9Var.b;
    }

    public final int d(int i) {
        int iP0;
        int length = ((k00) this.a.c).b.length();
        ArrayList arrayList = this.h;
        if (i >= length) {
            iP0 = arrayList.size() - 1;
        } else {
            iP0 = i < 0 ? 0 : hkg.p0(i, arrayList);
        }
        oy9 oy9Var = (oy9) arrayList.get(iP0);
        return oy9Var.a.d.g(oy9Var.d(i)) + oy9Var.d;
    }

    public final int e(float f) {
        int lineForVertical;
        ArrayList arrayList = this.h;
        oy9 oy9Var = (oy9) arrayList.get(hkg.r0(arrayList, f));
        int i = oy9Var.c - oy9Var.b;
        int i2 = oy9Var.d;
        if (i == 0) {
            return i2;
        }
        tt ttVar = oy9Var.a;
        float f2 = f - oy9Var.f;
        qte qteVar = ttVar.d;
        int i3 = (int) (f2 - 0.0f);
        int i4 = qteVar.g;
        if (i4 <= 0) {
            lineForVertical = 0;
        } else {
            lineForVertical = qteVar.f.getLineForVertical(i3 - qteVar.h);
            int i5 = i4 - 1;
            if (lineForVertical > i5) {
                lineForVertical = i5;
            }
        }
        return lineForVertical + i2;
    }

    public final float f(int i) {
        l(i);
        ArrayList arrayList = this.h;
        oy9 oy9Var = (oy9) arrayList.get(hkg.q0(i, arrayList));
        tt ttVar = oy9Var.a;
        return ttVar.d.i(i - oy9Var.d) + oy9Var.f;
    }

    public final int g(long j) {
        int offsetForHorizontal;
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.h;
        oy9 oy9Var = (oy9) arrayList.get(hkg.r0(arrayList, fIntBitsToFloat));
        int i2 = oy9Var.c;
        int i3 = oy9Var.b;
        if (i2 - i3 == 0) {
            return i3;
        }
        tt ttVar = oy9Var.a;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat(i) - oy9Var.f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        qte qteVar = ttVar.d;
        int iIntBitsToFloat = (int) (Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits)) - 0.0f);
        Layout layout = qteVar.f;
        int lineForVertical = layout.getLineForVertical(iIntBitsToFloat - qteVar.h);
        if (lineForVertical >= qteVar.g) {
            offsetForHorizontal = layout.getText().length();
        } else {
            offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (qteVar.b(lineForVertical) * (-1.0f)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)));
        }
        return offsetForHorizontal + i3;
    }

    public final long h(hkb hkbVar, int i, cva cvaVar) {
        long jB;
        long j;
        float f = hkbVar.b;
        ArrayList arrayList = this.h;
        int iR0 = hkg.r0(arrayList, f);
        float f2 = ((oy9) arrayList.get(iR0)).g;
        float f3 = hkbVar.d;
        if (f2 >= f3 || iR0 == arrayList.size() - 1) {
            oy9 oy9Var = (oy9) arrayList.get(iR0);
            return oy9Var.b(oy9Var.a.b(oy9Var.c(hkbVar), i, cvaVar), true);
        }
        int iR1 = hkg.r0(arrayList, f3);
        long jB2 = eue.b;
        while (true) {
            jB = eue.b;
            if (!eue.c(jB2, jB) || iR0 > iR1) {
                break;
            }
            oy9 oy9Var2 = (oy9) arrayList.get(iR0);
            jB2 = oy9Var2.b(oy9Var2.a.b(oy9Var2.c(hkbVar), i, cvaVar), true);
            iR0++;
        }
        if (eue.c(jB2, jB)) {
            return jB;
        }
        while (true) {
            j = eue.b;
            if (!eue.c(jB, j) || iR0 > iR1) {
                break;
            }
            oy9 oy9Var3 = (oy9) arrayList.get(iR1);
            jB = oy9Var3.b(oy9Var3.a.b(oy9Var3.c(hkbVar), i, cvaVar), true);
            iR1--;
        }
        return eue.c(jB, j) ? jB2 : u3c.b((int) (jB2 >> 32), (int) (4294967295L & jB));
    }

    public final void i(vl1 vl1Var, long j, o4d o4dVar, mne mneVar, un4 un4Var) {
        vl1Var.g();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            oy9 oy9Var = (oy9) arrayList.get(i);
            oy9Var.a.e(vl1Var, j, o4dVar, mneVar, un4Var);
            vl1Var.n(0.0f, oy9Var.a.f);
        }
        vl1Var.o();
    }

    public final void j(int i) {
        k00 k00Var = (k00) this.a.c;
        if (i < 0 || i >= k00Var.b.length()) {
            j37.a("offset(" + i + ") is out of bounds [0, " + k00Var.b.length() + ")");
        }
    }

    public final void k(int i) {
        k00 k00Var = (k00) this.a.c;
        if (i < 0 || i > k00Var.b.length()) {
            j37.a("offset(" + i + ") is out of bounds [0, " + k00Var.b.length() + "]");
        }
    }

    public final void l(int i) {
        boolean z = false;
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        j37.a("lineIndex(" + i + ") is out of bounds [0, " + i2 + ")");
    }
}
