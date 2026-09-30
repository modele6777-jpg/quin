package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uw0 extends ot0 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uw0(gl2 gl2Var, int i) {
        super(gl2Var);
        this.b = i;
    }

    @Override // defpackage.fl2
    public final boolean b(lbg lbgVar) {
        int i = this.b;
        lbgVar.getClass();
        switch (i) {
            case 0:
                return lbgVar.j.c;
            case 1:
                return lbgVar.j.e;
            case 2:
                return lbgVar.j.a == qe9.b;
            case 3:
                return lbgVar.j.a == qe9.c;
            default:
                return lbgVar.j.f;
        }
    }

    @Override // defpackage.ot0
    public final int c() {
        switch (this.b) {
            case 0:
                return 6;
            case 1:
                return 5;
            case 2:
                return 7;
            case 3:
                return 7;
            default:
                return 9;
        }
    }

    @Override // defpackage.ot0
    public final boolean d(Object obj) {
        boolean zBooleanValue;
        switch (this.b) {
            case 0:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 2:
                ne9 ne9Var = (ne9) obj;
                ne9Var.getClass();
                return (!ne9Var.e && ne9Var.a && ne9Var.b) ? false : true;
            case 3:
                ne9 ne9Var2 = (ne9) obj;
                ne9Var2.getClass();
                return !ne9Var2.a || ne9Var2.c || ne9Var2.e;
            default:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !zBooleanValue;
    }
}
