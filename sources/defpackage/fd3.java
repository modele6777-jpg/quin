package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fd3 extends gbe implements l26 {
    final /* synthetic */ int $preLockVersion;
    Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ od3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd3(od3 od3Var, int i, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = od3Var;
        this.$preLockVersion = i;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        fd3 fd3Var = new fd3(this.this$0, this.$preLockVersion, xn2Var);
        fd3Var.Z$0 = ((Boolean) obj).booleanValue();
        return fd3Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    /* JADX WARN: Code duplicated, block: B:23:0x006a  */
    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        boolean z;
        int iIntValue;
        Object obj2;
        int iHashCode;
        int i = this.label;
        bw2 bw2Var = bw2.a;
        if (i == 0) {
            jzb.q(obj);
            z = this.Z$0;
            od3 od3Var = this.this$0;
            this.Z$0 = z;
            this.label = 1;
            obj = ((wd5) od3Var.j.getValue()).a(new m2e(3, null), this);
            if (obj != bw2Var) {
            }
            return bw2Var;
        }
        if (i == 1) {
            z = this.Z$0;
            jzb.q(obj);
        } else {
            if (i != 2) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = this.L$0;
            jzb.q(obj);
        }
        iIntValue = ((Number) obj).intValue();
        if (obj2 != null) {
            iHashCode = obj2.hashCode();
        } else {
            iHashCode = 0;
        }
        return new cb3(obj2, iHashCode, iIntValue);
        if (z) {
            k77 k77VarC = this.this$0.c();
            this.L$0 = obj;
            this.label = 2;
            Object objA = k77VarC.a(this);
            if (objA != bw2Var) {
                Object obj3 = obj;
                obj = objA;
                obj2 = obj3;
                iIntValue = ((Number) obj).intValue();
            }
            return bw2Var;
        }
        Object obj4 = obj;
        iIntValue = this.$preLockVersion;
        obj2 = obj4;
        if (obj2 != null) {
            iHashCode = obj2.hashCode();
        } else {
            iHashCode = 0;
        }
        return new cb3(obj2, iHashCode, iIntValue);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((fd3) k((xn2) obj2, bool)).r(wef.a);
    }
}
