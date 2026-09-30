package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class pt0 implements xn2, cw2, Serializable {
    private final xn2<Object> completion;

    public pt0(xn2 xn2Var) {
        this.completion = xn2Var;
    }

    @Override // defpackage.cw2
    public cw2 e() {
        xn2<Object> xn2Var = this.completion;
        if (xn2Var instanceof cw2) {
            return (cw2) xn2Var;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.xn2
    public final void g(Object obj) {
        ?? r2 = this;
        while (true) {
            pt0 pt0Var = (pt0) r2;
            xn2<Object> xn2Var = pt0Var.completion;
            xn2Var.getClass();
            try {
                obj = pt0Var.r(obj);
                if (obj == bw2.a) {
                    return;
                }
            } catch (Throwable th) {
                obj = new dzb(th);
            }
            pt0Var.s();
            if (!(xn2Var instanceof pt0)) {
                xn2Var.g(obj);
                return;
            }
            r2 = xn2Var;
        }
    }

    public xn2 k(xn2 xn2Var, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public final xn2 l() {
        return this.completion;
    }

    public StackTraceElement o() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        lh3 lh3Var = (lh3) getClass().getAnnotation(lh3.class);
        String str = null;
        if (lh3Var == null || lh3Var.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? lh3Var.l()[iIntValue] : -1;
        gg7 gg7Var = od4.V;
        gg7 gg7Var2 = od4.W;
        if (gg7Var2 == null) {
            try {
                gg7 gg7Var3 = new gg7(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 11);
                od4.W = gg7Var3;
                gg7Var2 = gg7Var3;
            } catch (Exception unused2) {
                od4.W = gg7Var;
                gg7Var2 = gg7Var;
            }
        }
        if (gg7Var2 != gg7Var && (method = (Method) gg7Var2.b) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = (Method) gg7Var2.c) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = (Method) gg7Var2.d;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = lh3Var.c();
        } else {
            strC = str + '/' + lh3Var.c();
        }
        return new StackTraceElement(strC, lh3Var.m(), lh3Var.f(), i);
    }

    public abstract Object r(Object obj);

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object objO = o();
        if (objO == null) {
            objO = getClass().getName();
        }
        sb.append(objO);
        return sb.toString();
    }

    public void s() {
    }
}
