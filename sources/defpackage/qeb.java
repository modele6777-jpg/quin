package defpackage;

import com.adjust.sdk.sig.r3;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qeb extends czb implements l26 {
    final /* synthetic */ e89 $coordinates$delegate;
    final /* synthetic */ phb $layouts;
    final /* synthetic */ ufb $menu;
    final /* synthetic */ e89 $selecting$delegate;
    final /* synthetic */ qwc $selection;
    final /* synthetic */ e89 $selectionRequest$delegate;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qeb(phb phbVar, e89 e89Var, ufb ufbVar, qwc qwcVar, e89 e89Var2, e89 e89Var3, xn2 xn2Var) {
        super(2, xn2Var);
        this.$layouts = phbVar;
        this.$coordinates$delegate = e89Var;
        this.$menu = ufbVar;
        this.$selection = qwcVar;
        this.$selectionRequest$delegate = e89Var2;
        this.$selecting$delegate = e89Var3;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        qeb qebVar = new qeb(this.$layouts, this.$coordinates$delegate, this.$menu, this.$selection, this.$selectionRequest$delegate, this.$selecting$delegate, xn2Var);
        qebVar.L$0 = obj;
        return qebVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x008d  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00fd A[LOOP:0: B:21:0x00a3->B:28:0x00fd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object objA;
        oia oiaVar;
        bw2 bw2Var;
        Object objE;
        phb phbVar;
        e89 e89Var;
        ufb ufbVar;
        qwc qwcVar;
        e89 e89Var2;
        e89 e89Var3;
        leb lebVar;
        meb mebVar;
        mbe mbeVar = (mbe) this.L$0;
        int i = this.label;
        bw2 bw2Var2 = bw2.a;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                objA = obj;
            } else if (i == 2) {
                oia oiaVar2 = (oia) this.L$1;
                jzb.q(obj);
                objE = obj;
                oiaVar = oiaVar2;
                bw2Var = bw2Var2;
                if (((wef) objE) == null) {
                    phbVar = this.$layouts;
                    e89Var = this.$coordinates$delegate;
                    ufbVar = this.$menu;
                    qwcVar = this.$selection;
                    e89Var2 = this.$selectionRequest$delegate;
                    e89Var3 = this.$selecting$delegate;
                    for (oia oiaVar3 : mbeVar.e.I0.a) {
                        if (kn2.E(oiaVar3.a, oiaVar.a)) {
                            rs0.i(phbVar, e89Var, ufbVar, qwcVar, e89Var2, e89Var3, oiaVar3.c);
                            lebVar = new leb(this.$layouts, this.$coordinates$delegate, this.$menu, this.$selection, this.$selectionRequest$delegate, this.$selecting$delegate);
                            mebVar = new meb(this.$menu, this.$selection, this.$selectionRequest$delegate, this.$selecting$delegate);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 3;
                            if (rs0.m(mbeVar, oiaVar, lebVar, mebVar, this) == bw2Var) {
                                return bw2Var;
                            }
                        }
                    }
                    r3.n("Collection contains no element matching the predicate.");
                    return null;
                }
            } else {
                if (i != 3) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
            return wef.a;
        }
        jzb.q(obj);
        this.L$0 = mbeVar;
        this.label = 1;
        objA = ffe.a(mbeVar, false, iia.a, this);
        if (objA == bw2Var2) {
            return bw2Var2;
        }
        oiaVar = (oia) objA;
        oiaVar.a();
        long jB = mbeVar.c().b();
        bw2Var = bw2Var2;
        peb pebVar = new peb(oiaVar, this.$layouts, this.$coordinates$delegate, this.$menu, this.$selection, this.$selectionRequest$delegate, this.$selecting$delegate, null);
        this.L$0 = mbeVar;
        this.L$1 = oiaVar;
        this.label = 2;
        objE = mbeVar.e(jB, pebVar, this);
        if (objE == bw2Var) {
            return bw2Var;
        }
        if (((wef) objE) == null) {
            phbVar = this.$layouts;
            e89Var = this.$coordinates$delegate;
            ufbVar = this.$menu;
            qwcVar = this.$selection;
            e89Var2 = this.$selectionRequest$delegate;
            e89Var3 = this.$selecting$delegate;
            while (r4.hasNext()) {
                if (kn2.E(oiaVar3.a, oiaVar.a)) {
                    rs0.i(phbVar, e89Var, ufbVar, qwcVar, e89Var2, e89Var3, oiaVar3.c);
                    lebVar = new leb(this.$layouts, this.$coordinates$delegate, this.$menu, this.$selection, this.$selectionRequest$delegate, this.$selecting$delegate);
                    mebVar = new meb(this.$menu, this.$selection, this.$selectionRequest$delegate, this.$selecting$delegate);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                    if (rs0.m(mbeVar, oiaVar, lebVar, mebVar, this) == bw2Var) {
                        return bw2Var;
                    }
                }
            }
            r3.n("Collection contains no element matching the predicate.");
            return null;
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((qeb) k((xn2) obj2, (mbe) obj)).r(wef.a);
    }
}
