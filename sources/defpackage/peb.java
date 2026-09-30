package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class peb extends czb implements l26 {
    final /* synthetic */ e89 $coordinates$delegate;
    final /* synthetic */ oia $down;
    final /* synthetic */ phb $layouts;
    final /* synthetic */ ufb $menu;
    final /* synthetic */ e89 $selecting$delegate;
    final /* synthetic */ qwc $selection;
    final /* synthetic */ e89 $selectionRequest$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public peb(oia oiaVar, phb phbVar, e89 e89Var, ufb ufbVar, qwc qwcVar, e89 e89Var2, e89 e89Var3, xn2 xn2Var) {
        super(2, xn2Var);
        this.$down = oiaVar;
        this.$layouts = phbVar;
        this.$coordinates$delegate = e89Var;
        this.$menu = ufbVar;
        this.$selection = qwcVar;
        this.$selectionRequest$delegate = e89Var2;
        this.$selecting$delegate = e89Var3;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        peb pebVar = new peb(this.$down, this.$layouts, this.$coordinates$delegate, this.$menu, this.$selection, this.$selectionRequest$delegate, this.$selecting$delegate, xn2Var);
        pebVar.L$0 = obj;
        return pebVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        mbe mbeVar = (mbe) this.L$0;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            oia oiaVar = this.$down;
            neb nebVar = new neb(this.$layouts, this.$coordinates$delegate, this.$menu, this.$selection, this.$selectionRequest$delegate, this.$selecting$delegate);
            oeb oebVar = new oeb(this.$menu, this.$selection, this.$selectionRequest$delegate, this.$selecting$delegate);
            this.L$0 = null;
            this.label = 1;
            Object objM = rs0.m(mbeVar, oiaVar, nebVar, oebVar, this);
            bw2 bw2Var = bw2.a;
            if (objM == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((peb) k((xn2) obj2, (mbe) obj)).r(wef.a);
    }
}
