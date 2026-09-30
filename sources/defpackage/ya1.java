package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ya1 extends hb1 {
    public final boolean e;

    public ya1(Method method, boolean z, Type[] typeArr) {
        Type genericReturnType = method.getGenericReturnType();
        genericReturnType.getClass();
        if (z) {
            mx mxVar = new mx(2);
            Class<?> declaringClass = method.getDeclaringClass();
            declaringClass.getClass();
            mxVar.b(declaringClass);
            mxVar.c(typeArr);
            ArrayList arrayList = mxVar.a;
            typeArr = (Type[]) arrayList.toArray(new Type[arrayList.size()]);
        }
        super(method, genericReturnType, typeArr);
        this.e = genericReturnType.equals(Void.TYPE);
    }

    @Override // defpackage.sa1
    public Object call(Object[] objArr) {
        objArr.getClass();
        e(objArr);
        return ((Field) this.c).get(this.e ? qd0.l0(objArr) : null);
    }

    public Object g(Object[] objArr, Object obj) {
        objArr.getClass();
        return this.e ? wef.a : ((Method) this.c).invoke(obj, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ya1(Method method, boolean z, int i) {
        z = (i & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        genericParameterTypes.getClass();
        this(method, z, genericParameterTypes);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ya1(Field field, boolean z) {
        Type[] typeArr;
        Type genericType = field.getGenericType();
        genericType.getClass();
        if (z) {
            Class<?> declaringClass = field.getDeclaringClass();
            declaringClass.getClass();
            typeArr = new Type[]{declaringClass};
        } else {
            typeArr = new Type[0];
        }
        super(field, genericType, typeArr);
        this.e = z;
    }
}
