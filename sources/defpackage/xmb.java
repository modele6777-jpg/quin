package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xmb extends snb {
    public final Type a;
    public final snb b;

    /* JADX WARN: Multi-variable type inference failed */
    public xmb(Type type) {
        snb qnbVar;
        snb qnbVar2;
        this.a = type;
        if (!(type instanceof GenericArrayType)) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    componentType.getClass();
                    qnbVar = componentType.isPrimitive() ? new qnb(componentType) : ((componentType instanceof GenericArrayType) || componentType.isArray()) ? new xmb(componentType) : componentType instanceof WildcardType ? new vnb((WildcardType) componentType) : new hnb(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + type.getClass() + "): " + type);
        }
        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        genericComponentType.getClass();
        boolean z = genericComponentType instanceof Class;
        if (z) {
            Class cls2 = (Class) genericComponentType;
            qnbVar2 = cls2.isPrimitive() ? new qnb(cls2) : qnbVar2;
            this.b = qnbVar2;
        }
        qnbVar = ((genericComponentType instanceof GenericArrayType) || (z && ((Class) genericComponentType).isArray())) ? new xmb(genericComponentType) : genericComponentType instanceof WildcardType ? new vnb((WildcardType) genericComponentType) : new hnb(genericComponentType);
        qnbVar2 = qnbVar;
        this.b = qnbVar2;
    }

    @Override // defpackage.snb
    public final Type b() {
        return this.a;
    }

    @Override // defpackage.td7
    public final Collection getAnnotations() {
        return pu4.a;
    }
}
