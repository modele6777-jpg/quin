package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class na2 extends AbstractMap implements Serializable {
    public static final Object x = new Object();
    public transient Object a;
    public transient int[] b;
    public transient Object[] c;
    public transient Object[] d;
    public transient int e;
    public transient int f;
    public transient la2 g;
    public transient la2 v;
    public transient k3 w;

    public static na2 b() {
        na2 na2Var = new na2();
        na2Var.g(8);
        return na2Var;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(tec.e(i, "Invalid size: "));
        }
        g(i);
        for (int i2 = 0; i2 < i; i2++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Map mapC = c();
        Iterator it = mapC != null ? mapC.entrySet().iterator() : new ka2(this, 1);
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public final Map c() {
        Object obj = this.a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (i()) {
            return;
        }
        this.e += 32;
        Map mapC = c();
        if (mapC != null) {
            this.e = Math.min(Math.max(size(), 3), 1073741823);
            mapC.clear();
            this.a = null;
            this.f = 0;
            return;
        }
        Arrays.fill(l(), 0, this.f, (Object) null);
        Arrays.fill(m(), 0, this.f, (Object) null);
        Object obj = this.a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(k(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.containsKey(obj);
        }
        return e(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.containsValue(obj);
        }
        for (int i = 0; i < this.f; i++) {
            if (ok8.t(obj, m()[i])) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return (1 << (this.e & 31)) - 1;
    }

    public final int e(Object obj) {
        if (i()) {
            return -1;
        }
        int iP = rs0.P(obj);
        int iD = d();
        Object obj2 = this.a;
        Objects.requireNonNull(obj2);
        int iX = rxg.X(iP & iD, obj2);
        if (iX == 0) {
            return -1;
        }
        int i = ~iD;
        int i2 = iP & i;
        do {
            int i3 = iX - 1;
            int i4 = k()[i3];
            if ((i4 & i) == i2 && ok8.t(obj, l()[i3])) {
                return i3;
            }
            iX = i4 & iD;
        } while (iX != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        la2 la2Var = this.v;
        if (la2Var != null) {
            return la2Var;
        }
        la2 la2Var2 = new la2(this, 0);
        this.v = la2Var2;
        return la2Var2;
    }

    public final void g(int i) {
        pa7.z("Expected size must be >= 0", i >= 0);
        this.e = Math.min(Math.max(i, 1), 1073741823);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.get(obj);
        }
        int iE = e(obj);
        if (iE == -1) {
            return null;
        }
        return m()[iE];
    }

    public final void h(int i, int i2) {
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] iArrK = k();
        Object[] objArrL = l();
        Object[] objArrM = m();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrL[i] = null;
            objArrM[i] = null;
            iArrK[i] = 0;
            return;
        }
        Object obj2 = objArrL[i3];
        objArrL[i] = obj2;
        objArrM[i] = objArrM[i3];
        objArrL[i3] = null;
        objArrM[i3] = null;
        iArrK[i] = iArrK[i3];
        iArrK[i3] = 0;
        int iP = rs0.P(obj2) & i2;
        int iX = rxg.X(iP, obj);
        if (iX == size) {
            rxg.Y(iP, obj, i + 1);
            return;
        }
        while (true) {
            int i4 = iX - 1;
            int i5 = iArrK[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                iArrK[i4] = rxg.I(i5, i + 1, i2);
                return;
            }
            iX = i6;
        }
    }

    public final boolean i() {
        return this.a == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object j(Object obj) {
        if (!i()) {
            int iD = d();
            Object obj2 = this.a;
            Objects.requireNonNull(obj2);
            int iO = rxg.O(obj, null, iD, obj2, k(), l(), null);
            if (iO != -1) {
                Object obj3 = m()[iO];
                h(iO, iD);
                this.f--;
                this.e += 32;
                return obj3;
            }
        }
        return x;
    }

    public final int[] k() {
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        la2 la2Var = this.g;
        if (la2Var != null) {
            return la2Var;
        }
        la2 la2Var2 = new la2(this, 1);
        this.g = la2Var2;
        return la2Var2;
    }

    public final Object[] l() {
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] m() {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int n(int i, int i2, int i3, int i4) {
        Object objD = rxg.D(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            rxg.Y(i3 & i5, objD, i4 + 1);
        }
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] iArrK = k();
        for (int i6 = 0; i6 <= i; i6++) {
            int iX = rxg.X(i6, obj);
            while (iX != 0) {
                int i7 = iX - 1;
                int i8 = iArrK[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iX2 = rxg.X(i10, objD);
                rxg.Y(i10, objD, iX);
                iArrK[i7] = rxg.I(i9, iX2, i5);
                iX = i8 & i;
            }
        }
        this.a = objD;
        this.e = rxg.I(this.e, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:42:0x0100 A[LOOP:1: B:39:0x00e9->B:42:0x0100, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x00e4 A[EDGE_INSN: B:63:0x00e4->B:37:0x00e4 BREAK  A[LOOP:1: B:39:0x00e9->B:42:0x0100], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00fe -> B:37:0x00e4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object r23, java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na2.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.remove(obj);
        }
        Object objJ = j(obj);
        if (objJ == x) {
            return null;
        }
        return objJ;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapC = c();
        return mapC != null ? mapC.size() : this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        k3 k3Var = this.w;
        if (k3Var != null) {
            return k3Var;
        }
        k3 k3Var2 = new k3(1, this);
        this.w = k3Var2;
        return k3Var2;
    }
}
