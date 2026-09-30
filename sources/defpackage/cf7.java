package defpackage;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public final class cf7 implements x16 {
    public final /* synthetic */ int a;
    public final gf7 b;

    public /* synthetic */ cf7(gf7 gf7Var, int i) {
        this.a = i;
        this.b = gf7Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        pu4 pu4Var = pu4.a;
        gf7 gf7Var = this.b;
        switch (i) {
            case 0:
                i7h.o(gf7Var);
                return pu4Var;
            case 1:
                if (!ynb.Q(gf7Var)) {
                    return gf7Var.a();
                }
                i7h.o(gf7Var);
                return pu4Var;
            case 2:
                Type genericType = gf7Var.F().getGenericType();
                genericType.getClass();
                return vpf.V(genericType, qu4.a, null, false, false, null, 30);
            default:
                return new ff7(gf7Var);
        }
    }
}
