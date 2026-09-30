package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class in2 extends m4 implements ejb {
    public final /* synthetic */ int c = 1;
    public final t99 d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in2(ca1 ca1Var, tt7 tt7Var, t99 t99Var) {
        super(tt7Var);
        ca1Var.getClass();
        tt7Var.getClass();
        this.e = ca1Var;
        this.d = t99Var;
    }

    public final t99 B0() {
        switch (this.c) {
            case 0:
                break;
        }
        return this.d;
    }

    @Override // defpackage.m4
    public final String toString() {
        int i = this.c;
        Object obj = this.e;
        switch (i) {
            case 0:
                return getType() + ": Ctx { " + ((u09) obj) + " }";
            default:
                return "Cxt { " + ((ca1) obj) + " }";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in2(u09 u09Var, tt7 tt7Var, t99 t99Var) {
        super(tt7Var);
        tt7Var.getClass();
        this.e = u09Var;
        this.d = t99Var;
    }
}
