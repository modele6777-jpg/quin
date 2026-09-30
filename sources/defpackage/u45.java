package defpackage;

import android.media.MediaFormat;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u45 implements guf, zg1, vha {
    public guf a;
    public zg1 b;
    public guf c;
    public zg1 d;

    @Override // defpackage.zg1
    public final void a(long j, float[] fArr) {
        zg1 zg1Var = this.d;
        if (zg1Var != null) {
            zg1Var.a(j, fArr);
        }
        zg1 zg1Var2 = this.b;
        if (zg1Var2 != null) {
            zg1Var2.a(j, fArr);
        }
    }

    @Override // defpackage.zg1
    public final void b() {
        zg1 zg1Var = this.d;
        if (zg1Var != null) {
            zg1Var.b();
        }
        zg1 zg1Var2 = this.b;
        if (zg1Var2 != null) {
            zg1Var2.b();
        }
    }

    @Override // defpackage.guf
    public final void c(long j, long j2, rr5 rr5Var, MediaFormat mediaFormat) {
        guf gufVar = this.c;
        if (gufVar != null) {
            gufVar.c(j, j2, rr5Var, mediaFormat);
        }
        guf gufVar2 = this.a;
        if (gufVar2 != null) {
            gufVar2.c(j, j2, rr5Var, mediaFormat);
        }
    }

    @Override // defpackage.vha
    public final void d(int i, Object obj) {
        if (i == 7) {
            this.a = (guf) obj;
            return;
        }
        if (i == 8) {
            this.b = (zg1) obj;
            return;
        }
        if (i != 10000) {
            return;
        }
        uud uudVar = (uud) obj;
        if (uudVar == null) {
            this.c = null;
            this.d = null;
        } else {
            this.c = uudVar.getVideoFrameMetadataListener();
            this.d = uudVar.getCameraMotionListener();
        }
    }
}
