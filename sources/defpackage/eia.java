package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class eia extends gye {
    public static final /* synthetic */ int k = 0;
    public final int b;
    public final ggd c;
    public final int d;
    public final int e;
    public final int[] f;
    public final int[] g;
    public final gye[] h;
    public final Object[] i;
    public final HashMap j;

    public eia(gye[] gyeVarArr, Object[] objArr, ggd ggdVar) {
        this.c = ggdVar;
        this.b = ggdVar.b.length;
        int length = gyeVarArr.length;
        this.h = gyeVarArr;
        this.f = new int[length];
        this.g = new int[length];
        this.i = objArr;
        this.j = new HashMap();
        int length2 = gyeVarArr.length;
        int i = 0;
        int iO = 0;
        int iH = 0;
        int i2 = 0;
        while (i < length2) {
            gye gyeVar = gyeVarArr[i];
            this.h[i2] = gyeVar;
            this.g[i2] = iO;
            this.f[i2] = iH;
            iO += gyeVar.o();
            iH += this.h[i2].h();
            this.j.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.d = iO;
        this.e = iH;
    }

    @Override // defpackage.gye
    public final int a(boolean z) {
        if (this.b != 0) {
            int iQ = 0;
            if (z) {
                int[] iArr = this.c.b;
                iQ = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                gye[] gyeVarArr = this.h;
                if (!gyeVarArr[iQ].p()) {
                    return gyeVarArr[iQ].a(z) + this.g[iQ];
                }
                iQ = q(iQ, z);
            } while (iQ != -1);
        }
        return -1;
    }

    @Override // defpackage.gye
    public final int b(Object obj) {
        int iB;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.j.get(obj2);
            int iIntValue = num == null ? -1 : num.intValue();
            if (iIntValue != -1 && (iB = this.h[iIntValue].b(obj3)) != -1) {
                return this.f[iIntValue] + iB;
            }
        }
        return -1;
    }

    @Override // defpackage.gye
    public final int c(boolean z) {
        int iR;
        int i = this.b;
        if (i != 0) {
            if (z) {
                int[] iArr = this.c.b;
                iR = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                iR = i - 1;
            }
            do {
                gye[] gyeVarArr = this.h;
                if (!gyeVarArr[iR].p()) {
                    return gyeVarArr[iR].c(z) + this.g[iR];
                }
                iR = r(iR, z);
            } while (iR != -1);
        }
        return -1;
    }

    @Override // defpackage.gye
    public final int e(int i, int i2, boolean z) {
        int[] iArr = this.g;
        int iC = pqf.c(iArr, i + 1, false, false);
        int i3 = iArr[iC];
        gye[] gyeVarArr = this.h;
        int iE = gyeVarArr[iC].e(i - i3, i2 != 2 ? i2 : 0, z);
        if (iE != -1) {
            return i3 + iE;
        }
        int iQ = q(iC, z);
        while (iQ != -1 && gyeVarArr[iQ].p()) {
            iQ = q(iQ, z);
        }
        if (iQ != -1) {
            return gyeVarArr[iQ].a(z) + iArr[iQ];
        }
        if (i2 == 2) {
            return a(z);
        }
        return -1;
    }

    @Override // defpackage.gye
    public final eye f(int i, eye eyeVar, boolean z) {
        int[] iArr = this.f;
        int iC = pqf.c(iArr, i + 1, false, false);
        int i2 = this.g[iC];
        this.h[iC].f(i - iArr[iC], eyeVar, z);
        eyeVar.c += i2;
        if (z) {
            Object obj = this.i[iC];
            Object obj2 = eyeVar.b;
            obj2.getClass();
            eyeVar.b = Pair.create(obj, obj2);
        }
        return eyeVar;
    }

    @Override // defpackage.gye
    public final eye g(Object obj, eye eyeVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.j.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i = this.g[iIntValue];
        this.h[iIntValue].g(obj3, eyeVar);
        eyeVar.c += i;
        eyeVar.b = obj;
        return eyeVar;
    }

    @Override // defpackage.gye
    public final int h() {
        return this.e;
    }

    @Override // defpackage.gye
    public final int k(int i, int i2, boolean z) {
        int[] iArr = this.g;
        int iC = pqf.c(iArr, i + 1, false, false);
        int i3 = iArr[iC];
        gye[] gyeVarArr = this.h;
        int iK = gyeVarArr[iC].k(i - i3, i2 != 2 ? i2 : 0, z);
        if (iK != -1) {
            return i3 + iK;
        }
        int iR = r(iC, z);
        while (iR != -1 && gyeVarArr[iR].p()) {
            iR = r(iR, z);
        }
        if (iR != -1) {
            return gyeVarArr[iR].c(z) + iArr[iR];
        }
        if (i2 == 2) {
            return c(z);
        }
        return -1;
    }

    @Override // defpackage.gye
    public final Object l(int i) {
        int[] iArr = this.f;
        int iC = pqf.c(iArr, i + 1, false, false);
        return Pair.create(this.i[iC], this.h[iC].l(i - iArr[iC]));
    }

    @Override // defpackage.gye
    public final fye m(int i, fye fyeVar, long j) {
        int[] iArr = this.g;
        int iC = pqf.c(iArr, i + 1, false, false);
        int i2 = iArr[iC];
        int i3 = this.f[iC];
        this.h[iC].m(i - i2, fyeVar, j);
        Object objCreate = this.i[iC];
        Object obj = fye.o;
        Object obj2 = fyeVar.a;
        if (obj != obj2) {
            objCreate = Pair.create(objCreate, obj2);
        }
        fyeVar.a = objCreate;
        fyeVar.l += i3;
        fyeVar.m += i3;
        return fyeVar;
    }

    @Override // defpackage.gye
    public final int o() {
        return this.d;
    }

    public final int q(int i, boolean z) {
        if (!z) {
            if (i < this.b - 1) {
                return i + 1;
            }
            return -1;
        }
        ggd ggdVar = this.c;
        int i2 = ggdVar.c[i] + 1;
        int[] iArr = ggdVar.b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    public final int r(int i, boolean z) {
        if (!z) {
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }
        ggd ggdVar = this.c;
        int i2 = ggdVar.c[i] - 1;
        if (i2 >= 0) {
            return ggdVar.b[i2];
        }
        return -1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public eia(ArrayList arrayList, ggd ggdVar) {
        gye[] gyeVarArr = new gye[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            gyeVarArr[i2] = ((gq8) it.next()).b();
            i2++;
        }
        Object[] objArr = new Object[arrayList.size()];
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((gq8) it2.next()).a();
            i++;
        }
        this(gyeVarArr, objArr, ggdVar);
    }
}
