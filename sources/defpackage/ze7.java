package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public final class ze7 implements x16 {
    public final /* synthetic */ int a;
    public final af7 b;

    public /* synthetic */ ze7(af7 af7Var, int i) {
        this.a = i;
        this.b = af7Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        af7 af7Var = this.b;
        switch (i) {
            case 0:
                return af7Var.I().getTypeParameters();
            case 1:
                Type genericReturnType = af7Var.I().getGenericReturnType();
                genericReturnType.getClass();
                return vpf.V(genericReturnType, qu4.a, null, vpf.J(af7Var.d), false, null, 26);
            default:
                if (Modifier.isStatic(af7Var.I().getModifiers())) {
                    Method methodI = af7Var.I();
                    return ynb.Q(af7Var) ? new fb1(methodI, false, ynb.J(af7Var)) : new gb1(methodI, false, 6, 2);
                }
                ho7.y(af7Var.d, "Only static Java methods are supported for now: ");
                return null;
        }
    }
}
