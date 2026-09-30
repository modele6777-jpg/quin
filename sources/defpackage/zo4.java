package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zo4 extends gbe implements l26 {
    final /* synthetic */ w12 $extraContext;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo4(w12 w12Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$extraContext = w12Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new zo4(this.$extraContext, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        w12 w12Var = this.$extraContext;
        if (w12Var != null) {
            iy9 iy9Var = new iy9("page", "extra_wheel");
            shb shbVar = w12Var.a;
            cgg.x(new rp5("page_show", bm8.H((iy9[]) Arrays.copyOf(new iy9[]{iy9Var, new iy9("divination_type", shbVar.a), new iy9("parent_session_id", shbVar.b), new iy9("card_label", w12Var.b), new iy9("extra_n", Integer.valueOf(w12Var.c))}, 5))));
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        zo4 zo4Var = (zo4) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        zo4Var.r(wefVar);
        return wefVar;
    }
}
