package defpackage;

import java.util.Arrays;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class baa extends i4 {
    public final Object[] a;
    public final Object[] b;
    public final int c;
    public final int d;

    public baa(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.a = objArr;
        this.b = objArr2;
        this.c = i;
        this.d = i2;
        if (!(c() > 32)) {
            epa.a("Trie-based persistent vector should have at least 33 elements, got " + c());
        }
        int length = objArr2.length;
    }

    public static Object[] n(Object[] objArr, int i, int i2, Object obj, ze zeVar) {
        int iJ = a6c.j(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iJ == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            qd0.Z(iJ + 1, iJ, 31, objArr, objArrCopyOf);
            zeVar.a = objArr[31];
            objArrCopyOf[iJ] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        Object obj2 = objArr[iJ];
        obj2.getClass();
        objArrCopyOf2[iJ] = n((Object[]) obj2, i3, i2, obj, zeVar);
        while (true) {
            iJ++;
            if (iJ >= 32 || objArrCopyOf2[iJ] == null) {
                break;
            }
            Object obj3 = objArr[iJ];
            obj3.getClass();
            objArrCopyOf2[iJ] = n((Object[]) obj3, i3, 0, zeVar.a, zeVar);
        }
        return objArrCopyOf2;
    }

    public static Object[] p(Object[] objArr, int i, int i2, ze zeVar) {
        Object[] objArrP;
        int iJ = a6c.j(i2, i);
        if (i == 5) {
            zeVar.a = objArr[iJ];
            objArrP = null;
        } else {
            Object obj = objArr[iJ];
            obj.getClass();
            objArrP = p((Object[]) obj, i - 5, i2, zeVar);
        }
        if (objArrP == null && iJ == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf[iJ] = objArrP;
        return objArrCopyOf;
    }

    public static Object[] w(int i, int i2, Object obj, Object[] objArr) {
        int iJ = a6c.j(i2, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            objArrCopyOf[iJ] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iJ];
        obj2.getClass();
        objArrCopyOf[iJ] = w(i - 5, i2, obj, (Object[]) obj2);
        return objArrCopyOf;
    }

    @Override // defpackage.d1
    public final int c() {
        return this.c;
    }

    @Override // defpackage.i4
    public final i4 d(int i, Object obj) {
        int i2 = this.c;
        lmg.T(i, i2);
        if (i == i2) {
            return e(obj);
        }
        int iV = v();
        Object[] objArr = this.a;
        if (i >= iV) {
            return o(i - iV, obj, objArr);
        }
        ze zeVar = new ze(null);
        return o(0, zeVar.a, n(objArr, this.d, i, obj, zeVar));
    }

    @Override // defpackage.i4
    public final i4 e(Object obj) {
        int iV = v();
        int i = this.c;
        int i2 = i - iV;
        Object[] objArr = this.a;
        Object[] objArr2 = this.b;
        if (i2 < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf[i2] = obj;
            return new baa(objArr, objArrCopyOf, i + 1, this.d);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return q(objArr, objArr2, objArr3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        lmg.S(i, c());
        if (v() <= i) {
            objArr = this.b;
        } else {
            Object[] objArr2 = this.a;
            for (int i2 = this.d; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[a6c.j(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // defpackage.i4
    public final caa i() {
        return new caa(this, this.a, this.b, this.d);
    }

    @Override // defpackage.i4
    public final i4 j(h4 h4Var) {
        caa caaVar = new caa(this, this.a, this.b, this.d);
        caaVar.H(h4Var);
        return caaVar.e();
    }

    @Override // defpackage.i4
    public final i4 k(int i) {
        lmg.S(i, c());
        int iV = v();
        int i2 = this.d;
        Object[] objArr = this.a;
        return i >= iV ? t(objArr, iV, i2, i - iV) : t(s(objArr, i2, i, new ze(this.b[0])), iV, i2, 0);
    }

    @Override // defpackage.o2, java.util.List
    public final ListIterator listIterator(int i) {
        lmg.T(i, this.c);
        return new daa(i, this.c, (this.d / 5) + 1, this.a, this.b);
    }

    @Override // defpackage.i4
    public final i4 m(int i, Object obj) {
        int i2 = this.c;
        lmg.S(i, i2);
        int iV = v();
        Object[] objArr = this.a;
        Object[] objArr2 = this.b;
        int i3 = this.d;
        if (iV > i) {
            return new baa(w(i3, i, obj, objArr), objArr2, i2, i3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        objArrCopyOf[i & 31] = obj;
        return new baa(objArr, objArrCopyOf, i2, i3);
    }

    public final baa o(int i, Object obj, Object[] objArr) {
        int iV = v();
        int i2 = this.c;
        int i3 = i2 - iV;
        Object[] objArr2 = this.b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            qd0.Z(i + 1, i, i3, objArr2, objArrCopyOf);
            objArrCopyOf[i] = obj;
            return new baa(objArr, objArrCopyOf, i2 + 1, this.d);
        }
        Object obj2 = objArr2[31];
        qd0.Z(i + 1, i, i3 - 1, objArr2, objArrCopyOf);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return q(objArr, objArrCopyOf, objArr3);
    }

    public final baa q(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.c;
        int i2 = i >> 5;
        int i3 = this.d;
        if (i2 <= (1 << i3)) {
            return new baa(r(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new baa(r(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    public final Object[] r(int i, Object[] objArr, Object[] objArr2) {
        int iJ = a6c.j(c() - 1, i);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            objArrCopyOf[iJ] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iJ] = r(i - 5, (Object[]) objArrCopyOf[iJ], objArr2);
        return objArrCopyOf;
    }

    public final Object[] s(Object[] objArr, int i, int i2, ze zeVar) {
        int iJ = a6c.j(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iJ == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            qd0.Z(iJ, iJ + 1, 32, objArr, objArrCopyOf);
            objArrCopyOf[31] = zeVar.a;
            zeVar.a = objArr[iJ];
            return objArrCopyOf;
        }
        int iJ2 = objArr[31] == null ? a6c.j(v() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = iJ + 1;
        if (i4 <= iJ2) {
            while (true) {
                Object obj = objArrCopyOf2[iJ2];
                obj.getClass();
                objArrCopyOf2[iJ2] = s((Object[]) obj, i3, 0, zeVar);
                if (iJ2 == i4) {
                    break;
                }
                iJ2--;
            }
        }
        Object obj2 = objArrCopyOf2[iJ];
        obj2.getClass();
        objArrCopyOf2[iJ] = s((Object[]) obj2, i3, i2, zeVar);
        return objArrCopyOf2;
    }

    public final i4 t(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.c - i;
        if (i4 != 1) {
            Object[] objArr2 = this.b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                qd0.Z(i3, i3 + 1, i4, objArr2, objArrCopyOf);
            }
            objArrCopyOf[i5] = null;
            return new baa(objArr, objArrCopyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new rpd(objArr);
        }
        ze zeVar = new ze(null);
        Object[] objArrP = p(objArr, i2, i - 1, zeVar);
        objArrP.getClass();
        Object obj = zeVar.a;
        obj.getClass();
        Object[] objArr3 = (Object[]) obj;
        if (objArrP[1] != null) {
            return new baa(objArrP, objArr3, i, i2);
        }
        Object obj2 = objArrP[0];
        obj2.getClass();
        return new baa((Object[]) obj2, objArr3, i, i2 - 5);
    }

    public final int v() {
        return (this.c - 1) & (-32);
    }
}
