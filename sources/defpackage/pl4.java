package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pl4 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ pl4(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(tia tiaVar, xn2 xn2Var) {
        int i = this.a;
        bw2 bw2Var = bw2.a;
        wef wefVar = wef.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                p9 p9Var = new p9(16, (x16) obj4);
                c20 c20Var = new c20(17, (x16) obj3);
                c20 c20Var2 = new c20(18, (x16) obj2);
                k50 k50Var = new k50((a26) obj, 6);
                float f = rk4.a;
                Object objS = k99.s(tiaVar, new jk4(null, c20Var, c20Var2, p9Var, k50Var), xn2Var);
                return objS == bw2Var ? objS : wefVar;
            case 1:
                Object objL1 = ((obe) tiaVar).l1(new tjc((aw2) obj4, (jx) obj3, (e89) obj2, (n69) obj, null), xn2Var);
                return objL1 == bw2Var ? objL1 : wefVar;
            case 2:
                mqe mqeVar = new mqe((aw2) obj4, (e89) obj3, (t69) obj2, null);
                w77 w77Var = new w77((e89) obj, 14);
                dee deeVar = ffe.a;
                Object objO = jgb.O(new nee(tiaVar, mqeVar, w77Var, new nta(tiaVar), null), xn2Var);
                if (objO != bw2Var) {
                    objO = wefVar;
                }
                return objO == bw2Var ? objO : wefVar;
            default:
                return ffe.e(tiaVar, new wca((ghc) obj4, (e89) obj3, (s69) obj2, (e89) obj), null, null, null, xn2Var, 14);
        }
    }
}
