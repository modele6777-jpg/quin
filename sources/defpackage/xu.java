package defpackage;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xu implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xu(Object obj, a26 a26Var, boolean z, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.d = a26Var;
        this.b = z;
        this.e = obj2;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) throws Throwable {
        f8d f8dVar;
        SurfaceTexture surfaceTexture;
        int i = this.a;
        int i2 = 0;
        Matrix matrix = null;
        wef wefVar = wef.a;
        boolean z = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                cv6 cv6Var = (cv6) obj3;
                xz0 xz0Var = (xz0) obj2;
                vv7 vv7Var = (vv7) ((im2) obj);
                vv7Var.a();
                xl1 xl1Var = vv7Var.a;
                if (((Boolean) ((x16) obj4).invoke()).booleanValue()) {
                    if (z) {
                        long jH0 = xl1Var.H0();
                        ta0 ta0Var = xl1Var.b;
                        long jZ = ta0Var.z();
                        ta0Var.p().g();
                        try {
                            ((vd9) ta0Var.c).G(-1.0f, 1.0f, jH0);
                            sn4.A(vv7Var, cv6Var, 0L, 0.0f, xz0Var, 0, 46);
                        } finally {
                            ks0.t(ta0Var, jZ);
                        }
                    } else {
                        sn4.A(vv7Var, cv6Var, 0L, 0.0f, xz0Var, 0, 46);
                    }
                }
                return wefVar;
            case 1:
                return new ted(this.b, (x16) obj4, (x16) obj3, (ued) obj, (a26) obj2);
            case 2:
                egd egdVar = (egd) obj4;
                aw2 aw2Var = (aw2) obj3;
                zk1 zk1Var = (zk1) obj2;
                x16 x16Var = (x16) obj;
                x16Var.getClass();
                if (!egdVar.b()) {
                    if (egdVar.a() == hgd.b) {
                        if (z) {
                            ynb.V(aw2Var, null, null, new dgd(egdVar, null), 3);
                        } else {
                            x16Var.invoke();
                            zk1Var.invoke();
                        }
                    } else if (egdVar.a() == hgd.e) {
                        x16Var.invoke();
                        zk1Var.invoke();
                    }
                }
                return wefVar;
            case 3:
                vad vadVar = (vad) obj4;
                aw2 aw2Var2 = (aw2) obj3;
                cs3 cs3Var = (cs3) obj2;
                int iIntValue = ((Integer) obj).intValue();
                if (!z) {
                    x6d x6dVar = vadVar.a;
                    e8d e8dVar = (e8d) s72.y0(iIntValue, x6dVar.c);
                    if (e8dVar != null) {
                        j35 j35Var = vadVar.b;
                        if (iIntValue == j35Var.a) {
                            f8dVar = null;
                        } else {
                            j35Var.a = iIntValue;
                            f8dVar = f8d.Tab;
                        }
                        if (f8dVar != null) {
                            w6c.y(new b6d("button_click", bm8.L(q3c.l(x6dVar, e8dVar), bm8.H(new iy9("btn", "format_switch"), new iy9("pathway", "share_sheet"), new iy9("method", f8dVar.a())))));
                            ynb.V(aw2Var2, null, null, new rdf(cs3Var, iIntValue, null), 3);
                        }
                    }
                }
                return wefVar;
            case 4:
                dxf dxfVar = (dxf) obj4;
                a26 a26Var = (a26) obj3;
                float[] fArr = (float[]) obj2;
                cxf cxfVar = (cxf) obj;
                if (!e77.b(0L, 0L) && (surfaceTexture = cxfVar.getSurfaceTexture()) != null) {
                    surfaceTexture.setDefaultBufferSize(0, 0);
                }
                dxfVar.getClass();
                if (cxfVar.getSurfaceTextureListener() != dxfVar) {
                    a26Var.d(dxfVar);
                    cxfVar.setSurfaceTextureListener(dxfVar);
                }
                cxfVar.setOpaque(z);
                if (fArr != null) {
                    matrix = dxfVar.d;
                    hkg.L0(matrix, fArr);
                }
                cxfVar.setTransform(matrix);
                return wefVar;
            case 5:
                t2g t2gVar = (t2g) obj4;
                v08 v08Var = (v08) obj;
                v08Var.getClass();
                v08.Y(v08Var, t2gVar.i.j(), new s2g(t2gVar, i2), new dd2(new kr2(t2gVar, (a26) obj3, z, (dd2) obj2), true, 1976660038), 4);
                return wefVar;
            default:
                v88 v88Var = (v88) obj4;
                String str = (String) obj3;
                ccg ccgVar = (ccg) obj2;
                Throwable th = (Throwable) obj;
                if (th instanceof sbg) {
                    v88Var.c.compareAndSet(-256, ((sbg) th).getReason());
                }
                if (z && str != null) {
                    xdc.l(ccgVar.a.hashCode(), str);
                }
                return wefVar;
        }
    }

    public /* synthetic */ xu(Object obj, boolean z, Object obj2, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ xu(boolean z, Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
