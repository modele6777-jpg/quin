package defpackage;

import com.adjust.sdk.sig.r3;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class mx4 extends o2 implements lx4, RandomAccess, Serializable {
    private final Enum<Object>[] entries;

    public mx4(Enum[] enumArr) {
        enumArr.getClass();
        this.entries = enumArr;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new nx4(this.entries);
    }

    @Override // defpackage.d1
    public final int c() {
        return this.entries.length;
    }

    @Override // defpackage.d1, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        return ((Enum) qd0.q0(r3.ordinal(), this.entries)) == r3;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum<Object>[] enumArr = this.entries;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        r3.i(ks0.k("index: ", i, ", size: ", length));
        return null;
    }

    @Override // defpackage.o2, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) qd0.q0(iOrdinal, this.entries)) == r3) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // defpackage.o2, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) qd0.q0(iOrdinal, this.entries)) == r3) {
            return iOrdinal;
        }
        return -1;
    }
}
