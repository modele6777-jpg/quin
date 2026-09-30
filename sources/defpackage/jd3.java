package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jd3 extends gbe implements a26 {
    final /* synthetic */ pv2 $callerContext;
    final /* synthetic */ l26 $transform;
    Object L$0;
    int label;
    final /* synthetic */ od3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd3(od3 od3Var, pv2 pv2Var, l26 l26Var, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = od3Var;
        this.$callerContext = pv2Var;
        this.$transform = l26Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new jd3(this.this$0, this.$callerContext, this.$transform, (xn2) obj).r(wef.a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        cb3 cb3Var;
        Object obj2;
        int iHashCode;
        od3 od3Var;
        int i = this.label;
        bw2 bw2Var = bw2.a;
        if (i == 0) {
            jzb.q(obj);
            od3 od3Var2 = this.this$0;
            this.label = 1;
            obj = od3Var2.h(true, this);
            if (obj != bw2Var) {
            }
            return bw2Var;
        }
        if (i == 1) {
            jzb.q(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Object obj3 = this.L$0;
                jzb.q(obj);
                return obj3;
            }
            cb3Var = (cb3) this.L$0;
            jzb.q(obj);
        }
        obj2 = cb3Var.b;
        if (obj2 != null) {
            iHashCode = obj2.hashCode();
        } else {
            iHashCode = 0;
        }
        if (iHashCode == cb3Var.c) {
            qc0.p("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
            return null;
        }
        if (!pa7.t(cb3Var.b, obj)) {
            od3Var = this.this$0;
            this.L$0 = obj;
            this.label = 3;
            if (od3Var.i(obj, true, this) == bw2Var) {
                return bw2Var;
            }
        }
        return obj;
        cb3Var = (cb3) obj;
        pv2 pv2Var = this.$callerContext;
        id3 id3Var = new id3(this.$transform, cb3Var, null);
        this.L$0 = cb3Var;
        this.label = 2;
        obj = ynb.p0(pv2Var, id3Var, this);
        if (obj != bw2Var) {
            obj2 = cb3Var.b;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            if (iHashCode == cb3Var.c) {
                qc0.p("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                return null;
            }
            if (!pa7.t(cb3Var.b, obj)) {
                od3Var = this.this$0;
                this.L$0 = obj;
                this.label = 3;
                if (od3Var.i(obj, true, this) == bw2Var) {
                }
            }
            return obj;
        }
        return bw2Var;
    }
}
