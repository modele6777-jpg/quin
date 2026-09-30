package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qp8 {
    public long a;
    public long b;
    public int c;
    public final Object d;

    public qp8(int i) {
        this.d = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);
        long j = i;
        this.a = j;
        this.b = j;
        this.c = 0;
    }

    public void a() {
        ByteBuffer byteBuffer = (ByteBuffer) this.d;
        byteBuffer.flip();
        while (byteBuffer.remaining() >= 16) {
            b(byteBuffer);
        }
        byteBuffer.compact();
    }

    public void b(ByteBuffer byteBuffer) {
        long j = byteBuffer.getLong();
        long j2 = byteBuffer.getLong();
        long jRotateLeft = (Long.rotateLeft(j * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.a;
        this.a = jRotateLeft;
        long jRotateLeft2 = Long.rotateLeft(jRotateLeft, 27);
        long j3 = this.b;
        this.a = ((jRotateLeft2 + j3) * 5) + 1390208809;
        long jRotateLeft3 = (Long.rotateLeft(j2 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ j3;
        this.b = jRotateLeft3;
        this.b = ((Long.rotateLeft(jRotateLeft3, 31) + this.a) * 5) + 944331445;
        this.c += 16;
    }

    public qp8 c(byte[] bArr) {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr, 0, bArr.length).order(ByteOrder.LITTLE_ENDIAN);
        int iRemaining = byteBufferOrder.remaining();
        ByteBuffer byteBuffer = (ByteBuffer) this.d;
        if (iRemaining <= byteBuffer.remaining()) {
            byteBuffer.put(byteBufferOrder);
            if (byteBuffer.remaining() < 8) {
                a();
            }
            return this;
        }
        int iPosition = 16 - byteBuffer.position();
        for (int i = 0; i < iPosition; i++) {
            byteBuffer.put(byteBufferOrder.get());
        }
        a();
        while (byteBufferOrder.remaining() >= 16) {
            b(byteBufferOrder);
        }
        byteBuffer.put(byteBufferOrder);
        return this;
    }

    public qp8(int i, rr5 rr5Var, long j, long j2) {
        this.c = i;
        this.d = rr5Var;
        this.a = j;
        this.b = j2;
    }
}
