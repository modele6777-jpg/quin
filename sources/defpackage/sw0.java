package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sw0 extends tm3 {
    public long x;
    public int y;
    public int z;

    @Override // defpackage.tm3
    public final void e() {
        super.e();
        this.y = 0;
    }

    public final boolean k(tm3 tm3Var) {
        ByteBuffer byteBuffer;
        pa7.A(!tm3Var.d(1073741824));
        pa7.A(!tm3Var.d(268435456));
        pa7.A(!tm3Var.d(4));
        if (m()) {
            if (this.y >= this.z) {
                return false;
            }
            ByteBuffer byteBuffer2 = tm3Var.e;
            if (byteBuffer2 != null && (byteBuffer = this.e) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.y;
        this.y = i + 1;
        if (i == 0) {
            this.g = tm3Var.g;
            if (tm3Var.d(1)) {
                this.b = 1;
            }
        }
        ByteBuffer byteBuffer3 = tm3Var.e;
        if (byteBuffer3 != null) {
            h(byteBuffer3.remaining());
            this.e.put(byteBuffer3);
        }
        this.x = tm3Var.g;
        return true;
    }

    public final boolean m() {
        return this.y > 0;
    }
}
