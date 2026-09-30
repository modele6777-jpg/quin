package defpackage;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c12 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c12(t69 t69Var, wne wneVar, x4d x4dVar, float f, float f2) {
        this.a = 2;
        this.e = t69Var;
        this.f = wneVar;
        this.b = x4dVar;
        this.c = f;
        this.d = f2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        Object obj3 = this.b;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                m93.h((ArrayList) obj5, (yx9) obj4, (j09) obj3, this.c, this.d, (l46) obj, k99.P(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                feg.o((String) obj5, (t58) obj4, (j09) obj3, this.c, this.d, (l46) obj, k99.P(24577));
                break;
            default:
                t69 t69Var = (t69) obj5;
                wne wneVar = (wne) obj4;
                x4d x4dVar = (x4d) obj3;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(1 & iIntValue, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    qk6.O0.a(true, false, t69Var, null, wneVar, x4dVar, this.c, this.d, l46Var, 100663734, 8);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ c12(Serializable serializable, Object obj, j09 j09Var, float f, float f2, int i, int i2) {
        this.a = i2;
        this.e = serializable;
        this.f = obj;
        this.b = j09Var;
        this.c = f;
        this.d = f2;
    }
}
