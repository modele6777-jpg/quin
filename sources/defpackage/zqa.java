package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zqa extends gbe implements l26 {
    final /* synthetic */ imb $added;
    final /* synthetic */ hs3 $this_addIfAbsent;
    final /* synthetic */ String $value;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zqa(hs3 hs3Var, String str, imb imbVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$this_addIfAbsent = hs3Var;
        this.$value = str;
        this.$added = imbVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        zqa zqaVar = new zqa(this.$this_addIfAbsent, this.$value, this.$added, xn2Var);
        zqaVar.L$0 = obj;
        return zqaVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        p79 p79Var = (p79) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        Set set = (Set) p79Var.c(this.$this_addIfAbsent.a);
        if (set == null) {
            set = (Set) this.$this_addIfAbsent.b;
        }
        if (!set.contains(this.$value)) {
            p79Var.f(this.$this_addIfAbsent.a, n3d.n(set, this.$value));
            this.$added.element = true;
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        zqa zqaVar = (zqa) k((xn2) obj2, (p79) obj);
        wef wefVar = wef.a;
        zqaVar.r(wefVar);
        return wefVar;
    }
}
