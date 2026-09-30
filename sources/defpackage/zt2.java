package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zt2 implements x16 {
    public final /* synthetic */ int a;
    public final int b;
    public final Object c;

    public /* synthetic */ zt2(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        int i2 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                j2 j2Var = (j2) ((x16) obj).invoke();
                lw7 lw7VarN = eb3.N(z18.b, new j5(8, j2Var));
                fob fobVar = j2Var.a;
                Type type = fobVar != null ? (Type) fobVar.invoke() : null;
                if (type instanceof Class) {
                    Class cls = (Class) type;
                    Class<?> componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                    componentType.getClass();
                    return componentType;
                }
                if (type instanceof GenericArrayType) {
                    if (i2 != 0) {
                        ho7.m(j2Var, "Array type has been queried for a non-0th argument: ");
                        return null;
                    }
                    Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                    genericComponentType.getClass();
                    return genericComponentType;
                }
                if (!(type instanceof ParameterizedType)) {
                    ho7.m(j2Var, "Non-generic type has been queried for arguments: ");
                    return null;
                }
                Type type2 = (Type) ((List) lw7VarN.getValue()).get(i2);
                if (!(type2 instanceof WildcardType)) {
                    return type2;
                }
                WildcardType wildcardType = (WildcardType) type2;
                Type[] lowerBounds = wildcardType.getLowerBounds();
                lowerBounds.getClass();
                Type type3 = (Type) qd0.m0(lowerBounds);
                if (type3 == null) {
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    upperBounds.getClass();
                    type3 = (Type) qd0.l0(upperBounds);
                }
                Type type4 = type3;
                type4.getClass();
                return type4;
            case 1:
                return (zy9) ((List) obj).get(i2);
            default:
                Object obj2 = ((ea1) obj).G().get(i2);
                obj2.getClass();
                return (zy9) obj2;
        }
    }
}
