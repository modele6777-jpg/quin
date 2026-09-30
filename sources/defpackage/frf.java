package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class frf implements Comparable, Serializable {
    public static final frf a = new frf(0, 0);
    private final long leastSignificantBits;
    private final long mostSignificantBits;

    public frf(long j, long j2) {
        this.mostSignificantBits = j;
        this.leastSignificantBits = j2;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new hrf(this.mostSignificantBits, this.leastSignificantBits);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        frf frfVar = (frf) obj;
        frfVar.getClass();
        long j = this.mostSignificantBits;
        long j2 = frfVar.mostSignificantBits;
        return j != j2 ? Long.compareUnsigned(j, j2) : Long.compareUnsigned(this.leastSignificantBits, frfVar.leastSignificantBits);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frf)) {
            return false;
        }
        frf frfVar = (frf) obj;
        return this.mostSignificantBits == frfVar.mostSignificantBits && this.leastSignificantBits == frfVar.leastSignificantBits;
    }

    public final int hashCode() {
        return Long.hashCode(this.mostSignificantBits ^ this.leastSignificantBits);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        q6c.c(this.mostSignificantBits, bArr, 0, 0, 4);
        bArr[8] = 45;
        q6c.c(this.mostSignificantBits, bArr, 9, 4, 6);
        bArr[13] = 45;
        q6c.c(this.mostSignificantBits, bArr, 14, 6, 8);
        bArr[18] = 45;
        q6c.c(this.leastSignificantBits, bArr, 19, 0, 2);
        bArr[23] = 45;
        q6c.c(this.leastSignificantBits, bArr, 24, 2, 8);
        return new String(bArr, ox1.a);
    }
}
