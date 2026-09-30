package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class prb extends gbe implements l26 {
    final /* synthetic */ aw2 $$this$coroutineScope;
    final /* synthetic */ l26 $block;
    final /* synthetic */ g48 $state;
    final /* synthetic */ h48 $this_repeatOnLifecycle;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public prb(h48 h48Var, g48 g48Var, aw2 aw2Var, l26 l26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$this_repeatOnLifecycle = h48Var;
        this.$state = g48Var;
        this.$$this$coroutineScope = aw2Var;
        this.$block = l26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new prb(this.$this_repeatOnLifecycle, this.$state, this.$$this$coroutineScope, this.$block, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ba A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:58:? A[SYNTHETIC] */
    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        Throwable th;
        mmb mmbVar;
        mmb mmbVar2;
        f48 f48Var;
        f48 f48Var2;
        f48 f48Var3;
        Object objT;
        bw2 bw2Var;
        dg7 dg7Var;
        u48 u48Var;
        dg7 dg7Var2;
        u48 u48Var2;
        int i = this.label;
        wef wefVar = wef.a;
        if (i == 0) {
            jzb.q(obj);
            h48 h48Var = this.$this_repeatOnLifecycle;
            if (((a58) h48Var).i != g48.a) {
                mmb mmbVar3 = new mmb();
                mmb mmbVar4 = new mmb();
                try {
                    g48 g48Var = this.$state;
                    aw2 aw2Var = this.$$this$coroutineScope;
                    l26 l26Var = this.$block;
                    this.L$0 = mmbVar3;
                    this.L$1 = mmbVar4;
                    this.L$2 = g48Var;
                    this.L$3 = h48Var;
                    this.L$4 = aw2Var;
                    this.L$5 = l26Var;
                    this.label = 1;
                    pl1 pl1Var = new pl1(1, k99.D(this));
                    pl1Var.v();
                    f48.Companion.getClass();
                    g48Var.getClass();
                    int iOrdinal = g48Var.ordinal();
                    if (iOrdinal == 2) {
                        f48Var = f48.ON_CREATE;
                    } else if (iOrdinal != 3) {
                        f48Var = iOrdinal != 4 ? null : f48.ON_RESUME;
                    } else {
                        f48Var = f48.ON_START;
                    }
                    int iOrdinal2 = g48Var.ordinal();
                    if (iOrdinal2 == 2) {
                        f48Var2 = f48.ON_DESTROY;
                    } else if (iOrdinal2 != 3) {
                        if (iOrdinal2 != 4) {
                            f48Var3 = null;
                        } else {
                            f48Var2 = f48.ON_PAUSE;
                        }
                        orb orbVar = new orb(f48Var, mmbVar3, aw2Var, f48Var3, pl1Var, new f99(), l26Var);
                        mmbVar4.element = orbVar;
                        h48Var.a(orbVar);
                        objT = pl1Var.t();
                        bw2Var = bw2.a;
                        if (objT == bw2Var) {
                            return bw2Var;
                        }
                        mmbVar = mmbVar4;
                        mmbVar2 = mmbVar3;
                        dg7Var2 = (dg7) mmbVar2.element;
                        if (dg7Var2 != null) {
                            dg7Var2.h(null);
                        }
                        u48Var2 = (u48) mmbVar.element;
                        if (u48Var2 != null) {
                            this.$this_repeatOnLifecycle.b(u48Var2);
                        }
                    } else {
                        f48Var2 = f48.ON_STOP;
                    }
                    f48Var3 = f48Var2;
                    orb orbVar2 = new orb(f48Var, mmbVar3, aw2Var, f48Var3, pl1Var, new f99(), l26Var);
                    mmbVar4.element = orbVar2;
                    h48Var.a(orbVar2);
                    objT = pl1Var.t();
                    bw2Var = bw2.a;
                    if (objT == bw2Var) {
                        return bw2Var;
                    }
                    mmbVar = mmbVar4;
                    mmbVar2 = mmbVar3;
                    dg7Var2 = (dg7) mmbVar2.element;
                    if (dg7Var2 != null) {
                        dg7Var2.h(null);
                    }
                    u48Var2 = (u48) mmbVar.element;
                    if (u48Var2 != null) {
                        this.$this_repeatOnLifecycle.b(u48Var2);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    mmbVar = mmbVar4;
                    mmbVar2 = mmbVar3;
                    dg7Var = (dg7) mmbVar2.element;
                    if (dg7Var != null) {
                        dg7Var.h(null);
                    }
                    u48Var = (u48) mmbVar.element;
                    if (u48Var != null) {
                        throw th;
                    }
                    this.$this_repeatOnLifecycle.b(u48Var);
                    throw th;
                }
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mmbVar = (mmb) this.L$1;
            mmbVar2 = (mmb) this.L$0;
            try {
                jzb.q(obj);
                dg7Var2 = (dg7) mmbVar2.element;
                if (dg7Var2 != null) {
                    dg7Var2.h(null);
                }
                u48Var2 = (u48) mmbVar.element;
                if (u48Var2 != null) {
                    this.$this_repeatOnLifecycle.b(u48Var2);
                }
            } catch (Throwable th3) {
                th = th3;
                dg7Var = (dg7) mmbVar2.element;
                if (dg7Var != null) {
                    dg7Var.h(null);
                }
                u48Var = (u48) mmbVar.element;
                if (u48Var != null) {
                    throw th;
                }
                this.$this_repeatOnLifecycle.b(u48Var);
                throw th;
            }
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((prb) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
