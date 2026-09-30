package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ydf extends gbe implements l26 {
    final /* synthetic */ s69 $expandedScrollIndex$delegate;
    final /* synthetic */ s69 $expandedScrollOffset$delegate;
    final /* synthetic */ j18 $listState;
    final /* synthetic */ c6d $plan;
    final /* synthetic */ boolean $zoomedOut;
    int I$0;
    int I$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydf(c6d c6dVar, boolean z, j18 j18Var, s69 s69Var, s69 s69Var2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$plan = c6dVar;
        this.$zoomedOut = z;
        this.$listState = j18Var;
        this.$expandedScrollIndex$delegate = s69Var;
        this.$expandedScrollOffset$delegate = s69Var2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ydf(this.$plan, this.$zoomedOut, this.$listState, this.$expandedScrollIndex$delegate, this.$expandedScrollOffset$delegate, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008f A[RETURN] */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        wef wefVar = wef.a;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return wefVar;
            }
            if (i == 2) {
                jzb.q(obj);
                return wefVar;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (!this.$plan.f.isEmpty()) {
            boolean z = this.$zoomedOut;
            bw2 bw2Var = bw2.a;
            if (z) {
                j18 j18Var = this.$listState;
                this.label = 1;
                vea veaVar = j18.y;
                if (j18Var.j(0, 0, this) == bw2Var) {
                    return bw2Var;
                }
            } else if (((sz9) this.$expandedScrollIndex$delegate).j() > 0 || ((sz9) this.$expandedScrollOffset$delegate).j() > 0) {
                int iJ = ((sz9) this.$expandedScrollIndex$delegate).j();
                int size = this.$plan.f.size() - 1;
                if (iJ > size) {
                    iJ = size;
                }
                int iJ2 = ((sz9) this.$expandedScrollOffset$delegate).j();
                int i2 = ((d6d) this.$plan.f.get(iJ)).d - 1;
                int i3 = i2 >= 0 ? i2 : 0;
                if (iJ2 > i3) {
                    iJ2 = i3;
                }
                j18 j18Var2 = this.$listState;
                this.I$0 = iJ;
                this.I$1 = iJ2;
                this.label = 2;
                if (j18Var2.j(iJ, iJ2, this) == bw2Var) {
                    return bw2Var;
                }
            }
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ydf) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
