package coil3.compose;

import defpackage.bv6;
import defpackage.fy9;
import defpackage.ks0;
import defpackage.mp;
import defpackage.sn4;
import defpackage.ta0;
import defpackage.vd9;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/compose/ImagePainter;", "Lfy9;", "io.coil-kt.coil3:coil-compose-core"}, k = 1, mv = {2, 2, 0}, xi = z7c.f)
public final class ImagePainter extends fy9 {
    public final bv6 f;

    public ImagePainter(bv6 bv6Var) {
        this.f = bv6Var;
    }

    @Override // defpackage.fy9
    public final long i() {
        bv6 bv6Var = this.f;
        int iD = bv6Var.d();
        float f = iD > 0 ? iD : Float.NaN;
        int iC = bv6Var.c();
        return (((long) Float.floatToRawIntBits(iC > 0 ? iC : Float.NaN)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
    }

    @Override // defpackage.fy9
    public final void j(sn4 sn4Var) {
        bv6 bv6Var = this.f;
        int iD = bv6Var.d();
        float fIntBitsToFloat = iD > 0 ? Float.intBitsToFloat((int) (sn4Var.f() >> 32)) / iD : 1.0f;
        int iC = bv6Var.c();
        float fIntBitsToFloat2 = iC > 0 ? Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L)) / iC : 1.0f;
        ta0 ta0VarV0 = sn4Var.v0();
        long jZ = ta0VarV0.z();
        ta0VarV0.p().g();
        try {
            ((vd9) ta0VarV0.c).G(fIntBitsToFloat, fIntBitsToFloat2, 0L);
            bv6Var.e(mp.b(sn4Var.v0().p()));
        } finally {
            ks0.t(ta0VarV0, jZ);
        }
    }
}
