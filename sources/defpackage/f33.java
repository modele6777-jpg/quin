package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class f33 extends gbe implements a26 {
    final /* synthetic */ String $date;
    final /* synthetic */ i33 $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f33(i33 i33Var, String str, xn2 xn2Var) {
        super(1, xn2Var);
        this.$viewModel = i33Var;
        this.$date = str;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new f33(this.$viewModel, this.$date, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return obj;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        i33 i33Var = this.$viewModel;
        String str = this.$date;
        this.label = 1;
        Serializable serializableF = i33Var.f(str, this);
        bw2 bw2Var = bw2.a;
        return serializableF == bw2Var ? bw2Var : serializableF;
    }
}
