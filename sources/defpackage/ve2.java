package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ve2 extends czb implements l26 {
    int I$0;
    int I$1;
    int I$2;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ we2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve2(we2 we2Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = we2Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ve2 ve2Var = new ve2(this.this$0, xn2Var);
        ve2Var.L$0 = obj;
        return ve2Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        dyc dycVar;
        int i;
        int i2;
        int i3;
        String strJ;
        int i4;
        int i5;
        int i6 = this.label;
        if (i6 == 0) {
            jzb.q(obj);
            dycVar = (dyc) this.L$0;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            if (i6 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$2;
            i2 = this.I$1;
            i3 = this.I$0;
            dycVar = (dyc) this.L$0;
            jzb.q(obj);
        }
        if (i3 >= Math.min(this.this$0.lastOperation + 10, this.this$0.operations.b)) {
            return wef.a;
        }
        int i7 = i3 + 1;
        int iA = this.this$0.operations.a(i3);
        switch (iA) {
            case 0:
                strJ = "up";
                break;
            case 1:
                strJ = ks0.j(this.this$0.instances.b(i2), "down ");
                i2++;
                break;
            case 2:
                strJ = ks0.k("remove ", this.this$0.operations.a(i7), " ", this.this$0.operations.a(i3 + 2));
                i7 = i3 + 3;
                break;
            case 3:
                int iA2 = this.this$0.operations.a(i7);
                int iA3 = this.this$0.operations.a(i3 + 2);
                int iA4 = this.this$0.operations.a(i3 + 3);
                StringBuilder sbN = ib8.n(iA2, iA3, "move ", " ", " ");
                sbN.append(iA4);
                strJ = sbN.toString();
                i7 = i3 + 4;
                break;
            case 4:
                strJ = "clear";
                break;
            case 5:
                i4 = i3 + 2;
                i5 = i2 + 1;
                strJ = "insertBottomUp " + this.this$0.operations.a(i7) + " " + this.this$0.instances.b(i2);
                i7 = i4;
                i2 = i5;
                break;
            case 6:
                i4 = i3 + 2;
                i5 = i2 + 1;
                strJ = "insertTopDown " + this.this$0.operations.a(i7) + " " + this.this$0.instances.b(i2);
                i7 = i4;
                i2 = i5;
                break;
            case 7:
                Object objB = this.this$0.instances.b(i2);
                objB.getClass();
                z7f.t(2, objB);
                i2 += 2;
                strJ = "apply " + ((l26) objB);
                break;
            case 8:
                strJ = ks0.j(this.this$0.reused.b(i), "reuse ");
                i++;
                break;
            case 9:
                strJ = "recompose pending";
                break;
            default:
                strJ = tec.e(iA, "unknown op: ");
                break;
        }
        this.L$0 = dycVar;
        this.I$0 = i7;
        this.I$1 = i2;
        this.I$2 = i;
        this.label = 1;
        dycVar.c(this, i3 + ": " + strJ);
        return bw2.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ve2) k((xn2) obj2, (dyc) obj)).r(wef.a);
    }
}
