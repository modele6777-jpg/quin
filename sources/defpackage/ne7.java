package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ne7 implements sa1 {
    public final /* synthetic */ oe7 a;

    public ne7(oe7 oe7Var) {
        this.a = oe7Var;
    }

    @Override // defpackage.sa1
    public final List a() {
        return pu4.a;
    }

    @Override // defpackage.sa1
    public final Member b() {
        return null;
    }

    @Override // defpackage.sa1
    public final boolean c() {
        return false;
    }

    @Override // defpackage.sa1
    public final Object call(Object[] objArr) {
        objArr.getClass();
        lx4 lx4Var = this.a.d;
        int length = objArr.length;
        if (length == 0) {
            return lx4Var;
        }
        qc0.j(tec.f(length, "Callable expects 0 arguments, but ", " were provided."));
        return null;
    }

    @Override // defpackage.sa1
    public final Type getReturnType() {
        yn7 returnType = this.a.getReturnType();
        returnType.getClass();
        if (returnType instanceof j2) {
            fob fobVar = ((j2) returnType).a;
            Type type = fobVar != null ? (Type) fobVar.invoke() : null;
            if (type != null) {
                return type;
            }
        }
        return t72.v(returnType, false);
    }
}
