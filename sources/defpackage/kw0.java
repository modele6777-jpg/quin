package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kw0 extends czb implements l26 {
    final /* synthetic */ aw2 $$this$coroutineScope;
    final /* synthetic */ d0f $state;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw0(aw2 aw2Var, d0f d0fVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$$this$coroutineScope = aw2Var;
        this.$state = d0fVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        kw0 kw0Var = new kw0(this.$$this$coroutineScope, this.$state, xn2Var);
        kw0Var.L$0 = obj;
        return kw0Var;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cd A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #3 {all -> 0x0019, blocks: (B:8:0x0014, B:41:0x00c9, B:43:0x00cd), top: B:53:0x0014 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v16, types: [h89] */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v9 */
    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        ?? r13;
        long j;
        mbe mbeVar;
        iia iiaVar;
        h89 h89Var;
        h89 h89Var2;
        Object obj2;
        ?? r0;
        oia oiaVar;
        ?? r1 = this.label;
        bw2 bw2Var = bw2.a;
        try {
            if (r1 == 0) {
                jzb.q(obj);
                mbe mbeVar2 = (mbe) this.L$0;
                s0e s0eVarA = t0e.a(Boolean.FALSE);
                long jB = mbeVar2.c().b();
                this.L$0 = mbeVar2;
                this.L$1 = s0eVarA;
                iia iiaVar2 = iia.a;
                this.L$2 = iiaVar2;
                this.J$0 = jB;
                this.label = 1;
                Object objB = ffe.b(mbeVar2, this, 1);
                if (objB != bw2Var) {
                    j = jB;
                    mbeVar = mbeVar2;
                    obj = objB;
                    h89Var = s0eVarA;
                    iiaVar = iiaVar2;
                }
                return bw2Var;
            }
            if (r1 != 1) {
                if (r1 != 2) {
                    if (r1 != 3) {
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r13 = (h89) this.L$0;
                    try {
                        jzb.q(obj);
                        r0 = r1;
                        r13 = r13;
                        oiaVar = (oia) obj;
                        if (oiaVar != null) {
                            oiaVar.a();
                        }
                        Boolean bool = Boolean.FALSE;
                        s0e s0eVar = (s0e) r13;
                        s0eVar.getClass();
                        s0eVar.n(null, bool);
                        r1 = r0;
                        return wef.a;
                    } catch (Throwable th) {
                        th = th;
                        Boolean bool2 = Boolean.FALSE;
                        s0e s0eVar2 = (s0e) r13;
                        s0eVar2.getClass();
                        s0eVar2.n(null, bool2);
                        throw th;
                    }
                }
                iia iiaVar3 = (iia) this.L$2;
                h89 h89Var3 = (h89) this.L$1;
                mbeVar = (mbe) this.L$0;
                try {
                    jzb.q(obj);
                    obj2 = iiaVar3;
                    h89Var2 = h89Var3;
                    Boolean bool3 = Boolean.FALSE;
                    s0e s0eVar3 = (s0e) h89Var2;
                    s0eVar3.getClass();
                    s0eVar3.n(null, bool3);
                    r1 = obj2;
                } catch (jia unused) {
                    iiaVar = iiaVar3;
                    h89Var = h89Var3;
                    ynb.V(this.$$this$coroutineScope, null, dw2.d, new jw0(h89Var, this.$state, null), 1);
                    this.L$0 = h89Var;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                    obj = ffe.j(mbeVar, iiaVar, this);
                    if (obj != bw2Var) {
                        r13 = h89Var;
                        r0 = h89Var;
                        oiaVar = (oia) obj;
                        if (oiaVar != null) {
                            oiaVar.a();
                        }
                        Boolean bool4 = Boolean.FALSE;
                        s0e s0eVar4 = (s0e) r13;
                        s0eVar4.getClass();
                        s0eVar4.n(null, bool4);
                        r1 = r0;
                    }
                    return bw2Var;
                } catch (Throwable th2) {
                    th = th2;
                    r13 = h89Var3;
                    Boolean bool5 = Boolean.FALSE;
                    s0e s0eVar5 = (s0e) r13;
                    s0eVar5.getClass();
                    s0eVar5.n(null, bool5);
                    throw th;
                }
                return wef.a;
            }
            long j2 = this.J$0;
            iia iiaVar4 = (iia) this.L$2;
            h89 h89Var4 = (h89) this.L$1;
            mbe mbeVar3 = (mbe) this.L$0;
            jzb.q(obj);
            iiaVar = iiaVar4;
            h89Var = h89Var4;
            j = j2;
            mbeVar = mbeVar3;
            long j3 = j;
            int i = ((oia) obj).i;
            if (i == 1 || i == 3) {
                try {
                    hw0 hw0Var = new hw0(iiaVar, null);
                    this.L$0 = mbeVar;
                    this.L$1 = h89Var;
                    this.L$2 = iiaVar;
                    this.label = 2;
                    if (mbeVar.d(j3, hw0Var, this) != bw2Var) {
                        h89Var2 = h89Var;
                        obj2 = h89Var;
                        Boolean bool6 = Boolean.FALSE;
                        s0e s0eVar6 = (s0e) h89Var2;
                        s0eVar6.getClass();
                        s0eVar6.n(null, bool6);
                        r1 = obj2;
                    }
                } catch (jia unused2) {
                    ynb.V(this.$$this$coroutineScope, null, dw2.d, new jw0(h89Var, this.$state, null), 1);
                    this.L$0 = h89Var;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                    obj = ffe.j(mbeVar, iiaVar, this);
                    if (obj != bw2Var) {
                        r13 = h89Var;
                        r0 = h89Var;
                        oiaVar = (oia) obj;
                        if (oiaVar != null) {
                            oiaVar.a();
                        }
                        Boolean bool7 = Boolean.FALSE;
                        s0e s0eVar7 = (s0e) r13;
                        s0eVar7.getClass();
                        s0eVar7.n(null, bool7);
                        r1 = r0;
                        return wef.a;
                    }
                }
                return bw2Var;
            }
            return wef.a;
        } catch (Throwable th3) {
            th = th3;
            r13 = r1;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((kw0) k((xn2) obj2, (mbe) obj)).r(wef.a);
    }
}
