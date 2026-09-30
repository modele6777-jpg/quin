package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class n02 implements PointerInputEventHandler {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ e89 b;
    public final /* synthetic */ e89 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ e89 f;

    public n02(aw2 aw2Var, jx jxVar, e89 e89Var, e89 e89Var2, n69 n69Var) {
        this.d = aw2Var;
        this.e = jxVar;
        this.b = e89Var;
        this.c = e89Var2;
        this.f = n69Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(tia tiaVar, xn2 xn2Var) {
        int i = this.a;
        e89 e89Var = this.f;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                Object objL1 = ((obe) tiaVar).l1(new m02((aw2) obj2, (jx) obj, this.b, this.c, (n69) e89Var, null), xn2Var);
                return objL1 == bw2.a ? objL1 : wef.a;
            default:
                return ffe.e(tiaVar, new kf(27, this.b, (j18) obj2, (s69) obj, (s69) e89Var, this.c), null, null, null, xn2Var, 14);
        }
    }

    public n02(j18 j18Var, e89 e89Var, s69 s69Var, s69 s69Var2, e89 e89Var2) {
        this.d = j18Var;
        this.b = e89Var;
        this.e = s69Var;
        this.f = s69Var2;
        this.c = e89Var2;
    }
}
