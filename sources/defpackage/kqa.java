package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kqa extends gbe implements l26 {
    final /* synthetic */ Object $default;
    final /* synthetic */ isa $this_getOrDefault;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kqa(isa isaVar, Object obj, xn2 xn2Var) {
        super(2, xn2Var);
        this.$this_getOrDefault = isaVar;
        this.$default = obj;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        kqa kqaVar = new kqa(this.$this_getOrDefault, this.$default, xn2Var);
        kqaVar.L$0 = obj;
        return kqaVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object dzbVar;
        isa isaVar;
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                isa isaVar2 = this.$this_getOrDefault;
                dzbVar = this.$default;
                ypa.a.getClass();
                wj5 wj5VarB = ypa.b();
                this.L$0 = null;
                this.L$1 = isaVar2;
                this.L$2 = dzbVar;
                this.L$3 = null;
                this.label = 1;
                Object objB = tm7.B(wj5VarB, this);
                bw2 bw2Var = bw2.a;
                if (objB == bw2Var) {
                    return bw2Var;
                }
                isaVar = isaVar2;
                obj = objB;
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dzbVar = this.L$2;
                isaVar = (isa) this.L$1;
                jzb.q(obj);
            }
            Object objC = ((p79) obj).c(isaVar);
            if (objC != null) {
                dzbVar = objC;
            }
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        isa isaVar3 = this.$this_getOrDefault;
        Throwable thA = ezb.a(dzbVar);
        if (thA != null) {
            hf8.Q.getClass();
            kv2.A("Failed to get ", isaVar3.a, ef8.a("Preference"), thA);
        }
        return ezb.a(dzbVar) == null ? dzbVar : this.$default;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((kqa) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
