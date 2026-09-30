package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dw4 extends gu7 implements a26 {
    final /* synthetic */ bx4 $enter;
    final /* synthetic */ e45 $exit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw4(bx4 bx4Var, e45 e45Var) {
        super(1);
        this.$enter = bx4Var;
        this.$exit = e45Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        ze5 ze5Var;
        ze5 ze5Var2;
        i3f i3fVar = (i3f) obj;
        wv4 wv4Var = wv4.a;
        wv4 wv4Var2 = wv4.b;
        if (i3fVar.c(wv4Var, wv4Var2)) {
            aec aecVar = ((cx4) this.$enter).b.d;
            return (aecVar == null || (ze5Var2 = aecVar.c) == null) ? rw4.b : ze5Var2;
        }
        if (!i3fVar.c(wv4Var2, wv4.c)) {
            return rw4.b;
        }
        aec aecVar2 = ((f45) this.$exit).c.d;
        return (aecVar2 == null || (ze5Var = aecVar2.c) == null) ? rw4.b : ze5Var;
    }
}
