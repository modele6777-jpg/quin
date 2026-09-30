package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ua1 extends hb1 {
    public final /* synthetic */ int e;

    /* JADX WARN: Illegal instructions before constructor call */
    public ua1(Constructor constructor, int i) {
        this.e = i;
        switch (i) {
            case 1:
                Class declaringClass = constructor.getDeclaringClass();
                declaringClass.getClass();
                super(constructor, declaringClass, urg.B(constructor));
                break;
            default:
                Class declaringClass2 = constructor.getDeclaringClass();
                declaringClass2.getClass();
                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                genericParameterTypes.getClass();
                super(constructor, declaringClass2, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : qd0.f0(genericParameterTypes, 0, genericParameterTypes.length - 1)));
                break;
        }
    }

    @Override // defpackage.sa1
    public final Object call(Object[] objArr) {
        int i = this.e;
        Member member = this.c;
        objArr.getClass();
        switch (i) {
            case 0:
                d(objArr.length);
                mx mxVar = new mx(2);
                mxVar.c(objArr);
                mxVar.b(null);
                ArrayList arrayList = mxVar.a;
                return ((Constructor) member).newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                d(objArr.length);
                return ((Constructor) member).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }
}
