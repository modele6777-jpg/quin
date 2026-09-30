package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class cb1 extends hb1 {
    public final boolean e;
    public final boolean f;

    /* JADX WARN: Illegal instructions before constructor call */
    public cb1(Field field, boolean z, boolean z2) {
        Type[] typeArr;
        Class cls = Void.TYPE;
        cls.getClass();
        if (z2) {
            Class<?> declaringClass = field.getDeclaringClass();
            declaringClass.getClass();
            Type genericType = field.getGenericType();
            genericType.getClass();
            typeArr = new Type[]{declaringClass, genericType};
        } else {
            Type genericType2 = field.getGenericType();
            genericType2.getClass();
            typeArr = new Type[]{genericType2};
        }
        super(field, cls, typeArr);
        this.e = z;
        this.f = z2;
    }

    @Override // defpackage.sa1
    public Object call(Object[] objArr) throws IllegalAccessException {
        objArr.getClass();
        e(objArr);
        ((Field) this.c).set(this.f ? qd0.l0(objArr) : null, qd0.u0(objArr));
        return wef.a;
    }

    @Override // defpackage.hb1
    public void e(Object[] objArr) {
        objArr.getClass();
        d(objArr.length);
        if (this.e && qd0.u0(objArr) == null) {
            qc0.j("null is not allowed as a value for this property.");
        }
    }
}
