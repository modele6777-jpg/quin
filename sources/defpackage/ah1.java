package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ah1 extends hu0 {
    public final tm3 I0;
    public final d0a J0;
    public zg1 K0;
    public long L0;

    public ah1() {
        super(6);
        this.I0 = new tm3(1);
        this.J0 = new d0a();
    }

    @Override // defpackage.hu0
    public final int D(rr5 rr5Var) {
        return "application/x-camera-motion".equals(rr5Var.p) ? hu0.f(4, 0, 0, 0) : hu0.f(0, 0, 0, 0);
    }

    @Override // defpackage.hu0, defpackage.vha
    public final void d(int i, Object obj) {
        if (i == 8) {
            this.K0 = (zg1) obj;
        }
    }

    @Override // defpackage.hu0
    public final String k() {
        return "CameraMotionRenderer";
    }

    @Override // defpackage.hu0
    public final boolean m() {
        return l();
    }

    @Override // defpackage.hu0
    public final boolean o() {
        return true;
    }

    @Override // defpackage.hu0
    public final void p() {
        zg1 zg1Var = this.K0;
        if (zg1Var != null) {
            zg1Var.b();
        }
    }

    @Override // defpackage.hu0
    public final void r(long j, boolean z, boolean z2) {
        this.L0 = Long.MIN_VALUE;
        zg1 zg1Var = this.K0;
        if (zg1Var != null) {
            zg1Var.b();
        }
    }

    @Override // defpackage.hu0
    public final void z(long j, long j2) {
        float[] fArr;
        while (!l() && this.L0 < 100000 + j) {
            tm3 tm3Var = this.I0;
            tm3Var.e();
            fz3 fz3Var = this.c;
            fz3Var.l();
            if (y(fz3Var, tm3Var, 0) != -4 || tm3Var.d(4)) {
                return;
            }
            long j3 = tm3Var.g;
            this.L0 = j3;
            boolean z = j3 < this.z;
            if (this.K0 != null && !z) {
                tm3Var.i();
                ByteBuffer byteBuffer = tm3Var.e;
                String str = pqf.a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    d0a d0aVar = this.J0;
                    d0aVar.K(bArrArray, iLimit);
                    d0aVar.M(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i = 0; i < 3; i++) {
                        fArr2[i] = Float.intBitsToFloat(d0aVar.o());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.K0.a(this.L0 - this.y, fArr);
                }
            }
        }
    }
}
