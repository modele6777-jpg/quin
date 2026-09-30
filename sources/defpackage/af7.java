package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class af7 extends we7 {
    public final lw7 w;
    public final lw7 x;
    public final lw7 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af7(xm7 xm7Var, Method method, Object obj, dm7 dm7Var) {
        super(xm7Var, method, obj, dm7Var);
        xm7Var.getClass();
        dm7Var.getClass();
        ze7 ze7Var = new ze7(this, 0);
        z18 z18Var = z18.b;
        this.w = eb3.N(z18Var, ze7Var);
        this.x = eb3.N(z18Var, new ze7(this, 1));
        this.y = eb3.N(z18Var, new ze7(this, 2));
    }

    @Override // defpackage.we7
    public final TypeVariable[] F() {
        Object value = this.w.getValue();
        value.getClass();
        return (TypeVariable[]) value;
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

    public final Method I() {
        Member member = this.d;
        member.getClass();
        return (Method) member;
    }

    @Override // defpackage.cm7
    public final String getName() {
        String name = this.d.getName();
        name.getClass();
        return name;
    }

    @Override // defpackage.cm7
    public final yn7 getReturnType() {
        return (yn7) this.x.getValue();
    }

    @Override // defpackage.znb
    public final String getSignature() {
        return o8c.n(I());
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
        return new af7(xm7Var, I(), ga1.NO_RECEIVER, dm7Var);
    }

    @Override // defpackage.we7
    public final Type[] y() {
        Type[] genericParameterTypes = I().getGenericParameterTypes();
        genericParameterTypes.getClass();
        return genericParameterTypes;
    }
}
