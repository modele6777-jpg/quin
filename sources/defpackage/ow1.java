package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ow1 extends lt0 {
    public cy6 i;
    public cy6 j;

    @Override // defpackage.lt0
    public final wj0 a(wj0 wj0Var) throws zj0 {
        int i = wj0Var.c;
        cy6 cy6Var = this.i;
        if (cy6Var == null) {
            return wj0.e;
        }
        int i2 = wj0Var.b;
        if (!pqf.E(i)) {
            throw new zj0(wj0Var);
        }
        int iB = cy6Var.b();
        boolean z = i2 != iB;
        int i3 = 0;
        while (i3 < iB) {
            int iA = cy6Var.a(i3);
            if (iA >= i2) {
                throw new zj0("Channel map (" + cy6Var + ") trying to access non-existent input channel.", wj0Var);
            }
            z |= iA != i3;
            i3++;
        }
        return z ? new wj0(wj0Var.a, iB, i) : wj0.e;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0087  */
    /* JADX WARN: Code duplicated, block: B:34:0x0090  */
    /* JADX WARN: Code duplicated, block: B:36:0x0098  */
    /* JADX WARN: Code duplicated, block: B:37:0x009a  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:59:0x0103  */
    /* JADX WARN: Code duplicated, block: B:61:0x0107  */
    /* JADX WARN: Code duplicated, block: B:63:0x0117  */
    /* JADX WARN: Code duplicated, block: B:65:0x0127  */
    @Override // defpackage.ak0
    public final void f(ByteBuffer byteBuffer) {
        ByteOrder byteOrderOrder;
        ByteOrder byteOrder;
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        cy6 cy6Var = this.j;
        cy6Var.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferM = m(((iLimit - iPosition) / this.b.d) * this.c.d);
        while (iPosition < iLimit) {
            for (int i5 = 0; i5 < cy6Var.b(); i5++) {
                int iQ = (pqf.q(this.b.c) * cy6Var.a(i5)) + iPosition;
                int i6 = this.b.c;
                if (i6 == 2) {
                    byteBufferM.putShort(byteBuffer.getShort(iQ));
                } else if (i6 == 3) {
                    byteBufferM.put(byteBuffer.get(iQ));
                } else if (i6 == 4) {
                    byteBufferM.putFloat(byteBuffer.getFloat(iQ));
                } else if (i6 == 21) {
                    byteOrderOrder = byteBuffer.order();
                    byteOrder = ByteOrder.BIG_ENDIAN;
                    if (byteOrderOrder == byteOrder) {
                        i = iQ;
                    } else {
                        i = iQ + 2;
                    }
                    byte b = byteBuffer.get(i);
                    byte b2 = byteBuffer.get(iQ + 1);
                    if (byteBuffer.order() == byteOrder) {
                        iQ += 2;
                    }
                    i2 = ((((b << 24) & (-16777216)) | ((b2 << 16) & 16711680)) | ((byteBuffer.get(iQ) << 8) & 65280)) >> 8;
                    if ((i2 & (-16777216)) != 0 || (i2 & (-8388608)) == -8388608) {
                        z = true;
                    } else {
                        z = false;
                    }
                    pa7.B(z, "Value out of range of 24-bit integer: %s", Integer.toHexString(i2));
                    pa7.A(byteBufferM.remaining() >= 3);
                    if (byteBufferM.order() == byteOrder) {
                        i3 = (i2 & 16711680) >> 16;
                    } else {
                        i3 = i2 & 255;
                    }
                    byte b3 = (byte) i3;
                    byte b4 = (byte) ((i2 & 65280) >> 8);
                    if (byteBufferM.order() == byteOrder) {
                        i4 = i2 & 255;
                    } else {
                        i4 = (i2 & 16711680) >> 16;
                    }
                    byteBufferM.put(b3).put(b4).put((byte) i4);
                } else if (i6 == 22) {
                    byteBufferM.putInt(byteBuffer.getInt(iQ));
                } else if (i6 == 268435456) {
                    byteBufferM.putShort(byteBuffer.getShort(iQ));
                } else if (i6 == 1342177280) {
                    byteOrderOrder = byteBuffer.order();
                    byteOrder = ByteOrder.BIG_ENDIAN;
                    if (byteOrderOrder == byteOrder) {
                        i = iQ;
                    } else {
                        i = iQ + 2;
                    }
                    byte b5 = byteBuffer.get(i);
                    byte b6 = byteBuffer.get(iQ + 1);
                    if (byteBuffer.order() == byteOrder) {
                        iQ += 2;
                    }
                    i2 = ((((b5 << 24) & (-16777216)) | ((b6 << 16) & 16711680)) | ((byteBuffer.get(iQ) << 8) & 65280)) >> 8;
                    if ((i2 & (-16777216)) != 0) {
                        z = true;
                    } else {
                        z = true;
                    }
                    pa7.B(z, "Value out of range of 24-bit integer: %s", Integer.toHexString(i2));
                    pa7.A(byteBufferM.remaining() >= 3);
                    if (byteBufferM.order() == byteOrder) {
                        i3 = (i2 & 16711680) >> 16;
                    } else {
                        i3 = i2 & 255;
                    }
                    byte b7 = (byte) i3;
                    byte b8 = (byte) ((i2 & 65280) >> 8);
                    if (byteBufferM.order() == byteOrder) {
                        i4 = i2 & 255;
                    } else {
                        i4 = (i2 & 16711680) >> 16;
                    }
                    byteBufferM.put(b7).put(b8).put((byte) i4);
                } else if (i6 != 1610612736) {
                    if (i6 != 1879048192) {
                        if (i6 == 1895825408) {
                            byteBufferM.putFloat(byteBuffer.getFloat(iQ));
                        } else if (i6 != 1912602624) {
                            throw new IllegalStateException("Unexpected encoding: " + this.b.c);
                        }
                    }
                    byteBufferM.putDouble(byteBuffer.getDouble(iQ));
                } else {
                    byteBufferM.putInt(byteBuffer.getInt(iQ));
                }
            }
            iPosition += this.b.d;
        }
        byteBuffer.position(iLimit);
        byteBufferM.flip();
    }

    @Override // defpackage.lt0
    public final void j() {
        this.j = this.i;
    }

    @Override // defpackage.lt0
    public final void l() {
        this.j = null;
        this.i = null;
    }
}
