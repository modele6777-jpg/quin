package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class caa extends n3 implements Collection, an7 {
    public i4 a;
    public Object[] b;
    public Object[] c;
    public int d;
    public jy4 e = new jy4(14);
    public Object[] f;
    public Object[] g;
    public int v;

    public caa(i4 i4Var, Object[] objArr, Object[] objArr2, int i) {
        this.a = i4Var;
        this.b = objArr;
        this.c = objArr2;
        this.d = i;
        this.f = objArr;
        this.g = objArr2;
        this.v = i4Var.c();
    }

    public static void g(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final void A(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.v;
        int i2 = i >> 5;
        int i3 = this.d;
        if (i2 > (1 << i3)) {
            this.f = B(this.d + 5, s(objArr), objArr2);
            this.g = objArr3;
            this.d += 5;
            this.v++;
            return;
        }
        if (objArr == null) {
            this.f = objArr2;
            this.g = objArr3;
            this.v = i + 1;
        } else {
            this.f = B(i3, objArr, objArr2);
            this.g = objArr3;
            this.v++;
        }
    }

    public final Object[] B(int i, Object[] objArr, Object[] objArr2) {
        int iJ = a6c.j(c() - 1, i);
        Object[] objArrP = p(objArr);
        if (i == 5) {
            objArrP[iJ] = objArr2;
            return objArrP;
        }
        objArrP[iJ] = B(i - 5, (Object[]) objArrP[iJ], objArr2);
        return objArrP;
    }

    public final int C(a26 a26Var, Object[] objArr, int i, int i2, ze zeVar, ArrayList arrayList, ArrayList arrayList2) {
        if (n(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = zeVar.a;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrR = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) a26Var.d(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrR = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : r();
                    i2 = 0;
                }
                objArrR[i2] = obj2;
                i2++;
            }
        }
        zeVar.a = objArrR;
        if (objArr2 != objArrR) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int D(a26 a26Var, Object[] objArr, int i, ze zeVar) {
        Object[] objArrP = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) a26Var.d(obj)).booleanValue()) {
                if (!z) {
                    objArrP = p(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrP[i2] = obj;
                i2++;
            }
        }
        zeVar.a = objArrP;
        return i2;
    }

    public final int F(a26 a26Var, int i, ze zeVar) {
        int iD = D(a26Var, this.g, i, zeVar);
        Object obj = zeVar.a;
        if (iD == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iD, i, (Object) null);
        this.g = objArr;
        this.v -= i - iD;
        return iD;
    }

    public final boolean H(a26 a26Var) {
        int i;
        a26 a26Var2 = a26Var;
        int iO = O();
        Object[] objArrT = null;
        ze zeVar = new ze(null);
        boolean z = false;
        if (this.f != null) {
            p2 p2VarO = o(0);
            int iD = 32;
            while (iD == 32 && p2VarO.hasNext()) {
                iD = D(a26Var2, (Object[]) p2VarO.next(), 32, zeVar);
            }
            if (iD == 32) {
                int iF = F(a26Var2, iO, zeVar);
                if (iF == 0) {
                    w(this.f, this.v, this.d);
                }
                if (iF != iO) {
                }
            } else {
                int i2 = (p2VarO.a - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iC = iD;
                while (p2VarO.hasNext()) {
                    iC = C(a26Var2, (Object[]) p2VarO.next(), 32, iC, zeVar, arrayList2, arrayList);
                    a26Var2 = a26Var;
                }
                int iC2 = C(a26Var, this.g, iO, iC, zeVar, arrayList2, arrayList);
                Object obj = zeVar.a;
                obj.getClass();
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iC2, 32, (Object) null);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArrX = this.f;
                if (zIsEmpty) {
                    objArrX.getClass();
                } else {
                    objArrX = x(objArrX, i2, this.d, arrayList.iterator());
                }
                int size = i2 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    epa.a("invalid size");
                }
                if (size == 0) {
                    this.d = 0;
                } else {
                    int i3 = size - 1;
                    while (true) {
                        i = this.d;
                        if ((i3 >> i) != 0) {
                            break;
                        }
                        this.d = i - 5;
                        Object[] objArr2 = objArrX[0];
                        objArr2.getClass();
                        objArrX = objArr2;
                    }
                    objArrT = t(objArrX, i3, i);
                }
                this.f = objArrT;
                this.g = objArr;
                this.v = size + iC2;
            }
            z = true;
        } else if (F(a26Var2, iO, zeVar) != iO) {
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    public final Object[] I(Object[] objArr, int i, int i2, ze zeVar) {
        int iJ = a6c.j(i2, i);
        if (i == 0) {
            Object obj = objArr[iJ];
            Object[] objArrP = p(objArr);
            qd0.Z(iJ, iJ + 1, 32, objArr, objArrP);
            objArrP[31] = zeVar.a;
            zeVar.a = obj;
            return objArrP;
        }
        int iJ2 = objArr[31] == null ? a6c.j(K() - 1, i) : 31;
        Object[] objArrP2 = p(objArr);
        int i3 = i - 5;
        int i4 = iJ + 1;
        if (i4 <= iJ2) {
            while (true) {
                Object obj2 = objArrP2[iJ2];
                obj2.getClass();
                objArrP2[iJ2] = I((Object[]) obj2, i3, 0, zeVar);
                if (iJ2 == i4) {
                    break;
                }
                iJ2--;
            }
        }
        Object obj3 = objArrP2[iJ];
        obj3.getClass();
        objArrP2[iJ] = I((Object[]) obj3, i3, i2, zeVar);
        return objArrP2;
    }

    public final Object J(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.v - i;
        Object[] objArr2 = this.g;
        if (i4 == 1) {
            Object obj = objArr2[0];
            w(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] objArrP = p(objArr2);
        qd0.Z(i3, i3 + 1, i4, objArr2, objArrP);
        objArrP[i4 - 1] = null;
        this.f = objArr;
        this.g = objArrP;
        this.v = (i + i4) - 1;
        this.d = i2;
        return obj2;
    }

    public final int K() {
        int i = this.v;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] L(Object[] objArr, int i, int i2, Object obj, ze zeVar) {
        int iJ = a6c.j(i2, i);
        Object[] objArrP = p(objArr);
        if (i != 0) {
            Object obj2 = objArrP[iJ];
            obj2.getClass();
            objArrP[iJ] = L((Object[]) obj2, i - 5, i2, obj, zeVar);
            return objArrP;
        }
        if (objArrP != objArr) {
            ((AbstractList) this).modCount++;
        }
        zeVar.a = objArrP[iJ];
        objArrP[iJ] = obj;
        return objArrP;
    }

    public final void M(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrR;
        if (i3 < 1) {
            epa.a("requires at least one nullBuffer");
        }
        Object[] objArrP = p(objArr);
        objArr2[0] = objArrP;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            qd0.Z(size + 1, i4, i2, objArrP, objArr3);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrR = objArrP;
            } else {
                objArrR = r();
                i3--;
                objArr2[i3] = objArrR;
            }
            int i7 = i2 - i6;
            qd0.Z(0, i7, i2, objArrP, objArr3);
            qd0.Z(size + 1, i4, i7, objArrP, objArrR);
            objArr3 = objArrR;
        }
        Iterator it = collection.iterator();
        g(objArrP, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrR2 = r();
            g(objArrR2, 0, it);
            objArr2[i8] = objArrR2;
        }
        g(objArr3, 0, it);
    }

    public final int O() {
        int i = this.v;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        lmg.T(i, c());
        if (i == c()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iK = K();
        if (i >= iK) {
            m(i - iK, obj, this.f);
            return;
        }
        ze zeVar = new ze(null);
        Object[] objArr = this.f;
        objArr.getClass();
        m(0, zeVar.a, k(objArr, this.d, i, obj, zeVar));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] objArrR;
        lmg.T(i, this.v);
        if (i == this.v) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.v - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.g;
            Object[] objArrP = p(objArr);
            qd0.Z(size2 + 1, i3, O(), objArr, objArrP);
            g(objArrP, i3, collection.iterator());
            this.g = objArrP;
            this.v = collection.size() + this.v;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iO = O();
        int size3 = collection.size() + this.v;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= K()) {
            objArrR = r();
            collection2 = collection;
            M(collection2, i, this.g, iO, objArr2, size, objArrR);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.g;
            if (size3 > iO) {
                int i4 = size3 - iO;
                Object[] objArrQ = q(i4, objArr3);
                j(collection2, i, i4, objArr2, size, objArrQ);
                objArr2 = objArr2;
                objArrR = objArrQ;
            } else {
                objArrR = r();
                int i5 = iO - size3;
                qd0.Z(0, i5, iO, objArr3, objArrR);
                int i6 = 32 - i5;
                Object[] objArrQ2 = q(i6, this.g);
                int i7 = size - 1;
                objArr2[i7] = objArrQ2;
                j(collection2, i, i6, objArr2, i7, objArrQ2);
                collection2 = collection2;
            }
        }
        this.f = z(this.f, i2, objArr2);
        this.g = objArrR;
        this.v = collection2.size() + this.v;
        return true;
    }

    @Override // defpackage.n3
    public final int c() {
        return this.v;
    }

    @Override // defpackage.n3
    public final Object d(int i) {
        lmg.S(i, c());
        ((AbstractList) this).modCount++;
        int iK = K();
        if (i >= iK) {
            return J(this.f, iK, this.d, i - iK);
        }
        ze zeVar = new ze(this.g[0]);
        Object[] objArr = this.f;
        objArr.getClass();
        J(I(objArr, this.d, i, zeVar), iK, this.d, 0);
        return zeVar.a;
    }

    public final i4 e() {
        i4 baaVar;
        Object[] objArr = this.f;
        if (objArr == this.b && this.g == this.c) {
            baaVar = this.a;
        } else {
            this.e = new jy4(14);
            this.b = objArr;
            Object[] objArr2 = this.g;
            this.c = objArr2;
            if (objArr == null) {
                baaVar = objArr2.length == 0 ? rpd.b : new rpd(Arrays.copyOf(objArr2, this.v));
            } else {
                baaVar = new baa(objArr, objArr2, this.v, this.d);
            }
        }
        this.a = baaVar;
        return baaVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        lmg.S(i, c());
        if (K() <= i) {
            objArr = this.g;
        } else {
            Object[] objArr2 = this.f;
            objArr2.getClass();
            for (int i2 = this.d; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[a6c.j(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    public final int i() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f == null) {
            qc0.p("root is null");
            return;
        }
        int i4 = i >> 5;
        p2 p2VarO = o(K() >> 5);
        int i5 = i3;
        Object[] objArrQ = objArr2;
        while (p2VarO.a - 1 != i4) {
            Object[] objArr3 = (Object[]) p2VarO.previous();
            qd0.Z(0, 32 - i2, 32, objArr3, objArrQ);
            objArrQ = q(i2, objArr3);
            i5--;
            objArr[i5] = objArrQ;
        }
        Object[] objArr4 = (Object[]) p2VarO.previous();
        int iK = i3 - (((K() >> 5) - 1) - i4);
        if (iK < i3) {
            objArr2 = objArr[iK];
            objArr2.getClass();
        }
        M(collection, i, objArr4, 32, objArr, iK, objArr2);
    }

    public final Object[] k(Object[] objArr, int i, int i2, Object obj, ze zeVar) {
        Object obj2;
        int iJ = a6c.j(i2, i);
        if (i == 0) {
            zeVar.a = objArr[31];
            Object[] objArrP = p(objArr);
            qd0.Z(iJ + 1, iJ, 31, objArr, objArrP);
            objArrP[iJ] = obj;
            return objArrP;
        }
        Object[] objArrP2 = p(objArr);
        int i3 = i - 5;
        Object obj3 = objArrP2[iJ];
        obj3.getClass();
        objArrP2[iJ] = k((Object[]) obj3, i3, i2, obj, zeVar);
        while (true) {
            iJ++;
            if (iJ >= 32 || (obj2 = objArrP2[iJ]) == null) {
                break;
            }
            objArrP2[iJ] = k((Object[]) obj2, i3, 0, zeVar.a, zeVar);
        }
        return objArrP2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        lmg.T(i, this.v);
        return new eaa(this, i);
    }

    public final void m(int i, Object obj, Object[] objArr) {
        int iO = O();
        Object[] objArrP = p(this.g);
        Object[] objArr2 = this.g;
        if (iO >= 32) {
            Object obj2 = objArr2[31];
            qd0.Z(i + 1, i, 31, objArr2, objArrP);
            objArrP[i] = obj;
            A(objArr, objArrP, s(obj2));
            return;
        }
        qd0.Z(i + 1, i, iO, objArr2, objArrP);
        objArrP[i] = obj;
        this.f = objArr;
        this.g = objArrP;
        this.v++;
    }

    public final boolean n(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.e;
    }

    public final p2 o(int i) {
        Object[] objArr = this.f;
        if (objArr == null) {
            qc0.p("Invalid root");
            return null;
        }
        int iK = K() >> 5;
        lmg.T(i, iK);
        int i2 = this.d;
        return i2 == 0 ? new h41(i, objArr) : new n4f(objArr, i, iK, i2 / 5);
    }

    public final Object[] p(Object[] objArr) {
        if (objArr == null) {
            return r();
        }
        if (n(objArr)) {
            return objArr;
        }
        Object[] objArrR = r();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        qd0.d0(0, length, 6, objArr, objArrR);
        return objArrR;
    }

    public final Object[] q(int i, Object[] objArr) {
        if (n(objArr)) {
            qd0.Z(i, 0, 32 - i, objArr, objArr);
            return objArr;
        }
        Object[] objArrR = r();
        qd0.Z(i, 0, 32 - i, objArr, objArrR);
        return objArrR;
    }

    public final Object[] r() {
        Object[] objArr = new Object[33];
        objArr[32] = this.e;
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return H(new h4(1, collection));
    }

    public final Object[] s(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.e;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        lmg.S(i, c());
        if (K() > i) {
            ze zeVar = new ze(null);
            Object[] objArr = this.f;
            objArr.getClass();
            this.f = L(objArr, this.d, i, obj, zeVar);
            return zeVar.a;
        }
        Object[] objArrP = p(this.g);
        if (objArrP != this.g) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrP[i2];
        objArrP[i2] = obj;
        this.g = objArrP;
        return obj2;
    }

    public final Object[] t(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            epa.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iJ = a6c.j(i, i2);
        Object obj = objArr[iJ];
        obj.getClass();
        Object objT = t((Object[]) obj, i, i2 - 5);
        if (iJ < 31) {
            int i3 = iJ + 1;
            if (objArr[i3] != null) {
                if (n(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrR = r();
                qd0.Z(0, 0, i3, objArr, objArrR);
                objArr = objArrR;
            }
        }
        if (objT == objArr[iJ]) {
            return objArr;
        }
        Object[] objArrP = p(objArr);
        objArrP[iJ] = objT;
        return objArrP;
    }

    public final Object[] v(Object[] objArr, int i, int i2, ze zeVar) {
        Object[] objArrV;
        int iJ = a6c.j(i2 - 1, i);
        if (i == 5) {
            zeVar.a = objArr[iJ];
            objArrV = null;
        } else {
            Object obj = objArr[iJ];
            obj.getClass();
            objArrV = v((Object[]) obj, i - 5, i2, zeVar);
        }
        if (objArrV == null && iJ == 0) {
            return null;
        }
        Object[] objArrP = p(objArr);
        objArrP[iJ] = objArrV;
        return objArrP;
    }

    public final void w(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.g = objArr;
            this.v = i;
            this.d = i2;
            return;
        }
        ze zeVar = new ze(null);
        objArr.getClass();
        Object[] objArrV = v(objArr, i2, i, zeVar);
        objArrV.getClass();
        Object obj = zeVar.a;
        obj.getClass();
        this.g = (Object[]) obj;
        this.v = i;
        if (objArrV[1] == null) {
            this.f = (Object[]) objArrV[0];
            this.d = i2 - 5;
        } else {
            this.f = objArrV;
            this.d = i2;
        }
    }

    public final Object[] x(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            epa.a("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            epa.a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrP = p(objArr);
        int iJ = a6c.j(i, i2);
        int i3 = i2 - 5;
        objArrP[iJ] = x((Object[]) objArrP[iJ], i, i3, it);
        while (true) {
            iJ++;
            if (iJ >= 32 || !it.hasNext()) {
                break;
            }
            objArrP[iJ] = x((Object[]) objArrP[iJ], 0, i3, it);
        }
        return objArrP;
    }

    public final Object[] z(Object[] objArr, int i, Object[][] objArr2) {
        l2 l2Var = new l2(objArr2);
        int i2 = i >> 5;
        int i3 = this.d;
        Object[] objArrX = i2 < (1 << i3) ? x(objArr, i, i3, l2Var) : p(objArr);
        while (l2Var.hasNext()) {
            this.d += 5;
            objArrX = s(objArrX);
            int i4 = this.d;
            x(objArrX, 1 << i4, i4, l2Var);
        }
        return objArrX;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iO = O();
        if (iO < 32) {
            Object[] objArrP = p(this.g);
            objArrP[iO] = obj;
            this.g = objArrP;
            this.v = c() + 1;
        } else {
            A(this.f, this.g, s(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iO = O();
        Iterator it = collection.iterator();
        if (32 - iO >= collection.size()) {
            Object[] objArrP = p(this.g);
            g(objArrP, iO, it);
            this.g = objArrP;
            this.v = collection.size() + this.v;
            return true;
        }
        int size = ((collection.size() + iO) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrP2 = p(this.g);
        g(objArrP2, iO, it);
        objArr[0] = objArrP2;
        for (int i = 1; i < size; i++) {
            Object[] objArrR = r();
            g(objArrR, 0, it);
            objArr[i] = objArrR;
        }
        this.f = z(this.f, K(), objArr);
        Object[] objArrR2 = r();
        g(objArrR2, 0, it);
        this.g = objArrR2;
        this.v = collection.size() + this.v;
        return true;
    }
}
