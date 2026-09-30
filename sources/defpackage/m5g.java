package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class m5g extends gbe implements l26 {
    final /* synthetic */ isa $this_set;
    final /* synthetic */ Object $value;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5g(isa isaVar, Object obj, xn2 xn2Var) {
        super(2, xn2Var);
        this.$this_set = isaVar;
        this.$value = obj;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        m5g m5gVar = new m5g(this.$this_set, this.$value, xn2Var);
        m5gVar.L$0 = obj;
        return m5gVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object dzbVar;
        int i = this.label;
        wef wefVar = wef.a;
        try {
            if (i == 0) {
                jzb.q(obj);
                isa isaVar = this.$this_set;
                Object obj2 = this.$value;
                ypa ypaVar = ypa.a;
                l5g l5gVar = new l5g(isaVar, obj2, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                Object objA = ypaVar.a(l5gVar, this);
                bw2 bw2Var = bw2.a;
                if (objA == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
            dzbVar = wefVar;
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        isa isaVar2 = this.$this_set;
        Object obj3 = this.$value;
        Throwable thA = ezb.a(dzbVar);
        if (thA != null) {
            hf8.Q.getClass();
            ef8.a("Preference").c(kv2.n("Failed to set ", isaVar2.a, " with ", obj3), thA);
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((m5g) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
