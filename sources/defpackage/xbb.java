package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xbb extends gbe implements l26 {
    final /* synthetic */ a26 $condition;
    int I$0;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final /* synthetic */ fcb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xbb(a26 a26Var, fcb fcbVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$condition = a26Var;
        this.this$0 = fcbVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new xbb(this.$condition, this.this$0, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005c  */
    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
    /* JADX WARN: Code duplicated, block: B:30:0x008e  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        iy9 iy9Var;
        boolean zBooleanValue;
        int iIntValue;
        zcb zcbVar;
        o0c o0cVar;
        o0c o0cVar2;
        o0c o0cVar3;
        int i = this.label;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        if (i == 0) {
            jzb.q(obj);
            a26 a26Var = this.$condition;
            this.label = 1;
            obj = a26Var.d(this);
            if (obj != bw2Var) {
            }
            return bw2Var;
        }
        if (i == 1) {
            jzb.q(obj);
        } else {
            if (i == 2) {
                jzb.q(obj);
                iy9Var = (iy9) obj;
                if (iy9Var == null) {
                    iy9Var = new iy9(Boolean.FALSE, new Integer(0));
                }
                zBooleanValue = ((Boolean) iy9Var.a()).booleanValue();
                iIntValue = ((Number) iy9Var.b()).intValue();
                if (zBooleanValue && iIntValue < 3) {
                    ca2.a.getClass();
                    if (!ca2.c) {
                        zcbVar = this.this$0.a;
                        o0cVar = o0c.b;
                        this.L$0 = o0cVar;
                        this.L$1 = null;
                        this.Z$0 = zBooleanValue;
                        this.I$0 = iIntValue;
                        this.label = 3;
                        if (zcbVar.f(this) != bw2Var) {
                            o0cVar2 = o0cVar;
                        }
                        return bw2Var;
                    }
                    o0cVar3 = o0c.a;
                    this.this$0.c.m(o0cVar3);
                }
                return wefVar;
            }
            if (i != 3) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o0cVar2 = (o0c) this.L$0;
            jzb.q(obj);
        }
        o0cVar3 = o0cVar2;
        this.this$0.c.m(o0cVar3);
        return wefVar;
        if (((Boolean) obj).booleanValue()) {
            wbb wbbVar = new wbb(this.this$0.a.b);
            this.label = 2;
            obj = tm7.D(wbbVar, this);
            if (obj != bw2Var) {
                iy9Var = (iy9) obj;
                if (iy9Var == null) {
                    iy9Var = new iy9(Boolean.FALSE, new Integer(0));
                }
                zBooleanValue = ((Boolean) iy9Var.a()).booleanValue();
                iIntValue = ((Number) iy9Var.b()).intValue();
                if (zBooleanValue) {
                    ca2.a.getClass();
                    if (!ca2.c) {
                        o0cVar3 = o0c.a;
                    } else {
                        zcbVar = this.this$0.a;
                        o0cVar = o0c.b;
                        this.L$0 = o0cVar;
                        this.L$1 = null;
                        this.Z$0 = zBooleanValue;
                        this.I$0 = iIntValue;
                        this.label = 3;
                        if (zcbVar.f(this) != bw2Var) {
                            o0cVar2 = o0cVar;
                            o0cVar3 = o0cVar2;
                        }
                    }
                    this.this$0.c.m(o0cVar3);
                }
            }
            return bw2Var;
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((xbb) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
