package defpackage;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fl8 implements Map, Serializable, cn7 {
    public static final fl8 a;
    private gl8 entriesView;
    private int[] hashArray;
    private int hashShift;
    private boolean isReadOnly;
    private Object[] keysArray;
    private hl8 keysView;
    private int length;
    private int maxProbeDistance;
    private int modCount;
    private int[] presenceArray;
    private int size;
    private Object[] valuesArray;
    private il8 valuesView;

    static {
        fl8 fl8Var = new fl8(0);
        fl8Var.isReadOnly = true;
        a = fl8Var;
    }

    public fl8(int i) {
        if (i < 0) {
            qc0.j("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.keysArray = objArr;
        this.valuesArray = null;
        this.presenceArray = iArr;
        this.hashArray = new int[iHighestOneBit];
        this.maxProbeDistance = 2;
        this.length = 0;
        this.hashShift = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.isReadOnly) {
            return new bzc(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    @Override // java.util.Map
    public final void clear() {
        k();
        int i = this.length - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.presenceArray;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.hashArray[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        hkg.K0(this.keysArray, 0, this.length);
        Object[] objArr = this.valuesArray;
        if (objArr != null) {
            hkg.K0(objArr, 0, this.length);
        }
        this.size = 0;
        this.length = 0;
        this.modCount++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return p(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return q(obj) >= 0;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        gl8 gl8Var = this.entriesView;
        if (gl8Var != null) {
            return gl8Var;
        }
        gl8 gl8Var2 = new gl8(this);
        this.entriesView = gl8Var2;
        return gl8Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.size == map.size() && m(map.entrySet());
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iP = p(obj);
        if (iP < 0) {
            return null;
        }
        Object[] objArr = this.valuesArray;
        objArr.getClass();
        return objArr[iP];
    }

    public final int h(Object obj) {
        k();
        while (true) {
            int iR = r(obj);
            int i = this.maxProbeDistance * 2;
            int length = this.hashArray.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.hashArray;
                int i3 = iArr[iR];
                if (i3 == 0) {
                    int i4 = this.length;
                    Object[] objArr = this.keysArray;
                    if (i4 >= objArr.length) {
                        o(1);
                        break;
                    }
                    int i5 = i4 + 1;
                    this.length = i5;
                    objArr[i4] = obj;
                    this.presenceArray[i4] = iR;
                    iArr[iR] = i5;
                    this.size++;
                    this.modCount++;
                    if (i2 > this.maxProbeDistance) {
                        this.maxProbeDistance = i2;
                    }
                    return i4;
                }
                if (pa7.t(this.keysArray[i3 - 1], obj)) {
                    return -i3;
                }
                i2++;
                if (i2 > i) {
                    t(this.hashArray.length * 2);
                    break;
                }
                iR = iR == 0 ? this.hashArray.length - 1 : iR - 1;
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        cl8 cl8Var = new cl8(this, 0);
        int i = 0;
        while (cl8Var.hasNext()) {
            int i2 = cl8Var.a;
            fl8 fl8Var = (fl8) cl8Var.d;
            if (i2 >= fl8Var.length) {
                s8f.c();
                return 0;
            }
            int i3 = cl8Var.a;
            cl8Var.a = i3 + 1;
            cl8Var.b = i3;
            Object obj = fl8Var.keysArray[cl8Var.b];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = fl8Var.valuesArray;
            objArr.getClass();
            Object obj2 = objArr[cl8Var.b];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            cl8Var.f();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    public final Object[] i() {
        Object[] objArr = this.valuesArray;
        if (objArr != null) {
            return objArr;
        }
        int length = this.keysArray.length;
        if (length < 0) {
            qc0.j("capacity must be non-negative.");
            return null;
        }
        Object[] objArr2 = new Object[length];
        this.valuesArray = objArr2;
        return objArr2;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.size == 0;
    }

    public final fl8 j() {
        k();
        this.isReadOnly = true;
        if (this.size > 0) {
            return this;
        }
        fl8 fl8Var = a;
        fl8Var.getClass();
        return fl8Var;
    }

    public final void k() {
        if (this.isReadOnly) {
            cva.f();
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        hl8 hl8Var = this.keysView;
        if (hl8Var != null) {
            return hl8Var;
        }
        hl8 hl8Var2 = new hl8(this);
        this.keysView = hl8Var2;
        return hl8Var2;
    }

    public final void l(boolean z) {
        int i;
        Object[] objArr = this.valuesArray;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.length;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.presenceArray;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.keysArray;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.hashArray[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        hkg.K0(this.keysArray, i3, i);
        if (objArr != null) {
            hkg.K0(objArr, i3, this.length);
        }
        this.length = i3;
    }

    public final boolean m(Collection collection) {
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!n((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean n(Map.Entry entry) {
        int iP = p(entry.getKey());
        if (iP < 0) {
            return false;
        }
        Object[] objArr = this.valuesArray;
        objArr.getClass();
        return pa7.t(objArr[iP], entry.getValue());
    }

    public final void o(int i) {
        Object[] objArr = this.keysArray;
        int length = objArr.length;
        int i2 = this.length;
        int i3 = length - i2;
        int i4 = i2 - this.size;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            l(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.keysArray = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.valuesArray;
            this.valuesArray = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.presenceArray = Arrays.copyOf(this.presenceArray, i6);
            int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (iHighestOneBit > this.hashArray.length) {
                t(iHighestOneBit);
            }
        }
    }

    public final int p(Object obj) {
        int iR = r(obj);
        int i = this.maxProbeDistance;
        while (true) {
            int i2 = this.hashArray[iR];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (pa7.t(this.keysArray[i3], obj)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iR = iR == 0 ? this.hashArray.length - 1 : iR - 1;
        }
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        k();
        int iH = h(obj);
        Object[] objArrI = i();
        if (iH >= 0) {
            objArrI[iH] = obj2;
            return null;
        }
        int i = (-iH) - 1;
        Object obj3 = objArrI[i];
        objArrI[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        k();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        o(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iH = h(entry.getKey());
            Object[] objArrI = i();
            if (iH >= 0) {
                objArrI[iH] = entry.getValue();
            } else {
                int i = (-iH) - 1;
                if (!pa7.t(entry.getValue(), objArrI[i])) {
                    objArrI[i] = entry.getValue();
                }
            }
        }
    }

    public final int q(Object obj) {
        int i = this.length;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.presenceArray[i] >= 0) {
                Object[] objArr = this.valuesArray;
                objArr.getClass();
                if (pa7.t(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    public final int r(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.hashShift;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        k();
        int iP = p(obj);
        if (iP < 0) {
            return null;
        }
        Object[] objArr = this.valuesArray;
        objArr.getClass();
        Object obj2 = objArr[iP];
        v(iP);
        return obj2;
    }

    public final boolean s() {
        return this.isReadOnly;
    }

    @Override // java.util.Map
    public final int size() {
        return this.size;
    }

    public final void t(int i) {
        int[] iArr;
        this.modCount++;
        int i2 = 0;
        if (this.length > this.size) {
            l(false);
        }
        this.hashArray = new int[i];
        this.hashShift = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.length) {
            int i3 = i2 + 1;
            int iR = r(this.keysArray[i2]);
            int i4 = this.maxProbeDistance;
            while (true) {
                iArr = this.hashArray;
                if (iArr[iR] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    qc0.p("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                iR = iR == 0 ? iArr.length - 1 : iR - 1;
            }
            iArr[iR] = i3;
            this.presenceArray[i2] = iR;
            i2 = i3;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.size * 3) + 2);
        sb.append("{");
        int i = 0;
        cl8 cl8Var = new cl8(this, 0);
        while (cl8Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = cl8Var.a;
            fl8 fl8Var = (fl8) cl8Var.d;
            if (i2 >= fl8Var.length) {
                s8f.c();
                return null;
            }
            int i3 = cl8Var.a;
            cl8Var.a = i3 + 1;
            cl8Var.b = i3;
            Object obj = fl8Var.keysArray[cl8Var.b];
            if (obj == fl8Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = fl8Var.valuesArray;
            objArr.getClass();
            Object obj2 = objArr[cl8Var.b];
            if (obj2 == fl8Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            cl8Var.f();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    public final boolean u(Map.Entry entry) {
        k();
        int iP = p(entry.getKey());
        if (iP < 0) {
            return false;
        }
        Object[] objArr = this.valuesArray;
        objArr.getClass();
        if (!pa7.t(objArr[iP], entry.getValue())) {
            return false;
        }
        v(iP);
        return true;
    }

    public final void v(int i) {
        int i2;
        int i3;
        int iR;
        int[] iArr;
        Object[] objArr = this.keysArray;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.valuesArray;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int length = this.presenceArray[i];
        loop0: while (true) {
            int i4 = length;
            int i5 = 0;
            do {
                length = length == 0 ? this.hashArray.length - 1 : length - 1;
                int[] iArr2 = this.hashArray;
                i2 = iArr2[length];
                i5++;
                if (i5 > this.maxProbeDistance) {
                    iArr2[i4] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i4] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    iR = r(this.keysArray[i3]) - length;
                    iArr = this.hashArray;
                }
            } while ((iR & (iArr.length - 1)) < i5);
            iArr[i4] = i2;
            this.presenceArray[i3] = i4;
        }
        this.presenceArray[i] = -1;
        this.size--;
        this.modCount++;
    }

    @Override // java.util.Map
    public final Collection values() {
        il8 il8Var = this.valuesView;
        if (il8Var != null) {
            return il8Var;
        }
        il8 il8Var2 = new il8(this);
        this.valuesView = il8Var2;
        return il8Var2;
    }

    public fl8() {
        this(8);
    }
}
