package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class q61 extends v61 {
    private static final long serialVersionUID = 1;
    private final int bytesLength;
    private final int bytesOffset;

    public q61(byte[] bArr, int i, int i2) {
        super(bArr);
        y61.c(i, i + i2, bArr.length);
        this.bytesOffset = i;
        this.bytesLength = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.v61, defpackage.y61
    public final byte a(int i) {
        int i2 = this.bytesLength;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.bytes[this.bytesOffset + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(tec.e(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(ks0.k("Index > length: ", i, ", ", i2));
    }

    @Override // defpackage.v61, defpackage.y61
    public final byte d(int i) {
        return this.bytes[this.bytesOffset + i];
    }

    @Override // defpackage.v61
    public final int g() {
        return this.bytesOffset;
    }

    @Override // defpackage.v61, defpackage.y61
    public final int size() {
        return this.bytesLength;
    }

    public Object writeReplace() {
        byte[] bArr;
        int i = this.bytesLength;
        if (i == 0) {
            bArr = p87.b;
        } else {
            byte[] bArr2 = new byte[i];
            System.arraycopy(this.bytes, this.bytesOffset, bArr2, 0, i);
            bArr = bArr2;
        }
        return new v61(bArr);
    }
}
