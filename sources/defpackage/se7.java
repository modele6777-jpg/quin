package defpackage;

import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes3.dex */
public final class se7 implements x16 {
    public final /* synthetic */ int a;
    public final ue7 b;

    public /* synthetic */ se7(ue7 ue7Var, int i) {
        this.a = i;
        this.b = ue7Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        ue7 ue7Var = this.b;
        switch (i) {
            case 0:
                TypeVariable[] typeParameters = ue7Var.c.d().getTypeParameters();
                TypeVariable[] typeParameters2 = ue7Var.I().getTypeParameters();
                typeParameters2.getClass();
                return (TypeVariable[]) qd0.w0(typeParameters, typeParameters2);
            default:
                return ynb.Q(ue7Var) ? new ta1(ue7Var.I(), ynb.J(ue7Var), 1) : new ua1(ue7Var.I(), 1);
        }
    }
}
