package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hz3 implements x16 {
    public final /* synthetic */ int a;
    public final jz3 b;
    public final xr7 c;

    public /* synthetic */ hz3(jz3 jz3Var, xr7 xr7Var, int i) {
        this.a = i;
        this.b = jz3Var;
        this.c = xr7Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        xr7 xr7Var = this.c;
        jz3 jz3Var = this.b;
        switch (i) {
            case 0:
                return v4e.j0(jz3Var.a.o().b(xr7Var.j(syd.C), jz3Var), "Collection");
            default:
                return v4e.j0(jz3Var.a.o().b(xr7Var.k("Array"), jz3Var), "Array");
        }
    }
}
