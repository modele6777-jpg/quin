package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class obf extends gbe implements l26 {
    final /* synthetic */ Context $appContext;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public obf(Context context, xn2 xn2Var) {
        super(2, xn2Var);
        this.$appContext = context;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        obf obfVar = new obf(this.$appContext, xn2Var);
        obfVar.Z$0 = ((Boolean) obj).booleanValue();
        return obfVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        pw9.a(this.$appContext, xtb.class, this.Z$0);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        obf obfVar = (obf) k((xn2) obj2, bool);
        wef wefVar = wef.a;
        obfVar.r(wefVar);
        return wefVar;
    }
}
