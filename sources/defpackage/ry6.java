package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ry6 extends ay6 implements Set {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 912559;
    public transient jy6 b;

    public static int k(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            pa7.z("collection too large", iMax < 1073741824);
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static ry6 m(int i, Object... objArr) {
        if (i == 0) {
            return fpb.x;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new vkd(obj);
        }
        int iK = k(i);
        Object[] objArr2 = new Object[iK];
        int i2 = iK - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                r82.g(tec.e(i5, "at index "));
                return null;
            }
            int iHashCode = obj2.hashCode();
            int iO = rs0.O(iHashCode);
            while (true) {
                int i6 = iO & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iO++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new vkd(obj4);
        }
        if (k(i4) < iK / 2) {
            return m(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new fpb(i3, i2, i4, objArr, objArr2);
    }

    public static ry6 n(Collection collection) {
        if ((collection instanceof ry6) && !(collection instanceof SortedSet)) {
            ry6 ry6Var = (ry6) collection;
            if (!ry6Var.i()) {
                return ry6Var;
            }
        }
        Object[] array = collection.toArray();
        return m(array.length, array);
    }

    public static ry6 o(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? m(objArr.length, (Object[]) objArr.clone()) : new vkd(objArr[0]);
        }
        return fpb.x;
    }

    public static ry6 q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        pa7.z("the total number of elements must fit in an int", objArr.length <= 2147483641);
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return m(length, objArr2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.ay6
    public jy6 a() {
        jy6 jy6Var = this.b;
        if (jy6Var != null) {
            return jy6Var;
        }
        jy6 jy6VarP = p();
        this.b = jy6VarP;
        return jy6VarP;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ry6) && (this instanceof fpb) && (((ry6) obj) instanceof fpb) && hashCode() != obj.hashCode()) {
            return false;
        }
        return aic.i(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return aic.l(this);
    }

    public jy6 p() {
        Object[] array = toArray(ay6.a);
        ey6 ey6Var = jy6.b;
        return jy6.k(array.length, array);
    }

    @Override // defpackage.ay6
    public Object writeReplace() {
        return new qy6(toArray(ay6.a));
    }
}
