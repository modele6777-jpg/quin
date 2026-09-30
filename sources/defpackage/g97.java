package defpackage;

import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g97 extends hb1 implements d21 {
    public final Object e;

    public g97(Method method, Object obj) {
        super(method, pu4.a);
        this.e = obj;
    }

    @Override // defpackage.sa1
    public final Object call(Object[] objArr) {
        objArr.getClass();
        d(objArr.length);
        return ((Method) this.c).invoke(this.e, Arrays.copyOf(objArr, objArr.length));
    }
}
