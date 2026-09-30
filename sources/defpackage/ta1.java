package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ta1 extends hb1 implements d21 {
    public final /* synthetic */ int e;
    public final Object f;

    /* JADX WARN: Illegal instructions before constructor call */
    public ta1(Constructor constructor, Object obj, int i) {
        this.e = i;
        switch (i) {
            case 1:
                Class declaringClass = constructor.getDeclaringClass();
                declaringClass.getClass();
                super(constructor, declaringClass, urg.B(constructor));
                this.f = obj;
                break;
            default:
                Class declaringClass2 = constructor.getDeclaringClass();
                declaringClass2.getClass();
                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                genericParameterTypes.getClass();
                super(constructor, declaringClass2, (Type[]) (genericParameterTypes.length <= 2 ? new Type[0] : qd0.f0(genericParameterTypes, 1, genericParameterTypes.length - 1)));
                this.f = obj;
                break;
        }
    }

    @Override // defpackage.sa1
    public final Object call(Object[] objArr) {
        int i = this.e;
        Object obj = this.f;
        Member member = this.c;
        objArr.getClass();
        switch (i) {
            case 0:
                d(objArr.length);
                mx mxVar = new mx(3);
                mxVar.b(obj);
                mxVar.c(objArr);
                mxVar.b(null);
                ArrayList arrayList = mxVar.a;
                return ((Constructor) member).newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                d(objArr.length + 1);
                mx mxVar2 = new mx(2);
                mxVar2.b(obj);
                mxVar2.c(objArr);
                ArrayList arrayList2 = mxVar2.a;
                return ((Constructor) member).newInstance(arrayList2.toArray(new Object[arrayList2.size()]));
        }
    }
}
