package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uu2 extends gbe implements l26 {
    final /* synthetic */ rx6 $imeOptions;
    final /* synthetic */ cre $manager;
    final /* synthetic */ r38 $state;
    final /* synthetic */ gte $textInputService;
    final /* synthetic */ h0e $writeable$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu2(r38 r38Var, h0e h0eVar, gte gteVar, cre creVar, rx6 rx6Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$state = r38Var;
        this.$writeable$delegate = h0eVar;
        this.$textInputService = gteVar;
        this.$manager = creVar;
        this.$imeOptions = rx6Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new uu2(this.$state, this.$writeable$delegate, this.$textInputService, this.$manager, this.$imeOptions, xn2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, wef] */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                ybc ybcVarP = jzb.p(new zk1(2, this.$writeable$delegate));
                tu2 tu2Var = new tu2(this.$state, this.$textInputService, this.$manager, this.$imeOptions, 0);
                this.label = 1;
                Object objB = ybcVarP.b(tu2Var, this);
                bw2 bw2Var = bw2.a;
                if (objB == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
            lmg.f0(this.$state);
            this = wef.a;
            return this;
        } catch (Throwable th) {
            lmg.f0(this.$state);
            throw th;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((uu2) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
