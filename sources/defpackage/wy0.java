package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wy0 extends gbe implements l26 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ xy0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy0(xy0 xy0Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = xy0Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        wy0 wy0Var = new wy0(this.this$0, xn2Var);
        wy0Var.L$0 = obj;
        return wy0Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        wef wefVar;
        sz0 sz0VarE;
        int i = this.label;
        wef wefVar2 = wef.a;
        bw2 bw2Var = bw2.a;
        try {
            if (i == 0) {
                jzb.q(obj);
                aw2 aw2Var = (aw2) this.L$0;
                if (jgb.Y(aw2Var)) {
                    xy0 xy0Var = this.this$0;
                    Uri uri = xy0Var.c;
                    try {
                        if (uri != null) {
                            Rect rect = vz0.a;
                            wefVar = wefVar2;
                            sz0VarE = vz0.c(xy0Var.a, uri, xy0Var.e, xy0Var.f, xy0Var.g, xy0Var.v, xy0Var.w, xy0Var.x, xy0Var.y, xy0Var.z, xy0Var.X, xy0Var.Y, xy0Var.Z);
                        } else {
                            wefVar = wefVar2;
                            Bitmap bitmap = xy0Var.d;
                            if (bitmap == null) {
                                ty0 ty0Var = new ty0(null, null, null, 1);
                                this.label = 1;
                                return xy0Var.a(ty0Var, this) == bw2Var ? bw2Var : wefVar;
                            }
                            Rect rect2 = vz0.a;
                            sz0VarE = vz0.e(bitmap, xy0Var.e, xy0Var.f, xy0Var.w, xy0Var.x, xy0Var.y, xy0Var.Y, xy0Var.Z);
                        }
                        Bitmap bitmap2 = sz0VarE.a;
                        xy0 xy0Var2 = this.this$0;
                        Bitmap bitmapQ = vz0.q(bitmap2, xy0Var2.z, xy0Var2.X, xy0Var2.E0);
                        js3 js3Var = ga4.a;
                        ynb.V(aw2Var, hr3.c, null, new vy0(this.this$0, bitmapQ, sz0VarE, null), 2);
                        return wefVar;
                    } catch (Exception e) {
                        e = e;
                        xy0 xy0Var3 = this.this$0;
                        ty0 ty0Var2 = new ty0(null, null, e, 1);
                        this.label = 2;
                        if (xy0Var3.a(ty0Var2, this) != bw2Var) {
                            return wefVar2;
                        }
                    }
                }
            } else {
                if (i == 1) {
                    jzb.q(obj);
                    return wefVar2;
                }
                if (i != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
            return wefVar2;
        } catch (Exception e2) {
            e = e2;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((wy0) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
