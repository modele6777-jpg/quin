package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class l04 implements x16 {
    public final /* synthetic */ int a;
    public final n04 b;
    public final o04 c;

    public /* synthetic */ l04(n04 n04Var, o04 o04Var, int i) {
        this.a = i;
        this.b = n04Var;
        this.c = o04Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        o04 o04Var = this.c;
        n04 n04Var = this.b;
        switch (i) {
            case 0:
                return n3d.m(n04Var.a.keySet(), o04Var.o());
            default:
                return n3d.m(n04Var.b.keySet(), o04Var.p());
        }
    }
}
