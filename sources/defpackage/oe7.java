package defpackage;

import com.adjust.sdk.sig.r3;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class oe7 extends xnb implements sn7, bob {
    public static final Method v;
    public final nm7 c;
    public final lx4 d;
    public final lw7 e;
    public final ne7 f;
    public final lw7 g;

    static {
        dx5 dx5Var = sqf.a;
        Method[] declaredMethods = smb.d(wef.class).loadClass("kotlin.enums.EnumEntriesKt").getDeclaredMethods();
        declaredMethods.getClass();
        Method method = null;
        boolean z = false;
        for (Method method2 : declaredMethods) {
            if (pa7.t(method2.getName(), "enumEntries")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                parameterTypes.getClass();
                Class<?> cls = parameterTypes.length == 1 ? parameterTypes[0] : null;
                if (cls != null && cls.isArray() && pa7.t(cls.getComponentType(), Enum.class)) {
                    if (z) {
                        qc0.j("Array contains more than one matching element.");
                        return;
                    } else {
                        method = method2;
                        z = true;
                    }
                }
            }
        }
        if (!z) {
            r3.n("Array contains no element matching the predicate.");
        } else {
            method.getClass();
            v = method;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe7(nm7 nm7Var) throws IllegalAccessException, InvocationTargetException {
        super(dm7.j);
        nm7Var.getClass();
        this.c = nm7Var;
        Object objInvoke = v.invoke(null, af1.R(nm7Var).getEnumConstants());
        objInvoke.getClass();
        this.d = (lx4) objInvoke;
        le7 le7Var = new le7(this, 0);
        z18 z18Var = z18.b;
        this.e = eb3.N(z18Var, le7Var);
        this.f = new ne7(this);
        this.g = eb3.N(z18Var, new le7(this, 1));
    }

    @Override // defpackage.wnb
    public final boolean E() {
        return false;
    }

    @Override // defpackage.xnb, defpackage.wnb
    public final List a() {
        return pu4.a;
    }

    @Override // defpackage.wn7
    public final rn7 b() {
        return (rn7) this.g.getValue();
    }

    public final boolean equals(Object obj) {
        bob bobVarC = sqf.c(obj);
        return bobVarC != null && pa7.t(this.c, bobVarC.s()) && "entries".equals(bobVarC.getName()) && "getEntries()Lkotlin/enums/EnumEntries;".equals(bobVarC.getSignature()) && pa7.t(null, bobVarC.x());
    }

    @Override // defpackage.hs7
    public final GenericDeclaration findJavaDeclaration() {
        return hkg.o0(this.c, "getEntries()Lkotlin/enums/EnumEntries;");
    }

    @Override // defpackage.bm7
    public final List getAnnotations() {
        return pu4.a;
    }

    @Override // defpackage.cm7
    public final String getName() {
        return "entries";
    }

    @Override // defpackage.cm7
    public final List getParameters() {
        return pu4.a;
    }

    @Override // defpackage.cm7
    public final yn7 getReturnType() {
        return (yn7) this.e.getValue();
    }

    @Override // defpackage.bob
    public final String getSignature() {
        return "getEntries()Lkotlin/enums/EnumEntries;";
    }

    @Override // defpackage.cm7, defpackage.bo7
    public final List getTypeParameters() {
        return pu4.a;
    }

    @Override // defpackage.cm7
    public final jo7 getVisibility() {
        return jo7.a;
    }

    @Override // defpackage.wnb
    public final sa1 h() {
        return this.f;
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) - 1591573360) * 31) - 2087422618;
    }

    @Override // defpackage.wnb
    public final d09 i() {
        return d09.FINAL;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        return this.d;
    }

    @Override // defpackage.cm7, defpackage.ym7
    public final boolean isSuspend() {
        return false;
    }

    @Override // defpackage.bob
    public final Field l() {
        return null;
    }

    @Override // defpackage.wnb
    public final sa1 n() {
        return null;
    }

    @Override // defpackage.wnb
    public final wnb p(xm7 xm7Var, dm7 dm7Var) {
        xm7Var.getClass();
        dm7Var.getClass();
        return new oe7(this.c);
    }

    @Override // defpackage.wnb
    public final xm7 s() {
        return this.c;
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        af8.h(sb, this);
        sb.append(this instanceof in7 ? "var " : "val ");
        af8.j(sb, this);
        af8.i("entries", sb);
        sb.append(": ");
        sb.append(af8.C(getReturnType(), false));
        return sb.toString();
    }

    @Override // defpackage.wnb
    public final Object x() {
        return null;
    }
}
