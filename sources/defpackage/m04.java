package defpackage;

import java.io.ByteArrayInputStream;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class m04 implements x16 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ m04(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                return ((gl7) obj3).b((ByteArrayInputStream) obj2, ((tz3) ((o04) obj).b.b).p);
            case 1:
                nm7 nm7Var = (nm7) obj3;
                Class cls = (Class) obj2;
                j22 j22Var = (j22) obj;
                Class cls2 = nm7Var.b;
                if (pa7.t(cls2.getSuperclass(), cls)) {
                    Type genericSuperclass = cls2.getGenericSuperclass();
                    genericSuperclass.getClass();
                    return genericSuperclass;
                }
                Class<?>[] interfaces = cls2.getInterfaces();
                interfaces.getClass();
                int iR0 = qd0.r0(interfaces, cls);
                if (iR0 < 0) {
                    oo3.h("No superclass of ", nm7Var, " in Java reflection for ", j22Var);
                    return null;
                }
                Type type = cls2.getGenericInterfaces()[iR0];
                type.getClass();
                return type;
            default:
                iy7 iy7Var = (iy7) obj3;
                return new de8(((mf7) iy7Var.b.b).a, new n5(iy7Var, (lnb) obj2, (mmb) obj));
        }
    }
}
