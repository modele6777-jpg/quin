package defpackage;

import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h97 extends hb1 {
    public h97(Method method) {
        super(method, t72.H(method.getDeclaringClass()));
    }

    @Override // defpackage.sa1
    public final Object call(Object[] objArr) {
        objArr.getClass();
        d(objArr.length);
        Object obj = objArr[0];
        Object[] objArrF0 = objArr.length <= 1 ? new Object[0] : qd0.f0(objArr, 1, objArr.length);
        return ((Method) this.c).invoke(obj, Arrays.copyOf(objArrF0, objArrF0.length));
    }
}
