package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class r61 extends w61 {
    private static final long serialVersionUID = 1;
    private final int bytesLength;
    private final int bytesOffset;

    public r61(byte[] bArr, int i, int i2) {
        super(bArr);
        b71.c(i, i + i2, bArr.length);
        this.bytesOffset = i;
        this.bytesLength = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.w61, defpackage.b71
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

    @Override // defpackage.w61, defpackage.b71
    public final void e(byte[] bArr, int i) {
        System.arraycopy(this.bytes, this.bytesOffset, bArr, 0, i);
    }

    @Override // defpackage.w61, defpackage.b71
    public final byte g(int i) {
        return this.bytes[this.bytesOffset + i];
    }

    @Override // defpackage.w61
    public final int j() {
        return this.bytesOffset;
    }

    @Override // defpackage.w61, defpackage.b71
    public final int size() {
        return this.bytesLength;
    }

    public Object writeReplace() {
        byte[] bArr;
        int size = size();
        if (size == 0) {
            bArr = r87.b;
        } else {
            byte[] bArr2 = new byte[size];
            e(bArr2, size);
            bArr = bArr2;
        }
        return new w61(bArr);
    }
}
