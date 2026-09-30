package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ue7 extends we7 {
    public final lw7 w;
    public final lw7 x;
    public final lw7 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue7(xm7 xm7Var, Constructor constructor, Object obj) {
        super(xm7Var, constructor, obj, dm7.j);
        xm7Var.getClass();
        int i = 0;
        se7 se7Var = new se7(this, i);
        z18 z18Var = z18.b;
        this.w = eb3.N(z18Var, se7Var);
        this.x = eb3.N(z18Var, new te7(xm7Var, i));
        this.y = eb3.N(z18Var, new se7(this, 1));
    }

    @Override // defpackage.we7
    public final TypeVariable[] F() {
        return (TypeVariable[]) this.w.getValue();
    }

    @Override // defpackage.we7
    public final Class[] G() {
        Class<?>[] parameterTypes = I().getParameterTypes();
        parameterTypes.getClass();
        return parameterTypes;
    }

    @Override // defpackage.we7
    public final boolean H() {
        return I().isVarArgs();
    }

    public final Constructor I() {
        Member member = this.d;
        member.getClass();
        return (Constructor) member;
    }

    @Override // defpackage.cm7
    public final String getName() {
        return "<init>";
    }

    @Override // defpackage.cm7
    public final yn7 getReturnType() {
        return (yn7) this.x.getValue();
    }

    @Override // defpackage.znb
    public final String getSignature() {
        return o8c.l(I());
    }

    @Override // defpackage.wnb
    public final sa1 h() {
        return (sa1) this.y.getValue();
    }

    @Override // defpackage.wnb
    public final sa1 n() {
        return null;
    }

    @Override // defpackage.wnb
    public final wnb p(xm7 xm7Var, dm7 dm7Var) {
        xm7Var.getClass();
        dm7Var.getClass();
        if (dm7Var.equals(dm7.j)) {
            return new ue7(xm7Var, I(), ga1.NO_RECEIVER);
        }
        ho7.y(this, "Constructors cannot have fake overrides: ");
        return null;
    }

    @Override // defpackage.we7
    public final Type[] y() {
        Type[] genericParameterTypes = I().getGenericParameterTypes();
        genericParameterTypes.getClass();
        return genericParameterTypes;
    }
}
