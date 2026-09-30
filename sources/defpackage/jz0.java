package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jz0 extends gbe implements l26 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ kz0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz0(kz0 kz0Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = kz0Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        jz0 jz0Var = new jz0(this.this$0, xn2Var);
        jz0Var.L$0 = obj;
        return jz0Var;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00f8 A[RETURN] */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        r35 r35Var;
        tz0 tz0Var;
        int i;
        int i2 = this.label;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                aw2 aw2Var = (aw2) this.L$0;
                if (jgb.Y(aw2Var)) {
                    Rect rect = vz0.a;
                    kz0 kz0Var = this.this$0;
                    sz0 sz0VarI = vz0.i(kz0Var.a, kz0Var.b, kz0Var.c, kz0Var.d);
                    if (jgb.Y(aw2Var)) {
                        Bitmap bitmap = sz0VarI.a;
                        kz0 kz0Var2 = this.this$0;
                        try {
                            InputStream inputStreamOpenInputStream = kz0Var2.a.getContentResolver().openInputStream(kz0Var2.b);
                            if (inputStreamOpenInputStream != null) {
                                try {
                                    r35Var = new r35(inputStreamOpenInputStream);
                                    inputStreamOpenInputStream.close();
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        ym8.t(inputStreamOpenInputStream, th);
                                        throw th2;
                                    }
                                }
                            } else {
                                r35Var = null;
                            }
                        } catch (Throwable unused) {
                            r35Var = null;
                        }
                        if (r35Var != null) {
                            int iD = r35Var.d(1, "Orientation");
                            if (iD == 3) {
                                i = 180;
                            } else if (iD == 5 || iD == 6 || iD == 7) {
                                i = 90;
                            } else {
                                i = iD != 8 ? 0 : 270;
                            }
                            tz0Var = new tz0(i, bitmap, iD == 2 || iD == 5, iD == 4 || iD == 7);
                        } else {
                            tz0Var = new tz0(0, bitmap, false, false);
                        }
                        kz0 kz0Var3 = this.this$0;
                        hz0 hz0Var = new hz0(kz0Var3.b, (Bitmap) tz0Var.d, sz0VarI.b, tz0Var.a, tz0Var.b, tz0Var.c, null);
                        this.label = 1;
                        js3 js3Var = ga4.a;
                        Object objP0 = ynb.p0(mk8.a, new iz0(kz0Var3, hz0Var, null), this);
                        if (objP0 != bw2Var) {
                            objP0 = wefVar;
                        }
                        if (objP0 == bw2Var) {
                            return bw2Var;
                        }
                    }
                }
            } else {
                if (i2 != 1 && i2 != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
        } catch (Exception e) {
            kz0 kz0Var4 = this.this$0;
            hz0 hz0Var2 = new hz0(kz0Var4.b, null, 0, 0, false, false, e);
            this.label = 2;
            js3 js3Var2 = ga4.a;
            Object objP1 = ynb.p0(mk8.a, new iz0(kz0Var4, hz0Var2, null), this);
            if (objP1 != bw2Var) {
                objP1 = wefVar;
            }
            if (objP1 == bw2Var) {
                return bw2Var;
            }
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((jz0) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
