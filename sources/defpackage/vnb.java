package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vnb extends snb {
    public final WildcardType a;

    public vnb(WildcardType wildcardType) {
        this.a = wildcardType;
    }

    @Override // defpackage.snb
    public final Type b() {
        return this.a;
    }

    public final snb c() {
        WildcardType wildcardType = this.a;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            s8f.n(wildcardType, "Wildcard types with many bounds are not yet supported: ");
            return null;
        }
        if (lowerBounds.length == 1) {
            Object objY0 = qd0.y0(lowerBounds);
            objY0.getClass();
            Type type = (Type) objY0;
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new qnb(cls);
                }
            }
            if ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) {
                return new xmb(type);
            }
            return type instanceof WildcardType ? new vnb((WildcardType) type) : new hnb(type);
        }
        if (upperBounds.length == 1) {
            Type type2 = (Type) qd0.y0(upperBounds);
            if (!pa7.t(type2, Object.class)) {
                type2.getClass();
                boolean z2 = type2 instanceof Class;
                if (z2) {
                    Class cls2 = (Class) type2;
                    if (cls2.isPrimitive()) {
                        return new qnb(cls2);
                    }
                }
                if ((type2 instanceof GenericArrayType) || (z2 && ((Class) type2).isArray())) {
                    return new xmb(type2);
                }
                return type2 instanceof WildcardType ? new vnb((WildcardType) type2) : new hnb(type2);
            }
        }
        return null;
    }

    @Override // defpackage.td7
    public final Collection getAnnotations() {
        return pu4.a;
    }
}
