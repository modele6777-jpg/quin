package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class db1 extends ya1 implements d21 {
    public final Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db1(Method method, Object obj) {
        super(method, false, 4);
        method.getClass();
        this.f = obj;
    }

    @Override // defpackage.ya1, defpackage.sa1
    public final Object call(Object[] objArr) {
        objArr.getClass();
        d(objArr.length);
        return g(objArr, this.f);
    }
}
