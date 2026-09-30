package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ob implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cv6 b;

    public /* synthetic */ ob(cv6 cv6Var, int i) {
        this.a = i;
        this.b = cv6Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                sn4 sn4Var = (sn4) obj;
                sn4Var.getClass();
                if (Float.intBitsToFloat((int) (sn4Var.f() >> 32)) > 0.0f && Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L)) > 0.0f) {
                    int iL = ym8.L(Float.intBitsToFloat((int) (sn4Var.f() >> 32)));
                    int iL2 = ym8.L(Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L)));
                    cv6 cv6Var = this.b;
                    float height = ((ks) cv6Var).a.getHeight() * iL;
                    Bitmap bitmap = ((ks) cv6Var).a;
                    int iL3 = ym8.L(height / bitmap.getWidth());
                    long j = ((long) iL) << 32;
                    long j2 = ((long) iL3) & 4294967295L;
                    sn4.g0(sn4Var, cv6Var, 0L, 0L, 0L, j | j2, 0.0f, null, 2, 494);
                    if (iL3 < iL2) {
                        sn4.g0(sn4Var, cv6Var, ((long) (bitmap.getHeight() - 1)) & 4294967295L, (((long) bitmap.getWidth()) << 32) | 1, j2, j | (((long) (iL2 - iL3)) & 4294967295L), 0.0f, null, 1, 480);
                    }
                }
                break;
            default:
                sn4 sn4Var2 = (sn4) obj;
                sn4Var2.getClass();
                sn4.O0(sn4Var2, new c41(new BitmapShader(abg.o(this.b), jgb.h0(1), jgb.h0(1))), 0L, 0L, 0.0f, null, null, 0, 126);
                break;
        }
        return wefVar;
    }
}
