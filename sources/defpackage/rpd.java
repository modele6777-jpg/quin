package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rpd extends i4 {
    public static final rpd b = new rpd(new Object[0]);
    public final Object[] a;

    public rpd(Object[] objArr) {
        this.a = objArr;
    }

    @Override // defpackage.d1
    public final int c() {
        return this.a.length;
    }

    @Override // defpackage.i4
    public final i4 d(int i, Object obj) {
        Object[] objArr = this.a;
        lmg.T(i, objArr.length);
        if (i == objArr.length) {
            return e(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            qd0.d0(0, i, 6, objArr, objArr2);
            qd0.Z(i + 1, i, objArr.length, objArr, objArr2);
            objArr2[i] = obj;
            return new rpd(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        qd0.Z(i + 1, i, objArr.length - 1, objArr, objArrCopyOf);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new baa(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // defpackage.i4
    public final i4 e(Object obj) {
        Object[] objArr = this.a;
        if (objArr.length < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
            objArrCopyOf[objArr.length] = obj;
            return new rpd(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new baa(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // defpackage.i4
    public final i4 g(Collection collection) {
        Object[] objArr = this.a;
        if (collection.size() + objArr.length > 32) {
            caa caaVarI = i();
            caaVarI.addAll(collection);
            return caaVarI.e();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new rpd(objArrCopyOf);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr = this.a;
        lmg.S(i, objArr.length);
        return objArr[i];
    }

    @Override // defpackage.i4
    public final caa i() {
        return new caa(this, null, this.a, 0);
    }

    @Override // defpackage.o2, java.util.List
    public final int indexOf(Object obj) {
        return qd0.r0(this.a, obj);
    }

    @Override // defpackage.i4
    public final i4 j(h4 h4Var) {
        Object[] objArr = this.a;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) h4Var.d(obj)).booleanValue()) {
                if (!z) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        return length == 0 ? b : new rpd(qd0.f0(objArrCopyOf, 0, length));
    }

    @Override // defpackage.i4
    public final i4 k(int i) {
        Object[] objArr = this.a;
        lmg.S(i, objArr.length);
        if (objArr.length == 1) {
            return b;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        qd0.Z(i, i + 1, objArr.length, objArr, objArrCopyOf);
        return new rpd(objArrCopyOf);
    }

    @Override // defpackage.o2, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.a;
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i >= 0) {
                        length = i;
                    }
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    @Override // defpackage.o2, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.a;
        lmg.T(i, objArr.length);
        return new h41(objArr, i, objArr.length);
    }

    @Override // defpackage.i4
    public final i4 m(int i, Object obj) {
        Object[] objArr = this.a;
        lmg.S(i, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = obj;
        return new rpd(objArrCopyOf);
    }
}
