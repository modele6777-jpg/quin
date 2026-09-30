package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class hb1 implements sa1 {
    public final /* synthetic */ int a = 0;
    public final List b;
    public final Member c;
    public final Type d;

    public hb1(Method method, List list) {
        this.c = method;
        this.b = list;
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        this.d = returnType;
    }

    @Override // defpackage.sa1
    public final List a() {
        int i = this.a;
        return this.b;
    }

    @Override // defpackage.sa1
    public final Member b() {
        switch (this.a) {
            case 0:
                return this.c;
            default:
                return null;
        }
    }

    @Override // defpackage.sa1
    public final boolean c() {
        switch (this.a) {
        }
        return false;
    }

    public final void d(int i) {
        int i2 = this.a;
        List list = this.b;
        switch (i2) {
            case 0:
                if (list.size() != i) {
                    qc0.f(list.size(), i);
                    break;
                }
                break;
            default:
                if (list.size() != i) {
                    qc0.f(list.size(), i);
                    break;
                }
                break;
        }
    }

    public void e(Object[] objArr) {
        objArr.getClass();
        d(objArr.length);
    }

    public void f(Object obj) {
        if (obj == null || !this.c.getDeclaringClass().isInstance(obj)) {
            qc0.j("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // defpackage.sa1
    public final Type getReturnType() {
        int i = this.a;
        Type type = this.d;
        switch (i) {
            case 0:
                return type;
            default:
                return (Class) type;
        }
    }

    public hb1(Member member, Type type, Type[] typeArr) {
        this.c = member;
        this.d = type;
        this.b = qd0.G0(typeArr);
    }
}
