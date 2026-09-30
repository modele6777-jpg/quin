package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fb1 extends ya1 implements d21 {
    public final boolean f;
    public final Object g;

    /* JADX WARN: Illegal instructions before constructor call */
    public fb1(Method method, boolean z, Object obj) {
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        genericParameterTypes.getClass();
        super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : qd0.f0(genericParameterTypes, 1, genericParameterTypes.length)));
        this.f = z;
        this.g = obj;
    }

    @Override // defpackage.ya1, defpackage.sa1
    public final Object call(Object[] objArr) {
        objArr.getClass();
        d(objArr.length);
        mx mxVar = new mx(2);
        mxVar.b(this.g);
        mxVar.c(objArr);
        ArrayList arrayList = mxVar.a;
        return g(arrayList.toArray(new Object[arrayList.size()]), null);
    }
}
